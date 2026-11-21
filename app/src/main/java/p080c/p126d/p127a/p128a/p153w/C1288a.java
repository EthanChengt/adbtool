package p080c.p126d.p127a.p128a.p153w;

import android.graphics.Paint;
import android.graphics.Path;
import p006b.p032h.p036d.C0370a;

/* JADX INFO: renamed from: c.d.a.a.w.a */
/* JADX INFO: loaded from: classes.dex */
public class C1288a {

    /* JADX INFO: renamed from: h */
    public static final int[] f6196h = new int[3];

    /* JADX INFO: renamed from: i */
    public static final float[] f6197i = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: j */
    public static final int[] f6198j = new int[4];

    /* JADX INFO: renamed from: k */
    public static final float[] f6199k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f6200a;

    /* JADX INFO: renamed from: b */
    public final Paint f6201b;

    /* JADX INFO: renamed from: c */
    public final Paint f6202c;

    /* JADX INFO: renamed from: d */
    public int f6203d;

    /* JADX INFO: renamed from: e */
    public int f6204e;

    /* JADX INFO: renamed from: f */
    public int f6205f;

    /* JADX INFO: renamed from: g */
    public final Path f6206g = new Path();

    public C1288a() {
        m2957a(-16777216);
        Paint paint = new Paint(4);
        this.f6201b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6200a = paint2;
        paint2.setColor(this.f6203d);
        this.f6202c = new Paint(paint);
    }

    /* JADX INFO: renamed from: a */
    public void m2957a(int i) {
        this.f6203d = C0370a.m1489c(i, 68);
        this.f6204e = C0370a.m1489c(i, 20);
        this.f6205f = C0370a.m1489c(i, 0);
    }
}
