package p006b.p056m.p057b;

import android.view.View;
import androidx.fragment.app.Fragment;
import p006b.p032h.p040f.C0388a;

/* JADX INFO: renamed from: b.m.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0461f implements C0388a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Fragment f3012a;

    public C0461f(Fragment fragment) {
        this.f3012a = fragment;
    }

    /* JADX INFO: renamed from: a */
    public void m1742a() {
        if (this.f3012a.m305i() != null) {
            View viewM305i = this.f3012a.m305i();
            this.f3012a.m328t0(null);
            viewM305i.clearAnimation();
        }
        this.f3012a.m330u0(null);
    }
}
