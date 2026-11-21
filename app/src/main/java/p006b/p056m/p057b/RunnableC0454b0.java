package p006b.p056m.p057b;

import androidx.fragment.app.Fragment;
import p006b.p032h.p040f.C0388a;

/* JADX INFO: renamed from: b.m.b.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0454b0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0466h0.a f2970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Fragment f2971c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0388a f2972d;

    public RunnableC0454b0(C0466h0.a aVar, Fragment fragment, C0388a c0388a) {
        this.f2970b = aVar;
        this.f2971c = fragment;
        this.f2972d = c0388a;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((AbstractC0483r.b) this.f2970b).m1863a(this.f2971c, this.f2972d);
    }
}
