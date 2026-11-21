package p006b.p056m.p057b;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import p006b.p032h.p040f.C0388a;

/* JADX INFO: renamed from: b.m.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0463g implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f3020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f3021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0466h0.a f3022c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0388a f3023d;

    /* JADX INFO: renamed from: b.m.b.g$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnimationAnimationListenerC0463g.this.f3021b.m305i() != null) {
                AnimationAnimationListenerC0463g.this.f3021b.m328t0(null);
                AnimationAnimationListenerC0463g animationAnimationListenerC0463g = AnimationAnimationListenerC0463g.this;
                ((AbstractC0483r.b) animationAnimationListenerC0463g.f3022c).m1863a(animationAnimationListenerC0463g.f3021b, animationAnimationListenerC0463g.f3023d);
            }
        }
    }

    public AnimationAnimationListenerC0463g(ViewGroup viewGroup, Fragment fragment, C0466h0.a aVar, C0388a c0388a) {
        this.f3020a = viewGroup;
        this.f3021b = fragment;
        this.f3022c = aVar;
        this.f3023d = c0388a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f3020a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
