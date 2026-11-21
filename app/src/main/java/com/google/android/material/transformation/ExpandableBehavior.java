package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.p146p.InterfaceC1253a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0068c<View> {

    /* JADX INFO: renamed from: a */
    public int f10490a;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC1384a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f10491b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10492c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC1253a f10493d;

        public ViewTreeObserverOnPreDrawListenerC1384a(View view, int i, InterfaceC1253a interfaceC1253a) {
            this.f10491b = view;
            this.f10492c = i;
            this.f10493d = interfaceC1253a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f10491b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f10490a == this.f10492c) {
                InterfaceC1253a interfaceC1253a = this.f10493d;
                expandableBehavior.mo3194C((View) interfaceC1253a, this.f10491b, interfaceC1253a.mo2880a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f10490a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10490a = 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m3193B(boolean z) {
        if (!z) {
            return this.f10490a == 1;
        }
        int i = this.f10490a;
        return i == 0 || i == 2;
    }

    /* JADX INFO: renamed from: C */
    public abstract boolean mo3194C(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: g */
    public boolean mo170g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC1253a interfaceC1253a = (InterfaceC1253a) view2;
        if (!m3193B(interfaceC1253a.mo2880a())) {
            return false;
        }
        this.f10490a = interfaceC1253a.mo2880a() ? 1 : 2;
        return mo3194C((View) interfaceC1253a, view, interfaceC1253a.mo2880a(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: k */
    public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC1253a interfaceC1253a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (!view.isLaidOut()) {
            List<View> listM146e = coordinatorLayout.m146e(view);
            int size = listM146e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    interfaceC1253a = null;
                    break;
                }
                View view2 = listM146e.get(i2);
                if (mo167d(coordinatorLayout, view, view2)) {
                    interfaceC1253a = (InterfaceC1253a) view2;
                    break;
                }
                i2++;
            }
            if (interfaceC1253a != null && m3193B(interfaceC1253a.mo2880a())) {
                int i3 = interfaceC1253a.mo2880a() ? 1 : 2;
                this.f10490a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1384a(view, i3, interfaceC1253a));
            }
        }
        return false;
    }
}
