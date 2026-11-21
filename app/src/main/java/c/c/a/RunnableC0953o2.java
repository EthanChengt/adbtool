package c.c.a;

import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.o2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0953o2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4867b;

    @Override // java.lang.Runnable
    public final void run() {
        UnlockActivity unlockActivity = this.f4867b;
        Objects.requireNonNull(unlockActivity);
        m.m1952H(unlockActivity, "解锁失败：错误请求");
    }
}
