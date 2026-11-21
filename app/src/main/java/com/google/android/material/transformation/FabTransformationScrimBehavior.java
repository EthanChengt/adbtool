package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p131c.C1189h;

/* JADX INFO: loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final C1189h f10508c;

    /* JADX INFO: renamed from: d */
    public final C1189h f10509d;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C1388a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f10510a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f10511b;

        public C1388a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f10510a = z;
            this.f10511b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10510a) {
                return;
            }
            this.f10511b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10510a) {
                this.f10511b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f10508c = new C1189h(75L, 150L);
        this.f10509d = new C1189h(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10508c = new C1189h(75L, 150L);
        this.f10509d = new C1189h(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: A */
    public boolean mo163A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: D */
    public AnimatorSet mo3195D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        m3208E(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        C1161a.m2734s(animatorSet, arrayList);
        animatorSet.addListener(new C1388a(this, z, view2));
        return animatorSet;
    }

    /* JADX INFO: renamed from: E */
    public final void m3208E(View view, boolean z, boolean z2, List list) {
        ObjectAnimator objectAnimatorOfFloat;
        C1189h c1189h = z ? this.f10508c : this.f10509d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c1189h.m2768a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: d */
    public boolean mo167d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
