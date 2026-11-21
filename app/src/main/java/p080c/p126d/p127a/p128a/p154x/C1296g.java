package p080c.p126d.p127a.p128a.p154x;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Objects;
import p006b.p032h.p036d.C0370a;
import p006b.p032h.p036d.p037k.InterfaceC0380a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p153w.C1288a;

/* JADX INFO: renamed from: c.d.a.a.x.g */
/* JADX INFO: loaded from: classes.dex */
public class C1296g extends Drawable implements InterfaceC0380a, InterfaceC1303n {

    /* JADX INFO: renamed from: w */
    public static final Paint f6210w = new Paint(1);

    /* JADX INFO: renamed from: b */
    public b f6211b;

    /* JADX INFO: renamed from: c */
    public final C1302m.f[] f6212c;

    /* JADX INFO: renamed from: d */
    public final C1302m.f[] f6213d;

    /* JADX INFO: renamed from: e */
    public boolean f6214e;

    /* JADX INFO: renamed from: f */
    public final Matrix f6215f;

    /* JADX INFO: renamed from: g */
    public final Path f6216g;

    /* JADX INFO: renamed from: h */
    public final Path f6217h;

    /* JADX INFO: renamed from: i */
    public final RectF f6218i;

    /* JADX INFO: renamed from: j */
    public final RectF f6219j;

    /* JADX INFO: renamed from: k */
    public final Region f6220k;

    /* JADX INFO: renamed from: l */
    public final Region f6221l;

    /* JADX INFO: renamed from: m */
    public C1299j f6222m;

    /* JADX INFO: renamed from: n */
    public final Paint f6223n;

    /* JADX INFO: renamed from: o */
    public final Paint f6224o;

    /* JADX INFO: renamed from: p */
    public final C1288a f6225p;

    /* JADX INFO: renamed from: q */
    public final C1300k.a f6226q;

    /* JADX INFO: renamed from: r */
    public final C1300k f6227r;

    /* JADX INFO: renamed from: s */
    public PorterDuffColorFilter f6228s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f6229t;

    /* JADX INFO: renamed from: u */
    public Rect f6230u;

    /* JADX INFO: renamed from: v */
    public final RectF f6231v;

    /* JADX INFO: renamed from: c.d.a.a.x.g$a */
    public class a implements C1300k.a {
        public a() {
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.x.g$b */
    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public C1299j f6233a;

        /* JADX INFO: renamed from: b */
        public C1252a f6234b;

        /* JADX INFO: renamed from: c */
        public ColorFilter f6235c;

        /* JADX INFO: renamed from: d */
        public ColorStateList f6236d;

        /* JADX INFO: renamed from: e */
        public ColorStateList f6237e;

        /* JADX INFO: renamed from: f */
        public ColorStateList f6238f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f6239g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f6240h;

        /* JADX INFO: renamed from: i */
        public Rect f6241i;

        /* JADX INFO: renamed from: j */
        public float f6242j;

        /* JADX INFO: renamed from: k */
        public float f6243k;

        /* JADX INFO: renamed from: l */
        public float f6244l;

        /* JADX INFO: renamed from: m */
        public int f6245m;

        /* JADX INFO: renamed from: n */
        public float f6246n;

        /* JADX INFO: renamed from: o */
        public float f6247o;

        /* JADX INFO: renamed from: p */
        public float f6248p;

        /* JADX INFO: renamed from: q */
        public int f6249q;

        /* JADX INFO: renamed from: r */
        public int f6250r;

        /* JADX INFO: renamed from: s */
        public int f6251s;

        /* JADX INFO: renamed from: t */
        public int f6252t;

        /* JADX INFO: renamed from: u */
        public boolean f6253u;

        /* JADX INFO: renamed from: v */
        public Paint.Style f6254v;

        public b(b bVar) {
            this.f6236d = null;
            this.f6237e = null;
            this.f6238f = null;
            this.f6239g = null;
            this.f6240h = PorterDuff.Mode.SRC_IN;
            this.f6241i = null;
            this.f6242j = 1.0f;
            this.f6243k = 1.0f;
            this.f6245m = 255;
            this.f6246n = 0.0f;
            this.f6247o = 0.0f;
            this.f6248p = 0.0f;
            this.f6249q = 0;
            this.f6250r = 0;
            this.f6251s = 0;
            this.f6252t = 0;
            this.f6253u = false;
            this.f6254v = Paint.Style.FILL_AND_STROKE;
            this.f6233a = bVar.f6233a;
            this.f6234b = bVar.f6234b;
            this.f6244l = bVar.f6244l;
            this.f6235c = bVar.f6235c;
            this.f6236d = bVar.f6236d;
            this.f6237e = bVar.f6237e;
            this.f6240h = bVar.f6240h;
            this.f6239g = bVar.f6239g;
            this.f6245m = bVar.f6245m;
            this.f6242j = bVar.f6242j;
            this.f6251s = bVar.f6251s;
            this.f6249q = bVar.f6249q;
            this.f6253u = bVar.f6253u;
            this.f6243k = bVar.f6243k;
            this.f6246n = bVar.f6246n;
            this.f6247o = bVar.f6247o;
            this.f6248p = bVar.f6248p;
            this.f6250r = bVar.f6250r;
            this.f6252t = bVar.f6252t;
            this.f6238f = bVar.f6238f;
            this.f6254v = bVar.f6254v;
            if (bVar.f6241i != null) {
                this.f6241i = new Rect(bVar.f6241i);
            }
        }

        public b(C1299j c1299j, C1252a c1252a) {
            this.f6236d = null;
            this.f6237e = null;
            this.f6238f = null;
            this.f6239g = null;
            this.f6240h = PorterDuff.Mode.SRC_IN;
            this.f6241i = null;
            this.f6242j = 1.0f;
            this.f6243k = 1.0f;
            this.f6245m = 255;
            this.f6246n = 0.0f;
            this.f6247o = 0.0f;
            this.f6248p = 0.0f;
            this.f6249q = 0;
            this.f6250r = 0;
            this.f6251s = 0;
            this.f6252t = 0;
            this.f6253u = false;
            this.f6254v = Paint.Style.FILL_AND_STROKE;
            this.f6233a = c1299j;
            this.f6234b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1296g c1296g = new C1296g(this);
            c1296g.f6214e = true;
            return c1296g;
        }
    }

