package p080c.p126d.p127a.p128a.p140k;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p036d.C0370a;
import p006b.p032h.p036d.p037k.InterfaceC0380a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p131c.C1188g;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p148r.C1276m;
import p080c.p126d.p127a.p128a.p151u.C1283b;
import p080c.p126d.p127a.p128a.p152v.C1287b;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: renamed from: c.d.a.a.k.b */
/* JADX INFO: loaded from: classes.dex */
public class C1218b extends C1296g implements InterfaceC0380a, Drawable.Callback, C1276m.b {

    /* JADX INFO: renamed from: F0 */
    public static final int[] f5782F0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: G0 */
    public static final ShapeDrawable f5783G0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A */
    public float f5784A;

    /* JADX INFO: renamed from: A0 */
    public WeakReference<a> f5785A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f5786B;

    /* JADX INFO: renamed from: B0 */
    public TextUtils.TruncateAt f5787B0;

    /* JADX INFO: renamed from: C */
    public float f5788C;

    /* JADX INFO: renamed from: C0 */
    public boolean f5789C0;

    /* JADX INFO: renamed from: D */
    public ColorStateList f5790D;

    /* JADX INFO: renamed from: D0 */
    public int f5791D0;

    /* JADX INFO: renamed from: E */
    public CharSequence f5792E;

    /* JADX INFO: renamed from: E0 */
    public boolean f5793E0;

    /* JADX INFO: renamed from: F */
    public boolean f5794F;

    /* JADX INFO: renamed from: G */
    public Drawable f5795G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f5796H;

    /* JADX INFO: renamed from: I */
    public float f5797I;

    /* JADX INFO: renamed from: J */
    public boolean f5798J;

    /* JADX INFO: renamed from: K */
    public boolean f5799K;

    /* JADX INFO: renamed from: L */
    public Drawable f5800L;

    /* JADX INFO: renamed from: M */
    public Drawable f5801M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f5802N;

    /* JADX INFO: renamed from: O */
    public float f5803O;

    /* JADX INFO: renamed from: P */
    public CharSequence f5804P;

    /* JADX INFO: renamed from: Q */
    public boolean f5805Q;

    /* JADX INFO: renamed from: R */
    public boolean f5806R;

    /* JADX INFO: renamed from: S */
    public Drawable f5807S;

    /* JADX INFO: renamed from: T */
    public C1188g f5808T;

    /* JADX INFO: renamed from: U */
    public C1188g f5809U;

    /* JADX INFO: renamed from: V */
    public float f5810V;

    /* JADX INFO: renamed from: W */
    public float f5811W;

    /* JADX INFO: renamed from: X */
    public float f5812X;

    /* JADX INFO: renamed from: Y */
    public float f5813Y;

    /* JADX INFO: renamed from: Z */
    public float f5814Z;

    /* JADX INFO: renamed from: a0 */
    public float f5815a0;

    /* JADX INFO: renamed from: b0 */
    public float f5816b0;

    /* JADX INFO: renamed from: c0 */
    public float f5817c0;

    /* JADX INFO: renamed from: d0 */
    public final Context f5818d0;

    /* JADX INFO: renamed from: e0 */
    public final Paint f5819e0;

    /* JADX INFO: renamed from: f0 */
    public final Paint.FontMetrics f5820f0;

    /* JADX INFO: renamed from: g0 */
    public final RectF f5821g0;

    /* JADX INFO: renamed from: h0 */
    public final PointF f5822h0;

    /* JADX INFO: renamed from: i0 */
    public final Path f5823i0;

    /* JADX INFO: renamed from: j0 */
    public final C1276m f5824j0;

    /* JADX INFO: renamed from: k0 */
    public int f5825k0;

    /* JADX INFO: renamed from: l0 */
    public int f5826l0;

    /* JADX INFO: renamed from: m0 */
    public int f5827m0;

    /* JADX INFO: renamed from: n0 */
    public int f5828n0;

    /* JADX INFO: renamed from: o0 */
    public int f5829o0;

    /* JADX INFO: renamed from: p0 */
    public int f5830p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f5831q0;

    /* JADX INFO: renamed from: r0 */
    public int f5832r0;

    /* JADX INFO: renamed from: s0 */
    public int f5833s0;

    /* JADX INFO: renamed from: t0 */
    public ColorFilter f5834t0;

