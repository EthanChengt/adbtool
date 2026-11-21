package p080c.p084b.p085a.p088m.p097w.p103h;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p097w.p099d.C0784b;

/* JADX INFO: renamed from: c.b.a.m.w.h.a */
/* JADX INFO: loaded from: classes.dex */
public class C0802a implements InterfaceC0806e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a */
    public final Bitmap.CompressFormat f4553a = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: b */
    public final int f4554b = 100;

    @Override // p080c.p084b.p085a.p088m.p097w.p103h.InterfaceC0806e
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<byte[]> mo2512a(InterfaceC0719w<Bitmap> interfaceC0719w, C0647o c0647o) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC0719w.mo2409b().compress(this.f4553a, this.f4554b, byteArrayOutputStream);
        interfaceC0719w.mo2412e();
        return new C0784b(byteArrayOutputStream.toByteArray());
    }
}
