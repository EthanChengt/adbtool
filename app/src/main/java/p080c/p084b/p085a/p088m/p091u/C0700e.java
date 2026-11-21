package p080c.p084b.p085a.p088m.p091u;

import java.security.MessageDigest;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;

/* JADX INFO: renamed from: c.b.a.m.u.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0700e implements InterfaceC0645m {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0645m f4080b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0645m f4081c;

    public C0700e(InterfaceC0645m interfaceC0645m, InterfaceC0645m interfaceC0645m2) {
        this.f4080b = interfaceC0645m;
        this.f4081c = interfaceC0645m2;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        this.f4080b.mo2282a(messageDigest);
        this.f4081c.mo2282a(messageDigest);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (!(obj instanceof C0700e)) {
            return false;
        }
        C0700e c0700e = (C0700e) obj;
        return this.f4080b.equals(c0700e.f4080b) && this.f4081c.equals(c0700e.f4081c);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return this.f4081c.hashCode() + (this.f4080b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("DataCacheKey{sourceKey=");
        sbM2191e.append(this.f4080b);
        sbM2191e.append(", signature=");
        sbM2191e.append(this.f4081c);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
