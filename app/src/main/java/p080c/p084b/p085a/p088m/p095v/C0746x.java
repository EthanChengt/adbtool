package p080c.p084b.p085a.p088m.p095v;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p080c.p084b.p085a.p088m.C0647o;

/* JADX INFO: renamed from: c.b.a.m.v.x */
/* JADX INFO: loaded from: classes.dex */
public class C0746x<Data> implements InterfaceC0736n<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f4368b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final InterfaceC0736n<C0729g, Data> f4369a;

    /* JADX INFO: renamed from: c.b.a.m.v.x$a */
    public static class a implements InterfaceC0737o<Uri, InputStream> {
        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, InputStream> mo2429b(C0740r c0740r) {
            return new C0746x(c0740r.m2445b(C0729g.class, InputStream.class));
        }
    }

    public C0746x(InterfaceC0736n<C0729g, Data> interfaceC0736n) {
        this.f4369a = interfaceC0736n;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(Uri uri, int i, int i2, C0647o c0647o) {
        return this.f4369a.mo2426a(new C0729g(uri.toString()), i, i2, c0647o);
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Uri uri) {
        return f4368b.contains(uri.getScheme());
    }
}
