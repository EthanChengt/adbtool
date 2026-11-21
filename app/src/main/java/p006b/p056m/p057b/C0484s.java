package p006b.p056m.p057b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: b.m.b.s */
/* JADX INFO: loaded from: classes.dex */
public class C0484s extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f3131a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3132b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Fragment f3133c;

    public C0484s(AbstractC0483r abstractC0483r, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f3131a = viewGroup;
        this.f3132b = view;
        this.f3133c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3131a.endViewTransition(this.f3132b);
        animator.removeListener(this);
        Fragment fragment = this.f3133c;
        View view = fragment.f667G;
        if (view == null || !fragment.f705z) {
            return;
        }
        view.setVisibility(8);
    }
}
