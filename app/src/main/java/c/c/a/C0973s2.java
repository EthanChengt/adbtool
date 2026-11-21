package c.c.a;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c.c.a.s2 */
/* JADX INFO: loaded from: classes.dex */
public class C0973s2 {

    /* JADX INFO: renamed from: a */
    public static List<Activity> f4898a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m2630a() {
        for (Activity activity : f4898a) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        f4898a.clear();
    }
}
