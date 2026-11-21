package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p006b.p049j.p051b.C0447e;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0068c<V> {

    /* JADX INFO: renamed from: a */
    public C0447e f10147a;

    /* JADX INFO: renamed from: b */
    public boolean f10148b;

    /* JADX INFO: renamed from: c */
    public int f10149c = 2;

    /* JADX INFO: renamed from: d */
    public float f10150d = 0.5f;

    /* JADX INFO: renamed from: e */
    public float f10151e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f10152f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final C0447e.c f10153g = new C1338a();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C1338a extends C0447e.c {

        /* JADX INFO: renamed from: a */
        public int f10154a;

        /* JADX INFO: renamed from: b */
        public int f10155b = -1;

        public C1338a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: a */
        public int mo249a(View view, int i, int i2) {
            int width;
            int width2;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            boolean z = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.f10149c;
            if (i3 == 0) {
                if (z) {
                    width = this.f10154a - view.getWidth();
                    width2 = this.f10154a;
                } else {
                    width = this.f10154a;
                    width2 = view.getWidth() + width;
                }
            } else if (i3 != 1) {
                width = this.f10154a - view.getWidth();
                width2 = view.getWidth() + this.f10154a;
            } else if (z) {
                width = this.f10154a;
                width2 = view.getWidth() + width;
            } else {
                width = this.f10154a - view.getWidth();
                width2 = this.f10154a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: b */
        public int mo250b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: c */
        public int mo251c(View view) {
            return view.getWidth();
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: h */
        public void mo255h(View view, int i) {
            this.f10155b = i;
            this.f10154a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: i */
        public void mo256i(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: j */
        public void mo257j(View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f10151e) + this.f10154a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f10152f) + this.f10154a;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m3058C(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x002e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0030  */
        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: k */
        public void mo258k(View view, float f, float f2) {
            boolean z;
            int i;
            this.f10155b = -1;
            int width = view.getWidth();
            boolean z2 = false;
            if (f != 0.0f) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                boolean z3 = view.getLayoutDirection() == 1;
                int i2 = SwipeDismissBehavior.this.f10149c;
                if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z3 ? f < 0.0f : f > 0.0f) : !z3 ? f > 0.0f : f < 0.0f)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f10154a) >= Math.round(view.getWidth() * SwipeDismissBehavior.this.f10150d)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                int left = view.getLeft();
                int i3 = this.f10154a;
                i = left < i3 ? i3 - width : i3 + width;
                z2 = true;
            } else {
                i = this.f10154a;
            }
            if (SwipeDismissBehavior.this.f10147a.m1669v(i, view.getTop())) {
                RunnableC1339b runnableC1339b = new RunnableC1339b(view, z2);
                WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                view.postOnAnimation(runnableC1339b);
            } else if (z2) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: l */
        public boolean mo259l(View view, int i) {
            int i2 = this.f10155b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo3059B(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class RunnableC1339b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final View f10157b;

        /* JADX INFO: renamed from: c */
        public final boolean f10158c;

        public RunnableC1339b(View view, boolean z) {
            this.f10157b = view;
            this.f10158c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0447e c0447e = SwipeDismissBehavior.this.f10147a;
            if (c0447e == null || !c0447e.m1657i(true)) {
                if (this.f10158c) {
                    Objects.requireNonNull(SwipeDismissBehavior.this);
                }
            } else {
                View view = this.f10157b;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                view.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static float m3058C(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: A */
    public boolean mo163A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0447e c0447e = this.f10147a;
        if (c0447e == null) {
            return false;
        }
        c0447e.m1663p(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: B */
    public boolean mo3059B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: j */
    public boolean mo173j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zM152q = this.f10148b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM152q = coordinatorLayout.m152q(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f10148b = zM152q;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10148b = false;
        }
        if (!zM152q) {
            return false;
        }
        if (this.f10147a == null) {
            this.f10147a = new C0447e(coordinatorLayout.getContext(), coordinatorLayout, this.f10153g);
        }
        return this.f10147a.m1670w(motionEvent);
    }
}
