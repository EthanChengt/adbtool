package p006b.p008b.p018i;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.i.d1 */
/* JADX INFO: loaded from: classes.dex */
public class C0253d1 {

    /* JADX INFO: renamed from: a */
    public static Method f1815a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1815a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1815a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1049a(View view, Rect rect, Rect rect2) {
        Method method = f1815a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1050b(View view) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return view.getLayoutDirection() == 1;
    }
}
