package p006b.p056m.p057b;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import p006b.p078z.p079a.AbstractC0612a;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.m.b.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0488w extends AbstractC0612a {

    /* JADX INFO: renamed from: c */
    public final AbstractC0483r f3145c;

    /* JADX INFO: renamed from: g */
    public boolean f3149g;

    /* JADX INFO: renamed from: e */
    public AbstractC0452a0 f3147e = null;

    /* JADX INFO: renamed from: f */
    public Fragment f3148f = null;

    /* JADX INFO: renamed from: d */
    public final int f3146d = 0;

    @Deprecated
    public AbstractC0488w(AbstractC0483r abstractC0483r) {
        this.f3145c = abstractC0483r;
    }

    /* JADX INFO: renamed from: e */
    public static String m1869e(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // p006b.p078z.p079a.AbstractC0612a
    /* JADX INFO: renamed from: a */
    public void mo1870a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3147e == null) {
            this.f3147e = new C0451a(this.f3145c);
        }
        C0451a c0451a = (C0451a) this.f3147e;
        Objects.requireNonNull(c0451a);
        AbstractC0483r abstractC0483r = fragment.f698s;
        if (abstractC0483r != null && abstractC0483r != c0451a.f2929q) {
            StringBuilder sbM2191e = a.m2191e("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            sbM2191e.append(fragment.toString());
            sbM2191e.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sbM2191e.toString());
        }
        c0451a.m1724b(new AbstractC0452a0.a(6, fragment));
        if (fragment.equals(this.f3148f)) {
            this.f3148f = null;
        }
    }

    @Override // p006b.p078z.p079a.AbstractC0612a
    /* JADX INFO: renamed from: b */
    public void mo1871b(ViewGroup viewGroup) {
        AbstractC0452a0 abstractC0452a0 = this.f3147e;
        if (abstractC0452a0 != null) {
            if (!this.f3149g) {
                try {
                    this.f3149g = true;
                    abstractC0452a0.mo1714d();
                    this.f3149g = false;
                } catch (Throwable th) {
                    this.f3149g = false;
                    throw th;
                }
            }
            this.f3147e = null;
        }
    }

    @Override // p006b.p078z.p079a.AbstractC0612a
    /* JADX INFO: renamed from: d */
    public void mo1872d(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
