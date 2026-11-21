package p006b.p073w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p006b.p025e.C0313a;

/* JADX INFO: renamed from: b.w.j */
/* JADX INFO: loaded from: classes.dex */
public class C0585j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0313a f3602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0584i f3603b;

    public C0585j(AbstractC0584i abstractC0584i, C0313a c0313a) {
        this.f3603b = abstractC0584i;
        this.f3602a = c0313a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3602a.remove(animator);
        this.f3603b.f3589n.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3603b.f3589n.add(animator);
    }
}
