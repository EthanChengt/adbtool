package p080c.p084b.p085a.p088m.p091u;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p043i.InterfaceC0403c;
import c.a.a.a.a;
import p080c.p084b.p085a.C0618d;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0646n;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0650r;
import p080c.p084b.p085a.p088m.p089t.C0657f;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0656e;
import p080c.p084b.p085a.p088m.p097w.p098c.C0769m;
import p080c.p084b.p085a.p111s.C0871f;
import p080c.p084b.p085a.p111s.p112k.AbstractC0879d;
import p080c.p084b.p085a.p111s.p112k.C0876a;

/* JADX INFO: renamed from: c.b.a.m.u.i */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0705i<R> implements InterfaceC0703g.a, Runnable, Comparable<RunnableC0705i<?>>, C0876a.d {

    /* JADX INFO: renamed from: A */
    public Object f4112A;

    /* JADX INFO: renamed from: B */
    public EnumC0633a f4113B;

    /* JADX INFO: renamed from: C */
    public InterfaceC0655d<?> f4114C;

    /* JADX INFO: renamed from: D */
    public volatile InterfaceC0703g f4115D;

    /* JADX INFO: renamed from: E */
    public volatile boolean f4116E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f4117F;

    /* JADX INFO: renamed from: G */
    public boolean f4118G;

    /* JADX INFO: renamed from: e */
    public final d f4122e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0403c<RunnableC0705i<?>> f4123f;

    /* JADX INFO: renamed from: i */
    public C0618d f4126i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0645m f4127j;

    /* JADX INFO: renamed from: k */
    public EnumC0620f f4128k;

    /* JADX INFO: renamed from: l */
    public C0711o f4129l;

    /* JADX INFO: renamed from: m */
    public int f4130m;

    /* JADX INFO: renamed from: n */
    public int f4131n;

    /* JADX INFO: renamed from: o */
    public AbstractC0707k f4132o;

    /* JADX INFO: renamed from: p */
    public C0647o f4133p;

    /* JADX INFO: renamed from: q */
    public a<R> f4134q;

    /* JADX INFO: renamed from: r */
    public int f4135r;

    /* JADX INFO: renamed from: s */
    public g f4136s;

    /* JADX INFO: renamed from: t */
    public f f4137t;

    /* JADX INFO: renamed from: u */
    public long f4138u;

    /* JADX INFO: renamed from: v */
    public boolean f4139v;

    /* JADX INFO: renamed from: w */
    public Object f4140w;

    /* JADX INFO: renamed from: x */
    public Thread f4141x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0645m f4142y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0645m f4143z;

    /* JADX INFO: renamed from: b */
    public final C0704h<R> f4119b = new C0704h<>();

    /* JADX INFO: renamed from: c */
    public final List<Throwable> f4120c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final AbstractC0879d f4121d = new AbstractC0879d.b();

    /* JADX INFO: renamed from: g */
    public final c<?> f4124g = new c<>();

    /* JADX INFO: renamed from: h */
    public final e f4125h = new e();

    /* JADX INFO: renamed from: c.b.a.m.u.i$a */
    public interface a<R> {
    }

    /* JADX INFO: renamed from: c.b.a.m.u.i$b */
    public final class b<Z> implements C0706j.a<Z> {

        /* JADX INFO: renamed from: a */
        public final EnumC0633a f4144a;

        public b(EnumC0633a enumC0633a) {
            this.f4144a = enumC0633a;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.i$c */
    public static class c<Z> {

        /* JADX INFO: renamed from: a */
        public InterfaceC0645m f4146a;

        /* JADX INFO: renamed from: b */
        public InterfaceC0650r<Z> f4147b;

        /* JADX INFO: renamed from: c */
        public C0718v<Z> f4148c;
    }

    /* JADX INFO: renamed from: c.b.a.m.u.i$d */
    public interface d {
    }

    /* JADX INFO: renamed from: c.b.a.m.u.i$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public boolean f4149a;

        /* JADX INFO: renamed from: b */
        public boolean f4150b;

        /* JADX INFO: renamed from: c */
        public boolean f4151c;

        /* JADX INFO: renamed from: a */
        public final boolean m2385a(boolean z) {
            return (this.f4151c || z || this.f4150b) && this.f4149a;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.i$f */
    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: c.b.a.m.u.i$g */
    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public RunnableC0705i(d dVar, InterfaceC0403c<RunnableC0705i<?>> interfaceC0403c) {
        this.f4122e = dVar;
        this.f4123f = interfaceC0403c;
    }

    @Override // p080c.p084b.p085a.p111s.p112k.C0876a.d
    /* JADX INFO: renamed from: a */
    public AbstractC0879d mo2364a() {
        return this.f4121d;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g.a
    /* JADX INFO: renamed from: b */
    public void mo2314b() {
        this.f4137t = f.SWITCH_TO_SOURCE_SERVICE;
        ((C0709m) this.f4134q).m2407i(this);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g.a
    /* JADX INFO: renamed from: c */
    public void mo2315c(InterfaceC0645m interfaceC0645m, Object obj, InterfaceC0655d<?> interfaceC0655d, EnumC0633a enumC0633a, InterfaceC0645m interfaceC0645m2) {
        this.f4142y = interfaceC0645m;
        this.f4112A = obj;
        this.f4114C = interfaceC0655d;
        this.f4113B = enumC0633a;
        this.f4143z = interfaceC0645m2;
        this.f4118G = interfaceC0645m != this.f4119b.m2367a().get(0);
        if (Thread.currentThread() == this.f4141x) {
            m2376g();
        } else {
            this.f4137t = f.DECODE_DATA;
            ((C0709m) this.f4134q).m2407i(this);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(RunnableC0705i<?> runnableC0705i) {
        RunnableC0705i<?> runnableC0705i2 = runnableC0705i;
        int iOrdinal = this.f4128k.ordinal() - runnableC0705i2.f4128k.ordinal();
        return iOrdinal == 0 ? this.f4135r - runnableC0705i2.f4135r : iOrdinal;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g.a
    /* JADX INFO: renamed from: d */
    public void mo2316d(InterfaceC0645m interfaceC0645m, Exception exc, InterfaceC0655d<?> interfaceC0655d, EnumC0633a enumC0633a) {
        interfaceC0655d.mo2294b();
        C0714r c0714r = new C0714r("Fetching data failed", exc);
        Class<?> clsMo2291a = interfaceC0655d.mo2291a();
        c0714r.f4248c = interfaceC0645m;
        c0714r.f4249d = enumC0633a;
        c0714r.f4250e = clsMo2291a;
        this.f4120c.add(c0714r);
        if (Thread.currentThread() == this.f4141x) {
            m2382m();
        } else {
            this.f4137t = f.SWITCH_TO_SOURCE_SERVICE;
            ((C0709m) this.f4134q).m2407i(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final <Data> InterfaceC0719w<R> m2374e(InterfaceC0655d<?> interfaceC0655d, Data data, EnumC0633a enumC0633a) {
        if (data == null) {
            interfaceC0655d.mo2294b();
            return null;
        }
        try {
            int i = C0871f.f4732b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC0719w<R> interfaceC0719wM2375f = m2375f(data, enumC0633a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m2379j("Decoded result " + interfaceC0719wM2375f, jElapsedRealtimeNanos, null);
            }
            return interfaceC0719wM2375f;
        } finally {
            interfaceC0655d.mo2294b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final <Data> InterfaceC0719w<R> m2375f(Data data, EnumC0633a enumC0633a) {
        InterfaceC0656e<Data> interfaceC0656eMo2304b;
        C0717u<Data, ?, R> c0717uM2370d = this.f4119b.m2370d(data.getClass());
        C0647o c0647o = this.f4133p;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = enumC0633a == EnumC0633a.RESOURCE_DISK_CACHE || this.f4119b.f4111r;
            C0646n<Boolean> c0646n = C0769m.f4446i;
            Boolean bool = (Boolean) c0647o.m2285c(c0646n);
            if (bool == null || (bool.booleanValue() && !z)) {
                c0647o = new C0647o();
                c0647o.m2286d(this.f4133p);
                c0647o.f3943b.put(c0646n, Boolean.valueOf(z));
            }
        }
        C0647o c0647o2 = c0647o;
        C0657f c0657f = this.f4126i.f3780b.f3800e;
        synchronized (c0657f) {
            InterfaceC0656e.a<?> aVar = c0657f.f3955a.get(data.getClass());
            if (aVar == null) {
                for (InterfaceC0656e.a<?> aVar2 : c0657f.f3955a.values()) {
                    if (aVar2.mo2303a().isAssignableFrom(data.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = C0657f.f3954b;
            }
            interfaceC0656eMo2304b = aVar.mo2304b(data);
        }
        try {
            return c0717uM2370d.m2422a(interfaceC0656eMo2304b, c0647o2, this.f4130m, this.f4131n, new b(enumC0633a));
        } finally {
            interfaceC0656eMo2304b.mo2302b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2376g() {
        C0718v c0718vM2374e;
        boolean zM2385a;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f4138u;
            StringBuilder sbM2191e = a.m2191e("data: ");
            sbM2191e.append(this.f4112A);
            sbM2191e.append(", cache key: ");
            sbM2191e.append(this.f4142y);
            sbM2191e.append(", fetcher: ");
            sbM2191e.append(this.f4114C);
            m2379j("Retrieved data", j, sbM2191e.toString());
        }
        C0718v c0718vM2423f = null;
        try {
            c0718vM2374e = m2374e(this.f4114C, this.f4112A, this.f4113B);
        } catch (C0714r e2) {
            InterfaceC0645m interfaceC0645m = this.f4143z;
            EnumC0633a enumC0633a = this.f4113B;
            e2.f4248c = interfaceC0645m;
            e2.f4249d = enumC0633a;
            e2.f4250e = null;
            this.f4120c.add(e2);
            c0718vM2374e = null;
        }
        if (c0718vM2374e == null) {
            m2382m();
            return;
        }
        EnumC0633a enumC0633a2 = this.f4113B;
        boolean z = this.f4118G;
        if (c0718vM2374e instanceof InterfaceC0715s) {
            ((InterfaceC0715s) c0718vM2374e).mo2420a();
        }
        if (this.f4124g.f4148c != null) {
            c0718vM2423f = C0718v.m2423f(c0718vM2374e);
            c0718vM2374e = c0718vM2423f;
        }
        m2384o();
        C0709m<?> c0709m = (C0709m) this.f4134q;
        synchronized (c0709m) {
            c0709m.f4214r = c0718vM2374e;
            c0709m.f4215s = enumC0633a2;
            c0709m.f4222z = z;
        }
        synchronized (c0709m) {
            c0709m.f4199c.mo2621a();
            if (c0709m.f4221y) {
                c0709m.f4214r.mo2412e();
                c0709m.m2405g();
            } else {
                if (c0709m.f4198b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (c0709m.f4216t) {
                    throw new IllegalStateException("Already have resource");
                }
                C0709m.c cVar = c0709m.f4202f;
                InterfaceC0719w<?> interfaceC0719w = c0709m.f4214r;
                boolean z2 = c0709m.f4210n;
                InterfaceC0645m interfaceC0645m2 = c0709m.f4209m;
                C0713q.a aVar = c0709m.f4200d;
                Objects.requireNonNull(cVar);
                c0709m.f4219w = new C0713q<>(interfaceC0719w, z2, true, interfaceC0645m2, aVar);
                c0709m.f4216t = true;
                C0709m.e eVar = c0709m.f4198b;
                Objects.requireNonNull(eVar);
                ArrayList<C0709m.d> arrayList = new ArrayList(eVar.f4229b);
                c0709m.m2403e(arrayList.size() + 1);
                ((C0708l) c0709m.f4203g).m2396e(c0709m, c0709m.f4209m, c0709m.f4219w);
                for (C0709m.d dVar : arrayList) {
                    dVar.f4228b.execute(new C0709m.b(dVar.f4227a));
                }
                c0709m.m2402d();
            }
        }
        this.f4136s = g.ENCODE;
        try {
            c<?> cVar2 = this.f4124g;
            if (cVar2.f4148c != null) {
                try {
                    ((C0708l.c) this.f4122e).m2399a().mo2355a(cVar2.f4146a, new C0702f(cVar2.f4147b, cVar2.f4148c, this.f4133p));
                    cVar2.f4148c.m2424g();
                } catch (Throwable th) {
                    cVar2.f4148c.m2424g();
                    throw th;
                }
            }
            if (c0718vM2423f != null) {
                c0718vM2423f.m2424g();
            }
            e eVar2 = this.f4125h;
            synchronized (eVar2) {
                eVar2.f4150b = true;
                zM2385a = eVar2.m2385a(false);
            }
            if (zM2385a) {
                m2381l();
            }
        } catch (Throwable th2) {
            if (c0718vM2423f != null) {
                c0718vM2423f.m2424g();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0703g m2377h() {
        int iOrdinal = this.f4136s.ordinal();
        if (iOrdinal == 1) {
            return new C0720x(this.f4119b, this);
        }
        if (iOrdinal == 2) {
            return new C0688d(this.f4119b, this);
        }
        if (iOrdinal == 3) {
            return new C0673b0(this.f4119b, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        StringBuilder sbM2191e = a.m2191e("Unrecognized stage: ");
        sbM2191e.append(this.f4136s);
        throw new IllegalStateException(sbM2191e.toString());
    }

    /* JADX INFO: renamed from: i */
    public final g m2378i(g gVar) {
        g gVar2 = g.RESOURCE_CACHE;
        g gVar3 = g.DATA_CACHE;
        g gVar4 = g.FINISHED;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return this.f4132o.mo2389b() ? gVar2 : m2378i(gVar2);
        }
        if (iOrdinal == 1) {
            return this.f4132o.mo2388a() ? gVar3 : m2378i(gVar3);
        }
        if (iOrdinal == 2) {
            return this.f4139v ? gVar4 : g.SOURCE;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return gVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m2379j(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C0871f.m2603a(j));
        sb.append(", load key: ");
        sb.append(this.f4129l);
        sb.append(str2 != null ? a.m2201o(", ", str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX INFO: renamed from: k */
    public final void m2380k() {
        boolean zM2385a;
        m2384o();
        C0714r c0714r = new C0714r("Failed to load resource", new ArrayList(this.f4120c));
        C0709m<?> c0709m = (C0709m) this.f4134q;
        synchronized (c0709m) {
            c0709m.f4217u = c0714r;
        }
        synchronized (c0709m) {
            c0709m.f4199c.mo2621a();
            if (c0709m.f4221y) {
                c0709m.m2405g();
            } else {
                if (c0709m.f4198b.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (c0709m.f4218v) {
                    throw new IllegalStateException("Already failed once");
                }
                c0709m.f4218v = true;
                InterfaceC0645m interfaceC0645m = c0709m.f4209m;
                C0709m.e eVar = c0709m.f4198b;
                Objects.requireNonNull(eVar);
                ArrayList<C0709m.d> arrayList = new ArrayList(eVar.f4229b);
                c0709m.m2403e(arrayList.size() + 1);
                ((C0708l) c0709m.f4203g).m2396e(c0709m, interfaceC0645m, null);
                for (C0709m.d dVar : arrayList) {
                    dVar.f4228b.execute(new C0709m.a(dVar.f4227a));
                }
                c0709m.m2402d();
            }
        }
        e eVar2 = this.f4125h;
        synchronized (eVar2) {
            eVar2.f4151c = true;
            zM2385a = eVar2.m2385a(false);
        }
        if (zM2385a) {
            m2381l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2381l() {
        e eVar = this.f4125h;
        synchronized (eVar) {
            eVar.f4150b = false;
            eVar.f4149a = false;
            eVar.f4151c = false;
        }
        c<?> cVar = this.f4124g;
        cVar.f4146a = null;
        cVar.f4147b = null;
        cVar.f4148c = null;
        C0704h<R> c0704h = this.f4119b;
        c0704h.f4096c = null;
        c0704h.f4097d = null;
        c0704h.f4107n = null;
        c0704h.f4100g = null;
        c0704h.f4104k = null;
        c0704h.f4102i = null;
        c0704h.f4108o = null;
        c0704h.f4103j = null;
        c0704h.f4109p = null;
        c0704h.f4094a.clear();
        c0704h.f4105l = false;
        c0704h.f4095b.clear();
        c0704h.f4106m = false;
        this.f4116E = false;
        this.f4126i = null;
        this.f4127j = null;
        this.f4133p = null;
        this.f4128k = null;
        this.f4129l = null;
        this.f4134q = null;
        this.f4136s = null;
        this.f4115D = null;
        this.f4141x = null;
        this.f4142y = null;
        this.f4112A = null;
        this.f4113B = null;
        this.f4114C = null;
        this.f4138u = 0L;
        this.f4117F = false;
        this.f4140w = null;
        this.f4120c.clear();
        this.f4123f.mo1536a(this);
    }

    /* JADX INFO: renamed from: m */
    public final void m2382m() {
        this.f4141x = Thread.currentThread();
        int i = C0871f.f4732b;
        this.f4138u = SystemClock.elapsedRealtimeNanos();
        boolean zMo2313a = false;
        while (!this.f4117F && this.f4115D != null && !(zMo2313a = this.f4115D.mo2313a())) {
            this.f4136s = m2378i(this.f4136s);
            this.f4115D = m2377h();
            if (this.f4136s == g.SOURCE) {
                this.f4137t = f.SWITCH_TO_SOURCE_SERVICE;
                ((C0709m) this.f4134q).m2407i(this);
                return;
            }
        }
        if ((this.f4136s == g.FINISHED || this.f4117F) && !zMo2313a) {
            m2380k();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2383n() {
        int iOrdinal = this.f4137t.ordinal();
        if (iOrdinal == 0) {
            this.f4136s = m2378i(g.INITIALIZE);
            this.f4115D = m2377h();
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                m2376g();
                return;
            } else {
                StringBuilder sbM2191e = a.m2191e("Unrecognized run reason: ");
                sbM2191e.append(this.f4137t);
                throw new IllegalStateException(sbM2191e.toString());
            }
        }
        m2382m();
    }

    /* JADX INFO: renamed from: o */
    public final void m2384o() {
        Throwable th;
        this.f4121d.mo2621a();
        if (!this.f4116E) {
            this.f4116E = true;
            return;
        }
        if (this.f4120c.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f4120c;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC0655d<?> interfaceC0655d = this.f4114C;
        try {
            try {
                if (this.f4117F) {
                    m2380k();
                    if (interfaceC0655d != null) {
                        interfaceC0655d.mo2294b();
                        return;
                    }
                    return;
                }
                m2383n();
                if (interfaceC0655d != null) {
                    interfaceC0655d.mo2294b();
                }
            } catch (Throwable th) {
                if (interfaceC0655d != null) {
                    interfaceC0655d.mo2294b();
                }
                throw th;
            }
        } catch (C0674c e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f4117F + ", stage: " + this.f4136s, th2);
            }
            if (this.f4136s != g.ENCODE) {
                this.f4120c.add(th2);
                m2380k();
            }
            if (!this.f4117F) {
                throw th2;
            }
            throw th2;
        }
    }
}
