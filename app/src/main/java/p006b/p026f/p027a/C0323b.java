package p006b.p026f.p027a;

import c.a.a.a.a;

/* JADX INFO: renamed from: b.f.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0323b implements C0326e.a {

    /* JADX INFO: renamed from: c */
    public final C0322a f2215c;

    /* JADX INFO: renamed from: a */
    public C0328g f2213a = null;

    /* JADX INFO: renamed from: b */
    public float f2214b = 0.0f;

    /* JADX INFO: renamed from: d */
    public boolean f2216d = false;

    public C0323b(C0324c c0324c) {
        this.f2215c = new C0322a(this, c0324c);
    }

    @Override // p006b.p026f.p027a.C0326e.a
    /* JADX INFO: renamed from: a */
    public void mo1296a(C0328g c0328g) {
        int i = c0328g.f2240c;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f2215c.m1294h(c0328g, f);
    }

    /* JADX INFO: renamed from: b */
    public C0323b m1297b(C0326e c0326e, int i) {
        this.f2215c.m1294h(c0326e.m1313k(i, "ep"), 1.0f);
        this.f2215c.m1294h(c0326e.m1313k(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0323b m1298c(C0328g c0328g, C0328g c0328g2, C0328g c0328g3, C0328g c0328g4, float f) {
        this.f2215c.m1294h(c0328g, -1.0f);
        this.f2215c.m1294h(c0328g2, 1.0f);
        this.f2215c.m1294h(c0328g3, f);
        this.f2215c.m1294h(c0328g4, -f);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0323b m1299d(C0328g c0328g, C0328g c0328g2, C0328g c0328g3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2214b = i;
        }
        if (z) {
            this.f2215c.m1294h(c0328g, 1.0f);
            this.f2215c.m1294h(c0328g2, -1.0f);
            this.f2215c.m1294h(c0328g3, -1.0f);
        } else {
            this.f2215c.m1294h(c0328g, -1.0f);
            this.f2215c.m1294h(c0328g2, 1.0f);
            this.f2215c.m1294h(c0328g3, 1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0323b m1300e(C0328g c0328g, C0328g c0328g2, C0328g c0328g3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2214b = i;
        }
        if (z) {
            this.f2215c.m1294h(c0328g, 1.0f);
            this.f2215c.m1294h(c0328g2, -1.0f);
            this.f2215c.m1294h(c0328g3, 1.0f);
        } else {
            this.f2215c.m1294h(c0328g, -1.0f);
            this.f2215c.m1294h(c0328g2, 1.0f);
            this.f2215c.m1294h(c0328g3, -1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C0323b m1301f(C0328g c0328g, C0328g c0328g2, C0328g c0328g3, C0328g c0328g4, float f) {
        this.f2215c.m1294h(c0328g3, 0.5f);
        this.f2215c.m1294h(c0328g4, 0.5f);
        this.f2215c.m1294h(c0328g, -0.5f);
        this.f2215c.m1294h(c0328g2, -0.5f);
        this.f2214b = -f;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m1302g(C0328g c0328g) {
        C0328g c0328g2 = this.f2213a;
        if (c0328g2 != null) {
            this.f2215c.m1294h(c0328g2, -1.0f);
            this.f2213a = null;
        }
        float fM1295i = this.f2215c.m1295i(c0328g, true) * (-1.0f);
        this.f2213a = c0328g;
        if (fM1295i == 1.0f) {
            return;
        }
        this.f2214b /= fM1295i;
        C0322a c0322a = this.f2215c;
        int i = c0322a.f2210h;
        for (int i2 = 0; i != -1 && i2 < c0322a.f2203a; i2++) {
            float[] fArr = c0322a.f2209g;
            fArr[i] = fArr[i] / fM1295i;
            i = c0322a.f2208f[i];
        }
    }

    public String toString() {
        String string;
        boolean z;
        StringBuilder sbM2191e;
        String str;
        StringBuilder sb;
        if (this.f2213a == null) {
            string = "0";
        } else {
            StringBuilder sbM2191e2 = a.m2191e("");
            sbM2191e2.append(this.f2213a);
            string = sbM2191e2.toString();
        }
        String strM2201o = a.m2201o(string, " = ");
        if (this.f2214b != 0.0f) {
            StringBuilder sbM2191e3 = a.m2191e(strM2201o);
            sbM2191e3.append(this.f2214b);
            strM2201o = sbM2191e3.toString();
            z = true;
        } else {
            z = false;
        }
        int i = this.f2215c.f2203a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2215c.m1291e(i2) != null) {
                float fM1292f = this.f2215c.m1292f(i2);
                if (fM1292f != 0.0f) {
                    if (z) {
                        if (fM1292f > 0.0f) {
                            strM2201o = a.m2201o(strM2201o, " + ");
                        } else {
                            sbM2191e = a.m2191e(strM2201o);
                            str = " - ";
                            sbM2191e.append(str);
                            strM2201o = sbM2191e.toString();
                            fM1292f *= -1.0f;
                        }
                    } else if (fM1292f < 0.0f) {
                        sbM2191e = a.m2191e(strM2201o);
                        str = "- ";
                        sbM2191e.append(str);
                        strM2201o = sbM2191e.toString();
                        fM1292f *= -1.0f;
                    }
                    if (fM1292f == 1.0f) {
                        sb = new StringBuilder();
                    } else {
                        sb = new StringBuilder();
                        sb.append(strM2201o);
                        sb.append(fM1292f);
                        strM2201o = " ";
                    }
                    strM2201o = a.m2203q(sb, strM2201o, "null");
                    z = true;
                }
            }
        }
        return !z ? a.m2201o(strM2201o, "0.0") : strM2201o;
    }
}
