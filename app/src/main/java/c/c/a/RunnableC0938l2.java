package c.c.a;

import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.l2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0938l2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4851b;

    @Override // java.lang.Runnable
    public final void run() {
        UnlockActivity unlockActivity = this.f4851b;
        Objects.requireNonNull(unlockActivity);
        m.m1952H(unlockActivity, "解锁失败：网络连接错误");
    }
}
