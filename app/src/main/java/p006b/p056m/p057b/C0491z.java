package p006b.p056m.p057b;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: b.m.b.z */
/* JADX INFO: loaded from: classes.dex */
public class C0491z {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Fragment> f3166a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, C0490y> f3167b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public void m1875a(Fragment fragment) {
        if (this.f3166a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3166a) {
            this.f3166a.add(fragment);
        }
        fragment.f691l = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1876b() {
        this.f3167b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: c */
    public boolean m1877c(String str) {
        return this.f3167b.containsKey(str);
    }

    /* JADX INFO: renamed from: d */
    public void m1878d(int i) {
        Iterator<Fragment> it = this.f3166a.iterator();
        while (it.hasNext()) {
            C0490y c0490y = this.f3167b.get(it.next().f685f);
            if (c0490y != null) {
                c0490y.f3165c = i;
            }
        }
        for (C0490y c0490y2 : this.f3167b.values()) {
            if (c0490y2 != null) {
                c0490y2.f3165c = i;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Fragment m1879e(String str) {
        C0490y c0490y = this.f3167b.get(str);
        if (c0490y != null) {
            return c0490y.f3164b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public List<Fragment> m1880f() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0490y> it = this.f3167b.values().iterator();
        while (it.hasNext()) {
            C0490y next = it.next();
            arrayList.add(next != null ? next.f3164b : null);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public List<Fragment> m1881g() {
        ArrayList arrayList;
        if (this.f3166a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3166a) {
            arrayList = new ArrayList(this.f3166a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m1882h(Fragment fragment) {
        synchronized (this.f3166a) {
            this.f3166a.remove(fragment);
        }
        fragment.f691l = false;
    }
}
