package p080c.p126d.p127a.p128a.p130b0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: c.d.a.a.b0.e */
/* JADX INFO: loaded from: classes.dex */
public class C1169e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1165a f5599a;

    public C1169e(C1165a c1165a) {
        this.f5599a = c1165a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5599a.f5629c.setScaleX(fFloatValue);
        this.f5599a.f5629c.setScaleY(fFloatValue);
    }
}
