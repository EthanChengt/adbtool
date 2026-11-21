package p080c.p084b.p085a.p111s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.b.a.s.g */
/* JADX INFO: loaded from: classes.dex */
public class C0872g<T, Y> {

    /* JADX INFO: renamed from: a */
    public final Map<T, a<Y>> f4733a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public long f4734b;

    /* JADX INFO: renamed from: c */
    public long f4735c;

    /* JADX INFO: renamed from: c.b.a.s.g$a */
    public static final class a<Y> {

        /* JADX INFO: renamed from: a */
        public final Y f4736a;

        /* JADX INFO: renamed from: b */
        public final int f4737b;

        public a(Y y, int i) {
            this.f4736a = y;
            this.f4737b = i;
        }
    }

    public C0872g(long j) {
        this.f4734b = j;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Y m2604a(T t) {
        a<Y> aVar;
        aVar = this.f4733a.get(t);
        return aVar != null ? aVar.f4736a : null;
    }

    /* JADX INFO: renamed from: b */
    public int mo2359b(Y y) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo2360c(T t, Y y) {
    }

    /* JADX INFO: renamed from: d */
    public synchronized Y m2605d(T t, Y y) {
        int iMo2359b = mo2359b(y);
        long j = iMo2359b;
        if (j >= this.f4734b) {
            mo2360c(t, y);
            return null;
        }
        if (y != null) {
            this.f4735c += j;
        }
        a<Y> aVarPut = this.f4733a.put(t, y == null ? null : new a<>(y, iMo2359b));
        if (aVarPut != null) {
            this.f4735c -= (long) aVarPut.f4737b;
            if (!aVarPut.f4736a.equals(y)) {
                mo2360c(t, aVarPut.f4736a);
            }
        }
        m2606e(this.f4734b);
        return aVarPut != null ? aVarPut.f4736a : null;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m2606e(long j) {
        while (this.f4735c > j) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f4733a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f4735c -= (long) value.f4737b;
            T key = next.getKey();
            it.remove();
            mo2360c(key, value.f4736a);
        }
    }
}
