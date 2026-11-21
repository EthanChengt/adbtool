package p080c.p084b.p085a.p087l;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p097w.p102g.C0793b;

/* JADX INFO: renamed from: c.b.a.l.e */
/* JADX INFO: loaded from: classes.dex */
public class C0632e implements InterfaceC0628a {

    /* JADX INFO: renamed from: u */
    public static final String f3895u = "e";

    /* JADX INFO: renamed from: a */
    public int[] f3896a;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0628a.a f3898c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f3899d;

    /* JADX INFO: renamed from: e */
    public byte[] f3900e;

    /* JADX INFO: renamed from: f */
    public short[] f3901f;

    /* JADX INFO: renamed from: g */
    public byte[] f3902g;

    /* JADX INFO: renamed from: h */
    public byte[] f3903h;

    /* JADX INFO: renamed from: i */
    public byte[] f3904i;

    /* JADX INFO: renamed from: j */
    public int[] f3905j;

    /* JADX INFO: renamed from: k */
    public int f3906k;

    /* JADX INFO: renamed from: l */
    public C0630c f3907l;

    /* JADX INFO: renamed from: m */
    public Bitmap f3908m;

    /* JADX INFO: renamed from: n */
    public boolean f3909n;

    /* JADX INFO: renamed from: o */
    public int f3910o;

    /* JADX INFO: renamed from: p */
    public int f3911p;

    /* JADX INFO: renamed from: q */
    public int f3912q;

    /* JADX INFO: renamed from: r */
    public int f3913r;

    /* JADX INFO: renamed from: s */
    public Boolean f3914s;

    /* JADX INFO: renamed from: b */
    public final int[] f3897b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f3915t = Bitmap.Config.ARGB_8888;

