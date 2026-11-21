package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: b.b.i.c1 */
/* JADX INFO: loaded from: classes.dex */
public class C0250c1 extends Resources {

    /* JADX INFO: renamed from: b */
    public static boolean f1810b;

    /* JADX INFO: renamed from: a */
    public final WeakReference<Context> f1811a;

    public C0250c1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1811a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1023a() {
        return f1810b && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m1024b(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawableM1115k;
        Context context = this.f1811a.get();
        if (context == null) {
            return super.getDrawable(i);
        }
        C0274n0 c0274n0M1105d = C0274n0.m1105d();
        synchronized (c0274n0M1105d) {
            Drawable drawableM1114j = c0274n0M1105d.m1114j(context, i);
            if (drawableM1114j == null) {
                drawableM1114j = m1024b(i);
            }
            drawableM1115k = drawableM1114j != null ? c0274n0M1105d.m1115k(context, i, false, drawableM1114j) : null;
        }
        return drawableM1115k;
    }
}
