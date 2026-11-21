package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.didjdk.adbhelper.R;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p044j.InterfaceC0417l;
import p006b.p032h.p046k.InterfaceC0436e;

/* JADX INFO: renamed from: b.b.i.g */
/* JADX INFO: loaded from: classes.dex */
public class C0259g extends CheckBox implements InterfaceC0436e, InterfaceC0417l {

    /* JADX INFO: renamed from: b */
    public final C0263i f1843b;

    /* JADX INFO: renamed from: c */
    public final C0254e f1844c;

    /* JADX INFO: renamed from: d */
    public final C0295y f1845d;

    public C0259g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cl);
    }

    public C0259g(Context context, AttributeSet attributeSet, int i) {
        super(C0288u0.m1135a(context), attributeSet, i);
        C0263i c0263i = new C0263i(this);
        this.f1843b = c0263i;
        c0263i.m1070b(attributeSet, i);
        C0254e c0254e = new C0254e(this);
        this.f1844c = c0254e;
        c0254e.m1054d(attributeSet, i);
        C0295y c0295y = new C0295y(this);
        this.f1845d = c0295y;
        c0295y.m1172e(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254e c0254e = this.f1844c;
        if (c0254e != null) {
            c0254e.m1051a();
        }
        C0295y c0295y = this.f1845d;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0263i c0263i = this.f1843b;
        return compoundPaddingLeft;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        C0254e c0254e = this.f1844c;
        if (c0254e != null) {
            return c0254e.m1052b();
        }
        return null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254e c0254e = this.f1844c;
        if (c0254e != null) {
            return c0254e.m1053c();
        }
        return null;
    }

    @Override // p006b.p032h.p046k.InterfaceC0436e
    public ColorStateList getSupportButtonTintList() {
        C0263i c0263i = this.f1843b;
        if (c0263i != null) {
            return c0263i.f1860b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0263i c0263i = this.f1843b;
        if (c0263i != null) {
            return c0263i.f1861c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254e c0254e = this.f1844c;
        if (c0254e != null) {
            c0254e.m1055e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254e c0254e = this.f1844c;
        if (c0254e != null) {
            c0254e.m1056f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0208a.m884b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0263i c0263i = this.f1843b;
        if (c0263i != null) {
            if (c0263i.f1864f) {
                c0263i.f1864f = false;
            } else {
                c0263i.f1864f = true;
                c0263i.m1069a();
            }
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254e c0254e = this.f1844c;
        if (c0254e != null) {
            c0254e.m1058h(colorStateList);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254e c0254e = this.f1844c;
        if (c0254e != null) {
            c0254e.m1059i(mode);
        }
    }

    @Override // p006b.p032h.p046k.InterfaceC0436e
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0263i c0263i = this.f1843b;
        if (c0263i != null) {
            c0263i.f1860b = colorStateList;
            c0263i.f1862d = true;
            c0263i.m1069a();
        }
    }

    @Override // p006b.p032h.p046k.InterfaceC0436e
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0263i c0263i = this.f1843b;
        if (c0263i != null) {
            c0263i.f1861c = mode;
            c0263i.f1863e = true;
            c0263i.m1069a();
        }
    }
}
