package p006b.p026f.p027a.p028h;

import androidx.recyclerview.widget.RecyclerView;
import p006b.p026f.p027a.C0323b;
import p006b.p026f.p027a.C0326e;
import p006b.p026f.p027a.C0328g;

/* JADX INFO: renamed from: b.f.a.h.g */
/* JADX INFO: loaded from: classes.dex */
public class C0335g extends C0332d {

    /* JADX INFO: renamed from: i0 */
    public float f2387i0 = -1.0f;

    /* JADX INFO: renamed from: j0 */
    public int f2388j0 = -1;

    /* JADX INFO: renamed from: k0 */
    public int f2389k0 = -1;

    /* JADX INFO: renamed from: l0 */
    public C0331c f2390l0 = this.f2349t;

    /* JADX INFO: renamed from: m0 */
    public int f2391m0 = 0;

    public C0335g() {
        this.f2297B.clear();
        this.f2297B.add(this.f2390l0);
        int length = this.f2296A.length;
        for (int i = 0; i < length; i++) {
            this.f2296A[i] = this.f2390l0;
        }
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: E */
    public void mo1344E(C0326e c0326e) {
        if (this.f2299D == null) {
            return;
        }
        int iM1317o = c0326e.m1317o(this.f2390l0);
        if (this.f2391m0 == 1) {
            this.f2304I = iM1317o;
            this.f2305J = 0;
            m1362w(this.f2299D.m1349h());
            m1342C(0);
            return;
        }
        this.f2304I = 0;
        this.f2305J = iM1317o;
        m1342C(this.f2299D.m1355n());
        m1362w(0);
    }

    /* JADX INFO: renamed from: F */
    public void m1376F(int i) {
        if (this.f2391m0 == i) {
            return;
        }
        this.f2391m0 = i;
        this.f2297B.clear();
        this.f2390l0 = this.f2391m0 == 1 ? this.f2348s : this.f2349t;
        this.f2297B.add(this.f2390l0);
        int length = this.f2296A.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f2296A[i2] = this.f2390l0;
        }
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: a */
    public void mo1330a(C0326e c0326e) {
        C0332d.a aVar = C0332d.a.WRAP_CONTENT;
        C0333e c0333e = (C0333e) this.f2299D;
        if (c0333e == null) {
            return;
        }
        C0331c c0331cMo1347f = c0333e.mo1347f(C0331c.b.LEFT);
        C0331c c0331cMo1347f2 = c0333e.mo1347f(C0331c.b.RIGHT);
        C0332d c0332d = this.f2299D;
        boolean z = c0332d != null && c0332d.f2298C[0] == aVar;
        if (this.f2391m0 == 0) {
            c0331cMo1347f = c0333e.mo1347f(C0331c.b.TOP);
            c0331cMo1347f2 = c0333e.mo1347f(C0331c.b.BOTTOM);
            C0332d c0332d2 = this.f2299D;
            z = c0332d2 != null && c0332d2.f2298C[1] == aVar;
        }
        if (this.f2388j0 != -1) {
            C0328g c0328gM1314l = c0326e.m1314l(this.f2390l0);
            c0326e.m1306d(c0328gM1314l, c0326e.m1314l(c0331cMo1347f), this.f2388j0, 6);
            if (z) {
                c0326e.m1308f(c0326e.m1314l(c0331cMo1347f2), c0328gM1314l, 0, 5);
                return;
            }
            return;
        }
        if (this.f2389k0 != -1) {
            C0328g c0328gM1314l2 = c0326e.m1314l(this.f2390l0);
            C0328g c0328gM1314l3 = c0326e.m1314l(c0331cMo1347f2);
            c0326e.m1306d(c0328gM1314l2, c0328gM1314l3, -this.f2389k0, 6);
            if (z) {
                c0326e.m1308f(c0328gM1314l2, c0326e.m1314l(c0331cMo1347f), 0, 5);
                c0326e.m1308f(c0328gM1314l3, c0328gM1314l2, 0, 5);
                return;
            }
            return;
        }
        if (this.f2387i0 != -1.0f) {
            C0328g c0328gM1314l4 = c0326e.m1314l(this.f2390l0);
            C0328g c0328gM1314l5 = c0326e.m1314l(c0331cMo1347f);
            C0328g c0328gM1314l6 = c0326e.m1314l(c0331cMo1347f2);
            float f = this.f2387i0;
            C0323b c0323bM1315m = c0326e.m1315m();
            c0323bM1315m.f2215c.m1294h(c0328gM1314l4, -1.0f);
            c0323bM1315m.f2215c.m1294h(c0328gM1314l5, 1.0f - f);
            c0323bM1315m.f2215c.m1294h(c0328gM1314l6, f);
            c0326e.m1305c(c0323bM1315m);
        }
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: b */
    public boolean mo1331b() {
        return true;
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: c */
    public void mo1332c(int i) {
        int i2;
        C0338j c0338j;
        C0331c c0331c;
        C0338j c0338j2;
        C0331c c0331c2;
        C0331c c0331c3;
        C0338j c0338j3;
        int i3;
        C0332d.a aVar = C0332d.a.FIXED;
        C0332d c0332d = this.f2299D;
        if (c0332d == null) {
            return;
        }
        if (this.f2391m0 == 1) {
            this.f2349t.f2273a.m1381f(1, c0332d.f2349t.f2273a, 0);
            this.f2351v.f2273a.m1381f(1, c0332d.f2349t.f2273a, 0);
            int i4 = this.f2388j0;
            if (i4 != -1) {
                this.f2348s.f2273a.m1381f(1, c0332d.f2348s.f2273a, i4);
                c0338j2 = this.f2350u.f2273a;
                c0331c3 = c0332d.f2348s;
                c0338j3 = c0331c3.f2273a;
                i3 = this.f2388j0;
            } else {
                int i5 = this.f2389k0;
                if (i5 == -1) {
                    if (this.f2387i0 == -1.0f || c0332d.m1350i() != aVar) {
                        return;
                    }
                    i2 = (int) (c0332d.f2300E * this.f2387i0);
                    this.f2348s.f2273a.m1381f(1, c0332d.f2348s.f2273a, i2);
                    c0338j = this.f2350u.f2273a;
                    c0331c = c0332d.f2348s;
                    c0338j.m1381f(1, c0331c.f2273a, i2);
                    return;
                }
                this.f2348s.f2273a.m1381f(1, c0332d.f2350u.f2273a, -i5);
                c0338j2 = this.f2350u.f2273a;
                c0331c2 = c0332d.f2350u;
                c0338j3 = c0331c2.f2273a;
                i3 = -this.f2389k0;
            }
        } else {
            this.f2348s.f2273a.m1381f(1, c0332d.f2348s.f2273a, 0);
            this.f2350u.f2273a.m1381f(1, c0332d.f2348s.f2273a, 0);
            int i6 = this.f2388j0;
            if (i6 != -1) {
                this.f2349t.f2273a.m1381f(1, c0332d.f2349t.f2273a, i6);
                c0338j2 = this.f2351v.f2273a;
                c0331c3 = c0332d.f2349t;
                c0338j3 = c0331c3.f2273a;
                i3 = this.f2388j0;
            } else {
                int i7 = this.f2389k0;
                if (i7 == -1) {
                    if (this.f2387i0 == -1.0f || c0332d.m1354m() != aVar) {
                        return;
                    }
                    i2 = (int) (c0332d.f2301F * this.f2387i0);
                    this.f2349t.f2273a.m1381f(1, c0332d.f2349t.f2273a, i2);
                    c0338j = this.f2351v.f2273a;
                    c0331c = c0332d.f2349t;
                    c0338j.m1381f(1, c0331c.f2273a, i2);
                    return;
                }
                this.f2349t.f2273a.m1381f(1, c0332d.f2351v.f2273a, -i7);
                c0338j2 = this.f2351v.f2273a;
                c0331c2 = c0332d.f2351v;
                c0338j3 = c0331c2.f2273a;
                i3 = -this.f2389k0;
            }
        }
        c0338j2.m1381f(1, c0338j3, i3);
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: f */
    public C0331c mo1347f(C0331c.b bVar) {
        switch (bVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f2391m0 == 1) {
                    return this.f2390l0;
                }
                break;
            case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
            case 4:
                if (this.f2391m0 == 0) {
                    return this.f2390l0;
                }
                break;
        }
        throw new AssertionError(bVar.name());
    }
}
