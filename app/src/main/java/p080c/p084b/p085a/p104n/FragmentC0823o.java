package p080c.p084b.p085a.p104n;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.ComponentCallbacks2C0623i;

/* JADX INFO: renamed from: c.b.a.n.o */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentC0823o extends Fragment {

    /* JADX INFO: renamed from: b */
    public final C0809a f4573b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0825q f4574c;

    /* JADX INFO: renamed from: d */
    public final Set<FragmentC0823o> f4575d;

    /* JADX INFO: renamed from: e */
    public ComponentCallbacks2C0623i f4576e;

    /* JADX INFO: renamed from: f */
    public FragmentC0823o f4577f;

    /* JADX INFO: renamed from: g */
    public Fragment f4578g;

    /* JADX INFO: renamed from: c.b.a.n.o$a */
    public class a implements InterfaceC0825q {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC0823o.this + "}";
        }
    }

    public FragmentC0823o() {
        C0809a c0809a = new C0809a();
        this.f4574c = new a();
        this.f4575d = new HashSet();
        this.f4573b = c0809a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2522a(Activity activity) {
        m2523b();
        C0824p c0824p = ComponentCallbacks2C0616b.m2205b(activity).f3759g;
        Objects.requireNonNull(c0824p);
        FragmentC0823o fragmentC0823oM2528d = c0824p.m2528d(activity.getFragmentManager(), null);
        this.f4577f = fragmentC0823oM2528d;
        if (equals(fragmentC0823oM2528d)) {
            return;
        }
        this.f4577f.f4575d.add(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m2523b() {
        FragmentC0823o fragmentC0823o = this.f4577f;
        if (fragmentC0823o != null) {
            fragmentC0823o.f4575d.remove(this);
            this.f4577f = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m2522a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f4573b.m2517c();
        m2523b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m2523b();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f4573b.m2518d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f4573b.m2519e();
    }

    @Override // android.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f4578g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
