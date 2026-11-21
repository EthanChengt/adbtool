package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p111s.C0866a;

/* JADX INFO: renamed from: c.b.a.m.w.c.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0776t implements InterfaceC0649q<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C0760d f4477a = new C0760d();

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(InputStream inputStream, int i, int i2, C0647o c0647o) throws IOException {
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = C0866a.f4717a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = C0866a.f4717a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i3 = inputStream2.read(andSet);
            if (i3 < 0) {
                C0866a.f4717a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f4477a.mo2287a(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i, i2, c0647o);
            }
            byteArrayOutputStream.write(andSet, 0, i3);
        }
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2288b(InputStream inputStream, C0647o c0647o) {
        return true;
    }
}
