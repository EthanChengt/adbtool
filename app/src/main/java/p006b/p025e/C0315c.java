package p006b.p025e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: b.e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0315c<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: f */
    public static final int[] f2151f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final Object[] f2152g = new Object[0];

    /* JADX INFO: renamed from: h */
    public static Object[] f2153h;

    /* JADX INFO: renamed from: i */
    public static int f2154i;

    /* JADX INFO: renamed from: j */
    public static Object[] f2155j;

    /* JADX INFO: renamed from: k */
    public static int f2156k;

    /* JADX INFO: renamed from: b */
    public int[] f2157b = f2151f;

    /* JADX INFO: renamed from: c */
    public Object[] f2158c = f2152g;

    /* JADX INFO: renamed from: d */
    public int f2159d = 0;

    /* JADX INFO: renamed from: e */
    public AbstractC0319g<E, E> f2160e;

    /* JADX INFO: renamed from: b */
    public static void m1237b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0315c.class) {
                if (f2156k < 10) {
                    objArr[0] = f2155j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2155j = objArr;
                    f2156k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0315c.class) {
                if (f2154i < 10) {
                    objArr[0] = f2153h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2153h = objArr;
                    f2154i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1238a(int i) {
        if (i == 8) {
            synchronized (C0315c.class) {
                Object[] objArr = f2155j;
                if (objArr != null) {
                    this.f2158c = objArr;
                    f2155j = (Object[]) objArr[0];
                    this.f2157b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2156k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0315c.class) {
                Object[] objArr2 = f2153h;
                if (objArr2 != null) {
                    this.f2158c = objArr2;
                    f2153h = (Object[]) objArr2[0];
                    this.f2157b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2154i--;
                    return;
                }
            }
        }
        this.f2157b = new int[i];
        this.f2158c = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iM1240d;
        if (e == null) {
            iM1240d = m1241e();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iM1240d = m1240d(e, iHashCode);
        }
        if (iM1240d >= 0) {
            return false;
        }
        int i2 = iM1240d ^ (-1);
        int i3 = this.f2159d;
        int[] iArr = this.f2157b;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f2158c;
            m1238a(i4);
            int[] iArr2 = this.f2157b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2158c, 0, objArr.length);
            }
            m1237b(iArr, objArr, this.f2159d);
        }
        int i5 = this.f2159d;
        if (i2 < i5) {
            int[] iArr3 = this.f2157b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f2158c;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f2159d - i2);
        }
        this.f2157b[i2] = i;
        this.f2158c[i2] = e;
        this.f2159d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f2159d;
        int[] iArr = this.f2157b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f2158c;
            m1238a(size);
            int i = this.f2159d;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f2157b, 0, i);
                System.arraycopy(objArr, 0, this.f2158c, 0, this.f2159d);
            }
            m1237b(iArr, objArr, this.f2159d);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public int m1239c(Object obj) {
        return obj == null ? m1241e() : m1240d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f2159d;
        if (i != 0) {
            m1237b(this.f2157b, this.f2158c, i);
            this.f2157b = f2151f;
            this.f2158c = f2152g;
            this.f2159d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m1239c(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int m1240d(Object obj, int i) {
        int i2 = this.f2159d;
        if (i2 == 0) {
            return -1;
        }
        int iM1243a = C0316d.m1243a(this.f2157b, i2, i);
        if (iM1243a < 0 || obj.equals(this.f2158c[iM1243a])) {
            return iM1243a;
        }
        int i3 = iM1243a + 1;
        while (i3 < i2 && this.f2157b[i3] == i) {
            if (obj.equals(this.f2158c[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1243a - 1; i4 >= 0 && this.f2157b[i4] == i; i4--) {
            if (obj.equals(this.f2158c[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: e */
    public final int m1241e() {
        int i = this.f2159d;
        if (i == 0) {
            return -1;
        }
        int iM1243a = C0316d.m1243a(this.f2157b, i, 0);
        if (iM1243a < 0 || this.f2158c[iM1243a] == null) {
            return iM1243a;
        }
        int i2 = iM1243a + 1;
        while (i2 < i && this.f2157b[i2] == 0) {
            if (this.f2158c[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1243a - 1; i3 >= 0 && this.f2157b[i3] == 0; i3--) {
            if (this.f2158c[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f2159d != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f2159d; i++) {
                try {
                    if (!set.contains(this.f2158c[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public E m1242f(int i) {
        Object[] objArr = this.f2158c;
        E e = (E) objArr[i];
        int i2 = this.f2159d;
        if (i2 <= 1) {
            m1237b(this.f2157b, objArr, i2);
            this.f2157b = f2151f;
            this.f2158c = f2152g;
            this.f2159d = 0;
        } else {
            int[] iArr = this.f2157b;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f2159d = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f2158c;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f2159d - i);
                }
                this.f2158c[this.f2159d] = null;
            } else {
                m1238a(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f2159d--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2157b, 0, i);
                    System.arraycopy(objArr, 0, this.f2158c, 0, i);
                }
                int i5 = this.f2159d;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f2157b, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f2158c, i, this.f2159d - i);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2157b;
        int i = this.f2159d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2159d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f2160e == null) {
            this.f2160e = new C0314b(this);
        }
        AbstractC0319g<E, E> abstractC0319g = this.f2160e;
        if (abstractC0319g.f2177b == null) {
            abstractC0319g.f2177b = new AbstractC0319g.c();
        }
        return abstractC0319g.f2177b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iM1239c = m1239c(obj);
        if (iM1239c < 0) {
            return false;
        }
        m1242f(iM1239c);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f2159d - 1; i >= 0; i--) {
            if (!collection.contains(this.f2158c[i])) {
                m1242f(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2159d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f2159d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f2158c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2159d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2159d));
        }
        System.arraycopy(this.f2158c, 0, tArr, 0, this.f2159d);
        int length = tArr.length;
        int i = this.f2159d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2159d * 14);
        sb.append('{');
        for (int i = 0; i < this.f2159d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f2158c[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
