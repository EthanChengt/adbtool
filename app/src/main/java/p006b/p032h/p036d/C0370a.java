package p006b.p032h.p036d;

import android.graphics.Color;

/* JADX INFO: renamed from: b.h.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0370a {
    static {
        new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static int m1487a(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, m1488b(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), m1488b(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), m1488b(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    /* JADX INFO: renamed from: b */
    public static int m1488b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* JADX INFO: renamed from: c */
    public static int m1489c(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
