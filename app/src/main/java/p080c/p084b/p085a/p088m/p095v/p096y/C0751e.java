package p080c.p084b.p085a.p088m.p095v.p096y;

import java.io.InputStream;
import java.net.URL;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p095v.C0729g;
import p080c.p084b.p085a.p088m.p095v.C0740r;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0737o;

/* JADX INFO: renamed from: c.b.a.m.v.y.e */
/* JADX INFO: loaded from: classes.dex */
public class C0751e implements InterfaceC0736n<URL, InputStream> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0736n<C0729g, InputStream> f4394a;

    /* JADX INFO: renamed from: c.b.a.m.v.y.e$a */
    public static class a implements InterfaceC0737o<URL, InputStream> {
        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<URL, InputStream> mo2429b(C0740r c0740r) {
            return new C0751e(c0740r.m2445b(C0729g.class, InputStream.class));
        }
    }

    public C0751e(InterfaceC0736n<C0729g, InputStream> interfaceC0736n) {
        this.f4394a = interfaceC0736n;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<InputStream> mo2426a(URL url, int i, int i2, C0647o c0647o) {
        return this.f4394a.mo2426a(new C0729g(url), i, i2, c0647o);
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2427b(URL url) {
        return true;
    }
}
