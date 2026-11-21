package p006b.p056m.p057b;

import android.animation.Animator;
import android.view.animation.Animation;

/* JADX INFO: renamed from: b.m.b.i */
/* JADX INFO: loaded from: classes.dex */
public class C0467i {

    /* JADX INFO: renamed from: a */
    public final Animation f3051a;

    /* JADX INFO: renamed from: b */
    public final Animator f3052b;

    public C0467i(Animator animator) {
        this.f3051a = null;
        this.f3052b = animator;
    }

    public C0467i(Animation animation) {
        this.f3051a = animation;
        this.f3052b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}
