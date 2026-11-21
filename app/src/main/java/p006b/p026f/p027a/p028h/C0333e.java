package p006b.p026f.p027a.p028h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p006b.p023d.C0304a;
import p006b.p026f.p027a.C0326e;

/* JADX INFO: renamed from: b.f.a.h.e */
/* JADX INFO: loaded from: classes.dex */
public class C0333e extends C0342n {

    /* JADX INFO: renamed from: l0 */
    public C0341m f2363l0;

    /* JADX INFO: renamed from: j0 */
    public boolean f2361j0 = false;

    /* JADX INFO: renamed from: k0 */
    public C0326e f2362k0 = new C0326e();

    /* JADX INFO: renamed from: m0 */
    public int f2364m0 = 0;

    /* JADX INFO: renamed from: n0 */
    public int f2365n0 = 0;

    /* JADX INFO: renamed from: o0 */
    public C0330b[] f2366o0 = new C0330b[4];

    /* JADX INFO: renamed from: p0 */
    public C0330b[] f2367p0 = new C0330b[4];

    /* JADX INFO: renamed from: q0 */
    public List<C0334f> f2368q0 = new ArrayList();

    /* JADX INFO: renamed from: r0 */
    public boolean f2369r0 = false;

    /* JADX INFO: renamed from: s0 */
    public boolean f2370s0 = false;

    /* JADX INFO: renamed from: t0 */
    public boolean f2371t0 = false;

    /* JADX INFO: renamed from: u0 */
    public int f2372u0 = 0;

    /* JADX INFO: renamed from: v0 */
    public int f2373v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public int f2374w0 = 7;

    /* JADX INFO: renamed from: x0 */
    public boolean f2375x0 = false;

    /* JADX INFO: renamed from: y0 */
    public boolean f2376y0 = false;

    /* JADX INFO: renamed from: z0 */
    public boolean f2377z0 = false;

