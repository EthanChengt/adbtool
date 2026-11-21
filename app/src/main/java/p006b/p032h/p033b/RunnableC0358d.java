package p006b.p032h.p033b;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: b.h.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0358d implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2544b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2545c;

    public RunnableC0358d(Object obj, Object obj2) {
        this.f2544b = obj;
        this.f2545c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Boolean bool = Boolean.FALSE;
        try {
            Method method = C0359e.f2549d;
            if (method != null) {
                method.invoke(this.f2544b, this.f2545c, bool, "AppCompat recreation");
            } else {
                C0359e.f2550e.invoke(this.f2544b, this.f2545c, bool);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
