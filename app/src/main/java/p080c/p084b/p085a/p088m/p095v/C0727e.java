package p080c.p084b.p085a.p088m.p095v;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0727e<Model, Data> implements InterfaceC0736n<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final a<Data> f4293a;

    /* JADX INFO: renamed from: c.b.a.m.v.e$a */
    public interface a<Data> {
        Data m2432a(String str);
    }

    /* JADX INFO: renamed from: c.b.a.m.v.e$b */
    public static final class b<Data> implements InterfaceC0655d<Data> {

        /* JADX INFO: renamed from: b */
        public final String f4294b;

        /* JADX INFO: renamed from: c */
        public final a<Data> f4295c;

        /* JADX INFO: renamed from: d */
        public Data f4296d;

        public b(String str, a<Data> aVar) {
            this.f4294b = str;
            this.f4295c = aVar;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<Data> mo2291a() {
            Objects.requireNonNull(this.f4295c);
            return (Class<Data>) (Class<?>) InputStream.class;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: b */
        public void mo2294b() {
            try {
                a<Data> aVar = this.f4295c;
                Data data = this.f4296d;
                Objects.requireNonNull(aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
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

        /* JADX WARN: Type inference failed for: r2v4, types: [Data, java.lang.Object] */
        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: e */
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super Data> aVar) {
            try {
                Data r2 = this.f4295c.m2432a(this.f4294b);
                this.f4296d = r2;
                aVar.mo2300f(r2);
            } catch (IllegalArgumentException e) {
                aVar.mo2299d(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.e$c */
    public static final class c<Model> implements InterfaceC0737o<Model, InputStream> {

        /* JADX INFO: renamed from: a */
        public final C0727e.a<InputStream> f4297a = new a(this);

        /* JADX INFO: renamed from: c.b.a.m.v.e$c$a */
        public class a implements C0727e.a<InputStream> {
            public a(c cVar) {
            }

            /* JADX INFO: renamed from: a */
            @Override
            public InputStream m2432a(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Model, InputStream> mo2429b(C0740r c0740r) {
            return new C0727e(this.f4297a);
        }
    }

    public C0727e(a<Data> aVar) {
        this.f4293a = aVar;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<Data> mo2426a(Model model, int i, int i2, C0647o c0647o) {
        return new InterfaceC0736n.a<>(new C0865d(model), new b(model.toString(), this.f4293a));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
