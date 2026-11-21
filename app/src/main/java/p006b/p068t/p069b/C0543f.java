package p006b.p068t.p069b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.f */
/* JADX INFO: loaded from: classes.dex */
public class C0543f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0129d0 f3327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0548k f3330d;

    public C0543f(C0548k c0548k, RecyclerView.AbstractC0129d0 abstractC0129d0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3330d = c0548k;
        this.f3327a = abstractC0129d0;
        this.f3328b = viewPropertyAnimator;
        this.f3329c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3328b.setListener(null);
        this.f3329c.setAlpha(1.0f);
        this.f3330d.m550c(this.f3327a);
        this.f3330d.f3359q.remove(this.f3327a);
        this.f3330d.m2018k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f3330d);
    }
}
