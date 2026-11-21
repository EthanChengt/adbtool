package p080c.p084b.p085a.p088m.p091u;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0636d;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p111s.C0871f;

/* JADX INFO: renamed from: c.b.a.m.u.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C0673b0 implements InterfaceC0703g, InterfaceC0703g.a {

    /* JADX INFO: renamed from: b */
    public final C0704h<?> f3997b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0703g.a f3998c;

    /* JADX INFO: renamed from: d */
    public int f3999d;

    /* JADX INFO: renamed from: e */
    public C0688d f4000e;

    /* JADX INFO: renamed from: f */
    public Object f4001f;

    /* JADX INFO: renamed from: g */
    public volatile InterfaceC0736n.a<?> f4002g;

    /* JADX INFO: renamed from: h */
    public C0700e f4003h;

    public C0673b0(C0704h<?> c0704h, InterfaceC0703g.a aVar) {
        this.f3997b = c0704h;
        this.f3998c = aVar;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g
    /* JADX INFO: renamed from: a */
    public boolean mo2313a() {
        Object obj = this.f4001f;
        if (obj != null) {
            this.f4001f = null;
            int i = C0871f.f4732b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                InterfaceC0636d<X> interfaceC0636dM2371e = this.f3997b.m2371e(obj);
                C0702f c0702f = new C0702f(interfaceC0636dM2371e, obj, this.f3997b.f4102i);
                InterfaceC0645m interfaceC0645m = this.f4002g.f4327a;
                C0704h<?> c0704h = this.f3997b;
                this.f4003h = new C0700e(interfaceC0645m, c0704h.f4107n);
                c0704h.m2368b().mo2355a(this.f4003h, c0702f);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f4003h + ", data: " + obj + ", encoder: " + interfaceC0636dM2371e + ", duration: " + C0871f.m2603a(jElapsedRealtimeNanos));
                }
                this.f4002g.f4329c.mo2294b();
                this.f4000e = new C0688d(Collections.singletonList(this.f4002g.f4327a), this.f3997b, this);
            } catch (Throwable th) {
                this.f4002g.f4329c.mo2294b();
                throw th;
            }
        }
        C0688d c0688d = this.f4000e;
        if (c0688d != null && c0688d.mo2313a()) {
            return true;
        }
        this.f4000e = null;
        this.f4002g = null;
        boolean z = false;
        while (!z) {
            if (!(this.f3999d < this.f3997b.m2369c().size())) {
                break;
            }
            List<InterfaceC0736n.a<?>> listM2369c = this.f3997b.m2369c();
            int i2 = this.f3999d;
            this.f3999d = i2 + 1;
            this.f4002g = listM2369c.get(i2);
            if (this.f4002g != null && (this.f3997b.f4109p.mo2390c(this.f4002g.f4329c.mo2295c()) || this.f3997b.m2373g(this.f4002g.f4329c.mo2291a()))) {
                this.f4002g.f4329c.mo2297e(this.f3997b.f4108o, new C0671a0(this, this.f4002g));
                z = true;
            }
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g.a
    /* JADX INFO: renamed from: b */
    public void mo2314b() {
        throw new UnsupportedOperationException();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g.a
    /* JADX INFO: renamed from: c */
    public void mo2315c(InterfaceC0645m interfaceC0645m, Object obj, InterfaceC0655d<?> interfaceC0655d, EnumC0633a enumC0633a, InterfaceC0645m interfaceC0645m2) {
        this.f3998c.mo2315c(interfaceC0645m, obj, interfaceC0655d, this.f4002g.f4329c.mo2295c(), interfaceC0645m);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g
    public void cancel() {
        InterfaceC0736n.a<?> aVar = this.f4002g;
        if (aVar != null) {
            aVar.f4329c.cancel();
        }
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g.a
    /* JADX INFO: renamed from: d */
    public void mo2316d(InterfaceC0645m interfaceC0645m, Exception exc, InterfaceC0655d<?> interfaceC0655d, EnumC0633a enumC0633a) {
        this.f3998c.mo2316d(interfaceC0645m, exc, interfaceC0655d, this.f4002g.f4329c.mo2295c());
    }
}
