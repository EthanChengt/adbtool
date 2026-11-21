package p080c.p084b.p085a.p088m.p091u;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p080c.p084b.p085a.p088m.InterfaceC0645m;

/* JADX INFO: renamed from: c.b.a.m.u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0670a {

    /* JADX INFO: renamed from: a */
    public final boolean f3986a;

    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC0645m, b> f3987b;

    /* JADX INFO: renamed from: c */
    public final ReferenceQueue<C0713q<?>> f3988c;

    /* JADX INFO: renamed from: d */
    public C0713q.a f3989d;

    /* JADX INFO: renamed from: c.b.a.m.u.a$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: c.b.a.m.u.a$a$a, reason: collision with other inner class name */
        public class RunnableC1394a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Runnable f3990b;

            public RunnableC1394a(a aVar, Runnable runnable) {
                this.f3990b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f3990b.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC1394a(this, runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.a$b */
    public static final class b extends WeakReference<C0713q<?>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0645m f3991a;

        /* JADX INFO: renamed from: b */
        public final boolean f3992b;

        /* JADX INFO: renamed from: c */
        public InterfaceC0719w<?> f3993c;

        public b(InterfaceC0645m interfaceC0645m, C0713q<?> c0713q, ReferenceQueue<? super C0713q<?>> referenceQueue, boolean z) {
            InterfaceC0719w<?> interfaceC0719w;
            super(c0713q, referenceQueue);
            Objects.requireNonNull(interfaceC0645m, "Argument must not be null");
            this.f3991a = interfaceC0645m;
            if (c0713q.f4239b && z) {
                interfaceC0719w = c0713q.f4241d;
                Objects.requireNonNull(interfaceC0719w, "Argument must not be null");
            } else {
                interfaceC0719w = null;
            }
            this.f3993c = interfaceC0719w;
            this.f3992b = c0713q.f4239b;
        }
    }

    public C0670a(boolean z) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        this.f3987b = new HashMap();
        this.f3988c = new ReferenceQueue<>();
        this.f3986a = z;
        executorServiceNewSingleThreadExecutor.execute(new RunnableC0672b(this));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2311a(InterfaceC0645m interfaceC0645m, C0713q<?> c0713q) {
        b bVarPut = this.f3987b.put(interfaceC0645m, new b(interfaceC0645m, c0713q, this.f3988c, this.f3986a));
        if (bVarPut != null) {
            bVarPut.f3993c = null;
            bVarPut.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2312b(b bVar) {
        InterfaceC0719w<?> interfaceC0719w;
        synchronized (this) {
            this.f3987b.remove(bVar.f3991a);
            if (bVar.f3992b && (interfaceC0719w = bVar.f3993c) != null) {
                this.f3989d.mo2393a(bVar.f3991a, new C0713q<>(interfaceC0719w, true, false, bVar.f3991a, this.f3989d));
            }
        }
    }
}
