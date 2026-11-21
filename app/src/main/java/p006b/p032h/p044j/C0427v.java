package p006b.p032h.p044j;

import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: renamed from: b.h.j.v */
/* JADX INFO: loaded from: classes.dex */
public class C0427v {

    /* JADX INFO: renamed from: a */
    public final Object f2738a;

    public C0427v(Object obj) {
        this.f2738a = obj;
    }

    /* JADX INFO: renamed from: g */
    public static Object m1598g(C0427v c0427v) {
        if (c0427v == null) {
            return null;
        }
        return c0427v.f2738a;
    }

    /* JADX INFO: renamed from: h */
    public static C0427v m1599h(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0427v(obj);
    }

    /* JADX INFO: renamed from: a */
    public int m1600a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2738a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int m1601b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2738a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m1602c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2738a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m1603d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2738a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1604e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f2738a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0427v.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f2738a;
        Object obj3 = ((C0427v) obj).f2738a;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    /* JADX INFO: renamed from: f */
    public C0427v m1605f(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0427v(((WindowInsets) this.f2738a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f2738a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
