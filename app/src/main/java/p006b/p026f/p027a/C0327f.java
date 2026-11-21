package p006b.p026f.p027a;

/* JADX WARN: Unexpected interfaces in signature: [b.f.a.f<T>] */
/* JADX INFO: renamed from: b.f.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C0327f<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f2235a;

    /* JADX INFO: renamed from: b */
    public int f2236b;

    public C0327f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2235a = new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public T m1324a() {
        int i = this.f2236b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f2235a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f2236b = i - 1;
        return t;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1325b(T t) {
        int i = this.f2236b;
        Object[] objArr = this.f2235a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f2236b = i + 1;
        return true;
    }
}
