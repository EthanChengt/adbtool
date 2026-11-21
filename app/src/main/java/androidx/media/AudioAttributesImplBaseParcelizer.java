package androidx.media;

import java.util.Objects;
import p006b.p066r.C0522c;
import p006b.p077y.AbstractC0609a;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static C0522c read(AbstractC0609a abstractC0609a) {
        C0522c c0522c = new C0522c();
        c0522c.f3219a = abstractC0609a.m2173k(c0522c.f3219a, 1);
        c0522c.f3220b = abstractC0609a.m2173k(c0522c.f3220b, 2);
        c0522c.f3221c = abstractC0609a.m2173k(c0522c.f3221c, 3);
        c0522c.f3222d = abstractC0609a.m2173k(c0522c.f3222d, 4);
        return c0522c;
    }

    public static void write(C0522c c0522c, AbstractC0609a abstractC0609a) {
        Objects.requireNonNull(abstractC0609a);
        int i = c0522c.f3219a;
        abstractC0609a.mo2178p(1);
        abstractC0609a.mo2182t(i);
        int i2 = c0522c.f3220b;
        abstractC0609a.mo2178p(2);
        abstractC0609a.mo2182t(i2);
        int i3 = c0522c.f3221c;
        abstractC0609a.mo2178p(3);
        abstractC0609a.mo2182t(i3);
        int i4 = c0522c.f3222d;
        abstractC0609a.mo2178p(4);
        abstractC0609a.mo2182t(i4);
    }
}
