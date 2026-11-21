package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: b.b.i.w0 */
/* JADX INFO: loaded from: classes.dex */
public class C0292w0 extends C0276o0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f2048b;

    public C0292w0(Context context, Resources resources) {
        super(resources);
        this.f2048b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = this.f1955a.getDrawable(i);
        Context context = this.f2048b.get();
        if (drawable != null && context != null) {
            C0274n0.m1105d().m1116l(context, i, drawable);
        }
        return drawable;
    }
}
