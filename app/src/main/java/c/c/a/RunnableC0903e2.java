package c.c.a;

import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.e2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0903e2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f4785c;

    public /* synthetic */ RunnableC0903e2(UnlockActivity unlockActivity, String str) {
        this.f4784b = unlockActivity;
        this.f4785c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnlockActivity unlockActivity = this.f4784b;
        String str = this.f4785c;
        Objects.requireNonNull(unlockActivity);
        m.m1952H(unlockActivity, str);
    }
}
