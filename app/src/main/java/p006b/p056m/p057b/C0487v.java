package p006b.p056m.p057b;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Iterator;
import p006b.p061o.AbstractC0511p;
import p006b.p061o.C0515t;
import p006b.p061o.InterfaceC0512q;

/* JADX INFO: renamed from: b.m.b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0487v extends AbstractC0511p {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0512q f3139g = new a();

    /* JADX INFO: renamed from: e */
    public final boolean f3143e;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Fragment> f3140b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, C0487v> f3141c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final HashMap<String, C0515t> f3142d = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public boolean f3144f = false;

    /* JADX INFO: renamed from: b.m.b.v$a */
    public static class a implements InterfaceC0512q {
        /* JADX INFO: renamed from: a */
        public <T extends AbstractC0511p> T m1868a(Class<T> cls) {
            return new C0487v(true);
        }
    }

    public C0487v(boolean z) {
        this.f3143e = z;
    }

    @Override // p006b.p061o.AbstractC0511p
    /* JADX INFO: renamed from: a */
    public void mo1866a() {
        if (AbstractC0483r.m1800M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3144f = true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1867b(Fragment fragment) {
        if (this.f3140b.containsKey(fragment.f685f) && this.f3143e) {
            return this.f3144f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0487v.class != obj.getClass()) {
            return false;
        }
        C0487v c0487v = (C0487v) obj;
        return this.f3140b.equals(c0487v.f3140b) && this.f3141c.equals(c0487v.f3141c) && this.f3142d.equals(c0487v.f3142d);
    }

    public int hashCode() {
        return this.f3142d.hashCode() + ((this.f3141c.hashCode() + (this.f3140b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3140b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3141c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3142d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
