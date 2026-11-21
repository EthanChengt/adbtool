package p080c.p126d.p127a.p128a.p133d;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: c.d.a.a.d.c */
/* JADX INFO: loaded from: classes.dex */
public class C1199c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f5688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f5689b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5690c;

    public C1199c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f5690c = baseBehavior;
        this.f5688a = coordinatorLayout;
        this.f5689b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5690c.m2775H(this.f5688a, this.f5689b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
