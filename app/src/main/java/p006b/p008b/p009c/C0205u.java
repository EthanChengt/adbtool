package p006b.p008b.p009c;

/* JADX INFO: renamed from: b.b.c.u */
/* JADX INFO: loaded from: classes.dex */
public class C0205u {

    /* JADX INFO: renamed from: d */
    public static C0205u f1360d;

    /* JADX INFO: renamed from: a */
    public long f1361a;

    /* JADX INFO: renamed from: b */
    public long f1362b;

    /* JADX INFO: renamed from: c */
    public int f1363c;

    /* JADX INFO: renamed from: a */
    public void m862a(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double dSin2 = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + dSin + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = f - 9.0E-4f;
        Double.isNaN(d5);
        double dRound = Math.round(d5 - d4) + 9.0E-4f;
        Double.isNaN(dRound);
        double dSin3 = (Math.sin(2.0d * dSin2) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + dRound + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin2));
        double d6 = 0.01745329238474369d * d;
        double dSin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d6))) / (Math.cos(dAsin) * Math.cos(d6));
        if (dSin4 >= 1.0d) {
            this.f1363c = 1;
        } else {
            if (dSin4 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin4) / 6.283185307179586d);
                Double.isNaN(dAcos);
                this.f1361a = Math.round((dSin3 + dAcos) * 8.64E7d) + 946728000000L;
                Double.isNaN(dAcos);
                long jRound = Math.round((dSin3 - dAcos) * 8.64E7d) + 946728000000L;
                this.f1362b = jRound;
                if (jRound >= j || this.f1361a <= j) {
                    this.f1363c = 1;
                    return;
                } else {
                    this.f1363c = 0;
                    return;
                }
            }
            this.f1363c = 0;
        }
        this.f1361a = -1L;
        this.f1362b = -1L;
    }
}
