package p080c.p084b.p085a.p088m.p095v;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.f */
/* JADX INFO: loaded from: classes.dex */
public class C0728f<Data> implements InterfaceC0736n<File, Data> {

    /* JADX INFO: renamed from: a */
    public final d<Data> f4298a;

    /* JADX INFO: renamed from: c.b.a.m.v.f$a */
    public static class a<Data> implements InterfaceC0737o<File, Data> {

        /* JADX INFO: renamed from: a */
        public final d<Data> f4299a;

        public a(d<Data> dVar) {
            this.f4299a = dVar;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public final InterfaceC0736n<File, Data> mo2429b(C0740r c0740r) {
            return new C0728f(this.f4299a);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.f$b */
    public static class b extends a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: c.b.a.m.v.f$b$a */
        public class a implements d<ParcelFileDescriptor> {
            @Override // p080c.p084b.p085a.p088m.p095v.C0728f.d
            /* JADX INFO: renamed from: a */
            public Class<ParcelFileDescriptor> mo2433a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0728f.d
            /* JADX INFO: renamed from: b */
            public ParcelFileDescriptor mo2434b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0728f.d
            /* JADX INFO: renamed from: c */
            public void mo2435c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.f$c */
    public static final class c<Data> implements InterfaceC0655d<Data> {

        /* JADX INFO: renamed from: b */
        public final File f4300b;

        /* JADX INFO: renamed from: c */
        public final d<Data> f4301c;

        /* JADX INFO: renamed from: d */
        public Data f4302d;

        public c(File file, d<Data> dVar) {
            this.f4300b = file;
            this.f4301c = dVar;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<Data> mo2291a() {
            return this.f4301c.mo2433a();
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: b */
        public void mo2294b() {
            Data data = this.f4302d;
            if (data != null) {
                try {
                    this.f4301c.mo2435c(data);
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

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: e */
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super Data> aVar) {
            try {
                Data dataMo2434b = this.f4301c.mo2434b(this.f4300b);
                this.f4302d = dataMo2434b;
                aVar.mo2300f(dataMo2434b);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo2299d(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.f$d */
    public interface d<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo2433a();

        /* JADX INFO: renamed from: b */
        Data mo2434b(File file);

        /* JADX INFO: renamed from: c */
        void mo2435c(Data data);
    }

    /* JADX INFO: renamed from: c.b.a.m.v.f$e */
    public static class e extends a<InputStream> {

        /* JADX INFO: renamed from: c.b.a.m.v.f$e$a */
        public class a implements d<InputStream> {
            @Override // p080c.p084b.p085a.p088m.p095v.C0728f.d
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo2433a() {
                return InputStream.class;
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0728f.d
            /* JADX INFO: renamed from: b */
            public InputStream mo2434b(File file) {
                return new FileInputStream(file);
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0728f.d
            /* JADX INFO: renamed from: c */
            public void mo2435c(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public C0728f(d<Data> dVar) {
        this.f4298a = dVar;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(File file, int i, int i2, C0647o c0647o) {
        File file2 = file;
        return new InterfaceC0736n.a(new C0865d(file2), new c(file2, this.f4298a));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2427b(File file) {
        return true;
    }
}
