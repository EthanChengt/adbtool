package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.c.i */
/* JADX INFO: loaded from: classes.dex */
public class C0765i extends AbstractC0762f {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4426b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0645m.f3937a);

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        messageDigest.update(f4426b);
    }

    @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0762f
    /* JADX INFO: renamed from: c */
    public Bitmap mo2454c(InterfaceC0678d interfaceC0678d, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = C0782z.f4493a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo2331d = interfaceC0678d.mo2331d(i, i2, C0782z.m2495c(bitmap));
        bitmapMo2331d.setHasAlpha(bitmap.hasAlpha());
        C0782z.m2493a(bitmap, bitmapMo2331d, matrix);
        return bitmapMo2331d;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        return obj instanceof C0765i;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return -599754482;
    }
}
