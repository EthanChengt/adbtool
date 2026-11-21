package p080c.p084b.p085a.p088m.p097w.p098c;

import android.content.Context;
import android.graphics.Bitmap;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.w.c.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762f implements InterfaceC0651s<Bitmap> {
    @Override // p080c.p084b.p085a.p088m.InterfaceC0651s
    /* JADX INFO: renamed from: b */
    public final InterfaceC0719w<Bitmap> mo2290b(Context context, InterfaceC0719w<Bitmap> interfaceC0719w, int i, int i2) {
        if (!C0875j.m2618j(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0678d interfaceC0678d = ComponentCallbacks2C0616b.m2205b(context).f3754b;
        Bitmap bitmapMo2409b = interfaceC0719w.mo2409b();
        if (i == Integer.MIN_VALUE) {
            i = bitmapMo2409b.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmapMo2409b.getHeight();
        }
        Bitmap bitmapMo2454c = mo2454c(interfaceC0678d, bitmapMo2409b, i, i2);
        return bitmapMo2409b.equals(bitmapMo2454c) ? interfaceC0719w : C0761e.m2453f(bitmapMo2454c, interfaceC0678d);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo2454c(InterfaceC0678d interfaceC0678d, Bitmap bitmap, int i, int i2);
}
