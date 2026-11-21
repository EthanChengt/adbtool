package p006b.p049j.p051b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import p006b.p032h.p044j.C0418m;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.j.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C0447e {

    /* JADX INFO: renamed from: w */
    public static final Interpolator f2831w = new a();

    /* JADX INFO: renamed from: a */
    public int f2832a;

    /* JADX INFO: renamed from: b */
    public int f2833b;

    /* JADX INFO: renamed from: d */
    public float[] f2835d;

    /* JADX INFO: renamed from: e */
    public float[] f2836e;

    /* JADX INFO: renamed from: f */
    public float[] f2837f;

    /* JADX INFO: renamed from: g */
    public float[] f2838g;

    /* JADX INFO: renamed from: h */
    public int[] f2839h;

    /* JADX INFO: renamed from: i */
    public int[] f2840i;

    /* JADX INFO: renamed from: j */
    public int[] f2841j;

    /* JADX INFO: renamed from: k */
    public int f2842k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f2843l;

    /* JADX INFO: renamed from: m */
    public float f2844m;

    /* JADX INFO: renamed from: n */
    public float f2845n;

    /* JADX INFO: renamed from: o */
    public int f2846o;

    /* JADX INFO: renamed from: p */
    public int f2847p;

    /* JADX INFO: renamed from: q */
    public OverScroller f2848q;

    /* JADX INFO: renamed from: r */
    public final c f2849r;

    /* JADX INFO: renamed from: s */
    public View f2850s;

    /* JADX INFO: renamed from: t */
    public boolean f2851t;

    /* JADX INFO: renamed from: u */
    public final ViewGroup f2852u;

    /* JADX INFO: renamed from: c */
    public int f2834c = -1;

    /* JADX INFO: renamed from: v */
    public final Runnable f2853v = new b();

    /* JADX INFO: renamed from: b.j.b.e$a */
    public static class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: b.j.b.e$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0447e.this.m1668u(0);
        }
    }

    /* JADX INFO: renamed from: b.j.b.e$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract int mo249a(View view, int i, int i2);

        /* JADX INFO: renamed from: b */
        public abstract int mo250b(View view, int i, int i2);

        /* JADX INFO: renamed from: c */
        public int mo251c(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public int mo1673d(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public void mo252e(int i, int i2) {
        }

        /* JADX INFO: renamed from: f */
        public boolean mo253f(int i) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public void mo254g(int i, int i2) {
        }

        /* JADX INFO: renamed from: h */
        public void mo255h(View view, int i) {
        }

        /* JADX INFO: renamed from: i */
        public abstract void mo256i(int i);

        /* JADX INFO: renamed from: j */
        public abstract void mo257j(View view, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: k */
        public abstract void mo258k(View view, float f, float f2);

        /* JADX INFO: renamed from: l */
        public abstract boolean mo259l(View view, int i);
    }

    public C0447e(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2852u = viewGroup;
        this.f2849r = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2846o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2833b = viewConfiguration.getScaledTouchSlop();
        this.f2844m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2845n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2848q = new OverScroller(context, f2831w);
    }

    /* JADX INFO: renamed from: j */
    public static C0447e m1648j(ViewGroup viewGroup, float f, c cVar) {
        C0447e c0447e = new C0447e(viewGroup.getContext(), viewGroup, cVar);
        c0447e.f2833b = (int) ((1.0f / f) * c0447e.f2833b);
        return c0447e;
    }

    /* JADX INFO: renamed from: a */
    public void m1649a() {
        this.f2834c = -1;
        float[] fArr = this.f2835d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2836e, 0.0f);
            Arrays.fill(this.f2837f, 0.0f);
            Arrays.fill(this.f2838g, 0.0f);
            Arrays.fill(this.f2839h, 0);
            Arrays.fill(this.f2840i, 0);
            Arrays.fill(this.f2841j, 0);
            this.f2842k = 0;
        }
        VelocityTracker velocityTracker = this.f2843l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2843l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1650b(View view, int i) {
        if (view.getParent() != this.f2852u) {
            StringBuilder sbM2191e = a.m2191e("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sbM2191e.append(this.f2852u);
            sbM2191e.append(")");
            throw new IllegalArgumentException(sbM2191e.toString());
        }
        this.f2850s = view;
        this.f2834c = i;
        this.f2849r.mo255h(view, i);
        m1668u(1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1651c(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f2839h[i] & i2) != i2 || (this.f2847p & i2) == 0 || (this.f2841j[i] & i2) == i2 || (this.f2840i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f2833b;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f2849r.mo253f(i2)) {
            return (this.f2840i[i] & i2) == 0 && fAbs > ((float) this.f2833b);
        }
        int[] iArr = this.f2841j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1652d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f2849r.mo251c(view) > 0;
        boolean z2 = this.f2849r.mo1673d(view) > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f2833b;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f2833b);
        }
        return z2 && Math.abs(f2) > ((float) this.f2833b);
    }

    /* JADX INFO: renamed from: e */
    public final float m1653e(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* JADX INFO: renamed from: f */
    public final int m1654f(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final void m1655g(int i) {
        if (this.f2835d == null || !m1661n(i)) {
            return;
        }
        this.f2835d[i] = 0.0f;
        this.f2836e[i] = 0.0f;
        this.f2837f[i] = 0.0f;
        this.f2838g[i] = 0.0f;
        this.f2839h[i] = 0;
        this.f2840i[i] = 0;
        this.f2841j[i] = 0;
        this.f2842k = ((1 << i) ^ (-1)) & this.f2842k;
    }

    /* JADX INFO: renamed from: h */
    public final int m1656h(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f2852u.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: i */
    public boolean m1657i(boolean z) {
        if (this.f2832a == 2) {
            boolean zComputeScrollOffset = this.f2848q.computeScrollOffset();
            int currX = this.f2848q.getCurrX();
            int currY = this.f2848q.getCurrY();
            int left = currX - this.f2850s.getLeft();
            int top = currY - this.f2850s.getTop();
            if (left != 0) {
                C0418m.m1571n(this.f2850s, left);
            }
            if (top != 0) {
                C0418m.m1572o(this.f2850s, top);
            }
            if (left != 0 || top != 0) {
                this.f2849r.mo257j(this.f2850s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f2848q.getFinalX() && currY == this.f2848q.getFinalY()) {
                this.f2848q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f2852u.post(this.f2853v);
                } else {
                    m1668u(0);
                }
            }
        }
        return this.f2832a == 2;
    }

    /* JADX INFO: renamed from: k */
    public final void m1658k(float f, float f2) {
        this.f2851t = true;
        this.f2849r.mo258k(this.f2850s, f, f2);
        this.f2851t = false;
        if (this.f2832a == 1) {
            m1668u(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public View m1659l(int i, int i2) {
        for (int childCount = this.f2852u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f2852u;
            Objects.requireNonNull(this.f2849r);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1660m(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f2850s.getLeft();
        int top = this.f2850s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2848q.abortAnimation();
            m1668u(0);
            return false;
        }
        View view = this.f2850s;
        int iM1654f = m1654f(i3, (int) this.f2845n, (int) this.f2844m);
        int iM1654f2 = m1654f(i4, (int) this.f2845n, (int) this.f2844m);
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iM1654f);
        int iAbs4 = Math.abs(iM1654f2);
        int i7 = iAbs3 + iAbs4;
        int i8 = iAbs + iAbs2;
        if (iM1654f != 0) {
            f = iAbs3;
            f2 = i7;
        } else {
            f = iAbs;
            f2 = i8;
        }
        float f5 = f / f2;
        if (iM1654f2 != 0) {
            f3 = iAbs4;
            f4 = i7;
        } else {
            f3 = iAbs2;
            f4 = i8;
        }
        int iM1656h = m1656h(i5, iM1654f, this.f2849r.mo251c(view));
        this.f2848q.startScroll(left, top, i5, i6, (int) ((m1656h(i6, iM1654f2, this.f2849r.mo1673d(view)) * (f3 / f4)) + (iM1656h * f5)));
        m1668u(2);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1661n(int i) {
        return ((1 << i) & this.f2842k) != 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1662o(int i) {
        if (m1661n(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m1663p(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1649a();
        }
        if (this.f2843l == null) {
            this.f2843l = VelocityTracker.obtain();
        }
        this.f2843l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM1659l = m1659l((int) x, (int) y);
            m1666s(x, y, pointerId);
            m1672y(viewM1659l, pointerId);
            int i3 = this.f2839h[pointerId];
            int i4 = this.f2847p;
            if ((i3 & i4) != 0) {
                this.f2849r.mo254g(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f2832a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m1662o(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f2835d[pointerId2];
                            float f2 = y2 - this.f2836e[pointerId2];
                            m1665r(f, f2, pointerId2);
                            if (this.f2832a != 1) {
                                View viewM1659l2 = m1659l((int) x2, (int) y2);
                                if (m1652d(viewM1659l2, f, f2) && m1672y(viewM1659l2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else {
                    if (!m1662o(this.f2834c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2834c);
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f2837f;
                    int i5 = this.f2834c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f2838g[i5]);
                    int left = this.f2850s.getLeft() + i6;
                    int top = this.f2850s.getTop() + i7;
                    int left2 = this.f2850s.getLeft();
                    int top2 = this.f2850s.getTop();
                    if (i6 != 0) {
                        left = this.f2849r.mo249a(this.f2850s, left, i6);
                        C0418m.m1571n(this.f2850s, left - left2);
                    }
                    int i8 = left;
                    if (i7 != 0) {
                        top = this.f2849r.mo250b(this.f2850s, top, i7);
                        C0418m.m1572o(this.f2850s, top - top2);
                    }
                    int i9 = top;
                    if (i6 != 0 || i7 != 0) {
                        this.f2849r.mo257j(this.f2850s, i8, i9, i8 - left2, i9 - top2);
                    }
                }
                m1667t(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f2832a == 1 && pointerId3 == this.f2834c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount2) {
                                i = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i2);
                            if (pointerId4 != this.f2834c) {
                                View viewM1659l3 = m1659l((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.f2850s;
                                if (viewM1659l3 == view && m1672y(view, pointerId4)) {
                                    i = this.f2834c;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            m1664q();
                        }
                    }
                    m1655g(pointerId3);
                    return;
                }
                int pointerId5 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m1666s(x4, y4, pointerId5);
                if (this.f2832a == 0) {
                    m1672y(m1659l((int) x4, (int) y4), pointerId5);
                    int i10 = this.f2839h[pointerId5];
                    int i11 = this.f2847p;
                    if ((i10 & i11) != 0) {
                        this.f2849r.mo254g(i10 & i11, pointerId5);
                        return;
                    }
                    return;
                }
                int i12 = (int) x4;
                int i13 = (int) y4;
                View view2 = this.f2850s;
                if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m1672y(this.f2850s, pointerId5);
                    return;
                }
                return;
            }
            if (this.f2832a == 1) {
                m1658k(0.0f, 0.0f);
            }
        } else if (this.f2832a == 1) {
            m1664q();
        }
        m1649a();
    }

    /* JADX INFO: renamed from: q */
    public final void m1664q() {
        this.f2843l.computeCurrentVelocity(1000, this.f2844m);
        m1658k(m1653e(this.f2843l.getXVelocity(this.f2834c), this.f2845n, this.f2844m), m1653e(this.f2843l.getYVelocity(this.f2834c), this.f2845n, this.f2844m));
    }

    /* JADX INFO: renamed from: r */
    public final void m1665r(float f, float f2, int i) {
        int i2 = m1651c(f, f2, i, 1) ? 1 : 0;
        if (m1651c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m1651c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m1651c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f2840i;
            iArr[i] = iArr[i] | i2;
            this.f2849r.mo252e(i2, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1666s(float f, float f2, int i) {
        float[] fArr = this.f2835d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2836e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2837f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2838g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2839h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2840i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2841j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2835d = fArr2;
            this.f2836e = fArr3;
            this.f2837f = fArr4;
            this.f2838g = fArr5;
            this.f2839h = iArr;
            this.f2840i = iArr2;
            this.f2841j = iArr3;
        }
        float[] fArr9 = this.f2835d;
        this.f2837f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f2836e;
        this.f2838g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f2839h;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.f2852u.getLeft() + this.f2846o ? 1 : 0;
        if (i4 < this.f2852u.getTop() + this.f2846o) {
            i5 |= 4;
        }
        if (i3 > this.f2852u.getRight() - this.f2846o) {
            i5 |= 2;
        }
        if (i4 > this.f2852u.getBottom() - this.f2846o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f2842k |= 1 << i;
    }

    /* JADX INFO: renamed from: t */
    public final void m1667t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1662o(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2837f[pointerId] = x;
                this.f2838g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1668u(int i) {
        this.f2852u.removeCallbacks(this.f2853v);
        if (this.f2832a != i) {
            this.f2832a = i;
            this.f2849r.mo256i(i);
            if (this.f2832a == 0) {
                this.f2850s = null;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m1669v(int i, int i2) {
        if (this.f2851t) {
            return m1660m(i, i2, (int) this.f2843l.getXVelocity(this.f2834c), (int) this.f2843l.getYVelocity(this.f2834c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX INFO: renamed from: w */
    public boolean m1670w(MotionEvent motionEvent) {
        boolean z;
        View viewM1659l;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1649a();
        }
        if (this.f2843l == null) {
            this.f2843l = VelocityTracker.obtain();
        }
        this.f2843l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m1649a();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m1649a();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x = motionEvent.getX(actionIndex);
                    float y = motionEvent.getY(actionIndex);
                    m1666s(x, y, pointerId);
                    int i = this.f2832a;
                    if (i == 0) {
                        int i2 = this.f2839h[pointerId] & this.f2847p;
                        if (i2 != 0) {
                            this.f2849r.mo254g(i2, pointerId);
                        }
                    } else if (i == 2 && (viewM1659l = m1659l((int) x, (int) y)) == this.f2850s) {
                        m1672y(viewM1659l, pointerId);
                    }
                } else if (actionMasked == 6) {
                    m1655g(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f2835d != null && this.f2836e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    int pointerId2 = motionEvent.getPointerId(i3);
                    if (m1662o(pointerId2)) {
                        float x2 = motionEvent.getX(i3);
                        float y2 = motionEvent.getY(i3);
                        float f = x2 - this.f2835d[pointerId2];
                        float f2 = y2 - this.f2836e[pointerId2];
                        View viewM1659l2 = m1659l((int) x2, (int) y2);
                        boolean z2 = viewM1659l2 != null && m1652d(viewM1659l2, f, f2);
                        if (!z2) {
                            m1665r(f, f2, pointerId2);
                            if (this.f2832a != 1) {
                                break;
                            }
                        } else {
                            int left = viewM1659l2.getLeft();
                            int i4 = (int) f;
                            int iMo249a = this.f2849r.mo249a(viewM1659l2, left + i4, i4);
                            int top = viewM1659l2.getTop();
                            int i5 = (int) f2;
                            int iMo250b = this.f2849r.mo250b(viewM1659l2, top + i5, i5);
                            int iMo251c = this.f2849r.mo251c(viewM1659l2);
                            int iMo1673d = this.f2849r.mo1673d(viewM1659l2);
                            if ((iMo251c == 0 || (iMo251c > 0 && iMo249a == left)) && (iMo1673d == 0 || (iMo1673d > 0 && iMo250b == top))) {
                                break;
                            }
                            m1665r(f, f2, pointerId2);
                            if (this.f2832a != 1 || (z2 && m1672y(viewM1659l2, pointerId2))) {
                                break;
                            }
                        }
                    }
                }
                m1667t(motionEvent);
            }
            z = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            z = false;
            int pointerId3 = motionEvent.getPointerId(0);
            m1666s(x3, y3, pointerId3);
            View viewM1659l3 = m1659l((int) x3, (int) y3);
            if (viewM1659l3 == this.f2850s && this.f2832a == 2) {
                m1672y(viewM1659l3, pointerId3);
            }
            int i6 = this.f2839h[pointerId3] & this.f2847p;
            if (i6 != 0) {
                this.f2849r.mo254g(i6, pointerId3);
            }
        }
        if (this.f2832a == 1) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: x */
    public boolean m1671x(View view, int i, int i2) {
        this.f2850s = view;
        this.f2834c = -1;
        boolean zM1660m = m1660m(i, i2, 0, 0);
        if (!zM1660m && this.f2832a == 0 && this.f2850s != null) {
            this.f2850s = null;
        }
        return zM1660m;
    }

    /* JADX INFO: renamed from: y */
    public boolean m1672y(View view, int i) {
        if (view == this.f2850s && this.f2834c == i) {
            return true;
        }
        if (view == null || !this.f2849r.mo259l(view, i)) {
            return false;
        }
        this.f2834c = i;
        m1650b(view, i);
        return true;
    }
}
