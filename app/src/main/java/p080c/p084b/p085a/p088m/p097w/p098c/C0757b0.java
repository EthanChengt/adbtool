package p080c.p084b.p085a.p088m.p097w.p098c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;
import p080c.p084b.p085a.p088m.C0646n;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.c.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C0757b0<T> implements InterfaceC0649q<T, Bitmap> {

    /* JADX INFO: renamed from: d */
    public static final C0646n<Long> f4409d = new C0646n<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e */
    public static final C0646n<Integer> f4410e = new C0646n<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f */
    public static final e f4411f = new e();

    /* JADX INFO: renamed from: a */
    public final f<T> f4412a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0678d f4413b;

    /* JADX INFO: renamed from: c */
    public final e f4414c;

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$a */
    public static class a implements C0646n.b<Long> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f4415a = ByteBuffer.allocate(8);

        @Override // p080c.p084b.p085a.p088m.C0646n.b
        /* JADX INFO: renamed from: a */
        public void mo2284a(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.f4415a) {
                this.f4415a.position(0);
                messageDigest.update(this.f4415a.putLong(l2.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$b */
    public static class b implements C0646n.b<Integer> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f4416a = ByteBuffer.allocate(4);

        @Override // p080c.p084b.p085a.p088m.C0646n.b
        /* JADX INFO: renamed from: a */
        public void mo2284a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f4416a) {
                this.f4416a.position(0);
                messageDigest.update(this.f4416a.putInt(num2.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$c */
    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0757b0.f
        /* JADX INFO: renamed from: a */
        public void mo2452a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$d */
    public static final class d implements f<ByteBuffer> {
        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0757b0.f
        /* JADX INFO: renamed from: a */
        public void mo2452a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C0759c0(this, byteBuffer));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$e */
    public static class e {
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$f */
    public interface f<T> {
        /* JADX INFO: renamed from: a */
        void mo2452a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$g */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0757b0.f
        /* JADX INFO: renamed from: a */
        public void mo2452a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.b0$h */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public C0757b0(InterfaceC0678d interfaceC0678d, f<T> fVar) {
        e eVar = f4411f;
        this.f4413b = interfaceC0678d;
        this.f4412a = fVar;
        this.f4414c = eVar;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m2451c(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC0768l abstractC0768l) {
        Bitmap frameAtTime;
        if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || abstractC0768l == AbstractC0768l.f4436d) {
            frameAtTime = null;
        } else {
            try {
                int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i6 == 90 || i6 == 270) {
                    i5 = i4;
                    i4 = i5;
                }
                float fMo2468b = abstractC0768l.mo2468b(i4, i5, i2, i3);
                frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fMo2468b), Math.round(fMo2468b * i5));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                }
                frameAtTime = null;
            }
        }
        if (frameAtTime == null) {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new h();
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(T t, int i, int i2, C0647o c0647o) throws IOException {
        long jLongValue = ((Long) c0647o.m2285c(f4409d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c0647o.m2285c(f4410e);
        if (num == null) {
            num = 2;
        }
        AbstractC0768l abstractC0768l = (AbstractC0768l) c0647o.m2285c(AbstractC0768l.f4438f);
        if (abstractC0768l == null) {
            abstractC0768l = AbstractC0768l.f4437e;
        }
        AbstractC0768l abstractC0768l2 = abstractC0768l;
        Objects.requireNonNull(this.f4414c);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f4412a.mo2452a(mediaMetadataRetriever, t);
            return C0761e.m2453f(m2451c(mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, abstractC0768l2), this.f4413b);
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(T t, C0647o c0647o) {
        return true;
    }
}
