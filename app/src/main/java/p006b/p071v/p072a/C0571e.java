package p006b.p071v.p072a;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: b.v.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0571e extends Animation {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SwipeRefreshLayout f3516b;

    public C0571e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f3516b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f3516b.setAnimationProgress(f);
    }
}
