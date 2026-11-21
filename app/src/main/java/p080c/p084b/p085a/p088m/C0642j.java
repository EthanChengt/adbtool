package p080c.p084b.p085a.p088m;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p097w.p098c.C0779w;

/* JADX INFO: renamed from: c.b.a.m.j */
/* JADX INFO: loaded from: classes.dex */
public class C0642j implements InterfaceC0643k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParcelFileDescriptorRewinder f3935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0676b f3936b;

    public C0642j(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0676b interfaceC0676b) {
        this.f3935a = parcelFileDescriptorRewinder;
        this.f3936b = interfaceC0676b;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0643k
    /* JADX INFO: renamed from: a */
    public int mo2281a(ImageHeaderParser imageHeaderParser) throws Throwable {
        C0779w c0779w = null;
        try {
            C0779w c0779w2 = new C0779w(new FileInputStream(this.f3935a.mo2301a().getFileDescriptor()), this.f3936b);
            try {
                int iMo2456b = imageHeaderParser.mo2456b(c0779w2, this.f3936b);
                try {
                    c0779w2.close();
                } catch (IOException unused) {
                }
                this.f3935a.mo2301a();
                return iMo2456b;
            } catch (Throwable th) {
                th = th;
                c0779w = c0779w2;
                if (c0779w != null) {
                    try {
                        c0779w.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f3935a.mo2301a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
