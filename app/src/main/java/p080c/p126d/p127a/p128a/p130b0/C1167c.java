package p080c.p126d.p127a.p128a.p130b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.d.a.a.b0.c */
/* JADX INFO: loaded from: classes.dex */
public class C1167c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1165a f5597a;

    public C1167c(C1165a c1165a) {
        this.f5597a = c1165a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f5597a.f5627a.setEndIconVisible(false);
    }
}
