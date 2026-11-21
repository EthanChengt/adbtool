package p080c.p126d.p127a.p128a.p143m;

import android.view.View;

/* JADX INFO: renamed from: c.d.a.a.m.l */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1236l implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1246v f5913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1231g f5914c;

    public ViewOnClickListenerC1236l(C1231g c1231g, C1246v c1246v) {
        this.f5914c = c1231g;
        this.f5913b = c1246v;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM471i1 = this.f5914c.m2857G0().m471i1() + 1;
        if (iM471i1 < this.f5914c.f5894d0.getAdapter().mo533a()) {
            this.f5914c.m2859I0(this.f5913b.m2878i(iM471i1));
        }
    }
}
