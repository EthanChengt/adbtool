package p006b.p056m.p057b;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p006b.p032h.p043i.C0401a;
import p006b.p061o.AbstractC0499d;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.m.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0451a extends AbstractC0452a0 implements AbstractC0483r.e {

    /* JADX INFO: renamed from: q */
    public final AbstractC0483r f2929q;

    /* JADX INFO: renamed from: r */
    public boolean f2930r;

    /* JADX INFO: renamed from: s */
    public int f2931s;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0451a(AbstractC0483r abstractC0483r) {
        C0477n c0477nM1811K = abstractC0483r.m1811K();
        AbstractC0479o<?> abstractC0479o = abstractC0483r.f3108n;
        super(c0477nM1811K, abstractC0479o != null ? abstractC0479o.f3086c.getClassLoader() : null);
        this.f2931s = -1;
        this.f2929q = abstractC0483r;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1711o(AbstractC0452a0.a aVar) {
        Fragment fragment = aVar.f2949b;
        if (fragment == null || !fragment.f691l || fragment.f667G == null || fragment.f661A || fragment.f705z) {
            return false;
        }
        Fragment.C0088a c0088a = fragment.f670J;
        return false;
    }

    @Override // p006b.p056m.p057b.AbstractC0483r.e
    /* JADX INFO: renamed from: a */
    public boolean mo1712a(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC0483r.m1800M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2938g) {
            return true;
        }
        AbstractC0483r abstractC0483r = this.f2929q;
        if (abstractC0483r.f3098d == null) {
            abstractC0483r.f3098d = new ArrayList<>();
        }
        abstractC0483r.f3098d.add(this);
        return true;
    }

    @Override // p006b.p056m.p057b.AbstractC0452a0
    /* JADX INFO: renamed from: c */
    public int mo1713c() {
        return m1718i(false);
    }

    @Override // p006b.p056m.p057b.AbstractC0452a0
    /* JADX INFO: renamed from: d */
    public void mo1714d() {
        if (this.f2938g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2939h = false;
        this.f2929q.m1803C(this, true);
    }

    @Override // p006b.p056m.p057b.AbstractC0452a0
    /* JADX INFO: renamed from: e */
    public void mo1715e(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sbM2191e = a.m2191e("Fragment ");
            sbM2191e.append(cls.getCanonicalName());
            sbM2191e.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sbM2191e.toString());
        }
        if (str != null) {
            String str2 = fragment.f704y;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f704y + " now " + str);
            }
            fragment.f704y = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.f702w;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f702w + " now " + i);
            }
            fragment.f702w = i;
            fragment.f703x = i;
        }
        m1724b(new AbstractC0452a0.a(i2, fragment));
        fragment.f698s = this.f2929q;
    }

    @Override // p006b.p056m.p057b.AbstractC0452a0
    /* JADX INFO: renamed from: g */
    public AbstractC0452a0 mo1716g(Fragment fragment, AbstractC0499d.b bVar) {
        if (fragment.f698s != this.f2929q) {
            StringBuilder sbM2191e = a.m2191e("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sbM2191e.append(this.f2929q);
            throw new IllegalArgumentException(sbM2191e.toString());
        }
        AbstractC0499d.b bVar2 = AbstractC0499d.b.CREATED;
        if (bVar.compareTo(bVar2) >= 0) {
            m1724b(new AbstractC0452a0.a(10, fragment, bVar));
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + bVar2);
    }

    /* JADX INFO: renamed from: h */
    public void m1717h(int i) {
        if (this.f2938g) {
            if (AbstractC0483r.m1800M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f2932a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0452a0.a aVar = this.f2932a.get(i2);
                Fragment fragment = aVar.f2949b;
                if (fragment != null) {
                    fragment.f697r += i;
                    if (AbstractC0483r.m1800M(2)) {
                        StringBuilder sbM2191e = a.m2191e("Bump nesting of ");
                        sbM2191e.append(aVar.f2949b);
                        sbM2191e.append(" to ");
                        sbM2191e.append(aVar.f2949b.f697r);
                        Log.v("FragmentManager", sbM2191e.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public int m1718i(boolean z) {
        if (this.f2930r) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0483r.m1800M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0401a("FragmentManager"));
            m1719j("  ", printWriter, true);
            printWriter.close();
        }
        this.f2930r = true;
        this.f2931s = this.f2938g ? this.f2929q.f3103i.getAndIncrement() : -1;
        this.f2929q.m1862z(this, z);
        return this.f2931s;
    }

    /* JADX INFO: renamed from: j */
    public void m1719j(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2940i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2931s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2930r);
            if (this.f2937f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2937f));
            }
            if (this.f2933b != 0 || this.f2934c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2933b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2934c));
            }
            if (this.f2935d != 0 || this.f2936e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2935d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2936e));
            }
            if (this.f2941j != 0 || this.f2942k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2941j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2942k);
            }
            if (this.f2943l != 0 || this.f2944m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2943l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2944m);
            }
        }
        if (this.f2932a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2932a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0452a0.a aVar = this.f2932a.get(i);
            switch (aVar.f2948a) {
                case 0:
                    string = "NULL";
                    break;
                case 1:
                    string = "ADD";
                    break;
                case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sbM2191e = a.m2191e("cmd=");
                    sbM2191e.append(aVar.f2948a);
                    string = sbM2191e.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(aVar.f2949b);
            if (z) {
                if (aVar.f2950c != 0 || aVar.f2951d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2950c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2951d));
                }
                if (aVar.f2952e != 0 || aVar.f2953f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2952e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2953f));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1720k() {
        int size = this.f2932a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0452a0.a aVar = this.f2932a.get(i);
            Fragment fragment = aVar.f2949b;
            if (fragment != null) {
                int i2 = this.f2937f;
                if (fragment.f670J != null || i2 != 0) {
                    fragment.m300f();
                    fragment.f670J.f711e = i2;
                }
            }
            switch (aVar.f2948a) {
                case 1:
                    fragment.m340z0(aVar.f2950c);
                    this.f2929q.m1835e0(fragment, false);
                    this.f2929q.m1828b(fragment);
                    break;
                case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                default:
                    StringBuilder sbM2191e = a.m2191e("Unknown cmd: ");
                    sbM2191e.append(aVar.f2948a);
                    throw new IllegalArgumentException(sbM2191e.toString());
                case 3:
                    fragment.m340z0(aVar.f2951d);
                    this.f2929q.m1824Y(fragment);
                    break;
                case 4:
                    fragment.m340z0(aVar.f2951d);
                    this.f2929q.m1812L(fragment);
                    break;
                case 5:
                    fragment.m340z0(aVar.f2950c);
                    this.f2929q.m1835e0(fragment, false);
                    this.f2929q.m1843i0(fragment);
                    break;
                case 6:
                    fragment.m340z0(aVar.f2951d);
                    this.f2929q.m1842i(fragment);
                    break;
                case 7:
                    fragment.m340z0(aVar.f2950c);
                    this.f2929q.m1835e0(fragment, false);
                    this.f2929q.m1832d(fragment);
                    break;
                case 8:
                    this.f2929q.m1839g0(fragment);
                    break;
                case 9:
                    this.f2929q.m1839g0(null);
                    break;
                case 10:
                    this.f2929q.m1837f0(fragment, aVar.f2955h);
                    break;
            }
            if (!this.f2947p && aVar.f2948a != 1 && fragment != null) {
                this.f2929q.m1817R(fragment);
            }
        }
        if (this.f2947p) {
            return;
        }
        AbstractC0483r abstractC0483r = this.f2929q;
        abstractC0483r.m1818S(abstractC0483r.f3107m, true);
    }

    /* JADX INFO: renamed from: l */
    public void m1721l(boolean z) {
        for (int size = this.f2932a.size() - 1; size >= 0; size--) {
            AbstractC0452a0.a aVar = this.f2932a.get(size);
            Fragment fragment = aVar.f2949b;
            if (fragment != null) {
                int i = this.f2937f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                if (fragment.f670J != null || i2 != 0) {
                    fragment.m300f();
                    fragment.f670J.f711e = i2;
                }
            }
            switch (aVar.f2948a) {
                case 1:
                    fragment.m340z0(aVar.f2953f);
                    this.f2929q.m1835e0(fragment, true);
                    this.f2929q.m1824Y(fragment);
                    break;
                case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                default:
                    StringBuilder sbM2191e = a.m2191e("Unknown cmd: ");
                    sbM2191e.append(aVar.f2948a);
                    throw new IllegalArgumentException(sbM2191e.toString());
                case 3:
                    fragment.m340z0(aVar.f2952e);
                    this.f2929q.m1828b(fragment);
                    break;
                case 4:
                    fragment.m340z0(aVar.f2952e);
                    this.f2929q.m1843i0(fragment);
                    break;
                case 5:
                    fragment.m340z0(aVar.f2953f);
                    this.f2929q.m1835e0(fragment, true);
                    this.f2929q.m1812L(fragment);
                    break;
                case 6:
                    fragment.m340z0(aVar.f2952e);
                    this.f2929q.m1832d(fragment);
                    break;
                case 7:
                    fragment.m340z0(aVar.f2953f);
                    this.f2929q.m1835e0(fragment, true);
                    this.f2929q.m1842i(fragment);
                    break;
                case 8:
                    this.f2929q.m1839g0(null);
                    break;
                case 9:
                    this.f2929q.m1839g0(fragment);
                    break;
                case 10:
                    this.f2929q.m1837f0(fragment, aVar.f2954g);
                    break;
            }
            if (!this.f2947p && aVar.f2948a != 3 && fragment != null) {
                this.f2929q.m1817R(fragment);
            }
        }
        if (this.f2947p || !z) {
            return;
        }
        AbstractC0483r abstractC0483r = this.f2929q;
        abstractC0483r.m1818S(abstractC0483r.f3107m, true);
    }

    /* JADX INFO: renamed from: m */
    public boolean m1722m(int i) {
        int size = this.f2932a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2932a.get(i2).f2949b;
            int i3 = fragment != null ? fragment.f703x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1723n(ArrayList<C0451a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2932a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f2932a.get(i4).f2949b;
            int i5 = fragment != null ? fragment.f703x : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0451a c0451a = arrayList.get(i6);
                    int size2 = c0451a.f2932a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = c0451a.f2932a.get(i7).f2949b;
                        if ((fragment2 != null ? fragment2.f703x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2931s >= 0) {
            sb.append(" #");
            sb.append(this.f2931s);
        }
        if (this.f2940i != null) {
            sb.append(" ");
            sb.append(this.f2940i);
        }
        sb.append("}");
        return sb.toString();
    }
}
