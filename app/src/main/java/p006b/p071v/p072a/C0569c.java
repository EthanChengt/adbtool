package p006b.p071v.p072a;

import android.animation.Animator;

/* JADX INFO: renamed from: b.v.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0569c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0570d.a f3484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0570d f3485b;

    public C0569c(C0570d c0570d, C0570d.a aVar) {
        this.f3485b = c0570d;
        this.f3484a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.f3485b.m2079a(1.0f, this.f3484a, true);
        C0570d.a aVar = this.f3484a;
        aVar.f3505k = aVar.f3499e;
        aVar.f3506l = aVar.f3500f;
        aVar.f3507m = aVar.f3501g;
        aVar.m2083a((aVar.f3504j + 1) % aVar.f3503i.length);
        C0570d c0570d = this.f3485b;
        if (!c0570d.f3494g) {
            c0570d.f3493f += 1.0f;
            return;
        }
        c0570d.f3494g = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.f3484a.m2084b(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3485b.f3493f = 0.0f;
    }
}
