
/mnt/data/round6/甲壳虫ADB助手_1.3.1_深度检查/app/src/main/lib/arm64-v8a/libadbhelper.so:	file format elf64-littleaarch64

Disassembly of section .text:

0000000000071d50 <Java_c_c_a_t3_h___3B>:
   71d50:      	sub	sp, sp, #0xc0
   71d54:      	stp	x28, x27, [sp, #0x60]
   71d58:      	stp	x26, x25, [sp, #0x70]
   71d5c:      	stp	x24, x23, [sp, #0x80]
   71d60:      	stp	x22, x21, [sp, #0x90]
   71d64:      	stp	x20, x19, [sp, #0xa0]
   71d68:      	stp	x29, x30, [sp, #0xb0]
   71d6c:      	add	x29, sp, #0xb0
   71d70:      	mrs	x8, TPIDR_EL0
   71d74:      	ldr	x8, [x8, #0x28]
   71d78:      	mov	x19, x0
   71d7c:      	mov	x21, x2
   71d80:      	str	x8, [sp, #0x58]
   71d84:      	stp	xzr, xzr, [sp, #0x30]
   71d88:      	stp	xzr, xzr, [sp, #0x20]
   71d8c:      	stp	xzr, xzr, [sp, #0x10]
   71d90:      	str	xzr, [sp, #0x8]
   71d94:      	ldr	x8, [x19]
   71d98:      	ldr	x8, [x8, #0xc8]
   71d9c:      	blr	x8
   71da0:      	ldr	x8, [x19]
   71da4:      	mov	x20, x0
   71da8:      	mov	x0, x19
   71dac:      	mov	x1, x21
   71db0:      	ldr	x8, [x8, #0xc8]
   71db4:      	blr	x8
   71db8:      	mov	x21, x0
   71dbc:      	cbz	x20, 0x72124 <Java_c_c_a_t3_h___3B+0x3d4>
   71dc0:      	mov	w22, #0x43e50000        // =1139081216
   71dc4:      	mov	x2, xzr
   71dc8:      	mov	w25, wzr
   71dcc:      	mov	x28, xzr
   71dd0:      	mov	w26, #0xee              // =238
   71dd4:      	mov	w23, #0x11              // =17
   71dd8:      	orr	w24, wzr, #0x1
   71ddc:      	movk	w22, #0x741b
   71de0:      	cbnz	x2, 0x71e30 <Java_c_c_a_t3_h___3B+0xe0>
   71de4:      	b	0x71dfc <Java_c_c_a_t3_h___3B+0xac>
   71de8:      	ldr	x2, [sp, #0x20]
   71dec:      	neg	w8, w25
   71df0:      	sub	w25, w28, w8
   71df4:      	mov	x28, x27
   71df8:      	cbnz	x2, 0x71e30 <Java_c_c_a_t3_h___3B+0xe0>
   71dfc:      	adrp	x4, 0x1b6000
   71e00:      	adrp	x5, 0x1b6000
   71e04:      	adrp	x6, 0x1b6000
   71e08:      	add	x1, sp, #0x38
   71e0c:      	add	x2, sp, #0x20
   71e10:      	mov	x0, x19
   71e14:      	mov	w3, wzr
   71e18:      	add	x4, x4, #0xdf8
   71e1c:      	add	x5, x5, #0xe04
   71e20:      	add	x6, x6, #0xe08
   71e24:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   71e28:      	tbnz	w0, #0x0, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71e2c:      	ldr	x2, [sp, #0x20]
   71e30:      	ldr	x8, [x19]
   71e34:      	mov	x0, x19
   71e38:      	mov	x1, x20
   71e3c:      	ldr	x8, [x8, #0x300]
   71e40:      	blr	x8
   71e44:      	ldr	x8, [x19]
   71e48:      	mov	w27, w0
   71e4c:      	mov	x0, x19
   71e50:      	ldr	x8, [x8, #0x720]
   71e54:      	blr	x8
   71e58:      	bic	w9, w26, w0
   71e5c:      	and	w10, w0, w23
   71e60:      	bic	w11, w26, w27
   71e64:      	and	w12, w27, w23
   71e68:      	mvn	w8, w0
   71e6c:      	orr	w9, w9, w10
   71e70:      	orr	w10, w11, w12
   71e74:      	eor	w9, w9, w10
   71e78:      	orn	w8, w8, w27
   71e7c:      	orn	w8, w9, w8
   71e80:      	and	w8, w8, #0xff
   71e84:      	cbnz	w8, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71e88:      	cbz	x21, 0x72124 <Java_c_c_a_t3_h___3B+0x3d4>
   71e8c:      	ldr	x8, [x19]
   71e90:      	mov	x0, x19
   71e94:      	mov	x1, x21
   71e98:      	ldr	x8, [x8, #0x558]
   71e9c:      	blr	x8
   71ea0:      	ldr	x8, [x19]
   71ea4:      	mov	w27, w0
   71ea8:      	mov	x0, x19
   71eac:      	ldr	x8, [x8, #0x720]
   71eb0:      	blr	x8
   71eb4:      	tst	w0, #0xff
   71eb8:      	ccmp	w25, w27, #0x0, eq
   71ebc:      	b.ge	0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71ec0:      	cbz	w24, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71ec4:      	ldr	x2, [sp, #0x18]
   71ec8:      	cbnz	x2, 0x71f00 <Java_c_c_a_t3_h___3B+0x1b0>
   71ecc:      	adrp	x4, 0x1b6000
   71ed0:      	adrp	x5, 0x1b6000
   71ed4:      	adrp	x6, 0x1b6000
   71ed8:      	add	x1, sp, #0x38
   71edc:      	add	x2, sp, #0x18
   71ee0:      	mov	x0, x19
   71ee4:      	mov	w3, wzr
   71ee8:      	add	x4, x4, #0xdf8
   71eec:      	add	x5, x5, #0xe0c
   71ef0:      	add	x6, x6, #0xe10
   71ef4:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   71ef8:      	tbnz	w0, #0x0, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71efc:      	ldr	x2, [sp, #0x18]
   71f00:      	ldr	x8, [x19]
   71f04:      	mov	x0, x19
   71f08:      	mov	x1, x20
   71f0c:      	ldr	x8, [x8, #0x2f8]
   71f10:      	blr	x8
   71f14:      	ldr	x8, [x19]
   71f18:      	mov	x27, x0
   71f1c:      	mov	x0, x19
   71f20:      	ldr	x8, [x8, #0x720]
   71f24:      	blr	x8
   71f28:      	and	w8, w0, #0xff
   71f2c:      	cbnz	w8, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71f30:      	cbz	x28, 0x71f48 <Java_c_c_a_t3_h___3B+0x1f8>
   71f34:      	ldr	x8, [x19]
   71f38:      	mov	x0, x19
   71f3c:      	mov	x1, x28
   71f40:      	ldr	x8, [x8, #0xb8]
   71f44:      	blr	x8
   71f48:      	ldr	x8, [x19]
   71f4c:      	mov	x0, x19
   71f50:      	mov	x1, x21
   71f54:      	ldr	x8, [x8, #0x558]
   71f58:      	blr	x8
   71f5c:      	ldr	x8, [x19]
   71f60:      	mov	w28, w0
   71f64:      	mov	x0, x19
   71f68:      	ldr	x8, [x8, #0x720]
   71f6c:      	blr	x8
   71f70:      	and	w8, w0, #0xff
   71f74:      	cbnz	w8, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71f78:      	cbz	x27, 0x72124 <Java_c_c_a_t3_h___3B+0x3d4>
   71f7c:      	ldr	x2, [sp, #0x10]
   71f80:      	cbnz	x2, 0x71fb8 <Java_c_c_a_t3_h___3B+0x268>
   71f84:      	adrp	x4, 0x1b6000
   71f88:      	adrp	x5, 0x1b6000
   71f8c:      	adrp	x6, 0x1b6000
   71f90:      	add	x1, sp, #0x30
   71f94:      	add	x2, sp, #0x10
   71f98:      	mov	x0, x19
   71f9c:      	mov	w3, wzr
   71fa0:      	add	x4, x4, #0xe30
   71fa4:      	add	x5, x5, #0xe44
   71fa8:      	add	x6, x6, #0xe4c
   71fac:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   71fb0:      	tbnz	w0, #0x0, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   71fb4:      	ldr	x2, [sp, #0x10]
   71fb8:      	sub	w8, w28, w22
   71fbc:      	sub	w8, w8, w25
   71fc0:      	add	w8, w8, w22
   71fc4:      	str	x21, [sp, #0x40]
   71fc8:      	str	w25, [sp, #0x48]
   71fcc:      	str	w8, [sp, #0x50]
   71fd0:      	ldr	x8, [x19]
   71fd4:      	add	x3, sp, #0x40
   71fd8:      	mov	x0, x19
   71fdc:      	mov	x1, x27
   71fe0:      	ldr	x8, [x8, #0x198]
   71fe4:      	blr	x8
   71fe8:      	ldr	x8, [x19]
   71fec:      	mov	w28, w0
   71ff0:      	mov	x0, x19
   71ff4:      	ldr	x8, [x8, #0x720]
   71ff8:      	blr	x8
   71ffc:      	and	w8, w0, #0xff
   72000:      	cbnz	w8, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   72004:      	tbz	w28, #0x1f, 0x71de8 <Java_c_c_a_t3_h___3B+0x98>
   72008:      	ldr	x8, [x19]
   7200c:      	mov	x0, x19
   72010:      	mov	x1, x21
   72014:      	ldr	x8, [x8, #0xb8]
   72018:      	blr	x8
   7201c:      	ldr	x1, [sp, #0x28]
   72020:      	cbnz	x1, 0x72040 <Java_c_c_a_t3_h___3B+0x2f0>
   72024:      	adrp	x2, 0x1b6000
   72028:      	add	x2, x2, #0xe60
   7202c:      	add	x1, sp, #0x28
   72030:      	mov	x0, x19
   72034:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
   72038:      	tbnz	w0, #0x0, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   7203c:      	ldr	x1, [sp, #0x28]
   72040:      	ldr	x8, [x19]
   72044:      	mov	x0, x19
   72048:      	ldr	x8, [x8, #0xd8]
   7204c:      	blr	x8
   72050:      	ldr	x8, [x19]
   72054:      	mov	x20, x0
   72058:      	mov	x0, x19
   7205c:      	ldr	x8, [x8, #0x720]
   72060:      	blr	x8
   72064:      	and	w8, w0, #0xff
   72068:      	cbnz	w8, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   7206c:      	ldr	x8, [x19]
   72070:      	adrp	x1, 0x1b6000
   72074:      	add	x1, x1, #0xe80
   72078:      	mov	x0, x19
   7207c:      	ldr	x8, [x8, #0x538]
   72080:      	blr	x8
   72084:      	mov	x21, x0
   72088:      	cbz	x20, 0x72124 <Java_c_c_a_t3_h___3B+0x3d4>
   7208c:      	ldr	x2, [sp, #0x8]
   72090:      	cbnz	x2, 0x720c8 <Java_c_c_a_t3_h___3B+0x378>
   72094:      	adrp	x4, 0x1b6000
   72098:      	adrp	x5, 0x1b6000
   7209c:      	adrp	x6, 0x1b6000
   720a0:      	add	x4, x4, #0xe60
   720a4:      	add	x5, x5, #0xea8
   720a8:      	add	x6, x6, #0xeb0
   720ac:      	add	x1, sp, #0x28
   720b0:      	add	x2, sp, #0x8
   720b4:      	mov	x0, x19
   720b8:      	mov	w3, wzr
   720bc:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   720c0:      	tbnz	w0, #0x0, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   720c4:      	ldr	x2, [sp, #0x8]
   720c8:      	str	x21, [sp, #0x40]
   720cc:      	ldr	x8, [x19]
   720d0:      	add	x3, sp, #0x40
   720d4:      	mov	x0, x19
   720d8:      	mov	x1, x20
   720dc:      	ldr	x8, [x8, #0x1f8]
   720e0:      	blr	x8
   720e4:      	ldr	x8, [x19]
   720e8:      	mov	x0, x19
   720ec:      	ldr	x8, [x8, #0x720]
   720f0:      	blr	x8
   720f4:      	and	w8, w0, #0xff
   720f8:      	cbnz	w8, 0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   720fc:      	ldr	x8, [x19]
   72100:      	mov	x0, x19
   72104:      	mov	x1, x20
   72108:      	ldr	x8, [x8, #0x68]
   7210c:      	blr	x8
   72110:      	ldr	x8, [x19]
   72114:      	mov	x0, x19
   72118:      	ldr	x8, [x8, #0x720]
   7211c:      	blr	x8
   72120:      	b	0x7213c <Java_c_c_a_t3_h___3B+0x3ec>
   72124:      	adrp	x1, 0x1b6000
   72128:      	adrp	x2, 0x1b6000
   7212c:      	add	x1, x1, #0xdc0
   72130:      	add	x2, x2, #0xde0
   72134:      	mov	x0, x19
   72138:      	bl	0xe160 <_Z19d2c_throw_exceptionP7_JNIEnvPKcS2_@plt>
   7213c:      	mrs	x8, TPIDR_EL0
   72140:      	ldr	x8, [x8, #0x28]
   72144:      	ldr	x9, [sp, #0x58]
   72148:      	cmp	x8, x9
   7214c:      	b.ne	0x72170 <Java_c_c_a_t3_h___3B+0x420>
   72150:      	ldp	x29, x30, [sp, #0xb0]
   72154:      	ldp	x20, x19, [sp, #0xa0]
   72158:      	ldp	x22, x21, [sp, #0x90]
   7215c:      	ldp	x24, x23, [sp, #0x80]
   72160:      	ldp	x26, x25, [sp, #0x70]
   72164:      	ldp	x28, x27, [sp, #0x60]
   72168:      	add	sp, sp, #0xc0
   7216c:      	ret
   72170:      	bl	0xde90 <__stack_chk_fail@plt>

/mnt/data/round6/甲壳虫ADB助手_1.3.1_深度检查/app/src/main/lib/arm64-v8a/libadbhelper.so:	file format elf64-littleaarch64

Disassembly of section .text:

0000000000072e8c <Java_c_c_a_t3_i___3B>:
   72e8c:      	sub	sp, sp, #0x80
   72e90:      	str	x23, [sp, #0x40]
   72e94:      	stp	x22, x21, [sp, #0x50]
   72e98:      	stp	x20, x19, [sp, #0x60]
   72e9c:      	stp	x29, x30, [sp, #0x70]
   72ea0:      	add	x29, sp, #0x70
   72ea4:      	mrs	x8, TPIDR_EL0
   72ea8:      	ldr	x8, [x8, #0x28]
   72eac:      	mov	x19, x0
   72eb0:      	mov	x21, x2
   72eb4:      	str	x8, [sp, #0x38]
   72eb8:      	stp	xzr, xzr, [sp, #0x10]
   72ebc:      	str	xzr, [sp, #0x8]
   72ec0:      	ldr	x8, [x19]
   72ec4:      	ldr	x8, [x8, #0xc8]
   72ec8:      	blr	x8
   72ecc:      	ldr	x8, [x19]
   72ed0:      	mov	x20, x0
   72ed4:      	mov	x0, x19
   72ed8:      	mov	x1, x21
   72edc:      	ldr	x8, [x8, #0xc8]
   72ee0:      	blr	x8
   72ee4:      	mov	x21, x0
   72ee8:      	cbz	x20, 0x72ff4 <Java_c_c_a_t3_i___3B+0x168>
   72eec:      	adrp	x4, 0x1b6000
   72ef0:      	adrp	x5, 0x1b6000
   72ef4:      	adrp	x6, 0x1b6000
   72ef8:      	add	x4, x4, #0xf08
   72efc:      	add	x5, x5, #0xf14
   72f00:      	add	x6, x6, #0xf20
   72f04:      	add	x1, sp, #0x18
   72f08:      	add	x2, sp, #0x10
   72f0c:      	mov	x0, x19
   72f10:      	mov	w3, wzr
   72f14:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   72f18:      	tbnz	w0, #0x0, 0x7300c <Java_c_c_a_t3_i___3B+0x180>
   72f1c:      	ldr	x8, [x19]
   72f20:      	ldr	x2, [sp, #0x10]
   72f24:      	mov	x0, x19
   72f28:      	mov	x1, x20
   72f2c:      	ldr	x8, [x8, #0x2f8]
   72f30:      	blr	x8
   72f34:      	ldr	x8, [x19]
   72f38:      	mov	x22, x0
   72f3c:      	mov	x0, x19
   72f40:      	ldr	x8, [x8, #0x720]
   72f44:      	blr	x8
   72f48:      	and	w8, w0, #0xff
   72f4c:      	cbnz	w8, 0x7300c <Java_c_c_a_t3_i___3B+0x180>
   72f50:      	cbz	x21, 0x72ff4 <Java_c_c_a_t3_i___3B+0x168>
   72f54:      	ldr	x8, [x19]
   72f58:      	mov	x0, x19
   72f5c:      	mov	x1, x21
   72f60:      	ldr	x8, [x8, #0x558]
   72f64:      	blr	x8
   72f68:      	ldr	x8, [x19]
   72f6c:      	mov	w23, w0
   72f70:      	mov	x0, x19
   72f74:      	ldr	x8, [x8, #0x720]
   72f78:      	blr	x8
   72f7c:      	and	w8, w0, #0xff
   72f80:      	cbnz	w8, 0x7300c <Java_c_c_a_t3_i___3B+0x180>
   72f84:      	ldr	x2, [sp, #0x8]
   72f88:      	cbnz	x2, 0x72fc0 <Java_c_c_a_t3_i___3B+0x134>
   72f8c:      	adrp	x4, 0x1b6000
   72f90:      	adrp	x5, 0x1b6000
   72f94:      	adrp	x6, 0x1b6000
   72f98:      	add	x4, x4, #0xf08
   72f9c:      	add	x5, x5, #0xf14
   72fa0:      	add	x6, x6, #0xf50
   72fa4:      	add	x1, sp, #0x18
   72fa8:      	add	x2, sp, #0x8
   72fac:      	mov	x0, x19
   72fb0:      	mov	w3, wzr
   72fb4:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   72fb8:      	tbnz	w0, #0x0, 0x7300c <Java_c_c_a_t3_i___3B+0x180>
   72fbc:      	ldr	x2, [sp, #0x8]
   72fc0:      	stp	x22, x21, [sp, #0x20]
   72fc4:      	str	w23, [sp, #0x30]
   72fc8:      	ldr	x8, [x19]
   72fcc:      	add	x3, sp, #0x20
   72fd0:      	mov	x0, x19
   72fd4:      	mov	x1, x20
   72fd8:      	ldr	x8, [x8, #0x1f8]
   72fdc:      	blr	x8
   72fe0:      	ldr	x8, [x19]
   72fe4:      	mov	x0, x19
   72fe8:      	ldr	x8, [x8, #0x720]
   72fec:      	blr	x8
   72ff0:      	b	0x7300c <Java_c_c_a_t3_i___3B+0x180>
   72ff4:      	adrp	x1, 0x1b6000
   72ff8:      	adrp	x2, 0x1b6000
   72ffc:      	add	x1, x1, #0xed0
   73000:      	add	x2, x2, #0xef0
   73004:      	mov	x0, x19
   73008:      	bl	0xe160 <_Z19d2c_throw_exceptionP7_JNIEnvPKcS2_@plt>
   7300c:      	mrs	x8, TPIDR_EL0
   73010:      	ldr	x8, [x8, #0x28]
   73014:      	ldr	x9, [sp, #0x38]
   73018:      	cmp	x8, x9
   7301c:      	b.ne	0x73038 <Java_c_c_a_t3_i___3B+0x1ac>
   73020:      	ldp	x29, x30, [sp, #0x70]
   73024:      	ldp	x20, x19, [sp, #0x60]
   73028:      	ldp	x22, x21, [sp, #0x50]
   7302c:      	ldr	x23, [sp, #0x40]
   73030:      	add	sp, sp, #0x80
   73034:      	ret
   73038:      	bl	0xde90 <__stack_chk_fail@plt>

/mnt/data/round6/甲壳虫ADB助手_1.3.1_深度检查/app/src/main/lib/arm64-v8a/libadbhelper.so:	file format elf64-littleaarch64

Disassembly of section .text:

000000000005e2ec <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI>:
   5e2ec:      	sub	sp, sp, #0x100
   5e2f0:      	stp	x28, x27, [sp, #0xa0]
   5e2f4:      	stp	x26, x25, [sp, #0xb0]
   5e2f8:      	stp	x24, x23, [sp, #0xc0]
   5e2fc:      	stp	x22, x21, [sp, #0xd0]
   5e300:      	stp	x20, x19, [sp, #0xe0]
   5e304:      	stp	x29, x30, [sp, #0xf0]
   5e308:      	add	x29, sp, #0xf0
   5e30c:      	mrs	x8, TPIDR_EL0
   5e310:      	ldr	x8, [x8, #0x28]
   5e314:      	mov	x19, x0
   5e318:      	mov	w24, w4
   5e31c:      	mov	x23, x3
   5e320:      	stur	x8, [x29, #-0x58]
   5e324:      	stp	xzr, xzr, [sp, #0x60]
   5e328:      	stp	xzr, xzr, [sp, #0x50]
   5e32c:      	stp	xzr, xzr, [sp, #0x40]
   5e330:      	stp	xzr, xzr, [sp, #0x30]
   5e334:      	stp	xzr, xzr, [sp, #0x20]
   5e338:      	ldr	x8, [x19]
   5e33c:      	mov	x22, x2
   5e340:      	ldr	x8, [x8, #0xc8]
   5e344:      	blr	x8
   5e348:      	ldr	x8, [x19]
   5e34c:      	mov	x21, x0
   5e350:      	mov	x0, x19
   5e354:      	mov	x1, x22
   5e358:      	ldr	x8, [x8, #0xc8]
   5e35c:      	blr	x8
   5e360:      	ldr	x8, [x19]
   5e364:      	mov	x22, x0
   5e368:      	mov	x0, x19
   5e36c:      	mov	x1, x23
   5e370:      	ldr	x8, [x8, #0xc8]
   5e374:      	blr	x8
   5e378:      	str	x0, [sp, #0x10]
   5e37c:      	cbz	x21, 0x5e8a8 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5bc>
   5e380:      	mov	w8, #-0x3860000         // =-59113472
   5e384:      	movk	w8, #0xc3a5
   5e388:      	mov	x2, xzr
   5e38c:      	mov	w20, wzr
   5e390:      	mov	x27, xzr
   5e394:      	mov	x25, xzr
   5e398:      	mov	x28, xzr
   5e39c:      	sub	w8, w24, w8
   5e3a0:      	str	w24, [sp, #0x1c]
   5e3a4:      	str	w8, [sp, #0xc]
   5e3a8:      	cbnz	x2, 0x5e408 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x11c>
   5e3ac:      	b	0x5e3d4 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0xe8>
   5e3b0:      	mov	w9, #0x5ea40000         // =1587806208
   5e3b4:      	bic	w8, w23, w23, asr #31
   5e3b8:      	ldr	x2, [sp, #0x48]
   5e3bc:      	movk	w9, #0x8218
   5e3c0:      	sub	w8, w8, w9
   5e3c4:      	add	w8, w8, w20
   5e3c8:      	add	w20, w8, w9
   5e3cc:      	mov	x25, x26
   5e3d0:      	cbnz	x2, 0x5e408 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x11c>
   5e3d4:      	adrp	x4, 0x1b5000
   5e3d8:      	adrp	x5, 0x1b5000
   5e3dc:      	adrp	x6, 0x1b5000
   5e3e0:      	add	x1, sp, #0x68
   5e3e4:      	add	x2, sp, #0x48
   5e3e8:      	mov	x0, x19
   5e3ec:      	mov	w3, wzr
   5e3f0:      	add	x4, x4, #0xbb8
   5e3f4:      	add	x5, x5, #0xbc4
   5e3f8:      	add	x6, x6, #0xbc8
   5e3fc:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5e400:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e404:      	ldr	x2, [sp, #0x48]
   5e408:      	ldr	x8, [x19]
   5e40c:      	mov	x0, x19
   5e410:      	mov	x1, x21
   5e414:      	ldr	x8, [x8, #0x300]
   5e418:      	blr	x8
   5e41c:      	ldr	x8, [x19]
   5e420:      	mov	w23, w0
   5e424:      	mov	x0, x19
   5e428:      	ldr	x8, [x8, #0x720]
   5e42c:      	blr	x8
   5e430:      	and	w8, w0, #0xff
   5e434:      	cbnz	w8, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e438:      	ldr	w9, [sp, #0x1c]
   5e43c:      	tst	w23, #0xff
   5e440:      	cset	w8, eq
   5e444:      	cmp	w20, w9
   5e448:      	cset	w9, lt
   5e44c:      	eor	w8, w9, w8
   5e450:      	tbnz	w8, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e454:      	b.ge	0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e458:      	ldr	x2, [sp, #0x40]
   5e45c:      	cbnz	x2, 0x5e494 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x1a8>
   5e460:      	adrp	x4, 0x1b5000
   5e464:      	adrp	x5, 0x1b5000
   5e468:      	adrp	x6, 0x1b5000
   5e46c:      	add	x1, sp, #0x68
   5e470:      	add	x2, sp, #0x40
   5e474:      	mov	x0, x19
   5e478:      	mov	w3, wzr
   5e47c:      	add	x4, x4, #0xbb8
   5e480:      	add	x5, x5, #0xbcc
   5e484:      	add	x6, x6, #0xbc8
   5e488:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5e48c:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e490:      	ldr	x2, [sp, #0x40]
   5e494:      	ldr	x8, [x19]
   5e498:      	mov	x0, x19
   5e49c:      	mov	x1, x21
   5e4a0:      	ldr	x8, [x8, #0x300]
   5e4a4:      	blr	x8
   5e4a8:      	ldr	x8, [x19]
   5e4ac:      	mov	w23, w0
   5e4b0:      	mov	x0, x19
   5e4b4:      	ldr	x8, [x8, #0x720]
   5e4b8:      	blr	x8
   5e4bc:      	and	w8, w0, #0xff
   5e4c0:      	cbnz	w8, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e4c4:      	and	w8, w23, #0xff
   5e4c8:      	cbz	w8, 0x5e724 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x438>
   5e4cc:      	cbz	x22, 0x5e8a8 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5bc>
   5e4d0:      	ldr	x2, [sp, #0x30]
   5e4d4:      	cbnz	x2, 0x5e50c <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x220>
   5e4d8:      	adrp	x4, 0x1b5000
   5e4dc:      	adrp	x5, 0x1b5000
   5e4e0:      	adrp	x6, 0x1b5000
   5e4e4:      	add	x1, sp, #0x60
   5e4e8:      	add	x2, sp, #0x30
   5e4ec:      	mov	x0, x19
   5e4f0:      	mov	w3, wzr
   5e4f4:      	add	x4, x4, #0xbd0
   5e4f8:      	add	x5, x5, #0xc00
   5e4fc:      	add	x6, x6, #0xc14
   5e500:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5e504:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e508:      	ldr	x2, [sp, #0x30]
   5e50c:      	ldr	x8, [x19]
   5e510:      	add	x3, sp, #0x70
   5e514:      	mov	x0, x19
   5e518:      	mov	x1, x22
   5e51c:      	ldr	x8, [x8, #0x198]
   5e520:      	blr	x8
   5e524:      	ldr	x8, [x19]
   5e528:      	mov	w24, w0
   5e52c:      	mov	x0, x19
   5e530:      	ldr	x8, [x8, #0x720]
   5e534:      	blr	x8
   5e538:      	and	w8, w0, #0xff
   5e53c:      	cbnz	w8, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e540:      	ldr	x2, [sp, #0x38]
   5e544:      	cbnz	x2, 0x5e57c <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x290>
   5e548:      	adrp	x4, 0x1b5000
   5e54c:      	adrp	x5, 0x1b5000
   5e550:      	adrp	x6, 0x1b5000
   5e554:      	add	x1, sp, #0x68
   5e558:      	add	x2, sp, #0x38
   5e55c:      	mov	x0, x19
   5e560:      	mov	w3, wzr
   5e564:      	add	x4, x4, #0xbb8
   5e568:      	add	x5, x5, #0xc18
   5e56c:      	add	x6, x6, #0xc20
   5e570:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5e574:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e578:      	ldr	x2, [sp, #0x38]
   5e57c:      	ldr	x8, [x19]
   5e580:      	mov	x0, x19
   5e584:      	mov	x1, x21
   5e588:      	ldr	x8, [x8, #0x2f8]
   5e58c:      	blr	x8
   5e590:      	ldr	x8, [x19]
   5e594:      	mov	x23, x0
   5e598:      	mov	x0, x19
   5e59c:      	ldr	x8, [x8, #0x720]
   5e5a0:      	blr	x8
   5e5a4:      	and	w8, w0, #0xff
   5e5a8:      	cbnz	w8, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e5ac:      	cbz	x27, 0x5e5c4 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x2d8>
   5e5b0:      	ldr	x8, [x19]
   5e5b4:      	mov	x0, x19
   5e5b8:      	mov	x1, x27
   5e5bc:      	ldr	x8, [x8, #0xb8]
   5e5c0:      	blr	x8
   5e5c4:      	ldr	x2, [sp, #0x28]
   5e5c8:      	cbnz	x2, 0x5e600 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x314>
   5e5cc:      	adrp	x4, 0x1b5000
   5e5d0:      	adrp	x5, 0x1b5000
   5e5d4:      	adrp	x6, 0x1b5000
   5e5d8:      	add	x1, sp, #0x58
   5e5dc:      	add	x2, sp, #0x28
   5e5e0:      	orr	w3, wzr, #0x1
   5e5e4:      	mov	x0, x19
   5e5e8:      	add	x4, x4, #0xc4c
   5e5ec:      	add	x5, x5, #0xc5c
   5e5f0:      	add	x6, x6, #0xc60
   5e5f4:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5e5f8:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e5fc:      	ldr	x2, [sp, #0x28]
   5e600:      	ldr	w8, [sp, #0x1c]
   5e604:      	str	w24, [sp, #0x78]
   5e608:      	ldr	x1, [sp, #0x58]
   5e60c:      	add	x3, sp, #0x70
   5e610:      	sub	w8, w8, w20
   5e614:      	str	w8, [sp, #0x70]
   5e618:      	ldr	x8, [x19]
   5e61c:      	mov	x0, x19
   5e620:      	ldr	x8, [x8, #0x418]
   5e624:      	blr	x8
   5e628:      	ldr	x8, [x19]
   5e62c:      	mov	w24, w0
   5e630:      	mov	x0, x19
   5e634:      	ldr	x8, [x8, #0x720]
   5e638:      	blr	x8
   5e63c:      	and	w8, w0, #0xff
   5e640:      	cbnz	w8, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e644:      	cbz	x25, 0x5e65c <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x370>
   5e648:      	ldr	x8, [x19]
   5e64c:      	mov	x0, x19
   5e650:      	mov	x1, x25
   5e654:      	ldr	x8, [x8, #0xb8]
   5e658:      	blr	x8
   5e65c:      	ldr	x8, [x19]
   5e660:      	mov	x0, x19
   5e664:      	mov	x1, x23
   5e668:      	ldr	x8, [x8, #0xc8]
   5e66c:      	blr	x8
   5e670:      	mov	x26, x0
   5e674:      	cbz	x23, 0x5e68c <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x3a0>
   5e678:      	ldr	x8, [x19]
   5e67c:      	mov	x0, x19
   5e680:      	mov	x1, x23
   5e684:      	ldr	x8, [x8, #0xb8]
   5e688:      	blr	x8
   5e68c:      	ldr	x8, [x19]
   5e690:      	mov	x0, x19
   5e694:      	mov	x1, x22
   5e698:      	ldr	x8, [x8, #0xc8]
   5e69c:      	blr	x8
   5e6a0:      	mov	x27, x0
   5e6a4:      	cbz	x28, 0x5e6bc <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x3d0>
   5e6a8:      	ldr	x8, [x19]
   5e6ac:      	mov	x0, x19
   5e6b0:      	mov	x1, x28
   5e6b4:      	ldr	x8, [x8, #0xb8]
   5e6b8:      	blr	x8
   5e6bc:      	ldr	x8, [x19]
   5e6c0:      	ldr	x1, [sp, #0x10]
   5e6c4:      	mov	x0, x19
   5e6c8:      	ldr	x8, [x8, #0xc8]
   5e6cc:      	blr	x8
   5e6d0:      	mov	x28, x0
   5e6d4:      	cbz	x26, 0x5e8a8 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5bc>
   5e6d8:      	ldr	x2, [sp, #0x20]
   5e6dc:      	cbnz	x2, 0x5e714 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x428>
   5e6e0:      	adrp	x4, 0x1b5000
   5e6e4:      	adrp	x5, 0x1b5000
   5e6e8:      	adrp	x6, 0x1b5000
   5e6ec:      	add	x1, sp, #0x50
   5e6f0:      	add	x2, sp, #0x20
   5e6f4:      	mov	x0, x19
   5e6f8:      	mov	w3, wzr
   5e6fc:      	add	x4, x4, #0xc70
   5e700:      	add	x5, x5, #0xc9c
   5e704:      	add	x6, x6, #0xcb0
   5e708:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5e70c:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e710:      	ldr	x2, [sp, #0x20]
   5e714:      	stp	x27, x28, [sp, #0x70]
   5e718:      	str	w20, [sp, #0x80]
   5e71c:      	str	w24, [sp, #0x88]
   5e720:      	b	0x5e868 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x57c>
   5e724:      	ldr	x2, [sp, #0x38]
   5e728:      	cbnz	x2, 0x5e760 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x474>
   5e72c:      	adrp	x4, 0x1b5000
   5e730:      	adrp	x5, 0x1b5000
   5e734:      	adrp	x6, 0x1b5000
   5e738:      	add	x1, sp, #0x68
   5e73c:      	add	x2, sp, #0x38
   5e740:      	mov	x0, x19
   5e744:      	mov	w3, wzr
   5e748:      	add	x4, x4, #0xbb8
   5e74c:      	add	x5, x5, #0xc18
   5e750:      	add	x6, x6, #0xc20
   5e754:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5e758:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e75c:      	ldr	x2, [sp, #0x38]
   5e760:      	ldr	x8, [x19]
   5e764:      	mov	x0, x19
   5e768:      	mov	x1, x21
   5e76c:      	ldr	x8, [x8, #0x2f8]
   5e770:      	blr	x8
   5e774:      	ldr	x8, [x19]
   5e778:      	mov	x26, x0
   5e77c:      	mov	x0, x19
   5e780:      	ldr	x8, [x8, #0x720]
   5e784:      	blr	x8
   5e788:      	and	w8, w0, #0xff
   5e78c:      	cbnz	w8, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e790:      	cbz	x25, 0x5e7a8 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x4bc>
   5e794:      	ldr	x8, [x19]
   5e798:      	mov	x0, x19
   5e79c:      	mov	x1, x25
   5e7a0:      	ldr	x8, [x8, #0xb8]
   5e7a4:      	blr	x8
   5e7a8:      	cbz	x27, 0x5e7c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x4d4>
   5e7ac:      	ldr	x8, [x19]
   5e7b0:      	mov	x0, x19
   5e7b4:      	mov	x1, x27
   5e7b8:      	ldr	x8, [x8, #0xb8]
   5e7bc:      	blr	x8
   5e7c0:      	ldr	x8, [x19]
   5e7c4:      	mov	x0, x19
   5e7c8:      	mov	x1, x22
   5e7cc:      	ldr	x8, [x8, #0xc8]
   5e7d0:      	blr	x8
   5e7d4:      	mov	x27, x0
   5e7d8:      	cbz	x28, 0x5e7f0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x504>
   5e7dc:      	ldr	x8, [x19]
   5e7e0:      	mov	x0, x19
   5e7e4:      	mov	x1, x28
   5e7e8:      	ldr	x8, [x8, #0xb8]
   5e7ec:      	blr	x8
   5e7f0:      	ldr	x8, [x19]
   5e7f4:      	ldr	x1, [sp, #0x10]
   5e7f8:      	mov	x0, x19
   5e7fc:      	ldr	x8, [x8, #0xc8]
   5e800:      	blr	x8
   5e804:      	mov	x28, x0
   5e808:      	cbz	x26, 0x5e8a8 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5bc>
   5e80c:      	ldr	x2, [sp, #0x20]
   5e810:      	cbnz	x2, 0x5e848 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x55c>
   5e814:      	adrp	x4, 0x1b5000
   5e818:      	adrp	x5, 0x1b5000
   5e81c:      	adrp	x6, 0x1b5000
   5e820:      	add	x1, sp, #0x50
   5e824:      	add	x2, sp, #0x20
   5e828:      	mov	x0, x19
   5e82c:      	mov	w3, wzr
   5e830:      	add	x4, x4, #0xc70
   5e834:      	add	x5, x5, #0xc9c
   5e838:      	add	x6, x6, #0xcb0
   5e83c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5e840:      	tbnz	w0, #0x0, 0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e844:      	ldr	x2, [sp, #0x20]
   5e848:      	ldr	w8, [sp, #0xc]
   5e84c:      	mov	w9, #-0x3860000         // =-59113472
   5e850:      	movk	w9, #0xc3a5
   5e854:      	stp	x27, x28, [sp, #0x70]
   5e858:      	sub	w8, w8, w20
   5e85c:      	add	w8, w8, w9
   5e860:      	str	w20, [sp, #0x80]
   5e864:      	str	w8, [sp, #0x88]
   5e868:      	mov	w8, #0x3e8              // =1000
   5e86c:      	str	w8, [sp, #0x90]
   5e870:      	ldr	x8, [x19]
   5e874:      	add	x3, sp, #0x70
   5e878:      	mov	x0, x19
   5e87c:      	mov	x1, x26
   5e880:      	ldr	x8, [x8, #0x198]
   5e884:      	blr	x8
   5e888:      	ldr	x8, [x19]
   5e88c:      	mov	w23, w0
   5e890:      	mov	x0, x19
   5e894:      	ldr	x8, [x8, #0x720]
   5e898:      	blr	x8
   5e89c:      	and	w8, w0, #0xff
   5e8a0:      	cbz	w8, 0x5e3b0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0xc4>
   5e8a4:      	b	0x5e8c0 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x5d4>
   5e8a8:      	adrp	x1, 0x1b5000
   5e8ac:      	adrp	x2, 0x1b5000
   5e8b0:      	add	x1, x1, #0xb80
   5e8b4:      	add	x2, x2, #0xba0
   5e8b8:      	mov	x0, x19
   5e8bc:      	bl	0xe160 <_Z19d2c_throw_exceptionP7_JNIEnvPKcS2_@plt>
   5e8c0:      	mrs	x8, TPIDR_EL0
   5e8c4:      	ldr	x8, [x8, #0x28]
   5e8c8:      	ldur	x9, [x29, #-0x58]
   5e8cc:      	cmp	x8, x9
   5e8d0:      	b.ne	0x5e8f4 <Java_c_c_a_t3_b__Landroid_hardware_usb_UsbEndpoint_2_3BI+0x608>
   5e8d4:      	ldp	x29, x30, [sp, #0xf0]
   5e8d8:      	ldp	x20, x19, [sp, #0xe0]
   5e8dc:      	ldp	x22, x21, [sp, #0xd0]
   5e8e0:      	ldp	x24, x23, [sp, #0xc0]
   5e8e4:      	ldp	x26, x25, [sp, #0xb0]
   5e8e8:      	ldp	x28, x27, [sp, #0xa0]
   5e8ec:      	add	sp, sp, #0x100
   5e8f0:      	ret
   5e8f4:      	bl	0xde90 <__stack_chk_fail@plt>

/mnt/data/round6/甲壳虫ADB助手_1.3.1_深度检查/app/src/main/lib/arm64-v8a/libadbhelper.so:	file format elf64-littleaarch64

Disassembly of section .text:

00000000000f4a50 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI>:
   f4a50:      	sub	sp, sp, #0xe0
   f4a54:      	stp	x24, x23, [sp, #0xa0]
   f4a58:      	stp	x22, x21, [sp, #0xb0]
   f4a5c:      	stp	x20, x19, [sp, #0xc0]
   f4a60:      	stp	x29, x30, [sp, #0xd0]
   f4a64:      	add	x29, sp, #0xd0
   f4a68:      	mrs	x8, TPIDR_EL0
   f4a6c:      	ldr	x8, [x8, #0x28]
   f4a70:      	mov	x19, x0
   f4a74:      	mov	w22, w3
   f4a78:      	mov	x21, x2
   f4a7c:      	stur	x8, [x29, #-0x38]
   f4a80:      	stp	xzr, xzr, [x29, #-0x60]
   f4a84:      	stp	xzr, xzr, [sp, #0x60]
   f4a88:      	stp	xzr, xzr, [sp, #0x50]
   f4a8c:      	stp	xzr, xzr, [sp, #0x40]
   f4a90:      	stp	xzr, xzr, [sp, #0x30]
   f4a94:      	stp	xzr, xzr, [sp, #0x20]
   f4a98:      	stp	xzr, xzr, [sp, #0x10]
   f4a9c:      	str	xzr, [sp, #0x8]
   f4aa0:      	ldr	x8, [x19]
   f4aa4:      	ldr	x8, [x8, #0xc8]
   f4aa8:      	blr	x8
   f4aac:      	ldr	x8, [x19]
   f4ab0:      	mov	x20, x0
   f4ab4:      	mov	x0, x19
   f4ab8:      	mov	x1, x21
   f4abc:      	ldr	x8, [x8, #0xc8]
   f4ac0:      	blr	x8
   f4ac4:      	adrp	x2, 0x1bf000
   f4ac8:      	mov	x21, x0
   f4acc:      	add	x2, x2, #0x910
   f4ad0:      	sub	x1, x29, #0x58
   f4ad4:      	mov	x0, x19
   f4ad8:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
   f4adc:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4ae0:      	ldr	x8, [x19]
   f4ae4:      	ldur	x1, [x29, #-0x58]
   f4ae8:      	mov	x0, x19
   f4aec:      	ldr	x8, [x8, #0xd8]
   f4af0:      	blr	x8
   f4af4:      	ldr	x8, [x19]
   f4af8:      	mov	x23, x0
   f4afc:      	mov	x0, x19
   f4b00:      	ldr	x8, [x8, #0x720]
   f4b04:      	blr	x8
   f4b08:      	and	w8, w0, #0xff
   f4b0c:      	cbz	w8, 0xf4b3c <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xec>
   f4b10:      	mrs	x8, TPIDR_EL0
   f4b14:      	ldr	x8, [x8, #0x28]
   f4b18:      	ldur	x9, [x29, #-0x38]
   f4b1c:      	cmp	x8, x9
   f4b20:      	b.ne	0xf50e8 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x698>
   f4b24:      	ldp	x29, x30, [sp, #0xd0]
   f4b28:      	ldp	x20, x19, [sp, #0xc0]
   f4b2c:      	ldp	x22, x21, [sp, #0xb0]
   f4b30:      	ldp	x24, x23, [sp, #0xa0]
   f4b34:      	add	sp, sp, #0xe0
   f4b38:      	ret
   f4b3c:      	cbz	x23, 0xf50cc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x67c>
   f4b40:      	ldr	x2, [sp, #0x40]
   f4b44:      	cbnz	x2, 0xf4b7c <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x12c>
   f4b48:      	adrp	x4, 0x1bf000
   f4b4c:      	adrp	x5, 0x1bf000
   f4b50:      	adrp	x6, 0x1bf000
   f4b54:      	add	x4, x4, #0x910
   f4b58:      	add	x5, x5, #0x968
   f4b5c:      	add	x6, x6, #0x970
   f4b60:      	sub	x1, x29, #0x58
   f4b64:      	add	x2, sp, #0x40
   f4b68:      	mov	x0, x19
   f4b6c:      	mov	w3, wzr
   f4b70:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4b74:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4b78:      	ldr	x2, [sp, #0x40]
   f4b7c:      	stur	x21, [x29, #-0x50]
   f4b80:      	stur	wzr, [x29, #-0x48]
   f4b84:      	stur	w22, [x29, #-0x40]
   f4b88:      	ldr	x8, [x19]
   f4b8c:      	sub	x3, x29, #0x50
   f4b90:      	mov	x0, x19
   f4b94:      	mov	x1, x23
   f4b98:      	ldr	x8, [x8, #0x1f8]
   f4b9c:      	blr	x8
   f4ba0:      	ldr	x8, [x19]
   f4ba4:      	mov	x0, x19
   f4ba8:      	ldr	x8, [x8, #0x720]
   f4bac:      	blr	x8
   f4bb0:      	and	w8, w0, #0xff
   f4bb4:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4bb8:      	ldr	x2, [sp, #0x38]
   f4bbc:      	cbnz	x2, 0xf4bf4 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x1a4>
   f4bc0:      	adrp	x4, 0x1bf000
   f4bc4:      	adrp	x5, 0x1bf000
   f4bc8:      	adrp	x6, 0x1bf000
   f4bcc:      	add	x4, x4, #0x980
   f4bd0:      	add	x5, x5, #0x994
   f4bd4:      	add	x6, x6, #0x9a0
   f4bd8:      	sub	x1, x29, #0x60
   f4bdc:      	add	x2, sp, #0x38
   f4be0:      	orr	w3, wzr, #0x1
   f4be4:      	mov	x0, x19
   f4be8:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4bec:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4bf0:      	ldr	x2, [sp, #0x38]
   f4bf4:      	mov	w8, #-0x5db50000        // =-1572143104
   f4bf8:      	movk	w8, #0xf275
   f4bfc:      	sub	w9, w22, w8
   f4c00:      	add	w9, w9, #0x8
   f4c04:      	add	w8, w9, w8
   f4c08:      	stur	w8, [x29, #-0x50]
   f4c0c:      	ldr	x8, [x19]
   f4c10:      	ldur	x1, [x29, #-0x60]
   f4c14:      	sub	x3, x29, #0x50
   f4c18:      	mov	x0, x19
   f4c1c:      	ldr	x8, [x8, #0x3a0]
   f4c20:      	blr	x8
   f4c24:      	ldr	x8, [x19]
   f4c28:      	mov	x24, x0
   f4c2c:      	mov	x0, x19
   f4c30:      	ldr	x8, [x8, #0x720]
   f4c34:      	blr	x8
   f4c38:      	and	w8, w0, #0xff
   f4c3c:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4c40:      	ldr	x8, [x19]
   f4c44:      	mov	x0, x19
   f4c48:      	mov	x1, x23
   f4c4c:      	ldr	x8, [x8, #0xb8]
   f4c50:      	blr	x8
   f4c54:      	ldr	x2, [sp, #0x50]
   f4c58:      	cbnz	x2, 0xf4c90 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x240>
   f4c5c:      	adrp	x4, 0x1bf000
   f4c60:      	adrp	x5, 0x1bf000
   f4c64:      	adrp	x6, 0x1bf000
   f4c68:      	add	x4, x4, #0x9c0
   f4c6c:      	add	x5, x5, #0x9d4
   f4c70:      	add	x6, x6, #0x9e0
   f4c74:      	add	x1, sp, #0x68
   f4c78:      	add	x2, sp, #0x50
   f4c7c:      	orr	w3, wzr, #0x1
   f4c80:      	mov	x0, x19
   f4c84:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   f4c88:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4c8c:      	ldr	x2, [sp, #0x50]
   f4c90:      	ldr	x8, [x19]
   f4c94:      	ldr	x1, [sp, #0x68]
   f4c98:      	mov	x0, x19
   f4c9c:      	ldr	x8, [x8, #0x488]
   f4ca0:      	blr	x8
   f4ca4:      	ldr	x8, [x19]
   f4ca8:      	mov	x23, x0
   f4cac:      	mov	x0, x19
   f4cb0:      	ldr	x8, [x8, #0x720]
   f4cb4:      	blr	x8
   f4cb8:      	and	w8, w0, #0xff
   f4cbc:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4cc0:      	cbz	x24, 0xf50cc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x67c>
   f4cc4:      	ldr	x2, [sp, #0x30]
   f4cc8:      	cbnz	x2, 0xf4d00 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x2b0>
   f4ccc:      	adrp	x4, 0x1bf000
   f4cd0:      	adrp	x5, 0x1bf000
   f4cd4:      	adrp	x6, 0x1bf000
   f4cd8:      	add	x4, x4, #0x980
   f4cdc:      	add	x5, x5, #0x9f8
   f4ce0:      	add	x6, x6, #0xa00
   f4ce4:      	sub	x1, x29, #0x60
   f4ce8:      	add	x2, sp, #0x30
   f4cec:      	mov	x0, x19
   f4cf0:      	mov	w3, wzr
   f4cf4:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4cf8:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4cfc:      	ldr	x2, [sp, #0x30]
   f4d00:      	stur	x23, [x29, #-0x50]
   f4d04:      	ldr	x8, [x19]
   f4d08:      	sub	x3, x29, #0x50
   f4d0c:      	mov	x0, x19
   f4d10:      	mov	x1, x24
   f4d14:      	ldr	x8, [x8, #0x120]
   f4d18:      	blr	x8
   f4d1c:      	ldr	x8, [x19]
   f4d20:      	mov	x23, x0
   f4d24:      	mov	x0, x19
   f4d28:      	ldr	x8, [x8, #0x720]
   f4d2c:      	blr	x8
   f4d30:      	and	w8, w0, #0xff
   f4d34:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4d38:      	ldr	x8, [x19]
   f4d3c:      	mov	x0, x19
   f4d40:      	mov	x1, x24
   f4d44:      	ldr	x8, [x8, #0xb8]
   f4d48:      	blr	x8
   f4d4c:      	cbz	x23, 0xf50cc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x67c>
   f4d50:      	ldr	x2, [sp, #0x28]
   f4d54:      	cbnz	x2, 0xf4d8c <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x33c>
   f4d58:      	adrp	x4, 0x1bf000
   f4d5c:      	adrp	x5, 0x1bf000
   f4d60:      	adrp	x6, 0x1bf000
   f4d64:      	add	x4, x4, #0x980
   f4d68:      	add	x5, x5, #0xa2c
   f4d6c:      	add	x6, x6, #0xa40
   f4d70:      	sub	x1, x29, #0x60
   f4d74:      	add	x2, sp, #0x28
   f4d78:      	mov	x0, x19
   f4d7c:      	mov	w3, wzr
   f4d80:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4d84:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4d88:      	ldr	x2, [sp, #0x28]
   f4d8c:      	sxtw	x8, w22
   f4d90:      	stur	x8, [x29, #-0x50]
   f4d94:      	ldr	x8, [x19]
   f4d98:      	sub	x3, x29, #0x50
   f4d9c:      	mov	x0, x19
   f4da0:      	mov	x1, x23
   f4da4:      	ldr	x8, [x8, #0x120]
   f4da8:      	blr	x8
   f4dac:      	ldr	x8, [x19]
   f4db0:      	mov	x24, x0
   f4db4:      	mov	x0, x19
   f4db8:      	ldr	x8, [x8, #0x720]
   f4dbc:      	blr	x8
   f4dc0:      	and	w8, w0, #0xff
   f4dc4:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4dc8:      	cbz	x24, 0xf4de0 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x390>
   f4dcc:      	ldr	x8, [x19]
   f4dd0:      	mov	x0, x19
   f4dd4:      	mov	x1, x24
   f4dd8:      	ldr	x8, [x8, #0xb8]
   f4ddc:      	blr	x8
   f4de0:      	ldr	x2, [sp, #0x20]
   f4de4:      	cbnz	x2, 0xf4e1c <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x3cc>
   f4de8:      	adrp	x4, 0x1bf000
   f4dec:      	adrp	x5, 0x1bf000
   f4df0:      	adrp	x6, 0x1bf000
   f4df4:      	add	x4, x4, #0x980
   f4df8:      	add	x5, x5, #0xa5c
   f4dfc:      	add	x6, x6, #0xa60
   f4e00:      	sub	x1, x29, #0x60
   f4e04:      	add	x2, sp, #0x20
   f4e08:      	mov	x0, x19
   f4e0c:      	mov	w3, wzr
   f4e10:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4e14:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4e18:      	ldr	x2, [sp, #0x20]
   f4e1c:      	stur	x21, [x29, #-0x50]
   f4e20:      	stur	wzr, [x29, #-0x48]
   f4e24:      	stur	w22, [x29, #-0x40]
   f4e28:      	ldr	x8, [x19]
   f4e2c:      	sub	x3, x29, #0x50
   f4e30:      	mov	x0, x19
   f4e34:      	mov	x1, x23
   f4e38:      	ldr	x8, [x8, #0x120]
   f4e3c:      	blr	x8
   f4e40:      	ldr	x8, [x19]
   f4e44:      	mov	x22, x0
   f4e48:      	mov	x0, x19
   f4e4c:      	ldr	x8, [x8, #0x720]
   f4e50:      	blr	x8
   f4e54:      	and	w8, w0, #0xff
   f4e58:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4e5c:      	cbz	x22, 0xf4e74 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x424>
   f4e60:      	ldr	x8, [x19]
   f4e64:      	mov	x0, x19
   f4e68:      	mov	x1, x22
   f4e6c:      	ldr	x8, [x8, #0xb8]
   f4e70:      	blr	x8
   f4e74:      	cbz	x20, 0xf50cc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x67c>
   f4e78:      	ldr	x2, [sp, #0x48]
   f4e7c:      	cbnz	x2, 0xf4eb4 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x464>
   f4e80:      	adrp	x4, 0x1bf000
   f4e84:      	adrp	x5, 0x1bf000
   f4e88:      	adrp	x6, 0x1bf000
   f4e8c:      	add	x4, x4, #0xa80
   f4e90:      	add	x5, x5, #0xaa8
   f4e94:      	add	x6, x6, #0xab0
   f4e98:      	add	x1, sp, #0x60
   f4e9c:      	add	x2, sp, #0x48
   f4ea0:      	mov	x0, x19
   f4ea4:      	mov	w3, wzr
   f4ea8:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   f4eac:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4eb0:      	ldr	x2, [sp, #0x48]
   f4eb4:      	ldr	x8, [x19]
   f4eb8:      	mov	x0, x19
   f4ebc:      	mov	x1, x20
   f4ec0:      	ldr	x8, [x8, #0x2f8]
   f4ec4:      	blr	x8
   f4ec8:      	ldr	x8, [x19]
   f4ecc:      	mov	x22, x0
   f4ed0:      	mov	x0, x19
   f4ed4:      	ldr	x8, [x8, #0x720]
   f4ed8:      	blr	x8
   f4edc:      	and	w8, w0, #0xff
   f4ee0:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4ee4:      	cbz	x21, 0xf4efc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x4ac>
   f4ee8:      	ldr	x8, [x19]
   f4eec:      	mov	x0, x19
   f4ef0:      	mov	x1, x21
   f4ef4:      	ldr	x8, [x8, #0xb8]
   f4ef8:      	blr	x8
   f4efc:      	ldr	x2, [sp, #0x18]
   f4f00:      	cbnz	x2, 0xf4f38 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x4e8>
   f4f04:      	adrp	x4, 0x1bf000
   f4f08:      	adrp	x5, 0x1bf000
   f4f0c:      	adrp	x6, 0x1bf000
   f4f10:      	add	x4, x4, #0x980
   f4f14:      	add	x5, x5, #0xac8
   f4f18:      	add	x6, x6, #0xad0
   f4f1c:      	sub	x1, x29, #0x60
   f4f20:      	add	x2, sp, #0x18
   f4f24:      	mov	x0, x19
   f4f28:      	mov	w3, wzr
   f4f2c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4f30:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4f34:      	ldr	x2, [sp, #0x18]
   f4f38:      	ldr	x8, [x19]
   f4f3c:      	sub	x3, x29, #0x50
   f4f40:      	mov	x0, x19
   f4f44:      	mov	x1, x23
   f4f48:      	ldr	x8, [x8, #0x120]
   f4f4c:      	blr	x8
   f4f50:      	ldr	x8, [x19]
   f4f54:      	mov	x21, x0
   f4f58:      	mov	x0, x19
   f4f5c:      	ldr	x8, [x8, #0x720]
   f4f60:      	blr	x8
   f4f64:      	and	w8, w0, #0xff
   f4f68:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4f6c:      	cbz	x22, 0xf50cc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x67c>
   f4f70:      	ldr	x2, [sp, #0x10]
   f4f74:      	cbnz	x2, 0xf4fac <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x55c>
   f4f78:      	adrp	x4, 0x1bf000
   f4f7c:      	adrp	x5, 0x1bf000
   f4f80:      	adrp	x6, 0x1bf000
   f4f84:      	add	x4, x4, #0xae0
   f4f88:      	add	x5, x5, #0xaf8
   f4f8c:      	add	x6, x6, #0xb00
   f4f90:      	add	x1, sp, #0x58
   f4f94:      	add	x2, sp, #0x10
   f4f98:      	mov	x0, x19
   f4f9c:      	mov	w3, wzr
   f4fa0:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f4fa4:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4fa8:      	ldr	x2, [sp, #0x10]
   f4fac:      	stur	x21, [x29, #-0x50]
   f4fb0:      	ldr	x8, [x19]
   f4fb4:      	sub	x3, x29, #0x50
   f4fb8:      	mov	x0, x19
   f4fbc:      	mov	x1, x22
   f4fc0:      	ldr	x8, [x8, #0x1f8]
   f4fc4:      	blr	x8
   f4fc8:      	ldr	x8, [x19]
   f4fcc:      	mov	x0, x19
   f4fd0:      	ldr	x8, [x8, #0x720]
   f4fd4:      	blr	x8
   f4fd8:      	and	w8, w0, #0xff
   f4fdc:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f4fe0:      	ldr	x2, [sp, #0x48]
   f4fe4:      	cbnz	x2, 0xf501c <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x5cc>
   f4fe8:      	adrp	x4, 0x1bf000
   f4fec:      	adrp	x5, 0x1bf000
   f4ff0:      	adrp	x6, 0x1bf000
   f4ff4:      	add	x4, x4, #0xa80
   f4ff8:      	add	x5, x5, #0xaa8
   f4ffc:      	add	x6, x6, #0xab0
   f5000:      	add	x1, sp, #0x60
   f5004:      	add	x2, sp, #0x48
   f5008:      	mov	x0, x19
   f500c:      	mov	w3, wzr
   f5010:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   f5014:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f5018:      	ldr	x2, [sp, #0x48]
   f501c:      	ldr	x8, [x19]
   f5020:      	mov	x0, x19
   f5024:      	mov	x1, x20
   f5028:      	ldr	x8, [x8, #0x2f8]
   f502c:      	blr	x8
   f5030:      	ldr	x8, [x19]
   f5034:      	mov	x20, x0
   f5038:      	mov	x0, x19
   f503c:      	ldr	x8, [x8, #0x720]
   f5040:      	blr	x8
   f5044:      	and	w8, w0, #0xff
   f5048:      	cbnz	w8, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f504c:      	ldr	x8, [x19]
   f5050:      	mov	x0, x19
   f5054:      	mov	x1, x22
   f5058:      	ldr	x8, [x8, #0xb8]
   f505c:      	blr	x8
   f5060:      	cbz	x20, 0xf50cc <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x67c>
   f5064:      	ldr	x2, [sp, #0x8]
   f5068:      	cbnz	x2, 0xf50a0 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0x650>
   f506c:      	adrp	x4, 0x1bf000
   f5070:      	adrp	x5, 0x1bf000
   f5074:      	adrp	x6, 0x1bf000
   f5078:      	add	x4, x4, #0xae0
   f507c:      	add	x5, x5, #0xb08
   f5080:      	add	x6, x6, #0xb10
   f5084:      	add	x1, sp, #0x58
   f5088:      	add	x2, sp, #0x8
   f508c:      	mov	x0, x19
   f5090:      	mov	w3, wzr
   f5094:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   f5098:      	tbnz	w0, #0x0, 0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f509c:      	ldr	x2, [sp, #0x8]
   f50a0:      	ldr	x8, [x19]
   f50a4:      	sub	x3, x29, #0x50
   f50a8:      	mov	x0, x19
   f50ac:      	mov	x1, x20
   f50b0:      	ldr	x8, [x8, #0x1f8]
   f50b4:      	blr	x8
   f50b8:      	ldr	x8, [x19]
   f50bc:      	mov	x0, x19
   f50c0:      	ldr	x8, [x8, #0x720]
   f50c4:      	blr	x8
   f50c8:      	b	0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f50cc:      	adrp	x1, 0x1bf000
   f50d0:      	adrp	x2, 0x1bf000
   f50d4:      	add	x1, x1, #0x930
   f50d8:      	add	x2, x2, #0x950
   f50dc:      	mov	x0, x19
   f50e0:      	bl	0xe160 <_Z19d2c_throw_exceptionP7_JNIEnvPKcS2_@plt>
   f50e4:      	b	0xf4b10 <Java_com_didjdk_adbhelper_FastbootActivity_E___3BI+0xc0>
   f50e8:      	bl	0xde90 <__stack_chk_fail@plt>

/mnt/data/round6/甲壳虫ADB助手_1.3.1_深度检查/app/src/main/lib/arm64-v8a/libadbhelper.so:	file format elf64-littleaarch64

Disassembly of section .text:

000000000005fb90 <Java_c_c_a_t3_c__>:
   5fb90:      	sub	sp, sp, #0xa0
   5fb94:      	stp	x22, x21, [sp, #0x70]
   5fb98:      	stp	x20, x19, [sp, #0x80]
   5fb9c:      	stp	x29, x30, [sp, #0x90]
   5fba0:      	add	x29, sp, #0x90
   5fba4:      	mrs	x8, TPIDR_EL0
   5fba8:      	ldr	x8, [x8, #0x28]
   5fbac:      	mov	x19, x0
   5fbb0:      	stur	x8, [x29, #-0x28]
   5fbb4:      	stp	xzr, xzr, [x29, #-0x40]
   5fbb8:      	stp	xzr, xzr, [sp, #0x40]
   5fbbc:      	stp	xzr, xzr, [sp, #0x30]
   5fbc0:      	stp	xzr, xzr, [sp, #0x20]
   5fbc4:      	stp	xzr, xzr, [sp, #0x10]
   5fbc8:      	stp	xzr, xzr, [sp]
   5fbcc:      	ldr	x8, [x19]
   5fbd0:      	ldr	x8, [x8, #0xc8]
   5fbd4:      	blr	x8
   5fbd8:      	mov	x20, x0
   5fbdc:      	cbz	x20, 0x5ffb0 <Java_c_c_a_t3_c__+0x420>
   5fbe0:      	adrp	x4, 0x1b5000
   5fbe4:      	adrp	x5, 0x1b5000
   5fbe8:      	adrp	x6, 0x1b5000
   5fbec:      	add	x4, x4, #0xd18
   5fbf0:      	add	x5, x5, #0xd24
   5fbf4:      	add	x6, x6, #0xd28
   5fbf8:      	sub	x1, x29, #0x38
   5fbfc:      	add	x2, sp, #0x38
   5fc00:      	mov	x0, x19
   5fc04:      	mov	w3, wzr
   5fc08:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5fc0c:      	tbnz	w0, #0x0, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fc10:      	ldr	x8, [x19]
   5fc14:      	ldr	x2, [sp, #0x38]
   5fc18:      	orr	w3, wzr, #0x1
   5fc1c:      	mov	x0, x19
   5fc20:      	ldr	x8, [x8, #0x348]
   5fc24:      	mov	x1, x20
   5fc28:      	blr	x8
   5fc2c:      	ldr	x8, [x19]
   5fc30:      	mov	x0, x19
   5fc34:      	ldr	x8, [x8, #0x720]
   5fc38:      	blr	x8
   5fc3c:      	and	w8, w0, #0xff
   5fc40:      	cbnz	w8, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fc44:      	ldr	x2, [sp, #0x30]
   5fc48:      	cbnz	x2, 0x5fc80 <Java_c_c_a_t3_c__+0xf0>
   5fc4c:      	adrp	x4, 0x1b5000
   5fc50:      	adrp	x5, 0x1b5000
   5fc54:      	adrp	x6, 0x1b5000
   5fc58:      	add	x4, x4, #0xd18
   5fc5c:      	add	x5, x5, #0xd2c
   5fc60:      	add	x6, x6, #0xd30
   5fc64:      	sub	x1, x29, #0x38
   5fc68:      	add	x2, sp, #0x30
   5fc6c:      	mov	x0, x19
   5fc70:      	mov	w3, wzr
   5fc74:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5fc78:      	tbnz	w0, #0x0, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fc7c:      	ldr	x2, [sp, #0x30]
   5fc80:      	ldr	x8, [x19]
   5fc84:      	mov	x0, x19
   5fc88:      	mov	x1, x20
   5fc8c:      	ldr	x8, [x8, #0x2f8]
   5fc90:      	blr	x8
   5fc94:      	ldr	x8, [x19]
   5fc98:      	mov	x21, x0
   5fc9c:      	mov	x0, x19
   5fca0:      	ldr	x8, [x8, #0x720]
   5fca4:      	blr	x8
   5fca8:      	and	w8, w0, #0xff
   5fcac:      	cbnz	w8, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fcb0:      	ldr	x2, [sp, #0x28]
   5fcb4:      	cbnz	x2, 0x5fcec <Java_c_c_a_t3_c__+0x15c>
   5fcb8:      	adrp	x4, 0x1b5000
   5fcbc:      	adrp	x5, 0x1b5000
   5fcc0:      	adrp	x6, 0x1b5000
   5fcc4:      	add	x4, x4, #0xd18
   5fcc8:      	add	x5, x5, #0xd5c
   5fccc:      	add	x6, x6, #0xd60
   5fcd0:      	sub	x1, x29, #0x38
   5fcd4:      	add	x2, sp, #0x28
   5fcd8:      	mov	x0, x19
   5fcdc:      	mov	w3, wzr
   5fce0:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5fce4:      	tbnz	w0, #0x0, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fce8:      	ldr	x2, [sp, #0x28]
   5fcec:      	ldr	x8, [x19]
   5fcf0:      	mov	x0, x19
   5fcf4:      	mov	x1, x20
   5fcf8:      	ldr	x8, [x8, #0x2f8]
   5fcfc:      	blr	x8
   5fd00:      	ldr	x8, [x19]
   5fd04:      	mov	x22, x0
   5fd08:      	mov	x0, x19
   5fd0c:      	ldr	x8, [x8, #0x720]
   5fd10:      	blr	x8
   5fd14:      	and	w8, w0, #0xff
   5fd18:      	cbnz	w8, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fd1c:      	cbz	x21, 0x5ffb0 <Java_c_c_a_t3_c__+0x420>
   5fd20:      	ldr	x2, [sp, #0x18]
   5fd24:      	cbnz	x2, 0x5fd5c <Java_c_c_a_t3_c__+0x1cc>
   5fd28:      	adrp	x4, 0x1b5000
   5fd2c:      	adrp	x5, 0x1b5000
   5fd30:      	adrp	x6, 0x1b5000
   5fd34:      	add	x4, x4, #0xd90
   5fd38:      	add	x5, x5, #0xdc0
   5fd3c:      	add	x6, x6, #0xde0
   5fd40:      	sub	x1, x29, #0x40
   5fd44:      	add	x2, sp, #0x18
   5fd48:      	mov	x0, x19
   5fd4c:      	mov	w3, wzr
   5fd50:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5fd54:      	tbnz	w0, #0x0, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fd58:      	ldr	x2, [sp, #0x18]
   5fd5c:      	stur	x22, [x29, #-0x30]
   5fd60:      	ldr	x8, [x19]
   5fd64:      	sub	x3, x29, #0x30
   5fd68:      	mov	x0, x19
   5fd6c:      	mov	x1, x21
   5fd70:      	ldr	x8, [x8, #0x138]
   5fd74:      	blr	x8
   5fd78:      	ldr	x8, [x19]
   5fd7c:      	mov	x0, x19
   5fd80:      	ldr	x8, [x8, #0x720]
   5fd84:      	blr	x8
   5fd88:      	and	w8, w0, #0xff
   5fd8c:      	cbnz	w8, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fd90:      	ldr	x2, [sp, #0x30]
   5fd94:      	cbnz	x2, 0x5fdcc <Java_c_c_a_t3_c__+0x23c>
   5fd98:      	adrp	x4, 0x1b5000
   5fd9c:      	adrp	x5, 0x1b5000
   5fda0:      	adrp	x6, 0x1b5000
   5fda4:      	add	x4, x4, #0xd18
   5fda8:      	add	x5, x5, #0xd2c
   5fdac:      	add	x6, x6, #0xd30
   5fdb0:      	sub	x1, x29, #0x38
   5fdb4:      	add	x2, sp, #0x30
   5fdb8:      	mov	x0, x19
   5fdbc:      	mov	w3, wzr
   5fdc0:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5fdc4:      	tbnz	w0, #0x0, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fdc8:      	ldr	x2, [sp, #0x30]
   5fdcc:      	ldr	x8, [x19]
   5fdd0:      	mov	x0, x19
   5fdd4:      	mov	x1, x20
   5fdd8:      	ldr	x8, [x8, #0x2f8]
   5fddc:      	blr	x8
   5fde0:      	ldr	x8, [x19]
   5fde4:      	mov	x22, x0
   5fde8:      	mov	x0, x19
   5fdec:      	ldr	x8, [x8, #0x720]
   5fdf0:      	blr	x8
   5fdf4:      	and	w8, w0, #0xff
   5fdf8:      	cbnz	w8, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fdfc:      	ldr	x8, [x19]
   5fe00:      	mov	x0, x19
   5fe04:      	mov	x1, x21
   5fe08:      	ldr	x8, [x8, #0xb8]
   5fe0c:      	blr	x8
   5fe10:      	cbz	x22, 0x5ffb0 <Java_c_c_a_t3_c__+0x420>
   5fe14:      	ldr	x2, [sp, #0x10]
   5fe18:      	cbnz	x2, 0x5fe50 <Java_c_c_a_t3_c__+0x2c0>
   5fe1c:      	adrp	x4, 0x1b5000
   5fe20:      	adrp	x5, 0x1b5000
   5fe24:      	adrp	x6, 0x1b5000
   5fe28:      	add	x4, x4, #0xd90
   5fe2c:      	add	x5, x5, #0xe08
   5fe30:      	add	x6, x6, #0xe10
   5fe34:      	sub	x1, x29, #0x40
   5fe38:      	add	x2, sp, #0x10
   5fe3c:      	mov	x0, x19
   5fe40:      	mov	w3, wzr
   5fe44:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5fe48:      	tbnz	w0, #0x0, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fe4c:      	ldr	x2, [sp, #0x10]
   5fe50:      	ldr	x8, [x19]
   5fe54:      	sub	x3, x29, #0x30
   5fe58:      	mov	x0, x19
   5fe5c:      	mov	x1, x22
   5fe60:      	ldr	x8, [x8, #0x1f8]
   5fe64:      	blr	x8
   5fe68:      	ldr	x8, [x19]
   5fe6c:      	mov	x0, x19
   5fe70:      	ldr	x8, [x8, #0x720]
   5fe74:      	blr	x8
   5fe78:      	and	w8, w0, #0xff
   5fe7c:      	cbnz	w8, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5fe80:      	ldr	x2, [sp, #0x20]
   5fe84:      	cbnz	x2, 0x5febc <Java_c_c_a_t3_c__+0x32c>
   5fe88:      	adrp	x4, 0x1b5000
   5fe8c:      	adrp	x5, 0x1b5000
   5fe90:      	adrp	x6, 0x1b5000
   5fe94:      	add	x4, x4, #0xd18
   5fe98:      	add	x5, x5, #0xe14
   5fe9c:      	add	x6, x6, #0xe20
   5fea0:      	sub	x1, x29, #0x38
   5fea4:      	add	x2, sp, #0x20
   5fea8:      	mov	x0, x19
   5feac:      	mov	w3, wzr
   5feb0:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5feb4:      	tbnz	w0, #0x0, 0x5feec <Java_c_c_a_t3_c__+0x35c>
   5feb8:      	ldr	x2, [sp, #0x20]
   5febc:      	ldr	x8, [x19]
   5fec0:      	mov	x0, x19
   5fec4:      	mov	x1, x20
   5fec8:      	ldr	x8, [x8, #0x2f8]
   5fecc:      	blr	x8
   5fed0:      	ldr	x8, [x19]
   5fed4:      	mov	x20, x0
   5fed8:      	mov	x0, x19
   5fedc:      	ldr	x8, [x8, #0x720]
   5fee0:      	blr	x8
   5fee4:      	and	w8, w0, #0xff
   5fee8:      	cbz	w8, 0x6001c <Java_c_c_a_t3_c__+0x48c>
   5feec:      	mov	x20, x22
   5fef0:      	ldr	x8, [x19]
   5fef4:      	mov	x0, x19
   5fef8:      	ldr	x8, [x8, #0x78]
   5fefc:      	blr	x8
   5ff00:      	ldr	x8, [x19]
   5ff04:      	mov	x21, x0
   5ff08:      	mov	x0, x19
   5ff0c:      	ldr	x8, [x8, #0x88]
   5ff10:      	blr	x8
   5ff14:      	adrp	x2, 0x1b5000
   5ff18:      	add	x2, x2, #0xe60
   5ff1c:      	mov	x0, x19
   5ff20:      	mov	x1, x21
   5ff24:      	bl	0xe0f0 <_Z18d2c_is_instance_ofP7_JNIEnvP8_jobjectPKc@plt>
   5ff28:      	tbz	w0, #0x0, 0x5fff0 <Java_c_c_a_t3_c__+0x460>
   5ff2c:      	cbz	x20, 0x5ff44 <Java_c_c_a_t3_c__+0x3b4>
   5ff30:      	ldr	x8, [x19]
   5ff34:      	mov	x0, x19
   5ff38:      	mov	x1, x20
   5ff3c:      	ldr	x8, [x8, #0xb8]
   5ff40:      	blr	x8
   5ff44:      	cbz	x21, 0x5ffb0 <Java_c_c_a_t3_c__+0x420>
   5ff48:      	ldr	x2, [sp]
   5ff4c:      	cbnz	x2, 0x5ff84 <Java_c_c_a_t3_c__+0x3f4>
   5ff50:      	adrp	x4, 0x1b5000
   5ff54:      	adrp	x5, 0x1b5000
   5ff58:      	adrp	x6, 0x1b5000
   5ff5c:      	add	x4, x4, #0xe60
   5ff60:      	add	x5, x5, #0xe80
   5ff64:      	add	x6, x6, #0xe10
   5ff68:      	add	x1, sp, #0x40
   5ff6c:      	mov	x2, sp
   5ff70:      	mov	x0, x19
   5ff74:      	mov	w3, wzr
   5ff78:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5ff7c:      	tbnz	w0, #0x0, 0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5ff80:      	ldr	x2, [sp]
   5ff84:      	ldr	x8, [x19]
   5ff88:      	sub	x3, x29, #0x30
   5ff8c:      	mov	x0, x19
   5ff90:      	mov	x1, x21
   5ff94:      	ldr	x8, [x8, #0x1f8]
   5ff98:      	blr	x8
   5ff9c:      	ldr	x8, [x19]
   5ffa0:      	mov	x0, x19
   5ffa4:      	ldr	x8, [x8, #0x720]
   5ffa8:      	blr	x8
   5ffac:      	b	0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   5ffb0:      	adrp	x1, 0x1b5000
   5ffb4:      	adrp	x2, 0x1b5000
   5ffb8:      	add	x1, x1, #0xce0
   5ffbc:      	add	x2, x2, #0xd00
   5ffc0:      	mov	x0, x19
   5ffc4:      	bl	0xe160 <_Z19d2c_throw_exceptionP7_JNIEnvPKcS2_@plt>
   5ffc8:      	mrs	x8, TPIDR_EL0
   5ffcc:      	ldr	x8, [x8, #0x28]
   5ffd0:      	ldur	x9, [x29, #-0x28]
   5ffd4:      	cmp	x8, x9
   5ffd8:      	b.ne	0x600c0 <Java_c_c_a_t3_c__+0x530>
   5ffdc:      	ldp	x29, x30, [sp, #0x90]
   5ffe0:      	ldp	x20, x19, [sp, #0x80]
   5ffe4:      	ldp	x22, x21, [sp, #0x70]
   5ffe8:      	add	sp, sp, #0xa0
   5ffec:      	ret
   5fff0:      	ldr	x8, [x19]
   5fff4:      	mov	x0, x19
   5fff8:      	mov	x1, x21
   5fffc:      	ldr	x8, [x8, #0x68]
   60000:      	blr	x8
   60004:      	ldr	x8, [x19]
   60008:      	mov	x0, x19
   6000c:      	mov	x1, x21
   60010:      	ldr	x8, [x8, #0xb8]
   60014:      	blr	x8
   60018:      	b	0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   6001c:      	ldr	x8, [x19]
   60020:      	mov	x0, x19
   60024:      	mov	x1, x22
   60028:      	ldr	x8, [x8, #0xb8]
   6002c:      	blr	x8
   60030:      	cbz	x20, 0x600a4 <Java_c_c_a_t3_c__+0x514>
   60034:      	ldr	x2, [sp, #0x8]
   60038:      	cbnz	x2, 0x60070 <Java_c_c_a_t3_c__+0x4e0>
   6003c:      	adrp	x4, 0x1b5000
   60040:      	adrp	x5, 0x1b5000
   60044:      	adrp	x6, 0x1b5000
   60048:      	add	x4, x4, #0xe40
   6004c:      	add	x5, x5, #0xe08
   60050:      	add	x6, x6, #0xe10
   60054:      	add	x1, sp, #0x48
   60058:      	add	x2, sp, #0x8
   6005c:      	mov	x0, x19
   60060:      	mov	w3, wzr
   60064:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   60068:      	tbnz	w0, #0x0, 0x5fef0 <Java_c_c_a_t3_c__+0x360>
   6006c:      	ldr	x2, [sp, #0x8]
   60070:      	ldr	x8, [x19]
   60074:      	sub	x3, x29, #0x30
   60078:      	mov	x0, x19
   6007c:      	mov	x1, x20
   60080:      	ldr	x8, [x8, #0x1f8]
   60084:      	blr	x8
   60088:      	ldr	x8, [x19]
   6008c:      	mov	x0, x19
   60090:      	ldr	x8, [x8, #0x720]
   60094:      	blr	x8
   60098:      	and	w8, w0, #0xff
   6009c:      	cbnz	w8, 0x5fef0 <Java_c_c_a_t3_c__+0x360>
   600a0:      	b	0x5ffc8 <Java_c_c_a_t3_c__+0x438>
   600a4:      	adrp	x1, 0x1b5000
   600a8:      	adrp	x2, 0x1b5000
   600ac:      	add	x1, x1, #0xce0
   600b0:      	add	x2, x2, #0xd00
   600b4:      	mov	x0, x19
   600b8:      	bl	0xe160 <_Z19d2c_throw_exceptionP7_JNIEnvPKcS2_@plt>
   600bc:      	b	0x5fef0 <Java_c_c_a_t3_c__+0x360>
   600c0:      	bl	0xde90 <__stack_chk_fail@plt>
