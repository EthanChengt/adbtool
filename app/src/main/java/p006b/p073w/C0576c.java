package p006b.p073w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.w.c */
/* JADX INFO: loaded from: classes.dex */
public class C0576c extends AbstractC0575b0 {

    /* JADX INFO: renamed from: b.w.c$a */
    public class a extends C0587l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f3555a;

        public a(C0576c c0576c, View view) {
            this.f3555a = view;
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: e */
        public void mo2087e(AbstractC0584i abstractC0584i) {
            View view = this.f3555a;
            C0601z c0601z = C0595t.f3630a;
            c0601z.mo2142e(view, 1.0f);
            c0601z.mo2139a(this.f3555a);
            abstractC0584i.mo2127v(this);
        }
    }

    /* JADX INFO: renamed from: b.w.c$b */
    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final View f3556a;

        /* JADX INFO: renamed from: b */
        public boolean f3557b = false;

        public b(View view) {
            this.f3556a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0595t.f3630a.mo2142e(this.f3556a, 1.0f);
            if (this.f3557b) {
                this.f3556a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f3556a;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (view.hasOverlappingRendering() && this.f3556a.getLayerType() == 0) {
                this.f3557b = true;
                this.f3556a.setLayerType(2, null);
            }
        }
    }

    public C0576c(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f3542y = i;
    }

    @Override // p006b.p073w.AbstractC0575b0
    /* JADX INFO: renamed from: J */
    public Animator mo2096J(ViewGroup viewGroup, View view, C0592q c0592q, C0592q c0592q2) {
        C0595t.f3630a.mo2141c(view);
        Float f = (Float) c0592q.f3622a.get("android:fade:transitionAlpha");
        return m2101K(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: K */
    public final Animator m2101K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0595t.f3630a.mo2142e(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C0595t.f3631b, f2);
        objectAnimatorOfFloat.addListener(new b(view));
        mo2114a(new a(this, view));
        return objectAnimatorOfFloat;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: g */
    public void mo2090g(C0592q c0592q) {
        m2094H(c0592q);
        c0592q.f3622a.put("android:fade:transitionAlpha", Float.valueOf(C0595t.m2137a(c0592q.f3623b)));
    }
}
