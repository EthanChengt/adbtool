package p080c.p084b.p085a.p088m.p097w.p102g;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import b.s.m;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.w.g.j */
/* JADX INFO: loaded from: classes.dex */
public class C0801j implements InterfaceC0649q<InputStream, C0794c> {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f4550a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0649q<ByteBuffer, C0794c> f4551b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0676b f4552c;

    public C0801j(List<ImageHeaderParser> list, InterfaceC0649q<ByteBuffer, C0794c> interfaceC0649q, InterfaceC0676b interfaceC0676b) {
        this.f4550a = list;
        this.f4551b = interfaceC0649q;
        this.f4552c = interfaceC0676b;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<C0794c> mo2287a(InputStream inputStream, int i, int i2, C0647o c0647o) {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream2.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f4551b.mo2287a(ByteBuffer.wrap(byteArray), i, i2, c0647o);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(InputStream inputStream, C0647o c0647o) {
        return !((Boolean) c0647o.m2285c(C0800i.f4549b)).booleanValue() && m.m1978v(this.f4550a, inputStream, this.f4552c) == ImageHeaderParser.ImageType.GIF;
    }
}
