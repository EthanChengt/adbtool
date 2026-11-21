package p006b.p068t.p069b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.g */
/* JADX INFO: loaded from: classes.dex */
public class C0544g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0129d0 f3331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3332b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3333c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0548k f3334d;

    public C0544g(C0548k c0548k, RecyclerView.AbstractC0129d0 abstractC0129d0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3334d = c0548k;
        this.f3331a = abstractC0129d0;
        this.f3332b = view;
        this.f3333c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3332b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3333c.setListener(null);
        this.f3334d.m550c(this.f3331a);
        this.f3334d.f3357o.remove(this.f3331a);
        this.f3334d.m2018k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f3334d);
    }
}
