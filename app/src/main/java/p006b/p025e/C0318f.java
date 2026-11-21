package p006b.p025e;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: b.e.f */
/* JADX INFO: loaded from: classes.dex */
public class C0318f<K, V> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<K, V> f2169a;

    /* JADX INFO: renamed from: b */
    public int f2170b;

    /* JADX INFO: renamed from: c */
    public int f2171c;

    /* JADX INFO: renamed from: d */
    public int f2172d;

    /* JADX INFO: renamed from: e */
    public int f2173e;

    /* JADX INFO: renamed from: f */
    public int f2174f;

    /* JADX INFO: renamed from: g */
    public int f2175g;

    public C0318f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2171c = i;
        this.f2169a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: a */
    public final V m1258a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f2169a.get(k);
            if (v != null) {
                this.f2174f++;
                return v;
            }
            this.f2175g++;
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final V m1259b(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2172d++;
            this.f2170b++;
            vPut = this.f2169a.put(k, v);
            if (vPut != null) {
                this.f2170b--;
            }
        }
        m1260c(this.f2171c);
        return vPut;
    }

    /* JADX INFO: renamed from: c */
    public void m1260c(int i) {
        while (true) {
            synchronized (this) {
                if (this.f2170b < 0 || (this.f2169a.isEmpty() && this.f2170b != 0)) {
                    break;
                }
                if (this.f2170b > i && !this.f2169a.isEmpty()) {
                    Map.Entry<K, V> next = this.f2169a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.f2169a.remove(key);
                    this.f2170b--;
                    this.f2173e++;
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f2174f;
        i2 = this.f2175g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2171c), Integer.valueOf(this.f2174f), Integer.valueOf(this.f2175g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
