package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import java.util.Objects;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p044j.C0410e;
import p006b.p032h.p044j.C0414i;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.InterfaceC0409d;
import p006b.p032h.p044j.InterfaceC0413h;
import p006b.p071v.p072a.C0567a;
import p006b.p071v.p072a.C0570d;
import p006b.p071v.p072a.C0571e;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0413h, InterfaceC0409d {

    /* JADX INFO: renamed from: K */
    public static final String f1073K = SwipeRefreshLayout.class.getSimpleName();

    /* JADX INFO: renamed from: L */
    public static final int[] f1074L = {R.attr.enabled};

    /* JADX INFO: renamed from: A */
    public Animation f1075A;

    /* JADX INFO: renamed from: B */
    public Animation f1076B;

    /* JADX INFO: renamed from: C */
    public Animation f1077C;

    /* JADX INFO: renamed from: D */
    public Animation f1078D;

    /* JADX INFO: renamed from: E */
    public boolean f1079E;

    /* JADX INFO: renamed from: F */
    public int f1080F;

    /* JADX INFO: renamed from: G */
    public InterfaceC0165g f1081G;

    /* JADX INFO: renamed from: H */
    public Animation.AnimationListener f1082H;

    /* JADX INFO: renamed from: I */
    public final Animation f1083I;

    /* JADX INFO: renamed from: J */
    public final Animation f1084J;

    /* JADX INFO: renamed from: b */
    public View f1085b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0166h f1086c;

    /* JADX INFO: renamed from: d */
    public boolean f1087d;

    /* JADX INFO: renamed from: e */
    public int f1088e;

    /* JADX INFO: renamed from: f */
    public float f1089f;

    /* JADX INFO: renamed from: g */
    public float f1090g;

    /* JADX INFO: renamed from: h */
    public final C0414i f1091h;

    /* JADX INFO: renamed from: i */
    public final C0410e f1092i;

    /* JADX INFO: renamed from: j */
    public final int[] f1093j;

    /* JADX INFO: renamed from: k */
    public final int[] f1094k;

    /* JADX INFO: renamed from: l */
    public boolean f1095l;

    /* JADX INFO: renamed from: m */
    public int f1096m;

    /* JADX INFO: renamed from: n */
    public int f1097n;

    /* JADX INFO: renamed from: o */
    public float f1098o;

    /* JADX INFO: renamed from: p */
    public float f1099p;

    /* JADX INFO: renamed from: q */
    public boolean f1100q;

    /* JADX INFO: renamed from: r */
    public int f1101r;

    /* JADX INFO: renamed from: s */
    public final DecelerateInterpolator f1102s;

    /* JADX INFO: renamed from: t */
    public C0567a f1103t;

    /* JADX INFO: renamed from: u */
    public int f1104u;

    /* JADX INFO: renamed from: v */
    public int f1105v;

    /* JADX INFO: renamed from: w */
    public int f1106w;

    /* JADX INFO: renamed from: x */
    public int f1107x;

    /* JADX INFO: renamed from: y */
    public int f1108y;

    /* JADX INFO: renamed from: z */
    public C0570d f1109z;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class AnimationAnimationListenerC0159a implements Animation.AnimationListener {
        public AnimationAnimationListenerC0159a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC0166h interfaceC0166h;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f1087d) {
                swipeRefreshLayout.m720k();
                return;
            }
            swipeRefreshLayout.f1109z.setAlpha(255);
            SwipeRefreshLayout.this.f1109z.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f1079E && (interfaceC0166h = swipeRefreshLayout2.f1086c) != null) {
                interfaceC0166h.mo726a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f1097n = swipeRefreshLayout3.f1103t.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C0160b extends Animation {
        public C0160b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C0161c extends Animation {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f1112b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f1113c;

        public C0161c(int i, int i2) {
            this.f1112b = i;
            this.f1113c = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C0570d c0570d = SwipeRefreshLayout.this.f1109z;
            int i = this.f1112b;
            c0570d.setAlpha((int) (((this.f1113c - i) * f) + i));
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class AnimationAnimationListenerC0162d implements Animation.AnimationListener {
        public AnimationAnimationListenerC0162d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout.this.m724r(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class C0163e extends Animation {
        public C0163e() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = swipeRefreshLayout.f1107x - Math.abs(swipeRefreshLayout.f1106w);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f1105v;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout2.f1103t.getTop());
            C0570d c0570d = SwipeRefreshLayout.this.f1109z;
            float f2 = 1.0f - f;
            C0570d.a aVar = c0570d.f3489b;
            if (f2 != aVar.f3510p) {
                aVar.f3510p = f2;
            }
            c0570d.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C0164f extends Animation {
        public C0164f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m718f(f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public interface InterfaceC0165g {
        /* JADX INFO: renamed from: a */
        boolean m725a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public interface InterfaceC0166h {
        /* JADX INFO: renamed from: a */
        void mo726a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1087d = false;
        this.f1089f = -1.0f;
        this.f1093j = new int[2];
        this.f1094k = new int[2];
        this.f1101r = -1;
        this.f1104u = -1;
        this.f1082H = new AnimationAnimationListenerC0159a();
        this.f1083I = new C0163e();
        this.f1084J = new C0164f();
        this.f1088e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1096m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f1102s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1080F = (int) (displayMetrics.density * 40.0f);
        this.f1103t = new C0567a(getContext(), -328966);
        C0570d c0570d = new C0570d(getContext());
        this.f1109z = c0570d;
        c0570d.m2081c(1);
        this.f1103t.setImageDrawable(this.f1109z);
        this.f1103t.setVisibility(8);
        addView(this.f1103t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f1107x = i;
        this.f1089f = i;
        this.f1091h = new C0414i();
        this.f1092i = new C0410e(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f1080F;
        this.f1097n = i2;
        this.f1106w = i2;
        m718f(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1074L);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f1103t.getBackground().setAlpha(i);
        C0570d c0570d = this.f1109z;
        c0570d.f3489b.f3514t = i;
        c0570d.invalidateSelf();
    }

    /* JADX INFO: renamed from: a */
    public boolean m713a() {
        InterfaceC0165g interfaceC0165g = this.f1081G;
        if (interfaceC0165g != null) {
            return interfaceC0165g.m725a(this, this.f1085b);
        }
        View view = this.f1085b;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: b */
    public final void m714b() {
        if (this.f1085b == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1103t)) {
                    this.f1085b = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m715c(float f) {
        if (f > this.f1089f) {
            m721l(true, true);
            return;
        }
        this.f1087d = false;
        C0570d c0570d = this.f1109z;
        C0570d.a aVar = c0570d.f3489b;
        aVar.f3499e = 0.0f;
        aVar.f3500f = 0.0f;
        c0570d.invalidateSelf();
        AnimationAnimationListenerC0162d animationAnimationListenerC0162d = new AnimationAnimationListenerC0162d();
        this.f1105v = this.f1097n;
        this.f1084J.reset();
        this.f1084J.setDuration(200L);
        this.f1084J.setInterpolator(this.f1102s);
        C0567a c0567a = this.f1103t;
        c0567a.f3477b = animationAnimationListenerC0162d;
        c0567a.clearAnimation();
        this.f1103t.startAnimation(this.f1084J);
        C0570d c0570d2 = this.f1109z;
        C0570d.a aVar2 = c0570d2.f3489b;
        if (aVar2.f3508n) {
            aVar2.f3508n = false;
        }
        c0570d2.invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m716d(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1092i.m1544a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1092i.m1545b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1092i.m1546c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1092i.m1547d(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m717e(float f) {
        C0570d c0570d = this.f1109z;
        C0570d.a aVar = c0570d.f3489b;
        if (!aVar.f3508n) {
            aVar.f3508n = true;
        }
        c0570d.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f1089f));
        double d = fMin;
        Double.isNaN(d);
        Double.isNaN(d);
        float fMax = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f1089f;
        int i = this.f1108y;
        if (i <= 0) {
            i = this.f1107x;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        double dPow = Math.pow(dMax, 2.0d);
        Double.isNaN(dMax);
        Double.isNaN(dMax);
        float f3 = ((float) (dMax - dPow)) * 2.0f;
        int i2 = this.f1106w + ((int) ((f2 * fMin) + (f2 * f3 * 2.0f)));
        if (this.f1103t.getVisibility() != 0) {
            this.f1103t.setVisibility(0);
        }
        this.f1103t.setScaleX(1.0f);
        this.f1103t.setScaleY(1.0f);
        if (f < this.f1089f) {
            if (this.f1109z.f3489b.f3514t > 76 && !m716d(this.f1077C)) {
                this.f1077C = m722p(this.f1109z.f3489b.f3514t, 76);
            }
        } else if (this.f1109z.f3489b.f3514t < 255 && !m716d(this.f1078D)) {
            this.f1078D = m722p(this.f1109z.f3489b.f3514t, 255);
        }
        C0570d c0570d2 = this.f1109z;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C0570d.a aVar2 = c0570d2.f3489b;
        aVar2.f3499e = 0.0f;
        aVar2.f3500f = fMin2;
        c0570d2.invalidateSelf();
        C0570d c0570d3 = this.f1109z;
        float fMin3 = Math.min(1.0f, fMax);
        C0570d.a aVar3 = c0570d3.f3489b;
        if (fMin3 != aVar3.f3510p) {
            aVar3.f3510p = fMin3;
        }
        c0570d3.invalidateSelf();
        C0570d c0570d4 = this.f1109z;
        c0570d4.f3489b.f3501g = ((f3 * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        c0570d4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f1097n);
    }

    /* JADX INFO: renamed from: f */
    public void m718f(float f) {
        int i = this.f1105v;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f1106w - i) * f))) - this.f1103t.getTop());
    }

    /* JADX INFO: renamed from: g */
    public final void m719g(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1101r) {
            this.f1101r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1104u;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1091h.m1554a();
    }

    public int getProgressCircleDiameter() {
        return this.f1080F;
    }

    public int getProgressViewEndOffset() {
        return this.f1107x;
    }

    public int getProgressViewStartOffset() {
        return this.f1106w;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f1092i.m1550g(0);
    }

    @Override // android.view.View, p006b.p032h.p044j.InterfaceC0409d
    public boolean isNestedScrollingEnabled() {
        return this.f1092i.f2711d;
    }

    /* JADX INFO: renamed from: k */
    public void m720k() {
        this.f1103t.clearAnimation();
        this.f1109z.stop();
        this.f1103t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f1106w - this.f1097n);
        this.f1097n = this.f1103t.getTop();
    }

    /* JADX INFO: renamed from: l */
    public final void m721l(boolean z, boolean z2) {
        if (this.f1087d != z) {
            this.f1079E = z2;
            m714b();
            this.f1087d = z;
            if (!z) {
                m724r(this.f1082H);
                return;
            }
            int i = this.f1097n;
            Animation.AnimationListener animationListener = this.f1082H;
            this.f1105v = i;
            this.f1083I.reset();
            this.f1083I.setDuration(200L);
            this.f1083I.setInterpolator(this.f1102s);
            if (animationListener != null) {
                this.f1103t.f3477b = animationListener;
            }
            this.f1103t.clearAnimation();
            this.f1103t.startAnimation(this.f1083I);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m720k();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m714b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m713a() || this.f1087d || this.f1095l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f1106w - this.f1103t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f1101r = pointerId;
            this.f1100q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f1099p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f1100q = false;
            this.f1101r = -1;
        } else if (actionMasked == 2) {
            int i = this.f1101r;
            if (i == -1) {
                Log.e(f1073K, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            m723q(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f1100q = false;
            this.f1101r = -1;
        } else if (actionMasked == 6) {
            m719g(motionEvent);
        }
        return this.f1100q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f1085b == null) {
            m714b();
        }
        View view = this.f1085b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f1103t.getMeasuredWidth();
        int measuredHeight2 = this.f1103t.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f1097n;
        this.f1103t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1085b == null) {
            m714b();
        }
        View view = this.f1085b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f1103t.measure(View.MeasureSpec.makeMeasureSpec(this.f1080F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1080F, 1073741824));
        this.f1104u = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f1103t) {
                this.f1104u = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1090g;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f1090g = 0.0f;
                } else {
                    this.f1090g = f - f2;
                    iArr[1] = i2;
                }
                m717e(this.f1090g);
            }
        }
        int[] iArr2 = this.f1093j;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1094k);
        int i5 = i4 + this.f1094k[1];
        if (i5 >= 0 || m713a()) {
            return;
        }
        float fAbs = this.f1090g + Math.abs(i5);
        this.f1090g = fAbs;
        m717e(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1091h.f2713a = i;
        startNestedScroll(i & 2);
        this.f1090g = 0.0f;
        this.f1095l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f1087d || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p006b.p032h.p044j.InterfaceC0413h
    public void onStopNestedScroll(View view) {
        this.f1091h.m1555b(0);
        this.f1095l = false;
        float f = this.f1090g;
        if (f > 0.0f) {
            m715c(f);
            this.f1090g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        String str = f1073K;
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m713a() || this.f1087d || this.f1095l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f1101r = motionEvent.getPointerId(0);
            this.f1100q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1101r);
                if (iFindPointerIndex < 0) {
                    Log.e(str, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f1100q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f1098o) * 0.5f;
                    this.f1100q = false;
                    m715c(y);
                }
                this.f1101r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f1101r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(str, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                m723q(y2);
                if (this.f1100q) {
                    float f = (y2 - this.f1098o) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    m717e(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(str, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f1101r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m719g(motionEvent);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final Animation m722p(int i, int i2) {
        C0161c c0161c = new C0161c(i, i2);
        c0161c.setDuration(300L);
        C0567a c0567a = this.f1103t;
        c0567a.f3477b = null;
        c0567a.clearAnimation();
        this.f1103t.startAnimation(c0161c);
        return c0161c;
    }

    /* JADX INFO: renamed from: q */
    public final void m723q(float f) {
        float f2 = this.f1099p;
        float f3 = f - f2;
        int i = this.f1088e;
        if (f3 <= i || this.f1100q) {
            return;
        }
        this.f1098o = f2 + i;
        this.f1100q = true;
        this.f1109z.setAlpha(76);
    }

    /* JADX INFO: renamed from: r */
    public void m724r(Animation.AnimationListener animationListener) {
        C0160b c0160b = new C0160b();
        this.f1076B = c0160b;
        c0160b.setDuration(150L);
        C0567a c0567a = this.f1103t;
        c0567a.f3477b = animationListener;
        c0567a.clearAnimation();
        this.f1103t.startAnimation(this.f1076B);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f1085b instanceof AbsListView)) {
            View view = this.f1085b;
            if (view == null || C0418m.m1569l(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public void setAnimationProgress(float f) {
        this.f1103t.setScaleX(f);
        this.f1103t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m714b();
        C0570d c0570d = this.f1109z;
        C0570d.a aVar = c0570d.f3489b;
        aVar.f3503i = iArr;
        aVar.m2083a(0);
        c0570d.f3489b.m2083a(0);
        c0570d.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0362a.m1468b(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1089f = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m720k();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1092i.m1551h(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC0165g interfaceC0165g) {
        this.f1081G = interfaceC0165g;
    }

    public void setOnRefreshListener(InterfaceC0166h interfaceC0166h) {
        this.f1086c = interfaceC0166h;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1103t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0362a.m1468b(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1087d == z) {
            m721l(z, false);
            return;
        }
        this.f1087d = z;
        setTargetOffsetTopAndBottom((this.f1107x + this.f1106w) - this.f1097n);
        this.f1079E = false;
        Animation.AnimationListener animationListener = this.f1082H;
        this.f1103t.setVisibility(0);
        this.f1109z.setAlpha(255);
        C0571e c0571e = new C0571e(this);
        this.f1075A = c0571e;
        c0571e.setDuration(this.f1096m);
        if (animationListener != null) {
            this.f1103t.f3477b = animationListener;
        }
        this.f1103t.clearAnimation();
        this.f1103t.startAnimation(this.f1075A);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f1080F = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f1103t.setImageDrawable(null);
            this.f1109z.m2081c(i);
            this.f1103t.setImageDrawable(this.f1109z);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f1108y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f1103t.bringToFront();
        C0418m.m1572o(this.f1103t, i);
        this.f1097n = this.f1103t.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f1092i.m1552i(i, 0);
    }

    @Override // android.view.View, p006b.p032h.p044j.InterfaceC0409d
    public void stopNestedScroll() {
        this.f1092i.m1553j(0);
    }
}
