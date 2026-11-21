package p006b.p068t.p069b;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.t.b.l */
/* JADX INFO: loaded from: classes.dex */
public class C0549l extends RecyclerView.AbstractC0139n implements RecyclerView.InterfaceC0144s {

    /* JADX INFO: renamed from: D */
    public static final int[] f3372D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E */
    public static final int[] f3373E = new int[0];

    /* JADX INFO: renamed from: A */
    public int f3374A;

    /* JADX INFO: renamed from: B */
    public final Runnable f3375B;

    /* JADX INFO: renamed from: C */
    public final RecyclerView.AbstractC0145t f3376C;

    /* JADX INFO: renamed from: a */
    public final int f3377a;

    /* JADX INFO: renamed from: b */
    public final int f3378b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f3379c;

    /* JADX INFO: renamed from: d */
    public final Drawable f3380d;

    /* JADX INFO: renamed from: e */
    public final int f3381e;

    /* JADX INFO: renamed from: f */
    public final int f3382f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f3383g;

    /* JADX INFO: renamed from: h */
    public final Drawable f3384h;

    /* JADX INFO: renamed from: i */
    public final int f3385i;

    /* JADX INFO: renamed from: j */
    public final int f3386j;

    /* JADX INFO: renamed from: k */
    public int f3387k;

    /* JADX INFO: renamed from: l */
    public int f3388l;

    /* JADX INFO: renamed from: m */
    public float f3389m;

    /* JADX INFO: renamed from: n */
    public int f3390n;

    /* JADX INFO: renamed from: o */
    public int f3391o;

    /* JADX INFO: renamed from: p */
    public float f3392p;

    /* JADX INFO: renamed from: s */
    public RecyclerView f3395s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f3402z;

    /* JADX INFO: renamed from: q */
    public int f3393q = 0;

    /* JADX INFO: renamed from: r */
    public int f3394r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f3396t = false;

    /* JADX INFO: renamed from: u */
    public boolean f3397u = false;

    /* JADX INFO: renamed from: v */
    public int f3398v = 0;

    /* JADX INFO: renamed from: w */
    public int f3399w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f3400x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f3401y = new int[2];

