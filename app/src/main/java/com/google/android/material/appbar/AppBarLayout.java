package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;
import p006b.p032h.p044j.InterfaceC0409d;
import p006b.p049j.p050a.AbstractC0442a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p131c.C1182a;
import p080c.p126d.p127a.p128a.p133d.AbstractC1200d;
import p080c.p126d.p127a.p128a.p133d.AbstractC1201e;
import p080c.p126d.p127a.p128a.p133d.C1197a;
import p080c.p126d.p127a.p128a.p133d.C1198b;
import p080c.p126d.p127a.p128a.p133d.C1199c;
import p080c.p126d.p127a.p128a.p133d.C1204h;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p154x.C1296g;

/* JADX INFO: loaded from: classes.dex */
@CoordinatorLayout.InterfaceC0069d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public int f10115b;

    /* JADX INFO: renamed from: c */
    public int f10116c;

    /* JADX INFO: renamed from: d */
    public int f10117d;

    /* JADX INFO: renamed from: e */
    public int f10118e;

    /* JADX INFO: renamed from: f */
    public boolean f10119f;

    /* JADX INFO: renamed from: g */
    public int f10120g;

    /* JADX INFO: renamed from: h */
    public C0427v f10121h;

    /* JADX INFO: renamed from: i */
    public boolean f10122i;

    /* JADX INFO: renamed from: j */
    public boolean f10123j;

    /* JADX INFO: renamed from: k */
    public boolean f10124k;

    /* JADX INFO: renamed from: l */
    public int f10125l;

    /* JADX INFO: renamed from: m */
    public WeakReference<View> f10126m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f10127n;

    /* JADX INFO: renamed from: o */
    public int[] f10128o;

    /* JADX INFO: renamed from: p */
    public Drawable f10129p;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC1200d<T> {

        /* JADX INFO: renamed from: j */
        public int f10130j;

        /* JADX INFO: renamed from: k */
        public int f10131k;

        /* JADX INFO: renamed from: l */
        public ValueAnimator f10132l;

        /* JADX INFO: renamed from: m */
        public int f10133m;

        /* JADX INFO: renamed from: n */
        public boolean f10134n;

        /* JADX INFO: renamed from: o */
        public float f10135o;

        /* JADX INFO: renamed from: p */
        public WeakReference<View> f10136p;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C1335a extends AbstractC0442a {
            public static final Parcelable.Creator<C1335a> CREATOR = new a();

            /* JADX INFO: renamed from: d */
            public int f10137d;

            /* JADX INFO: renamed from: e */
            public float f10138e;

            /* JADX INFO: renamed from: f */
            public boolean f10139f;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public static class a implements Parcelable.ClassLoaderCreator<C1335a> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new C1335a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new C1335a[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public C1335a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C1335a(parcel, classLoader);
                }
            }

            public C1335a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f10137d = parcel.readInt();
                this.f10138e = parcel.readFloat();
                this.f10139f = parcel.readByte() != 0;
            }

            public C1335a(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f2812b, i);
                parcel.writeInt(this.f10137d);
                parcel.writeFloat(this.f10138e);
                parcel.writeByte(this.f10139f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f10133m = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10133m = -1;
        }

        /* JADX INFO: renamed from: K */
        public static boolean m3048K(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // p080c.p126d.p127a.p128a.p133d.AbstractC1200d
        /* JADX INFO: renamed from: E */
        public boolean mo2772E(View view) {
            WeakReference<View> weakReference = this.f10136p;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // p080c.p126d.p127a.p128a.p133d.AbstractC1200d
        /* JADX INFO: renamed from: F */
        public int mo2773F() {
            return m2779B() + this.f10130j;
        }

        @Override // p080c.p126d.p127a.p128a.p133d.AbstractC1200d
        /* JADX INFO: renamed from: I */
        public int mo2776I(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo2773F = mo2773F();
            int topInset = 0;
            if (i2 == 0 || iMo2773F < i2 || iMo2773F > i3) {
                this.f10130j = 0;
                return 0;
            }
            int iM1448h = C0360f.m1448h(i, i2, i3);
            if (iMo2773F == iM1448h) {
                return 0;
            }
            if (!appBarLayout.f10119f) {
                top = iM1448h;
                break;
            }
            int iAbs = Math.abs(iM1448h);
            int childCount = appBarLayout.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount) {
                    View childAt = appBarLayout.getChildAt(i4);
                    C1336a c1336a = (C1336a) childAt.getLayoutParams();
                    Interpolator interpolator = c1336a.f10141b;
                    if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                        if (interpolator != null) {
                            int i5 = c1336a.f10140a;
                            if ((i5 & 1) != 0) {
                                topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c1336a).topMargin + ((LinearLayout.LayoutParams) c1336a).bottomMargin;
                                if ((i5 & 2) != 0) {
                                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                                    topInset -= childAt.getMinimumHeight();
                                }
                            }
                            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                            if (childAt.getFitsSystemWindows()) {
                                topInset -= appBarLayout.getTopInset();
                            }
                            if (topInset > 0) {
                                float f = topInset;
                                top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iM1448h);
                                break;
                            }
                        }
                    } else {
                        i4++;
                    }
                }
                top = iM1448h;
                break;
            }
            boolean zM2780D = m2780D(top);
            int i6 = iMo2773F - iM1448h;
            this.f10130j = iM1448h - top;
            if (!zM2780D && appBarLayout.f10119f) {
                coordinatorLayout.m144c(appBarLayout);
            }
            appBarLayout.f10115b = m2779B();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, String> weakHashMap3 = C0418m.f2718a;
                appBarLayout.postInvalidateOnAnimation();
            }
            m3055Q(coordinatorLayout, appBarLayout, iM1448h, iM1448h < iMo2773F ? -1 : 1, false);
            return i6;
        }

        /* JADX INFO: renamed from: J */
        public final void m3049J(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int iAbs = Math.abs(mo2773F() - i);
            float fAbs = Math.abs(f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f);
            int iMo2773F = mo2773F();
            if (iMo2773F == i) {
                ValueAnimator valueAnimator = this.f10132l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f10132l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f10132l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f10132l = valueAnimator3;
                valueAnimator3.setInterpolator(C1182a.f5666e);
                this.f10132l.addUpdateListener(new C1199c(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f10132l.setDuration(Math.min(iRound, 600));
            this.f10132l.setIntValues(iMo2773F, i);
            this.f10132l.start();
        }

        /* JADX INFO: renamed from: L */
        public final View m3050L(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0409d) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: M */
        public void m3051M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int downNestedPreScrollRange;
            if (i != 0) {
                if (i < 0) {
                    int i3 = -appBarLayout.getTotalScrollRange();
                    i2 = i3;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i2 != downNestedPreScrollRange) {
                    iArr[1] = m2774G(coordinatorLayout, appBarLayout, i, i2, downNestedPreScrollRange);
                }
            }
            if (appBarLayout.f10124k) {
                appBarLayout.m3044c(appBarLayout.m3045d(view));
            }
        }

        /* JADX INFO: renamed from: N */
        public void m3052N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                iArr[1] = m2774G(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x002a  */
        /* JADX INFO: renamed from: O */
        public boolean m3053O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = true;
            if ((i & 2) == 0) {
                z = false;
            } else if (!appBarLayout.f10124k) {
                if (!((appBarLayout.getTotalScrollRange() != 0) && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight())) {
                    z = false;
                }
            }
            if (z && (valueAnimator = this.f10132l) != null) {
                valueAnimator.cancel();
            }
            this.f10136p = null;
            this.f10131k = i2;
            return z;
        }

        /* JADX INFO: renamed from: P */
        public final void m3054P(CoordinatorLayout coordinatorLayout, T t) {
            int iMo2773F = mo2773F();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C1336a c1336a = (C1336a) childAt.getLayoutParams();
                if (m3048K(c1336a.f10140a, 32)) {
                    top -= ((LinearLayout.LayoutParams) c1336a).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c1336a).bottomMargin;
                }
                int i2 = -iMo2773F;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                C1336a c1336a2 = (C1336a) childAt2.getLayoutParams();
                int i3 = c1336a2.f10140a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        minimumHeight += t.getTopInset();
                    }
                    if (m3048K(i3, 2)) {
                        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (m3048K(i3, 5)) {
                        WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iMo2773F < minimumHeight2) {
                            i4 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (m3048K(i3, 32)) {
                        i4 += ((LinearLayout.LayoutParams) c1336a2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c1336a2).bottomMargin;
                    }
                    if (iMo2773F < (minimumHeight + i4) / 2) {
                        i4 = minimumHeight;
                    }
                    m3049J(coordinatorLayout, t, C0360f.m1448h(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX INFO: renamed from: Q */
        public final void m3055Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View childAt;
            boolean zM3045d;
            int iAbs = Math.abs(i);
            int childCount = t.getChildCount();
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = t.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((C1336a) childAt.getLayoutParams()).f10140a;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - t.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - t.getTopInset()) {
                        zM3045d = false;
                    } else {
                        zM3045d = true;
                    }
                } else {
                    zM3045d = false;
                }
                if (t.f10124k) {
                    zM3045d = t.m3045d(m3050L(coordinatorLayout));
                }
                boolean zM3044c = t.m3044c(zM3045d);
                if (!z) {
                    if (!zM3044c) {
                        return;
                    }
                    List<View> listM147f = coordinatorLayout.m147f(t);
                    int size = listM147f.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.AbstractC0068c abstractC0068c = ((CoordinatorLayout.C0071f) listM147f.get(i5).getLayoutParams()).f542a;
                        if (abstractC0068c instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) abstractC0068c).f5704f == 0) {
                                break;
                            }
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                }
                t.jumpDrawablesToCurrentState();
            }
        }

        @Override // p080c.p126d.p127a.p128a.p133d.C1202f, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: k */
        public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo174k(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f10133m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.f10134n) {
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f10135o) + i3;
                }
                m2775H(coordinatorLayout, appBarLayout, iRound);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m3049J(coordinatorLayout, appBarLayout, i4, 0.0f);
                    } else {
                        m2775H(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m3049J(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        m2775H(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f10120g = 0;
            this.f10133m = -1;
            m2780D(C0360f.m1448h(m2779B(), -appBarLayout.getTotalScrollRange(), 0));
            m3055Q(coordinatorLayout, appBarLayout, m2779B(), 0, true);
            appBarLayout.f10115b = m2779B();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                appBarLayout.postInvalidateOnAnimation();
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: l */
        public boolean mo175l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0071f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m155t(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ void mo179p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m3051M(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: r */
        public /* bridge */ /* synthetic */ void mo181r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            m3052N(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: u */
        public void mo184u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (!(parcelable instanceof C1335a)) {
                this.f10133m = -1;
                return;
            }
            C1335a c1335a = (C1335a) parcelable;
            this.f10133m = c1335a.f10137d;
            this.f10135o = c1335a.f10138e;
            this.f10134n = c1335a.f10139f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: v */
        public Parcelable mo185v(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iM2779B = m2779B();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iM2779B;
                if (childAt.getTop() + iM2779B <= 0 && bottom >= 0) {
                    C1335a c1335a = new C1335a(absSavedState);
                    c1335a.f10137d = i;
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    c1335a.f10139f = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    c1335a.f10138e = bottom / childAt.getHeight();
                    return c1335a;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: x */
        public /* bridge */ /* synthetic */ boolean mo187x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return m3053O(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: z */
        public void mo189z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f10131k == 0 || i == 1) {
                m3054P(coordinatorLayout, appBarLayout);
                if (appBarLayout.f10124k) {
                    appBarLayout.m3044c(appBarLayout.m3045d(view2));
                }
            }
            this.f10136p = new WeakReference<>(view2);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC1201e {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5584v);
            this.f5704f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: F */
        public AppBarLayout m3056F(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: d */
        public boolean mo167d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: g */
        public boolean mo170g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.AbstractC0068c abstractC0068c = ((CoordinatorLayout.C0071f) view2.getLayoutParams()).f542a;
            if (abstractC0068c instanceof BaseBehavior) {
                C0418m.m1572o(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0068c).f10130j) + this.f5703e) - m2778E(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f10124k) {
                return false;
            }
            appBarLayout.m3044c(appBarLayout.m3045d(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: t */
        public boolean mo183t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutM3056F = m3056F(coordinatorLayout.m146e(view));
            if (appBarLayoutM3056F != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f5701c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutM3056F.m3043b(false, !z, true);
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static class C1336a extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        public int f10140a;

        /* JADX INFO: renamed from: b */
        public Interpolator f10141b;

        public C1336a(int i, int i2) {
            super(i, i2);
            this.f10140a = 1;
        }

        public C1336a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10140a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5564b);
            this.f10140a = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.f10141b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C1336a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10140a = 1;
        }

        public C1336a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10140a = 1;
        }

        public C1336a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10140a = 1;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ak);
        this.f10116c = -1;
        this.f10117d = -1;
        this.f10118e = -1;
        this.f10120g = 0;
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            Context context2 = getContext();
            TypedArray typedArrayM2947e = C1277n.m2947e(context2, attributeSet, C1204h.f5712a, R.attr.ak, R.style.p6, new int[0]);
            try {
                if (typedArrayM2947e.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, typedArrayM2947e.getResourceId(0, 0)));
                }
                typedArrayM2947e.recycle();
            } catch (Throwable th) {
                typedArrayM2947e.recycle();
                throw th;
            }
        }
        int[] iArr = C1164b.f5563a;
        C1277n.m2943a(context, attributeSet, R.attr.ak, R.style.p6);
        C1277n.m2944b(context, attributeSet, iArr, R.attr.ak, R.style.p6, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.ak, R.style.p6);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setBackground(drawable);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C1296g c1296g = new C1296g();
            c1296g.m2975p(ColorStateList.valueOf(colorDrawable.getColor()));
            c1296g.f6211b.f6234b = new C1252a(context);
            c1296g.m2984y();
            setBackground(c1296g);
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            m3043b(typedArrayObtainStyledAttributes.getBoolean(4, false), false, false);
        }
        if (i >= 21 && typedArrayObtainStyledAttributes.hasValue(3)) {
            C1204h.m2782a(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        if (i >= 26) {
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(2, false));
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(1, false));
            }
        }
        this.f10124k = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f10125l = typedArrayObtainStyledAttributes.getResourceId(6, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(7));
        typedArrayObtainStyledAttributes.recycle();
        C0418m.m1579v(this, new C1197a(this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1336a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C1336a((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1336a((ViewGroup.MarginLayoutParams) layoutParams) : new C1336a(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m3043b(boolean z, boolean z2, boolean z3) {
        this.f10120g = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: c */
    public boolean m3044c(boolean z) {
        if (this.f10123j == z) {
            return false;
        }
        this.f10123j = z;
        refreshDrawableState();
        if (this.f10124k && (getBackground() instanceof C1296g)) {
            C1296g c1296g = (C1296g) getBackground();
            float dimension = getResources().getDimension(R.dimen.bt);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f10127n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.f10127n = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.c));
            this.f10127n.setInterpolator(C1182a.f5662a);
            this.f10127n.addUpdateListener(new C1198b(this, c1296g));
            this.f10127n.start();
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1336a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3045d(View view) {
        int i;
        if (this.f10126m == null && (i = this.f10125l) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f10125l);
            }
            if (viewFindViewById != null) {
                this.f10126m = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f10126m;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10129p != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f10115b);
            this.f10129p.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10129p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3046e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return !childAt.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: f */
    public final void m3047f() {
        setWillNotDraw(!(this.f10129p != null && getTopInset() > 0));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1336a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1336a(getContext(), attributeSet);
    }

    public int getDownNestedPreScrollRange() {
        int minimumHeight;
        int i = this.f10117d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C1336a c1336a = (C1336a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c1336a.f10140a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) c1336a).topMargin + ((LinearLayout.LayoutParams) c1336a).bottomMargin;
                if ((i3 & 8) != 0) {
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    minimumHeight = i4 + childAt.getMinimumHeight();
                } else if ((i3 & 2) != 0) {
                    WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                    minimumHeight = i4 + (measuredHeight - childAt.getMinimumHeight());
                } else {
                    minimumHeight = i4 + measuredHeight;
                }
                if (childCount == 0) {
                    WeakHashMap<View, String> weakHashMap3 = C0418m.f2718a;
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight = Math.min(minimumHeight, measuredHeight - getTopInset());
                    }
                }
                i2 += minimumHeight;
            }
        }
        int iMax = Math.max(0, i2);
        this.f10117d = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f10118e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1336a c1336a = (C1336a) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) c1336a).topMargin + ((LinearLayout.LayoutParams) c1336a).bottomMargin + childAt.getMeasuredHeight();
            int i3 = c1336a.f10140a;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f10118e = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f10125l;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f10120g;
    }

    public Drawable getStatusBarForeground() {
        return this.f10129p;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C0427v c0427v = this.f10121h;
        if (c0427v != null) {
            return c0427v.m1603d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f10116c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1336a c1336a = (C1336a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c1336a.f10140a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) c1336a).topMargin + ((LinearLayout.LayoutParams) c1336a).bottomMargin + minimumHeight;
            if (i2 == 0) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
            }
            minimumHeight = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f10116c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1296g) {
            C1161a.m2739x(this, (C1296g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f10128o == null) {
            this.f10128o = new int[4];
        }
        int[] iArr = this.f10128o;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f10122i;
        iArr[0] = z ? R.attr.pe : -2130969172;
        iArr[1] = (z && this.f10123j) ? R.attr.pf : -2130969173;
        iArr[2] = z ? R.attr.pc : -2130969170;
        iArr[3] = (z && this.f10123j) ? R.attr.pb : -2130969169;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f10126m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f10126m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        boolean z3 = true;
        if (getFitsSystemWindows() && m3046e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0418m.m1572o(getChildAt(childCount), topInset);
            }
        }
        this.f10116c = -1;
        this.f10117d = -1;
        this.f10118e = -1;
        this.f10119f = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((C1336a) getChildAt(i5).getLayoutParams()).f10141b != null) {
                this.f10119f = true;
                break;
            }
        }
        Drawable drawable = this.f10129p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f10124k) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C1336a) getChildAt(i6).getLayoutParams()).f10140a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f10122i != z3) {
            this.f10122i = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (getFitsSystemWindows() && m3046e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C0360f.m1448h(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f10116c = -1;
        this.f10117d = -1;
        this.f10118e = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1161a.m2738w(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        m3043b(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f10124k = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f10125l = i;
        WeakReference<View> weakReference = this.f10126m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f10126m = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f10129p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f10129p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f10129p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f10129p;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                C0360f.m1427S(drawable3, getLayoutDirection());
                this.f10129p.setVisible(getVisibility() == 0, false);
                this.f10129p.setCallback(this);
            }
            m3047f();
            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0208a.m884b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1204h.m2782a(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f10129p;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10129p;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C1336a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1336a(getContext(), attributeSet);
    }
}
