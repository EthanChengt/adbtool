package p080c.p084b.p085a.p111s;

import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.s.i */
/* JADX INFO: loaded from: classes.dex */
public class C0874i {

    /* JADX INFO: renamed from: a */
    public Class<?> f4739a;

    /* JADX INFO: renamed from: b */
    public Class<?> f4740b;

    /* JADX INFO: renamed from: c */
    public Class<?> f4741c;

    public C0874i() {
    }

    public C0874i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f4739a = cls;
        this.f4740b = cls2;
        this.f4741c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0874i.class != obj.getClass()) {
            return false;
        }
        C0874i c0874i = (C0874i) obj;
        return this.f4739a.equals(c0874i.f4739a) && this.f4740b.equals(c0874i.f4740b) && C0875j.m2610b(this.f4741c, c0874i.f4741c);
    }

    public int hashCode() {
        int iHashCode = (this.f4740b.hashCode() + (this.f4739a.hashCode() * 31)) * 31;
        Class<?> cls = this.f4741c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("MultiClassKey{first=");
        sbM2191e.append(this.f4739a);
        sbM2191e.append(", second=");
        sbM2191e.append(this.f4740b);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
