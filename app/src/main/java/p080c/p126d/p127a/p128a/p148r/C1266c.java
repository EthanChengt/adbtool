package p080c.p126d.p127a.p128a.p148r;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import java.util.WeakHashMap;
import p006b.p032h.p042h.C0399d;
import p006b.p032h.p044j.C0418m;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.p131c.C1182a;
import p080c.p126d.p127a.p128a.p151u.C1282a;

/* JADX INFO: renamed from: c.d.a.a.r.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1266c {

    /* JADX INFO: renamed from: A */
    public float f6051A;

    /* JADX INFO: renamed from: B */
    public float f6052B;

    /* JADX INFO: renamed from: C */
    public int[] f6053C;

    /* JADX INFO: renamed from: D */
    public boolean f6054D;

    /* JADX INFO: renamed from: E */
    public final TextPaint f6055E;

    /* JADX INFO: renamed from: F */
    public final TextPaint f6056F;

    /* JADX INFO: renamed from: G */
    public TimeInterpolator f6057G;

    /* JADX INFO: renamed from: H */
    public TimeInterpolator f6058H;

    /* JADX INFO: renamed from: I */
    public float f6059I;

    /* JADX INFO: renamed from: J */
    public float f6060J;

    /* JADX INFO: renamed from: K */
    public float f6061K;

    /* JADX INFO: renamed from: L */
    public ColorStateList f6062L;

    /* JADX INFO: renamed from: a */
    public final View f6063a;

    /* JADX INFO: renamed from: b */
    public boolean f6064b;

    /* JADX INFO: renamed from: c */
    public float f6065c;

    /* JADX INFO: renamed from: d */
    public final Rect f6066d;

    /* JADX INFO: renamed from: e */
    public final Rect f6067e;

    /* JADX INFO: renamed from: f */
    public final RectF f6068f;

    /* JADX INFO: renamed from: g */
    public int f6069g = 16;

    /* JADX INFO: renamed from: h */
    public int f6070h = 16;

    /* JADX INFO: renamed from: i */
    public float f6071i = 15.0f;

    /* JADX INFO: renamed from: j */
    public float f6072j = 15.0f;

    /* JADX INFO: renamed from: k */
    public ColorStateList f6073k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f6074l;

    /* JADX INFO: renamed from: m */
    public float f6075m;

    /* JADX INFO: renamed from: n */
    public float f6076n;

    /* JADX INFO: renamed from: o */
    public float f6077o;

    /* JADX INFO: renamed from: p */
    public float f6078p;

    /* JADX INFO: renamed from: q */
    public float f6079q;

    /* JADX INFO: renamed from: r */
    public float f6080r;

    /* JADX INFO: renamed from: s */
    public Typeface f6081s;

    /* JADX INFO: renamed from: t */
    public Typeface f6082t;

    /* JADX INFO: renamed from: u */
    public Typeface f6083u;

    /* JADX INFO: renamed from: v */
    public C1282a f6084v;

    /* JADX INFO: renamed from: w */
    public CharSequence f6085w;

    /* JADX INFO: renamed from: x */
    public CharSequence f6086x;

    /* JADX INFO: renamed from: y */
    public boolean f6087y;

    /* JADX INFO: renamed from: z */
    public Bitmap f6088z;

    public C1266c(View view) {
        this.f6063a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f6055E = textPaint;
        this.f6056F = new TextPaint(textPaint);
        this.f6067e = new Rect();
        this.f6066d = new Rect();
        this.f6068f = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public static int m2912a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: i */
    public static float m2913i(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = C1182a.f5662a;
        return a.m2187a(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2914l(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* JADX INFO: renamed from: b */
    public float m2915b() {
        if (this.f6085w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f6056F;
        textPaint.setTextSize(this.f6072j);
        textPaint.setTypeface(this.f6081s);
        TextPaint textPaint2 = this.f6056F;
        CharSequence charSequence = this.f6085w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2916c(CharSequence charSequence) {
        View view = this.f6063a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return ((C0399d.c) (view.getLayoutDirection() == 1 ? C0399d.f2689d : C0399d.f2688c)).m1534b(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: d */
    public final void m2917d(float f) {
        TextPaint textPaint;
        int iM2920g;
        this.f6068f.left = m2913i(this.f6066d.left, this.f6067e.left, f, this.f6057G);
        this.f6068f.top = m2913i(this.f6075m, this.f6076n, f, this.f6057G);
        this.f6068f.right = m2913i(this.f6066d.right, this.f6067e.right, f, this.f6057G);
        this.f6068f.bottom = m2913i(this.f6066d.bottom, this.f6067e.bottom, f, this.f6057G);
        this.f6079q = m2913i(this.f6077o, this.f6078p, f, this.f6057G);
        this.f6080r = m2913i(this.f6075m, this.f6076n, f, this.f6057G);
        m2926o(m2913i(this.f6071i, this.f6072j, f, this.f6058H));
        ColorStateList colorStateList = this.f6074l;
        ColorStateList colorStateList2 = this.f6073k;
        if (colorStateList != colorStateList2) {
            textPaint = this.f6055E;
            iM2920g = m2912a(m2921h(colorStateList2), m2920g(), f);
        } else {
            textPaint = this.f6055E;
            iM2920g = m2920g();
        }
        textPaint.setColor(iM2920g);
        this.f6055E.setShadowLayer(m2913i(0.0f, this.f6059I, f, null), m2913i(0.0f, this.f6060J, f, null), m2913i(0.0f, this.f6061K, f, null), m2912a(m2921h(null), m2921h(this.f6062L), f));
        View view = this.f6063a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: e */
    public final void m2918e(float f) {
        boolean z;
        float f2;
        if (this.f6085w == null) {
            return;
        }
        float fWidth = this.f6067e.width();
        float fWidth2 = this.f6066d.width();
        if (Math.abs(f - this.f6072j) < 0.001f) {
            f2 = this.f6072j;
            this.f6051A = 1.0f;
            Typeface typeface = this.f6083u;
            Typeface typeface2 = this.f6081s;
            if (typeface != typeface2) {
                this.f6083u = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f3 = this.f6071i;
            Typeface typeface3 = this.f6083u;
            Typeface typeface4 = this.f6082t;
            if (typeface3 != typeface4) {
                this.f6083u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                this.f6051A = 1.0f;
            } else {
                this.f6051A = f / this.f6071i;
            }
            float f4 = this.f6072j / this.f6071i;
            fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
        }
        if (fWidth > 0.0f) {
            z = this.f6052B != f2 || this.f6054D || z;
            this.f6052B = f2;
            this.f6054D = false;
        }
        if (this.f6086x == null || z) {
            this.f6055E.setTextSize(this.f6052B);
            this.f6055E.setTypeface(this.f6083u);
            this.f6055E.setLinearText(this.f6051A != 1.0f);
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.f6085w, this.f6055E, fWidth, TextUtils.TruncateAt.END);
            if (TextUtils.equals(charSequenceEllipsize, this.f6086x)) {
                return;
            }
            this.f6086x = charSequenceEllipsize;
            this.f6087y = m2916c(charSequenceEllipsize);
        }
    }

    /* JADX INFO: renamed from: f */
    public float m2919f() {
        TextPaint textPaint = this.f6056F;
        textPaint.setTextSize(this.f6072j);
        textPaint.setTypeface(this.f6081s);
        return -this.f6056F.ascent();
    }

    /* JADX INFO: renamed from: g */
    public int m2920g() {
        return m2921h(this.f6074l);
    }

    /* JADX INFO: renamed from: h */
    public final int m2921h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f6053C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: j */
    public void m2922j() {
        this.f6064b = this.f6067e.width() > 0 && this.f6067e.height() > 0 && this.f6066d.width() > 0 && this.f6066d.height() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX INFO: renamed from: k */
    public void m2923k() {
        float fAscent;
        int i;
        float fCenterX;
        float fMeasureText;
        int i2;
        float fAscent2;
        int i3;
        float fCenterX2;
        float f;
        Bitmap bitmap;
        if (this.f6063a.getHeight() <= 0 || this.f6063a.getWidth() <= 0) {
            return;
        }
        float f2 = this.f6052B;
        m2918e(this.f6072j);
        CharSequence charSequence = this.f6086x;
        float fMeasureText2 = charSequence != null ? this.f6055E.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f6070h, this.f6087y ? 1 : 0);
        int i4 = absoluteGravity & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.f6076n = this.f6067e.centerY() + (((this.f6055E.descent() - this.f6055E.ascent()) / 2.0f) - this.f6055E.descent());
            } else {
                fAscent = this.f6067e.bottom;
            }
            i = absoluteGravity & 8388615;
            if (i != 1) {
                if (i != 5) {
                    this.f6078p = this.f6067e.left;
                } else {
                    fCenterX = this.f6067e.right;
                }
                m2918e(this.f6071i);
                CharSequence charSequence2 = this.f6086x;
                fMeasureText = charSequence2 != null ? this.f6055E.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
                int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f6069g, this.f6087y ? 1 : 0);
                i2 = absoluteGravity2 & 112;
                if (i2 != 48) {
                    if (i2 != 80) {
                        this.f6075m = this.f6066d.centerY() + (((this.f6055E.descent() - this.f6055E.ascent()) / 2.0f) - this.f6055E.descent());
                    } else {
                        fAscent2 = this.f6066d.bottom;
                    }
                    i3 = absoluteGravity2 & 8388615;
                    if (i3 != 1) {
                        if (i3 != 5) {
                            f = this.f6066d.left;
                        } else {
                            fCenterX2 = this.f6066d.right;
                        }
                        this.f6077o = f;
                        bitmap = this.f6088z;
                        if (bitmap != null) {
                            bitmap.recycle();
                            this.f6088z = null;
                        }
                        m2918e(f2);
                        View view = this.f6063a;
                        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                        view.postInvalidateOnAnimation();
                        m2917d(this.f6065c);
                    }
                    fCenterX2 = this.f6066d.centerX();
                    fMeasureText /= 2.0f;
                    f = fCenterX2 - fMeasureText;
                    this.f6077o = f;
                    bitmap = this.f6088z;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.f6088z = null;
                    }
                    m2918e(f2);
                    View view2 = this.f6063a;
                    WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                    view2.postInvalidateOnAnimation();
                    m2917d(this.f6065c);
                }
                fAscent2 = this.f6066d.top - this.f6055E.ascent();
                this.f6075m = fAscent2;
                i3 = absoluteGravity2 & 8388615;
                if (i3 != 1) {
                    if (i3 != 5) {
                        f = this.f6066d.left;
                    } else {
                        fCenterX2 = this.f6066d.right;
                    }
                    this.f6077o = f;
                    bitmap = this.f6088z;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.f6088z = null;
                    }
                    m2918e(f2);
                    View view3 = this.f6063a;
                    WeakHashMap<View, String> weakHashMap3 = C0418m.f2718a;
                    view3.postInvalidateOnAnimation();
                    m2917d(this.f6065c);
                }
                fCenterX2 = this.f6066d.centerX();
                fMeasureText /= 2.0f;
                f = fCenterX2 - fMeasureText;
                this.f6077o = f;
                bitmap = this.f6088z;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f6088z = null;
                }
                m2918e(f2);
                View view4 = this.f6063a;
                WeakHashMap<View, String> weakHashMap4 = C0418m.f2718a;
                view4.postInvalidateOnAnimation();
                m2917d(this.f6065c);
            }
            fCenterX = this.f6067e.centerX();
            fMeasureText2 /= 2.0f;
            this.f6078p = fCenterX - fMeasureText2;
            m2918e(this.f6071i);
            CharSequence charSequence3 = this.f6086x;
            if (charSequence3 != null) {
            }
            int absoluteGravity3 = Gravity.getAbsoluteGravity(this.f6069g, this.f6087y ? 1 : 0);
            i2 = absoluteGravity3 & 112;
            if (i2 != 48) {
                if (i2 != 80) {
                    this.f6075m = this.f6066d.centerY() + (((this.f6055E.descent() - this.f6055E.ascent()) / 2.0f) - this.f6055E.descent());
                } else {
                    fAscent2 = this.f6066d.bottom;
                }
                i3 = absoluteGravity3 & 8388615;
                if (i3 != 1) {
                    if (i3 != 5) {
                        f = this.f6066d.left;
                    } else {
                        fCenterX2 = this.f6066d.right;
                    }
                    this.f6077o = f;
                    bitmap = this.f6088z;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.f6088z = null;
                    }
                    m2918e(f2);
                    View view5 = this.f6063a;
                    WeakHashMap<View, String> weakHashMap5 = C0418m.f2718a;
                    view5.postInvalidateOnAnimation();
                    m2917d(this.f6065c);
                }
                fCenterX2 = this.f6066d.centerX();
                fMeasureText /= 2.0f;
                f = fCenterX2 - fMeasureText;
                this.f6077o = f;
                bitmap = this.f6088z;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f6088z = null;
                }
                m2918e(f2);
                View view6 = this.f6063a;
                WeakHashMap<View, String> weakHashMap6 = C0418m.f2718a;
                view6.postInvalidateOnAnimation();
                m2917d(this.f6065c);
            }
            fAscent2 = this.f6066d.top - this.f6055E.ascent();
            this.f6075m = fAscent2;
            i3 = absoluteGravity3 & 8388615;
            if (i3 != 1) {
                if (i3 != 5) {
                    f = this.f6066d.left;
                } else {
                    fCenterX2 = this.f6066d.right;
                }
                this.f6077o = f;
                bitmap = this.f6088z;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f6088z = null;
                }
                m2918e(f2);
                View view7 = this.f6063a;
                WeakHashMap<View, String> weakHashMap7 = C0418m.f2718a;
                view7.postInvalidateOnAnimation();
                m2917d(this.f6065c);
            }
            fCenterX2 = this.f6066d.centerX();
            fMeasureText /= 2.0f;
            f = fCenterX2 - fMeasureText;
            this.f6077o = f;
            bitmap = this.f6088z;
            if (bitmap != null) {
                bitmap.recycle();
                this.f6088z = null;
            }
            m2918e(f2);
            View view8 = this.f6063a;
            WeakHashMap<View, String> weakHashMap8 = C0418m.f2718a;
            view8.postInvalidateOnAnimation();
            m2917d(this.f6065c);
        }
        fAscent = this.f6067e.top - this.f6055E.ascent();
        this.f6076n = fAscent;
        i = absoluteGravity & 8388615;
        if (i != 1) {
            if (i != 5) {
                this.f6078p = this.f6067e.left;
            } else {
                fCenterX = this.f6067e.right;
            }
            m2918e(this.f6071i);
            CharSequence charSequence4 = this.f6086x;
            if (charSequence4 != null) {
            }
            int absoluteGravity4 = Gravity.getAbsoluteGravity(this.f6069g, this.f6087y ? 1 : 0);
            i2 = absoluteGravity4 & 112;
            if (i2 != 48) {
                if (i2 != 80) {
                    this.f6075m = this.f6066d.centerY() + (((this.f6055E.descent() - this.f6055E.ascent()) / 2.0f) - this.f6055E.descent());
                } else {
                    fAscent2 = this.f6066d.bottom;
                }
                i3 = absoluteGravity4 & 8388615;
                if (i3 != 1) {
                    if (i3 != 5) {
                        f = this.f6066d.left;
                    } else {
                        fCenterX2 = this.f6066d.right;
                    }
                    this.f6077o = f;
                    bitmap = this.f6088z;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.f6088z = null;
                    }
                    m2918e(f2);
                    View view9 = this.f6063a;
                    WeakHashMap<View, String> weakHashMap9 = C0418m.f2718a;
                    view9.postInvalidateOnAnimation();
                    m2917d(this.f6065c);
                }
                fCenterX2 = this.f6066d.centerX();
                fMeasureText /= 2.0f;
                f = fCenterX2 - fMeasureText;
                this.f6077o = f;
                bitmap = this.f6088z;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f6088z = null;
                }
                m2918e(f2);
                View view10 = this.f6063a;
                WeakHashMap<View, String> weakHashMap10 = C0418m.f2718a;
                view10.postInvalidateOnAnimation();
                m2917d(this.f6065c);
            }
            fAscent2 = this.f6066d.top - this.f6055E.ascent();
            this.f6075m = fAscent2;
            i3 = absoluteGravity4 & 8388615;
            if (i3 != 1) {
                if (i3 != 5) {
                    f = this.f6066d.left;
                } else {
                    fCenterX2 = this.f6066d.right;
                }
                this.f6077o = f;
                bitmap = this.f6088z;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f6088z = null;
                }
                m2918e(f2);
                View view11 = this.f6063a;
                WeakHashMap<View, String> weakHashMap11 = C0418m.f2718a;
                view11.postInvalidateOnAnimation();
                m2917d(this.f6065c);
            }
            fCenterX2 = this.f6066d.centerX();
            fMeasureText /= 2.0f;
            f = fCenterX2 - fMeasureText;
            this.f6077o = f;
            bitmap = this.f6088z;
            if (bitmap != null) {
                bitmap.recycle();
                this.f6088z = null;
            }
            m2918e(f2);
            View view12 = this.f6063a;
            WeakHashMap<View, String> weakHashMap12 = C0418m.f2718a;
            view12.postInvalidateOnAnimation();
            m2917d(this.f6065c);
        }
        fCenterX = this.f6067e.centerX();
        fMeasureText2 /= 2.0f;
        this.f6078p = fCenterX - fMeasureText2;
        m2918e(this.f6071i);
        CharSequence charSequence5 = this.f6086x;
        if (charSequence5 != null) {
        }
        int absoluteGravity5 = Gravity.getAbsoluteGravity(this.f6069g, this.f6087y ? 1 : 0);
        i2 = absoluteGravity5 & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.f6075m = this.f6066d.centerY() + (((this.f6055E.descent() - this.f6055E.ascent()) / 2.0f) - this.f6055E.descent());
            } else {
                fAscent2 = this.f6066d.bottom;
            }
            i3 = absoluteGravity5 & 8388615;
            if (i3 != 1) {
                if (i3 != 5) {
                    f = this.f6066d.left;
                } else {
                    fCenterX2 = this.f6066d.right;
                }
                this.f6077o = f;
                bitmap = this.f6088z;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f6088z = null;
                }
                m2918e(f2);
                View view13 = this.f6063a;
                WeakHashMap<View, String> weakHashMap13 = C0418m.f2718a;
                view13.postInvalidateOnAnimation();
                m2917d(this.f6065c);
            }
            fCenterX2 = this.f6066d.centerX();
            fMeasureText /= 2.0f;
            f = fCenterX2 - fMeasureText;
            this.f6077o = f;
            bitmap = this.f6088z;
            if (bitmap != null) {
                bitmap.recycle();
                this.f6088z = null;
            }
            m2918e(f2);
            View view14 = this.f6063a;
            WeakHashMap<View, String> weakHashMap14 = C0418m.f2718a;
            view14.postInvalidateOnAnimation();
            m2917d(this.f6065c);
        }
        fAscent2 = this.f6066d.top - this.f6055E.ascent();
        this.f6075m = fAscent2;
        i3 = absoluteGravity5 & 8388615;
        if (i3 != 1) {
            if (i3 != 5) {
                f = this.f6066d.left;
            } else {
                fCenterX2 = this.f6066d.right;
            }
            this.f6077o = f;
            bitmap = this.f6088z;
            if (bitmap != null) {
                bitmap.recycle();
                this.f6088z = null;
            }
            m2918e(f2);
            View view15 = this.f6063a;
            WeakHashMap<View, String> weakHashMap15 = C0418m.f2718a;
            view15.postInvalidateOnAnimation();
            m2917d(this.f6065c);
        }
        fCenterX2 = this.f6066d.centerX();
        fMeasureText /= 2.0f;
        f = fCenterX2 - fMeasureText;
        this.f6077o = f;
        bitmap = this.f6088z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f6088z = null;
        }
        m2918e(f2);
        View view16 = this.f6063a;
        WeakHashMap<View, String> weakHashMap16 = C0418m.f2718a;
        view16.postInvalidateOnAnimation();
        m2917d(this.f6065c);
    }

    /* JADX INFO: renamed from: m */
    public void m2924m(ColorStateList colorStateList) {
        if (this.f6074l != colorStateList) {
            this.f6074l = colorStateList;
            m2923k();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2925n(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f6065c) {
            this.f6065c = f;
            m2917d(f);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2926o(float f) {
        m2918e(f);
        View view = this.f6063a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: p */
    public void m2927p(Typeface typeface) {
        boolean z;
        C1282a c1282a = this.f6084v;
        boolean z2 = true;
        if (c1282a != null) {
            c1282a.f6163c = true;
        }
        if (this.f6081s != typeface) {
            this.f6081s = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.f6082t != typeface) {
            this.f6082t = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            m2923k();
        }
    }
}
