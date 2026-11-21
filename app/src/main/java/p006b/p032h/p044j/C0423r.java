package p006b.p032h.p044j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import p006b.p008b.p009c.C0207w;

/* JADX INFO: renamed from: b.h.j.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0423r {

    /* JADX INFO: renamed from: a */
    public WeakReference<View> f2732a;

    /* JADX INFO: renamed from: b */
    public int f2733b = -1;

    /* JADX INFO: renamed from: b.h.j.r$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0424s f2734a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2735b;

        public a(C0423r c0423r, InterfaceC0424s interfaceC0424s, View view) {
            this.f2734a = interfaceC0424s;
            this.f2735b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2734a.mo1000c(this.f2735b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2734a.mo849a(this.f2735b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2734a.mo857b(this.f2735b);
        }
    }

    /* JADX INFO: renamed from: b.h.j.r$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0426u f2736a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2737b;

        public b(C0423r c0423r, InterfaceC0426u interfaceC0426u, View view) {
            this.f2736a = interfaceC0426u;
            this.f2737b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) C0207w.this.f1375d.getParent()).invalidate();
        }
    }

    public C0423r(View view) {
        this.f2732a = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: a */
    public C0423r m1591a(float f) {
        View view = this.f2732a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m1592b() {
        View view = this.f2732a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public C0423r m1593c(long j) {
        View view = this.f2732a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0423r m1594d(InterfaceC0424s interfaceC0424s) {
        View view = this.f2732a.get();
        if (view != null) {
            m1595e(view, interfaceC0424s);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m1595e(View view, InterfaceC0424s interfaceC0424s) {
        if (interfaceC0424s != null) {
            view.animate().setListener(new a(this, interfaceC0424s, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public C0423r m1596f(InterfaceC0426u interfaceC0426u) {
        View view = this.f2732a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC0426u != null ? new b(this, interfaceC0426u, view) : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0423r m1597g(float f) {
        View view = this.f2732a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
