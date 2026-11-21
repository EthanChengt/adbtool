package p006b.p019c.p020a.p022b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.c.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0303b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b */
    public c<K, V> f2104b;

    /* JADX INFO: renamed from: c */
    public c<K, V> f2105c;

    /* JADX INFO: renamed from: d */
    public WeakHashMap<f<K, V>, Boolean> f2106d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e */
    public int f2107e = 0;

    /* JADX INFO: renamed from: b.c.a.b.b$a */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p006b.p019c.p020a.p022b.C0303b.e
        /* JADX INFO: renamed from: b */
        public c<K, V> mo1190b(c<K, V> cVar) {
            return cVar.f2111e;
        }

        @Override // p006b.p019c.p020a.p022b.C0303b.e
        /* JADX INFO: renamed from: c */
        public c<K, V> mo1191c(c<K, V> cVar) {
            return cVar.f2110d;
        }
    }

    /* JADX INFO: renamed from: b.c.a.b.b$b */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p006b.p019c.p020a.p022b.C0303b.e
        /* JADX INFO: renamed from: b */
        public c<K, V> mo1190b(c<K, V> cVar) {
            return cVar.f2110d;
        }

        @Override // p006b.p019c.p020a.p022b.C0303b.e
        /* JADX INFO: renamed from: c */
        public c<K, V> mo1191c(c<K, V> cVar) {
            return cVar.f2111e;
        }
    }

    /* JADX INFO: renamed from: b.c.a.b.b$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b */
        public final K f2108b;

        /* JADX INFO: renamed from: c */
        public final V f2109c;

        /* JADX INFO: renamed from: d */
        public c<K, V> f2110d;

        /* JADX INFO: renamed from: e */
        public c<K, V> f2111e;

        public c(K k, V v) {
            this.f2108b = k;
            this.f2109c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2108b.equals(cVar.f2108b) && this.f2109c.equals(cVar.f2109c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2108b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2109c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f2108b.hashCode() ^ this.f2109c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2108b + "=" + this.f2109c;
        }
    }

    /* JADX INFO: renamed from: b.c.a.b.b$d */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: b */
        public c<K, V> f2112b;

        /* JADX INFO: renamed from: c */
        public boolean f2113c = true;

        public d() {
        }

        @Override // p006b.p019c.p020a.p022b.C0303b.f
        /* JADX INFO: renamed from: a */
        public void mo1192a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2112b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2111e;
                this.f2112b = cVar3;
                this.f2113c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2113c) {
                return C0303b.this.f2104b != null;
            }
            c<K, V> cVar = this.f2112b;
            return (cVar == null || cVar.f2110d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f2113c) {
                this.f2113c = false;
                cVar = C0303b.this.f2104b;
            } else {
                c<K, V> cVar2 = this.f2112b;
                cVar = cVar2 != null ? cVar2.f2110d : null;
            }
            this.f2112b = cVar;
            return cVar;
        }
    }

    /* JADX INFO: renamed from: b.c.a.b.b$e */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: b */
        public c<K, V> f2115b;

        /* JADX INFO: renamed from: c */
        public c<K, V> f2116c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2115b = cVar2;
            this.f2116c = cVar;
        }

        @Override // p006b.p019c.p020a.p022b.C0303b.f
        /* JADX INFO: renamed from: a */
        public void mo1192a(c<K, V> cVar) {
            c<K, V> cVarMo1191c = null;
            if (this.f2115b == cVar && cVar == this.f2116c) {
                this.f2116c = null;
                this.f2115b = null;
            }
            c<K, V> cVar2 = this.f2115b;
            if (cVar2 == cVar) {
                this.f2115b = mo1190b(cVar2);
            }
            c<K, V> cVar3 = this.f2116c;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f2115b;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarMo1191c = mo1191c(cVar3);
                }
                this.f2116c = cVarMo1191c;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract c<K, V> mo1190b(c<K, V> cVar);

        /* JADX INFO: renamed from: c */
        public abstract c<K, V> mo1191c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2116c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f2116c;
            c<K, V> cVar2 = this.f2115b;
            this.f2116c = (cVar == cVar2 || cVar2 == null) ? null : mo1191c(cVar);
            return cVar;
        }
    }

    /* JADX INFO: renamed from: b.c.a.b.b$f */
    public interface f<K, V> {
        /* JADX INFO: renamed from: a */
        void mo1192a(c<K, V> cVar);
    }

    /* JADX INFO: renamed from: a */
    public c<K, V> mo1185a(K k) {
        c<K, V> cVar = this.f2104b;
        while (cVar != null && !cVar.f2108b.equals(k)) {
            cVar = cVar.f2110d;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: b */
    public C0303b<K, V>.d m1188b() {
        C0303b<K, V>.d dVar = new d();
        this.f2106d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* JADX INFO: renamed from: c */
    public c<K, V> m1189c(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f2107e++;
        c<K, V> cVar2 = this.f2105c;
        if (cVar2 == null) {
            this.f2104b = cVar;
        } else {
            cVar2.f2110d = cVar;
            cVar.f2111e = cVar2;
        }
        this.f2105c = cVar;
        return cVar;
    }

    /* JADX INFO: renamed from: d */
    public V mo1186d(K k, V v) {
        c<K, V> cVarMo1185a = mo1185a(k);
        if (cVarMo1185a != null) {
            return cVarMo1185a.f2109c;
        }
        m1189c(k, v);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public V mo1187e(K k) {
        c<K, V> cVarMo1185a = mo1185a(k);
        if (cVarMo1185a == null) {
            return null;
        }
        this.f2107e--;
        if (!this.f2106d.isEmpty()) {
            Iterator<f<K, V>> it = this.f2106d.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo1192a(cVarMo1185a);
            }
        }
        c<K, V> cVar = cVarMo1185a.f2111e;
        c<K, V> cVar2 = cVarMo1185a.f2110d;
        if (cVar != null) {
            cVar.f2110d = cVar2;
        } else {
            this.f2104b = cVar2;
        }
        c<K, V> cVar3 = cVarMo1185a.f2110d;
        if (cVar3 != null) {
            cVar3.f2111e = cVar;
        } else {
            this.f2105c = cVar;
        }
        cVarMo1185a.f2110d = null;
        cVarMo1185a.f2111e = null;
        return cVarMo1185a.f2109c;
    }

    public boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0303b)) {
            return false;
        }
        C0303b c0303b = (C0303b) obj;
        if (this.f2107e != c0303b.f2107e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0303b.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2104b, this.f2105c);
        this.f2106d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sbM2191e.append("]");
                return sbM2191e.toString();
            }
            sbM2191e.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sbM2191e.append(", ");
            }
        }
    }
}
