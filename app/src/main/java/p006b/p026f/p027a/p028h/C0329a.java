package p006b.p026f.p027a.p028h;

import java.util.ArrayList;
import p006b.p026f.p027a.C0323b;
import p006b.p026f.p027a.C0326e;
import p006b.p026f.p027a.C0328g;

/* JADX INFO: renamed from: b.f.a.h.a */
/* JADX INFO: loaded from: classes.dex */
public class C0329a extends C0336h {

    /* JADX INFO: renamed from: k0 */
    public int f2253k0 = 0;

    /* JADX INFO: renamed from: l0 */
    public ArrayList<C0338j> f2254l0 = new ArrayList<>(4);

    /* JADX INFO: renamed from: m0 */
    public boolean f2255m0 = true;

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: a */
    public void mo1330a(C0326e c0326e) {
        C0331c[] c0331cArr;
        boolean z;
        C0328g c0328g;
        C0331c c0331c;
        int i;
        int i2;
        C0332d.a aVar = C0332d.a.MATCH_CONSTRAINT;
        C0332d.a aVar2 = C0332d.a.WRAP_CONTENT;
        C0331c[] c0331cArr2 = this.f2296A;
        c0331cArr2[0] = this.f2348s;
        c0331cArr2[2] = this.f2349t;
        c0331cArr2[1] = this.f2350u;
        c0331cArr2[3] = this.f2351v;
        int i3 = 0;
        while (true) {
            c0331cArr = this.f2296A;
            if (i3 >= c0331cArr.length) {
                break;
            }
            c0331cArr[i3].f2281i = c0326e.m1314l(c0331cArr[i3]);
            i3++;
        }
        int i4 = this.f2253k0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0331c c0331c2 = c0331cArr[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= this.f2393j0) {
                z = false;
                break;
            }
            C0332d c0332d = this.f2392i0[i5];
            if ((this.f2255m0 || c0332d.mo1331b()) && ((((i = this.f2253k0) == 0 || i == 1) && c0332d.m1350i() == aVar) || (((i2 = this.f2253k0) == 2 || i2 == 3) && c0332d.m1354m() == aVar))) {
                z = true;
                break;
            }
            i5++;
        }
        int i6 = this.f2253k0;
        if (i6 == 0 || i6 == 1 ? this.f2299D.m1350i() == aVar2 : this.f2299D.m1354m() == aVar2) {
            z = false;
        }
        for (int i7 = 0; i7 < this.f2393j0; i7++) {
            C0332d c0332d2 = this.f2392i0[i7];
            if (this.f2255m0 || c0332d2.mo1331b()) {
                C0328g c0328gM1314l = c0326e.m1314l(c0332d2.f2296A[this.f2253k0]);
                C0331c[] c0331cArr3 = c0332d2.f2296A;
                int i8 = this.f2253k0;
                c0331cArr3[i8].f2281i = c0328gM1314l;
                if (i8 == 0 || i8 == 2) {
                    C0328g c0328g2 = c0331c2.f2281i;
                    C0323b c0323bM1315m = c0326e.m1315m();
                    C0328g c0328gM1316n = c0326e.m1316n();
                    c0328gM1316n.f2240c = 0;
                    c0323bM1315m.m1300e(c0328g2, c0328gM1314l, c0328gM1316n, 0);
                    if (z) {
                        c0323bM1315m.f2215c.m1294h(c0326e.m1313k(1, null), (int) (c0323bM1315m.f2215c.m1289c(c0328gM1316n) * (-1.0f)));
                    }
                    c0326e.m1305c(c0323bM1315m);
                } else {
                    C0328g c0328g3 = c0331c2.f2281i;
                    C0323b c0323bM1315m2 = c0326e.m1315m();
                    C0328g c0328gM1316n2 = c0326e.m1316n();
                    c0328gM1316n2.f2240c = 0;
                    c0323bM1315m2.m1299d(c0328g3, c0328gM1314l, c0328gM1316n2, 0);
                    if (z) {
                        c0323bM1315m2.f2215c.m1294h(c0326e.m1313k(1, null), (int) (c0323bM1315m2.f2215c.m1289c(c0328gM1316n2) * (-1.0f)));
                    }
                    c0326e.m1305c(c0323bM1315m2);
                }
            }
        }
        int i9 = this.f2253k0;
        if (i9 == 0) {
            c0326e.m1306d(this.f2350u.f2281i, this.f2348s.f2281i, 0, 6);
            if (z) {
                return;
            }
            c0328g = this.f2348s.f2281i;
            c0331c = this.f2299D.f2350u;
        } else if (i9 == 1) {
            c0326e.m1306d(this.f2348s.f2281i, this.f2350u.f2281i, 0, 6);
            if (z) {
                return;
            }
            c0328g = this.f2348s.f2281i;
            c0331c = this.f2299D.f2348s;
        } else if (i9 == 2) {
            c0326e.m1306d(this.f2351v.f2281i, this.f2349t.f2281i, 0, 6);
            if (z) {
                return;
            }
            c0328g = this.f2349t.f2281i;
            c0331c = this.f2299D.f2351v;
        } else {
            if (i9 != 3) {
                return;
            }
            c0326e.m1306d(this.f2349t.f2281i, this.f2351v.f2281i, 0, 6);
            if (z) {
                return;
            }
            c0328g = this.f2349t.f2281i;
            c0331c = this.f2299D.f2349t;
        }
        c0326e.m1306d(c0328g, c0331c.f2281i, 0, 5);
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: b */
    public boolean mo1331b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[SYNTHETIC] */
    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: c */
    public void mo1332c(int i) {
        C0331c c0331c;
        C0331c c0331c2;
        C0331c c0331c3;
        C0338j c0338j;
        C0332d c0332d = this.f2299D;
        if (c0332d != null && ((C0333e) c0332d).m1369I(2)) {
            int i2 = this.f2253k0;
            if (i2 == 0) {
                c0331c = this.f2348s;
            } else if (i2 == 1) {
                c0331c = this.f2350u;
            } else if (i2 == 2) {
                c0331c = this.f2349t;
            } else if (i2 != 3) {
                return;
            } else {
                c0331c = this.f2351v;
            }
            C0338j c0338j2 = c0331c.f2273a;
            c0338j2.f2400h = 5;
            if (i2 == 0 || i2 == 1) {
                this.f2349t.f2273a.m1385j(null, 0.0f);
                c0331c2 = this.f2351v;
            } else {
                this.f2348s.f2273a.m1385j(null, 0.0f);
                c0331c2 = this.f2350u;
            }
            c0331c2.f2273a.m1385j(null, 0.0f);
            this.f2254l0.clear();
            for (int i3 = 0; i3 < this.f2393j0; i3++) {
                C0332d c0332d2 = this.f2392i0[i3];
                if (this.f2255m0 || c0332d2.mo1331b()) {
                    int i4 = this.f2253k0;
                    if (i4 == 0) {
                        c0331c3 = c0332d2.f2348s;
                    } else if (i4 == 1) {
                        c0331c3 = c0332d2.f2350u;
                    } else if (i4 != 2) {
                        if (i4 != 3) {
                            c0338j = null;
                        } else {
                            c0331c3 = c0332d2.f2351v;
                        }
                        if (c0338j != null) {
                            this.f2254l0.add(c0338j);
                            c0338j.f2407a.add(c0338j2);
                        }
                    } else {
                        c0331c3 = c0332d2.f2349t;
                    }
                    c0338j = c0331c3.f2273a;
                    if (c0338j != null) {
                        this.f2254l0.add(c0338j);
                        c0338j.f2407a.add(c0338j2);
                    }
                }
            }
        }
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: s */
    public void mo1333s() {
        super.mo1333s();
        this.f2254l0.clear();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e A[PHI: r9
      0x004e: PHI (r9v3 float) = (r9v2 float), (r9v4 float) binds: [B:27:0x004c, B:24:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0052 A[SYNTHETIC] */
    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: u */
    public void mo1334u() {
        C0331c c0331c;
        C0338j c0338j;
        int size;
        C0338j c0338j2;
        int i;
        int i2;
        C0331c c0331c2;
        C0338j c0338j3;
        int i3;
        float f;
        C0331c c0331c3;
        int i4 = this.f2253k0;
        float f2 = Float.MAX_VALUE;
        if (i4 != 0) {
            if (i4 == 1) {
                c0331c3 = this.f2350u;
            } else if (i4 == 2) {
                c0331c = this.f2349t;
            } else if (i4 != 3) {
                return;
            } else {
                c0331c3 = this.f2351v;
            }
            c0338j = c0331c3.f2273a;
            f2 = 0.0f;
            size = this.f2254l0.size();
            c0338j2 = null;
            for (i = 0; i < size; i++) {
                c0338j3 = this.f2254l0.get(i);
                if (c0338j3.f2408b != 1) {
                    return;
                }
                i3 = this.f2253k0;
                if (i3 != 0 || i3 == 2) {
                    f = c0338j3.f2399g;
                    if (f < f2) {
                        c0338j2 = c0338j3.f2398f;
                        f2 = f;
                    }
                } else {
                    f = c0338j3.f2399g;
                    if (f > f2) {
                        c0338j2 = c0338j3.f2398f;
                        f2 = f;
                    }
                }
            }
            c0338j.f2398f = c0338j2;
            c0338j.f2399g = f2;
            c0338j.m1388a();
            i2 = this.f2253k0;
            if (i2 != 0) {
                c0331c2 = this.f2350u;
            } else if (i2 != 1) {
                c0331c2 = this.f2348s;
            } else if (i2 != 2) {
                c0331c2 = this.f2351v;
            } else if (i2 != 3) {
                return;
            } else {
                c0331c2 = this.f2349t;
            }
            c0331c2.f2273a.m1385j(c0338j2, f2);
        }
        c0331c = this.f2348s;
        c0338j = c0331c.f2273a;
        size = this.f2254l0.size();
        c0338j2 = null;
        while (i < size) {
            c0338j3 = this.f2254l0.get(i);
            if (c0338j3.f2408b != 1) {
                return;
            }
            i3 = this.f2253k0;
            if (i3 != 0) {
                f = c0338j3.f2399g;
                if (f < f2) {
                    c0338j2 = c0338j3.f2398f;
                    f2 = f;
                }
            } else {
                f = c0338j3.f2399g;
                if (f < f2) {
                    c0338j2 = c0338j3.f2398f;
                    f2 = f;
                }
            }
        }
        c0338j.f2398f = c0338j2;
        c0338j.f2399g = f2;
        c0338j.m1388a();
        i2 = this.f2253k0;
        if (i2 != 0) {
            c0331c2 = this.f2350u;
        } else if (i2 != 1) {
            c0331c2 = this.f2348s;
        } else if (i2 != 2) {
            c0331c2 = this.f2351v;
        } else if (i2 != 3) {
            return;
        } else {
            c0331c2 = this.f2349t;
        }
        c0331c2.f2273a.m1385j(c0338j2, f2);
    }
}
