package c.c.a;

import com.didjdk.adbhelper.FastbootActivity;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.p0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0956p0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4870b;

    @Override // java.lang.Runnable
    public final void run() {
        FastbootActivity fastbootActivity = this.f4870b;
        Objects.requireNonNull(fastbootActivity);
        m.m1952H(fastbootActivity, "非fastboot设备");
    }
}
