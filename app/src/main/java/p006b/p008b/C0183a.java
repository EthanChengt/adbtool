package p006b.p008b;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.reflect.Field;
import p006b.p008b.p018i.InterfaceC0256e1;
import p006b.p008b.p018i.ViewOnLongClickListenerC0244a1;

/* JADX INFO: renamed from: b.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0183a {

    /* JADX INFO: renamed from: a */
    public static Field f1190a;

    /* JADX INFO: renamed from: b */
    public static boolean f1191b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f1192c;

    /* JADX INFO: renamed from: d */
    public static boolean f1193d;

    /* JADX INFO: renamed from: e */
    public static Field f1194e;

    /* JADX INFO: renamed from: f */
    public static boolean f1195f;

    /* JADX INFO: renamed from: g */
    public static Field f1196g;

    /* JADX INFO: renamed from: h */
    public static boolean f1197h;

    /* JADX INFO: renamed from: a */
    public static void m754a(Object obj) {
        if (!f1193d) {
            try {
                f1192c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1193d = true;
        }
        Class<?> cls = f1192c;
        if (cls == null) {
            return;
        }
        if (!f1195f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1194e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f1195f = true;
        }
        Field field = f1194e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public static InputConnection m755b(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof InterfaceC0256e1) {
                    editorInfo.hintText = ((InterfaceC0256e1) parent).m1064a();
                    break;
                }
            }
        }
        return inputConnection;
    }

    /* JADX INFO: renamed from: c */
    public static void m756c(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        ViewOnLongClickListenerC0244a1 viewOnLongClickListenerC0244a1 = ViewOnLongClickListenerC0244a1.f1762k;
        if (viewOnLongClickListenerC0244a1 != null && viewOnLongClickListenerC0244a1.f1764b == view) {
            ViewOnLongClickListenerC0244a1.m1011c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0244a1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0244a1 viewOnLongClickListenerC0244a2 = ViewOnLongClickListenerC0244a1.f1763l;
        if (viewOnLongClickListenerC0244a2 != null && viewOnLongClickListenerC0244a2.f1764b == view) {
            viewOnLongClickListenerC0244a2.m1013b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
