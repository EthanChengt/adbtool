package p080c.p084b.p085a.p088m.p089t;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.b.a.m.t.m */
/* JADX INFO: loaded from: classes.dex */
public class C0664m extends AbstractC0653b<InputStream> {
    public C0664m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo2291a() {
        return InputStream.class;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0653b
    /* JADX INFO: renamed from: d */
    public void mo2296d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0653b
    /* JADX INFO: renamed from: f */
    public InputStream mo2298f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
