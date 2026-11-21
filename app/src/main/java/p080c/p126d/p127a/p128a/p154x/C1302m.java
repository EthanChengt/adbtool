package p080c.p126d.p127a.p128a.p154x;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p080c.p126d.p127a.p128a.p153w.C1288a;

/* JADX INFO: renamed from: c.d.a.a.x.m */
/* JADX INFO: loaded from: classes.dex */
public class C1302m {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public float f6290a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public float f6291b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public float f6292c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public float f6293d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f6294e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public float f6295f;

    /* JADX INFO: renamed from: g */
    public final List<e> f6296g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final List<f> f6297h = new ArrayList();

    /* JADX INFO: renamed from: c.d.a.a.x.m$a */
    public static class a extends f {

        /* JADX INFO: renamed from: b */
        public final c f6298b;

        public a(c cVar) {
            this.f6298b = cVar;
        }

        @Override // p080c.p126d.p127a.p128a.p154x.C1302m.f
        /* JADX INFO: renamed from: a */
        public void mo2997a(Matrix matrix, C1288a c1288a, int i, Canvas canvas) {
            c cVar = this.f6298b;
            float f = cVar.f6307f;
            float f2 = cVar.f6308g;
            c cVar2 = this.f6298b;
            RectF rectF = new RectF(cVar2.f6303b, cVar2.f6304c, cVar2.f6305d, cVar2.f6306e);
            int[] iArr = C1288a.f6198j;
            boolean z = f2 < 0.0f;
            Path path = c1288a.f6206g;
            if (z) {
                iArr[0] = 0;
                iArr[1] = c1288a.f6205f;
                iArr[2] = c1288a.f6204e;
                iArr[3] = c1288a.f6203d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                iArr[0] = 0;
                iArr[1] = c1288a.f6203d;
                iArr[2] = c1288a.f6204e;
                iArr[3] = c1288a.f6205f;
            }
            float fWidth = 1.0f - (i / (rectF.width() / 2.0f));
            float[] fArr = C1288a.f6199k;
            fArr[1] = fWidth;
            fArr[2] = ((1.0f - fWidth) / 2.0f) + fWidth;
            c1288a.f6201b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            canvas.drawArc(rectF, f, f2, true, c1288a.f6201b);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.x.m$b */
    public static class b extends f {

        /* JADX INFO: renamed from: b */
        public final d f6299b;

        /* JADX INFO: renamed from: c */
        public final float f6300c;

        /* JADX INFO: renamed from: d */
        public final float f6301d;

        public b(d dVar, float f, float f2) {
            this.f6299b = dVar;
            this.f6300c = f;
            this.f6301d = f2;
        }

        @Override // p080c.p126d.p127a.p128a.p154x.C1302m.f
        /* JADX INFO: renamed from: a */
        public void mo2997a(Matrix matrix, C1288a c1288a, int i, Canvas canvas) {
            d dVar = this.f6299b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.f6310c - this.f6301d, dVar.f6309b - this.f6300c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f6300c, this.f6301d);
            matrix2.preRotate(m3003b());
            Objects.requireNonNull(c1288a);
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = C1288a.f6196h;
            iArr[0] = c1288a.f6205f;
            iArr[1] = c1288a.f6204e;
            iArr[2] = c1288a.f6203d;
            Paint paint = c1288a.f6202c;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C1288a.f6197i, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, c1288a.f6202c);
            canvas.restore();
        }

        /* JADX INFO: renamed from: b */
        public float m3003b() {
            d dVar = this.f6299b;
            return (float) Math.toDegrees(Math.atan((dVar.f6310c - this.f6301d) / (dVar.f6309b - this.f6300c)));
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.x.m$c */
    public static class c extends e {

        /* JADX INFO: renamed from: h */
        public static final RectF f6302h = new RectF();

        /* JADX INFO: renamed from: b */
        @Deprecated
        public float f6303b;

        /* JADX INFO: renamed from: c */
        @Deprecated
        public float f6304c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public float f6305d;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public float f6306e;

        /* JADX INFO: renamed from: f */
        @Deprecated
        public float f6307f;

        /* JADX INFO: renamed from: g */
        @Deprecated
        public float f6308g;

        public c(float f, float f2, float f3, float f4) {
            this.f6303b = f;
            this.f6304c = f2;
            this.f6305d = f3;
            this.f6306e = f4;
        }

        @Override // p080c.p126d.p127a.p128a.p154x.C1302m.e
        /* JADX INFO: renamed from: a */
        public void mo3004a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6311a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f6302h;
            rectF.set(this.f6303b, this.f6304c, this.f6305d, this.f6306e);
            path.arcTo(rectF, this.f6307f, this.f6308g, false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.x.m$d */
    public static class d extends e {

        /* JADX INFO: renamed from: b */
        public float f6309b;

        /* JADX INFO: renamed from: c */
        public float f6310c;

        @Override // p080c.p126d.p127a.p128a.p154x.C1302m.e
        /* JADX INFO: renamed from: a */
        public void mo3004a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6311a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f6309b, this.f6310c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.x.m$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public final Matrix f6311a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo3004a(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: c.d.a.a.x.m$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        public static final Matrix f6312a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo2997a(Matrix matrix, C1288a c1288a, int i, Canvas canvas);
    }

    public C1302m() {
        m3002e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m2998a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f6307f = f6;
        cVar.f6308g = f7;
        this.f6296g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        m2999b(f6);
        this.f6297h.add(aVar);
        this.f6294e = f9;
        double d2 = f8;
        this.f6292c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.f6293d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public final void m2999b(float f2) {
        float f3 = this.f6294e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f6292c;
        float f6 = this.f6293d;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f6307f = this.f6294e;
        cVar.f6308g = f4;
        this.f6297h.add(new a(cVar));
        this.f6294e = f2;
    }

    /* JADX INFO: renamed from: c */
    public void m3000c(Matrix matrix, Path path) {
        int size = this.f6296g.size();
        for (int i = 0; i < size; i++) {
            this.f6296g.get(i).mo3004a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3001d(float f2, float f3) {
        d dVar = new d();
        dVar.f6309b = f2;
        dVar.f6310c = f3;
        this.f6296g.add(dVar);
        b bVar = new b(dVar, this.f6292c, this.f6293d);
        float fM3003b = bVar.m3003b() + 270.0f;
        float fM3003b2 = bVar.m3003b() + 270.0f;
        m2999b(fM3003b);
        this.f6297h.add(bVar);
        this.f6294e = fM3003b2;
        this.f6292c = f2;
        this.f6293d = f3;
    }

    /* JADX INFO: renamed from: e */
    public void m3002e(float f2, float f3, float f4, float f5) {
        this.f6290a = f2;
        this.f6291b = f3;
        this.f6292c = f2;
        this.f6293d = f3;
        this.f6294e = f4;
        this.f6295f = (f4 + f5) % 360.0f;
        this.f6296g.clear();
        this.f6297h.clear();
    }
}
