package p080c.p084b.p085a.p088m.p097w.p100e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.C0217c;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p034c.p035b.C0369g;

/* JADX INFO: renamed from: c.b.a.m.w.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0785a {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f4499a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m2496a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f4499a) {
                return C0208a.m884b(theme != null ? new C0217c(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return C0362a.m1469c(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f4499a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return C0369g.m1476c(context2.getResources(), i, theme);
    }
}
