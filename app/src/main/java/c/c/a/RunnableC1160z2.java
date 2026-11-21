package c.c.a;

import com.didjdk.adbhelper.ConnectActivity;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.z2 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1160z2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f5558b;

    public RunnableC1160z2(ConnectActivity connectActivity) {
        this.f5558b = connectActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        q3 runnableC0964q3 = this.f5558b.f6351I;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5558b.f6369w);
        sb.append(this.f5558b.f6365s);
        a.m2193g(sb, ConnectActivity.f6340W, runnableC0964q3);
    }
}
