package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.c.j */
/* JADX INFO: loaded from: classes.dex */
public class C0766j extends AbstractC0762f {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4427b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC0645m.f3937a);

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        messageDigest.update(f4427b);
    }

    @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0762f
    /* JADX INFO: renamed from: c */
    public Bitmap mo2454c(InterfaceC0678d interfaceC0678d, Bitmap bitmap, int i, int i2) {
        Paint paint = C0782z.f4493a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C0782z.m2494b(interfaceC0678d, bitmap, i, i2);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        return obj instanceof C0766j;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return -670243078;
    }
}
