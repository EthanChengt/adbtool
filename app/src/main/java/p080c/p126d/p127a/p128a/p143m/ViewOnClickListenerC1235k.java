package p080c.p126d.p127a.p128a.p143m;

import android.view.View;

/* JADX INFO: renamed from: c.d.a.a.m.k */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1235k implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1231g f5912b;

    public ViewOnClickListenerC1235k(C1231g c1231g) {
        this.f5912b = c1231g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1231g c1231g = this.f5912b;
        C1231g.e eVar = C1231g.e.DAY;
        C1231g.e eVar2 = c1231g.f5891a0;
        C1231g.e eVar3 = C1231g.e.YEAR;
        if (eVar2 == eVar3) {
            c1231g.m2860J0(eVar);
        } else if (eVar2 == eVar) {
            c1231g.m2860J0(eVar3);
        }
    }
}
