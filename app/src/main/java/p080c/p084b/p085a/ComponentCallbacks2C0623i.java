package p080c.p084b.p085a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p006b.p032h.p034c.C0362a;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p091u.AbstractC0707k;
import p080c.p084b.p085a.p088m.p097w.p102g.C0794c;
import p080c.p084b.p085a.p104n.C0813e;
import p080c.p084b.p085a.p104n.C0814f;
import p080c.p084b.p085a.p104n.C0822n;
import p080c.p084b.p085a.p104n.C0826r;
import p080c.p084b.p085a.p104n.C0828t;
import p080c.p084b.p085a.p104n.InterfaceC0811c;
import p080c.p084b.p085a.p104n.InterfaceC0812d;
import p080c.p084b.p085a.p104n.InterfaceC0820l;
import p080c.p084b.p085a.p104n.InterfaceC0821m;
import p080c.p084b.p085a.p104n.InterfaceC0825q;
import p080c.p084b.p085a.p107q.C0846f;
import p080c.p084b.p085a.p107q.InterfaceC0843c;
import p080c.p084b.p085a.p107q.InterfaceC0845e;
import p080c.p084b.p085a.p107q.p108j.InterfaceC0857h;
import p080c.p084b.p085a.p110r.C0862a;
import p080c.p084b.p085a.p110r.C0863b;
import p080c.p084b.p085a.p110r.C0865d;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<c.b.a.h<android.graphics.drawable.Drawable>>] */
/* JADX INFO: renamed from: c.b.a.i */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C0623i implements ComponentCallbacks2, InterfaceC0821m {

    /* JADX INFO: renamed from: l */
    public static final C0846f f3820l;

    /* JADX INFO: renamed from: b */
    public final ComponentCallbacks2C0616b f3821b;

    /* JADX INFO: renamed from: c */
    public final Context f3822c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0820l f3823d;

    /* JADX INFO: renamed from: e */
    public final C0826r f3824e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0825q f3825f;

    /* JADX INFO: renamed from: g */
    public final C0828t f3826g;

    /* JADX INFO: renamed from: h */
    public final Runnable f3827h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0811c f3828i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList<InterfaceC0845e<Object>> f3829j;

    /* JADX INFO: renamed from: k */
    public C0846f f3830k;

    /* JADX INFO: renamed from: c.b.a.i$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C0623i componentCallbacks2C0623i = ComponentCallbacks2C0623i.this;
            componentCallbacks2C0623i.f3823d.mo2515a(componentCallbacks2C0623i);
        }
    }

    /* JADX INFO: renamed from: c.b.a.i$b */
    public class b implements InterfaceC0811c.a {

        /* JADX INFO: renamed from: a */
        public final C0826r f3832a;

        public b(C0826r c0826r) {
            this.f3832a = c0826r;
        }
    }

    static {
        C0846f c0846fM2544c = new C0846f().m2544c(Bitmap.class);
        c0846fM2544c.f4635u = true;
        f3820l = c0846fM2544c;
        new C0846f().m2544c(C0794c.class).f4635u = true;
        C0846f.m2573r(AbstractC0707k.f4169b).m2550j(EnumC0620f.LOW).m2554n(true);
    }

    public ComponentCallbacks2C0623i(ComponentCallbacks2C0616b componentCallbacks2C0616b, InterfaceC0820l interfaceC0820l, InterfaceC0825q interfaceC0825q, Context context) {
        C0846f c0846f;
        C0826r c0826r = new C0826r();
        InterfaceC0812d interfaceC0812d = componentCallbacks2C0616b.f3760h;
        this.f3826g = new C0828t();
        a aVar = new a();
        this.f3827h = aVar;
        this.f3821b = componentCallbacks2C0616b;
        this.f3823d = interfaceC0820l;
        this.f3825f = interfaceC0825q;
        this.f3824e = c0826r;
        this.f3822c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(c0826r);
        Objects.requireNonNull((C0814f) interfaceC0812d);
        boolean z = C0362a.m1467a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC0811c c0813e = z ? new C0813e(applicationContext, bVar) : new C0822n();
        this.f3828i = c0813e;
        if (C0875j.m2616h()) {
            C0875j.m2614f().post(aVar);
        } else {
            interfaceC0820l.mo2515a(this);
        }
        interfaceC0820l.mo2515a(c0813e);
        this.f3829j = new CopyOnWriteArrayList<>(componentCallbacks2C0616b.f3756d.f3783e);
        C0618d c0618d = componentCallbacks2C0616b.f3756d;
        synchronized (c0618d) {
            if (c0618d.f3788j == null) {
                Objects.requireNonNull((C0617c.a) c0618d.f3782d);
                C0846f c0846f2 = new C0846f();
                c0846f2.f4635u = true;
                c0618d.f3788j = c0846f2;
            }
            c0846f = c0618d.f3788j;
        }
        synchronized (this) {
            C0846f c0846fClone = c0846f.clone();
            if (c0846fClone.f4635u && !c0846fClone.f4637w) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c0846fClone.f4637w = true;
            c0846fClone.f4635u = true;
            this.f3830k = c0846fClone;
        }
        synchronized (componentCallbacks2C0616b.f3761i) {
            if (componentCallbacks2C0616b.f3761i.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0616b.f3761i.add(this);
        }
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: e */
    public synchronized void mo2229e() {
        m2236p();
        this.f3826g.mo2229e();
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: i */
    public synchronized void mo2230i() {
        m2237q();
        this.f3826g.mo2230i();
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: k */
    public synchronized void mo2231k() {
        this.f3826g.mo2231k();
        Iterator it = C0875j.m2613e(this.f3826g.f4597b).iterator();
        while (it.hasNext()) {
            m2233m((InterfaceC0857h) it.next());
        }
        this.f3826g.f4597b.clear();
        C0826r c0826r = this.f3824e;
        Iterator it2 = ((ArrayList) C0875j.m2613e(c0826r.f4587a)).iterator();
        while (it2.hasNext()) {
            c0826r.m2531a((InterfaceC0843c) it2.next());
        }
        c0826r.f4588b.clear();
        this.f3823d.mo2516b(this);
        this.f3823d.mo2516b(this.f3828i);
        C0875j.m2614f().removeCallbacks(this.f3827h);
        ComponentCallbacks2C0616b componentCallbacks2C0616b = this.f3821b;
        synchronized (componentCallbacks2C0616b.f3761i) {
            if (!componentCallbacks2C0616b.f3761i.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C0616b.f3761i.remove(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public C0622h<Drawable> m2232l() {
        return new C0622h<>(this.f3821b, this, Drawable.class, this.f3822c);
    }

    /* JADX INFO: renamed from: m */
    public void m2233m(InterfaceC0857h<?> interfaceC0857h) {
        boolean z;
        if (interfaceC0857h == null) {
            return;
        }
        boolean zM2238r = m2238r(interfaceC0857h);
        InterfaceC0843c interfaceC0843cMo2590f = interfaceC0857h.mo2590f();
        if (zM2238r) {
            return;
        }
        ComponentCallbacks2C0616b componentCallbacks2C0616b = this.f3821b;
        synchronized (componentCallbacks2C0616b.f3761i) {
            Iterator<ComponentCallbacks2C0623i> it = componentCallbacks2C0616b.f3761i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().m2238r(interfaceC0857h)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || interfaceC0843cMo2590f == null) {
            return;
        }
        interfaceC0857h.mo2592j(null);
        interfaceC0843cMo2590f.clear();
    }

    /* JADX INFO: renamed from: n */
    public C0622h<Drawable> m2234n(File file) {
        return m2232l().m2227y(file);
    }

    /* JADX INFO: renamed from: o */
    public C0622h<Drawable> m2235o(Integer num) {
        PackageInfo packageInfo;
        C0622h<Drawable> c0622hM2232l = m2232l();
        C0622h<Drawable> c0622hM2227y = c0622hM2232l.m2227y(num);
        Context context = c0622hM2232l.f3806B;
        int i = C0862a.f4711d;
        ConcurrentMap<String, InterfaceC0645m> concurrentMap = C0863b.f4714a;
        String packageName = context.getPackageName();
        InterfaceC0645m interfaceC0645mPutIfAbsent = C0863b.f4714a.get(packageName);
        if (interfaceC0645mPutIfAbsent == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sbM2191e = a.m2191e("Cannot resolve info for");
                sbM2191e.append(context.getPackageName());
                Log.e("AppVersionSignature", sbM2191e.toString(), e);
                packageInfo = null;
            }
            C0865d c0865d = new C0865d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            interfaceC0645mPutIfAbsent = C0863b.f4714a.putIfAbsent(packageName, c0865d);
            if (interfaceC0645mPutIfAbsent == null) {
                interfaceC0645mPutIfAbsent = c0865d;
            }
        }
        return c0622hM2227y.mo2218a(new C0846f().m2553m(new C0862a(context.getResources().getConfiguration().uiMode & 48, interfaceC0645mPutIfAbsent)));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m2236p() {
        C0826r c0826r = this.f3824e;
        c0826r.f4589c = true;
        for (InterfaceC0843c interfaceC0843c : (ArrayList) C0875j.m2613e(c0826r.f4587a)) {
            if (interfaceC0843c.isRunning()) {
                interfaceC0843c.mo2562e();
                c0826r.f4588b.add(interfaceC0843c);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m2237q() {
        C0826r c0826r = this.f3824e;
        c0826r.f4589c = false;
        for (InterfaceC0843c interfaceC0843c : (ArrayList) C0875j.m2613e(c0826r.f4587a)) {
            if (!interfaceC0843c.mo2566i() && !interfaceC0843c.isRunning()) {
                interfaceC0843c.mo2563f();
            }
        }
        c0826r.f4588b.clear();
    }

    /* JADX INFO: renamed from: r */
    public synchronized boolean m2238r(InterfaceC0857h<?> interfaceC0857h) {
        InterfaceC0843c interfaceC0843cMo2590f = interfaceC0857h.mo2590f();
        if (interfaceC0843cMo2590f == null) {
            return true;
        }
        if (!this.f3824e.m2531a(interfaceC0843cMo2590f)) {
            return false;
        }
        this.f3826g.f4597b.remove(interfaceC0857h);
        interfaceC0857h.mo2592j(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3824e + ", treeNode=" + this.f3825f + "}";
    }
}
