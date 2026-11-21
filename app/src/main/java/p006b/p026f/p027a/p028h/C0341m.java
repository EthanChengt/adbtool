package p006b.p026f.p027a.p028h;

import java.util.ArrayList;

/* JADX INFO: renamed from: b.f.a.h.m */
/* JADX INFO: loaded from: classes.dex */
public class C0341m {

    /* JADX INFO: renamed from: a */
    public int f2409a;

    /* JADX INFO: renamed from: b */
    public int f2410b;

    /* JADX INFO: renamed from: c */
    public int f2411c;

    /* JADX INFO: renamed from: d */
    public int f2412d;

    /* JADX INFO: renamed from: e */
    public ArrayList<a> f2413e = new ArrayList<>();

    /* JADX INFO: renamed from: b.f.a.h.m$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C0331c f2414a;

        /* JADX INFO: renamed from: b */
        public C0331c f2415b;

        /* JADX INFO: renamed from: c */
        public int f2416c;

        /* JADX INFO: renamed from: d */
        public C0331c.a f2417d;

        /* JADX INFO: renamed from: e */
        public int f2418e;

        public a(C0331c c0331c) {
            this.f2414a = c0331c;
            this.f2415b = c0331c.f2276d;
            this.f2416c = c0331c.m1336b();
            this.f2417d = c0331c.f2279g;
            this.f2418e = c0331c.f2280h;
        }
    }

    public C0341m(C0332d c0332d) {
        this.f2409a = c0332d.f2304I;
        this.f2410b = c0332d.f2305J;
        this.f2411c = c0332d.m1355n();
        this.f2412d = c0332d.m1349h();
        ArrayList<C0331c> arrayList = c0332d.f2297B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f2413e.add(new a(arrayList.get(i)));
        }
    }
}
