package p080c.p084b.p085a.p088m.p095v.p096y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import b.s.m;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p088m.p095v.C0740r;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0737o;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0750d<DataT> implements InterfaceC0736n<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    public final Context f4377a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0736n<File, DataT> f4378b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0736n<Uri, DataT> f4379c;

    /* JADX INFO: renamed from: d */
    public final Class<DataT> f4380d;

    /* JADX INFO: renamed from: c.b.a.m.v.y.d$a */
    public static abstract class a<DataT> implements InterfaceC0737o<Uri, DataT> {

        /* JADX INFO: renamed from: a */
        public final Context f4381a;

        /* JADX INFO: renamed from: b */
        public final Class<DataT> f4382b;

        public a(Context context, Class<DataT> cls) {
            this.f4381a = context;
            this.f4382b = cls;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public final InterfaceC0736n<Uri, DataT> mo2429b(C0740r c0740r) {
            return new C0750d(this.f4381a, c0740r.m2445b(File.class, this.f4382b), c0740r.m2445b(Uri.class, this.f4382b), this.f4382b);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.y.d$b */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.y.d$c */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.y.d$d */
    public static final class d<DataT> implements InterfaceC0655d<DataT> {

        /* JADX INFO: renamed from: l */
        public static final String[] f4383l = {"_data"};

        /* JADX INFO: renamed from: b */
        public final Context f4384b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0736n<File, DataT> f4385c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC0736n<Uri, DataT> f4386d;

        /* JADX INFO: renamed from: e */
        public final Uri f4387e;

        /* JADX INFO: renamed from: f */
        public final int f4388f;

        /* JADX INFO: renamed from: g */
        public final int f4389g;

        /* JADX INFO: renamed from: h */
        public final C0647o f4390h;

        /* JADX INFO: renamed from: i */
        public final Class<DataT> f4391i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f4392j;

        /* JADX INFO: renamed from: k */
        public volatile InterfaceC0655d<DataT> f4393k;

        public d(Context context, InterfaceC0736n<File, DataT> interfaceC0736n, InterfaceC0736n<Uri, DataT> interfaceC0736n2, Uri uri, int i, int i2, C0647o c0647o, Class<DataT> cls) {
            this.f4384b = context.getApplicationContext();
            this.f4385c = interfaceC0736n;
            this.f4386d = interfaceC0736n2;
            this.f4387e = uri;
            this.f4388f = i;
            this.f4389g = i2;
            this.f4390h = c0647o;
            this.f4391i = cls;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<DataT> mo2291a() {
            return this.f4391i;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: b */
        public void mo2294b() {
            InterfaceC0655d<DataT> interfaceC0655d = this.f4393k;
            if (interfaceC0655d != null) {
                interfaceC0655d.mo2294b();
            }
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: c */
        public EnumC0633a mo2295c() {
            return EnumC0633a.LOCAL;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        public void cancel() {
            this.f4392j = true;
            InterfaceC0655d<DataT> interfaceC0655d = this.f4393k;
            if (interfaceC0655d != null) {
                interfaceC0655d.cancel();
            }
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC0655d<DataT> m2449d() throws Throwable {
            InterfaceC0736n.a<DataT> aVarMo2426a;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                InterfaceC0736n<File, DataT> interfaceC0736n = this.f4385c;
                Uri uri = this.f4387e;
                try {
                    Cursor cursorQuery = this.f4384b.getContentResolver().query(uri, f4383l, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarMo2426a = interfaceC0736n.mo2426a(file, this.f4388f, this.f4389g, this.f4390h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                aVarMo2426a = this.f4386d.mo2426a(this.f4384b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f4387e) : this.f4387e, this.f4388f, this.f4389g, this.f4390h);
            }
            if (aVarMo2426a != null) {
                return aVarMo2426a.f4329c;
            }
            return null;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: e */
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super DataT> aVar) throws Throwable {
            try {
                InterfaceC0655d<DataT> interfaceC0655dM2449d = m2449d();
                if (interfaceC0655dM2449d == null) {
                    aVar.mo2299d(new IllegalArgumentException("Failed to build fetcher for: " + this.f4387e));
                    return;
                }
                this.f4393k = interfaceC0655dM2449d;
                if (this.f4392j) {
                    cancel();
                } else {
                    interfaceC0655dM2449d.mo2297e(enumC0620f, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo2299d(e);
            }
        }
    }

    public C0750d(Context context, InterfaceC0736n<File, DataT> interfaceC0736n, InterfaceC0736n<Uri, DataT> interfaceC0736n2, Class<DataT> cls) {
        this.f4377a = context.getApplicationContext();
        this.f4378b = interfaceC0736n;
        this.f4379c = interfaceC0736n2;
        this.f4380d = cls;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(Uri uri, int i, int i2, C0647o c0647o) {
        Uri uri2 = uri;
        return new InterfaceC0736n.a(new C0865d(uri2), new d(this.f4377a, this.f4378b, this.f4379c, uri2, i, i2, c0647o, this.f4380d));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && m.m1982z(uri);
    }
}
