package p080c.p126d.p127a.p128a.p135f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: c.d.a.a.f.a */
/* JADX INFO: loaded from: classes.dex */
public class C1207a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomAppBar f5737a;

    public C1207a(BottomAppBar bottomAppBar) {
        this.f5737a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m3061w(this.f5737a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5737a.f10166V++;
    }
}
