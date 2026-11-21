package p080c.p084b.p085a.p088m.p095v;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p080c.p084b.p085a.p088m.C0647o;

/* JADX INFO: renamed from: c.b.a.m.v.u */
/* JADX INFO: loaded from: classes.dex */
public class C0743u<Data> implements InterfaceC0736n<String, Data> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0736n<Uri, Data> f4359a;

    /* JADX INFO: renamed from: c.b.a.m.v.u$a */
    public static final class a implements InterfaceC0737o<String, AssetFileDescriptor> {
        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<String, AssetFileDescriptor> mo2429b(C0740r c0740r) {
            return new C0743u(c0740r.m2445b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.u$b */
    public static class b implements InterfaceC0737o<String, ParcelFileDescriptor> {
        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<String, ParcelFileDescriptor> mo2429b(C0740r c0740r) {
            return new C0743u(c0740r.m2445b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.u$c */
    public static class c implements InterfaceC0737o<String, InputStream> {
        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<String, InputStream> mo2429b(C0740r c0740r) {
            return new C0743u(c0740r.m2445b(Uri.class, InputStream.class));
        }
    }

    public C0743u(InterfaceC0736n<Uri, Data> interfaceC0736n) {
        this.f4359a = interfaceC0736n;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(String str, int i, int i2, C0647o c0647o) {
        Uri uriFromFile;
        File file;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else {
            if (str2.charAt(0) == '/') {
                file = new File(str2);
            } else {
                uriFromFile = Uri.parse(str2);
                if (uriFromFile.getScheme() == null) {
                    file = new File(str2);
                }
            }
            uriFromFile = Uri.fromFile(file);
        }
        if (uriFromFile == null || !this.f4359a.mo2427b(uriFromFile)) {
            return null;
        }
        return this.f4359a.mo2426a(uriFromFile, i, i2, c0647o);
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2427b(String str) {
        return true;
    }
}
