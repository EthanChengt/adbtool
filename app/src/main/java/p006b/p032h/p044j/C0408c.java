package p006b.p032h.p044j;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: b.h.j.c */
/* JADX INFO: loaded from: classes.dex */
public class C0408c {

    /* JADX INFO: renamed from: a */
    public static boolean f2704a;

    /* JADX INFO: renamed from: b */
    public static Method f2705b;

    /* JADX INFO: renamed from: c */
    public static boolean f2706c;

    /* JADX INFO: renamed from: d */
    public static Field f2707d;

    /* JADX INFO: renamed from: b.h.j.c$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        boolean mo860e(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1542a(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = C0418m.d.f2727d;
            C0418m.d dVar = (C0418m.d) view.getTag(R.id.nz);
            if (dVar == null) {
                dVar = new C0418m.d();
                view.setTag(R.id.nz, dVar);
            }
            WeakReference<KeyEvent> weakReference = dVar.f2730c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                dVar.f2730c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReferenceValueAt = null;
                if (dVar.f2729b == null) {
                    dVar.f2729b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = dVar.f2729b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReferenceValueAt == null) {
                    weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReferenceValueAt != null) {
                    View view2 = weakReferenceValueAt.get();
                    if (view2 == null || !view2.isAttachedToWindow()) {
                        return true;
                    }
                    dVar.m1587b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1543b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo860e(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f2704a) {
                        try {
                            f2705b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f2704a = true;
                    }
                    Method method = f2705b;
                    if (method != null) {
                        try {
                            zBooleanValue = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C0418m.m1562e(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && C0418m.m1562e(view, keyEvent)) || aVar.mo860e(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f2706c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2707d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f2706c = true;
        }
        Field field = f2707d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (C0418m.m1562e(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }
}
