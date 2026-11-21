package c.c.a;

import android.os.Handler;
import com.didjdk.adbhelper.FastbootActivity;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.h3 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0919h3 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4811b;

    /* JADX INFO: renamed from: c.c.a.h3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.m2193g(a.m2191e("fastboot getvar serialno 2>&1;echo "), RunnableC0919h3.this.f4811b.f6412r, RunnableC0919h3.this.f4811b.R);
        }
    }

    public RunnableC0919h3(FastbootActivity fastbootActivity) {
        this.f4811b = fastbootActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        new Handler().postDelayed(new a(), 1000L);
    }
}
