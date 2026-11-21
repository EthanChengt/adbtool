package c.c.a;

import android.os.Handler;
import com.didjdk.adbhelper.RemoteActivity;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Objects;
import c.c.a.p122w3.p123j.C1129a;

/* JADX INFO: renamed from: c.c.a.o3 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0954o3 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RemoteActivity f4868b;

    public RunnableC0954o3(RemoteActivity remoteActivity) {
        this.f4868b = remoteActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(500L);
            this.f4868b.f10054H = new Socket("127.0.0.1", 5005).getInputStream();
            this.f4868b.f10054H.read(new byte[1]);
            this.f4868b.f10055I = new Socket("127.0.0.1", 5005).getOutputStream();
            RemoteActivity remoteActivity = this.f4868b;
            remoteActivity.f10056J = new C1129a(remoteActivity.f10055I);
            RemoteActivity remoteActivity2 = this.f4868b;
            if (remoteActivity2.f10075x) {
                C1129a c1129a = remoteActivity2.f10056J;
                Objects.requireNonNull(c1129a);
                c1129a.m2685a(new byte[]{10, (byte) 0});
            }
            RemoteActivity remoteActivity3 = this.f4868b;
            remoteActivity3.f10064R.setMessageSender(remoteActivity3.f10056J);
            this.f4868b.f10054H.read(new byte[64]);
            byte[] bArr = new byte[4];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f4868b.f10054H.read(bArr);
            this.f4868b.f10052F = byteBufferWrap.getShort();
            this.f4868b.f10053G = byteBufferWrap.getShort();
            this.f4868b.runOnUiThread(new Runnable() { // from class: c.c.a.e1
                @Override // java.lang.Runnable
                public final void run() {
                    final RunnableC0954o3 runnableC0954o3 = this.f4783b;
                    runnableC0954o3.f4868b.f10065S.setText(runnableC0954o3.f4868b.f10052F + "X" + runnableC0954o3.f4868b.f10053G);
                    new Handler().postDelayed(new Runnable() { // from class: c.c.a.f1
                        @Override // java.lang.Runnable
                        public final void run() {
                            runnableC0954o3.f4868b.f10065S.setVisibility(8);
                        }
                    }, 2000L);
                    runnableC0954o3.f4868b.f10066T.setVisibility(8);
                }
            });
            RemoteActivity remoteActivity4 = this.f4868b;
            if (remoteActivity4.f10048B < 21) {
                remoteActivity4.m3035z(remoteActivity4.f10052F, remoteActivity4.f10053G, remoteActivity4.f10063Q);
                Objects.requireNonNull(this.f4868b);
                RemoteActivity remoteActivity5 = this.f4868b;
                remoteActivity5.f10062P.m2683c(remoteActivity5.f10054H);
                return;
            }
            remoteActivity4.m3035z(remoteActivity4.f10052F, remoteActivity4.f10053G, remoteActivity4.f10063Q);
            RemoteActivity remoteActivity6 = this.f4868b;
            remoteActivity6.f10062P.m2682b(remoteActivity6.f10052F, remoteActivity6.f10053G);
            RemoteActivity remoteActivity7 = this.f4868b;
            remoteActivity7.f10062P.m2684d(remoteActivity7.f10054H);
        } catch (IOException | InterruptedException e) {
            this.f4868b.runOnUiThread(new Runnable() { // from class: c.c.a.g1
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC0954o3 runnableC0954o3 = this.f4799b;
                    Exception exc = e;
                    runnableC0954o3.f4868b.f10065S.setVisibility(0);
                    runnableC0954o3.f4868b.f10065S.setText(exc.getMessage());
                }
            });
        }
    }
}
