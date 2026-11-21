package p006b.p073w;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: b.w.u */
/* JADX INFO: loaded from: classes.dex */
public class C0596u extends C0601z {

    /* JADX INFO: renamed from: e */
    public static boolean f3632e = true;

    @Override // p006b.p073w.C0601z
    /* JADX INFO: renamed from: a */
    public void mo2139a(View view) {
    }

    @Override // p006b.p073w.C0601z
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public float mo2140b(View view) {
        if (f3632e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3632e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p006b.p073w.C0601z
    /* JADX INFO: renamed from: c */
    public void mo2141c(View view) {
    }

    @Override // p006b.p073w.C0601z
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void mo2142e(View view, float f) {
        if (f3632e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f3632e = false;
            }
        }
        view.setAlpha(f);
    }
}
