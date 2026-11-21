package p006b.p032h.p043i;

/* JADX INFO: renamed from: b.h.i.e */
/* JADX INFO: loaded from: classes.dex */
public class C0405e<T> extends C0404d<T> {

    /* JADX INFO: renamed from: c */
    public final Object f2698c;

    public C0405e(int i) {
        super(i);
        this.f2698c = new Object();
    }

    @Override // p006b.p032h.p043i.C0404d, p006b.p032h.p043i.InterfaceC0403c
    /* JADX INFO: renamed from: a */
    public boolean mo1536a(T t) {
        boolean zMo1536a;
        synchronized (this.f2698c) {
            zMo1536a = super.mo1536a(t);
        }
        return zMo1536a;
    }

    @Override // p006b.p032h.p043i.C0404d, p006b.p032h.p043i.InterfaceC0403c
    /* JADX INFO: renamed from: b */
    public T mo1537b() {
        T t;
        synchronized (this.f2698c) {
            t = (T) super.mo1537b();
        }
        return t;
    }
}
