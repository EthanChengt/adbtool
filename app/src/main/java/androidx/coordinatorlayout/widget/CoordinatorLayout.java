package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.didjdk.adbhelper.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p030g.C0351a;
import p006b.p030g.p031b.C0352a;
import p006b.p030g.p031b.C0353b;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p043i.C0405e;
import p006b.p032h.p043i.InterfaceC0403c;
import p006b.p032h.p044j.C0414i;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;
import p006b.p032h.p044j.InterfaceC0411f;
import p006b.p032h.p044j.InterfaceC0412g;
import p006b.p032h.p044j.InterfaceC0415j;
import p006b.p049j.p050a.AbstractC0442a;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0411f, InterfaceC0412g {

    /* JADX INFO: renamed from: v */
    public static final String f515v;

    /* JADX INFO: renamed from: w */
    public static final Class<?>[] f516w;

    /* JADX INFO: renamed from: x */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0068c>>> f517x;

    /* JADX INFO: renamed from: y */
    public static final Comparator<View> f518y;

    /* JADX INFO: renamed from: z */
    public static final InterfaceC0403c<Rect> f519z;

    /* JADX INFO: renamed from: b */
    public final List<View> f520b;

    /* JADX INFO: renamed from: c */
    public final C0352a<View> f521c;

    /* JADX INFO: renamed from: d */
    public final List<View> f522d;

    /* JADX INFO: renamed from: e */
    public final List<View> f523e;

    /* JADX INFO: renamed from: f */
    public Paint f524f;

    /* JADX INFO: renamed from: g */
    public final int[] f525g;

    /* JADX INFO: renamed from: h */
    public final int[] f526h;

    /* JADX INFO: renamed from: i */
    public boolean f527i;

    /* JADX INFO: renamed from: j */
    public boolean f528j;

    /* JADX INFO: renamed from: k */
    public int[] f529k;

    /* JADX INFO: renamed from: l */
    public View f530l;

    /* JADX INFO: renamed from: m */
    public View f531m;

    /* JADX INFO: renamed from: n */
    public ViewTreeObserverOnPreDrawListenerC0072g f532n;

    /* JADX INFO: renamed from: o */
    public boolean f533o;

    /* JADX INFO: renamed from: p */
    public C0427v f534p;

    /* JADX INFO: renamed from: q */
    public boolean f535q;

    /* JADX INFO: renamed from: r */
    public Drawable f536r;

    /* JADX INFO: renamed from: s */
    public ViewGroup.OnHierarchyChangeListener f537s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0415j f538t;

    /* JADX INFO: renamed from: u */
    public final C0414i f539u;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0066a implements InterfaceC0415j {
        public C0066a() {
        }

        @Override // p006b.p032h.p044j.InterfaceC0415j
        /* JADX INFO: renamed from: a */
        public C0427v mo162a(View view, C0427v c0427v) {
            AbstractC0068c abstractC0068c;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f534p, c0427v)) {
                coordinatorLayout.f534p = c0427v;
                boolean z = c0427v != null && c0427v.m1603d() > 0;
                coordinatorLayout.f535q = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!c0427v.m1604e()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                        if (childAt.getFitsSystemWindows() && (abstractC0068c = ((C0071f) childAt.getLayoutParams()).f542a) != null) {
                            c0427v = abstractC0068c.m168e(c0427v);
                            if (c0427v.m1604e()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c0427v;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0067b {
        AbstractC0068c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0068c<V extends View> {
        public AbstractC0068c() {
        }

        public AbstractC0068c(Context context, AttributeSet attributeSet) {
        }

        /* JADX INFO: renamed from: A */
        public boolean mo163A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo164a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public int m165b() {
            return -16777216;
        }

        /* JADX INFO: renamed from: c */
        public float m166c() {
            return 0.0f;
        }

        /* JADX INFO: renamed from: d */
        public boolean mo167d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public C0427v m168e(C0427v c0427v) {
            return c0427v;
        }

        /* JADX INFO: renamed from: f */
        public void mo169f(C0071f c0071f) {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo170g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public void m171h() {
        }

        /* JADX INFO: renamed from: i */
        public void mo172i() {
        }

        /* JADX INFO: renamed from: j */
        public boolean mo173j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: k */
        public boolean mo174k(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* JADX INFO: renamed from: l */
        public boolean mo175l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public boolean m176m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo177n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: o */
        public void m178o() {
        }

        /* JADX INFO: renamed from: p */
        public void mo179p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m178o();
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: q */
        public void mo180q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* JADX INFO: renamed from: r */
        public void mo181r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                mo180q(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: s */
        public void m182s() {
        }

        /* JADX INFO: renamed from: t */
        public boolean mo183t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* JADX INFO: renamed from: u */
        public void mo184u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: v */
        public Parcelable mo185v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* JADX INFO: renamed from: w */
        public boolean mo186w(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* JADX INFO: renamed from: x */
        public boolean mo187x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo186w(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: y */
        public void m188y() {
        }

        /* JADX INFO: renamed from: z */
        public void mo189z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m188y();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC0069d {
        Class<? extends AbstractC0068c> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0070e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0070e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f537s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m153r(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f537s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0071f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0068c f542a;

        /* JADX INFO: renamed from: b */
        public boolean f543b;

        /* JADX INFO: renamed from: c */
        public int f544c;

        /* JADX INFO: renamed from: d */
        public int f545d;

        /* JADX INFO: renamed from: e */
        public int f546e;

        /* JADX INFO: renamed from: f */
        public int f547f;

        /* JADX INFO: renamed from: g */
        public int f548g;

        /* JADX INFO: renamed from: h */
        public int f549h;

        /* JADX INFO: renamed from: i */
        public int f550i;

        /* JADX INFO: renamed from: j */
        public int f551j;

        /* JADX INFO: renamed from: k */
        public View f552k;

        /* JADX INFO: renamed from: l */
        public View f553l;

        /* JADX INFO: renamed from: m */
        public boolean f554m;

        /* JADX INFO: renamed from: n */
        public boolean f555n;

        /* JADX INFO: renamed from: o */
        public boolean f556o;

        /* JADX INFO: renamed from: p */
        public boolean f557p;

        /* JADX INFO: renamed from: q */
        public final Rect f558q;

        public C0071f(int i, int i2) {
            super(i, i2);
            this.f543b = false;
            this.f544c = 0;
            this.f545d = 0;
            this.f546e = -1;
            this.f547f = -1;
            this.f548g = 0;
            this.f549h = 0;
            this.f558q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0071f(Context context, AttributeSet attributeSet) {
            AbstractC0068c abstractC0068cNewInstance;
            super(context, attributeSet);
            this.f543b = false;
            this.f544c = 0;
            this.f545d = 0;
            this.f546e = -1;
            this.f547f = -1;
            this.f548g = 0;
            this.f549h = 0;
            this.f558q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0351a.f2524b);
            this.f544c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f547f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f545d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f546e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f548g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f549h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f543b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f515v;
                if (TextUtils.isEmpty(string)) {
                    abstractC0068cNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f515v;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<AbstractC0068c>>> threadLocal = CoordinatorLayout.f517x;
                        Map<String, Constructor<AbstractC0068c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<AbstractC0068c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f516w);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        abstractC0068cNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(a.m2201o("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f542a = abstractC0068cNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0068c abstractC0068c = this.f542a;
            if (abstractC0068c != null) {
                abstractC0068c.mo169f(this);
            }
        }

        public C0071f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f543b = false;
            this.f544c = 0;
            this.f545d = 0;
            this.f546e = -1;
            this.f547f = -1;
            this.f548g = 0;
            this.f549h = 0;
            this.f558q = new Rect();
        }

        public C0071f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f543b = false;
            this.f544c = 0;
            this.f545d = 0;
            this.f546e = -1;
            this.f547f = -1;
            this.f548g = 0;
            this.f549h = 0;
            this.f558q = new Rect();
        }

        public C0071f(C0071f c0071f) {
            super((ViewGroup.MarginLayoutParams) c0071f);
            this.f543b = false;
            this.f544c = 0;
            this.f545d = 0;
            this.f546e = -1;
            this.f547f = -1;
            this.f548g = 0;
            this.f549h = 0;
            this.f558q = new Rect();
        }

        /* JADX INFO: renamed from: a */
        public boolean m190a(int i) {
            if (i == 0) {
                return this.f555n;
            }
            if (i != 1) {
                return false;
            }
            return this.f556o;
        }

        /* JADX INFO: renamed from: b */
        public void m191b(int i, boolean z) {
            if (i == 0) {
                this.f555n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f556o = z;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0072g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0072g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m153r(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0073h extends AbstractC0442a {
        public static final Parcelable.Creator<C0073h> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public SparseArray<Parcelable> f560d;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0073h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0073h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0073h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0073h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0073h(parcel, classLoader);
            }
        }

        public C0073h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f560d = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f560d.append(iArr[i2], parcelableArray[i2]);
            }
        }

        public C0073h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            SparseArray<Parcelable> sparseArray = this.f560d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f560d.keyAt(i2);
                parcelableArr[i2] = this.f560d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0074i implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            View view3 = view;
            View view4 = view2;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            int i = Build.VERSION.SDK_INT;
            float z = i >= 21 ? view3.getZ() : 0.0f;
            float z2 = i >= 21 ? view4.getZ() : 0.0f;
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f515v = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f518y = new C0074i();
        } else {
            f518y = null;
        }
        f516w = new Class[]{Context.class, AttributeSet.class};
        f517x = new ThreadLocal<>();
        f519z = new C0405e(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.er);
        int[] iArr = C0351a.f2523a;
        this.f520b = new ArrayList();
        this.f521c = new C0352a<>();
        this.f522d = new ArrayList();
        this.f523e = new ArrayList();
        this.f525g = new int[2];
        this.f526h = new int[2];
        this.f539u = new C0414i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.er, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.er, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f529k = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f529k.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f529k;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.f536r = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m161z();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0070e());
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m142a() {
        Rect rectMo1537b = f519z.mo1537b();
        return rectMo1537b == null ? new Rect() : rectMo1537b;
    }

    /* JADX INFO: renamed from: b */
    public final void m143b(C0071f c0071f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0071f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0071f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0071f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0071f).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: c */
    public void m144c(View view) {
        ArrayList<View> orDefault = this.f521c.f2526b.getOrDefault(view, null);
        if (orDefault == null || orDefault.isEmpty()) {
            return;
        }
        for (int i = 0; i < orDefault.size(); i++) {
            View view2 = orDefault.get(i);
            AbstractC0068c abstractC0068c = ((C0071f) view2.getLayoutParams()).f542a;
            if (abstractC0068c != null) {
                abstractC0068c.mo170g(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0071f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m145d(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m148g(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0071f c0071f = (C0071f) view.getLayoutParams();
        AbstractC0068c abstractC0068c = c0071f.f542a;
        if (abstractC0068c != null) {
            float fM166c = abstractC0068c.m166c();
            if (fM166c > 0.0f) {
                if (this.f524f == null) {
                    this.f524f = new Paint();
                }
                this.f524f.setColor(c0071f.f542a.m165b());
                Paint paint = this.f524f;
                int iRound = Math.round(fM166c * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f524f);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f536r;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public List<View> m146e(View view) {
        C0352a<View> c0352a = this.f521c;
        int i = c0352a.f2526b.f2197d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListM1276l = c0352a.f2526b.m1276l(i2);
            if (arrayListM1276l != null && arrayListM1276l.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0352a.f2526b.m1272h(i2));
            }
        }
        this.f523e.clear();
        if (arrayList != null) {
            this.f523e.addAll(arrayList);
        }
        return this.f523e;
    }

    /* JADX INFO: renamed from: f */
    public List<View> m147f(View view) {
        ArrayList<View> orDefault = this.f521c.f2526b.getOrDefault(view, null);
        this.f523e.clear();
        if (orDefault != null) {
            this.f523e.addAll(orDefault);
        }
        return this.f523e;
    }

    /* JADX INFO: renamed from: g */
    public void m148g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C0353b.f2529a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C0353b.f2529a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C0353b.m1405a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C0353b.f2530b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0071f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0071f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m157v();
        return Collections.unmodifiableList(this.f520b);
    }

    public final C0427v getLastWindowInsets() {
        return this.f534p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f539u.m1554a();
    }

    public Drawable getStatusBarBackground() {
        return this.f536r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: h */
    public void mo40h(View view, View view2, int i, int i2) {
        AbstractC0068c abstractC0068c;
        C0414i c0414i = this.f539u;
        if (i2 == 1) {
            c0414i.f2714b = i;
        } else {
            c0414i.f2713a = i;
        }
        this.f531m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0071f c0071f = (C0071f) getChildAt(i3).getLayoutParams();
            if (c0071f.m190a(i2) && (abstractC0068c = c0071f.f542a) != null && i2 == 0) {
                abstractC0068c.m182s();
            }
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: i */
    public void mo41i(View view, int i) {
        C0414i c0414i = this.f539u;
        if (i == 1) {
            c0414i.f2714b = 0;
        } else {
            c0414i.f2713a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0071f c0071f = (C0071f) childAt.getLayoutParams();
            if (c0071f.m190a(i)) {
                AbstractC0068c abstractC0068c = c0071f.f542a;
                if (abstractC0068c != null) {
                    abstractC0068c.mo189z(this, childAt, view, i);
                }
                c0071f.m191b(i, false);
                c0071f.f557p = false;
            }
        }
        this.f531m = null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: j */
    public void mo42j(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0068c abstractC0068c;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0071f c0071f = (C0071f) childAt.getLayoutParams();
                if (c0071f.m190a(i3) && (abstractC0068c = c0071f.f542a) != null) {
                    int[] iArr2 = this.f525g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0068c.mo179p(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f525g;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f525g;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m153r(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m149k(int i, Rect rect, Rect rect2, C0071f c0071f, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c0071f.f544c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0071f.f545d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: l */
    public final int m150l(int i) {
        StringBuilder sb;
        int[] iArr = this.f529k;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // p006b.p032h.p044j.InterfaceC0412g
    /* JADX INFO: renamed from: m */
    public void mo45m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0068c abstractC0068c;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0071f c0071f = (C0071f) childAt.getLayoutParams();
                if (c0071f.m190a(i5) && (abstractC0068c = c0071f.f542a) != null) {
                    int[] iArr2 = this.f525g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0068c.mo181r(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f525g;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, this.f525g[1]) : Math.min(iMax2, this.f525g[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m153r(1);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: n */
    public void mo46n(View view, int i, int i2, int i3, int i4, int i5) {
        mo45m(view, i, i2, i3, i4, 0, this.f526h);
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: o */
    public boolean mo47o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0071f c0071f = (C0071f) childAt.getLayoutParams();
                AbstractC0068c abstractC0068c = c0071f.f542a;
                if (abstractC0068c != null) {
                    boolean zMo187x = abstractC0068c.mo187x(this, childAt, view, view2, i, i2);
                    z |= zMo187x;
                    c0071f.m191b(i2, zMo187x);
                } else {
                    c0071f.m191b(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m158w(false);
        if (this.f533o) {
            if (this.f532n == null) {
                this.f532n = new ViewTreeObserverOnPreDrawListenerC0072g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f532n);
        }
        if (this.f534p == null) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (getFitsSystemWindows()) {
                if (Build.VERSION.SDK_INT >= 20) {
                    requestApplyInsets();
                } else {
                    requestFitSystemWindows();
                }
            }
        }
        this.f528j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m158w(false);
        if (this.f533o && this.f532n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f532n);
        }
        View view = this.f531m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f528j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f535q || this.f536r == null) {
            return;
        }
        C0427v c0427v = this.f534p;
        int iM1603d = c0427v != null ? c0427v.m1603d() : 0;
        if (iM1603d > 0) {
            this.f536r.setBounds(0, 0, getWidth(), iM1603d);
            this.f536r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m158w(true);
        }
        boolean zM156u = m156u(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m158w(true);
        }
        return zM156u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0068c abstractC0068c;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int layoutDirection = getLayoutDirection();
        int size = this.f520b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f520b.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0068c = ((C0071f) view.getLayoutParams()).f542a) == null || !abstractC0068c.mo174k(this, view, layoutDirection))) {
                m154s(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0159  */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int iMax;
        int i4;
        int i5;
        AbstractC0068c abstractC0068c;
        C0071f c0071f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        m157v();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i12);
            C0352a<View> c0352a = this.f521c;
            int i13 = c0352a.f2526b.f2197d;
            int i14 = 0;
            while (true) {
                if (i14 < i13) {
                    ArrayList<View> arrayListM1276l = c0352a.f2526b.m1276l(i14);
                    if (arrayListM1276l != null && arrayListM1276l.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i14++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i12++;
        }
        if (z != this.f533o) {
            if (z) {
                if (this.f528j) {
                    if (this.f532n == null) {
                        this.f532n = new ViewTreeObserverOnPreDrawListenerC0072g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f532n);
                }
                this.f533o = true;
            } else {
                if (this.f528j && this.f532n != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f532n);
                }
                this.f533o = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int layoutDirection = getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.f534p != null && getFitsSystemWindows();
        int size3 = this.f520b.size();
        int i17 = suggestedMinimumWidth;
        int i18 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i19 = 0;
        while (i19 < size3) {
            View view = this.f520b.get(i19);
            if (view.getVisibility() == 8) {
                i10 = i19;
                i7 = size3;
                i8 = paddingLeft;
            } else {
                C0071f c0071f2 = (C0071f) view.getLayoutParams();
                int i20 = c0071f2.f546e;
                if (i20 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                } else {
                    int iM150l = m150l(i20);
                    int i21 = c0071f2.f544c;
                    if (i21 == 0) {
                        i21 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, layoutDirection) & 7;
                    i3 = iCombineMeasuredStates;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iM150l);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iM150l - paddingLeft);
                    }
                    if (z4 || view.getFitsSystemWindows()) {
                        i4 = i;
                        i5 = i2;
                    } else {
                        int iM1602c = this.f534p.m1602c() + this.f534p.m1601b();
                        int iM1600a = this.f534p.m1600a() + this.f534p.m1603d();
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM1602c, mode);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM1600a, mode2);
                        i4 = iMakeMeasureSpec;
                        i5 = iMakeMeasureSpec2;
                    }
                    abstractC0068c = c0071f2.f542a;
                    if (abstractC0068c != null) {
                        c0071f = c0071f2;
                        i9 = i3;
                        i10 = i19;
                        i6 = i18;
                        i8 = paddingLeft;
                        i11 = i17;
                        i7 = size3;
                        if (!abstractC0068c.mo175l(this, view, i4, iMax, i5, 0)) {
                        }
                        C0071f c0071f3 = c0071f;
                        int iMax2 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0071f3).leftMargin + ((ViewGroup.MarginLayoutParams) c0071f3).rightMargin);
                        int iMax3 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0071f3).topMargin + ((ViewGroup.MarginLayoutParams) c0071f3).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                        i17 = iMax2;
                        i18 = iMax3;
                    } else {
                        c0071f = c0071f2;
                        i6 = i18;
                        i7 = size3;
                        i8 = paddingLeft;
                        i9 = i3;
                        i10 = i19;
                        i11 = i17;
                    }
                    measureChildWithMargins(view, i4, iMax, i5, 0);
                    C0071f c0071f4 = c0071f;
                    int iMax4 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0071f4).leftMargin + ((ViewGroup.MarginLayoutParams) c0071f4).rightMargin);
                    int iMax5 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0071f4).topMargin + ((ViewGroup.MarginLayoutParams) c0071f4).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i17 = iMax4;
                    i18 = iMax5;
                }
                iMax = 0;
                if (z4) {
                    i4 = i;
                    i5 = i2;
                } else {
                    i4 = i;
                    i5 = i2;
                }
                abstractC0068c = c0071f2.f542a;
                if (abstractC0068c != null) {
                    c0071f = c0071f2;
                    i9 = i3;
                    i10 = i19;
                    i6 = i18;
                    i8 = paddingLeft;
                    i11 = i17;
                    i7 = size3;
                    if (!abstractC0068c.mo175l(this, view, i4, iMax, i5, 0)) {
                    }
                    C0071f c0071f5 = c0071f;
                    int iMax6 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0071f5).leftMargin + ((ViewGroup.MarginLayoutParams) c0071f5).rightMargin);
                    int iMax7 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0071f5).topMargin + ((ViewGroup.MarginLayoutParams) c0071f5).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i17 = iMax6;
                    i18 = iMax7;
                } else {
                    c0071f = c0071f2;
                    i6 = i18;
                    i7 = size3;
                    i8 = paddingLeft;
                    i9 = i3;
                    i10 = i19;
                    i11 = i17;
                }
                measureChildWithMargins(view, i4, iMax, i5, 0);
                C0071f c0071f6 = c0071f;
                int iMax8 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0071f6).leftMargin + ((ViewGroup.MarginLayoutParams) c0071f6).rightMargin);
                int iMax9 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0071f6).topMargin + ((ViewGroup.MarginLayoutParams) c0071f6).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                i17 = iMax8;
                i18 = iMax9;
            }
            i19 = i10 + 1;
            paddingLeft = i8;
            size3 = i7;
        }
        int i22 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i17, i, (-16777216) & i22), View.resolveSizeAndState(i18, i2, i22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0068c abstractC0068c;
        int childCount = getChildCount();
        boolean zM176m = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0071f c0071f = (C0071f) childAt.getLayoutParams();
                if (c0071f.m190a(0) && (abstractC0068c = c0071f.f542a) != null) {
                    zM176m |= abstractC0068c.m176m();
                }
            }
        }
        if (zM176m) {
            m153r(1);
        }
        return zM176m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0068c abstractC0068c;
        int childCount = getChildCount();
        boolean zMo177n = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0071f c0071f = (C0071f) childAt.getLayoutParams();
                if (c0071f.m190a(0) && (abstractC0068c = c0071f.f542a) != null) {
                    zMo177n |= abstractC0068c.mo177n(this, childAt, view, f, f2);
                }
            }
        }
        return zMo177n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo42j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo45m(view, i, i2, i3, i4, 0, this.f526h);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo40h(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0073h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0073h c0073h = (C0073h) parcelable;
        super.onRestoreInstanceState(c0073h.f2812b);
        SparseArray<Parcelable> sparseArray = c0073h.f560d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0068c abstractC0068c = m151p(childAt).f542a;
            if (id != -1 && abstractC0068c != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0068c.mo184u(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo185v;
        C0073h c0073h = new C0073h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0068c abstractC0068c = ((C0071f) childAt.getLayoutParams()).f542a;
            if (id != -1 && abstractC0068c != null && (parcelableMo185v = abstractC0068c.mo185v(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo185v);
            }
        }
        c0073h.f560d = sparseArray;
        return c0073h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo47o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onStopNestedScroll(View view) {
        mo41i(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM156u;
        boolean zMo163A;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f530l == null) {
            zM156u = m156u(motionEvent, 1);
            if (!zM156u) {
                zMo163A = false;
            }
            motionEventObtain = null;
            if (this.f530l == null) {
                zMo163A |= super.onTouchEvent(motionEvent);
            } else if (zM156u) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m158w(false);
            }
            return zMo163A;
        }
        zM156u = false;
        AbstractC0068c abstractC0068c = ((C0071f) this.f530l.getLayoutParams()).f542a;
        if (abstractC0068c != null) {
            zMo163A = abstractC0068c.mo163A(this, this.f530l, motionEvent);
        } else {
            zMo163A = false;
        }
        motionEventObtain = null;
        if (this.f530l == null) {
            zMo163A |= super.onTouchEvent(motionEvent);
        } else if (zM156u) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            m158w(false);
        } else {
            m158w(false);
        }
        return zMo163A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public C0071f m151p(View view) {
        C0071f c0071f = (C0071f) view.getLayoutParams();
        if (!c0071f.f543b) {
            if (view instanceof InterfaceC0067b) {
                AbstractC0068c behavior = ((InterfaceC0067b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                AbstractC0068c abstractC0068c = c0071f.f542a;
                if (abstractC0068c != behavior) {
                    if (abstractC0068c != null) {
                        abstractC0068c.mo172i();
                    }
                    c0071f.f542a = behavior;
                    c0071f.f543b = true;
                    if (behavior != null) {
                        behavior.mo169f(c0071f);
                    }
                }
            } else {
                InterfaceC0069d interfaceC0069d = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0069d = (InterfaceC0069d) superclass.getAnnotation(InterfaceC0069d.class);
                    if (interfaceC0069d != null) {
                        break;
                    }
                }
                if (interfaceC0069d != null) {
                    try {
                        AbstractC0068c abstractC0068cNewInstance = interfaceC0069d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        AbstractC0068c abstractC0068c2 = c0071f.f542a;
                        if (abstractC0068c2 != abstractC0068cNewInstance) {
                            if (abstractC0068c2 != null) {
                                abstractC0068c2.mo172i();
                            }
                            c0071f.f542a = abstractC0068cNewInstance;
                            c0071f.f543b = true;
                            if (abstractC0068cNewInstance != null) {
                                abstractC0068cNewInstance.mo169f(c0071f);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder sbM2191e = a.m2191e("Default behavior class ");
                        sbM2191e.append(interfaceC0069d.value().getName());
                        sbM2191e.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sbM2191e.toString(), e);
                    }
                }
            }
            c0071f.f543b = true;
        }
        return c0071f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m152q(View view, int i, int i2) {
        Rect rectM142a = m142a();
        m148g(view, rectM142a);
        try {
            return rectM142a.contains(i, i2);
        } finally {
            rectM142a.setEmpty();
            f519z.mo1536a(rectM142a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX INFO: renamed from: r */
    public final void m153r(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean zMo170g;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        AbstractC0068c abstractC0068c;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int layoutDirection = getLayoutDirection();
        int size = this.f520b.size();
        Rect rectM142a = m142a();
        Rect rectM142a2 = m142a();
        Rect rectM142a3 = m142a();
        int i10 = 0;
        while (i10 < size) {
            View view = this.f520b.get(i10);
            C0071f c0071f = (C0071f) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = rectM142a3;
                i2 = i10;
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    if (c0071f.f553l == this.f520b.get(i11)) {
                        C0071f c0071f2 = (C0071f) view.getLayoutParams();
                        if (c0071f2.f552k != null) {
                            Rect rectM142a4 = m142a();
                            Rect rectM142a5 = m142a();
                            Rect rectM142a6 = m142a();
                            m148g(c0071f2.f552k, rectM142a4);
                            m145d(view, false, rectM142a5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            m149k(layoutDirection, rectM142a4, rectM142a6, c0071f2, measuredWidth, measuredHeight);
                            boolean z3 = (rectM142a6.left == rectM142a5.left && rectM142a6.top == rectM142a5.top) ? false : true;
                            m143b(c0071f2, rectM142a6, measuredWidth, measuredHeight);
                            int i12 = rectM142a6.left - rectM142a5.left;
                            int i13 = rectM142a6.top - rectM142a5.top;
                            if (i12 != 0) {
                                C0418m.m1571n(view, i12);
                            }
                            if (i13 != 0) {
                                C0418m.m1572o(view, i13);
                            }
                            if (z3 && (abstractC0068c = c0071f2.f542a) != null) {
                                abstractC0068c.mo170g(this, view, c0071f2.f552k);
                            }
                            rectM142a4.setEmpty();
                            InterfaceC0403c<Rect> interfaceC0403c = f519z;
                            interfaceC0403c.mo1536a(rectM142a4);
                            rectM142a5.setEmpty();
                            interfaceC0403c.mo1536a(rectM142a5);
                            rectM142a6.setEmpty();
                            interfaceC0403c.mo1536a(rectM142a6);
                        }
                    }
                    i11++;
                    c0071f = c0071f;
                    size = size;
                    i10 = i10;
                    rectM142a3 = rectM142a3;
                }
                int i14 = size;
                Rect rect2 = rectM142a3;
                i2 = i10;
                C0071f c0071f3 = c0071f;
                m145d(view, true, rectM142a2);
                if (c0071f3.f548g != 0 && !rectM142a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0071f3.f548g, layoutDirection);
                    int i15 = absoluteGravity & 112;
                    if (i15 == 48) {
                        rectM142a.top = Math.max(rectM142a.top, rectM142a2.bottom);
                    } else if (i15 == 80) {
                        rectM142a.bottom = Math.max(rectM142a.bottom, getHeight() - rectM142a2.top);
                    }
                    int i16 = absoluteGravity & 7;
                    if (i16 == 3) {
                        rectM142a.left = Math.max(rectM142a.left, rectM142a2.right);
                    } else if (i16 == 5) {
                        rectM142a.right = Math.max(rectM142a.right, getWidth() - rectM142a2.left);
                    }
                }
                if (c0071f3.f549h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0071f c0071f4 = (C0071f) view.getLayoutParams();
                        AbstractC0068c abstractC0068c2 = c0071f4.f542a;
                        Rect rectM142a7 = m142a();
                        Rect rectM142a8 = m142a();
                        rectM142a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC0068c2 == null || !abstractC0068c2.mo164a(this, view, rectM142a7)) {
                            rectM142a7.set(rectM142a8);
                        } else if (!rectM142a8.contains(rectM142a7)) {
                            StringBuilder sbM2191e = a.m2191e("Rect should be within the child's bounds. Rect:");
                            sbM2191e.append(rectM142a7.toShortString());
                            sbM2191e.append(" | Bounds:");
                            sbM2191e.append(rectM142a8.toShortString());
                            throw new IllegalArgumentException(sbM2191e.toString());
                        }
                        rectM142a8.setEmpty();
                        InterfaceC0403c<Rect> interfaceC0403c2 = f519z;
                        interfaceC0403c2.mo1536a(rectM142a8);
                        if (!rectM142a7.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0071f4.f549h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectM142a7.top - ((ViewGroup.MarginLayoutParams) c0071f4).topMargin) - c0071f4.f551j) >= (i9 = rectM142a.top)) {
                                z = false;
                            } else {
                                m160y(view, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM142a7.bottom) - ((ViewGroup.MarginLayoutParams) c0071f4).bottomMargin) + c0071f4.f551j) < (i7 = rectM142a.bottom)) {
                                m160y(view, height - i7);
                                z = true;
                            }
                            if (!z) {
                                m160y(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectM142a7.left - ((ViewGroup.MarginLayoutParams) c0071f4).leftMargin) - c0071f4.f550i) >= (i6 = rectM142a.left)) {
                                z2 = false;
                            } else {
                                m159x(view, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM142a7.right) - ((ViewGroup.MarginLayoutParams) c0071f4).rightMargin) + c0071f4.f550i) < (i4 = rectM142a.right)) {
                                m159x(view, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                m159x(view, 0);
                            }
                        }
                        rectM142a7.setEmpty();
                        interfaceC0403c2.mo1536a(rectM142a7);
                    }
                }
                if (i != 2) {
                    rect = rect2;
                    rect.set(((C0071f) view.getLayoutParams()).f558q);
                    if (rect.equals(rectM142a2)) {
                        i3 = i14;
                    } else {
                        ((C0071f) view.getLayoutParams()).f558q.set(rectM142a2);
                    }
                } else {
                    rect = rect2;
                }
                i3 = i14;
                for (int i17 = i2 + 1; i17 < i3; i17++) {
                    View view2 = this.f520b.get(i17);
                    C0071f c0071f5 = (C0071f) view2.getLayoutParams();
                    AbstractC0068c abstractC0068c3 = c0071f5.f542a;
                    if (abstractC0068c3 != null && abstractC0068c3.mo167d(this, view2, view)) {
                        if (i == 0 && c0071f5.f557p) {
                            c0071f5.f557p = false;
                        } else {
                            if (i != 2) {
                                zMo170g = abstractC0068c3.mo170g(this, view2, view);
                            } else {
                                abstractC0068c3.m171h();
                                zMo170g = true;
                            }
                            if (i == 1) {
                                c0071f5.f557p = zMo170g;
                            }
                        }
                    }
                }
            }
            i10 = i2 + 1;
            size = i3;
            rectM142a3 = rect;
        }
        Rect rect3 = rectM142a3;
        rectM142a.setEmpty();
        InterfaceC0403c<Rect> interfaceC0403c3 = f519z;
        interfaceC0403c3.mo1536a(rectM142a);
        rectM142a2.setEmpty();
        interfaceC0403c3.mo1536a(rectM142a2);
        rect3.setEmpty();
        interfaceC0403c3.mo1536a(rect3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0068c abstractC0068c = ((C0071f) view.getLayoutParams()).f542a;
        if (abstractC0068c == null || !abstractC0068c.mo183t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f527i) {
            return;
        }
        m158w(false);
        this.f527i = true;
    }

    /* JADX INFO: renamed from: s */
    public void m154s(View view, int i) {
        C0071f c0071f = (C0071f) view.getLayoutParams();
        View view2 = c0071f.f552k;
        int i2 = 0;
        if (view2 == null && c0071f.f547f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            Rect rectM142a = m142a();
            Rect rectM142a2 = m142a();
            try {
                m148g(view2, rectM142a);
                C0071f c0071f2 = (C0071f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m149k(i, rectM142a, rectM142a2, c0071f2, measuredWidth, measuredHeight);
                m143b(c0071f2, rectM142a2, measuredWidth, measuredHeight);
                view.layout(rectM142a2.left, rectM142a2.top, rectM142a2.right, rectM142a2.bottom);
                return;
            } finally {
                rectM142a.setEmpty();
                InterfaceC0403c<Rect> interfaceC0403c = f519z;
                interfaceC0403c.mo1536a(rectM142a);
                rectM142a2.setEmpty();
                interfaceC0403c.mo1536a(rectM142a2);
            }
        }
        int i3 = c0071f.f546e;
        if (i3 < 0) {
            C0071f c0071f3 = (C0071f) view.getLayoutParams();
            Rect rectM142a3 = m142a();
            rectM142a3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0071f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0071f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0071f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0071f3).bottomMargin);
            if (this.f534p != null) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM142a3.left = this.f534p.m1601b() + rectM142a3.left;
                    rectM142a3.top = this.f534p.m1603d() + rectM142a3.top;
                    rectM142a3.right -= this.f534p.m1602c();
                    rectM142a3.bottom -= this.f534p.m1600a();
                }
            }
            Rect rectM142a4 = m142a();
            int i4 = c0071f3.f544c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM142a3, rectM142a4, i);
            view.layout(rectM142a4.left, rectM142a4.top, rectM142a4.right, rectM142a4.bottom);
            rectM142a3.setEmpty();
            InterfaceC0403c<Rect> interfaceC0403c2 = f519z;
            interfaceC0403c2.mo1536a(rectM142a3);
            rectM142a4.setEmpty();
            interfaceC0403c2.mo1536a(rectM142a4);
            return;
        }
        C0071f c0071f4 = (C0071f) view.getLayoutParams();
        int i5 = c0071f4.f544c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM150l = m150l(i3) - measuredWidth2;
        if (i6 == 1) {
            iM150l += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM150l += measuredWidth2;
        }
        if (i7 == 16) {
            i2 = 0 + (measuredHeight2 / 2);
        } else if (i7 == 80) {
            i2 = measuredHeight2 + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0071f4).leftMargin, Math.min(iM150l, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0071f4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0071f4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0071f4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m161z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f537s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f536r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f536r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f536r.setState(getDrawableState());
                }
                Drawable drawable3 = this.f536r;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                C0360f.m1427S(drawable3, getLayoutDirection());
                this.f536r.setVisible(getVisibility() == 0, false);
                this.f536r.setCallback(this);
            }
            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0362a.m1469c(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f536r;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f536r.setVisible(z, false);
    }

    /* JADX INFO: renamed from: t */
    public void m155t(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m156u(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f522d;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f518y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zMo173j = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0071f c0071f = (C0071f) view.getLayoutParams();
            AbstractC0068c abstractC0068c = c0071f.f542a;
            if (!(zMo173j || z2) || actionMasked == 0) {
                if (!zMo173j && abstractC0068c != null) {
                    if (i == 0) {
                        zMo173j = abstractC0068c.mo173j(this, view, motionEvent);
                    } else if (i == 1) {
                        zMo173j = abstractC0068c.mo163A(this, view, motionEvent);
                    }
                    if (zMo173j) {
                        this.f530l = view;
                    }
                }
                AbstractC0068c abstractC0068c2 = c0071f.f542a;
                if (abstractC0068c2 == null) {
                    c0071f.f554m = false;
                }
                boolean z3 = c0071f.f554m;
                if (z3) {
                    z = true;
                } else {
                    z = (abstractC0068c2 != null && abstractC0068c2.m166c() > 0.0f) | z3;
                    c0071f.f554m = z;
                }
                boolean z4 = z && !z3;
                if (z && !z4) {
                    break;
                }
                z2 = z4;
            } else if (abstractC0068c != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC0068c.mo173j(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC0068c.mo163A(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zMo173j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v7 android.view.View
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    /* JADX INFO: renamed from: v */
    public final void m157v() {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m157v():void");
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f536r;
    }

    /* JADX INFO: renamed from: w */
    public final void m158w(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0068c abstractC0068c = ((C0071f) childAt.getLayoutParams()).f542a;
            if (abstractC0068c != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0068c.mo173j(this, childAt, motionEventObtain);
                } else {
                    abstractC0068c.mo163A(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0071f) getChildAt(i2).getLayoutParams()).f554m = false;
        }
        this.f530l = null;
        this.f527i = false;
    }

    /* JADX INFO: renamed from: x */
    public final void m159x(View view, int i) {
        C0071f c0071f = (C0071f) view.getLayoutParams();
        int i2 = c0071f.f550i;
        if (i2 != i) {
            C0418m.m1571n(view, i - i2);
            c0071f.f550i = i;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m160y(View view, int i) {
        C0071f c0071f = (C0071f) view.getLayoutParams();
        int i2 = c0071f.f551j;
        if (i2 != i) {
            C0418m.m1572o(view, i - i2);
            c0071f.f551j = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m161z() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (!getFitsSystemWindows()) {
            C0418m.m1579v(this, null);
            return;
        }
        if (this.f538t == null) {
            this.f538t = new C0066a();
        }
        C0418m.m1579v(this, this.f538t);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0071f) {
            return new C0071f((C0071f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0071f((ViewGroup.MarginLayoutParams) layoutParams) : new C0071f(layoutParams);
    }
}
