package p080c.p126d.p127a.p128a.p147q;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p006b.p032h.p036d.C0370a;
import p080c.p126d.p127a.p128a.p154x.C1299j;
import p080c.p126d.p127a.p128a.p154x.C1300k;

/* JADX INFO: renamed from: c.d.a.a.q.a */
/* JADX INFO: loaded from: classes.dex */
public class C1255a extends Drawable {

    /* JADX INFO: renamed from: b */
    public final Paint f5976b;

    /* JADX INFO: renamed from: h */
    public float f5982h;

    /* JADX INFO: renamed from: i */
    public int f5983i;

    /* JADX INFO: renamed from: j */
    public int f5984j;

    /* JADX INFO: renamed from: k */
    public int f5985k;

    /* JADX INFO: renamed from: l */
    public int f5986l;

    /* JADX INFO: renamed from: m */
    public int f5987m;

    /* JADX INFO: renamed from: o */
    public C1299j f5989o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f5990p;

    /* JADX INFO: renamed from: a */
    public final C1300k f5975a = new C1300k();

    /* JADX INFO: renamed from: c */
    public final Path f5977c = new Path();

    /* JADX INFO: renamed from: d */
    public final Rect f5978d = new Rect();

    /* JADX INFO: renamed from: e */
    public final RectF f5979e = new RectF();

    /* JADX INFO: renamed from: f */
    public final RectF f5980f = new RectF();

    /* JADX INFO: renamed from: g */
    public final b f5981g = new b();

    /* JADX INFO: renamed from: n */
    public boolean f5988n = true;

    /* JADX INFO: renamed from: c.d.a.a.q.a$b */
    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C1255a.this;
        }
    }

    public C1255a(C1299j c1299j) {
        this.f5989o = c1299j;
        Paint paint = new Paint(1);
        this.f5976b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: a */
    public RectF m2881a() {
        this.f5980f.set(getBounds());
        return this.f5980f;
    }

    /* JADX INFO: renamed from: b */
    public void m2882b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f5987m = colorStateList.getColorForState(getState(), this.f5987m);
        }
        this.f5990p = colorStateList;
        this.f5988n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5988n) {
            Paint paint = this.f5976b;
            Rect rect = this.f5978d;
            copyBounds(rect);
            float fHeight = this.f5982h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C0370a.m1487a(this.f5983i, this.f5987m), C0370a.m1487a(this.f5984j, this.f5987m), C0370a.m1487a(C0370a.m1489c(this.f5984j, 0), this.f5987m), C0370a.m1487a(C0370a.m1489c(this.f5986l, 0), this.f5987m), C0370a.m1487a(this.f5986l, this.f5987m), C0370a.m1487a(this.f5985k, this.f5987m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f5988n = false;
        }
        float strokeWidth = this.f5976b.getStrokeWidth() / 2.0f;
        copyBounds(this.f5978d);
        this.f5979e.set(this.f5978d);
        float fMin = Math.min(this.f5989o.f6261e.mo2958a(m2881a()), this.f5979e.width() / 2.0f);
        if (this.f5989o.m2988d(m2881a())) {
            this.f5979e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f5979e, fMin, fMin, this.f5976b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5981g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5982h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f5989o.m2988d(m2881a())) {
            outline.setRoundRect(getBounds(), this.f5989o.f6261e.mo2958a(m2881a()));
            return;
        }
        copyBounds(this.f5978d);
        this.f5979e.set(this.f5978d);
        this.f5975a.m2996a(this.f5989o, 1.0f, this.f5979e, null, this.f5977c);
        if (this.f5977c.isConvex()) {
            outline.setConvexPath(this.f5977c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f5989o.m2988d(m2881a())) {
            return true;
        }
        int iRound = Math.round(this.f5982h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f5990p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f5988n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f5990p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f5987m)) != this.f5987m) {
            this.f5988n = true;
            this.f5987m = colorForState;
        }
        if (this.f5988n) {
            invalidateSelf();
        }
        return this.f5988n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5976b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5976b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