    /* JADX INFO: renamed from: u0 */
    public PorterDuffColorFilter f5835u0;

    /* JADX INFO: renamed from: v0 */
    public ColorStateList f5836v0;

    /* JADX INFO: renamed from: w0 */
    public PorterDuff.Mode f5837w0;

    /* JADX INFO: renamed from: x */
    public ColorStateList f5838x;

    /* JADX INFO: renamed from: x0 */
    public int[] f5839x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f5840y;

    /* JADX INFO: renamed from: y0 */
    public boolean f5841y0;

    /* JADX INFO: renamed from: z */
    public float f5842z;

    /* JADX INFO: renamed from: z0 */
    public ColorStateList f5843z0;

    /* JADX INFO: renamed from: c.d.a.a.k.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2842a();
    }

    public C1218b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C1299j.m2986b(context, attributeSet, i, i2, new C1290a(0)).m2991a());
        this.f5819e0 = new Paint(1);
        this.f5820f0 = new Paint.FontMetrics();
        this.f5821g0 = new RectF();
        this.f5822h0 = new PointF();
        this.f5823i0 = new Path();
        this.f5833s0 = 255;
        this.f5837w0 = PorterDuff.Mode.SRC_IN;
        this.f5785A0 = new WeakReference<>(null);
        this.f6211b.f6234b = new C1252a(context);
        m2984y();
        this.f5818d0 = context;
        C1276m c1276m = new C1276m(this);
        this.f5824j0 = c1276m;
        this.f5792E = "";
        c1276m.f6144a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f5782F0;
        setState(iArr);
        m2826d0(iArr);
        this.f5789C0 = true;
        if (C1287b.f6184a) {
            f5783G0.setTint(-1);
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m2797H(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m2798I(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m2799A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2838p0() || m2837o0()) {
            float f = this.f5810V + this.f5811W;
            if (C0360f.m1461u(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.f5797I;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.f5797I;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.f5797I;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* JADX INFO: renamed from: B */
    public float m2800B() {
        if (m2838p0() || m2837o0()) {
            return this.f5811W + this.f5797I + this.f5812X;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: C */
    public final void m2801C(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2839q0()) {
            float f = this.f5817c0 + this.f5816b0;
            if (C0360f.m1461u(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f5803O;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f5803O;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.f5803O;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2802D(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2839q0()) {
            float f = this.f5817c0 + this.f5816b0 + this.f5803O + this.f5815a0 + this.f5814Z;
            if (C0360f.m1461u(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX INFO: renamed from: E */
    public float m2803E() {
        if (m2839q0()) {
            return this.f5815a0 + this.f5803O + this.f5816b0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: F */
    public float m2804F() {
        return this.f5793E0 ? m2971l() : this.f5784A;
    }

    /* JADX INFO: renamed from: G */
    public Drawable m2805G() {
        Drawable drawable = this.f5800L;
        if (drawable != null) {
            return C0360f.m1442d0(drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m2806J() {
        a aVar = this.f5785A0.get();
        if (aVar != null) {
            aVar.mo2842a();
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m2807K(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f5838x;
        int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f5825k0) : 0;
        boolean state = true;
        if (this.f5825k0 != colorForState) {
            this.f5825k0 = colorForState;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f5840y;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f5826l0) : 0;
        if (this.f5826l0 != colorForState2) {
            this.f5826l0 = colorForState2;
            zOnStateChange = true;
        }
        int iM1487a = C0370a.m1487a(colorForState2, colorForState);
        if ((this.f5827m0 != iM1487a) | (this.f6211b.f6236d == null)) {
            this.f5827m0 = iM1487a;
            m2975p(ColorStateList.valueOf(iM1487a));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f5786B;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f5828n0) : 0;
        if (this.f5828n0 != colorForState3) {
            this.f5828n0 = colorForState3;
            zOnStateChange = true;
        }
        int colorForState4 = (this.f5843z0 == null || !C1287b.m2956c(iArr)) ? 0 : this.f5843z0.getColorForState(iArr, this.f5829o0);
        if (this.f5829o0 != colorForState4) {
            this.f5829o0 = colorForState4;
            if (this.f5841y0) {
                zOnStateChange = true;
            }
        }
        C1283b c1283b = this.f5824j0.f6149f;
        int colorForState5 = (c1283b == null || (colorStateList = c1283b.f6165b) == null) ? 0 : colorStateList.getColorForState(iArr, this.f5830p0);
        if (this.f5830p0 != colorForState5) {
            this.f5830p0 = colorForState5;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (state2[i] == 16842912) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z3 = z && this.f5805Q;
        if (this.f5831q0 == z3 || this.f5807S == null) {
            z2 = false;
        } else {
            float fM2800B = m2800B();
            this.f5831q0 = z3;
            if (fM2800B != m2800B()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.f5836v0;
        int colorForState6 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f5832r0) : 0;
        if (this.f5832r0 != colorForState6) {
            this.f5832r0 = colorForState6;
            this.f5835u0 = C1161a.m2740y(this, this.f5836v0, this.f5837w0);
        } else {
            state = zOnStateChange;
        }
        if (m2798I(this.f5795G)) {
            state |= this.f5795G.setState(iArr);
        }
        if (m2798I(this.f5807S)) {
            state |= this.f5807S.setState(iArr);
        }
        if (m2798I(this.f5800L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f5800L.setState(iArr3);
        }
        if (C1287b.f6184a && m2798I(this.f5801M)) {
            state |= this.f5801M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m2806J();
        }
        return state;
    }

    /* JADX INFO: renamed from: L */
    public void m2808L(boolean z) {
        if (this.f5805Q != z) {
            this.f5805Q = z;
            float fM2800B = m2800B();
            if (!z && this.f5831q0) {
                this.f5831q0 = false;
            }
            float fM2800B2 = m2800B();
            invalidateSelf();
            if (fM2800B != fM2800B2) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m2809M(Drawable drawable) {
        if (this.f5807S != drawable) {
            float fM2800B = m2800B();
            this.f5807S = drawable;
            float fM2800B2 = m2800B();
            m2840r0(this.f5807S);
            m2841z(this.f5807S);
            invalidateSelf();
            if (fM2800B != fM2800B2) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m2810N(boolean z) {
        if (this.f5806R != z) {
            boolean zM2837o0 = m2837o0();
            this.f5806R = z;
            boolean zM2837o1 = m2837o0();
            if (zM2837o0 != zM2837o1) {
                if (zM2837o1) {
                    m2841z(this.f5807S);
                } else {
                    m2840r0(this.f5807S);
                }
                invalidateSelf();
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m2811O(ColorStateList colorStateList) {
        if (this.f5840y != colorStateList) {
            this.f5840y = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: P */
    public void m2812P(float f) {
        if (this.f5784A != f) {
            this.f5784A = f;
            this.f6211b.f6233a = this.f6211b.f6233a.m2989e(f);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m2813Q(float f) {
        if (this.f5817c0 != f) {
            this.f5817c0 = f;
            invalidateSelf();
            m2806J();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m2814R(Drawable drawable) {
        Drawable drawable2 = this.f5795G;
        Drawable drawableM1442d0 = drawable2 != null ? C0360f.m1442d0(drawable2) : null;
        if (drawableM1442d0 != drawable) {
            float fM2800B = m2800B();
            this.f5795G = drawable != null ? C0360f.m1444e0(drawable).mutate() : null;
            float fM2800B2 = m2800B();
            m2840r0(drawableM1442d0);
            if (m2838p0()) {
                m2841z(this.f5795G);
            }
            invalidateSelf();
            if (fM2800B != fM2800B2) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m2815S(float f) {
        if (this.f5797I != f) {
            float fM2800B = m2800B();
            this.f5797I = f;
            float fM2800B2 = m2800B();
            invalidateSelf();
            if (fM2800B != fM2800B2) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m2816T(ColorStateList colorStateList) {
        this.f5798J = true;
        if (this.f5796H != colorStateList) {
            this.f5796H = colorStateList;
            if (m2838p0()) {
                C0360f.m1433Y(this.f5795G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: U */
    public void m2817U(boolean z) {
        if (this.f5794F != z) {
            boolean zM2838p0 = m2838p0();
            this.f5794F = z;
            boolean zM2838p1 = m2838p0();
            if (zM2838p0 != zM2838p1) {
                if (zM2838p1) {
                    m2841z(this.f5795G);
                } else {
                    m2840r0(this.f5795G);
                }
                invalidateSelf();
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m2818V(float f) {
        if (this.f5842z != f) {
            this.f5842z = f;
            invalidateSelf();
            m2806J();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m2819W(float f) {
        if (this.f5810V != f) {
            this.f5810V = f;
            invalidateSelf();
            m2806J();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m2820X(ColorStateList colorStateList) {
        if (this.f5786B != colorStateList) {
            this.f5786B = colorStateList;
            if (this.f5793E0) {
                m2981v(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m2821Y(float f) {
        if (this.f5788C != f) {
            this.f5788C = f;
            this.f5819e0.setStrokeWidth(f);
            if (this.f5793E0) {
                this.f6211b.f6244l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m2822Z(Drawable drawable) {
        Drawable drawableM2805G = m2805G();
        if (drawableM2805G != drawable) {
            float fM2803E = m2803E();
            this.f5800L = drawable != null ? C0360f.m1444e0(drawable).mutate() : null;
            if (C1287b.f6184a) {
                this.f5801M = new RippleDrawable(C1287b.m2955b(this.f5790D), this.f5800L, f5783G0);
            }
            float fM2803E2 = m2803E();
            m2840r0(drawableM2805G);
            if (m2839q0()) {
                m2841z(this.f5800L);
            }
            invalidateSelf();
            if (fM2803E != fM2803E2) {
                m2806J();
            }
        }
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1276m.b
    /* JADX INFO: renamed from: a */
    public void mo2783a() {
        m2806J();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a0 */
    public void m2823a0(float f) {
        if (this.f5816b0 != f) {
            this.f5816b0 = f;
            invalidateSelf();
            if (m2839q0()) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m2824b0(float f) {
        if (this.f5803O != f) {
            this.f5803O = f;
            invalidateSelf();
            if (m2839q0()) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m2825c0(float f) {
        if (this.f5815a0 != f) {
            this.f5815a0 = f;
            invalidateSelf();
            if (m2839q0()) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m2826d0(int[] iArr) {
        if (Arrays.equals(this.f5839x0, iArr)) {
            return false;
        }
        this.f5839x0 = iArr;
        if (m2839q0()) {
            return m2807K(getState(), iArr);
        }
        return false;
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int iSaveLayerAlpha;
        int i2;
        int i3;
        int i4;
        int i5;
        Drawable drawable;
        int iSave;
        float f;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f5833s0) == 0) {
            return;
        }
        if (i < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        if (!this.f5793E0) {
            this.f5819e0.setColor(this.f5825k0);
            this.f5819e0.setStyle(Paint.Style.FILL);
            this.f5821g0.set(bounds);
            canvas.drawRoundRect(this.f5821g0, m2804F(), m2804F(), this.f5819e0);
        }
        if (!this.f5793E0) {
            this.f5819e0.setColor(this.f5826l0);
            this.f5819e0.setStyle(Paint.Style.FILL);
            Paint paint = this.f5819e0;
            ColorFilter colorFilter = this.f5834t0;
            if (colorFilter == null) {
                colorFilter = this.f5835u0;
            }
            paint.setColorFilter(colorFilter);
            this.f5821g0.set(bounds);
            canvas.drawRoundRect(this.f5821g0, m2804F(), m2804F(), this.f5819e0);
        }
        if (this.f5793E0) {
            super.draw(canvas);
        }
        if (this.f5788C > 0.0f && !this.f5793E0) {
            this.f5819e0.setColor(this.f5828n0);
            this.f5819e0.setStyle(Paint.Style.STROKE);
            if (!this.f5793E0) {
                Paint paint2 = this.f5819e0;
                ColorFilter colorFilter2 = this.f5834t0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f5835u0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f5821g0;
            float f6 = bounds.left;
            float f7 = this.f5788C / 2.0f;
            rectF.set(f6 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
            float f8 = this.f5784A - (this.f5788C / 2.0f);
            canvas.drawRoundRect(this.f5821g0, f8, f8, this.f5819e0);
        }
        this.f5819e0.setColor(this.f5829o0);
        this.f5819e0.setStyle(Paint.Style.FILL);
        this.f5821g0.set(bounds);
        if (this.f5793E0) {
            m2962c(new RectF(bounds), this.f5823i0);
            i2 = 0;
            m2965f(canvas, this.f5819e0, this.f5823i0, this.f6211b.f6233a, m2966g());
        } else {
            canvas.drawRoundRect(this.f5821g0, m2804F(), m2804F(), this.f5819e0);
            i2 = 0;
        }
        if (m2838p0()) {
            m2799A(bounds, this.f5821g0);
            RectF rectF2 = this.f5821g0;
            float f9 = rectF2.left;
            float f10 = rectF2.top;
            canvas.translate(f9, f10);
            this.f5795G.setBounds(i2, i2, (int) this.f5821g0.width(), (int) this.f5821g0.height());
            this.f5795G.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (m2837o0()) {
            m2799A(bounds, this.f5821g0);
            RectF rectF3 = this.f5821g0;
            float f11 = rectF3.left;
            float f12 = rectF3.top;
            canvas.translate(f11, f12);
            this.f5807S.setBounds(i2, i2, (int) this.f5821g0.width(), (int) this.f5821g0.height());
            this.f5807S.draw(canvas);
            canvas.translate(-f11, -f12);
        }
        if (!this.f5789C0 || this.f5792E == null) {
            i3 = iSaveLayerAlpha;
            i4 = 255;
            i5 = 0;
        } else {
            PointF pointF = this.f5822h0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f5792E != null) {
                float fM2800B = m2800B() + this.f5810V + this.f5813Y;
                if (C0360f.m1461u(this) == 0) {
                    pointF.x = bounds.left + fM2800B;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fM2800B;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                this.f5824j0.f6144a.getFontMetrics(this.f5820f0);
                Paint.FontMetrics fontMetrics = this.f5820f0;
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.f5821g0;
            rectF4.setEmpty();
            if (this.f5792E != null) {
                float fM2800B2 = m2800B() + this.f5810V + this.f5813Y;
                float fM2803E = m2803E() + this.f5817c0 + this.f5814Z;
                if (C0360f.m1461u(this) == 0) {
                    rectF4.left = bounds.left + fM2800B2;
                    f = bounds.right - fM2803E;
                } else {
                    rectF4.left = bounds.left + fM2803E;
                    f = bounds.right - fM2800B2;
                }
                rectF4.right = f;
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            C1276m c1276m = this.f5824j0;
            if (c1276m.f6149f != null) {
                c1276m.f6144a.drawableState = getState();
                C1276m c1276m2 = this.f5824j0;
                c1276m2.f6149f.m2952c(this.f5818d0, c1276m2.f6144a, c1276m2.f6145b);
            }
            this.f5824j0.f6144a.setTextAlign(align);
            boolean z = Math.round(this.f5824j0.m2939a(this.f5792E.toString())) > Math.round(this.f5821g0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.f5821g0);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f5792E;
            if (z && this.f5787B0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f5824j0.f6144a, this.f5821g0.width(), this.f5787B0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF2 = this.f5822h0;
            i5 = 0;
            i4 = 255;
            i3 = iSaveLayerAlpha;
            canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.f5824j0.f6144a);
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
        if (m2839q0()) {
            m2801C(bounds, this.f5821g0);
            RectF rectF5 = this.f5821g0;
            float f13 = rectF5.left;
            float f14 = rectF5.top;
            canvas.translate(f13, f14);
            this.f5800L.setBounds(i5, i5, (int) this.f5821g0.width(), (int) this.f5821g0.height());
            if (C1287b.f6184a) {
                this.f5801M.setBounds(this.f5800L.getBounds());
                this.f5801M.jumpToCurrentState();
                drawable = this.f5801M;
            } else {
                drawable = this.f5800L;
            }
            drawable.draw(canvas);
            canvas.translate(-f13, -f14);
        }
        if (this.f5833s0 < i4) {
            canvas.restoreToCount(i3);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m2827e0(ColorStateList colorStateList) {
        if (this.f5802N != colorStateList) {
            this.f5802N = colorStateList;
            if (m2839q0()) {
                C0360f.m1433Y(this.f5800L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m2828f0(boolean z) {
        if (this.f5799K != z) {
            boolean zM2839q0 = m2839q0();
            this.f5799K = z;
            boolean zM2839q1 = m2839q0();
            if (zM2839q0 != zM2839q1) {
                if (zM2839q1) {
                    m2841z(this.f5800L);
                } else {
                    m2840r0(this.f5800L);
                }
                invalidateSelf();
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m2829g0(float f) {
        if (this.f5812X != f) {
            float fM2800B = m2800B();
            this.f5812X = f;
            float fM2800B2 = m2800B();
            invalidateSelf();
            if (fM2800B != fM2800B2) {
                m2806J();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5833s0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f5834t0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f5842z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(m2803E() + this.f5824j0.m2939a(this.f5792E.toString()) + m2800B() + this.f5810V + this.f5813Y + this.f5814Z + this.f5817c0), this.f5791D0);
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f5793E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f5842z, this.f5784A);
        } else {
            outline.setRoundRect(bounds, this.f5784A);
        }
        outline.setAlpha(this.f5833s0 / 255.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public void m2830h0(float f) {
        if (this.f5811W != f) {
            float fM2800B = m2800B();
            this.f5811W = f;
            float fM2800B2 = m2800B();
            invalidateSelf();
            if (fM2800B != fM2800B2) {
                m2806J();
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m2831i0(ColorStateList colorStateList) {
        if (this.f5790D != colorStateList) {
            this.f5790D = colorStateList;
            this.f5843z0 = this.f5841y0 ? C1287b.m2955b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!m2797H(this.f5838x) && !m2797H(this.f5840y) && !m2797H(this.f5786B) && (!this.f5841y0 || !m2797H(this.f5843z0))) {
            C1283b c1283b = this.f5824j0.f6149f;
            if (!((c1283b == null || (colorStateList = c1283b.f6165b) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.f5806R && this.f5807S != null && this.f5805Q) && !m2798I(this.f5795G) && !m2798I(this.f5807S) && !m2797H(this.f5836v0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public void m2832j0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f5792E, charSequence)) {
            return;
        }
        this.f5792E = charSequence;
        this.f5824j0.f6147d = true;
        invalidateSelf();
        m2806J();
    }

    /* JADX INFO: renamed from: k0 */
    public void m2833k0(C1283b c1283b) {
        this.f5824j0.m2940b(c1283b, this.f5818d0);
    }

    /* JADX INFO: renamed from: l0 */
    public void m2834l0(float f) {
        if (this.f5814Z != f) {
            this.f5814Z = f;
            invalidateSelf();
            m2806J();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m2835m0(float f) {
        if (this.f5813Y != f) {
            this.f5813Y = f;
            invalidateSelf();
            m2806J();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m2836n0(boolean z) {
        if (this.f5841y0 != z) {
            this.f5841y0 = z;
            this.f5843z0 = z ? C1287b.m2955b(this.f5790D) : null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m2837o0() {
        return this.f5806R && this.f5807S != null && this.f5831q0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m2838p0()) {
            zOnLayoutDirectionChanged |= C0360f.m1427S(this.f5795G, i);
        }
        if (m2837o0()) {
            zOnLayoutDirectionChanged |= C0360f.m1427S(this.f5807S, i);
        }
        if (m2839q0()) {
            zOnLayoutDirectionChanged |= C0360f.m1427S(this.f5800L, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m2838p0()) {
            zOnLevelChange |= this.f5795G.setLevel(i);
        }
        if (m2837o0()) {
            zOnLevelChange |= this.f5807S.setLevel(i);
        }
        if (m2839q0()) {
            zOnLevelChange |= this.f5800L.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable, p080c.p126d.p127a.p128a.p148r.C1276m.b
    public boolean onStateChange(int[] iArr) {
        if (this.f5793E0) {
            super.onStateChange(iArr);
        }
        return m2807K(iArr, this.f5839x0);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m2838p0() {
        return this.f5794F && this.f5795G != null;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m2839q0() {
        return this.f5799K && this.f5800L != null;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m2840r0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f5833s0 != i) {
            this.f5833s0 = i;
            invalidateSelf();
        }
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5834t0 != colorFilter) {
            this.f5834t0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintList(ColorStateList colorStateList) {
        if (this.f5836v0 != colorStateList) {
            this.f5836v0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f5837w0 != mode) {
            this.f5837w0 = mode;
            this.f5835u0 = C1161a.m2740y(this, this.f5836v0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m2838p0()) {
            visible |= this.f5795G.setVisible(z, z2);
        }
        if (m2837o0()) {
            visible |= this.f5807S.setVisible(z, z2);
        }
        if (m2839q0()) {
            visible |= this.f5800L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2841z(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0360f.m1427S(drawable, C0360f.m1461u(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5800L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f5839x0);
            }
            C0360f.m1433Y(drawable, this.f5802N);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f5795G;
        if (drawable == drawable2 && this.f5798J) {
            C0360f.m1433Y(drawable2, this.f5796H);
        }
    }
}
