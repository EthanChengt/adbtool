package p006b.p025e;

/* JADX INFO: renamed from: b.e.d */
/* JADX INFO: loaded from: classes.dex */
public class C0316d {

    /* JADX INFO: renamed from: a */
    public static final int[] f2161a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f2162b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f2163c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static int m1243a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }

    /* JADX INFO: renamed from: b */
    public static int m1244b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1245c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: d */
    public static int m1246d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static int m1247e(int i) {
        return m1246d(i * 4) / 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m1248f(int i) {
        return m1246d(i * 8) / 8;
    }
}
