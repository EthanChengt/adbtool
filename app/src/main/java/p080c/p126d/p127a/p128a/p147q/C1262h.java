package p080c.p126d.p127a.p128a.p147q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.didjdk.adbhelper.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Objects;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.C0362a;
import p080c.p126d.p127a.p128a.p152v.C1287b;
import p080c.p126d.p127a.p128a.p153w.InterfaceC1289b;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: renamed from: c.d.a.a.q.h */
/* JADX INFO: loaded from: classes.dex */
public class C1262h extends C1259e {

    /* JADX INFO: renamed from: c.d.a.a.q.h$a */
    public static class a extends C1296g {
        public a(C1299j c1299j) {
            super(c1299j);
        }

        @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C1262h(FloatingActionButton floatingActionButton, InterfaceC1289b interfaceC1289b) {
        super(floatingActionButton, interfaceC1289b);
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: d */
    public C1296g mo2886d() {
        C1299j c1299j = this.f6013a;
        Objects.requireNonNull(c1299j);
        return new a(c1299j);
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: e */
    public float mo2887e() {
        return this.f6037y.getElevation();
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: f */
    public void mo2888f(Rect rect) {
        if (FloatingActionButton.this.f10288m) {
            super.mo2888f(rect);
        } else {
            int sizeDimension = !m2904v() ? (this.f6023k - this.f6037y.getSizeDimension()) / 2 : 0;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: g */
    public void mo2889g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        C1299j c1299j = this.f6013a;
        Objects.requireNonNull(c1299j);
        a aVar = new a(c1299j);
        this.f6014b = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.f6014b.setTintMode(mode);
        }
        this.f6014b.m2973n(this.f6037y.getContext());
        if (i > 0) {
            Context context = this.f6037y.getContext();
            C1299j c1299j2 = this.f6013a;
            Objects.requireNonNull(c1299j2);
            C1255a c1255a = new C1255a(c1299j2);
            int iM1468b = C0362a.m1468b(context, R.color.bk);
            int iM1468b2 = C0362a.m1468b(context, R.color.bj);
            int iM1468b3 = C0362a.m1468b(context, R.color.bh);
            int iM1468b4 = C0362a.m1468b(context, R.color.bi);
            c1255a.f5983i = iM1468b;
            c1255a.f5984j = iM1468b2;
            c1255a.f5985k = iM1468b3;
            c1255a.f5986l = iM1468b4;
            float f = i;
            if (c1255a.f5982h != f) {
                c1255a.f5982h = f;
                c1255a.f5976b.setStrokeWidth(f * 1.3333f);
                c1255a.f5988n = true;
                c1255a.invalidateSelf();
            }
            c1255a.m2882b(colorStateList);
            this.f6016d = c1255a;
            C1255a c1255a2 = this.f6016d;
            Objects.requireNonNull(c1255a2);
            C1296g c1296g = this.f6014b;
            Objects.requireNonNull(c1296g);
            layerDrawable = new LayerDrawable(new Drawable[]{c1255a2, c1296g});
        } else {
            this.f6016d = null;
            layerDrawable = this.f6014b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C1287b.m2955b(colorStateList2), layerDrawable, null);
        this.f6015c = rippleDrawable;
        this.f6017e = rippleDrawable;
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: j */
    public void mo2892j() {
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: k */
    public void mo2893k() {
        m2906x();
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: l */
    public void mo2894l(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f6037y.isEnabled()) {
                this.f6037y.setElevation(this.f6020h);
                if (this.f6037y.isPressed()) {
                    floatingActionButton = this.f6037y;
                    f = this.f6022j;
                } else if (this.f6037y.isFocused() || this.f6037y.isHovered()) {
                    floatingActionButton = this.f6037y;
                    f = this.f6021i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f6037y.setElevation(0.0f);
            floatingActionButton = this.f6037y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: m */
    public void mo2895m(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f6037y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C1259e.f6002G, m2911z(f, f3));
            stateListAnimator.addState(C1259e.f6003H, m2911z(f, f2));
            stateListAnimator.addState(C1259e.f6004I, m2911z(f, f2));
            stateListAnimator.addState(C1259e.f6005J, m2911z(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f6037y, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f6037y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f6037y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C1259e.f6001F);
            stateListAnimator.addState(C1259e.f6006K, animatorSet);
            stateListAnimator.addState(C1259e.f6007L, m2911z(0.0f, 0.0f));
            this.f6037y.setStateListAnimator(stateListAnimator);
        }
        if (mo2902t()) {
            m2906x();
        }
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: p */
    public boolean mo2898p() {
        return false;
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: r */
    public void mo2900r(ColorStateList colorStateList) {
        Drawable drawable = this.f6015c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C1287b.m2955b(colorStateList));
        } else if (drawable != null) {
            C0360f.m1433Y(drawable, C1287b.m2955b(colorStateList));
        }
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: t */
    public boolean mo2902t() {
        return FloatingActionButton.this.f10288m || !m2904v();
    }

    @Override // p080c.p126d.p127a.p128a.p147q.C1259e
    /* JADX INFO: renamed from: w */
    public void mo2905w() {
    }

    /* JADX INFO: renamed from: z */
    public final Animator m2911z(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f6037y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f6037y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C1259e.f6001F);
        return animatorSet;
    }
}