    /* JADX INFO: renamed from: b.t.b.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0549l c0549l = C0549l.this;
            int i = c0549l.f3374A;
            if (i == 1) {
                c0549l.f3402z.cancel();
            } else if (i != 2) {
                return;
            }
            c0549l.f3374A = 3;
            ValueAnimator valueAnimator = c0549l.f3402z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            c0549l.f3402z.setDuration(500);
            c0549l.f3402z.start();
        }
    }

    /* JADX INFO: renamed from: b.t.b.l$b */
    public class b extends RecyclerView.AbstractC0145t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0145t
        /* JADX INFO: renamed from: b */
        public void mo635b(RecyclerView recyclerView, int i, int i2) {
            C0549l c0549l = C0549l.this;
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = c0549l.f3395s.computeVerticalScrollRange();
            int i3 = c0549l.f3394r;
            c0549l.f3396t = iComputeVerticalScrollRange - i3 > 0 && i3 >= c0549l.f3377a;
            int iComputeHorizontalScrollRange = c0549l.f3395s.computeHorizontalScrollRange();
            int i4 = c0549l.f3393q;
            boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= c0549l.f3377a;
            c0549l.f3397u = z;
            boolean z2 = c0549l.f3396t;
            if (!z2 && !z) {
                if (c0549l.f3398v != 0) {
                    c0549l.m2026k(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                c0549l.f3388l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                c0549l.f3387k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (c0549l.f3397u) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i4;
                c0549l.f3391o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                c0549l.f3390n = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
            }
            int i5 = c0549l.f3398v;
            if (i5 == 0 || i5 == 1) {
                c0549l.m2026k(1);
            }
        }
    }

    /* JADX INFO: renamed from: b.t.b.l$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f3405a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3405a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3405a) {
                this.f3405a = false;
                return;
            }
            if (((Float) C0549l.this.f3402z.getAnimatedValue()).floatValue() == 0.0f) {
                C0549l c0549l = C0549l.this;
                c0549l.f3374A = 0;
                c0549l.m2026k(0);
            } else {
                C0549l c0549l2 = C0549l.this;
                c0549l2.f3374A = 2;
                c0549l2.f3395s.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: b.t.b.l$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0549l.this.f3379c.setAlpha(iFloatValue);
            C0549l.this.f3380d.setAlpha(iFloatValue);
            C0549l.this.f3395s.invalidate();
        }
    }

    public C0549l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3402z = valueAnimatorOfFloat;
        this.f3374A = 0;
        this.f3375B = new a();
        b bVar = new b();
        this.f3376C = bVar;
        this.f3379c = stateListDrawable;
        this.f3380d = drawable;
        this.f3383g = stateListDrawable2;
        this.f3384h = drawable2;
        this.f3381e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3382f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3385i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3386j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3377a = i2;
        this.f3378b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f3395s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f3395s.removeOnItemTouchListener(this);
            this.f3395s.removeOnScrollListener(bVar);
            m2022g();
        }
        this.f3395s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f3395s.addOnItemTouchListener(this);
        this.f3395s.addOnScrollListener(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0144s
    /* JADX INFO: renamed from: a */
    public boolean mo631a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3398v;
        if (i == 1) {
            boolean zM2024i = m2024i(motionEvent.getX(), motionEvent.getY());
            boolean zM2023h = m2023h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zM2024i || zM2023h)) {
                if (zM2023h) {
                    this.f3399w = 1;
                    this.f3392p = (int) motionEvent.getX();
                } else if (zM2024i) {
                    this.f3399w = 2;
                    this.f3389m = (int) motionEvent.getY();
                }
                m2026k(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0144s
    /* JADX INFO: renamed from: b */
    public void mo632b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3398v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM2024i = m2024i(motionEvent.getX(), motionEvent.getY());
            boolean zM2023h = m2023h(motionEvent.getX(), motionEvent.getY());
            if (zM2024i || zM2023h) {
                if (zM2023h) {
                    this.f3399w = 1;
                    this.f3392p = (int) motionEvent.getX();
                } else if (zM2024i) {
                    this.f3399w = 2;
                    this.f3389m = (int) motionEvent.getY();
                }
                m2026k(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3398v == 2) {
            this.f3389m = 0.0f;
            this.f3392p = 0.0f;
            m2026k(1);
            this.f3399w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3398v == 2) {
            m2027l();
            if (this.f3399w == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f3401y;
                int i = this.f3378b;
                iArr[0] = i;
                iArr[1] = this.f3393q - i;
                float fMax = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f3391o - fMax) >= 2.0f) {
                    int iM2025j = m2025j(this.f3392p, fMax, iArr, this.f3395s.computeHorizontalScrollRange(), this.f3395s.computeHorizontalScrollOffset(), this.f3393q);
                    if (iM2025j != 0) {
                        this.f3395s.scrollBy(iM2025j, 0);
                    }
                    this.f3392p = fMax;
                }
            }
            if (this.f3399w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f3400x;
                int i2 = this.f3378b;
                iArr2[0] = i2;
                iArr2[1] = this.f3394r - i2;
                float fMax2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f3388l - fMax2) < 2.0f) {
                    return;
                }
                int iM2025j2 = m2025j(this.f3389m, fMax2, iArr2, this.f3395s.computeVerticalScrollRange(), this.f3395s.computeVerticalScrollOffset(), this.f3394r);
                if (iM2025j2 != 0) {
                    this.f3395s.scrollBy(0, iM2025j2);
                }
                this.f3389m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0144s
    /* JADX INFO: renamed from: c */
    public void mo633c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0139n
    /* JADX INFO: renamed from: f */
    public void mo559f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0123a0 c0123a0) {
        if (this.f3393q != this.f3395s.getWidth() || this.f3394r != this.f3395s.getHeight()) {
            this.f3393q = this.f3395s.getWidth();
            this.f3394r = this.f3395s.getHeight();
            m2026k(0);
            return;
        }
        if (this.f3374A != 0) {
            if (this.f3396t) {
                int i = this.f3393q;
                int i2 = this.f3381e;
                int i3 = i - i2;
                int i4 = this.f3388l;
                int i5 = this.f3387k;
                int i6 = i4 - (i5 / 2);
                this.f3379c.setBounds(0, 0, i2, i5);
                this.f3380d.setBounds(0, 0, this.f3382f, this.f3394r);
                RecyclerView recyclerView2 = this.f3395s;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    this.f3380d.draw(canvas);
                    canvas.translate(this.f3381e, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3379c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i3 = this.f3381e;
                } else {
                    canvas.translate(i3, 0.0f);
                    this.f3380d.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f3379c.draw(canvas);
                }
                canvas.translate(-i3, -i6);
            }
            if (this.f3397u) {
                int i7 = this.f3394r;
                int i8 = this.f3385i;
                int i9 = i7 - i8;
                int i10 = this.f3391o;
                int i11 = this.f3390n;
                int i12 = i10 - (i11 / 2);
                this.f3383g.setBounds(0, 0, i11, i8);
                this.f3384h.setBounds(0, 0, this.f3393q, this.f3386j);
                canvas.translate(0.0f, i9);
                this.f3384h.draw(canvas);
                canvas.translate(i12, 0.0f);
                this.f3383g.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2022g() {
        this.f3395s.removeCallbacks(this.f3375B);
    }

    /* JADX INFO: renamed from: h */
    public boolean m2023h(float f, float f2) {
        if (f2 >= this.f3394r - this.f3385i) {
            int i = this.f3391o;
            int i2 = this.f3390n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m2024i(float f, float f2) {
        RecyclerView recyclerView = this.f3395s;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f > this.f3381e / 2) {
                return false;
            }
        } else if (f < this.f3393q - this.f3381e) {
            return false;
        }
        int i = this.f3388l;
        int i2 = this.f3387k / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: j */
    public final int m2025j(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* JADX INFO: renamed from: k */
    public void m2026k(int i) {
        int i2;
        if (i == 2 && this.f3398v != 2) {
            this.f3379c.setState(f3372D);
            m2022g();
        }
        if (i == 0) {
            this.f3395s.invalidate();
        } else {
            m2027l();
        }
        if (this.f3398v != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.f3398v = i;
        }
        this.f3379c.setState(f3373E);
        m2022g();
        this.f3395s.postDelayed(this.f3375B, i2);
        this.f3398v = i;
    }

    /* JADX INFO: renamed from: l */
    public void m2027l() {
        int i = this.f3374A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f3402z.cancel();
            }
        }
        this.f3374A = 1;
        ValueAnimator valueAnimator = this.f3402z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3402z.setDuration(500L);
        this.f3402z.setStartDelay(0L);
        this.f3402z.start();
    }
}
