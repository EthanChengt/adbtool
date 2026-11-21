package p006b.p026f.p027a;

import java.util.Arrays;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.f.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0322a {

    /* JADX INFO: renamed from: b */
    public final C0323b f2204b;

    /* JADX INFO: renamed from: c */
    public final C0324c f2205c;

    /* JADX INFO: renamed from: a */
    public int f2203a = 0;

    /* JADX INFO: renamed from: d */
    public int f2206d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f2207e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f2208f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f2209g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f2210h = -1;

    /* JADX INFO: renamed from: i */
    public int f2211i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f2212j = false;

    public C0322a(C0323b c0323b, C0324c c0324c) {
        this.f2204b = c0323b;
        this.f2205c = c0324c;
    }

    /* JADX INFO: renamed from: a */
    public final void m1287a(C0328g c0328g, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f2210h;
        if (i == -1) {
            this.f2210h = 0;
            this.f2209g[0] = f;
            this.f2207e[0] = c0328g.f2238a;
            this.f2208f[0] = -1;
            c0328g.f2246i++;
            c0328g.m1326a(this.f2204b);
            this.f2203a++;
            if (this.f2212j) {
                return;
            }
            int i2 = this.f2211i + 1;
            this.f2211i = i2;
            int[] iArr = this.f2207e;
            if (i2 >= iArr.length) {
                this.f2212j = true;
                this.f2211i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2203a; i4++) {
            int[] iArr2 = this.f2207e;
            int i5 = iArr2[i];
            int i6 = c0328g.f2238a;
            if (i5 == i6) {
                float[] fArr = this.f2209g;
                fArr[i] = fArr[i] + f;
                if (fArr[i] == 0.0f) {
                    if (i == this.f2210h) {
                        this.f2210h = this.f2208f[i];
                    } else {
                        int[] iArr3 = this.f2208f;
                        iArr3[i3] = iArr3[i];
                    }
                    if (z) {
                        c0328g.m1327b(this.f2204b);
                    }
                    if (this.f2212j) {
                        this.f2211i = i;
                    }
                    c0328g.f2246i--;
                    this.f2203a--;
                    return;
                }
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f2208f[i];
        }
        int length = this.f2211i;
        int i7 = length + 1;
        if (this.f2212j) {
            int[] iArr4 = this.f2207e;
            if (iArr4[length] != -1) {
                length = iArr4.length;
            }
        } else {
            length = i7;
        }
        int[] iArr5 = this.f2207e;
        if (length >= iArr5.length && this.f2203a < iArr5.length) {
            int i8 = 0;
            while (true) {
                int[] iArr6 = this.f2207e;
                if (i8 >= iArr6.length) {
                    break;
                }
                if (iArr6[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr7 = this.f2207e;
        if (length >= iArr7.length) {
            length = iArr7.length;
            int i9 = this.f2206d * 2;
            this.f2206d = i9;
            this.f2212j = false;
            this.f2211i = length - 1;
            this.f2209g = Arrays.copyOf(this.f2209g, i9);
            this.f2207e = Arrays.copyOf(this.f2207e, this.f2206d);
            this.f2208f = Arrays.copyOf(this.f2208f, this.f2206d);
        }
        this.f2207e[length] = c0328g.f2238a;
        this.f2209g[length] = f;
        int[] iArr8 = this.f2208f;
        if (i3 != -1) {
            iArr8[length] = iArr8[i3];
            iArr8[i3] = length;
        } else {
            iArr8[length] = this.f2210h;
            this.f2210h = length;
        }
        c0328g.f2246i++;
        c0328g.m1326a(this.f2204b);
        this.f2203a++;
        if (!this.f2212j) {
            this.f2211i++;
        }
        int i10 = this.f2211i;
        int[] iArr9 = this.f2207e;
        if (i10 >= iArr9.length) {
            this.f2212j = true;
            this.f2211i = iArr9.length - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1288b() {
        int i = this.f2210h;
        for (int i2 = 0; i != -1 && i2 < this.f2203a; i2++) {
            C0328g c0328g = this.f2205c.f2219c[this.f2207e[i]];
            if (c0328g != null) {
                c0328g.m1327b(this.f2204b);
            }
            i = this.f2208f[i];
        }
        this.f2210h = -1;
        this.f2211i = -1;
        this.f2212j = false;
        this.f2203a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m1289c(C0328g c0328g) {
        int i = this.f2210h;
        for (int i2 = 0; i != -1 && i2 < this.f2203a; i2++) {
            if (this.f2207e[i] == c0328g.f2238a) {
                return this.f2209g[i];
            }
            i = this.f2208f[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public C0328g m1290d(boolean[] zArr, C0328g c0328g) {
        C0328g.a aVar;
        int i = this.f2210h;
        C0328g c0328g2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f2203a; i2++) {
            float[] fArr = this.f2209g;
            if (fArr[i] < 0.0f) {
                C0328g c0328g3 = this.f2205c.f2219c[this.f2207e[i]];
                if ((zArr == null || !zArr[c0328g3.f2238a]) && c0328g3 != c0328g && ((aVar = c0328g3.f2243f) == C0328g.a.SLACK || aVar == C0328g.a.ERROR)) {
                    float f2 = fArr[i];
                    if (f2 < f) {
                        f = f2;
                        c0328g2 = c0328g3;
                    }
                }
            }
            i = this.f2208f[i];
        }
        return c0328g2;
    }

    /* JADX INFO: renamed from: e */
    public final C0328g m1291e(int i) {
        int i2 = this.f2210h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2203a; i3++) {
            if (i3 == i) {
                return this.f2205c.f2219c[this.f2207e[i2]];
            }
            i2 = this.f2208f[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m1292f(int i) {
        int i2 = this.f2210h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2203a; i3++) {
            if (i3 == i) {
                return this.f2209g[i2];
            }
            i2 = this.f2208f[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1293g(C0328g c0328g) {
        return c0328g.f2246i <= 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m1294h(C0328g c0328g, float f) {
        if (f == 0.0f) {
            m1295i(c0328g, true);
            return;
        }
        int i = this.f2210h;
        if (i == -1) {
            this.f2210h = 0;
            this.f2209g[0] = f;
            this.f2207e[0] = c0328g.f2238a;
            this.f2208f[0] = -1;
            c0328g.f2246i++;
            c0328g.m1326a(this.f2204b);
            this.f2203a++;
            if (this.f2212j) {
                return;
            }
            int i2 = this.f2211i + 1;
            this.f2211i = i2;
            int[] iArr = this.f2207e;
            if (i2 >= iArr.length) {
                this.f2212j = true;
                this.f2211i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2203a; i4++) {
            int[] iArr2 = this.f2207e;
            int i5 = iArr2[i];
            int i6 = c0328g.f2238a;
            if (i5 == i6) {
                this.f2209g[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f2208f[i];
        }
        int length = this.f2211i;
        int i7 = length + 1;
        if (this.f2212j) {
            int[] iArr3 = this.f2207e;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f2207e;
        if (length >= iArr4.length && this.f2203a < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.f2207e;
                if (i8 >= iArr5.length) {
                    break;
                }
                if (iArr5[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr6 = this.f2207e;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.f2206d * 2;
            this.f2206d = i9;
            this.f2212j = false;
            this.f2211i = length - 1;
            this.f2209g = Arrays.copyOf(this.f2209g, i9);
            this.f2207e = Arrays.copyOf(this.f2207e, this.f2206d);
            this.f2208f = Arrays.copyOf(this.f2208f, this.f2206d);
        }
        this.f2207e[length] = c0328g.f2238a;
        this.f2209g[length] = f;
        int[] iArr7 = this.f2208f;
        if (i3 != -1) {
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            iArr7[length] = this.f2210h;
            this.f2210h = length;
        }
        c0328g.f2246i++;
        c0328g.m1326a(this.f2204b);
        int i10 = this.f2203a + 1;
        this.f2203a = i10;
        if (!this.f2212j) {
            this.f2211i++;
        }
        int[] iArr8 = this.f2207e;
        if (i10 >= iArr8.length) {
            this.f2212j = true;
        }
        if (this.f2211i >= iArr8.length) {
            this.f2212j = true;
            this.f2211i = iArr8.length - 1;
        }
    }

    /* JADX INFO: renamed from: i */
    public final float m1295i(C0328g c0328g, boolean z) {
        int i = this.f2210h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2203a) {
            if (this.f2207e[i] == c0328g.f2238a) {
                if (i == this.f2210h) {
                    this.f2210h = this.f2208f[i];
                } else {
                    int[] iArr = this.f2208f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0328g.m1327b(this.f2204b);
                }
                c0328g.f2246i--;
                this.f2203a--;
                this.f2207e[i] = -1;
                if (this.f2212j) {
                    this.f2211i = i;
                }
                return this.f2209g[i];
            }
            i2++;
            i3 = i;
            i = this.f2208f[i];
        }
        return 0.0f;
    }

    public String toString() {
        int i = this.f2210h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f2203a; i2++) {
            StringBuilder sbM2191e = a.m2191e(a.m2201o(string, " -> "));
            sbM2191e.append(this.f2209g[i]);
            sbM2191e.append(" : ");
            StringBuilder sbM2191e2 = a.m2191e(sbM2191e.toString());
            sbM2191e2.append(this.f2205c.f2219c[this.f2207e[i]]);
            string = sbM2191e2.toString();
            i = this.f2208f[i];
        }
        return string;
    }
}
