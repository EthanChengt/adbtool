package p006b.p056m.p057b;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import p006b.p061o.AbstractC0499d;

/* JADX INFO: renamed from: b.m.b.y */
/* JADX INFO: loaded from: classes.dex */
public class C0490y {

    /* JADX INFO: renamed from: a */
    public final C0482q f3163a;

    /* JADX INFO: renamed from: b */
    public final Fragment f3164b;

    /* JADX INFO: renamed from: c */
    public int f3165c = -1;

    public C0490y(C0482q c0482q, Fragment fragment) {
        this.f3163a = c0482q;
        this.f3164b = fragment;
    }

    public C0490y(C0482q c0482q, Fragment fragment, C0489x c0489x) {
        this.f3163a = c0482q;
        this.f3164b = fragment;
        fragment.f683d = null;
        fragment.f697r = 0;
        fragment.f694o = false;
        fragment.f691l = false;
        Fragment fragment2 = fragment.f687h;
        fragment.f688i = fragment2 != null ? fragment2.f685f : null;
        fragment.f687h = null;
        Bundle bundle = c0489x.f3162n;
        fragment.f682c = bundle == null ? new Bundle() : bundle;
    }

    public C0490y(C0482q c0482q, ClassLoader classLoader, C0477n c0477n, C0489x c0489x) {
        this.f3163a = c0482q;
        Fragment fragmentMo1785a = c0477n.mo1785a(classLoader, c0489x.f3150b);
        this.f3164b = fragmentMo1785a;
        Bundle bundle = c0489x.f3159k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentMo1785a.m332v0(c0489x.f3159k);
        fragmentMo1785a.f685f = c0489x.f3151c;
        fragmentMo1785a.f693n = c0489x.f3152d;
        fragmentMo1785a.f695p = true;
        fragmentMo1785a.f702w = c0489x.f3153e;
        fragmentMo1785a.f703x = c0489x.f3154f;
        fragmentMo1785a.f704y = c0489x.f3155g;
        fragmentMo1785a.f662B = c0489x.f3156h;
        fragmentMo1785a.f692m = c0489x.f3157i;
        fragmentMo1785a.f661A = c0489x.f3158j;
        fragmentMo1785a.f705z = c0489x.f3160l;
        fragmentMo1785a.f676P = AbstractC0499d.b.values()[c0489x.f3161m];
        Bundle bundle2 = c0489x.f3162n;
        fragmentMo1785a.f682c = bundle2 == null ? new Bundle() : bundle2;
        if (AbstractC0483r.m1800M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentMo1785a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1873a(ClassLoader classLoader) {
        Bundle bundle = this.f3164b.f682c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3164b;
        fragment.f683d = fragment.f682c.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f3164b;
        fragment2.f688i = fragment2.f682c.getString("android:target_state");
        Fragment fragment3 = this.f3164b;
        if (fragment3.f688i != null) {
            fragment3.f689j = fragment3.f682c.getInt("android:target_req_state", 0);
        }
        Fragment fragment4 = this.f3164b;
        Boolean bool = fragment4.f684e;
        if (bool != null) {
            fragment4.f669I = bool.booleanValue();
            this.f3164b.f684e = null;
        } else {
            fragment4.f669I = fragment4.f682c.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment5 = this.f3164b;
        if (fragment5.f669I) {
            return;
        }
        fragment5.f668H = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1874b() {
        if (this.f3164b.f667G == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3164b.f667G.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3164b.f683d = sparseArray;
        }
    }
}
