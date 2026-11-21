package p080c.p084b.p085a.p104n;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p006b.p056m.p057b.AbstractC0483r;
import p006b.p056m.p057b.ActivityC0459e;
import p006b.p056m.p057b.C0451a;
import p080c.p084b.p085a.C0617c;
import p080c.p084b.p085a.C0619e;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.ComponentCallbacks2C0623i;
import p080c.p084b.p085a.p088m.p097w.p098c.C0774r;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.n.p */
/* JADX INFO: loaded from: classes.dex */
public class C0824p implements Handler.Callback {

    /* JADX INFO: renamed from: g */
    public static final b f4580g = new a();

    /* JADX INFO: renamed from: a */
    public volatile ComponentCallbacks2C0623i f4581a;

    /* JADX INFO: renamed from: b */
    public final Map<FragmentManager, FragmentC0823o> f4582b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<AbstractC0483r, C0827s> f4583c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Handler f4584d;

    /* JADX INFO: renamed from: e */
    public final b f4585e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0819k f4586f;

    /* JADX INFO: renamed from: c.b.a.n.p$a */
    public class a implements b {
    }

    /* JADX INFO: renamed from: c.b.a.n.p$b */
    public interface b {
    }

    public C0824p(b bVar, C0619e c0619e) {
        new Bundle();
        this.f4585e = bVar == null ? f4580g : bVar;
        this.f4584d = new Handler(Looper.getMainLooper(), this);
        this.f4586f = (C0774r.f4461h && C0774r.f4460g) ? c0619e.f3789a.containsKey(C0617c.d.class) ? new ComponentCallbacks2C0817i() : new C0818j() : new C0815g();
    }

    /* JADX INFO: renamed from: a */
    public static Activity m2524a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m2524a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2525f(Context context) {
        Activity activityM2524a = m2524a(context);
        return activityM2524a == null || !activityM2524a.isFinishing();
    }

