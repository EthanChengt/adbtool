package c.c.a.v3.k0;

import android.content.Intent;
import com.didjdk.adbhelper.FilePickerActivity;
import com.didjdk.adbhelper.R;
import b.s.m;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.y3.c;
import c.c.a.y3.g;

/* JADX INFO: renamed from: c.c.a.v3.k0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1052r implements c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1054t f5190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g f5191b;

    public C1052r(C1054t c1054t, g c1152g) {
        this.f5190a = c1054t;
        this.f5191b = c1152g;
    }

    @Override // c.c.a.y3.c.a
    /* JADX INFO: renamed from: a */
    public void mo2640a(int i) {
        if (i == 0 || i == 1) {
            m.m1950F(this.f5190a, i, null);
        } else if (i == 2) {
            Intent intent = new Intent(this.f5190a.m303h(), (Class<?>) FilePickerActivity.class);
            intent.putExtra("picker_mode", 0);
            this.f5190a.m273F0(intent, 2);
        } else if (i == 3) {
            C1054t c1054t = this.f5190a;
            StringBuilder sb = new StringBuilder();
            for (String str : c1054t.f5199D0) {
                if (c1054t.f5200E0 == 0) {
                    sb.append("cp -r ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(c1054t.f5211d0);
                    sb.append(";echo $?");
                    sb.append(c1054t.f5214g0);
                    sb.append(";");
                }
                if (c1054t.f5200E0 == 1) {
                    sb.append("mv -f ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(c1054t.f5211d0);
                    sb.append(";echo $?");
                    sb.append(c1054t.f5214g0);
                    sb.append(";");
                }
            }
            q3 runnableC0964q3 = c1054t.f5220m0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb.toString());
            sb2.append("echo $?");
            a.m2193g(sb2, c1054t.f5215h0, runnableC0964q3);
            c1054t.f5197B0 = c1054t.f5199D0.size();
            m.m1951G(c1054t, c1054t.m337y(R.string.f2) + c1054t.f5197B0 + c1054t.m337y(R.string.cu));
            c1054t.f5199D0.clear();
        }
        this.f5191b.f5532b.dismiss();
    }
}
