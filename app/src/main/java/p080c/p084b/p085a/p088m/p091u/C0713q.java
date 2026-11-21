package p080c.p084b.p085a.p088m.p091u;

import java.util.Objects;
import p080c.p084b.p085a.p088m.InterfaceC0645m;

/* JADX INFO: renamed from: c.b.a.m.u.q */
/* JADX INFO: loaded from: classes.dex */
public class C0713q<Z> implements InterfaceC0719w<Z> {

    /* JADX INFO: renamed from: b */
    public final boolean f4239b;

    /* JADX INFO: renamed from: c */
    public final boolean f4240c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0719w<Z> f4241d;

    /* JADX INFO: renamed from: e */
    public final a f4242e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0645m f4243f;

    /* JADX INFO: renamed from: g */
    public int f4244g;

    /* JADX INFO: renamed from: h */
    public boolean f4245h;

    /* JADX INFO: renamed from: c.b.a.m.u.q$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2393a(InterfaceC0645m interfaceC0645m, C0713q<?> c0713q);
    }

    public C0713q(InterfaceC0719w<Z> interfaceC0719w, boolean z, boolean z2, InterfaceC0645m interfaceC0645m, a aVar) {
        Objects.requireNonNull(interfaceC0719w, "Argument must not be null");
        this.f4241d = interfaceC0719w;
        this.f4239b = z;
        this.f4240c = z2;
        this.f4243f = interfaceC0645m;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f4242e = aVar;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2408a() {
        if (this.f4245h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4244g++;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: b */
    public Z mo2409b() {
        return this.f4241d.mo2409b();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: c */
    public int mo2410c() {
        return this.f4241d.mo2410c();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: d */
    public Class<Z> mo2411d() {
        return this.f4241d.mo2411d();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: e */
    public synchronized void mo2412e() {
        if (this.f4244g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4245h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4245h = true;
        if (this.f4240c) {
            this.f4241d.mo2412e();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2413f() {
        boolean z;
        synchronized (this) {
            int i = this.f4244g;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f4244g = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f4242e.mo2393a(this.f4243f, this);
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4239b + ", listener=" + this.f4242e + ", key=" + this.f4243f + ", acquired=" + this.f4244g + ", isRecycled=" + this.f4245h + ", resource=" + this.f4241d + '}';
    }
}
