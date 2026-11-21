package p006b.p026f.p027a.p028h;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p006b.p026f.p027a.C0323b;
import p006b.p026f.p027a.C0324c;
import p006b.p026f.p027a.C0326e;
import p006b.p026f.p027a.C0328g;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.f.a.h.d */
/* JADX INFO: loaded from: classes.dex */
public class C0332d {

    /* JADX INFO: renamed from: A */
    public C0331c[] f2296A;

    /* JADX INFO: renamed from: B */
    public ArrayList<C0331c> f2297B;

    /* JADX INFO: renamed from: C */
    public a[] f2298C;

    /* JADX INFO: renamed from: D */
    public C0332d f2299D;

    /* JADX INFO: renamed from: E */
    public int f2300E;

    /* JADX INFO: renamed from: F */
    public int f2301F;

    /* JADX INFO: renamed from: G */
    public float f2302G;

    /* JADX INFO: renamed from: H */
    public int f2303H;

    /* JADX INFO: renamed from: I */
    public int f2304I;

    /* JADX INFO: renamed from: J */
    public int f2305J;

    /* JADX INFO: renamed from: K */
    public int f2306K;

    /* JADX INFO: renamed from: L */
    public int f2307L;

    /* JADX INFO: renamed from: M */
    public int f2308M;

    /* JADX INFO: renamed from: N */
    public int f2309N;

    /* JADX INFO: renamed from: O */
    public int f2310O;

    /* JADX INFO: renamed from: P */
    public int f2311P;

    /* JADX INFO: renamed from: Q */
    public int f2312Q;

    /* JADX INFO: renamed from: R */
    public int f2313R;

    /* JADX INFO: renamed from: S */
    public int f2314S;

    /* JADX INFO: renamed from: T */
    public int f2315T;

    /* JADX INFO: renamed from: U */
    public int f2316U;

    /* JADX INFO: renamed from: V */
    public float f2317V;

    /* JADX INFO: renamed from: W */
    public float f2318W;

    /* JADX INFO: renamed from: X */
    public Object f2319X;

    /* JADX INFO: renamed from: Y */
    public int f2320Y;

    /* JADX INFO: renamed from: Z */
    public String f2321Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f2323a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f2325b0;

    /* JADX INFO: renamed from: c */
    public C0339k f2326c;

    /* JADX INFO: renamed from: c0 */
    public boolean f2327c0;

    /* JADX INFO: renamed from: d */
    public C0339k f2328d;

    /* JADX INFO: renamed from: d0 */
    public int f2329d0;

    /* JADX INFO: renamed from: e0 */
    public int f2331e0;

    /* JADX INFO: renamed from: f0 */
    public float[] f2333f0;

    /* JADX INFO: renamed from: g0 */
    public C0332d[] f2335g0;

    /* JADX INFO: renamed from: h0 */
    public C0332d[] f2337h0;

    /* JADX INFO: renamed from: z */
    public C0331c f2355z;

    /* JADX INFO: renamed from: a */
    public int f2322a = -1;

    /* JADX INFO: renamed from: b */
    public int f2324b = -1;

    /* JADX INFO: renamed from: e */
    public int f2330e = 0;

    /* JADX INFO: renamed from: f */
    public int f2332f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f2334g = new int[2];

    /* JADX INFO: renamed from: h */
    public int f2336h = 0;

    /* JADX INFO: renamed from: i */
    public int f2338i = 0;

    /* JADX INFO: renamed from: j */
    public float f2339j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f2340k = 0;

    /* JADX INFO: renamed from: l */
    public int f2341l = 0;

    /* JADX INFO: renamed from: m */
    public float f2342m = 1.0f;

    /* JADX INFO: renamed from: n */
    public int f2343n = -1;

    /* JADX INFO: renamed from: o */
    public float f2344o = 1.0f;

    /* JADX INFO: renamed from: p */
    public C0334f f2345p = null;

    /* JADX INFO: renamed from: q */
    public int[] f2346q = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: r */
    public float f2347r = 0.0f;

    /* JADX INFO: renamed from: s */
    public C0331c f2348s = new C0331c(this, C0331c.b.LEFT);

    /* JADX INFO: renamed from: t */
    public C0331c f2349t = new C0331c(this, C0331c.b.TOP);

    /* JADX INFO: renamed from: u */
    public C0331c f2350u = new C0331c(this, C0331c.b.RIGHT);

    /* JADX INFO: renamed from: v */
    public C0331c f2351v = new C0331c(this, C0331c.b.BOTTOM);

    /* JADX INFO: renamed from: w */
    public C0331c f2352w = new C0331c(this, C0331c.b.BASELINE);

    /* JADX INFO: renamed from: x */
    public C0331c f2353x = new C0331c(this, C0331c.b.CENTER_X);

    /* JADX INFO: renamed from: y */
    public C0331c f2354y = new C0331c(this, C0331c.b.CENTER_Y);

    /* JADX INFO: renamed from: b.f.a.h.d$a */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0332d() {
        C0331c c0331c = new C0331c(this, C0331c.b.CENTER);
        this.f2355z = c0331c;
        this.f2296A = new C0331c[]{this.f2348s, this.f2350u, this.f2349t, this.f2351v, this.f2352w, c0331c};
        ArrayList<C0331c> arrayList = new ArrayList<>();
        this.f2297B = arrayList;
        a aVar = a.FIXED;
        this.f2298C = new a[]{aVar, aVar};
        this.f2299D = null;
        this.f2300E = 0;
        this.f2301F = 0;
        this.f2302G = 0.0f;
        this.f2303H = -1;
        this.f2304I = 0;
        this.f2305J = 0;
        this.f2306K = 0;
        this.f2307L = 0;
        this.f2308M = 0;
        this.f2309N = 0;
        this.f2310O = 0;
        this.f2311P = 0;
        this.f2312Q = 0;
        this.f2317V = 0.5f;
        this.f2318W = 0.5f;
        this.f2320Y = 0;
        this.f2321Z = null;
        this.f2323a0 = false;
        this.f2325b0 = false;
        this.f2327c0 = false;
        this.f2329d0 = 0;
        this.f2331e0 = 0;
        this.f2333f0 = new float[]{-1.0f, -1.0f};
        this.f2335g0 = new C0332d[]{null, null};
        this.f2337h0 = new C0332d[]{null, null};
        arrayList.add(this.f2348s);
        this.f2297B.add(this.f2349t);
        this.f2297B.add(this.f2350u);
        this.f2297B.add(this.f2351v);
        this.f2297B.add(this.f2353x);
        this.f2297B.add(this.f2354y);
        this.f2297B.add(this.f2355z);
        this.f2297B.add(this.f2352w);
    }

