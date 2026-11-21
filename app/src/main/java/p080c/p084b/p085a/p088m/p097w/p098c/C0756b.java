package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0635c;
import p080c.p084b.p085a.p088m.InterfaceC0650r;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C0756b implements InterfaceC0650r<BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0678d f4407a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0650r<Bitmap> f4408b;

    public C0756b(InterfaceC0678d interfaceC0678d, InterfaceC0650r<Bitmap> interfaceC0650r) {
        this.f4407a = interfaceC0678d;
        this.f4408b = interfaceC0650r;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0636d
    /* JADX INFO: renamed from: a */
    public boolean mo2279a(Object obj, File file, C0647o c0647o) {
        return this.f4408b.mo2279a((Bitmap) new C0761e(((BitmapDrawable) ((InterfaceC0719w) obj).mo2409b()).getBitmap(), this.f4407a), file, c0647o);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0650r
    /* JADX INFO: renamed from: b */
    public EnumC0635c mo2289b(C0647o c0647o) {
        return this.f4408b.mo2289b(c0647o);
    }
}
