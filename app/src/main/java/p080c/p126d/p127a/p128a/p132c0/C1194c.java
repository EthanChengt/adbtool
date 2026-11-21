package p080c.p126d.p127a.p128a.p132c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import p080c.p126d.p127a.p128a.p141l.InterfaceC1222d;

/* JADX INFO: renamed from: c.d.a.a.c0.c */
/* JADX INFO: loaded from: classes.dex */
public class C1194c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1222d f5685a;

    public C1194c(FabTransformationBehavior fabTransformationBehavior, InterfaceC1222d interfaceC1222d) {
        this.f5685a = interfaceC1222d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        InterfaceC1222d.e revealInfo = this.f5685a.getRevealInfo();
        revealInfo.f5852c = Float.MAX_VALUE;
        this.f5685a.setRevealInfo(revealInfo);
    }
}
