package p006b.p049j.p051b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p025e.C0321i;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p032h.p044j.p045w.C0430c;

/* JADX INFO: renamed from: b.j.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0443a extends C0406a {

    /* JADX INFO: renamed from: n */
    public static final Rect f2813n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* JADX INFO: renamed from: o */
    public static final InterfaceC0444b<C0429b> f2814o = new a();

    /* JADX INFO: renamed from: p */
    public static final InterfaceC0445c<C0321i<C0429b>, C0429b> f2815p = new b();

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f2820h;

    /* JADX INFO: renamed from: i */
    public final View f2821i;

    /* JADX INFO: renamed from: j */
    public c f2822j;

    /* JADX INFO: renamed from: d */
    public final Rect f2816d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f2817e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f2818f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f2819g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f2823k = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: l */
    public int f2824l = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: m */
    private int f2825m = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: b.j.b.a$a */
    public static class a implements InterfaceC0444b<C0429b> {
        /* JADX INFO: renamed from: a */
        public void m1647a(Object obj, Rect rect) {
            ((C0429b) obj).f2743a.getBoundsInParent(rect);
        }
    }

    /* JADX INFO: renamed from: b.j.b.a$b */
    public static class b implements InterfaceC0445c<C0321i<C0429b>, C0429b> {
    }

    /* JADX INFO: renamed from: b.j.b.a$c */
    public class c extends C0430c {
        public c() {
        }

        @Override // p006b.p032h.p044j.p045w.C0430c
        /* JADX INFO: renamed from: a */
        public C0429b mo1623a(int i) {
            return new C0429b(AccessibilityNodeInfo.obtain(AbstractC0443a.this.m1639q(i).f2743a));
        }

        @Override // p006b.p032h.p044j.p045w.C0430c
        /* JADX INFO: renamed from: b */
        public C0429b mo1624b(int i) {
            int i2 = i == 2 ? AbstractC0443a.this.f2823k : AbstractC0443a.this.f2824l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new C0429b(AccessibilityNodeInfo.obtain(AbstractC0443a.this.m1639q(i2).f2743a));
        }

        @Override // p006b.p032h.p044j.p045w.C0430c
        /* JADX INFO: renamed from: c */
        public boolean mo1625c(int i, int i2, Bundle bundle) {
            int i3;
            AbstractC0443a abstractC0443a = AbstractC0443a.this;
            if (i == -1) {
                View view = abstractC0443a.f2821i;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                return view.performAccessibilityAction(i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return abstractC0443a.m1644v(i);
            }
            if (i2 == 2) {
                return abstractC0443a.m1633k(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? abstractC0443a.mo1640r(i, i2, bundle) : abstractC0443a.m1632j(i);
            }
            if (abstractC0443a.f2820h.isEnabled() && abstractC0443a.f2820h.isTouchExplorationEnabled() && (i3 = abstractC0443a.f2823k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    abstractC0443a.m1632j(i3);
                }
                abstractC0443a.f2823k = i;
                abstractC0443a.f2821i.invalidate();
                abstractC0443a.m1645w(i, 32768);
            } else {
                z = false;
            }
            return z;
        }
    }

    public AbstractC0443a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2821i = view;
        this.f2820h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: b */
    public C0430c mo1538b(View view) {
        if (this.f2822j == null) {
            this.f2822j = new c();
        }
        return this.f2822j;
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: c */
    public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: d */
    public void mo223d(View view, C0429b c0429b) {
        this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
        mo1641s(c0429b);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1632j(int i) {
        if (this.f2823k != i) {
            return false;
        }
        this.f2823k = RecyclerView.UNDEFINED_DURATION;
        this.f2821i.invalidate();
        m1645w(i, 65536);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1633k(int i) {
        if (this.f2824l != i) {
            return false;
        }
        this.f2824l = RecyclerView.UNDEFINED_DURATION;
        mo1643u(i, false);
        m1645w(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final C0429b m1634l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0429b c0429b = new C0429b(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        c0429b.f2743a.setFocusable(true);
        c0429b.f2743a.setClassName("android.view.View");
        Rect rect = f2813n;
        c0429b.f2743a.setBoundsInParent(rect);
        c0429b.f2743a.setBoundsInScreen(rect);
        c0429b.m1620o(this.f2821i);
        mo1642t(i, c0429b);
        if (c0429b.m1612g() == null && c0429b.m1610e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c0429b.f2743a.getBoundsInParent(this.f2817e);
        if (this.f2817e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM1608b = c0429b.m1608b();
        if ((iM1608b & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        int i2 = 128;
        if ((iM1608b & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c0429b.f2743a.setPackageName(this.f2821i.getContext().getPackageName());
        View view = this.f2821i;
        c0429b.f2745c = i;
        c0429b.f2743a.setSource(view, i);
        boolean z = false;
        if (this.f2823k == i) {
            c0429b.f2743a.setAccessibilityFocused(true);
            accessibilityNodeInfo = c0429b.f2743a;
        } else {
            c0429b.f2743a.setAccessibilityFocused(false);
            accessibilityNodeInfo = c0429b.f2743a;
            i2 = 64;
        }
        accessibilityNodeInfo.addAction(i2);
        boolean z2 = this.f2824l == i;
        if (z2) {
            c0429b.f2743a.addAction(2);
        } else if (c0429b.m1614i()) {
            c0429b.f2743a.addAction(1);
        }
        c0429b.f2743a.setFocused(z2);
        this.f2821i.getLocationOnScreen(this.f2819g);
        c0429b.f2743a.getBoundsInScreen(this.f2816d);
        if (this.f2816d.equals(rect)) {
            c0429b.f2743a.getBoundsInParent(this.f2816d);
            if (c0429b.f2744b != -1) {
                C0429b c0429b2 = new C0429b(AccessibilityNodeInfo.obtain());
                for (int i3 = c0429b.f2744b; i3 != -1; i3 = c0429b2.f2744b) {
                    View view2 = this.f2821i;
                    c0429b2.f2744b = -1;
                    c0429b2.f2743a.setParent(view2, -1);
                    c0429b2.f2743a.setBoundsInParent(f2813n);
                    mo1642t(i3, c0429b2);
                    c0429b2.f2743a.getBoundsInParent(this.f2817e);
                    Rect rect2 = this.f2816d;
                    Rect rect3 = this.f2817e;
                    rect2.offset(rect3.left, rect3.top);
                }
                c0429b2.f2743a.recycle();
            }
            this.f2816d.offset(this.f2819g[0] - this.f2821i.getScrollX(), this.f2819g[1] - this.f2821i.getScrollY());
        }
        if (this.f2821i.getLocalVisibleRect(this.f2818f)) {
            this.f2818f.offset(this.f2819g[0] - this.f2821i.getScrollX(), this.f2819g[1] - this.f2821i.getScrollY());
            if (this.f2816d.intersect(this.f2818f)) {
                c0429b.f2743a.setBoundsInScreen(this.f2816d);
                Rect rect4 = this.f2816d;
                if (rect4 != null && !rect4.isEmpty() && this.f2821i.getWindowVisibility() == 0) {
                    View view3 = this.f2821i;
                    do {
                        Object parent = view3.getParent();
                        if (!(parent instanceof View)) {
                            if (parent == null) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        view3 = (View) parent;
                        if (view3.getAlpha() <= 0.0f) {
                            break;
                        }
                    } while (view3.getVisibility() == 0);
                }
                if (z) {
                    c0429b.f2743a.setVisibleToUser(true);
                }
            }
        }
        return c0429b;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1635m(MotionEvent motionEvent) {
        int i;
        if (this.f2820h.isEnabled() && this.f2820h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || (i = this.f2825m) == Integer.MIN_VALUE) {
                    return false;
                }
                if (i != Integer.MIN_VALUE) {
                    this.f2825m = RecyclerView.UNDEFINED_DURATION;
                    m1645w(RecyclerView.UNDEFINED_DURATION, 128);
                    m1645w(i, 256);
                }
                return true;
            }
            int iMo1636n = mo1636n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f2825m;
            if (i2 != iMo1636n) {
                this.f2825m = iMo1636n;
                m1645w(iMo1636n, 128);
                m1645w(i2, 256);
            }
            if (iMo1636n != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo1636n(float f, float f2);

    /* JADX INFO: renamed from: o */
    public abstract void mo1637o(List<Integer> list);

    /* JADX WARN: Code duplicated, block: B:126:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0139  */
    /* JADX WARN: Code duplicated, block: B:97:0x0196  */
    /* JADX INFO: renamed from: p */
    public final boolean m1638p(int i, Rect rect) {
        Object obj;
        C0429b c0429b;
        int iM1282f;
        int iWidth;
        int iM1285i;
        Rect rect2;
        int i2;
        C0429b c0429b2;
        boolean z;
        int i3;
        int iM1411C;
        int iM1412D;
        int iHeight;
        ArrayList arrayList = new ArrayList();
        mo1637o(arrayList);
        C0321i c0321i = new C0321i(10);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c0321i.m1283g(i4, m1634l(i4));
        }
        int i5 = this.f2824l;
        C0429b c0429b3 = i5 == Integer.MIN_VALUE ? null : (C0429b) c0321i.m1280d(i5);
        int i6 = -1;
        if (i == 1 || i == 2) {
            View view = this.f2821i;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            boolean z2 = view.getLayoutDirection() == 1;
            InterfaceC0445c<C0321i<C0429b>, C0429b> interfaceC0445c = f2815p;
            InterfaceC0444b<C0429b> interfaceC0444b = f2814o;
            Objects.requireNonNull((b) interfaceC0445c);
            int iM1285i2 = c0321i.m1285i();
            ArrayList arrayList2 = new ArrayList(iM1285i2);
            for (int i7 = 0; i7 < iM1285i2; i7++) {
                if (c0321i.f2199b) {
                    c0321i.m1279c();
                }
                arrayList2.add((C0429b) c0321i.f2201d[i7]);
            }
            Collections.sort(arrayList2, new C0446d(z2, interfaceC0444b));
            if (i == 1) {
                int size = arrayList2.size();
                if (c0429b3 != null) {
                    size = arrayList2.indexOf(c0429b3);
                }
                int i8 = size - 1;
                if (i8 >= 0) {
                    obj = arrayList2.get(i8);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0429b3 == null ? -1 : arrayList2.lastIndexOf(c0429b3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            c0429b = (C0429b) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect3 = new Rect();
            int i9 = this.f2824l;
            if (i9 != Integer.MIN_VALUE) {
                m1639q(i9).f2743a.getBoundsInParent(rect3);
            } else if (rect != null) {
                rect3.set(rect);
            } else {
                View view2 = this.f2821i;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i == 17) {
                    rect3.set(width, 0, width, height);
                } else if (i == 33) {
                    rect3.set(0, height, width, height);
                } else if (i == 66) {
                    rect3.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect3.set(0, -1, width, -1);
                }
            }
            InterfaceC0445c<C0321i<C0429b>, C0429b> interfaceC0445c2 = f2815p;
            InterfaceC0444b<C0429b> interfaceC0444b2 = f2814o;
            Rect rect4 = new Rect(rect3);
            if (i != 17) {
                if (i == 33) {
                    iHeight = rect3.height() + 1;
                } else if (i == 66) {
                    iWidth = -(rect3.width() + 1);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    iHeight = -(rect3.height() + 1);
                }
                rect4.offset(0, iHeight);
                Objects.requireNonNull((b) interfaceC0445c2);
                iM1285i = c0321i.m1285i();
                rect2 = new Rect();
                c0429b = null;
                for (i2 = 0; i2 < iM1285i; i2++) {
                    if (c0321i.f2199b) {
                        c0321i.m1279c();
                    }
                    c0429b2 = (C0429b) c0321i.f2201d[i2];
                    if (c0429b2 == c0429b3) {
                        ((a) interfaceC0444b2).m1647a(c0429b2, rect2);
                        if (C0360f.m1409A(rect3, rect2, i)) {
                            if (C0360f.m1409A(rect3, rect4, i) && !C0360f.m1435a(i, rect3, rect2, rect4)) {
                                if (!C0360f.m1435a(i, rect3, rect4, rect2)) {
                                    int iM1411C2 = C0360f.m1411C(i, rect3, rect2);
                                    int iM1412D2 = C0360f.m1412D(i, rect3, rect2);
                                    i3 = (iM1412D2 * iM1412D2) + (iM1411C2 * 13 * iM1411C2);
                                    iM1411C = C0360f.m1411C(i, rect3, rect4);
                                    iM1412D = C0360f.m1412D(i, rect3, rect4);
                                    if (i3 < (iM1412D * iM1412D) + (iM1411C * 13 * iM1411C)) {
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            rect4.set(rect2);
                            c0429b = c0429b2;
                        }
                    }
                }
            } else {
                iWidth = rect3.width() + 1;
            }
            rect4.offset(iWidth, 0);
            Objects.requireNonNull((b) interfaceC0445c2);
            iM1285i = c0321i.m1285i();
            rect2 = new Rect();
            c0429b = null;
            while (i2 < iM1285i) {
                if (c0321i.f2199b) {
                    c0321i.m1279c();
                }
                c0429b2 = (C0429b) c0321i.f2201d[i2];
                if (c0429b2 == c0429b3) {
                    ((a) interfaceC0444b2).m1647a(c0429b2, rect2);
                    if (C0360f.m1409A(rect3, rect2, i)) {
                        if (C0360f.m1409A(rect3, rect4, i)) {
                            if (!C0360f.m1435a(i, rect3, rect4, rect2)) {
                                int iM1411C3 = C0360f.m1411C(i, rect3, rect2);
                                int iM1412D3 = C0360f.m1412D(i, rect3, rect2);
                                i3 = (iM1412D3 * iM1412D3) + (iM1411C3 * 13 * iM1411C3);
                                iM1411C = C0360f.m1411C(i, rect3, rect4);
                                iM1412D = C0360f.m1412D(i, rect3, rect4);
                                if (i3 < (iM1412D * iM1412D) + (iM1411C * 13 * iM1411C)) {
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        rect4.set(rect2);
                        c0429b = c0429b2;
                    }
                }
            }
        }
        C0429b c0429b4 = c0429b;
        if (c0429b4 == null) {
            iM1282f = RecyclerView.UNDEFINED_DURATION;
        } else {
            if (c0321i.f2199b) {
                c0321i.m1279c();
            }
            for (int i10 = 0; i10 < c0321i.f2202e; i10++) {
                if (c0321i.f2201d[i10] == c0429b4) {
                    i6 = i10;
                    break;
                }
            }
            iM1282f = c0321i.m1282f(i6);
        }
        return m1644v(iM1282f);
    }

    /* JADX INFO: renamed from: q */
    public C0429b m1639q(int i) {
        if (i != -1) {
            return m1634l(i);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.f2821i);
        C0429b c0429b = new C0429b(accessibilityNodeInfoObtain);
        View view = this.f2821i;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo1637o(arrayList);
        if (c0429b.f2743a.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0429b.f2743a.addChild(this.f2821i, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0429b;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo1640r(int i, int i2, Bundle bundle);

    /* JADX INFO: renamed from: s */
    public void mo1641s(C0429b c0429b) {
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo1642t(int i, C0429b c0429b);

    /* JADX INFO: renamed from: u */
    public void mo1643u(int i, boolean z) {
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1644v(int i) {
        int i2;
        if ((!this.f2821i.isFocused() && !this.f2821i.requestFocus()) || (i2 = this.f2824l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m1633k(i2);
        }
        this.f2824l = i;
        mo1643u(i, true);
        m1645w(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1645w(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f2820h.isEnabled() || (parent = this.f2821i.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C0429b c0429bM1639q = m1639q(i);
            accessibilityEventObtain.getText().add(c0429bM1639q.m1612g());
            accessibilityEventObtain.setContentDescription(c0429bM1639q.m1610e());
            accessibilityEventObtain.setScrollable(c0429bM1639q.f2743a.isScrollable());
            accessibilityEventObtain.setPassword(c0429bM1639q.f2743a.isPassword());
            accessibilityEventObtain.setEnabled(c0429bM1639q.m1613h());
            accessibilityEventObtain.setChecked(c0429bM1639q.f2743a.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(c0429bM1639q.m1609c());
            accessibilityEventObtain.setSource(this.f2821i, i);
            accessibilityEventObtain.setPackageName(this.f2821i.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.f2821i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        return parent.requestSendAccessibilityEvent(this.f2821i, accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: x */
    public final void m1646x(int i) {
        int i2 = this.f2825m;
        if (i2 == i) {
            return;
        }
        this.f2825m = i;
        m1645w(i, 128);
        m1645w(i2, 256);
    }
}
