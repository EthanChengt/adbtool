package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.c.q */
/* JADX INFO: loaded from: classes.dex */
public class C0773q extends AbstractC0762f {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4459b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC0645m.f3937a);

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        messageDigest.update(f4459b);
    }

    @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0762f
    /* JADX INFO: renamed from: c */
    public Bitmap mo2454c(InterfaceC0678d interfaceC0678d, Bitmap bitmap, int i, int i2) {
        return C0782z.m2494b(interfaceC0678d, bitmap, i, i2);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        return obj instanceof C0773q;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return 1572326941;
    }
}
