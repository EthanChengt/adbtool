package p080c.p084b.p085a.p088m.p091u;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p006b.p032h.p043i.InterfaceC0403c;
import b.s.m;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p091u.p094e0.ExecutorServiceC0701a;
import p080c.p084b.p085a.p107q.C0848h;
import p080c.p084b.p085a.p107q.InterfaceC0847g;
import p080c.p084b.p085a.p111s.C0870e;
import p080c.p084b.p085a.p111s.p112k.AbstractC0879d;
import p080c.p084b.p085a.p111s.p112k.C0876a;

/* JADX INFO: renamed from: c.b.a.m.u.m */
/* JADX INFO: loaded from: classes.dex */
public class C0709m<R> implements RunnableC0705i.a<R>, C0876a.d {

    /* JADX INFO: renamed from: A */
    public static final c f4197A = new c();

    /* JADX INFO: renamed from: b */
    public final e f4198b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0879d f4199c;

    /* JADX INFO: renamed from: d */
    public final C0713q.a f4200d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0403c<C0709m<?>> f4201e;

    /* JADX INFO: renamed from: f */
    public final c f4202f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0710n f4203g;

    /* JADX INFO: renamed from: h */
    public final ExecutorServiceC0701a f4204h;

    /* JADX INFO: renamed from: i */
    public final ExecutorServiceC0701a f4205i;

    /* JADX INFO: renamed from: j */
    public final ExecutorServiceC0701a f4206j;

    /* JADX INFO: renamed from: k */
    public final ExecutorServiceC0701a f4207k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f4208l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0645m f4209m;

    /* JADX INFO: renamed from: n */
    public boolean f4210n;

    /* JADX INFO: renamed from: o */
    public boolean f4211o;

    /* JADX INFO: renamed from: p */
    public boolean f4212p;

    /* JADX INFO: renamed from: q */
    public boolean f4213q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0719w<?> f4214r;

    /* JADX INFO: renamed from: s */
    public EnumC0633a f4215s;

    /* JADX INFO: renamed from: t */
    public boolean f4216t;

    /* JADX INFO: renamed from: u */
    public C0714r f4217u;

    /* JADX INFO: renamed from: v */
    public boolean f4218v;

    /* JADX INFO: renamed from: w */
    public C0713q<?> f4219w;

    /* JADX INFO: renamed from: x */
    public RunnableC0705i<R> f4220x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f4221y;

    /* JADX INFO: renamed from: z */
    public boolean f4222z;

    /* JADX INFO: renamed from: c.b.a.m.u.m$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final InterfaceC0847g f4223b;

        public a(InterfaceC0847g interfaceC0847g) {
            this.f4223b = interfaceC0847g;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0848h c0848h = (C0848h) this.f4223b;
            c0848h.f4659b.mo2621a();
            synchronized (c0848h.f4660c) {
                synchronized (C0709m.this) {
                    if (C0709m.this.f4198b.f4229b.contains(new d(this.f4223b, C0870e.f4730b))) {
                        C0709m c0709m = C0709m.this;
                        InterfaceC0847g interfaceC0847g = this.f4223b;
                        Objects.requireNonNull(c0709m);
                        try {
                            ((C0848h) interfaceC0847g).m2582o(c0709m.f4217u, 5);
                        } catch (Throwable th) {
                            throw new C0674c(th);
                        }
                    }
                    C0709m.this.m2402d();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.m$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final InterfaceC0847g f4225b;

        public b(InterfaceC0847g interfaceC0847g) {
            this.f4225b = interfaceC0847g;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0848h c0848h = (C0848h) this.f4225b;
            c0848h.f4659b.mo2621a();
            synchronized (c0848h.f4660c) {
                synchronized (C0709m.this) {
                    if (C0709m.this.f4198b.f4229b.contains(new d(this.f4225b, C0870e.f4730b))) {
                        C0709m.this.f4219w.m2408a();
                        C0709m c0709m = C0709m.this;
                        InterfaceC0847g interfaceC0847g = this.f4225b;
                        Objects.requireNonNull(c0709m);
                        try {
                            ((C0848h) interfaceC0847g).m2583p(c0709m.f4219w, c0709m.f4215s, c0709m.f4222z);
                            C0709m.this.m2406h(this.f4225b);
                        } catch (Throwable th) {
                            throw new C0674c(th);
                        }
                    }
                    C0709m.this.m2402d();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.m$c */
    public static class c {
    }

    /* JADX INFO: renamed from: c.b.a.m.u.m$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0847g f4227a;

        /* JADX INFO: renamed from: b */
        public final Executor f4228b;

