package p006b.p026f.p027a.p028h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: b.f.a.h.f */
/* JADX INFO: loaded from: classes.dex */
public class C0334f {

    /* JADX INFO: renamed from: a */
    public List<C0332d> f2378a;

    /* JADX INFO: renamed from: b */
    public boolean f2379b;

    /* JADX INFO: renamed from: c */
    public final int[] f2380c;

    /* JADX INFO: renamed from: d */
    public List<C0332d> f2381d;

    /* JADX INFO: renamed from: e */
    public List<C0332d> f2382e;

    /* JADX INFO: renamed from: f */
    public HashSet<C0332d> f2383f;

    /* JADX INFO: renamed from: g */
    public HashSet<C0332d> f2384g;

    /* JADX INFO: renamed from: h */
    public List<C0332d> f2385h;

    /* JADX INFO: renamed from: i */
    public List<C0332d> f2386i;

    public C0334f(List<C0332d> list) {
        this.f2379b = false;
        this.f2380c = new int[]{-1, -1};
        this.f2381d = new ArrayList();
        this.f2382e = new ArrayList();
        this.f2383f = new HashSet<>();
        this.f2384g = new HashSet<>();
        this.f2385h = new ArrayList();
        this.f2386i = new ArrayList();
        this.f2378a = list;
    }

    public C0334f(List<C0332d> list, boolean z) {
        this.f2379b = false;
        this.f2380c = new int[]{-1, -1};
        this.f2381d = new ArrayList();
        this.f2382e = new ArrayList();
        this.f2383f = new HashSet<>();
        this.f2384g = new HashSet<>();
        this.f2385h = new ArrayList();
        this.f2386i = new ArrayList();
        this.f2378a = list;
        this.f2379b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m1373a(C0332d c0332d, int i) {
        HashSet<C0332d> hashSet;
        if (i == 0) {
            hashSet = this.f2383f;
        } else if (i != 1) {
            return;
        } else {
            hashSet = this.f2384g;
        }
        hashSet.add(c0332d);
    }

    /* JADX INFO: renamed from: b */
    public final void m1374b(ArrayList<C0332d> arrayList, C0332d c0332d) {
        C0332d c0332d2;
        if (c0332d.f2327c0) {
            return;
        }
        arrayList.add(c0332d);
        c0332d.f2327c0 = true;
        if (c0332d.m1358q()) {
            return;
        }
        if (c0332d instanceof C0336h) {
            C0336h c0336h = (C0336h) c0332d;
            int i = c0336h.f2393j0;
            for (int i2 = 0; i2 < i; i2++) {
                m1374b(arrayList, c0336h.f2392i0[i2]);
            }
        }
        int length = c0332d.f2296A.length;
        for (int i3 = 0; i3 < length; i3++) {
            C0331c c0331c = c0332d.f2296A[i3].f2276d;
            if (c0331c != null && (c0332d2 = c0331c.f2274b) != c0332d.f2299D) {
                m1374b(arrayList, c0332d2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX INFO: renamed from: c */
    public final void m1375c(C0332d c0332d) {
        int iM1355n;
        int iM1355n2;
        if (!c0332d.f2323a0 || c0332d.m1358q()) {
            return;
        }
        C0331c c0331c = c0332d.f2350u.f2276d;
        boolean z = c0331c != null;
        if (!z) {
            c0331c = c0332d.f2348s.f2276d;
        }
        if (c0331c != null) {
            C0332d c0332d2 = c0331c.f2274b;
            if (!c0332d2.f2325b0) {
                m1375c(c0332d2);
            }
            C0331c.b bVar = c0331c.f2275c;
            if (bVar == C0331c.b.RIGHT) {
                C0332d c0332d3 = c0331c.f2274b;
                iM1355n = c0332d3.m1355n() + c0332d3.f2304I;
            } else if (bVar == C0331c.b.LEFT) {
                iM1355n = c0331c.f2274b.f2304I;
            } else {
                iM1355n = 0;
            }
        } else {
            iM1355n = 0;
        }
        if (z) {
            iM1355n2 = iM1355n - c0332d.f2350u.m1336b();
        } else {
            iM1355n2 = iM1355n + c0332d.m1355n() + c0332d.f2348s.m1336b();
        }
        c0332d.m1363x(iM1355n2 - c0332d.m1355n(), iM1355n2);
        C0331c c0331c2 = c0332d.f2352w.f2276d;
        if (c0331c2 != null) {
            C0332d c0332d4 = c0331c2.f2274b;
            if (!c0332d4.f2325b0) {
                m1375c(c0332d4);
            }
            C0332d c0332d5 = c0331c2.f2274b;
            int i = (c0332d5.f2305J + c0332d5.f2312Q) - c0332d.f2312Q;
            c0332d.m1340A(i, c0332d.f2301F + i);
            c0332d.f2325b0 = true;
            return;
        }
        C0331c c0331c3 = c0332d.f2351v.f2276d;
        boolean z2 = c0331c3 != null;
        if (!z2) {
            c0331c3 = c0332d.f2349t.f2276d;
        }
        if (c0331c3 != null) {
            C0332d c0332d6 = c0331c3.f2274b;
            if (!c0332d6.f2325b0) {
                m1375c(c0332d6);
            }
            C0331c.b bVar2 = c0331c3.f2275c;
            if (bVar2 == C0331c.b.BOTTOM) {
                C0332d c0332d7 = c0331c3.f2274b;
                iM1355n2 = c0332d7.m1349h() + c0332d7.f2305J;
            } else if (bVar2 == C0331c.b.TOP) {
                iM1355n2 = c0331c3.f2274b.f2305J;
            }
        }
        int iM1336b = z2 ? iM1355n2 - c0332d.f2351v.m1336b() : iM1355n2 + c0332d.m1349h() + c0332d.f2349t.m1336b();
        c0332d.m1340A(iM1336b - c0332d.m1349h(), iM1336b);
        c0332d.f2325b0 = true;
    }
}
