package p006b.p073w;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: b.w.z */
/* JADX INFO: loaded from: classes.dex */
public class C0601z {

    /* JADX INFO: renamed from: a */
    public static Method f3637a;

    /* JADX INFO: renamed from: b */
    public static boolean f3638b;

    /* JADX INFO: renamed from: c */
    public static Field f3639c;

    /* JADX INFO: renamed from: d */
    public static boolean f3640d;

    /* JADX INFO: renamed from: a */
    public void mo2139a(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public float mo2140b(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo2141c(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public void mo2145d(View view, int i, int i2, int i3, int i4) {
        if (!f3638b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f3637a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f3638b = true;
        }
        Method method = f3637a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo2142e(View view, float f) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void mo2146f(View view, int i) {
        if (!f3640d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3639c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3640d = true;
        }
        Field field = f3639c;
        if (field != null) {
            try {
                f3639c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo2143g(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo2143g(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* JADX INFO: renamed from: h */
    public void mo2144h(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo2144h(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
