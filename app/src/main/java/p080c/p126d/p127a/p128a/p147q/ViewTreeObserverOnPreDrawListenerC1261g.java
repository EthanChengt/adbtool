package p080c.p126d.p127a.p128a.p147q;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: c.d.a.a.q.g */
/* JADX INFO: loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC1261g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1259e f6048b;

    public ViewTreeObserverOnPreDrawListenerC1261g(C1259e c1259e) {
        this.f6048b = c1259e;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        C1259e c1259e = this.f6048b;
        float rotation = c1259e.f6037y.getRotation();
        if (c1259e.f6030r == rotation) {
            return true;
        }
        c1259e.f6030r = rotation;
        c1259e.mo2905w();
        return true;
    }
}
