package p080c.p084b.p085a.p110r;

import java.security.MessageDigest;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;

/* JADX INFO: renamed from: c.b.a.r.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0865d implements InterfaceC0645m {

    /* JADX INFO: renamed from: b */
    public final Object f4716b;

    public C0865d(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f4716b = obj;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        messageDigest.update(this.f4716b.toString().getBytes(InterfaceC0645m.f3937a));
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (obj instanceof C0865d) {
            return this.f4716b.equals(((C0865d) obj).f4716b);
        }
        return false;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return this.f4716b.hashCode();
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("ObjectKey{object=");
        sbM2191e.append(this.f4716b);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
