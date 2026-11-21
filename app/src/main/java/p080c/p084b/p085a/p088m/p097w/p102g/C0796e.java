package p080c.p084b.p085a.p088m.p097w.p102g;

import android.graphics.Bitmap;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0715s;
import p080c.p084b.p085a.p088m.p097w.p100e.AbstractC0786b;

/* JADX INFO: renamed from: c.b.a.m.w.g.e */
/* JADX INFO: loaded from: classes.dex */
public class C0796e extends AbstractC0786b<C0794c> implements InterfaceC0715s {
    public C0796e(C0794c c0794c) {
        super(c0794c);
    }

    @Override // p080c.p084b.p085a.p088m.p097w.p100e.AbstractC0786b, p080c.p084b.p085a.p088m.p091u.InterfaceC0715s
    /* JADX INFO: renamed from: a */
    public void mo2420a() {
        ((C0794c) this.f4500b).m2503b().prepareToDraw();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: c */
    public int mo2410c() {
        C0798g c0798g = ((C0794c) this.f4500b).f4513b.f4523a;
        return c0798g.f4525a.mo2263b() + c0798g.f4539o;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: d */
    public Class<C0794c> mo2411d() {
        return C0794c.class;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: e */
    public void mo2412e() {
        ((C0794c) this.f4500b).stop();
        C0794c c0794c = (C0794c) this.f4500b;
        c0794c.f4516e = true;
        C0798g c0798g = c0794c.f4513b.f4523a;
        c0798g.f4527c.clear();
        Bitmap bitmap = c0798g.f4536l;
        if (bitmap != null) {
            c0798g.f4529e.mo2332e(bitmap);
            c0798g.f4536l = null;
        }
        c0798g.f4530f = false;
        C0798g.a aVar = c0798g.f4533i;
        if (aVar != null) {
            c0798g.f4528d.m2233m(aVar);
            c0798g.f4533i = null;
        }
        C0798g.a aVar2 = c0798g.f4535k;
        if (aVar2 != null) {
            c0798g.f4528d.m2233m(aVar2);
            c0798g.f4535k = null;
        }
        C0798g.a aVar3 = c0798g.f4538n;
        if (aVar3 != null) {
            c0798g.f4528d.m2233m(aVar3);
            c0798g.f4538n = null;
        }
        c0798g.f4525a.clear();
        c0798g.f4534j = true;
    }
}
