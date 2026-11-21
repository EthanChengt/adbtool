package p080c.p084b.p085a.p111s;

import android.os.SystemClock;

/* JADX INFO: renamed from: c.b.a.s.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0871f {

    /* JADX INFO: renamed from: a */
    public static final double f4731a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4732b = 0;

    /* JADX INFO: renamed from: a */
    public static double m2603a(long j) {
        double dElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - j;
        double d = f4731a;
        Double.isNaN(dElapsedRealtimeNanos);
        return dElapsedRealtimeNanos * d;
    }
}
