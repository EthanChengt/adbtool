package p006b.p056m.p057b;

import androidx.fragment.app.Fragment;
import p006b.p032h.p040f.C0388a;

/* JADX INFO: renamed from: b.m.b.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0458d0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0466h0.a f2992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Fragment f2993c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0388a f2994d;

    public RunnableC0458d0(C0466h0.a aVar, Fragment fragment, C0388a c0388a) {
        this.f2992b = aVar;
        this.f2993c = fragment;
        this.f2994d = c0388a;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((AbstractC0483r.b) this.f2992b).m1863a(this.f2993c, this.f2994d);
    }
}
