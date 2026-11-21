package p080c.p126d.p127a.p128a.p147q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.d.a.a.q.d */
/* JADX INFO: loaded from: classes.dex */
public class C1258d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f5998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1259e.f f5999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1259e f6000c;

    public C1258d(C1259e c1259e, boolean z, C1259e.f fVar) {
        this.f6000c = c1259e;
        this.f5998a = z;
        this.f5999b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C1259e c1259e = this.f6000c;
        c1259e.f6033u = 0;
        c1259e.f6027o = null;
        C1259e.f fVar = this.f5999b;
        if (fVar != null) {
            C1256b c1256b = (C1256b) fVar;
            c1256b.f5992a.mo2790b(c1256b.f5993b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f6000c.f6037y.m2948b(0, this.f5998a);
        C1259e c1259e = this.f6000c;
        c1259e.f6033u = 2;
        c1259e.f6027o = animator;
    }
}
