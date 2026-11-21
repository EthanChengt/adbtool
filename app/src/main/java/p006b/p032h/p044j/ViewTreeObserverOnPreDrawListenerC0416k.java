package p006b.p032h.p044j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* JADX INFO: renamed from: b.h.j.k */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0416k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public final View f2715b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserver f2716c;

    /* JADX INFO: renamed from: d */
    public final Runnable f2717d;

    public ViewTreeObserverOnPreDrawListenerC0416k(View view, Runnable runnable) {
        this.f2715b = view;
        this.f2716c = view.getViewTreeObserver();
        this.f2717d = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0416k m1556a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        ViewTreeObserverOnPreDrawListenerC0416k viewTreeObserverOnPreDrawListenerC0416k = new ViewTreeObserverOnPreDrawListenerC0416k(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0416k);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0416k);
        return viewTreeObserverOnPreDrawListenerC0416k;
    }

    /* JADX INFO: renamed from: b */
    public void m1557b() {
        (this.f2716c.isAlive() ? this.f2716c : this.f2715b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2715b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m1557b();
        this.f2717d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2716c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1557b();
    }
}
