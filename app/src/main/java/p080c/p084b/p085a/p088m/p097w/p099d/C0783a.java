package p080c.p084b.p085a.p088m.p097w.p099d;

import java.nio.ByteBuffer;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0656e;

/* JADX INFO: renamed from: c.b.a.m.w.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C0783a implements InterfaceC0656e<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f4497a;

    /* JADX INFO: renamed from: c.b.a.m.w.d.a$a */
    public static class a implements InterfaceC0656e.a<ByteBuffer> {
        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo2303a() {
            return ByteBuffer.class;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: b */
        public InterfaceC0656e<ByteBuffer> mo2304b(ByteBuffer byteBuffer) {
            return new C0783a(byteBuffer);
        }
    }

    public C0783a(ByteBuffer byteBuffer) {
        this.f4497a = byteBuffer;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo2301a() {
        this.f4497a.position(0);
        return this.f4497a;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
    /* JADX INFO: renamed from: b */
    public void mo2302b() {
    }
}
