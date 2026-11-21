package p080c.p126d.p127a.p128a.p130b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.d.a.a.b0.l */
/* JADX INFO: loaded from: classes.dex */
public class C1176l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1172h f5625a;

    public C1176l(C1172h c1172h) {
        this.f5625a = c1172h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C1172h c1172h = this.f5625a;
        c1172h.f5629c.setChecked(c1172h.f5608h);
        this.f5625a.f5614n.start();
    }
}
