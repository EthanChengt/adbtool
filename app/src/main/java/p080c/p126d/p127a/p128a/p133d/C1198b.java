package p080c.p126d.p127a.p128a.p133d;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import p080c.p126d.p127a.p128a.p154x.C1296g;

/* JADX INFO: renamed from: c.d.a.a.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1198b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1296g f5687a;

    public C1198b(AppBarLayout appBarLayout, C1296g c1296g) {
        this.f5687a = c1296g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5687a.m2974o(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
