package p006b.p073w;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: b.w.f */
/* JADX INFO: loaded from: classes.dex */
public class C0581f<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a */
    public final Property<T, PointF> f3568a;

    /* JADX INFO: renamed from: b */
    public final PathMeasure f3569b;

    /* JADX INFO: renamed from: c */
    public final float f3570c;

    /* JADX INFO: renamed from: d */
    public final float[] f3571d;

    /* JADX INFO: renamed from: e */
    public final PointF f3572e;

    /* JADX INFO: renamed from: f */
    public float f3573f;

    public C0581f(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f3571d = new float[2];
        this.f3572e = new PointF();
        this.f3568a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f3569b = pathMeasure;
        this.f3570c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    public Float get(Object obj) {
        return Float.valueOf(this.f3573f);
    }

    @Override // android.util.Property
    public void set(Object obj, Float f) {
        Float f2 = f;
        this.f3573f = f2.floatValue();
        this.f3569b.getPosTan(f2.floatValue() * this.f3570c, this.f3571d, null);
        PointF pointF = this.f3572e;
        float[] fArr = this.f3571d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f3568a.set(obj, pointF);
    }
}
