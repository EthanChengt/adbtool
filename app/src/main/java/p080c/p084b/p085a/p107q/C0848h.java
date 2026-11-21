package p080c.p084b.p085a.p107q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import c.a.a.a.a;
import p080c.p084b.p085a.C0617c;
import p080c.p084b.p085a.C0618d;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p091u.C0708l;
import p080c.p084b.p085a.p088m.p091u.C0714r;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0734l;
import p080c.p084b.p085a.p088m.p097w.p100e.C0785a;
import p080c.p084b.p085a.p107q.p108j.InterfaceC0856g;
import p080c.p084b.p085a.p107q.p108j.InterfaceC0857h;
import p080c.p084b.p085a.p107q.p109k.C0859a;
import p080c.p084b.p085a.p107q.p109k.InterfaceC0861c;
import p080c.p084b.p085a.p111s.C0871f;
import p080c.p084b.p085a.p111s.C0875j;
import p080c.p084b.p085a.p111s.p112k.AbstractC0879d;

/* JADX INFO: renamed from: c.b.a.q.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0848h<R> implements InterfaceC0843c, InterfaceC0856g, InterfaceC0847g {

    /* JADX INFO: renamed from: D */
    public static final boolean f4654D = Log.isLoggable("Request", 2);

    /* JADX INFO: renamed from: A */
    public int f4655A;

    /* JADX INFO: renamed from: B */
    public boolean f4656B;

    /* JADX INFO: renamed from: C */
    public RuntimeException f4657C;

    /* JADX INFO: renamed from: a */
    public final String f4658a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0879d f4659b;

    /* JADX INFO: renamed from: c */
    public final Object f4660c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0845e<R> f4661d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0844d f4662e;

    /* JADX INFO: renamed from: f */
    public final Context f4663f;

    /* JADX INFO: renamed from: g */
    public final C0618d f4664g;

    /* JADX INFO: renamed from: h */
    public final Object f4665h;

    /* JADX INFO: renamed from: i */
    public final Class<R> f4666i;

    /* JADX INFO: renamed from: j */
    public final AbstractC0841a<?> f4667j;

    /* JADX INFO: renamed from: k */
    public final int f4668k;

    /* JADX INFO: renamed from: l */
    public final int f4669l;

    /* JADX INFO: renamed from: m */
    public final EnumC0620f f4670m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC0857h<R> f4671n;

    /* JADX INFO: renamed from: o */
    public final List<InterfaceC0845e<R>> f4672o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0861c<? super R> f4673p;

    /* JADX INFO: renamed from: q */
    public final Executor f4674q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0719w<R> f4675r;

    /* JADX INFO: renamed from: s */
    public C0708l.d f4676s;

    /* JADX INFO: renamed from: t */
    public long f4677t;

    /* JADX INFO: renamed from: u */
    public volatile C0708l f4678u;

    /* JADX INFO: renamed from: v */
    public a f4679v;

    /* JADX INFO: renamed from: w */
    public Drawable f4680w;

    /* JADX INFO: renamed from: x */
    public Drawable f4681x;

    /* JADX INFO: renamed from: y */
    public Drawable f4682y;

    /* JADX INFO: renamed from: z */
    public int f4683z;

    /* JADX INFO: renamed from: c.b.a.q.h$a */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public C0848h(Context context, C0618d c0618d, Object obj, Object obj2, Class<R> cls, AbstractC0841a<?> abstractC0841a, int i, int i2, EnumC0620f enumC0620f, InterfaceC0857h<R> interfaceC0857h, InterfaceC0845e<R> interfaceC0845e, List<InterfaceC0845e<R>> list, InterfaceC0844d interfaceC0844d, C0708l c0708l, InterfaceC0861c<? super R> interfaceC0861c, Executor executor) {
        this.f4658a = f4654D ? String.valueOf(hashCode()) : null;
        this.f4659b = new AbstractC0879d.b();
        this.f4660c = obj;
        this.f4663f = context;
        this.f4664g = c0618d;
        this.f4665h = obj2;
        this.f4666i = cls;
        this.f4667j = abstractC0841a;
        this.f4668k = i;
        this.f4669l = i2;
        this.f4670m = enumC0620f;
        this.f4671n = interfaceC0857h;
        this.f4661d = interfaceC0845e;
        this.f4672o = list;
        this.f4662e = interfaceC0844d;
        this.f4678u = c0708l;
        this.f4673p = interfaceC0861c;
        this.f4674q = executor;
        this.f4679v = a.PENDING;
        if (this.f4657C == null && c0618d.f3786h.f3789a.containsKey(C0617c.c.class)) {
            this.f4657C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: a */
    public boolean mo2558a() {
        boolean z;
        synchronized (this.f4660c) {
            z = this.f4679v == a.COMPLETE;
        }
        return z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0105 */
    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0856g
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2574b(int r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p080c.p084b.p085a.p107q.C0848h.mo2574b(int, int):void");
    }

    /* JADX INFO: renamed from: c */
    public final void m2575c() {
        if (this.f4656B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    public void clear() {
        synchronized (this.f4660c) {
            m2575c();
            this.f4659b.mo2621a();
            a aVar = this.f4679v;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            m2576d();
            InterfaceC0719w<R> interfaceC0719w = this.f4675r;
            if (interfaceC0719w != null) {
                this.f4675r = null;
            } else {
                interfaceC0719w = null;
            }
            InterfaceC0844d interfaceC0844d = this.f4662e;
            if (interfaceC0844d == null || interfaceC0844d.mo2569l(this)) {
                this.f4671n.mo2511g(m2578k());
            }
            this.f4679v = aVar2;
            if (interfaceC0719w != null) {
                this.f4678u.m2397f(interfaceC0719w);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2576d() {
        m2575c();
        this.f4659b.mo2621a();
        this.f4671n.mo2587a(this);
        C0708l.d dVar = this.f4676s;
        if (dVar != null) {
            synchronized (C0708l.this) {
                dVar.f4194a.m2406h(dVar.f4195b);
            }
            this.f4676s = null;
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: e */
    public void mo2562e() {
        synchronized (this.f4660c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: f */
    public void mo2563f() {
        synchronized (this.f4660c) {
            m2575c();
            this.f4659b.mo2621a();
            int i = C0871f.f4732b;
            this.f4677t = SystemClock.elapsedRealtimeNanos();
            if (this.f4665h == null) {
                if (C0875j.m2618j(this.f4668k, this.f4669l)) {
                    this.f4683z = this.f4668k;
                    this.f4655A = this.f4669l;
                }
                m2582o(new C0714r("Received null model"), m2577g() == null ? 5 : 3);
                return;
            }
            a aVar = this.f4679v;
            a aVar2 = a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (aVar == a.COMPLETE) {
                m2583p(this.f4675r, EnumC0633a.MEMORY_CACHE, false);
                return;
            }
            a aVar3 = a.WAITING_FOR_SIZE;
            this.f4679v = aVar3;
            if (C0875j.m2618j(this.f4668k, this.f4669l)) {
                mo2574b(this.f4668k, this.f4669l);
            } else {
                this.f4671n.mo2591h(this);
            }
            a aVar4 = this.f4679v;
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                InterfaceC0844d interfaceC0844d = this.f4662e;
                if (interfaceC0844d == null || interfaceC0844d.mo2568k(this)) {
                    this.f4671n.mo2588b(m2578k());
                }
            }
            if (f4654D) {
                m2581n("finished run method in " + C0871f.m2603a(this.f4677t));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m2577g() {
        int i;
        if (this.f4682y == null) {
            AbstractC0841a<?> abstractC0841a = this.f4667j;
            Drawable drawable = abstractC0841a.f4630p;
            this.f4682y = drawable;
            if (drawable == null && (i = abstractC0841a.f4631q) > 0) {
                this.f4682y = m2580m(i);
            }
        }
        return this.f4682y;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: h */
    public boolean mo2565h(InterfaceC0843c interfaceC0843c) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC0841a<?> abstractC0841a;
        EnumC0620f enumC0620f;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        AbstractC0841a<?> abstractC0841a2;
        EnumC0620f enumC0620f2;
        int size2;
        boolean zM2441a;
        if (!(interfaceC0843c instanceof C0848h)) {
            return false;
        }
        synchronized (this.f4660c) {
            i = this.f4668k;
            i2 = this.f4669l;
            obj = this.f4665h;
            cls = this.f4666i;
            abstractC0841a = this.f4667j;
            enumC0620f = this.f4670m;
            List<InterfaceC0845e<R>> list = this.f4672o;
            size = list != null ? list.size() : 0;
        }
        C0848h c0848h = (C0848h) interfaceC0843c;
        synchronized (c0848h.f4660c) {
            i3 = c0848h.f4668k;
            i4 = c0848h.f4669l;
            obj2 = c0848h.f4665h;
            cls2 = c0848h.f4666i;
            abstractC0841a2 = c0848h.f4667j;
            enumC0620f2 = c0848h.f4670m;
            List<InterfaceC0845e<R>> list2 = c0848h.f4672o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = C0875j.f4742a;
            if (obj == null) {
                zM2441a = obj2 == null;
            } else {
                zM2441a = obj instanceof InterfaceC0734l ? ((InterfaceC0734l) obj).m2441a(obj2) : obj.equals(obj2);
            }
            if (zM2441a && cls.equals(cls2) && abstractC0841a.equals(abstractC0841a2) && enumC0620f == enumC0620f2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: i */
    public boolean mo2566i() {
        boolean z;
        synchronized (this.f4660c) {
            z = this.f4679v == a.COMPLETE;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4660c) {
            a aVar = this.f4679v;
            z = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: j */
    public boolean mo2567j() {
        boolean z;
        synchronized (this.f4660c) {
            z = this.f4679v == a.CLEARED;
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m2578k() {
        int i;
        if (this.f4681x == null) {
            AbstractC0841a<?> abstractC0841a = this.f4667j;
            Drawable drawable = abstractC0841a.f4622h;
            this.f4681x = drawable;
            if (drawable == null && (i = abstractC0841a.f4623i) > 0) {
                this.f4681x = m2580m(i);
            }
        }
        return this.f4681x;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2579l() {
        InterfaceC0844d interfaceC0844d = this.f4662e;
        return interfaceC0844d == null || !interfaceC0844d.mo2560c().mo2558a();
    }

    /* JADX INFO: renamed from: m */
    public final Drawable m2580m(int i) {
        Resources.Theme theme = this.f4667j.f4636v;
        if (theme == null) {
            theme = this.f4663f.getTheme();
        }
        C0618d c0618d = this.f4664g;
        return C0785a.m2496a(c0618d, c0618d, i, theme);
    }

    /* JADX INFO: renamed from: n */
    public final void m2581n(String str) {
        Log.v("Request", str + " this: " + this.f4658a);
    }

    /* JADX INFO: renamed from: o */
    public final void m2582o(C0714r c0714r, int i) {
        boolean zM2572b;
        this.f4659b.mo2621a();
        synchronized (this.f4660c) {
            Objects.requireNonNull(c0714r);
            int i2 = this.f4664g.f3787i;
            if (i2 <= i) {
                Log.w("Glide", "Load failed for " + this.f4665h + " with size [" + this.f4683z + "x" + this.f4655A + "]", c0714r);
                if (i2 <= 4) {
                    c0714r.m2418e("Glide");
                }
            }
            this.f4676s = null;
            this.f4679v = a.FAILED;
            boolean z = true;
            this.f4656B = true;
            try {
                List<InterfaceC0845e<R>> list = this.f4672o;
                if (list != null) {
                    Iterator<InterfaceC0845e<R>> it = list.iterator();
                    zM2572b = false;
                    while (it.hasNext()) {
                        zM2572b |= it.next().m2572b(c0714r, this.f4665h, this.f4671n, m2579l());
                    }
                } else {
                    zM2572b = false;
                }
                InterfaceC0845e<R> interfaceC0845e = this.f4661d;
                if (interfaceC0845e == null || !interfaceC0845e.m2572b(c0714r, this.f4665h, this.f4671n, m2579l())) {
                    z = false;
                }
                if (!(zM2572b | z)) {
                    m2585r();
                }
                this.f4656B = false;
                InterfaceC0844d interfaceC0844d = this.f4662e;
                if (interfaceC0844d != null) {
                    interfaceC0844d.mo2561d(this);
                }
            } catch (Throwable th) {
                this.f4656B = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2583p(InterfaceC0719w<?> interfaceC0719w, EnumC0633a enumC0633a, boolean z) {
        this.f4659b.mo2621a();
        InterfaceC0719w<?> interfaceC0719w2 = null;
        try {
            synchronized (this.f4660c) {
                try {
                    this.f4676s = null;
                    if (interfaceC0719w == null) {
                        m2582o(new C0714r("Expected to receive a Resource<R> with an object of " + this.f4666i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object objMo2409b = interfaceC0719w.mo2409b();
                    try {
                        if (objMo2409b != null && this.f4666i.isAssignableFrom(objMo2409b.getClass())) {
                            InterfaceC0844d interfaceC0844d = this.f4662e;
                            if (interfaceC0844d == null || interfaceC0844d.mo2559b(this)) {
                                m2584q(interfaceC0719w, objMo2409b, enumC0633a);
                                return;
                            }
                            this.f4675r = null;
                            this.f4679v = a.COMPLETE;
                            this.f4678u.m2397f(interfaceC0719w);
                            return;
                        }
                        this.f4675r = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f4666i);
                        sb.append(" but instead got ");
                        sb.append(objMo2409b != null ? objMo2409b.getClass() : "");
                        sb.append("{");
                        sb.append(objMo2409b);
                        sb.append("} inside Resource{");
                        sb.append(interfaceC0719w);
                        sb.append("}.");
                        sb.append(objMo2409b != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        m2582o(new C0714r(sb.toString()), 5);
                        this.f4678u.m2397f(interfaceC0719w);
                    } catch (Throwable th) {
                        interfaceC0719w2 = interfaceC0719w;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC0719w2 != null) {
                this.f4678u.m2397f(interfaceC0719w2);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2584q(InterfaceC0719w interfaceC0719w, Object obj, EnumC0633a enumC0633a) {
        boolean zM2571a;
        boolean zM2579l = m2579l();
        this.f4679v = a.COMPLETE;
        this.f4675r = interfaceC0719w;
        if (this.f4664g.f3787i <= 3) {
            StringBuilder sbM2191e = a.m2191e("Finished loading ");
            sbM2191e.append(obj.getClass().getSimpleName());
            sbM2191e.append(" from ");
            sbM2191e.append(enumC0633a);
            sbM2191e.append(" for ");
            sbM2191e.append(this.f4665h);
            sbM2191e.append(" with size [");
            sbM2191e.append(this.f4683z);
            sbM2191e.append("x");
            sbM2191e.append(this.f4655A);
            sbM2191e.append("] in ");
            sbM2191e.append(C0871f.m2603a(this.f4677t));
            sbM2191e.append(" ms");
            Log.d("Glide", sbM2191e.toString());
        }
        boolean z = true;
        this.f4656B = true;
        try {
            List<InterfaceC0845e<R>> list = this.f4672o;
            if (list != null) {
                Iterator<InterfaceC0845e<R>> it = list.iterator();
                zM2571a = false;
                while (it.hasNext()) {
                    zM2571a |= it.next().m2571a(obj, this.f4665h, this.f4671n, enumC0633a, zM2579l);
                }
            } else {
                zM2571a = false;
            }
            InterfaceC0845e<R> interfaceC0845e = this.f4661d;
            if (interfaceC0845e == null || !interfaceC0845e.m2571a(obj, this.f4665h, this.f4671n, enumC0633a, zM2579l)) {
                z = false;
            }
            if (!(z | zM2571a)) {
                Objects.requireNonNull(this.f4673p);
                this.f4671n.mo2510c(obj, C0859a.f4709a);
            }
            this.f4656B = false;
            InterfaceC0844d interfaceC0844d = this.f4662e;
            if (interfaceC0844d != null) {
                interfaceC0844d.mo2564g(this);
            }
        } catch (Throwable th) {
            this.f4656B = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2585r() {
        int i;
        InterfaceC0844d interfaceC0844d = this.f4662e;
        if (interfaceC0844d == null || interfaceC0844d.mo2568k(this)) {
            Drawable drawableM2577g = this.f4665h == null ? m2577g() : null;
            if (drawableM2577g == null) {
                if (this.f4680w == null) {
                    AbstractC0841a<?> abstractC0841a = this.f4667j;
                    Drawable drawable = abstractC0841a.f4620f;
                    this.f4680w = drawable;
                    if (drawable == null && (i = abstractC0841a.f4621g) > 0) {
                        this.f4680w = m2580m(i);
                    }
                }
                drawableM2577g = this.f4680w;
            }
            if (drawableM2577g == null) {
                drawableM2577g = m2578k();
            }
            this.f4671n.mo2589d(drawableM2577g);
        }
    }
}
