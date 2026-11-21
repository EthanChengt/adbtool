package p080c.p084b.p085a.p111s;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.b.a.s.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0870e {

    /* JADX INFO: renamed from: a */
    public static final Executor f4729a = new a();

    /* JADX INFO: renamed from: b */
    public static final Executor f4730b = new b();

    /* JADX INFO: renamed from: c.b.a.s.e$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0875j.m2614f().post(runnable);
        }
    }

    /* JADX INFO: renamed from: c.b.a.s.e$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
