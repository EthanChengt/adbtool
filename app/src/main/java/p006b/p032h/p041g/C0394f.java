package p006b.p032h.p041g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: b.h.g.f */
/* JADX INFO: loaded from: classes.dex */
public class C0394f {

    /* JADX INFO: renamed from: b */
    public HandlerThread f2654b;

    /* JADX INFO: renamed from: c */
    public Handler f2655c;

    /* JADX INFO: renamed from: a */
    public final Object f2653a = new Object();

    /* JADX INFO: renamed from: e */
    public Handler.Callback f2657e = new a();

    /* JADX INFO: renamed from: d */
    public int f2656d = 0;

    /* JADX INFO: renamed from: b.h.g.f$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0394f c0394f = C0394f.this;
                synchronized (c0394f.f2653a) {
                    if (!c0394f.f2655c.hasMessages(1)) {
                        c0394f.f2654b.quit();
                        c0394f.f2654b = null;
                        c0394f.f2655c = null;
                    }
                }
                return true;
            }
            if (i != 1) {
                return true;
            }
            C0394f c0394f2 = C0394f.this;
            Runnable runnable = (Runnable) message.obj;
            Objects.requireNonNull(c0394f2);
            runnable.run();
            synchronized (c0394f2.f2653a) {
                c0394f2.f2655c.removeMessages(0);
                Handler handler = c0394f2.f2655c;
                handler.sendMessageDelayed(handler.obtainMessage(0), 10000);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b.h.g.f$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicReference f2659b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Callable f2660c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ReentrantLock f2661d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f2662e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Condition f2663f;

        public b(C0394f c0394f, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f2659b = atomicReference;
            this.f2660c = callable;
            this.f2661d = reentrantLock;
            this.f2662e = atomicBoolean;
            this.f2663f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2659b.set(this.f2660c.call());
            } catch (Exception unused) {
            }
            this.f2661d.lock();
            try {
                this.f2662e.set(false);
                this.f2663f.signal();
            } finally {
                this.f2661d.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: b.h.g.f$c */
    public interface c<T> {
        /* JADX INFO: renamed from: a */
        void mo1522a(T t);
    }

    public C0394f(String str, int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public final void m1526a(Runnable runnable) {
        synchronized (this.f2653a) {
            if (this.f2654b == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.f2654b = handlerThread;
                handlerThread.start();
                this.f2655c = new Handler(this.f2654b.getLooper(), this.f2657e);
                this.f2656d++;
            }
            this.f2655c.removeMessages(0);
            Handler handler = this.f2655c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* JADX INFO: renamed from: b */
    public <T> T m1527b(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m1526a(new b(this, atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t = (T) atomicReference.get();
                reentrantLock.unlock();
                return t;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t2 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t2;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
