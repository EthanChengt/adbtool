package c.c.a.v3.k0;

import android.view.View;
import android.widget.Button;
import com.didjdk.adbhelper.R;
import p006b.p056m.p057b.ActivityC0459e;
import b.s.m;
import c.c.a.y3.c;
import c.c.a.y3.g;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.v3.k0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1053s implements c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1054t f5192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1056v f5193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g f5194c;

    public C1053s(C1054t c1054t, C1056v c1056v, g c1152g) {
        this.f5192a = c1054t;
        this.f5193b = c1056v;
        this.f5194c = c1152g;
    }

    @Override // c.c.a.y3.c.a
    /* JADX INFO: renamed from: a */
    public void mo2640a(int i) {
        ActivityC0459e activityC0459eM303h;
        ActivityC0459e activityC0459eM303h2;
        int i2;
        if (i == 0) {
            final h c1153h = new h(this.f5192a.m303h());
            c1153h.m2714e(this.f5192a.m303h().getString(R.string.h_));
            c1153h.m2711b(this.f5192a.m303h().getString(R.string.aq));
            c1153h.m2712c(this.f5192a.m303h().getString(R.string.eg));
            Button button = c1153h.f5543e;
            final C1054t c1054t = this.f5192a;
            button.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1054t c1054t2 = c1054t;
                    h c1153h2 = c1153h;
                    if (c1054t2.f5196A0 <= 5 || m.J(c1054t2.m303h())) {
                        StringBuilder sb = new StringBuilder();
                        c1054t2.f5197B0 = 0;
                        for (C1056v c1056v : c1054t2.f5205X) {
                            if (c1056v.f5263r) {
                                c1054t2.f5197B0++;
                                sb.append("rm -rf ");
                                sb.append(c1056v.f5257l);
                                sb.append(";echo $?");
                                sb.append(c1054t2.f5214g0);
                                sb.append(";");
                            }
                        }
                        c1054t2.f5220m0.m2627c(sb.toString() + "echo $?" + c1054t2.f5215h0);
                        m.m1951G(c1054t2, c1054t2.m337y(R.string.bk) + c1054t2.f5197B0 + c1054t2.m337y(R.string.cu));
                        c1054t2.m2673P0(false);
                    } else {
                        m.m1952H(c1054t2.m303h(), "未解锁高级功能最多选择5项");
                    }
                    c1153h2.f5539a.dismiss();
                }
            });
            c1153h.f5539a.show();
        } else if (i == 1) {
            C1054t c1054t2 = this.f5192a;
            if (c1054t2.f5196A0 > 1) {
                activityC0459eM303h = c1054t2.m303h();
                activityC0459eM303h2 = this.f5192a.m303h();
                i2 = R.string.eh;
                m.m1952H(activityC0459eM303h, activityC0459eM303h2.getString(i2));
            } else {
                m.m1950F(c1054t2, 2, this.f5193b.f5254i);
            }
        } else if (i == 2) {
            C1054t c1054t3 = this.f5192a;
            if (c1054t3.f5196A0 > 1) {
                activityC0459eM303h = c1054t3.m303h();
                activityC0459eM303h2 = this.f5192a.m303h();
                i2 = R.string.ei;
                m.m1952H(activityC0459eM303h, activityC0459eM303h2.getString(i2));
            } else {
                m.m1949E(c1054t3, this.f5193b);
            }
        }
        this.f5194c.f5532b.dismiss();
    }
}
