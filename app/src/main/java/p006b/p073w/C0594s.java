package p006b.p073w;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: b.w.s */
/* JADX INFO: loaded from: classes.dex */
public class C0594s {

    /* JADX INFO: renamed from: a */
    public static boolean f3629a = true;

    /* JADX INFO: renamed from: a */
    public static void m2136a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f3629a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f3629a = false;
            }
        }
    }
}
