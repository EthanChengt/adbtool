package p080c.p084b.p085a.p104n;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import java.util.Set;
import p006b.p056m.p057b.AbstractC0483r;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.ComponentCallbacks2C0623i;

/* JADX INFO: renamed from: c.b.a.n.s */
/* JADX INFO: loaded from: classes.dex */
public class C0827s extends Fragment {

    /* JADX INFO: renamed from: V */
    public final C0809a f4590V;

    /* JADX INFO: renamed from: W */
    public final InterfaceC0825q f4591W;

    /* JADX INFO: renamed from: X */
    public final Set<C0827s> f4592X;

    /* JADX INFO: renamed from: Y */
    public C0827s f4593Y;

    /* JADX INFO: renamed from: Z */
    public ComponentCallbacks2C0623i f4594Z;

    /* JADX INFO: renamed from: a0 */
    public Fragment f4595a0;

    /* JADX INFO: renamed from: c.b.a.n.s$a */
    public class a implements InterfaceC0825q {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C0827s.this + "}";
        }
    }

    public C0827s() {
        C0809a c0809a = new C0809a();
        this.f4591W = new a();
        this.f4592X = new HashSet();
        this.f4590V = c0809a;
    }

    /* JADX INFO: renamed from: G0 */
    public final Fragment m2532G0() {
        Fragment fragment = this.f701v;
        return fragment != null ? fragment : this.f4595a0;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m2533H0(Context context, AbstractC0483r abstractC0483r) {
        m2534I0();
        C0827s c0827sM2529e = ComponentCallbacks2C0616b.m2205b(context).f3759g.m2529e(abstractC0483r, null);
        this.f4593Y = c0827sM2529e;
        if (equals(c0827sM2529e)) {
            return;
        }
        this.f4593Y.f4592X.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public void mo276I(Context context) {
        super.mo276I(context);
        Fragment fragment = this;
        while (true) {
            Fragment fragment2 = fragment.f701v;
            if (fragment2 == null) {
                break;
            } else {
                fragment = fragment2;
            }
        }
        AbstractC0483r abstractC0483r = fragment.f698s;
        if (abstractC0483r == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m2533H0(m309k(), abstractC0483r);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m2534I0() {
        C0827s c0827s = this.f4593Y;
        if (c0827s != null) {
            c0827s.f4592X.remove(this);
            this.f4593Y = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public void mo284Q() {
        this.f665E = true;
        this.f4590V.m2517c();
        m2534I0();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public void mo286S() {
        this.f665E = true;
        this.f4595a0 = null;
        m2534I0();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo304h0() {
        this.f665E = true;
        this.f4590V.m2518d();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo306i0() {
        this.f665E = true;
        this.f4590V.m2519e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m2532G0() + "}";
    }
}
