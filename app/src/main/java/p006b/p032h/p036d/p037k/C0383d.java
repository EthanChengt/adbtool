package p006b.p032h.p036d.p037k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: b.h.d.k.d */
/* JADX INFO: loaded from: classes.dex */
public class C0383d extends C0382c {

    /* JADX INFO: renamed from: i */
    public static Method f2619i;

    public C0383d(Drawable drawable) {
        super(drawable);
        m1521e();
    }

    public C0383d(C0384e c0384e, Resources resources) {
        super(c0384e, resources);
        m1521e();
    }

    @Override // p006b.p032h.p036d.p037k.C0382c
    /* JADX INFO: renamed from: c */
    public boolean mo1519c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2618g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: e */
    public final void m1521e() {
        if (f2619i == null) {
            try {
                f2619i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2618g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2618g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2618g;
        if (drawable != null && (method = f2619i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f2618g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2618g.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p006b.p032h.p036d.p037k.C0382c, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p006b.p032h.p036d.p037k.C0382c, android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTint(int i) {
        if (mo1519c()) {
            super.setTint(i);
        } else {
            this.f2618g.setTint(i);
        }
    }

    @Override // p006b.p032h.p036d.p037k.C0382c, android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintList(ColorStateList colorStateList) {
        if (!mo1519c()) {
            this.f2618g.setTintList(colorStateList);
        } else {
            this.f2616e.f2622c = colorStateList;
            m1520d(getState());
        }
    }

    @Override // p006b.p032h.p036d.p037k.C0382c, android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintMode(PorterDuff.Mode mode) {
        if (!mo1519c()) {
            this.f2618g.setTintMode(mode);
        } else {
            this.f2616e.f2623d = mode;
            m1520d(getState());
        }
    }
}
