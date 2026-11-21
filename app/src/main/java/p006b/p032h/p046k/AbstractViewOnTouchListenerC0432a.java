package p006b.p032h.p046k;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.h.k.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0432a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f2760r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b */
    public final a f2761b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f2762c;

    /* JADX INFO: renamed from: d */
    public final View f2763d;

    /* JADX INFO: renamed from: e */
    public Runnable f2764e;

    /* JADX INFO: renamed from: f */
    public float[] f2765f;

    /* JADX INFO: renamed from: g */
    public float[] f2766g;

    /* JADX INFO: renamed from: h */
    public int f2767h;

    /* JADX INFO: renamed from: i */
    public int f2768i;

    /* JADX INFO: renamed from: j */
    public float[] f2769j;

    /* JADX INFO: renamed from: k */
    public float[] f2770k;

    /* JADX INFO: renamed from: l */
    public float[] f2771l;

    /* JADX INFO: renamed from: m */
    public boolean f2772m;

    /* JADX INFO: renamed from: n */
    public boolean f2773n;

    /* JADX INFO: renamed from: o */
    public boolean f2774o;

    /* JADX INFO: renamed from: p */
    public boolean f2775p;

    /* JADX INFO: renamed from: q */
    public boolean f2776q;

    /* JADX INFO: renamed from: b.h.k.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f2777a;

        /* JADX INFO: renamed from: b */
        public int f2778b;

        /* JADX INFO: renamed from: c */
        public float f2779c;

        /* JADX INFO: renamed from: d */
        public float f2780d;

        /* JADX INFO: renamed from: j */
        public float f2786j;

        /* JADX INFO: renamed from: k */
        public int f2787k;

        /* JADX INFO: renamed from: e */
        public long f2781e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        public long f2785i = -1;

        /* JADX INFO: renamed from: f */
        public long f2782f = 0;

        /* JADX INFO: renamed from: g */
        public int f2783g = 0;

        /* JADX INFO: renamed from: h */
        public int f2784h = 0;

        /* JADX INFO: renamed from: a */
        public final float m1631a(long j) {
            long j2 = this.f2781e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2785i;
            if (j3 < 0 || j < j3) {
                return AbstractViewOnTouchListenerC0432a.m1626b((j - j2) / this.f2777a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2786j;
            return (AbstractViewOnTouchListenerC0432a.m1626b((j - j3) / this.f2787k, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* JADX INFO: renamed from: b.h.k.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0432a abstractViewOnTouchListenerC0432a = AbstractViewOnTouchListenerC0432a.this;
            if (abstractViewOnTouchListenerC0432a.f2775p) {
                if (abstractViewOnTouchListenerC0432a.f2773n) {
                    abstractViewOnTouchListenerC0432a.f2773n = false;
                    a aVar = abstractViewOnTouchListenerC0432a.f2761b;
                    Objects.requireNonNull(aVar);
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f2781e = jCurrentAnimationTimeMillis;
                    aVar.f2785i = -1L;
                    aVar.f2782f = jCurrentAnimationTimeMillis;
                    aVar.f2786j = 0.5f;
                    aVar.f2783g = 0;
                    aVar.f2784h = 0;
                }
                a aVar2 = AbstractViewOnTouchListenerC0432a.this.f2761b;
                if ((aVar2.f2785i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f2785i + ((long) aVar2.f2787k)) || !AbstractViewOnTouchListenerC0432a.this.m1630e()) {
                    AbstractViewOnTouchListenerC0432a.this.f2775p = false;
                    return;
                }
                AbstractViewOnTouchListenerC0432a abstractViewOnTouchListenerC0432a2 = AbstractViewOnTouchListenerC0432a.this;
                if (abstractViewOnTouchListenerC0432a2.f2774o) {
                    abstractViewOnTouchListenerC0432a2.f2774o = false;
                    Objects.requireNonNull(abstractViewOnTouchListenerC0432a2);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    abstractViewOnTouchListenerC0432a2.f2763d.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar2.f2782f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fM1631a = aVar2.m1631a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - aVar2.f2782f;
                aVar2.f2782f = jCurrentAnimationTimeMillis2;
                float f = j * ((fM1631a * 4.0f) + ((-4.0f) * fM1631a * fM1631a));
                aVar2.f2783g = (int) (aVar2.f2779c * f);
                int i = (int) (f * aVar2.f2780d);
                aVar2.f2784h = i;
                ((C0434c) AbstractViewOnTouchListenerC0432a.this).f2790s.scrollListBy(i);
                View view = AbstractViewOnTouchListenerC0432a.this.f2763d;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                view.postOnAnimation(this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0432a(View view) {
        a aVar = new a();
        this.f2761b = aVar;
        this.f2762c = new AccelerateInterpolator();
        this.f2765f = new float[]{0.0f, 0.0f};
        this.f2766g = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2769j = new float[]{0.0f, 0.0f};
        this.f2770k = new float[]{0.0f, 0.0f};
        this.f2771l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2763d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f2771l;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f2770k;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f2767h = 1;
        float[] fArr3 = this.f2766g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f2765f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f2769j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f2768i = f2760r;
        aVar.f2777a = 500;
        aVar.f2778b = 500;
    }

    /* JADX INFO: renamed from: b */
    public static float m1626b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX INFO: renamed from: a */
    public final float m1627a(int i, float f, float f2, float f3) {
        float fM1626b;
        float interpolation;
        float fM1626b2 = m1626b(this.f2765f[i] * f2, 0.0f, this.f2766g[i]);
        float fM1628c = m1628c(f2 - f, fM1626b2) - m1628c(f, fM1626b2);
        if (fM1628c >= 0.0f) {
            if (fM1628c > 0.0f) {
                interpolation = this.f2762c.getInterpolation(fM1628c);
            } else {
                fM1626b = 0.0f;
            }
            if (fM1626b == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f2769j[i];
            float f5 = this.f2770k[i];
            float f6 = this.f2771l[i];
            float f7 = f4 * f3;
            return fM1626b > 0.0f ? m1626b(fM1626b * f7, f5, f6) : -m1626b((-fM1626b) * f7, f5, f6);
        }
        interpolation = -this.f2762c.getInterpolation(-fM1628c);
        fM1626b = m1626b(interpolation, -1.0f, 1.0f);
        if (fM1626b == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f2769j[i];
        float f9 = this.f2770k[i];
        float f10 = this.f2771l[i];
        float f11 = f8 * f3;
        if (fM1626b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m1628c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2767h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f2775p && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m1629d() {
        int i = 0;
        if (this.f2773n) {
            this.f2775p = false;
            return;
        }
        a aVar = this.f2761b;
        Objects.requireNonNull(aVar);
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.f2781e);
        int i3 = aVar.f2778b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f2787k = i;
        aVar.f2786j = aVar.m1631a(jCurrentAnimationTimeMillis);
        aVar.f2785i = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    /* JADX INFO: renamed from: e */
    public boolean m1630e() {
        boolean z;
        a aVar = this.f2761b;
        float f = aVar.f2780d;
        int iAbs = (int) (f / Math.abs(f));
        float f2 = aVar.f2779c;
        if (iAbs != 0) {
            ListView listView = ((C0434c) this).f2790s;
            int count = listView.getCount();
            if (count == 0) {
                z = false;
            } else {
                int childCount = listView.getChildCount();
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int i = firstVisiblePosition + childCount;
                if (iAbs <= 0 ? iAbs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) : i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.f2776q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m1629d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m1629d();
                }
            }
            return false;
        }
        this.f2774o = true;
        this.f2772m = false;
        float fM1627a = m1627a(0, motionEvent.getX(), view.getWidth(), this.f2763d.getWidth());
        float fM1627a2 = m1627a(1, motionEvent.getY(), view.getHeight(), this.f2763d.getHeight());
        a aVar = this.f2761b;
        aVar.f2779c = fM1627a;
        aVar.f2780d = fM1627a2;
        if (!this.f2775p && m1630e()) {
            if (this.f2764e == null) {
                this.f2764e = new b();
            }
            this.f2775p = true;
            this.f2773n = true;
            if (this.f2772m || (i = this.f2768i) <= 0) {
                this.f2764e.run();
            } else {
                View view2 = this.f2763d;
                Runnable runnable = this.f2764e;
                long j = i;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                view2.postOnAnimationDelayed(runnable, j);
            }
            this.f2772m = true;
        }
        return false;
    }
}
