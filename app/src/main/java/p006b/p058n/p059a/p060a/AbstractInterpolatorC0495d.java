package p006b.p058n.p059a.p060a;

import android.view.animation.Interpolator;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.n.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC0495d implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f3171a;

    /* JADX INFO: renamed from: b */
    public final float f3172b;

    public AbstractInterpolatorC0495d(float[] fArr) {
        this.f3171a = fArr;
        this.f3172b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3171a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f3172b;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f3171a;
        return a.m2187a(fArr2[iMin + 1], fArr2[iMin], f3, fArr2[iMin]);
    }
}
