package p006b.p032h.p036d.p037k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: b.h.d.k.c */
/* JADX INFO: loaded from: classes.dex */
public class C0382c extends Drawable implements Drawable.Callback, InterfaceC0381b, InterfaceC0380a {

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f2612h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public int f2613b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f2614c;

    /* JADX INFO: renamed from: d */
    public boolean f2615d;

    /* JADX INFO: renamed from: e */
    public C0384e f2616e;

    /* JADX INFO: renamed from: f */
    public boolean f2617f;

    /* JADX INFO: renamed from: g */
    public Drawable f2618g;

    public C0382c(Drawable drawable) {
        this.f2616e = new C0384e(this.f2616e);
        mo1518b(drawable);
    }

    @Override // p006b.p032h.p036d.p037k.InterfaceC0381b
    /* JADX INFO: renamed from: a */
    public final Drawable mo1517a() {
        return this.f2618g;
    }

    @Override // p006b.p032h.p036d.p037k.InterfaceC0381b
    /* JADX INFO: renamed from: b */
    public final void mo1518b(Drawable drawable) {
        Drawable drawable2 = this.f2618g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2618g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0384e c0384e = this.f2616e;
            if (c0384e != null) {
                c0384e.f2621b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public boolean mo1519c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1520d(int[] iArr) {
        if (!mo1519c()) {
            return false;
        }
        C0384e c0384e = this.f2616e;
        ColorStateList colorStateList = c0384e.f2622c;
        PorterDuff.Mode mode = c0384e.f2623d;
        if (colorStateList == null || mode == null) {
            this.f2615d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2615d || colorForState != this.f2613b || mode != this.f2614c) {
                setColorFilter(colorForState, mode);
                this.f2613b = colorForState;
                this.f2614c = mode;
                this.f2615d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2618g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0384e c0384e = this.f2616e;
        return changingConfigurations | (c0384e != null ? c0384e.getChangingConfigurations() : 0) | this.f2618g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C0384e c0384e = this.f2616e;
        if (c0384e == null) {
            return null;
        }
        if (!(c0384e.f2621b != null)) {
            return null;
        }
        c0384e.f2620a = getChangingConfigurations();
        return this.f2616e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2618g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2618g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2618g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2618g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2618g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2618g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2618g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2618g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2618g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2618g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0384e c0384e;
        ColorStateList colorStateList = (!mo1519c() || (c0384e = this.f2616e) == null) ? null : c0384e.f2622c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2618g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2618g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2617f && super.mutate() == this) {
            this.f2616e = new C0384e(this.f2616e);
            Drawable drawable = this.f2618g;
            if (drawable != null) {
                drawable.mutate();
            }
            C0384e c0384e = this.f2616e;
            if (c0384e != null) {
                Drawable drawable2 = this.f2618g;
                c0384e.f2621b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2617f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2618g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f2618g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2618g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f2618g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f2618g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2618g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2618g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2618g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m1520d(iArr) || this.f2618g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintList(ColorStateList colorStateList) {
        this.f2616e.f2622c = colorStateList;
        m1520d(getState());
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2616e.f2623d = mode;
        m1520d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2618g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C0382c(C0384e c0384e, Resources resources) {
        Drawable.ConstantState constantState;
        this.f2616e = c0384e;
        if (c0384e == null || (constantState = c0384e.f2621b) == null) {
            return;
        }
        mo1518b(constantState.newDrawable(resources));
    }
}
