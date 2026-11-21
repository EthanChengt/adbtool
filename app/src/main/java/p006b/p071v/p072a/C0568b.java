package p006b.p071v.p072a;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: b.v.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0568b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0570d.a f3482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0570d f3483b;

    public C0568b(C0570d c0570d, C0570d.a aVar) {
        this.f3483b = c0570d;
        this.f3482a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f3483b.m2082d(fFloatValue, this.f3482a);
        this.f3483b.m2079a(fFloatValue, this.f3482a, false);
        this.f3483b.invalidateSelf();
    }
}
