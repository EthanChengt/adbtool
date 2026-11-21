package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p111s.C0866a;

/* JADX INFO: renamed from: c.b.a.m.w.c.g */
/* JADX INFO: loaded from: classes.dex */
public class C0763g implements InterfaceC0649q<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C0769m f4424a;

    public C0763g(C0769m c0769m) {
        this.f4424a = c0769m;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(ByteBuffer byteBuffer, int i, int i2, C0647o c0647o) {
        AtomicReference<byte[]> atomicReference = C0866a.f4717a;
        return this.f4424a.m2478b(new C0866a.a(byteBuffer), i, i2, c0647o, C0769m.f4448k);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(ByteBuffer byteBuffer, C0647o c0647o) {
        Objects.requireNonNull(this.f4424a);
        return true;
    }
}
