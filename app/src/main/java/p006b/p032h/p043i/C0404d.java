package p006b.p032h.p043i;

/* JADX INFO: renamed from: b.h.i.d */
/* JADX INFO: loaded from: classes.dex */
public class C0404d<T> implements InterfaceC0403c<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f2696a;

    /* JADX INFO: renamed from: b */
    public int f2697b;

    public C0404d(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2696a = new Object[i];
    }

    @Override // p006b.p032h.p043i.InterfaceC0403c
    /* JADX INFO: renamed from: a */
    public boolean mo1536a(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f2697b;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (this.f2696a[i2] == t) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f2696a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f2697b = i + 1;
        return true;
    }

    @Override // p006b.p032h.p043i.InterfaceC0403c
    /* JADX INFO: renamed from: b */
    public T mo1537b() {
        int i = this.f2697b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f2696a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f2697b = i - 1;
        return t;
    }
}
