package p080c.p084b.p085a.p088m.p095v;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import b.s.m;
import c.a.a.a.a;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0733k implements InterfaceC0736n<Uri, File> {

    /* JADX INFO: renamed from: a */
    public final Context f4317a;

    /* JADX INFO: renamed from: c.b.a.m.v.k$a */
    public static final class a implements InterfaceC0737o<Uri, File> {

        /* JADX INFO: renamed from: a */
        public final Context f4318a;

        public a(Context context) {
            this.f4318a = context;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, File> mo2429b(C0740r c0740r) {
            return new C0733k(this.f4318a);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.k$b */
    public static class b implements InterfaceC0655d<File> {

        /* JADX INFO: renamed from: d */
        public static final String[] f4319d = {"_data"};

        /* JADX INFO: renamed from: b */
        public final Context f4320b;

        /* JADX INFO: renamed from: c */
        public final Uri f4321c;

        public b(Context context, Uri uri) {
            this.f4320b = context;
            this.f4321c = uri;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<File> mo2291a() {
            return File.class;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: b */
        public void mo2294b() {
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: c */
        public EnumC0633a mo2295c() {
            return EnumC0633a.LOCAL;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        public void cancel() {
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: e */
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super File> aVar) {
            Cursor cursorQuery = this.f4320b.getContentResolver().query(this.f4321c, f4319d, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.mo2300f(new File(string));
                return;
            }
            StringBuilder sbM2191e = a.m2191e("Failed to find file path for: ");
            sbM2191e.append(this.f4321c);
            aVar.mo2299d(new FileNotFoundException(sbM2191e.toString()));
        }
    }

    public C0733k(Context context) {
        this.f4317a = context;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<File> mo2426a(Uri uri, int i, int i2, C0647o c0647o) {
        Uri uri2 = uri;
        return new InterfaceC0736n.a<>(new C0865d(uri2), new b(this.f4317a, uri2));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Uri uri) {
        return m.m1982z(uri);
    }
}
