package p006b.p032h.p033b;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: b.h.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0359e {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f2546a;

    /* JADX INFO: renamed from: b */
    public static final Field f2547b;

    /* JADX INFO: renamed from: c */
    public static final Field f2548c;

    /* JADX INFO: renamed from: d */
    public static final Method f2549d;

    /* JADX INFO: renamed from: e */
    public static final Method f2550e;

    /* JADX INFO: renamed from: f */
    public static final Method f2551f;

    /* JADX INFO: renamed from: g */
    public static final Handler f2552g;

    /* JADX INFO: renamed from: b.h.b.e$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public Object f2553a;

        /* JADX INFO: renamed from: b */
        public Activity f2554b;

        /* JADX INFO: renamed from: c */
        public boolean f2555c = false;

        /* JADX INFO: renamed from: d */
        public boolean f2556d = false;

        /* JADX INFO: renamed from: e */
        public boolean f2557e = false;

        public a(Activity activity) {
            this.f2554b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2554b == activity) {
                this.f2554b = null;
                this.f2556d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2556d || this.f2557e || this.f2555c) {
                return;
            }
            Object obj = this.f2553a;
            boolean z = false;
            try {
                Object obj2 = C0359e.f2548c.get(activity);
                if (obj2 == obj) {
                    C0359e.f2552g.postAtFrontOfQueue(new RunnableC0358d(C0359e.f2547b.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z) {
                this.f2557e = true;
                this.f2553a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2554b == activity) {
                this.f2555c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Class<?> cls2 = Boolean.TYPE;
        f2552g = new Handler(Looper.getMainLooper());
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f2546a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f2547b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f2548c = declaredField2;
        Class<?> cls3 = f2546a;
        if (cls3 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls3.getDeclaredMethod("performStopActivity", IBinder.class, cls2, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f2549d = declaredMethod;
        Class<?> cls4 = f2546a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls2);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f2550e = declaredMethod2;
        Class<?> cls5 = f2546a;
        if (m1408a() && cls5 != null) {
            try {
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f2551f = method;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1408a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
