package p080c.p084b.p085a.p088m.p091u;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p111s.C0872g;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.u.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0721y implements InterfaceC0645m {

    /* JADX INFO: renamed from: j */
    public static final C0872g<Class<?>, byte[]> f4274j = new C0872g<>(50);

    /* JADX INFO: renamed from: b */
    public final InterfaceC0676b f4275b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0645m f4276c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0645m f4277d;

    /* JADX INFO: renamed from: e */
    public final int f4278e;

    /* JADX INFO: renamed from: f */
    public final int f4279f;

    /* JADX INFO: renamed from: g */
    public final Class<?> f4280g;

    /* JADX INFO: renamed from: h */
    public final C0647o f4281h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0651s<?> f4282i;

    public C0721y(InterfaceC0676b interfaceC0676b, InterfaceC0645m interfaceC0645m, InterfaceC0645m interfaceC0645m2, int i, int i2, InterfaceC0651s<?> interfaceC0651s, Class<?> cls, C0647o c0647o) {
        this.f4275b = interfaceC0676b;
        this.f4276c = interfaceC0645m;
        this.f4277d = interfaceC0645m2;
        this.f4278e = i;
        this.f4279f = i2;
        this.f4282i = interfaceC0651s;
        this.f4280g = cls;
        this.f4281h = c0647o;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4275b.mo2322c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f4278e).putInt(this.f4279f).array();
        this.f4277d.mo2282a(messageDigest);
        this.f4276c.mo2282a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC0651s<?> interfaceC0651s = this.f4282i;
        if (interfaceC0651s != null) {
            interfaceC0651s.mo2282a(messageDigest);
        }
        this.f4281h.mo2282a(messageDigest);
        C0872g<Class<?>, byte[]> c0872g = f4274j;
        byte[] bArrM2604a = c0872g.m2604a(this.f4280g);
        if (bArrM2604a == null) {
            bArrM2604a = this.f4280g.getName().getBytes(InterfaceC0645m.f3937a);
            c0872g.m2605d(this.f4280g, bArrM2604a);
        }
        messageDigest.update(bArrM2604a);
        this.f4275b.mo2323d(bArr);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (!(obj instanceof C0721y)) {
            return false;
        }
        C0721y c0721y = (C0721y) obj;
        return this.f4279f == c0721y.f4279f && this.f4278e == c0721y.f4278e && C0875j.m2610b(this.f4282i, c0721y.f4282i) && this.f4280g.equals(c0721y.f4280g) && this.f4276c.equals(c0721y.f4276c) && this.f4277d.equals(c0721y.f4277d) && this.f4281h.equals(c0721y.f4281h);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        int iHashCode = ((((this.f4277d.hashCode() + (this.f4276c.hashCode() * 31)) * 31) + this.f4278e) * 31) + this.f4279f;
        InterfaceC0651s<?> interfaceC0651s = this.f4282i;
        if (interfaceC0651s != null) {
            iHashCode = (iHashCode * 31) + interfaceC0651s.hashCode();
        }
        return this.f4281h.hashCode() + ((this.f4280g.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("ResourceCacheKey{sourceKey=");
        sbM2191e.append(this.f4276c);
        sbM2191e.append(", signature=");
        sbM2191e.append(this.f4277d);
        sbM2191e.append(", width=");
        sbM2191e.append(this.f4278e);
        sbM2191e.append(", height=");
        sbM2191e.append(this.f4279f);
        sbM2191e.append(", decodedResourceClass=");
        sbM2191e.append(this.f4280g);
        sbM2191e.append(", transformation='");
        sbM2191e.append(this.f4282i);
        sbM2191e.append('\'');
        sbM2191e.append(", options=");
        sbM2191e.append(this.f4281h);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
