package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p080c.p126d.p127a.p128a.p131c.C1182a;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0068c<V> {

    /* JADX INFO: renamed from: a */
    public int f10142a;

    /* JADX INFO: renamed from: b */
    public int f10143b;

    /* JADX INFO: renamed from: c */
    public int f10144c;

    /* JADX INFO: renamed from: d */
    public ViewPropertyAnimator f10145d;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C1337a extends AnimatorListenerAdapter {
        public C1337a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f10145d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f10142a = 0;
        this.f10143b = 2;
        this.f10144c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10142a = 0;
        this.f10143b = 2;
        this.f10144c = 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m3057B(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f10145d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C1337a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: k */
    public boolean mo174k(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f10142a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: q */
    public void mo180q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            if (this.f10143b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f10145d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f10143b = 1;
            m3057B(v, this.f10142a + this.f10144c, 175L, C1182a.f5664c);
            return;
        }
        if (i2 >= 0 || this.f10143b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f10145d;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.f10143b = 2;
        m3057B(v, 0, 225L, C1182a.f5665d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: w */
    public boolean mo186w(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
