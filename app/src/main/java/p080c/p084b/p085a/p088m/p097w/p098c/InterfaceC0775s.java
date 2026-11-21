package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import b.s.m;
import p080c.p084b.p085a.p088m.C0640h;
import p080c.p084b.p085a.p088m.C0642j;
import p080c.p084b.p085a.p088m.p089t.C0662k;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.w.c.s */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0775s {

    /* JADX INFO: renamed from: c.b.a.m.w.c.s$a */
    public static final class a implements InterfaceC0775s {

        /* JADX INFO: renamed from: a */
        public final C0662k f4471a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0676b f4472b;

        /* JADX INFO: renamed from: c */
        public final List<ImageHeaderParser> f4473c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC0676b interfaceC0676b) {
            Objects.requireNonNull(interfaceC0676b, "Argument must not be null");
            this.f4472b = interfaceC0676b;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f4473c = list;
            this.f4471a = new C0662k(inputStream, interfaceC0676b);
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: a */
        public Bitmap mo2485a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f4471a.mo2301a(), null, options);
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: b */
        public ImageHeaderParser.ImageType mo2486b() {
            return m.m1978v(this.f4473c, this.f4471a.mo2301a(), this.f4472b);
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: c */
        public void mo2487c() {
            C0779w c0779w = this.f4471a.f3968a;
            synchronized (c0779w) {
                c0779w.f4483d = c0779w.f4481b.length;
            }
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: d */
        public int mo2488d() {
            return m.m1973q(this.f4473c, this.f4471a.mo2301a(), this.f4472b);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.s$b */
    public static final class b implements InterfaceC0775s {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0676b f4474a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f4475b;

        /* JADX INFO: renamed from: c */
        public final ParcelFileDescriptorRewinder f4476c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC0676b interfaceC0676b) {
            Objects.requireNonNull(interfaceC0676b, "Argument must not be null");
            this.f4474a = interfaceC0676b;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f4475b = list;
            this.f4476c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: a */
        public Bitmap mo2485a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f4476c.mo2301a().getFileDescriptor(), null, options);
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: b */
        public ImageHeaderParser.ImageType mo2486b() {
            return m.m1979w(this.f4475b, new C0640h(this.f4476c, this.f4474a));
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: c */
        public void mo2487c() {
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s
        /* JADX INFO: renamed from: d */
        public int mo2488d() {
            return m.m1974r(this.f4475b, new C0642j(this.f4476c, this.f4474a));
        }
    }

    /* JADX INFO: renamed from: a */
    Bitmap mo2485a(BitmapFactory.Options options);

    /* JADX INFO: renamed from: b */
    ImageHeaderParser.ImageType mo2486b();

    /* JADX INFO: renamed from: c */
    void mo2487c();

    /* JADX INFO: renamed from: d */
    int mo2488d();
}
