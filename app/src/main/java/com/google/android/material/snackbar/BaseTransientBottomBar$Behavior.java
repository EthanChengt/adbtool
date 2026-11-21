package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import p080c.p126d.p127a.p128a.p155y.C1304a;
import p080c.p126d.p127a.p128a.p155y.C1307d;
import p080c.p126d.p127a.p128a.p155y.C1308e;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final C1304a f10327h = new C1304a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: B */
    public boolean mo3059B(View view) {
        Objects.requireNonNull(this.f10327h);
        return view instanceof C1307d;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: j */
    public boolean mo173j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.f10327h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C1308e.f6319c == null) {
                    C1308e.f6319c = new C1308e();
                }
                synchronized (C1308e.f6319c.f6320a) {
                }
            }
        } else if (coordinatorLayout.m152q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C1308e.f6319c == null) {
                C1308e.f6319c = new C1308e();
            }
            synchronized (C1308e.f6319c.f6320a) {
            }
        }
        return super.mo173j(coordinatorLayout, view, motionEvent);
    }
}
