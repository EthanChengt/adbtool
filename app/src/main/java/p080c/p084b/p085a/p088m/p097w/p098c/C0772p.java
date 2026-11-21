package p080c.p084b.p085a.p088m.p097w.p098c;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p006b.p054l.p055a.C0449a;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.w.c.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0772p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo2455a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) throws Throwable {
        C0449a c0449a = new C0449a(inputStream);
        C0449a.c cVarM1680e = c0449a.m1680e("Orientation");
        int iM1708f = 1;
        if (cVarM1680e != null) {
            try {
                iM1708f = cVarM1680e.m1708f(c0449a.f2900g);
            } catch (NumberFormatException unused) {
            }
        }
        if (iM1708f == 0) {
            return -1;
        }
        return iM1708f;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public ImageHeaderParser.ImageType mo2457c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
