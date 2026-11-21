package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p088m.p097w.p100e.AbstractC0786b;
import p080c.p084b.p085a.p088m.p097w.p100e.C0788d;

/* JADX INFO: renamed from: c.b.a.m.w.c.x */
/* JADX INFO: loaded from: classes.dex */
public class C0780x implements InterfaceC0649q<Uri, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C0788d f4487a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0678d f4488b;

    public C0780x(C0788d c0788d, InterfaceC0678d interfaceC0678d) {
        this.f4487a = c0788d;
        this.f4488b = interfaceC0678d;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(Uri uri, int i, int i2, C0647o c0647o) {
        InterfaceC0719w interfaceC0719wM2497c = this.f4487a.m2497c(uri);
        if (interfaceC0719wM2497c == null) {
            return null;
        }
        return C0770n.m2482a(this.f4488b, (Drawable) ((AbstractC0786b) interfaceC0719wM2497c).mo2409b(), i, i2);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(Uri uri, C0647o c0647o) {
        return "android.resource".equals(uri.getScheme());
    }
}
