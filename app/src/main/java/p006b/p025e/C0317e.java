package p006b.p025e;

/* JADX INFO: renamed from: b.e.e */
/* JADX INFO: loaded from: classes.dex */
public class C0317e<E> implements Cloneable {

    /* JADX INFO: renamed from: f */
    public static final Object f2164f = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f2165b = false;

    /* JADX INFO: renamed from: c */
    public long[] f2166c;

    /* JADX INFO: renamed from: d */
    public Object[] f2167d;

    /* JADX INFO: renamed from: e */
    public int f2168e;

    public C0317e() {
        int iM1248f = C0316d.m1248f(10);
        this.f2166c = new long[iM1248f];
        this.f2167d = new Object[iM1248f];
    }

    /* JADX INFO: renamed from: a */
    public void m1249a(long j, E e) {
        int i = this.f2168e;
        if (i != 0 && j <= this.f2166c[i - 1]) {
            m1255g(j, e);
            return;
        }
        if (this.f2165b && i >= this.f2166c.length) {
            m1252d();
        }
        int i2 = this.f2168e;
        if (i2 >= this.f2166c.length) {
            int iM1248f = C0316d.m1248f(i2 + 1);
            long[] jArr = new long[iM1248f];
            Object[] objArr = new Object[iM1248f];
            long[] jArr2 = this.f2166c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2167d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2166c = jArr;
            this.f2167d = objArr;
        }
        this.f2166c[i2] = j;
        this.f2167d[i2] = e;
        this.f2168e = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m1250b() {
        int i = this.f2168e;
        Object[] objArr = this.f2167d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2168e = 0;
        this.f2165b = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0317e<E> clone() {
        try {
            C0317e<E> c0317e = (C0317e) super.clone();
            c0317e.f2166c = (long[]) this.f2166c.clone();
            c0317e.f2167d = (Object[]) this.f2167d.clone();
            return c0317e;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1252d() {
        int i = this.f2168e;
        long[] jArr = this.f2166c;
        Object[] objArr = this.f2167d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2164f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2165b = false;
        this.f2168e = i2;
    }

    /* JADX INFO: renamed from: e */
    public E m1253e(long j) {
        return m1254f(j, null);
    }

    /* JADX INFO: renamed from: f */
    public E m1254f(long j, E e) {
        int iM1244b = C0316d.m1244b(this.f2166c, this.f2168e, j);
        if (iM1244b >= 0) {
            Object[] objArr = this.f2167d;
            if (objArr[iM1244b] != f2164f) {
                return (E) objArr[iM1244b];
            }
        }
        return e;
    }

    /* JADX INFO: renamed from: g */
    public void m1255g(long j, E e) {
        int iM1244b = C0316d.m1244b(this.f2166c, this.f2168e, j);
        if (iM1244b >= 0) {
            this.f2167d[iM1244b] = e;
            return;
        }
        int iM1244b2 = iM1244b ^ (-1);
        int i = this.f2168e;
        if (iM1244b2 < i) {
            Object[] objArr = this.f2167d;
            if (objArr[iM1244b2] == f2164f) {
                this.f2166c[iM1244b2] = j;
                objArr[iM1244b2] = e;
                return;
            }
        }
        if (this.f2165b && i >= this.f2166c.length) {
            m1252d();
            iM1244b2 = C0316d.m1244b(this.f2166c, this.f2168e, j) ^ (-1);
        }
        int i2 = this.f2168e;
        if (i2 >= this.f2166c.length) {
            int iM1248f = C0316d.m1248f(i2 + 1);
            long[] jArr = new long[iM1248f];
            Object[] objArr2 = new Object[iM1248f];
            long[] jArr2 = this.f2166c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2167d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2166c = jArr;
            this.f2167d = objArr2;
        }
        int i3 = this.f2168e;
        if (i3 - iM1244b2 != 0) {
            long[] jArr3 = this.f2166c;
            int i4 = iM1244b2 + 1;
            System.arraycopy(jArr3, iM1244b2, jArr3, i4, i3 - iM1244b2);
            Object[] objArr4 = this.f2167d;
            System.arraycopy(objArr4, iM1244b2, objArr4, i4, this.f2168e - iM1244b2);
        }
        this.f2166c[iM1244b2] = j;
        this.f2167d[iM1244b2] = e;
        this.f2168e++;
    }

    /* JADX INFO: renamed from: h */
    public int m1256h() {
        if (this.f2165b) {
            m1252d();
        }
        return this.f2168e;
    }

    /* JADX INFO: renamed from: i */
    public E m1257i(int i) {
        if (this.f2165b) {
            m1252d();
        }
        return (E) this.f2167d[i];
    }

    public String toString() {
        if (m1256h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2168e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2168e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f2165b) {
                m1252d();
            }
            sb.append(this.f2166c[i]);
            sb.append('=');
            E eM1257i = m1257i(i);
            if (eM1257i != this) {
                sb.append(eM1257i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
