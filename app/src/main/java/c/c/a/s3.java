package c.c.a;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.s3 */
/* JADX INFO: loaded from: classes.dex */
public class s3 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t3 b;

    public s3(t3 c0979t3) {
        this.b = c0979t3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.b.e = new ServerSocket(5008);
            t3 c0979t3 = this.b;
            Objects.requireNonNull(c0979t3);
            new Thread(new r3(c0979t3)).start();
            Socket socketAccept = this.b.e.accept();
            this.b.f = socketAccept.getInputStream();
            this.b.g = socketAccept.getOutputStream();
            final t3 c0979t4 = this.b;
            Objects.requireNonNull(c0979t4);
            new Thread(new r2(c0979t4)).start();
            while (true) {
                t3 c0979t5 = this.b;
                if (c0979t5.n) {
                    return;
                } else {
                    t3.a(c0979t5);
                }
            }
        } catch (Exception e) {
            this.b.d();
            t3 c0979t6 = this.b;
            StringBuilder sbM2191e = a.m2191e("\nWRITE ERROR: ");
            sbM2191e.append(e.toString());
            sbM2191e.append("\n");
            c0979t6.f(sbM2191e.toString());
            C0939l3.m2624a(this.b.h);
            e.printStackTrace();
        }
    }
}