    /* JADX INFO: renamed from: b */
    public ComponentCallbacks2C0623i m2526b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C0875j.m2617i() && !(context instanceof Application)) {
            if (context instanceof ActivityC0459e) {
                return m2527c((ActivityC0459e) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (C0875j.m2616h()) {
                    return m2526b(activity.getApplicationContext());
                }
                if (activity instanceof ActivityC0459e) {
                    return m2527c((ActivityC0459e) activity);
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f4586f.mo2521a(activity);
                FragmentManager fragmentManager = activity.getFragmentManager();
                boolean zM2525f = m2525f(activity);
                FragmentC0823o fragmentC0823oM2528d = m2528d(fragmentManager, null);
                ComponentCallbacks2C0623i componentCallbacks2C0623i = fragmentC0823oM2528d.f4576e;
                if (componentCallbacks2C0623i != null) {
                    return componentCallbacks2C0623i;
                }
                ComponentCallbacks2C0616b componentCallbacks2C0616bM2205b = ComponentCallbacks2C0616b.m2205b(activity);
                b bVar = this.f4585e;
                C0809a c0809a = fragmentC0823oM2528d.f4573b;
                InterfaceC0825q interfaceC0825q = fragmentC0823oM2528d.f4574c;
                Objects.requireNonNull((a) bVar);
                ComponentCallbacks2C0623i componentCallbacks2C0623i2 = new ComponentCallbacks2C0623i(componentCallbacks2C0616bM2205b, c0809a, interfaceC0825q, activity);
                if (zM2525f) {
                    componentCallbacks2C0623i2.mo2230i();
                }
                fragmentC0823oM2528d.f4576e = componentCallbacks2C0623i2;
                return componentCallbacks2C0623i2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m2526b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f4581a == null) {
            synchronized (this) {
                if (this.f4581a == null) {
                    ComponentCallbacks2C0616b componentCallbacks2C0616bM2205b2 = ComponentCallbacks2C0616b.m2205b(context.getApplicationContext());
                    b bVar2 = this.f4585e;
                    C0810b c0810b = new C0810b();
                    C0816h c0816h = new C0816h();
                    Context applicationContext = context.getApplicationContext();
                    Objects.requireNonNull((a) bVar2);
                    this.f4581a = new ComponentCallbacks2C0623i(componentCallbacks2C0616bM2205b2, c0810b, c0816h, applicationContext);
                }
            }
        }
        return this.f4581a;
    }

    /* JADX INFO: renamed from: c */
    public ComponentCallbacks2C0623i m2527c(ActivityC0459e activityC0459e) {
        if (C0875j.m2616h()) {
            return m2526b(activityC0459e.getApplicationContext());
        }
        if (activityC0459e.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f4586f.mo2521a(activityC0459e);
        return m2530g(activityC0459e, activityC0459e.m1734m(), null, m2525f(activityC0459e));
    }

    /* JADX INFO: renamed from: d */
    public final FragmentC0823o m2528d(FragmentManager fragmentManager, Fragment fragment) {
        FragmentC0823o fragmentC0823o = (FragmentC0823o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC0823o == null && (fragmentC0823o = this.f4582b.get(fragmentManager)) == null) {
            fragmentC0823o = new FragmentC0823o();
            fragmentC0823o.f4578g = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                fragmentC0823o.m2522a(fragment.getActivity());
            }
            this.f4582b.put(fragmentManager, fragmentC0823o);
            fragmentManager.beginTransaction().add(fragmentC0823o, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f4584d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC0823o;
    }

    /* JADX INFO: renamed from: e */
    public final C0827s m2529e(AbstractC0483r abstractC0483r, androidx.fragment.app.Fragment fragment) {
        C0827s c0827s = (C0827s) abstractC0483r.m1808H("com.bumptech.glide.manager");
        if (c0827s == null && (c0827s = this.f4583c.get(abstractC0483r)) == null) {
            c0827s = new C0827s();
            c0827s.f4595a0 = fragment;
            if (fragment != null && fragment.m309k() != null) {
                androidx.fragment.app.Fragment fragment2 = fragment;
                while (true) {
                    androidx.fragment.app.Fragment fragment3 = fragment2.f701v;
                    if (fragment3 == null) {
                        break;
                    }
                    fragment2 = fragment3;
                }
                AbstractC0483r abstractC0483r2 = fragment2.f698s;
                if (abstractC0483r2 != null) {
                    c0827s.m2533H0(fragment.m309k(), abstractC0483r2);
                }
            }
            this.f4583c.put(abstractC0483r, c0827s);
            C0451a c0451a = new C0451a(abstractC0483r);
            c0451a.mo1715e(0, c0827s, "com.bumptech.glide.manager", 1);
            c0451a.m1718i(true);
            this.f4584d.obtainMessage(2, abstractC0483r).sendToTarget();
        }
        return c0827s;
    }

    /* JADX INFO: renamed from: g */
    public final ComponentCallbacks2C0623i m2530g(Context context, AbstractC0483r abstractC0483r, androidx.fragment.app.Fragment fragment, boolean z) {
        C0827s c0827sM2529e = m2529e(abstractC0483r, fragment);
        ComponentCallbacks2C0623i componentCallbacks2C0623i = c0827sM2529e.f4594Z;
        if (componentCallbacks2C0623i != null) {
            return componentCallbacks2C0623i;
        }
        ComponentCallbacks2C0616b componentCallbacks2C0616bM2205b = ComponentCallbacks2C0616b.m2205b(context);
        b bVar = this.f4585e;
        C0809a c0809a = c0827sM2529e.f4590V;
        InterfaceC0825q interfaceC0825q = c0827sM2529e.f4591W;
        Objects.requireNonNull((a) bVar);
        ComponentCallbacks2C0623i componentCallbacks2C0623i2 = new ComponentCallbacks2C0623i(componentCallbacks2C0616bM2205b, c0809a, interfaceC0825q, context);
        if (z) {
            componentCallbacks2C0623i2.mo2230i();
        }
        c0827sM2529e.f4594Z = componentCallbacks2C0623i2;
        return componentCallbacks2C0623i2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object objRemove = null;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
                obj2 = null;
            } else {
                obj = (AbstractC0483r) message.obj;
                map = this.f4583c;
            }
            if (z && objRemove == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        }
        obj = (FragmentManager) message.obj;
        map = this.f4582b;
        Object obj3 = obj;
        objRemove = map.remove(obj);
        obj2 = obj3;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }
}
