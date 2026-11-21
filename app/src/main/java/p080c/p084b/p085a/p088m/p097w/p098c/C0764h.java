package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;

/* JADX INFO: renamed from: c.b.a.m.w.c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0764h implements InterfaceC0649q<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C0760d f4425a = new C0760d();

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(ByteBuffer byteBuffer, int i, int i2, C0647o c0647o) {
        return this.f4425a.mo2287a(ImageDecoder.createSource(byteBuffer), i, i2, c0647o);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2288b(ByteBuffer byteBuffer, C0647o c0647o) {
        return true;
    }
}
