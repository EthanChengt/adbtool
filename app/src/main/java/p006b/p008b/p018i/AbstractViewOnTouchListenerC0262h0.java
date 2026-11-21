package p006b.p008b.p018i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p006b.p008b.p016h.p017i.InterfaceC0238p;

/* JADX INFO: renamed from: b.b.i.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0262h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public final float f1848b;

    /* JADX INFO: renamed from: c */
    public final int f1849c;

    /* JADX INFO: renamed from: d */
    public final int f1850d;

    /* JADX INFO: renamed from: e */
    public final View f1851e;

    /* JADX INFO: renamed from: f */
    public Runnable f1852f;

    /* JADX INFO: renamed from: g */
    public Runnable f1853g;

    /* JADX INFO: renamed from: h */
    public boolean f1854h;

    /* JADX INFO: renamed from: i */
    public int f1855i;

    /* JADX INFO: renamed from: j */
    public final int[] f1856j = new int[2];

    /* JADX INFO: renamed from: b.b.i.h0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0262h0.this.f1851e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: b.b.i.h0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0262h0 abstractViewOnTouchListenerC0262h0 = AbstractViewOnTouchListenerC0262h0.this;
            abstractViewOnTouchListenerC0262h0.m1068a();
            View view = abstractViewOnTouchListenerC0262h0.f1851e;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0262h0.mo22c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                abstractViewOnTouchListenerC0262h0.f1854h = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC0262h0(View view) {
        this.f1851e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1848b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1849c = tapTimeout;
        this.f1850d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1068a() {
        Runnable runnable = this.f1853g;
        if (runnable != null) {
            this.f1851e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1852f;
        if (runnable2 != null) {
            this.f1851e.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0238p mo21b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo22c();

    /* JADX INFO: renamed from: d */
    public boolean mo1022d() {
        InterfaceC0238p interfaceC0238pMo21b = mo21b();
        if (interfaceC0238pMo21b == null || !interfaceC0238pMo21b.mo921b()) {
            return true;
        }
        interfaceC0238pMo21b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        C0258f0 c0258f0;
        boolean z4 = this.f1854h;
        if (z4) {
            View view2 = this.f1851e;
            InterfaceC0238p interfaceC0238pMo21b = mo21b();
            if (interfaceC0238pMo21b == null || !interfaceC0238pMo21b.mo921b() || (c0258f0 = (C0258f0) interfaceC0238pMo21b.mo923k()) == null || !c0258f0.isShown()) {
                z3 = false;
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1856j;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                int[] iArr2 = this.f1856j;
                c0258f0.getLocationOnScreen(iArr2);
                motionEventObtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                boolean zM1066b = c0258f0.m1066b(motionEventObtainNoHistory, this.f1855i);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM1066b && z5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            z2 = z3 || !mo1022d();
        } else {
            View view3 = this.f1851e;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f1855i = motionEvent.getPointerId(0);
                    if (this.f1852f == null) {
                        this.f1852f = new a();
                    }
                    view3.postDelayed(this.f1852f, this.f1849c);
                    if (this.f1853g == null) {
                        this.f1853g = new b();
                    }
                    view3.postDelayed(this.f1853g, this.f1850d);
                } else if (actionMasked2 == 1) {
                    m1068a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1855i);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f1848b;
                        float f2 = -f;
                        if (!(x >= f2 && y >= f2 && x < ((float) (view3.getRight() - view3.getLeft())) + f && y < ((float) (view3.getBottom() - view3.getTop())) + f)) {
                            m1068a();
                            view3.getParent().requestDisallowInterceptTouchEvent(true);
                            z = true;
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m1068a();
                }
                z = false;
            } else {
                z = false;
            }
            z2 = z && mo22c();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1851e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1854h = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1854h = false;
        this.f1855i = -1;
        Runnable runnable = this.f1852f;
        if (runnable != null) {
            this.f1851e.removeCallbacks(runnable);
        }
    }
}
