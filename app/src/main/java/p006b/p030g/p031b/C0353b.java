package p006b.p030g.p031b;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: b.g.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0353b {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Matrix> f2529a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<RectF> f2530b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static void m1405a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m1405a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
