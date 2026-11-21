package p006b.p074x.p075a.p076a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0369g;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.x.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public class InterpolatorC0606e implements Interpolator {

    /* JADX INFO: renamed from: a */
    public float[] f3666a;

    /* JADX INFO: renamed from: b */
    public float[] f3667b;

    public InterpolatorC0606e(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM1484k = C0369g.m1484k(context.getResources(), context.getTheme(), attributeSet, C0602a.f3652l);
        if (C0369g.m1482i(xmlPullParser, "pathData")) {
            String strM1478e = C0369g.m1478e(typedArrayM1484k, xmlPullParser, "pathData", 4);
            Path pathM1456p = C0360f.m1456p(strM1478e);
            if (pathM1456p == null) {
                throw new InflateException(a.m2201o("The path is null, which is created from ", strM1478e));
            }
            m2153a(pathM1456p);
        } else {
            if (!C0369g.m1482i(xmlPullParser, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
            if (!C0369g.m1482i(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float f = !C0369g.m1482i(xmlPullParser, "controlX1") ? 0.0f : typedArrayM1484k.getFloat(0, 0.0f);
            float f2 = !C0369g.m1482i(xmlPullParser, "controlY1") ? 0.0f : typedArrayM1484k.getFloat(1, 0.0f);
            boolean zM1482i = C0369g.m1482i(xmlPullParser, "controlX2");
            if (zM1482i != C0369g.m1482i(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (zM1482i) {
                float f3 = !C0369g.m1482i(xmlPullParser, "controlX2") ? 0.0f : typedArrayM1484k.getFloat(2, 0.0f);
                float f4 = !C0369g.m1482i(xmlPullParser, "controlY2") ? 0.0f : typedArrayM1484k.getFloat(3, 0.0f);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                m2153a(path);
            } else {
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.quadTo(f, f2, 1.0f, 1.0f);
                m2153a(path2);
            }
        }
        typedArrayM1484k.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m2153a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f3666a = new float[iMin];
        this.f3667b = new float[iMin];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < iMin; i2++) {
            pathMeasure.getPosTan((i2 * length) / (iMin - 1), fArr, null);
            this.f3666a[i2] = fArr[0];
            this.f3667b[i2] = fArr[1];
        }
        if (Math.abs(this.f3666a[0]) <= 1.0E-5d && Math.abs(this.f3667b[0]) <= 1.0E-5d) {
            int i3 = iMin - 1;
            if (Math.abs(this.f3666a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f3667b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < iMin) {
                    float[] fArr2 = this.f3666a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sbM2191e = a.m2191e("The Path must start at (0,0) and end at (1,1) start: ");
        sbM2191e.append(this.f3666a[0]);
        sbM2191e.append(",");
        sbM2191e.append(this.f3667b[0]);
        sbM2191e.append(" end:");
        int i6 = iMin - 1;
        sbM2191e.append(this.f3666a[i6]);
        sbM2191e.append(",");
        sbM2191e.append(this.f3667b[i6]);
        throw new IllegalArgumentException(sbM2191e.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f3666a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3666a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f3666a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f3667b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f3667b;
        float f4 = fArr2[i];
        return a.m2187a(fArr2[length], f4, f3, f4);
    }
}
