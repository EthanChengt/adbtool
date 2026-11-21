package p006b.p074x.p075a.p076a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p025e.C0313a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0363a;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p032h.p036d.C0371b;

/* JADX INFO: renamed from: b.x.a.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0608g extends AbstractC0607f {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f3669k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public h f3670c;

    /* JADX INFO: renamed from: d */
    public PorterDuffColorFilter f3671d;

    /* JADX INFO: renamed from: e */
    public ColorFilter f3672e;

    /* JADX INFO: renamed from: f */
    public boolean f3673f;

    /* JADX INFO: renamed from: g */
    public boolean f3674g;

    /* JADX INFO: renamed from: h */
    public final float[] f3675h;

    /* JADX INFO: renamed from: i */
    public final Matrix f3676i;

    /* JADX INFO: renamed from: j */
    public final Rect f3677j;

    /* JADX INFO: renamed from: b.x.a.a.g$b */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        @Override // p006b.p074x.p075a.p076a.C0608g.f
        /* JADX INFO: renamed from: c */
        public boolean mo2156c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.g$c */
    public static class c extends f {

        /* JADX INFO: renamed from: e */
        public int[] f3678e;

        /* JADX INFO: renamed from: f */
        public C0363a f3679f;

        /* JADX INFO: renamed from: g */
        public float f3680g;

        /* JADX INFO: renamed from: h */
        public C0363a f3681h;

        /* JADX INFO: renamed from: i */
        public float f3682i;

        /* JADX INFO: renamed from: j */
        public float f3683j;

        /* JADX INFO: renamed from: k */
        public float f3684k;

        /* JADX INFO: renamed from: l */
        public float f3685l;

        /* JADX INFO: renamed from: m */
        public float f3686m;

        /* JADX INFO: renamed from: n */
        public Paint.Cap f3687n;

        /* JADX INFO: renamed from: o */
        public Paint.Join f3688o;

        /* JADX INFO: renamed from: p */
        public float f3689p;

        public c() {
            this.f3680g = 0.0f;
            this.f3682i = 1.0f;
            this.f3683j = 1.0f;
            this.f3684k = 0.0f;
            this.f3685l = 1.0f;
            this.f3686m = 0.0f;
            this.f3687n = Paint.Cap.BUTT;
            this.f3688o = Paint.Join.MITER;
            this.f3689p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f3680g = 0.0f;
            this.f3682i = 1.0f;
            this.f3683j = 1.0f;
            this.f3684k = 0.0f;
            this.f3685l = 1.0f;
            this.f3686m = 0.0f;
            this.f3687n = Paint.Cap.BUTT;
            this.f3688o = Paint.Join.MITER;
            this.f3689p = 4.0f;
            this.f3678e = cVar.f3678e;
            this.f3679f = cVar.f3679f;
            this.f3680g = cVar.f3680g;
            this.f3682i = cVar.f3682i;
            this.f3681h = cVar.f3681h;
            this.f3705c = cVar.f3705c;
            this.f3683j = cVar.f3683j;
            this.f3684k = cVar.f3684k;
            this.f3685l = cVar.f3685l;
            this.f3686m = cVar.f3686m;
            this.f3687n = cVar.f3687n;
            this.f3688o = cVar.f3688o;
            this.f3689p = cVar.f3689p;
        }

        @Override // p006b.p074x.p075a.p076a.C0608g.e
        /* JADX INFO: renamed from: a */
        public boolean mo2157a() {
            return this.f3681h.m1472c() || this.f3679f.m1472c();
        }

        @Override // p006b.p074x.p075a.p076a.C0608g.e
        /* JADX INFO: renamed from: b */
        public boolean mo2158b(int[] iArr) {
            return this.f3679f.m1473d(iArr) | this.f3681h.m1473d(iArr);
        }

        public float getFillAlpha() {
            return this.f3683j;
        }

        public int getFillColor() {
            return this.f3681h.f2574c;
        }

        public float getStrokeAlpha() {
            return this.f3682i;
        }

        public int getStrokeColor() {
            return this.f3679f.f2574c;
        }

        public float getStrokeWidth() {
            return this.f3680g;
        }

        public float getTrimPathEnd() {
            return this.f3685l;
        }

        public float getTrimPathOffset() {
            return this.f3686m;
        }

        public float getTrimPathStart() {
            return this.f3684k;
        }

        public void setFillAlpha(float f) {
            this.f3683j = f;
        }

        public void setFillColor(int i) {
            this.f3681h.f2574c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f3682i = f;
        }

        public void setStrokeColor(int i) {
            this.f3679f.f2574c = i;
        }

        public void setStrokeWidth(float f) {
            this.f3680g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f3685l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f3686m = f;
        }

        public void setTrimPathStart(float f) {
            this.f3684k = f;
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.g$d */
    public static class d extends e {

        /* JADX INFO: renamed from: a */
        public final Matrix f3690a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<e> f3691b;

        /* JADX INFO: renamed from: c */
        public float f3692c;

        /* JADX INFO: renamed from: d */
        public float f3693d;

        /* JADX INFO: renamed from: e */
        public float f3694e;

        /* JADX INFO: renamed from: f */
        public float f3695f;

        /* JADX INFO: renamed from: g */
        public float f3696g;

        /* JADX INFO: renamed from: h */
        public float f3697h;

        /* JADX INFO: renamed from: i */
        public float f3698i;

        /* JADX INFO: renamed from: j */
        public final Matrix f3699j;

        /* JADX INFO: renamed from: k */
        public int f3700k;

        /* JADX INFO: renamed from: l */
        public int[] f3701l;

        /* JADX INFO: renamed from: m */
        public String f3702m;

        public d() {
            super(null);
            this.f3690a = new Matrix();
            this.f3691b = new ArrayList<>();
            this.f3692c = 0.0f;
            this.f3693d = 0.0f;
            this.f3694e = 0.0f;
            this.f3695f = 1.0f;
            this.f3696g = 1.0f;
            this.f3697h = 0.0f;
            this.f3698i = 0.0f;
            this.f3699j = new Matrix();
            this.f3702m = null;
        }

        public d(d dVar, C0313a<String, Object> c0313a) {
            f bVar;
            super(null);
            this.f3690a = new Matrix();
            this.f3691b = new ArrayList<>();
            this.f3692c = 0.0f;
            this.f3693d = 0.0f;
            this.f3694e = 0.0f;
            this.f3695f = 1.0f;
            this.f3696g = 1.0f;
            this.f3697h = 0.0f;
            this.f3698i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3699j = matrix;
            this.f3702m = null;
            this.f3692c = dVar.f3692c;
            this.f3693d = dVar.f3693d;
            this.f3694e = dVar.f3694e;
            this.f3695f = dVar.f3695f;
            this.f3696g = dVar.f3696g;
            this.f3697h = dVar.f3697h;
            this.f3698i = dVar.f3698i;
            this.f3701l = dVar.f3701l;
            String str = dVar.f3702m;
            this.f3702m = str;
            this.f3700k = dVar.f3700k;
            if (str != null) {
                c0313a.put(str, this);
            }
            matrix.set(dVar.f3699j);
            ArrayList<e> arrayList = dVar.f3691b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f3691b.add(new d((d) eVar, c0313a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f3691b.add(bVar);
                    String str2 = bVar.f3704b;
                    if (str2 != null) {
                        c0313a.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p006b.p074x.p075a.p076a.C0608g.e
        /* JADX INFO: renamed from: a */
        public boolean mo2157a() {
            for (int i = 0; i < this.f3691b.size(); i++) {
                if (this.f3691b.get(i).mo2157a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p006b.p074x.p075a.p076a.C0608g.e
        /* JADX INFO: renamed from: b */
        public boolean mo2158b(int[] iArr) {
            boolean zMo2158b = false;
            for (int i = 0; i < this.f3691b.size(); i++) {
                zMo2158b |= this.f3691b.get(i).mo2158b(iArr);
            }
            return zMo2158b;
        }

        /* JADX INFO: renamed from: c */
        public final void m2159c() {
            this.f3699j.reset();
            this.f3699j.postTranslate(-this.f3693d, -this.f3694e);
            this.f3699j.postScale(this.f3695f, this.f3696g);
            this.f3699j.postRotate(this.f3692c, 0.0f, 0.0f);
            this.f3699j.postTranslate(this.f3697h + this.f3693d, this.f3698i + this.f3694e);
        }

        public String getGroupName() {
            return this.f3702m;
        }

        public Matrix getLocalMatrix() {
            return this.f3699j;
        }

        public float getPivotX() {
            return this.f3693d;
        }

        public float getPivotY() {
            return this.f3694e;
        }

        public float getRotation() {
            return this.f3692c;
        }

        public float getScaleX() {
            return this.f3695f;
        }

        public float getScaleY() {
            return this.f3696g;
        }

        public float getTranslateX() {
            return this.f3697h;
        }

        public float getTranslateY() {
            return this.f3698i;
        }

        public void setPivotX(float f) {
            if (f != this.f3693d) {
                this.f3693d = f;
                m2159c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f3694e) {
                this.f3694e = f;
                m2159c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f3692c) {
                this.f3692c = f;
                m2159c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f3695f) {
                this.f3695f = f;
                m2159c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f3696g) {
                this.f3696g = f;
                m2159c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f3697h) {
                this.f3697h = f;
                m2159c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f3698i) {
                this.f3698i = f;
                m2159c();
            }
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.g$e */
    public static abstract class e {
        public e() {
        }

        public e(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo2157a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo2158b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.g$f */
    public static abstract class f extends e {

        /* JADX INFO: renamed from: a */
        public C0371b[] f3703a;

        /* JADX INFO: renamed from: b */
        public String f3704b;

        /* JADX INFO: renamed from: c */
        public int f3705c;

        /* JADX INFO: renamed from: d */
        public int f3706d;

        public f() {
            super(null);
            this.f3703a = null;
            this.f3705c = 0;
        }

        public f(f fVar) {
            super(null);
            this.f3703a = null;
            this.f3705c = 0;
            this.f3704b = fVar.f3704b;
            this.f3706d = fVar.f3706d;
            this.f3703a = C0360f.m1457q(fVar.f3703a);
        }

        /* JADX INFO: renamed from: c */
        public boolean mo2156c() {
            return false;
        }

        public C0371b[] getPathData() {
            return this.f3703a;
        }

        public String getPathName() {
            return this.f3704b;
        }

        public void setPathData(C0371b[] c0371bArr) {
            if (!C0360f.m1441d(this.f3703a, c0371bArr)) {
                this.f3703a = C0360f.m1457q(c0371bArr);
                return;
            }
            C0371b[] c0371bArr2 = this.f3703a;
            for (int i = 0; i < c0371bArr.length; i++) {
                c0371bArr2[i].f2591a = c0371bArr[i].f2591a;
                for (int i2 = 0; i2 < c0371bArr[i].f2592b.length; i2++) {
                    c0371bArr2[i].f2592b[i2] = c0371bArr[i].f2592b[i2];
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.g$g */
    public static class g {

        /* JADX INFO: renamed from: q */
        public static final Matrix f3707q = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Path f3708a;

        /* JADX INFO: renamed from: b */
        public final Path f3709b;

        /* JADX INFO: renamed from: c */
        public final Matrix f3710c;

        /* JADX INFO: renamed from: d */
        public Paint f3711d;

        /* JADX INFO: renamed from: e */
        public Paint f3712e;

        /* JADX INFO: renamed from: f */
        public PathMeasure f3713f;

        /* JADX INFO: renamed from: g */
        public int f3714g;

        /* JADX INFO: renamed from: h */
        public final d f3715h;

        /* JADX INFO: renamed from: i */
        public float f3716i;

        /* JADX INFO: renamed from: j */
        public float f3717j;

        /* JADX INFO: renamed from: k */
        public float f3718k;

        /* JADX INFO: renamed from: l */
        public float f3719l;

        /* JADX INFO: renamed from: m */
        public int f3720m;

        /* JADX INFO: renamed from: n */
        public String f3721n;

        /* JADX INFO: renamed from: o */
        public Boolean f3722o;

        /* JADX INFO: renamed from: p */
        public final C0313a<String, Object> f3723p;

        public g() {
            this.f3710c = new Matrix();
            this.f3716i = 0.0f;
            this.f3717j = 0.0f;
            this.f3718k = 0.0f;
            this.f3719l = 0.0f;
            this.f3720m = 255;
            this.f3721n = null;
            this.f3722o = null;
            this.f3723p = new C0313a<>();
            this.f3715h = new d();
            this.f3708a = new Path();
            this.f3709b = new Path();
        }

        public g(g gVar) {
            this.f3710c = new Matrix();
            this.f3716i = 0.0f;
            this.f3717j = 0.0f;
            this.f3718k = 0.0f;
            this.f3719l = 0.0f;
            this.f3720m = 255;
            this.f3721n = null;
            this.f3722o = null;
            C0313a<String, Object> c0313a = new C0313a<>();
            this.f3723p = c0313a;
            this.f3715h = new d(gVar.f3715h, c0313a);
            this.f3708a = new Path(gVar.f3708a);
            this.f3709b = new Path(gVar.f3709b);
            this.f3716i = gVar.f3716i;
            this.f3717j = gVar.f3717j;
            this.f3718k = gVar.f3718k;
            this.f3719l = gVar.f3719l;
            this.f3714g = gVar.f3714g;
            this.f3720m = gVar.f3720m;
            this.f3721n = gVar.f3721n;
            String str = gVar.f3721n;
            if (str != null) {
                c0313a.put(str, this);
            }
            this.f3722o = gVar.f3722o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX INFO: renamed from: a */
        public final void m2160a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            dVar.f3690a.set(matrix);
            dVar.f3690a.preConcat(dVar.f3699j);
            canvas.save();
            int r11 = 0;
            int i3 = 0;
            while (i3 < dVar.f3691b.size()) {
                e eVar = dVar.f3691b.get(i3);
                if (eVar instanceof d) {
                    m2160a((d) eVar, dVar.f3690a, canvas, i, i2, colorFilter);
                } else {
                    if (eVar instanceof f) {
                        f fVar = (f) eVar;
                        float f = i / gVar2.f3718k;
                        float f2 = i2 / gVar2.f3719l;
                        float fMin = Math.min(f, f2);
                        Matrix matrix2 = dVar.f3690a;
                        gVar2.f3710c.set(matrix2);
                        gVar2.f3710c.postScale(f, f2);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[r11], fArr[1]);
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f3 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f3) / fMax : 0.0f;
                        if (fAbs == 0.0f) {
                            gVar = this;
                        } else {
                            gVar = this;
                            Path path = gVar.f3708a;
                            Objects.requireNonNull(fVar);
                            path.reset();
                            C0371b[] c0371bArr = fVar.f3703a;
                            if (c0371bArr != null) {
                                C0371b.m1491b(c0371bArr, path);
                            }
                            Path path2 = gVar.f3708a;
                            gVar.f3709b.reset();
                            if (fVar.mo2156c()) {
                                gVar.f3709b.setFillType(fVar.f3705c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                gVar.f3709b.addPath(path2, gVar.f3710c);
                                canvas.clipPath(gVar.f3709b);
                            } else {
                                c cVar = (c) fVar;
                                float f4 = cVar.f3684k;
                                if (f4 != 0.0f || cVar.f3685l != 1.0f) {
                                    float f5 = cVar.f3686m;
                                    float f6 = (f4 + f5) % 1.0f;
                                    float f7 = (cVar.f3685l + f5) % 1.0f;
                                    if (gVar.f3713f == null) {
                                        gVar.f3713f = new PathMeasure();
                                    }
                                    gVar.f3713f.setPath(gVar.f3708a, false);
                                    float length = gVar.f3713f.getLength();
                                    float f8 = f6 * length;
                                    float f9 = f7 * length;
                                    path2.reset();
                                    if (f8 > f9) {
                                        gVar.f3713f.getSegment(f8, length, path2, true);
                                        gVar.f3713f.getSegment(0.0f, f9, path2, true);
                                    } else {
                                        gVar.f3713f.getSegment(f8, f9, path2, true);
                                    }
                                    path2.rLineTo(0.0f, 0.0f);
                                }
                                gVar.f3709b.addPath(path2, gVar.f3710c);
                                C0363a c0363a = cVar.f3681h;
                                if (c0363a.m1471b() || c0363a.f2574c != 0) {
                                    C0363a c0363a2 = cVar.f3681h;
                                    if (gVar.f3712e == null) {
                                        Paint paint = new Paint(1);
                                        gVar.f3712e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = gVar.f3712e;
                                    if (c0363a2.m1471b()) {
                                        Shader shader = c0363a2.f2572a;
                                        shader.setLocalMatrix(gVar.f3710c);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cVar.f3683j * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i4 = c0363a2.f2574c;
                                        float f10 = cVar.f3683j;
                                        PorterDuff.Mode mode = C0608g.f3669k;
                                        paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f10)) << 24));
                                    }
                                    paint2.setColorFilter(colorFilter);
                                    gVar.f3709b.setFillType(cVar.f3705c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(gVar.f3709b, paint2);
                                }
                                C0363a c0363a3 = cVar.f3679f;
                                if (c0363a3.m1471b() || c0363a3.f2574c != 0) {
                                    C0363a c0363a4 = cVar.f3679f;
                                    if (gVar.f3711d == null) {
                                        Paint paint3 = new Paint(1);
                                        gVar.f3711d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = gVar.f3711d;
                                    Paint.Join join = cVar.f3688o;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cVar.f3687n;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cVar.f3689p);
                                    if (c0363a4.m1471b()) {
                                        Shader shader2 = c0363a4.f2572a;
                                        shader2.setLocalMatrix(gVar.f3710c);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cVar.f3682i * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i5 = c0363a4.f2574c;
                                        float f11 = cVar.f3682i;
                                        PorterDuff.Mode mode2 = C0608g.f3669k;
                                        paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                    }
                                    paint4.setColorFilter(colorFilter);
                                    paint4.setStrokeWidth(cVar.f3680g * fAbs * fMin);
                                    canvas.drawPath(gVar.f3709b, paint4);
                                }
                            }
                        }
                    }
                    i3++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                gVar = gVar2;
                i3++;
                gVar2 = gVar;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3720m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f3720m = i;
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.g$h */
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f3724a;

        /* JADX INFO: renamed from: b */
        public g f3725b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f3726c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f3727d;

        /* JADX INFO: renamed from: e */
        public boolean f3728e;

        /* JADX INFO: renamed from: f */
        public Bitmap f3729f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f3730g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f3731h;

        /* JADX INFO: renamed from: i */
        public int f3732i;

        /* JADX INFO: renamed from: j */
        public boolean f3733j;

        /* JADX INFO: renamed from: k */
        public boolean f3734k;

        /* JADX INFO: renamed from: l */
        public Paint f3735l;

        public h() {
            this.f3726c = null;
            this.f3727d = C0608g.f3669k;
            this.f3725b = new g();
        }

        public h(h hVar) {
            this.f3726c = null;
            this.f3727d = C0608g.f3669k;
            if (hVar != null) {
                this.f3724a = hVar.f3724a;
                g gVar = new g(hVar.f3725b);
                this.f3725b = gVar;
                if (hVar.f3725b.f3712e != null) {
                    gVar.f3712e = new Paint(hVar.f3725b.f3712e);
                }
                if (hVar.f3725b.f3711d != null) {
                    this.f3725b.f3711d = new Paint(hVar.f3725b.f3711d);
                }
                this.f3726c = hVar.f3726c;
                this.f3727d = hVar.f3727d;
                this.f3728e = hVar.f3728e;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m2161a() {
            g gVar = this.f3725b;
            if (gVar.f3722o == null) {
                gVar.f3722o = Boolean.valueOf(gVar.f3715h.mo2157a());
            }
            return gVar.f3722o.booleanValue();
        }

        /* JADX INFO: renamed from: b */
        public void m2162b(int i, int i2) {
            this.f3729f.eraseColor(0);
            Canvas canvas = new Canvas(this.f3729f);
            g gVar = this.f3725b;
            gVar.m2160a(gVar.f3715h, g.f3707q, canvas, i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3724a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0608g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0608g(this);
        }
    }

    /* JADX INFO: renamed from: b.x.a.a.g$i */
    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f3736a;

        public i(Drawable.ConstantState constantState) {
            this.f3736a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3736a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3736a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0608g c0608g = new C0608g();
            c0608g.f3668b = (VectorDrawable) this.f3736a.newDrawable();
            return c0608g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0608g c0608g = new C0608g();
            c0608g.f3668b = (VectorDrawable) this.f3736a.newDrawable(resources);
            return c0608g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0608g c0608g = new C0608g();
            c0608g.f3668b = (VectorDrawable) this.f3736a.newDrawable(resources, theme);
            return c0608g;
        }
    }

    public C0608g() {
        this.f3674g = true;
        this.f3675h = new float[9];
        this.f3676i = new Matrix();
        this.f3677j = new Rect();
        this.f3670c = new h();
    }

    public C0608g(h hVar) {
        this.f3674g = true;
        this.f3675h = new float[9];
        this.f3676i = new Matrix();
        this.f3677j = new Rect();
        this.f3670c = hVar;
        this.f3671d = m2155b(hVar.f3726c, hVar.f3727d);
    }

    /* JADX INFO: renamed from: a */
    public static C0608g m2154a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0608g c0608g = new C0608g();
        c0608g.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0608g;
    }

    /* JADX INFO: renamed from: b */
    public PorterDuffColorFilter m2155b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3668b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3677j);
        if (this.f3677j.width() <= 0 || this.f3677j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3672e;
        if (colorFilter == null) {
            colorFilter = this.f3671d;
        }
        canvas.getMatrix(this.f3676i);
        this.f3676i.getValues(this.f3675h);
        float fAbs = Math.abs(this.f3675h[0]);
        float fAbs2 = Math.abs(this.f3675h[4]);
        float fAbs3 = Math.abs(this.f3675h[1]);
        float fAbs4 = Math.abs(this.f3675h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f3677j.width() * fAbs);
        int iHeight = (int) (this.f3677j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f3677j;
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C0360f.m1461u(this) == 1) {
            canvas.translate(this.f3677j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f3677j.offsetTo(0, 0);
        h hVar = this.f3670c;
        Bitmap bitmap = hVar.f3729f;
        if (bitmap == null) {
            hVar.f3729f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            hVar.f3734k = true;
        } else {
            if (!(iMin == bitmap.getWidth() && iMin2 == hVar.f3729f.getHeight())) {
                hVar.f3729f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                hVar.f3734k = true;
            }
        }
        if (this.f3674g) {
            h hVar2 = this.f3670c;
            if (!(!hVar2.f3734k && hVar2.f3730g == hVar2.f3726c && hVar2.f3731h == hVar2.f3727d && hVar2.f3733j == hVar2.f3728e && hVar2.f3732i == hVar2.f3725b.getRootAlpha())) {
                this.f3670c.m2162b(iMin, iMin2);
                h hVar3 = this.f3670c;
                hVar3.f3730g = hVar3.f3726c;
                hVar3.f3731h = hVar3.f3727d;
                hVar3.f3732i = hVar3.f3725b.getRootAlpha();
                hVar3.f3733j = hVar3.f3728e;
                hVar3.f3734k = false;
            }
        } else {
            this.f3670c.m2162b(iMin, iMin2);
        }
        h hVar4 = this.f3670c;
        Rect rect2 = this.f3677j;
        if ((hVar4.f3725b.getRootAlpha() < 255) || colorFilter != null) {
            if (hVar4.f3735l == null) {
                Paint paint2 = new Paint();
                hVar4.f3735l = paint2;
                paint2.setFilterBitmap(true);
            }
            hVar4.f3735l.setAlpha(hVar4.f3725b.getRootAlpha());
            hVar4.f3735l.setColorFilter(colorFilter);
            paint = hVar4.f3735l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(hVar4.f3729f, (Rect) null, rect2, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getAlpha() : this.f3670c.f3725b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3670c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3668b;
        if (drawable == null) {
            return this.f3672e;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3668b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3668b.getConstantState());
        }
        this.f3670c.f3724a = getChangingConfigurations();
        return this.f3670c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3670c.f3725b.f3717j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3670c.f3725b.f3716i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM1453m;
        g gVar;
        c cVar;
        TypedArray typedArray;
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        h hVar = this.f3670c;
        hVar.f3725b = new g();
        TypedArray typedArrayM1484k = C0369g.m1484k(resources, theme, attributeSet, C0602a.f3641a);
        h hVar2 = this.f3670c;
        g gVar2 = hVar2.f3725b;
        int i2 = !C0369g.m1482i(xmlPullParser, "tintMode") ? -1 : typedArrayM1484k.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        hVar2.f3727d = mode;
        int i4 = 1;
        if (C0369g.m1482i(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayM1484k.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = typedArrayM1484k.getResources();
                try {
                    colorStateListM1453m = C0360f.m1453m(resources2, resources2.getXml(typedArrayM1484k.getResourceId(1, 0)), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                    colorStateListM1453m = null;
                }
            } else {
                colorStateListM1453m = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListM1453m = null;
        }
        if (colorStateListM1453m != null) {
            hVar2.f3726c = colorStateListM1453m;
        }
        boolean z = hVar2.f3728e;
        if (C0369g.m1482i(xmlPullParser, "autoMirrored")) {
            z = typedArrayM1484k.getBoolean(5, z);
        }
        hVar2.f3728e = z;
        float f2 = gVar2.f3718k;
        if (C0369g.m1482i(xmlPullParser, "viewportWidth")) {
            f2 = typedArrayM1484k.getFloat(7, f2);
        }
        gVar2.f3718k = f2;
        float f3 = gVar2.f3719l;
        if (C0369g.m1482i(xmlPullParser, "viewportHeight")) {
            f3 = typedArrayM1484k.getFloat(8, f3);
        }
        gVar2.f3719l = f3;
        if (gVar2.f3718k <= 0.0f) {
            throw new XmlPullParserException(typedArrayM1484k.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM1484k.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar2.f3716i = typedArrayM1484k.getDimension(3, gVar2.f3716i);
        float dimension = typedArrayM1484k.getDimension(2, gVar2.f3717j);
        gVar2.f3717j = dimension;
        if (gVar2.f3716i <= 0.0f) {
            throw new XmlPullParserException(typedArrayM1484k.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM1484k.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = gVar2.getAlpha();
        if (C0369g.m1482i(xmlPullParser, "alpha")) {
            alpha = typedArrayM1484k.getFloat(4, alpha);
        }
        gVar2.setAlpha(alpha);
        String string = typedArrayM1484k.getString(0);
        if (string != null) {
            gVar2.f3721n = string;
            gVar2.f3723p.put(string, gVar2);
        }
        typedArrayM1484k.recycle();
        hVar.f3724a = getChangingConfigurations();
        hVar.f3734k = true;
        h hVar3 = this.f3670c;
        g gVar3 = hVar3.f3725b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar3.f3715h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar2 = new c();
                    TypedArray typedArrayM1484k2 = C0369g.m1484k(resources, theme, attributeSet, C0602a.f3643c);
                    cVar2.f3678e = null;
                    if (C0369g.m1482i(xmlPullParser, "pathData")) {
                        String string2 = typedArrayM1484k2.getString(0);
                        if (string2 != null) {
                            cVar2.f3704b = string2;
                        }
                        String string3 = typedArrayM1484k2.getString(2);
                        if (string3 != null) {
                            cVar2.f3703a = C0360f.m1455o(string3);
                        }
                        cVar = cVar2;
                        cVar.f3681h = C0369g.m1477d(typedArrayM1484k2, xmlPullParser, theme, "fillColor", 1, 0);
                        float f4 = cVar.f3683j;
                        if (C0369g.m1482i(xmlPullParser, "fillAlpha")) {
                            f4 = typedArrayM1484k2.getFloat(12, f4);
                        }
                        cVar.f3683j = f4;
                        int i6 = !C0369g.m1482i(xmlPullParser, "strokeLineCap") ? -1 : typedArrayM1484k2.getInt(8, -1);
                        Paint.Cap cap = cVar.f3687n;
                        if (i6 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i6 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (i6 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        cVar.f3687n = cap;
                        int i7 = !C0369g.m1482i(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayM1484k2.getInt(9, -1);
                        Paint.Join join = cVar.f3688o;
                        if (i7 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i7 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (i7 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        cVar.f3688o = join;
                        float f5 = cVar.f3689p;
                        if (C0369g.m1482i(xmlPullParser, "strokeMiterLimit")) {
                            f5 = typedArrayM1484k2.getFloat(10, f5);
                        }
                        cVar.f3689p = f5;
                        typedArray = typedArrayM1484k2;
                        cVar.f3679f = C0369g.m1477d(typedArrayM1484k2, xmlPullParser, theme, "strokeColor", 3, 0);
                        float f6 = cVar.f3682i;
                        if (C0369g.m1482i(xmlPullParser, "strokeAlpha")) {
                            f6 = typedArray.getFloat(11, f6);
                        }
                        cVar.f3682i = f6;
                        float f7 = cVar.f3680g;
                        if (C0369g.m1482i(xmlPullParser, "strokeWidth")) {
                            f7 = typedArray.getFloat(4, f7);
                        }
                        cVar.f3680g = f7;
                        float f8 = cVar.f3685l;
                        if (C0369g.m1482i(xmlPullParser, "trimPathEnd")) {
                            f8 = typedArray.getFloat(6, f8);
                        }
                        cVar.f3685l = f8;
                        float f9 = cVar.f3686m;
                        if (C0369g.m1482i(xmlPullParser, "trimPathOffset")) {
                            f9 = typedArray.getFloat(7, f9);
                        }
                        cVar.f3686m = f9;
                        float f10 = cVar.f3684k;
                        if (C0369g.m1482i(xmlPullParser, "trimPathStart")) {
                            f10 = typedArray.getFloat(5, f10);
                        }
                        cVar.f3684k = f10;
                        int i8 = cVar.f3705c;
                        if (C0369g.m1482i(xmlPullParser, "fillType")) {
                            i8 = typedArray.getInt(13, i8);
                        }
                        cVar.f3705c = i8;
                    } else {
                        typedArray = typedArrayM1484k2;
                        cVar = cVar2;
                    }
                    typedArray.recycle();
                    dVar.f3691b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar = gVar3;
                        gVar.f3723p.put(cVar.getPathName(), cVar);
                    } else {
                        gVar = gVar3;
                    }
                    hVar3.f3724a |= cVar.f3706d;
                    arrayDeque = arrayDeque;
                    z2 = false;
                } else {
                    ArrayDeque arrayDeque2 = arrayDeque;
                    gVar = gVar3;
                    depth = depth;
                    if ("clip-path".equals(name)) {
                        b bVar = new b();
                        if (C0369g.m1482i(xmlPullParser, "pathData")) {
                            TypedArray typedArrayM1484k3 = C0369g.m1484k(resources, theme, attributeSet, C0602a.f3644d);
                            String string4 = typedArrayM1484k3.getString(0);
                            if (string4 != null) {
                                bVar.f3704b = string4;
                            }
                            String string5 = typedArrayM1484k3.getString(1);
                            if (string5 != null) {
                                bVar.f3703a = C0360f.m1455o(string5);
                            }
                            bVar.f3705c = !C0369g.m1482i(xmlPullParser, "fillType") ? 0 : typedArrayM1484k3.getInt(2, 0);
                            typedArrayM1484k3.recycle();
                        }
                        dVar.f3691b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f3723p.put(bVar.getPathName(), bVar);
                        }
                        hVar3.f3724a = bVar.f3706d | hVar3.f3724a;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        TypedArray typedArrayM1484k4 = C0369g.m1484k(resources, theme, attributeSet, C0602a.f3642b);
                        dVar2.f3701l = null;
                        float f11 = dVar2.f3692c;
                        if (C0369g.m1482i(xmlPullParser, "rotation")) {
                            f11 = typedArrayM1484k4.getFloat(5, f11);
                        }
                        dVar2.f3692c = f11;
                        dVar2.f3693d = typedArrayM1484k4.getFloat(1, dVar2.f3693d);
                        dVar2.f3694e = typedArrayM1484k4.getFloat(2, dVar2.f3694e);
                        float f12 = dVar2.f3695f;
                        if (C0369g.m1482i(xmlPullParser, "scaleX")) {
                            f12 = typedArrayM1484k4.getFloat(3, f12);
                        }
                        dVar2.f3695f = f12;
                        float f13 = dVar2.f3696g;
                        if (C0369g.m1482i(xmlPullParser, "scaleY")) {
                            f13 = typedArrayM1484k4.getFloat(4, f13);
                        }
                        dVar2.f3696g = f13;
                        float f14 = dVar2.f3697h;
                        if (C0369g.m1482i(xmlPullParser, "translateX")) {
                            f14 = typedArrayM1484k4.getFloat(6, f14);
                        }
                        dVar2.f3697h = f14;
                        float f15 = dVar2.f3698i;
                        if (C0369g.m1482i(xmlPullParser, "translateY")) {
                            f15 = typedArrayM1484k4.getFloat(7, f15);
                        }
                        dVar2.f3698i = f15;
                        String string6 = typedArrayM1484k4.getString(0);
                        if (string6 != null) {
                            dVar2.f3702m = string6;
                        }
                        dVar2.m2159c();
                        typedArrayM1484k4.recycle();
                        dVar.f3691b.add(dVar2);
                        arrayDeque = arrayDeque2;
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f3723p.put(dVar2.getGroupName(), dVar2);
                        }
                        hVar3.f3724a = dVar2.f3700k | hVar3.f3724a;
                    }
                    arrayDeque = arrayDeque2;
                }
            } else {
                gVar = gVar3;
                depth = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i3 = 3;
            i4 = 1;
            gVar3 = gVar;
            depth = depth;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f3671d = m2155b(hVar.f3726c, hVar.f3727d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.isAutoMirrored() : this.f3670c.f3728e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f3670c) != null && (hVar.m2161a() || ((colorStateList = this.f3670c.f3726c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3673f && super.mutate() == this) {
            this.f3670c = new h(this.f3670c);
            this.f3673f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f3670c;
        ColorStateList colorStateList = hVar.f3726c;
        if (colorStateList != null && (mode = hVar.f3727d) != null) {
            this.f3671d = m2155b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.m2161a()) {
            boolean zMo2158b = hVar.f3725b.f3715h.mo2158b(iArr);
            hVar.f3734k |= zMo2158b;
            if (zMo2158b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f3670c.f3725b.getRootAlpha() != i2) {
            this.f3670c.f3725b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f3670c.f3728e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3672e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTint(int i2) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            C0360f.m1432X(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            C0360f.m1433Y(drawable, colorStateList);
            return;
        }
        h hVar = this.f3670c;
        if (hVar.f3726c != colorStateList) {
            hVar.f3726c = colorStateList;
            this.f3671d = m2155b(colorStateList, hVar.f3727d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            C0360f.m1434Z(drawable, mode);
            return;
        }
        h hVar = this.f3670c;
        if (hVar.f3727d != mode) {
            hVar.f3727d = mode;
            this.f3671d = m2155b(hVar.f3726c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3668b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3668b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
