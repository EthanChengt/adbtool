package p080c.p084b.p085a.p088m.p097w.p098c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0715s;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;

/* JADX INFO: renamed from: c.b.a.m.w.c.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0777u implements InterfaceC0719w<BitmapDrawable>, InterfaceC0715s {

    /* JADX INFO: renamed from: b */
    public final Resources f4478b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0719w<Bitmap> f4479c;

    public C0777u(Resources resources, InterfaceC0719w<Bitmap> interfaceC0719w) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f4478b = resources;
        this.f4479c = interfaceC0719w;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0719w<BitmapDrawable> m2489f(Resources resources, InterfaceC0719w<Bitmap> interfaceC0719w) {
        if (interfaceC0719w == null) {
            return null;
        }
        return new C0777u(resources, interfaceC0719w);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0715s
    /* JADX INFO: renamed from: a */
    public void mo2420a() {
        InterfaceC0719w<Bitmap> interfaceC0719w = this.f4479c;
        if (interfaceC0719w instanceof InterfaceC0715s) {
            ((InterfaceC0715s) interfaceC0719w).mo2420a();
        }
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: b */
    public BitmapDrawable mo2409b() {
        return new BitmapDrawable(this.f4478b, this.f4479c.mo2409b());
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: c */
    public int mo2410c() {
        return this.f4479c.mo2410c();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: d */
    public Class<BitmapDrawable> mo2411d() {
        return BitmapDrawable.class;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: e */
    public void mo2412e() {
        this.f4479c.mo2412e();
    }
}
