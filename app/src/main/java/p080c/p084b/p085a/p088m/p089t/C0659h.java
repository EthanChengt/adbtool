package p080c.p084b.p085a.p088m.p089t;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: renamed from: c.b.a.m.t.h */
/* JADX INFO: loaded from: classes.dex */
public class C0659h extends AbstractC0653b<ParcelFileDescriptor> {
    public C0659h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo2291a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0653b
    /* JADX INFO: renamed from: d */
    public void mo2296d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0653b
    /* JADX INFO: renamed from: f */
    public ParcelFileDescriptor mo2298f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
