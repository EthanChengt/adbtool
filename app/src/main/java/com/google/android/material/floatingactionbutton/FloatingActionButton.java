package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.didjdk.adbhelper.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p018i.C0265j;
import p006b.p008b.p018i.C0271m;
import p006b.p025e.C0320h;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.InterfaceC0417l;
import p006b.p032h.p046k.InterfaceC0438g;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p131c.C1188g;
import p080c.p126d.p127a.p128a.p131c.InterfaceC1191j;
import p080c.p126d.p127a.p128a.p146p.C1254b;
import p080c.p126d.p127a.p128a.p146p.InterfaceC1253a;
import p080c.p126d.p127a.p128a.p147q.C1255a;
import p080c.p126d.p127a.p128a.p147q.C1256b;
import p080c.p126d.p127a.p128a.p147q.C1257c;
import p080c.p126d.p127a.p128a.p147q.C1258d;
import p080c.p126d.p127a.p128a.p147q.C1259e;
import p080c.p126d.p127a.p128a.p147q.C1262h;
import p080c.p126d.p127a.p128a.p147q.ViewTreeObserverOnPreDrawListenerC1261g;
import p080c.p126d.p127a.p128a.p148r.C1267d;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p148r.C1278o;
import p080c.p126d.p127a.p128a.p153w.InterfaceC1289b;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;
import p080c.p126d.p127a.p128a.p154x.InterfaceC1303n;
import p080c.p126d.p127a.p128a.p156z.C1309a;

/* JADX INFO: loaded from: classes.dex */
@CoordinatorLayout.InterfaceC0069d(FloatingActionButton.Behavior.class)
public class FloatingActionButton extends C1278o implements InterfaceC0417l, InterfaceC0438g, InterfaceC1253a, InterfaceC1303n {

    /* JADX INFO: renamed from: c */
    public ColorStateList f10278c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f10279d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f10280e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f10281f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f10282g;

    /* JADX INFO: renamed from: h */
    public int f10283h;

    /* JADX INFO: renamed from: i */
    public int f10284i;

    /* JADX INFO: renamed from: j */
    public int f10285j;

    /* JADX INFO: renamed from: k */
    public int f10286k;

    /* JADX INFO: renamed from: l */
    public int f10287l;

    /* JADX INFO: renamed from: m */
    public boolean f10288m;

    /* JADX INFO: renamed from: n */
    public final Rect f10289n;

    /* JADX INFO: renamed from: o */
    public final Rect f10290o;

    /* JADX INFO: renamed from: p */
    public final C0271m f10291p;

    /* JADX INFO: renamed from: q */
    public final C1254b f10292q;

    /* JADX INFO: renamed from: r */
    public C1259e f10293r;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0068c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f10294a;

        /* JADX INFO: renamed from: b */
        public boolean f10295b;

        public BaseBehavior() {
            this.f10295b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5571i);
            this.f10295b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: B */
        public boolean m3127B(FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f10289n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* JADX INFO: renamed from: C */
        public final boolean m3128C(View view, FloatingActionButton floatingActionButton) {
            return this.f10295b && ((CoordinatorLayout.C0071f) floatingActionButton.getLayoutParams()).f547f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m3129D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m3128C(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f10294a == null) {
                this.f10294a = new Rect();
            }
            Rect rect = this.f10294a;
            C1267d.m2928a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m3121i(null, false);
                return true;
            }
            floatingActionButton.m3126o(null, false);
            return true;
        }

