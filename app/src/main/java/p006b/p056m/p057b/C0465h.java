package p006b.p056m.p057b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p006b.p032h.p040f.C0388a;

/* JADX INFO: renamed from: b.m.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0465h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f3037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Fragment f3039c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0466h0.a f3040d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0388a f3041e;

    public C0465h(ViewGroup viewGroup, View view, Fragment fragment, C0466h0.a aVar, C0388a c0388a) {
        this.f3037a = viewGroup;
        this.f3038b = view;
        this.f3039c = fragment;
        this.f3040d = aVar;
        this.f3041e = c0388a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3037a.endViewTransition(this.f3038b);
        Fragment fragment = this.f3039c;
        Fragment.C0088a c0088a = fragment.f670J;
        Animator animator2 = c0088a == null ? null : c0088a.f708b;
        fragment.m330u0(null);
        if (animator2 == null || this.f3037a.indexOfChild(this.f3038b) >= 0) {
            return;
        }
        ((AbstractC0483r.b) this.f3040d).m1863a(this.f3039c, this.f3041e);
    }
}
