package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p032h.p044j.p045w.InterfaceC0431d;
import p006b.p049j.p050a.AbstractC0442a;
import p006b.p049j.p051b.C0447e;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p136g.C1213a;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0068c<V> {

    /* JADX INFO: renamed from: A */
    public int f10176A;

    /* JADX INFO: renamed from: B */
    public WeakReference<V> f10177B;

    /* JADX INFO: renamed from: C */
    public WeakReference<View> f10178C;

    /* JADX INFO: renamed from: D */
    public final ArrayList<AbstractC1345d> f10179D;

    /* JADX INFO: renamed from: E */
    public VelocityTracker f10180E;

    /* JADX INFO: renamed from: F */
    public int f10181F;

    /* JADX INFO: renamed from: G */
    public int f10182G;

    /* JADX INFO: renamed from: H */
    public boolean f10183H;

    /* JADX INFO: renamed from: I */
    public Map<View, Integer> f10184I;

    /* JADX INFO: renamed from: J */
    public final C0447e.c f10185J;

    /* JADX INFO: renamed from: a */
    public int f10186a;

    /* JADX INFO: renamed from: b */
    public boolean f10187b;

    /* JADX INFO: renamed from: c */
    public float f10188c;

    /* JADX INFO: renamed from: d */
    public int f10189d;

    /* JADX INFO: renamed from: e */
    public boolean f10190e;

    /* JADX INFO: renamed from: f */
    public int f10191f;

    /* JADX INFO: renamed from: g */
    public boolean f10192g;

    /* JADX INFO: renamed from: h */
    public C1296g f10193h;

    /* JADX INFO: renamed from: i */
    public C1299j f10194i;

    /* JADX INFO: renamed from: j */
    public boolean f10195j;

    /* JADX INFO: renamed from: k */
    public BottomSheetBehavior<V>.RunnableC1347f f10196k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f10197l;

    /* JADX INFO: renamed from: m */
    public int f10198m;

    /* JADX INFO: renamed from: n */
    public int f10199n;

    /* JADX INFO: renamed from: o */
    public int f10200o;

    /* JADX INFO: renamed from: p */
    public float f10201p;

    /* JADX INFO: renamed from: q */
    public int f10202q;

    /* JADX INFO: renamed from: r */
    public float f10203r;

    /* JADX INFO: renamed from: s */
    public boolean f10204s;

    /* JADX INFO: renamed from: t */
    public boolean f10205t;

    /* JADX INFO: renamed from: u */
    public int f10206u;

    /* JADX INFO: renamed from: v */
    public C0447e f10207v;

    /* JADX INFO: renamed from: w */
    public boolean f10208w;

    /* JADX INFO: renamed from: x */
    public int f10209x;

    /* JADX INFO: renamed from: y */
    public boolean f10210y;

    /* JADX INFO: renamed from: z */
    public int f10211z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC1342a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f10212b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10213c;

        public RunnableC1342a(View view, int i) {
            this.f10212b = view;
            this.f10213c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m3079K(this.f10212b, this.f10213c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C1343b extends C0447e.c {
        public C1343b() {
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: a */
        public int mo249a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: b */
        public int mo250b(View view, int i, int i2) {
            int iM3075G = BottomSheetBehavior.this.m3075G();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0360f.m1448h(i, iM3075G, bottomSheetBehavior.f10204s ? bottomSheetBehavior.f10176A : bottomSheetBehavior.f10202q);
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: d */
        public int mo1673d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f10204s ? bottomSheetBehavior.f10176A : bottomSheetBehavior.f10202q;
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: i */
        public void mo256i(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.m3078J(1);
            }
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: j */
        public void mo257j(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m3073E(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        
            if (java.lang.Math.abs(r8 - r6.f10215a.f10200o) < java.lang.Math.abs(r8 - r6.f10215a.f10202q)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
        
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f10215a.f10202q)) goto L31;
         */
        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo258k(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C1343b.mo258k(android.view.View, float, float):void");
        }

        @Override // p006b.p049j.p051b.C0447e.c
        /* JADX INFO: renamed from: l */
        public boolean mo259l(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f10206u;
            if (i2 == 1 || bottomSheetBehavior.f10183H) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f10181F == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f10178C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f10177B;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C1344c implements InterfaceC0431d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10216a;

        public C1344c(int i) {
            this.f10216a = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static abstract class AbstractC1345d {
        /* JADX INFO: renamed from: a */
        public abstract void m3086a(View view, float f);

        /* JADX INFO: renamed from: b */
        public abstract void m3087b(View view, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static class C1346e extends AbstractC0442a {
        public static final Parcelable.Creator<C1346e> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public final int f10218d;

        /* JADX INFO: renamed from: e */
        public int f10219e;

        /* JADX INFO: renamed from: f */
        public boolean f10220f;

        /* JADX INFO: renamed from: g */
        public boolean f10221g;

        /* JADX INFO: renamed from: h */
        public boolean f10222h;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public static class a implements Parcelable.ClassLoaderCreator<C1346e> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C1346e(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C1346e[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C1346e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1346e(parcel, classLoader);
            }
        }

        public C1346e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10218d = parcel.readInt();
            this.f10219e = parcel.readInt();
            this.f10220f = parcel.readInt() == 1;
            this.f10221g = parcel.readInt() == 1;
            this.f10222h = parcel.readInt() == 1;
        }

        public C1346e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f10218d = bottomSheetBehavior.f10206u;
            this.f10219e = bottomSheetBehavior.f10189d;
            this.f10220f = bottomSheetBehavior.f10187b;
            this.f10221g = bottomSheetBehavior.f10204s;
            this.f10222h = bottomSheetBehavior.f10205t;
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeInt(this.f10218d);
            parcel.writeInt(this.f10219e);
            parcel.writeInt(this.f10220f ? 1 : 0);
            parcel.writeInt(this.f10221g ? 1 : 0);
            parcel.writeInt(this.f10222h ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class RunnableC1347f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final View f10223b;

        /* JADX INFO: renamed from: c */
        public boolean f10224c;

        /* JADX INFO: renamed from: d */
        public int f10225d;

        public RunnableC1347f(View view, int i) {
            this.f10223b = view;
            this.f10225d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0447e c0447e = BottomSheetBehavior.this.f10207v;
            if (c0447e == null || !c0447e.m1657i(true)) {
                BottomSheetBehavior.this.m3078J(this.f10225d);
            } else {
                View view = this.f10223b;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                view.postOnAnimation(this);
            }
            this.f10224c = false;
        }
    }

    public BottomSheetBehavior() {
        this.f10186a = 0;
        this.f10187b = true;
        this.f10196k = null;
        this.f10201p = 0.5f;
        this.f10203r = -1.0f;
        this.f10206u = 4;
        this.f10179D = new ArrayList<>();
        this.f10185J = new C1343b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f10186a = 0;
        this.f10187b = true;
        this.f10196k = null;
        this.f10201p = 0.5f;
        this.f10203r = -1.0f;
        this.f10206u = 4;
        this.f10179D = new ArrayList<>();
        this.f10185J = new C1343b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5566d);
        this.f10192g = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(1);
        if (zHasValue) {
            m3072D(context, attributeSet, zHasValue, C1161a.m2723h(context, typedArrayObtainStyledAttributes, 1));
        } else {
            m3072D(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10197l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f10197l.addUpdateListener(new C1213a(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10203r = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(6);
        m3076H((typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1) : i);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(5, false);
        if (this.f10204s != z) {
            this.f10204s = z;
            if (!z && this.f10206u == 5) {
                m3077I(4);
            }
            m3083O();
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        if (this.f10187b != z2) {
            this.f10187b = z2;
            if (this.f10177B != null) {
                m3071C();
            }
            m3078J((this.f10187b && this.f10206u == 6) ? 3 : this.f10206u);
            m3083O();
        }
        this.f10205t = typedArrayObtainStyledAttributes.getBoolean(8, false);
        this.f10186a = typedArrayObtainStyledAttributes.getInt(7, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(4, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f10201p = f;
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f10198m = i2;
        typedArrayObtainStyledAttributes.recycle();
        this.f10188c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: A */
    public boolean mo163A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10206u == 1 && actionMasked == 0) {
            return true;
        }
        C0447e c0447e = this.f10207v;
        if (c0447e != null) {
            c0447e.m1663p(motionEvent);
        }
        if (actionMasked == 0) {
            this.f10181F = -1;
            VelocityTracker velocityTracker = this.f10180E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10180E = null;
            }
        }
        if (this.f10180E == null) {
            this.f10180E = VelocityTracker.obtain();
        }
        this.f10180E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f10208w) {
            float fAbs = Math.abs(this.f10182G - motionEvent.getY());
            C0447e c0447e2 = this.f10207v;
            if (fAbs > c0447e2.f2833b) {
                c0447e2.m1650b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f10208w;
    }

    /* JADX INFO: renamed from: B */
    public final void m3070B(V v, C0429b.a aVar, int i) {
        C1344c c1344c = new C1344c(i);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        C0429b.a aVar2 = new C0429b.a(null, aVar.f2753b, null, c1344c, aVar.f2754c);
        if (Build.VERSION.SDK_INT >= 21) {
            C0406a c0406aM1563f = C0418m.m1563f(v);
            if (c0406aM1563f == null) {
                c0406aM1563f = new C0406a();
            }
            C0418m.m1577t(v, c0406aM1563f);
            C0418m.m1575r(aVar2.m1621a(), v);
            ArrayList arrayList = (ArrayList) v.getTag(R.id.nt);
            if (arrayList == null) {
                arrayList = new ArrayList();
                v.setTag(R.id.nt, arrayList);
            }
            arrayList.add(aVar2);
            C0418m.m1570m(v, 0);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m3071C() {
        int iMax = this.f10190e ? Math.max(this.f10191f, this.f10176A - ((this.f10211z * 9) / 16)) : this.f10189d;
        if (this.f10187b) {
            this.f10202q = Math.max(this.f10176A - iMax, this.f10199n);
        } else {
            this.f10202q = this.f10176A - iMax;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3072D(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f10192g) {
            this.f10194i = C1299j.m2986b(context, attributeSet, R.attr.bo, R.style.p8, new C1290a(0)).m2991a();
            C1296g c1296g = new C1296g(this.f10194i);
            this.f10193h = c1296g;
            c1296g.f6211b.f6234b = new C1252a(context);
            c1296g.m2984y();
            if (z && colorStateList != null) {
                this.f10193h.m2975p(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f10193h.setTint(typedValue.data);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m3073E(int i) {
        float f;
        float fM3075G;
        V v = this.f10177B.get();
        if (v == null || this.f10179D.isEmpty()) {
            return;
        }
        int i2 = this.f10202q;
        if (i > i2) {
            f = i2 - i;
            fM3075G = this.f10176A - i2;
        } else {
            f = i2 - i;
            fM3075G = i2 - m3075G();
        }
        float f2 = f / fM3075G;
        for (int i3 = 0; i3 < this.f10179D.size(); i3++) {
            this.f10179D.get(i3).m3086a(v, f2);
        }
    }

    /* JADX INFO: renamed from: F */
    public View m3074F(View view) {
        if (C0418m.m1569l(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM3074F = m3074F(viewGroup.getChildAt(i));
            if (viewM3074F != null) {
                return viewM3074F;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final int m3075G() {
        return this.f10187b ? this.f10199n : this.f10198m;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX INFO: renamed from: H */
    public void m3076H(int i) {
        V v;
        boolean z = true;
        if (i == -1) {
            if (this.f10190e) {
                z = false;
            } else {
                this.f10190e = true;
            }
        } else if (this.f10190e || this.f10189d != i) {
            this.f10190e = false;
            this.f10189d = Math.max(0, i);
        } else {
            z = false;
        }
        if (!z || this.f10177B == null) {
            return;
        }
        m3071C();
        if (this.f10206u != 4 || (v = this.f10177B.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    /* JADX INFO: renamed from: I */
    public void m3077I(int i) {
        if (i == this.f10206u) {
            return;
        }
        if (this.f10177B != null) {
            m3080L(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.f10204s && i == 5)) {
            this.f10206u = i;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m3078J(int i) {
        V v;
        if (this.f10206u == i) {
            return;
        }
        this.f10206u = i;
        WeakReference<V> weakReference = this.f10177B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 6 || i == 3) {
            m3085Q(true);
        } else if (i == 5 || i == 4) {
            m3085Q(false);
        }
        m3084P(i);
        for (int i2 = 0; i2 < this.f10179D.size(); i2++) {
            this.f10179D.get(i2).m3087b(v, i);
        }
        m3083O();
    }

    /* JADX INFO: renamed from: K */
    public void m3079K(View view, int i) {
        int iM3075G;
        int i2;
        if (i == 4) {
            iM3075G = this.f10202q;
        } else if (i == 6) {
            iM3075G = this.f10200o;
            if (this.f10187b && iM3075G <= (i2 = this.f10199n)) {
                i = 3;
                iM3075G = i2;
            }
        } else if (i == 3) {
            iM3075G = m3075G();
        } else {
            if (!this.f10204s || i != 5) {
                throw new IllegalArgumentException(a.m2198l("Illegal state argument: ", i));
            }
            iM3075G = this.f10176A;
        }
        m3082N(view, i, iM3075G, false);
    }

    /* JADX INFO: renamed from: L */
    public final void m3080L(int i) {
        V v = this.f10177B.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (v.isAttachedToWindow()) {
                v.post(new RunnableC1342a(v, i));
                return;
            }
        }
        m3079K(v, i);
    }

    /* JADX INFO: renamed from: M */
    public boolean m3081M(View view, float f) {
        if (this.f10205t) {
            return true;
        }
        if (view.getTop() < this.f10202q) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f10202q)) / ((float) this.f10189d) > 0.5f;
    }

    /* JADX INFO: renamed from: N */
    public void m3082N(View view, int i, int i2, boolean z) {
        if (!(z ? this.f10207v.m1669v(view.getLeft(), i2) : this.f10207v.m1671x(view, view.getLeft(), i2))) {
            m3078J(i);
            return;
        }
        m3078J(2);
        m3084P(i);
        if (this.f10196k == null) {
            this.f10196k = new RunnableC1347f(view, i);
        }
        BottomSheetBehavior<V>.RunnableC1347f runnableC1347f = this.f10196k;
        boolean z2 = runnableC1347f.f10224c;
        runnableC1347f.f10225d = i;
        if (z2) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        view.postOnAnimation(runnableC1347f);
        this.f10196k.f10224c = true;
    }

    /* JADX INFO: renamed from: O */
    public final void m3083O() {
        V v;
        int i;
        C0429b.a aVar;
        WeakReference<V> weakReference = this.f10177B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C0418m.m1574q(v, 524288);
        C0418m.m1574q(v, 262144);
        C0418m.m1574q(v, 1048576);
        if (this.f10204s && this.f10206u != 5) {
            m3070B(v, C0429b.a.f2751j, 5);
        }
        int i2 = this.f10206u;
        if (i2 == 3) {
            i = this.f10187b ? 4 : 6;
            aVar = C0429b.a.f2750i;
        } else {
            if (i2 != 4) {
                if (i2 != 6) {
                    return;
                }
                m3070B(v, C0429b.a.f2750i, 4);
                m3070B(v, C0429b.a.f2749h, 3);
                return;
            }
            i = this.f10187b ? 3 : 6;
            aVar = C0429b.a.f2749h;
        }
        m3070B(v, aVar, i);
    }

    /* JADX INFO: renamed from: P */
    public final void m3084P(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f10195j != z) {
            this.f10195j = z;
            if (this.f10193h == null || (valueAnimator = this.f10197l) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f10197l.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f10197l.setFloatValues(1.0f - f, f);
            this.f10197l.start();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m3085Q(boolean z) {
        int iIntValue;
        WeakReference<V> weakReference = this.f10177B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f10184I != null) {
                    return;
                } else {
                    this.f10184I = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f10177B.get()) {
                    Map<View, Integer> map = this.f10184I;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        iIntValue = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        iIntValue = this.f10184I.get(childAt).intValue();
                    }
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    childAt.setImportantForAccessibility(iIntValue);
                }
            }
            if (z) {
                return;
            }
            this.f10184I = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: f */
    public void mo169f(CoordinatorLayout.C0071f c0071f) {
        this.f10177B = null;
        this.f10207v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: i */
    public void mo172i() {
        this.f10177B = null;
        this.f10207v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: j */
    public boolean mo173j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0447e c0447e;
        if (!v.isShown()) {
            this.f10208w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10181F = -1;
            VelocityTracker velocityTracker = this.f10180E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10180E = null;
            }
        }
        if (this.f10180E == null) {
            this.f10180E = VelocityTracker.obtain();
        }
        this.f10180E.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f10182G = (int) motionEvent.getY();
            if (this.f10206u != 2) {
                WeakReference<View> weakReference = this.f10178C;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m152q(view, x, this.f10182G)) {
                    this.f10181F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f10183H = true;
                }
            }
            this.f10208w = this.f10181F == -1 && !coordinatorLayout.m152q(v, x, this.f10182G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10183H = false;
            this.f10181F = -1;
            if (this.f10208w) {
                this.f10208w = false;
                return false;
            }
        }
        if (!this.f10208w && (c0447e = this.f10207v) != null && c0447e.m1670w(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f10178C;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f10208w || this.f10206u == 1 || coordinatorLayout.m152q(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f10207v == null || Math.abs(((float) this.f10182G) - motionEvent.getY()) <= ((float) this.f10207v.f2833b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: k */
    public boolean mo174k(CoordinatorLayout coordinatorLayout, V v, int i) {
        int iM3075G;
        C1296g c1296g;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.f10177B == null) {
            this.f10191f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.c7);
            this.f10177B = new WeakReference<>(v);
            if (this.f10192g && (c1296g = this.f10193h) != null) {
                v.setBackground(c1296g);
            }
            C1296g c1296g2 = this.f10193h;
            if (c1296g2 != null) {
                float fM1566i = this.f10203r;
                if (fM1566i == -1.0f) {
                    fM1566i = C0418m.m1566i(v);
                }
                c1296g2.m2974o(fM1566i);
                boolean z = this.f10206u == 3;
                this.f10195j = z;
                this.f10193h.m2976q(z ? 0.0f : 1.0f);
            }
            m3083O();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.f10207v == null) {
            this.f10207v = new C0447e(coordinatorLayout.getContext(), coordinatorLayout, this.f10185J);
        }
        int top = v.getTop();
        coordinatorLayout.m154s(v, i);
        this.f10211z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f10176A = height;
        this.f10199n = Math.max(0, height - v.getHeight());
        this.f10200o = (int) ((1.0f - this.f10201p) * this.f10176A);
        m3071C();
        int i2 = this.f10206u;
        if (i2 == 3) {
            iM3075G = m3075G();
        } else if (i2 == 6) {
            iM3075G = this.f10200o;
        } else {
            if (!this.f10204s || i2 != 5) {
                if (i2 == 4) {
                    iM3075G = this.f10202q;
                } else if (i2 == 1 || i2 == 2) {
                    C0418m.m1572o(v, top - v.getTop());
                }
                this.f10178C = new WeakReference<>(m3074F(v));
                return true;
            }
            iM3075G = this.f10176A;
        }
        C0418m.m1572o(v, iM3075G);
        this.f10178C = new WeakReference<>(m3074F(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: n */
    public boolean mo177n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f10178C;
        return (weakReference == null || view != weakReference.get() || this.f10206u == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: p */
    public void mo179p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f10178C;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m3075G()) {
                iArr[1] = top - m3075G();
                C0418m.m1572o(v, -iArr[1]);
                i4 = 3;
                m3078J(i4);
            } else {
                iArr[1] = i2;
                C0418m.m1572o(v, -i2);
                m3078J(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f10202q;
            if (i5 <= i6 || this.f10204s) {
                iArr[1] = i2;
                C0418m.m1572o(v, -i2);
                m3078J(1);
            } else {
                iArr[1] = top - i6;
                C0418m.m1572o(v, -iArr[1]);
                i4 = 4;
                m3078J(i4);
            }
        }
        m3073E(v.getTop());
        this.f10209x = i2;
        this.f10210y = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: r */
    public void mo181r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: u */
    public void mo184u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C1346e c1346e = (C1346e) parcelable;
        int i = this.f10186a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f10189d = c1346e.f10219e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f10187b = c1346e.f10220f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f10204s = c1346e.f10221g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f10205t = c1346e.f10222h;
            }
        }
        int i2 = c1346e.f10218d;
        if (i2 == 1 || i2 == 2) {
            this.f10206u = 4;
        } else {
            this.f10206u = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: v */
    public Parcelable mo185v(CoordinatorLayout coordinatorLayout, V v) {
        return new C1346e((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: x */
    public boolean mo187x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f10209x = 0;
        this.f10210y = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: z */
    public void mo189z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int top;
        int iM3075G;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == m3075G()) {
            m3078J(3);
            return;
        }
        WeakReference<View> weakReference = this.f10178C;
        if (weakReference != null && view == weakReference.get() && this.f10210y) {
            if (this.f10209x > 0) {
                iM3075G = m3075G();
            } else if (this.f10204s) {
                VelocityTracker velocityTracker = this.f10180E;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f10188c);
                    yVelocity = this.f10180E.getYVelocity(this.f10181F);
                }
                if (m3081M(v, yVelocity)) {
                    iM3075G = this.f10176A;
                    i3 = 5;
                } else if (this.f10209x == 0) {
                    top2 = v.getTop();
                    if (this.f10187b) {
                        i2 = this.f10200o;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - this.f10202q)) {
                                iM3075G = this.f10198m;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f10202q)) {
                            iM3075G = this.f10202q;
                            i3 = 4;
                        }
                        iM3075G = this.f10200o;
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f10199n) < Math.abs(top2 - this.f10202q)) {
                        iM3075G = this.f10199n;
                    } else {
                        iM3075G = this.f10202q;
                        i3 = 4;
                    }
                } else {
                    if (!this.f10187b) {
                        top = v.getTop();
                        if (Math.abs(top - this.f10200o) < Math.abs(top - this.f10202q)) {
                            iM3075G = this.f10200o;
                            i3 = 6;
                        }
                    }
                    iM3075G = this.f10202q;
                    i3 = 4;
                }
            } else if (this.f10209x == 0) {
                top2 = v.getTop();
                if (this.f10187b) {
                    i2 = this.f10200o;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - this.f10202q)) {
                            iM3075G = this.f10198m;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f10202q)) {
                        iM3075G = this.f10202q;
                        i3 = 4;
                    }
                    iM3075G = this.f10200o;
                    i3 = 6;
                } else if (Math.abs(top2 - this.f10199n) < Math.abs(top2 - this.f10202q)) {
                    iM3075G = this.f10199n;
                } else {
                    iM3075G = this.f10202q;
                    i3 = 4;
                }
            } else {
                if (!this.f10187b) {
                    top = v.getTop();
                    if (Math.abs(top - this.f10200o) < Math.abs(top - this.f10202q)) {
                        iM3075G = this.f10200o;
                        i3 = 6;
                    }
                }
                iM3075G = this.f10202q;
                i3 = 4;
            }
            m3082N(v, i3, iM3075G, false);
            this.f10210y = false;
        }
    }
}
