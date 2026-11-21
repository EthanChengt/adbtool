package p006b.p068t.p069b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.i */
/* JADX INFO: loaded from: classes.dex */
public class C0546i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0548k.a f3341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3342b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3343c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0548k f3344d;

    public C0546i(C0548k c0548k, C0548k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3344d = c0548k;
        this.f3341a = aVar;
        this.f3342b = viewPropertyAnimator;
        this.f3343c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3342b.setListener(null);
        this.f3343c.setAlpha(1.0f);
        this.f3343c.setTranslationX(0.0f);
        this.f3343c.setTranslationY(0.0f);
        this.f3344d.m550c(this.f3341a.f3361a);
        this.f3344d.f3360r.remove(this.f3341a.f3361a);
        this.f3344d.m2018k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C0548k c0548k = this.f3344d;
        RecyclerView.AbstractC0129d0 abstractC0129d0 = this.f3341a.f3361a;
        Objects.requireNonNull(c0548k);
    }
}
