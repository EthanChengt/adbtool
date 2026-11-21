package p080c.p084b.p085a.p088m.p095v.p096y;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import b.s.m;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p089t.p090o.C0667b;
import p080c.p084b.p085a.p088m.p095v.C0740r;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0737o;
import p080c.p084b.p085a.p088m.p097w.p098c.C0757b0;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.y.c */
/* JADX INFO: loaded from: classes.dex */
public class C0749c implements InterfaceC0736n<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f4375a;

    /* JADX INFO: renamed from: c.b.a.m.v.y.c$a */
    public static class a implements InterfaceC0737o<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f4376a;

        public a(Context context) {
            this.f4376a = context;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, InputStream> mo2429b(C0740r c0740r) {
            return new C0749c(this.f4376a);
        }
    }

    public C0749c(Context context) {
        this.f4375a = context.getApplicationContext();
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<InputStream> mo2426a(Uri uri, int i, int i2, C0647o c0647o) {
        Uri uri2 = uri;
        if (m.m1945A(i, i2)) {
            Long l = (Long) c0647o.m2285c(C0757b0.f4409d);
            if (l != null && l.longValue() == -1) {
                C0865d c0865d = new C0865d(uri2);
                Context context = this.f4375a;
                return new InterfaceC0736n.a<>(c0865d, C0667b.m2308d(context, uri2, new C0667b.b(context.getContentResolver())));
            }
        }
        return null;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Uri uri) {
        Uri uri2 = uri;
        return m.m1982z(uri2) && uri2.getPathSegments().contains("video");
    }
}
