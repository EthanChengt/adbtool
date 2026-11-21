package p080c.p126d.p127a.p128a.p130b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.d.a.a.b0.b */
/* JADX INFO: loaded from: classes.dex */
public class C1166b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1165a f5596a;

    public C1166b(C1165a c1165a) {
        this.f5596a = c1165a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5596a.f5627a.setEndIconVisible(true);
    }
}
