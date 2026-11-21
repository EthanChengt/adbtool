package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f10495b;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C1385a extends AnimatorListenerAdapter {
        public C1385a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f10495b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: C */
    public boolean mo3194C(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f10495b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo3195D = mo3195D(view, view2, z, z3);
        this.f10495b = animatorSetMo3195D;
        animatorSetMo3195D.addListener(new C1385a());
        this.f10495b.start();
        if (!z2) {
            this.f10495b.end();
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public abstract AnimatorSet mo3195D(View view, View view2, boolean z, boolean z2);
}
