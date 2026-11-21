package p006b.p008b.p010d.p011a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p006b.p008b.p018i.C0274n0;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.C0362a;

/* JADX INFO: renamed from: b.b.d.a.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class C0208a {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f1405a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<Context, SparseArray<a>> f1406b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f1407c = new Object();

    /* JADX INFO: renamed from: b.b.d.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f1408a;

        /* JADX INFO: renamed from: b */
        public final Configuration f1409b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f1408a = colorStateList;
            this.f1409b = configuration;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m883a(Context context, int i) {
        ColorStateList colorStateListM1453m;
        ColorStateList colorStateList;
        a aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (f1407c) {
            SparseArray<a> sparseArray = f1406b.get(context);
            colorStateListM1453m = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (aVar.f1409b.equals(context.getResources().getConfiguration())) {
                colorStateList = aVar.f1408a;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f1405a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i3 = typedValue.type;
        if (!(i3 >= 28 && i3 <= 31)) {
            Resources resources2 = context.getResources();
            try {
                colorStateListM1453m = C0360f.m1453m(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM1453m == null) {
            Object obj = C0362a.f2571a;
            return i2 >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
        }
        synchronized (f1407c) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = f1406b;
            SparseArray<a> sparseArray2 = weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new a(colorStateListM1453m, context.getResources().getConfiguration()));
        }
        return colorStateListM1453m;
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m884b(Context context, int i) {
        return C0274n0.m1105d().m1111f(context, i);
    }
}
