package p006b.p008b.p018i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p046k.InterfaceC0436e;

/* JADX INFO: renamed from: b.b.i.i */
/* JADX INFO: loaded from: classes.dex */
public class C0263i {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f1859a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1860b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1861c = null;

    /* JADX INFO: renamed from: d */
    public boolean f1862d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1863e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1864f;

    public C0263i(CompoundButton compoundButton) {
        this.f1859a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public void m1069a() {
        Drawable drawableM1459s = C0360f.m1459s(this.f1859a);
        if (drawableM1459s != null) {
            if (this.f1862d || this.f1863e) {
                Drawable drawableMutate = C0360f.m1444e0(drawableM1459s).mutate();
                if (this.f1862d) {
                    C0360f.m1433Y(drawableMutate, this.f1860b);
                }
                if (this.f1863e) {
                    C0360f.m1434Z(drawableMutate, this.f1861c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1859a.getDrawableState());
                }
                this.f1859a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m1070b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        TypedArray typedArrayObtainStyledAttributes = this.f1859a.getContext().obtainStyledAttributes(attributeSet, C0184b.f1211l, i, 0);
        boolean z = true;
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton = this.f1859a;
                    compoundButton.setButtonDrawable(C0208a.m884b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z && typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
                CompoundButton compoundButton2 = this.f1859a;
                compoundButton2.setButtonDrawable(C0208a.m884b(compoundButton2.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                C0360f.m1421M(this.f1859a, typedArrayObtainStyledAttributes.getColorStateList(2));
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                CompoundButton compoundButton3 = this.f1859a;
                PorterDuff.Mode modeM1063d = C0255e0.m1063d(typedArrayObtainStyledAttributes.getInt(3, -1), null);
                if (Build.VERSION.SDK_INT >= 21) {
                    compoundButton3.setButtonTintMode(modeM1063d);
                } else if (compoundButton3 instanceof InterfaceC0436e) {
                    ((InterfaceC0436e) compoundButton3).setSupportButtonTintMode(modeM1063d);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
