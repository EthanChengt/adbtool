package p006b.p008b.p018i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p046k.InterfaceC0438g;

/* JADX INFO: renamed from: b.b.i.m */
/* JADX INFO: loaded from: classes.dex */
public class C0271m {

    /* JADX INFO: renamed from: a */
    public final ImageView f1931a;

    /* JADX INFO: renamed from: b */
    public C0290v0 f1932b;

    /* JADX INFO: renamed from: c */
    public C0290v0 f1933c;

    public C0271m(ImageView imageView) {
        this.f1931a = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m1099a() {
        ColorStateList supportImageTintList;
        Drawable drawable = this.f1931a.getDrawable();
        if (drawable != null) {
            C0255e0.m1061b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f1933c == null) {
                    this.f1933c = new C0290v0();
                }
                C0290v0 c0290v0 = this.f1933c;
                PorterDuff.Mode supportImageTintMode = null;
                c0290v0.f2018a = null;
                c0290v0.f2021d = false;
                c0290v0.f2019b = null;
                c0290v0.f2020c = false;
                ImageView imageView = this.f1931a;
                if (i >= 21) {
                    supportImageTintList = imageView.getImageTintList();
                } else {
                    supportImageTintList = imageView instanceof InterfaceC0438g ? ((InterfaceC0438g) imageView).getSupportImageTintList() : null;
                }
                if (supportImageTintList != null) {
                    c0290v0.f2021d = true;
                    c0290v0.f2018a = supportImageTintList;
                }
                ImageView imageView2 = this.f1931a;
                if (i >= 21) {
                    supportImageTintMode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof InterfaceC0438g) {
                    supportImageTintMode = ((InterfaceC0438g) imageView2).getSupportImageTintMode();
                }
                if (supportImageTintMode != null) {
                    c0290v0.f2020c = true;
                    c0290v0.f2019b = supportImageTintMode;
                }
                if (c0290v0.f2021d || c0290v0.f2020c) {
                    C0265j.m1082f(drawable, c0290v0, this.f1931a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0290v0 c0290v1 = this.f1932b;
            if (c0290v1 != null) {
                C0265j.m1082f(drawable, c0290v1, this.f1931a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m1100b() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1931a.getBackground() instanceof RippleDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m1101c(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int iM1164l;
        int i2 = Build.VERSION.SDK_INT;
        C0294x0 c0294x0M1152q = C0294x0.m1152q(this.f1931a.getContext(), attributeSet, C0184b.f1205f, i, 0);
        try {
            Drawable drawable3 = this.f1931a.getDrawable();
            if (drawable3 == null && (iM1164l = c0294x0M1152q.m1164l(1, -1)) != -1 && (drawable3 = C0208a.m884b(this.f1931a.getContext(), iM1164l)) != null) {
                this.f1931a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                C0255e0.m1061b(drawable3);
            }
            if (c0294x0M1152q.m1167o(2)) {
                ImageView imageView = this.f1931a;
                ColorStateList colorStateListM1155c = c0294x0M1152q.m1155c(2);
                if (i2 >= 21) {
                    imageView.setImageTintList(colorStateListM1155c);
                    if (i2 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView.getDrawableState());
                        }
                        imageView.setImageDrawable(drawable2);
                    }
                } else if (imageView instanceof InterfaceC0438g) {
                    ((InterfaceC0438g) imageView).setSupportImageTintList(colorStateListM1155c);
                }
            }
            if (c0294x0M1152q.m1167o(3)) {
                ImageView imageView2 = this.f1931a;
                PorterDuff.Mode modeM1063d = C0255e0.m1063d(c0294x0M1152q.m1162j(3, -1), null);
                if (i2 >= 21) {
                    imageView2.setImageTintMode(modeM1063d);
                    if (i2 == 21 && (drawable = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable);
                    }
                } else if (imageView2 instanceof InterfaceC0438g) {
                    ((InterfaceC0438g) imageView2).setSupportImageTintMode(modeM1063d);
                }
            }
        } finally {
            c0294x0M1152q.f2052b.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1102d(int i) {
        if (i != 0) {
            Drawable drawableM884b = C0208a.m884b(this.f1931a.getContext(), i);
            if (drawableM884b != null) {
                C0255e0.m1061b(drawableM884b);
            }
            this.f1931a.setImageDrawable(drawableM884b);
        } else {
            this.f1931a.setImageDrawable(null);
        }
        m1099a();
    }

    /* JADX INFO: renamed from: e */
    public void m1103e(ColorStateList colorStateList) {
        if (this.f1932b == null) {
            this.f1932b = new C0290v0();
        }
        C0290v0 c0290v0 = this.f1932b;
        c0290v0.f2018a = colorStateList;
        c0290v0.f2021d = true;
        m1099a();
    }

    /* JADX INFO: renamed from: f */
    public void m1104f(PorterDuff.Mode mode) {
        if (this.f1932b == null) {
            this.f1932b = new C0290v0();
        }
        C0290v0 c0290v0 = this.f1932b;
        c0290v0.f2019b = mode;
        c0290v0.f2020c = true;
        m1099a();
    }
}
