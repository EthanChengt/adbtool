package c.c.a.v3.i0;

import android.view.View;
import com.didjdk.adbhelper.R;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.v3.i0.u */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1026u implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1027v f5086b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h f5087c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ r f5088d;

    public ViewOnClickListenerC1026u(r c1023r, C1027v c1027v, h c1153h) {
        this.f5088d = c1023r;
        this.f5086b = c1027v;
        this.f5087c = c1153h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q3 runnableC0964q3 = this.f5088d.f5062j0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5088d.f4967W);
        sb.append("shell pm clear ");
        sb.append(this.f5086b.f5091c);
        sb.append(" 2>&1;echo $?");
        a.m2193g(sb, this.f5088d.f5065m0, runnableC0964q3);
        r c1023r = this.f5088d;
        c1023r.m2658N0(c1023r.m337y(R.string.fi));
        this.f5087c.f5539a.dismiss();
    }
}
