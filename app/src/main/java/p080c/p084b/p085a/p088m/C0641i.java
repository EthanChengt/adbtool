package p080c.p084b.p085a.p088m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.i */
/* JADX INFO: loaded from: classes.dex */
public class C0641i implements InterfaceC0643k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InputStream f3933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0676b f3934b;

    public C0641i(InputStream inputStream, InterfaceC0676b interfaceC0676b) {
        this.f3933a = inputStream;
        this.f3934b = interfaceC0676b;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0643k
    /* JADX INFO: renamed from: a */
    public int mo2281a(ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.mo2456b(this.f3933a, this.f3934b);
        } finally {
            this.f3933a.reset();
        }
    }
}
