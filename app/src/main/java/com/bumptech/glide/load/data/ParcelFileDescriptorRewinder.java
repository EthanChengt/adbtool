package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0656e;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC0656e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    public final InternalRewinder f6325a;

    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a */
        public final ParcelFileDescriptor f6326a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6326a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f6326a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f6326a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C1310a implements InterfaceC0656e.a<ParcelFileDescriptor> {
        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: a */
        public Class<ParcelFileDescriptor> mo2303a() {
            return ParcelFileDescriptor.class;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: b */
        public InterfaceC0656e<ParcelFileDescriptor> mo2304b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6325a = new InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3007c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
    /* JADX INFO: renamed from: b */
    public void mo2302b() {
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo2301a() {
        return this.f6325a.rewind();
    }
}
