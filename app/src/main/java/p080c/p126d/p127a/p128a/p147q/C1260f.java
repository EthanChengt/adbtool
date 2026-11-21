package p080c.p126d.p127a.p128a.p147q;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: c.d.a.a.q.f */
/* JADX INFO: loaded from: classes.dex */
public class C1260f implements TypeEvaluator<Float> {

    /* JADX INFO: renamed from: a */
    public FloatEvaluator f6047a = new FloatEvaluator();

    public C1260f(C1259e c1259e) {
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f, Float f2, Float f3) {
        float fFloatValue = this.f6047a.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
