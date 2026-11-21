package p080c.p126d.p127a.p128a.p135f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: c.d.a.a.f.c */
/* JADX INFO: loaded from: classes.dex */
public class C1209c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomAppBar f5741a;

    public C1209c(BottomAppBar bottomAppBar) {
        this.f5741a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m3061w(this.f5741a);
        this.f5741a.f10162R = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5741a.f10166V++;
    }
}
