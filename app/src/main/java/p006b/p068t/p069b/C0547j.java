package p006b.p068t.p069b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.j */
/* JADX INFO: loaded from: classes.dex */
public class C0547j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0548k.a f3345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3347c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0548k f3348d;

    public C0547j(C0548k c0548k, C0548k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3348d = c0548k;
        this.f3345a = aVar;
        this.f3346b = viewPropertyAnimator;
        this.f3347c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3346b.setListener(null);
        this.f3347c.setAlpha(1.0f);
        this.f3347c.setTranslationX(0.0f);
        this.f3347c.setTranslationY(0.0f);
        this.f3348d.m550c(this.f3345a.f3362b);
        this.f3348d.f3360r.remove(this.f3345a.f3362b);
        this.f3348d.m2018k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C0548k c0548k = this.f3348d;
        RecyclerView.AbstractC0129d0 abstractC0129d0 = this.f3345a.f3362b;
        Objects.requireNonNull(c0548k);
    }
}
