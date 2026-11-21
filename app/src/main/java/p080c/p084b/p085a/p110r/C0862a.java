package p080c.p084b.p085a.p110r;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.r.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0862a implements InterfaceC0645m {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f4711d = 0;

    /* JADX INFO: renamed from: b */
    public final int f4712b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0645m f4713c;

    public C0862a(int i, InterfaceC0645m interfaceC0645m) {
        this.f4712b = i;
        this.f4713c = interfaceC0645m;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        this.f4713c.mo2282a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f4712b).array());
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (!(obj instanceof C0862a)) {
            return false;
        }
        C0862a c0862a = (C0862a) obj;
        return this.f4712b == c0862a.f4712b && this.f4713c.equals(c0862a.f4713c);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return C0875j.m2615g(this.f4713c, this.f4712b);
    }
}
