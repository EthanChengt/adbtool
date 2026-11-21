package p080c.p084b.p085a.p088m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.b.a.m.g */
/* JADX INFO: loaded from: classes.dex */
public class C0639g implements InterfaceC0644l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteBuffer f3930a;

    public C0639g(ByteBuffer byteBuffer) {
        this.f3930a = byteBuffer;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0644l
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo2280a(ImageHeaderParser imageHeaderParser) {
        return imageHeaderParser.mo2455a(this.f3930a);
    }
}
