package p006b.p073w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: b.w.k */
/* JADX INFO: loaded from: classes.dex */
public class C0586k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0584i f3604a;

    public C0586k(AbstractC0584i abstractC0584i) {
        this.f3604a = abstractC0584i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3604a.m2122m();
        animator.removeListener(this);
    }
}
