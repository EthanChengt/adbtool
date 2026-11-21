package p080c.p084b.p085a.p088m.p091u;

import java.util.Objects;

/* JADX INFO: renamed from: c.b.a.m.u.b */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0672b implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0670a f3996b;

    public RunnableC0672b(C0670a c0670a) {
        this.f3996b = c0670a;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0670a c0670a = this.f3996b;
        Objects.requireNonNull(c0670a);
        while (true) {
            try {
                c0670a.m2312b((C0670a.b) c0670a.f3988c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