        public d(InterfaceC0847g interfaceC0847g, Executor executor) {
            this.f4227a = interfaceC0847g;
            this.f4228b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f4227a.equals(((d) obj).f4227a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4227a.hashCode();
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.m$e */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: b */
        public final List<d> f4229b = new ArrayList(2);

        public boolean isEmpty() {
            return this.f4229b.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f4229b.iterator();
        }
    }

    public C0709m(ExecutorServiceC0701a executorServiceC0701a, ExecutorServiceC0701a executorServiceC0701a2, ExecutorServiceC0701a executorServiceC0701a3, ExecutorServiceC0701a executorServiceC0701a4, InterfaceC0710n interfaceC0710n, C0713q.a aVar, InterfaceC0403c<C0709m<?>> interfaceC0403c) {
        c cVar = f4197A;
        this.f4198b = new e();
        this.f4199c = new AbstractC0879d.b();
        this.f4208l = new AtomicInteger();
        this.f4204h = executorServiceC0701a;
        this.f4205i = executorServiceC0701a2;
        this.f4206j = executorServiceC0701a3;
        this.f4207k = executorServiceC0701a4;
        this.f4203g = interfaceC0710n;
        this.f4200d = aVar;
        this.f4201e = interfaceC0403c;
        this.f4202f = cVar;
    }

    @Override // p080c.p084b.p085a.p111s.p112k.C0876a.d
    /* JADX INFO: renamed from: a */
    public AbstractC0879d mo2364a() {
        return this.f4199c;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m2400b(InterfaceC0847g interfaceC0847g, Executor executor) {
        Runnable aVar;
        this.f4199c.mo2621a();
        this.f4198b.f4229b.add(new d(interfaceC0847g, executor));
        boolean z = true;
        if (this.f4216t) {
            m2403e(1);
            aVar = new b(interfaceC0847g);
        } else if (this.f4218v) {
            m2403e(1);
            aVar = new a(interfaceC0847g);
        } else {
            if (this.f4221y) {
                z = false;
            }
            m.m1958b(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    /* JADX INFO: renamed from: c */
    public void m2401c() {
        if (m2404f()) {
            return;
        }
        this.f4221y = true;
        RunnableC0705i<R> runnableC0705i = this.f4220x;
        runnableC0705i.f4117F = true;
        InterfaceC0703g interfaceC0703g = runnableC0705i.f4115D;
        if (interfaceC0703g != null) {
            interfaceC0703g.cancel();
        }
        InterfaceC0710n interfaceC0710n = this.f4203g;
        InterfaceC0645m interfaceC0645m = this.f4209m;
        C0708l c0708l = (C0708l) interfaceC0710n;
        synchronized (c0708l) {
            C0716t c0716t = c0708l.f4172a;
            Objects.requireNonNull(c0716t);
            Map<InterfaceC0645m, C0709m<?>> mapM2421a = c0716t.m2421a(this.f4213q);
            if (equals(mapM2421a.get(interfaceC0645m))) {
                mapM2421a.remove(interfaceC0645m);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2402d() {
        C0713q<?> c0713q;
        synchronized (this) {
            this.f4199c.mo2621a();
            m.m1958b(m2404f(), "Not yet complete!");
            int iDecrementAndGet = this.f4208l.decrementAndGet();
            m.m1958b(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                c0713q = this.f4219w;
                m2405g();
            } else {
                c0713q = null;
            }
        }
        if (c0713q != null) {
            c0713q.m2413f();
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m2403e(int i) {
        C0713q<?> c0713q;
        m.m1958b(m2404f(), "Not yet complete!");
        if (this.f4208l.getAndAdd(i) == 0 && (c0713q = this.f4219w) != null) {
            c0713q.m2408a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2404f() {
        return this.f4218v || this.f4216t || this.f4221y;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2405g() {
        boolean zM2385a;
        if (this.f4209m == null) {
            throw new IllegalArgumentException();
        }
        this.f4198b.f4229b.clear();
        this.f4209m = null;
        this.f4219w = null;
        this.f4214r = null;
        this.f4218v = false;
        this.f4221y = false;
        this.f4216t = false;
        this.f4222z = false;
        RunnableC0705i<R> runnableC0705i = this.f4220x;
        RunnableC0705i.e eVar = runnableC0705i.f4125h;
        synchronized (eVar) {
            eVar.f4149a = true;
            zM2385a = eVar.m2385a(false);
        }
        if (zM2385a) {
            runnableC0705i.m2381l();
        }
        this.f4220x = null;
        this.f4217u = null;
        this.f4215s = null;
        this.f4201e.mo1536a(this);
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m2406h(InterfaceC0847g interfaceC0847g) {
        this.f4199c.mo2621a();
        this.f4198b.f4229b.remove(new d(interfaceC0847g, C0870e.f4730b));
        if (this.f4198b.isEmpty()) {
            m2401c();
            if ((this.f4216t || this.f4218v) && this.f4208l.get() == 0) {
                m2405g();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2407i(RunnableC0705i<?> runnableC0705i) {
        ExecutorServiceC0701a executorServiceC0701a;
        if (this.f4211o) {
            executorServiceC0701a = this.f4206j;
        } else {
            executorServiceC0701a = this.f4212p ? this.f4207k : this.f4205i;
        }
        executorServiceC0701a.f4084a.execute(runnableC0705i);
    }
}
