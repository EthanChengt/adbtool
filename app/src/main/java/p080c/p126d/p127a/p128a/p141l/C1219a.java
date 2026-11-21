package p080c.p126d.p127a.p128a.p141l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.d.a.a.l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1219a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1222d f5844a;

    public C1219a(InterfaceC1222d interfaceC1222d) {
        this.f5844a = interfaceC1222d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f5844a.mo2844b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5844a.mo2843a();
    }
}
