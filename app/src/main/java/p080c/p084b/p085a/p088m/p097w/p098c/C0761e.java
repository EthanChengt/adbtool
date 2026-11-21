package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import java.util.Objects;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0715s;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.w.c.e */
/* JADX INFO: loaded from: classes.dex */
public class C0761e implements InterfaceC0719w<Bitmap>, InterfaceC0715s {

    /* JADX INFO: renamed from: b */
    public final Bitmap f4422b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0678d f4423c;

    public C0761e(Bitmap bitmap, InterfaceC0678d interfaceC0678d) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f4422b = bitmap;
        Objects.requireNonNull(interfaceC0678d, "BitmapPool must not be null");
        this.f4423c = interfaceC0678d;
    }

    /* JADX INFO: renamed from: f */
    public static C0761e m2453f(Bitmap bitmap, InterfaceC0678d interfaceC0678d) {
        if (bitmap == null) {
            return null;
        }
        return new C0761e(bitmap, interfaceC0678d);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0715s
    /* JADX INFO: renamed from: a */
    public void mo2420a() {
        this.f4422b.prepareToDraw();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: b */
    public Bitmap mo2409b() {
        return this.f4422b;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: c */
    public int mo2410c() {
        return C0875j.m2612d(this.f4422b);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: d */
    public Class<Bitmap> mo2411d() {
        return Bitmap.class;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: e */
    public void mo2412e() {
        this.f4423c.mo2332e(this.f4422b);
    }
}
