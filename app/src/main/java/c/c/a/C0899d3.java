package c.c.a;

import android.os.Looper;

/* JADX INFO: renamed from: c.c.a.d3 */
/* JADX INFO: loaded from: classes.dex */
public class C0899d3 extends Thread {
    public C0899d3(C0904e3 c0904e3) {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        Looper.loop();
    }
}
