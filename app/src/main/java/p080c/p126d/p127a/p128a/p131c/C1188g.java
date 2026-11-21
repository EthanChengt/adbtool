package p080c.p126d.p127a.p128a.p131c;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p006b.p025e.C0320h;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.d.a.a.c.g */
/* JADX INFO: loaded from: classes.dex */
public class C1188g {

    /* JADX INFO: renamed from: a */
    public final C0320h<String, C1189h> f5675a = new C0320h<>();

    /* JADX INFO: renamed from: b */
    public final C0320h<String, PropertyValuesHolder[]> f5676b = new C0320h<>();

    /* JADX INFO: renamed from: a */
    public static C1188g m2764a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m2765b(context, resourceId);
    }

    /* JADX INFO: renamed from: b */
    public static C1188g m2765b(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m2766c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m2766c(arrayList);
        } catch (Exception e) {
            StringBuilder sbM2191e = a.m2191e("Can't load animation resource ID #0x");
            sbM2191e.append(Integer.toHexString(i));
            Log.w("MotionSpec", sbM2191e.toString(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1188g m2766c(List<Animator> list) {
        C1188g c1188g = new C1188g();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1188g.f5676b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C1182a.f5663b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C1182a.f5664c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C1182a.f5665d;
            }
            C1189h c1189h = new C1189h(startDelay, duration, interpolator);
            c1189h.f5680d = objectAnimator.getRepeatCount();
            c1189h.f5681e = objectAnimator.getRepeatMode();
            c1188g.f5675a.put(propertyName, c1189h);
        }
        return c1188g;
    }

    /* JADX INFO: renamed from: d */
    public C1189h m2767d(String str) {
        if (this.f5675a.getOrDefault(str, null) != null) {
            return this.f5675a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1188g) {
            return this.f5675a.equals(((C1188g) obj).f5675a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5675a.hashCode();
    }

    public String toString() {
        return '\n' + C1188g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f5675a + "}\n";
    }
}
