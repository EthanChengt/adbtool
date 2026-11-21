package androidx.media;

import java.util.Objects;
import p006b.p066r.InterfaceC0520a;
import p006b.p077y.AbstractC0609a;
import p006b.p077y.InterfaceC0611c;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0609a abstractC0609a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC0611c interfaceC0611cM2177o = audioAttributesCompat.f742a;
        if (abstractC0609a.mo2171i(1)) {
            interfaceC0611cM2177o = abstractC0609a.m2177o();
        }
        audioAttributesCompat.f742a = (InterfaceC0520a) interfaceC0611cM2177o;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0609a abstractC0609a) {
        Objects.requireNonNull(abstractC0609a);
        InterfaceC0520a interfaceC0520a = audioAttributesCompat.f742a;
        abstractC0609a.mo2178p(1);
        abstractC0609a.m2185w(interfaceC0520a);
    }
}
