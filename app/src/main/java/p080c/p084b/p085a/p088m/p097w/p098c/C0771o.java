package p080c.p084b.p085a.p088m.p097w.p098c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.c.o */
/* JADX INFO: loaded from: classes.dex */
public class C0771o implements InterfaceC0651s<Drawable> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0651s<Bitmap> f4457b;

    /* JADX INFO: renamed from: c */
    public final boolean f4458c;

    public C0771o(InterfaceC0651s<Bitmap> interfaceC0651s, boolean z) {
        this.f4457b = interfaceC0651s;
        this.f4458c = z;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        this.f4457b.mo2282a(messageDigest);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0651s
    /* JADX INFO: renamed from: b */
    public InterfaceC0719w<Drawable> mo2290b(Context context, InterfaceC0719w<Drawable> interfaceC0719w, int i, int i2) {
        InterfaceC0678d interfaceC0678d = ComponentCallbacks2C0616b.m2205b(context).f3754b;
        Drawable drawableMo2409b = interfaceC0719w.mo2409b();
        InterfaceC0719w<Bitmap> interfaceC0719wM2482a = C0770n.m2482a(interfaceC0678d, drawableMo2409b, i, i2);
        if (interfaceC0719wM2482a != null) {
            InterfaceC0719w<Bitmap> interfaceC0719wMo2290b = this.f4457b.mo2290b(context, interfaceC0719wM2482a, i, i2);
            if (!interfaceC0719wMo2290b.equals(interfaceC0719wM2482a)) {
                return C0777u.m2489f(context.getResources(), interfaceC0719wMo2290b);
            }
            interfaceC0719wMo2290b.mo2412e();
            return interfaceC0719w;
        }
        if (!this.f4458c) {
            return interfaceC0719w;
        }
        throw new IllegalArgumentException("Unable to convert " + drawableMo2409b + " to a Bitmap");
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (obj instanceof C0771o) {
            return this.f4457b.equals(((C0771o) obj).f4457b);
        }
        return false;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        return this.f4457b.hashCode();
    }
}
