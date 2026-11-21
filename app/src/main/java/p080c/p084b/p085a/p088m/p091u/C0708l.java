package p080c.p084b.p085a.p088m.p091u;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p006b.p032h.p043i.InterfaceC0403c;
import p080c.p084b.p085a.C0618d;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0690b;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0692d;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0693e;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0694f;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0696h;
import p080c.p084b.p085a.p088m.p091u.p093d0.InterfaceC0689a;
import p080c.p084b.p085a.p088m.p091u.p093d0.InterfaceC0697i;
import p080c.p084b.p085a.p088m.p091u.p094e0.ExecutorServiceC0701a;
import p080c.p084b.p085a.p107q.C0848h;
import p080c.p084b.p085a.p107q.InterfaceC0847g;
import p080c.p084b.p085a.p111s.C0871f;
import p080c.p084b.p085a.p111s.C0872g;
import p080c.p084b.p085a.p111s.p112k.C0876a;

/* JADX INFO: renamed from: c.b.a.m.u.l */
/* JADX INFO: loaded from: classes.dex */
public class C0708l implements InterfaceC0710n, InterfaceC0697i.a, C0713q.a {

    /* JADX INFO: renamed from: i */
    public static final boolean f4171i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final C0716t f4172a;

    /* JADX INFO: renamed from: b */
    public final C0712p f4173b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0697i f4174c;

    /* JADX INFO: renamed from: d */
    public final b f4175d;

    /* JADX INFO: renamed from: e */
    public final C0722z f4176e;

    /* JADX INFO: renamed from: f */
    public final c f4177f;

    /* JADX INFO: renamed from: g */
    public final a f4178g;

    /* JADX INFO: renamed from: h */
    public final C0670a f4179h;

    /* JADX INFO: renamed from: c.b.a.m.u.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final RunnableC0705i.d f4180a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0403c<RunnableC0705i<?>> f4181b = C0876a.m2619a(150, new C1396a());

        /* JADX INFO: renamed from: c */
        public int f4182c;

        /* JADX INFO: renamed from: c.b.a.m.u.l$a$a, reason: collision with other inner class name */
        public class C1396a implements C0876a.b<RunnableC0705i<?>> {
            public C1396a() {
            }

            @Override // p080c.p084b.p085a.p111s.p112k.C0876a.b
            /* JADX INFO: renamed from: a */
            public RunnableC0705i<?> mo2363a() {
                a aVar = a.this;
                return new RunnableC0705i<>(aVar.f4180a, aVar.f4181b);
            }
        }

