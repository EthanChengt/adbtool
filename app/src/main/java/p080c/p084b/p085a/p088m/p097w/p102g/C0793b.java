package p080c.p084b.p085a.p088m.p097w.p102g;

import p080c.p084b.p085a.p087l.InterfaceC0628a;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0793b implements InterfaceC0628a.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0678d f4511a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0676b f4512b;

    public C0793b(InterfaceC0678d interfaceC0678d, InterfaceC0676b interfaceC0676b) {
        this.f4511a = interfaceC0678d;
        this.f4512b = interfaceC0676b;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m2501a(int i) {
        InterfaceC0676b interfaceC0676b = this.f4512b;
        return interfaceC0676b == null ? new byte[i] : (byte[]) interfaceC0676b.mo2324e(i, byte[].class);
    }
}
