package p006b.p008b.p018i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: b.b.i.u0 */
/* JADX INFO: loaded from: classes.dex */
public class C0288u0 extends ContextWrapper {

    /* JADX INFO: renamed from: c */
    public static final Object f2012c = new Object();

    /* JADX INFO: renamed from: d */
    public static ArrayList<WeakReference<C0288u0>> f2013d;

    /* JADX INFO: renamed from: a */
    public final Resources f2014a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f2015b;

    public C0288u0(Context context) {
        super(context);
        if (!C0250c1.m1023a()) {
            this.f2014a = new C0292w0(this, context.getResources());
            this.f2015b = null;
            return;
        }
        C0250c1 c0250c1 = new C0250c1(this, context.getResources());
        this.f2014a = c0250c1;
        Resources.Theme themeNewTheme = c0250c1.newTheme();
        this.f2015b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: a */
    public static Context m1135a(Context context) {
        boolean z = false;
        if (!(context instanceof C0288u0) && !(context.getResources() instanceof C0292w0) && !(context.getResources() instanceof C0250c1) && (Build.VERSION.SDK_INT < 21 || C0250c1.m1023a())) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (f2012c) {
            ArrayList<WeakReference<C0288u0>> arrayList = f2013d;
            if (arrayList == null) {
                f2013d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0288u0> weakReference = f2013d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2013d.remove(size);
                    }
                }
                for (int size2 = f2013d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0288u0> weakReference2 = f2013d.get(size2);
                    C0288u0 c0288u0 = weakReference2 != null ? weakReference2.get() : null;
                    if (c0288u0 != null && c0288u0.getBaseContext() == context) {
                        return c0288u0;
                    }
                }
            }
            C0288u0 c0288u1 = new C0288u0(context);
            f2013d.add(new WeakReference<>(c0288u1));
            return c0288u1;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2014a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2014a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2015b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f2015b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