    /* JADX INFO: renamed from: A */
    public void m1340A(int i, int i2) {
        this.f2305J = i;
        int i3 = i2 - i;
        this.f2301F = i3;
        int i4 = this.f2314S;
        if (i3 < i4) {
            this.f2301F = i4;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m1341B(a aVar) {
        this.f2298C[1] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            m1362w(this.f2316U);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m1342C(int i) {
        this.f2300E = i;
        int i2 = this.f2313R;
        if (i < i2) {
            this.f2300E = i2;
        }
    }

    /* JADX INFO: renamed from: D */
    public void mo1343D() {
        int i = this.f2304I;
        int i2 = this.f2305J;
        this.f2308M = i;
        this.f2309N = i2;
    }

    /* JADX INFO: renamed from: E */
    public void mo1344E(C0326e c0326e) {
        int i;
        int i2;
        int iM1317o = c0326e.m1317o(this.f2348s);
        int iM1317o2 = c0326e.m1317o(this.f2349t);
        int iM1317o3 = c0326e.m1317o(this.f2350u);
        int iM1317o4 = c0326e.m1317o(this.f2351v);
        int i3 = iM1317o4 - iM1317o2;
        if (iM1317o3 - iM1317o < 0 || i3 < 0 || iM1317o == Integer.MIN_VALUE || iM1317o == Integer.MAX_VALUE || iM1317o2 == Integer.MIN_VALUE || iM1317o2 == Integer.MAX_VALUE || iM1317o3 == Integer.MIN_VALUE || iM1317o3 == Integer.MAX_VALUE || iM1317o4 == Integer.MIN_VALUE || iM1317o4 == Integer.MAX_VALUE) {
            iM1317o4 = 0;
            iM1317o = 0;
            iM1317o2 = 0;
            iM1317o3 = 0;
        }
        int i4 = iM1317o3 - iM1317o;
        int i5 = iM1317o4 - iM1317o2;
        this.f2304I = iM1317o;
        this.f2305J = iM1317o2;
        if (this.f2320Y == 8) {
            this.f2300E = 0;
            this.f2301F = 0;
            return;
        }
        a[] aVarArr = this.f2298C;
        a aVar = aVarArr[0];
        a aVar2 = a.FIXED;
        if (aVar == aVar2 && i4 < (i2 = this.f2300E)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.f2301F)) {
            i5 = i;
        }
        this.f2300E = i4;
        this.f2301F = i5;
        int i6 = this.f2314S;
        if (i5 < i6) {
            this.f2301F = i6;
        }
        int i7 = this.f2313R;
        if (i4 < i7) {
            this.f2300E = i7;
        }
        this.f2325b0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:145:0x01df  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0206  */
    /* JADX WARN: Code duplicated, block: B:204:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:207:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:209:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:210:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:213:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:214:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:216:0x0323  */
    /* JADX WARN: Code duplicated, block: B:219:0x0334 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:220:0x0335  */
    /* JADX WARN: Code duplicated, block: B:225:0x0344  */
    /* JADX WARN: Code duplicated, block: B:232:0x0351  */
    /* JADX WARN: Code duplicated, block: B:235:0x0357  */
    /* JADX WARN: Code duplicated, block: B:237:0x0361  */
    /* JADX WARN: Code duplicated, block: B:238:0x0365  */
    /* JADX WARN: Code duplicated, block: B:240:0x0373  */
    /* JADX WARN: Code duplicated, block: B:241:0x037e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0382 A[PHI: r4 r10
      0x0382: PHI (r4v13 b.f.a.g) = (r4v14 b.f.a.g), (r4v15 b.f.a.g) binds: [B:242:0x0380, B:239:0x0371] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r10v7 b.f.a.e) = (r10v8 b.f.a.e), (r10v9 b.f.a.e) binds: [B:242:0x0380, B:239:0x0371] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:246:0x0388  */
    /* JADX WARN: Code duplicated, block: B:247:0x0391  */
    /* JADX WARN: Code duplicated, block: B:250:0x0397  */
    /* JADX WARN: Code duplicated, block: B:251:0x039f  */
    /* JADX WARN: Code duplicated, block: B:254:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:256:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:257:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:259:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:262:0x0404  */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX INFO: renamed from: a */
    public void mo1330a(C0326e c0326e) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        char c2;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        C0326e c0326e2;
        boolean z11;
        C0328g c0328g;
        C0332d c0332d;
        C0328g c0328gM1314l;
        C0332d c0332d2;
        C0328g c0328gM1314l2;
        C0328g c0328g2;
        C0332d c0332d3;
        int i5;
        int i6;
        C0328g c0328g3;
        C0328g c0328g4;
        C0328g c0328g5;
        C0328g c0328g6;
        C0338j c0338j;
        C0331c c0331c;
        int i7;
        C0332d c0332d4;
        C0328g c0328gM1314l3;
        C0332d c0332d5;
        C0328g c0328gM1314l4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C0331c c0331c2;
        C0331c c0331c3;
        C0331c c0331c4;
        C0331c c0331c5;
        a aVar = a.WRAP_CONTENT;
        C0328g c0328gM1314l5 = c0326e.m1314l(this.f2348s);
        C0328g c0328gM1314l6 = c0326e.m1314l(this.f2350u);
        C0328g c0328gM1314l7 = c0326e.m1314l(this.f2349t);
        C0328g c0328gM1314l8 = c0326e.m1314l(this.f2351v);
        C0328g c0328gM1314l9 = c0326e.m1314l(this.f2352w);
        C0332d c0332d6 = this.f2299D;
        if (c0332d6 != null) {
            boolean z12 = c0332d6 != null && c0332d6.f2298C[0] == aVar;
            boolean z13 = c0332d6 != null && c0332d6.f2298C[1] == aVar;
            if (m1357p(0)) {
                ((C0333e) this.f2299D).m1367G(this, 0);
            } else {
                C0331c c0331c6 = this.f2348s;
                C0331c c0331c7 = c0331c6.f2276d;
                boolean z14 = (c0331c7 != null && c0331c7.f2276d == c0331c6) || ((c0331c3 = (c0331c2 = this.f2350u).f2276d) != null && c0331c3.f2276d == c0331c2);
                if (m1357p(1)) {
                    ((C0333e) this.f2299D).m1367G(this, 1);
                } else {
                    C0331c c0331c8 = this.f2349t;
                    C0331c c0331c9 = c0331c8.f2276d;
                    boolean z15 = (c0331c9 == null && c0331c9.f2276d == c0331c8) || ((c0331c5 = (c0331c4 = this.f2351v).f2276d) != null && c0331c5.f2276d == c0331c4);
                    if (z12 && this.f2320Y != 8 && this.f2348s.f2276d == null && this.f2350u.f2276d == null) {
                        c0326e.m1308f(c0326e.m1314l(this.f2299D.f2350u), c0328gM1314l6, 0, 1);
                    }
                    if (z13 && this.f2320Y != 8 && this.f2349t.f2276d == null && this.f2351v.f2276d == null && this.f2352w == null) {
                        c0326e.m1308f(c0326e.m1314l(this.f2299D.f2351v), c0328gM1314l8, 0, 1);
                    }
                    z3 = z13;
                    z = z12;
                    z2 = z14;
                    z4 = z15;
                }
                if (z12) {
                    c0326e.m1308f(c0326e.m1314l(this.f2299D.f2350u), c0328gM1314l6, 0, 1);
                }
                if (z13) {
                    c0326e.m1308f(c0326e.m1314l(this.f2299D.f2351v), c0328gM1314l8, 0, 1);
                }
                z3 = z13;
                z = z12;
                z2 = z14;
                z4 = z15;
            }
            if (m1357p(1)) {
                ((C0333e) this.f2299D).m1367G(this, 1);
            } else {
                C0331c c0331c10 = this.f2349t;
                C0331c c0331c11 = c0331c10.f2276d;
                if (c0331c11 == null) {
                }
                if (z12) {
                    c0326e.m1308f(c0326e.m1314l(this.f2299D.f2350u), c0328gM1314l6, 0, 1);
                }
                if (z13) {
                    c0326e.m1308f(c0326e.m1314l(this.f2299D.f2351v), c0328gM1314l8, 0, 1);
                }
                z3 = z13;
                z = z12;
                z2 = z14;
                z4 = z15;
            }
            if (z12) {
                c0326e.m1308f(c0326e.m1314l(this.f2299D.f2350u), c0328gM1314l6, 0, 1);
            }
            if (z13) {
                c0326e.m1308f(c0326e.m1314l(this.f2299D.f2351v), c0328gM1314l8, 0, 1);
            }
            z3 = z13;
            z = z12;
            z2 = z14;
            z4 = z15;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i13 = this.f2300E;
        int i14 = this.f2313R;
        if (i13 >= i14) {
            i14 = i13;
        }
        int i15 = this.f2301F;
        int i16 = this.f2314S;
        if (i15 >= i16) {
            i16 = i15;
        }
        a[] aVarArr = this.f2298C;
        a aVar2 = aVarArr[0];
        a aVar3 = a.MATCH_CONSTRAINT;
        boolean z16 = aVar2 != aVar3;
        boolean z17 = aVarArr[1] != aVar3;
        int i17 = this.f2303H;
        this.f2343n = i17;
        float f = this.f2302G;
        this.f2344o = f;
        int i18 = this.f2330e;
        int i19 = this.f2332f;
        if (f > 0.0f) {
            i = i14;
            if (this.f2320Y != 8) {
                if (aVarArr[0] == aVar3 && i18 == 0) {
                    i18 = 3;
                }
                if (aVarArr[1] == aVar3 && i19 == 0) {
                    i19 = 3;
                }
                if (aVarArr[0] == aVar3 && aVarArr[1] == aVar3 && i18 == 3 && i19 == 3) {
                    if (i17 == -1) {
                        if (z16 && !z17) {
                            this.f2343n = 0;
                        } else if (!z16 && z17) {
                            this.f2343n = 1;
                            if (i17 == -1) {
                                this.f2344o = 1.0f / f;
                            }
                        }
                    }
                    if (this.f2343n == 0 && (!this.f2349t.m1337c() || !this.f2351v.m1337c())) {
                        i9 = 1;
                    } else if (this.f2343n != 1 || (this.f2348s.m1337c() && this.f2350u.m1337c())) {
                        if (this.f2343n == -1 && (!this.f2349t.m1337c() || !this.f2351v.m1337c() || !this.f2348s.m1337c() || !this.f2350u.m1337c())) {
                            if (!this.f2349t.m1337c() && this.f2351v.m1337c()) {
                                i12 = 0;
                            } else if (!this.f2348s.m1337c() && this.f2350u.m1337c()) {
                                this.f2344o = 1.0f / this.f2344o;
                                i12 = 1;
                            }
                            this.f2343n = i12;
                        }
                        if (this.f2343n == -1) {
                            if (!z && !z3) {
                                i11 = 0;
                            } else if (z && z3) {
                                this.f2344o = 1.0f / this.f2344o;
                                i11 = 1;
                            }
                            this.f2343n = i11;
                        }
                        if (this.f2343n == -1) {
                            i10 = this.f2336h;
                            if (i10 <= 0 && this.f2340k == 0) {
                                this.f2343n = 0;
                            } else if (i10 == 0 && this.f2340k > 0) {
                                this.f2344o = 1.0f / this.f2344o;
                                this.f2343n = 1;
                            }
                        }
                        if (this.f2343n == -1 && z && z3) {
                            this.f2344o = 1.0f / this.f2344o;
                            this.f2343n = 1;
                        }
                    } else {
                        i9 = 0;
                    }
                    this.f2343n = i9;
                    if (this.f2343n == -1) {
                        if (!this.f2349t.m1337c()) {
                            if (!this.f2348s.m1337c()) {
                            }
                        } else if (!this.f2348s.m1337c()) {
                        }
                    }
                    if (this.f2343n == -1) {
                        if (!z) {
                            if (z) {
                            }
                        } else if (z) {
                        }
                    }
                    if (this.f2343n == -1) {
                        i10 = this.f2336h;
                        if (i10 <= 0) {
                            if (i10 == 0) {
                                this.f2344o = 1.0f / this.f2344o;
                                this.f2343n = 1;
                            }
                        } else if (i10 == 0) {
                            this.f2344o = 1.0f / this.f2344o;
                            this.f2343n = 1;
                        }
                    }
                    if (this.f2343n == -1) {
                        this.f2344o = 1.0f / this.f2344o;
                        this.f2343n = 1;
                    }
                } else if (aVarArr[0] == aVar3 && i18 == 3) {
                    this.f2343n = 0;
                    i = (int) (f * i15);
                    if (aVarArr[1] != aVar3) {
                        i19 = i19;
                        i3 = i16;
                        c2 = 0;
                        z5 = false;
                        i2 = 4;
                    } else {
                        i2 = i18;
                        i3 = i16;
                        c2 = 0;
                        z5 = true;
                    }
                } else {
                    if (aVarArr[1] == aVar3 && i19 == 3) {
                        this.f2343n = 1;
                        if (i17 == -1) {
                            this.f2344o = 1.0f / f;
                        }
                        c2 = 0;
                        i3 = (int) (this.f2344o * i13);
                        i2 = i18;
                        if (aVarArr[0] != aVar3) {
                            z5 = false;
                            i19 = 4;
                        }
                    }
                    z5 = true;
                }
                c2 = 0;
                i2 = i18;
                i3 = i16;
                z5 = true;
            }
            int[] iArr = this.f2334g;
            iArr[c2] = i2;
            iArr[1] = i19;
            z6 = !z5 && ((i8 = this.f2343n) == 0 || i8 == -1);
            if (this.f2298C[0] == aVar || !(this instanceof C0333e)) {
                z7 = false;
            } else {
                z7 = true;
            }
            z8 = !this.f2355z.m1337c();
            if (this.f2322a == 2) {
                c0332d4 = this.f2299D;
                if (c0332d4 != null) {
                    c0328gM1314l3 = c0326e.m1314l(c0332d4.f2350u);
                } else {
                    c0328gM1314l3 = null;
                }
                c0332d5 = this.f2299D;
                if (c0332d5 != null) {
                    c0328gM1314l4 = c0326e.m1314l(c0332d5.f2348s);
                } else {
                    c0328gM1314l4 = null;
                }
                m1345d(c0326e, z, c0328gM1314l4, c0328gM1314l3, this.f2298C[0], z7, this.f2348s, this.f2350u, this.f2304I, i, this.f2313R, this.f2346q[0], this.f2317V, z6, z2, i2, this.f2336h, this.f2338i, this.f2339j, z8);
            }
            if (this.f2324b == 2) {
                return;
            }
            if (this.f2298C[1] == aVar || !(this instanceof C0333e)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z5 || !((i7 = this.f2343n) == 1 || i7 == -1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            i4 = this.f2312Q;
            if (i4 > 0) {
                c0338j = this.f2352w.f2273a;
                c0326e2 = c0326e;
                if (c0338j.f2408b == 1) {
                    c0338j.m1380e(c0326e2);
                } else {
                    c0326e2.m1306d(c0328gM1314l9, c0328g, i4, 6);
                    c0331c = this.f2352w.f2276d;
                    if (c0331c != null) {
                        c0328g = c0328gM1314l7;
                        c0326e2.m1306d(c0328gM1314l9, c0326e2.m1314l(c0331c), 0, 6);
                        z11 = false;
                    } else {
                        c0328g = c0328gM1314l7;
                        z11 = z8;
                    }
                }
                c0332d = this.f2299D;
                if (c0332d != null) {
                    c0328gM1314l = c0326e2.m1314l(c0332d.f2351v);
                } else {
                    c0328gM1314l = null;
                }
                c0332d2 = this.f2299D;
                if (c0332d2 != null) {
                    c0328gM1314l2 = c0326e2.m1314l(c0332d2.f2349t);
                } else {
                    c0328gM1314l2 = null;
                }
                boolean z18 = z3;
                c0328g2 = c0328g;
                m1345d(c0326e, z18, c0328gM1314l2, c0328gM1314l, this.f2298C[1], z9, this.f2349t, this.f2351v, this.f2305J, i3, this.f2314S, this.f2346q[1], this.f2318W, z10, z4, i19, this.f2340k, this.f2341l, this.f2342m, z11);
                if (z5) {
                    i5 = 6;
                    c0332d3 = this;
                    i6 = c0332d3.f2343n;
                    float f2 = c0332d3.f2344o;
                    if (i6 == 1) {
                        c0328g3 = c0328gM1314l8;
                        c0328g4 = c0328g2;
                        c0328g5 = c0328gM1314l6;
                        c0328g6 = c0328gM1314l5;
                    } else {
                        i5 = 6;
                        c0328g3 = r29;
                        c0328g4 = c0328gM1314l5;
                        c0328g5 = r25;
                        c0328g6 = c0328g2;
                    }
                    c0326e.m1310h(c0328g3, c0328g4, c0328g5, c0328g6, f2, i5);
                } else {
                    c0332d3 = this;
                }
                if (c0332d3.f2355z.m1337c()) {
                    C0332d c0332d7 = c0332d3.f2355z.f2276d.f2274b;
                    float radians = (float) Math.toRadians(c0332d3.f2347r + 90.0f);
                    int iM1336b = c0332d3.f2355z.m1336b();
                    C0331c.b bVar = C0331c.b.LEFT;
                    C0328g c0328gM1314l10 = c0326e.m1314l(c0332d3.mo1347f(bVar));
                    C0331c.b bVar2 = C0331c.b.TOP;
                    C0328g c0328gM1314l11 = c0326e.m1314l(c0332d3.mo1347f(bVar2));
                    C0331c.b bVar3 = C0331c.b.RIGHT;
                    C0328g c0328gM1314l12 = c0326e.m1314l(c0332d3.mo1347f(bVar3));
                    C0331c.b bVar4 = C0331c.b.BOTTOM;
                    C0328g c0328gM1314l13 = c0326e.m1314l(c0332d3.mo1347f(bVar4));
                    C0328g c0328gM1314l14 = c0326e.m1314l(c0332d7.mo1347f(bVar));
                    C0328g c0328gM1314l15 = c0326e.m1314l(c0332d7.mo1347f(bVar2));
                    C0328g c0328gM1314l16 = c0326e.m1314l(c0332d7.mo1347f(bVar3));
                    C0328g c0328gM1314l17 = c0326e.m1314l(c0332d7.mo1347f(bVar4));
                    C0323b c0323bM1315m = c0326e.m1315m();
                    double d = radians;
                    double dSin = Math.sin(d);
                    double d2 = iM1336b;
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    c0323bM1315m.m1301f(c0328gM1314l11, c0328gM1314l13, c0328gM1314l15, c0328gM1314l17, (float) (dSin * d2));
                    c0326e.m1305c(c0323bM1315m);
                    C0323b c0323bM1315m2 = c0326e.m1315m();
                    double dCos = Math.cos(d);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    c0323bM1315m2.m1301f(c0328gM1314l10, c0328gM1314l12, c0328gM1314l14, c0328gM1314l16, (float) (dCos * d2));
                    c0326e.m1305c(c0323bM1315m2);
                }
            }
            c0326e2 = c0326e;
            c0328g = r26;
            c0328g = c0328gM1314l7;
            z11 = z8;
            c0332d = this.f2299D;
            if (c0332d != null) {
                c0328gM1314l = c0326e2.m1314l(c0332d.f2351v);
            } else {
                c0328gM1314l = null;
            }
            c0332d2 = this.f2299D;
            if (c0332d2 != null) {
                c0328gM1314l2 = c0326e2.m1314l(c0332d2.f2349t);
            } else {
                c0328gM1314l2 = null;
            }
            boolean z19 = z3;
            c0328g2 = c0328g;
            m1345d(c0326e, z19, c0328gM1314l2, c0328gM1314l, this.f2298C[1], z9, this.f2349t, this.f2351v, this.f2305J, i3, this.f2314S, this.f2346q[1], this.f2318W, z10, z4, i19, this.f2340k, this.f2341l, this.f2342m, z11);
            if (z5) {
                i5 = 6;
                c0332d3 = this;
                i6 = c0332d3.f2343n;
                float f3 = c0332d3.f2344o;
                if (i6 == 1) {
                    c0328g3 = c0328gM1314l8;
                    c0328g4 = c0328g2;
                    c0328g5 = c0328gM1314l6;
                    c0328g6 = c0328gM1314l5;
                } else {
                    i5 = 6;
                    c0328g3 = r29;
                    c0328g4 = c0328gM1314l5;
                    c0328g5 = r25;
                    c0328g6 = c0328g2;
                }
                c0326e.m1310h(c0328g3, c0328g4, c0328g5, c0328g6, f3, i5);
            } else {
                c0332d3 = this;
            }
            if (c0332d3.f2355z.m1337c()) {
                C0332d c0332d8 = c0332d3.f2355z.f2276d.f2274b;
                float radians2 = (float) Math.toRadians(c0332d3.f2347r + 90.0f);
                int iM1336b2 = c0332d3.f2355z.m1336b();
                C0331c.b bVar5 = C0331c.b.LEFT;
                C0328g c0328gM1314l18 = c0326e.m1314l(c0332d3.mo1347f(bVar5));
                C0331c.b bVar6 = C0331c.b.TOP;
                C0328g c0328gM1314l19 = c0326e.m1314l(c0332d3.mo1347f(bVar6));
                C0331c.b bVar7 = C0331c.b.RIGHT;
                C0328g c0328gM1314l110 = c0326e.m1314l(c0332d3.mo1347f(bVar7));
                C0331c.b bVar8 = C0331c.b.BOTTOM;
                C0328g c0328gM1314l111 = c0326e.m1314l(c0332d3.mo1347f(bVar8));
                C0328g c0328gM1314l112 = c0326e.m1314l(c0332d8.mo1347f(bVar5));
                C0328g c0328gM1314l113 = c0326e.m1314l(c0332d8.mo1347f(bVar6));
                C0328g c0328gM1314l114 = c0326e.m1314l(c0332d8.mo1347f(bVar7));
                C0328g c0328gM1314l115 = c0326e.m1314l(c0332d8.mo1347f(bVar8));
                C0323b c0323bM1315m3 = c0326e.m1315m();
                double d3 = radians2;
                double dSin2 = Math.sin(d3);
                double d4 = iM1336b2;
                Double.isNaN(d4);
                Double.isNaN(d4);
                c0323bM1315m3.m1301f(c0328gM1314l19, c0328gM1314l111, c0328gM1314l113, c0328gM1314l115, (float) (dSin2 * d4));
                c0326e.m1305c(c0323bM1315m3);
                C0323b c0323bM1315m4 = c0326e.m1315m();
                double dCos2 = Math.cos(d3);
                Double.isNaN(d4);
                Double.isNaN(d4);
                c0323bM1315m4.m1301f(c0328gM1314l18, c0328gM1314l110, c0328gM1314l112, c0328gM1314l114, (float) (dCos2 * d4));
                c0326e.m1305c(c0323bM1315m4);
            }
        }
        i = i14;
        c2 = 0;
        i2 = i18;
        i19 = i19;
        i3 = i16;
        z5 = false;
        int[] iArr2 = this.f2334g;
        iArr2[c2] = i2;
        iArr2[1] = i19;
        if (z5) {
        }
        if (this.f2298C[0] == aVar) {
            z7 = false;
        } else {
            z7 = false;
        }
        z8 = !this.f2355z.m1337c();
        if (this.f2322a == 2) {
            c0332d4 = this.f2299D;
            if (c0332d4 != null) {
                c0328gM1314l3 = c0326e.m1314l(c0332d4.f2350u);
            } else {
                c0328gM1314l3 = null;
            }
            c0332d5 = this.f2299D;
            if (c0332d5 != null) {
                c0328gM1314l4 = c0326e.m1314l(c0332d5.f2348s);
            } else {
                c0328gM1314l4 = null;
            }
            m1345d(c0326e, z, c0328gM1314l4, c0328gM1314l3, this.f2298C[0], z7, this.f2348s, this.f2350u, this.f2304I, i, this.f2313R, this.f2346q[0], this.f2317V, z6, z2, i2, this.f2336h, this.f2338i, this.f2339j, z8);
        }
        if (this.f2324b == 2) {
            return;
        }
        if (this.f2298C[1] == aVar) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z5) {
            z10 = false;
        } else {
            z10 = false;
        }
        i4 = this.f2312Q;
        if (i4 > 0) {
            c0338j = this.f2352w.f2273a;
            c0326e2 = c0326e;
            if (c0338j.f2408b == 1) {
                c0338j.m1380e(c0326e2);
            } else {
                c0326e2.m1306d(c0328gM1314l9, c0328g, i4, 6);
                c0331c = this.f2352w.f2276d;
                if (c0331c != null) {
                    c0328g = c0328gM1314l7;
                    c0326e2.m1306d(c0328gM1314l9, c0326e2.m1314l(c0331c), 0, 6);
                    z11 = false;
                } else {
                    c0328g = c0328gM1314l7;
                    z11 = z8;
                }
            }
            c0332d = this.f2299D;
            if (c0332d != null) {
                c0328gM1314l = c0326e2.m1314l(c0332d.f2351v);
            } else {
                c0328gM1314l = null;
            }
            c0332d2 = this.f2299D;
            if (c0332d2 != null) {
                c0328gM1314l2 = c0326e2.m1314l(c0332d2.f2349t);
            } else {
                c0328gM1314l2 = null;
            }
            boolean z110 = z3;
            c0328g2 = c0328g;
            m1345d(c0326e, z110, c0328gM1314l2, c0328gM1314l, this.f2298C[1], z9, this.f2349t, this.f2351v, this.f2305J, i3, this.f2314S, this.f2346q[1], this.f2318W, z10, z4, i19, this.f2340k, this.f2341l, this.f2342m, z11);
            if (z5) {
                i5 = 6;
                c0332d3 = this;
                i6 = c0332d3.f2343n;
                float f4 = c0332d3.f2344o;
                if (i6 == 1) {
                    c0328g3 = c0328gM1314l8;
                    c0328g4 = c0328g2;
                    c0328g5 = c0328gM1314l6;
                    c0328g6 = c0328gM1314l5;
                } else {
                    i5 = 6;
                    c0328g3 = r29;
                    c0328g4 = c0328gM1314l5;
                    c0328g5 = r25;
                    c0328g6 = c0328g2;
                }
                c0326e.m1310h(c0328g3, c0328g4, c0328g5, c0328g6, f4, i5);
            } else {
                c0332d3 = this;
            }
            if (c0332d3.f2355z.m1337c()) {
                C0332d c0332d9 = c0332d3.f2355z.f2276d.f2274b;
                float radians3 = (float) Math.toRadians(c0332d3.f2347r + 90.0f);
                int iM1336b3 = c0332d3.f2355z.m1336b();
                C0331c.b bVar9 = C0331c.b.LEFT;
                C0328g c0328gM1314l116 = c0326e.m1314l(c0332d3.mo1347f(bVar9));
                C0331c.b bVar10 = C0331c.b.TOP;
                C0328g c0328gM1314l117 = c0326e.m1314l(c0332d3.mo1347f(bVar10));
                C0331c.b bVar11 = C0331c.b.RIGHT;
                C0328g c0328gM1314l118 = c0326e.m1314l(c0332d3.mo1347f(bVar11));
                C0331c.b bVar12 = C0331c.b.BOTTOM;
                C0328g c0328gM1314l119 = c0326e.m1314l(c0332d3.mo1347f(bVar12));
                C0328g c0328gM1314l1110 = c0326e.m1314l(c0332d9.mo1347f(bVar9));
                C0328g c0328gM1314l1111 = c0326e.m1314l(c0332d9.mo1347f(bVar10));
                C0328g c0328gM1314l1112 = c0326e.m1314l(c0332d9.mo1347f(bVar11));
                C0328g c0328gM1314l1113 = c0326e.m1314l(c0332d9.mo1347f(bVar12));
                C0323b c0323bM1315m5 = c0326e.m1315m();
                double d5 = radians3;
                double dSin3 = Math.sin(d5);
                double d6 = iM1336b3;
                Double.isNaN(d6);
                Double.isNaN(d6);
                c0323bM1315m5.m1301f(c0328gM1314l117, c0328gM1314l119, c0328gM1314l1111, c0328gM1314l1113, (float) (dSin3 * d6));
                c0326e.m1305c(c0323bM1315m5);
                C0323b c0323bM1315m6 = c0326e.m1315m();
                double dCos3 = Math.cos(d5);
                Double.isNaN(d6);
                Double.isNaN(d6);
                c0323bM1315m6.m1301f(c0328gM1314l116, c0328gM1314l118, c0328gM1314l1110, c0328gM1314l1112, (float) (dCos3 * d6));
                c0326e.m1305c(c0323bM1315m6);
            }
        }
        c0326e2 = c0326e;
        c0328g = r26;
        c0328g = c0328gM1314l7;
        z11 = z8;
        c0332d = this.f2299D;
        if (c0332d != null) {
            c0328gM1314l = c0326e2.m1314l(c0332d.f2351v);
        } else {
            c0328gM1314l = null;
        }
        c0332d2 = this.f2299D;
        if (c0332d2 != null) {
            c0328gM1314l2 = c0326e2.m1314l(c0332d2.f2349t);
        } else {
            c0328gM1314l2 = null;
        }
        boolean z111 = z3;
        c0328g2 = c0328g;
        m1345d(c0326e, z111, c0328gM1314l2, c0328gM1314l, this.f2298C[1], z9, this.f2349t, this.f2351v, this.f2305J, i3, this.f2314S, this.f2346q[1], this.f2318W, z10, z4, i19, this.f2340k, this.f2341l, this.f2342m, z11);
        if (z5) {
            i5 = 6;
            c0332d3 = this;
            i6 = c0332d3.f2343n;
            float f5 = c0332d3.f2344o;
            if (i6 == 1) {
                c0328g3 = c0328gM1314l8;
                c0328g4 = c0328g2;
                c0328g5 = c0328gM1314l6;
                c0328g6 = c0328gM1314l5;
            } else {
                i5 = 6;
                c0328g3 = r29;
                c0328g4 = c0328gM1314l5;
                c0328g5 = r25;
                c0328g6 = c0328g2;
            }
            c0326e.m1310h(c0328g3, c0328g4, c0328g5, c0328g6, f5, i5);
        } else {
            c0332d3 = this;
        }
        if (c0332d3.f2355z.m1337c()) {
            C0332d c0332d10 = c0332d3.f2355z.f2276d.f2274b;
            float radians4 = (float) Math.toRadians(c0332d3.f2347r + 90.0f);
            int iM1336b4 = c0332d3.f2355z.m1336b();
            C0331c.b bVar13 = C0331c.b.LEFT;
            C0328g c0328gM1314l1114 = c0326e.m1314l(c0332d3.mo1347f(bVar13));
            C0331c.b bVar14 = C0331c.b.TOP;
            C0328g c0328gM1314l1115 = c0326e.m1314l(c0332d3.mo1347f(bVar14));
            C0331c.b bVar15 = C0331c.b.RIGHT;
            C0328g c0328gM1314l1116 = c0326e.m1314l(c0332d3.mo1347f(bVar15));
            C0331c.b bVar16 = C0331c.b.BOTTOM;
            C0328g c0328gM1314l1117 = c0326e.m1314l(c0332d3.mo1347f(bVar16));
            C0328g c0328gM1314l1118 = c0326e.m1314l(c0332d10.mo1347f(bVar13));
            C0328g c0328gM1314l1119 = c0326e.m1314l(c0332d10.mo1347f(bVar14));
            C0328g c0328gM1314l11110 = c0326e.m1314l(c0332d10.mo1347f(bVar15));
            C0328g c0328gM1314l11111 = c0326e.m1314l(c0332d10.mo1347f(bVar16));
            C0323b c0323bM1315m7 = c0326e.m1315m();
            double d7 = radians4;
            double dSin4 = Math.sin(d7);
            double d8 = iM1336b4;
            Double.isNaN(d8);
            Double.isNaN(d8);
            c0323bM1315m7.m1301f(c0328gM1314l1115, c0328gM1314l1117, c0328gM1314l1119, c0328gM1314l11111, (float) (dSin4 * d8));
            c0326e.m1305c(c0323bM1315m7);
            C0323b c0323bM1315m8 = c0326e.m1315m();
            double dCos4 = Math.cos(d7);
            Double.isNaN(d8);
            Double.isNaN(d8);
            c0323bM1315m8.m1301f(c0328gM1314l1114, c0328gM1314l1116, c0328gM1314l1118, c0328gM1314l11110, (float) (dCos4 * d8));
            c0326e.m1305c(c0323bM1315m8);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo1331b() {
        return this.f2320Y != 8;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0144  */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d2, code lost:
    
        if (r9 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01dd, code lost:
    
        if (r9 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01df, code lost:
    
        r7.m1383h(r4, 1, m1352k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e8, code lost:
    
        r7.f2396d = r4;
        r7.f2397e = r1;
        r4.f2407a.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1332c(int r18) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p026f.p027a.p028h.C0332d.mo1332c(int):void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:154:0x023f  */
    /* JADX WARN: Code duplicated, block: B:161:0x027d  */
    /* JADX WARN: Code duplicated, block: B:165:0x028f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0295 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0108  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX INFO: renamed from: d */
    public final void m1345d(C0326e c0326e, boolean z, C0328g c0328g, C0328g c0328g2, a aVar, boolean z2, C0331c c0331c, C0331c c0331c2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7, float f2, boolean z5) {
        boolean z6;
        boolean z7;
        int iMin;
        int i8;
        int i9;
        int i10;
        C0331c.b bVar;
        C0331c.b bVar2;
        C0328g c0328gM1314l;
        C0328g c0328gM1314l2;
        int i11;
        boolean z8;
        int i12;
        int r13 = 0;
        C0328g c0328g3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        C0328g c0328g4;
        C0328g c0328g5;
        C0328g c0328g6;
        boolean z13;
        int i14;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        C0328g c0328g7;
        int i17;
        int i18;
        boolean z16;
        boolean z17;
        int i19;
        C0331c.b bVar3 = C0331c.b.BOTTOM;
        C0328g c0328gM1314l3 = c0326e.m1314l(c0331c);
        C0328g c0328gM1314l4 = c0326e.m1314l(c0331c2);
        C0328g c0328gM1314l5 = c0326e.m1314l(c0331c.f2276d);
        C0328g c0328gM1314l6 = c0326e.m1314l(c0331c2.f2276d);
        if (c0326e.f2226f) {
            C0338j c0338j = c0331c.f2273a;
            if (c0338j.f2408b == 1 && c0331c2.f2273a.f2408b == 1) {
                c0338j.m1380e(c0326e);
                c0331c2.f2273a.m1380e(c0326e);
                if (z4 || !z) {
                    return;
                }
                c0326e.m1308f(c0328g2, c0328gM1314l4, 0, 6);
                return;
            }
        }
        boolean zM1337c = c0331c.m1337c();
        boolean zM1337c2 = c0331c2.m1337c();
        boolean zM1337c3 = this.f2355z.m1337c();
        int i20 = zM1337c2 ? (zM1337c ? 1 : 0) + 1 : zM1337c ? 1 : 0;
        if (zM1337c3) {
            i20++;
        }
        int i21 = i20;
        int i22 = z3 ? 3 : i5;
        int iOrdinal = aVar.ordinal();
        int z18 = i21;
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal == 2) {
            if (i22 != 4) {
                z6 = true;
            }
            if (this.f2320Y == 8) {
                iMin = 0;
                z7 = false;
            } else {
                z7 = z6;
                iMin = i2;
            }
            if (z5) {
                if (zM1337c && !zM1337c2 && !zM1337c3) {
                    c0326e.m1307e(c0328gM1314l3, i);
                } else if (zM1337c && !zM1337c2) {
                    i8 = 6;
                    c0326e.m1306d(c0328gM1314l3, c0328gM1314l5, c0331c.m1336b(), 6);
                }
                i8 = 6;
            } else {
                i8 = 6;
            }
            if (z7) {
                i9 = i6;
                if (i9 == -2) {
                    i9 = iMin;
                }
                if (i7 == -2) {
                    i10 = iMin;
                } else {
                    i10 = i7;
                }
                if (i9 > 0) {
                    c0326e.m1308f(c0328gM1314l4, c0328gM1314l3, i9, 6);
                    iMin = Math.max(iMin, i9);
                }
                if (i10 > 0) {
                    c0326e.m1309g(c0328gM1314l4, c0328gM1314l3, i10, 6);
                    iMin = Math.min(iMin, i10);
                }
                if (i22 == 1) {
                    i12 = 6;
                    if (!z) {
                        if (z4) {
                            i12 = 4;
                        } else {
                            i12 = 1;
                        }
                    }
                    c0326e.m1306d(c0328gM1314l4, c0328gM1314l3, iMin, i12);
                } else {
                    if (i22 == 2) {
                        bVar = c0331c.f2275c;
                        bVar2 = C0331c.b.TOP;
                        if (bVar != bVar2 || bVar == bVar3) {
                            C0328g c0328gM1314l7 = c0326e.m1314l(this.f2299D.mo1347f(bVar2));
                            c0328gM1314l = c0326e.m1314l(this.f2299D.mo1347f(bVar3));
                            c0328gM1314l2 = c0328gM1314l7;
                        } else {
                            c0328gM1314l2 = c0326e.m1314l(this.f2299D.mo1347f(C0331c.b.LEFT));
                            c0328gM1314l = c0326e.m1314l(this.f2299D.mo1347f(C0331c.b.RIGHT));
                        }
                        C0323b c0323bM1315m = c0326e.m1315m();
                        i11 = i22;
                        c0323bM1315m.m1298c(c0328gM1314l4, c0328gM1314l3, c0328gM1314l, c0328gM1314l2, f2);
                        c0326e.m1305c(c0323bM1315m);
                        z7 = false;
                    }
                    if (z7 || z18 == 2 || z3) {
                        z8 = z7;
                        r13 = z18;
                    } else {
                        int iMax = Math.max(i9, iMin);
                        if (i10 > 0) {
                            iMax = Math.min(i10, iMax);
                        }
                        c0326e.m1306d(c0328gM1314l4, c0328gM1314l3, iMax, 6);
                        z8 = false;
                        r13 = z18;
                    }
                }
                i11 = i22;
                if (z7) {
                    z8 = z7;
                    r13 = z18;
                } else {
                    z8 = z7;
                    r13 = z18;
                }
            } else {
                if (z2) {
                    c0326e.m1306d(c0328gM1314l4, c0328gM1314l3, 0, 3);
                    if (i3 > 0) {
                        c0326e.m1308f(c0328gM1314l4, c0328gM1314l3, i3, i8);
                    }
                    if (i4 < Integer.MAX_VALUE) {
                        c0326e.m1309g(c0328gM1314l4, c0328gM1314l3, i4, i8);
                    }
                } else {
                    c0326e.m1306d(c0328gM1314l4, c0328gM1314l3, iMin, i8);
                }
                i9 = i6;
                i10 = i7;
                i11 = i22;
                z8 = z7;
                c0328gM1314l5 = c0328gM1314l5;
                c0328gM1314l4 = c0328gM1314l4;
                r13 = z18;
                c0328gM1314l6 = c0328gM1314l6;
            }
            if (z5 || z4) {
                C0328g c0328g8 = c0328gM1314l4;
                if (r13 < 2 || !z) {
                }
                c0326e.m1308f(c0328gM1314l3, c0328g, 0, 6);
                c0326e.m1308f(c0328g2, c0328g8, 0, 6);
                return;
            }
            if (zM1337c || zM1337c2 || zM1337c3) {
                if (!zM1337c || zM1337c2) {
                    if (zM1337c || !zM1337c2) {
                        C0328g c0328g9 = c0328gM1314l6;
                        if (zM1337c && zM1337c2) {
                            if (z8) {
                                if (z && i3 == 0) {
                                    c0326e.m1308f(c0328gM1314l4, c0328gM1314l3, 0, 6);
                                }
                                if (i11 == 0) {
                                    if (i10 > 0 || i9 > 0) {
                                        z17 = true;
                                        i19 = 4;
                                    } else {
                                        z17 = false;
                                        i19 = 6;
                                    }
                                    c0328g3 = c0328gM1314l5;
                                    c0326e.m1306d(c0328gM1314l3, c0328g3, c0331c.m1336b(), i19);
                                    c0326e.m1306d(c0328gM1314l4, c0328g9, -c0331c2.m1336b(), i19);
                                    z12 = z17;
                                    z10 = i10 > 0 || i9 > 0;
                                    i13 = 5;
                                } else {
                                    int i23 = i11;
                                    c0328g3 = c0328gM1314l5;
                                    if (i23 == 1) {
                                        z10 = true;
                                        z12 = true;
                                        i13 = 6;
                                    } else {
                                        if (i23 == 3) {
                                            int i24 = (z3 || this.f2343n == -1 || i10 > 0) ? 4 : 6;
                                            c0326e.m1306d(c0328gM1314l3, c0328g3, c0331c.m1336b(), i24);
                                            c0326e.m1306d(c0328gM1314l4, c0328g9, -c0331c2.m1336b(), i24);
                                            z10 = true;
                                            z11 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        z12 = z11;
                                        i13 = 5;
                                    }
                                }
                                if (z10) {
                                    c0328g4 = c0328gM1314l4;
                                    c0328g5 = c0328g3;
                                    c0328g6 = c0328g9;
                                    c0326e.m1304b(c0328gM1314l3, c0328g3, c0331c.m1336b(), f, c0328g9, c0328g4, c0331c2.m1336b(), i13);
                                    z16 = c0331c.f2276d.f2274b instanceof C0329a;
                                    boolean z19 = c0331c2.f2276d.f2274b instanceof C0329a;
                                    if (!z16 && !z19) {
                                        z13 = true;
                                        i14 = 6;
                                        z15 = z13;
                                        i16 = i14;
                                        i15 = 5;
                                        z14 = z;
                                    } else if (z16 && z19) {
                                        z15 = z;
                                        i16 = 5;
                                        z14 = true;
                                        i15 = 6;
                                    }
                                    if (z12) {
                                        i16 = 6;
                                        i15 = 6;
                                    }
                                    if ((z8 && z14) || z12) {
                                        c0326e.m1308f(c0328gM1314l3, c0328g5, c0331c.m1336b(), i15);
                                    }
                                    if ((z8 && z15) || z12) {
                                        c0328g7 = c0328g4;
                                        c0326e.m1309g(c0328g7, c0328g6, -c0331c2.m1336b(), i16);
                                    }
                                    i17 = 0;
                                    i18 = 6;
                                    if (z) {
                                        c0326e.m1308f(c0328gM1314l3, c0328g, 0, 6);
                                    }
                                } else {
                                    c0328g4 = c0328gM1314l4;
                                    c0328g5 = c0328g3;
                                    c0328g6 = c0328g9;
                                }
                                z13 = z;
                                i14 = 5;
                                z15 = z13;
                                i16 = i14;
                                i15 = 5;
                                z14 = z;
                                if (z12) {
                                    i16 = 6;
                                    i15 = 6;
                                }
                                if (z8) {
                                    c0326e.m1308f(c0328gM1314l3, c0328g5, c0331c.m1336b(), i15);
                                } else {
                                    c0326e.m1308f(c0328gM1314l3, c0328g5, c0331c.m1336b(), i15);
                                }
                                c0328g7 = z8 ? c0328g4 : c0328g4;
                                i17 = 0;
                                i18 = 6;
                                if (z) {
                                    c0326e.m1308f(c0328gM1314l3, c0328g, 0, 6);
                                }
                            } else {
                                c0328g3 = c0328gM1314l5;
                                z9 = true;
                            }
                            z10 = z9;
                            z11 = false;
                            z12 = z11;
                            i13 = 5;
                            if (z10) {
                                c0328g4 = c0328gM1314l4;
                                c0328g5 = c0328g3;
                                c0328g6 = c0328g9;
                                c0326e.m1304b(c0328gM1314l3, c0328g3, c0331c.m1336b(), f, c0328g9, c0328g4, c0331c2.m1336b(), i13);
                                z16 = c0331c.f2276d.f2274b instanceof C0329a;
                                boolean z110 = c0331c2.f2276d.f2274b instanceof C0329a;
                                if (!z16) {
                                }
                                if (z16) {
                                }
                            } else {
                                c0328g4 = c0328gM1314l4;
                                c0328g5 = c0328g3;
                                c0328g6 = c0328g9;
                            }
                            z13 = z;
                            i14 = 5;
                            z15 = z13;
                            i16 = i14;
                            i15 = 5;
                            z14 = z;
                            if (z12) {
                                i16 = 6;
                                i15 = 6;
                            }
                            if (z8) {
                                c0326e.m1308f(c0328gM1314l3, c0328g5, c0331c.m1336b(), i15);
                            } else {
                                c0326e.m1308f(c0328gM1314l3, c0328g5, c0331c.m1336b(), i15);
                            }
                            if (z8) {
                            }
                            i17 = 0;
                            i18 = 6;
                            if (z) {
                                c0326e.m1308f(c0328gM1314l3, c0328g, 0, 6);
                            }
                        }
                    } else {
                        c0326e.m1306d(c0328gM1314l4, c0328gM1314l6, -c0331c2.m1336b(), 6);
                        if (z) {
                            c0326e.m1308f(c0328gM1314l3, c0328g, 0, 5);
                        }
                    }
                } else if (z) {
                    c0326e.m1308f(c0328g2, c0328gM1314l4, 0, 5);
                }
                c0328g7 = c0328gM1314l4;
                i17 = 0;
                i18 = 6;
            } else {
                if (z) {
                    c0326e.m1308f(c0328g2, c0328gM1314l4, 0, 5);
                }
                c0328g7 = c0328gM1314l4;
                i17 = 0;
                i18 = 6;
            }
            if (z) {
                c0326e.m1308f(c0328g2, c0328g7, i17, i18);
                return;
            }
            return;
        }
        z6 = false;
        if (this.f2320Y == 8) {
            iMin = 0;
            z7 = false;
        } else {
            z7 = z6;
            iMin = i2;
        }
        if (z5) {
            i8 = 6;
        } else if (zM1337c) {
            if (zM1337c) {
                i8 = 6;
            } else {
                i8 = 6;
            }
        } else if (zM1337c) {
            i8 = 6;
        } else {
            i8 = 6;
        }
        if (z7) {
            if (z2) {
                c0326e.m1306d(c0328gM1314l4, c0328gM1314l3, 0, 3);
                if (i3 > 0) {
                    c0326e.m1308f(c0328gM1314l4, c0328gM1314l3, i3, i8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    c0326e.m1309g(c0328gM1314l4, c0328gM1314l3, i4, i8);
                }
            } else {
                c0326e.m1306d(c0328gM1314l4, c0328gM1314l3, iMin, i8);
            }
            i9 = i6;
            i10 = i7;
            i11 = i22;
            z8 = z7;
            c0328gM1314l5 = c0328gM1314l5;
            c0328gM1314l4 = c0328gM1314l4;
            r13 = z18 ? 1 : 0;
            c0328gM1314l6 = c0328gM1314l6;
        } else {
            i9 = i6;
            if (i9 == -2) {
                i9 = iMin;
            }
            if (i7 == -2) {
                i10 = iMin;
            } else {
                i10 = i7;
            }
            if (i9 > 0) {
                c0326e.m1308f(c0328gM1314l4, c0328gM1314l3, i9, 6);
                iMin = Math.max(iMin, i9);
            }
            if (i10 > 0) {
                c0326e.m1309g(c0328gM1314l4, c0328gM1314l3, i10, 6);
                iMin = Math.min(iMin, i10);
            }
            if (i22 == 1) {
                i12 = 6;
                if (!z) {
                    if (z4) {
                        i12 = 4;
                    } else {
                        i12 = 1;
                    }
                }
                c0326e.m1306d(c0328gM1314l4, c0328gM1314l3, iMin, i12);
            } else {
                if (i22 == 2) {
                    bVar = c0331c.f2275c;
                    bVar2 = C0331c.b.TOP;
                    if (bVar != bVar2) {
                        C0328g c0328gM1314l8 = c0326e.m1314l(this.f2299D.mo1347f(bVar2));
                        c0328gM1314l = c0326e.m1314l(this.f2299D.mo1347f(bVar3));
                        c0328gM1314l2 = c0328gM1314l8;
                    } else {
                        C0328g c0328gM1314l9 = c0326e.m1314l(this.f2299D.mo1347f(bVar2));
                        c0328gM1314l = c0326e.m1314l(this.f2299D.mo1347f(bVar3));
                        c0328gM1314l2 = c0328gM1314l9;
                    }
                    C0323b c0323bM1315m2 = c0326e.m1315m();
                    i11 = i22;
                    c0323bM1315m2.m1298c(c0328gM1314l4, c0328gM1314l3, c0328gM1314l, c0328gM1314l2, f2);
                    c0326e.m1305c(c0323bM1315m2);
                    z7 = false;
                }
                if (z7) {
                    z8 = z7;
                    r13 = z18;
                } else {
                    z8 = z7;
                    r13 = z18;
                }
            }
            i11 = i22;
            if (z7) {
                z8 = z7;
                r13 = z18;
            } else {
                z8 = z7;
                r13 = z18;
            }
        }
        if (z5) {
        }
        C0328g c0328g10 = c0328gM1314l4;
        if (r13 < 2) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1346e(C0326e c0326e) {
        c0326e.m1314l(this.f2348s);
        c0326e.m1314l(this.f2349t);
        c0326e.m1314l(this.f2350u);
        c0326e.m1314l(this.f2351v);
        if (this.f2312Q > 0) {
            c0326e.m1314l(this.f2352w);
        }
    }

    /* JADX INFO: renamed from: f */
    public C0331c mo1347f(C0331c.b bVar) {
        switch (bVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f2348s;
            case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                return this.f2349t;
            case 3:
                return this.f2350u;
            case 4:
                return this.f2351v;
            case 5:
                return this.f2352w;
            case 6:
                return this.f2355z;
            case 7:
                return this.f2353x;
            case 8:
                return this.f2354y;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* JADX INFO: renamed from: g */
    public a m1348g(int i) {
        if (i == 0) {
            return m1350i();
        }
        if (i == 1) {
            return m1354m();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m1349h() {
        if (this.f2320Y == 8) {
            return 0;
        }
        return this.f2301F;
    }

    /* JADX INFO: renamed from: i */
    public a m1350i() {
        return this.f2298C[0];
    }

    /* JADX INFO: renamed from: j */
    public int m1351j(int i) {
        if (i == 0) {
            return m1355n();
        }
        if (i == 1) {
            return m1349h();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public C0339k m1352k() {
        if (this.f2328d == null) {
            this.f2328d = new C0339k();
        }
        return this.f2328d;
    }

    /* JADX INFO: renamed from: l */
    public C0339k m1353l() {
        if (this.f2326c == null) {
            this.f2326c = new C0339k();
        }
        return this.f2326c;
    }

    /* JADX INFO: renamed from: m */
    public a m1354m() {
        return this.f2298C[1];
    }

    /* JADX INFO: renamed from: n */
    public int m1355n() {
        if (this.f2320Y == 8) {
            return 0;
        }
        return this.f2300E;
    }

    /* JADX INFO: renamed from: o */
    public void m1356o(C0331c.b bVar, C0332d c0332d, C0331c.b bVar2, int i, int i2) {
        mo1347f(bVar).m1335a(c0332d.mo1347f(bVar2), i, i2, C0331c.a.STRONG, 0, true);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1357p(int i) {
        int i2 = i * 2;
        C0331c[] c0331cArr = this.f2296A;
        if (c0331cArr[i2].f2276d != null && c0331cArr[i2].f2276d.f2276d != c0331cArr[i2]) {
            int i3 = i2 + 1;
            if (c0331cArr[i3].f2276d != null && c0331cArr[i3].f2276d.f2276d == c0331cArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m1358q() {
        return this.f2348s.f2273a.f2408b == 1 && this.f2350u.f2273a.f2408b == 1 && this.f2349t.f2273a.f2408b == 1 && this.f2351v.f2273a.f2408b == 1;
    }

    /* JADX INFO: renamed from: r */
    public void mo1359r() {
        this.f2348s.m1338d();
        this.f2349t.m1338d();
        this.f2350u.m1338d();
        this.f2351v.m1338d();
        this.f2352w.m1338d();
        this.f2353x.m1338d();
        this.f2354y.m1338d();
        this.f2355z.m1338d();
        this.f2299D = null;
        this.f2347r = 0.0f;
        this.f2300E = 0;
        this.f2301F = 0;
        this.f2302G = 0.0f;
        this.f2303H = -1;
        this.f2304I = 0;
        this.f2305J = 0;
        this.f2308M = 0;
        this.f2309N = 0;
        this.f2310O = 0;
        this.f2311P = 0;
        this.f2312Q = 0;
        this.f2313R = 0;
        this.f2314S = 0;
        this.f2315T = 0;
        this.f2316U = 0;
        this.f2317V = 0.5f;
        this.f2318W = 0.5f;
        a[] aVarArr = this.f2298C;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f2319X = null;
        this.f2320Y = 0;
        this.f2329d0 = 0;
        this.f2331e0 = 0;
        float[] fArr = this.f2333f0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2322a = -1;
        this.f2324b = -1;
        int[] iArr = this.f2346q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2330e = 0;
        this.f2332f = 0;
        this.f2339j = 1.0f;
        this.f2342m = 1.0f;
        this.f2338i = Integer.MAX_VALUE;
        this.f2341l = Integer.MAX_VALUE;
        this.f2336h = 0;
        this.f2340k = 0;
        this.f2343n = -1;
        this.f2344o = 1.0f;
        C0339k c0339k = this.f2326c;
        if (c0339k != null) {
            c0339k.f2408b = 0;
            c0339k.f2407a.clear();
            c0339k.f2406c = 0.0f;
        }
        C0339k c0339k2 = this.f2328d;
        if (c0339k2 != null) {
            c0339k2.f2408b = 0;
            c0339k2.f2407a.clear();
            c0339k2.f2406c = 0.0f;
        }
        this.f2345p = null;
        this.f2323a0 = false;
        this.f2325b0 = false;
        this.f2327c0 = false;
    }

    /* JADX INFO: renamed from: s */
    public void mo1333s() {
        for (int i = 0; i < 6; i++) {
            this.f2296A[i].f2273a.m1384i();
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo1360t(C0324c c0324c) {
        this.f2348s.m1339e();
        this.f2349t.m1339e();
        this.f2350u.m1339e();
        this.f2351v.m1339e();
        this.f2352w.m1339e();
        this.f2355z.m1339e();
        this.f2353x.m1339e();
        this.f2354y.m1339e();
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("");
        sbM2191e.append(this.f2321Z != null ? a.m2203q(a.m2191e("id: "), this.f2321Z, " ") : "");
        sbM2191e.append("(");
        sbM2191e.append(this.f2304I);
        sbM2191e.append(", ");
        sbM2191e.append(this.f2305J);
        sbM2191e.append(") - (");
        sbM2191e.append(this.f2300E);
        sbM2191e.append(" x ");
        sbM2191e.append(this.f2301F);
        sbM2191e.append(") wrap: (");
        sbM2191e.append(this.f2315T);
        sbM2191e.append(" x ");
        sbM2191e.append(this.f2316U);
        sbM2191e.append(")");
        return sbM2191e.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo1334u() {
    }

    /* JADX INFO: renamed from: v */
    public void m1361v(int i, int i2, int i3) {
        if (i3 == 0) {
            this.f2304I = i;
            int i4 = i2 - i;
            this.f2300E = i4;
            int i5 = this.f2313R;
            if (i4 < i5) {
                this.f2300E = i5;
            }
        } else if (i3 == 1) {
            this.f2305J = i;
            int i6 = i2 - i;
            this.f2301F = i6;
            int i7 = this.f2314S;
            if (i6 < i7) {
                this.f2301F = i7;
            }
        }
        this.f2325b0 = true;
    }

    /* JADX INFO: renamed from: w */
    public void m1362w(int i) {
        this.f2301F = i;
        int i2 = this.f2314S;
        if (i < i2) {
            this.f2301F = i2;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m1363x(int i, int i2) {
        this.f2304I = i;
        int i3 = i2 - i;
        this.f2300E = i3;
        int i4 = this.f2313R;
        if (i3 < i4) {
            this.f2300E = i4;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1364y(a aVar) {
        this.f2298C[0] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            m1342C(this.f2315T);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo1365z(int i, int i2) {
        this.f2310O = i;
        this.f2311P = i2;
    }
}
