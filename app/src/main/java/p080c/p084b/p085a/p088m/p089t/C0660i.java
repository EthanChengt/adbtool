package p080c.p084b.p085a.p088m.p089t;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.m.t.i */
/* JADX INFO: loaded from: classes.dex */
public class C0660i extends AbstractC0663l<ParcelFileDescriptor> {
    public C0660i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo2291a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0663l
    /* JADX INFO: renamed from: d */
    public void mo2292d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0663l
    /* JADX INFO: renamed from: f */
    public ParcelFileDescriptor mo2293f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(a.m2199m("FileDescriptor is null for: ", uri));
    }
}
