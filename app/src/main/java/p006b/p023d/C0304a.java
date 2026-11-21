package p006b.p023d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p006b.p026f.p027a.C0322a;
import p006b.p026f.p027a.C0323b;
import p006b.p026f.p027a.C0326e;
import p006b.p026f.p027a.C0328g;
import p006b.p026f.p027a.p028h.C0330b;
import p006b.p026f.p027a.p028h.C0331c;
import p006b.p026f.p027a.p028h.C0332d;
import p006b.p026f.p027a.p028h.C0333e;
import p006b.p026f.p027a.p028h.C0334f;
import p006b.p026f.p027a.p028h.C0335g;
import p006b.p026f.p027a.p028h.C0336h;
import p006b.p026f.p027a.p028h.C0337i;
import p006b.p026f.p027a.p028h.C0338j;
import p006b.p026f.p027a.p028h.C0340l;

/* JADX INFO: renamed from: b.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0304a {
    /* JADX WARN: Code duplicated, block: B:150:0x0213  */
    /* JADX WARN: Code duplicated, block: B:159:0x0239  */
    /* JADX WARN: Code duplicated, block: B:288:0x0469  */
    /* JADX WARN: Code duplicated, block: B:295:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX INFO: renamed from: a */
    public static void m1193a(C0333e c0333e, C0326e c0326e, int i) {
        int i2;
        C0330b[] c0330bArr;
        int i3;
        int i4;
        C0330b[] c0330bArr2;
        C0326e c0326e2;
        C0332d.a aVar;
        int i5;
        C0330b c0330b;
        boolean z;
        boolean z2;
        boolean z3;
        C0338j c0338j;
        float fM1336b;
        C0332d c0332d;
        boolean z4;
        C0332d c0332d2;
        int i6;
        C0330b[] c0330bArr3;
        C0332d c0332d3;
        C0326e c0326e3 = c0326e;
        C0332d.a aVar2 = C0332d.a.MATCH_CONSTRAINT;
        if (i == 0) {
            i2 = c0333e.f2364m0;
            c0330bArr = c0333e.f2367p0;
            i3 = 0;
        } else {
            i2 = c0333e.f2365n0;
            c0330bArr = c0333e.f2366o0;
            i3 = 2;
        }
        C0333e c0333e2 = c0333e;
        C0326e c0326e4 = c0326e3;
        int i7 = 0;
        while (i7 < i2) {
            C0330b c0330b2 = c0330bArr[i7];
            C0332d c0332d4 = null;
            int i8 = 1;
            if (c0330b2.f2272q) {
                i4 = i2;
                c0330bArr2 = c0330bArr;
                c0326e2 = c0326e4;
            } else {
                int i9 = c0330b2.f2267l * 2;
                C0332d c0332d5 = c0330b2.f2256a;
                C0332d c0332d6 = c0332d5;
                boolean z5 = false;
                while (!z5) {
                    c0330b2.f2264i += i8;
                    C0332d[] c0332dArr = c0332d5.f2337h0;
                    int i10 = c0330b2.f2267l;
                    c0332dArr[i10] = c0332d4;
                    c0332d5.f2335g0[i10] = c0332d4;
                    int i11 = c0332d5.f2320Y;
                    if (i11 == 8) {
                        i6 = i2;
                        c0330bArr3 = c0330bArr;
                        c0326e4 = c0326e4;
                    } else {
                        if (c0330b2.f2257b == null) {
                            c0330b2.f2257b = c0332d5;
                        }
                        c0330b2.f2259d = c0332d5;
                        C0332d.a[] aVarArr = c0332d5.f2298C;
                        if (aVarArr[i10] == aVar2) {
                            int[] iArr = c0332d5.f2334g;
                            i6 = i2;
                            if (iArr[i10] != 0) {
                                c0330bArr3 = c0330bArr;
                                if (iArr[i10] == 3 || iArr[i10] == 2) {
                                }
                            } else {
                                c0330bArr3 = c0330bArr;
                            }
                            c0330b2.f2265j++;
                            float[] fArr = c0332d5.f2333f0;
                            float f = fArr[i10];
                            if (f > 0.0f) {
                                c0330b2.f2266k += fArr[i10];
                            }
                            if (i11 != 8 && aVarArr[i10] == aVar2 && (iArr[i10] == 0 || iArr[i10] == 3)) {
                                if (f < 0.0f) {
                                    c0330b2.f2269n = true;
                                } else {
                                    c0330b2.f2270o = true;
                                }
                                if (c0330b2.f2263h == null) {
                                    c0330b2.f2263h = new ArrayList<>();
                                }
                                c0330b2.f2263h.add(c0332d5);
                            }
                            if (c0330b2.f2261f == null) {
                                c0330b2.f2261f = c0332d5;
                            }
                            C0332d c0332d7 = c0330b2.f2262g;
                            if (c0332d7 != null) {
                                c0332d7.f2335g0[c0330b2.f2267l] = c0332d5;
                            }
                            c0330b2.f2262g = c0332d5;
                        } else {
                            i6 = i2;
                            c0330bArr3 = c0330bArr;
                        }
                        c0326e4 = c0326e4;
                    }
                    C0332d c0332d8 = c0332d6;
                    if (c0332d8 != c0332d5) {
                        c0332d8.f2337h0[c0330b2.f2267l] = c0332d5;
                    }
                    C0331c c0331c = c0332d5.f2296A[i9 + 1].f2276d;
                    if (c0331c != null) {
                        c0332d3 = c0331c.f2274b;
                        C0331c[] c0331cArr = c0332d3.f2296A;
                        if (c0331cArr[i9].f2276d == null || c0331cArr[i9].f2276d.f2274b != c0332d5) {
                            c0332d3 = null;
                        }
                    } else {
                        c0332d3 = null;
                    }
                    if (c0332d3 == null) {
                        c0332d3 = c0332d5;
                        z5 = true;
                    }
                    c0332d6 = c0332d5;
                    c0330bArr = c0330bArr3;
                    i2 = i6;
                    c0326e4 = c0326e4;
                    i8 = 1;
                    c0332d4 = null;
                    c0332d5 = c0332d3;
                }
                i4 = i2;
                c0330bArr2 = c0330bArr;
                c0326e2 = c0326e4;
                c0330b2.f2258c = c0332d5;
                if (c0330b2.f2267l == 0 && c0330b2.f2268m) {
                    c0330b2.f2260e = c0332d5;
                } else {
                    c0330b2.f2260e = c0330b2.f2256a;
                }
                c0330b2.f2271p = c0330b2.f2270o && c0330b2.f2269n;
            }
            c0330b2.f2272q = true;
            if (c0333e2.m1369I(4)) {
                C0332d.a aVar3 = C0332d.a.WRAP_CONTENT;
                C0332d c0332d9 = c0330b2.f2256a;
                C0332d c0332d10 = c0330b2.f2258c;
                C0332d c0332d11 = c0330b2.f2257b;
                C0332d c0332d12 = c0330b2.f2259d;
                C0332d c0332d13 = c0330b2.f2260e;
                float f2 = c0330b2.f2266k;
                C0332d.a aVar4 = c0333e2.f2298C[i];
                if (i == 0) {
                    int i12 = c0332d13.f2329d0;
                    boolean z6 = i12 == 0;
                    z2 = i12 == 1;
                    if (i12 == 2) {
                        z = z6;
                        z3 = true;
                    } else {
                        z = z6;
                        z3 = false;
                    }
                } else {
                    int i13 = c0332d13.f2331e0;
                    boolean z7 = i13 == 0;
                    boolean z8 = i13 == 1;
                    if (i13 == 2) {
                        z = z7;
                        z2 = z8;
                        z3 = true;
                    } else {
                        z = z7;
                        z2 = z8;
                        z3 = false;
                    }
                }
                C0332d c0332d14 = c0332d9;
                i5 = i7;
                int i14 = 0;
                int i15 = 0;
                boolean z9 = false;
                float fM1355n = 0.0f;
                float fM1336b2 = 0.0f;
                while (true) {
                    if (z9) {
                        float f3 = f2;
                        C0338j c0338j2 = c0332d9.f2296A[i3].f2273a;
                        int i16 = i3 + 1;
                        C0338j c0338j3 = c0332d10.f2296A[i16].f2273a;
                        aVar = aVar2;
                        C0338j c0338j4 = c0338j2.f2396d;
                        if (c0338j4 != null && (c0338j = c0338j3.f2396d) != null) {
                            C0332d c0332d15 = c0332d10;
                            if (c0338j4.f2408b == 1 && c0338j.f2408b == 1 && (i15 <= 0 || i15 == i14)) {
                                if (z3 || z || z2) {
                                    fM1336b = c0332d11 != null ? c0332d11.f2296A[i3].m1336b() : 0.0f;
                                    if (c0332d12 != null) {
                                        fM1336b += c0332d12.f2296A[i16].m1336b();
                                    }
                                } else {
                                    fM1336b = 0.0f;
                                }
                                float f4 = c0338j2.f2396d.f2399g;
                                float f5 = c0338j3.f2396d.f2399g;
                                float f6 = (f4 < f5 ? f5 - f4 : f4 - f5) - fM1355n;
                                float f7 = -1.0f;
                                if (i15 <= 0 || i15 != i14) {
                                    c0326e = c0326e;
                                    if (f6 < 0.0f) {
                                        z = false;
                                        z2 = false;
                                        z3 = true;
                                    }
                                    if (z3) {
                                        float f8 = f6 - fM1336b;
                                        if (i == 0) {
                                            c0332d = c0332d9;
                                            f7 = c0332d.f2317V;
                                        } else {
                                            c0332d = c0332d9;
                                            if (i == 1) {
                                                f7 = c0332d.f2318W;
                                            }
                                        }
                                        float fM1336b3 = (f8 * f7) + f4;
                                        while (true) {
                                            C0332d c0332d16 = c0332d;
                                            if (c0332d16 == null) {
                                                break;
                                            }
                                            c0332d = c0332d16.f2337h0[i];
                                            if (c0332d != null || c0332d16 == c0332d15) {
                                                int iM1355n = i == 0 ? c0332d16.m1355n() : c0332d16.m1349h();
                                                float fM1336b4 = fM1336b3 + c0332d16.f2296A[i3].m1336b();
                                                c0332d16.f2296A[i3].f2273a.m1385j(c0338j2.f2398f, fM1336b4);
                                                float f9 = fM1336b4 + iM1355n;
                                                c0332d16.f2296A[i16].f2273a.m1385j(c0338j2.f2398f, f9);
                                                c0332d16.f2296A[i3].f2273a.m1380e(c0326e);
                                                c0332d16.f2296A[i16].f2273a.m1380e(c0326e);
                                                fM1336b3 = f9 + c0332d16.f2296A[i16].m1336b();
                                            }
                                        }
                                    } else {
                                        C0332d c0332d17 = c0332d9;
                                        if (z || z2) {
                                            if (z || z2) {
                                                f6 -= fM1336b;
                                            }
                                            float f10 = f6 / (i14 + 1);
                                            if (z2) {
                                                f10 = f6 / (i14 > 1 ? i14 - 1 : 2.0f);
                                            }
                                            float fM1336b5 = c0332d17.f2320Y != 8 ? f4 + f10 : f4;
                                            if (z2 && i14 > 1) {
                                                fM1336b5 = c0332d11.f2296A[i3].m1336b() + f4;
                                            }
                                            if (z && c0332d11 != null) {
                                                fM1336b5 += c0332d11.f2296A[i3].m1336b();
                                            }
                                            while (true) {
                                                C0332d c0332d18 = c0332d17;
                                                while (true) {
                                                    if (c0332d18 == null) {
                                                        break;
                                                    }
                                                    c0332d17 = c0332d18.f2337h0[i];
                                                    if (c0332d17 != null || c0332d18 == c0332d15) {
                                                        float fM1355n2 = i == 0 ? c0332d18.m1355n() : c0332d18.m1349h();
                                                        if (c0332d18 != c0332d11) {
                                                            fM1336b5 += c0332d18.f2296A[i3].m1336b();
                                                        }
                                                        c0332d18.f2296A[i3].f2273a.m1385j(c0338j2.f2398f, fM1336b5);
                                                        c0332d18.f2296A[i16].f2273a.m1385j(c0338j2.f2398f, fM1336b5 + fM1355n2);
                                                        c0332d18.f2296A[i3].f2273a.m1380e(c0326e);
                                                        c0332d18.f2296A[i16].f2273a.m1380e(c0326e);
                                                        float fM1336b6 = fM1355n2 + c0332d18.f2296A[i16].m1336b() + fM1336b5;
                                                        if (c0332d17 != null && c0332d17.f2320Y != 8) {
                                                            fM1336b6 += f10;
                                                        }
                                                        c0332d18 = c0332d17;
                                                        fM1336b5 = fM1336b6;
                                                    }
                                                }
                                            }
                                        }
                                        z4 = true;
                                        c0333e2 = c0333e;
                                        c0326e4 = c0326e;
                                        if (!z4) {
                                            c0330b = c0330b2;
                                        }
                                        i7 = i5 + 1;
                                        c0326e3 = c0326e;
                                        aVar2 = aVar;
                                        c0330bArr = c0330bArr2;
                                        i2 = i4;
                                    }
                                } else {
                                    C0332d c0332d19 = c0332d14.f2299D;
                                    if (c0332d19 == null || c0332d19.f2298C[i] != aVar3) {
                                        float f11 = (f6 + fM1355n) - fM1336b2;
                                        float fM1336b7 = f4;
                                        C0332d c0332d20 = c0332d9;
                                        while (c0332d20 != null) {
                                            C0332d c0332d21 = c0332d20.f2337h0[i];
                                            C0332d c0332d22 = c0332d15;
                                            if (c0332d21 != null || c0332d20 == c0332d22) {
                                                float f12 = f11 / i15;
                                                if (f3 > 0.0f) {
                                                    float[] fArr2 = c0332d20.f2333f0;
                                                    f12 = fArr2[i] == -1.0f ? 0.0f : (fArr2[i] * f11) / f3;
                                                }
                                                if (c0332d20.f2320Y == 8) {
                                                    f12 = 0.0f;
                                                }
                                                float fM1336b8 = fM1336b7 + c0332d20.f2296A[i3].m1336b();
                                                c0332d20.f2296A[i3].f2273a.m1385j(c0338j2.f2398f, fM1336b8);
                                                float f13 = fM1336b8 + f12;
                                                c0332d20.f2296A[i16].f2273a.m1385j(c0338j2.f2398f, f13);
                                                c0332d20.f2296A[i3].f2273a.m1380e(c0326e);
                                                c0332d20.f2296A[i16].f2273a.m1380e(c0326e);
                                                fM1336b7 = f13 + c0332d20.f2296A[i16].m1336b();
                                            }
                                            c0332d20 = c0332d21;
                                            c0332d15 = c0332d22;
                                        }
                                        c0326e = c0326e;
                                    }
                                }
                                z4 = true;
                                c0333e2 = c0333e;
                                c0326e4 = c0326e;
                                if (!z4) {
                                    c0330b = c0330b2;
                                }
                                i7 = i5 + 1;
                                c0326e3 = c0326e;
                                aVar2 = aVar;
                                c0330bArr = c0330bArr2;
                                i2 = i4;
                            }
                        }
                    } else {
                        float f14 = f2;
                        if (c0332d14.f2320Y != 8) {
                            i14++;
                            fM1355n += i == 0 ? c0332d14.m1355n() : c0332d14.m1349h();
                            if (c0332d14 != c0332d11) {
                                fM1355n += c0332d14.f2296A[i3].m1336b();
                            }
                            if (c0332d14 != c0332d12) {
                                fM1355n += c0332d14.f2296A[i3 + 1].m1336b();
                            }
                            fM1336b2 = fM1336b2 + c0332d14.f2296A[i3].m1336b() + c0332d14.f2296A[i3 + 1].m1336b();
                        }
                        C0331c[] c0331cArr2 = c0332d14.f2296A;
                        C0331c c0331c2 = c0331cArr2[i3];
                        int i17 = i14;
                        if (c0332d14.f2320Y != 8 && c0332d14.f2298C[i] == aVar2) {
                            i15++;
                            if (i == 0) {
                                if (c0332d14.f2330e == 0 && c0332d14.f2336h == 0 && c0332d14.f2338i == 0) {
                                    if (c0332d14.f2302G != 0.0f) {
                                    }
                                }
                            } else if (c0332d14.f2332f == 0 && c0332d14.f2340k == 0 && c0332d14.f2341l == 0) {
                                if (c0332d14.f2302G != 0.0f) {
                                }
                            }
                            aVar = aVar2;
                        }
                        C0331c c0331c3 = c0331cArr2[i3 + 1].f2276d;
                        if (c0331c3 != null) {
                            c0332d2 = c0331c3.f2274b;
                            C0331c[] c0331cArr3 = c0332d2.f2296A;
                            if (c0331cArr3[i3].f2276d == null || c0331cArr3[i3].f2276d.f2274b != c0332d14) {
                                c0332d2 = null;
                            }
                        } else {
                            c0332d2 = null;
                        }
                        if (c0332d2 != null) {
                            c0332d14 = c0332d2;
                        } else {
                            z9 = true;
                        }
                        f2 = f14;
                        i14 = i17;
                    }
                    z4 = false;
                    c0333e2 = c0333e;
                    c0326e4 = c0326e;
                    if (!z4) {
                        c0330b = c0330b2;
                    }
                    i7 = i5 + 1;
                    c0326e3 = c0326e;
                    aVar2 = aVar;
                    c0330bArr = c0330bArr2;
                    i2 = i4;
                }
            } else {
                c0326e = c0326e3;
                aVar = aVar2;
                i5 = i7;
                c0330b = c0330b2;
                c0326e4 = c0326e2;
            }
            m1194b(c0333e2, c0326e4, i, i3, c0330b);
            i7 = i5 + 1;
            c0326e3 = c0326e;
            aVar2 = aVar;
            c0330bArr = c0330bArr2;
            i2 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:120:0x0239  */
    /* JADX WARN: Code duplicated, block: B:123:0x0257  */
    /* JADX WARN: Code duplicated, block: B:167:0x0307  */
    /* JADX WARN: Code duplicated, block: B:183:0x034c  */
    /* JADX WARN: Code duplicated, block: B:184:0x035e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0366  */
    /* JADX WARN: Code duplicated, block: B:187:0x0369  */
    /* JADX WARN: Code duplicated, block: B:190:0x0373  */
    /* JADX WARN: Code duplicated, block: B:192:0x037a  */
    /* JADX WARN: Code duplicated, block: B:25:0x003e A[PHI: r14 r15
      0x003e: PHI (r14v3 boolean) = (r14v1 boolean), (r14v28 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r15v3 boolean) = (r15v1 boolean), (r15v35 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[PHI: r14 r15
      0x0040: PHI (r14v26 boolean) = (r14v1 boolean), (r14v28 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r15v33 boolean) = (r15v1 boolean), (r15v35 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0, types: [b.f.a.e] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [b.f.a.g] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [b.f.a.h.d] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX INFO: renamed from: b */
    public static void m1194b(C0333e c0333e, C0326e c0326e, int i, int i2, C0330b c0330b) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        C0332d c0332d;
        int i3;
        int i4;
        C0328g c0328g;
        C0331c c0331c;
        C0328g c0328g2;
        C0331c c0331c2;
        int iM1336b;
        int i5;
        int iM1336b2;
        C0331c c0331c3;
        C0328g c0328g3;
        C0328g c0328g4;
        C0328g c0328g5;
        int size;
        C0328g c0328g6;
        C0328g c0328g7;
        C0328g c0328g8;
        C0323b c0323bM1315m;
        C0322a c0322a;
        float f;
        int i6;
        int i7;
        C0330b c0330b2 = c0330b;
        C0332d c0332d2 = c0330b2.f2256a;
        C0332d c0332d3 = c0330b2.f2258c;
        C0332d c0332d4 = c0330b2.f2257b;
        C0332d c0332d5 = c0330b2.f2259d;
        C0332d c0332d6 = c0330b2.f2260e;
        float f2 = c0330b2.f2266k;
        boolean z4 = c0333e.f2298C[i] == C0332d.a.WRAP_CONTENT;
        if (i == 0) {
            int i8 = c0332d6.f2329d0;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i9 = c0332d6.f2331e0;
            z = i9 == 0;
            z2 = i9 == 1;
            if (i9 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        C0332d r7 = c0332d2;
        boolean z5 = false;
        while (true) {
            obj = null;
            if (z5) {
                break;
            }
            C0331c c0331c4 = r7.f2296A[i2];
            int i10 = (z4 || z3) ? 1 : 4;
            int iM1336b3 = c0331c4.m1336b();
            float f3 = f2;
            C0331c c0331c5 = c0331c4.f2276d;
            if (c0331c5 != null && r7 != c0332d2) {
                iM1336b3 = c0331c5.m1336b() + iM1336b3;
            }
            int i11 = iM1336b3;
            if (!z3 || r7 == c0332d2 || r7 == c0332d4) {
                i6 = (z && z4) ? 4 : i10;
            } else {
                i6 = 6;
            }
            C0331c c0331c6 = c0331c4.f2276d;
            if (c0331c6 != null) {
                if (r7 == c0332d4) {
                    c0326e.m1308f(c0331c4.f2281i, c0331c6.f2281i, i11, 5);
                } else {
                    c0326e.m1308f(c0331c4.f2281i, c0331c6.f2281i, i11, 6);
                }
                c0326e.m1306d(c0331c4.f2281i, c0331c4.f2276d.f2281i, i11, i6);
            } else {
                c0332d6 = c0332d6;
                z = z;
            }
            if (z4) {
                if (r7.f2320Y == 8 || r7.f2298C[i] != C0332d.a.MATCH_CONSTRAINT) {
                    i7 = 0;
                } else {
                    C0331c[] c0331cArr = r7.f2296A;
                    i7 = 0;
                    c0326e.m1308f(c0331cArr[i2 + 1].f2281i, c0331cArr[i2].f2281i, 0, 5);
                }
                c0326e.m1308f(r7.f2296A[i2].f2281i, c0333e.f2296A[i2].f2281i, i7, 6);
            }
            C0331c c0331c7 = r7.f2296A[i2 + 1].f2276d;
            if (c0331c7 != null) {
                C0332d c0332d7 = c0331c7.f2274b;
                C0331c[] c0331cArr2 = c0332d7.f2296A;
                if (c0331cArr2[i2].f2276d != null && c0331cArr2[i2].f2276d.f2274b == r7) {
                    obj = c0332d7;
                }
            }
            if (obj != null) {
                r7 = obj;
                z5 = z5;
            } else {
                z5 = true;
            }
            z2 = z2;
            f2 = f3;
            z = z;
            c0332d6 = c0332d6;
            r7 = r7;
        }
        C0332d c0332d8 = c0332d6;
        float f4 = f2;
        boolean z6 = z;
        boolean z7 = z2;
        if (c0332d5 != null) {
            C0331c[] c0331cArr3 = c0332d3.f2296A;
            int i12 = i2 + 1;
            if (c0331cArr3[i12].f2276d != null) {
                C0331c c0331c8 = c0332d5.f2296A[i12];
                c0326e.m1309g(c0331c8.f2281i, c0331cArr3[i12].f2276d.f2281i, -c0331c8.m1336b(), 5);
            }
        }
        if (z4) {
            int i13 = i2 + 1;
            C0328g c0328g9 = c0333e.f2296A[i13].f2281i;
            C0331c[] c0331cArr4 = c0332d3.f2296A;
            c0326e.m1308f(c0328g9, c0331cArr4[i13].f2281i, c0331cArr4[i13].m1336b(), 6);
        }
        ArrayList<C0332d> arrayList = c0330b2.f2263h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!c0330b2.f2269n || c0330b2.f2271p) ? f4 : c0330b2.f2265j;
            float f6 = 0.0f;
            C0332d c0332d9 = null;
            int i14 = 0;
            float f7 = 0.0f;
            while (i14 < size) {
                C0332d c0332d10 = arrayList.get(i14);
                float f8 = c0332d10.f2333f0[i];
                ArrayList<C0332d> arrayList2 = arrayList;
                if (f8 < f6) {
                    if (c0330b2.f2271p) {
                        C0331c[] c0331cArr5 = c0332d10.f2296A;
                        c0326e.m1306d(c0331cArr5[i2 + 1].f2281i, c0331cArr5[i2].f2281i, 0, 4);
                    } else {
                        f8 = 1.0f;
                        if (f8 == 0.0f) {
                            C0331c[] c0331cArr6 = c0332d10.f2296A;
                            c0326e.m1306d(c0331cArr6[i2 + 1].f2281i, c0331cArr6[i2].f2281i, 0, 6);
                        } else {
                            if (c0332d9 != null) {
                                C0331c[] c0331cArr7 = c0332d9.f2296A;
                                c0328g6 = c0331cArr7[i2].f2281i;
                                int i15 = i2 + 1;
                                c0328g7 = c0331cArr7[i15].f2281i;
                                C0331c[] c0331cArr8 = c0332d10.f2296A;
                                C0328g c0328g10 = c0331cArr8[i2].f2281i;
                                c0328g8 = c0331cArr8[i15].f2281i;
                                c0323bM1315m = c0326e.m1315m();
                                c0323bM1315m.f2214b = 0.0f;
                                if (f5 != 0.0f) {
                                    c0323bM1315m.f2215c.m1294h(c0328g6, 1.0f);
                                    c0323bM1315m.f2215c.m1294h(c0328g7, -1.0f);
                                    c0323bM1315m.f2215c.m1294h(c0328g8, 1.0f);
                                    c0322a = c0323bM1315m.f2215c;
                                    f = -1.0f;
                                    c0322a.m1294h(c0328g10, f);
                                } else {
                                    c0323bM1315m.f2215c.m1294h(c0328g6, 1.0f);
                                    c0323bM1315m.f2215c.m1294h(c0328g7, -1.0f);
                                    c0323bM1315m.f2215c.m1294h(c0328g8, 1.0f);
                                    c0322a = c0323bM1315m.f2215c;
                                    f = -1.0f;
                                    c0322a.m1294h(c0328g10, f);
                                }
                                c0326e.m1305c(c0323bM1315m);
                            }
                            f7 = f8;
                            c0332d9 = c0332d10;
                        }
                    }
                    size = size;
                    c0332d3 = c0332d3;
                } else if (f8 == 0.0f) {
                    C0331c[] c0331cArr9 = c0332d10.f2296A;
                    c0326e.m1306d(c0331cArr9[i2 + 1].f2281i, c0331cArr9[i2].f2281i, 0, 6);
                    size = size;
                    c0332d3 = c0332d3;
                } else {
                    if (c0332d9 != null) {
                        C0331c[] c0331cArr10 = c0332d9.f2296A;
                        c0328g6 = c0331cArr10[i2].f2281i;
                        int i16 = i2 + 1;
                        c0328g7 = c0331cArr10[i16].f2281i;
                        C0331c[] c0331cArr11 = c0332d10.f2296A;
                        C0328g c0328g11 = c0331cArr11[i2].f2281i;
                        c0328g8 = c0331cArr11[i16].f2281i;
                        c0323bM1315m = c0326e.m1315m();
                        c0323bM1315m.f2214b = 0.0f;
                        if (f5 != 0.0f || f7 == f8) {
                            c0323bM1315m.f2215c.m1294h(c0328g6, 1.0f);
                            c0323bM1315m.f2215c.m1294h(c0328g7, -1.0f);
                            c0323bM1315m.f2215c.m1294h(c0328g8, 1.0f);
                            c0322a = c0323bM1315m.f2215c;
                            f = -1.0f;
                        } else {
                            if (f7 == 0.0f) {
                                c0323bM1315m.f2215c.m1294h(c0328g6, 1.0f);
                                c0323bM1315m.f2215c.m1294h(c0328g7, -1.0f);
                            } else if (f8 == 0.0f) {
                                c0323bM1315m.f2215c.m1294h(c0328g11, 1.0f);
                                c0323bM1315m.f2215c.m1294h(c0328g8, -1.0f);
                            } else {
                                float f9 = (f7 / f5) / (f8 / f5);
                                c0323bM1315m.f2215c.m1294h(c0328g6, 1.0f);
                                c0323bM1315m.f2215c.m1294h(c0328g7, -1.0f);
                                c0323bM1315m.f2215c.m1294h(c0328g8, f9);
                                c0322a = c0323bM1315m.f2215c;
                                f = -f9;
                            }
                            c0326e.m1305c(c0323bM1315m);
                        }
                        c0322a.m1294h(c0328g11, f);
                        c0326e.m1305c(c0323bM1315m);
                    }
                    f7 = f8;
                    c0332d9 = c0332d10;
                }
                i14++;
                c0330b2 = c0330b;
                arrayList = arrayList2;
                size = size;
                c0332d3 = c0332d3;
                f6 = 0.0f;
            }
        }
        C0332d c0332d11 = c0332d3;
        if (c0332d4 == null || !(c0332d4 == c0332d5 || z3)) {
            c0332d = c0332d11;
            if (!z6 || c0332d4 == null) {
                int i17 = 8;
                if (z7 && c0332d4 != null) {
                    int i18 = c0330b.f2265j;
                    boolean z8 = i18 > 0 && c0330b.f2264i == i18;
                    C0332d c0332d12 = c0332d4;
                    C0332d c0332d13 = c0332d12;
                    while (c0332d12 != null) {
                        C0332d c0332d14 = c0332d12.f2337h0[i];
                        while (c0332d14 != null && c0332d14.f2320Y == i17) {
                            c0332d14 = c0332d14.f2337h0[i];
                        }
                        if (c0332d12 == c0332d4 || c0332d12 == c0332d5 || c0332d14 == null) {
                            c0332d13 = c0332d13;
                            i4 = 8;
                        } else {
                            C0332d c0332d15 = c0332d14 == c0332d5 ? null : c0332d14;
                            C0331c c0331c9 = c0332d12.f2296A[i2];
                            C0328g c0328g12 = c0331c9.f2281i;
                            C0331c c0331c10 = c0331c9.f2276d;
                            int i19 = i2 + 1;
                            C0328g c0328g13 = c0332d13.f2296A[i19].f2281i;
                            int iM1336b4 = c0331c9.m1336b();
                            int iM1336b5 = c0332d12.f2296A[i19].m1336b();
                            if (c0332d15 != null) {
                                c0331c = c0332d15.f2296A[i2];
                                c0328g2 = c0331c.f2281i;
                                C0331c c0331c11 = c0331c.f2276d;
                                c0328g = c0331c11 != null ? c0331c11.f2281i : null;
                            } else {
                                C0331c[] c0331cArr12 = c0332d12.f2296A;
                                C0331c c0331c12 = c0331cArr12[i19].f2276d;
                                C0328g c0328g14 = c0331c12 != null ? c0331c12.f2281i : null;
                                c0328g = c0331cArr12[i19].f2281i;
                                c0331c = c0331c12;
                                c0328g2 = c0328g14;
                            }
                            int iM1336b6 = c0331c != null ? c0331c.m1336b() + iM1336b5 : iM1336b5;
                            int iM1336b7 = c0332d13.f2296A[i19].m1336b() + iM1336b4;
                            int i20 = z8 ? 6 : 4;
                            if (c0328g12 == null || c0328g13 == null || c0328g2 == null || c0328g == null) {
                                i4 = 8;
                            } else {
                                i4 = 8;
                                c0326e.m1304b(c0328g12, c0328g13, iM1336b7, 0.5f, c0328g2, c0328g, iM1336b6, i20);
                            }
                            c0332d14 = c0332d15;
                        }
                        if (c0332d12.f2320Y == i4) {
                            c0332d12 = c0332d13;
                        }
                        c0332d13 = c0332d12;
                        i17 = 8;
                        c0332d12 = c0332d14;
                    }
                    C0331c c0331c13 = c0332d4.f2296A[i2];
                    C0331c c0331c14 = c0332d2.f2296A[i2].f2276d;
                    int i21 = i2 + 1;
                    C0331c c0331c15 = c0332d5.f2296A[i21];
                    C0331c c0331c16 = c0332d.f2296A[i21].f2276d;
                    if (c0331c14 == null) {
                        i3 = 5;
                    } else if (c0332d4 != c0332d5) {
                        i3 = 5;
                        c0326e.m1306d(c0331c13.f2281i, c0331c14.f2281i, c0331c13.m1336b(), 5);
                    } else {
                        i3 = 5;
                        if (c0331c16 != null) {
                            c0326e.m1304b(c0331c13.f2281i, c0331c14.f2281i, c0331c13.m1336b(), 0.5f, c0331c15.f2281i, c0331c16.f2281i, c0331c15.m1336b(), 5);
                        }
                    }
                    if (c0331c16 != null && c0332d4 != c0332d5) {
                        c0326e.m1306d(c0331c15.f2281i, c0331c16.f2281i, -c0331c15.m1336b(), i3);
                    }
                }
            } else {
                int i22 = c0330b.f2265j;
                boolean z9 = i22 > 0 && c0330b.f2264i == i22;
                C0332d c0332d16 = c0332d4;
                C0332d c0332d17 = c0332d16;
                while (c0332d16 != null) {
                    C0332d c0332d18 = c0332d16.f2337h0[i];
                    while (c0332d18 != null && c0332d18.f2320Y == 8) {
                        c0332d18 = c0332d18.f2337h0[i];
                    }
                    if (c0332d18 != null || c0332d16 == c0332d5) {
                        C0331c c0331c17 = c0332d16.f2296A[i2];
                        C0328g c0328g15 = c0331c17.f2281i;
                        C0331c c0331c18 = c0331c17.f2276d;
                        C0328g c0328g16 = c0331c18 != null ? c0331c18.f2281i : null;
                        if (c0332d17 != c0332d16) {
                            c0331c2 = c0332d17.f2296A[i2 + 1];
                        } else {
                            if (c0332d16 == c0332d4 && c0332d17 == c0332d16) {
                                C0331c[] c0331cArr13 = c0332d2.f2296A;
                                if (c0331cArr13[i2].f2276d != null) {
                                    c0331c2 = c0331cArr13[i2].f2276d;
                                } else {
                                    c0328g16 = null;
                                }
                            }
                            iM1336b = c0331c17.m1336b();
                            i5 = i2 + 1;
                            iM1336b2 = c0332d16.f2296A[i5].m1336b();
                            if (c0332d18 != null) {
                                c0331c3 = c0332d18.f2296A[i2];
                                C0328g c0328g17 = c0331c3.f2281i;
                                c0328g4 = c0332d16.f2296A[i5].f2281i;
                                c0328g3 = c0328g17;
                            } else {
                                c0331c3 = c0332d.f2296A[i5].f2276d;
                                if (c0331c3 != null) {
                                    c0328g3 = c0331c3.f2281i;
                                } else {
                                    c0328g3 = null;
                                }
                                c0328g4 = c0332d16.f2296A[i5].f2281i;
                            }
                            if (c0331c3 != null) {
                                iM1336b2 += c0331c3.m1336b();
                            }
                            if (c0332d17 != null) {
                                iM1336b += c0332d17.f2296A[i5].m1336b();
                            }
                            if (c0328g15 == null && c0328g16 != null && c0328g3 != null && c0328g4 != null) {
                                if (c0332d16 == c0332d4) {
                                    iM1336b = c0332d4.f2296A[i2].m1336b();
                                }
                                c0326e.m1304b(c0328g15, c0328g16, iM1336b, 0.5f, c0328g3, c0328g4, c0332d16 == c0332d5 ? c0332d5.f2296A[i5].m1336b() : iM1336b2, z9 ? 6 : 4);
                            }
                        }
                        c0328g16 = c0331c2.f2281i;
                        iM1336b = c0331c17.m1336b();
                        i5 = i2 + 1;
                        iM1336b2 = c0332d16.f2296A[i5].m1336b();
                        if (c0332d18 != null) {
                            c0331c3 = c0332d18.f2296A[i2];
                            C0328g c0328g18 = c0331c3.f2281i;
                            c0328g4 = c0332d16.f2296A[i5].f2281i;
                            c0328g3 = c0328g18;
                        } else {
                            c0331c3 = c0332d.f2296A[i5].f2276d;
                            if (c0331c3 != null) {
                                c0328g3 = c0331c3.f2281i;
                            } else {
                                c0328g3 = null;
                            }
                            c0328g4 = c0332d16.f2296A[i5].f2281i;
                        }
                        if (c0331c3 != null) {
                            iM1336b2 += c0331c3.m1336b();
                        }
                        if (c0332d17 != null) {
                            iM1336b += c0332d17.f2296A[i5].m1336b();
                        }
                        if (c0328g15 == null) {
                        }
                    }
                    if (c0332d16.f2320Y != 8) {
                        c0332d17 = c0332d16;
                    }
                    c0332d16 = c0332d18;
                }
            }
        } else {
            C0331c[] c0331cArr14 = c0332d2.f2296A;
            C0331c c0331c19 = c0331cArr14[i2];
            c0332d = c0332d11;
            C0331c[] c0331cArr15 = c0332d.f2296A;
            int i23 = i2 + 1;
            C0331c c0331c20 = c0331cArr15[i23];
            C0328g c0328g19 = c0331cArr14[i2].f2276d != null ? c0331cArr14[i2].f2276d.f2281i : null;
            C0328g c0328g20 = c0331cArr15[i23].f2276d != null ? c0331cArr15[i23].f2276d.f2281i : null;
            if (c0332d4 == c0332d5) {
                C0331c[] c0331cArr16 = c0332d4.f2296A;
                c0331c19 = c0331cArr16[i2];
                c0331c20 = c0331cArr16[i23];
            }
            if (c0328g19 != null && c0328g20 != null) {
                c0326e.m1304b(c0331c19.f2281i, c0328g19, c0331c19.m1336b(), i == 0 ? c0332d8.f2317V : c0332d8.f2318W, c0328g20, c0331c20.f2281i, c0331c20.m1336b(), 5);
            }
        }
        if ((z6 || z7) && c0332d4 != null) {
            C0331c[] c0331cArr17 = c0332d4.f2296A;
            C0331c c0331c21 = c0331cArr17[i2];
            int i24 = i2 + 1;
            C0331c c0331c22 = c0332d5.f2296A[i24];
            C0331c c0331c23 = c0331c21.f2276d;
            C0328g c0328g21 = c0331c23 != null ? c0331c23.f2281i : null;
            C0331c c0331c24 = c0331c22.f2276d;
            if (c0331c24 != null) {
                c0328g5 = c0331c24.f2281i;
            } else {
                r5 = 0;
            }
            if (c0332d != c0332d5) {
                C0331c c0331c25 = c0332d.f2296A[i24].f2276d;
                if (c0331c25 != null) {
                    r5 = c0328g5;
                    obj = c0331c25.f2281i;
                }
                r5 = c0328g5;
                r5 = obj;
            }
            if (c0332d4 == c0332d5) {
                c0331c21 = c0331cArr17[i2];
                c0331c22 = c0331cArr17[i24];
            }
            if (c0328g21 == null || r5 == 0) {
                return;
            }
            c0326e.m1304b(c0331c21.f2281i, c0328g21, c0331c21.m1336b(), 0.5f, r5, c0331c22.f2281i, c0332d5.f2296A[i24].m1336b(), 5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1195c(C0333e c0333e) {
        C0332d.a aVar = C0332d.a.FIXED;
        if ((c0333e.f2374w0 & 32) != 32) {
            c0333e.f2368q0.clear();
            c0333e.f2368q0.add(0, new C0334f(c0333e.f2419i0));
            return;
        }
        c0333e.f2375x0 = true;
        c0333e.f2369r0 = false;
        c0333e.f2370s0 = false;
        c0333e.f2371t0 = false;
        ArrayList<C0332d> arrayList = c0333e.f2419i0;
        List<C0334f> list = c0333e.f2368q0;
        C0332d.a aVarM1350i = c0333e.m1350i();
        C0332d.a aVar2 = C0332d.a.WRAP_CONTENT;
        boolean z = aVarM1350i == aVar2;
        boolean z2 = c0333e.m1354m() == aVar2;
        boolean z3 = z || z2;
        list.clear();
        for (C0332d c0332d : arrayList) {
            c0332d.f2345p = null;
            c0332d.f2327c0 = false;
            c0332d.mo1333s();
        }
        for (C0332d c0332d2 : arrayList) {
            if (c0332d2.f2345p == null) {
                C0334f c0334f = new C0334f(new ArrayList(), true);
                list.add(c0334f);
                if (!m1201i(c0332d2, c0334f, list, z3)) {
                    c0333e.f2368q0.clear();
                    c0333e.f2368q0.add(0, new C0334f(c0333e.f2419i0));
                    c0333e.f2375x0 = false;
                    return;
                }
            }
        }
        int iMax = 0;
        int iMax2 = 0;
        for (C0334f c0334f2 : list) {
            iMax = Math.max(iMax, m1196d(c0334f2, 0));
            iMax2 = Math.max(iMax2, m1196d(c0334f2, 1));
        }
        if (z) {
            c0333e.m1364y(aVar);
            c0333e.m1342C(iMax);
            c0333e.f2369r0 = true;
            c0333e.f2370s0 = true;
            c0333e.f2372u0 = iMax;
        }
        if (z2) {
            c0333e.m1341B(aVar);
            c0333e.m1362w(iMax2);
            c0333e.f2369r0 = true;
            c0333e.f2371t0 = true;
            c0333e.f2373v0 = iMax2;
        }
        m1200h(list, 0, c0333e.m1355n());
        m1200h(list, 1, c0333e.m1349h());
    }

    /* JADX INFO: renamed from: d */
    public static int m1196d(C0334f c0334f, int i) {
        int i2 = i * 2;
        Objects.requireNonNull(c0334f);
        List<C0332d> list = i == 0 ? c0334f.f2381d : i == 1 ? c0334f.f2382e : null;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0332d c0332d = list.get(i3);
            C0331c[] c0331cArr = c0332d.f2296A;
            int i4 = i2 + 1;
            iMax = Math.max(iMax, m1197e(c0332d, i, c0331cArr[i4].f2276d == null || !(c0331cArr[i2].f2276d == null || c0331cArr[i4].f2276d == null), 0));
        }
        c0334f.f2380c[i] = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: e */
    public static int m1197e(C0332d c0332d, int i, boolean z, int i2) {
        int iM1349h;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM1355n;
        int i7;
        int i8;
        C0332d c0332d2;
        int iMax = 0;
        if (!c0332d.f2323a0) {
            return 0;
        }
        boolean z2 = c0332d.f2352w.f2276d != null && i == 1;
        if (z) {
            i3 = c0332d.f2312Q;
            iM1349h = c0332d.m1349h() - c0332d.f2312Q;
            i5 = i * 2;
            i4 = i5 + 1;
        } else {
            int iM1349h2 = c0332d.m1349h();
            iM1349h = c0332d.f2312Q;
            i3 = iM1349h2 - iM1349h;
            i4 = i * 2;
            i5 = i4 + 1;
        }
        C0331c[] c0331cArr = c0332d.f2296A;
        if (c0331cArr[i4].f2276d == null || c0331cArr[i5].f2276d != null) {
            i6 = 1;
        } else {
            i6 = -1;
            int i9 = i4;
            i4 = i5;
            i5 = i9;
        }
        int i10 = z2 ? i2 - i3 : i2;
        int iM1198f = m1198f(c0332d, i) + (c0331cArr[i5].m1336b() * i6);
        int i11 = i10 + iM1198f;
        int iM1355n2 = (i == 0 ? c0332d.m1355n() : c0332d.m1349h()) * i6;
        Iterator<C0340l> it = c0332d.f2296A[i5].f2273a.f2407a.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, m1197e(((C0338j) it.next()).f2395c.f2274b, i, z, i11));
        }
        int iMax2 = 0;
        for (Iterator<C0340l> it2 = c0332d.f2296A[i4].f2273a.f2407a.iterator(); it2.hasNext(); it2 = it2) {
            iMax2 = Math.max(iMax2, m1197e(((C0338j) it2.next()).f2395c.f2274b, i, z, iM1355n2 + i11));
        }
        if (z2) {
            iMax -= i3;
            iM1355n = iMax2 + iM1349h;
        } else {
            iM1355n = iMax2 + ((i == 0 ? c0332d.m1355n() : c0332d.m1349h()) * i6);
        }
        if (i == 1) {
            Iterator<C0340l> it3 = c0332d.f2352w.f2273a.f2407a.iterator();
            int iMax3 = 0;
            while (it3.hasNext()) {
                Iterator<C0340l> it4 = it3;
                int i12 = i4;
                iMax3 = Math.max(iMax3, m1197e(((C0338j) it3.next()).f2395c.f2274b, i, z, i6 == 1 ? i3 + i11 : (iM1349h * i6) + i11));
                it3 = it4;
                i4 = i12;
            }
            i7 = i4;
            i8 = (c0332d.f2352w.f2273a.f2407a.size() <= 0 || z2) ? iMax3 : i6 == 1 ? iMax3 + i3 : iMax3 - iM1349h;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int iMax4 = Math.max(iMax, Math.max(iM1355n, i8)) + iM1198f;
        int i13 = iM1355n2 + i11;
        if (i6 == -1) {
            i11 = i13;
            i13 = i11;
        }
        if (z) {
            C0337i.m1378b(c0332d, i, i11);
            c0332d.m1361v(i11, i13, i);
        } else {
            c0332d.f2345p.m1373a(c0332d, i);
            if (i == 0) {
                c0332d.f2306K = i11;
            } else if (i == 1) {
                c0332d.f2307L = i11;
            }
        }
        if (c0332d.m1348g(i) == C0332d.a.MATCH_CONSTRAINT && c0332d.f2302G != 0.0f) {
            c0332d.f2345p.m1373a(c0332d, i);
        }
        C0331c[] c0331cArr2 = c0332d.f2296A;
        if (c0331cArr2[i5].f2276d != null && c0331cArr2[i7].f2276d != null && c0331cArr2[i5].f2276d.f2274b == (c0332d2 = c0332d.f2299D) && c0331cArr2[i7].f2276d.f2274b == c0332d2) {
            c0332d.f2345p.m1373a(c0332d, i);
        }
        return iMax4;
    }

    /* JADX INFO: renamed from: f */
    public static int m1198f(C0332d c0332d, int i) {
        C0331c c0331c;
        int i2 = i * 2;
        C0331c[] c0331cArr = c0332d.f2296A;
        C0331c c0331c2 = c0331cArr[i2];
        C0331c c0331c3 = c0331cArr[i2 + 1];
        C0331c c0331c4 = c0331c2.f2276d;
        if (c0331c4 == null) {
            return 0;
        }
        C0332d c0332d2 = c0331c4.f2274b;
        C0332d c0332d3 = c0332d.f2299D;
        if (c0332d2 != c0332d3 || (c0331c = c0331c3.f2276d) == null || c0331c.f2274b != c0332d3) {
            return 0;
        }
        return (int) ((((c0332d3.m1351j(i) - c0331c2.m1336b()) - c0331c3.m1336b()) - c0332d.m1351j(i)) * (i == 0 ? c0332d.f2317V : c0332d.f2318W));
    }

    /* JADX INFO: renamed from: g */
    public static int m1199g(C0332d c0332d) {
        C0332d.a aVarM1350i = c0332d.m1350i();
        C0332d.a aVar = C0332d.a.MATCH_CONSTRAINT;
        if (aVarM1350i == aVar) {
            int iM1349h = (int) (c0332d.f2303H == 0 ? c0332d.m1349h() * c0332d.f2302G : c0332d.m1349h() / c0332d.f2302G);
            c0332d.m1342C(iM1349h);
            return iM1349h;
        }
        if (c0332d.m1354m() != aVar) {
            return -1;
        }
        int iM1355n = (int) (c0332d.f2303H == 1 ? c0332d.m1355n() * c0332d.f2302G : c0332d.m1355n() / c0332d.f2302G);
        c0332d.m1362w(iM1355n);
        return iM1355n;
    }

    /* JADX INFO: renamed from: h */
    public static void m1200h(List<C0334f> list, int i, int i2) {
        int iM1336b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0334f c0334f = list.get(i3);
            Objects.requireNonNull(c0334f);
            HashSet<C0332d> hashSet = i == 0 ? c0334f.f2383f : i == 1 ? c0334f.f2384g : null;
            for (C0332d c0332d : hashSet) {
                if (c0332d.f2323a0) {
                    int i4 = i * 2;
                    C0331c[] c0331cArr = c0332d.f2296A;
                    C0331c c0331c = c0331cArr[i4];
                    C0331c c0331c2 = c0331cArr[i4 + 1];
                    if ((c0331c.f2276d == null || c0331c2.f2276d == null) ? false : true) {
                        iM1336b = c0331c.m1336b() + m1198f(c0332d, i);
                    } else if (c0332d.f2302G == 0.0f || c0332d.m1348g(i) != C0332d.a.MATCH_CONSTRAINT) {
                        int i5 = i2 - (i == 0 ? c0332d.f2306K : i == 1 ? c0332d.f2307L : 0);
                        iM1336b = i5 - c0332d.m1351j(i);
                        c0332d.m1361v(iM1336b, i5, i);
                    } else {
                        int iM1199g = m1199g(c0332d);
                        int i6 = (int) c0332d.f2296A[i4].f2273a.f2399g;
                        C0338j c0338j = c0331c2.f2273a;
                        c0338j.f2398f = c0331c.f2273a;
                        c0338j.f2399g = iM1199g;
                        c0338j.f2408b = 1;
                        c0332d.m1361v(i6, i6 + iM1199g, i);
                    }
                    C0337i.m1378b(c0332d, i, iM1336b);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:134:0x018e A[LOOP:0: B:129:0x017f->B:134:0x018e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:164:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX INFO: renamed from: i */
    public static boolean m1201i(C0332d c0332d, C0334f c0334f, List<C0334f> list, boolean z) {
        C0332d.a aVarM1350i;
        C0332d.a aVar;
        boolean z2;
        boolean z3;
        C0331c c0331c;
        C0331c c0331c2;
        C0332d c0332d2;
        C0332d c0332d3;
        C0331c c0331c3;
        C0331c c0331c4;
        C0332d c0332d4;
        C0332d c0332d5;
        int length;
        int i;
        C0331c c0331c5;
        C0336h c0336h;
        int i2;
        C0332d c0332d6;
        C0332d c0332d7;
        if (c0332d == null) {
            return true;
        }
        c0332d.f2325b0 = false;
        C0333e c0333e = (C0333e) c0332d.f2299D;
        C0334f c0334f2 = c0332d.f2345p;
        if (c0334f2 != null) {
            if (c0334f2 != c0334f) {
                c0334f.f2378a.addAll(c0334f2.f2378a);
                c0334f.f2381d.addAll(c0332d.f2345p.f2381d);
                c0334f.f2382e.addAll(c0332d.f2345p.f2382e);
                C0334f c0334f3 = c0332d.f2345p;
                if (!c0334f3.f2379b) {
                    c0334f.f2379b = false;
                }
                list.remove(c0334f3);
                Iterator<C0332d> it = c0332d.f2345p.f2378a.iterator();
                while (it.hasNext()) {
                    it.next().f2345p = c0334f;
                }
            }
            return true;
        }
        c0332d.f2323a0 = true;
        c0334f.f2378a.add(c0332d);
        c0332d.f2345p = c0334f;
        if (c0332d.f2348s.f2276d == null && c0332d.f2350u.f2276d == null && c0332d.f2349t.f2276d == null && c0332d.f2351v.f2276d == null && c0332d.f2352w.f2276d == null && c0332d.f2355z.f2276d == null) {
            c0334f.f2379b = false;
            c0333e.f2375x0 = false;
            c0332d.f2323a0 = false;
            if (z) {
                return false;
            }
        }
        if (c0332d.f2349t.f2276d == null || c0332d.f2351v.f2276d == null) {
            if (c0332d.f2348s.f2276d != null && c0332d.f2350u.f2276d != null) {
                c0333e.m1350i();
                if (!z) {
                    c0332d6 = c0332d.f2348s.f2276d.f2274b;
                    c0332d7 = c0332d.f2299D;
                    if (c0332d6 == c0332d7 || c0332d.f2350u.f2276d.f2274b != c0332d7) {
                        c0334f.f2379b = false;
                        c0333e.f2375x0 = false;
                        c0332d.f2323a0 = false;
                    }
                }
            }
            aVarM1350i = c0332d.m1350i();
            aVar = C0332d.a.MATCH_CONSTRAINT;
            if (aVarM1350i == aVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c0332d.m1354m() == aVar) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!(z2 ^ z3) && c0332d.f2302G != 0.0f) {
                m1199g(c0332d);
            } else if (c0332d.m1350i() != aVar || c0332d.m1354m() == aVar) {
                c0334f.f2379b = false;
                c0333e.f2375x0 = false;
                c0332d.f2323a0 = false;
                if (z) {
                    return false;
                }
            }
            c0331c = c0332d.f2348s.f2276d;
            if ((c0331c == null || c0332d.f2350u.f2276d != null) && !((c0331c != null && c0331c.f2274b == c0332d.f2299D && c0332d.f2350u.f2276d == null) || ((c0331c2 = c0332d.f2350u.f2276d) != null && c0331c2.f2274b == c0332d.f2299D && c0331c == null))) {
                if (c0331c != null) {
                    c0332d2 = c0331c.f2274b;
                    c0332d3 = c0332d.f2299D;
                    if (c0332d2 == c0332d3 && c0331c2 != null && c0331c2.f2274b == c0332d3) {
                        if (c0332d.f2355z.f2276d == null && !(c0332d instanceof C0335g) && !(c0332d instanceof C0336h)) {
                            c0334f.f2381d.add(c0332d);
                        }
                    }
                }
            } else if (c0332d.f2355z.f2276d == null) {
                c0334f.f2381d.add(c0332d);
            }
            c0331c3 = c0332d.f2349t.f2276d;
            if ((c0331c3 == null || c0332d.f2351v.f2276d != null) && !((c0331c3 != null && c0331c3.f2274b == c0332d.f2299D && c0332d.f2351v.f2276d == null) || ((c0331c4 = c0332d.f2351v.f2276d) != null && c0331c4.f2274b == c0332d.f2299D && c0331c3 == null))) {
                if (c0331c3 != null) {
                    c0332d4 = c0331c3.f2274b;
                    c0332d5 = c0332d.f2299D;
                    if (c0332d4 == c0332d5 && c0331c4 != null && c0331c4.f2274b == c0332d5) {
                        if (c0332d.f2355z.f2276d == null && c0332d.f2352w.f2276d == null && !(c0332d instanceof C0335g) && !(c0332d instanceof C0336h)) {
                            c0334f.f2382e.add(c0332d);
                        }
                    }
                }
            } else if (c0332d.f2355z.f2276d == null) {
                c0334f.f2382e.add(c0332d);
            }
            if (c0332d instanceof C0336h) {
                c0334f.f2379b = false;
                c0333e.f2375x0 = false;
                c0332d.f2323a0 = false;
                if (z) {
                    return false;
                }
                c0336h = (C0336h) c0332d;
                for (i2 = 0; i2 < c0336h.f2393j0; i2++) {
                    if (!m1201i(c0336h.f2392i0[i2], c0334f, list, z)) {
                        return false;
                    }
                }
            }
            length = c0332d.f2296A.length;
            for (i = 0; i < length; i++) {
                C0331c c0331c6 = c0332d.f2296A[i];
                c0331c5 = c0331c6.f2276d;
                if (c0331c5 == null && c0331c5.f2274b != c0332d.f2299D) {
                    if (c0331c6.f2275c == C0331c.b.CENTER) {
                        c0334f.f2379b = false;
                        c0333e.f2375x0 = false;
                        c0332d.f2323a0 = false;
                        if (z) {
                            return false;
                        }
                    } else {
                        C0338j c0338j = c0331c6.f2273a;
                        if (c0331c5.f2276d != c0331c6) {
                            c0331c5.f2273a.f2407a.add(c0338j);
                        }
                    }
                    if (!m1201i(c0331c6.f2276d.f2274b, c0334f, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        c0333e.m1354m();
        if (!z) {
            C0332d c0332d8 = c0332d.f2349t.f2276d.f2274b;
            C0332d c0332d9 = c0332d.f2299D;
            if (c0332d8 != c0332d9 || c0332d.f2351v.f2276d.f2274b != c0332d9) {
                c0334f.f2379b = false;
                c0333e.f2375x0 = false;
                c0332d.f2323a0 = false;
            }
            if (c0332d.f2348s.f2276d != null) {
                c0333e.m1350i();
                if (!z) {
                    c0332d6 = c0332d.f2348s.f2276d.f2274b;
                    c0332d7 = c0332d.f2299D;
                    if (c0332d6 == c0332d7) {
                        c0334f.f2379b = false;
                        c0333e.f2375x0 = false;
                        c0332d.f2323a0 = false;
                    } else {
                        c0334f.f2379b = false;
                        c0333e.f2375x0 = false;
                        c0332d.f2323a0 = false;
                    }
                }
            }
            aVarM1350i = c0332d.m1350i();
            aVar = C0332d.a.MATCH_CONSTRAINT;
            if (aVarM1350i == aVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c0332d.m1354m() == aVar) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!(z2 ^ z3)) {
                if (c0332d.m1350i() != aVar) {
                    c0334f.f2379b = false;
                    c0333e.f2375x0 = false;
                    c0332d.f2323a0 = false;
                    if (z) {
                        return false;
                    }
                } else {
                    c0334f.f2379b = false;
                    c0333e.f2375x0 = false;
                    c0332d.f2323a0 = false;
                    if (z) {
                        return false;
                    }
                }
            } else if (c0332d.m1350i() != aVar) {
                c0334f.f2379b = false;
                c0333e.f2375x0 = false;
                c0332d.f2323a0 = false;
                if (z) {
                    return false;
                }
            } else {
                c0334f.f2379b = false;
                c0333e.f2375x0 = false;
                c0332d.f2323a0 = false;
                if (z) {
                    return false;
                }
            }
            c0331c = c0332d.f2348s.f2276d;
            if (c0331c == null) {
                if (c0331c != null) {
                    c0332d2 = c0331c.f2274b;
                    c0332d3 = c0332d.f2299D;
                    if (c0332d2 == c0332d3) {
                        if (c0332d.f2355z.f2276d == null) {
                            c0334f.f2381d.add(c0332d);
                        }
                    }
                }
            } else if (c0331c != null) {
                c0332d2 = c0331c.f2274b;
                c0332d3 = c0332d.f2299D;
                if (c0332d2 == c0332d3) {
                    if (c0332d.f2355z.f2276d == null) {
                        c0334f.f2381d.add(c0332d);
                    }
                }
            }
            c0331c3 = c0332d.f2349t.f2276d;
            if (c0331c3 == null) {
                if (c0331c3 != null) {
                    c0332d4 = c0331c3.f2274b;
                    c0332d5 = c0332d.f2299D;
                    if (c0332d4 == c0332d5) {
                        if (c0332d.f2355z.f2276d == null) {
                            c0334f.f2382e.add(c0332d);
                        }
                    }
                }
            } else if (c0331c3 != null) {
                c0332d4 = c0331c3.f2274b;
                c0332d5 = c0332d.f2299D;
                if (c0332d4 == c0332d5) {
                    if (c0332d.f2355z.f2276d == null) {
                        c0334f.f2382e.add(c0332d);
                    }
                }
            }
            if (c0332d instanceof C0336h) {
                c0334f.f2379b = false;
                c0333e.f2375x0 = false;
                c0332d.f2323a0 = false;
                if (z) {
                    return false;
                }
                c0336h = (C0336h) c0332d;
                while (i2 < c0336h.f2393j0) {
                    if (!m1201i(c0336h.f2392i0[i2], c0334f, list, z)) {
                        return false;
                    }
                }
            }
            length = c0332d.f2296A.length;
            while (i < length) {
                C0331c c0331c7 = c0332d.f2296A[i];
                c0331c5 = c0331c7.f2276d;
                if (c0331c5 == null) {
                }
            }
            return true;
        }
        c0334f.f2379b = false;
        c0333e.f2375x0 = false;
        c0332d.f2323a0 = false;
        return false;
    }
}
