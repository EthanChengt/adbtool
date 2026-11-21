package c.c.a;

import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.f2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0908f2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4794b;

    @Override // java.lang.Runnable
    public final void run() {
        UnlockActivity unlockActivity = this.f4794b;
        Objects.requireNonNull(unlockActivity);
        m.m1952H(unlockActivity, "网络连接错误");
    }
}
