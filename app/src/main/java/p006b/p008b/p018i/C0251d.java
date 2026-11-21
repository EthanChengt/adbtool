package p006b.p008b.p018i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p006b.p008b.C0183a;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.InterfaceC0417l;

/* JADX INFO: renamed from: b.b.i.d */
/* JADX INFO: loaded from: classes.dex */
public class C0251d extends AutoCompleteTextView implements InterfaceC0417l {

    /* JADX INFO: renamed from: d */
    public static final int[] f1812d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b */
    public final C0254e f1813b;

    /* JADX INFO: renamed from: c */
    public final C0295y f1814c;

    public C0251d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.didjdk.adbhelper.R.attr.an);
    }

    public C0251d(Context context, AttributeSet attributeSet, int i) {
        super(C0288u0.m1135a(context), attributeSet, i);
        C0294x0 c0294x0M1152q = C0294x0.m1152q(getContext(), attributeSet, f1812d, i, 0);
        if (c0294x0M1152q.m1167o(0)) {
            setDropDownBackgroundDrawable(c0294x0M1152q.m1159g(0));
        }
        c0294x0M1152q.f2052b.recycle();
        C0254e c0254e = new C0254e(this);
        this.f1813b = c0254e;
        c0254e.m1054d(attributeSet, i);
        C0295y c0295y = new C0295y(this);
        this.f1814c = c0295y;
        c0295y.m1172e(attributeSet, i);
        c0295y.m1170b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254e c0254e = this.f1813b;
        if (c0254e != null) {
            c0254e.m1051a();
        }
        C0295y c0295y = this.f1814c;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        C0254e c0254e = this.f1813b;
        if (c0254e != null) {
            return c0254e.m1052b();
        }
        return null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254e c0254e = this.f1813b;
        if (c0254e != null) {
            return c0254e.m1053c();
        }
        return null;
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
        C0254e c0254e = this.f1813b;
        if (c0254e != null) {
            c0254e.m1055e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254e c0254e = this.f1813b;
        if (c0254e != null) {
            c0254e.m1056f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0360f.m1446f0(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0208a.m884b(getContext(), i));
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254e c0254e = this.f1813b;
        if (c0254e != null) {
            c0254e.m1058h(colorStateList);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254e c0254e = this.f1813b;
        if (c0254e != null) {
            c0254e.m1059i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0295y c0295y = this.f1814c;
        if (c0295y != null) {
            c0295y.m1173f(context, i);
        }
    }
}
