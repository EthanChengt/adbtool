package p080c.p126d.p127a.p128a.p143m;

import android.view.View;

/* JADX INFO: renamed from: c.d.a.a.m.m */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1237m implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1246v f5915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1231g f5916c;

    public ViewOnClickListenerC1237m(C1231g c1231g, C1246v c1246v) {
        this.f5916c = c1231g;
        this.f5915b = c1246v;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM475k1 = this.f5916c.m2857G0().m475k1() - 1;
        if (iM475k1 >= 0) {
            this.f5916c.m2859I0(this.f5915b.m2878i(iM475k1));
        }
    }
}
