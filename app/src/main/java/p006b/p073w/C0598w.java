package p006b.p073w;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: b.w.w */
/* JADX INFO: loaded from: classes.dex */
public class C0598w extends C0597v {

    /* JADX INFO: renamed from: h */
    public static boolean f3635h = true;

    @Override // p006b.p073w.C0601z
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public void mo2145d(View view, int i, int i2, int i3, int i4) {
        if (f3635h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3635h = false;
            }
        }
    }
}
