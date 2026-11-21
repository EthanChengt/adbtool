package p080c.p126d.p127a.p128a.p130b0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: c.d.a.a.b0.d */
/* JADX INFO: loaded from: classes.dex */
public class C1168d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1165a f5598a;

    public C1168d(C1165a c1165a) {
        this.f5598a = c1165a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5598a.f5629c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
