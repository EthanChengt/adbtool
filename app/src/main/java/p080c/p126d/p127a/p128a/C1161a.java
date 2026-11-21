package p080c.p126d.p127a.p128a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p018i.C0294x0;
import p006b.p032h.p036d.C0370a;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.p141l.InterfaceC1222d;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p154x.C1293d;
import p080c.p126d.p127a.p128a.p154x.C1294e;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1298i;

/* JADX INFO: renamed from: c.d.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1161a {
    /* JADX INFO: renamed from: a */
    public static long m2716a(long j) {
        Calendar calendarM2729n = m2729n();
        calendarM2729n.setTimeInMillis(j);
        return m2725j(calendarM2729n).getTimeInMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Animator m2717b(InterfaceC1222d interfaceC1222d, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC1222d, (Property<InterfaceC1222d, V>) InterfaceC1222d.c.f5848a, (TypeEvaluator) InterfaceC1222d.b.f5846b, (Object[]) new InterfaceC1222d.e[]{new InterfaceC1222d.e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return objectAnimatorOfObject;
        }
        InterfaceC1222d.e revealInfo = interfaceC1222d.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC1222d, (int) f, (int) f2, revealInfo.f5852c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public static C1293d m2718c(int i) {
        if (i != 0) {
            return i != 1 ? new C1298i() : new C1294e();
        }
        return new C1298i();
    }

    /* JADX INFO: renamed from: d */
    public static float m2719d(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* JADX INFO: renamed from: e */
    public static float m2720e(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: f */
    public static int m2721f(Context context, int i, int i2) {
        TypedValue typedValueM2735t = m2735t(context, i);
        return typedValueM2735t != null ? typedValueM2735t.data : i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m2722g(View view, int i) {
        return m2737v(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* JADX INFO: renamed from: h */
    public static ColorStateList m2723h(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM883a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM883a = C0208a.m883a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM883a;
    }

    /* JADX INFO: renamed from: i */
    public static ColorStateList m2724i(Context context, C0294x0 c0294x0, int i) {
        int resourceId;
        ColorStateList colorStateListM883a;
        return (!c0294x0.f2052b.hasValue(i) || (resourceId = c0294x0.f2052b.getResourceId(i, 0)) == 0 || (colorStateListM883a = C0208a.m883a(context, resourceId)) == null) ? c0294x0.m1155c(i) : colorStateListM883a;
    }

    /* JADX INFO: renamed from: j */
    public static Calendar m2725j(Calendar calendar) {
        Calendar calendarM2730o = m2730o(calendar);
        Calendar calendarM2729n = m2729n();
        calendarM2729n.set(calendarM2730o.get(1), calendarM2730o.get(2), calendarM2730o.get(5));
        return calendarM2729n;
    }

    /* JADX INFO: renamed from: k */
    public static Drawable m2726k(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM884b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM884b = C0208a.m884b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM884b;
    }

    /* JADX INFO: renamed from: l */
    public static TimeZone m2727l() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: m */
    public static Calendar m2728m() {
        return m2725j(Calendar.getInstance());
    }

    /* JADX INFO: renamed from: n */
    public static Calendar m2729n() {
        return m2730o(null);
    }

    /* JADX INFO: renamed from: o */
    public static Calendar m2730o(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m2727l());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: renamed from: p */
    public static int m2731p(int i, int i2, float f) {
        return C0370a.m1487a(C0370a.m1489c(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: q */
    public static float m2732q(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX INFO: renamed from: r */
    public static PorterDuff.Mode m2733r(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m2734s(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    /* JADX INFO: renamed from: t */
    public static TypedValue m2735t(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2736u(Context context, int i, boolean z) {
        TypedValue typedValueM2735t = m2735t(context, i);
        if (typedValueM2735t == null || typedValueM2735t.type != 18) {
            return z;
        }
        return typedValueM2735t.data != 0;
    }

    /* JADX INFO: renamed from: v */
    public static int m2737v(Context context, int i, String str) {
        TypedValue typedValueM2735t = m2735t(context, i);
        if (typedValueM2735t != null) {
            return typedValueM2735t.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: w */
    public static void m2738w(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C1296g) {
            C1296g c1296g = (C1296g) background;
            C1296g.b bVar = c1296g.f6211b;
            if (bVar.f6247o != f) {
                bVar.f6247o = f;
                c1296g.m2984y();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m2739x(View view, C1296g c1296g) {
        C1252a c1252a = c1296g.f6211b.f6234b;
        if (c1252a != null && c1252a.f5968a) {
            float fM1566i = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                fM1566i += C0418m.m1566i((View) parent);
            }
            C1296g.b bVar = c1296g.f6211b;
            if (bVar.f6246n != fM1566i) {
                bVar.f6246n = fM1566i;
                c1296g.m2984y();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static PorterDuffColorFilter m2740y(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
