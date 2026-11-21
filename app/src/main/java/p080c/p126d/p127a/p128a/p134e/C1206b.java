package p080c.p126d.p127a.p128a.p134e;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.d.a.a.e.b */
/* JADX INFO: loaded from: classes.dex */
public class C1206b {
    /* JADX INFO: renamed from: a */
    public static void m2788a(C1205a c1205a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c1205a.setBounds(rect);
        c1205a.f5727p = new WeakReference<>(view);
        c1205a.f5728q = new WeakReference<>(frameLayout);
        c1205a.m2787e();
        c1205a.invalidateSelf();
    }
}
