package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0500e {

    /* JADX INFO: renamed from: b */
    public static int f52b;

    /* JADX INFO: renamed from: c */
    public static Field f53c;

    /* JADX INFO: renamed from: d */
    public static Field f54d;

    /* JADX INFO: renamed from: e */
    public static Field f55e;

    /* JADX INFO: renamed from: a */
    public Activity f56a;

    public ImmLeaksCleaner(Activity activity) {
        this.f56a = activity;
    }

    @Override // p006b.p061o.InterfaceC0500e
    /* JADX INFO: renamed from: d */
    public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
        if (aVar != AbstractC0499d.a.ON_DESTROY) {
            return;
        }
        if (f52b == 0) {
            try {
                f52b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f54d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f55e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f53c = declaredField3;
                declaredField3.setAccessible(true);
                f52b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f52b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f56a.getSystemService("input_method");
            try {
                Object obj = f53c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f54d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f55e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
