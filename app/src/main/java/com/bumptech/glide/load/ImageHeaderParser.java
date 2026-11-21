package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* JADX INFO: renamed from: b */
        public final boolean f6324b;

        ImageType(boolean z) {
            this.f6324b = z;
        }

        public boolean hasAlpha() {
            return this.f6324b;
        }
    }

    /* JADX INFO: renamed from: a */
    ImageType mo2455a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: b */
    int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b);

    /* JADX INFO: renamed from: c */
    ImageType mo2457c(InputStream inputStream);
}
