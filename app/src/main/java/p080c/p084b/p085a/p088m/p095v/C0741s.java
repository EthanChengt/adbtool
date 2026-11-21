package p080c.p084b.p085a.p088m.p095v;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p080c.p084b.p085a.p088m.C0647o;

/* JADX INFO: renamed from: c.b.a.m.v.s */
/* JADX INFO: loaded from: classes.dex */
public class C0741s<Data> implements InterfaceC0736n<Integer, Data> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0736n<Uri, Data> f4352a;

    /* JADX INFO: renamed from: b */
    public final Resources f4353b;

    /* JADX INFO: renamed from: c.b.a.m.v.s$a */
    public static final class a implements InterfaceC0737o<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f4354a;

        public a(Resources resources) {
            this.f4354a = resources;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Integer, AssetFileDescriptor> mo2429b(C0740r c0740r) {
            return new C0741s(this.f4354a, c0740r.m2445b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.s$b */
    public static class b implements InterfaceC0737o<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f4355a;

        public b(Resources resources) {
            this.f4355a = resources;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Integer, ParcelFileDescriptor> mo2429b(C0740r c0740r) {
            return new C0741s(this.f4355a, c0740r.m2445b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.s$c */
    public static class c implements InterfaceC0737o<Integer, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Resources f4356a;

        public c(Resources resources) {
            this.f4356a = resources;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Integer, InputStream> mo2429b(C0740r c0740r) {
            return new C0741s(this.f4356a, c0740r.m2445b(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.s$d */
    public static class d implements InterfaceC0737o<Integer, Uri> {

        /* JADX INFO: renamed from: a */
        public final Resources f4357a;

        public d(Resources resources) {
            this.f4357a = resources;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Integer, Uri> mo2429b(C0740r c0740r) {
            return new C0741s(this.f4357a, C0744v.f4360a);
        }
    }

    public C0741s(Resources resources, InterfaceC0736n<Uri, Data> interfaceC0736n) {
        this.f4353b = resources;
        this.f4352a = interfaceC0736n;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(Integer num, int i, int i2, C0647o c0647o) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f4353b.getResourcePackageName(num2.intValue()) + '/' + this.f4353b.getResourceTypeName(num2.intValue()) + '/' + this.f4353b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f4352a.mo2426a(uri, i, i2, c0647o);
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2427b(Integer num) {
        return true;
    }
}
