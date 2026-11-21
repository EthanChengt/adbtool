package p006b.p032h.p034c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;

/* JADX INFO: renamed from: b.h.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0362a {

    /* JADX INFO: renamed from: a */
    public static final Object f2571a = new Object();

    /* JADX INFO: renamed from: a */
    public static int m1467a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* JADX INFO: renamed from: b */
    public static int m1468b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m1469c(Context context, int i) {
        return Build.VERSION.SDK_INT >= 21 ? context.getDrawable(i) : context.getResources().getDrawable(i);
    }
}
