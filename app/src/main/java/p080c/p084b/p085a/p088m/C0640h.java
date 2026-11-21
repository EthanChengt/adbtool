package p080c.p084b.p085a.p088m;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p097w.p098c.C0779w;

/* JADX INFO: renamed from: c.b.a.m.h */
/* JADX INFO: loaded from: classes.dex */
public class C0640h implements InterfaceC0644l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParcelFileDescriptorRewinder f3931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0676b f3932b;

    public C0640h(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0676b interfaceC0676b) {
        this.f3931a = parcelFileDescriptorRewinder;
        this.f3932b = interfaceC0676b;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0644l
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser) throws Throwable {
        C0779w c0779w = null;
        try {
            C0779w c0779w2 = new C0779w(new FileInputStream(this.f3931a.mo2301a().getFileDescriptor()), this.f3932b);
            try {
                ImageHeaderParser.ImageType imageTypeMo2457c = imageHeaderParser.mo2457c(c0779w2);
                try {
                    c0779w2.close();
                } catch (IOException unused) {
                }
                this.f3931a.mo2301a();
                return imageTypeMo2457c;
            } catch (Throwable th) {
                th = th;
                c0779w = c0779w2;
                if (c0779w != null) {
                    try {
                        c0779w.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f3931a.mo2301a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
