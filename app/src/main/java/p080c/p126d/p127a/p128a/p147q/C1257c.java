package p080c.p126d.p127a.p128a.p147q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: c.d.a.a.q.c */
/* JADX INFO: loaded from: classes.dex */
public class C1257c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f5994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f5995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1259e.f f5996c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1259e f5997d;

    public C1257c(C1259e c1259e, boolean z, C1259e.f fVar) {
        this.f5997d = c1259e;
        this.f5995b = z;
        this.f5996c = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f5994a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C1259e c1259e = this.f5997d;
        c1259e.f6033u = 0;
        c1259e.f6027o = null;
        if (this.f5994a) {
            return;
        }
        FloatingActionButton floatingActionButton = c1259e.f6037y;
        boolean z = this.f5995b;
        floatingActionButton.m2948b(z ? 8 : 4, z);
        C1259e.f fVar = this.f5996c;
        if (fVar != null) {
            C1256b c1256b = (C1256b) fVar;
            c1256b.f5992a.mo2789a(c1256b.f5993b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5997d.f6037y.m2948b(0, this.f5995b);
        C1259e c1259e = this.f5997d;
        c1259e.f6033u = 1;
        c1259e.f6027o = animator;
        this.f5994a = false;
    }
}
