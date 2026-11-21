package p080c.p126d.p127a.p128a.p154x;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: c.d.a.a.x.k */
/* JADX INFO: loaded from: classes.dex */
public class C1300k {

    /* JADX INFO: renamed from: a */
    public final C1302m[] f6281a = new C1302m[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f6282b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f6283c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f6284d = new PointF();

    /* JADX INFO: renamed from: e */
    public final C1302m f6285e = new C1302m();

    /* JADX INFO: renamed from: f */
    public final float[] f6286f = new float[2];

    /* JADX INFO: renamed from: g */
    public final float[] f6287g = new float[2];

    /* JADX INFO: renamed from: c.d.a.a.x.k$a */
    public interface a {
    }

    public C1300k() {
        for (int i = 0; i < 4; i++) {
            this.f6281a[i] = new C1302m();
            this.f6282b[i] = new Matrix();
            this.f6283c[i] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2996a(C1299j c1299j, float f, RectF rectF, a aVar, Path path) {
        float fCenterX;
        float f2;
        C1295f c1295f;
        InterfaceC1292c interfaceC1292c;
        C1293d c1293d;
        float f3;
        float f4;
        path.rewind();
        char c2 = 0;
        int i = 0;
        while (i < 4) {
            if (i == 1) {
                interfaceC1292c = c1299j.f6263g;
            } else if (i != 2) {
                interfaceC1292c = i != 3 ? c1299j.f6262f : c1299j.f6261e;
            } else {
                interfaceC1292c = c1299j.f6264h;
            }
            if (i == 1) {
                c1293d = c1299j.f6259c;
            } else if (i != 2) {
                c1293d = i != 3 ? c1299j.f6258b : c1299j.f6257a;
            } else {
                c1293d = c1299j.f6260d;
            }
            C1302m c1302m = this.f6281a[i];
            Objects.requireNonNull(c1293d);
            c1293d.mo2959a(c1302m, 90.0f, f, interfaceC1292c.mo2958a(rectF));
            int i2 = i + 1;
            float f5 = i2 * 90;
            this.f6282b[i].reset();
            PointF pointF = this.f6284d;
            if (i != 1) {
                if (i != 2) {
                    f3 = i != 3 ? rectF.right : rectF.left;
                    f4 = rectF.top;
                } else {
                    f3 = rectF.left;
                }
                pointF.set(f3, f4);
                Matrix matrix = this.f6282b[i];
                PointF pointF2 = this.f6284d;
                matrix.setTranslate(pointF2.x, pointF2.y);
                this.f6282b[i].preRotate(f5);
                float[] fArr = this.f6286f;
                C1302m[] c1302mArr = this.f6281a;
                fArr[0] = c1302mArr[i].f6292c;
                fArr[1] = c1302mArr[i].f6293d;
                this.f6282b[i].mapPoints(fArr);
                this.f6283c[i].reset();
                Matrix matrix2 = this.f6283c[i];
                float[] fArr2 = this.f6286f;
                matrix2.setTranslate(fArr2[0], fArr2[1]);
                this.f6283c[i].preRotate(f5);
                i = i2;
            } else {
                f3 = rectF.right;
            }
            f4 = rectF.bottom;
            pointF.set(f3, f4);
            Matrix matrix3 = this.f6282b[i];
            PointF pointF3 = this.f6284d;
            matrix3.setTranslate(pointF3.x, pointF3.y);
            this.f6282b[i].preRotate(f5);
            float[] fArr3 = this.f6286f;
            C1302m[] c1302mArr2 = this.f6281a;
            fArr3[0] = c1302mArr2[i].f6292c;
            fArr3[1] = c1302mArr2[i].f6293d;
            this.f6282b[i].mapPoints(fArr3);
            this.f6283c[i].reset();
            Matrix matrix4 = this.f6283c[i];
            float[] fArr4 = this.f6286f;
            matrix4.setTranslate(fArr4[0], fArr4[1]);
            this.f6283c[i].preRotate(f5);
            i = i2;
        }
        int i3 = 0;
        while (i3 < 4) {
            float[] fArr5 = this.f6286f;
            C1302m[] c1302mArr3 = this.f6281a;
            fArr5[c2] = c1302mArr3[i3].f6290a;
            fArr5[1] = c1302mArr3[i3].f6291b;
            this.f6282b[i3].mapPoints(fArr5);
            float[] fArr6 = this.f6286f;
            if (i3 == 0) {
                path.moveTo(fArr6[c2], fArr6[1]);
            } else {
                path.lineTo(fArr6[c2], fArr6[1]);
            }
            this.f6281a[i3].m3000c(this.f6282b[i3], path);
            if (aVar != null) {
                C1302m c1302m2 = this.f6281a[i3];
                Matrix matrix5 = this.f6282b[i3];
                C1302m.f[] fVarArr = C1296g.this.f6212c;
                c1302m2.m2999b(c1302m2.f6295f);
                fVarArr[i3] = new C1301l(c1302m2, new ArrayList(c1302m2.f6297h), matrix5);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr7 = this.f6286f;
            C1302m[] c1302mArr4 = this.f6281a;
            fArr7[c2] = c1302mArr4[i3].f6292c;
            fArr7[1] = c1302mArr4[i3].f6293d;
            this.f6282b[i3].mapPoints(fArr7);
            float[] fArr8 = this.f6287g;
            C1302m[] c1302mArr5 = this.f6281a;
            fArr8[c2] = c1302mArr5[i5].f6290a;
            fArr8[1] = c1302mArr5[i5].f6291b;
            this.f6282b[i5].mapPoints(fArr8);
            float[] fArr9 = this.f6286f;
            float f6 = fArr9[c2];
            float[] fArr10 = this.f6287g;
            float fMax = Math.max(((float) Math.hypot(f6 - fArr10[c2], fArr9[1] - fArr10[1])) - 0.001f, 0.0f);
            float[] fArr11 = this.f6286f;
            C1302m[] c1302mArr6 = this.f6281a;
            fArr11[c2] = c1302mArr6[i3].f6292c;
            fArr11[1] = c1302mArr6[i3].f6293d;
            this.f6282b[i3].mapPoints(fArr11);
            if (i3 == 1 || i3 == 3) {
                fCenterX = rectF.centerX();
                f2 = this.f6286f[c2];
            } else {
                fCenterX = rectF.centerY();
                f2 = this.f6286f[1];
            }
            float fAbs = Math.abs(fCenterX - f2);
            this.f6285e.m3002e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i3 == 1) {
                c1295f = c1299j.f6267k;
            } else if (i3 != 2) {
                c1295f = i3 != 3 ? c1299j.f6266j : c1299j.f6265i;
            } else {
                c1295f = c1299j.f6268l;
            }
            c1295f.m2960a(fMax, fAbs, f, this.f6285e);
            this.f6285e.m3000c(this.f6283c[i3], path);
            if (aVar != null) {
                C1302m c1302m3 = this.f6285e;
                Matrix matrix6 = this.f6283c[i3];
                C1302m.f[] fVarArr2 = C1296g.this.f6213d;
                c1302m3.m2999b(c1302m3.f6295f);
                fVarArr2[i3] = new C1301l(c1302m3, new ArrayList(c1302m3.f6297h), matrix6);
            }
            i3 = i4;
            c2 = 0;
        }
        path.close();
    }
}
