package p080c.p084b.p085a.p088m.p097w.p098c;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.w.c.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0767k implements ImageHeaderParser {

    /* JADX INFO: renamed from: a */
    public static final byte[] f4428a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final int[] f4429b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: c.b.a.m.w.c.k$a */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f4430a;

        public a(ByteBuffer byteBuffer) {
            this.f4430a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: a */
        public int mo2461a() {
            return (mo2464d() << 8) | mo2464d();
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: b */
        public long mo2462b(long j) {
            int iMin = (int) Math.min(this.f4430a.remaining(), j);
            ByteBuffer byteBuffer = this.f4430a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: c */
        public int mo2463c(byte[] bArr, int i) {
            int iMin = Math.min(i, this.f4430a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f4430a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: d */
        public short mo2464d() throws c.a {
            if (this.f4430a.remaining() >= 1) {
                return (short) (this.f4430a.get() & 255);
            }
            throw new c.a();
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f4431a;

        public b(byte[] bArr, int i) {
            this.f4431a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* JADX INFO: renamed from: a */
        public short m2465a(int i) {
            if (this.f4431a.remaining() - i >= 2) {
                return this.f4431a.getShort(i);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: b */
        public int m2466b(int i) {
            if (this.f4431a.remaining() - i >= 4) {
                return this.f4431a.getInt(i);
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.k$c */
    public interface c {

        /* JADX INFO: renamed from: c.b.a.m.w.c.k$c$a */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: a */
        int mo2461a();

        /* JADX INFO: renamed from: b */
        long mo2462b(long j);

        /* JADX INFO: renamed from: c */
        int mo2463c(byte[] bArr, int i);

        /* JADX INFO: renamed from: d */
        short mo2464d();
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.k$d */
    public static final class d implements c {

        /* JADX INFO: renamed from: a */
        public final InputStream f4432a;

        public d(InputStream inputStream) {
            this.f4432a = inputStream;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: a */
        public int mo2461a() {
            return (mo2464d() << 8) | mo2464d();
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: b */
        public long mo2462b(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f4432a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f4432a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: c */
        public int mo2463c(byte[] bArr, int i) throws c.a {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f4432a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new c.a();
            }
            return i2;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0767k.c
        /* JADX INFO: renamed from: d */
        public short mo2464d() throws IOException {
            int i = this.f4432a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new c.a();
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo2455a(ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return m2458d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) {
        String str;
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(interfaceC0676b, "Argument must not be null");
        try {
            int iMo2461a = dVar.mo2461a();
            if ((iMo2461a & 65496) == 65496 || iMo2461a == 19789 || iMo2461a == 18761) {
                int iM2459e = m2459e(dVar);
                if (iM2459e != -1) {
                    byte[] bArr = (byte[]) interfaceC0676b.mo2324e(iM2459e, byte[].class);
                    try {
                        return m2460f(dVar, bArr, iM2459e);
                    } finally {
                        interfaceC0676b.mo2323d(bArr);
                    }
                }
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                str = "Failed to parse exif segment length, or exif segment not found";
            } else {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                str = "Parser doesn't handle magic number: " + iMo2461a;
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (c.a unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public ImageHeaderParser.ImageType mo2457c(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return m2458d(new d(inputStream));
    }

    /* JADX INFO: renamed from: d */
    public final ImageHeaderParser.ImageType m2458d(c cVar) {
        try {
            int iMo2461a = cVar.mo2461a();
            if (iMo2461a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo2464d = (iMo2461a << 8) | cVar.mo2464d();
            if (iMo2464d == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo2464d2 = (iMo2464d << 8) | cVar.mo2464d();
            if (iMo2464d2 == -1991225785) {
                cVar.mo2462b(21L);
                try {
                    return cVar.mo2464d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo2464d2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.mo2462b(4L);
            if (((cVar.mo2461a() << 16) | cVar.mo2461a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo2461a2 = (cVar.mo2461a() << 16) | cVar.mo2461a();
            if ((iMo2461a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = iMo2461a2 & 255;
            if (i == 88) {
                cVar.mo2462b(4L);
                return (cVar.mo2464d() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.mo2462b(4L);
            return (cVar.mo2464d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2459e(c cVar) {
        short sMo2464d;
        int iMo2461a;
        long j;
        long jMo2462b;
        do {
            short sMo2464d2 = cVar.mo2464d();
            if (sMo2464d2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo2464d2));
                }
                return -1;
            }
            sMo2464d = cVar.mo2464d();
            if (sMo2464d == 218) {
                return -1;
            }
            if (sMo2464d == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iMo2461a = cVar.mo2461a() - 2;
            if (sMo2464d == 225) {
                return iMo2461a;
            }
            j = iMo2461a;
            jMo2462b = cVar.mo2462b(j);
        } while (jMo2462b == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo2464d) + ", wanted to skip: " + iMo2461a + ", but actually skipped: " + jMo2462b);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m2460f(c cVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        StringBuilder sb;
        String str;
        String string;
        int iMo2463c = cVar.mo2463c(bArr, i);
        if (iMo2463c != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo2463c);
            }
            return -1;
        }
        boolean z = bArr != null && i > f4428a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f4428a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        b bVar = new b(bArr, i);
        short sM2465a = bVar.m2465a(6);
        if (sM2465a != 18761) {
            if (sM2465a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sM2465a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.f4431a.order(byteOrder);
        int iM2466b = bVar.m2466b(10) + 6;
        short sM2465a2 = bVar.m2465a(iM2466b);
        for (int i3 = 0; i3 < sM2465a2; i3++) {
            int i4 = (i3 * 12) + iM2466b + 2;
            short sM2465a3 = bVar.m2465a(i4);
            if (sM2465a3 == 274) {
                short sM2465a4 = bVar.m2465a(i4 + 2);
                if (sM2465a4 >= 1 && sM2465a4 <= 12) {
                    int iM2466b2 = bVar.m2466b(i4 + 4);
                    if (iM2466b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i3 + " tagType=" + ((int) sM2465a3) + " formatCode=" + ((int) sM2465a4) + " componentCount=" + iM2466b2);
                        }
                        int i5 = iM2466b2 + f4429b[sM2465a4];
                        if (i5 <= 4) {
                            int i6 = i4 + 8;
                            if (i6 >= 0 && i6 <= bVar.f4431a.remaining()) {
                                if (i5 >= 0 && i5 + i6 <= bVar.f4431a.remaining()) {
                                    return bVar.m2465a(i6);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    string = a.m2198l("Illegal number of bytes for TI tag data tagType=", sM2465a3);
                                    Log.d("DfltImageHeaderParser", string);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                string = "Illegal tagValueOffset=" + i6 + " tagType=" + ((int) sM2465a3);
                                Log.d("DfltImageHeaderParser", string);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb.append(str);
                            sb.append((int) sM2465a4);
                            string = sb.toString();
                            Log.d("DfltImageHeaderParser", string);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        string = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", string);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb.append(str);
                    sb.append((int) sM2465a4);
                    string = sb.toString();
                    Log.d("DfltImageHeaderParser", string);
                }
            }
        }
        return -1;
    }
}
