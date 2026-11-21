package p006b.p023d.p024c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.didjdk.adbhelper.R;

/* JADX INFO: renamed from: b.d.c.g */
/* JADX INFO: loaded from: classes.dex */
public class C0312g extends Drawable {

    /* JADX INFO: renamed from: q */
    public static final double f2130q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r */
    public static a f2131r;

    /* JADX INFO: renamed from: a */
    public final int f2132a;

    /* JADX INFO: renamed from: c */
    public Paint f2134c;

    /* JADX INFO: renamed from: d */
    public Paint f2135d;

    /* JADX INFO: renamed from: e */
    public final RectF f2136e;

    /* JADX INFO: renamed from: f */
    public float f2137f;

    /* JADX INFO: renamed from: g */
    public Path f2138g;

    /* JADX INFO: renamed from: h */
    public float f2139h;

    /* JADX INFO: renamed from: i */
    public float f2140i;

    /* JADX INFO: renamed from: j */
    public float f2141j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f2142k;

    /* JADX INFO: renamed from: m */
    public final int f2144m;

    /* JADX INFO: renamed from: n */
    public final int f2145n;

    /* JADX INFO: renamed from: l */
    public boolean f2143l = true;

    /* JADX INFO: renamed from: o */
    public boolean f2146o = true;

    /* JADX INFO: renamed from: p */
    public boolean f2147p = false;

    /* JADX INFO: renamed from: b */
    public Paint f2133b = new Paint(5);

    /* JADX INFO: renamed from: b.d.c.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1203a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public C0312g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f2144m = resources.getColor(R.color.ak);
        this.f2145n = resources.getColor(R.color.aj);
        this.f2132a = resources.getDimensionPixelSize(R.dimen.bi);
        m1225c(colorStateList);
        Paint paint = new Paint(5);
        this.f2134c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2137f = (int) (f + 0.5f);
        this.f2136e = new RectF();
        Paint paint2 = new Paint(this.f2134c);
        this.f2135d = paint2;
        paint2.setAntiAlias(false);
        m1226d(f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public static float m1223a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = 1.0d - f2130q;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) ((d2 * d3) + d);
    }

    /* JADX INFO: renamed from: b */
    public static float m1224b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = f3;
        double d2 = 1.0d - f2130q;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) ((d2 * d3) + d);
    }

    /* JADX INFO: renamed from: c */
    public final void m1225c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2142k = colorStateList;
        this.f2133b.setColor(colorStateList.getColorForState(getState(), this.f2142k.getDefaultColor()));
    }

    /* JADX INFO: renamed from: d */
    public final void m1226d(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            i--;
        }
        float f3 = i;
        int i2 = (int) (f2 + 0.5f);
        if (i2 % 2 == 1) {
            i2--;
        }
        float f4 = i2;
        if (f3 > f4) {
            if (!this.f2147p) {
                this.f2147p = true;
            }
            f3 = f4;
        }
        if (this.f2141j == f3 && this.f2139h == f4) {
            return;
        }
        this.f2141j = f3;
        this.f2139h = f4;
        this.f2140i = (int) ((f3 * 1.5f) + this.f2132a + 0.5f);
        this.f2143l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2143l) {
            Rect bounds = getBounds();
            float f = this.f2139h;
            float f2 = 1.5f * f;
            this.f2136e.set(bounds.left + f, bounds.top + f2, bounds.right - f, bounds.bottom - f2);
            float f3 = this.f2137f;
            float f4 = -f3;
            RectF rectF = new RectF(f4, f4, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f5 = -this.f2140i;
            rectF2.inset(f5, f5);
            Path path = this.f2138g;
            if (path == null) {
                this.f2138g = new Path();
            } else {
                path.reset();
            }
            this.f2138g.setFillType(Path.FillType.EVEN_ODD);
            this.f2138g.moveTo(-this.f2137f, 0.0f);
            this.f2138g.rLineTo(-this.f2140i, 0.0f);
            this.f2138g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f2138g.arcTo(rectF, 270.0f, -90.0f, false);
            this.f2138g.close();
            float f6 = this.f2137f;
            float f7 = f6 / (this.f2140i + f6);
            Paint paint = this.f2134c;
            float f8 = this.f2137f + this.f2140i;
            int i = this.f2144m;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i, i, this.f2145n}, new float[]{0.0f, f7, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f2135d;
            float f9 = -this.f2137f;
            float f10 = this.f2140i;
            float f11 = f9 + f10;
            float f12 = f9 - f10;
            int i2 = this.f2144m;
            paint2.setShader(new LinearGradient(0.0f, f11, 0.0f, f12, new int[]{i2, i2, this.f2145n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f2135d.setAntiAlias(false);
            this.f2143l = false;
        }
        canvas.translate(0.0f, this.f2141j / 2.0f);
        float f13 = this.f2137f;
        float f14 = (-f13) - this.f2140i;
        float f15 = (this.f2141j / 2.0f) + f13 + this.f2132a;
        float f16 = f15 * 2.0f;
        boolean z = this.f2136e.width() - f16 > 0.0f;
        boolean z2 = this.f2136e.height() - f16 > 0.0f;
        int iSave = canvas.save();
        RectF rectF3 = this.f2136e;
        canvas.translate(rectF3.left + f15, rectF3.top + f15);
        canvas.drawPath(this.f2138g, this.f2134c);
        if (z) {
            canvas.drawRect(0.0f, f14, this.f2136e.width() - f16, -this.f2137f, this.f2135d);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF4 = this.f2136e;
        canvas.translate(rectF4.right - f15, rectF4.bottom - f15);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2138g, this.f2134c);
        if (z) {
            canvas.drawRect(0.0f, f14, this.f2136e.width() - f16, (-this.f2137f) + this.f2140i, this.f2135d);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF5 = this.f2136e;
        canvas.translate(rectF5.left + f15, rectF5.bottom - f15);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2138g, this.f2134c);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.f2136e.height() - f16, -this.f2137f, this.f2135d);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF6 = this.f2136e;
        canvas.translate(rectF6.right - f15, rectF6.top + f15);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2138g, this.f2134c);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.f2136e.height() - f16, -this.f2137f, this.f2135d);
        }
        canvas.restoreToCount(iSave4);
        canvas.translate(0.0f, (-this.f2141j) / 2.0f);
        f2131r.mo1203a(canvas, this.f2136e, this.f2137f, this.f2133b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(m1224b(this.f2139h, this.f2137f, this.f2146o));
        int iCeil2 = (int) Math.ceil(m1223a(this.f2139h, this.f2137f, this.f2146o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f2142k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2143l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2142k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2133b.getColor() == colorForState) {
            return false;
        }
        this.f2133b.setColor(colorForState);
        this.f2143l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2133b.setAlpha(i);
        this.f2134c.setAlpha(i);
        this.f2135d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2133b.setColorFilter(colorFilter);
    }
}
