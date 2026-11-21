package p080c.p126d.p127a.p128a.p147q;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p131c.C1182a;
import p080c.p126d.p127a.p128a.p131c.C1186e;
import p080c.p126d.p127a.p128a.p131c.C1187f;
import p080c.p126d.p127a.p128a.p131c.C1188g;
import p080c.p126d.p127a.p128a.p148r.C1275l;
import p080c.p126d.p127a.p128a.p152v.C1286a;
import p080c.p126d.p127a.p128a.p152v.C1287b;
import p080c.p126d.p127a.p128a.p153w.InterfaceC1289b;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;
import p080c.p126d.p127a.p128a.p154x.InterfaceC1303n;

/* JADX INFO: renamed from: c.d.a.a.q.e */
/* JADX INFO: loaded from: classes.dex */
public class C1259e {

    /* JADX INFO: renamed from: F */
    public static final TimeInterpolator f6001F = C1182a.f5664c;

    /* JADX INFO: renamed from: G */
    public static final int[] f6002G = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: H */
    public static final int[] f6003H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: I */
    public static final int[] f6004I = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: J */
    public static final int[] f6005J = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: K */
    public static final int[] f6006K = {R.attr.state_enabled};

    /* JADX INFO: renamed from: L */
    public static final int[] f6007L = new int[0];

    /* JADX INFO: renamed from: E */
    public ViewTreeObserver.OnPreDrawListener f6012E;

    /* JADX INFO: renamed from: a */
    public C1299j f6013a;

    /* JADX INFO: renamed from: b */
    public C1296g f6014b;

    /* JADX INFO: renamed from: c */
    public Drawable f6015c;

    /* JADX INFO: renamed from: d */
    public C1255a f6016d;

    /* JADX INFO: renamed from: e */
    public Drawable f6017e;

    /* JADX INFO: renamed from: f */
    public boolean f6018f;

    /* JADX INFO: renamed from: h */
    public float f6020h;

    /* JADX INFO: renamed from: i */
    public float f6021i;

    /* JADX INFO: renamed from: j */
    public float f6022j;

    /* JADX INFO: renamed from: k */
    public int f6023k;

    /* JADX INFO: renamed from: l */
    public final C1275l f6024l;

    /* JADX INFO: renamed from: m */
    public C1188g f6025m;

    /* JADX INFO: renamed from: n */
    public C1188g f6026n;

    /* JADX INFO: renamed from: o */
    public Animator f6027o;

    /* JADX INFO: renamed from: p */
    public C1188g f6028p;

    /* JADX INFO: renamed from: q */
    public C1188g f6029q;

    /* JADX INFO: renamed from: r */
    public float f6030r;

    /* JADX INFO: renamed from: t */
    public int f6032t;

    /* JADX INFO: renamed from: v */
    public ArrayList<Animator.AnimatorListener> f6034v;

    /* JADX INFO: renamed from: w */
    public ArrayList<Animator.AnimatorListener> f6035w;

    /* JADX INFO: renamed from: x */
    public ArrayList<e> f6036x;

    /* JADX INFO: renamed from: y */
    public final FloatingActionButton f6037y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC1289b f6038z;

    /* JADX INFO: renamed from: g */
    public boolean f6019g = true;

    /* JADX INFO: renamed from: s */
    public float f6031s = 1.0f;

    /* JADX INFO: renamed from: u */
    public int f6033u = 0;

    /* JADX INFO: renamed from: A */
    public final Rect f6008A = new Rect();

    /* JADX INFO: renamed from: B */
    public final RectF f6009B = new RectF();

    /* JADX INFO: renamed from: C */
    public final RectF f6010C = new RectF();

    /* JADX INFO: renamed from: D */
    public final Matrix f6011D = new Matrix();

