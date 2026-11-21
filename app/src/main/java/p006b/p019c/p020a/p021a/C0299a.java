package p006b.p019c.p020a.p021a;

/* JADX INFO: renamed from: b.c.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0299a extends AbstractC0301c {

    /* JADX INFO: renamed from: c */
    public static volatile C0299a f2097c;

    /* JADX INFO: renamed from: a */
    public AbstractC0301c f2098a;

    /* JADX INFO: renamed from: b */
    public AbstractC0301c f2099b;

    public C0299a() {
        C0300b c0300b = new C0300b();
        this.f2099b = c0300b;
        this.f2098a = c0300b;
    }

    /* JADX INFO: renamed from: b */
    public static C0299a m1183b() {
        if (f2097c != null) {
            return f2097c;
        }
        synchronized (C0299a.class) {
            if (f2097c == null) {
                f2097c = new C0299a();
            }
        }
        return f2097c;
    }

    @Override // p006b.p019c.p020a.p021a.AbstractC0301c
    /* JADX INFO: renamed from: a */
    public boolean mo1184a() {
        return this.f2098a.mo1184a();
    }
}
