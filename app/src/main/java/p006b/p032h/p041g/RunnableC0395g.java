package p006b.p032h.p041g;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: b.h.g.g */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0395g implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f2664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Handler f2665c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0394f.c f2666d;

    /* JADX INFO: renamed from: b.h.g.g$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f2667b;

        public a(Object obj) {
            this.f2667b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC0395g.this.f2666d.mo1522a(this.f2667b);
        }
    }

    public RunnableC0395g(C0394f c0394f, Callable callable, Handler handler, C0394f.c cVar) {
        this.f2664b = callable;
        this.f2665c = handler;
        this.f2666d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object objCall;
        try {
            objCall = this.f2664b.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f2665c.post(new a(objCall));
    }
}
