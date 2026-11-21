package p080c.p126d.p127a.p128a.p132c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;
import p080c.p126d.p127a.p128a.p141l.InterfaceC1222d;

/* JADX INFO: renamed from: c.d.a.a.c0.b */
/* JADX INFO: loaded from: classes.dex */
public class C1193b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1222d f5683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Drawable f5684b;

    public C1193b(FabTransformationBehavior fabTransformationBehavior, InterfaceC1222d interfaceC1222d, Drawable drawable) {
        this.f5683a = interfaceC1222d;
        this.f5684b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f5683a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5683a.setCircularRevealOverlayDrawable(this.f5684b);
    }
}
