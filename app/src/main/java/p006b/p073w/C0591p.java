package p006b.p073w;

import android.os.Build;

/* JADX INFO: renamed from: b.w.p */
/* JADX INFO: loaded from: classes.dex */
public class C0591p {

    /* JADX INFO: renamed from: a */
    public static final boolean f3619a;

    /* JADX INFO: renamed from: b */
    public static final boolean f3620b;

    /* JADX INFO: renamed from: c */
    public static final boolean f3621c;

    static {
        int i = Build.VERSION.SDK_INT;
        f3619a = true;
        f3620b = true;
        f3621c = i >= 28;
    }
}
