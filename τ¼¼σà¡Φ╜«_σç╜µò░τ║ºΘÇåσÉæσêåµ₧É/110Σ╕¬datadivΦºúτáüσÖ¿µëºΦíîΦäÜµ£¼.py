import re, subprocess
from pathlib import Path
SO=Path('/mnt/data/round6/甲壳虫ADB助手_1.3.1_深度检查/app/src/main/lib/arm64-v8a/libadbhelper.so')
ASM_PATH=Path('/mnt/data/round6/all_arm64.asm')
asm=ASM_PATH.read_text().splitlines()
blob=SO.read_bytes()
DATA_BASE=0x1b1000; DATA_OFF=0x1a1000; DATA_SIZE=0x15dc0; BSS_SIZE=0x5c0
mem_data=bytearray(blob[DATA_OFF:DATA_OFF+DATA_SIZE] + bytes(BSS_SIZE))
STACK_BASE=0x70000000; STACK_SIZE=0x10000
MASK64=(1<<64)-1; MASK32=(1<<32)-1; MASK128=(1<<128)-1

def split_ops(s):
    out=[];cur='';depth=0
    for ch in s:
        if ch=='[': depth+=1
        elif ch==']': depth-=1
        if ch==',' and depth==0: out.append(cur.strip());cur=''
        else: cur+=ch
    if cur.strip(): out.append(cur.strip())
    return out

def imm(x):
    x=x.strip()
    if x.startswith('#'):x=x[1:]
    return int(x,0)

def parse_memop(op,regs):
    m=re.fullmatch(r'\[(x\d+|sp)(?:,\s*#(-?(?:0x[0-9a-f]+|\d+)))?\](!)?',op.strip())
    if not m: raise RuntimeError('bad memop '+op)
    br=m.group(1); base=regs['sp'] if br=='sp' else regs[br]
    off=int(m.group(2),0) if m.group(2) else 0
    pre=bool(m.group(3))
    if pre:
        base=(base+off)&MASK64
        if br=='sp': regs['sp']=base
        else: regs[br]=base
        return base,br,0
    return (base+off)&MASK64,br,0

def read_mem(addr,n):
    if DATA_BASE <= addr and addr+n <= DATA_BASE+len(mem_data):
        return bytes(mem_data[addr-DATA_BASE:addr-DATA_BASE+n])
    if STACK_BASE <= addr and addr+n <= STACK_BASE+STACK_SIZE:
        return bytes(stack[addr-STACK_BASE:addr-STACK_BASE+n])
    raise RuntimeError(f'read unmapped {addr:#x}+{n}')
def write_mem(addr,b):
    n=len(b)
    if DATA_BASE <= addr and addr+n <= DATA_BASE+len(mem_data):
        mem_data[addr-DATA_BASE:addr-DATA_BASE+n]=b;return
    if STACK_BASE <= addr and addr+n <= STACK_BASE+STACK_SIZE:
        stack[addr-STACK_BASE:addr-STACK_BASE+n]=b;return
    raise RuntimeError(f'write unmapped {addr:#x}+{n}')

def get_gpr(reg,regs):
    if reg in ('xzr','wzr'):return 0
    if reg=='sp':return regs['sp']
    if reg.startswith('x') and reg[1:].isdigit():return regs[reg]
    if reg.startswith('w') and reg[1:].isdigit():return regs['x'+reg[1:]]&MASK32
    raise RuntimeError('bad GPR '+reg)
def set_gpr(reg,v,regs):
    if reg in ('xzr','wzr'):return
    if reg=='sp':regs['sp']=v&MASK64;return
    if reg.startswith('x') and reg[1:].isdigit():regs[reg]=v&MASK64;return
    if reg.startswith('w') and reg[1:].isdigit():regs['x'+reg[1:]]=v&MASK32;return
    raise RuntimeError('bad set GPR '+reg)
def get_vec(reg,vec):
    m=re.fullmatch(r'([vqd]\d+)(?:\.[a-z0-9]+)?',reg)
    if not m:raise RuntimeError('bad vector '+reg)
    return vec['v'+m.group(1)[1:]]
def set_vec(reg,v,vec):
    m=re.fullmatch(r'([vqd]\d+)(?:\.[a-z0-9]+)?',reg)
    if not m:raise RuntimeError('bad set vector '+reg)
    if m.group(1).startswith('d'):
        idx='v'+m.group(1)[1:]
        vec[idx]=(vec[idx]&(~((1<<64)-1))) | (v&((1<<64)-1))
    else:vec['v'+m.group(1)[1:]]=v&MASK128

