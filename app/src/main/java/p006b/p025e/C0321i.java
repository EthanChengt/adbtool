package p006b.p025e;

/* JADX INFO: renamed from: b.e.i */
/* JADX INFO: loaded from: classes.dex */
public class C0321i<E> implements Cloneable {

    /* JADX INFO: renamed from: f */
    public static final Object f2198f = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f2199b;

    /* JADX INFO: renamed from: c */
    public int[] f2200c;

    /* JADX INFO: renamed from: d */
    public Object[] f2201d;

    /* JADX INFO: renamed from: e */
    public int f2202e;

    public C0321i() {
        this(10);
    }

    public C0321i(int i) {
        this.f2199b = false;
        if (i == 0) {
            this.f2200c = C0316d.f2161a;
            this.f2201d = C0316d.f2163c;
        } else {
            int iM1247e = C0316d.m1247e(i);
            this.f2200c = new int[iM1247e];
            this.f2201d = new Object[iM1247e];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1277a(int i, E e) {
        int i2 = this.f2202e;
        if (i2 != 0 && i <= this.f2200c[i2 - 1]) {
            m1283g(i, e);
            return;
        }
        if (this.f2199b && i2 >= this.f2200c.length) {
            m1279c();
        }
        int i3 = this.f2202e;
        if (i3 >= this.f2200c.length) {
            int iM1247e = C0316d.m1247e(i3 + 1);
            int[] iArr = new int[iM1247e];
            Object[] objArr = new Object[iM1247e];
            int[] iArr2 = this.f2200c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2201d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2200c = iArr;
            this.f2201d = objArr;
        }
        this.f2200c[i3] = i;
        this.f2201d[i3] = e;
        this.f2202e = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0321i<E> clone() {
        try {
            C0321i<E> c0321i = (C0321i) super.clone();
            c0321i.f2200c = (int[]) this.f2200c.clone();
            c0321i.f2201d = (Object[]) this.f2201d.clone();
            return c0321i;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1279c() {
        int i = this.f2202e;
        int[] iArr = this.f2200c;
        Object[] objArr = this.f2201d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2198f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2199b = false;
        this.f2202e = i2;
    }

    /* JADX INFO: renamed from: d */
    public E m1280d(int i) {
        return m1281e(i, null);
    }

    /* JADX INFO: renamed from: e */
    public E m1281e(int i, E e) {
        int iM1243a = C0316d.m1243a(this.f2200c, this.f2202e, i);
        if (iM1243a >= 0) {
            Object[] objArr = this.f2201d;
            if (objArr[iM1243a] != f2198f) {
                return (E) objArr[iM1243a];
            }
        }
        return e;
    }

    /* JADX INFO: renamed from: f */
    public int m1282f(int i) {
        if (this.f2199b) {
            m1279c();
        }
        return this.f2200c[i];
    }

    /* JADX INFO: renamed from: g */
    public void m1283g(int i, E e) {
        int iM1243a = C0316d.m1243a(this.f2200c, this.f2202e, i);
        if (iM1243a >= 0) {
            this.f2201d[iM1243a] = e;
            return;
        }
        int iM1243a2 = iM1243a ^ (-1);
        int i2 = this.f2202e;
        if (iM1243a2 < i2) {
            Object[] objArr = this.f2201d;
            if (objArr[iM1243a2] == f2198f) {
                this.f2200c[iM1243a2] = i;
                objArr[iM1243a2] = e;
                return;
            }
        }
        if (this.f2199b && i2 >= this.f2200c.length) {
            m1279c();
            iM1243a2 = C0316d.m1243a(this.f2200c, this.f2202e, i) ^ (-1);
        }
        int i3 = this.f2202e;
        if (i3 >= this.f2200c.length) {
            int iM1247e = C0316d.m1247e(i3 + 1);
            int[] iArr = new int[iM1247e];
            Object[] objArr2 = new Object[iM1247e];
            int[] iArr2 = this.f2200c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2201d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2200c = iArr;
            this.f2201d = objArr2;
        }
        int i4 = this.f2202e;
        if (i4 - iM1243a2 != 0) {
            int[] iArr3 = this.f2200c;
            int i5 = iM1243a2 + 1;
            System.arraycopy(iArr3, iM1243a2, iArr3, i5, i4 - iM1243a2);
            Object[] objArr4 = this.f2201d;
            System.arraycopy(objArr4, iM1243a2, objArr4, i5, this.f2202e - iM1243a2);
        }
        this.f2200c[iM1243a2] = i;
        this.f2201d[iM1243a2] = e;
        this.f2202e++;
    }

    /* JADX INFO: renamed from: h */
    public void m1284h(int i) {
        int iM1243a = C0316d.m1243a(this.f2200c, this.f2202e, i);
        if (iM1243a >= 0) {
            Object[] objArr = this.f2201d;
            Object obj = objArr[iM1243a];
            Object obj2 = f2198f;
            if (obj != obj2) {
                objArr[iM1243a] = obj2;
                this.f2199b = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public int m1285i() {
        if (this.f2199b) {
            m1279c();
        }
        return this.f2202e;
    }

    /* JADX INFO: renamed from: j */
    public E m1286j(int i) {
        if (this.f2199b) {
            m1279c();
        }
        return (E) this.f2201d[i];
    }

    public String toString() {
        if (m1285i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2202e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2202e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m1282f(i));
            sb.append('=');
            E eM1286j = m1286j(i);
            if (eM1286j != this) {
                sb.append(eM1286j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
