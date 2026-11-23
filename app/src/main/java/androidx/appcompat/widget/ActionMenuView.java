package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p008b.p009c.C0204t;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p016h.p017i.InterfaceC0236n;
import p006b.p008b.p018i.C0248c;
import p006b.p008b.p018i.C0253d1;
import p006b.p008b.p018i.C0264i0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends C0264i0 implements C0229g.b, InterfaceC0236n {

    /* JADX INFO: renamed from: A */
    public int f221A;

    /* JADX INFO: renamed from: B */
    public InterfaceC0036e f222B;

    /* JADX INFO: renamed from: q */
    public C0229g f223q;

    /* JADX INFO: renamed from: r */
    public Context f224r;

    /* JADX INFO: renamed from: s */
    public int f225s;

    /* JADX INFO: renamed from: t */
    public boolean f226t;

    /* JADX INFO: renamed from: u */
    public C0248c f227u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0235m.a f228v;

    /* JADX INFO: renamed from: w */
    public C0229g.a f229w;

    /* JADX INFO: renamed from: x */
    public boolean f230x;

    /* JADX INFO: renamed from: y */
    public int f231y;

    /* JADX INFO: renamed from: z */
    public int f232z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0032a {
        /* JADX INFO: renamed from: a */
        boolean mo15a();

        /* JADX INFO: renamed from: b */
        boolean mo16b();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0033b implements InterfaceC0235m.a {
        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: a */
        public void mo60a(C0229g c0229g, boolean z) {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: b */
        public boolean mo61b(C0229g c0229g) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0034c extends C0264i0.a {

        /* JADX INFO: renamed from: c */
        @ViewDebug.ExportedProperty
        public boolean f233c;

        /* JADX INFO: renamed from: d */
        @ViewDebug.ExportedProperty
        public int f234d;

        /* JADX INFO: renamed from: e */
        @ViewDebug.ExportedProperty
        public int f235e;

        /* JADX INFO: renamed from: f */
        @ViewDebug.ExportedProperty
        public boolean f236f;

        /* JADX INFO: renamed from: g */
        @ViewDebug.ExportedProperty
        public boolean f237g;

        /* JADX INFO: renamed from: h */
        public boolean f238h;

        public C0034c(int i, int i2) {
            super(i, i2);
            this.f233c = false;
        }

        public C0034c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0034c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0034c(C0034c c0034c) {
            super(c0034c);
            this.f233c = c0034c.f233c;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0035d implements C0229g.a {
        public C0035d() {
        }

        @Override // p006b.p008b.p016h.p017i.C0229g.a
        /* JADX INFO: renamed from: a */
        public boolean mo62a(C0229g c0229g, MenuItem menuItem) {
            InterfaceC0036e interfaceC0036e = ActionMenuView.this.f222B;
            if (interfaceC0036e == null) {
                return false;
            }
            Toolbar.InterfaceC0061f interfaceC0061f = Toolbar.this.f377H;
            return interfaceC0061f != null ? C0204t.this.f1348c.onMenuItemSelected(0, menuItem) : false;
        }

        @Override // p006b.p008b.p016h.p017i.C0229g.a
        /* JADX INFO: renamed from: b */
        public void mo63b(C0229g c0229g) {
            C0229g.a aVar = ActionMenuView.this.f229w;
            if (aVar != null) {
                aVar.mo63b(c0229g);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0036e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f232z = (int) (56.0f * f);
        this.f221A = (int) (f * 4.0f);
        this.f224r = context;
        this.f225s = 0;
    }

    /* JADX INFO: renamed from: t */
    public static int m53t(View view, int i, int i2, int i3, int i4) {
        C0034c c0034c = (C0034c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m17c();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!c0034c.f233c && z2) {
            z = true;
        }
        c0034c.f236f = z;
        c0034c.f234d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g.b
    /* JADX INFO: renamed from: a */
    public boolean mo23a(C0231i c0231i) {
        return this.f223q.m959s(c0231i, null, 0);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n
    /* JADX INFO: renamed from: b */
    public void mo24b(C0229g c0229g) {
        this.f223q = c0229g;
    }

    @Override // p006b.p008b.p018i.C0264i0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0034c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f223q == null) {
            Context context = getContext();
            C0229g c0229g = new C0229g(context);
            this.f223q = c0229g;
            c0229g.f1634e = new C0035d();
            C0248c c0248c = new C0248c(context);
            this.f227u = c0248c;
            c0248c.f1788n = true;
            c0248c.f1789o = true;
            InterfaceC0235m.a c0033b = this.f228v;
            if (c0033b == null) {
                c0033b = new C0033b();
            }
            c0248c.f1571f = c0033b;
            this.f223q.m942b(c0248c, this.f224r);
            C0248c c0248c2 = this.f227u;
            c0248c2.f1574i = this;
            this.f223q = c0248c2.f1569d;
        }
        return this.f223q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0248c c0248c = this.f227u;
        C0248c.d dVar = c0248c.f1785k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (c0248c.f1787m) {
            return c0248c.f1786l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f225s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p006b.p008b.p018i.C0264i0
    /* JADX INFO: renamed from: i */
    public C0264i0.a generateLayoutParams(AttributeSet attributeSet) {
        return new C0034c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0248c c0248c = this.f227u;
        if (c0248c != null) {
            c0248c.mo125n(false);
            if (this.f227u.m1020p()) {
                this.f227u.m1018k();
                this.f227u.m1021q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0248c c0248c = this.f227u;
        if (c0248c != null) {
            c0248c.m1016b();
        }
    }

    @Override // p006b.p008b.p018i.C0264i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f230x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM1050b = C0253d1.m1050b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0034c c0034c = (C0034c) childAt.getLayoutParams();
                if (c0034c.f233c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m59s(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM1050b) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0034c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0034c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0034c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0034c).rightMargin;
                    m59s(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zM1050b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0034c c0034c2 = (C0034c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0034c2.f233c) {
                    int i15 = width2 - ((ViewGroup.MarginLayoutParams) c0034c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0034c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0034c c0034c3 = (C0034c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0034c3.f233c) {
                int i18 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0034c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0034c3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // p006b.p008b.p018i.C0264i0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int r3;
        C0229g c0229g;
        boolean z2 = this.f230x;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f230x = z3;
        if (z2 != z3) {
            this.f231y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f230x && (c0229g = this.f223q) != null && size != this.f231y) {
            this.f231y = size;
            c0229g.mo957q(true);
        }
        int childCount = getChildCount();
        if (!this.f230x || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                C0034c c0034c = (C0034c) getChildAt(i4).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0034c).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0034c).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i5 = size2 - paddingRight;
        int i6 = this.f232z;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = (i8 / i7) + i6;
        int childCount2 = getChildCount();
        int i10 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        long j = 0;
        while (i12 < childCount2) {
            View childAt = getChildAt(i12);
            int i13 = size3;
            int i14 = i5;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i15 = i10 + 1;
                if (z5) {
                    int i16 = this.f221A;
                    r3 = 0;
                    childAt.setPadding(i16, 0, i16, 0);
                } else {
                    r3 = 0;
                }
                C0034c c0034c2 = (C0034c) childAt.getLayoutParams();
                c0034c2.f238h = r3;
                c0034c2.f235e = r3;
                c0034c2.f234d = r3;
                c0034c2.f236f = r3;
                ((ViewGroup.MarginLayoutParams) c0034c2).leftMargin = r3;
                ((ViewGroup.MarginLayoutParams) c0034c2).rightMargin = r3;
                c0034c2.f237g = z5 && ((ActionMenuItemView) childAt).m17c();
                int iM53t = m53t(childAt, i9, c0034c2.f233c ? 1 : i7, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iM53t);
                if (c0034c2.f236f) {
                    i11++;
                }
                if (c0034c2.f233c) {
                    z4 = true;
                }
                i7 -= iM53t;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM53t == 1) {
                    j |= (long) (1 << i12);
                }
                i10 = i15;
            }
            i12++;
            size3 = i13;
            i5 = i14;
        }
        int i17 = i5;
        int i18 = size3;
        boolean z6 = z4 && i10 == 2;
        boolean z7 = false;
        while (true) {
            if (i11 <= 0 || i7 <= 0) {
                i3 = iMax;
                z = z7;
                break;
            }
            int i19 = Integer.MAX_VALUE;
            int i20 = 0;
            int i21 = 0;
            long j2 = 0;
            while (i20 < childCount2) {
                int i22 = iMax;
                C0034c c0034c3 = (C0034c) getChildAt(i20).getLayoutParams();
                boolean z8 = z7;
                if (c0034c3.f236f) {
                    int i23 = c0034c3.f234d;
                    if (i23 < i19) {
                        j2 = 1 << i20;
                        i19 = i23;
                        i21 = 1;
                    } else if (i23 == i19) {
                        i21++;
                        j2 |= 1 << i20;
                    }
                }
                i20++;
                z7 = z8;
                iMax = i22;
            }
            i3 = iMax;
            z = z7;
            j |= j2;
            if (i21 > i7) {
                break;
            }
            int i24 = i19 + 1;
            int i25 = 0;
            while (i25 < childCount2) {
                View childAt2 = getChildAt(i25);
                C0034c c0034c4 = (C0034c) childAt2.getLayoutParams();
                int i26 = i11;
                long j3 = 1 << i25;
                if ((j2 & j3) == 0) {
                    if (c0034c4.f234d == i24) {
                        j |= j3;
                    }
                    z6 = z6;
                } else {
                    if (z6 && c0034c4.f237g && i7 == 1) {
                        int i27 = this.f221A;
                        childAt2.setPadding(i27 + i9, 0, i27, 0);
                    }
                    c0034c4.f234d++;
                    c0034c4.f238h = true;
                    i7--;
                }
                i25++;
                i11 = i26;
                z6 = z6;
            }
            iMax = i3;
            z7 = true;
        }
        boolean z9 = !z4 && i10 == 1;
        if (i7 > 0 && j != 0 && (i7 < i10 - 1 || z9 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((C0034c) getChildAt(0).getLayoutParams()).f237g) {
                    fBitCount -= 0.5f;
                }
                int i28 = childCount2 - 1;
                if ((j & ((long) (1 << i28))) != 0 && !((C0034c) getChildAt(i28).getLayoutParams()).f237g) {
                    fBitCount -= 0.5f;
                }
            }
            int i29 = fBitCount > 0.0f ? (int) ((i7 * i9) / fBitCount) : 0;
            for (int i30 = 0; i30 < childCount2; i30++) {
                if ((j & ((long) (1 << i30))) != 0) {
                    View childAt3 = getChildAt(i30);
                    C0034c c0034c5 = (C0034c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0034c5.f235e = i29;
                        c0034c5.f238h = true;
                        if (i30 == 0 && !c0034c5.f237g) {
                            ((ViewGroup.MarginLayoutParams) c0034c5).leftMargin = (-i29) / 2;
                        }
                    } else if (c0034c5.f233c) {
                        c0034c5.f235e = i29;
                        c0034c5.f238h = true;
                        ((ViewGroup.MarginLayoutParams) c0034c5).rightMargin = (-i29) / 2;
                    } else {
                        if (i30 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0034c5).leftMargin = i29 / 2;
                        }
                        if (i30 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c0034c5).rightMargin = i29 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i31 = 0; i31 < childCount2; i31++) {
                View childAt4 = getChildAt(i31);
                C0034c c0034c6 = (C0034c) childAt4.getLayoutParams();
                if (c0034c6.f238h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0034c6.f234d * i9) + c0034c6.f235e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i3 : i18);
    }

    @Override // p006b.p008b.p018i.C0264i0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0034c generateDefaultLayoutParams() {
        C0034c c0034c = new C0034c(-2, -2);
        c0034c.f1881b = 16;
        return c0034c;
    }

    @Override // p006b.p008b.p018i.C0264i0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0034c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0034c c0034c = layoutParams instanceof C0034c ? new C0034c((C0034c) layoutParams) : new C0034c(layoutParams);
        if (c0034c.f1881b <= 0) {
            c0034c.f1881b = 16;
        }
        return c0034c;
    }

    /* JADX INFO: renamed from: s */
    public boolean m59s(int i) {
        boolean zMo15a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0032a)) {
            zMo15a = false | ((InterfaceC0032a) childAt).mo15a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0032a)) ? zMo15a : zMo15a | ((InterfaceC0032a) childAt2).mo16b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f227u.f1793s = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0036e interfaceC0036e) {
        this.f222B = interfaceC0036e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0248c c0248c = this.f227u;
        C0248c.d dVar = c0248c.f1785k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            c0248c.f1787m = true;
            c0248c.f1786l = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f226t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f225s != i) {
            this.f225s = i;
            if (i == 0) {
                this.f224r = getContext();
            } else {
                this.f224r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0248c c0248c) {
        this.f227u = c0248c;
        c0248c.f1574i = this;
        this.f223q = c0248c.f1569d;
    }
}
