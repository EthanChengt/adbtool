package p080c.p084b.p085a.p088m.p091u.p094e0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c.b.a.m.u.e0.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC0701a implements ExecutorService {

    /* JADX INFO: renamed from: b */
    public static final long f4082b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c */
    public static volatile int f4083c;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f4084a;

    /* JADX INFO: renamed from: c.b.a.m.u.e0.a$a */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final String f4085a;

        /* JADX INFO: renamed from: b */
        public final boolean f4086b;

        /* JADX INFO: renamed from: c */
        public int f4087c;

        /* JADX INFO: renamed from: c.b.a.m.u.e0.a$a$a, reason: collision with other inner class name */
        public class C1395a extends Thread {
            public C1395a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (a.this.f4086b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(a.this);
                    ((b.a) b.f4090b).m2366a(th);
                }
            }
        }

        public a(String str, b bVar, boolean z) {
            this.f4085a = str;
            this.f4086b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C1395a c1395a;
            c1395a = new C1395a(runnable, "glide-" + this.f4085a + "-thread-" + this.f4087c);
            this.f4087c = this.f4087c + 1;
            return c1395a;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.e0.a$b */
    public interface b {

        /* JADX INFO: renamed from: a */
        public static final b f4089a = new a();

        /* JADX INFO: renamed from: b */
        public static final b f4090b = f4089a;

        /* JADX INFO: renamed from: c.b.a.m.u.e0.a$b$a */
        public class a implements b {
            /* JADX INFO: renamed from: a */
            public void m2366a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

    }

    public ExecutorServiceC0701a(ExecutorService executorService) {
        this.f4084a = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static int m2365a() {
        if (f4083c == 0) {
            f4083c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f4083c;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f4084a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4084a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f4084a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f4084a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f4084a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.f4084a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f4084a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f4084a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f4084a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f4084a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f4084a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f4084a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f4084a.submit(callable);
    }

    public String toString() {
        return this.f4084a.toString();
    }
}
