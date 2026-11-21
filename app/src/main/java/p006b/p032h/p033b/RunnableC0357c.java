package p006b.p032h.p033b;

import android.app.Application;

/* JADX INFO: renamed from: b.h.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0357c implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Application f2542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0359e.a f2543c;

    public RunnableC0357c(Application application, C0359e.a aVar) {
        this.f2542b = application;
        this.f2543c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2542b.unregisterActivityLifecycleCallbacks(this.f2543c);
    }
}
