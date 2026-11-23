package p080c.p126d.p127a.p128a.p131c;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: renamed from: c.d.a.a.c.f */
/* JADX INFO: loaded from: classes.dex */
public class C1187f implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a */
    public final float[] f5672a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f5673b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f5674c = new Matrix();

    @Override
    public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
        startValue.getValues(this.f5672a);
        endValue.getValues(this.f5673b);
        for (int i = 0; i < 9; i++) {
            this.f5672a[i] += fraction * (this.f5673b[i] - this.f5672a[i]);
        }
        this.f5674c.setValues(this.f5672a);
        return this.f5674c;
    }
}
