package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.C0220f;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p018i.C0294x0;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;
import p006b.p049j.p050a.AbstractC0442a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p148r.C1270g;
import p080c.p126d.p127a.p128a.p148r.C1271h;
import p080c.p126d.p127a.p128a.p148r.C1271h.c;
import p080c.p126d.p127a.p128a.p148r.C1271h.h;
import p080c.p126d.p127a.p128a.p148r.C1274k;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p149s.C1279a;
import p080c.p126d.p127a.p128a.p149s.ViewTreeObserverOnGlobalLayoutListenerC1280b;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends C1274k {

    /* JADX INFO: renamed from: n */
    public static final int[] f10317n = {R.attr.state_checked};

    /* JADX INFO: renamed from: o */
    public static final int[] f10318o = {-16842910};

    /* JADX INFO: renamed from: g */
    public final C1270g f10319g;

    /* JADX INFO: renamed from: h */
    public final C1271h f10320h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1364a f10321i;

    /* JADX INFO: renamed from: j */
    public final int f10322j;

    /* JADX INFO: renamed from: k */
    public final int[] f10323k;

    /* JADX INFO: renamed from: l */
    public MenuInflater f10324l;

    /* JADX INFO: renamed from: m */
    public ViewTreeObserver.OnGlobalLayoutListener f10325m;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$a */
    public interface InterfaceC1364a {
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$b */
    public static class C1365b extends AbstractC0442a {
        public static final Parcelable.Creator<C1365b> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public Bundle f10326d;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$b$a */
        public static class a implements Parcelable.ClassLoaderCreator<C1365b> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C1365b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C1365b[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C1365b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1365b(parcel, classLoader);
            }
        }

        public C1365b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10326d = parcel.readBundle(classLoader);
        }

        public C1365b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeBundle(this.f10326d);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        int iM1164l;
        boolean z;
        super(context, attributeSet, com.didjdk.adbhelper.R.attr.mu);
        C1271h c1271h = new C1271h();
        this.f10320h = c1271h;
        this.f10323k = new int[2];
        C1270g c1270g = new C1270g(context);
        this.f10319g = c1270g;
        int[] iArr = C1164b.f5582t;
        C1277n.m2943a(context, attributeSet, com.didjdk.adbhelper.R.attr.mu, com.didjdk.adbhelper.R.style.pa);
        C1277n.m2944b(context, attributeSet, iArr, com.didjdk.adbhelper.R.attr.mu, com.didjdk.adbhelper.R.style.pa, new int[0]);
        C0294x0 c0294x0 = new C0294x0(context, context.obtainStyledAttributes(attributeSet, iArr, com.didjdk.adbhelper.R.attr.mu, com.didjdk.adbhelper.R.style.pa));
        if (c0294x0.m1167o(0)) {
            setBackground(c0294x0.m1159g(0));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            C1296g c1296g = new C1296g();
            if (background instanceof ColorDrawable) {
                c1296g.m2975p(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c1296g.f6211b.f6234b = new C1252a(context);
            c1296g.m2984y();
            setBackground(c1296g);
        }
        if (c0294x0.m1167o(3)) {
            setElevation(c0294x0.m1158f(3, 0));
        }
        setFitsSystemWindows(c0294x0.m1153a(1, false));
        this.f10322j = c0294x0.m1158f(2, 0);
        ColorStateList colorStateListM1155c = c0294x0.m1167o(9) ? c0294x0.m1155c(9) : m3131b(R.attr.textColorSecondary);
        if (c0294x0.m1167o(18)) {
            iM1164l = c0294x0.m1164l(18, 0);
            z = true;
        } else {
            iM1164l = 0;
            z = false;
        }
        if (c0294x0.m1167o(8)) {
            setItemIconSize(c0294x0.m1158f(8, 0));
        }
        ColorStateList colorStateListM1155c2 = c0294x0.m1167o(19) ? c0294x0.m1155c(19) : null;
        if (!z && colorStateListM1155c2 == null) {
            colorStateListM1155c2 = m3131b(R.attr.textColorPrimary);
        }
        Drawable drawableM1159g = c0294x0.m1159g(5);
        if (drawableM1159g == null) {
            if (c0294x0.m1167o(11) || c0294x0.m1167o(12)) {
                C1296g c1296g2 = new C1296g(C1299j.m2985a(getContext(), c0294x0.m1164l(11, 0), c0294x0.m1164l(12, 0), new C1290a(0)).m2991a());
                c1296g2.m2975p(C1161a.m2724i(getContext(), c0294x0, 13));
                drawableM1159g = new InsetDrawable((Drawable) c1296g2, c0294x0.m1158f(16, 0), c0294x0.m1158f(17, 0), c0294x0.m1158f(15, 0), c0294x0.m1158f(14, 0));
            }
        }
        if (c0294x0.m1167o(6)) {
            c1271h.m2931b(c0294x0.m1158f(6, 0));
        }
        int iM1158f = c0294x0.m1158f(7, 0);
        setItemMaxLines(c0294x0.m1162j(10, 1));
        c1270g.f1634e = new C1279a(this);
        c1271h.f6103e = 1;
        c1271h.mo120g(context, c1270g);
        c1271h.f6109k = colorStateListM1155c;
        c1271h.mo125n(false);
        int overScrollMode = getOverScrollMode();
        c1271h.f6119u = overScrollMode;
        NavigationMenuView navigationMenuView = c1271h.f6100b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (z) {
            c1271h.f6106h = iM1164l;
            c1271h.f6107i = true;
            c1271h.mo125n(false);
        }
        c1271h.f6108j = colorStateListM1155c2;
        c1271h.mo125n(false);
        c1271h.f6110l = drawableM1159g;
        c1271h.mo125n(false);
        c1271h.m2932f(iM1158f);
        c1270g.m942b(c1271h, c1270g.f1630a);
        if (c1271h.f6100b == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) c1271h.f6105g.inflate(com.didjdk.adbhelper.R.layout.an, (ViewGroup) this, false);
            c1271h.f6100b = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(c1271h.new h(c1271h.f6100b));
            if (c1271h.f6104f == null) {
                c1271h.f6104f = c1271h.new c();
            }
            int i = c1271h.f6119u;
            if (i != -1) {
                c1271h.f6100b.setOverScrollMode(i);
            }
            c1271h.f6101c = (LinearLayout) c1271h.f6105g.inflate(com.didjdk.adbhelper.R.layout.ak, (ViewGroup) c1271h.f6100b, false);
            c1271h.f6100b.setAdapter(c1271h.f6104f);
        }
        addView(c1271h.f6100b);
        if (c0294x0.m1167o(20)) {
            int iM1164l2 = c0294x0.m1164l(20, 0);
            c1271h.m2933k(true);
            getMenuInflater().inflate(iM1164l2, c1270g);
            c1271h.m2933k(false);
            c1271h.mo125n(false);
        }
        if (c0294x0.m1167o(4)) {
            c1271h.f6101c.addView(c1271h.f6105g.inflate(c0294x0.m1164l(4, 0), (ViewGroup) c1271h.f6101c, false));
            NavigationMenuView navigationMenuView3 = c1271h.f6100b;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        c0294x0.f2052b.recycle();
        this.f10325m = new ViewTreeObserverOnGlobalLayoutListenerC1280b(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10325m);
    }

    private MenuInflater getMenuInflater() {
        if (this.f10324l == null) {
            this.f10324l = new C0220f(getContext());
        }
        return this.f10324l;
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1274k
    /* JADX INFO: renamed from: a */
    public void mo2937a(C0427v c0427v) {
        C1271h c1271h = this.f10320h;
        Objects.requireNonNull(c1271h);
        int iM1603d = c0427v.m1603d();
        if (c1271h.f6117s != iM1603d) {
            c1271h.f6117s = iM1603d;
            c1271h.m2934o();
        }
        NavigationMenuView navigationMenuView = c1271h.f6100b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c0427v.m1600a());
        C0418m.m1561d(c1271h.f6101c, c0427v);
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m3131b(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM883a = C0208a.m883a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.e2, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM883a.getDefaultColor();
        int[] iArr = f10318o;
        return new ColorStateList(new int[][]{iArr, f10317n, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM883a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* JADX INFO: renamed from: c */
    public View m3132c(int i) {
        return this.f10320h.f6101c.getChildAt(i);
    }

    public MenuItem getCheckedItem() {
        return this.f10320h.f6104f.f6123d;
    }

    public int getHeaderCount() {
        return this.f10320h.f6101c.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f10320h.f6110l;
    }

    public int getItemHorizontalPadding() {
        return this.f10320h.f6111m;
    }

    public int getItemIconPadding() {
        return this.f10320h.f6112n;
    }

    public ColorStateList getItemIconTintList() {
        return this.f10320h.f6109k;
    }

    public int getItemMaxLines() {
        return this.f10320h.f6116r;
    }

    public ColorStateList getItemTextColor() {
        return this.f10320h.f6108j;
    }

    public Menu getMenu() {
        return this.f10319g;
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1274k, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1296g) {
            C1161a.m2739x(this, (C1296g) background);
        }
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1274k, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f10325m);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                iMin = this.f10322j;
            }
            super.onMeasure(i, i2);
        }
        iMin = Math.min(View.MeasureSpec.getSize(i), this.f10322j);
        i = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1365b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1365b c1365b = (C1365b) parcelable;
        super.onRestoreInstanceState(c1365b.f2812b);
        C1270g c1270g = this.f10319g;
        Bundle bundle = c1365b.f10326d;
        Objects.requireNonNull(c1270g);
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || c1270g.f1650u.isEmpty()) {
            return;
        }
        for (WeakReference<InterfaceC0235m> weakReference : c1270g.f1650u) {
            InterfaceC0235m interfaceC0235m = weakReference.get();
            if (interfaceC0235m == null) {
                c1270g.f1650u.remove(weakReference);
            } else {
                int iMo117c = interfaceC0235m.mo117c();
                if (iMo117c > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(iMo117c)) != null) {
                    interfaceC0235m.mo121h(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo119e;
        C1365b c1365b = new C1365b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c1365b.f10326d = bundle;
        C1270g c1270g = this.f10319g;
        if (!c1270g.f1650u.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            for (WeakReference<InterfaceC0235m> weakReference : c1270g.f1650u) {
                InterfaceC0235m interfaceC0235m = weakReference.get();
                if (interfaceC0235m == null) {
                    c1270g.f1650u.remove(weakReference);
                } else {
                    int iMo117c = interfaceC0235m.mo117c();
                    if (iMo117c > 0 && (parcelableMo119e = interfaceC0235m.mo119e()) != null) {
                        sparseArray.put(iMo117c, parcelableMo119e);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return c1365b;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.f10319g.findItem(i);
        if (menuItemFindItem != null) {
            this.f10320h.f6104f.m2936j((C0231i) menuItemFindItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C1161a.m2738w(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        C1271h c1271h = this.f10320h;
        c1271h.f6110l = drawable;
        c1271h.mo125n(false);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0362a.m1469c(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        C1271h c1271h = this.f10320h;
        c1271h.f6111m = i;
        c1271h.mo125n(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f10320h.m2931b(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        C1271h c1271h = this.f10320h;
        c1271h.f6112n = i;
        c1271h.mo125n(false);
    }

    public void setItemIconPaddingResource(int i) {
        this.f10320h.m2932f(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        C1271h c1271h = this.f10320h;
        if (c1271h.f6113o != i) {
            c1271h.f6113o = i;
            c1271h.f6114p = true;
            c1271h.mo125n(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C1271h c1271h = this.f10320h;
        c1271h.f6109k = colorStateList;
        c1271h.mo125n(false);
    }

    public void setItemMaxLines(int i) {
        C1271h c1271h = this.f10320h;
        c1271h.f6116r = i;
        c1271h.mo125n(false);
    }

    public void setItemTextAppearance(int i) {
        C1271h c1271h = this.f10320h;
        c1271h.f6106h = i;
        c1271h.f6107i = true;
        c1271h.mo125n(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C1271h c1271h = this.f10320h;
        c1271h.f6108j = colorStateList;
        c1271h.mo125n(false);
    }

    public void setNavigationItemSelectedListener(InterfaceC1364a interfaceC1364a) {
        this.f10321i = interfaceC1364a;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C1271h c1271h = this.f10320h;
        if (c1271h != null) {
            c1271h.f6119u = i;
            NavigationMenuView navigationMenuView = c1271h.f6100b;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f10319g.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.f10320h.f6104f.m2936j((C0231i) menuItemFindItem);
    }
}
