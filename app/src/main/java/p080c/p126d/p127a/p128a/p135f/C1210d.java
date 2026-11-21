package p080c.p126d.p127a.p128a.p135f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: c.d.a.a.f.d */
/* JADX INFO: loaded from: classes.dex */
public class C1210d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f5742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionMenuView f5743b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f5744c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f5745d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BottomAppBar f5746e;

    public C1210d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f5746e = bottomAppBar;
        this.f5743b = actionMenuView;
        this.f5744c = i;
        this.f5745d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f5742a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f5742a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f5746e;
        ActionMenuView actionMenuView = this.f5743b;
        int i = this.f5744c;
        boolean z = this.f5745d;
        int i2 = BottomAppBar.f10160b0;
        actionMenuView.setTranslationX(bottomAppBar.m3062A(actionMenuView, i, z));
    }
}
