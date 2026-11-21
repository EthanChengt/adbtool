package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;

/* JADX INFO: renamed from: b.b.i.p */
/* JADX INFO: loaded from: classes.dex */
public class C0277p extends PopupWindow {

    /* JADX INFO: renamed from: b */
    public static final boolean f1956b;

    /* JADX INFO: renamed from: a */
    public boolean f1957a;

    static {
        f1956b = Build.VERSION.SDK_INT < 21;
    }

    public C0277p(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1218s, i, i2);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(2, false);
            if (f1956b) {
                this.f1957a = z;
            } else {
                C0360f.m1429U(this, z);
            }
        }
        setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C0208a.m884b(context, resourceId));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1956b && this.f1957a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1956b && this.f1957a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1956b && this.f1957a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
