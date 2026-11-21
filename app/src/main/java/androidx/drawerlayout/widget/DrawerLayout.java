package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p049j.p050a.AbstractC0442a;
import p006b.p049j.p051b.C0447e;
import p006b.p052k.p053a.ViewOnApplyWindowInsetsListenerC0448a;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: D */
    public static final int[] f612D = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: E */
    public static final int[] f613E = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: F */
    public static final boolean f614F;

    /* JADX INFO: renamed from: G */
    public static final boolean f615G;

    /* JADX INFO: renamed from: A */
    public final ArrayList<View> f616A;

    /* JADX INFO: renamed from: B */
    public Rect f617B;

    /* JADX INFO: renamed from: C */
    public Matrix f618C;

    /* JADX INFO: renamed from: b */
    public final C0082b f619b;

    /* JADX INFO: renamed from: c */
    public float f620c;

    /* JADX INFO: renamed from: d */
    public int f621d;

    /* JADX INFO: renamed from: e */
    public int f622e;

    /* JADX INFO: renamed from: f */
    public float f623f;

    /* JADX INFO: renamed from: g */
    public Paint f624g;

    /* JADX INFO: renamed from: h */
    public final C0447e f625h;

    /* JADX INFO: renamed from: i */
    public final C0447e f626i;

    /* JADX INFO: renamed from: j */
    public final C0086f f627j;

    /* JADX INFO: renamed from: k */
    public final C0086f f628k;

    /* JADX INFO: renamed from: l */
    public int f629l;

    /* JADX INFO: renamed from: m */
    public boolean f630m;

    /* JADX INFO: renamed from: n */
    public boolean f631n;

    /* JADX INFO: renamed from: o */
    public int f632o;

    /* JADX INFO: renamed from: p */
    public int f633p;

    /* JADX INFO: renamed from: q */
    public int f634q;

    /* JADX INFO: renamed from: r */
    public int f635r;

    /* JADX INFO: renamed from: s */
    public boolean f636s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0083c f637t;

    /* JADX INFO: renamed from: u */
    public List<InterfaceC0083c> f638u;

    /* JADX INFO: renamed from: v */
    public float f639v;

    /* JADX INFO: renamed from: w */
    public float f640w;

    /* JADX INFO: renamed from: x */
    public Drawable f641x;

    /* JADX INFO: renamed from: y */
    public Object f642y;

    /* JADX INFO: renamed from: z */
    public boolean f643z;

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C0081a extends C0406a {

        /* JADX INFO: renamed from: d */
        public final Rect f644d = new Rect();

        public C0081a() {
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: a */
        public boolean mo243a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f2700a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View viewM232f = DrawerLayout.this.m232f();
            if (viewM232f == null) {
                return true;
            }
            int iM234h = DrawerLayout.this.m234h(viewM232f);
            DrawerLayout drawerLayout = DrawerLayout.this;
            Objects.requireNonNull(drawerLayout);
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            Gravity.getAbsoluteGravity(iM234h, drawerLayout.getLayoutDirection());
            return true;
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: c */
        public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
            this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            if (DrawerLayout.f614F) {
                this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(c0429b.f2743a);
                this.f2700a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                c0429b.f2745c = -1;
                c0429b.f2743a.setSource(view);
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    c0429b.m1620o((View) parentForAccessibility);
                }
                Rect rect = this.f644d;
                accessibilityNodeInfoObtain.getBoundsInParent(rect);
                c0429b.f2743a.setBoundsInParent(rect);
                accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                c0429b.f2743a.setBoundsInScreen(rect);
                c0429b.f2743a.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                c0429b.f2743a.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                c0429b.f2743a.setClassName(accessibilityNodeInfoObtain.getClassName());
                c0429b.f2743a.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
                c0429b.f2743a.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                c0429b.f2743a.setClickable(accessibilityNodeInfoObtain.isClickable());
                c0429b.f2743a.setFocusable(accessibilityNodeInfoObtain.isFocusable());
                c0429b.f2743a.setFocused(accessibilityNodeInfoObtain.isFocused());
                c0429b.f2743a.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
                c0429b.f2743a.setSelected(accessibilityNodeInfoObtain.isSelected());
                c0429b.f2743a.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
                c0429b.f2743a.addAction(accessibilityNodeInfoObtain.getActions());
                accessibilityNodeInfoObtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.m226j(childAt)) {
                        c0429b.f2743a.addChild(childAt);
                    }
                }
            }
            c0429b.f2743a.setClassName(DrawerLayout.class.getName());
            c0429b.f2743a.setFocusable(false);
            c0429b.f2743a.setFocused(false);
            c0429b.m1615j(C0429b.a.f2746e);
            c0429b.m1615j(C0429b.a.f2747f);
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: f */
        public boolean mo244f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f614F || DrawerLayout.m226j(view)) {
                return this.f2700a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public static final class C0082b extends C0406a {
        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
            if (DrawerLayout.m226j(view)) {
                return;
            }
            c0429b.m1620o(null);
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public interface InterfaceC0083c {
        /* JADX INFO: renamed from: a */
        void m245a(int i);

        /* JADX INFO: renamed from: b */
        void m246b(View view);

        /* JADX INFO: renamed from: c */
        void m247c(View view, float f);

        /* JADX INFO: renamed from: d */
        void m248d(View view);
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static class C0084d extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f646a;

        /* JADX INFO: renamed from: b */
        public float f647b;

        /* JADX INFO: renamed from: c */
        public boolean f648c;

        /* JADX INFO: renamed from: d */
        public int f649d;

        public C0084d(int i, int i2) {
            super(i, i2);
            this.f646a = 0;
        }

        public C0084d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f646a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f613E);
            this.f646a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0084d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f646a = 0;
        }

        public C0084d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f646a = 0;
        }

        public C0084d(C0084d c0084d) {
            super((ViewGroup.MarginLayoutParams) c0084d);
            this.f646a = 0;
            this.f646a = c0084d.f646a;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public static class C0085e extends AbstractC0442a {
        public static final Parcelable.Creator<C0085e> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public int f650d;

        /* JADX INFO: renamed from: e */
        public int f651e;

        /* JADX INFO: renamed from: f */
        public int f652f;

        /* JADX INFO: renamed from: g */
        public int f653g;

        /* JADX INFO: renamed from: h */
        public int f654h;

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0085e> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0085e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0085e[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0085e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0085e(parcel, classLoader);
            }
        }

        public C0085e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f650d = 0;
            this.f650d = parcel.readInt();
            this.f651e = parcel.readInt();
            this.f652f = parcel.readInt();
            this.f653g = parcel.readInt();
            this.f654h = parcel.readInt();
        }

        public C0085e(Parcelable parcelable) {
            super(parcelable);
            this.f650d = 0;
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeInt(this.f650d);
            parcel.writeInt(this.f651e);
            parcel.writeInt(this.f652f);
            parcel.writeInt(this.f653g);
            parcel.writeInt(this.f654h);
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public class C0086f extends C0447e.c {

        /* JADX INFO: renamed from: a */
        public final int f655a;

        /* JADX INFO: renamed from: b */
        public C0447e f656b;

        /* JADX INFO: renamed from: c */
        public final Runnable f657c = new a();

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                View viewM230d;
                int width;
                C0086f c0086f = C0086f.this;
                int i = c0086f.f656b.f2846o;
                boolean z = c0086f.f655a == 3;
                if (z) {
                    viewM230d = DrawerLayout.this.m230d(3);
                    width = (viewM230d != null ? -viewM230d.getWidth() : 0) + i;
                } else {
                    viewM230d = DrawerLayout.this.m230d(5);
                    width = DrawerLayout.this.getWidth() - i;
                }
                if (viewM230d != null) {
                    if (((!z || viewM230d.getLeft() >= width) && (z || viewM230d.getLeft() <= width)) || DrawerLayout.this.m233g(viewM230d) != 0) {
                        return;
                    }
                    C0084d c0084d = (C0084d) viewM230d.getLayoutParams();
                    c0086f.f656b.m1671x(viewM230d, width, viewM230d.getTop());
                    c0084d.f648c = true;
                    DrawerLayout.this.invalidate();
                    c0086f.m260m();
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (drawerLayout.f636s) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        drawerLayout.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f636s = true;
                }
            }
        }

        public C0086f(int i) {
            this.f655a = i;
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: a */
        public int mo249a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.m227a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: b */
        public int mo250b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: c */
        public int mo251c(View view) {
            if (DrawerLayout.this.m236l(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: e */
        public void mo252e(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View viewM230d = drawerLayout.m230d(i3);
            if (viewM230d == null || DrawerLayout.this.m233g(viewM230d) != 0) {
                return;
            }
            this.f656b.m1650b(viewM230d, i2);
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: f */
        public boolean mo253f(int i) {
            return false;
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: g */
        public void mo254g(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f657c, 160L);
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: h */
        public void mo255h(View view, int i) {
            ((C0084d) view.getLayoutParams()).f648c = false;
            m260m();
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: i */
        public void mo256i(int i) {
            DrawerLayout.this.m242r(i, this.f656b.f2850s);
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: j */
        public void mo257j(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.m227a(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.m240p(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: k */
        public void mo258k(View view, float f, float f2) {
            int i;
            Objects.requireNonNull(DrawerLayout.this);
            float f3 = ((C0084d) view.getLayoutParams()).f647b;
            int width = view.getWidth();
            if (DrawerLayout.this.m227a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f656b.m1669v(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: l */
        public boolean mo259l(View view, int i) {
            return DrawerLayout.this.m236l(view) && DrawerLayout.this.m227a(view, this.f655a) && DrawerLayout.this.m233g(view) == 0;
        }

        /* JADX INFO: renamed from: m */
        public final void m260m() {
            View viewM230d = DrawerLayout.this.m230d(this.f655a == 3 ? 5 : 3);
            if (viewM230d != null) {
                DrawerLayout.this.m228b(viewM230d);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m261n() {
            DrawerLayout.this.removeCallbacks(this.f657c);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f614F = true;
        f615G = i >= 21;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f619b = new C0082b();
        this.f622e = -1728053248;
        this.f624g = new Paint();
        this.f631n = true;
        this.f632o = 3;
        this.f633p = 3;
        this.f634q = 3;
        this.f635r = 3;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f621d = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0086f c0086f = new C0086f(3);
        this.f627j = c0086f;
        C0086f c0086f2 = new C0086f(5);
        this.f628k = c0086f2;
        C0447e c0447eM1648j = C0447e.m1648j(this, 1.0f, c0086f);
        this.f625h = c0447eM1648j;
        c0447eM1648j.f2847p = 1;
        c0447eM1648j.f2845n = f2;
        c0086f.f656b = c0447eM1648j;
        C0447e c0447eM1648j2 = C0447e.m1648j(this, 1.0f, c0086f2);
        this.f626i = c0447eM1648j2;
        c0447eM1648j2.f2847p = 2;
        c0447eM1648j2.f2845n = f2;
        c0086f2.f656b = c0447eM1648j2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setImportantForAccessibility(1);
        C0418m.m1577t(this, new C0081a());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0448a(this));
                setSystemUiVisibility(1280);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f612D);
                try {
                    this.f641x = typedArrayObtainStyledAttributes.getDrawable(0);
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } else {
                this.f641x = null;
            }
        }
        this.f620c = f * 10.0f;
        this.f616A = new ArrayList<>();
    }

    /* JADX INFO: renamed from: i */
    public static String m225i(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m226j(View view) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m227a(View view, int i) {
        return (m234h(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m236l(childAt)) {
                this.f616A.add(childAt);
            } else {
                if (!m236l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if ((((C0084d) childAt.getLayoutParams()).f649d & 1) == 1) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
        }
        if (!z) {
            int size = this.f616A.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f616A.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f616A.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        int i2 = (m231e() != null || m236l(view)) ? 4 : 1;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        view.setImportantForAccessibility(i2);
        if (f614F) {
            return;
        }
        C0418m.m1577t(view, this.f619b);
    }

    /* JADX INFO: renamed from: b */
    public void m228b(View view) {
        C0447e c0447e;
        int width;
        if (!m236l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0084d c0084d = (C0084d) view.getLayoutParams();
        if (this.f631n) {
            c0084d.f647b = 0.0f;
            c0084d.f649d = 0;
        } else {
            c0084d.f649d |= 4;
            if (m227a(view, 3)) {
                c0447e = this.f625h;
                width = -view.getWidth();
            } else {
                c0447e = this.f626i;
                width = getWidth();
            }
            c0447e.m1671x(view, width, view.getTop());
        }
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m229c(boolean z) {
        int childCount = getChildCount();
        boolean zM1671x = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0084d c0084d = (C0084d) childAt.getLayoutParams();
            if (m236l(childAt) && (!z || c0084d.f648c)) {
                zM1671x |= m227a(childAt, 3) ? this.f625h.m1671x(childAt, -childAt.getWidth(), childAt.getTop()) : this.f626i.m1671x(childAt, getWidth(), childAt.getTop());
                c0084d.f648c = false;
            }
        }
        this.f627j.m261n();
        this.f628k.m261n();
        if (zM1671x) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0084d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C0084d) getChildAt(i).getLayoutParams()).f647b);
        }
        this.f623f = fMax;
        boolean zM1657i = this.f625h.m1657i(true);
        boolean zM1657i2 = this.f626i.m1657i(true);
        if (zM1657i || zM1657i2) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: d */
    public View m230d(int i) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m234h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f623f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f617B == null) {
                this.f617B = new Rect();
            }
            childAt.getHitRect(this.f617B);
            if (this.f617B.contains((int) x, (int) y) && !m235k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f618C == null) {
                            this.f618C = new Matrix();
                        }
                        matrix.invert(this.f618C);
                        motionEventObtain.transform(this.f618C);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zM235k = m235k(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM235k) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && m236l(childAt) && childAt.getHeight() >= height) {
                        if (m227a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f623f;
        if (f > 0.0f && zM235k) {
            int i4 = this.f622e;
            this.f624g.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f624g);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    public View m231e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0084d) childAt.getLayoutParams()).f649d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View m232f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m236l(childAt)) {
                if (!m236l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C0084d) childAt.getLayoutParams()).f647b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int m233g(View view) {
        if (!m236l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((C0084d) view.getLayoutParams()).f646a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.f632o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.f634q : this.f635r;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.f633p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.f635r : this.f634q;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.f634q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.f632o : this.f633p;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.f635r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.f633p : this.f632o;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0084d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0084d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0084d) {
            return new C0084d((C0084d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0084d((ViewGroup.MarginLayoutParams) layoutParams) : new C0084d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f615G) {
            return this.f620c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f641x;
    }

    /* JADX INFO: renamed from: h */
    public int m234h(View view) {
        int i = ((C0084d) view.getLayoutParams()).f646a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    /* JADX INFO: renamed from: k */
    public boolean m235k(View view) {
        return ((C0084d) view.getLayoutParams()).f646a == 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m236l(View view) {
        int i = ((C0084d) view.getLayoutParams()).f646a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public void m237m(View view, float f) {
        float f2 = ((C0084d) view.getLayoutParams()).f647b;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m227a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m240p(view, f);
    }

    /* JADX INFO: renamed from: n */
    public void m238n(View view, boolean z) {
        if (!m236l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0084d c0084d = (C0084d) view.getLayoutParams();
        if (this.f631n) {
            c0084d.f647b = 1.0f;
            c0084d.f649d = 1;
            m241q(view, true);
        } else if (z) {
            c0084d.f649d |= 2;
            if (m227a(view, 3)) {
                this.f625h.m1671x(view, 0, view.getTop());
            } else {
                this.f626i.m1671x(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m237m(view, 1.0f);
            int i = c0084d.f646a;
            m242r(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m239o(int i, int i2) {
        View viewM230d;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f632o = i;
        } else if (i2 == 5) {
            this.f633p = i;
        } else if (i2 == 8388611) {
            this.f634q = i;
        } else if (i2 == 8388613) {
            this.f635r = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f625h : this.f626i).m1649a();
        }
        if (i != 1) {
            if (i == 2 && (viewM230d = m230d(absoluteGravity)) != null) {
                m238n(viewM230d, true);
                return;
            }
            return;
        }
        View viewM230d2 = m230d(absoluteGravity);
        if (viewM230d2 != null) {
            m228b(viewM230d2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f631n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f631n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.f643z || this.f641x == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.f642y) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f641x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f641x.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM1659l;
        boolean z2;
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        boolean zM1670w = this.f625h.m1670w(motionEvent) | this.f626i.m1670w(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m229c(true);
                this.f636s = false;
            } else if (actionMasked == 2) {
                C0447e c0447e = this.f625h;
                int length = c0447e.f2835d.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z3 = false;
                        break;
                    }
                    if (c0447e.m1661n(i)) {
                        float f = c0447e.f2837f[i] - c0447e.f2835d[i];
                        float f2 = c0447e.f2838g[i] - c0447e.f2836e[i];
                        float f3 = (f2 * f2) + (f * f);
                        int i2 = c0447e.f2833b;
                        if (f3 > i2 * i2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        z3 = true;
                        break;
                    }
                    i++;
                }
                if (z3) {
                    this.f627j.m261n();
                    this.f628k.m261n();
                }
            } else if (actionMasked == 3) {
                m229c(true);
                this.f636s = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f639v = x;
            this.f640w = y;
            z = this.f623f > 0.0f && (viewM1659l = this.f625h.m1659l((int) x, (int) y)) != null && m235k(viewM1659l);
            this.f636s = false;
        }
        if (zM1670w || z) {
            return true;
        }
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                z2 = false;
                break;
            }
            if (((C0084d) getChildAt(i3).getLayoutParams()).f648c) {
                z2 = true;
                break;
            }
            i3++;
        }
        return z2 || this.f636s;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m232f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM232f = m232f();
        if (viewM232f != null && m233g(viewM232f) == 0) {
            m229c(false);
        }
        return viewM232f != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f630m = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0084d c0084d = (C0084d) childAt.getLayoutParams();
                if (m235k(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) c0084d).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) c0084d).topMargin, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0084d).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (m227a(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c0084d.f647b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i11 = i8 - ((int) (c0084d.f647b * f3));
                        f = (i8 - i11) / f3;
                        i5 = i11;
                    }
                    boolean z2 = f != c0084d.f647b;
                    int i12 = c0084d.f646a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) c0084d).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) c0084d).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - ((ViewGroup.MarginLayoutParams) c0084d).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) c0084d).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) c0084d).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        m240p(childAt, f);
                    }
                    int i19 = c0084d.f647b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.f630m = false;
        this.f631n = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = Build.VERSION.SDK_INT;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f642y != null) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 8) {
                z2 = z;
            } else {
                C0084d c0084d = (C0084d) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0084d.f646a, layoutDirection);
                    if (!childAt.getFitsSystemWindows()) {
                        z2 = z;
                        if (i3 >= 21) {
                            WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f642y;
                            if (absoluteGravity == 3) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            } else if (absoluteGravity == 5) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            }
                            ((ViewGroup.MarginLayoutParams) c0084d).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                            ((ViewGroup.MarginLayoutParams) c0084d).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                            ((ViewGroup.MarginLayoutParams) c0084d).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                            ((ViewGroup.MarginLayoutParams) c0084d).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                        }
                    } else if (i3 >= 21) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f642y;
                        if (absoluteGravity == 3) {
                            z2 = z;
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else {
                            z2 = z;
                            if (absoluteGravity == 5) {
                                windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                            }
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets2);
                    } else {
                        z2 = z;
                    }
                } else {
                    z2 = z;
                }
                if (m235k(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c0084d).leftMargin) - ((ViewGroup.MarginLayoutParams) c0084d).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c0084d).topMargin) - ((ViewGroup.MarginLayoutParams) c0084d).bottomMargin, 1073741824));
                } else {
                    if (!m236l(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f615G) {
                        float fM1566i = C0418m.m1566i(childAt);
                        float f = this.f620c;
                        if (fM1566i != f) {
                            C0418m.m1578u(childAt, f);
                        }
                    }
                    int iM234h = m234h(childAt) & 7;
                    boolean z5 = iM234h == 3;
                    if ((z5 && z3) || (!z5 && z4)) {
                        StringBuilder sbM2191e = a.m2191e("Child drawer has absolute gravity ");
                        sbM2191e.append(m225i(iM234h));
                        sbM2191e.append(" but this ");
                        sbM2191e.append("DrawerLayout");
                        sbM2191e.append(" already has a ");
                        sbM2191e.append("drawer view along that edge");
                        throw new IllegalStateException(sbM2191e.toString());
                    }
                    if (z5) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f621d + ((ViewGroup.MarginLayoutParams) c0084d).leftMargin + ((ViewGroup.MarginLayoutParams) c0084d).rightMargin, ((ViewGroup.MarginLayoutParams) c0084d).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c0084d).topMargin + ((ViewGroup.MarginLayoutParams) c0084d).bottomMargin, ((ViewGroup.MarginLayoutParams) c0084d).height));
                }
                i4++;
                z = z2;
            }
            i4++;
            z = z2;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewM230d;
        if (!(parcelable instanceof C0085e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0085e c0085e = (C0085e) parcelable;
        super.onRestoreInstanceState(c0085e.f2812b);
        int i = c0085e.f650d;
        if (i != 0 && (viewM230d = m230d(i)) != null) {
            m238n(viewM230d, true);
        }
        int i2 = c0085e.f651e;
        if (i2 != 3) {
            m239o(i2, 3);
        }
        int i3 = c0085e.f652f;
        if (i3 != 3) {
            m239o(i3, 5);
        }
        int i4 = c0085e.f653g;
        if (i4 != 3) {
            m239o(i4, 8388611);
        }
        int i5 = c0085e.f654h;
        if (i5 != 3) {
            m239o(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (f615G) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0085e c0085e = new C0085e(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0084d c0084d = (C0084d) getChildAt(i).getLayoutParams();
            int i2 = c0084d.f649d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c0085e.f650d = c0084d.f646a;
                break;
            }
        }
        c0085e.f651e = this.f632o;
        c0085e.f652f = this.f633p;
        c0085e.f653g = this.f634q;
        c0085e.f654h = this.f635r;
        return c0085e;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM231e;
        this.f625h.m1663p(motionEvent);
        this.f626i.m1663p(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View viewM1659l = this.f625h.m1659l((int) x, (int) y);
                if (viewM1659l != null && m235k(viewM1659l)) {
                    float f = x - this.f639v;
                    float f2 = y - this.f640w;
                    int i = this.f625h.f2833b;
                    z = (f2 * f2) + (f * f) >= ((float) (i * i)) || (viewM231e = m231e()) == null || m233g(viewM231e) == 2;
                }
                m229c(z);
            } else if (action == 3) {
                m229c(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f639v = x2;
        this.f640w = y2;
        this.f636s = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m240p(View view, float f) {
        C0084d c0084d = (C0084d) view.getLayoutParams();
        if (f == c0084d.f647b) {
            return;
        }
        c0084d.f647b = f;
        List<InterfaceC0083c> list = this.f638u;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f638u.get(size).m247c(view, f);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m241q(View view, boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z || m236l(childAt)) && !(z && childAt == view)) {
                i = 4;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            } else {
                WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                i = 1;
            }
            childAt.setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m242r(int i, View view) {
        View rootView;
        int i2 = this.f625h.f2832a;
        int i3 = this.f626i.f2832a;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (i2 != 2 && i3 != 2) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f = ((C0084d) view.getLayoutParams()).f647b;
            if (f == 0.0f) {
                C0084d c0084d = (C0084d) view.getLayoutParams();
                if ((c0084d.f649d & 1) == 1) {
                    c0084d.f649d = 0;
                    List<InterfaceC0083c> list = this.f638u;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            this.f638u.get(size).m248d(view);
                        }
                    }
                    m241q(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C0084d c0084d2 = (C0084d) view.getLayoutParams();
                if ((c0084d2.f649d & 1) == 0) {
                    c0084d2.f649d = 1;
                    List<InterfaceC0083c> list2 = this.f638u;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            this.f638u.get(size2).m246b(view);
                        }
                    }
                    m241q(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != this.f629l) {
            this.f629l = i4;
            List<InterfaceC0083c> list3 = this.f638u;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    this.f638u.get(size3).m245a(i4);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m229c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f630m) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f620c = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m236l(childAt)) {
                C0418m.m1578u(childAt, this.f620c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0083c interfaceC0083c) {
        List<InterfaceC0083c> list;
        InterfaceC0083c interfaceC0083c2 = this.f637t;
        if (interfaceC0083c2 != null && interfaceC0083c2 != null && (list = this.f638u) != null) {
            list.remove(interfaceC0083c2);
        }
        if (interfaceC0083c != null) {
            if (this.f638u == null) {
                this.f638u = new ArrayList();
            }
            this.f638u.add(interfaceC0083c);
        }
        this.f637t = interfaceC0083c;
    }

    public void setDrawerLockMode(int i) {
        m239o(i, 3);
        m239o(i, 5);
    }

    public void setScrimColor(int i) {
        this.f622e = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f641x = i != 0 ? C0362a.m1469c(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f641x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f641x = new ColorDrawable(i);
        invalidate();
    }
}
