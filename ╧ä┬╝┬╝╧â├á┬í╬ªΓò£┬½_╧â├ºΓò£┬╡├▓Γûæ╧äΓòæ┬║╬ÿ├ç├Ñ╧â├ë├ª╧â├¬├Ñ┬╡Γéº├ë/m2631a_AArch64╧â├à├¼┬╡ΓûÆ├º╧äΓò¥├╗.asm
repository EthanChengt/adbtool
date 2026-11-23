
/mnt/data/round6/甲壳虫ADB助手_1.3.1_深度检查/app/src/main/lib/arm64-v8a/libadbhelper.so:	file format elf64-littleaarch64

Disassembly of section .text:

0000000000059680 <Java_c_c_a_t3_a__Lc_c_a_t3_2>:
   59680:      	sub	sp, sp, #0x190
   59684:      	str	x28, [sp, #0x130]
   59688:      	stp	x26, x25, [sp, #0x140]
   5968c:      	stp	x24, x23, [sp, #0x150]
   59690:      	stp	x22, x21, [sp, #0x160]
   59694:      	stp	x20, x19, [sp, #0x170]
   59698:      	stp	x29, x30, [sp, #0x180]
   5969c:      	add	x29, sp, #0x180
   596a0:      	mrs	x8, TPIDR_EL0
   596a4:      	ldr	x8, [x8, #0x28]
   596a8:      	mov	x19, x0
   596ac:      	mov	x1, x2
   596b0:      	stur	x8, [x29, #-0x58]
   596b4:      	stp	xzr, xzr, [x29, #-0x80]
   596b8:      	stp	xzr, xzr, [x29, #-0x90]
   596bc:      	stp	xzr, xzr, [x29, #-0xa0]
   596c0:      	stp	xzr, xzr, [x29, #-0xb0]
   596c4:      	stur	xzr, [x29, #-0xb8]
   596c8:      	stp	xzr, xzr, [sp, #0xb8]
   596cc:      	stp	xzr, xzr, [sp, #0xa8]
   596d0:      	stp	xzr, xzr, [sp, #0x98]
   596d4:      	stp	xzr, xzr, [sp, #0x88]
   596d8:      	stp	xzr, xzr, [sp, #0x78]
   596dc:      	stp	xzr, xzr, [sp, #0x68]
   596e0:      	stp	xzr, xzr, [sp, #0x58]
   596e4:      	stp	xzr, xzr, [sp, #0x48]
   596e8:      	stp	xzr, xzr, [sp, #0x38]
   596ec:      	stp	xzr, xzr, [sp, #0x28]
   596f0:      	stp	xzr, xzr, [sp, #0x18]
   596f4:      	stp	xzr, xzr, [sp, #0x8]
   596f8:      	str	xzr, [sp]
   596fc:      	ldr	x8, [x19]
   59700:      	ldr	x8, [x8, #0xc8]
   59704:      	blr	x8
   59708:      	ldr	x8, [x19]
   5970c:      	mov	x20, x0
   59710:      	orr	w1, wzr, #0x18
   59714:      	mov	x0, x19
   59718:      	ldr	x8, [x8, #0x580]
   5971c:      	blr	x8
   59720:      	ldr	x8, [x19]
   59724:      	mov	x23, x0
   59728:      	mov	x0, x19
   5972c:      	ldr	x8, [x8, #0x720]
   59730:      	blr	x8
   59734:      	and	w8, w0, #0xff
   59738:      	cbz	w8, 0x59770 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xf0>
   5973c:      	mrs	x8, TPIDR_EL0
   59740:      	ldr	x8, [x8, #0x28]
   59744:      	ldur	x9, [x29, #-0x58]
   59748:      	cmp	x8, x9
   5974c:      	b.ne	0x5a318 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xc98>
   59750:      	ldp	x29, x30, [sp, #0x180]
   59754:      	ldp	x20, x19, [sp, #0x170]
   59758:      	ldp	x22, x21, [sp, #0x160]
   5975c:      	ldp	x24, x23, [sp, #0x150]
   59760:      	ldp	x26, x25, [sp, #0x140]
   59764:      	ldr	x28, [sp, #0x130]
   59768:      	add	sp, sp, #0x190
   5976c:      	ret
   59770:      	cbz	x20, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   59774:      	adrp	x4, 0x1b5000
   59778:      	adrp	x5, 0x1b5000
   5977c:      	adrp	x6, 0x1b5000
   59780:      	add	x4, x4, #0x788
   59784:      	add	x5, x5, #0x794
   59788:      	add	x6, x6, #0x798
   5978c:      	sub	x1, x29, #0x78
   59790:      	add	x2, sp, #0x98
   59794:      	mov	x0, x19
   59798:      	mov	w3, wzr
   5979c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   597a0:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   597a4:      	stur	x23, [x29, #-0x70]
   597a8:      	ldr	x8, [x19]
   597ac:      	ldr	x2, [sp, #0x98]
   597b0:      	sub	x3, x29, #0x70
   597b4:      	mov	x0, x19
   597b8:      	ldr	x8, [x8, #0x1f8]
   597bc:      	mov	x1, x20
   597c0:      	blr	x8
   597c4:      	ldr	x8, [x19]
   597c8:      	mov	x0, x19
   597cc:      	ldr	x8, [x8, #0x720]
   597d0:      	blr	x8
   597d4:      	and	w8, w0, #0xff
   597d8:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   597dc:      	ldr	x2, [sp, #0x90]
   597e0:      	cbnz	x2, 0x59818 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x198>
   597e4:      	adrp	x4, 0x1b5000
   597e8:      	adrp	x5, 0x1b5000
   597ec:      	adrp	x6, 0x1b5000
   597f0:      	add	x4, x4, #0x7a0
   597f4:      	add	x5, x5, #0x7b4
   597f8:      	add	x6, x6, #0x7c0
   597fc:      	sub	x1, x29, #0x80
   59800:      	add	x2, sp, #0x90
   59804:      	orr	w3, wzr, #0x1
   59808:      	mov	x0, x19
   5980c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59810:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59814:      	ldr	x2, [sp, #0x90]
   59818:      	orr	w8, wzr, #0x18
   5981c:      	stur	w8, [x29, #-0x70]
   59820:      	ldr	x8, [x19]
   59824:      	ldur	x1, [x29, #-0x80]
   59828:      	sub	x3, x29, #0x70
   5982c:      	mov	x0, x19
   59830:      	ldr	x8, [x8, #0x3a0]
   59834:      	blr	x8
   59838:      	ldr	x8, [x19]
   5983c:      	mov	x24, x0
   59840:      	mov	x0, x19
   59844:      	ldr	x8, [x8, #0x720]
   59848:      	blr	x8
   5984c:      	and	w8, w0, #0xff
   59850:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59854:      	ldur	x2, [x29, #-0xb8]
   59858:      	cbnz	x2, 0x59890 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x210>
   5985c:      	adrp	x4, 0x1b5000
   59860:      	adrp	x5, 0x1b5000
   59864:      	adrp	x6, 0x1b5000
   59868:      	add	x4, x4, #0x7e0
   5986c:      	add	x5, x5, #0x7f4
   59870:      	add	x6, x6, #0x810
   59874:      	sub	x1, x29, #0x88
   59878:      	sub	x2, x29, #0xb8
   5987c:      	orr	w3, wzr, #0x1
   59880:      	mov	x0, x19
   59884:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   59888:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5988c:      	ldur	x2, [x29, #-0xb8]
   59890:      	ldr	x8, [x19]
   59894:      	ldur	x1, [x29, #-0x88]
   59898:      	mov	x0, x19
   5989c:      	ldr	x8, [x8, #0x488]
   598a0:      	blr	x8
   598a4:      	ldr	x8, [x19]
   598a8:      	mov	x21, x0
   598ac:      	mov	x0, x19
   598b0:      	ldr	x8, [x8, #0x720]
   598b4:      	blr	x8
   598b8:      	and	w8, w0, #0xff
   598bc:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   598c0:      	cbz	x24, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   598c4:      	ldr	x2, [sp, #0x88]
   598c8:      	cbnz	x2, 0x59900 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x280>
   598cc:      	adrp	x4, 0x1b5000
   598d0:      	adrp	x5, 0x1b5000
   598d4:      	adrp	x6, 0x1b5000
   598d8:      	add	x4, x4, #0x7a0
   598dc:      	add	x5, x5, #0x828
   598e0:      	add	x6, x6, #0x830
   598e4:      	sub	x1, x29, #0x80
   598e8:      	add	x2, sp, #0x88
   598ec:      	mov	x0, x19
   598f0:      	mov	w3, wzr
   598f4:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   598f8:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   598fc:      	ldr	x2, [sp, #0x88]
   59900:      	stur	x21, [x29, #-0x70]
   59904:      	ldr	x8, [x19]
   59908:      	sub	x3, x29, #0x70
   5990c:      	mov	x0, x19
   59910:      	mov	x1, x24
   59914:      	ldr	x8, [x8, #0x120]
   59918:      	blr	x8
   5991c:      	ldr	x8, [x19]
   59920:      	mov	x22, x0
   59924:      	mov	x0, x19
   59928:      	ldr	x8, [x8, #0x720]
   5992c:      	blr	x8
   59930:      	and	w8, w0, #0xff
   59934:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59938:      	ldr	x8, [x19]
   5993c:      	mov	x0, x19
   59940:      	mov	x1, x24
   59944:      	ldr	x8, [x8, #0xb8]
   59948:      	blr	x8
   5994c:      	cbz	x22, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   59950:      	ldr	x2, [sp, #0x80]
   59954:      	cbnz	x2, 0x5998c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x30c>
   59958:      	adrp	x4, 0x1b5000
   5995c:      	adrp	x5, 0x1b5000
   59960:      	adrp	x6, 0x1b5000
   59964:      	add	x4, x4, #0x7a0
   59968:      	add	x5, x5, #0x85c
   5996c:      	add	x6, x6, #0x860
   59970:      	sub	x1, x29, #0x80
   59974:      	add	x2, sp, #0x80
   59978:      	mov	x0, x19
   5997c:      	mov	w3, wzr
   59980:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59984:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59988:      	ldr	x2, [sp, #0x80]
   5998c:      	stur	x23, [x29, #-0x70]
   59990:      	ldr	x8, [x19]
   59994:      	sub	x3, x29, #0x70
   59998:      	mov	x0, x19
   5999c:      	mov	x1, x22
   599a0:      	ldr	x8, [x8, #0x120]
   599a4:      	blr	x8
   599a8:      	ldr	x8, [x19]
   599ac:      	mov	x24, x0
   599b0:      	mov	x0, x19
   599b4:      	ldr	x8, [x8, #0x720]
   599b8:      	blr	x8
   599bc:      	and	w8, w0, #0xff
   599c0:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   599c4:      	cbz	x24, 0x599dc <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x35c>
   599c8:      	ldr	x8, [x19]
   599cc:      	mov	x0, x19
   599d0:      	mov	x1, x24
   599d4:      	ldr	x8, [x8, #0xb8]
   599d8:      	blr	x8
   599dc:      	ldr	x2, [sp, #0x78]
   599e0:      	cbnz	x2, 0x59a18 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x398>
   599e4:      	adrp	x4, 0x1b5000
   599e8:      	adrp	x5, 0x1b5000
   599ec:      	adrp	x6, 0x1b5000
   599f0:      	add	x4, x4, #0x7a0
   599f4:      	add	x5, x5, #0x87c
   599f8:      	add	x6, x6, #0x884
   599fc:      	sub	x1, x29, #0x80
   59a00:      	add	x2, sp, #0x78
   59a04:      	mov	x0, x19
   59a08:      	mov	w3, wzr
   59a0c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59a10:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59a14:      	ldr	x2, [sp, #0x78]
   59a18:      	stur	wzr, [x29, #-0x70]
   59a1c:      	ldr	x8, [x19]
   59a20:      	sub	x3, x29, #0x70
   59a24:      	mov	x0, x19
   59a28:      	mov	x1, x22
   59a2c:      	ldr	x8, [x8, #0x198]
   59a30:      	blr	x8
   59a34:      	ldr	x8, [x19]
   59a38:      	mov	w24, w0
   59a3c:      	mov	x0, x19
   59a40:      	ldr	x8, [x8, #0x720]
   59a44:      	blr	x8
   59a48:      	and	w8, w0, #0xff
   59a4c:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59a50:      	cbz	w24, 0x59c7c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x5fc>
   59a54:      	ldr	x8, [x19]
   59a58:      	adrp	x1, 0x1b5000
   59a5c:      	add	x1, x1, #0x8c8
   59a60:      	mov	x0, x19
   59a64:      	ldr	x8, [x8, #0x538]
   59a68:      	blr	x8
   59a6c:      	ldr	x2, [sp, #0x68]
   59a70:      	mov	x24, x0
   59a74:      	cbnz	x2, 0x59aac <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x42c>
   59a78:      	adrp	x4, 0x1b5000
   59a7c:      	adrp	x5, 0x1b5000
   59a80:      	adrp	x6, 0x1b5000
   59a84:      	add	x4, x4, #0x788
   59a88:      	add	x5, x5, #0x8cc
   59a8c:      	add	x6, x6, #0x8d0
   59a90:      	sub	x1, x29, #0x78
   59a94:      	add	x2, sp, #0x68
   59a98:      	mov	x0, x19
   59a9c:      	mov	w3, wzr
   59aa0:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59aa4:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59aa8:      	ldr	x2, [sp, #0x68]
   59aac:      	stp	x24, x22, [x29, #-0x70]
   59ab0:      	ldr	x8, [x19]
   59ab4:      	sub	x3, x29, #0x70
   59ab8:      	mov	x0, x19
   59abc:      	mov	x1, x20
   59ac0:      	ldr	x8, [x8, #0x1f8]
   59ac4:      	blr	x8
   59ac8:      	ldr	x8, [x19]
   59acc:      	mov	x0, x19
   59ad0:      	ldr	x8, [x8, #0x720]
   59ad4:      	blr	x8
   59ad8:      	and	w8, w0, #0xff
   59adc:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59ae0:      	ldr	x2, [sp, #0xc0]
   59ae4:      	cbnz	x2, 0x59b1c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x49c>
   59ae8:      	adrp	x4, 0x1b5000
   59aec:      	adrp	x5, 0x1b5000
   59af0:      	adrp	x6, 0x1b5000
   59af4:      	add	x4, x4, #0x788
   59af8:      	add	x5, x5, #0x8fc
   59afc:      	add	x6, x6, #0x900
   59b00:      	sub	x1, x29, #0x78
   59b04:      	add	x2, sp, #0xc0
   59b08:      	mov	x0, x19
   59b0c:      	mov	w3, wzr
   59b10:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   59b14:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59b18:      	ldr	x2, [sp, #0xc0]
   59b1c:      	ldr	x8, [x19]
   59b20:      	mov	x0, x19
   59b24:      	mov	x1, x20
   59b28:      	ldr	x8, [x8, #0x300]
   59b2c:      	blr	x8
   59b30:      	ldr	x8, [x19]
   59b34:      	mov	w24, w0
   59b38:      	mov	x0, x19
   59b3c:      	ldr	x8, [x8, #0x720]
   59b40:      	blr	x8
   59b44:      	and	w8, w0, #0xff
   59b48:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59b4c:      	and	w8, w24, #0xff
   59b50:      	cbz	w8, 0x59d20 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x6a0>
   59b54:      	ldr	x2, [sp, #0x78]
   59b58:      	cbnz	x2, 0x59b90 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x510>
   59b5c:      	adrp	x4, 0x1b5000
   59b60:      	adrp	x5, 0x1b5000
   59b64:      	adrp	x6, 0x1b5000
   59b68:      	add	x4, x4, #0x7a0
   59b6c:      	add	x5, x5, #0x87c
   59b70:      	add	x6, x6, #0x884
   59b74:      	sub	x1, x29, #0x80
   59b78:      	add	x2, sp, #0x78
   59b7c:      	mov	x0, x19
   59b80:      	mov	w3, wzr
   59b84:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59b88:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59b8c:      	ldr	x2, [sp, #0x78]
   59b90:      	stur	wzr, [x29, #-0x70]
   59b94:      	ldr	x8, [x19]
   59b98:      	sub	x3, x29, #0x70
   59b9c:      	mov	x0, x19
   59ba0:      	mov	x1, x22
   59ba4:      	ldr	x8, [x8, #0x198]
   59ba8:      	blr	x8
   59bac:      	ldr	x8, [x19]
   59bb0:      	mov	w24, w0
   59bb4:      	mov	x0, x19
   59bb8:      	ldr	x8, [x8, #0x720]
   59bbc:      	blr	x8
   59bc0:      	and	w8, w0, #0xff
   59bc4:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59bc8:      	mov	w8, #0x4e580000         // =1314390016
   59bcc:      	movk	w8, #0x4e43
   59bd0:      	cmp	w24, w8
   59bd4:      	b.ne	0x59d20 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x6a0>
   59bd8:      	ldr	x2, [sp, #0x60]
   59bdc:      	cbnz	x2, 0x59c14 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x594>
   59be0:      	adrp	x4, 0x1b5000
   59be4:      	adrp	x5, 0x1b5000
   59be8:      	adrp	x6, 0x1b5000
   59bec:      	add	x4, x4, #0x7a0
   59bf0:      	add	x5, x5, #0x904
   59bf4:      	add	x6, x6, #0x910
   59bf8:      	sub	x1, x29, #0x80
   59bfc:      	add	x2, sp, #0x60
   59c00:      	mov	x0, x19
   59c04:      	mov	w3, wzr
   59c08:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59c0c:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59c10:      	ldr	x2, [sp, #0x60]
   59c14:      	orr	w8, wzr, #0x8
   59c18:      	orr	w9, wzr, #0x4000
   59c1c:      	stur	w8, [x29, #-0x70]
   59c20:      	stur	w9, [x29, #-0x68]
   59c24:      	ldr	x8, [x19]
   59c28:      	sub	x3, x29, #0x70
   59c2c:      	mov	x0, x19
   59c30:      	mov	x1, x22
   59c34:      	ldr	x8, [x8, #0x120]
   59c38:      	blr	x8
   59c3c:      	ldr	x8, [x19]
   59c40:      	mov	x24, x0
   59c44:      	mov	x0, x19
   59c48:      	ldr	x8, [x8, #0x720]
   59c4c:      	blr	x8
   59c50:      	and	w8, w0, #0xff
   59c54:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59c58:      	cbz	x24, 0x59d20 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x6a0>
   59c5c:      	ldr	x8, [x19]
   59c60:      	mov	x0, x19
   59c64:      	mov	x1, x24
   59c68:      	ldr	x8, [x8, #0xb8]
   59c6c:      	blr	x8
   59c70:      	ldr	x2, [sp, #0x78]
   59c74:      	cbnz	x2, 0x59d5c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x6dc>
   59c78:      	b	0x59d28 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x6a8>
   59c7c:      	cbz	x21, 0x59c94 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x614>
   59c80:      	ldr	x8, [x19]
   59c84:      	mov	x0, x19
   59c88:      	mov	x1, x21
   59c8c:      	ldr	x8, [x8, #0xb8]
   59c90:      	blr	x8
   59c94:      	ldr	x8, [x19]
   59c98:      	adrp	x1, 0x1b5000
   59c9c:      	add	x1, x1, #0x890
   59ca0:      	mov	x0, x19
   59ca4:      	ldr	x8, [x8, #0x538]
   59ca8:      	blr	x8
   59cac:      	ldr	x2, [sp, #0x70]
   59cb0:      	mov	x21, x0
   59cb4:      	cbnz	x2, 0x59cec <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x66c>
   59cb8:      	adrp	x4, 0x1b5000
   59cbc:      	adrp	x5, 0x1b5000
   59cc0:      	adrp	x6, 0x1b5000
   59cc4:      	add	x4, x4, #0x788
   59cc8:      	add	x5, x5, #0x8a4
   59ccc:      	add	x6, x6, #0x8b0
   59cd0:      	sub	x1, x29, #0x78
   59cd4:      	add	x2, sp, #0x70
   59cd8:      	mov	x0, x19
   59cdc:      	mov	w3, wzr
   59ce0:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59ce4:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59ce8:      	ldr	x2, [sp, #0x70]
   59cec:      	stur	x21, [x29, #-0x70]
   59cf0:      	ldr	x8, [x19]
   59cf4:      	sub	x3, x29, #0x70
   59cf8:      	mov	x0, x19
   59cfc:      	mov	x1, x20
   59d00:      	ldr	x8, [x8, #0x1f8]
   59d04:      	blr	x8
   59d08:      	ldr	x8, [x19]
   59d0c:      	mov	x0, x19
   59d10:      	ldr	x8, [x8, #0x720]
   59d14:      	blr	x8
   59d18:      	and	w8, w0, #0xff
   59d1c:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59d20:      	ldr	x2, [sp, #0x78]
   59d24:      	cbnz	x2, 0x59d5c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x6dc>
   59d28:      	adrp	x4, 0x1b5000
   59d2c:      	adrp	x5, 0x1b5000
   59d30:      	adrp	x6, 0x1b5000
   59d34:      	add	x4, x4, #0x7a0
   59d38:      	add	x5, x5, #0x87c
   59d3c:      	add	x6, x6, #0x884
   59d40:      	sub	x1, x29, #0x80
   59d44:      	add	x2, sp, #0x78
   59d48:      	mov	x0, x19
   59d4c:      	mov	w3, wzr
   59d50:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59d54:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59d58:      	ldr	x2, [sp, #0x78]
   59d5c:      	orr	w8, wzr, #0xc
   59d60:      	stur	w8, [x29, #-0x70]
   59d64:      	ldr	x8, [x19]
   59d68:      	sub	x3, x29, #0x70
   59d6c:      	mov	x0, x19
   59d70:      	mov	x1, x22
   59d74:      	ldr	x8, [x8, #0x198]
   59d78:      	blr	x8
   59d7c:      	ldr	x8, [x19]
   59d80:      	mov	w25, w0
   59d84:      	mov	x0, x19
   59d88:      	ldr	x8, [x8, #0x720]
   59d8c:      	blr	x8
   59d90:      	and	w8, w0, #0xff
   59d94:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59d98:      	cmp	w25, #0x1
   59d9c:      	b.lt	0x5a31c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xc9c>
   59da0:      	ldr	x8, [x19]
   59da4:      	mov	x0, x19
   59da8:      	mov	w1, w25
   59dac:      	ldr	x8, [x8, #0x580]
   59db0:      	blr	x8
   59db4:      	ldr	x8, [x19]
   59db8:      	mov	x24, x0
   59dbc:      	mov	x0, x19
   59dc0:      	ldr	x8, [x8, #0x720]
   59dc4:      	blr	x8
   59dc8:      	and	w8, w0, #0xff
   59dcc:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59dd0:      	ldr	x2, [sp, #0x98]
   59dd4:      	cbnz	x2, 0x59e0c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x78c>
   59dd8:      	adrp	x4, 0x1b5000
   59ddc:      	adrp	x5, 0x1b5000
   59de0:      	adrp	x6, 0x1b5000
   59de4:      	add	x4, x4, #0x788
   59de8:      	add	x5, x5, #0x794
   59dec:      	add	x6, x6, #0x798
   59df0:      	sub	x1, x29, #0x78
   59df4:      	add	x2, sp, #0x98
   59df8:      	mov	x0, x19
   59dfc:      	mov	w3, wzr
   59e00:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59e04:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59e08:      	ldr	x2, [sp, #0x98]
   59e0c:      	stur	x24, [x29, #-0x70]
   59e10:      	ldr	x8, [x19]
   59e14:      	sub	x3, x29, #0x70
   59e18:      	mov	x0, x19
   59e1c:      	mov	x1, x20
   59e20:      	ldr	x8, [x8, #0x1f8]
   59e24:      	blr	x8
   59e28:      	ldr	x8, [x19]
   59e2c:      	mov	x0, x19
   59e30:      	ldr	x8, [x8, #0x720]
   59e34:      	blr	x8
   59e38:      	and	w8, w0, #0xff
   59e3c:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59e40:      	ldr	x2, [sp, #0x58]
   59e44:      	cbnz	x2, 0x59e7c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x7fc>
   59e48:      	adrp	x4, 0x1b5000
   59e4c:      	adrp	x5, 0x1b5000
   59e50:      	adrp	x6, 0x1b5000
   59e54:      	add	x4, x4, #0x7a0
   59e58:      	add	x5, x5, #0x92c
   59e5c:      	add	x6, x6, #0x934
   59e60:      	sub	x1, x29, #0x80
   59e64:      	add	x2, sp, #0x58
   59e68:      	mov	x0, x19
   59e6c:      	mov	w3, wzr
   59e70:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59e74:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59e78:      	ldr	x2, [sp, #0x58]
   59e7c:      	ldr	x8, [x19]
   59e80:      	sub	x3, x29, #0x70
   59e84:      	mov	x0, x19
   59e88:      	mov	x1, x22
   59e8c:      	ldr	x8, [x8, #0x120]
   59e90:      	blr	x8
   59e94:      	ldr	x8, [x19]
   59e98:      	mov	x26, x0
   59e9c:      	mov	x0, x19
   59ea0:      	ldr	x8, [x8, #0x720]
   59ea4:      	blr	x8
   59ea8:      	and	w8, w0, #0xff
   59eac:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59eb0:      	cbz	x23, 0x59ec8 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x848>
   59eb4:      	ldr	x8, [x19]
   59eb8:      	mov	x0, x19
   59ebc:      	mov	x1, x23
   59ec0:      	ldr	x8, [x8, #0xb8]
   59ec4:      	blr	x8
   59ec8:      	ldr	x2, [sp, #0x50]
   59ecc:      	cbnz	x2, 0x59f04 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x884>
   59ed0:      	adrp	x4, 0x1b5000
   59ed4:      	adrp	x5, 0x1b5000
   59ed8:      	adrp	x6, 0x1b5000
   59edc:      	add	x4, x4, #0x788
   59ee0:      	add	x5, x5, #0x93c
   59ee4:      	add	x6, x6, #0x798
   59ee8:      	sub	x1, x29, #0x78
   59eec:      	add	x2, sp, #0x50
   59ef0:      	mov	x0, x19
   59ef4:      	mov	w3, wzr
   59ef8:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59efc:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59f00:      	ldr	x2, [sp, #0x50]
   59f04:      	stur	x26, [x29, #-0x70]
   59f08:      	ldr	x8, [x19]
   59f0c:      	sub	x3, x29, #0x70
   59f10:      	mov	x0, x19
   59f14:      	mov	x1, x20
   59f18:      	ldr	x8, [x8, #0x1f8]
   59f1c:      	blr	x8
   59f20:      	ldr	x8, [x19]
   59f24:      	mov	x0, x19
   59f28:      	ldr	x8, [x8, #0x720]
   59f2c:      	blr	x8
   59f30:      	and	w8, w0, #0xff
   59f34:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59f38:      	ldr	x2, [sp, #0xb8]
   59f3c:      	cbnz	x2, 0x59f74 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x8f4>
   59f40:      	adrp	x4, 0x1b5000
   59f44:      	adrp	x5, 0x1b5000
   59f48:      	adrp	x6, 0x1b5000
   59f4c:      	add	x4, x4, #0x788
   59f50:      	add	x5, x5, #0x940
   59f54:      	add	x6, x6, #0x950
   59f58:      	sub	x1, x29, #0x78
   59f5c:      	add	x2, sp, #0xb8
   59f60:      	mov	x0, x19
   59f64:      	mov	w3, wzr
   59f68:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   59f6c:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59f70:      	ldr	x2, [sp, #0xb8]
   59f74:      	ldr	x8, [x19]
   59f78:      	mov	x0, x19
   59f7c:      	mov	x1, x20
   59f80:      	ldr	x8, [x8, #0x2f8]
   59f84:      	blr	x8
   59f88:      	ldr	x8, [x19]
   59f8c:      	mov	x23, x0
   59f90:      	mov	x0, x19
   59f94:      	ldr	x8, [x8, #0x720]
   59f98:      	blr	x8
   59f9c:      	and	w8, w0, #0xff
   59fa0:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59fa4:      	cbz	x26, 0x59fbc <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x93c>
   59fa8:      	ldr	x8, [x19]
   59fac:      	mov	x0, x19
   59fb0:      	mov	x1, x26
   59fb4:      	ldr	x8, [x8, #0xb8]
   59fb8:      	blr	x8
   59fbc:      	ldr	x2, [sp, #0x48]
   59fc0:      	cbnz	x2, 0x59ff8 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x978>
   59fc4:      	adrp	x4, 0x1b5000
   59fc8:      	adrp	x5, 0x1b5000
   59fcc:      	adrp	x6, 0x1b5000
   59fd0:      	add	x4, x4, #0x788
   59fd4:      	add	x5, x5, #0x940
   59fd8:      	add	x6, x6, #0x980
   59fdc:      	sub	x1, x29, #0x78
   59fe0:      	add	x2, sp, #0x48
   59fe4:      	mov	x0, x19
   59fe8:      	mov	w3, wzr
   59fec:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   59ff0:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   59ff4:      	ldr	x2, [sp, #0x48]
   59ff8:      	stp	x23, x24, [x29, #-0x70]
   59ffc:      	stur	w25, [x29, #-0x60]
   5a000:      	ldr	x8, [x19]
   5a004:      	sub	x3, x29, #0x70
   5a008:      	mov	x0, x19
   5a00c:      	mov	x1, x20
   5a010:      	ldr	x8, [x8, #0x1f8]
   5a014:      	blr	x8
   5a018:      	ldr	x8, [x19]
   5a01c:      	mov	x0, x19
   5a020:      	ldr	x8, [x8, #0x720]
   5a024:      	blr	x8
   5a028:      	and	w8, w0, #0xff
   5a02c:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a030:      	ldr	x2, [sp, #0xb0]
   5a034:      	cbnz	x2, 0x5a06c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x9ec>
   5a038:      	adrp	x4, 0x1b5000
   5a03c:      	adrp	x5, 0x1b5000
   5a040:      	adrp	x6, 0x1b5000
   5a044:      	add	x4, x4, #0x788
   5a048:      	add	x5, x5, #0x9ac
   5a04c:      	add	x6, x6, #0x900
   5a050:      	sub	x1, x29, #0x78
   5a054:      	add	x2, sp, #0xb0
   5a058:      	mov	x0, x19
   5a05c:      	mov	w3, wzr
   5a060:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5a064:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a068:      	ldr	x2, [sp, #0xb0]
   5a06c:      	ldr	x8, [x19]
   5a070:      	mov	x0, x19
   5a074:      	mov	x1, x20
   5a078:      	ldr	x8, [x8, #0x300]
   5a07c:      	blr	x8
   5a080:      	ldr	x8, [x19]
   5a084:      	mov	w26, w0
   5a088:      	mov	x0, x19
   5a08c:      	ldr	x8, [x8, #0x720]
   5a090:      	blr	x8
   5a094:      	and	w8, w0, #0xff
   5a098:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a09c:      	and	w8, w26, #0xff
   5a0a0:      	cbz	w8, 0x5a410 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xd90>
   5a0a4:      	ldr	x2, [sp, #0xa8]
   5a0a8:      	cbnz	x2, 0x5a0e0 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xa60>
   5a0ac:      	adrp	x4, 0x1b5000
   5a0b0:      	adrp	x5, 0x1b5000
   5a0b4:      	adrp	x6, 0x1b5000
   5a0b8:      	add	x4, x4, #0x788
   5a0bc:      	add	x5, x5, #0x9b0
   5a0c0:      	add	x6, x6, #0x9c0
   5a0c4:      	sub	x1, x29, #0x78
   5a0c8:      	add	x2, sp, #0xa8
   5a0cc:      	mov	x0, x19
   5a0d0:      	mov	w3, wzr
   5a0d4:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5a0d8:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a0dc:      	ldr	x2, [sp, #0xa8]
   5a0e0:      	ldr	x8, [x19]
   5a0e4:      	mov	x0, x19
   5a0e8:      	mov	x1, x20
   5a0ec:      	ldr	x8, [x8, #0x2f8]
   5a0f0:      	blr	x8
   5a0f4:      	ldr	x8, [x19]
   5a0f8:      	mov	x26, x0
   5a0fc:      	mov	x0, x19
   5a100:      	ldr	x8, [x8, #0x720]
   5a104:      	blr	x8
   5a108:      	and	w8, w0, #0xff
   5a10c:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a110:      	cbz	x23, 0x5a128 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xaa8>
   5a114:      	ldr	x8, [x19]
   5a118:      	mov	x0, x19
   5a11c:      	mov	x1, x23
   5a120:      	ldr	x8, [x8, #0xb8]
   5a124:      	blr	x8
   5a128:      	cbz	x26, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   5a12c:      	ldr	x2, [sp, #0x40]
   5a130:      	cbnz	x2, 0x5a168 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xae8>
   5a134:      	adrp	x4, 0x1b5000
   5a138:      	adrp	x5, 0x1b5000
   5a13c:      	adrp	x6, 0x1b5000
   5a140:      	add	x4, x4, #0x9e0
   5a144:      	add	x5, x5, #0x9f4
   5a148:      	add	x6, x6, #0xa10
   5a14c:      	sub	x1, x29, #0x90
   5a150:      	add	x2, sp, #0x40
   5a154:      	mov	x0, x19
   5a158:      	mov	w3, wzr
   5a15c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a160:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a164:      	ldr	x2, [sp, #0x40]
   5a168:      	ldr	x8, [x19]
   5a16c:      	sub	x3, x29, #0x70
   5a170:      	mov	x0, x19
   5a174:      	mov	x1, x26
   5a178:      	ldr	x8, [x8, #0x120]
   5a17c:      	blr	x8
   5a180:      	ldr	x8, [x19]
   5a184:      	mov	x23, x0
   5a188:      	mov	x0, x19
   5a18c:      	ldr	x8, [x8, #0x720]
   5a190:      	blr	x8
   5a194:      	and	w8, w0, #0xff
   5a198:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a19c:      	ldr	x8, [x19]
   5a1a0:      	mov	x0, x19
   5a1a4:      	mov	x1, x26
   5a1a8:      	ldr	x8, [x8, #0xb8]
   5a1ac:      	blr	x8
   5a1b0:      	cbz	x23, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   5a1b4:      	ldr	x2, [sp, #0xa0]
   5a1b8:      	cbnz	x2, 0x5a1f0 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xb70>
   5a1bc:      	adrp	x4, 0x1b5000
   5a1c0:      	adrp	x5, 0x1b5000
   5a1c4:      	adrp	x6, 0x1b5000
   5a1c8:      	add	x4, x4, #0xa30
   5a1cc:      	add	x5, x5, #0xa44
   5a1d0:      	add	x6, x6, #0xa4c
   5a1d4:      	sub	x1, x29, #0x98
   5a1d8:      	add	x2, sp, #0xa0
   5a1dc:      	mov	x0, x19
   5a1e0:      	mov	w3, wzr
   5a1e4:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5a1e8:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a1ec:      	ldr	x2, [sp, #0xa0]
   5a1f0:      	ldr	x8, [x19]
   5a1f4:      	mov	x0, x19
   5a1f8:      	mov	x1, x23
   5a1fc:      	mov	w3, w25
   5a200:      	ldr	x8, [x8, #0x368]
   5a204:      	blr	x8
   5a208:      	ldr	x8, [x19]
   5a20c:      	mov	x0, x19
   5a210:      	ldr	x8, [x8, #0x720]
   5a214:      	blr	x8
   5a218:      	and	w8, w0, #0xff
   5a21c:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a220:      	ldr	x2, [sp, #0xa8]
   5a224:      	cbnz	x2, 0x5a25c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbdc>
   5a228:      	adrp	x4, 0x1b5000
   5a22c:      	adrp	x5, 0x1b5000
   5a230:      	adrp	x6, 0x1b5000
   5a234:      	add	x4, x4, #0x788
   5a238:      	add	x5, x5, #0x9b0
   5a23c:      	add	x6, x6, #0x9c0
   5a240:      	sub	x1, x29, #0x78
   5a244:      	add	x2, sp, #0xa8
   5a248:      	mov	x0, x19
   5a24c:      	mov	w3, wzr
   5a250:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5a254:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a258:      	ldr	x2, [sp, #0xa8]
   5a25c:      	ldr	x8, [x19]
   5a260:      	mov	x0, x19
   5a264:      	mov	x1, x20
   5a268:      	ldr	x8, [x8, #0x2f8]
   5a26c:      	blr	x8
   5a270:      	ldr	x8, [x19]
   5a274:      	mov	x26, x0
   5a278:      	mov	x0, x19
   5a27c:      	ldr	x8, [x8, #0x720]
   5a280:      	blr	x8
   5a284:      	and	w8, w0, #0xff
   5a288:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a28c:      	ldr	x8, [x19]
   5a290:      	mov	x0, x19
   5a294:      	mov	x1, x22
   5a298:      	ldr	x8, [x8, #0xb8]
   5a29c:      	blr	x8
   5a2a0:      	cbz	x26, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   5a2a4:      	ldr	x2, [sp, #0x38]
   5a2a8:      	cbnz	x2, 0x5a2e0 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xc60>
   5a2ac:      	adrp	x4, 0x1b5000
   5a2b0:      	adrp	x5, 0x1b5000
   5a2b4:      	adrp	x6, 0x1b5000
   5a2b8:      	add	x4, x4, #0x9e0
   5a2bc:      	add	x5, x5, #0xa50
   5a2c0:      	add	x6, x6, #0xa60
   5a2c4:      	sub	x1, x29, #0x90
   5a2c8:      	add	x2, sp, #0x38
   5a2cc:      	mov	x0, x19
   5a2d0:      	mov	w3, wzr
   5a2d4:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a2d8:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a2dc:      	ldr	x2, [sp, #0x38]
   5a2e0:      	stur	x23, [x29, #-0x70]
   5a2e4:      	ldr	x8, [x19]
   5a2e8:      	sub	x3, x29, #0x70
   5a2ec:      	mov	x0, x19
   5a2f0:      	mov	x1, x26
   5a2f4:      	ldr	x8, [x8, #0x138]
   5a2f8:      	blr	x8
   5a2fc:      	ldr	x8, [x19]
   5a300:      	mov	x0, x19
   5a304:      	ldr	x8, [x8, #0x720]
   5a308:      	blr	x8
   5a30c:      	and	w8, w0, #0xff
   5a310:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a314:      	b	0x5a418 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xd98>
   5a318:      	bl	0xde90 <__stack_chk_fail@plt>
   5a31c:      	ldr	x2, [sp, #0xb8]
   5a320:      	cbnz	x2, 0x5a358 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xcd8>
   5a324:      	adrp	x4, 0x1b5000
   5a328:      	adrp	x5, 0x1b5000
   5a32c:      	adrp	x6, 0x1b5000
   5a330:      	add	x4, x4, #0x788
   5a334:      	add	x5, x5, #0x940
   5a338:      	add	x6, x6, #0x950
   5a33c:      	sub	x1, x29, #0x78
   5a340:      	add	x2, sp, #0xb8
   5a344:      	mov	x0, x19
   5a348:      	mov	w3, wzr
   5a34c:      	bl	0xdbc0 <_Z17d2c_resolve_fieldP7_JNIEnvPP7_jclassPP9_jfieldIDbPKcS8_S8_@plt>
   5a350:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a354:      	ldr	x2, [sp, #0xb8]
   5a358:      	ldr	x8, [x19]
   5a35c:      	mov	x0, x19
   5a360:      	mov	x1, x20
   5a364:      	ldr	x8, [x8, #0x2f8]
   5a368:      	blr	x8
   5a36c:      	ldr	x8, [x19]
   5a370:      	mov	x21, x0
   5a374:      	mov	x0, x19
   5a378:      	ldr	x8, [x8, #0x720]
   5a37c:      	blr	x8
   5a380:      	and	w8, w0, #0xff
   5a384:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a388:      	ldr	x8, [x19]
   5a38c:      	mov	x0, x19
   5a390:      	mov	x1, x22
   5a394:      	ldr	x8, [x8, #0xb8]
   5a398:      	blr	x8
   5a39c:      	ldr	x2, [sp, #0x48]
   5a3a0:      	cbnz	x2, 0x5a3d8 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xd58>
   5a3a4:      	adrp	x4, 0x1b5000
   5a3a8:      	adrp	x5, 0x1b5000
   5a3ac:      	adrp	x6, 0x1b5000
   5a3b0:      	add	x4, x4, #0x788
   5a3b4:      	add	x5, x5, #0x940
   5a3b8:      	add	x6, x6, #0x980
   5a3bc:      	sub	x1, x29, #0x78
   5a3c0:      	add	x2, sp, #0x48
   5a3c4:      	mov	x0, x19
   5a3c8:      	mov	w3, wzr
   5a3cc:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a3d0:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a3d4:      	ldr	x2, [sp, #0x48]
   5a3d8:      	orr	w8, wzr, #0x18
   5a3dc:      	stp	x21, x23, [x29, #-0x70]
   5a3e0:      	stur	w8, [x29, #-0x60]
   5a3e4:      	ldr	x8, [x19]
   5a3e8:      	sub	x3, x29, #0x70
   5a3ec:      	mov	x0, x19
   5a3f0:      	mov	x1, x20
   5a3f4:      	ldr	x8, [x8, #0x1f8]
   5a3f8:      	blr	x8
   5a3fc:      	ldr	x8, [x19]
   5a400:      	mov	x0, x19
   5a404:      	ldr	x8, [x8, #0x720]
   5a408:      	blr	x8
   5a40c:      	b	0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a410:      	mov	x26, x22
   5a414:      	cbz	x23, 0x5a430 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xdb0>
   5a418:      	ldr	x8, [x19]
   5a41c:      	mov	x0, x19
   5a420:      	mov	x1, x23
   5a424:      	ldr	x8, [x8, #0xb8]
   5a428:      	blr	x8
   5a42c:      	mov	x22, x26
   5a430:      	ldr	x8, [x19]
   5a434:      	adrp	x1, 0x1b5000
   5a438:      	add	x1, x1, #0xa78
   5a43c:      	mov	x0, x19
   5a440:      	ldr	x8, [x8, #0x538]
   5a444:      	blr	x8
   5a448:      	ldr	x2, [sp, #0x30]
   5a44c:      	mov	x26, x0
   5a450:      	cbnz	x2, 0x5a488 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xe08>
   5a454:      	adrp	x4, 0x1b5000
   5a458:      	adrp	x5, 0x1b5000
   5a45c:      	adrp	x6, 0x1b5000
   5a460:      	add	x4, x4, #0xa7c
   5a464:      	add	x5, x5, #0xa88
   5a468:      	add	x6, x6, #0xa90
   5a46c:      	sub	x1, x29, #0xa0
   5a470:      	add	x2, sp, #0x30
   5a474:      	orr	w3, wzr, #0x1
   5a478:      	mov	x0, x19
   5a47c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a480:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a484:      	ldr	x2, [sp, #0x30]
   5a488:      	stur	x26, [x29, #-0x70]
   5a48c:      	ldr	x8, [x19]
   5a490:      	ldur	x1, [x29, #-0xa0]
   5a494:      	sub	x3, x29, #0x70
   5a498:      	mov	x0, x19
   5a49c:      	ldr	x8, [x8, #0x3a0]
   5a4a0:      	blr	x8
   5a4a4:      	ldr	x8, [x19]
   5a4a8:      	mov	x23, x0
   5a4ac:      	mov	x0, x19
   5a4b0:      	ldr	x8, [x8, #0x720]
   5a4b4:      	blr	x8
   5a4b8:      	and	w8, w0, #0xff
   5a4bc:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a4c0:      	cbz	x26, 0x5a4d8 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xe58>
   5a4c4:      	ldr	x8, [x19]
   5a4c8:      	mov	x0, x19
   5a4cc:      	mov	x1, x26
   5a4d0:      	ldr	x8, [x8, #0xb8]
   5a4d4:      	blr	x8
   5a4d8:      	cmp	w25, #0xff
   5a4dc:      	b.le	0x5a9a4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1324>
   5a4e0:      	cbz	x24, 0x5a4f8 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xe78>
   5a4e4:      	ldr	x8, [x19]
   5a4e8:      	mov	x0, x19
   5a4ec:      	mov	x1, x24
   5a4f0:      	ldr	x8, [x8, #0xb8]
   5a4f4:      	blr	x8
   5a4f8:      	ldur	x1, [x29, #-0xa8]
   5a4fc:      	cbnz	x1, 0x5a51c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xe9c>
   5a500:      	adrp	x2, 0x1b5000
   5a504:      	add	x2, x2, #0xac0
   5a508:      	sub	x1, x29, #0xa8
   5a50c:      	mov	x0, x19
   5a510:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
   5a514:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a518:      	ldur	x1, [x29, #-0xa8]
   5a51c:      	ldr	x8, [x19]
   5a520:      	mov	x0, x19
   5a524:      	ldr	x8, [x8, #0xd8]
   5a528:      	blr	x8
   5a52c:      	ldr	x8, [x19]
   5a530:      	mov	x21, x0
   5a534:      	mov	x0, x19
   5a538:      	ldr	x8, [x8, #0x720]
   5a53c:      	blr	x8
   5a540:      	and	w8, w0, #0xff
   5a544:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a548:      	cbz	x21, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   5a54c:      	ldr	x2, [sp, #0x28]
   5a550:      	cbnz	x2, 0x5a588 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xf08>
   5a554:      	adrp	x4, 0x1b5000
   5a558:      	adrp	x5, 0x1b5000
   5a55c:      	adrp	x6, 0x1b5000
   5a560:      	add	x4, x4, #0xac0
   5a564:      	add	x5, x5, #0xad8
   5a568:      	add	x6, x6, #0xae0
   5a56c:      	sub	x1, x29, #0xa8
   5a570:      	add	x2, sp, #0x28
   5a574:      	mov	x0, x19
   5a578:      	mov	w3, wzr
   5a57c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a580:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a584:      	ldr	x2, [sp, #0x28]
   5a588:      	ldr	x8, [x19]
   5a58c:      	sub	x3, x29, #0x70
   5a590:      	mov	x0, x19
   5a594:      	mov	x1, x21
   5a598:      	ldr	x8, [x8, #0x1f8]
   5a59c:      	blr	x8
   5a5a0:      	ldr	x8, [x19]
   5a5a4:      	mov	x0, x19
   5a5a8:      	ldr	x8, [x8, #0x720]
   5a5ac:      	blr	x8
   5a5b0:      	and	w8, w0, #0xff
   5a5b4:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a5b8:      	cbz	x22, 0x5a5d0 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xf50>
   5a5bc:      	ldr	x8, [x19]
   5a5c0:      	mov	x0, x19
   5a5c4:      	mov	x1, x22
   5a5c8:      	ldr	x8, [x8, #0xb8]
   5a5cc:      	blr	x8
   5a5d0:      	ldr	x8, [x19]
   5a5d4:      	adrp	x1, 0x1b5000
   5a5d8:      	add	x1, x1, #0xb40
   5a5dc:      	mov	x0, x19
   5a5e0:      	ldr	x8, [x8, #0x538]
   5a5e4:      	blr	x8
   5a5e8:      	ldr	x2, [sp, #0x10]
   5a5ec:      	mov	x22, x0
   5a5f0:      	cbnz	x2, 0x5a628 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xfa8>
   5a5f4:      	adrp	x4, 0x1b5000
   5a5f8:      	adrp	x5, 0x1b5000
   5a5fc:      	adrp	x6, 0x1b5000
   5a600:      	add	x4, x4, #0xac0
   5a604:      	add	x5, x5, #0xb28
   5a608:      	add	x6, x6, #0xa90
   5a60c:      	sub	x1, x29, #0xa8
   5a610:      	add	x2, sp, #0x10
   5a614:      	mov	x0, x19
   5a618:      	mov	w3, wzr
   5a61c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a620:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a624:      	ldr	x2, [sp, #0x10]
   5a628:      	stur	x22, [x29, #-0x70]
   5a62c:      	ldr	x8, [x19]
   5a630:      	sub	x3, x29, #0x70
   5a634:      	mov	x0, x19
   5a638:      	mov	x1, x21
   5a63c:      	ldr	x8, [x8, #0x120]
   5a640:      	blr	x8
   5a644:      	ldr	x8, [x19]
   5a648:      	mov	x24, x0
   5a64c:      	mov	x0, x19
   5a650:      	ldr	x8, [x8, #0x720]
   5a654:      	blr	x8
   5a658:      	and	w8, w0, #0xff
   5a65c:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a660:      	cbz	x24, 0x5a678 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xff8>
   5a664:      	ldr	x8, [x19]
   5a668:      	mov	x0, x19
   5a66c:      	mov	x1, x24
   5a670:      	ldr	x8, [x8, #0xb8]
   5a674:      	blr	x8
   5a678:      	ldr	x2, [sp]
   5a67c:      	cbnz	x2, 0x5a6b4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1034>
   5a680:      	adrp	x4, 0x1b5000
   5a684:      	adrp	x5, 0x1b5000
   5a688:      	adrp	x6, 0x1b5000
   5a68c:      	add	x4, x4, #0xac0
   5a690:      	add	x5, x5, #0xb28
   5a694:      	add	x6, x6, #0xb50
   5a698:      	sub	x1, x29, #0xa8
   5a69c:      	mov	x2, sp
   5a6a0:      	mov	x0, x19
   5a6a4:      	mov	w3, wzr
   5a6a8:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a6ac:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a6b0:      	ldr	x2, [sp]
   5a6b4:      	stur	w25, [x29, #-0x70]
   5a6b8:      	ldr	x8, [x19]
   5a6bc:      	sub	x3, x29, #0x70
   5a6c0:      	mov	x0, x19
   5a6c4:      	mov	x1, x21
   5a6c8:      	ldr	x8, [x8, #0x120]
   5a6cc:      	blr	x8
   5a6d0:      	ldr	x8, [x19]
   5a6d4:      	mov	x24, x0
   5a6d8:      	mov	x0, x19
   5a6dc:      	ldr	x8, [x8, #0x720]
   5a6e0:      	blr	x8
   5a6e4:      	and	w8, w0, #0xff
   5a6e8:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a6ec:      	cbz	x24, 0x5a704 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1084>
   5a6f0:      	ldr	x8, [x19]
   5a6f4:      	mov	x0, x19
   5a6f8:      	mov	x1, x24
   5a6fc:      	ldr	x8, [x8, #0xb8]
   5a700:      	blr	x8
   5a704:      	cbz	x22, 0x5a71c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x109c>
   5a708:      	ldr	x8, [x19]
   5a70c:      	mov	x0, x19
   5a710:      	mov	x1, x22
   5a714:      	ldr	x8, [x8, #0xb8]
   5a718:      	blr	x8
   5a71c:      	ldr	x8, [x19]
   5a720:      	adrp	x1, 0x1b5000
   5a724:      	add	x1, x1, #0xb70
   5a728:      	mov	x0, x19
   5a72c:      	ldr	x8, [x8, #0x538]
   5a730:      	blr	x8
   5a734:      	ldr	x2, [sp, #0x10]
   5a738:      	mov	x22, x0
   5a73c:      	cbnz	x2, 0x5a774 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x10f4>
   5a740:      	adrp	x4, 0x1b5000
   5a744:      	adrp	x5, 0x1b5000
   5a748:      	adrp	x6, 0x1b5000
   5a74c:      	add	x4, x4, #0xac0
   5a750:      	add	x5, x5, #0xb28
   5a754:      	add	x6, x6, #0xa90
   5a758:      	sub	x1, x29, #0xa8
   5a75c:      	add	x2, sp, #0x10
   5a760:      	mov	x0, x19
   5a764:      	mov	w3, wzr
   5a768:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a76c:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a770:      	ldr	x2, [sp, #0x10]
   5a774:      	stur	x22, [x29, #-0x70]
   5a778:      	ldr	x8, [x19]
   5a77c:      	sub	x3, x29, #0x70
   5a780:      	mov	x0, x19
   5a784:      	mov	x1, x21
   5a788:      	ldr	x8, [x8, #0x120]
   5a78c:      	blr	x8
   5a790:      	ldr	x8, [x19]
   5a794:      	mov	x22, x0
   5a798:      	mov	x0, x19
   5a79c:      	ldr	x8, [x8, #0x720]
   5a7a0:      	blr	x8
   5a7a4:      	and	w8, w0, #0xff
   5a7a8:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a7ac:      	cbz	x22, 0x5a7c4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1144>
   5a7b0:      	ldr	x8, [x19]
   5a7b4:      	mov	x0, x19
   5a7b8:      	mov	x1, x22
   5a7bc:      	ldr	x8, [x8, #0xb8]
   5a7c0:      	blr	x8
   5a7c4:      	ldr	x2, [sp, #0x8]
   5a7c8:      	cbnz	x2, 0x5a800 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1180>
   5a7cc:      	adrp	x4, 0x1b5000
   5a7d0:      	adrp	x5, 0x1b5000
   5a7d4:      	adrp	x6, 0x1b5000
   5a7d8:      	add	x4, x4, #0xac0
   5a7dc:      	add	x5, x5, #0xb34
   5a7e0:      	add	x6, x6, #0xb10
   5a7e4:      	sub	x1, x29, #0xa8
   5a7e8:      	add	x2, sp, #0x8
   5a7ec:      	mov	x0, x19
   5a7f0:      	mov	w3, wzr
   5a7f4:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a7f8:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a7fc:      	ldr	x2, [sp, #0x8]
   5a800:      	ldr	x8, [x19]
   5a804:      	sub	x3, x29, #0x70
   5a808:      	mov	x0, x19
   5a80c:      	mov	x1, x21
   5a810:      	ldr	x8, [x8, #0x120]
   5a814:      	blr	x8
   5a818:      	ldr	x8, [x19]
   5a81c:      	mov	x22, x0
   5a820:      	mov	x0, x19
   5a824:      	ldr	x8, [x8, #0x720]
   5a828:      	blr	x8
   5a82c:      	and	w8, w0, #0xff
   5a830:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a834:      	ldr	x8, [x19]
   5a838:      	mov	x0, x19
   5a83c:      	mov	x1, x21
   5a840:      	ldr	x8, [x8, #0xb8]
   5a844:      	blr	x8
   5a848:      	cbz	x23, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   5a84c:      	ldr	x2, [sp, #0x10]
   5a850:      	cbnz	x2, 0x5a888 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1208>
   5a854:      	adrp	x4, 0x1b5000
   5a858:      	adrp	x5, 0x1b5000
   5a85c:      	adrp	x6, 0x1b5000
   5a860:      	add	x4, x4, #0xac0
   5a864:      	add	x5, x5, #0xb28
   5a868:      	add	x6, x6, #0xa90
   5a86c:      	sub	x1, x29, #0xa8
   5a870:      	add	x2, sp, #0x10
   5a874:      	mov	x0, x19
   5a878:      	mov	w3, wzr
   5a87c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a880:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a884:      	ldr	x2, [sp, #0x10]
   5a888:      	stur	x22, [x29, #-0x70]
   5a88c:      	ldr	x8, [x19]
   5a890:      	sub	x3, x29, #0x70
   5a894:      	mov	x0, x19
   5a898:      	mov	x1, x23
   5a89c:      	ldr	x8, [x8, #0x120]
   5a8a0:      	blr	x8
   5a8a4:      	ldr	x8, [x19]
   5a8a8:      	mov	x21, x0
   5a8ac:      	mov	x0, x19
   5a8b0:      	ldr	x8, [x8, #0x720]
   5a8b4:      	blr	x8
   5a8b8:      	and	w8, w0, #0xff
   5a8bc:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a8c0:      	cbz	x21, 0x5a8d8 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1258>
   5a8c4:      	ldr	x8, [x19]
   5a8c8:      	mov	x0, x19
   5a8cc:      	mov	x1, x21
   5a8d0:      	ldr	x8, [x8, #0xb8]
   5a8d4:      	blr	x8
   5a8d8:      	ldr	x2, [sp, #0x8]
   5a8dc:      	cbnz	x2, 0x5a914 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1294>
   5a8e0:      	adrp	x4, 0x1b5000
   5a8e4:      	adrp	x5, 0x1b5000
   5a8e8:      	adrp	x6, 0x1b5000
   5a8ec:      	add	x4, x4, #0xac0
   5a8f0:      	add	x5, x5, #0xb34
   5a8f4:      	add	x6, x6, #0xb10
   5a8f8:      	sub	x1, x29, #0xa8
   5a8fc:      	add	x2, sp, #0x8
   5a900:      	mov	x0, x19
   5a904:      	mov	w3, wzr
   5a908:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a90c:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a910:      	ldr	x2, [sp, #0x8]
   5a914:      	ldr	x8, [x19]
   5a918:      	sub	x3, x29, #0x70
   5a91c:      	mov	x0, x19
   5a920:      	mov	x1, x23
   5a924:      	ldr	x8, [x8, #0x120]
   5a928:      	blr	x8
   5a92c:      	ldr	x8, [x19]
   5a930:      	mov	x21, x0
   5a934:      	mov	x0, x19
   5a938:      	ldr	x8, [x8, #0x720]
   5a93c:      	blr	x8
   5a940:      	and	w8, w0, #0xff
   5a944:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a948:      	cbz	x22, 0x5a960 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x12e0>
   5a94c:      	ldr	x8, [x19]
   5a950:      	mov	x0, x19
   5a954:      	mov	x1, x22
   5a958:      	ldr	x8, [x8, #0xb8]
   5a95c:      	blr	x8
   5a960:      	ldr	x2, [sp, #0x70]
   5a964:      	cbnz	x2, 0x5a99c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x131c>
   5a968:      	adrp	x4, 0x1b5000
   5a96c:      	adrp	x5, 0x1b5000
   5a970:      	adrp	x6, 0x1b5000
   5a974:      	add	x4, x4, #0x788
   5a978:      	add	x5, x5, #0x8a4
   5a97c:      	add	x6, x6, #0x8b0
   5a980:      	sub	x1, x29, #0x78
   5a984:      	add	x2, sp, #0x70
   5a988:      	mov	x0, x19
   5a98c:      	mov	w3, wzr
   5a990:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5a994:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a998:      	ldr	x2, [sp, #0x70]
   5a99c:      	stur	x21, [x29, #-0x70]
   5a9a0:      	b	0x5a3e4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xd64>
   5a9a4:      	cbz	x22, 0x5a9bc <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x133c>
   5a9a8:      	ldr	x8, [x19]
   5a9ac:      	mov	x0, x19
   5a9b0:      	mov	x1, x22
   5a9b4:      	ldr	x8, [x8, #0xb8]
   5a9b8:      	blr	x8
   5a9bc:      	ldur	x1, [x29, #-0xa8]
   5a9c0:      	cbnz	x1, 0x5a9e0 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1360>
   5a9c4:      	adrp	x2, 0x1b5000
   5a9c8:      	add	x2, x2, #0xac0
   5a9cc:      	sub	x1, x29, #0xa8
   5a9d0:      	mov	x0, x19
   5a9d4:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
   5a9d8:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5a9dc:      	ldur	x1, [x29, #-0xa8]
   5a9e0:      	ldr	x8, [x19]
   5a9e4:      	mov	x0, x19
   5a9e8:      	ldr	x8, [x8, #0xd8]
   5a9ec:      	blr	x8
   5a9f0:      	ldr	x8, [x19]
   5a9f4:      	mov	x22, x0
   5a9f8:      	mov	x0, x19
   5a9fc:      	ldr	x8, [x8, #0x720]
   5aa00:      	blr	x8
   5aa04:      	and	w8, w0, #0xff
   5aa08:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5aa0c:      	cbz	x22, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   5aa10:      	ldr	x2, [sp, #0x28]
   5aa14:      	cbnz	x2, 0x5aa4c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x13cc>
   5aa18:      	adrp	x4, 0x1b5000
   5aa1c:      	adrp	x5, 0x1b5000
   5aa20:      	adrp	x6, 0x1b5000
   5aa24:      	add	x4, x4, #0xac0
   5aa28:      	add	x5, x5, #0xad8
   5aa2c:      	add	x6, x6, #0xae0
   5aa30:      	sub	x1, x29, #0xa8
   5aa34:      	add	x2, sp, #0x28
   5aa38:      	mov	x0, x19
   5aa3c:      	mov	w3, wzr
   5aa40:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5aa44:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5aa48:      	ldr	x2, [sp, #0x28]
   5aa4c:      	ldr	x8, [x19]
   5aa50:      	sub	x3, x29, #0x70
   5aa54:      	mov	x0, x19
   5aa58:      	mov	x1, x22
   5aa5c:      	ldr	x8, [x8, #0x1f8]
   5aa60:      	blr	x8
   5aa64:      	ldr	x8, [x19]
   5aa68:      	mov	x0, x19
   5aa6c:      	ldr	x8, [x8, #0x720]
   5aa70:      	blr	x8
   5aa74:      	and	w8, w0, #0xff
   5aa78:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5aa7c:      	cbz	x21, 0x5aa94 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1414>
   5aa80:      	ldr	x8, [x19]
   5aa84:      	mov	x0, x19
   5aa88:      	mov	x1, x21
   5aa8c:      	ldr	x8, [x8, #0xb8]
   5aa90:      	blr	x8
   5aa94:      	ldur	x1, [x29, #-0xb0]
   5aa98:      	cbnz	x1, 0x5aab8 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1438>
   5aa9c:      	adrp	x2, 0x1b5000
   5aaa0:      	add	x2, x2, #0xaf0
   5aaa4:      	sub	x1, x29, #0xb0
   5aaa8:      	mov	x0, x19
   5aaac:      	bl	0xdbf0 <_Z17d2c_resolve_classP7_JNIEnvPP7_jclassPKc@plt>
   5aab0:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5aab4:      	ldur	x1, [x29, #-0xb0]
   5aab8:      	ldr	x8, [x19]
   5aabc:      	mov	x0, x19
   5aac0:      	ldr	x8, [x8, #0xd8]
   5aac4:      	blr	x8
   5aac8:      	ldr	x8, [x19]
   5aacc:      	mov	x21, x0
   5aad0:      	mov	x0, x19
   5aad4:      	ldr	x8, [x8, #0x720]
   5aad8:      	blr	x8
   5aadc:      	and	w8, w0, #0xff
   5aae0:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5aae4:      	cbz	x21, 0x5ada4 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1724>
   5aae8:      	ldr	x2, [sp, #0x20]
   5aaec:      	cbnz	x2, 0x5ab24 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x14a4>
   5aaf0:      	adrp	x4, 0x1b5000
   5aaf4:      	adrp	x5, 0x1b5000
   5aaf8:      	adrp	x6, 0x1b5000
   5aafc:      	add	x4, x4, #0xaf0
   5ab00:      	add	x5, x5, #0xad8
   5ab04:      	add	x6, x6, #0x798
   5ab08:      	sub	x1, x29, #0xb0
   5ab0c:      	add	x2, sp, #0x20
   5ab10:      	mov	x0, x19
   5ab14:      	mov	w3, wzr
   5ab18:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5ab1c:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ab20:      	ldr	x2, [sp, #0x20]
   5ab24:      	stur	x24, [x29, #-0x70]
   5ab28:      	ldr	x8, [x19]
   5ab2c:      	sub	x3, x29, #0x70
   5ab30:      	mov	x0, x19
   5ab34:      	mov	x1, x21
   5ab38:      	ldr	x8, [x8, #0x1f8]
   5ab3c:      	blr	x8
   5ab40:      	ldr	x8, [x19]
   5ab44:      	mov	x0, x19
   5ab48:      	ldr	x8, [x8, #0x720]
   5ab4c:      	blr	x8
   5ab50:      	and	w8, w0, #0xff
   5ab54:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ab58:      	ldr	x2, [sp, #0x18]
   5ab5c:      	cbnz	x2, 0x5ab94 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1514>
   5ab60:      	adrp	x4, 0x1b5000
   5ab64:      	adrp	x5, 0x1b5000
   5ab68:      	adrp	x6, 0x1b5000
   5ab6c:      	add	x4, x4, #0xaf0
   5ab70:      	add	x5, x5, #0xb04
   5ab74:      	add	x6, x6, #0xb10
   5ab78:      	sub	x1, x29, #0xb0
   5ab7c:      	add	x2, sp, #0x18
   5ab80:      	mov	x0, x19
   5ab84:      	mov	w3, wzr
   5ab88:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5ab8c:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ab90:      	ldr	x2, [sp, #0x18]
   5ab94:      	ldr	x8, [x19]
   5ab98:      	sub	x3, x29, #0x70
   5ab9c:      	mov	x0, x19
   5aba0:      	mov	x1, x21
   5aba4:      	ldr	x8, [x8, #0x120]
   5aba8:      	blr	x8
   5abac:      	ldr	x8, [x19]
   5abb0:      	mov	x21, x0
   5abb4:      	mov	x0, x19
   5abb8:      	ldr	x8, [x8, #0x720]
   5abbc:      	blr	x8
   5abc0:      	and	w8, w0, #0xff
   5abc4:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5abc8:      	cbz	x24, 0x5abe0 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1560>
   5abcc:      	ldr	x8, [x19]
   5abd0:      	mov	x0, x19
   5abd4:      	mov	x1, x24
   5abd8:      	ldr	x8, [x8, #0xb8]
   5abdc:      	blr	x8
   5abe0:      	ldr	x2, [sp, #0x10]
   5abe4:      	cbnz	x2, 0x5ac1c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x159c>
   5abe8:      	adrp	x4, 0x1b5000
   5abec:      	adrp	x5, 0x1b5000
   5abf0:      	adrp	x6, 0x1b5000
   5abf4:      	add	x4, x4, #0xac0
   5abf8:      	add	x5, x5, #0xb28
   5abfc:      	add	x6, x6, #0xa90
   5ac00:      	sub	x1, x29, #0xa8
   5ac04:      	add	x2, sp, #0x10
   5ac08:      	mov	x0, x19
   5ac0c:      	mov	w3, wzr
   5ac10:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5ac14:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ac18:      	ldr	x2, [sp, #0x10]
   5ac1c:      	stur	x21, [x29, #-0x70]
   5ac20:      	ldr	x8, [x19]
   5ac24:      	sub	x3, x29, #0x70
   5ac28:      	mov	x0, x19
   5ac2c:      	mov	x1, x22
   5ac30:      	ldr	x8, [x8, #0x120]
   5ac34:      	blr	x8
   5ac38:      	ldr	x8, [x19]
   5ac3c:      	mov	x24, x0
   5ac40:      	mov	x0, x19
   5ac44:      	ldr	x8, [x8, #0x720]
   5ac48:      	blr	x8
   5ac4c:      	and	w8, w0, #0xff
   5ac50:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ac54:      	cbz	x24, 0x5ac6c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x15ec>
   5ac58:      	ldr	x8, [x19]
   5ac5c:      	mov	x0, x19
   5ac60:      	mov	x1, x24
   5ac64:      	ldr	x8, [x8, #0xb8]
   5ac68:      	blr	x8
   5ac6c:      	cbz	x21, 0x5ac84 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x1604>
   5ac70:      	ldr	x8, [x19]
   5ac74:      	mov	x0, x19
   5ac78:      	mov	x1, x21
   5ac7c:      	ldr	x8, [x8, #0xb8]
   5ac80:      	blr	x8
   5ac84:      	ldr	x8, [x19]
   5ac88:      	adrp	x1, 0x1b5000
   5ac8c:      	add	x1, x1, #0xb30
   5ac90:      	mov	x0, x19
   5ac94:      	ldr	x8, [x8, #0x538]
   5ac98:      	blr	x8
   5ac9c:      	ldr	x2, [sp, #0x10]
   5aca0:      	mov	x21, x0
   5aca4:      	cbnz	x2, 0x5acdc <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x165c>
   5aca8:      	adrp	x4, 0x1b5000
   5acac:      	adrp	x5, 0x1b5000
   5acb0:      	adrp	x6, 0x1b5000
   5acb4:      	add	x4, x4, #0xac0
   5acb8:      	add	x5, x5, #0xb28
   5acbc:      	add	x6, x6, #0xa90
   5acc0:      	sub	x1, x29, #0xa8
   5acc4:      	add	x2, sp, #0x10
   5acc8:      	mov	x0, x19
   5accc:      	mov	w3, wzr
   5acd0:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5acd4:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5acd8:      	ldr	x2, [sp, #0x10]
   5acdc:      	stur	x21, [x29, #-0x70]
   5ace0:      	ldr	x8, [x19]
   5ace4:      	sub	x3, x29, #0x70
   5ace8:      	mov	x0, x19
   5acec:      	mov	x1, x22
   5acf0:      	ldr	x8, [x8, #0x120]
   5acf4:      	blr	x8
   5acf8:      	ldr	x8, [x19]
   5acfc:      	mov	x24, x0
   5ad00:      	mov	x0, x19
   5ad04:      	ldr	x8, [x8, #0x720]
   5ad08:      	blr	x8
   5ad0c:      	and	w8, w0, #0xff
   5ad10:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ad14:      	cbz	x24, 0x5ad2c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x16ac>
   5ad18:      	ldr	x8, [x19]
   5ad1c:      	mov	x0, x19
   5ad20:      	mov	x1, x24
   5ad24:      	ldr	x8, [x8, #0xb8]
   5ad28:      	blr	x8
   5ad2c:      	ldr	x2, [sp, #0x8]
   5ad30:      	cbnz	x2, 0x5ad68 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x16e8>
   5ad34:      	adrp	x4, 0x1b5000
   5ad38:      	adrp	x5, 0x1b5000
   5ad3c:      	adrp	x6, 0x1b5000
   5ad40:      	add	x4, x4, #0xac0
   5ad44:      	add	x5, x5, #0xb34
   5ad48:      	add	x6, x6, #0xb10
   5ad4c:      	sub	x1, x29, #0xa8
   5ad50:      	add	x2, sp, #0x8
   5ad54:      	mov	x0, x19
   5ad58:      	mov	w3, wzr
   5ad5c:      	bl	0xde00 <_Z18d2c_resolve_methodP7_JNIEnvPP7_jclassPP10_jmethodIDbPKcS8_S8_@plt>
   5ad60:      	tbnz	w0, #0x0, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ad64:      	ldr	x2, [sp, #0x8]
   5ad68:      	ldr	x8, [x19]
   5ad6c:      	sub	x3, x29, #0x70
   5ad70:      	mov	x0, x19
   5ad74:      	mov	x1, x22
   5ad78:      	ldr	x8, [x8, #0x120]
   5ad7c:      	blr	x8
   5ad80:      	ldr	x8, [x19]
   5ad84:      	mov	x22, x0
   5ad88:      	mov	x0, x19
   5ad8c:      	ldr	x8, [x8, #0x720]
   5ad90:      	blr	x8
   5ad94:      	and	w8, w0, #0xff
   5ad98:      	cbnz	w8, 0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
   5ad9c:      	cbnz	x21, 0x5a834 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x11b4>
   5ada0:      	b	0x5a848 <Java_c_c_a_t3_a__Lc_c_a_t3_2+0x11c8>
   5ada4:      	adrp	x1, 0x1b5000
   5ada8:      	adrp	x2, 0x1b5000
   5adac:      	add	x1, x1, #0x750
   5adb0:      	add	x2, x2, #0x770
   5adb4:      	mov	x0, x19
   5adb8:      	bl	0xe160 <_Z19d2c_throw_exceptionP7_JNIEnvPKcS2_@plt>
   5adbc:      	b	0x5973c <Java_c_c_a_t3_a__Lc_c_a_t3_2+0xbc>
