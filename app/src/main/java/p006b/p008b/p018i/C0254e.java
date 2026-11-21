package p006b.p008b.p018i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.InterfaceC0417l;

/* JADX INFO: renamed from: b.b.i.e */
/* JADX INFO: loaded from: classes.dex */
public class C0254e {

    /* JADX INFO: renamed from: a */
    public final View f1816a;

    /* JADX INFO: renamed from: d */
    public C0290v0 f1819d;

    /* JADX INFO: renamed from: e */
    public C0290v0 f1820e;

    /* JADX INFO: renamed from: f */
    public C0290v0 f1821f;

    /* JADX INFO: renamed from: c */
    public int f1818c = -1;

    /* JADX INFO: renamed from: b */
    public final C0265j f1817b = C0265j.m1079a();

    public C0254e(View view) {
        this.f1816a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m1051a() {
        Drawable background = this.f1816a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f1819d != null) {
                if (this.f1821f == null) {
                    this.f1821f = new C0290v0();
                }
                C0290v0 c0290v0 = this.f1821f;
                PorterDuff.Mode supportBackgroundTintMode = null;
                c0290v0.f2018a = null;
                c0290v0.f2021d = false;
                c0290v0.f2019b = null;
                c0290v0.f2020c = false;
                ColorStateList colorStateListM1565h = C0418m.m1565h(this.f1816a);
                if (colorStateListM1565h != null) {
                    c0290v0.f2021d = true;
                    c0290v0.f2018a = colorStateListM1565h;
                }
                View view = this.f1816a;
                if (i >= 21) {
                    supportBackgroundTintMode = view.getBackgroundTintMode();
                } else if (view instanceof InterfaceC0417l) {
                    supportBackgroundTintMode = ((InterfaceC0417l) view).getSupportBackgroundTintMode();
                }
                if (supportBackgroundTintMode != null) {
                    c0290v0.f2020c = true;
                    c0290v0.f2019b = supportBackgroundTintMode;
                }
                if (c0290v0.f2021d || c0290v0.f2020c) {
                    C0265j.m1082f(background, c0290v0, this.f1816a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0290v0 c0290v1 = this.f1820e;
            if (c0290v1 != null) {
                C0265j.m1082f(background, c0290v1, this.f1816a.getDrawableState());
                return;
            }
            C0290v0 c0290v2 = this.f1819d;
            if (c0290v2 != null) {
                C0265j.m1082f(background, c0290v2, this.f1816a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m1052b() {
        C0290v0 c0290v0 = this.f1820e;
        if (c0290v0 != null) {
            return c0290v0.f2018a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode m1053c() {
        C0290v0 c0290v0 = this.f1820e;
        if (c0290v0 != null) {
            return c0290v0.f2019b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public void m1054d(AttributeSet attributeSet, int i) {
        int i2 = Build.VERSION.SDK_INT;
        C0294x0 c0294x0M1152q = C0294x0.m1152q(this.f1816a.getContext(), attributeSet, C0184b.f1198A, i, 0);
        try {
            if (c0294x0M1152q.m1167o(0)) {
                this.f1818c = c0294x0M1152q.m1164l(0, -1);
                ColorStateList colorStateListM1084d = this.f1817b.m1084d(this.f1816a.getContext(), this.f1818c);
                if (colorStateListM1084d != null) {
                    m1057g(colorStateListM1084d);
                }
            }
            if (c0294x0M1152q.m1167o(1)) {
                View view = this.f1816a;
                ColorStateList colorStateListM1155c = c0294x0M1152q.m1155c(1);
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (i2 >= 21) {
                    view.setBackgroundTintList(colorStateListM1155c);
                    if (i2 == 21) {
                        Drawable background = view.getBackground();
                        boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                        if (background != null && z) {
                            if (background.isStateful()) {
                                background.setState(view.getDrawableState());
                            }
                            view.setBackground(background);
                        }
                    }
                } else if (view instanceof InterfaceC0417l) {
                    ((InterfaceC0417l) view).setSupportBackgroundTintList(colorStateListM1155c);
                }
            }
            if (c0294x0M1152q.m1167o(2)) {
                View view2 = this.f1816a;
                PorterDuff.Mode modeM1063d = C0255e0.m1063d(c0294x0M1152q.m1162j(2, -1), null);
                WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                if (i2 >= 21) {
                    view2.setBackgroundTintMode(modeM1063d);
                    if (i2 == 21) {
                        Drawable background2 = view2.getBackground();
                        boolean z2 = (view2.getBackgroundTintList() == null && view2.getBackgroundTintMode() == null) ? false : true;
                        if (background2 != null && z2) {
                            if (background2.isStateful()) {
                                background2.setState(view2.getDrawableState());
                            }
                            view2.setBackground(background2);
                        }
                    }
                } else if (view2 instanceof InterfaceC0417l) {
                    ((InterfaceC0417l) view2).setSupportBackgroundTintMode(modeM1063d);
                }
            }
        } finally {
            c0294x0M1152q.f2052b.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1055e() {
        this.f1818c = -1;
        m1057g(null);
        m1051a();
    }

    /* JADX INFO: renamed from: f */
    public void m1056f(int i) {
        this.f1818c = i;
        C0265j c0265j = this.f1817b;
        m1057g(c0265j != null ? c0265j.m1084d(this.f1816a.getContext(), i) : null);
        m1051a();
    }

    /* JADX INFO: renamed from: g */
    public void m1057g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1819d == null) {
                this.f1819d = new C0290v0();
            }
            C0290v0 c0290v0 = this.f1819d;
            c0290v0.f2018a = colorStateList;
            c0290v0.f2021d = true;
        } else {
            this.f1819d = null;
        }
        m1051a();
    }

    /* JADX INFO: renamed from: h */
    public void m1058h(ColorStateList colorStateList) {
        if (this.f1820e == null) {
            this.f1820e = new C0290v0();
        }
        C0290v0 c0290v0 = this.f1820e;
        c0290v0.f2018a = colorStateList;
        c0290v0.f2021d = true;
        m1051a();
    }

    /* JADX INFO: renamed from: i */
    public void m1059i(PorterDuff.Mode mode) {
        if (this.f1820e == null) {
            this.f1820e = new C0290v0();
        }
        C0290v0 c0290v0 = this.f1820e;
        c0290v0.f2019b = mode;
        c0290v0.f2020c = true;
        m1051a();
    }
}
