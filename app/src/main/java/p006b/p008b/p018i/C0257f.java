package p006b.p008b.p018i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.didjdk.adbhelper.R;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.InterfaceC0417l;
import p006b.p032h.p046k.InterfaceC0433b;

/* JADX INFO: renamed from: b.b.i.f */
/* JADX INFO: loaded from: classes.dex */
public class C0257f extends Button implements InterfaceC0417l, InterfaceC0433b {

    /* JADX INFO: renamed from: b */
    public final C0254e f1826b;

    /* JADX INFO: renamed from: c */
    public final C0295y f1827c;

    public C0257f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.c8);
    }

    public C0257f(Context context, AttributeSet attributeSet, int i) {
        super(C0288u0.m1135a(context), attributeSet, i);
        C0254e c0254e = new C0254e(this);
        this.f1826b = c0254e;
        c0254e.m1054d(attributeSet, i);
        C0295y c0295y = new C0295y(this);
        this.f1827c = c0295y;
        c0295y.m1172e(attributeSet, i);
        c0295y.m1170b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254e c0254e = this.f1826b;
        if (c0254e != null) {
            c0254e.m1051a();
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0433b.f2789a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            return Math.round(c0295y.f2062i.f1756e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0433b.f2789a) {
            return super.getAutoSizeMinTextSize();
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            return Math.round(c0295y.f2062i.f1755d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0433b.f2789a) {
            return super.getAutoSizeStepGranularity();
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            return Math.round(c0295y.f2062i.f1754c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0433b.f2789a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0295y c0295y = this.f1827c;
        return c0295y != null ? c0295y.f2062i.f1757f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0433b.f2789a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            return c0295y.f2062i.f1752a;
        }
        return 0;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        C0254e c0254e = this.f1826b;
        if (c0254e != null) {
            return c0254e.m1052b();
        }
        return null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254e c0254e = this.f1826b;
        if (c0254e != null) {
            return c0254e.m1053c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0295y c0295y = this.f1827c;
        if (c0295y == null || InterfaceC0433b.f2789a) {
            return;
        }
        c0295y.f2062i.m1003a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0295y c0295y = this.f1827c;
        if (c0295y == null || InterfaceC0433b.f2789a || !c0295y.m1171d()) {
            return;
        }
        this.f1827c.f2062i.m1003a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0433b.f2789a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            c0295y.m1174g(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0433b.f2789a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            c0295y.m1175h(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0433b.f2789a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            c0295y.m1176i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254e c0254e = this.f1826b;
        if (c0254e != null) {
            c0254e.m1055e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254e c0254e = this.f1826b;
        if (c0254e != null) {
            c0254e.m1056f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0360f.m1446f0(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            c0295y.f2054a.setAllCaps(z);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254e c0254e = this.f1826b;
        if (c0254e != null) {
            c0254e.m1058h(colorStateList);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254e c0254e = this.f1826b;
        if (c0254e != null) {
            c0254e.m1059i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0295y c0295y = this.f1827c;
        if (c0295y != null) {
            c0295y.m1173f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC0433b.f2789a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0295y c0295y = this.f1827c;
        if (c0295y == null || z || c0295y.m1171d()) {
            return;
        }
        c0295y.f2062i.m1006f(i, f);
    }
}
