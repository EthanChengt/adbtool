package c.c.a.v3.i0;

import android.view.View;
import com.didjdk.adbhelper.R;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.v3.i0.t */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1025t implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h f5083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1027v f5084c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ r f5085d;

    public ViewOnClickListenerC1025t(r c1023r, h c1153h, C1027v c1027v) {
        this.f5085d = c1023r;
        this.f5083b = c1153h;
        this.f5084c = c1027v;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        try {
            i = Integer.parseInt(this.f5085d.m2646G0().f6469y);
        } catch (Exception unused) {
            i = 21;
        }
        q3 runnableC0964q3 = this.f5085d.f5062j0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5085d.f4967W);
        sb.append("shell pm uninstall ");
        sb.append(this.f5083b.f5542d.isChecked() ? "-k " : "");
        sb.append(i >= 21 ? "--user 0 " : "");
        sb.append(this.f5084c.f5091c);
        sb.append(" 2>&1;echo $?");
        a.m2193g(sb, this.f5085d.f5069q0, runnableC0964q3);
        r c1023r = this.f5085d;
        c1023r.m2658N0(c1023r.m337y(R.string.fi));
        this.f5083b.f5539a.dismiss();
    }
}
