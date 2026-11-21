package p006b.p073w;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: b.w.v */
/* JADX INFO: loaded from: classes.dex */
public class C0597v extends C0596u {

    /* JADX INFO: renamed from: f */
    public static boolean f3633f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f3634g = true;

    @Override // p006b.p073w.C0601z
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void mo2143g(View view, Matrix matrix) {
        if (f3633f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3633f = false;
            }
        }
    }

    @Override // p006b.p073w.C0601z
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public void mo2144h(View view, Matrix matrix) {
        if (f3634g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3634g = false;
            }
        }
    }
}
