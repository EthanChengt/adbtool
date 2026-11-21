package p006b.p023d.p024c;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: b.d.c.f */
/* JADX INFO: loaded from: classes.dex */
public class C0311f extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f2119a;

    /* JADX INFO: renamed from: c */
    public final RectF f2121c;

    /* JADX INFO: renamed from: d */
    public final Rect f2122d;

    /* JADX INFO: renamed from: e */
    public float f2123e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f2126h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f2127i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f2128j;

    /* JADX INFO: renamed from: f */
    public boolean f2124f = false;

    /* JADX INFO: renamed from: g */
    public boolean f2125g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f2129k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public final Paint f2120b = new Paint(5);

    public C0311f(ColorStateList colorStateList, float f) {
        this.f2119a = f;
        m1221b(colorStateList);
        this.f2121c = new RectF();
        this.f2122d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1220a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m1221b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2126h = colorStateList;
        this.f2120b.setColor(colorStateList.getColorForState(getState(), this.f2126h.getDefaultColor()));
    }

    /* JADX INFO: renamed from: c */
    public final void m1222c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2121c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2122d.set(rect);
        if (this.f2124f) {
            this.f2122d.inset((int) Math.ceil(C0312g.m1223a(this.f2123e, this.f2119a, this.f2125g)), (int) Math.ceil(C0312g.m1224b(this.f2123e, this.f2119a, this.f2125g)));
            this.f2121c.set(this.f2122d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2120b;
        if (this.f2127i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f2127i);
            z = true;
        }
        RectF rectF = this.f2121c;
        float f = this.f2119a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2122d, this.f2119a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2128j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f2126h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1222c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2126h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f2120b.getColor();
        if (z) {
            this.f2120b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2128j;
        if (colorStateList2 == null || (mode = this.f2129k) == null) {
            return z;
        }
        this.f2127i = m1220a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2120b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2120b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2128j = colorStateList;
        this.f2127i = m1220a(colorStateList, this.f2129k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2129k = mode;
        this.f2127i = m1220a(this.f2128j, mode);
        invalidateSelf();
    }
}
