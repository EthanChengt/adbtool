package p006b.p026f.p027a;

import java.util.Arrays;
import java.util.Objects;
import p006b.p026f.p027a.p028h.C0331c;

/* JADX INFO: renamed from: b.f.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0326e {

    /* JADX INFO: renamed from: o */
    public static int f2220o = 1000;

    /* JADX INFO: renamed from: b */
    public a f2222b;

    /* JADX INFO: renamed from: e */
    public C0323b[] f2225e;

    /* JADX INFO: renamed from: k */
    public final C0324c f2231k;

    /* JADX INFO: renamed from: n */
    public final a f2234n;

    /* JADX INFO: renamed from: a */
    public int f2221a = 0;

    /* JADX INFO: renamed from: c */
    public int f2223c = 32;

    /* JADX INFO: renamed from: d */
    public int f2224d = 32;

    /* JADX INFO: renamed from: f */
    public boolean f2226f = false;

    /* JADX INFO: renamed from: g */
    public boolean[] f2227g = new boolean[32];

    /* JADX INFO: renamed from: h */
    public int f2228h = 1;

    /* JADX INFO: renamed from: i */
    public int f2229i = 0;

    /* JADX INFO: renamed from: j */
    public int f2230j = 32;

    /* JADX INFO: renamed from: l */
    public C0328g[] f2232l = new C0328g[f2220o];

    /* JADX INFO: renamed from: m */
    public int f2233m = 0;

    /* JADX INFO: renamed from: b.f.a.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1296a(C0328g c0328g);
    }

    public C0326e() {
        this.f2225e = null;
        this.f2225e = new C0323b[32];
        m1321s();
        C0324c c0324c = new C0324c();
        this.f2231k = c0324c;
        this.f2222b = new C0325d(c0324c);
        this.f2234n = new C0323b(c0324c);
    }

    /* JADX INFO: renamed from: a */
    public final C0328g m1303a(C0328g.a aVar, String str) {
        C0328g c0328gM1324a = this.f2231k.f2218b.m1324a();
        if (c0328gM1324a == null) {
            c0328gM1324a = new C0328g(aVar);
        } else {
            c0328gM1324a.m1328c();
        }
        c0328gM1324a.f2243f = aVar;
        int i = this.f2233m;
        int i2 = f2220o;
        if (i >= i2) {
            int i3 = i2 * 2;
            f2220o = i3;
            this.f2232l = (C0328g[]) Arrays.copyOf(this.f2232l, i3);
        }
        C0328g[] c0328gArr = this.f2232l;
        int i4 = this.f2233m;
        this.f2233m = i4 + 1;
        c0328gArr[i4] = c0328gM1324a;
        return c0328gM1324a;
    }

    /* JADX INFO: renamed from: b */
    public void m1304b(C0328g c0328g, C0328g c0328g2, int i, float f, C0328g c0328g3, C0328g c0328g4, int i2, int i3) {
        float f2;
        C0323b c0323bM1315m = m1315m();
        if (c0328g2 == c0328g3) {
            c0323bM1315m.f2215c.m1294h(c0328g, 1.0f);
            c0323bM1315m.f2215c.m1294h(c0328g4, 1.0f);
            c0323bM1315m.f2215c.m1294h(c0328g2, -2.0f);
        } else if (f == 0.5f) {
            c0323bM1315m.f2215c.m1294h(c0328g, 1.0f);
            c0323bM1315m.f2215c.m1294h(c0328g2, -1.0f);
            c0323bM1315m.f2215c.m1294h(c0328g3, -1.0f);
            c0323bM1315m.f2215c.m1294h(c0328g4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (-i) + i2;
                c0323bM1315m.f2214b = f2;
            }
        } else {
            if (f <= 0.0f) {
                c0323bM1315m.f2215c.m1294h(c0328g, -1.0f);
                c0323bM1315m.f2215c.m1294h(c0328g2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                c0323bM1315m.f2215c.m1294h(c0328g3, -1.0f);
                c0323bM1315m.f2215c.m1294h(c0328g4, 1.0f);
                f2 = i2;
            } else {
                float f3 = 1.0f - f;
                c0323bM1315m.f2215c.m1294h(c0328g, f3 * 1.0f);
                c0323bM1315m.f2215c.m1294h(c0328g2, f3 * (-1.0f));
                c0323bM1315m.f2215c.m1294h(c0328g3, (-1.0f) * f);
                c0323bM1315m.f2215c.m1294h(c0328g4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c0323bM1315m.f2214b = (i2 * f) + ((-i) * f3);
                }
            }
            c0323bM1315m.f2214b = f2;
        }
        if (i3 != 6) {
            c0323bM1315m.m1297b(this, i3);
        }
        m1305c(c0323bM1315m);
    }

    /* JADX INFO: renamed from: c */
    public void m1305c(C0323b c0323b) {
        boolean z;
        boolean z2;
        boolean z3;
        C0328g c0328gM1290d;
        C0328g.a aVar = C0328g.a.UNRESTRICTED;
        boolean z4 = true;
        if (this.f2229i + 1 >= this.f2230j || this.f2228h + 1 >= this.f2224d) {
            m1318p();
        }
        if (c0323b.f2216d) {
            z = false;
        } else {
            m1323u(c0323b);
            if (c0323b.f2213a == null && c0323b.f2214b == 0.0f && c0323b.f2215c.f2203a == 0) {
                return;
            }
            float f = c0323b.f2214b;
            if (f < 0.0f) {
                c0323b.f2214b = f * (-1.0f);
                C0322a c0322a = c0323b.f2215c;
                int i = c0322a.f2210h;
                for (int i2 = 0; i != -1 && i2 < c0322a.f2203a; i2++) {
                    float[] fArr = c0322a.f2209g;
                    fArr[i] = fArr[i] * (-1.0f);
                    i = c0322a.f2208f[i];
                }
            }
            C0322a c0322a2 = c0323b.f2215c;
            int i3 = c0322a2.f2210h;
            int i4 = 0;
            C0328g c0328g = null;
            C0328g c0328g2 = null;
            float f2 = 0.0f;
            boolean zM1293g = false;
            float f3 = 0.0f;
            boolean zM1293g2 = false;
            for (int i5 = -1; i3 != i5 && i4 < c0322a2.f2203a; i5 = -1) {
                float[] fArr2 = c0322a2.f2209g;
                float f4 = fArr2[i3];
                C0328g c0328g3 = c0322a2.f2205c.f2219c[c0322a2.f2207e[i3]];
                if (f4 < 0.0f) {
                    if (f4 > -0.001f) {
                        fArr2[i3] = 0.0f;
                        c0328g3.m1327b(c0322a2.f2204b);
                        f4 = 0.0f;
                    }
                } else if (f4 < 0.001f) {
                    fArr2[i3] = 0.0f;
                    c0328g3.m1327b(c0322a2.f2204b);
                    f4 = 0.0f;
                }
                if (f4 != 0.0f) {
                    if (c0328g3.f2243f == aVar) {
                        if (c0328g2 == null || f2 > f4) {
                            zM1293g = c0322a2.m1293g(c0328g3);
                            c0328g2 = c0328g3;
                            f2 = f4;
                        } else if (!zM1293g && c0322a2.m1293g(c0328g3)) {
                            c0328g2 = c0328g3;
                            f2 = f4;
                            zM1293g = true;
                        }
                    } else if (c0328g2 == null && f4 < 0.0f) {
                        if (c0328g == null || f3 > f4) {
                            zM1293g2 = c0322a2.m1293g(c0328g3);
                            c0328g = c0328g3;
                            f3 = f4;
                        } else if (!zM1293g2 && c0322a2.m1293g(c0328g3)) {
                            c0328g = c0328g3;
                            f3 = f4;
                            zM1293g2 = true;
                        }
                    }
                }
                i3 = c0322a2.f2208f[i3];
                i4++;
            }
            if (c0328g2 != null) {
                c0328g = c0328g2;
            }
            if (c0328g == null) {
                z2 = true;
            } else {
                c0323b.m1302g(c0328g);
                z2 = false;
            }
            if (c0323b.f2215c.f2203a == 0) {
                c0323b.f2216d = true;
            }
            if (z2) {
                if (this.f2228h + 1 >= this.f2224d) {
                    m1318p();
                }
                C0328g c0328gM1303a = m1303a(C0328g.a.SLACK, null);
                int i6 = this.f2221a + 1;
                this.f2221a = i6;
                this.f2228h++;
                c0328gM1303a.f2238a = i6;
                this.f2231k.f2219c[i6] = c0328gM1303a;
                c0323b.f2213a = c0328gM1303a;
                m1311i(c0323b);
                C0323b c0323b2 = (C0323b) this.f2234n;
                Objects.requireNonNull(c0323b2);
                c0323b2.f2213a = null;
                c0323b2.f2215c.m1288b();
                int i7 = 0;
                while (true) {
                    C0322a c0322a3 = c0323b.f2215c;
                    if (i7 >= c0322a3.f2203a) {
                        break;
                    }
                    c0323b2.f2215c.m1287a(c0322a3.m1291e(i7), c0323b.f2215c.m1292f(i7), true);
                    i7++;
                }
                m1320r(this.f2234n);
                if (c0328gM1303a.f2239b == -1) {
                    if (c0323b.f2213a == c0328gM1303a && (c0328gM1290d = c0323b.f2215c.m1290d(null, c0328gM1303a)) != null) {
                        c0323b.m1302g(c0328gM1290d);
                    }
                    if (!c0323b.f2216d) {
                        c0323b.f2213a.m1329d(c0323b);
                    }
                    this.f2229i--;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            C0328g c0328g4 = c0323b.f2213a;
            if (c0328g4 == null || (c0328g4.f2243f != aVar && c0323b.f2214b < 0.0f)) {
                z4 = false;
            }
            if (!z4) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        m1311i(c0323b);
    }

    /* JADX INFO: renamed from: d */
    public C0323b m1306d(C0328g c0328g, C0328g c0328g2, int i, int i2) {
        C0323b c0323bM1315m = m1315m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0323bM1315m.f2214b = i;
        }
        if (z) {
            c0323bM1315m.f2215c.m1294h(c0328g, 1.0f);
            c0323bM1315m.f2215c.m1294h(c0328g2, -1.0f);
        } else {
            c0323bM1315m.f2215c.m1294h(c0328g, -1.0f);
            c0323bM1315m.f2215c.m1294h(c0328g2, 1.0f);
        }
        if (i2 != 6) {
            c0323bM1315m.m1297b(this, i2);
        }
        m1305c(c0323bM1315m);
        return c0323bM1315m;
    }

    /* JADX INFO: renamed from: e */
    public void m1307e(C0328g c0328g, int i) {
        C0323b c0323bM1315m;
        C0322a c0322a;
        float f;
        int i2 = c0328g.f2239b;
        if (i2 != -1) {
            C0323b c0323b = this.f2225e[i2];
            if (!c0323b.f2216d) {
                if (c0323b.f2215c.f2203a == 0) {
                    c0323b.f2216d = true;
                } else {
                    c0323bM1315m = m1315m();
                    if (i < 0) {
                        c0323bM1315m.f2214b = i * (-1);
                        c0322a = c0323bM1315m.f2215c;
                        f = 1.0f;
                    } else {
                        c0323bM1315m.f2214b = i;
                        c0322a = c0323bM1315m.f2215c;
                        f = -1.0f;
                    }
                    c0322a.m1294h(c0328g, f);
                }
            }
            c0323b.f2214b = i;
            return;
        }
        c0323bM1315m = m1315m();
        c0323bM1315m.f2213a = c0328g;
        float f2 = i;
        c0328g.f2241d = f2;
        c0323bM1315m.f2214b = f2;
        c0323bM1315m.f2216d = true;
        m1305c(c0323bM1315m);
    }

    /* JADX INFO: renamed from: f */
    public void m1308f(C0328g c0328g, C0328g c0328g2, int i, int i2) {
        C0323b c0323bM1315m = m1315m();
        C0328g c0328gM1316n = m1316n();
        c0328gM1316n.f2240c = 0;
        c0323bM1315m.m1299d(c0328g, c0328g2, c0328gM1316n, i);
        if (i2 != 6) {
            c0323bM1315m.f2215c.m1294h(m1313k(i2, null), (int) (c0323bM1315m.f2215c.m1289c(c0328gM1316n) * (-1.0f)));
        }
        m1305c(c0323bM1315m);
    }

    /* JADX INFO: renamed from: g */
    public void m1309g(C0328g c0328g, C0328g c0328g2, int i, int i2) {
        C0323b c0323bM1315m = m1315m();
        C0328g c0328gM1316n = m1316n();
        c0328gM1316n.f2240c = 0;
        c0323bM1315m.m1300e(c0328g, c0328g2, c0328gM1316n, i);
        if (i2 != 6) {
            c0323bM1315m.f2215c.m1294h(m1313k(i2, null), (int) (c0323bM1315m.f2215c.m1289c(c0328gM1316n) * (-1.0f)));
        }
        m1305c(c0323bM1315m);
    }

    /* JADX INFO: renamed from: h */
    public void m1310h(C0328g c0328g, C0328g c0328g2, C0328g c0328g3, C0328g c0328g4, float f, int i) {
        C0323b c0323bM1315m = m1315m();
        c0323bM1315m.m1298c(c0328g, c0328g2, c0328g3, c0328g4, f);
        if (i != 6) {
            c0323bM1315m.m1297b(this, i);
        }
        m1305c(c0323bM1315m);
    }

    /* JADX INFO: renamed from: i */
    public final void m1311i(C0323b c0323b) {
        C0323b[] c0323bArr = this.f2225e;
        int i = this.f2229i;
        if (c0323bArr[i] != null) {
            this.f2231k.f2217a.m1325b(c0323bArr[i]);
        }
        C0323b[] c0323bArr2 = this.f2225e;
        int i2 = this.f2229i;
        c0323bArr2[i2] = c0323b;
        C0328g c0328g = c0323b.f2213a;
        c0328g.f2239b = i2;
        this.f2229i = i2 + 1;
        c0328g.m1329d(c0323b);
    }

    /* JADX INFO: renamed from: j */
    public final void m1312j() {
        for (int i = 0; i < this.f2229i; i++) {
            C0323b c0323b = this.f2225e[i];
            c0323b.f2213a.f2241d = c0323b.f2214b;
        }
    }

    /* JADX INFO: renamed from: k */
    public C0328g m1313k(int i, String str) {
        if (this.f2228h + 1 >= this.f2224d) {
            m1318p();
        }
        C0328g c0328gM1303a = m1303a(C0328g.a.ERROR, str);
        int i2 = this.f2221a + 1;
        this.f2221a = i2;
        this.f2228h++;
        c0328gM1303a.f2238a = i2;
        c0328gM1303a.f2240c = i;
        this.f2231k.f2219c[i2] = c0328gM1303a;
        this.f2222b.mo1296a(c0328gM1303a);
        return c0328gM1303a;
    }

    /* JADX INFO: renamed from: l */
    public C0328g m1314l(Object obj) {
        C0328g c0328g = null;
        if (obj == null) {
            return null;
        }
        if (this.f2228h + 1 >= this.f2224d) {
            m1318p();
        }
        if (obj instanceof C0331c) {
            C0331c c0331c = (C0331c) obj;
            c0328g = c0331c.f2281i;
            if (c0328g == null) {
                c0331c.m1339e();
                c0328g = c0331c.f2281i;
            }
            int i = c0328g.f2238a;
            if (i == -1 || i > this.f2221a || this.f2231k.f2219c[i] == null) {
                if (i != -1) {
                    c0328g.m1328c();
                }
                int i2 = this.f2221a + 1;
                this.f2221a = i2;
                this.f2228h++;
                c0328g.f2238a = i2;
                c0328g.f2243f = C0328g.a.UNRESTRICTED;
                this.f2231k.f2219c[i2] = c0328g;
            }
        }
        return c0328g;
    }

    /* JADX INFO: renamed from: m */
    public C0323b m1315m() {
        C0323b c0323bM1324a = this.f2231k.f2217a.m1324a();
        if (c0323bM1324a == null) {
            c0323bM1324a = new C0323b(this.f2231k);
        } else {
            c0323bM1324a.f2213a = null;
            c0323bM1324a.f2215c.m1288b();
            c0323bM1324a.f2214b = 0.0f;
            c0323bM1324a.f2216d = false;
        }
        C0328g.f2237j++;
        return c0323bM1324a;
    }

    /* JADX INFO: renamed from: n */
    public C0328g m1316n() {
        if (this.f2228h + 1 >= this.f2224d) {
            m1318p();
        }
        C0328g c0328gM1303a = m1303a(C0328g.a.SLACK, null);
        int i = this.f2221a + 1;
        this.f2221a = i;
        this.f2228h++;
        c0328gM1303a.f2238a = i;
        this.f2231k.f2219c[i] = c0328gM1303a;
        return c0328gM1303a;
    }

    /* JADX INFO: renamed from: o */
    public int m1317o(Object obj) {
        C0328g c0328g = ((C0331c) obj).f2281i;
        if (c0328g != null) {
            return (int) (c0328g.f2241d + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m1318p() {
        int i = this.f2223c * 2;
        this.f2223c = i;
        this.f2225e = (C0323b[]) Arrays.copyOf(this.f2225e, i);
        C0324c c0324c = this.f2231k;
        c0324c.f2219c = (C0328g[]) Arrays.copyOf(c0324c.f2219c, this.f2223c);
        int i2 = this.f2223c;
        this.f2227g = new boolean[i2];
        this.f2224d = i2;
        this.f2230j = i2;
    }

    /* JADX INFO: renamed from: q */
    public void m1319q(a aVar) {
        float f;
        int i;
        boolean z;
        m1323u((C0323b) aVar);
        C0328g.a aVar2 = C0328g.a.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f2229i) {
                z = false;
                break;
            }
            C0323b[] c0323bArr = this.f2225e;
            if (c0323bArr[i2].f2213a.f2243f != aVar2 && c0323bArr[i2].f2214b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.f2229i) {
                    C0323b c0323b = this.f2225e[i4];
                    if (c0323b.f2213a.f2243f != aVar2 && !c0323b.f2216d && c0323b.f2214b < f) {
                        int i8 = 1;
                        while (i8 < this.f2228h) {
                            C0328g c0328g = this.f2231k.f2219c[i8];
                            float fM1289c = c0323b.f2215c.m1289c(c0328g);
                            if (fM1289c > f) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f3 = c0328g.f2242e[i9] / fM1289c;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f2 = f3;
                                        i5 = i4;
                                        i6 = i8;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                }
                if (i5 != -1) {
                    C0323b c0323b2 = this.f2225e[i5];
                    c0323b2.f2213a.f2239b = -1;
                    c0323b2.m1302g(this.f2231k.f2219c[i6]);
                    C0328g c0328g2 = c0323b2.f2213a;
                    c0328g2.f2239b = i5;
                    c0328g2.m1329d(c0323b2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f2228h / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        m1320r(aVar);
        m1312j();
    }

    /* JADX INFO: renamed from: r */
    public final int m1320r(a aVar) {
        boolean z;
        for (int i = 0; i < this.f2228h; i++) {
            this.f2227g[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f2228h * 2) {
                return i2;
            }
            C0323b c0323b = (C0323b) aVar;
            C0328g c0328g = c0323b.f2213a;
            if (c0328g != null) {
                this.f2227g[c0328g.f2238a] = true;
            }
            C0328g c0328gM1290d = c0323b.f2215c.m1290d(this.f2227g, null);
            if (c0328gM1290d != null) {
                boolean[] zArr = this.f2227g;
                int i3 = c0328gM1290d.f2238a;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c0328gM1290d != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f2229i; i5++) {
                    C0323b c0323b2 = this.f2225e[i5];
                    if (c0323b2.f2213a.f2243f != C0328g.a.UNRESTRICTED && !c0323b2.f2216d) {
                        C0322a c0322a = c0323b2.f2215c;
                        int i6 = c0322a.f2210h;
                        if (i6 == -1) {
                            z = false;
                            break;
                        }
                        int i7 = 0;
                        while (true) {
                            if (i6 == -1 || i7 >= c0322a.f2203a) {
                                z = false;
                                break;
                            }
                            if (c0322a.f2207e[i6] == c0328gM1290d.f2238a) {
                                z = true;
                                break;
                            }
                            i6 = c0322a.f2208f[i6];
                            i7++;
                        }
                        if (z) {
                            float fM1289c = c0323b2.f2215c.m1289c(c0328gM1290d);
                            if (fM1289c < 0.0f) {
                                float f2 = (-c0323b2.f2214b) / fM1289c;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0323b c0323b3 = this.f2225e[i4];
                    c0323b3.f2213a.f2239b = -1;
                    c0323b3.m1302g(c0328gM1290d);
                    C0328g c0328g2 = c0323b3.f2213a;
                    c0328g2.f2239b = i4;
                    c0328g2.m1329d(c0323b3);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public final void m1321s() {
        int i = 0;
        while (true) {
            C0323b[] c0323bArr = this.f2225e;
            if (i >= c0323bArr.length) {
                return;
            }
            C0323b c0323b = c0323bArr[i];
            if (c0323b != null) {
                this.f2231k.f2217a.m1325b(c0323b);
            }
            this.f2225e[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1322t() {
        C0324c c0324c;
        int i = 0;
        while (true) {
            c0324c = this.f2231k;
            C0328g[] c0328gArr = c0324c.f2219c;
            if (i >= c0328gArr.length) {
                break;
            }
            C0328g c0328g = c0328gArr[i];
            if (c0328g != null) {
                c0328g.m1328c();
            }
            i++;
        }
        C0327f<C0328g> c0327f = c0324c.f2218b;
        C0328g[] c0328gArr2 = this.f2232l;
        int length = this.f2233m;
        Objects.requireNonNull(c0327f);
        if (length > c0328gArr2.length) {
            length = c0328gArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C0328g c0328g2 = c0328gArr2[i2];
            int i3 = c0327f.f2236b;
            Object[] objArr = c0327f.f2235a;
            if (i3 < objArr.length) {
                objArr[i3] = c0328g2;
                c0327f.f2236b = i3 + 1;
            }
        }
        this.f2233m = 0;
        Arrays.fill(this.f2231k.f2219c, (Object) null);
        this.f2221a = 0;
        C0323b c0323b = (C0323b) this.f2222b;
        c0323b.f2215c.m1288b();
        c0323b.f2213a = null;
        c0323b.f2214b = 0.0f;
        this.f2228h = 1;
        for (int i4 = 0; i4 < this.f2229i; i4++) {
            Objects.requireNonNull(this.f2225e[i4]);
        }
        m1321s();
        this.f2229i = 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m1323u(C0323b c0323b) {
        C0328g c0328g;
        if (this.f2229i > 0) {
            C0322a c0322a = c0323b.f2215c;
            C0323b[] c0323bArr = this.f2225e;
            loop0: while (true) {
                int i = c0322a.f2210h;
                int i2 = 0;
                while (true) {
                    if (i == -1 || i2 >= c0322a.f2203a) {
                        break loop0;
                    }
                    c0328g = c0322a.f2205c.f2219c[c0322a.f2207e[i]];
                    if (c0328g.f2239b != -1) {
                        break;
                    }
                    i = c0322a.f2208f[i];
                    i2++;
                }
                float f = c0322a.f2209g[i];
                c0322a.m1295i(c0328g, true);
                C0323b c0323b2 = c0323bArr[c0328g.f2239b];
                if (!c0323b2.f2216d) {
                    C0322a c0322a2 = c0323b2.f2215c;
                    int i3 = c0322a2.f2210h;
                    for (int i4 = 0; i3 != -1 && i4 < c0322a2.f2203a; i4++) {
                        c0322a.m1287a(c0322a.f2205c.f2219c[c0322a2.f2207e[i3]], c0322a2.f2209g[i3] * f, true);
                        i3 = c0322a2.f2208f[i3];
                    }
                }
                c0323b.f2214b = (c0323b2.f2214b * f) + c0323b.f2214b;
                c0323b2.f2213a.m1327b(c0323b);
            }
            if (c0323b.f2215c.f2203a == 0) {
                c0323b.f2216d = true;
            }
        }
    }
}
