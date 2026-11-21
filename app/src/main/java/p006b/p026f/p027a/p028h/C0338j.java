package p006b.p026f.p027a.p028h;

import p006b.p026f.p027a.C0326e;
import p006b.p026f.p027a.C0328g;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.f.a.h.j */
/* JADX INFO: loaded from: classes.dex */
public class C0338j extends C0340l {

    /* JADX INFO: renamed from: c */
    public C0331c f2395c;

    /* JADX INFO: renamed from: d */
    public C0338j f2396d;

    /* JADX INFO: renamed from: e */
    public float f2397e;

    /* JADX INFO: renamed from: f */
    public C0338j f2398f;

    /* JADX INFO: renamed from: g */
    public float f2399g;

    /* JADX INFO: renamed from: i */
    public C0338j f2401i;

    /* JADX INFO: renamed from: h */
    public int f2400h = 0;

    /* JADX INFO: renamed from: j */
    public C0339k f2402j = null;

    /* JADX INFO: renamed from: k */
    public int f2403k = 1;

    /* JADX INFO: renamed from: l */
    public C0339k f2404l = null;

    /* JADX INFO: renamed from: m */
    public int f2405m = 1;

    public C0338j(C0331c c0331c) {
        this.f2395c = c0331c;
    }

    @Override // p006b.p026f.p027a.p028h.C0340l
    /* JADX INFO: renamed from: d */
    public void mo1379d() {
        int i;
        C0338j c0338j;
        C0338j c0338j2;
        C0338j c0338j3;
        C0338j c0338j4;
        C0338j c0338j5;
        C0338j c0338j6;
        float fM1355n;
        float f;
        C0338j c0338j7;
        float f2;
        boolean z = true;
        if (this.f2408b == 1 || (i = this.f2400h) == 4) {
            return;
        }
        C0339k c0339k = this.f2402j;
        if (c0339k != null) {
            if (c0339k.f2408b != 1) {
                return;
            } else {
                this.f2397e = this.f2403k * c0339k.f2406c;
            }
        }
        C0339k c0339k2 = this.f2404l;
        if (c0339k2 != null) {
            if (c0339k2.f2408b != 1) {
                return;
            } else {
                float f3 = c0339k2.f2406c;
            }
        }
        if (i == 1 && ((c0338j7 = this.f2396d) == null || c0338j7.f2408b == 1)) {
            if (c0338j7 == null) {
                this.f2398f = this;
                f2 = this.f2397e;
            } else {
                this.f2398f = c0338j7.f2398f;
                f2 = c0338j7.f2399g + this.f2397e;
            }
            this.f2399g = f2;
            m1388a();
            return;
        }
        if (i == 2 && (c0338j4 = this.f2396d) != null && c0338j4.f2408b == 1 && (c0338j5 = this.f2401i) != null && (c0338j6 = c0338j5.f2396d) != null && c0338j6.f2408b == 1) {
            this.f2398f = c0338j4.f2398f;
            c0338j5.f2398f = c0338j6.f2398f;
            C0331c c0331c = this.f2395c;
            C0331c.b bVar = c0331c.f2275c;
            C0331c.b bVar2 = C0331c.b.RIGHT;
            int i2 = 0;
            if (bVar != bVar2 && bVar != C0331c.b.BOTTOM) {
                z = false;
            }
            float f4 = z ? c0338j4.f2399g - c0338j6.f2399g : c0338j6.f2399g - c0338j4.f2399g;
            if (bVar == C0331c.b.LEFT || bVar == bVar2) {
                fM1355n = f4 - c0331c.f2274b.m1355n();
                f = this.f2395c.f2274b.f2317V;
            } else {
                fM1355n = f4 - c0331c.f2274b.m1349h();
                f = this.f2395c.f2274b.f2318W;
            }
            int iM1336b = this.f2395c.m1336b();
            int iM1336b2 = this.f2401i.f2395c.m1336b();
            C0331c c0331c2 = this.f2395c.f2276d;
            C0338j c0338j8 = this.f2401i;
            if (c0331c2 == c0338j8.f2395c.f2276d) {
                f = 0.5f;
                iM1336b2 = 0;
            } else {
                i2 = iM1336b;
            }
            float f5 = i2;
            float f6 = iM1336b2;
            float f7 = (fM1355n - f5) - f6;
            if (z) {
                c0338j8.f2399g = (f7 * f) + c0338j8.f2396d.f2399g + f6;
                this.f2399g = (this.f2396d.f2399g - f5) - ((1.0f - f) * f7);
            } else {
                this.f2399g = (f7 * f) + this.f2396d.f2399g + f5;
                c0338j8.f2399g = (c0338j8.f2396d.f2399g - f6) - ((1.0f - f) * f7);
            }
        } else if (i != 3 || (c0338j = this.f2396d) == null || c0338j.f2408b != 1 || (c0338j2 = this.f2401i) == null || (c0338j3 = c0338j2.f2396d) == null || c0338j3.f2408b != 1) {
            if (i == 5) {
                this.f2395c.f2274b.mo1334u();
                return;
            }
            return;
        } else {
            this.f2398f = c0338j.f2398f;
            c0338j2.f2398f = c0338j3.f2398f;
            this.f2399g = c0338j.f2399g + this.f2397e;
            c0338j2.f2399g = c0338j3.f2399g + c0338j2.f2397e;
        }
        m1388a();
        this.f2401i.m1388a();
    }

