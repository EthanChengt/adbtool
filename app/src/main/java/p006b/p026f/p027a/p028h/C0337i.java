package p006b.p026f.p027a.p028h;

/* JADX INFO: renamed from: b.f.a.h.i */
/* JADX INFO: loaded from: classes.dex */
public class C0337i {

    /* JADX INFO: renamed from: a */
    public static boolean[] f2394a = new boolean[3];

    /* JADX INFO: renamed from: a */
    public static boolean m1377a(C0332d c0332d, int i) {
        C0332d.a[] aVarArr = c0332d.f2298C;
        if (aVarArr[i] != C0332d.a.MATCH_CONSTRAINT) {
            return false;
        }
        if (c0332d.f2302G != 0.0f) {
            C0332d.a aVar = aVarArr[i != 0 ? (char) 0 : (char) 1];
            return false;
        }
        if (i == 0) {
            if (c0332d.f2330e != 0 || c0332d.f2336h != 0 || c0332d.f2338i != 0) {
                return false;
            }
        } else if (c0332d.f2332f != 0 || c0332d.f2340k != 0 || c0332d.f2341l != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m1378b(C0332d c0332d, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        C0331c[] c0331cArr = c0332d.f2296A;
        c0331cArr[i3].f2273a.f2398f = c0332d.f2299D.f2348s.f2273a;
        c0331cArr[i3].f2273a.f2399g = i2;
        c0331cArr[i3].f2273a.f2408b = 1;
        c0331cArr[i4].f2273a.f2398f = c0331cArr[i3].f2273a;
        c0331cArr[i4].f2273a.f2399g = c0332d.m1351j(i);
        c0332d.f2296A[i4].f2273a.f2408b = 1;
    }
}
