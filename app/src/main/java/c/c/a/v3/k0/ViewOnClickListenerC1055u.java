package c.c.a.v3.k0;

import android.view.View;
import com.didjdk.adbhelper.R;
import b.s.m;
import c.c.a.y3.g;

/* JADX INFO: renamed from: c.c.a.v3.k0.u */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1055u implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1054t f5245b;

    public ViewOnClickListenerC1055u(C1054t c1054t) {
        this.f5245b = c1054t;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1054t c1054t = this.f5245b;
        if (c1054t.f5196A0 < 1) {
            m.m1952H(c1054t.m303h(), this.f5245b.m337y(R.string.ec));
            return;
        }
        int i = 0;
        while (!c1054t.f5205X.get(i).f5263r) {
            i++;
        }
        C1056v c1056v = c1054t.f5205X.get(i);
        g c1152g = new g(c1054t.m303h());
        c1152g.m2704b(c1054t.m303h().getString(R.string.bj));
        c1152g.m2704b(c1054t.m303h().getString(R.string.fw));
        c1152g.m2704b(c1054t.m303h().getString(R.string.bl));
        c1152g.m2707e(new C1053s(c1054t, c1056v, c1152g));
        c1152g.m2709g();
    }
}
