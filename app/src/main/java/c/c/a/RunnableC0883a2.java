package c.c.a;

import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.a2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0883a2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f4756c;

    public /* synthetic */ RunnableC0883a2(UnlockActivity unlockActivity, String str) {
        this.f4755b = unlockActivity;
        this.f4756c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnlockActivity unlockActivity = this.f4755b;
        String str = this.f4756c;
        Objects.requireNonNull(unlockActivity);
        m.m1952H(unlockActivity, "解锁失败：" + str);
    }
}
