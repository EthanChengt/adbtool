package p080c.p126d.p127a.p128a.p148r;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p006b.p008b.p018i.C0264i0;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: renamed from: c.d.a.a.r.f */
/* JADX INFO: loaded from: classes.dex */
public class C1269f extends C0264i0 {

    /* JADX INFO: renamed from: q */
    public Drawable f6094q;

    /* JADX INFO: renamed from: r */
    public final Rect f6095r;

    /* JADX INFO: renamed from: s */
    public final Rect f6096s;

    /* JADX INFO: renamed from: t */
    public int f6097t;

    /* JADX INFO: renamed from: u */
    public boolean f6098u;

    /* JADX INFO: renamed from: v */
    public boolean f6099v;

    public C1269f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1269f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6095r = new Rect();
        this.f6096s = new Rect();
        this.f6097t = 119;
        this.f6098u = true;
        this.f6099v = false;
        int[] iArr = C1164b.f5573k;
        C1277n.m2943a(context, attributeSet, i, 0);
        C1277n.m2944b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f6097t = typedArrayObtainStyledAttributes.getInt(1, this.f6097t);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f6098u = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f6094q;
        if (drawable != null) {
            if (this.f6099v) {
                this.f6099v = false;
                Rect rect = this.f6095r;
                Rect rect2 = this.f6096s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f6098u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f6097t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f6094q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6094q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f6094q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f6094q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f6097t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6094q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p006b.p008b.p018i.C0264i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f6099v = z | this.f6099v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6099v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f6094q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f6094q);
            }
            this.f6094q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f6097t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f6097t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f6097t = i;
            if (i == 119 && this.f6094q != null) {
                this.f6094q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6094q;
    }
}
