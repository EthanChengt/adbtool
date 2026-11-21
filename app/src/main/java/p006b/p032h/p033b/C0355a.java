package p006b.p032h.p033b;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import p006b.p032h.p034c.C0362a;

/* JADX INFO: renamed from: b.h.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0355a extends C0362a {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f2536b = 0;

    /* JADX INFO: renamed from: b.h.b.a$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f2537b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Activity f2538c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f2539d;

        public a(String[] strArr, Activity activity, int i) {
            this.f2537b = strArr;
            this.f2538c = activity;
            this.f2539d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f2537b.length];
            PackageManager packageManager = this.f2538c.getPackageManager();
            String packageName = this.f2538c.getPackageName();
            int length = this.f2537b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f2537b[i], packageName);
            }
            ((b) this.f2538c).onRequestPermissionsResult(this.f2539d, this.f2537b, iArr);
        }
    }

    /* JADX INFO: renamed from: b.h.b.a$b */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* JADX INFO: renamed from: b.h.b.a$c */
    public interface c {
        /* JADX INFO: renamed from: b */
        void mo1407b(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m1406d(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i));
        } else {
            ((c) activity).mo1407b(i);
            activity.requestPermissions(strArr, i);
        }
    }
}
