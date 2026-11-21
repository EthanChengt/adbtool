package p006b.p056m.p057b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p006b.p032h.p044j.ViewTreeObserverOnPreDrawListenerC0416k;

/* JADX INFO: renamed from: b.m.b.j */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0469j extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: b */
    public final ViewGroup f3065b;

    /* JADX INFO: renamed from: c */
    public final View f3066c;

    /* JADX INFO: renamed from: d */
    public boolean f3067d;

    /* JADX INFO: renamed from: e */
    public boolean f3068e;

    /* JADX INFO: renamed from: f */
    public boolean f3069f;

    public RunnableC0469j(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3069f = true;
        this.f3065b = viewGroup;
        this.f3066c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.f3069f = true;
        if (this.f3067d) {
            return !this.f3068e;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f3067d = true;
            ViewTreeObserverOnPreDrawListenerC0416k.m1556a(this.f3065b, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f) {
        this.f3069f = true;
        if (this.f3067d) {
            return !this.f3068e;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f3067d = true;
            ViewTreeObserverOnPreDrawListenerC0416k.m1556a(this.f3065b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3067d || !this.f3069f) {
            this.f3065b.endViewTransition(this.f3066c);
            this.f3068e = true;
        } else {
            this.f3069f = false;
            this.f3065b.post(this);
        }
    }
}
