package p006b.p073w;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: b.w.y */
/* JADX INFO: loaded from: classes.dex */
public class C0600y extends C0599x {
    @Override // p006b.p073w.C0596u, p006b.p073w.C0601z
    /* JADX INFO: renamed from: b */
    public float mo2140b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p006b.p073w.C0598w, p006b.p073w.C0601z
    /* JADX INFO: renamed from: d */
    public void mo2145d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p006b.p073w.C0596u, p006b.p073w.C0601z
    /* JADX INFO: renamed from: e */
    public void mo2142e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p006b.p073w.C0599x, p006b.p073w.C0601z
    /* JADX INFO: renamed from: f */
    public void mo2146f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p006b.p073w.C0597v, p006b.p073w.C0601z
    /* JADX INFO: renamed from: g */
    public void mo2143g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p006b.p073w.C0597v, p006b.p073w.C0601z
    /* JADX INFO: renamed from: h */
    public void mo2144h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
