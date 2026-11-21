package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import p006b.p066r.C0521b;
import p006b.p077y.AbstractC0609a;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static C0521b read(AbstractC0609a abstractC0609a) {
        C0521b c0521b = new C0521b();
        c0521b.f3217a = (AudioAttributes) abstractC0609a.m2175m(c0521b.f3217a, 1);
        c0521b.f3218b = abstractC0609a.m2173k(c0521b.f3218b, 2);
        return c0521b;
    }

    public static void write(C0521b c0521b, AbstractC0609a abstractC0609a) {
        Objects.requireNonNull(abstractC0609a);
        AudioAttributes audioAttributes = c0521b.f3217a;
        abstractC0609a.mo2178p(1);
        abstractC0609a.mo2183u(audioAttributes);
        int i = c0521b.f3218b;
        abstractC0609a.mo2178p(2);
        abstractC0609a.mo2182t(i);
    }
}
