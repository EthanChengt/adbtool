package p006b.p073w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: b.w.x */
/* JADX INFO: loaded from: classes.dex */
public class C0599x extends C0598w {

    /* JADX INFO: renamed from: i */
    public static boolean f3636i = true;

    @Override // p006b.p073w.C0601z
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public void mo2146f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo2146f(view, i);
        } else if (f3636i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f3636i = false;
            }
        }
    }
}
