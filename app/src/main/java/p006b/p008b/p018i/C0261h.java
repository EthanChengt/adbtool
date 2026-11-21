package p006b.p008b.p018i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p006b.p008b.C0183a;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;

/* JADX INFO: renamed from: b.b.i.h */
/* JADX INFO: loaded from: classes.dex */
public class C0261h extends CheckedTextView {

    /* JADX INFO: renamed from: c */
    public static final int[] f1846c = {R.attr.checkMark};

    /* JADX INFO: renamed from: b */
    public final C0295y f1847b;

    public C0261h(Context context, AttributeSet attributeSet) {
        super(C0288u0.m1135a(context), attributeSet, R.attr.checkedTextViewStyle);
        C0295y c0295y = new C0295y(this);
        this.f1847b = c0295y;
        c0295y.m1172e(attributeSet, R.attr.checkedTextViewStyle);
        c0295y.m1170b();
        C0294x0 c0294x0M1152q = C0294x0.m1152q(getContext(), attributeSet, f1846c, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(c0294x0M1152q.m1159g(0));
        c0294x0M1152q.f2052b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0295y c0295y = this.f1847b;
        if (c0295y != null) {
            c0295y.m1170b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0183a.m755b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0208a.m884b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0360f.m1446f0(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0295y c0295y = this.f1847b;
        if (c0295y != null) {
            c0295y.m1173f(context, i);
        }
    }
}
