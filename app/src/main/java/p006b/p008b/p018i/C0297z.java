package p006b.p008b.p018i;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p006b.p008b.C0183a;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0365c;
import p006b.p032h.p036d.C0372c;
import p006b.p032h.p036d.C0379j;
import p006b.p032h.p042h.C0397b;
import p006b.p032h.p044j.InterfaceC0417l;
import p006b.p032h.p046k.InterfaceC0433b;
import p006b.p032h.p046k.InterfaceC0437f;

/* JADX INFO: renamed from: b.b.i.z */
/* JADX INFO: loaded from: classes.dex */
public class C0297z extends TextView implements InterfaceC0417l, InterfaceC0437f, InterfaceC0433b {

    /* JADX INFO: renamed from: b */
    public final C0254e f2074b;

    /* JADX INFO: renamed from: c */
    public final C0295y f2075c;

    /* JADX INFO: renamed from: d */
    public final C0293x f2076d;

    /* JADX INFO: renamed from: e */
    public Future<C0397b> f2077e;

    public C0297z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0297z(Context context, AttributeSet attributeSet, int i) {
        super(C0288u0.m1135a(context), attributeSet, i);
        C0254e c0254e = new C0254e(this);
        this.f2074b = c0254e;
        c0254e.m1054d(attributeSet, i);
        C0295y c0295y = new C0295y(this);
        this.f2075c = c0295y;
        c0295y.m1172e(attributeSet, i);
        c0295y.m1170b();
        this.f2076d = new C0293x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254e c0254e = this.f2074b;
        if (c0254e != null) {
            c0254e.m1051a();
        }
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0433b.f2789a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0295y c0295y = this.f2075c;
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
        C0295y c0295y = this.f2075c;
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
        C0295y c0295y = this.f2075c;
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
        C0295y c0295y = this.f2075c;
        return c0295y != null ? c0295y.f2062i.f1757f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0433b.f2789a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            return c0295y.f2062i.f1752a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        C0254e c0254e = this.f2074b;
        if (c0254e != null) {
            return c0254e.m1052b();
        }
        return null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254e c0254e = this.f2074b;
        if (c0254e != null) {
            return c0254e.m1053c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0290v0 c0290v0 = this.f2075c.f2061h;
        if (c0290v0 != null) {
            return c0290v0.f2018a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0290v0 c0290v0 = this.f2075c.f2061h;
        if (c0290v0 != null) {
            return c0290v0.f2019b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<C0397b> future = this.f2077e;
        if (future != null) {
            try {
                this.f2077e = null;
                C0360f.m1430V(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0293x c0293x;
        return (Build.VERSION.SDK_INT >= 28 || (c0293x = this.f2076d) == null) ? super.getTextClassifier() : c0293x.m1150a();
    }

    public C0397b.a getTextMetricsParamsCompat() {
        return C0360f.m1466z(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0183a.m755b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0295y c0295y = this.f2075c;
        if (c0295y == null || InterfaceC0433b.f2789a) {
            return;
        }
        c0295y.f2062i.m1003a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<C0397b> future = this.f2077e;
        if (future != null) {
            try {
                this.f2077e = null;
                C0360f.m1430V(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0295y c0295y = this.f2075c;
        if (c0295y == null || InterfaceC0433b.f2789a || !c0295y.m1171d()) {
            return;
        }
        this.f2075c.f2062i.m1003a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0433b.f2789a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0295y c0295y = this.f2075c;
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
        C0295y c0295y = this.f2075c;
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
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1176i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254e c0254e = this.f2074b;
        if (c0254e != null) {
            c0254e.m1055e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254e c0254e = this.f2074b;
        if (c0254e != null) {
            c0254e.m1056f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0208a.m884b(context, i) : null, i2 != 0 ? C0208a.m884b(context, i2) : null, i3 != 0 ? C0208a.m884b(context, i3) : null, i4 != 0 ? C0208a.m884b(context, i4) : null);
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0208a.m884b(context, i) : null, i2 != 0 ? C0208a.m884b(context, i2) : null, i3 != 0 ? C0208a.m884b(context, i3) : null, i4 != 0 ? C0208a.m884b(context, i4) : null);
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0360f.m1446f0(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0360f.m1423O(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0360f.m1426R(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0360f.m1428T(this, i);
    }

    public void setPrecomputedText(C0397b c0397b) {
        C0360f.m1430V(this, c0397b);
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254e c0254e = this.f2074b;
        if (c0254e != null) {
            c0254e.m1058h(colorStateList);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254e c0254e = this.f2074b;
        if (c0254e != null) {
            c0254e.m1059i(mode);
        }
    }

    @Override // p006b.p032h.p046k.InterfaceC0437f
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0295y c0295y = this.f2075c;
        if (c0295y.f2061h == null) {
            c0295y.f2061h = new C0290v0();
        }
        C0290v0 c0290v0 = c0295y.f2061h;
        c0290v0.f2018a = colorStateList;
        c0290v0.f2021d = colorStateList != null;
        c0295y.f2055b = c0290v0;
        c0295y.f2056c = c0290v0;
        c0295y.f2057d = c0290v0;
        c0295y.f2058e = c0290v0;
        c0295y.f2059f = c0290v0;
        c0295y.f2060g = c0290v0;
        c0295y.m1170b();
    }

    @Override // p006b.p032h.p046k.InterfaceC0437f
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0295y c0295y = this.f2075c;
        if (c0295y.f2061h == null) {
            c0295y.f2061h = new C0290v0();
        }
        C0290v0 c0290v0 = c0295y.f2061h;
        c0290v0.f2019b = mode;
        c0290v0.f2020c = mode != null;
        c0295y.f2055b = c0290v0;
        c0295y.f2056c = c0290v0;
        c0295y.f2057d = c0290v0;
        c0295y.f2058e = c0290v0;
        c0295y.f2059f = c0290v0;
        c0295y.f2060g = c0290v0;
        c0295y.m1170b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1173f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0293x c0293x;
        if (Build.VERSION.SDK_INT >= 28 || (c0293x = this.f2076d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0293x.f2050b = textClassifier;
        }
    }

    public void setTextFuture(Future<C0397b> future) {
        this.f2077e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0397b.a aVar) {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f2683b;
        int i2 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        if (i >= 23) {
            getPaint().set(aVar.f2682a);
            setBreakStrategy(aVar.f2684c);
            setHyphenationFrequency(aVar.f2685d);
        } else {
            float textScaleX = aVar.f2682a.getTextScaleX();
            getPaint().set(aVar.f2682a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC0433b.f2789a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0295y c0295y = this.f2075c;
        if (c0295y == null || z || c0295y.m1171d()) {
            return;
        }
        c0295y.f2062i.m1006f(i, f);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate = null;
        if (typeface != null && i > 0) {
            Context context = getContext();
            C0379j c0379j = C0372c.f2593a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            if (Build.VERSION.SDK_INT < 21) {
                C0379j c0379j2 = C0372c.f2593a;
                Objects.requireNonNull(c0379j2);
                long jM1515f = C0379j.m1515f(typeface);
                C0365c c0365c = jM1515f == 0 ? null : c0379j2.f2611a.get(Long.valueOf(jM1515f));
                typefaceCreate = c0365c != null ? c0379j2.mo1497a(context, c0365c, context.getResources(), i) : null;
                if (typefaceCreate == null) {
                    typefaceCreate = Typeface.create(typeface, i);
                }
            } else {
                typefaceCreate = Typeface.create(typeface, i);
            }
        }
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0295y c0295y = this.f2075c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }
}
