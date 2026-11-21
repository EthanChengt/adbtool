package p006b.p026f.p027a.p028h;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: b.f.a.h.l */
/* JADX INFO: loaded from: classes.dex */
public class C0340l {

    /* JADX INFO: renamed from: a */
    public HashSet<C0340l> f2407a = new HashSet<>(2);

    /* JADX INFO: renamed from: b */
    public int f2408b = 0;

    /* JADX INFO: renamed from: a */
    public void m1388a() {
        this.f2408b = 1;
        Iterator<C0340l> it = this.f2407a.iterator();
        while (it.hasNext()) {
            it.next().mo1379d();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1389b() {
        this.f2408b = 0;
        Iterator<C0340l> it = this.f2407a.iterator();
        while (it.hasNext()) {
            it.next().m1389b();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m1390c() {
        return this.f2408b == 1;
    }

    /* JADX INFO: renamed from: d */
    public void mo1379d() {
    }
}
