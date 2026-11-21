package p080c.p126d.p127a.p128a.p148r;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.didjdk.adbhelper.R;
import p006b.p008b.p016h.C0217c;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: renamed from: c.d.a.a.r.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1277n {

    /* JADX INFO: renamed from: a */
    public static final int[] f6151a = {R.attr.e2};

    /* JADX INFO: renamed from: b */
    public static final int[] f6152b = {R.attr.e5};

    /* JADX INFO: renamed from: c */
    public static final int[] f6153c = {android.R.attr.theme, R.attr.rk};

    /* JADX INFO: renamed from: d */
    public static final int[] f6154d = {R.attr.mf};

    /* JADX INFO: renamed from: a */
    public static void m2943a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5562B, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.iv, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m2945c(context, f6152b, "Theme.MaterialComponents");
            }
        }
        m2945c(context, f6151a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m2944b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5562B, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: c */
    public static void m2945c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                if (z) {
                    throw new IllegalArgumentException(a.m2202p("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        z = true;
        if (z) {
            throw new IllegalArgumentException(a.m2202p("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* JADX INFO: renamed from: d */
    public static Context m2946d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6154d, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return context;
        }
        if ((context instanceof C0217c) && ((C0217c) context).f1484a == resourceId) {
            return context;
        }
        C0217c c0217c = new C0217c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = c0217c.obtainStyledAttributes(attributeSet, f6153c);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        return resourceId2 != 0 ? new C0217c(c0217c, resourceId2) : c0217c;
    }

    /* JADX INFO: renamed from: e */
    public static TypedArray m2947e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2943a(context, attributeSet, i, i2);
        m2944b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