        /* JADX INFO: renamed from: E */
        public final boolean m3130E(View view, FloatingActionButton floatingActionButton) {
            if (!m3128C(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0071f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m3121i(null, false);
                return true;
            }
            floatingActionButton.m3126o(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo164a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return m3127B((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: f */
        public void mo169f(CoordinatorLayout.C0071f c0071f) {
            if (c0071f.f549h == 0) {
                c0071f.f549h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: g */
        public boolean mo170g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m3129D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0071f ? ((CoordinatorLayout.C0071f) layoutParams).f542a instanceof BottomSheetBehavior : false) {
                    m3130E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: k */
        public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> listM146e = coordinatorLayout.m146e(floatingActionButton);
            int size = listM146e.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = listM146e.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0071f ? ((CoordinatorLayout.C0071f) layoutParams).f542a instanceof BottomSheetBehavior : false) && m3130E(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m3129D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m154s(floatingActionButton, i);
            Rect rect = floatingActionButton.f10289n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.C0071f c0071f = (CoordinatorLayout.C0071f) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0071f).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0071f).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0071f).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0071f).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                C0418m.m1572o(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            C0418m.m1571n(floatingActionButton, i4);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC1359a {
        /* JADX INFO: renamed from: a */
        public void mo2789a(FloatingActionButton floatingActionButton) {
        }

        /* JADX INFO: renamed from: b */
        public void mo2790b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C1360b implements InterfaceC1289b {
        public C1360b() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C1361c<T extends FloatingActionButton> implements C1259e.e {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1191j<T> f10297a;

        public C1361c(InterfaceC1191j<T> interfaceC1191j) {
            this.f10297a = interfaceC1191j;
        }

        @Override // p080c.p126d.p127a.p128a.p147q.C1259e.e
        /* JADX INFO: renamed from: a */
        public void mo2909a() {
            this.f10297a.m2770a(FloatingActionButton.this);
        }

        @Override // p080c.p126d.p127a.p128a.p147q.C1259e.e
        /* JADX INFO: renamed from: b */
        public void mo2910b() {
            this.f10297a.m2771b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1361c) && ((C1361c) obj).f10297a.equals(this.f10297a);
        }

        public int hashCode() {
            return this.f10297a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(C1277n.m2946d(context, attributeSet, R.attr.hk, R.style.p_), attributeSet, R.attr.hk);
        this.f10289n = new Rect();
        this.f10290o = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM2947e = C1277n.m2947e(context2, attributeSet, C1164b.f5570h, R.attr.hk, R.style.p_, new int[0]);
        this.f10278c = C1161a.m2723h(context2, typedArrayM2947e, 0);
        this.f10279d = C1161a.m2733r(typedArrayM2947e.getInt(1, -1), null);
        this.f10282g = C1161a.m2723h(context2, typedArrayM2947e, 11);
        this.f10284i = typedArrayM2947e.getInt(6, -1);
        this.f10285j = typedArrayM2947e.getDimensionPixelSize(5, 0);
        this.f10283h = typedArrayM2947e.getDimensionPixelSize(2, 0);
        float dimension = typedArrayM2947e.getDimension(3, 0.0f);
        float dimension2 = typedArrayM2947e.getDimension(8, 0.0f);
        float dimension3 = typedArrayM2947e.getDimension(10, 0.0f);
        this.f10288m = typedArrayM2947e.getBoolean(15, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.gk);
        this.f10287l = typedArrayM2947e.getDimensionPixelSize(9, 0);
        C1188g c1188gM2764a = C1188g.m2764a(context2, typedArrayM2947e, 14);
        C1188g c1188gM2764a2 = C1188g.m2764a(context2, typedArrayM2947e, 7);
        C1299j c1299jM2991a = C1299j.m2986b(context2, attributeSet, R.attr.hk, R.style.p_, C1299j.f6256m).m2991a();
        boolean z = typedArrayM2947e.getBoolean(4, false);
        typedArrayM2947e.recycle();
        C0271m c0271m = new C0271m(this);
        this.f10291p = c0271m;
        c0271m.m1101c(attributeSet, R.attr.hk);
        this.f10292q = new C1254b(this);
        getImpl().m2901s(c1299jM2991a);
        getImpl().mo2889g(this.f10278c, this.f10279d, this.f10282g, this.f10283h);
        getImpl().f6023k = dimensionPixelSize;
        C1259e impl = getImpl();
        if (impl.f6020h != dimension) {
            impl.f6020h = dimension;
            impl.mo2895m(dimension, impl.f6021i, impl.f6022j);
        }
        C1259e impl2 = getImpl();
        if (impl2.f6021i != dimension2) {
            impl2.f6021i = dimension2;
            impl2.mo2895m(impl2.f6020h, dimension2, impl2.f6022j);
        }
        C1259e impl3 = getImpl();
        if (impl3.f6022j != dimension3) {
            impl3.f6022j = dimension3;
            impl3.mo2895m(impl3.f6020h, impl3.f6021i, dimension3);
        }
        C1259e impl4 = getImpl();
        int i = this.f10287l;
        if (impl4.f6032t != i) {
            impl4.f6032t = i;
            impl4.m2899q(impl4.f6031s);
        }
        getImpl().f6028p = c1188gM2764a;
        getImpl().f6029q = c1188gM2764a2;
        getImpl().f6018f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private C1259e getImpl() {
        if (this.f10293r == null) {
            this.f10293r = Build.VERSION.SDK_INT >= 21 ? new C1262h(this, new C1360b()) : new C1259e(this, new C1360b());
        }
        return this.f10293r;
    }

    /* JADX INFO: renamed from: n */
    public static int m3115n(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // p080c.p126d.p127a.p128a.p146p.InterfaceC1253a
    /* JADX INFO: renamed from: a */
    public boolean mo2880a() {
        return this.f10292q.f5973b;
    }

    /* JADX INFO: renamed from: d */
    public void m3116d(Animator.AnimatorListener animatorListener) {
        C1259e impl = getImpl();
        if (impl.f6035w == null) {
            impl.f6035w = new ArrayList<>();
        }
        impl.f6035w.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo2894l(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public void m3117e(Animator.AnimatorListener animatorListener) {
        C1259e impl = getImpl();
        if (impl.f6034v == null) {
            impl.f6034v = new ArrayList<>();
        }
        impl.f6034v.add(animatorListener);
    }

    /* JADX INFO: renamed from: f */
    public void m3118f(InterfaceC1191j<? extends FloatingActionButton> interfaceC1191j) {
        C1259e impl = getImpl();
        C1361c c1361c = new C1361c(null);
        if (impl.f6036x == null) {
            impl.f6036x = new ArrayList<>();
        }
        impl.f6036x.add(c1361c);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public boolean m3119g(Rect rect) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m3124l(rect);
        return true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f10278c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f10279d;
    }

    public float getCompatElevation() {
        return getImpl().mo2887e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f6021i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f6022j;
    }

    public Drawable getContentBackground() {
        return getImpl().f6017e;
    }

    public int getCustomSize() {
        return this.f10285j;
    }

    public int getExpandedComponentIdHint() {
        return this.f10292q.f5974c;
    }

    public C1188g getHideMotionSpec() {
        return getImpl().f6029q;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f10282g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f10282g;
    }

    public C1299j getShapeAppearanceModel() {
        C1299j c1299j = getImpl().f6013a;
        Objects.requireNonNull(c1299j);
        return c1299j;
    }

    public C1188g getShowMotionSpec() {
        return getImpl().f6028p;
    }

    public int getSize() {
        return this.f10284i;
    }

    public int getSizeDimension() {
        return m3120h(this.f10284i);
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public ColorStateList getSupportImageTintList() {
        return this.f10280e;
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f10281f;
    }

    public boolean getUseCompatPadding() {
        return this.f10288m;
    }

    /* JADX INFO: renamed from: h */
    public final int m3120h(int i) {
        int i2 = this.f10285j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? R.dimen.cb : R.dimen.ca);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m3120h(1) : m3120h(0);
    }

    /* JADX INFO: renamed from: i */
    public void m3121i(AbstractC1359a abstractC1359a, boolean z) {
        C1259e impl = getImpl();
        C1256b c1256b = abstractC1359a == null ? null : new C1256b(this, abstractC1359a);
        if (impl.m2890h()) {
            return;
        }
        Animator animator = impl.f6027o;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m2903u()) {
            impl.f6037y.m2948b(z ? 8 : 4, z);
            if (c1256b != null) {
                c1256b.f5992a.mo2789a(c1256b.f5993b);
                return;
            }
            return;
        }
        C1188g c1188g = impl.f6029q;
        if (c1188g == null) {
            if (impl.f6026n == null) {
                impl.f6026n = C1188g.m2765b(impl.f6037y.getContext(), R.animator.a);
            }
            c1188g = impl.f6026n;
            Objects.requireNonNull(c1188g);
        }
        AnimatorSet animatorSetM2884b = impl.m2884b(c1188g, 0.0f, 0.0f, 0.0f);
        animatorSetM2884b.addListener(new C1257c(impl, z, c1256b));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f6035w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM2884b.addListener(it.next());
            }
        }
        animatorSetM2884b.start();
    }

    /* JADX INFO: renamed from: j */
    public boolean m3122j() {
        return getImpl().m2890h();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo2892j();
    }

    /* JADX INFO: renamed from: k */
    public boolean m3123k() {
        return getImpl().m2891i();
    }

    /* JADX INFO: renamed from: l */
    public final void m3124l(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f10289n;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* JADX INFO: renamed from: m */
    public final void m3125m() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f10280e;
        if (colorStateList == null) {
            C0360f.m1449i(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f10281f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0265j.m1080c(colorForState, mode));
    }

    /* JADX INFO: renamed from: o */
    public void m3126o(AbstractC1359a abstractC1359a, boolean z) {
        C1259e impl = getImpl();
        C1256b c1256b = abstractC1359a == null ? null : new C1256b(this, abstractC1359a);
        if (impl.m2891i()) {
            return;
        }
        Animator animator = impl.f6027o;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m2903u()) {
            impl.f6037y.m2948b(0, z);
            impl.f6037y.setAlpha(1.0f);
            impl.f6037y.setScaleY(1.0f);
            impl.f6037y.setScaleX(1.0f);
            impl.m2899q(1.0f);
            if (c1256b != null) {
                c1256b.f5992a.mo2790b(c1256b.f5993b);
                return;
            }
            return;
        }
        if (impl.f6037y.getVisibility() != 0) {
            impl.f6037y.setAlpha(0.0f);
            impl.f6037y.setScaleY(0.0f);
            impl.f6037y.setScaleX(0.0f);
            impl.m2899q(0.0f);
        }
        C1188g c1188g = impl.f6028p;
        if (c1188g == null) {
            if (impl.f6025m == null) {
                impl.f6025m = C1188g.m2765b(impl.f6037y.getContext(), R.animator.b);
            }
            c1188g = impl.f6025m;
            Objects.requireNonNull(c1188g);
        }
        AnimatorSet animatorSetM2884b = impl.m2884b(c1188g, 1.0f, 1.0f, 1.0f);
        animatorSetM2884b.addListener(new C1258d(impl, z, c1256b));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f6034v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM2884b.addListener(it.next());
            }
        }
        animatorSetM2884b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1259e impl = getImpl();
        C1296g c1296g = impl.f6014b;
        if (c1296g != null) {
            C1161a.m2739x(impl.f6037y, c1296g);
        }
        if (impl.mo2898p()) {
            ViewTreeObserver viewTreeObserver = impl.f6037y.getViewTreeObserver();
            if (impl.f6012E == null) {
                impl.f6012E = new ViewTreeObserverOnPreDrawListenerC1261g(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f6012E);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1259e impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f6037y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f6012E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f6012E = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f10286k = (sizeDimension - this.f10287l) / 2;
        getImpl().m2906x();
        int iMin = Math.min(m3115n(sizeDimension, i), m3115n(sizeDimension, i2));
        Rect rect = this.f10289n;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1309a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1309a c1309a = (C1309a) parcelable;
        super.onRestoreInstanceState(c1309a.f2812b);
        C1254b c1254b = this.f10292q;
        Bundle orDefault = c1309a.f6323d.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        Objects.requireNonNull(c1254b);
        c1254b.f5973b = bundle.getBoolean("expanded", false);
        c1254b.f5974c = bundle.getInt("expandedComponentIdHint", 0);
        if (c1254b.f5973b) {
            ViewParent parent = c1254b.f5972a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m144c(c1254b.f5972a);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C1309a c1309a = new C1309a(parcelableOnSaveInstanceState);
        C0320h<String, Bundle> c0320h = c1309a.f6323d;
        C1254b c1254b = this.f10292q;
        Objects.requireNonNull(c1254b);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c1254b.f5973b);
        bundle.putInt("expandedComponentIdHint", c1254b.f5974c);
        c0320h.put("expandableWidgetHelper", bundle);
        return c1309a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m3119g(this.f10290o) && !this.f10290o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f10278c != colorStateList) {
            this.f10278c = colorStateList;
            C1259e impl = getImpl();
            C1296g c1296g = impl.f6014b;
            if (c1296g != null) {
                c1296g.setTintList(colorStateList);
            }
            C1255a c1255a = impl.f6016d;
            if (c1255a != null) {
                c1255a.m2882b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f10279d != mode) {
            this.f10279d = mode;
            C1296g c1296g = getImpl().f6014b;
            if (c1296g != null) {
                c1296g.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        C1259e impl = getImpl();
        if (impl.f6020h != f) {
            impl.f6020h = f;
            impl.mo2895m(f, impl.f6021i, impl.f6022j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C1259e impl = getImpl();
        if (impl.f6021i != f) {
            impl.f6021i = f;
            impl.mo2895m(impl.f6020h, f, impl.f6022j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C1259e impl = getImpl();
        if (impl.f6022j != f) {
            impl.f6022j = f;
            impl.mo2895m(impl.f6020h, impl.f6021i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f10285j) {
            this.f10285j = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m2907y(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f6018f) {
            getImpl().f6018f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f10292q.f5974c = i;
    }

    public void setHideMotionSpec(C1188g c1188g) {
        getImpl().f6029q = c1188g;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1188g.m2765b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C1259e impl = getImpl();
            impl.m2899q(impl.f6031s);
            if (this.f10280e != null) {
                m3125m();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f10291p.m1102d(i);
        m3125m();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f10282g != colorStateList) {
            this.f10282g = colorStateList;
            getImpl().mo2900r(this.f10282g);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m2896n();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m2896n();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C1259e impl = getImpl();
        impl.f6019g = z;
        impl.m2906x();
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1303n
    public void setShapeAppearanceModel(C1299j c1299j) {
        getImpl().m2901s(c1299j);
    }

    public void setShowMotionSpec(C1188g c1188g) {
        getImpl().f6028p = c1188g;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1188g.m2765b(getContext(), i));
    }

    public void setSize(int i) {
        this.f10285j = 0;
        if (i != this.f10284i) {
            this.f10284i = i;
            requestLayout();
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f10280e != colorStateList) {
            this.f10280e = colorStateList;
            m3125m();
        }
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f10281f != mode) {
            this.f10281f = mode;
            m3125m();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m2897o();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m2897o();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m2897o();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f10288m != z) {
            this.f10288m = z;
            getImpl().mo2893k();
        }
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1278o, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
