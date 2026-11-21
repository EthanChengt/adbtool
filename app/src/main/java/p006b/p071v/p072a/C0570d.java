package p006b.p071v.p072a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Objects;
import p006b.p058n.p059a.p060a.C0493b;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.v.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0570d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: h */
    public static final Interpolator f3486h = new LinearInterpolator();

    /* JADX INFO: renamed from: i */
    public static final Interpolator f3487i = new C0493b();

    /* JADX INFO: renamed from: j */
    public static final int[] f3488j = {-16777216};

    /* JADX INFO: renamed from: b */
    public final a f3489b;

    /* JADX INFO: renamed from: c */
    public float f3490c;

    /* JADX INFO: renamed from: d */
    public Resources f3491d;

    /* JADX INFO: renamed from: e */
    public Animator f3492e;

    /* JADX INFO: renamed from: f */
    public float f3493f;

    /* JADX INFO: renamed from: g */
    public boolean f3494g;

    /* JADX INFO: renamed from: b.v.a.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final RectF f3495a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f3496b;

        /* JADX INFO: renamed from: c */
        public final Paint f3497c;

        /* JADX INFO: renamed from: d */
        public final Paint f3498d;

        /* JADX INFO: renamed from: e */
        public float f3499e;

        /* JADX INFO: renamed from: f */
        public float f3500f;

        /* JADX INFO: renamed from: g */
        public float f3501g;

        /* JADX INFO: renamed from: h */
        public float f3502h;

        /* JADX INFO: renamed from: i */
        public int[] f3503i;

        /* JADX INFO: renamed from: j */
        public int f3504j;

        /* JADX INFO: renamed from: k */
        public float f3505k;

        /* JADX INFO: renamed from: l */
        public float f3506l;

        /* JADX INFO: renamed from: m */
        public float f3507m;

        /* JADX INFO: renamed from: n */
        public boolean f3508n;

        /* JADX INFO: renamed from: o */
        public Path f3509o;

        /* JADX INFO: renamed from: p */
        public float f3510p;

        /* JADX INFO: renamed from: q */
        public float f3511q;

        /* JADX INFO: renamed from: r */
        public int f3512r;

        /* JADX INFO: renamed from: s */
        public int f3513s;

        /* JADX INFO: renamed from: t */
        public int f3514t;

        /* JADX INFO: renamed from: u */
        public int f3515u;

        public a() {
            Paint paint = new Paint();
            this.f3496b = paint;
            Paint paint2 = new Paint();
            this.f3497c = paint2;
            Paint paint3 = new Paint();
            this.f3498d = paint3;
            this.f3499e = 0.0f;
            this.f3500f = 0.0f;
            this.f3501g = 0.0f;
            this.f3502h = 5.0f;
            this.f3510p = 1.0f;
            this.f3514t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: a */
        public void m2083a(int i) {
            this.f3504j = i;
            this.f3515u = this.f3503i[i];
        }

        /* JADX INFO: renamed from: b */
        public void m2084b(boolean z) {
            if (this.f3508n != z) {
                this.f3508n = z;
            }
        }
    }

    public C0570d(Context context) {
        Objects.requireNonNull(context);
        this.f3491d = context.getResources();
        a aVar = new a();
        this.f3489b = aVar;
        aVar.f3503i = f3488j;
        aVar.m2083a(0);
        aVar.f3502h = 2.5f;
        aVar.f3496b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0568b(this, aVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f3486h);
        valueAnimatorOfFloat.addListener(new C0569c(this, aVar));
        this.f3492e = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: a */
    public void m2079a(float f, a aVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f3494g) {
            m2082d(f, aVar);
            float fFloor = (float) (Math.floor(aVar.f3507m / 0.8f) + 1.0d);
            float f2 = aVar.f3505k;
            float f3 = aVar.f3506l;
            aVar.f3499e = (((f3 - 0.01f) - f2) * f) + f2;
            aVar.f3500f = f3;
            float f4 = aVar.f3507m;
            aVar.f3501g = a.m2187a(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = aVar.f3507m;
            if (f < 0.5f) {
                interpolation = aVar.f3505k;
                interpolation2 = (f3487i.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = aVar.f3505k + 0.79f;
                interpolation = f6 - (((1.0f - f3487i.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f3493f) * 216.0f;
            aVar.f3499e = interpolation;
            aVar.f3500f = interpolation2;
            aVar.f3501g = f7;
            this.f3490c = f8;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2080b(float f, float f2, float f3, float f4) {
        a aVar = this.f3489b;
        float f5 = this.f3491d.getDisplayMetrics().density;
        float f6 = f2 * f5;
        aVar.f3502h = f6;
        aVar.f3496b.setStrokeWidth(f6);
        aVar.f3511q = f * f5;
        aVar.m2083a(0);
        aVar.f3512r = (int) (f3 * f5);
        aVar.f3513s = (int) (f4 * f5);
    }

    /* JADX INFO: renamed from: c */
    public void m2081c(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = 7.5f;
            f2 = 2.5f;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        m2080b(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public void m2082d(float f, a aVar) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = aVar.f3503i;
            int i2 = aVar.f3504j;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
        } else {
            i = aVar.f3503i[aVar.f3504j];
        }
        aVar.f3515u = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3490c, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f3489b;
        RectF rectF = aVar.f3495a;
        float f = aVar.f3511q;
        float fMin = (aVar.f3502h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f3512r * aVar.f3510p) / 2.0f, aVar.f3502h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = aVar.f3499e;
        float f3 = aVar.f3501g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((aVar.f3500f + f3) * 360.0f) - f4;
        aVar.f3496b.setColor(aVar.f3515u);
        aVar.f3496b.setAlpha(aVar.f3514t);
        float f6 = aVar.f3502h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f3498d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, aVar.f3496b);
        if (aVar.f3508n) {
            Path path = aVar.f3509o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f3509o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (aVar.f3512r * aVar.f3510p) / 2.0f;
            aVar.f3509o.moveTo(0.0f, 0.0f);
            aVar.f3509o.lineTo(aVar.f3512r * aVar.f3510p, 0.0f);
            Path path3 = aVar.f3509o;
            float f9 = aVar.f3512r;
            float f10 = aVar.f3510p;
            path3.lineTo((f9 * f10) / 2.0f, aVar.f3513s * f10);
            aVar.f3509o.offset((rectF.centerX() + fMin2) - f8, (aVar.f3502h / 2.0f) + rectF.centerY());
            aVar.f3509o.close();
            aVar.f3497c.setColor(aVar.f3515u);
            aVar.f3497c.setAlpha(aVar.f3514t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f3509o, aVar.f3497c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3489b.f3514t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3492e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3489b.f3514t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3489b.f3496b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j;
        this.f3492e.cancel();
        a aVar = this.f3489b;
        float f = aVar.f3499e;
        aVar.f3505k = f;
        float f2 = aVar.f3500f;
        aVar.f3506l = f2;
        aVar.f3507m = aVar.f3501g;
        if (f2 != f) {
            this.f3494g = true;
            animator = this.f3492e;
            j = 666;
        } else {
            aVar.m2083a(0);
            a aVar2 = this.f3489b;
            aVar2.f3505k = 0.0f;
            aVar2.f3506l = 0.0f;
            aVar2.f3507m = 0.0f;
            aVar2.f3499e = 0.0f;
            aVar2.f3500f = 0.0f;
            aVar2.f3501g = 0.0f;
            animator = this.f3492e;
            j = 1332;
        }
        animator.setDuration(j);
        this.f3492e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3492e.cancel();
        this.f3490c = 0.0f;
        this.f3489b.m2084b(false);
        this.f3489b.m2083a(0);
        a aVar = this.f3489b;
        aVar.f3505k = 0.0f;
        aVar.f3506l = 0.0f;
        aVar.f3507m = 0.0f;
        aVar.f3499e = 0.0f;
        aVar.f3500f = 0.0f;
        aVar.f3501g = 0.0f;
        invalidateSelf();
    }
}
