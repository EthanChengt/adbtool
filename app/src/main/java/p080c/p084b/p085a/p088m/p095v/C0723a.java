package p080c.p084b.p085a.p088m.p095v;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p089t.C0659h;
import p080c.p084b.p085a.p088m.p089t.C0664m;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.a */
/* JADX INFO: loaded from: classes.dex */
public class C0723a<Data> implements InterfaceC0736n<Uri, Data> {

    /* JADX INFO: renamed from: a */
    public final AssetManager f4285a;

    /* JADX INFO: renamed from: b */
    public final a<Data> f4286b;

    /* JADX INFO: renamed from: c.b.a.m.v.a$a */
    public interface a<Data> {
        /* JADX INFO: renamed from: a */
        InterfaceC0655d<Data> mo2428a(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: c.b.a.m.v.a$b */
    public static class b implements InterfaceC0737o<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f4287a;

        public b(AssetManager assetManager) {
            this.f4287a = assetManager;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.C0723a.a
        /* JADX INFO: renamed from: a */
        public InterfaceC0655d<ParcelFileDescriptor> mo2428a(AssetManager assetManager, String str) {
            return new C0659h(assetManager, str);
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, ParcelFileDescriptor> mo2429b(C0740r c0740r) {
            return new C0723a(this.f4287a, this);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.a$c */
    public static class c implements InterfaceC0737o<Uri, InputStream>, a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f4288a;

        public c(AssetManager assetManager) {
            this.f4288a = assetManager;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.C0723a.a
        /* JADX INFO: renamed from: a */
        public InterfaceC0655d<InputStream> mo2428a(AssetManager assetManager, String str) {
            return new C0664m(assetManager, str);
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, InputStream> mo2429b(C0740r c0740r) {
            return new C0723a(this.f4288a, this);
        }
    }

    public C0723a(AssetManager assetManager, a<Data> aVar) {
        this.f4285a = assetManager;
        this.f4286b = aVar;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(Uri uri, int i, int i2, C0647o c0647o) {
        Uri uri2 = uri;
        return new InterfaceC0736n.a(new C0865d(uri2), this.f4286b.mo2428a(this.f4285a, uri2.toString().substring(22)));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
