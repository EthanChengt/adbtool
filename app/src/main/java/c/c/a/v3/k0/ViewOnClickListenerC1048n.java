package c.c.a.v3.k0;

import android.content.Intent;
import android.view.View;
import com.didjdk.adbhelper.FilePickerActivity;
import com.didjdk.adbhelper.R;
import b.s.m;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.y3.c;
import c.c.a.y3.g;
import c.c.a.y3.k;

/* JADX INFO: renamed from: c.c.a.v3.k0.n */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1048n implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1051q.b f5175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1051q f5176c;

    public ViewOnClickListenerC1048n(C1051q c1051q, C1051q.b bVar) {
        this.f5176c = c1051q;
        this.f5175b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM509e = this.f5175b.m509e();
        final C1054t c1054t = C1054t.this;
        final C1056v c1056v = c1054t.f5205X.get(iM509e);
        if (c1054t.f5230w0) {
            c1054t.m2669L0(c1056v);
            c1054t.f5208a0.f947a.m543c(iM509e, 1, null);
            return;
        }
        int i = c1056v.f5247b;
        if (i == 0 || i == 1) {
            c1054t.f5211d0 = c1054t.f5205X.get(iM509e).f5257l;
            c1054t.m2672O0();
        } else {
            if (i != 2) {
                return;
            }
            final g c1152g = new g(c1054t.m303h());
            c1152g.m2708f(c1056v.f5254i);
            c1152g.m2704b(c1054t.m337y(R.string.ej));
            c1152g.m2704b(c1054t.m337y(R.string.bs));
            c1152g.m2704b(c1054t.m337y(R.string.bm));
            c1152g.m2707e(new c.a() { // from class: c.c.a.v3.k0.b
                @Override // c.c.a.y3.c.a
                /* JADX INFO: renamed from: a */
                public final void mo2640a(int i2) {
                    C1054t c1054t2 = c1054t;
                    C1056v c1056v2 = c1056v;
                    g c1152g2 = c1152g;
                    if (i2 == 0) {
                        q3 runnableC0964q3 = c1054t2.f5219l0;
                        StringBuilder sb = new StringBuilder();
                        sb.append(c1054t2.f4967W);
                        sb.append("pull ");
                        sb.append(c1056v2.f5257l);
                        sb.append(" ");
                        sb.append(c1054t2.f5202G0);
                        sb.append(C1056v.m2676a(c1056v2.f5254i));
                        sb.append(";echo $?");
                        a.m2193g(sb, c1054t2.f5216i0, runnableC0964q3);
                        c1054t2.f5203H0 = c1056v2;
                        k c1156k = new k(c1054t2.m303h());
                        c1054t2.f5204I0 = c1156k;
                        String string = c1054t2.m303h().getString(R.string.cc);
                        c1156k.f5554b.setVisibility(0);
                        c1156k.f5554b.setText(string);
                        c1054t2.f5204I0.f5553a.show();
                    } else if (i2 == 1) {
                        c1056v2.f5263r = true;
                        Intent intent = new Intent(c1054t2.m303h(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra("picker_mode", 1);
                        c1054t2.m273F0(intent, 2);
                    } else if (i2 == 2) {
                        m.m1949E(c1054t2, c1056v2);
                    }
                    c1152g2.f5532b.dismiss();
                }
            });
            c1152g.m2709g();
        }
    }
}
