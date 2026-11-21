package p080c.p084b.p085a.p088m.p095v;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.b */
/* JADX INFO: loaded from: classes.dex */
public class C0724b<Data> implements InterfaceC0736n<byte[], Data> {

    /* JADX INFO: renamed from: a */
    public final b<Data> f4289a;

    /* JADX INFO: renamed from: c.b.a.m.v.b$a */
    public static class a implements InterfaceC0737o<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: c.b.a.m.v.b$a$a, reason: collision with other inner class name */
        public class C1397a implements b<ByteBuffer> {
            public C1397a(a aVar) {
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0724b.b
            /* JADX INFO: renamed from: a */
            public Class<ByteBuffer> mo2430a() {
                return ByteBuffer.class;
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0724b.b
            /* JADX INFO: renamed from: b */
            public ByteBuffer mo2431b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<byte[], ByteBuffer> mo2429b(C0740r c0740r) {
            return new C0724b(new C1397a(this));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.b$b */
    public interface b<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo2430a();

        /* JADX INFO: renamed from: b */
        Data mo2431b(byte[] bArr);
    }

    /* JADX INFO: renamed from: c.b.a.m.v.b$c */
    public static class c<Data> implements InterfaceC0655d<Data> {

        /* JADX INFO: renamed from: b */
        public final byte[] f4290b;

        /* JADX INFO: renamed from: c */
        public final b<Data> f4291c;

        public c(byte[] bArr, b<Data> bVar) {
            this.f4290b = bArr;
            this.f4291c = bVar;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<Data> mo2291a() {
            return this.f4291c.mo2430a();
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
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super Data> aVar) {
            aVar.mo2300f(this.f4291c.mo2431b(this.f4290b));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.b$d */
    public static class d implements InterfaceC0737o<byte[], InputStream> {

        /* JADX INFO: renamed from: c.b.a.m.v.b$d$a */
        public class a implements b<InputStream> {
            public a(d dVar) {
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0724b.b
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo2430a() {
                return InputStream.class;
            }

            @Override // p080c.p084b.p085a.p088m.p095v.C0724b.b
            /* JADX INFO: renamed from: b */
            public InputStream mo2431b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<byte[], InputStream> mo2429b(C0740r c0740r) {
            return new C0724b(new a(this));
        }
    }

    public C0724b(b<Data> bVar) {
        this.f4289a = bVar;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(byte[] bArr, int i, int i2, C0647o c0647o) {
        byte[] bArr2 = bArr;
        return new InterfaceC0736n.a(new C0865d(bArr2), new c(bArr2, this.f4289a));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2427b(byte[] bArr) {
        return true;
    }
}
