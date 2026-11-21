package p006b.p068t.p069b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.h */
/* JADX INFO: loaded from: classes.dex */
public class C0545h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0129d0 f3335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3336b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3337c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3338d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3339e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0548k f3340f;

    public C0545h(C0548k c0548k, RecyclerView.AbstractC0129d0 abstractC0129d0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3340f = c0548k;
        this.f3335a = abstractC0129d0;
        this.f3336b = i;
        this.f3337c = view;
        this.f3338d = i2;
        this.f3339e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f3336b != 0) {
            this.f3337c.setTranslationX(0.0f);
        }
        if (this.f3338d != 0) {
            this.f3337c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3339e.setListener(null);
        this.f3340f.m550c(this.f3335a);
        this.f3340f.f3358p.remove(this.f3335a);
        this.f3340f.m2018k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f3340f);
    }
}
