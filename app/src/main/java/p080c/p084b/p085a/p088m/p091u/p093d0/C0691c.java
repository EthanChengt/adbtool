package p080c.p084b.p085a.p088m.p091u.p093d0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: c.b.a.m.u.d0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0691c {

    /* JADX INFO: renamed from: a */
    public final Map<String, a> f4051a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final b f4052b = new b();

    /* JADX INFO: renamed from: c.b.a.m.u.d0.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Lock f4053a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        public int f4054b;
    }

    /* JADX INFO: renamed from: c.b.a.m.u.d0.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Queue<a> f4055a = new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public void m2357a(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.f4051a.get(str);
            Objects.requireNonNull(aVar2, "Argument must not be null");
            aVar = aVar2;
            int i = aVar.f4054b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f4054b);
            }
            int i2 = i - 1;
            aVar.f4054b = i2;
            if (i2 == 0) {
                a aVarRemove = this.f4051a.remove(str);
                if (!aVarRemove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                }
                b bVar = this.f4052b;
                synchronized (bVar.f4055a) {
                    if (bVar.f4055a.size() < 10) {
                        bVar.f4055a.offer(aVarRemove);
                    }
                }
            }
        }
        aVar.f4053a.unlock();
    }
}
