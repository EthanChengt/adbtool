package c.c.a;

import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.y1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1144y1 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f5496b;

    @Override // java.lang.Runnable
    public final void run() {
        UnlockActivity unlockActivity = this.f5496b;
        Objects.requireNonNull(unlockActivity);
        m.m1952H(unlockActivity, "解锁失败：验证不通过");
    }
}
