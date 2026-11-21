package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.didjdk.adbhelper.R;
import p006b.p032h.p044j.InterfaceC0417l;
import p006b.p032h.p046k.InterfaceC0438g;

/* JADX INFO: renamed from: b.b.i.l */
/* JADX INFO: loaded from: classes.dex */
public class C0269l extends ImageButton implements InterfaceC0417l, InterfaceC0438g {

    /* JADX INFO: renamed from: b */
    public final C0254e f1929b;

    /* JADX INFO: renamed from: c */
    public final C0271m f1930c;

    public C0269l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ip);
    }

    public C0269l(Context context, AttributeSet attributeSet, int i) {
        super(C0288u0.m1135a(context), attributeSet, i);
        C0254e c0254e = new C0254e(this);
        this.f1929b = c0254e;
        c0254e.m1054d(attributeSet, i);
        C0271m c0271m = new C0271m(this);
        this.f1930c = c0271m;
        c0271m.m1101c(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254e c0254e = this.f1929b;
        if (c0254e != null) {
            c0254e.m1051a();
        }
        C0271m c0271m = this.f1930c;
        if (c0271m != null) {
            c0271m.m1099a();
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        C0254e c0254e = this.f1929b;
        if (c0254e != null) {
            return c0254e.m1052b();
        }
        return null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254e c0254e = this.f1929b;
        if (c0254e != null) {
            return c0254e.m1053c();
        }
        return null;
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public ColorStateList getSupportImageTintList() {
        C0290v0 c0290v0;
        C0271m c0271m = this.f1930c;
        if (c0271m == null || (c0290v0 = c0271m.f1932b) == null) {
            return null;
        }
        return c0290v0.f2018a;
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public PorterDuff.Mode getSupportImageTintMode() {
        C0290v0 c0290v0;
        C0271m c0271m = this.f1930c;
        if (c0271m == null || (c0290v0 = c0271m.f1932b) == null) {
            return null;
        }
        return c0290v0.f2019b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1930c.m1100b() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254e c0254e = this.f1929b;
        if (c0254e != null) {
            c0254e.m1055e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254e c0254e = this.f1929b;
        if (c0254e != null) {
            c0254e.m1056f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0271m c0271m = this.f1930c;
        if (c0271m != null) {
            c0271m.m1099a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0271m c0271m = this.f1930c;
        if (c0271m != null) {
            c0271m.m1099a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f1930c.m1102d(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0271m c0271m = this.f1930c;
        if (c0271m != null) {
            c0271m.m1099a();
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254e c0254e = this.f1929b;
        if (c0254e != null) {
            c0254e.m1058h(colorStateList);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254e c0254e = this.f1929b;
        if (c0254e != null) {
            c0254e.m1059i(mode);
        }
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0271m c0271m = this.f1930c;
        if (c0271m != null) {
            c0271m.m1103e(colorStateList);
        }
    }

    @Override // p006b.p032h.p046k.InterfaceC0438g
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0271m c0271m = this.f1930c;
        if (c0271m != null) {
            c0271m.m1104f(mode);
        }
    }
}
