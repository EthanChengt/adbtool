package p006b.p032h.p044j;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p006b.p032h.p044j.p045w.C0429b;

/* JADX INFO: renamed from: b.h.j.m */
/* JADX INFO: loaded from: classes.dex */
public class C0418m {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap<View, String> f2718a;

    /* JADX INFO: renamed from: b */
    public static WeakHashMap<View, C0423r> f2719b;

    /* JADX INFO: renamed from: c */
    public static Field f2720c;

    /* JADX INFO: renamed from: d */
    public static boolean f2721d;

    /* JADX INFO: renamed from: e */
    public static ThreadLocal<Rect> f2722e;

    /* JADX INFO: renamed from: b.h.j.m$a */
    public static class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0415j f2723a;

        public a(InterfaceC0415j interfaceC0415j) {
            this.f2723a = interfaceC0415j;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C0427v.m1598g(this.f2723a.mo162a(view, C0427v.m1599h(windowInsets)));
        }
    }

    /* JADX INFO: renamed from: b.h.j.m$b */
    public static abstract class b<T> {

        /* JADX INFO: renamed from: a */
        public final int f2724a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f2725b;

        /* JADX INFO: renamed from: c */
        public final int f2726c;

        public b(int i, Class<T> cls, int i2) {
            this.f2724a = i;
            this.f2725b = cls;
            this.f2726c = i2;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f2724a = i;
            this.f2725b = cls;
            this.f2726c = i3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1582a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* JADX INFO: renamed from: b */
        public abstract T mo1583b(View view);

        /* JADX INFO: renamed from: c */
        public T m1584c(View view) {
            if (Build.VERSION.SDK_INT >= this.f2726c) {
                return mo1583b(view);
            }
            T t = (T) view.getTag(this.f2724a);
            if (this.f2725b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b.h.j.m$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean m1585a(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: b.h.j.m$d */
    public static class d {

        /* JADX INFO: renamed from: d */
        public static final ArrayList<WeakReference<View>> f2727d = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        public WeakHashMap<View, Boolean> f2728a = null;

        /* JADX INFO: renamed from: b */
        public SparseArray<WeakReference<View>> f2729b = null;

        /* JADX INFO: renamed from: c */
        public WeakReference<KeyEvent> f2730c = null;

        /* JADX INFO: renamed from: a */
        public final View m1586a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2728a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM1586a = m1586a(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM1586a != null) {
                            return viewM1586a;
                        }
                    }
                }
                if (m1587b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m1587b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.o0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).m1585a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f2719b = null;
        f2721d = false;
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C0423r m1558a(View view) {
        if (f2719b == null) {
            f2719b = new WeakHashMap<>();
        }
        C0423r c0423r = f2719b.get(view);
        if (c0423r != null) {
            return c0423r;
        }
        C0423r c0423r2 = new C0423r(view);
        f2719b.put(view, c0423r2);
        return c0423r2;
    }

    /* JADX INFO: renamed from: b */
    public static void m1559b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m1581x((View) parent);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1560c(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m1581x((View) parent);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static C0427v m1561d(View view, C0427v c0427v) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0427v;
        }
        WindowInsets windowInsets = (WindowInsets) C0427v.m1598g(c0427v);
        WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(windowInsetsDispatchApplyWindowInsets);
        }
        return C0427v.m1599h(windowInsets);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1562e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = d.f2727d;
        d dVar = (d) view.getTag(R.id.nz);
        if (dVar == null) {
            dVar = new d();
            view.setTag(R.id.nz, dVar);
        }
        if (keyEvent.getAction() == 0) {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = dVar.f2728a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = d.f2727d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (dVar.f2728a == null) {
                        dVar.f2728a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = d.f2727d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            dVar.f2728a.put(view2, bool);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                dVar.f2728a.put((View) parent, bool);
                            }
                        }
                    }
                }
            }
        }
        View viewM1586a = dVar.m1586a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM1586a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (dVar.f2729b == null) {
                    dVar.f2729b = new SparseArray<>();
                }
                dVar.f2729b.put(keyCode, new WeakReference<>(viewM1586a));
            }
        }
        return viewM1586a != null;
    }

    /* JADX INFO: renamed from: f */
    public static C0406a m1563f(View view) {
        View.AccessibilityDelegate accessibilityDelegateM1564g = m1564g(view);
        if (accessibilityDelegateM1564g == null) {
            return null;
        }
        return accessibilityDelegateM1564g instanceof C0406a.a ? ((C0406a.a) accessibilityDelegateM1564g).f2702a : new C0406a(accessibilityDelegateM1564g);
    }

    /* JADX INFO: renamed from: g */
    public static View.AccessibilityDelegate m1564g(View view) {
        if (f2721d) {
            return null;
        }
        if (f2720c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2720c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2721d = true;
                return null;
            }
        }
        try {
            Object obj = f2720c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2721d = true;
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static ColorStateList m1565h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC0417l) {
            return ((InterfaceC0417l) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static float m1566i(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public static Rect m1567j() {
        if (f2722e == null) {
            f2722e = new ThreadLocal<>();
        }
        Rect rect = f2722e.get();
        if (rect == null) {
            rect = new Rect();
            f2722e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX INFO: renamed from: k */
    public static String m1568k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f2718a;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static boolean m1569l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC0409d) {
            return ((InterfaceC0409d) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m1570m(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = new C0420o(R.id.nw, CharSequence.class, 8, 28).m1584c(view) != null;
            if (view.getAccessibilityLiveRegion() != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m1571n(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        if (i2 < 21) {
            m1559b(view, i);
            return;
        }
        Rect rectM1567j = m1567j();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM1567j.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM1567j.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m1559b(view, i);
        if (z && rectM1567j.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM1567j);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m1572o(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        if (i2 < 21) {
            m1560c(view, i);
            return;
        }
        Rect rectM1567j = m1567j();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM1567j.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM1567j.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m1560c(view, i);
        if (z && rectM1567j.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM1567j);
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0427v m1573p(View view, C0427v c0427v) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0427v;
        }
        WindowInsets windowInsets = (WindowInsets) C0427v.m1598g(c0427v);
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!windowInsetsOnApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return C0427v.m1599h(windowInsets);
    }

    /* JADX INFO: renamed from: q */
    public static void m1574q(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m1575r(i, view);
            m1570m(view, 0);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m1575r(int i, View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.nt);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.nt, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((C0429b.a) arrayList.get(i2)).m1621a() == i) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m1576s(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m1577t(View view, C0406a c0406a) {
        if (c0406a == null && (m1564g(view) instanceof C0406a.a)) {
            c0406a = new C0406a();
        }
        view.setAccessibilityDelegate(c0406a == null ? null : c0406a.f2701b);
    }

    /* JADX INFO: renamed from: u */
    public static void m1578u(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m1579v(View view, InterfaceC0415j interfaceC0415j) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (interfaceC0415j == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(interfaceC0415j));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1580w(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2718a == null) {
            f2718a = new WeakHashMap<>();
        }
        f2718a.put(view, str);
    }

    /* JADX INFO: renamed from: x */
    public static void m1581x(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