        public a(RunnableC0705i.d dVar) {
            this.f4180a = dVar;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.l$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final ExecutorServiceC0701a f4184a;

        /* JADX INFO: renamed from: b */
        public final ExecutorServiceC0701a f4185b;

        /* JADX INFO: renamed from: c */
        public final ExecutorServiceC0701a f4186c;

        /* JADX INFO: renamed from: d */
        public final ExecutorServiceC0701a f4187d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC0710n f4188e;

        /* JADX INFO: renamed from: f */
        public final C0713q.a f4189f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC0403c<C0709m<?>> f4190g = C0876a.m2619a(150, new a());

        /* JADX INFO: renamed from: c.b.a.m.u.l$b$a */
        public class a implements C0876a.b<C0709m<?>> {
            public a() {
            }

            @Override // p080c.p084b.p085a.p111s.p112k.C0876a.b
            /* JADX INFO: renamed from: a */
            public C0709m<?> mo2363a() {
                b bVar = b.this;
                return new C0709m<>(bVar.f4184a, bVar.f4185b, bVar.f4186c, bVar.f4187d, bVar.f4188e, bVar.f4189f, bVar.f4190g);
            }
        }

        public b(ExecutorServiceC0701a executorServiceC0701a, ExecutorServiceC0701a executorServiceC0701a2, ExecutorServiceC0701a executorServiceC0701a3, ExecutorServiceC0701a executorServiceC0701a4, InterfaceC0710n interfaceC0710n, C0713q.a aVar) {
            this.f4184a = executorServiceC0701a;
            this.f4185b = executorServiceC0701a2;
            this.f4186c = executorServiceC0701a3;
            this.f4187d = executorServiceC0701a4;
            this.f4188e = interfaceC0710n;
            this.f4189f = aVar;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.l$c */
    public static class c implements RunnableC0705i.d {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0689a.a f4192a;

        /* JADX INFO: renamed from: b */
        public volatile InterfaceC0689a f4193b;

        public c(InterfaceC0689a.a aVar) {
            this.f4192a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC0689a m2399a() {
            if (this.f4193b == null) {
                synchronized (this) {
                    if (this.f4193b == null) {
                        C0692d c0692d = (C0692d) this.f4192a;
                        C0694f c0694f = (C0694f) c0692d.f4057b;
                        File cacheDir = c0694f.f4063a.getCacheDir();
                        C0693e c0693e = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (c0694f.f4064b != null) {
                            cacheDir = new File(cacheDir, c0694f.f4064b);
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            c0693e = new C0693e(cacheDir, c0692d.f4056a);
                        }
                        this.f4193b = c0693e;
                    }
                    if (this.f4193b == null) {
                        this.f4193b = new C0690b();
                    }
                }
            }
            return this.f4193b;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.l$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public final C0709m<?> f4194a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0847g f4195b;

        public d(InterfaceC0847g interfaceC0847g, C0709m<?> c0709m) {
            this.f4195b = interfaceC0847g;
            this.f4194a = c0709m;
        }
    }

    public C0708l(InterfaceC0697i interfaceC0697i, InterfaceC0689a.a aVar, ExecutorServiceC0701a executorServiceC0701a, ExecutorServiceC0701a executorServiceC0701a2, ExecutorServiceC0701a executorServiceC0701a3, ExecutorServiceC0701a executorServiceC0701a4, boolean z) {
        this.f4174c = interfaceC0697i;
        c cVar = new c(aVar);
        this.f4177f = cVar;
        C0670a c0670a = new C0670a(z);
        this.f4179h = c0670a;
        synchronized (this) {
            synchronized (c0670a) {
                c0670a.f3989d = this;
            }
        }
        this.f4173b = new C0712p();
        this.f4172a = new C0716t();
        this.f4175d = new b(executorServiceC0701a, executorServiceC0701a2, executorServiceC0701a3, executorServiceC0701a4, this, this);
        this.f4178g = new a(cVar);
        this.f4176e = new C0722z();
        ((C0696h) interfaceC0697i).f4065d = this;
    }

    /* JADX INFO: renamed from: d */
    public static void m2392d(String str, long j, InterfaceC0645m interfaceC0645m) {
        Log.v("Engine", str + " in " + C0871f.m2603a(j) + "ms, key: " + interfaceC0645m);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.C0713q.a
    /* JADX INFO: renamed from: a */
    public void mo2393a(InterfaceC0645m interfaceC0645m, C0713q<?> c0713q) {
        C0670a c0670a = this.f4179h;
        synchronized (c0670a) {
            C0670a.b bVarRemove = c0670a.f3987b.remove(interfaceC0645m);
            if (bVarRemove != null) {
                bVarRemove.f3993c = null;
                bVarRemove.clear();
            }
        }
        if (c0713q.f4239b) {
            ((C0696h) this.f4174c).m2605d(interfaceC0645m, c0713q);
        } else {
            this.f4176e.m2425a(c0713q, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public <R> d m2394b(C0618d c0618d, Object obj, InterfaceC0645m interfaceC0645m, int i, int i2, Class<?> cls, Class<R> cls2, EnumC0620f enumC0620f, AbstractC0707k abstractC0707k, Map<Class<?>, InterfaceC0651s<?>> map, boolean z, boolean z2, C0647o c0647o, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC0847g interfaceC0847g, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f4171i) {
            int i3 = C0871f.f4732b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        Objects.requireNonNull(this.f4173b);
        C0711o c0711o = new C0711o(obj, interfaceC0645m, i, i2, map, cls, cls2, c0647o);
        synchronized (this) {
            C0713q<?> c0713qM2395c = m2395c(c0711o, z3, j);
            if (c0713qM2395c == null) {
                return m2398g(c0618d, obj, interfaceC0645m, i, i2, cls, cls2, enumC0620f, abstractC0707k, map, z, z2, c0647o, z3, z4, z5, z6, interfaceC0847g, executor, c0711o, j);
            }
            ((C0848h) interfaceC0847g).m2583p(c0713qM2395c, EnumC0633a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0713q<?> m2395c(C0711o c0711o, boolean z, long j) {
        C0713q<?> c0713q;
        Object obj;
        C0713q<?> c0713q2;
        if (!z) {
            return null;
        }
        C0670a c0670a = this.f4179h;
        synchronized (c0670a) {
            C0670a.b bVar = c0670a.f3987b.get(c0711o);
            if (bVar == null) {
                c0713q = null;
            } else {
                c0713q = bVar.get();
                if (c0713q == null) {
                    c0670a.m2312b(bVar);
                }
            }
        }
        if (c0713q != null) {
            c0713q.m2408a();
        }
        if (c0713q != null) {
            if (f4171i) {
                m2392d("Loaded resource from active resources", j, c0711o);
            }
            return c0713q;
        }
        C0696h c0696h = (C0696h) this.f4174c;
        synchronized (c0696h) {
            C0872g.a aVar = (C0872g.a) c0696h.f4733a.remove(c0711o);
            if (aVar == null) {
                obj = null;
            } else {
                c0696h.f4735c -= (long) aVar.f4737b;
                obj = aVar.f4736a;
            }
        }
        InterfaceC0719w interfaceC0719w = (InterfaceC0719w) obj;
        if (interfaceC0719w == null) {
            c0713q2 = null;
        } else {
            c0713q2 = interfaceC0719w instanceof C0713q ? (C0713q) interfaceC0719w : new C0713q<>(interfaceC0719w, true, true, c0711o, this);
        }
        if (c0713q2 != null) {
            c0713q2.m2408a();
            this.f4179h.m2311a(c0711o, c0713q2);
        }
        if (c0713q2 == null) {
            return null;
        }
        if (f4171i) {
            m2392d("Loaded resource from cache", j, c0711o);
        }
        return c0713q2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0021), top: B:15:0x0003 }] */
    /* JADX INFO: renamed from: e */
    public synchronized void m2396e(C0709m<?> c0709m, InterfaceC0645m interfaceC0645m, C0713q<?> c0713q) {
        Map<InterfaceC0645m, C0709m<?>> mapM2421a;
        if (c0713q != null) {
            if (c0713q.f4239b) {
                this.f4179h.m2311a(interfaceC0645m, c0713q);
            }
            C0716t c0716t = this.f4172a;
            Objects.requireNonNull(c0716t);
            mapM2421a = c0716t.m2421a(c0709m.f4213q);
            if (c0709m.equals(mapM2421a.get(interfaceC0645m))) {
                mapM2421a.remove(interfaceC0645m);
            }
        } else {
            C0716t c0716t2 = this.f4172a;
            Objects.requireNonNull(c0716t2);
            mapM2421a = c0716t2.m2421a(c0709m.f4213q);
            if (c0709m.equals(mapM2421a.get(interfaceC0645m))) {
                mapM2421a.remove(interfaceC0645m);
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public void m2397f(InterfaceC0719w<?> interfaceC0719w) {
        if (!(interfaceC0719w instanceof C0713q)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C0713q) interfaceC0719w).m2413f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final <R> d m2398g(C0618d c0618d, Object obj, InterfaceC0645m interfaceC0645m, int i, int i2, Class<?> cls, Class<R> cls2, EnumC0620f enumC0620f, AbstractC0707k abstractC0707k, Map<Class<?>, InterfaceC0651s<?>> map, boolean z, boolean z2, C0647o c0647o, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC0847g interfaceC0847g, Executor executor, C0711o c0711o, long j) {
        ExecutorServiceC0701a executorServiceC0701a;
        C0716t c0716t = this.f4172a;
        C0709m<?> c0709m = (z6 ? c0716t.f4255b : c0716t.f4254a).get(c0711o);
        if (c0709m != null) {
            c0709m.m2400b(interfaceC0847g, executor);
            if (f4171i) {
                m2392d("Added to existing load", j, c0711o);
            }
            return new d(interfaceC0847g, c0709m);
        }
        C0709m<?> c0709mMo1537b = this.f4175d.f4190g.mo1537b();
        Objects.requireNonNull(c0709mMo1537b, "Argument must not be null");
        synchronized (c0709mMo1537b) {
            c0709mMo1537b.f4209m = c0711o;
            c0709mMo1537b.f4210n = z3;
            c0709mMo1537b.f4211o = z4;
            c0709mMo1537b.f4212p = z5;
            c0709mMo1537b.f4213q = z6;
        }
        a aVar = this.f4178g;
        RunnableC0705i<R> runnableC0705i = (RunnableC0705i) aVar.f4181b.mo1537b();
        Objects.requireNonNull(runnableC0705i, "Argument must not be null");
        int i3 = aVar.f4182c;
        aVar.f4182c = i3 + 1;
        C0704h<R> c0704h = runnableC0705i.f4119b;
        RunnableC0705i.d dVar = runnableC0705i.f4122e;
        c0704h.f4096c = c0618d;
        c0704h.f4097d = obj;
        c0704h.f4107n = interfaceC0645m;
        c0704h.f4098e = i;
        c0704h.f4099f = i2;
        c0704h.f4109p = abstractC0707k;
        c0704h.f4100g = cls;
        c0704h.f4101h = dVar;
        c0704h.f4104k = cls2;
        c0704h.f4108o = enumC0620f;
        c0704h.f4102i = c0647o;
        c0704h.f4103j = map;
        c0704h.f4110q = z;
        c0704h.f4111r = z2;
        runnableC0705i.f4126i = c0618d;
        runnableC0705i.f4127j = interfaceC0645m;
        runnableC0705i.f4128k = enumC0620f;
        runnableC0705i.f4129l = c0711o;
        runnableC0705i.f4130m = i;
        runnableC0705i.f4131n = i2;
        runnableC0705i.f4132o = abstractC0707k;
        runnableC0705i.f4139v = z6;
        runnableC0705i.f4133p = c0647o;
        runnableC0705i.f4134q = c0709mMo1537b;
        runnableC0705i.f4135r = i3;
        runnableC0705i.f4137t = RunnableC0705i.f.INITIALIZE;
        runnableC0705i.f4140w = obj;
        C0716t c0716t2 = this.f4172a;
        Objects.requireNonNull(c0716t2);
        c0716t2.m2421a(c0709mMo1537b.f4213q).put(c0711o, c0709mMo1537b);
        c0709mMo1537b.m2400b(interfaceC0847g, executor);
        synchronized (c0709mMo1537b) {
            c0709mMo1537b.f4220x = runnableC0705i;
            RunnableC0705i.g gVarM2378i = runnableC0705i.m2378i(RunnableC0705i.g.INITIALIZE);
            if (gVarM2378i == RunnableC0705i.g.RESOURCE_CACHE || gVarM2378i == RunnableC0705i.g.DATA_CACHE) {
                executorServiceC0701a = c0709mMo1537b.f4204h;
            } else if (c0709mMo1537b.f4211o) {
                executorServiceC0701a = c0709mMo1537b.f4206j;
            } else {
                executorServiceC0701a = c0709mMo1537b.f4212p ? c0709mMo1537b.f4207k : c0709mMo1537b.f4205i;
            }
            executorServiceC0701a.f4084a.execute(runnableC0705i);
        }
        if (f4171i) {
            m2392d("Started new load", j, c0711o);
        }
        return new d(interfaceC0847g, c0709mMo1537b);
    }
}
