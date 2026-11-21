package p006b.p019c.p020a.p021a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: b.c.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0300b extends AbstractC0301c {

    /* JADX INFO: renamed from: a */
    public final Object f2100a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f2101b = Executors.newFixedThreadPool(4, new a(this));

    /* JADX INFO: renamed from: b.c.a.a.b$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f2102a = new AtomicInteger(0);

        public a(C0300b c0300b) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f2102a.getAndIncrement())));
            return thread;
        }
    }

    @Override // p006b.p019c.p020a.p021a.AbstractC0301c
    /* JADX INFO: renamed from: a */
    public boolean mo1184a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