    /* JADX INFO: renamed from: c.d.a.a.q.e$a */
    public class a extends C1187f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C1259e.this.f6031s = f;
            matrix.getValues(this.f5672a);
            matrix2.getValues(this.f5673b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f5673b;
                float f2 = fArr[i];
                float[] fArr2 = this.f5672a;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f5674c.setValues(this.f5673b);
            return this.f5674c;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.q.e$b */
    public class b extends h {
        public b(C1259e c1259e) {
            super(null);
        }

        @Override // p080c.p126d.p127a.p128a.p147q.C1259e.h
        /* JADX INFO: renamed from: a */
        public float mo2908a() {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.q.e$c */
    public class c extends h {
        public c() {
            super(null);
        }

        @Override // p080c.p126d.p127a.p128a.p147q.C1259e.h
        /* JADX INFO: renamed from: a */
        public float mo2908a() {
            C1259e c1259e = C1259e.this;
            return c1259e.f6020h + c1259e.f6021i;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.q.e$d */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // p080c.p126d.p127a.p128a.p147q.C1259e.h
        /* JADX INFO: renamed from: a */
        public float mo2908a() {
            C1259e c1259e = C1259e.this;
            return c1259e.f6020h + c1259e.f6022j;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.q.e$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo2909a();

        /* JADX INFO: renamed from: b */
        void mo2910b();
    }

    /* JADX INFO: renamed from: c.d.a.a.q.e$f */
    public interface f {
    }

    /* JADX INFO: renamed from: c.d.a.a.q.e$g */
    public class g extends h {
        public g() {
            super(null);
        }

        @Override // p080c.p126d.p127a.p128a.p147q.C1259e.h
        /* JADX INFO: renamed from: a */
        public float mo2908a() {
            return C1259e.this.f6020h;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.q.e$h */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f6043a;

        /* JADX INFO: renamed from: b */
        public float f6044b;

        /* JADX INFO: renamed from: c */
        public float f6045c;

        public h(C1257c c1257c) {
        }

        /* JADX INFO: renamed from: a */
        public abstract float mo2908a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1259e.this.m2907y((int) this.f6045c);
            this.f6043a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f6043a) {
                C1296g c1296g = C1259e.this.f6014b;
                this.f6044b = c1296g == null ? 0.0f : c1296g.f6211b.f6247o;
                this.f6045c = mo2908a();
                this.f6043a = true;
            }
            C1259e c1259e = C1259e.this;
            float f = this.f6044b;
            c1259e.m2907y((int) ((valueAnimator.getAnimatedFraction() * (this.f6045c - f)) + f));
        }
    }

    public C1259e(FloatingActionButton floatingActionButton, InterfaceC1289b interfaceC1289b) {
        this.f6037y = floatingActionButton;
        this.f6038z = interfaceC1289b;
        C1275l c1275l = new C1275l();
        this.f6024l = c1275l;
        c1275l.m2938a(f6002G, m2885c(new d()));
        c1275l.m2938a(f6003H, m2885c(new c()));
        c1275l.m2938a(f6004I, m2885c(new c()));
        c1275l.m2938a(f6005J, m2885c(new c()));
        c1275l.m2938a(f6006K, m2885c(new g()));
        c1275l.m2938a(f6007L, m2885c(new b(this)));
        this.f6030r = floatingActionButton.getRotation();
    }

    /* JADX INFO: renamed from: a */
    public final void m2883a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f6037y.getDrawable();
        if (drawable == null || this.f6032t == 0) {
            return;
        }
        RectF rectF = this.f6009B;
        RectF rectF2 = this.f6010C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f6032t;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f6032t;
        matrix.postScale(f2, f2, i2 / 2.0f, i2 / 2.0f);
    }

    /* JADX INFO: renamed from: b */
    public final AnimatorSet m2884b(C1188g c1188g, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6037y, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        c1188g.m2767d("opacity").m2768a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6037y, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        c1188g.m2767d("scale").m2768a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new C1260f(this));
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6037y, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        c1188g.m2767d("scale").m2768a(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new C1260f(this));
        }
        arrayList.add(objectAnimatorOfFloat3);
        m2883a(f4, this.f6011D);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f6037y, new C1186e(), new a(), new Matrix(this.f6011D));
        c1188g.m2767d("iconScale").m2768a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1161a.m2734s(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public final ValueAnimator m2885c(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f6001F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: d */
    public C1296g mo2886d() {
        C1299j c1299j = this.f6013a;
        Objects.requireNonNull(c1299j);
        return new C1296g(c1299j);
    }

    /* JADX INFO: renamed from: e */
    public float mo2887e() {
        return this.f6020h;
    }

    /* JADX INFO: renamed from: f */
    public void mo2888f(Rect rect) {
        int sizeDimension = this.f6018f ? (this.f6023k - this.f6037y.getSizeDimension()) / 2 : 0;
        float fMo2887e = this.f6019g ? mo2887e() + this.f6022j : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fMo2887e));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fMo2887e * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: g */
    public void mo2889g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C1296g c1296gMo2886d = mo2886d();
        this.f6014b = c1296gMo2886d;
        c1296gMo2886d.setTintList(colorStateList);
        if (mode != null) {
            this.f6014b.setTintMode(mode);
        }
        this.f6014b.m2977r(-12303292);
        this.f6014b.m2973n(this.f6037y.getContext());
        C1286a c1286a = new C1286a(this.f6014b.f6211b.f6233a);
        c1286a.setTintList(C1287b.m2955b(colorStateList2));
        this.f6015c = c1286a;
        C1296g c1296g = this.f6014b;
        Objects.requireNonNull(c1296g);
        this.f6017e = new LayerDrawable(new Drawable[]{c1296g, c1286a});
    }

    /* JADX INFO: renamed from: h */
    public boolean m2890h() {
        if (this.f6037y.getVisibility() == 0) {
            return this.f6033u == 1;
        }
        return this.f6033u != 2;
    }

    /* JADX INFO: renamed from: i */
    public boolean m2891i() {
        if (this.f6037y.getVisibility() != 0) {
            return this.f6033u == 2;
        }
        return this.f6033u != 1;
    }

    /* JADX INFO: renamed from: j */
    public void mo2892j() {
        C1275l c1275l = this.f6024l;
        ValueAnimator valueAnimator = c1275l.f6139c;
        if (valueAnimator != null) {
            valueAnimator.end();
            c1275l.f6139c = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo2893k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo2894l(int[] iArr) {
        C1275l.b bVar;
        ValueAnimator valueAnimator;
        C1275l c1275l = this.f6024l;
        int size = c1275l.f6137a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = c1275l.f6137a.get(i);
            if (StateSet.stateSetMatches(bVar.f6142a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        C1275l.b bVar2 = c1275l.f6138b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null && (valueAnimator = c1275l.f6139c) != null) {
            valueAnimator.cancel();
            c1275l.f6139c = null;
        }
        c1275l.f6138b = bVar;
        if (bVar != null) {
            ValueAnimator valueAnimator2 = bVar.f6143b;
            c1275l.f6139c = valueAnimator2;
            valueAnimator2.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo2895m(float f2, float f3, float f4) {
        m2906x();
        m2907y(f2);
    }

    /* JADX INFO: renamed from: n */
    public void m2896n() {
        ArrayList<e> arrayList = this.f6036x;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2909a();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2897o() {
        ArrayList<e> arrayList = this.f6036x;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2910b();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean mo2898p() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m2899q(float f2) {
        this.f6031s = f2;
        Matrix matrix = this.f6011D;
        m2883a(f2, matrix);
        this.f6037y.setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: r */
    public void mo2900r(ColorStateList colorStateList) {
        Drawable drawable = this.f6015c;
        if (drawable != null) {
            C0360f.m1433Y(drawable, C1287b.m2955b(colorStateList));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2901s(C1299j c1299j) {
        this.f6013a = c1299j;
        C1296g c1296g = this.f6014b;
        if (c1296g != null) {
            c1296g.f6211b.f6233a = c1299j;
            c1296g.invalidateSelf();
        }
        Object obj = this.f6015c;
        if (obj instanceof InterfaceC1303n) {
            ((InterfaceC1303n) obj).setShapeAppearanceModel(c1299j);
        }
        C1255a c1255a = this.f6016d;
        if (c1255a != null) {
            c1255a.f5989o = c1299j;
            c1255a.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean mo2902t() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2903u() {
        FloatingActionButton floatingActionButton = this.f6037y;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return floatingActionButton.isLaidOut() && !this.f6037y.isInEditMode();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2904v() {
        return !this.f6018f || this.f6037y.getSizeDimension() >= this.f6023k;
    }

    /* JADX INFO: renamed from: w */
    public void mo2905w() {
        FloatingActionButton floatingActionButton;
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f6030r % 90.0f != 0.0f) {
                i = 1;
                if (this.f6037y.getLayerType() != 1) {
                    floatingActionButton = this.f6037y;
                    floatingActionButton.setLayerType(i, null);
                }
            } else if (this.f6037y.getLayerType() != 0) {
                floatingActionButton = this.f6037y;
                i = 0;
                floatingActionButton.setLayerType(i, null);
            }
        }
        C1296g c1296g = this.f6014b;
        if (c1296g != null) {
            c1296g.m2978s((int) this.f6030r);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2906x() {
        FloatingActionButton.C1360b c1360b;
        Drawable insetDrawable;
        Rect rect = this.f6008A;
        mo2888f(rect);
        C0360f.m1445f(this.f6017e, "Didn't initialize content background");
        if (!mo2902t()) {
            InterfaceC1289b interfaceC1289b = this.f6038z;
            Drawable drawable = this.f6017e;
            FloatingActionButton.C1360b c1360b2 = (FloatingActionButton.C1360b) interfaceC1289b;
            Objects.requireNonNull(c1360b2);
            if (drawable != null) {
                c1360b = c1360b2;
                insetDrawable = drawable;
            }
            InterfaceC1289b interfaceC1289b2 = this.f6038z;
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            int i4 = rect.bottom;
            FloatingActionButton.C1360b c1360b3 = (FloatingActionButton.C1360b) interfaceC1289b2;
            FloatingActionButton.this.f10289n.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            int i5 = floatingActionButton.f10286k;
            floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
        }
        insetDrawable = new InsetDrawable(this.f6017e, rect.left, rect.top, rect.right, rect.bottom);
        c1360b = (FloatingActionButton.C1360b) this.f6038z;
        Objects.requireNonNull(c1360b);
        super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        InterfaceC1289b interfaceC1289b3 = this.f6038z;
        int i6 = rect.left;
        int i7 = rect.top;
        int i8 = rect.right;
        int i9 = rect.bottom;
        FloatingActionButton.C1360b c1360b4 = (FloatingActionButton.C1360b) interfaceC1289b3;
        FloatingActionButton.this.f10289n.set(i6, i7, i8, i9);
        FloatingActionButton floatingActionButton2 = FloatingActionButton.this;
        int i10 = floatingActionButton2.f10286k;
        floatingActionButton2.setPadding(i6 + i10, i7 + i10, i8 + i10, i9 + i10);
    }

    /* JADX INFO: renamed from: y */
    public void m2907y(float f2) {
        C1296g c1296g = this.f6014b;
        if (c1296g != null) {
            C1296g.b bVar = c1296g.f6211b;
            if (bVar.f6247o != f2) {
                bVar.f6247o = f2;
                c1296g.m2984y();
            }
        }
    }
}
