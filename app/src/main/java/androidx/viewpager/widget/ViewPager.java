package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.MainActivity;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p049j.p050a.AbstractC0442a;
import p006b.p056m.p057b.AbstractC0452a0;
import p006b.p056m.p057b.AbstractC0488w;
import p006b.p056m.p057b.C0451a;
import p006b.p061o.AbstractC0499d;
import p006b.p078z.p079a.AbstractC0612a;
import p006b.p078z.p079a.C0613b;
import c.a.a.a.a;
import c.c.a.v3.g0;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: a0 */
    public static final int[] f1119a0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: b0 */
    public static final Comparator<C0172e> f1120b0 = new C0168a();

    /* JADX INFO: renamed from: c0 */
    public static final Interpolator f1121c0 = new InterpolatorC0169b();

    /* JADX INFO: renamed from: d0 */
    public static final C0179l f1122d0 = new C0179l();

    /* JADX INFO: renamed from: A */
    public int f1123A;

    /* JADX INFO: renamed from: B */
    public int f1124B;

    /* JADX INFO: renamed from: C */
    public int f1125C;

    /* JADX INFO: renamed from: D */
    public float f1126D;

    /* JADX INFO: renamed from: E */
    public float f1127E;

    /* JADX INFO: renamed from: F */
    public float f1128F;

    /* JADX INFO: renamed from: G */
    public float f1129G;

    /* JADX INFO: renamed from: H */
    public int f1130H;

    /* JADX INFO: renamed from: I */
    public VelocityTracker f1131I;

    /* JADX INFO: renamed from: J */
    public int f1132J;

    /* JADX INFO: renamed from: K */
    public int f1133K;

    /* JADX INFO: renamed from: L */
    public int f1134L;

    /* JADX INFO: renamed from: M */
    public int f1135M;

    /* JADX INFO: renamed from: N */
    public EdgeEffect f1136N;

    /* JADX INFO: renamed from: O */
    public EdgeEffect f1137O;

    /* JADX INFO: renamed from: P */
    public boolean f1138P;

    /* JADX INFO: renamed from: Q */
    public boolean f1139Q;

    /* JADX INFO: renamed from: R */
    public int f1140R;

    /* JADX INFO: renamed from: S */
    public List<InterfaceC0176i> f1141S;

    /* JADX INFO: renamed from: T */
    public InterfaceC0176i f1142T;

    /* JADX INFO: renamed from: U */
    public List<InterfaceC0175h> f1143U;

    /* JADX INFO: renamed from: V */
    public final Runnable f1144V;

    /* JADX INFO: renamed from: W */
    public int f1145W;

    /* JADX INFO: renamed from: b */
    public int f1146b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<C0172e> f1147c;

    /* JADX INFO: renamed from: d */
    public final C0172e f1148d;

    /* JADX INFO: renamed from: e */
    public final Rect f1149e;

    /* JADX INFO: renamed from: f */
    public AbstractC0612a f1150f;

    /* JADX INFO: renamed from: g */
    public int f1151g;

    /* JADX INFO: renamed from: h */
    public int f1152h;

    /* JADX INFO: renamed from: i */
    public Parcelable f1153i;

    /* JADX INFO: renamed from: j */
    public ClassLoader f1154j;

    /* JADX INFO: renamed from: k */
    public Scroller f1155k;

    /* JADX INFO: renamed from: l */
    public boolean f1156l;

    /* JADX INFO: renamed from: m */
    public C0177j f1157m;

    /* JADX INFO: renamed from: n */
    public int f1158n;

    /* JADX INFO: renamed from: o */
    public Drawable f1159o;

    /* JADX INFO: renamed from: p */
    public int f1160p;

    /* JADX INFO: renamed from: q */
    public int f1161q;

    /* JADX INFO: renamed from: r */
    public float f1162r;

    /* JADX INFO: renamed from: s */
    public float f1163s;

    /* JADX INFO: renamed from: t */
    public int f1164t;

    /* JADX INFO: renamed from: u */
    public boolean f1165u;

    /* JADX INFO: renamed from: v */
    public boolean f1166v;

    /* JADX INFO: renamed from: w */
    public boolean f1167w;

    /* JADX INFO: renamed from: x */
    public int f1168x;

    /* JADX INFO: renamed from: y */
    public boolean f1169y;

    /* JADX INFO: renamed from: z */
    public boolean f1170z;

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C0168a implements Comparator<C0172e> {
        @Override // java.util.Comparator
        public int compare(C0172e c0172e, C0172e c0172e2) {
            return c0172e.f1173b - c0172e2.f1173b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class InterpolatorC0169b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$c */
    public class RunnableC0170c implements Runnable {
        public RunnableC0170c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.m743q(viewPager.f1151g);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$d */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC0171d {
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$e */
    public static class C0172e {

        /* JADX INFO: renamed from: a */
        public Object f1172a;

        /* JADX INFO: renamed from: b */
        public int f1173b;

        /* JADX INFO: renamed from: c */
        public boolean f1174c;

        /* JADX INFO: renamed from: d */
        public float f1175d;

        /* JADX INFO: renamed from: e */
        public float f1176e;
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C0173f extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a */
        public boolean f1177a;

        /* JADX INFO: renamed from: b */
        public int f1178b;

        /* JADX INFO: renamed from: c */
        public float f1179c;

        /* JADX INFO: renamed from: d */
        public boolean f1180d;

        /* JADX INFO: renamed from: e */
        public int f1181e;

        /* JADX INFO: renamed from: f */
        public int f1182f;

        public C0173f() {
            super(-1, -1);
            this.f1179c = 0.0f;
        }

        public C0173f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1179c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1119a0);
            this.f1178b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$g */
    public class C0174g extends C0406a {
        public C0174g() {
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: c */
        public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0612a abstractC0612a;
            this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AbstractC0612a abstractC0612a2 = ViewPager.this.f1150f;
            accessibilityEvent.setScrollable(abstractC0612a2 != null && abstractC0612a2.mo2186c() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0612a = ViewPager.this.f1150f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0612a.mo2186c());
            accessibilityEvent.setFromIndex(ViewPager.this.f1151g);
            accessibilityEvent.setToIndex(ViewPager.this.f1151g);
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
            c0429b.f2743a.setClassName(ViewPager.class.getName());
            AbstractC0612a abstractC0612a = ViewPager.this.f1150f;
            c0429b.f2743a.setScrollable(abstractC0612a != null && abstractC0612a.mo2186c() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                c0429b.f2743a.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c0429b.f2743a.addAction(8192);
            }
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: g */
        public boolean mo224g(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo224g(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f1151g - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f1151g + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface InterfaceC0175h {
        /* JADX INFO: renamed from: a */
        void mo749a(ViewPager viewPager, AbstractC0612a abstractC0612a, AbstractC0612a abstractC0612a2);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface InterfaceC0176i {
        /* JADX INFO: renamed from: a */
        void mo750a(int i, float f, int i2);

        /* JADX INFO: renamed from: b */
        void mo751b(int i);

        /* JADX INFO: renamed from: c */
        void mo752c(int i);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$j */
    public class C0177j extends DataSetObserver {
        public C0177j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m731e();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m731e();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$k */
    public static class C0178k extends AbstractC0442a {
        public static final Parcelable.Creator<C0178k> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public int f1185d;

        /* JADX INFO: renamed from: e */
        public Parcelable f1186e;

        /* JADX INFO: renamed from: f */
        public ClassLoader f1187f;

        /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$k$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0178k> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0178k(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0178k[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0178k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0178k(parcel, classLoader);
            }
        }

        public C0178k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? C0178k.class.getClassLoader() : classLoader;
            this.f1185d = parcel.readInt();
            this.f1186e = parcel.readParcelable(classLoader);
            this.f1187f = classLoader;
        }

        public C0178k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("FragmentPager.SavedState{");
            sbM2191e.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2191e.append(" position=");
            sbM2191e.append(this.f1185d);
            sbM2191e.append("}");
            return sbM2191e.toString();
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeInt(this.f1185d);
            parcel.writeParcelable(this.f1186e, i);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$l */
    public static class C0179l implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            C0173f c0173f = (C0173f) view.getLayoutParams();
            C0173f c0173f2 = (C0173f) view2.getLayoutParams();
            boolean z = c0173f.f1177a;
            if (z != c0173f2.f1177a) {
                return z ? 1 : -1;
            }
            return c0173f.f1181e - c0173f2.f1181e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1147c = new ArrayList<>();
        this.f1148d = new C0172e();
        this.f1149e = new Rect();
        this.f1152h = -1;
        this.f1153i = null;
        this.f1154j = null;
        this.f1162r = -3.4028235E38f;
        this.f1163s = Float.MAX_VALUE;
        this.f1168x = 1;
        this.f1130H = -1;
        this.f1138P = true;
        this.f1144V = new RunnableC0170c();
        this.f1145W = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f1155k = new Scroller(context2, f1121c0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f1125C = viewConfiguration.getScaledPagingTouchSlop();
        this.f1132J = (int) (400.0f * f);
        this.f1133K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1136N = new EdgeEffect(context2);
        this.f1137O = new EdgeEffect(context2);
        this.f1134L = (int) (25.0f * f);
        this.f1135M = (int) (2.0f * f);
        this.f1123A = (int) (f * 16.0f);
        C0418m.m1577t(this, new C0174g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C0418m.m1579v(this, new C0613b(this));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1166v != z) {
            this.f1166v = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0172e m727a(int i, int i2) {
        C0172e c0172e = new C0172e();
        c0172e.f1173b = i;
        AbstractC0488w abstractC0488w = (AbstractC0488w) this.f1150f;
        if (abstractC0488w.f3147e == null) {
            abstractC0488w.f3147e = new C0451a(abstractC0488w.f3145c);
        }
        long j = i;
        g0 abstractC1002g0M1808H = abstractC0488w.f3145c.m1808H(AbstractC0488w.m1869e(getId(), j));
        if (abstractC1002g0M1808H != null) {
            abstractC0488w.f3147e.m1724b(new AbstractC0452a0.a(7, abstractC1002g0M1808H));
        } else {
            abstractC1002g0M1808H = MainActivity.this.f6456H.f4837a.get(i);
            abstractC0488w.f3147e.mo1715e(getId(), abstractC1002g0M1808H, AbstractC0488w.m1869e(getId(), j), 1);
        }
        if (abstractC1002g0M1808H != abstractC0488w.f3148f) {
            abstractC1002g0M1808H.m338y0(false);
            if (abstractC0488w.f3146d == 1) {
                abstractC0488w.f3147e.mo1716g(abstractC1002g0M1808H, AbstractC0499d.b.STARTED);
            } else {
                abstractC1002g0M1808H.m269D0(false);
            }
        }
        c0172e.f1172a = abstractC1002g0M1808H;
        Objects.requireNonNull(this.f1150f);
        c0172e.f1175d = 1.0f;
        if (i2 < 0 || i2 >= this.f1147c.size()) {
            this.f1147c.add(c0172e);
        } else {
            this.f1147c.add(i2, c0172e);
        }
        return c0172e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0172e c0172eM734h;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c0172eM734h = m734h(childAt)) != null && c0172eM734h.f1173b == this.f1151g) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0172e c0172eM734h;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0172eM734h = m734h(childAt)) != null && c0172eM734h.f1173b == this.f1151g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0173f c0173f = (C0173f) layoutParams;
        boolean z = c0173f.f1177a | (view.getClass().getAnnotation(InterfaceC0171d.class) != null);
        c0173f.f1177a = z;
        if (!this.f1165u) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0173f.f1180d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX INFO: renamed from: b */
    public boolean m728b(int i) {
        boolean zM740n;
        boolean z;
        View viewFindFocus = findFocus();
        boolean zM739m = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                StringBuilder sbM2191e = a.m2191e("arrowScroll tried to find focus based on non-child current focused view ");
                sbM2191e.append(sb.toString());
                Log.e("ViewPager", sbM2191e.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zM739m = m739m();
            } else if (i == 66 || i == 2) {
                zM739m = m740n();
            }
        } else if (i == 17) {
            int i2 = m733g(this.f1149e, viewFindNextFocus).left;
            int i3 = m733g(this.f1149e, viewFindFocus).left;
            if (viewFindFocus == null || i2 < i3) {
                zM740n = viewFindNextFocus.requestFocus();
            } else {
                zM740n = m739m();
            }
            zM739m = zM740n;
        } else if (i == 66) {
            int i4 = m733g(this.f1149e, viewFindNextFocus).left;
            int i5 = m733g(this.f1149e, viewFindFocus).left;
            if (viewFindFocus == null || i4 > i5) {
                zM740n = viewFindNextFocus.requestFocus();
            } else {
                zM740n = m740n();
            }
            zM739m = zM740n;
        }
        if (zM739m) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM739m;
    }

    /* JADX INFO: renamed from: c */
    public boolean m729c(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m729c(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f1150f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f1162r));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1163s));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0173f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f1156l = true;
        if (this.f1155k.isFinished() || !this.f1155k.computeScrollOffset()) {
            m730d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1155k.getCurrX();
        int currY = this.f1155k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m741o(currX)) {
                this.f1155k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: d */
    public final void m730d(boolean z) {
        boolean z2 = this.f1145W == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f1155k.isFinished()) {
                this.f1155k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1155k.getCurrX();
                int currY = this.f1155k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m741o(currX);
                    }
                }
            }
        }
        this.f1167w = false;
        for (int i = 0; i < this.f1147c.size(); i++) {
            C0172e c0172e = this.f1147c.get(i);
            if (c0172e.f1174c) {
                c0172e.f1174c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (!z) {
                this.f1144V.run();
                return;
            }
            Runnable runnable = this.f1144V;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postOnAnimation(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM739m;
        int i;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM739m = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zM739m = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zM739m = m728b(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zM739m = m728b(1);
                        } else {
                            zM739m = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zM739m = m740n();
                    } else {
                        i = 66;
                        zM739m = m728b(i);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    zM739m = m739m();
                } else {
                    i = 17;
                    zM739m = m728b(i);
                }
            }
            if (!zM739m) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0172e c0172eM734h;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0172eM734h = m734h(childAt)) != null && c0172eM734h.f1173b == this.f1151g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0612a abstractC0612a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0612a = this.f1150f) != null && abstractC0612a.mo2186c() > 1)) {
            if (!this.f1136N.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f1162r * width);
                this.f1136N.setSize(height, width);
                zDraw = false | this.f1136N.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f1137O.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f1163s + 1.0f)) * width2);
                this.f1137O.setSize(height2, width2);
                zDraw |= this.f1137O.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f1136N.finish();
            this.f1137O.finish();
        }
        if (zDraw) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1159o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public void m731e() {
        int iMo2186c = this.f1150f.mo2186c();
        this.f1146b = iMo2186c;
        boolean z = this.f1147c.size() < (this.f1168x * 2) + 1 && this.f1147c.size() < iMo2186c;
        int i = this.f1151g;
        for (int i2 = 0; i2 < this.f1147c.size(); i2++) {
            C0172e c0172e = this.f1147c.get(i2);
            AbstractC0612a abstractC0612a = this.f1150f;
            Object obj = c0172e.f1172a;
            Objects.requireNonNull(abstractC0612a);
        }
        Collections.sort(this.f1147c, f1120b0);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C0173f c0173f = (C0173f) getChildAt(i3).getLayoutParams();
                if (!c0173f.f1177a) {
                    c0173f.f1179c = 0.0f;
                }
            }
            m748v(i, false, true, 0);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m732f(int i) {
        InterfaceC0176i interfaceC0176i = this.f1142T;
        if (interfaceC0176i != null) {
            interfaceC0176i.mo752c(i);
        }
        List<InterfaceC0176i> list = this.f1141S;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0176i interfaceC0176i2 = this.f1141S.get(i2);
                if (interfaceC0176i2 != null) {
                    interfaceC0176i2.mo752c(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Rect m733g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0173f();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0173f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0612a getAdapter() {
        return this.f1150f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f1151g;
    }

    public int getOffscreenPageLimit() {
        return this.f1168x;
    }

    public int getPageMargin() {
        return this.f1158n;
    }

    /* JADX INFO: renamed from: h */
    public C0172e m734h(View view) {
        for (int i = 0; i < this.f1147c.size(); i++) {
            C0172e c0172e = this.f1147c.get(i);
            AbstractC0612a abstractC0612a = this.f1150f;
            Object obj = c0172e.f1172a;
            Objects.requireNonNull((AbstractC0488w) abstractC0612a);
            if (((Fragment) obj).f667G == view) {
                return c0172e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final C0172e m735i() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f1158n / clientWidth : 0.0f;
        C0172e c0172e = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f1147c.size()) {
            C0172e c0172e2 = this.f1147c.get(i3);
            if (!z && c0172e2.f1173b != (i = i2 + 1)) {
                c0172e2 = this.f1148d;
                c0172e2.f1176e = f + f3 + f2;
                c0172e2.f1173b = i;
                Objects.requireNonNull(this.f1150f);
                c0172e2.f1175d = 1.0f;
                i3--;
            }
            f = c0172e2.f1176e;
            float f4 = c0172e2.f1175d + f + f2;
            if (!z && scrollX < f) {
                return c0172e;
            }
            if (scrollX < f4 || i3 == this.f1147c.size() - 1) {
                return c0172e2;
            }
            i2 = c0172e2.f1173b;
            f3 = c0172e2.f1175d;
            i3++;
            c0172e = c0172e2;
            z = false;
        }
        return c0172e;
    }

    /* JADX INFO: renamed from: j */
    public C0172e m736j(int i) {
        for (int i2 = 0; i2 < this.f1147c.size(); i2++) {
            C0172e c0172e = this.f1147c.get(i2);
            if (c0172e.f1173b == i) {
                return c0172e;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX INFO: renamed from: k */
    public void m737k(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f1140R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0173f c0173f = (C0173f) childAt.getLayoutParams();
                if (c0173f.f1177a) {
                    int i4 = c0173f.f1178b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        InterfaceC0176i interfaceC0176i = this.f1142T;
        if (interfaceC0176i != null) {
            interfaceC0176i.mo750a(i, f, i2);
        }
        List<InterfaceC0176i> list = this.f1141S;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC0176i interfaceC0176i2 = this.f1141S.get(i6);
                if (interfaceC0176i2 != null) {
                    interfaceC0176i2.mo750a(i, f, i2);
                }
            }
        }
        this.f1139Q = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m738l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1130H) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1126D = motionEvent.getX(i);
            this.f1130H = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1131I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m739m() {
        int i = this.f1151g;
        if (i <= 0) {
            return false;
        }
        this.f1167w = false;
        m748v(i - 1, true, false, 0);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m740n() {
        AbstractC0612a abstractC0612a = this.f1150f;
        if (abstractC0612a == null || this.f1151g >= abstractC0612a.mo2186c() - 1) {
            return false;
        }
        int i = this.f1151g + 1;
        this.f1167w = false;
        m748v(i, true, false, 0);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m741o(int i) {
        if (this.f1147c.size() == 0) {
            if (this.f1138P) {
                return false;
            }
            this.f1139Q = false;
            m737k(0, 0.0f, 0);
            if (this.f1139Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0172e c0172eM735i = m735i();
        int clientWidth = getClientWidth();
        int i2 = this.f1158n;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = c0172eM735i.f1173b;
        float f2 = ((i / f) - c0172eM735i.f1176e) / (c0172eM735i.f1175d + (i2 / f));
        this.f1139Q = false;
        m737k(i4, f2, (int) (i3 * f2));
        if (this.f1139Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1138P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1144V);
        Scroller scroller = this.f1155k;
        if (scroller != null && !scroller.isFinished()) {
            this.f1155k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.f1158n <= 0 || this.f1159o == null || this.f1147c.size() <= 0 || this.f1150f == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.f1158n / f2;
        int i2 = 0;
        C0172e c0172e = this.f1147c.get(0);
        float f4 = c0172e.f1176e;
        int size = this.f1147c.size();
        int i3 = c0172e.f1173b;
        int i4 = this.f1147c.get(size - 1).f1173b;
        while (i3 < i4) {
            while (true) {
                i = c0172e.f1173b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c0172e = this.f1147c.get(i2);
            }
            if (i3 == i) {
                float f5 = c0172e.f1176e;
                float f6 = c0172e.f1175d;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                Objects.requireNonNull(this.f1150f);
                f = (f4 + 1.0f) * f2;
                f4 = 1.0f + f3 + f4;
            }
            if (this.f1158n + f > scrollX) {
                this.f1159o.setBounds(Math.round(f), this.f1160p, Math.round(this.f1158n + f), this.f1161q);
                this.f1159o.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m746t();
            return false;
        }
        if (action != 0) {
            if (this.f1169y) {
                return true;
            }
            if (this.f1170z) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1128F = x;
            this.f1126D = x;
            float y = motionEvent.getY();
            this.f1129G = y;
            this.f1127E = y;
            this.f1130H = motionEvent.getPointerId(0);
            this.f1170z = false;
            this.f1156l = true;
            this.f1155k.computeScrollOffset();
            if (this.f1145W != 2 || Math.abs(this.f1155k.getFinalX() - this.f1155k.getCurrX()) <= this.f1135M) {
                m730d(false);
                this.f1169y = false;
            } else {
                this.f1155k.abortAnimation();
                this.f1167w = false;
                m743q(this.f1151g);
                this.f1169y = true;
                m745s(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f1130H;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f1126D;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f1129G);
                if (f != 0.0f) {
                    float f2 = this.f1126D;
                    if (!((f2 < ((float) this.f1124B) && f > 0.0f) || (f2 > ((float) (getWidth() - this.f1124B)) && f < 0.0f)) && m729c(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f1126D = x2;
                        this.f1127E = y2;
                        this.f1170z = true;
                        return false;
                    }
                }
                int i2 = this.f1125C;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.f1169y = true;
                    m745s(true);
                    setScrollState(1);
                    this.f1126D = f > 0.0f ? this.f1128F + this.f1125C : this.f1128F - this.f1125C;
                    this.f1127E = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.f1170z = true;
                }
                if (this.f1169y && m742p(x2)) {
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m738l(motionEvent);
        }
        if (this.f1131I == null) {
            this.f1131I = VelocityTracker.obtain();
        }
        this.f1131I.addMovement(motionEvent);
        return this.f1169y;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0172e c0172eM734h;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0173f c0173f = (C0173f) childAt.getLayoutParams();
                if (c0173f.f1177a) {
                    int i9 = c0173f.f1178b;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C0173f c0173f2 = (C0173f) childAt2.getLayoutParams();
                if (!c0173f2.f1177a && (c0172eM734h = m734h(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c0172eM734h.f1176e * f)) + paddingLeft;
                    if (c0173f2.f1180d) {
                        c0173f2.f1180d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0173f2.f1179c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f1160p = paddingTop;
        this.f1161q = i6 - paddingBottom;
        this.f1140R = i7;
        if (this.f1138P) {
            z2 = false;
            m747u(this.f1151g, false, 0, false);
        } else {
            z2 = false;
        }
        this.f1138P = z2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af A[SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0173f c0173f;
        C0173f c0173f2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1124B = Math.min(measuredWidth / 10, this.f1123A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c0173f2 = (C0173f) childAt.getLayoutParams()) != null && c0173f2.f1177a) {
                int i8 = c0173f2.f1178b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = RecyclerView.UNDEFINED_DURATION;
                if (z2) {
                    i11 = 1073741824;
                } else {
                    if (z) {
                        i3 = 1073741824;
                    }
                    i4 = ((ViewGroup.LayoutParams) c0173f2).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c0173f2).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i3 = RecyclerView.UNDEFINED_DURATION;
                i4 = ((ViewGroup.LayoutParams) c0173f2).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) c0173f2).height;
                if (i5 != -2) {
                    i5 = measuredHeight;
                    i7 = i3;
                } else if (i5 == -1) {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f1164t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f1165u = true;
        m743q(this.f1151g);
        this.f1165u = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0173f = (C0173f) childAt2.getLayoutParams()) == null || !c0173f.f1177a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0173f.f1179c), 1073741824), this.f1164t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0172e c0172eM734h;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0172eM734h = m734h(childAt)) != null && c0172eM734h.f1173b == this.f1151g && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0178k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0178k c0178k = (C0178k) parcelable;
        super.onRestoreInstanceState(c0178k.f2812b);
        AbstractC0612a abstractC0612a = this.f1150f;
        if (abstractC0612a != null) {
            m748v(c0178k.f1185d, false, true, 0);
        } else {
            this.f1152h = c0178k.f1185d;
            this.f1153i = c0178k.f1186e;
            this.f1154j = c0178k.f1187f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0178k c0178k = new C0178k(super.onSaveInstanceState());
        c0178k.f1185d = this.f1151g;
        AbstractC0612a abstractC0612a = this.f1150f;
        if (abstractC0612a != null) {
            Objects.requireNonNull(abstractC0612a);
            c0178k.f1186e = null;
        }
        return c0178k;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f1158n;
            m744r(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC0612a abstractC0612a;
        int pointerId;
        boolean zM746t = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC0612a = this.f1150f) == null || abstractC0612a.mo2186c() == 0) {
            return false;
        }
        if (this.f1131I == null) {
            this.f1131I = VelocityTracker.obtain();
        }
        this.f1131I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f1169y) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1130H);
                        if (iFindPointerIndex == -1) {
                            zM746t = m746t();
                        } else {
                            float x = motionEvent.getX(iFindPointerIndex);
                            float fAbs = Math.abs(x - this.f1126D);
                            float y = motionEvent.getY(iFindPointerIndex);
                            float fAbs2 = Math.abs(y - this.f1127E);
                            if (fAbs > this.f1125C && fAbs > fAbs2) {
                                this.f1169y = true;
                                m745s(true);
                                float f = this.f1128F;
                                this.f1126D = x - f > 0.0f ? f + this.f1125C : f - this.f1125C;
                                this.f1127E = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f1169y) {
                        zM746t = false | m742p(motionEvent.getX(motionEvent.findPointerIndex(this.f1130H)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f1126D = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m738l(motionEvent);
                        this.f1126D = motionEvent.getX(motionEvent.findPointerIndex(this.f1130H));
                    }
                } else if (this.f1169y) {
                    m747u(this.f1151g, true, 0, false);
                    zM746t = m746t();
                }
            } else if (this.f1169y) {
                VelocityTracker velocityTracker = this.f1131I;
                velocityTracker.computeCurrentVelocity(1000, this.f1133K);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f1130H);
                this.f1167w = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0172e c0172eM735i = m735i();
                float f2 = clientWidth;
                float f3 = this.f1158n / f2;
                int iMax = c0172eM735i.f1173b;
                float f4 = ((scrollX / f2) - c0172eM735i.f1176e) / (c0172eM735i.f1175d + f3);
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1130H)) - this.f1128F)) <= this.f1134L || Math.abs(xVelocity) <= this.f1132J) {
                    iMax += (int) (f4 + (iMax >= this.f1151g ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    iMax++;
                }
                if (this.f1147c.size() > 0) {
                    C0172e c0172e = this.f1147c.get(0);
                    ArrayList<C0172e> arrayList = this.f1147c;
                    iMax = Math.max(c0172e.f1173b, Math.min(iMax, arrayList.get(arrayList.size() - 1).f1173b));
                }
                m748v(iMax, true, true, xVelocity);
                zM746t = m746t();
            }
            if (zM746t) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                postInvalidateOnAnimation();
            }
            return true;
        }
        this.f1155k.abortAnimation();
        this.f1167w = false;
        m743q(this.f1151g);
        float x2 = motionEvent.getX();
        this.f1128F = x2;
        this.f1126D = x2;
        float y2 = motionEvent.getY();
        this.f1129G = y2;
        this.f1127E = y2;
        pointerId = motionEvent.getPointerId(0);
        this.f1130H = pointerId;
        if (zM746t) {
            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m742p(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1126D - f;
        this.f1126D = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f1162r * clientWidth;
        float f4 = this.f1163s * clientWidth;
        boolean z3 = false;
        C0172e c0172e = this.f1147c.get(0);
        ArrayList<C0172e> arrayList = this.f1147c;
        C0172e c0172e2 = arrayList.get(arrayList.size() - 1);
        if (c0172e.f1173b != 0) {
            f3 = c0172e.f1176e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0172e2.f1173b != this.f1150f.mo2186c() - 1) {
            f4 = c0172e2.f1176e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f1136N.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f1137O.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1126D = (scrollX - i) + this.f1126D;
        scrollTo(i, getScrollY());
        m741o(i);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d7 A[PHI: r6 r8 r15
      0x00d7: PHI (r6v20 int) = (r6v19 int), (r6v8 int), (r6v24 int) binds: [B:59:0x00d5, B:56:0x00c7, B:50:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r8v48 int) = (r8v1 int), (r8v47 int), (r8v52 int) binds: [B:59:0x00d5, B:56:0x00c7, B:50:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r15v4 float) = (r15v2 float), (r15v3 float), (r15v1 float) binds: [B:59:0x00d5, B:56:0x00c7, B:50:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0 A[PHI: r6 r8 r15
      0x00e0: PHI (r6v23 int) = (r6v19 int), (r6v8 int), (r6v24 int) binds: [B:59:0x00d5, B:56:0x00c7, B:50:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r8v51 int) = (r8v1 int), (r8v47 int), (r8v52 int) binds: [B:59:0x00d5, B:56:0x00c7, B:50:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r15v7 float) = (r15v2 float), (r15v3 float), (r15v1 float) binds: [B:59:0x00d5, B:56:0x00c7, B:50:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x015d A[PHI: r3 r11
      0x015d: PHI (r3v26 float) = (r3v24 float), (r3v25 float), (r3v23 float) binds: [B:94:0x015b, B:91:0x0149, B:85:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r11v24 int) = (r11v22 int), (r11v23 int), (r11v21 int) binds: [B:94:0x015b, B:91:0x0149, B:85:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0166 A[PHI: r3 r11
      0x0166: PHI (r3v28 float) = (r3v24 float), (r3v25 float), (r3v23 float) binds: [B:94:0x015b, B:91:0x0149, B:85:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r11v26 int) = (r11v22 int), (r11v23 int), (r11v21 int) binds: [B:94:0x015b, B:91:0x0149, B:85:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: q */
    public void m743q(int i) {
        C0172e c0172eM736j;
        String hexString;
        C0172e c0172eM727a;
        C0172e c0172eM734h;
        C0172e c0172eM734h2;
        int i2;
        int i3;
        C0172e c0172e;
        C0172e c0172e2;
        C0172e c0172e3;
        int i4 = this.f1151g;
        if (i4 != i) {
            c0172eM736j = m736j(i4);
            this.f1151g = i;
        } else {
            c0172eM736j = null;
        }
        if (this.f1150f == null || this.f1167w || getWindowToken() == null) {
            return;
        }
        this.f1150f.mo1872d(this);
        int i5 = this.f1168x;
        int i6 = 0;
        int iMax = Math.max(0, this.f1151g - i5);
        int iMo2186c = this.f1150f.mo2186c();
        int iMin = Math.min(iMo2186c - 1, this.f1151g + i5);
        if (iMo2186c != this.f1146b) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sbM2191e = a.m2191e("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            sbM2191e.append(this.f1146b);
            sbM2191e.append(", found: ");
            sbM2191e.append(iMo2186c);
            sbM2191e.append(" Pager id: ");
            sbM2191e.append(hexString);
            sbM2191e.append(" Pager class: ");
            sbM2191e.append(getClass());
            sbM2191e.append(" Problematic adapter: ");
            sbM2191e.append(this.f1150f.getClass());
            throw new IllegalStateException(sbM2191e.toString());
        }
        int i7 = 0;
        while (true) {
            if (i7 < this.f1147c.size()) {
                c0172eM727a = this.f1147c.get(i7);
                int i8 = c0172eM727a.f1173b;
                int i9 = this.f1151g;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            c0172eM727a = null;
            break;
        }
        if (c0172eM727a == null && iMo2186c > 0) {
            c0172eM727a = m727a(this.f1151g, i7);
        }
        if (c0172eM727a != null) {
            int i10 = i7 - 1;
            C0172e c0172e4 = i10 >= 0 ? this.f1147c.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c0172eM727a.f1175d) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i11 = this.f1151g - 1; i11 >= 0; i11--) {
                if (f < paddingLeft || i11 >= iMax) {
                    if (c0172e4 == null || i11 != c0172e4.f1173b) {
                        f += m727a(i11, i10 + 1).f1175d;
                        i7++;
                        if (i10 >= 0) {
                            c0172e3 = this.f1147c.get(i10);
                        } else {
                            c0172e3 = null;
                        }
                    } else {
                        f += c0172e4.f1175d;
                        i10--;
                        if (i10 >= 0) {
                            c0172e3 = this.f1147c.get(i10);
                        } else {
                            c0172e3 = null;
                        }
                    }
                    c0172e4 = c0172e3;
                } else {
                    if (c0172e4 == null) {
                        break;
                    }
                    if (i11 == c0172e4.f1173b && !c0172e4.f1174c) {
                        this.f1147c.remove(i10);
                        this.f1150f.mo1870a(this, i11, c0172e4.f1172a);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            c0172e3 = this.f1147c.get(i10);
                        } else {
                            c0172e3 = null;
                        }
                        c0172e4 = c0172e3;
                    }
                }
            }
            float f2 = c0172eM727a.f1175d;
            int i12 = i7 + 1;
            if (f2 < 2.0f) {
                C0172e c0172e5 = i12 < this.f1147c.size() ? this.f1147c.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = i12;
                for (int i14 = this.f1151g + 1; i14 < iMo2186c; i14++) {
                    if (f2 >= paddingRight && i14 > iMin) {
                        if (c0172e5 == null) {
                            break;
                        }
                        if (i14 == c0172e5.f1173b && !c0172e5.f1174c) {
                            this.f1147c.remove(i13);
                            this.f1150f.mo1870a(this, i14, c0172e5.f1172a);
                            if (i13 < this.f1147c.size()) {
                                c0172e5 = this.f1147c.get(i13);
                            } else {
                                c0172e5 = null;
                            }
                        }
                    } else if (c0172e5 == null || i14 != c0172e5.f1173b) {
                        C0172e c0172eM727a2 = m727a(i14, i13);
                        i13++;
                        f2 += c0172eM727a2.f1175d;
                        if (i13 < this.f1147c.size()) {
                            c0172e5 = this.f1147c.get(i13);
                        } else {
                            c0172e5 = null;
                        }
                    } else {
                        f2 += c0172e5.f1175d;
                        i13++;
                        if (i13 < this.f1147c.size()) {
                            c0172e5 = this.f1147c.get(i13);
                        } else {
                            c0172e5 = null;
                        }
                    }
                }
            }
            int iMo2186c2 = this.f1150f.mo2186c();
            int clientWidth2 = getClientWidth();
            float f3 = clientWidth2 > 0 ? this.f1158n / clientWidth2 : 0.0f;
            if (c0172eM736j != null) {
                int i15 = c0172eM736j.f1173b;
                int i16 = c0172eM727a.f1173b;
                if (i15 < i16) {
                    float f4 = c0172eM736j.f1176e + c0172eM736j.f1175d + f3;
                    int i17 = 0;
                    while (true) {
                        i15++;
                        if (i15 > c0172eM727a.f1173b || i17 >= this.f1147c.size()) {
                            break;
                        }
                        while (true) {
                            c0172e2 = this.f1147c.get(i17);
                            if (i15 <= c0172e2.f1173b || i17 >= this.f1147c.size() - 1) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        while (i15 < c0172e2.f1173b) {
                            Objects.requireNonNull(this.f1150f);
                            f4 += 1.0f + f3;
                            i15++;
                        }
                        c0172e2.f1176e = f4;
                        f4 += c0172e2.f1175d + f3;
                    }
                } else if (i15 > i16) {
                    int size = this.f1147c.size() - 1;
                    float f5 = c0172eM736j.f1176e;
                    while (true) {
                        i15--;
                        if (i15 < c0172eM727a.f1173b || size < 0) {
                            break;
                        }
                        while (true) {
                            c0172e = this.f1147c.get(size);
                            if (i15 >= c0172e.f1173b || size <= 0) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        while (i15 > c0172e.f1173b) {
                            Objects.requireNonNull(this.f1150f);
                            f5 -= 1.0f + f3;
                            i15--;
                        }
                        f5 -= c0172e.f1175d + f3;
                        c0172e.f1176e = f5;
                    }
                }
            }
            int size2 = this.f1147c.size();
            float f6 = c0172eM727a.f1176e;
            int i18 = c0172eM727a.f1173b;
            int i19 = i18 - 1;
            this.f1162r = i18 == 0 ? f6 : -3.4028235E38f;
            int i20 = iMo2186c2 - 1;
            this.f1163s = i18 == i20 ? (c0172eM727a.f1175d + f6) - 1.0f : Float.MAX_VALUE;
            int i21 = i7 - 1;
            while (i21 >= 0) {
                C0172e c0172e6 = this.f1147c.get(i21);
                while (true) {
                    i3 = c0172e6.f1173b;
                    if (i19 <= i3) {
                        break;
                    }
                    i19--;
                    Objects.requireNonNull(this.f1150f);
                    f6 -= 1.0f + f3;
                }
                f6 -= c0172e6.f1175d + f3;
                c0172e6.f1176e = f6;
                if (i3 == 0) {
                    this.f1162r = f6;
                }
                i21--;
                i19--;
            }
            float f7 = c0172eM727a.f1176e + c0172eM727a.f1175d + f3;
            int i22 = c0172eM727a.f1173b + 1;
            while (i12 < size2) {
                C0172e c0172e7 = this.f1147c.get(i12);
                while (true) {
                    i2 = c0172e7.f1173b;
                    if (i22 >= i2) {
                        break;
                    }
                    i22++;
                    Objects.requireNonNull(this.f1150f);
                    f7 += 1.0f + f3;
                }
                if (i2 == i20) {
                    this.f1163s = (c0172e7.f1175d + f7) - 1.0f;
                }
                c0172e7.f1176e = f7;
                f7 += c0172e7.f1175d + f3;
                i12++;
                i22++;
            }
            AbstractC0612a abstractC0612a = this.f1150f;
            Object obj = c0172eM727a.f1172a;
            AbstractC0488w abstractC0488w = (AbstractC0488w) abstractC0612a;
            Objects.requireNonNull(abstractC0488w);
            Fragment fragment = (Fragment) obj;
            Fragment fragment2 = abstractC0488w.f3148f;
            i6 = 0;
            if (fragment != fragment2) {
                if (fragment2 != null) {
                    fragment2.m338y0(false);
                    if (abstractC0488w.f3146d == 1) {
                        if (abstractC0488w.f3147e == null) {
                            abstractC0488w.f3147e = new C0451a(abstractC0488w.f3145c);
                        }
                        abstractC0488w.f3147e.mo1716g(abstractC0488w.f3148f, AbstractC0499d.b.STARTED);
                        i6 = 0;
                    } else {
                        i6 = 0;
                        abstractC0488w.f3148f.m269D0(false);
                    }
                }
                fragment.m338y0(true);
                if (abstractC0488w.f3146d == 1) {
                    if (abstractC0488w.f3147e == null) {
                        abstractC0488w.f3147e = new C0451a(abstractC0488w.f3145c);
                    }
                    abstractC0488w.f3147e.mo1716g(fragment, AbstractC0499d.b.RESUMED);
                } else {
                    fragment.m269D0(true);
                }
                abstractC0488w.f3148f = fragment;
            }
        }
        this.f1150f.mo1871b(this);
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            C0173f c0173f = (C0173f) childAt.getLayoutParams();
            c0173f.f1182f = i23;
            if (!c0173f.f1177a && c0173f.f1179c == 0.0f && (c0172eM734h2 = m734h(childAt)) != null) {
                c0173f.f1179c = c0172eM734h2.f1175d;
                c0173f.f1181e = c0172eM734h2.f1173b;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                c0172eM734h = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    c0172eM734h = m734h(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        c0172eM734h = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (c0172eM734h == null || c0172eM734h.f1173b != this.f1151g) {
                while (i6 < getChildCount()) {
                    View childAt2 = getChildAt(i6);
                    C0172e c0172eM734h3 = m734h(childAt2);
                    if (c0172eM734h3 != null && c0172eM734h3.f1173b == this.f1151g && childAt2.requestFocus(2)) {
                        return;
                    } else {
                        i6++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m744r(int i, int i2, int i3, int i4) {
        int iMin;
        if (i2 <= 0 || this.f1147c.isEmpty()) {
            C0172e c0172eM736j = m736j(this.f1151g);
            iMin = (int) ((c0172eM736j != null ? Math.min(c0172eM736j.f1176e, this.f1163s) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                m730d(false);
            }
        } else if (!this.f1155k.isFinished()) {
            this.f1155k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(iMin, getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f1165u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m745s(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAdapter(AbstractC0612a abstractC0612a) {
        AbstractC0612a abstractC0612a2 = this.f1150f;
        if (abstractC0612a2 != null) {
            synchronized (abstractC0612a2) {
                abstractC0612a2.f3749b = null;
            }
            this.f1150f.mo1872d(this);
            for (int i = 0; i < this.f1147c.size(); i++) {
                C0172e c0172e = this.f1147c.get(i);
                this.f1150f.mo1870a(this, c0172e.f1173b, c0172e.f1172a);
            }
            this.f1150f.mo1871b(this);
            this.f1147c.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C0173f) getChildAt(i2).getLayoutParams()).f1177a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f1151g = 0;
            scrollTo(0, 0);
        }
        AbstractC0612a abstractC0612a3 = this.f1150f;
        this.f1150f = abstractC0612a;
        this.f1146b = 0;
        if (abstractC0612a != null) {
            if (this.f1157m == null) {
                this.f1157m = new C0177j();
            }
            AbstractC0612a abstractC0612a4 = this.f1150f;
            C0177j c0177j = this.f1157m;
            synchronized (abstractC0612a4) {
                abstractC0612a4.f3749b = c0177j;
            }
            this.f1167w = false;
            boolean z = this.f1138P;
            this.f1138P = true;
            this.f1146b = this.f1150f.mo2186c();
            if (this.f1152h >= 0) {
                Objects.requireNonNull((AbstractC0488w) this.f1150f);
                m748v(this.f1152h, false, true, 0);
                this.f1152h = -1;
                this.f1153i = null;
                this.f1154j = null;
            } else if (z) {
                requestLayout();
            } else {
                m743q(this.f1151g);
            }
        }
        List<InterfaceC0175h> list = this.f1143U;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f1143U.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f1143U.get(i3).mo749a(this, abstractC0612a3, abstractC0612a);
        }
    }

    public void setCurrentItem(int i) {
        this.f1167w = false;
        m748v(i, !this.f1138P, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f1168x) {
            this.f1168x = i;
            m743q(this.f1151g);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0176i interfaceC0176i) {
        this.f1142T = interfaceC0176i;
    }

    public void setPageMargin(int i) {
        int i2 = this.f1158n;
        this.f1158n = i;
        int width = getWidth();
        m744r(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0362a.m1469c(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1159o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f1145W == i) {
            return;
        }
        this.f1145W = i;
        InterfaceC0176i interfaceC0176i = this.f1142T;
        if (interfaceC0176i != null) {
            interfaceC0176i.mo751b(i);
        }
        List<InterfaceC0176i> list = this.f1141S;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0176i interfaceC0176i2 = this.f1141S.get(i2);
                if (interfaceC0176i2 != null) {
                    interfaceC0176i2.mo751b(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m746t() {
        this.f1130H = -1;
        this.f1169y = false;
        this.f1170z = false;
        VelocityTracker velocityTracker = this.f1131I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1131I = null;
        }
        this.f1136N.onRelease();
        this.f1137O.onRelease();
        return this.f1136N.isFinished() || this.f1137O.isFinished();
    }

    /* JADX INFO: renamed from: u */
    public final void m747u(int i, boolean z, int i2, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        C0172e c0172eM736j = m736j(i);
        if (c0172eM736j != null) {
            iMax = (int) (Math.max(this.f1162r, Math.min(c0172eM736j.f1176e, this.f1163s)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                m732f(i);
            }
            m730d(false);
            scrollTo(iMax, 0);
            m741o(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f1155k;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f1156l ? this.f1155k.getCurrX() : this.f1155k.getStartX();
                this.f1155k.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m730d(false);
                m743q(this.f1151g);
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    Objects.requireNonNull(this.f1150f);
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.f1158n)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f1156l = false;
                this.f1155k.startScroll(i3, scrollY, i4, i5, iMin);
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m732f(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m748v(int i, boolean z, boolean z2, int i2) {
        AbstractC0612a abstractC0612a = this.f1150f;
        if (abstractC0612a == null || abstractC0612a.mo2186c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f1151g == i && this.f1147c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f1150f.mo2186c()) {
            i = this.f1150f.mo2186c() - 1;
        }
        int i3 = this.f1168x;
        int i4 = this.f1151g;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f1147c.size(); i5++) {
                this.f1147c.get(i5).f1174c = true;
            }
        }
        boolean z3 = this.f1151g != i;
        if (!this.f1138P) {
            m743q(i);
            m747u(i, z, i2, z3);
        } else {
            this.f1151g = i;
            if (z3) {
                m732f(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1159o;
    }
}
