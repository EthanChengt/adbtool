package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import p006b.p008b.p009c.C0200p;
import p006b.p008b.p009c.LayoutInflaterFactory2C0197m;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p018i.InterfaceC0249c0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public TypedValue f243b;

    /* JADX INFO: renamed from: c */
    public TypedValue f244c;

    /* JADX INFO: renamed from: d */
    public TypedValue f245d;

    /* JADX INFO: renamed from: e */
    public TypedValue f246e;

    /* JADX INFO: renamed from: f */
    public TypedValue f247f;

    /* JADX INFO: renamed from: g */
    public TypedValue f248g;

    /* JADX INFO: renamed from: h */
    public final Rect f249h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0037a f250i;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0037a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f249h = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public void m67a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f247f == null) {
            this.f247f = new TypedValue();
        }
        return this.f247f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f248g == null) {
            this.f248g = new TypedValue();
        }
        return this.f248g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f245d == null) {
            this.f245d = new TypedValue();
        }
        return this.f245d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f246e == null) {
            this.f246e = new TypedValue();
        }
        return this.f246e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f243b == null) {
            this.f243b = new TypedValue();
        }
        return this.f243b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f244c == null) {
            this.f244c = new TypedValue();
        }
        return this.f244c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0037a interfaceC0037a = this.f250i;
        if (interfaceC0037a != null) {
            Objects.requireNonNull((C0200p) interfaceC0037a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0037a interfaceC0037a = this.f250i;
        if (interfaceC0037a != null) {
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = ((C0200p) interfaceC0037a).f1339a;
            InterfaceC0249c0 interfaceC0249c0 = layoutInflaterFactory2C0197m.f1289l;
            if (interfaceC0249c0 != null) {
                interfaceC0249c0.mo44l();
            }
            if (layoutInflaterFactory2C0197m.f1294q != null) {
                layoutInflaterFactory2C0197m.f1283f.getDecorView().removeCallbacks(layoutInflaterFactory2C0197m.f1295r);
                if (layoutInflaterFactory2C0197m.f1294q.isShowing()) {
                    try {
                        layoutInflaterFactory2C0197m.f1294q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0197m.f1294q = null;
            }
            layoutInflaterFactory2C0197m.m830I();
            C0229g c0229g = layoutInflaterFactory2C0197m.m835N(0).f1326h;
            if (c0229g != null) {
                c0229g.m943c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f246e : this.f245d;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        Rect rect = this.f249h;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    Rect rect2 = this.f249h;
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f247f : this.f248g;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        Rect rect3 = this.f249h;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    Rect rect4 = this.f249h;
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f244c : this.f243b;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        Rect rect5 = this.f249h;
                        i4 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    Rect rect6 = this.f249h;
                    i4 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(InterfaceC0037a interfaceC0037a) {
        this.f250i = interfaceC0037a;
    }
}
