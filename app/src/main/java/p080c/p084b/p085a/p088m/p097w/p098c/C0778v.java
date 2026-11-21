package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.util.Objects;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;

/* JADX INFO: renamed from: c.b.a.m.w.c.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0778v implements InterfaceC0649q<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C0769m f4480a;

    public C0778v(C0769m c0769m) {
        this.f4480a = c0769m;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C0647o c0647o) {
        C0769m c0769m = this.f4480a;
        return c0769m.m2477a(new InterfaceC0775s.b(parcelFileDescriptor, c0769m.f4454d, c0769m.f4453c), i, i2, c0647o, C0769m.f4448k);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(ParcelFileDescriptor parcelFileDescriptor, C0647o c0647o) {
        Objects.requireNonNull(this.f4480a);
        return ParcelFileDescriptorRewinder.m3007c();
    }
}
