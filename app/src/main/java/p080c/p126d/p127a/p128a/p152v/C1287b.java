package p080c.p126d.p127a.p128a.p152v;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import p006b.p032h.p036d.C0370a;

/* JADX INFO: renamed from: c.d.a.a.v.b */
/* JADX INFO: loaded from: classes.dex */
public class C1287b {

    /* JADX INFO: renamed from: a */
    public static final boolean f6184a;

    /* JADX INFO: renamed from: b */
    public static final int[] f6185b;

    /* JADX INFO: renamed from: c */
    public static final int[] f6186c;

    /* JADX INFO: renamed from: d */
    public static final int[] f6187d;

    /* JADX INFO: renamed from: e */
    public static final int[] f6188e;

    /* JADX INFO: renamed from: f */
    public static final int[] f6189f;

    /* JADX INFO: renamed from: g */
    public static final int[] f6190g;

    /* JADX INFO: renamed from: h */
    public static final int[] f6191h;

    /* JADX INFO: renamed from: i */
    public static final int[] f6192i;

    /* JADX INFO: renamed from: j */
    public static final int[] f6193j;

    /* JADX INFO: renamed from: k */
    public static final int[] f6194k;

    /* JADX INFO: renamed from: l */
    public static final String f6195l;

    static {
        f6184a = Build.VERSION.SDK_INT >= 21;
        f6185b = new int[]{R.attr.state_pressed};
        f6186c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f6187d = new int[]{R.attr.state_focused};
        f6188e = new int[]{R.attr.state_hovered};
        f6189f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f6190g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f6191h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f6192i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f6193j = new int[]{R.attr.state_selected};
        f6194k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f6195l = C1287b.class.getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public static int m2954a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f6184a ? C0370a.m1489c(colorForState, Math.min(Color.alpha(colorForState) * 2, 255)) : colorForState;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2955b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f6194k, 0)) != 0) {
            Log.w(f6195l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2956c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
