package p080c.p084b.p085a.p088m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.b.a.m.f */
/* JADX INFO: loaded from: classes.dex */
public class C0638f implements InterfaceC0644l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InputStream f3929a;

    public C0638f(InputStream inputStream) {
        this.f3929a = inputStream;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0644l
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.mo2457c(this.f3929a);
        } finally {
            this.f3929a.reset();
        }
    }
}
