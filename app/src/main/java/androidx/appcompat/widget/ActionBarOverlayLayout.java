package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p009c.C0207w;
import p006b.p008b.p016h.C0221g;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p018i.C0253d1;
import p006b.p008b.p018i.InterfaceC0249c0;
import p006b.p008b.p018i.InterfaceC0252d0;
import p006b.p032h.p044j.C0414i;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.InterfaceC0411f;
import p006b.p032h.p044j.InterfaceC0412g;
import p006b.p032h.p044j.InterfaceC0413h;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0249c0, InterfaceC0413h, InterfaceC0411f, InterfaceC0412g {

    /* JADX INFO: renamed from: C */
    public static final int[] f190C = {R.attr.d, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    public final Runnable f191A;

    /* JADX INFO: renamed from: B */
    public final C0414i f192B;

    /* JADX INFO: renamed from: b */
    public int f193b;

    /* JADX INFO: renamed from: c */
    public int f194c;

    /* JADX INFO: renamed from: d */
    public ContentFrameLayout f195d;

    /* JADX INFO: renamed from: e */
    public ActionBarContainer f196e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0252d0 f197f;

    /* JADX INFO: renamed from: g */
    public Drawable f198g;

    /* JADX INFO: renamed from: h */
    public boolean f199h;

    /* JADX INFO: renamed from: i */
    public boolean f200i;

    /* JADX INFO: renamed from: j */
    public boolean f201j;

    /* JADX INFO: renamed from: k */
    public boolean f202k;

    /* JADX INFO: renamed from: l */
    public boolean f203l;

    /* JADX INFO: renamed from: m */
    public int f204m;

    /* JADX INFO: renamed from: n */
    public int f205n;

    /* JADX INFO: renamed from: o */
    public final Rect f206o;

    /* JADX INFO: renamed from: p */
    public final Rect f207p;

    /* JADX INFO: renamed from: q */
    public final Rect f208q;

    /* JADX INFO: renamed from: r */
    public final Rect f209r;

    /* JADX INFO: renamed from: s */
    public final Rect f210s;

    /* JADX INFO: renamed from: t */
    public final Rect f211t;

    /* JADX INFO: renamed from: u */
    public final Rect f212u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0030d f213v;

    /* JADX INFO: renamed from: w */
    public OverScroller f214w;

    /* JADX INFO: renamed from: x */
    public ViewPropertyAnimator f215x;

    /* JADX INFO: renamed from: y */
    public final AnimatorListenerAdapter f216y;

    /* JADX INFO: renamed from: z */
    public final Runnable f217z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0027a extends AnimatorListenerAdapter {
        public C0027a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f215x = null;
            actionBarOverlayLayout.f203l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f215x = null;
            actionBarOverlayLayout.f203l = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0028b implements Runnable {
        public RunnableC0028b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m49q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f215x = actionBarOverlayLayout.f196e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f216y);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0029c implements Runnable {
        public RunnableC0029c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m49q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f215x = actionBarOverlayLayout.f196e.animate().translationY(-ActionBarOverlayLayout.this.f196e.getHeight()).setListener(ActionBarOverlayLayout.this.f216y);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0030d {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0031e extends ViewGroup.MarginLayoutParams {
        public C0031e(int i, int i2) {
            super(i, i2);
        }

        public C0031e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0031e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f194c = 0;
        this.f206o = new Rect();
        this.f207p = new Rect();
        this.f208q = new Rect();
        this.f209r = new Rect();
        this.f210s = new Rect();
        this.f211t = new Rect();
        this.f212u = new Rect();
        this.f216y = new C0027a();
        this.f217z = new RunnableC0028b();
        this.f191A = new RunnableC0029c();
        m50r(context);
        this.f192B = new C0414i();
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: a */
    public void mo33a(Menu menu, InterfaceC0235m.a aVar) {
        m51s();
        this.f197f.mo1025a(menu, aVar);
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: b */
    public boolean mo34b() {
        m51s();
        return this.f197f.mo1026b();
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: c */
    public boolean mo35c() {
        m51s();
        return this.f197f.mo1027c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0031e;
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: d */
    public boolean mo36d() {
        m51s();
        return this.f197f.mo1028d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f198g == null || this.f199h) {
            return;
        }
        if (this.f196e.getVisibility() == 0) {
            translationY = (int) (this.f196e.getTranslationY() + this.f196e.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f198g.setBounds(0, translationY, getWidth(), this.f198g.getIntrinsicHeight() + translationY);
        this.f198g.draw(canvas);
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: e */
    public boolean mo37e() {
        m51s();
        return this.f197f.mo1029e();
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: f */
    public void mo38f() {
        m51s();
        this.f197f.mo1030f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        m51s();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int windowSystemUiVisibility = getWindowSystemUiVisibility() & 256;
        boolean zM48p = m48p(this.f196e, rect, true, true, false, true);
        this.f209r.set(rect);
        C0253d1.m1049a(this, this.f209r, this.f206o);
        if (!this.f210s.equals(this.f209r)) {
            this.f210s.set(this.f209r);
            zM48p = true;
        }
        if (!this.f207p.equals(this.f206o)) {
            this.f207p.set(this.f206o);
            zM48p = true;
        }
        if (zM48p) {
            requestLayout();
        }
        return true;
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: g */
    public boolean mo39g() {
        m51s();
        return this.f197f.mo1031g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0031e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0031e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0031e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f196e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f192B.m1554a();
    }

    public CharSequence getTitle() {
        m51s();
        return this.f197f.getTitle();
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: h */
    public void mo40h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: i */
    public void mo41i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: j */
    public void mo42j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: k */
    public void mo43k(int i) {
        m51s();
        if (i == 2) {
            this.f197f.mo1044t();
        } else if (i == 5) {
            this.f197f.mo1046v();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    /* JADX INFO: renamed from: l */
    public void mo44l() {
        m51s();
        this.f197f.mo1032h();
    }

    @Override // p006b.p032h.p044j.InterfaceC0412g
    /* JADX INFO: renamed from: m */
    public void mo45m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: n */
    public void mo46n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0411f
    /* JADX INFO: renamed from: o */
    public boolean mo47o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m50r(getContext());
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (Build.VERSION.SDK_INT >= 20) {
            requestApplyInsets();
        } else {
            requestFitSystemWindows();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m49q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0031e c0031e = (C0031e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0031e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0031e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        m51s();
        measureChildWithMargins(this.f196e, i, 0, i2, 0);
        C0031e c0031e = (C0031e) this.f196e.getLayoutParams();
        int iMax = Math.max(0, this.f196e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0031e).leftMargin + ((ViewGroup.MarginLayoutParams) c0031e).rightMargin);
        int iMax2 = Math.max(0, this.f196e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0031e).topMargin + ((ViewGroup.MarginLayoutParams) c0031e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f196e.getMeasuredState());
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f193b;
            if (this.f201j && this.f196e.getTabContainer() != null) {
                measuredHeight += this.f193b;
            }
        } else {
            measuredHeight = this.f196e.getVisibility() != 8 ? this.f196e.getMeasuredHeight() : 0;
        }
        this.f208q.set(this.f206o);
        this.f211t.set(this.f209r);
        Rect rect = (this.f200i || z) ? this.f211t : this.f208q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        m48p(this.f195d, this.f208q, true, true, true, true);
        if (!this.f212u.equals(this.f211t)) {
            this.f212u.set(this.f211t);
            this.f195d.m67a(this.f211t);
        }
        measureChildWithMargins(this.f195d, i, 0, i2, 0);
        C0031e c0031e2 = (C0031e) this.f195d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f195d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0031e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0031e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f195d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0031e2).topMargin + ((ViewGroup.MarginLayoutParams) c0031e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f195d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f202k || !z) {
            return false;
        }
        if (m52t(f2)) {
            m49q();
            this.f191A.run();
        } else {
            m49q();
            this.f217z.run();
        }
        this.f203l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f204m + i2;
        this.f204m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C0207w c0207w;
        C0221g c0221g;
        this.f192B.f2713a = i;
        this.f204m = getActionBarHideOffset();
        m49q();
        InterfaceC0030d interfaceC0030d = this.f213v;
        if (interfaceC0030d == null || (c0221g = (c0207w = (C0207w) interfaceC0030d).f1391t) == null) {
            return;
        }
        c0221g.m913a();
        c0207w.f1391t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f196e.getVisibility() != 0) {
            return false;
        }
        return this.f202k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onStopNestedScroll(View view) {
        if (this.f202k && !this.f203l) {
            if (this.f204m <= this.f196e.getHeight()) {
                m49q();
                postDelayed(this.f217z, 600L);
            } else {
                m49q();
                postDelayed(this.f191A, 600L);
            }
        }
        InterfaceC0030d interfaceC0030d = this.f213v;
        if (interfaceC0030d != null) {
            Objects.requireNonNull((C0207w) interfaceC0030d);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i);
        m51s();
        int i3 = this.f205n ^ i;
        this.f205n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0030d interfaceC0030d = this.f213v;
        if (interfaceC0030d != null) {
            ((C0207w) interfaceC0030d).f1387p = !z2;
            if (z || !z2) {
                C0207w c0207w = (C0207w) interfaceC0030d;
                if (c0207w.f1388q) {
                    c0207w.f1388q = false;
                    c0207w.m868x(true);
                }
            } else {
                C0207w c0207w2 = (C0207w) interfaceC0030d;
                if (!c0207w2.f1388q) {
                    c0207w2.f1388q = true;
                    c0207w2.m868x(true);
                }
            }
        }
        if ((i3 & 256) == 0 || this.f213v == null) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (i2 >= 20) {
            requestApplyInsets();
        } else {
            requestFitSystemWindows();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f194c = i;
        InterfaceC0030d interfaceC0030d = this.f213v;
        if (interfaceC0030d != null) {
            ((C0207w) interfaceC0030d).f1386o = i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final boolean m48p(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0031e c0031e = (C0031e) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) c0031e).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) c0031e).leftMargin = i2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z2) {
            int i3 = ((ViewGroup.MarginLayoutParams) c0031e).topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                ((ViewGroup.MarginLayoutParams) c0031e).topMargin = i4;
                z5 = true;
            }
        }
        if (z4) {
            int i5 = ((ViewGroup.MarginLayoutParams) c0031e).rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) c0031e).rightMargin = i6;
                z5 = true;
            }
        }
        if (z3) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0031e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0031e).bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: q */
    public void m49q() {
        removeCallbacks(this.f217z);
        removeCallbacks(this.f191A);
        ViewPropertyAnimator viewPropertyAnimator = this.f215x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m50r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f190C);
        this.f193b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f198g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f199h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f214w = new OverScroller(context);
    }

    /* JADX INFO: renamed from: s */
    public void m51s() {
        InterfaceC0252d0 wrapper;
        if (this.f195d == null) {
            this.f195d = (ContentFrameLayout) findViewById(R.id.aq);
            this.f196e = (ActionBarContainer) findViewById(R.id.ar);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.ap);
            if (callbackFindViewById instanceof InterfaceC0252d0) {
                wrapper = (InterfaceC0252d0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    StringBuilder sbM2191e = a.m2191e("Can't make a decor toolbar out of ");
                    sbM2191e.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(sbM2191e.toString());
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f197f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        m49q();
        this.f196e.setTranslationY(-Math.max(0, Math.min(i, this.f196e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0030d interfaceC0030d) {
        this.f213v = interfaceC0030d;
        if (getWindowToken() != null) {
            ((C0207w) this.f213v).f1386o = this.f194c;
            int i = this.f205n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (Build.VERSION.SDK_INT >= 20) {
                    requestApplyInsets();
                } else {
                    requestFitSystemWindows();
                }
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f201j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f202k) {
            this.f202k = z;
            if (z) {
                return;
            }
            m49q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m51s();
        this.f197f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m51s();
        this.f197f.setIcon(drawable);
    }

    public void setLogo(int i) {
        m51s();
        this.f197f.mo1037m(i);
    }

    public void setOverlayMode(boolean z) {
        this.f200i = z;
        this.f199h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    public void setWindowCallback(Window.Callback callback) {
        m51s();
        this.f197f.setWindowCallback(callback);
    }

    @Override // p006b.p008b.p018i.InterfaceC0249c0
    public void setWindowTitle(CharSequence charSequence) {
        m51s();
        this.f197f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m52t(float f) {
        this.f214w.fling(0, 0, 0, (int) f, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.f214w.getFinalY() > this.f196e.getHeight();
    }
}
