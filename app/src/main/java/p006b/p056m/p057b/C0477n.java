package p006b.p056m.p057b;

import androidx.fragment.app.Fragment;
import p006b.p025e.C0320h;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.m.b.n */
/* JADX INFO: loaded from: classes.dex */
public class C0477n {

    /* JADX INFO: renamed from: a */
    public static final C0320h<String, Class<?>> f3083a = new C0320h<>();

    /* JADX INFO: renamed from: b */
    public static Class<?> m1783b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0320h<String, Class<?>> c0320h = f3083a;
        Class<?> orDefault = c0320h.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        c0320h.put(str, cls);
        return cls;
    }

    /* JADX INFO: renamed from: c */
    public static Class<? extends Fragment> m1784c(ClassLoader classLoader, String str) {
        try {
            return m1783b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C0089b(a.m2202p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C0089b(a.m2202p("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public Fragment mo1785a(ClassLoader classLoader, String str) {
        throw null;
    }
}
