package p080c.p084b.p085a.p088m.p095v.p096y;

import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
import p080c.p084b.p085a.p088m.C0646n;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p089t.C0661j;
import p080c.p084b.p085a.p088m.p095v.C0729g;
import p080c.p084b.p085a.p088m.p095v.C0735m;
import p080c.p084b.p085a.p088m.p095v.C0740r;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0737o;

/* JADX INFO: renamed from: c.b.a.m.v.y.a */
/* JADX INFO: loaded from: classes.dex */
public class C0747a implements InterfaceC0736n<C0729g, InputStream> {

    /* JADX INFO: renamed from: b */
    public static final C0646n<Integer> f4370b = C0646n.m2283a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a */
    public final C0735m<C0729g, C0729g> f4371a;

    /* JADX INFO: renamed from: c.b.a.m.v.y.a$a */
    public static class a implements InterfaceC0737o<C0729g, InputStream> {

        /* JADX INFO: renamed from: a */
        public final C0735m<C0729g, C0729g> f4372a = new C0735m<>(500);

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<C0729g, InputStream> mo2429b(C0740r c0740r) {
            return new C0747a(this.f4372a);
        }
    }

    public C0747a(C0735m<C0729g, C0729g> c0735m) {
        this.f4371a = c0735m;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<InputStream> mo2426a(C0729g c0729g, int i, int i2, C0647o c0647o) {
        C0729g c0729g2 = c0729g;
        C0735m<C0729g, C0729g> c0735m = this.f4371a;
        if (c0735m != null) {
            C0735m.b<C0729g> bVarM2442a = C0735m.b.m2442a(c0729g2, 0, 0);
            C0729g c0729gM2604a = c0735m.f4322a.m2604a(bVarM2442a);
            Queue<C0735m.b<?>> queue = C0735m.b.f4323d;
            synchronized (queue) {
                queue.offer(bVarM2442a);
            }
            C0729g c0729g3 = c0729gM2604a;
            if (c0729g3 == null) {
                C0735m<C0729g, C0729g> c0735m2 = this.f4371a;
                Objects.requireNonNull(c0735m2);
                c0735m2.f4322a.m2605d(C0735m.b.m2442a(c0729g2, 0, 0), c0729g2);
            } else {
                c0729g2 = c0729g3;
            }
        }
        return new InterfaceC0736n.a<>(c0729g2, new C0661j(c0729g2, ((Integer) c0647o.m2285c(f4370b)).intValue()));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2427b(C0729g c0729g) {
        return true;
    }
}
