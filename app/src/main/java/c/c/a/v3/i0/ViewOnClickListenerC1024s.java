package c.c.a.v3.i0;

import android.view.View;
import com.didjdk.adbhelper.R;
import c.a.a.a.a;
import c.c.a.q3;

/* JADX INFO: renamed from: c.c.a.v3.i0.s */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1024s implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1027v f5081b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r f5082c;

    public ViewOnClickListenerC1024s(r c1023r, C1027v c1027v) {
        this.f5082c = c1023r;
        this.f5081b = c1027v;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q3 runnableC0964q3 = this.f5082c.f5062j0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5082c.f4967W);
        sb.append("shell pm ");
        sb.append(this.f5081b.f5094f ? "disable-user " : "enable ");
        sb.append(this.f5081b.f5091c);
        sb.append(" 2>&1;echo $?");
        a.m2193g(sb, this.f5081b.f5094f ? this.f5082c.f5066n0 : this.f5082c.f5067o0, runnableC0964q3);
        this.f5082c.f5057e0.f5539a.dismiss();
        r c1023r = this.f5082c;
        c1023r.m2658N0(c1023r.m337y(R.string.fi));
    }
}
