package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.didjdk.adbhelper.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p044j.C0418m;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p131c.C1182a;
import p080c.p126d.p127a.p128a.p131c.C1183b;
import p080c.p126d.p127a.p128a.p131c.C1184c;
import p080c.p126d.p127a.p128a.p131c.C1185d;
import p080c.p126d.p127a.p128a.p131c.C1188g;
import p080c.p126d.p127a.p128a.p131c.C1189h;
import p080c.p126d.p127a.p128a.p131c.C1190i;
import p080c.p126d.p127a.p128a.p132c0.C1192a;
import p080c.p126d.p127a.p128a.p132c0.C1193b;
import p080c.p126d.p127a.p128a.p132c0.C1194c;
import p080c.p126d.p127a.p128a.p132c0.C1195d;
import p080c.p126d.p127a.p128a.p132c0.C1196e;
import p080c.p126d.p127a.p128a.p141l.C1219a;
import p080c.p126d.p127a.p128a.p141l.C1221c;
import p080c.p126d.p127a.p128a.p141l.InterfaceC1222d;

/* JADX INFO: loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final Rect f10497c;

    /* JADX INFO: renamed from: d */
    public final RectF f10498d;

    /* JADX INFO: renamed from: e */
    public final RectF f10499e;

    /* JADX INFO: renamed from: f */
    public final int[] f10500f;

    /* JADX INFO: renamed from: g */
    public float f10501g;

    /* JADX INFO: renamed from: h */
    public float f10502h;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C1386a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f10503a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f10504b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f10505c;

        public C1386a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f10503a = z;
            this.f10504b = view;
            this.f10505c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10503a) {
                return;
            }
            this.f10504b.setVisibility(4);
            this.f10505c.setAlpha(1.0f);
            this.f10505c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10503a) {
                this.f10504b.setVisibility(0);
                this.f10505c.setAlpha(0.0f);
                this.f10505c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C1387b {

        /* JADX INFO: renamed from: a */
        public C1188g f10506a;

        /* JADX INFO: renamed from: b */
        public C1190i f10507b;
    }

    public FabTransformationBehavior() {
        this.f10497c = new Rect();
        this.f10498d = new RectF();
        this.f10499e = new RectF();
        this.f10500f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10497c = new Rect();
        this.f10498d = new RectF();
        this.f10499e = new RectF();
        this.f10500f = new int[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: D */
    public AnimatorSet mo3195D(View view, View view2, boolean z, boolean z2) {
        C1189h c1189h;
        InterfaceC1222d interfaceC1222d;
        C1387b c1387b;
        Animator animator;
        ObjectAnimator objectAnimatorOfInt;
        int i = Build.VERSION.SDK_INT;
        C1387b c1387bMo3206O = mo3206O(view2.getContext(), z);
        if (z) {
            this.f10501g = view.getTranslationX();
            this.f10502h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i >= 21) {
            m3203L(view, view2, z, z2, c1387bMo3206O, arrayList);
        }
        RectF rectF = this.f10498d;
        m3205N(view, view2, z, z2, c1387bMo3206O, arrayList, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fM3197F = m3197F(view, view2, c1387bMo3206O.f10507b);
        float fM3198G = m3198G(view, view2, c1387bMo3206O.f10507b);
        Pair<C1189h, C1189h> pairM3196E = m3196E(fM3197F, fM3198G, z, c1387bMo3206O);
        C1189h c1189h2 = (C1189h) pairM3196E.first;
        C1189h c1189h3 = (C1189h) pairM3196E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fM3197F = this.f10501g;
        }
        fArr[0] = fM3197F;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fM3198G = this.f10502h;
        }
        fArr2[0] = fM3198G;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c1189h2.m2768a(objectAnimatorOfFloat);
        c1189h3.m2768a(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat2);
        boolean z3 = view2 instanceof InterfaceC1222d;
        if (z3 && (view instanceof ImageView)) {
            InterfaceC1222d interfaceC1222d2 = (InterfaceC1222d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C1185d.f5669b, 0);
                } else {
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C1185d.f5669b, 255);
                }
                objectAnimatorOfInt.addUpdateListener(new C1192a(this, view2));
                c1387bMo3206O.f10506a.m2767d("iconFade").m2768a(objectAnimatorOfInt);
                arrayList.add(objectAnimatorOfInt);
                arrayList2.add(new C1193b(this, interfaceC1222d2, drawable));
            }
        }
        if (z3) {
            InterfaceC1222d interfaceC1222d3 = (InterfaceC1222d) view2;
            C1190i c1190i = c1387bMo3206O.f10507b;
            RectF rectF2 = this.f10498d;
            RectF rectF3 = this.f10499e;
            m3200I(view, rectF2);
            rectF2.offset(this.f10501g, this.f10502h);
            m3200I(view2, rectF3);
            rectF3.offset(-m3197F(view, view2, c1190i), 0.0f);
            float fCenterX = rectF2.centerX() - rectF3.left;
            C1190i c1190i2 = c1387bMo3206O.f10507b;
            RectF rectF4 = this.f10498d;
            RectF rectF5 = this.f10499e;
            m3200I(view, rectF4);
            rectF4.offset(this.f10501g, this.f10502h);
            m3200I(view2, rectF5);
            rectF5.offset(0.0f, -m3198G(view, view2, c1190i2));
            float fCenterY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).m3119g(this.f10497c);
            float fWidth2 = this.f10497c.width() / 2.0f;
            C1189h c1189hM2767d = c1387bMo3206O.f10506a.m2767d("expansion");
            if (z) {
                if (!z2) {
                    interfaceC1222d3.setRevealInfo(new InterfaceC1222d.e(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = interfaceC1222d3.getRevealInfo().f5852c;
                }
                float fM2719d = C1161a.m2719d(fCenterX, fCenterY, 0.0f, 0.0f);
                float fM2719d2 = C1161a.m2719d(fCenterX, fCenterY, fWidth, 0.0f);
                float fM2719d3 = C1161a.m2719d(fCenterX, fCenterY, fWidth, fHeight);
                float fM2719d4 = C1161a.m2719d(fCenterX, fCenterY, 0.0f, fHeight);
                if (fM2719d <= fM2719d2 || fM2719d <= fM2719d3 || fM2719d <= fM2719d4) {
                    fM2719d = (fM2719d2 <= fM2719d3 || fM2719d2 <= fM2719d4) ? fM2719d3 > fM2719d4 ? fM2719d3 : fM2719d4 : fM2719d2;
                }
                Animator animatorM2717b = C1161a.m2717b(interfaceC1222d3, fCenterX, fCenterY, fM2719d);
                animatorM2717b.addListener(new C1194c(this, interfaceC1222d3));
                c1189h = c1189hM2767d;
                m3204M(view2, c1189hM2767d.f5677a, (int) fCenterX, (int) fCenterY, fWidth2, arrayList);
                interfaceC1222d = interfaceC1222d3;
                c1387b = c1387bMo3206O;
                animator = animatorM2717b;
            } else {
                c1189h = c1189hM2767d;
                float f = interfaceC1222d3.getRevealInfo().f5852c;
                Animator animatorM2717b2 = C1161a.m2717b(interfaceC1222d3, fCenterX, fCenterY, fWidth2);
                int i2 = (int) fCenterX;
                int i3 = (int) fCenterY;
                m3204M(view2, c1189h.f5677a, i2, i3, f, arrayList);
                long j = c1189h.f5677a;
                long j2 = c1189h.f5678b;
                C1188g c1188g = c1387bMo3206O.f10506a;
                int i4 = c1188g.f5675a.f2197d;
                long jMax = 0;
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = i4;
                    C1189h c1189hM1276l = c1188g.f5675a.m1276l(i5);
                    jMax = Math.max(jMax, c1189hM1276l.f5677a + c1189hM1276l.f5678b);
                    i5++;
                    i4 = i6;
                    c1387bMo3206O = c1387bMo3206O;
                    interfaceC1222d3 = interfaceC1222d3;
                    c1188g = c1188g;
                }
                interfaceC1222d = interfaceC1222d3;
                c1387b = c1387bMo3206O;
                if (i >= 21) {
                    long j3 = j + j2;
                    if (j3 < jMax) {
                        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, fWidth2, fWidth2);
                        animatorCreateCircularReveal.setStartDelay(j3);
                        animatorCreateCircularReveal.setDuration(jMax - j3);
                        arrayList.add(animatorCreateCircularReveal);
                    }
                }
                animator = animatorM2717b2;
            }
            c1189h.m2768a(animator);
            arrayList.add(animator);
            arrayList2.add(new C1219a(interfaceC1222d));
        } else {
            c1387b = c1387bMo3206O;
        }
        m3202K(view, view2, z, z2, c1387b, arrayList);
        m3201J(view2, z, z2, c1387b, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        C1161a.m2734s(animatorSet, arrayList);
        animatorSet.addListener(new C1386a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i7));
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: E */
    public final Pair<C1189h, C1189h> m3196E(float f, float f2, boolean z, C1387b c1387b) {
        C1189h c1189hM2767d;
        C1188g c1188g;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            c1189hM2767d = c1387b.f10506a.m2767d("translationXLinear");
            c1188g = c1387b.f10506a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            c1189hM2767d = c1387b.f10506a.m2767d("translationXCurveDownwards");
            c1188g = c1387b.f10506a;
            str = "translationYCurveDownwards";
        } else {
            c1189hM2767d = c1387b.f10506a.m2767d("translationXCurveUpwards");
            c1188g = c1387b.f10506a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(c1189hM2767d, c1188g.m2767d(str));
    }

    /* JADX INFO: renamed from: F */
    public final float m3197F(View view, View view2, C1190i c1190i) {
        RectF rectF = this.f10498d;
        RectF rectF2 = this.f10499e;
        m3200I(view, rectF);
        rectF.offset(this.f10501g, this.f10502h);
        m3200I(view2, rectF2);
        Objects.requireNonNull(c1190i);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* JADX INFO: renamed from: G */
    public final float m3198G(View view, View view2, C1190i c1190i) {
        RectF rectF = this.f10498d;
        RectF rectF2 = this.f10499e;
        m3200I(view, rectF);
        rectF.offset(this.f10501g, this.f10502h);
        m3200I(view2, rectF2);
        Objects.requireNonNull(c1190i);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* JADX INFO: renamed from: H */
    public final float m3199H(C1387b c1387b, C1189h c1189h, float f, float f2) {
        long j = c1189h.f5677a;
        long j2 = c1189h.f5678b;
        C1189h c1189hM2767d = c1387b.f10506a.m2767d("expansion");
        float interpolation = c1189h.m2769b().getInterpolation((((c1189hM2767d.f5677a + c1189hM2767d.f5678b) + 17) - j) / j2);
        TimeInterpolator timeInterpolator = C1182a.f5662a;
        return a.m2187a(f2, f, interpolation, f);
    }

    /* JADX INFO: renamed from: I */
    public final void m3200I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f10500f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: J */
    public final void m3201J(View view, boolean z, boolean z2, C1387b c1387b, List list) {
        ViewGroup viewGroupM3207P;
        ObjectAnimator objectAnimatorOfFloat;
        if (view instanceof ViewGroup) {
            if ((view instanceof InterfaceC1222d) && C1221c.f5845a == 0) {
                return;
            }
            View viewFindViewById = view.findViewById(R.id.jy);
            if (viewFindViewById != null) {
                viewGroupM3207P = m3207P(viewFindViewById);
            } else {
                if ((view instanceof C1196e) || (view instanceof C1195d)) {
                    view = ((ViewGroup) view).getChildAt(0);
                }
                viewGroupM3207P = m3207P(view);
            }
            if (viewGroupM3207P == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C1184c.f5668a.set(viewGroupM3207P, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM3207P, C1184c.f5668a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM3207P, C1184c.f5668a, 0.0f);
            }
            c1387b.f10506a.m2767d("contentFade").m2768a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m3202K(View view, View view2, boolean z, boolean z2, C1387b c1387b, List list) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof InterfaceC1222d) {
            InterfaceC1222d interfaceC1222d = (InterfaceC1222d) view2;
            ColorStateList colorStateListM1565h = C0418m.m1565h(view);
            int colorForState = colorStateListM1565h != null ? colorStateListM1565h.getColorForState(view.getDrawableState(), colorStateListM1565h.getDefaultColor()) : 0;
            int i = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    interfaceC1222d.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC1222d, InterfaceC1222d.d.f5849a, i);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC1222d, InterfaceC1222d.d.f5849a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(C1183b.f5667a);
            c1387b.f10506a.m2767d("color").m2768a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: L */
    public final void m3203L(View view, View view2, boolean z, boolean z2, C1387b c1387b, List list) {
        ObjectAnimator objectAnimatorOfFloat;
        float fM1566i = C0418m.m1566i(view2) - C0418m.m1566i(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fM1566i);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM1566i);
        }
        c1387b.f10506a.m2767d("elevation").m2768a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: M */
    public final void m3204M(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        animatorCreateCircularReveal.setStartDelay(0L);
        animatorCreateCircularReveal.setDuration(j);
        list.add(animatorCreateCircularReveal);
    }

    /* JADX INFO: renamed from: N */
    public final void m3205N(View view, View view2, boolean z, boolean z2, C1387b c1387b, List list, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM3197F = m3197F(view, view2, c1387b.f10507b);
        float fM3198G = m3198G(view, view2, c1387b.f10507b);
        Pair<C1189h, C1189h> pairM3196E = m3196E(fM3197F, fM3198G, z, c1387b);
        C1189h c1189h = (C1189h) pairM3196E.first;
        C1189h c1189h2 = (C1189h) pairM3196E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fM3197F);
                view2.setTranslationY(-fM3198G);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fM3199H = m3199H(c1387b, c1189h, -fM3197F, 0.0f);
            float fM3199H2 = m3199H(c1387b, c1189h2, -fM3198G, 0.0f);
            Rect rect = this.f10497c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f10498d;
            rectF2.set(rect);
            RectF rectF3 = this.f10499e;
            m3200I(view2, rectF3);
            rectF3.offset(fM3199H, fM3199H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM3197F);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM3198G);
        }
        c1189h.m2768a(objectAnimatorOfFloat);
        c1189h2.m2768a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: O */
    public abstract C1387b mo3206O(Context context, boolean z);

    /* JADX INFO: renamed from: P */
    public final ViewGroup m3207P(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: d */
    public boolean mo167d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: f */
    public void mo169f(CoordinatorLayout.C0071f c0071f) {
        if (c0071f.f549h == 0) {
            c0071f.f549h = 80;
        }
    }
}
