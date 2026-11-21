package p080c.p126d.p127a.p128a.p129a0;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: c.d.a.a.a0.b */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnLayoutChangeListenerC1163b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f5559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TabLayout.C1374i f5560b;

    public ViewOnLayoutChangeListenerC1163b(TabLayout.C1374i c1374i, View view) {
        this.f5560b = c1374i;
        this.f5559a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f5559a.getVisibility() == 0) {
            TabLayout.C1374i c1374i = this.f5560b;
            View view2 = this.f5559a;
            int i9 = TabLayout.C1374i.f10404m;
            c1374i.m3164f(view2);
        }
    }
}
