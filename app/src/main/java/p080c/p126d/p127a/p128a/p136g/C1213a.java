package p080c.p126d.p127a.p128a.p136g;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p080c.p126d.p127a.p128a.p154x.C1296g;

/* JADX INFO: renamed from: c.d.a.a.g.a */
/* JADX INFO: loaded from: classes.dex */
public class C1213a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f5753a;

    public C1213a(BottomSheetBehavior bottomSheetBehavior) {
        this.f5753a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1296g c1296g = this.f5753a.f10193h;
        if (c1296g != null) {
            c1296g.m2976q(fFloatValue);
        }
    }
}
