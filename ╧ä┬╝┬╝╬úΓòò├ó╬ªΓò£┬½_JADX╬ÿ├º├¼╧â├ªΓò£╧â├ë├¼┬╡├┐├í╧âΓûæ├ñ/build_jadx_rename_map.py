from pathlib import Path
import re,csv,collections
project_root=Path(__file__).resolve().parents[1]
root=project_root/'app/src/main/java'
outdir=Path(__file__).resolve().parent
outdir.mkdir(parents=True,exist_ok=True)
rows=[]; counts=collections.Counter(); unparsed=[]

def brcnt(line):
    s=re.sub(r'"(?:\\.|[^"\\])*"','""',line)
    s=re.sub(r"'(?:\\.|[^'\\])*'","''",s)
    s=s.split('//',1)[0]
    return s.count('{'),s.count('}')

for p in sorted(root.rglob('*.java')):
    lines=p.read_text('utf-8',errors='replace').splitlines()
    pkg=''
    for ln in lines[:60]:
        m=re.match(r'\s*package\s+([\w.$]+)\s*;',ln)
        if m: pkg=m.group(1);break
    depth=0; stack=[]; pending=None; in_block=False
    for i,line in enumerate(lines):
        st=line.strip()
        # close class scope after prior line depths have changed
        stack=[x for x in stack if x['open_depth']<=depth]
        # marker lines can be inline, complete comments
        mm=re.search(r'JADX INFO: renamed from:\s*(.*?)\s*\*/',line)
        if mm:
            pending=mm.group(1).strip()
        elif pending:
            # Skip all comment material and annotations between marker and declaration
            if in_block:
                if '*/' in line: in_block=False
                op,cl=brcnt(line); depth=max(0,depth+op-cl)
                continue
            if not st or st.startswith('//') or st.startswith('@'):
                op,cl=brcnt(line); depth=max(0,depth+op-cl)
                continue
            if st.startswith('/*'):
                if '*/' not in st: in_block=True
                op,cl=brcnt(line); depth=max(0,depth+op-cl)
                continue
            # type declaration
            mt=re.search(r'\b(?:class|interface|enum|@interface)\s+([\w$]+)',st)
            kind=''; cur=''
            owner=stack[-1] if stack else None
            if mt:
                kind='type';cur=mt.group(1)
            else:
                # method or constructor declaration, including interface/package-private declarations
                # avoid lines that look like control-flow or invocation
                mmeth=re.search(r'([A-Za-z_$][\w$]*)\s*\(([^;{}]*)\)\s*(?:throws\s+[^{}]+)?\s*[;{]',st)
                if not mmeth and re.match(r'^(public|protected|private|abstract|native)\b', st):
                    # Some declarations contain annotation array braces in the parameter list.
                    mmeth=re.search(r'([A-Za-z_$][\w$]*)\s*\(',st)
                if mmeth and not re.match(r'^(if|for|while|switch|catch|return|throw|new|super|this)\b',st):
                    prefix=st[:mmeth.start(1)].strip()
                    if prefix and not prefix.endswith(('=', 'return', 'throw')):
                        kind='method';cur=mmeth.group(1)
                if not kind:
                    # field / local / parameter-like declaration; retain only plausible variable declarations
                    lhs=st.split('=',1)[0].split(';',1)[0].strip()
                    mf=re.search(r'([A-Za-z_$][\w$]*)\s*(?:\[\])?\s*$',lhs)
                    if mf and (';' in st or '=' in st):
                        # avoid bare method calls / labels
                        if not '(' in lhs and not lhs.endswith(':'):
                            cur=mf.group(1)
                            kind='field' if re.search(r'\b(public|protected|private|static|final|transient|volatile)\b',lhs) or (owner and depth==owner['open_depth']) else 'local'
            if kind:
                co=owner['current'] if owner else ''
                oo=owner['original'] if owner else ''
                if kind=='type':
                    cq=(pkg+'.' if pkg else '')+(co+'$' if co else '')+cur; oq=pending
                else:
                    cq=(pkg+'.' if pkg else '')+(co+'.' if co else '')+cur; oq=(oo+'.' if oo else '')+pending
                rows.append({'kind':kind,'package':pkg,'current_owner':co,'original_owner':oo,'current_name':cur,'original_name':pending,'current_qualified_name':cq,'original_qualified_name':oq,'source_file':str(p.relative_to(root)),'source_line':i+1,'declaration':st})
                counts[kind]+=1
            else:
                unparsed.append((str(p.relative_to(root)),i+1,pending,st))
            pending=None
        # update brace depth; then push declared type by inspecting current code line (whether or not mapping)
        before=depth
        op,cl=brcnt(line); depth=max(0,depth+op-cl)
        mt2=re.search(r'\b(?:class|interface|enum|@interface)\s+([\w$]+)',st)
        if mt2 and '{' in st:
            cname=mt2.group(1)
            # map row associated with this declaration line, if its comment had been consumed
            r=next((x for x in reversed(rows) if x['source_file']==str(p.relative_to(root)) and x['source_line']==i+1 and x['kind']=='type'),None)
            orig=r['original_qualified_name'] if r else ''
            stack.append({'current':cname,'original':orig,'open_depth':before+1})

fields=['kind','package','current_owner','original_owner','current_name','original_name','current_qualified_name','original_qualified_name','source_file','source_line','declaration']
with (outdir/'全量_JADX重命名映射.csv').open('w',newline='',encoding='utf-8-sig') as f:
    w=csv.DictWriter(f,fieldnames=fields);w.writeheader();w.writerows(rows)
critical=[]
for r in rows:
    if any(r['source_file'].endswith('/'+x+'.java') for x in ['C0979t3','FastbootActivity','RunnableC0974s3','C0978t2','C0969r3']):critical.append(r)
with (outdir/'JNI关键类_JADX原始名称映射.csv').open('w',newline='',encoding='utf-8-sig') as f:
    w=csv.DictWriter(f,fieldnames=fields);w.writeheader();w.writerows(critical)
with (outdir/'未解析映射检查.csv').open('w',newline='',encoding='utf-8-sig') as f:
    w=csv.writer(f);w.writerow(['file','line','original','next_line']);w.writerows(unparsed)
print('counts',counts,'total',len(rows),'unparsed',len(unparsed),'critical',len(critical))
for k,v in counts.items():print(k,v)
print('sample unparsed')
for x in unparsed[:25]: print(x)
