package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.didjdk.adbhelper.R;
import p006b.p008b.C0183a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.InterfaceC0417l;

/* JADX INFO: renamed from: b.b.i.k */
/* JADX INFO: loaded from: classes.dex */
public class C0267k extends EditText implements InterfaceC0417l {

    /* JADX INFO: renamed from: b */
    public final C0254e f1892b;

    /* JADX INFO: renamed from: c */
    public final C0295y f1893c;

    /* JADX INFO: renamed from: d */
    public final C0293x f1894d;

    public C0267k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.g_);
    }

    public C0267k(Context context, AttributeSet attributeSet, int i) {
        super(C0288u0.m1135a(context), attributeSet, i);
        C0254e c0254e = new C0254e(this);
        this.f1892b = c0254e;
        c0254e.m1054d(attributeSet, i);
        C0295y c0295y = new C0295y(this);
        this.f1893c = c0295y;
        c0295y.m1172e(attributeSet, i);
        c0295y.m1170b();
        this.f1894d = new C0293x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254e c0254e = this.f1892b;
        if (c0254e != null) {
            c0254e.m1051a();
        }
        C0295y c0295y = this.f1893c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        C0254e c0254e = this.f1892b;
        if (c0254e != null) {
            return c0254e.m1052b();
        }
        return null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254e c0254e = this.f1892b;
        if (c0254e != null) {
            return c0254e.m1053c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0293x c0293x;
        return (Build.VERSION.SDK_INT >= 28 || (c0293x = this.f1894d) == null) ? super.getTextClassifier() : c0293x.m1150a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0183a.m755b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254e c0254e = this.f1892b;
        if (c0254e != null) {
            c0254e.m1055e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254e c0254e = this.f1892b;
        if (c0254e != null) {
            c0254e.m1056f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0360f.m1446f0(this, callback));
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254e c0254e = this.f1892b;
        if (c0254e != null) {
            c0254e.m1058h(colorStateList);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254e c0254e = this.f1892b;
        if (c0254e != null) {
            c0254e.m1059i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0295y c0295y = this.f1893c;
        if (c0295y != null) {
            c0295y.m1173f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0293x c0293x;
        if (Build.VERSION.SDK_INT >= 28 || (c0293x = this.f1894d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0293x.f2050b = textClassifier;
        }
    }
}
