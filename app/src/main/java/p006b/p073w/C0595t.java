package p006b.p073w;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.w.t */
/* JADX INFO: loaded from: classes.dex */
public class C0595t {

    /* JADX INFO: renamed from: a */
    public static final C0601z f3630a;

    /* JADX INFO: renamed from: b */
    public static final Property<View, Float> f3631b;

    /* JADX INFO: renamed from: b.w.t$a */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(C0595t.m2137a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            C0595t.f3630a.mo2142e(view, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: b.w.t$b */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            view.setClipBounds(rect);
        }
    }

    static {
        C0601z c0597v;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c0597v = new C0600y();
        } else if (i >= 23) {
            c0597v = new C0599x();
        } else if (i >= 22) {
            c0597v = new C0598w();
        } else {
            c0597v = i >= 21 ? new C0597v() : new C0596u();
        }
        f3630a = c0597v;
        f3631b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static float m2137a(View view) {
        return f3630a.mo2140b(view);
    }

    /* JADX INFO: renamed from: b */
    public static void m2138b(View view, int i, int i2, int i3, int i4) {
        f3630a.mo2145d(view, i, i2, i3, i4);
    }
}
