package p080c.p126d.p127a.p128a.p143m;

import android.view.View;
import com.didjdk.adbhelper.R;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.p045w.C0429b;

/* JADX INFO: renamed from: c.d.a.a.m.i */
/* JADX INFO: loaded from: classes.dex */
public class C1233i extends C0406a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1231g f5908d;

    public C1233i(C1231g c1231g) {
        this.f5908d = c1231g;
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: d */
    public void mo223d(View view, C0429b c0429b) {
        C1231g c1231g;
        int i;
        this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
        if (this.f5908d.f5896f0.getVisibility() == 0) {
            c1231g = this.f5908d;
            i = R.string.e4;
        } else {
            c1231g = this.f5908d;
            i = R.string.e2;
        }
        c0429b.m1619n(c1231g.m337y(i));
    }
}
