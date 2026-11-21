package c.c.a;

import com.didjdk.adbhelper.ConnectActivity;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.a3 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0884a3 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4757b;

    /* JADX INFO: renamed from: c.c.a.a3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.m1952H(RunnableC0884a3.this.f4757b, "连接认证失败");
        }
    }

    public RunnableC0884a3(ConnectActivity connectActivity) {
        this.f4757b = connectActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ConnectActivity connectActivity = this.f4757b;
        if (connectActivity.f6371y != 1) {
            connectActivity.runOnUiThread(new a());
            this.f4757b.f6370x.sendEmptyMessage(2);
        }
    }
}
