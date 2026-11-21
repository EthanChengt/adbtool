package p006b.p025e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: b.e.h */
/* JADX INFO: loaded from: classes.dex */
public class C0320h<K, V> {

    /* JADX INFO: renamed from: e */
    public static Object[] f2191e;

    /* JADX INFO: renamed from: f */
    public static int f2192f;

    /* JADX INFO: renamed from: g */
    public static Object[] f2193g;

    /* JADX INFO: renamed from: h */
    public static int f2194h;

    /* JADX INFO: renamed from: b */
    public int[] f2195b;

    /* JADX INFO: renamed from: c */
    public Object[] f2196c;

    /* JADX INFO: renamed from: d */
    public int f2197d;

    public C0320h() {
        this.f2195b = C0316d.f2161a;
        this.f2196c = C0316d.f2163c;
        this.f2197d = 0;
    }

    public C0320h(int i) {
        if (i == 0) {
            this.f2195b = C0316d.f2161a;
            this.f2196c = C0316d.f2163c;
        } else {
            m1266a(i);
        }
        this.f2197d = 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m1265c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0320h.class) {
                if (f2194h < 10) {
                    objArr[0] = f2193g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2193g = objArr;
                    f2194h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0320h.class) {
                if (f2192f < 10) {
                    objArr[0] = f2191e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2191e = objArr;
                    f2192f++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1266a(int i) {
        if (i == 8) {
            synchronized (C0320h.class) {
                Object[] objArr = f2193g;
                if (objArr != null) {
                    this.f2196c = objArr;
                    f2193g = (Object[]) objArr[0];
                    this.f2195b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2194h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0320h.class) {
                Object[] objArr2 = f2191e;
                if (objArr2 != null) {
                    this.f2196c = objArr2;
                    f2191e = (Object[]) objArr2[0];
                    this.f2195b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2192f--;
                    return;
                }
            }
        }
        this.f2195b = new int[i];
        this.f2196c = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    public void m1267b(int i) {
        int i2 = this.f2197d;
        int[] iArr = this.f2195b;
        if (iArr.length < i) {
            Object[] objArr = this.f2196c;
            m1266a(i);
            if (this.f2197d > 0) {
                System.arraycopy(iArr, 0, this.f2195b, 0, i2);
                System.arraycopy(objArr, 0, this.f2196c, 0, i2 << 1);
            }
            m1265c(iArr, objArr, i2);
        }
        if (this.f2197d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f2197d;
        if (i > 0) {
            int[] iArr = this.f2195b;
            Object[] objArr = this.f2196c;
            this.f2195b = C0316d.f2161a;
            this.f2196c = C0316d.f2163c;
            this.f2197d = 0;
            m1265c(iArr, objArr, i);
        }
        if (this.f2197d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m1269e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m1271g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public int m1268d(Object obj, int i) {
        int i2 = this.f2197d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM1243a = C0316d.m1243a(this.f2195b, i2, i);
            if (iM1243a < 0 || obj.equals(this.f2196c[iM1243a << 1])) {
                return iM1243a;
            }
            int i3 = iM1243a + 1;
            while (i3 < i2 && this.f2195b[i3] == i) {
                if (obj.equals(this.f2196c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM1243a - 1; i4 >= 0 && this.f2195b[i4] == i; i4--) {
                if (obj.equals(this.f2196c[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m1269e(Object obj) {
        return obj == null ? m1270f() : m1268d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0320h) {
            C0320h c0320h = (C0320h) obj;
            if (this.f2197d != c0320h.f2197d) {
                return false;
            }
            for (int i = 0; i < this.f2197d; i++) {
                try {
                    K kM1272h = m1272h(i);
                    V vM1276l = m1276l(i);
                    Object obj2 = c0320h.get(kM1272h);
                    if (vM1276l == null) {
                        if (obj2 != null || !c0320h.containsKey(kM1272h)) {
                            return false;
                        }
                    } else if (!vM1276l.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f2197d != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2197d; i2++) {
                try {
                    K kM1272h2 = m1272h(i2);
                    V vM1276l2 = m1276l(i2);
                    Object obj3 = map.get(kM1272h2);
                    if (vM1276l2 == null) {
                        if (obj3 != null || !map.containsKey(kM1272h2)) {
                            return false;
                        }
                    } else if (!vM1276l2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m1270f() {
        int i = this.f2197d;
        if (i == 0) {
            return -1;
        }
        try {
            int iM1243a = C0316d.m1243a(this.f2195b, i, 0);
            if (iM1243a < 0 || this.f2196c[iM1243a << 1] == null) {
                return iM1243a;
            }
            int i2 = iM1243a + 1;
            while (i2 < i && this.f2195b[i2] == 0) {
                if (this.f2196c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM1243a - 1; i3 >= 0 && this.f2195b[i3] == 0; i3--) {
                if (this.f2196c[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public int m1271g(Object obj) {
        int i = this.f2197d * 2;
        Object[] objArr = this.f2196c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iM1269e = m1269e(obj);
        return iM1269e >= 0 ? (V) this.f2196c[(iM1269e << 1) + 1] : v;
    }

    /* JADX INFO: renamed from: h */
    public K m1272h(int i) {
        return (K) this.f2196c[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f2195b;
        Object[] objArr = this.f2196c;
        int i = this.f2197d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public void mo1273i(C0320h<? extends K, ? extends V> c0320h) {
        int i = c0320h.f2197d;
        m1267b(this.f2197d + i);
        if (this.f2197d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0320h.m1272h(i2), c0320h.m1276l(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c0320h.f2195b, 0, this.f2195b, 0, i);
            System.arraycopy(c0320h.f2196c, 0, this.f2196c, 0, i << 1);
            this.f2197d = i;
        }
    }

    public boolean isEmpty() {
        return this.f2197d <= 0;
    }

    /* JADX INFO: renamed from: j */
    public V mo1274j(int i) {
        Object[] objArr = this.f2196c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f2197d;
        int i4 = 0;
        if (i3 <= 1) {
            m1265c(this.f2195b, objArr, i3);
            this.f2195b = C0316d.f2161a;
            this.f2196c = C0316d.f2163c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2195b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f2196c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f2196c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m1266a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f2197d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2195b, 0, i);
                    System.arraycopy(objArr, 0, this.f2196c, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f2195b, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f2196c, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f2197d) {
            throw new ConcurrentModificationException();
        }
        this.f2197d = i4;
        return v;
    }

    /* JADX INFO: renamed from: k */
    public V mo1275k(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f2196c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* JADX INFO: renamed from: l */
    public V m1276l(int i) {
        return (V) this.f2196c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int iM1268d;
        int i2 = this.f2197d;
        if (k == null) {
            iM1268d = m1270f();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iM1268d = m1268d(k, iHashCode);
        }
        if (iM1268d >= 0) {
            int i3 = (iM1268d << 1) + 1;
            Object[] objArr = this.f2196c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = iM1268d ^ (-1);
        int[] iArr = this.f2195b;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f2196c;
            m1266a(i5);
            if (i2 != this.f2197d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2195b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2196c, 0, objArr2.length);
            }
            m1265c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f2195b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f2196c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f2197d - i4) << 1);
        }
        int i7 = this.f2197d;
        if (i2 == i7) {
            int[] iArr4 = this.f2195b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f2196c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f2197d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int iM1269e = m1269e(obj);
        if (iM1269e >= 0) {
            return mo1274j(iM1269e);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iM1269e = m1269e(obj);
        if (iM1269e < 0) {
            return false;
        }
        V vM1276l = m1276l(iM1269e);
        if (obj2 != vM1276l && (obj2 == null || !obj2.equals(vM1276l))) {
            return false;
        }
        mo1274j(iM1269e);
        return true;
    }

    public V replace(K k, V v) {
        int iM1269e = m1269e(k);
        if (iM1269e >= 0) {
            return mo1275k(iM1269e, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int iM1269e = m1269e(k);
        if (iM1269e < 0) {
            return false;
        }
        V vM1276l = m1276l(iM1269e);
        if (vM1276l != v && (v == null || !v.equals(vM1276l))) {
            return false;
        }
        mo1275k(iM1269e, v2);
        return true;
    }

    public int size() {
        return this.f2197d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2197d * 28);
        sb.append('{');
        for (int i = 0; i < this.f2197d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kM1272h = m1272h(i);
            if (kM1272h != this) {
                sb.append(kM1272h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM1276l = m1276l(i);
            if (vM1276l != this) {
                sb.append(vM1276l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