    public C1296g() {
        this(new C1299j());
    }

    public C1296g(b bVar) {
        this.f6212c = new C1302m.f[4];
        this.f6213d = new C1302m.f[4];
        this.f6215f = new Matrix();
        this.f6216g = new Path();
        this.f6217h = new Path();
        this.f6218i = new RectF();
        this.f6219j = new RectF();
        this.f6220k = new Region();
        this.f6221l = new Region();
        Paint paint = new Paint(1);
        this.f6223n = paint;
        Paint paint2 = new Paint(1);
        this.f6224o = paint2;
        this.f6225p = new C1288a();
        this.f6227r = new C1300k();
        this.f6231v = new RectF();
        this.f6211b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f6210w;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m2983x();
        m2982w(getState());
        this.f6226q = new a();
    }

    public C1296g(C1299j c1299j) {
        this(new b(c1299j, null));
    }

    /* JADX INFO: renamed from: b */
    public final void m2961b(RectF rectF, Path path) {
        m2962c(rectF, path);
        if (this.f6211b.f6242j != 1.0f) {
            this.f6215f.reset();
            Matrix matrix = this.f6215f;
            float f = this.f6211b.f6242j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f6215f);
        }
        path.computeBounds(this.f6231v, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m2962c(RectF rectF, Path path) {
        C1300k c1300k = this.f6227r;
        b bVar = this.f6211b;
        c1300k.m2996a(bVar.f6233a, bVar.f6243k, rectF, this.f6226q, path);
    }

    /* JADX INFO: renamed from: d */
    public final PorterDuffColorFilter m2963d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iM2964e;
        if (colorStateList == null || mode == null) {
            return (!z || (iM2964e = m2964e((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iM2964e, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m2964e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        this.f6223n.setColorFilter(this.f6228s);
        int alpha = this.f6223n.getAlpha();
        Paint paint = this.f6223n;
        int i2 = this.f6211b.f6245m;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        this.f6224o.setColorFilter(this.f6229t);
        this.f6224o.setStrokeWidth(this.f6211b.f6244l);
        int alpha2 = this.f6224o.getAlpha();
        Paint paint2 = this.f6224o;
        int i3 = this.f6211b.f6245m;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        if (this.f6214e) {
            float f = -m2970k();
            C1299j c1299j = this.f6211b.f6233a;
            Objects.requireNonNull(c1299j);
            C1299j.b bVar = new C1299j.b(c1299j);
            InterfaceC1292c c1291b = c1299j.f6261e;
            if (!(c1291b instanceof C1297h)) {
                c1291b = new C1291b(f, c1291b);
            }
            bVar.f6273e = c1291b;
            InterfaceC1292c c1291b2 = c1299j.f6262f;
            if (!(c1291b2 instanceof C1297h)) {
                c1291b2 = new C1291b(f, c1291b2);
            }
            bVar.f6274f = c1291b2;
            InterfaceC1292c c1291b3 = c1299j.f6264h;
            if (!(c1291b3 instanceof C1297h)) {
                c1291b3 = new C1291b(f, c1291b3);
            }
            bVar.f6276h = c1291b3;
            InterfaceC1292c c1291b4 = c1299j.f6263g;
            if (!(c1291b4 instanceof C1297h)) {
                c1291b4 = new C1291b(f, c1291b4);
            }
            bVar.f6275g = c1291b4;
            C1299j c1299jM2991a = bVar.m2991a();
            this.f6222m = c1299jM2991a;
            this.f6227r.m2996a(c1299jM2991a, this.f6211b.f6243k, m2967h(), null, this.f6217h);
            m2961b(m2966g(), this.f6216g);
            this.f6214e = false;
        }
        b bVar2 = this.f6211b;
        int i4 = bVar2.f6249q;
        if (i4 == 1 || bVar2.f6250r <= 0) {
            z = false;
        } else {
            if (i4 != 2) {
                if (!(i < 21 || !(bVar2.f6233a.m2988d(m2966g()) || this.f6216g.isConvex()))) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            canvas.save();
            int iM2968i = m2968i();
            int iM2969j = m2969j();
            if (i < 21) {
                Rect clipBounds = canvas.getClipBounds();
                int i5 = -this.f6211b.f6250r;
                clipBounds.inset(i5, i5);
                clipBounds.offset(iM2968i, iM2969j);
                canvas.clipRect(clipBounds, Region.Op.REPLACE);
            }
            canvas.translate(iM2968i, iM2969j);
            int iWidth = (int) (this.f6231v.width() - getBounds().width());
            int iHeight = (int) (this.f6231v.height() - getBounds().height());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f6211b.f6250r * 2) + ((int) this.f6231v.width()) + iWidth, (this.f6211b.f6250r * 2) + ((int) this.f6231v.height()) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f2 = (getBounds().left - this.f6211b.f6250r) - iWidth;
            float f3 = (getBounds().top - this.f6211b.f6250r) - iHeight;
            canvas2.translate(-f2, -f3);
            if (this.f6211b.f6251s != 0) {
                canvas2.drawPath(this.f6216g, this.f6225p.f6200a);
            }
            for (int i6 = 0; i6 < 4; i6++) {
                C1302m.f fVar = this.f6212c[i6];
                C1288a c1288a = this.f6225p;
                int i7 = this.f6211b.f6250r;
                Matrix matrix = C1302m.f.f6312a;
                fVar.mo2997a(matrix, c1288a, i7, canvas2);
                this.f6213d[i6].mo2997a(matrix, this.f6225p, this.f6211b.f6250r, canvas2);
            }
            int iM2968i2 = m2968i();
            int iM2969j2 = m2969j();
            canvas2.translate(-iM2968i2, -iM2969j2);
            canvas2.drawPath(this.f6216g, f6210w);
            canvas2.translate(iM2968i2, iM2969j2);
            canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
        b bVar3 = this.f6211b;
        Paint.Style style = bVar3.f6254v;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m2965f(canvas, this.f6223n, this.f6216g, bVar3.f6233a, m2966g());
        }
        if (m2972m()) {
            m2965f(canvas, this.f6224o, this.f6217h, this.f6222m, m2967h());
        }
        this.f6223n.setAlpha(alpha);
        this.f6224o.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final int m2964e(int i) {
        b bVar = this.f6211b;
        float f = bVar.f6247o + bVar.f6248p + bVar.f6246n;
        C1252a c1252a = bVar.f6234b;
        if (c1252a == null || !c1252a.f5968a) {
            return i;
        }
        if (!(C0370a.m1489c(i, 255) == c1252a.f5970c)) {
            return i;
        }
        float f2 = c1252a.f5971d;
        float fMin = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            fMin = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return C0370a.m1489c(C1161a.m2731p(C0370a.m1489c(i, 255), c1252a.f5969b, fMin), Color.alpha(i));
    }

    /* JADX INFO: renamed from: f */
    public final void m2965f(Canvas canvas, Paint paint, Path path, C1299j c1299j, RectF rectF) {
        if (!c1299j.m2988d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo2958a = c1299j.f6262f.mo2958a(rectF);
            canvas.drawRoundRect(rectF, fMo2958a, fMo2958a, paint);
        }
    }

    /* JADX INFO: renamed from: g */
    public RectF m2966g() {
        Rect bounds = getBounds();
        this.f6218i.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return this.f6218i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f6211b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f6211b;
        if (bVar.f6249q == 2) {
            return;
        }
        if (bVar.f6233a.m2988d(m2966g())) {
            outline.setRoundRect(getBounds(), m2971l());
        } else {
            m2961b(m2966g(), this.f6216g);
            if (this.f6216g.isConvex()) {
                outline.setConvexPath(this.f6216g);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f6230u;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f6220k.set(getBounds());
        m2961b(m2966g(), this.f6216g);
        this.f6221l.setPath(this.f6216g, this.f6220k);
        this.f6220k.op(this.f6221l, Region.Op.DIFFERENCE);
        return this.f6220k;
    }

    /* JADX INFO: renamed from: h */
    public final RectF m2967h() {
        RectF rectFM2966g = m2966g();
        float fM2970k = m2970k();
        this.f6219j.set(rectFM2966g.left + fM2970k, rectFM2966g.top + fM2970k, rectFM2966g.right - fM2970k, rectFM2966g.bottom - fM2970k);
        return this.f6219j;
    }

    /* JADX INFO: renamed from: i */
    public int m2968i() {
        b bVar = this.f6211b;
        double d = bVar.f6251s;
        double dSin = Math.sin(Math.toRadians(bVar.f6252t));
        Double.isNaN(d);
        return (int) (dSin * d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f6214e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f6211b.f6239g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f6211b.f6238f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f6211b.f6237e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f6211b.f6236d) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: renamed from: j */
    public int m2969j() {
        b bVar = this.f6211b;
        double d = bVar.f6251s;
        double dCos = Math.cos(Math.toRadians(bVar.f6252t));
        Double.isNaN(d);
        return (int) (dCos * d);
    }

    /* JADX INFO: renamed from: k */
    public final float m2970k() {
        if (m2972m()) {
            return this.f6224o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: l */
    public float m2971l() {
        return this.f6211b.f6233a.f6261e.mo2958a(m2966g());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2972m() {
        Paint.Style style = this.f6211b.f6254v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f6224o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6211b = new b(this.f6211b);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m2973n(Context context) {
        this.f6211b.f6234b = new C1252a(context);
        m2984y();
    }

    /* JADX INFO: renamed from: o */
    public void m2974o(float f) {
        b bVar = this.f6211b;
        if (bVar.f6247o != f) {
            bVar.f6247o = f;
            m2984y();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6214e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p080c.p126d.p127a.p128a.p148r.C1276m.b
    public boolean onStateChange(int[] iArr) {
        boolean z = m2982w(iArr) || m2983x();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public void m2975p(ColorStateList colorStateList) {
        b bVar = this.f6211b;
        if (bVar.f6236d != colorStateList) {
            bVar.f6236d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2976q(float f) {
        b bVar = this.f6211b;
        if (bVar.f6243k != f) {
            bVar.f6243k = f;
            this.f6214e = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2977r(int i) {
        this.f6225p.m2957a(i);
        this.f6211b.f6253u = false;
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    public void m2978s(int i) {
        b bVar = this.f6211b;
        if (bVar.f6252t != i) {
            bVar.f6252t = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.f6211b;
        if (bVar.f6245m != i) {
            bVar.f6245m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6211b.f6235c = colorFilter;
        super.invalidateSelf();
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1303n
    public void setShapeAppearanceModel(C1299j c1299j) {
        this.f6211b.f6233a = c1299j;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintList(ColorStateList colorStateList) {
        this.f6211b.f6239g = colorStateList;
        m2983x();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f6211b;
        if (bVar.f6240h != mode) {
            bVar.f6240h = mode;
            m2983x();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m2979t(float f, int i) {
        this.f6211b.f6244l = f;
        invalidateSelf();
        m2981v(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: u */
    public void m2980u(float f, ColorStateList colorStateList) {
        this.f6211b.f6244l = f;
        invalidateSelf();
        m2981v(colorStateList);
    }

    /* JADX INFO: renamed from: v */
    public void m2981v(ColorStateList colorStateList) {
        b bVar = this.f6211b;
        if (bVar.f6237e != colorStateList) {
            bVar.f6237e = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2982w(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f6211b.f6236d == null || color2 == (colorForState2 = this.f6211b.f6236d.getColorForState(iArr, (color2 = this.f6223n.getColor())))) {
            z = false;
        } else {
            this.f6223n.setColor(colorForState2);
            z = true;
        }
        if (this.f6211b.f6237e == null || color == (colorForState = this.f6211b.f6237e.getColorForState(iArr, (color = this.f6224o.getColor())))) {
            return z;
        }
        this.f6224o.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2983x() {
        PorterDuffColorFilter porterDuffColorFilter = this.f6228s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6229t;
        b bVar = this.f6211b;
        this.f6228s = m2963d(bVar.f6239g, bVar.f6240h, this.f6223n, true);
        b bVar2 = this.f6211b;
        this.f6229t = m2963d(bVar2.f6238f, bVar2.f6240h, this.f6224o, false);
        b bVar3 = this.f6211b;
        if (bVar3.f6253u) {
            this.f6225p.m2957a(bVar3.f6239g.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.f6228s) && Objects.equals(porterDuffColorFilter2, this.f6229t)) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final void m2984y() {
        b bVar = this.f6211b;
        float f = bVar.f6247o + bVar.f6248p;
        bVar.f6250r = (int) Math.ceil(0.75f * f);
        this.f6211b.f6251s = (int) Math.ceil(f * 0.25f);
        m2983x();
        super.invalidateSelf();
    }
}
