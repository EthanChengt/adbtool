package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p006b.p008b.p009c.C0186b;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0410e;
import p006b.p032h.p044j.C0414i;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.InterfaceC0409d;
import p006b.p032h.p044j.InterfaceC0412g;
import p006b.p032h.p044j.p045w.C0429b;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0412g, InterfaceC0409d {

    /* JADX INFO: renamed from: B */
    public static final C0078a f583B = new C0078a();

    /* JADX INFO: renamed from: C */
    public static final int[] f584C = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public InterfaceC0079b f585A;

    /* JADX INFO: renamed from: b */
    public long f586b;

    /* JADX INFO: renamed from: c */
    public final Rect f587c;

    /* JADX INFO: renamed from: d */
    public OverScroller f588d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f589e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f590f;

    /* JADX INFO: renamed from: g */
    public int f591g;

    /* JADX INFO: renamed from: h */
    public boolean f592h;

    /* JADX INFO: renamed from: i */
    public boolean f593i;

    /* JADX INFO: renamed from: j */
    public View f594j;

    /* JADX INFO: renamed from: k */
    public boolean f595k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f596l;

    /* JADX INFO: renamed from: m */
    public boolean f597m;

    /* JADX INFO: renamed from: n */
    public boolean f598n;

    /* JADX INFO: renamed from: o */
    public int f599o;

    /* JADX INFO: renamed from: p */
    public int f600p;

    /* JADX INFO: renamed from: q */
    public int f601q;

    /* JADX INFO: renamed from: r */
    public int f602r;

    /* JADX INFO: renamed from: s */
    public final int[] f603s;

    /* JADX INFO: renamed from: t */
    public final int[] f604t;

    /* JADX INFO: renamed from: u */
    public int f605u;

    /* JADX INFO: renamed from: v */
    public int f606v;

    /* JADX INFO: renamed from: w */
    public C0080c f607w;

    /* JADX INFO: renamed from: x */
    public final C0414i f608x;

    /* JADX INFO: renamed from: y */
    public final C0410e f609y;

    /* JADX INFO: renamed from: z */
    public float f610z;

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0078a extends C0406a {
        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: c */
        public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
            this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            int scrollRange;
            this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0429b.f2743a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0429b.f2743a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0429b.f2743a.addAction(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0429b.f2743a.addAction(4096);
            }
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: g */
        public boolean mo224g(View view, int i, Bundle bundle) {
            int iMin;
            if (super.mo224g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
            } else {
                if (i != 8192) {
                    return false;
                }
                iMin = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
            }
            nestedScrollView.m201B(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    public interface InterfaceC0079b {
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0080c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0080c> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public int f611b;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c$a */
        public static class a implements Parcelable.Creator<C0080c> {
            @Override // android.os.Parcelable.Creator
            public C0080c createFromParcel(Parcel parcel) {
                return new C0080c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0080c[] newArray(int i) {
                return new C0080c[i];
            }
        }

        public C0080c(Parcel parcel) {
            super(parcel);
            this.f611b = parcel.readInt();
        }

        public C0080c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("HorizontalScrollView.SavedState{");
            sbM2191e.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2191e.append(" scrollPosition=");
            sbM2191e.append(this.f611b);
            sbM2191e.append("}");
            return sbM2191e.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f611b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f587c = new Rect();
        this.f592h = true;
        this.f593i = false;
        this.f594j = null;
        this.f595k = false;
        this.f598n = true;
        this.f602r = -1;
        this.f603s = new int[2];
        this.f604t = new int[2];
        this.f588d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f599o = viewConfiguration.getScaledTouchSlop();
        this.f600p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f601q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f584C, 0, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f608x = new C0414i();
        this.f609y = new C0410e(this);
        setNestedScrollingEnabled(true);
        C0418m.m1577t(this, f583B);
    }

    /* JADX INFO: renamed from: c */
    public static int m198c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f610z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f610z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f610z;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m199s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m199s((View) parent, view2);
    }

    /* JADX INFO: renamed from: A */
    public final void m200A(View view) {
        view.getDrawingRect(this.f587c);
        offsetDescendantRectToMyCoords(view, this.f587c);
        int iM206d = m206d(this.f587c);
        if (iM206d != 0) {
            scrollBy(0, iM206d);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m201B(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f586b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f588d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
            m220y(false);
        } else {
            if (!this.f588d.isFinished()) {
                m204a();
            }
            scrollBy(i, i2);
        }
        this.f586b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: C */
    public boolean m202C(int i, int i2) {
        return this.f609y.m1552i(i, i2);
    }

    /* JADX INFO: renamed from: D */
    public void m203D(int i) {
        this.f609y.m1553j(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m204a() {
        this.f588d.abortAnimation();
        this.f609y.m1553j(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public boolean m205b(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m215t(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m208f(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f587c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f587c);
            m208f(m206d(this.f587c));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m215t(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f588d.isFinished()) {
            return;
        }
        this.f588d.computeScrollOffset();
        int currY = this.f588d.getCurrY();
        int i = currY - this.f606v;
        this.f606v = currY;
        int[] iArr = this.f604t;
        boolean z = true;
        iArr[1] = 0;
        m207e(0, i, iArr, null, 1);
        int i2 = i - this.f604t[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m218w(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f604t;
            iArr2[1] = 0;
            this.f609y.m1548e(0, scrollY2, 0, i3, this.f603s, 1, iArr2);
            i2 = i3 - this.f604t[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode != 0 && (overScrollMode != 1 || scrollRange <= 0)) {
                z = false;
            }
            if (z) {
                m210k();
                if (i2 < 0) {
                    if (this.f589e.isFinished()) {
                        edgeEffect = this.f589e;
                        edgeEffect.onAbsorb((int) this.f588d.getCurrVelocity());
                    }
                } else if (this.f590f.isFinished()) {
                    edgeEffect = this.f590f;
                    edgeEffect.onAbsorb((int) this.f588d.getCurrVelocity());
                }
            }
            m204a();
        }
        if (this.f588d.isFinished()) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* JADX INFO: renamed from: d */
    public int m206d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m211l(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f609y.m1544a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f609y.m1545b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m207e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f609y.m1547d(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        int i = Build.VERSION.SDK_INT;
        super.draw(canvas);
        if (this.f589e != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f589e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (i < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f589e.setSize(width, height);
                if (this.f589e.draw(canvas)) {
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f590f.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (i < 21 || getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (i >= 21 && getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f590f.setSize(width2, height2);
            if (this.f590f.draw(canvas)) {
                WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m207e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f609y.m1546c(i, i2, iArr, iArr2, i3);
    }

    /* JADX INFO: renamed from: f */
    public final void m208f(int i) {
        if (i != 0) {
            if (this.f598n) {
                m201B(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m209g() {
        this.f595k = false;
        m219x();
        this.f609y.m1553j(0);
        EdgeEffect edgeEffect = this.f589e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f590f.onRelease();
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f608x.m1554a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: h */
    public void mo40h(View view, View view2, int i, int i2) {
        C0414i c0414i = this.f608x;
        if (i2 == 1) {
            c0414i.f2714b = i;
        } else {
            c0414i.f2713a = i;
        }
        m202C(2, i2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m214r(0);
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: i */
    public void mo41i(View view, int i) {
        C0414i c0414i = this.f608x;
        if (i == 1) {
            c0414i.f2714b = 0;
        } else {
            c0414i.f2713a = 0;
        }
        m203D(i);
    }

    @Override // android.view.View, p006b.p032h.p044j.InterfaceC0409d
    public boolean isNestedScrollingEnabled() {
        return this.f609y.f2711d;
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: j */
    public void mo42j(View view, int i, int i2, int[] iArr, int i3) {
        m207e(i, i2, iArr, null, i3);
    }

    /* JADX INFO: renamed from: k */
    public final void m210k() {
        if (getOverScrollMode() == 2) {
            this.f589e = null;
            this.f590f = null;
        } else if (this.f589e == null) {
            Context context = getContext();
            this.f589e = new EdgeEffect(context);
            this.f590f = new EdgeEffect(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX INFO: renamed from: l */
    public boolean m211l(KeyEvent keyEvent) {
        boolean z;
        Rect rect;
        int i;
        this.f587c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m205b(33) : m213q(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m205b(130) : m213q(130);
        }
        if (keyCode != 62) {
            return false;
        }
        int i2 = keyEvent.isShiftPressed() ? 33 : 130;
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f587c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt2 = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                rect = this.f587c;
                if (rect.top + height > paddingBottom) {
                    i = paddingBottom - height;
                    rect.top = i;
                }
            }
        } else {
            this.f587c.top = getScrollY() - height;
            rect = this.f587c;
            if (rect.top < 0) {
                i = 0;
                rect.top = i;
            }
        }
        Rect rect2 = this.f587c;
        int i3 = rect2.top;
        int i4 = height + i3;
        rect2.bottom = i4;
        m221z(i2, i3, i4);
        return false;
    }

    @Override // p006b.p032h.p044j.InterfaceC0412g
    /* JADX INFO: renamed from: m */
    public void mo45m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m216u(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: n */
    public void mo46n(View view, int i, int i2, int i3, int i4, int i5) {
        m216u(i4, i5, null);
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: o */
    public boolean mo47o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f593i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f595k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 2 && this.f595k) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                this.f591g = y;
                this.f602r = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker = this.f596l;
                if (velocityTracker == null) {
                    this.f596l = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f596l.addMovement(motionEvent);
                this.f588d.computeScrollOffset();
                this.f595k = !this.f588d.isFinished();
                m202C(2, 0);
            } else {
                this.f595k = false;
                m219x();
            }
        } else if (i == 1) {
            this.f595k = false;
            this.f602r = -1;
            m219x();
            if (this.f588d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                postInvalidateOnAnimation();
            }
            this.f609y.m1553j(0);
        } else if (i == 2) {
            int i2 = this.f602r;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f591g) > this.f599o && (2 & getNestedScrollAxes()) == 0) {
                        this.f595k = true;
                        this.f591g = y2;
                        if (this.f596l == null) {
                            this.f596l = VelocityTracker.obtain();
                        }
                        this.f596l.addMovement(motionEvent);
                        this.f605u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f595k = false;
            this.f602r = -1;
            m219x();
            if (this.f588d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                postInvalidateOnAnimation();
            }
            this.f609y.m1553j(0);
        } else if (i == 6) {
            m217v(motionEvent);
        }
        return this.f595k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f592h = false;
        View view = this.f594j;
        if (view != null && m199s(view, this)) {
            m200A(this.f594j);
        }
        this.f594j = null;
        if (!this.f593i) {
            if (this.f607w != null) {
                scrollTo(getScrollX(), this.f607w.f611b);
                this.f607w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM198c = m198c(scrollY, paddingTop, measuredHeight);
            if (iM198c != scrollY) {
                scrollTo(getScrollX(), iM198c);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f593i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f597m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m212p((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m207e(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m216u(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f608x.f2713a = i;
        m202C(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ m215t(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0080c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0080c c0080c = (C0080c) parcelable;
        super.onRestoreInstanceState(c0080c.getSuperState());
        this.f607w = c0080c;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0080c c0080c = new C0080c(super.onSaveInstanceState());
        c0080c.f611b = getScrollY();
        return c0080c;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0079b interfaceC0079b = this.f585A;
        if (interfaceC0079b != null) {
            C0186b c0186b = (C0186b) interfaceC0079b;
            AlertController.m11c(this, c0186b.f1227a, c0186b.f1228b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m215t(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f587c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f587c);
        m208f(m206d(this.f587c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onStopNestedScroll(View view) {
        this.f608x.f2713a = 0;
        m203D(0);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x020b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        EdgeEffect edgeEffect;
        if (this.f596l == null) {
            this.f596l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f605u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f605u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f596l;
                velocityTracker.computeCurrentVelocity(1000, this.f601q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f602r);
                if (Math.abs(yVelocity) > this.f600p) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        m212p(i);
                    }
                } else if (this.f588d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    postInvalidateOnAnimation();
                }
                this.f602r = -1;
                m209g();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f602r);
                if (iFindPointerIndex == -1) {
                    StringBuilder sbM2191e = a.m2191e("Invalid pointerId=");
                    sbM2191e.append(this.f602r);
                    sbM2191e.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sbM2191e.toString());
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f591g - y;
                    if (m207e(0, i2, this.f604t, this.f603s, 0)) {
                        i2 -= this.f604t[1];
                        this.f605u += this.f603s[1];
                    }
                    if (!this.f595k && Math.abs(i2) > this.f599o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f595k = true;
                        int i3 = this.f599o;
                        i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                    }
                    int i4 = i2;
                    if (this.f595k) {
                        this.f591g = y - this.f603s[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (m218w(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0) && !m214r(0)) {
                            this.f596l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f604t;
                        iArr[1] = 0;
                        this.f609y.m1548e(0, scrollY2, 0, i4 - scrollY2, this.f603s, 0, iArr);
                        int i5 = this.f591g;
                        int[] iArr2 = this.f603s;
                        this.f591g = i5 - iArr2[1];
                        this.f605u += iArr2[1];
                        if (z) {
                            int i6 = i4 - this.f604t[1];
                            m210k();
                            int i7 = scrollY + i6;
                            if (i7 < 0) {
                                C0360f.m1418J(this.f589e, i6 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f590f.isFinished()) {
                                    edgeEffect = this.f590f;
                                    edgeEffect.onRelease();
                                }
                            } else if (i7 > scrollRange) {
                                C0360f.m1418J(this.f590f, i6 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f589e.isFinished()) {
                                    edgeEffect = this.f589e;
                                    edgeEffect.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect2 = this.f589e;
                            if (edgeEffect2 != null && (!edgeEffect2.isFinished() || !this.f590f.isFinished())) {
                                WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                                postInvalidateOnAnimation();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f595k && getChildCount() > 0 && this.f588d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, String> weakHashMap3 = C0418m.f2718a;
                    postInvalidateOnAnimation();
                }
                this.f602r = -1;
                m209g();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f591g = (int) motionEvent.getY(actionIndex);
                this.f602r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m217v(motionEvent);
                this.f591g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f602r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.f588d.isFinished();
            this.f595k = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f588d.isFinished()) {
                m204a();
            }
            this.f591g = (int) motionEvent.getY();
            this.f602r = motionEvent.getPointerId(0);
            m202C(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f596l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m212p(int i) {
        if (getChildCount() > 0) {
            this.f588d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            m220y(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m213q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f587c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f587c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f587c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f587c;
        return m221z(i, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: r */
    public boolean m214r(int i) {
        return this.f609y.m1549f(i) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f592h) {
            this.f594j = view2;
        } else {
            m200A(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM206d = m206d(rect);
        boolean z2 = iM206d != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM206d);
            } else {
                m201B(0, iM206d);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m219x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f592h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM198c = m198c(i, width, width2);
            int iM198c2 = m198c(i2, height, height2);
            if (iM198c == getScrollX() && iM198c2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM198c, iM198c2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f597m) {
            this.f597m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f609y.m1551h(z);
    }

    public void setOnScrollChangeListener(InterfaceC0079b interfaceC0079b) {
        this.f585A = interfaceC0079b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f598n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f609y.m1552i(i, 0);
    }

    @Override // android.view.View, p006b.p032h.p044j.InterfaceC0409d
    public void stopNestedScroll() {
        this.f609y.m1553j(0);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m215t(View view, int i, int i2) {
        view.getDrawingRect(this.f587c);
        offsetDescendantRectToMyCoords(view, this.f587c);
        return this.f587c.bottom + i >= getScrollY() && this.f587c.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: u */
    public final void m216u(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f609y.m1548e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: v */
    public final void m217v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f602r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f591g = (int) motionEvent.getY(i);
            this.f602r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f596l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    /* JADX WARN: Code duplicated, block: B:40:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x005c  */
    /* JADX WARN: Code duplicated, block: B:42:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: w */
    public boolean m218w(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 <= i14) {
            if (i9 < i13) {
                i9 = i13;
            } else {
                z = false;
            }
            if (i11 > i16) {
                if (i11 < i15) {
                    i11 = i15;
                } else {
                    z2 = false;
                }
                if (z2 && !m214r(1)) {
                    this.f588d.springBack(i9, i11, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i9, i11, z, z2);
                return !z || z2;
            }
            i11 = i16;
            z2 = true;
            if (z2) {
                this.f588d.springBack(i9, i11, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i9, i11, z, z2);
            if (z) {
            }
        }
        i9 = i14;
        z = true;
        if (i11 > i16) {
            if (i11 < i15) {
                i11 = i15;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f588d.springBack(i9, i11, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i9, i11, z, z2);
            if (z) {
            }
        }
        i11 = i16;
        z2 = true;
        if (z2) {
            this.f588d.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m219x() {
        VelocityTracker velocityTracker = this.f596l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f596l = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m220y(boolean z) {
        if (z) {
            m202C(2, 1);
        } else {
            this.f609y.m1553j(1);
        }
        this.f606v = getScrollY();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: z */
    public final boolean m221z(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m208f(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }
}
