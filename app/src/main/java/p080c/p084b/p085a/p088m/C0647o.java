package p080c.p084b.p085a.p088m;

import java.security.MessageDigest;
import p006b.p025e.C0313a;
import c.a.a.a.a;
import p080c.p084b.p085a.p111s.C0867b;

/* JADX INFO: renamed from: c.b.a.m.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0647o implements InterfaceC0645m {

    /* JADX INFO: renamed from: b */
    public final C0313a<C0646n<?>, Object> f3943b = new C0867b();

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0313a<C0646n<?>, Object> c0313a = this.f3943b;
            if (i >= c0313a.f2197d) {
                return;
            }
            C0646n<?> c0646nM1272h = c0313a.m1272h(i);
            Object objM1276l = this.f3943b.m1276l(i);
            C0646n.b<?> bVar = c0646nM1272h.f3940b;
            if (c0646nM1272h.f3942d == null) {
                c0646nM1272h.f3942d = c0646nM1272h.f3941c.getBytes(InterfaceC0645m.f3937a);
            }
            bVar.mo2284a(c0646nM1272h.f3942d, objM1276l, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public <T> T m2285c(C0646n<T> c0646n) {
        return this.f3943b.m1269e(c0646n) >= 0 ? (T) this.f3943b.getOrDefault(c0646n, null) : c0646n.f3939a;
    }

    /* JADX INFO: renamed from: d */
    public void m2286d(C0647o c0647o) {
        this.f3943b.mo1273i(c0647o.f3943b);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (obj instanceof C0647o) {
            return this.f3943b.equals(((C0647o) obj).f3943b);
        }
        return false;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return this.f3943b.hashCode();
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("Options{values=");
        sbM2191e.append(this.f3943b);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
