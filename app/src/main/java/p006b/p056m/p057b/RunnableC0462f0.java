package p006b.p056m.p057b;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import p006b.p025e.C0313a;

/* JADX INFO: renamed from: b.m.b.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0462f0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f3013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Fragment f3014c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f3015d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0313a f3016e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f3017f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0476m0 f3018g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Rect f3019h;

    public RunnableC0462f0(Fragment fragment, Fragment fragment2, boolean z, C0313a c0313a, View view, AbstractC0476m0 abstractC0476m0, Rect rect) {
        this.f3013b = fragment;
        this.f3014c = fragment2;
        this.f3015d = z;
        this.f3016e = c0313a;
        this.f3017f = view;
        this.f3018g = abstractC0476m0;
        this.f3019h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0466h0.m1745c(this.f3013b, this.f3014c, this.f3015d, this.f3016e, false);
        View view = this.f3017f;
        if (view != null) {
            this.f3018g.m1782j(view, this.f3019h);
        }
    }
}
