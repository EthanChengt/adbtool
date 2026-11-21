package p006b.p008b.p018i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p036d.C0370a;

/* JADX INFO: renamed from: b.b.i.s0 */
/* JADX INFO: loaded from: classes.dex */
public class C0284s0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f1998a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final int[] f1999b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f2000c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f2001d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f2002e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f2003f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f2004g = new int[1];

    /* JADX INFO: renamed from: a */
    public static int m1130a(Context context, int i) {
        ColorStateList colorStateListM1132c = m1132c(context, i);
        if (colorStateListM1132c != null && colorStateListM1132c.isStateful()) {
            return colorStateListM1132c.getColorForState(f1999b, colorStateListM1132c.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1998a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM1131b = m1131b(context, i);
        return C0370a.m1489c(iM1131b, Math.round(Color.alpha(iM1131b) * f));
    }

    /* JADX INFO: renamed from: b */
    public static int m1131b(Context context, int i) {
        int[] iArr = f2004g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m1132c(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2004g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C0208a.m883a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
