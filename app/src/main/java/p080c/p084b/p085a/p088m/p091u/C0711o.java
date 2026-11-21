package p080c.p084b.p085a.p088m.p091u;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0651s;

/* JADX INFO: renamed from: c.b.a.m.u.o */
/* JADX INFO: loaded from: classes.dex */
public class C0711o implements InterfaceC0645m {

    /* JADX INFO: renamed from: b */
    public final Object f4230b;

    /* JADX INFO: renamed from: c */
    public final int f4231c;

    /* JADX INFO: renamed from: d */
    public final int f4232d;

    /* JADX INFO: renamed from: e */
    public final Class<?> f4233e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f4234f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0645m f4235g;

    /* JADX INFO: renamed from: h */
    public final Map<Class<?>, InterfaceC0651s<?>> f4236h;

    /* JADX INFO: renamed from: i */
    public final C0647o f4237i;

    /* JADX INFO: renamed from: j */
    public int f4238j;

    public C0711o(Object obj, InterfaceC0645m interfaceC0645m, int i, int i2, Map<Class<?>, InterfaceC0651s<?>> map, Class<?> cls, Class<?> cls2, C0647o c0647o) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f4230b = obj;
        Objects.requireNonNull(interfaceC0645m, "Signature must not be null");
        this.f4235g = interfaceC0645m;
        this.f4231c = i;
        this.f4232d = i2;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f4236h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f4233e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f4234f = cls2;
        Objects.requireNonNull(c0647o, "Argument must not be null");
        this.f4237i = c0647o;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (!(obj instanceof C0711o)) {
            return false;
        }
        C0711o c0711o = (C0711o) obj;
        return this.f4230b.equals(c0711o.f4230b) && this.f4235g.equals(c0711o.f4235g) && this.f4232d == c0711o.f4232d && this.f4231c == c0711o.f4231c && this.f4236h.equals(c0711o.f4236h) && this.f4233e.equals(c0711o.f4233e) && this.f4234f.equals(c0711o.f4234f) && this.f4237i.equals(c0711o.f4237i);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        if (this.f4238j == 0) {
            int iHashCode = this.f4230b.hashCode();
            this.f4238j = iHashCode;
            int iHashCode2 = this.f4235g.hashCode() + (iHashCode * 31);
            this.f4238j = iHashCode2;
            int i = (iHashCode2 * 31) + this.f4231c;
            this.f4238j = i;
            int i2 = (i * 31) + this.f4232d;
            this.f4238j = i2;
            int iHashCode3 = this.f4236h.hashCode() + (i2 * 31);
            this.f4238j = iHashCode3;
            int iHashCode4 = this.f4233e.hashCode() + (iHashCode3 * 31);
            this.f4238j = iHashCode4;
            int iHashCode5 = this.f4234f.hashCode() + (iHashCode4 * 31);
            this.f4238j = iHashCode5;
            this.f4238j = this.f4237i.hashCode() + (iHashCode5 * 31);
        }
        return this.f4238j;
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("EngineKey{model=");
        sbM2191e.append(this.f4230b);
        sbM2191e.append(", width=");
        sbM2191e.append(this.f4231c);
        sbM2191e.append(", height=");
        sbM2191e.append(this.f4232d);
        sbM2191e.append(", resourceClass=");
        sbM2191e.append(this.f4233e);
        sbM2191e.append(", transcodeClass=");
        sbM2191e.append(this.f4234f);
        sbM2191e.append(", signature=");
        sbM2191e.append(this.f4235g);
        sbM2191e.append(", hashCode=");
        sbM2191e.append(this.f4238j);
        sbM2191e.append(", transformations=");
        sbM2191e.append(this.f4236h);
        sbM2191e.append(", options=");
        sbM2191e.append(this.f4237i);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