    public C0632e(InterfaceC0628a.a aVar, C0630c c0630c, ByteBuffer byteBuffer, int i) {
        this.f3898c = aVar;
        this.f3907l = new C0630c();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f3910o = 0;
                this.f3907l = c0630c;
                this.f3906k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f3899d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f3899d.order(ByteOrder.LITTLE_ENDIAN);
                this.f3909n = false;
                Iterator<C0629b> it = c0630c.f3884e.iterator();
                while (it.hasNext()) {
                    if (it.next().f3875g == 3) {
                        this.f3909n = true;
                        break;
                    }
                }
                this.f3911p = iHighestOneBit;
                int i2 = c0630c.f3885f;
                this.f3913r = i2 / iHighestOneBit;
                int i3 = c0630c.f3886g;
                this.f3912q = i3 / iHighestOneBit;
                this.f3904i = ((C0793b) this.f3898c).m2501a(i2 * i3);
                InterfaceC0628a.a aVar2 = this.f3898c;
                int i4 = this.f3913r * this.f3912q;
                InterfaceC0676b interfaceC0676b = ((C0793b) aVar2).f4512b;
                this.f3905j = interfaceC0676b == null ? new int[i4] : (int[]) interfaceC0676b.mo2324e(i4, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    /* JADX INFO: renamed from: a */
    public int mo2262a() {
        return this.f3906k;
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    /* JADX INFO: renamed from: b */
    public int mo2263b() {
        return (this.f3905j.length * 4) + this.f3899d.limit() + this.f3904i.length;
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    /* JADX INFO: renamed from: c */
    public synchronized Bitmap mo2264c() {
        if (this.f3907l.f3882c <= 0 || this.f3906k < 0) {
            String str = f3895u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f3907l.f3882c + ", framePointer=" + this.f3906k);
            }
            this.f3910o = 1;
        }
        int i = this.f3910o;
        if (i != 1 && i != 2) {
            this.f3910o = 0;
            if (this.f3900e == null) {
                this.f3900e = ((C0793b) this.f3898c).m2501a(255);
            }
            C0629b c0629b = this.f3907l.f3884e.get(this.f3906k);
            int i2 = this.f3906k - 1;
            C0629b c0629b2 = i2 >= 0 ? this.f3907l.f3884e.get(i2) : null;
            int[] iArr = c0629b.f3879k;
            if (iArr == null) {
                iArr = this.f3907l.f3880a;
            }
            this.f3896a = iArr;
            if (iArr == null) {
                String str2 = f3895u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f3906k);
                }
                this.f3910o = 1;
                return null;
            }
            if (c0629b.f3874f) {
                System.arraycopy(iArr, 0, this.f3897b, 0, iArr.length);
                int[] iArr2 = this.f3897b;
                this.f3896a = iArr2;
                iArr2[c0629b.f3876h] = 0;
                if (c0629b.f3875g == 2 && this.f3906k == 0) {
                    this.f3914s = Boolean.TRUE;
                }
            }
            return m2278j(c0629b, c0629b2);
        }
        String str3 = f3895u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f3910o);
        }
        return null;
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    public void clear() {
        InterfaceC0676b interfaceC0676b;
        InterfaceC0676b interfaceC0676b2;
        InterfaceC0676b interfaceC0676b3;
        this.f3907l = null;
        byte[] bArr = this.f3904i;
        if (bArr != null && (interfaceC0676b3 = ((C0793b) this.f3898c).f4512b) != null) {
            interfaceC0676b3.mo2323d(bArr);
        }
        int[] iArr = this.f3905j;
        if (iArr != null && (interfaceC0676b2 = ((C0793b) this.f3898c).f4512b) != null) {
            interfaceC0676b2.mo2323d(iArr);
        }
        Bitmap bitmap = this.f3908m;
        if (bitmap != null) {
            ((C0793b) this.f3898c).f4511a.mo2332e(bitmap);
        }
        this.f3908m = null;
        this.f3899d = null;
        this.f3914s = null;
        byte[] bArr2 = this.f3900e;
        if (bArr2 == null || (interfaceC0676b = ((C0793b) this.f3898c).f4512b) == null) {
            return;
        }
        interfaceC0676b.mo2323d(bArr2);
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    /* JADX INFO: renamed from: d */
    public void mo2265d() {
        this.f3906k = (this.f3906k + 1) % this.f3907l.f3882c;
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    /* JADX INFO: renamed from: e */
    public int mo2266e() {
        return this.f3907l.f3882c;
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    /* JADX INFO: renamed from: f */
    public int mo2267f() {
        int i;
        C0630c c0630c = this.f3907l;
        int i2 = c0630c.f3882c;
        if (i2 <= 0 || (i = this.f3906k) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return c0630c.f3884e.get(i).f3877i;
    }

    @Override // p080c.p084b.p085a.p087l.InterfaceC0628a
    /* JADX INFO: renamed from: g */
    public ByteBuffer mo2268g() {
        return this.f3899d;
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m2276h() {
        Boolean bool = this.f3914s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3915t;
        Bitmap bitmapMo2330c = ((C0793b) this.f3898c).f4511a.mo2330c(this.f3913r, this.f3912q, config);
        bitmapMo2330c.setHasAlpha(true);
        return bitmapMo2330c;
    }

    /* JADX INFO: renamed from: i */
    public void m2277i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f3915t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [short] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX INFO: renamed from: j */
    public final Bitmap m2278j(C0629b c0629b, C0629b c0629b2) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short s;
        int i8;
        int i9;
        Bitmap bitmap;
        int i10;
        int[] iArr = this.f3905j;
        if (c0629b2 == null) {
            Bitmap bitmap2 = this.f3908m;
            if (bitmap2 != null) {
                ((C0793b) this.f3898c).f4511a.mo2332e(bitmap2);
            }
            this.f3908m = null;
            Arrays.fill(iArr, 0);
        }
        if (c0629b2 != null && c0629b2.f3875g == 3 && this.f3908m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c0629b2 != null && (i9 = c0629b2.f3875g) > 0) {
            if (i9 == 2) {
                if (c0629b.f3874f) {
                    i10 = 0;
                } else {
                    C0630c c0630c = this.f3907l;
                    i10 = c0630c.f3890k;
                    if (c0629b.f3879k != null && c0630c.f3889j == c0629b.f3876h) {
                        i10 = 0;
                    }
                }
                int i11 = c0629b2.f3872d;
                int i12 = this.f3911p;
                int i13 = i11 / i12;
                int i14 = c0629b2.f3870b / i12;
                int i15 = c0629b2.f3871c / i12;
                int i16 = c0629b2.f3869a / i12;
                int i17 = this.f3913r;
                int i18 = (i14 * i17) + i16;
                int i19 = (i13 * i17) + i18;
                while (i18 < i19) {
                    int i20 = i18 + i15;
                    for (int i21 = i18; i21 < i20; i21++) {
                        iArr[i21] = i10;
                    }
                    i18 += this.f3913r;
                }
            } else if (i9 == 3 && (bitmap = this.f3908m) != null) {
                int i22 = this.f3913r;
                bitmap.getPixels(iArr, 0, i22, 0, 0, i22, this.f3912q);
            }
        }
        this.f3899d.position(c0629b.f3878j);
        int i23 = c0629b.f3871c * c0629b.f3872d;
        byte[] bArr = this.f3904i;
        if (bArr == null || bArr.length < i23) {
            this.f3904i = ((C0793b) this.f3898c).m2501a(i23);
        }
        byte[] bArr2 = this.f3904i;
        if (this.f3901f == null) {
            this.f3901f = new short[4096];
        }
        short[] sArr = this.f3901f;
        if (this.f3902g == null) {
            this.f3902g = new byte[4096];
        }
        byte[] bArr3 = this.f3902g;
        if (this.f3903h == null) {
            this.f3903h = new byte[4097];
        }
        byte[] bArr4 = this.f3903h;
        int i24 = this.f3899d.get() & 255;
        int i25 = 1 << i24;
        int i26 = i25 + 1;
        int i27 = i25 + 2;
        int i28 = i24 + 1;
        int i29 = (1 << i28) - 1;
        for (int i30 = 0; i30 < i25; i30++) {
            sArr[i30] = 0;
            bArr3[i30] = (byte) i30;
        }
        byte[] bArr5 = this.f3900e;
        C0632e c0632e = this;
        int i31 = i28;
        int i32 = i27;
        int i33 = i29;
        int i34 = 0;
        int i35 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        while (true) {
            if (i34 >= i23) {
                iArr = iArr;
                break;
            }
            if (i36 == 0) {
                int i43 = c0632e.f3899d.get() & 255;
                if (i43 > 0) {
                    ByteBuffer byteBuffer = c0632e.f3899d;
                    byteBuffer.get(c0632e.f3900e, 0, Math.min(i43, byteBuffer.remaining()));
                }
                if (i43 <= 0) {
                    c0632e.f3910o = 3;
                    break;
                }
                i36 = i43;
                i37 = 0;
            } else {
                i28 = i28;
                i34 = i34;
                iArr = iArr;
                i35 = i35;
            }
            i39 += (bArr5[i37] & 255) << i38;
            i37++;
            i36--;
            int i44 = i38 + 8;
            int i45 = i32;
            int i46 = i31;
            i34 = i34;
            i35 = i35;
            byte[] bArr6 = bArr5;
            int i47 = i40;
            while (true) {
                if (i44 < i46) {
                    c0632e = this;
                    break;
                }
                C0632e c0632e2 = c0632e;
                int i48 = i39 & i33;
                i39 >>= i46;
                i44 -= i46;
                if (i48 == i25) {
                    i45 = i27;
                    i33 = i29;
                    c0632e = c0632e2;
                    i46 = i28;
                    i35 = -1;
                    i8 = i47;
                } else {
                    if (i48 == i26) {
                        c0632e = c0632e2;
                        break;
                    }
                    if (i35 == -1) {
                        bArr2[i41] = bArr3[i48];
                        i41++;
                        i34++;
                        i8 = i48;
                    } else {
                        if (i48 >= i45) {
                            bArr4[i42] = (byte) i47;
                            i42++;
                            s = i35;
                        } else {
                            s = i48;
                        }
                        while (s >= i25) {
                            bArr4[i42] = bArr3[s];
                            i42++;
                            s = sArr[s];
                        }
                        int i49 = bArr3[s] & 255;
                        byte b2 = (byte) i49;
                        bArr2[i41] = b2;
                        while (true) {
                            i41++;
                            i34++;
                            if (i42 <= 0) {
                                break;
                            }
                            i42--;
                            bArr2[i41] = bArr4[i42];
                        }
                        i8 = i49;
                        if (i45 < 4096) {
                            sArr[i45] = (short) i35;
                            bArr3[i45] = b2;
                            i45++;
                            if ((i45 & i33) == 0 && i45 < 4096) {
                                i46++;
                                i33 += i45;
                            }
                        }
                    }
                    i35 = i48;
                    c0632e = this;
                }
                i47 = i8;
                i44 = i44;
            }
            i31 = i46;
            bArr5 = bArr6;
            i40 = i47;
            i28 = i28;
            i38 = i44;
            i32 = i45;
            iArr = iArr;
        }
        Arrays.fill(bArr2, i41, i23, (byte) 0);
        if (c0629b.f3873e || this.f3911p != 1) {
            Boolean bool2 = Boolean.TRUE;
            int[] iArr2 = this.f3905j;
            int i50 = c0629b.f3872d;
            int i51 = this.f3911p;
            int i52 = i50 / i51;
            int i53 = c0629b.f3870b / i51;
            int i54 = c0629b.f3871c / i51;
            int i55 = c0629b.f3869a / i51;
            boolean z = this.f3906k == 0;
            int i56 = this.f3913r;
            int i57 = this.f3912q;
            byte[] bArr7 = this.f3904i;
            int[] iArr3 = this.f3896a;
            Boolean bool3 = this.f3914s;
            int i58 = 0;
            int i59 = 0;
            int i60 = 1;
            int i61 = 8;
            while (true) {
                bool = bool3;
                if (i59 >= i52) {
                    break;
                }
                if (c0629b.f3873e) {
                    if (i58 >= i52) {
                        int i62 = i60 + 1;
                        i = i58;
                        if (i62 == 2) {
                            i60 = i62;
                            i = 4;
                        } else if (i62 != 3) {
                            i60 = i62;
                            if (i62 == 4) {
                                i61 = 2;
                                i = 1;
                            }
                        } else {
                            i60 = i62;
                            i61 = 4;
                            i = 2;
                        }
                    } else {
                        i = i58;
                    }
                    i58 = i + i61;
                } else {
                    i = i59;
                }
                int i63 = i + i53;
                int i64 = i58;
                boolean z2 = i51 == 1;
                if (i63 < i57) {
                    int i65 = i63 * i56;
                    int i66 = i65 + i55;
                    i2 = i52;
                    int i67 = i66 + i54;
                    int i68 = i65 + i56;
                    if (i68 < i67) {
                        i67 = i68;
                    }
                    i3 = i53;
                    int i69 = i59 * i51 * c0629b.f3871c;
                    if (z2) {
                        int i70 = i69;
                        bool3 = bool;
                        int i71 = i66;
                        while (true) {
                            i54 = i54;
                            if (i71 >= i67) {
                                break;
                            }
                            int i72 = iArr3[bArr7[i70] & 255];
                            if (i72 != 0) {
                                iArr2[i71] = i72;
                            } else if (z && bool3 == null) {
                                bool3 = bool2;
                            }
                            i70 += i51;
                            i71++;
                            i54 = i54;
                        }
                        i4 = i55;
                        i5 = i56;
                    } else {
                        int i73 = ((i67 - i66) * i51) + i69;
                        int i74 = i66;
                        while (i74 < i67) {
                            int i75 = c0629b.f3871c;
                            int i76 = i67;
                            int i77 = i55;
                            int i78 = i69;
                            int i79 = 0;
                            int i80 = 0;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            while (true) {
                                if (i78 >= this.f3911p + i69) {
                                    i6 = i56;
                                    break;
                                }
                                byte[] bArr8 = this.f3904i;
                                i6 = i56;
                                if (i78 >= bArr8.length || i78 >= i73) {
                                    break;
                                }
                                int i84 = this.f3896a[bArr8[i78] & 255];
                                if (i84 != 0) {
                                    i79 += (i84 >> 24) & 255;
                                    i80 += (i84 >> 16) & 255;
                                    i81 += (i84 >> 8) & 255;
                                    i82 += i84 & 255;
                                    i83++;
                                }
                                i78++;
                                i56 = i6;
                            }
                            int i85 = i75 + i69;
                            for (int i86 = i85; i86 < this.f3911p + i85; i86++) {
                                byte[] bArr9 = this.f3904i;
                                if (i86 >= bArr9.length || i86 >= i73) {
                                    break;
                                }
                                int i87 = this.f3896a[bArr9[i86] & 255];
                                if (i87 != 0) {
                                    i79 += (i87 >> 24) & 255;
                                    i80 += (i87 >> 16) & 255;
                                    i81 += (i87 >> 8) & 255;
                                    i82 += i87 & 255;
                                    i83++;
                                }
                            }
                            int i88 = i83 == 0 ? 0 : ((i79 / i83) << 24) | ((i80 / i83) << 16) | ((i81 / i83) << 8) | (i82 / i83);
                            if (i88 != 0) {
                                iArr2[i74] = i88;
                            } else if (z && bool == null) {
                                bool = bool2;
                            }
                            i69 += i51;
                            i74++;
                            i67 = i76;
                            i55 = i77;
                            i56 = i6;
                        }
                    }
                    i59++;
                    i58 = i64;
                    i52 = i2;
                    i53 = i3;
                    i54 = i54;
                    i55 = i4;
                    i56 = i5;
                } else {
                    i2 = i52;
                    i3 = i53;
                }
                i4 = i55;
                i5 = i56;
                bool3 = bool;
                i59++;
                i58 = i64;
                i52 = i2;
                i53 = i3;
                i54 = i54;
                i55 = i4;
                i56 = i5;
            }
            if (this.f3914s == null) {
                this.f3914s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr4 = this.f3905j;
            int i89 = c0629b.f3872d;
            int i90 = c0629b.f3870b;
            int i91 = c0629b.f3871c;
            int i92 = c0629b.f3869a;
            boolean z3 = this.f3906k == 0;
            int i93 = this.f3913r;
            byte[] bArr10 = this.f3904i;
            int[] iArr5 = this.f3896a;
            byte b3 = -1;
            for (int i94 = 0; i94 < i89; i94++) {
                int i95 = (i94 + i90) * i93;
                int i96 = i95 + i92;
                int i97 = i96 + i91;
                int i98 = i95 + i93;
                if (i98 < i97) {
                    i97 = i98;
                }
                int i99 = c0629b.f3871c * i94;
                while (true) {
                    int i100 = i89;
                    if (i96 < i97) {
                        byte b4 = bArr10[i99];
                        int i101 = i90;
                        int i102 = b4 & 255;
                        if (i102 != b3) {
                            int i103 = iArr5[i102];
                            if (i103 != 0) {
                                iArr4[i96] = i103;
                            } else {
                                b3 = b4;
                            }
                        }
                        i99++;
                        i96++;
                        i89 = i100;
                        i90 = i101;
                    }
                }
            }
            Boolean bool4 = this.f3914s;
            this.f3914s = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || (this.f3914s == null && z3 && b3 != -1));
        }
        if (this.f3909n && ((i7 = c0629b.f3875g) == 0 || i7 == 1)) {
            if (this.f3908m == null) {
                this.f3908m = m2276h();
            }
            Bitmap bitmap3 = this.f3908m;
            int i104 = this.f3913r;
            bitmap3.setPixels(iArr, 0, i104, 0, 0, i104, this.f3912q);
        }
        Bitmap bitmapM2276h = m2276h();
        int i105 = this.f3913r;
        bitmapM2276h.setPixels(iArr, 0, i105, 0, 0, i105, this.f3912q);
        return bitmapM2276h;
    }
}
