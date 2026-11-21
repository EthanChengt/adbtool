package p006b.p025e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: b.e.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0319g<K, V> {

    /* JADX INFO: renamed from: a */
    public AbstractC0319g<K, V>.b f2176a;

    /* JADX INFO: renamed from: b */
    public AbstractC0319g<K, V>.c f2177b;

    /* JADX INFO: renamed from: c */
    public AbstractC0319g<K, V>.e f2178c;

    /* JADX INFO: renamed from: b.e.g$a */
    public final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public final int f2179b;

        /* JADX INFO: renamed from: c */
        public int f2180c;

        /* JADX INFO: renamed from: d */
        public int f2181d;

        /* JADX INFO: renamed from: e */
        public boolean f2182e = false;

        public a(int i) {
            this.f2179b = i;
            this.f2180c = AbstractC0319g.this.mo1231d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2181d < this.f2180c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC0319g.this.mo1229b(this.f2181d, this.f2179b);
            this.f2181d++;
            this.f2182e = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2182e) {
                throw new IllegalStateException();
            }
            int i = this.f2181d - 1;
            this.f2181d = i;
            this.f2180c--;
            this.f2182e = false;
            AbstractC0319g.this.mo1235h(i);
        }
    }

    /* JADX INFO: renamed from: b.e.g$b */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo1231d = AbstractC0319g.this.mo1231d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0319g.this.mo1234g(entry.getKey(), entry.getValue());
            }
            return iMo1231d != AbstractC0319g.this.mo1231d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0319g.this.mo1228a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo1232e = AbstractC0319g.this.mo1232e(entry.getKey());
            if (iMo1232e < 0) {
                return false;
            }
            return C0316d.m1245c(AbstractC0319g.this.mo1229b(iMo1232e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0319g.m1261j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo1231d = AbstractC0319g.this.mo1231d() - 1; iMo1231d >= 0; iMo1231d--) {
                Object objMo1229b = AbstractC0319g.this.mo1229b(iMo1231d, 0);
                Object objMo1229b2 = AbstractC0319g.this.mo1229b(iMo1231d, 1);
                iHashCode += (objMo1229b == null ? 0 : objMo1229b.hashCode()) ^ (objMo1229b2 == null ? 0 : objMo1229b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0319g.this.mo1231d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0319g.this.mo1231d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b.e.g$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0319g.this.mo1228a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0319g.this.mo1232e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> mapMo1230c = AbstractC0319g.this.mo1230c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapMo1230c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0319g.m1261j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo1231d = AbstractC0319g.this.mo1231d() - 1; iMo1231d >= 0; iMo1231d--) {
                Object objMo1229b = AbstractC0319g.this.mo1229b(iMo1231d, 0);
                iHashCode += objMo1229b == null ? 0 : objMo1229b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0319g.this.mo1231d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo1232e = AbstractC0319g.this.mo1232e(obj);
            if (iMo1232e < 0) {
                return false;
            }
            AbstractC0319g.this.mo1235h(iMo1232e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> mapMo1230c = AbstractC0319g.this.mo1230c();
            int size = mapMo1230c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapMo1230c.remove(it.next());
            }
            return size != mapMo1230c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0319g.m1262k(AbstractC0319g.this.mo1230c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0319g.this.mo1231d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0319g.this.m1263l(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0319g.this.m1264m(tArr, 0);
        }
    }

    /* JADX INFO: renamed from: b.e.g$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: b */
        public int f2186b;

        /* JADX INFO: renamed from: d */
        public boolean f2188d = false;

        /* JADX INFO: renamed from: c */
        public int f2187c = -1;

        public d() {
            this.f2186b = AbstractC0319g.this.mo1231d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f2188d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0316d.m1245c(entry.getKey(), AbstractC0319g.this.mo1229b(this.f2187c, 0)) && C0316d.m1245c(entry.getValue(), AbstractC0319g.this.mo1229b(this.f2187c, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f2188d) {
                return (K) AbstractC0319g.this.mo1229b(this.f2187c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f2188d) {
                return (V) AbstractC0319g.this.mo1229b(this.f2187c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2187c < this.f2186b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f2188d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objMo1229b = AbstractC0319g.this.mo1229b(this.f2187c, 0);
            Object objMo1229b2 = AbstractC0319g.this.mo1229b(this.f2187c, 1);
            return (objMo1229b == null ? 0 : objMo1229b.hashCode()) ^ (objMo1229b2 != null ? objMo1229b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f2187c++;
            this.f2188d = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2188d) {
                throw new IllegalStateException();
            }
            AbstractC0319g.this.mo1235h(this.f2187c);
            this.f2187c--;
            this.f2186b--;
            this.f2188d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f2188d) {
                return (V) AbstractC0319g.this.mo1236i(this.f2187c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: b.e.g$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0319g.this.mo1228a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0319g.this.mo1233f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0319g.this.mo1231d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo1233f = AbstractC0319g.this.mo1233f(obj);
            if (iMo1233f < 0) {
                return false;
            }
            AbstractC0319g.this.mo1235h(iMo1233f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo1231d = AbstractC0319g.this.mo1231d();
            int i = 0;
            boolean z = false;
            while (i < iMo1231d) {
                if (collection.contains(AbstractC0319g.this.mo1229b(i, 1))) {
                    AbstractC0319g.this.mo1235h(i);
                    i--;
                    iMo1231d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo1231d = AbstractC0319g.this.mo1231d();
            int i = 0;
            boolean z = false;
            while (i < iMo1231d) {
                if (!collection.contains(AbstractC0319g.this.mo1229b(i, 1))) {
                    AbstractC0319g.this.mo1235h(i);
                    i--;
                    iMo1231d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0319g.this.mo1231d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0319g.this.m1263l(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0319g.this.m1264m(tArr, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static <T> boolean m1261j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static <K, V> boolean m1262k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1228a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo1229b(int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract Map<K, V> mo1230c();

    /* JADX INFO: renamed from: d */
    public abstract int mo1231d();

    /* JADX INFO: renamed from: e */
    public abstract int mo1232e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo1233f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo1234g(K k, V v);

    /* JADX INFO: renamed from: h */
    public abstract void mo1235h(int i);

    /* JADX INFO: renamed from: i */
    public abstract V mo1236i(int i, V v);

    /* JADX INFO: renamed from: l */
    public Object[] m1263l(int i) {
        int iMo1231d = mo1231d();
        Object[] objArr = new Object[iMo1231d];
        for (int i2 = 0; i2 < iMo1231d; i2++) {
            objArr[i2] = mo1229b(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: m */
    public <T> T[] m1264m(T[] tArr, int i) {
        int iMo1231d = mo1231d();
        if (tArr.length < iMo1231d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo1231d));
        }
        for (int i2 = 0; i2 < iMo1231d; i2++) {
            tArr[i2] = mo1229b(i2, i);
        }
        if (tArr.length > iMo1231d) {
            tArr[iMo1231d] = null;
        }
        return tArr;
    }
}
