package p080c.p084b.p085a.p088m.p089t;

import java.io.InputStream;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p097w.p098c.C0779w;

/* JADX INFO: renamed from: c.b.a.m.t.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0662k implements InterfaceC0656e<InputStream> {

    /* JADX INFO: renamed from: a */
    public final C0779w f3968a;

    /* JADX INFO: renamed from: c.b.a.m.t.k$a */
    public static final class a implements InterfaceC0656e.a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0676b f3969a;

        public a(InterfaceC0676b interfaceC0676b) {
            this.f3969a = interfaceC0676b;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: a */
        public Class<InputStream> mo2303a() {
            return InputStream.class;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: b */
        public InterfaceC0656e<InputStream> mo2304b(InputStream inputStream) {
            return new C0662k(inputStream, this.f3969a);
        }
    }

    public C0662k(InputStream inputStream, InterfaceC0676b interfaceC0676b) {
        C0779w c0779w = new C0779w(inputStream, interfaceC0676b);
        this.f3968a = c0779w;
        c0779w.mark(5242880);
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
    /* JADX INFO: renamed from: b */
    public void mo2302b() {
        this.f3968a.m2492b();
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo2301a() {
        this.f3968a.reset();
        return this.f3968a;
    }
}
