package p080c.p084b.p085a.p088m.p097w.p103h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p088m.p097w.p098c.C0761e;
import p080c.p084b.p085a.p088m.p097w.p102g.C0794c;

/* JADX INFO: renamed from: c.b.a.m.w.h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0804c implements InterfaceC0806e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0678d f4556a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0806e<Bitmap, byte[]> f4557b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0806e<C0794c, byte[]> f4558c;

    public C0804c(InterfaceC0678d interfaceC0678d, InterfaceC0806e<Bitmap, byte[]> interfaceC0806e, InterfaceC0806e<C0794c, byte[]> interfaceC0806e2) {
        this.f4556a = interfaceC0678d;
        this.f4557b = interfaceC0806e;
        this.f4558c = interfaceC0806e2;
    }

    @Override // p080c.p084b.p085a.p088m.p097w.p103h.InterfaceC0806e
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<byte[]> mo2512a(InterfaceC0719w<Drawable> interfaceC0719w, C0647o c0647o) {
        Drawable drawableMo2409b = interfaceC0719w.mo2409b();
        if (drawableMo2409b instanceof BitmapDrawable) {
            return this.f4557b.mo2512a(C0761e.m2453f(((BitmapDrawable) drawableMo2409b).getBitmap(), this.f4556a), c0647o);
        }
        if (drawableMo2409b instanceof C0794c) {
            return this.f4558c.mo2512a(interfaceC0719w, c0647o);
        }
        return null;
    }
}
