package p080c.p084b.p085a.p088m.p097w.p103h;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p097w.p099d.C0784b;
import p080c.p084b.p085a.p088m.p097w.p102g.C0794c;
import p080c.p084b.p085a.p111s.C0866a;

/* JADX INFO: renamed from: c.b.a.m.w.h.d */
/* JADX INFO: loaded from: classes.dex */
public class C0805d implements InterfaceC0806e<C0794c, byte[]> {
    @Override // p080c.p084b.p085a.p088m.p097w.p103h.InterfaceC0806e
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<byte[]> mo2512a(InterfaceC0719w<C0794c> interfaceC0719w, C0647o c0647o) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = interfaceC0719w.mo2409b().f4513b.f4523a.f4525a.mo2268g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = C0866a.f4717a;
        C0866a.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C0866a.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.f4720a == 0 && bVar.f4721b == bVar.f4722c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.position(0);
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new C0784b(bArrArray);
    }
}