    /* JADX WARN: Code duplicated, block: B:112:0x0277  */
    /* JADX WARN: Code duplicated, block: B:114:0x0289  */
    /* JADX WARN: Code duplicated, block: B:116:0x029c  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:142:0x0308  */
    /* JADX WARN: Code duplicated, block: B:159:0x0374  */
    /* JADX WARN: Code duplicated, block: B:162:0x0387  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x03e7 A[PHI: r0 r12
      0x03e7: PHI (r0v42 boolean) = (r0v41 boolean), (r0v45 boolean), (r0v45 boolean), (r0v45 boolean) binds: [B:167:0x03b0, B:175:0x03d0, B:176:0x03d2, B:178:0x03d8] A[DONT_GENERATE, DONT_INLINE]
      0x03e7: PHI (r12v17 boolean) = (r12v16 boolean), (r12v18 boolean), (r12v18 boolean), (r12v18 boolean) binds: [B:167:0x03b0, B:175:0x03d0, B:176:0x03d2, B:178:0x03d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x02c0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26 */
    @Override // p006b.p026f.p027a.p028h.C0342n
    /* JADX INFO: renamed from: F */
    public void mo1366F() {
        char c2;
        int i;
        C0332d.a aVar;
        int i2;
        ArrayList<C0332d> arrayList;
        int i3;
        int i4;
        C0332d c0332d;
        char c3;
        C0332d.a aVar2;
        boolean z;
        int iMax;
        int iMax2;
        int r2 = 0;
        boolean z2;
        C0326e c0326e;
        char c4;
        int size;
        int i5;
        C0332d c0332d2;
        int i6;
        boolean z3;
        boolean z4;
        List<C0332d> list;
        int i7;
        C0332d.a aVar3 = C0332d.a.MATCH_CONSTRAINT;
        C0332d.a aVar4 = C0332d.a.WRAP_CONTENT;
        boolean[] zArr = C0337i.f2394a;
        C0332d.a aVar5 = C0332d.a.FIXED;
        int i8 = this.f2304I;
        int i9 = this.f2305J;
        int i10 = 0;
        int iMax3 = Math.max(0, m1355n());
        int iMax4 = Math.max(0, m1349h());
        this.f2376y0 = false;
        this.f2377z0 = false;
        if (this.f2299D != null) {
            if (this.f2363l0 == null) {
                this.f2363l0 = new C0341m(this);
            }
            C0341m c0341m = this.f2363l0;
            Objects.requireNonNull(c0341m);
            c0341m.f2409a = this.f2304I;
            c0341m.f2410b = this.f2305J;
            c0341m.f2411c = m1355n();
            c0341m.f2412d = m1349h();
            int size2 = c0341m.f2413e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C0341m.a aVar6 = c0341m.f2413e.get(i11);
                C0331c c0331cMo1347f = mo1347f(aVar6.f2414a.f2275c);
                aVar6.f2414a = c0331cMo1347f;
                if (c0331cMo1347f != null) {
                    aVar6.f2415b = c0331cMo1347f.f2276d;
                    aVar6.f2416c = c0331cMo1347f.m1336b();
                    C0331c c0331c = aVar6.f2414a;
                    aVar6.f2417d = c0331c.f2279g;
                    i7 = c0331c.f2280h;
                } else {
                    aVar6.f2415b = null;
                    aVar6.f2416c = 0;
                    aVar6.f2417d = C0331c.a.STRONG;
                    i7 = 0;
                }
                aVar6.f2418e = i7;
            }
            this.f2304I = 0;
            this.f2305J = 0;
            C0332d c0332d3 = this.f2299D;
            if (c0332d3 != null && (c0332d3 instanceof C0333e)) {
            }
            int size3 = this.f2297B.size();
            for (int i12 = 0; i12 < size3; i12++) {
                this.f2297B.get(i12).m1338d();
            }
            mo1360t(this.f2362k0.f2231k);
        } else {
            this.f2304I = 0;
            this.f2305J = 0;
        }
        if (this.f2374w0 != 0) {
            if (!m1369I(8)) {
                m1370J();
            }
            if (!m1369I(32)) {
                if (!m1369I(8)) {
                    mo1332c(this.f2374w0);
                }
                m1372L();
            }
            this.f2362k0.f2226f = true;
        } else {
            this.f2362k0.f2226f = false;
        }
        C0332d.a[] aVarArr = this.f2298C;
        C0332d.a aVar7 = aVarArr[1];
        C0332d.a aVar8 = aVarArr[0];
        m1371K();
        if (this.f2368q0.size() == 0) {
            this.f2368q0.clear();
            this.f2368q0.add(0, new C0334f(this.f2419i0));
        }
        int size4 = this.f2368q0.size();
        ArrayList<C0332d> arrayList2 = this.f2419i0;
        boolean z5 = m1350i() == aVar4 || m1354m() == aVar4;
        boolean z6 = false;
        while (i10 < size4 && !this.f2375x0) {
            if (this.f2368q0.get(i10).f2379b) {
                aVar = aVar3;
                i2 = i8;
                i = i9;
                size4 = size4;
                arrayList = arrayList2;
            } else {
                if (!m1369I(32)) {
                    z6 = z6;
                    i = i9;
                } else if (m1350i() == aVar5 && m1354m() == aVar5) {
                    C0334f c0334f = this.f2368q0.get(i10);
                    if (c0334f.f2385h.isEmpty()) {
                        int size5 = c0334f.f2378a.size();
                        int i13 = 0;
                        while (i13 < size5) {
                            int i14 = size5;
                            C0332d c0332d4 = c0334f.f2378a.get(i13);
                            int i15 = i9;
                            if (!c0332d4.f2323a0) {
                                c0334f.m1374b((ArrayList) c0334f.f2385h, c0332d4);
                            }
                            i13++;
                            size5 = i14;
                            i9 = i15;
                        }
                        i = i9;
                        c0334f.f2386i.clear();
                        c0334f.f2386i.addAll(c0334f.f2378a);
                        c0334f.f2386i.removeAll(c0334f.f2385h);
                        list = c0334f.f2385h;
                    } else {
                        list = c0334f.f2385h;
                        i = i9;
                    }
                    this.f2419i0 = (ArrayList) list;
                } else {
                    z6 = z6;
                    i = i9;
                    this.f2419i0 = (ArrayList) this.f2368q0.get(i10).f2378a;
                }
                m1371K();
                int size6 = this.f2419i0.size();
                for (int i16 = 0; i16 < size6; i16++) {
                    C0332d c0332d5 = this.f2419i0.get(i16);
                    if (c0332d5 instanceof C0342n) {
                        ((C0342n) c0332d5).mo1366F();
                    }
                }
                int i17 = 0;
                boolean z7 = true;
                while (z7) {
                    boolean z8 = z7;
                    int i18 = i17 + 1;
                    try {
                        this.f2362k0.m1322t();
                        m1371K();
                        m1346e(this.f2362k0);
                        int i19 = 0;
                        while (i19 < size6) {
                            i3 = i8;
                            try {
                                this.f2419i0.get(i19).m1346e(this.f2362k0);
                                i19++;
                                i8 = i3;
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                if (z8) {
                                    c0326e = this.f2362k0;
                                    c4 = 0;
                                    zArr[2] = false;
                                    mo1344E(c0326e);
                                    size = this.f2419i0.size();
                                    i5 = 0;
                                    while (i5 < size) {
                                        c0332d2 = this.f2419i0.get(i5);
                                        c0332d2.mo1344E(c0326e);
                                        C0326e c0326e2 = c0326e;
                                        if (c0332d2.f2298C[c4] == aVar3) {
                                            i6 = size;
                                            if (c0332d2.m1355n() < c0332d2.f2315T) {
                                                z3 = true;
                                                zArr[2] = true;
                                            }
                                            if (c0332d2.f2298C[z3 ? 1 : 0] != aVar3) {
                                            }
                                            i5++;
                                            c0326e = c0326e2;
                                            size = i6;
                                            c4 = 0;
                                        } else {
                                            i6 = size;
                                        }
                                        z3 = true;
                                        if (c0332d2.f2298C[z3 ? 1 : 0] != aVar3) {
                                        }
                                        i5++;
                                        c0326e = c0326e2;
                                        size = i6;
                                        c4 = 0;
                                    }
                                } else {
                                    mo1344E(this.f2362k0);
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size6) {
                                            c0332d = this.f2419i0.get(i4);
                                            if (c0332d.f2298C[0] != aVar3) {
                                            }
                                            if (c0332d.f2298C[1] != aVar3) {
                                            }
                                            i4++;
                                        }
                                    }
                                    if (z5) {
                                        aVar2 = aVar3;
                                        z = false;
                                    } else {
                                        aVar2 = aVar3;
                                        z = false;
                                    }
                                    iMax = Math.max(this.f2313R, m1355n());
                                    if (iMax > m1355n()) {
                                        m1342C(iMax);
                                        this.f2298C[0] = aVar5;
                                        z = true;
                                        z6 = true;
                                    }
                                    iMax2 = Math.max(this.f2314S, m1349h());
                                    if (iMax2 > m1349h()) {
                                        m1362w(iMax2);
                                        r2 = 1;
                                        this.f2298C[1] = aVar5;
                                        z = true;
                                        z2 = true;
                                    } else {
                                        r2 = 1;
                                        z2 = z6;
                                    }
                                    if (z2) {
                                        z6 = z2;
                                    } else {
                                        if (this.f2298C[0] == aVar4) {
                                            this.f2376y0 = r2;
                                            this.f2298C[0] = aVar5;
                                            m1342C(iMax3);
                                            z = true;
                                            z2 = true;
                                        }
                                        if (this.f2298C[r2] == aVar4) {
                                            z6 = z2;
                                        } else {
                                            z6 = z2;
                                        }
                                    }
                                    aVar3 = aVar2;
                                    i8 = i3;
                                    arrayList2 = arrayList2;
                                    z7 = z;
                                    i17 = i18;
                                }
                                c3 = 2;
                                if (z5) {
                                    aVar2 = aVar3;
                                    z = false;
                                } else {
                                    aVar2 = aVar3;
                                    z = false;
                                }
                                iMax = Math.max(this.f2313R, m1355n());
                                if (iMax > m1355n()) {
                                    m1342C(iMax);
                                    this.f2298C[0] = aVar5;
                                    z = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.f2314S, m1349h());
                                if (iMax2 > m1349h()) {
                                    m1362w(iMax2);
                                    r2 = 1;
                                    this.f2298C[1] = aVar5;
                                    z = true;
                                    z2 = true;
                                } else {
                                    r2 = 1;
                                    z2 = z6;
                                }
                                if (z2) {
                                    z6 = z2;
                                } else {
                                    if (this.f2298C[0] == aVar4) {
                                        this.f2376y0 = r2;
                                        this.f2298C[0] = aVar5;
                                        m1342C(iMax3);
                                        z = true;
                                        z2 = true;
                                    }
                                    if (this.f2298C[r2] == aVar4) {
                                        z6 = z2;
                                    } else {
                                        z6 = z2;
                                    }
                                }
                                aVar3 = aVar2;
                                i8 = i3;
                                arrayList2 = arrayList2;
                                z7 = z;
                                i17 = i18;
                            }
                        }
                        i3 = i8;
                        m1368H(this.f2362k0);
                        try {
                            C0326e c0326e3 = this.f2362k0;
                            if (c0326e3.f2226f) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= c0326e3.f2229i) {
                                        z4 = true;
                                        break;
                                    } else {
                                        if (!c0326e3.f2225e[i20].f2216d) {
                                            z4 = false;
                                            break;
                                        }
                                        i20++;
                                    }
                                }
                                if (z4) {
                                    c0326e3.m1312j();
                                } else {
                                    c0326e3.m1319q(c0326e3.f2222b);
                                }
                            } else {
                                c0326e3.m1319q(c0326e3.f2222b);
                            }
                            z8 = true;
                        } catch (Exception e2) {
                            e = e2;
                            z8 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i3 = i8;
                    }
                    if (z8) {
                        c0326e = this.f2362k0;
                        c4 = 0;
                        zArr[2] = false;
                        mo1344E(c0326e);
                        size = this.f2419i0.size();
                        i5 = 0;
                        while (i5 < size) {
                            c0332d2 = this.f2419i0.get(i5);
                            c0332d2.mo1344E(c0326e);
                            C0326e c0326e4 = c0326e;
                            if (c0332d2.f2298C[c4] == aVar3) {
                                i6 = size;
                                if (c0332d2.m1355n() < c0332d2.f2315T) {
                                    z3 = true;
                                    zArr[2] = true;
                                }
                                if (c0332d2.f2298C[z3 ? 1 : 0] != aVar3 && c0332d2.m1349h() < c0332d2.f2316U) {
                                    zArr[2] = z3;
                                }
                                i5++;
                                c0326e = c0326e4;
                                size = i6;
                                c4 = 0;
                            } else {
                                i6 = size;
                            }
                            z3 = true;
                            if (c0332d2.f2298C[z3 ? 1 : 0] != aVar3) {
                            }
                            i5++;
                            c0326e = c0326e4;
                            size = i6;
                            c4 = 0;
                        }
                    } else {
                        mo1344E(this.f2362k0);
                        i4 = 0;
                        while (true) {
                            if (i4 < size6) {
                                c0332d = this.f2419i0.get(i4);
                                if (c0332d.f2298C[0] != aVar3 && c0332d.m1355n() < c0332d.f2315T) {
                                    zArr[2] = true;
                                } else {
                                    if (c0332d.f2298C[1] != aVar3 && c0332d.m1349h() < c0332d.f2316U) {
                                        c3 = 2;
                                        zArr[2] = true;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                        if (z5 || i18 >= 8 || !zArr[c3]) {
                            aVar2 = aVar3;
                            z = false;
                        } else {
                            int i21 = 0;
                            int iMax5 = 0;
                            int iMax6 = 0;
                            while (i21 < size6) {
                                C0332d c0332d6 = this.f2419i0.get(i21);
                                iMax5 = Math.max(iMax5, c0332d6.m1355n() + c0332d6.f2304I);
                                iMax6 = Math.max(iMax6, c0332d6.m1349h() + c0332d6.f2305J);
                                i21++;
                                aVar3 = aVar3;
                            }
                            aVar2 = aVar3;
                            int iMax7 = Math.max(this.f2313R, iMax5);
                            int iMax8 = Math.max(this.f2314S, iMax6);
                            if (aVar8 != aVar4 || m1355n() >= iMax7) {
                                z = false;
                            } else {
                                m1342C(iMax7);
                                this.f2298C[0] = aVar4;
                                z = true;
                                z6 = true;
                            }
                            if (aVar7 == aVar4 && m1349h() < iMax8) {
                                m1362w(iMax8);
                                this.f2298C[1] = aVar4;
                                z = true;
                                z6 = true;
                            }
                        }
                        iMax = Math.max(this.f2313R, m1355n());
                        if (iMax > m1355n()) {
                            m1342C(iMax);
                            this.f2298C[0] = aVar5;
                            z = true;
                            z6 = true;
                        }
                        iMax2 = Math.max(this.f2314S, m1349h());
                        if (iMax2 > m1349h()) {
                            m1362w(iMax2);
                            r2 = 1;
                            this.f2298C[1] = aVar5;
                            z = true;
                            z2 = true;
                        } else {
                            r2 = 1;
                            z2 = z6;
                        }
                        if (z2) {
                            z6 = z2;
                        } else {
                            if (this.f2298C[0] == aVar4 && iMax3 > 0 && m1355n() > iMax3) {
                                this.f2376y0 = r2;
                                this.f2298C[0] = aVar5;
                                m1342C(iMax3);
                                z = true;
                                z2 = true;
                            }
                            if (this.f2298C[r2] == aVar4 || iMax4 <= 0 || m1349h() <= iMax4) {
                                z6 = z2;
                            } else {
                                this.f2377z0 = r2;
                                this.f2298C[r2] = aVar5;
                                m1362w(iMax4);
                                z = true;
                                z6 = true;
                            }
                        }
                        aVar3 = aVar2;
                        i8 = i3;
                        arrayList2 = arrayList2;
                        z7 = z;
                        i17 = i18;
                    }
                    c3 = 2;
                    if (z5) {
                        aVar2 = aVar3;
                        z = false;
                    } else {
                        aVar2 = aVar3;
                        z = false;
                    }
                    iMax = Math.max(this.f2313R, m1355n());
                    if (iMax > m1355n()) {
                        m1342C(iMax);
                        this.f2298C[0] = aVar5;
                        z = true;
                        z6 = true;
                    }
                    iMax2 = Math.max(this.f2314S, m1349h());
                    if (iMax2 > m1349h()) {
                        m1362w(iMax2);
                        r2 = 1;
                        this.f2298C[1] = aVar5;
                        z = true;
                        z2 = true;
                    } else {
                        r2 = 1;
                        z2 = z6;
                    }
                    if (z2) {
                        z6 = z2;
                    } else {
                        if (this.f2298C[0] == aVar4) {
                            this.f2376y0 = r2;
                            this.f2298C[0] = aVar5;
                            m1342C(iMax3);
                            z = true;
                            z2 = true;
                        }
                        if (this.f2298C[r2] == aVar4) {
                            z6 = z2;
                        } else {
                            z6 = z2;
                        }
                    }
                    aVar3 = aVar2;
                    i8 = i3;
                    arrayList2 = arrayList2;
                    z7 = z;
                    i17 = i18;
                }
                aVar = aVar3;
                i2 = i8;
                arrayList = arrayList2;
                C0334f c0334f2 = this.f2368q0.get(i10);
                int size7 = c0334f2.f2386i.size();
                for (int i22 = 0; i22 < size7; i22++) {
                    c0334f2.m1375c(c0334f2.f2386i.get(i22));
                }
                z6 = z6;
            }
            i10++;
            size4 = size4;
            aVar3 = aVar;
            i9 = i;
            i8 = i2;
            arrayList2 = arrayList;
        }
        boolean z9 = z6;
        int i23 = i8;
        int i24 = i9;
        this.f2419i0 = arrayList2;
        if (this.f2299D != null) {
            int iMax9 = Math.max(this.f2313R, m1355n());
            int iMax10 = Math.max(this.f2314S, m1349h());
            C0341m c0341m2 = this.f2363l0;
            this.f2304I = c0341m2.f2409a;
            this.f2305J = c0341m2.f2410b;
            m1342C(c0341m2.f2411c);
            m1362w(c0341m2.f2412d);
            int size8 = c0341m2.f2413e.size();
            for (int i25 = 0; i25 < size8; i25++) {
                C0341m.a aVar9 = c0341m2.f2413e.get(i25);
                mo1347f(aVar9.f2414a.f2275c).m1335a(aVar9.f2415b, aVar9.f2416c, -1, aVar9.f2417d, aVar9.f2418e, false);
            }
            c2 = 0;
            m1342C(iMax9 + 0 + 0);
            m1362w(iMax10 + 0 + 0);
        } else {
            c2 = 0;
            this.f2304I = i23;
            this.f2305J = i24;
        }
        if (z9) {
            C0332d.a[] aVarArr2 = this.f2298C;
            aVarArr2[c2] = aVar8;
            aVarArr2[1] = aVar7;
        }
        mo1360t(this.f2362k0.f2231k);
        C0332d c0332d7 = this.f2299D;
        C0333e c0333e = this;
        while (c0332d7 != null) {
            C0332d c0332d8 = c0332d7.f2299D;
            if (c0332d7 instanceof C0333e) {
                c0333e = (C0333e) c0332d7;
            }
            c0332d7 = c0332d8;
        }
        if (this == c0333e) {
            mo1343D();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m1367G(C0332d c0332d, int i) {
        if (i == 0) {
            int i2 = this.f2364m0 + 1;
            C0330b[] c0330bArr = this.f2367p0;
            if (i2 >= c0330bArr.length) {
                this.f2367p0 = (C0330b[]) Arrays.copyOf(c0330bArr, c0330bArr.length * 2);
            }
            C0330b[] c0330bArr2 = this.f2367p0;
            int i3 = this.f2364m0;
            c0330bArr2[i3] = new C0330b(c0332d, 0, this.f2361j0);
            this.f2364m0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f2365n0 + 1;
            C0330b[] c0330bArr3 = this.f2366o0;
            if (i4 >= c0330bArr3.length) {
                this.f2366o0 = (C0330b[]) Arrays.copyOf(c0330bArr3, c0330bArr3.length * 2);
            }
            C0330b[] c0330bArr4 = this.f2366o0;
            int i5 = this.f2365n0;
            c0330bArr4[i5] = new C0330b(c0332d, 1, this.f2361j0);
            this.f2365n0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m1368H(C0326e c0326e) {
        C0332d.a aVar = C0332d.a.FIXED;
        C0332d.a aVar2 = C0332d.a.WRAP_CONTENT;
        mo1330a(c0326e);
        int size = this.f2419i0.size();
        for (int i = 0; i < size; i++) {
            C0332d c0332d = this.f2419i0.get(i);
            if (c0332d instanceof C0333e) {
                C0332d.a[] aVarArr = c0332d.f2298C;
                C0332d.a aVar3 = aVarArr[0];
                C0332d.a aVar4 = aVarArr[1];
                if (aVar3 == aVar2) {
                    c0332d.m1364y(aVar);
                }
                if (aVar4 == aVar2) {
                    c0332d.m1341B(aVar);
                }
                c0332d.mo1330a(c0326e);
                if (aVar3 == aVar2) {
                    c0332d.m1364y(aVar3);
                }
                if (aVar4 == aVar2) {
                    c0332d.m1341B(aVar4);
                }
            } else {
                C0332d.a aVar5 = C0332d.a.MATCH_PARENT;
                if (this.f2298C[0] != aVar2 && c0332d.f2298C[0] == aVar5) {
                    int i2 = c0332d.f2348s.f2277e;
                    int iM1355n = m1355n() - c0332d.f2350u.f2277e;
                    C0331c c0331c = c0332d.f2348s;
                    c0331c.f2281i = c0326e.m1314l(c0331c);
                    C0331c c0331c2 = c0332d.f2350u;
                    c0331c2.f2281i = c0326e.m1314l(c0331c2);
                    c0326e.m1307e(c0332d.f2348s.f2281i, i2);
                    c0326e.m1307e(c0332d.f2350u.f2281i, iM1355n);
                    c0332d.f2322a = 2;
                    c0332d.m1363x(i2, iM1355n);
                }
                if (this.f2298C[1] != aVar2 && c0332d.f2298C[1] == aVar5) {
                    int i3 = c0332d.f2349t.f2277e;
                    int iM1349h = m1349h() - c0332d.f2351v.f2277e;
                    C0331c c0331c3 = c0332d.f2349t;
                    c0331c3.f2281i = c0326e.m1314l(c0331c3);
                    C0331c c0331c4 = c0332d.f2351v;
                    c0331c4.f2281i = c0326e.m1314l(c0331c4);
                    c0326e.m1307e(c0332d.f2349t.f2281i, i3);
                    c0326e.m1307e(c0332d.f2351v.f2281i, iM1349h);
                    if (c0332d.f2312Q > 0 || c0332d.f2320Y == 8) {
                        C0331c c0331c5 = c0332d.f2352w;
                        c0331c5.f2281i = c0326e.m1314l(c0331c5);
                        c0326e.m1307e(c0332d.f2352w.f2281i, c0332d.f2312Q + i3);
                    }
                    c0332d.f2324b = 2;
                    c0332d.m1340A(i3, iM1349h);
                }
                c0332d.mo1330a(c0326e);
            }
        }
        if (this.f2364m0 > 0) {
            C0304a.m1193a(this, c0326e, 0);
        }
        if (this.f2365n0 > 0) {
            C0304a.m1193a(this, c0326e, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public boolean m1369I(int i) {
        return (this.f2374w0 & i) == i;
    }

    /* JADX INFO: renamed from: J */
    public void m1370J() {
        int size = this.f2419i0.size();
        mo1333s();
        for (int i = 0; i < size; i++) {
            this.f2419i0.get(i).mo1333s();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m1371K() {
        this.f2364m0 = 0;
        this.f2365n0 = 0;
    }

    /* JADX INFO: renamed from: L */
    public void m1372L() {
        C0338j c0338j = mo1347f(C0331c.b.LEFT).f2273a;
        C0338j c0338j2 = mo1347f(C0331c.b.TOP).f2273a;
        c0338j.m1385j(null, 0.0f);
        c0338j2.m1385j(null, 0.0f);
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: c */
    public void mo1332c(int i) {
        super.mo1332c(i);
        int size = this.f2419i0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2419i0.get(i2).mo1332c(i);
        }
    }

    @Override // p006b.p026f.p027a.p028h.C0342n, p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: r */
    public void mo1359r() {
        this.f2362k0.m1322t();
        this.f2368q0.clear();
        this.f2375x0 = false;
        super.mo1359r();
    }
}
