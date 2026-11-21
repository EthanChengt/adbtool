package p006b.p008b.p018i;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import p006b.p008b.p012e.p013a.C0211c;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p036d.p037k.InterfaceC0381b;

/* JADX INFO: renamed from: b.b.i.e0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class C0255e0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f1822a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f1823b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f1824c = new Rect();

    /* JADX INFO: renamed from: d */
    public static Class<?> f1825d;

    static {
        try {
            f1825d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m1060a(Drawable drawable) {
        Drawable drawable2;
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0381b) {
                drawable2 = ((InterfaceC0381b) drawable).mo1517a();
            } else {
                if (drawable instanceof C0211c) {
                    return m1060a(((C0211c) drawable).f1474b);
                }
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m1060a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m1060a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m1061b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f1822a);
            } else {
                drawable.setState(f1823b);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static Rect m1062c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1825d != null) {
            try {
                Drawable drawableM1442d0 = C0360f.m1442d0(drawable);
                Object objInvoke = drawableM1442d0.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawableM1442d0, new Object[0]);
                if (objInvoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1825d.getFields()) {
                        String name = field.getName();
                        byte b2 = -1;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    b2 = 3;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    b2 = 1;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    b2 = 0;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    b2 = 2;
                                }
                                break;
                        }
                        if (b2 == 0) {
                            rect2.left = field.getInt(objInvoke);
                        } else if (b2 == 1) {
                            rect2.top = field.getInt(objInvoke);
                        } else if (b2 == 2) {
                            rect2.right = field.getInt(objInvoke);
                        } else if (b2 == 3) {
                            rect2.bottom = field.getInt(objInvoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1824c;
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m1063d(int i, PorterDuff.Mode mode) {
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
}
