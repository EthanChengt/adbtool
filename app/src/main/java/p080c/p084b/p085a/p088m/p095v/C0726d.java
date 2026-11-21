package p080c.p084b.p085a.p088m.p095v;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;
import p080c.p084b.p085a.p111s.C0866a;

/* JADX INFO: renamed from: c.b.a.m.v.d */
/* JADX INFO: loaded from: classes.dex */
public class C0726d implements InterfaceC0736n<File, ByteBuffer> {

    /* JADX INFO: renamed from: c.b.a.m.v.d$a */
    public static final class a implements InterfaceC0655d<ByteBuffer> {

        /* JADX INFO: renamed from: b */
        public final File f4292b;

        public a(File file) {
            this.f4292b = file;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo2291a() {
            return ByteBuffer.class;
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
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo2300f(C0866a.m2599a(this.f4292b));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo2299d(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.d$b */
    public static class b implements InterfaceC0737o<File, ByteBuffer> {
        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<File, ByteBuffer> mo2429b(C0740r c0740r) {
            return new C0726d();
        }
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<ByteBuffer> mo2426a(File file, int i, int i2, C0647o c0647o) {
        File file2 = file;
        return new InterfaceC0736n.a<>(new C0865d(file2), new a(file2));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2427b(File file) {
        return true;
    }
}