    /* JADX INFO: renamed from: e */
    public void m1380e(C0326e c0326e) {
        C0328g c0328g = this.f2395c.f2281i;
        C0338j c0338j = this.f2398f;
        if (c0338j == null) {
            c0326e.m1307e(c0328g, (int) (this.f2399g + 0.5f));
        } else {
            c0326e.m1306d(c0328g, c0326e.m1314l(c0338j.f2395c), (int) (this.f2399g + 0.5f), 6);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1381f(int i, C0338j c0338j, int i2) {
        this.f2400h = i;
        this.f2396d = c0338j;
        this.f2397e = i2;
        c0338j.f2407a.add(this);
    }

    /* JADX INFO: renamed from: g */
    public void m1382g(C0338j c0338j, int i) {
        this.f2396d = c0338j;
        this.f2397e = i;
        c0338j.f2407a.add(this);
    }

    /* JADX INFO: renamed from: h */
    public void m1383h(C0338j c0338j, int i, C0339k c0339k) {
        this.f2396d = c0338j;
        c0338j.f2407a.add(this);
        this.f2402j = c0339k;
        this.f2403k = i;
        c0339k.f2407a.add(this);
    }

    /* JADX INFO: renamed from: i */
    public void m1384i() {
        this.f2408b = 0;
        this.f2407a.clear();
        this.f2396d = null;
        this.f2397e = 0.0f;
        this.f2402j = null;
        this.f2403k = 1;
        this.f2404l = null;
        this.f2405m = 1;
        this.f2398f = null;
        this.f2399g = 0.0f;
        this.f2401i = null;
        this.f2400h = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m1385j(C0338j c0338j, float f) {
        int i = this.f2408b;
        if (i == 0 || !(this.f2398f == c0338j || this.f2399g == f)) {
            this.f2398f = c0338j;
            this.f2399g = f;
            if (i == 1) {
                m1389b();
            }
            m1388a();
        }
    }

    /* JADX INFO: renamed from: k */
    public String m1386k(int i) {
        if (i == 1) {
            return "DIRECT";
        }
        if (i == 2) {
            return "CENTER";
        }
        if (i == 3) {
            return "MATCH";
        }
        if (i == 4) {
            return "CHAIN";
        }
        return i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public String toString() {
        StringBuilder sbM2191e;
        String str;
        if (this.f2408b != 1) {
            sbM2191e = a.m2191e("{ ");
            sbM2191e.append(this.f2395c);
            str = " UNRESOLVED} type: ";
        } else if (this.f2398f == this) {
            sbM2191e = a.m2191e("[");
            sbM2191e.append(this.f2395c);
            sbM2191e.append(", RESOLVED: ");
            sbM2191e.append(this.f2399g);
            str = "]  type: ";
        } else {
            sbM2191e = a.m2191e("[");
            sbM2191e.append(this.f2395c);
            sbM2191e.append(", RESOLVED: ");
            sbM2191e.append(this.f2398f);
            sbM2191e.append(":");
            sbM2191e.append(this.f2399g);
            str = "] type: ";
        }
        sbM2191e.append(str);
        sbM2191e.append(m1386k(this.f2400h));
        return sbM2191e.toString();
    }
}