def run_func(func_lines, name):
    global stack
    regs={f'x{i}':0 for i in range(31)}; regs['sp']=STACK_BASE+0x8000
    vec={f'v{i}':0 for i in range(32)}
    stack=bytearray(STACK_SIZE)
    count=0
    for li,line in enumerate(func_lines):
        m=re.match(r'\s*([0-9a-f]+):\s+([a-z0-9.]+)\s*(.*)',line)
        if not m:continue
        pc=int(m.group(1),16);op=m.group(2);a=split_ops(m.group(3).split('//')[0].strip())
        try:
          if op=='sub':set_gpr(a[0],get_gpr(a[1],regs)-imm(a[2]),regs)
          elif op=='add':
            rhs=imm(a[2]) if a[2].startswith('#') else get_gpr(a[2],regs)
            set_gpr(a[0],get_gpr(a[1],regs)+rhs,regs)
          elif op=='adrp':set_gpr(a[0],int(a[1],0),regs)
          elif op=='mov':
            if a[0].startswith(('v','q','d')):set_vec(a[0],get_vec(a[1],vec),vec)
            else:set_gpr(a[0],imm(a[1]) if a[1].startswith('#') else get_gpr(a[1],regs),regs)
          elif op in ('and','orr','eor','bic'):
            if a[0].startswith(('v','q','d')):
              if op!='eor':raise RuntimeError('unsupported vector '+op)
              set_vec(a[0],get_vec(a[1],vec)^get_vec(a[2],vec),vec)
            else:
              lhs=get_gpr(a[1],regs);rhs=imm(a[2]) if a[2].startswith('#') else get_gpr(a[2],regs)
              val={'and':lambda:lhs&rhs,'orr':lambda:lhs|rhs,'eor':lambda:lhs^rhs,'bic':lambda:lhs&~rhs}[op]()
              set_gpr(a[0],val,regs)
          elif op=='mvn':
            if a[0].startswith(('v','q','d')):set_vec(a[0],~get_vec(a[1],vec),vec)
            else:set_gpr(a[0],~get_gpr(a[1],regs),regs)
          elif op=='movi':
            iv=imm(a[1]); arr = a[0].split('.',1)[1] if '.' in a[0] else '16b'
            if arr=='2d':
              lane=iv & MASK64; packed=int.from_bytes(lane.to_bytes(8,'little')*2,'little')
            else:
              vv=iv&255; packed=int.from_bytes(bytes([vv])*16,'little')
            set_vec(a[0],packed,vec)
          elif op=='bsl':
            d=get_vec(a[0],vec);n=get_vec(a[1],vec);v=get_vec(a[2],vec)
            set_vec(a[0],(d&n)|((~d&MASK128)&v),vec)
          elif op=='bfxil':
            old=get_gpr(a[0],regs);src=get_gpr(a[1],regs);lsb=imm(a[2]);width=imm(a[3]);mask=((1<<width)-1)<<lsb
            set_gpr(a[0],(old&~mask)|((src<<lsb)&mask),regs)
          elif op in ('ldrb','strb','ldr','str','stp','ldp'):
            # Identify memory operand and optional post-index offset.
            mi=1 if op in ('ldrb','strb','ldr','str') else 2
            addr,br,_=parse_memop(a[mi],regs)
            post=imm(a[mi+1]) if len(a)>mi+1 and a[mi+1].startswith('#') else None
            def load_reg(r,ad):
              if r.startswith(('q','d','v')):
                n=8 if r.startswith('d') else 16
                set_vec(r,int.from_bytes(read_mem(ad,n),'little'),vec)
              else:
                n=1 if r.startswith('w') and op=='ldrb' else (8 if r.startswith('x') else 4)
                set_gpr(r,int.from_bytes(read_mem(ad,n),'little'),regs)
            def store_reg(r,ad):
              if r.startswith(('q','d','v')):
                n=8 if r.startswith('d') else 16
                write_mem(ad,(get_vec(r,vec)&((1<<(8*n))-1)).to_bytes(n,'little'))
              else:
                n=1 if r.startswith('w') and op=='strb' else (8 if r.startswith('x') else 4)
                write_mem(ad,(get_gpr(r,regs)&((1<<(8*n))-1)).to_bytes(n,'little'))
            if op in ('ldrb','strb','ldr','str'):
              if op in ('ldrb','ldr'):load_reg(a[0],addr)
              else:store_reg(a[0],addr)
            else:
              r1,r2=a[0],a[1]
              size=8 if r1.startswith(('x','d')) else (16 if r1.startswith(('q','v')) else 4)
              if op=='ldp':load_reg(r1,addr);load_reg(r2,addr+size)
              else:store_reg(r1,addr);store_reg(r2,addr+size)
            if post is not None:
              if br=='sp':regs['sp']=(regs['sp']+post)&MASK64
              else:regs[br]=(regs[br]+post)&MASK64
          elif op=='ret':break
          else:raise RuntimeError('unsupported op '+op)
        except Exception as e:
          raise RuntimeError(f'{name} line {li} pc={pc:#x} {op} {a}: {e}')
        count+=1
    return count

# Read constructor order from dynamic relocations.
rel=subprocess.check_output(['readelf','-Wr',str(SO)],text=True)
order=[]
for line in rel.splitlines():
    m=re.match(r'\s*([0-9a-f]{16})\s+\S+\s+R_AARCH64_ABS64\s+([0-9a-f]{16})\s+(\.datadiv_decode\S+)\s+\+ 0',line)
    if m and 0x1af840 <= int(m.group(1),16) < 0x1afbb0:
        order.append((int(m.group(1),16),int(m.group(2),16),m.group(3)))
# Parse disassembly symbol blocks.
blocks={};cur=None;buf=[]
for line in asm:
    m=re.match(r'^[0-9a-f]+ <([^>]+)>:',line)
    if m:
        if cur and 'datadiv_decode' in cur:blocks[cur]=buf
        cur=m.group(1);buf=[]
    elif cur and 'datadiv_decode' in cur:buf.append(line)
if cur and 'datadiv_decode' in cur:blocks[cur]=buf

print('constructors:',len(order),'asm blocks:',len(blocks))
total=0
for slot,addr,name in order:
    if name not in blocks: raise RuntimeError('missing '+name)
    n=run_func(blocks[name],name);total+=n
print('executed decoder instructions:',total)
Path('/mnt/data/round6/decoded_data_full.bin').write_bytes(mem_data[:DATA_SIZE])
Path('/mnt/data/round6/decoded_data_plus_bss.bin').write_bytes(mem_data)
for va in [0x1b5788,0x1b57a0,0x1b58cc,0x1b5a30,0x1b5ac0,0x1b5af0]:
 off=va-DATA_BASE;st=mem_data[off:off+180].split(b'\0')
 print(hex(va),st[0].decode('utf8','backslashreplace'))
