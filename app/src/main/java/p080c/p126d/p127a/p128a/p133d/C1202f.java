package p080c.p126d.p127a.p128a.p133d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: c.d.a.a.d.f */
/* JADX INFO: loaded from: classes.dex */
public class C1202f<V extends View> extends CoordinatorLayout.AbstractC0068c<V> {

    /* JADX INFO: renamed from: a */
    public C1203g f5705a;

    /* JADX INFO: renamed from: b */
    public int f5706b;

    public C1202f() {
        this.f5706b = 0;
    }

    public C1202f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5706b = 0;
    }

    /* JADX INFO: renamed from: B */
    public int m2779B() {
        C1203g c1203g = this.f5705a;
        if (c1203g != null) {
            return c1203g.f5710d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public void mo2777C(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m154s(v, i);
    }

    /* JADX INFO: renamed from: D */
    public boolean m2780D(int i) {
        C1203g c1203g = this.f5705a;
        if (c1203g == null) {
            this.f5706b = i;
            return false;
        }
        if (c1203g.f5710d == i) {
            return false;
        }
        c1203g.f5710d = i;
        c1203g.m2781a();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: k */
    public boolean mo174k(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo2777C(coordinatorLayout, v, i);
        if (this.f5705a == null) {
            this.f5705a = new C1203g(v);
        }
        C1203g c1203g = this.f5705a;
        c1203g.f5708b = c1203g.f5707a.getTop();
        c1203g.f5709c = c1203g.f5707a.getLeft();
        this.f5705a.m2781a();
        int i2 = this.f5706b;
        if (i2 == 0) {
            return true;
        }
        C1203g c1203g2 = this.f5705a;
        if (c1203g2.f5710d != i2) {
            c1203g2.f5710d = i2;
            c1203g2.m2781a();
        }
        this.f5706b = 0;
        return true;
    }
}
