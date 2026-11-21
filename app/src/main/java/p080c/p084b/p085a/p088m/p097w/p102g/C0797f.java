package p080c.p084b.p085a.p088m.p097w.p102g;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import java.util.Objects;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p097w.p098c.C0761e;

/* JADX INFO: renamed from: c.b.a.m.w.g.f */
/* JADX INFO: loaded from: classes.dex */
public class C0797f implements InterfaceC0651s<C0794c> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0651s<Bitmap> f4524b;

    public C0797f(InterfaceC0651s<Bitmap> interfaceC0651s) {
        Objects.requireNonNull(interfaceC0651s, "Argument must not be null");
        this.f4524b = interfaceC0651s;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        this.f4524b.mo2282a(messageDigest);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0651s
    /* JADX INFO: renamed from: b */
    public InterfaceC0719w<C0794c> mo2290b(Context context, InterfaceC0719w<C0794c> interfaceC0719w, int i, int i2) {
        C0794c c0794cMo2409b = interfaceC0719w.mo2409b();
        InterfaceC0719w<Bitmap> c0761e = new C0761e(c0794cMo2409b.m2503b(), ComponentCallbacks2C0616b.m2205b(context).f3754b);
        InterfaceC0719w<Bitmap> interfaceC0719wMo2290b = this.f4524b.mo2290b(context, c0761e, i, i2);
        if (!c0761e.equals(interfaceC0719wMo2290b)) {
            c0761e.mo2412e();
        }
        Bitmap bitmapMo2409b = interfaceC0719wMo2290b.mo2409b();
        c0794cMo2409b.f4513b.f4523a.m2509c(this.f4524b, bitmapMo2409b);
        return interfaceC0719w;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (obj instanceof C0797f) {
            return this.f4524b.equals(((C0797f) obj).f4524b);
        }
        return false;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return this.f4524b.hashCode();
    }
}
