package p080c.p126d.p127a.p128a.p130b0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: c.d.a.a.b0.m */
/* JADX INFO: loaded from: classes.dex */
public class C1177m implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1172h f5626a;

    public C1177m(C1172h c1172h) {
        this.f5626a = c1172h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5626a.f5629c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
