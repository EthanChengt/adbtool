package p006b.p026f.p027a;

import java.util.Arrays;

/* JADX INFO: renamed from: b.f.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0328g {

    /* JADX INFO: renamed from: j */
    public static int f2237j = 1;

    /* JADX INFO: renamed from: d */
    public float f2241d;

    /* JADX INFO: renamed from: f */
    public a f2243f;

    /* JADX INFO: renamed from: a */
    public int f2238a = -1;

    /* JADX INFO: renamed from: b */
    public int f2239b = -1;

    /* JADX INFO: renamed from: c */
    public int f2240c = 0;

    /* JADX INFO: renamed from: e */
    public float[] f2242e = new float[7];

    /* JADX INFO: renamed from: g */
    public C0323b[] f2244g = new C0323b[8];

    /* JADX INFO: renamed from: h */
    public int f2245h = 0;

    /* JADX INFO: renamed from: i */
    public int f2246i = 0;

    /* JADX INFO: renamed from: b.f.a.g$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0328g(a aVar) {
        this.f2243f = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m1326a(C0323b c0323b) {
        int i = 0;
        while (true) {
            int i2 = this.f2245h;
            if (i >= i2) {
                C0323b[] c0323bArr = this.f2244g;
                if (i2 >= c0323bArr.length) {
                    this.f2244g = (C0323b[]) Arrays.copyOf(c0323bArr, c0323bArr.length * 2);
                }
                C0323b[] c0323bArr2 = this.f2244g;
                int i3 = this.f2245h;
                c0323bArr2[i3] = c0323b;
                this.f2245h = i3 + 1;
                return;
            }
            if (this.f2244g[i] == c0323b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1327b(C0323b c0323b) {
        int i = this.f2245h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2244g[i2] == c0323b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0323b[] c0323bArr = this.f2244g;
                    int i4 = i2 + i3;
                    c0323bArr[i4] = c0323bArr[i4 + 1];
                }
                this.f2245h--;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1328c() {
        this.f2243f = a.UNKNOWN;
        this.f2240c = 0;
        this.f2238a = -1;
        this.f2239b = -1;
        this.f2241d = 0.0f;
        this.f2245h = 0;
        this.f2246i = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m1329d(C0323b c0323b) {
        C0328g c0328g;
        int i = this.f2245h;
        for (int i2 = 0; i2 < i; i2++) {
            C0323b[] c0323bArr = this.f2244g;
            C0322a c0322a = c0323bArr[i2].f2215c;
            C0323b c0323b2 = c0323bArr[i2];
            while (true) {
                int i3 = c0322a.f2210h;
                int i4 = 0;
                while (true) {
                    if (i3 == -1 || i4 >= c0322a.f2203a) {
                        break;
                    }
                    int i5 = c0322a.f2207e[i3];
                    c0328g = c0323b.f2213a;
                    if (i5 == c0328g.f2238a) {
                        break;
                    }
                    i3 = c0322a.f2208f[i3];
                    i4++;
                }
                float f = c0322a.f2209g[i3];
                c0322a.m1295i(c0328g, false);
                C0322a c0322a2 = c0323b.f2215c;
                int i6 = c0322a2.f2210h;
                for (int i7 = 0; i6 != -1 && i7 < c0322a2.f2203a; i7++) {
                    c0322a.m1287a(c0322a.f2205c.f2219c[c0322a2.f2207e[i6]], c0322a2.f2209g[i6] * f, false);
                    i6 = c0322a2.f2208f[i6];
                }
                c0323b2.f2214b = (c0323b.f2214b * f) + c0323b2.f2214b;
            }
        }
        this.f2245h = 0;
    }

    public String toString() {
        return "null";
    }
}
