package p080c.p084b.p085a.p088m.p091u;

import java.util.Objects;
import p006b.p032h.p043i.InterfaceC0403c;
import p080c.p084b.p085a.p111s.p112k.AbstractC0879d;
import p080c.p084b.p085a.p111s.p112k.C0876a;

/* JADX INFO: renamed from: c.b.a.m.u.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0718v<Z> implements InterfaceC0719w<Z>, C0876a.d {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0403c<C0718v<?>> f4259f = C0876a.m2619a(20, new a());

    /* JADX INFO: renamed from: b */
    public final AbstractC0879d f4260b = new AbstractC0879d.b();

    /* JADX INFO: renamed from: c */
    public InterfaceC0719w<Z> f4261c;

    /* JADX INFO: renamed from: d */
    public boolean f4262d;

    /* JADX INFO: renamed from: e */
    public boolean f4263e;

    /* JADX INFO: renamed from: c.b.a.m.u.v$a */
    public class a implements C0876a.b<C0718v<?>> {
        @Override // p080c.p084b.p085a.p111s.p112k.C0876a.b
        /* JADX INFO: renamed from: a */
        public C0718v<?> mo2363a() {
            return new C0718v<>();
        }
    }

    /* JADX INFO: renamed from: f */
    public static <Z> C0718v<Z> m2423f(InterfaceC0719w<Z> interfaceC0719w) {
        C0718v<Z> c0718v = (C0718v) f4259f.mo1537b();
        Objects.requireNonNull(c0718v, "Argument must not be null");
        c0718v.f4263e = false;
        c0718v.f4262d = true;
        c0718v.f4261c = interfaceC0719w;
        return c0718v;
    }

    @Override // p080c.p084b.p085a.p111s.p112k.C0876a.d
    /* JADX INFO: renamed from: a */
    public AbstractC0879d mo2364a() {
        return this.f4260b;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: b */
    public Z mo2409b() {
        return this.f4261c.mo2409b();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: c */
    public int mo2410c() {
        return this.f4261c.mo2410c();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: d */
    public Class<Z> mo2411d() {
        return this.f4261c.mo2411d();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: e */
    public synchronized void mo2412e() {
        this.f4260b.mo2621a();
        this.f4263e = true;
        if (!this.f4262d) {
            this.f4261c.mo2412e();
            this.f4261c = null;
            f4259f.mo1536a(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m2424g() {
        this.f4260b.mo2621a();
        if (!this.f4262d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4262d = false;
        if (this.f4263e) {
            mo2412e();
        }
    }
}
