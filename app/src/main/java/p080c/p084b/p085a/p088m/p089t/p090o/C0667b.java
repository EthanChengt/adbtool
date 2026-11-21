package p080c.p084b.p085a.p088m.p089t.p090o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import b.s.m;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.C0658g;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;

/* JADX INFO: renamed from: c.b.a.m.t.o.b */
/* JADX INFO: loaded from: classes.dex */
public class C0667b implements InterfaceC0655d<InputStream> {

    /* JADX INFO: renamed from: b */
    public final Uri f3974b;

    /* JADX INFO: renamed from: c */
    public final C0669d f3975c;

    /* JADX INFO: renamed from: d */
    public InputStream f3976d;

    /* JADX INFO: renamed from: c.b.a.m.t.o.b$a */
    public static class a implements InterfaceC0668c {

        /* JADX INFO: renamed from: b */
        public static final String[] f3977b = {"_data"};

        /* JADX INFO: renamed from: a */
        public final ContentResolver f3978a;

        public a(ContentResolver contentResolver) {
            this.f3978a = contentResolver;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.p090o.InterfaceC0668c
        /* JADX INFO: renamed from: a */
        public Cursor mo2310a(Uri uri) {
            return this.f3978a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f3977b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.t.o.b$b */
    public static class b implements InterfaceC0668c {

        /* JADX INFO: renamed from: b */
        public static final String[] f3979b = {"_data"};

        /* JADX INFO: renamed from: a */
        public final ContentResolver f3980a;

        public b(ContentResolver contentResolver) {
            this.f3980a = contentResolver;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.p090o.InterfaceC0668c
        /* JADX INFO: renamed from: a */
        public Cursor mo2310a(Uri uri) {
            return this.f3980a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f3979b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C0667b(Uri uri, C0669d c0669d) {
        this.f3974b = uri;
        this.f3975c = c0669d;
    }

    /* JADX INFO: renamed from: d */
    public static C0667b m2308d(Context context, Uri uri, InterfaceC0668c interfaceC0668c) {
        return new C0667b(uri, new C0669d(ComponentCallbacks2C0616b.m2205b(context).f3757e.m2214e(), interfaceC0668c, ComponentCallbacks2C0616b.m2205b(context).f3758f, context.getContentResolver()));
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo2291a() {
        return InputStream.class;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: b */
    public void mo2294b() {
        InputStream inputStream = this.f3976d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
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
    public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamM2309f = m2309f();
            this.f3976d = inputStreamM2309f;
            aVar.mo2300f(inputStreamM2309f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo2299d(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d A[PHI: r6
      0x004d: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v9 android.database.Cursor) binds: [B:22:0x004b, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0023: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x0023 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX INFO: renamed from: f */
    public final InputStream m2309f() throws Throwable {
        SecurityException e;
        Cursor cursorMo2310a = null;
        String string;
        File file;
        Uri uriFromFile;
        InputStream inputStreamOpenInputStream;
        int iM1973q;
        Uri uri;
        C0669d c0669d = this.f3975c;
        Uri uri2 = this.f3974b;
        Objects.requireNonNull(c0669d);
        boolean z = false;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorMo2310a = c0669d.f3982a.mo2310a(uri2);
                if (cursorMo2310a != null) {
                    try {
                        if (cursorMo2310a.moveToFirst()) {
                            string = cursorMo2310a.getString(0);
                            cursorMo2310a.close();
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri2, e);
                        }
                        if (cursorMo2310a != null) {
                            cursorMo2310a.close();
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() && 0 < file.length()) {
                            z = true;
                        }
                        if (z) {
                            uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = c0669d.f3984c.openInputStream(uriFromFile);
                            } catch (NullPointerException e3) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri2 + " -> " + uriFromFile).initCause(e3));
                            }
                        } else {
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        C0669d c0669d2 = this.f3975c;
                        uri = this.f3974b;
                        Objects.requireNonNull(c0669d2);
                        try {
                            try {
                                inputStreamOpenInputStream2 = c0669d2.f3984c.openInputStream(uri);
                                iM1973q = m.m1973q(c0669d2.f3985d, inputStreamOpenInputStream2, c0669d2.f3983b);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException | NullPointerException e4) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e4);
                            }
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            iM1973q = -1;
                        }
                    } else {
                        iM1973q = -1;
                    }
                    if (iM1973q != -1) {
                        return new C0658g(inputStreamOpenInputStream, iM1973q);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorMo2310a != null) {
                    cursorMo2310a.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorMo2310a != null) {
                    cursorMo2310a.close();
                }
                throw th;
            }
        } catch (SecurityException e5) {
            e = e5;
            cursorMo2310a = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursorMo2310a != null) {
                cursorMo2310a.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                z = true;
            }
            if (z) {
                inputStreamOpenInputStream = null;
            } else {
                uriFromFile = Uri.fromFile(file);
                inputStreamOpenInputStream = c0669d.f3984c.openInputStream(uriFromFile);
            }
        }
        if (inputStreamOpenInputStream != null) {
            C0669d c0669d3 = this.f3975c;
            uri = this.f3974b;
            Objects.requireNonNull(c0669d3);
            inputStreamOpenInputStream2 = c0669d3.f3984c.openInputStream(uri);
            iM1973q = m.m1973q(c0669d3.f3985d, inputStreamOpenInputStream2, c0669d3.f3983b);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iM1973q = -1;
        }
        if (iM1973q != -1) {
            return new C0658g(inputStreamOpenInputStream, iM1973q);
        }
        return inputStreamOpenInputStream;
    }
}
