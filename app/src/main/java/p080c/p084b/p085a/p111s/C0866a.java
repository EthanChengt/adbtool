package p080c.p084b.p085a.p111s;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.b.a.s.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0866a {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference<byte[]> f4717a = new AtomicReference<>();

    /* JADX INFO: renamed from: c.b.a.s.a$a */
    public static class a extends InputStream {

        /* JADX INFO: renamed from: b */
        public final ByteBuffer f4718b;

        /* JADX INFO: renamed from: c */
        public int f4719c = -1;

        public a(ByteBuffer byteBuffer) {
            this.f4718b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4718b.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f4719c = this.f4718b.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f4718b.hasRemaining()) {
                return this.f4718b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!this.f4718b.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f4718b.get(bArr, i, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i = this.f4719c;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f4718b.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f4718b.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.f4718b;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }
    }

    /* JADX INFO: renamed from: c.b.a.s.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f4720a;

        /* JADX INFO: renamed from: b */
        public final int f4721b;

        /* JADX INFO: renamed from: c */
        public final byte[] f4722c;

        public b(byte[] bArr, int i, int i2) {
            this.f4722c = bArr;
            this.f4720a = i;
            this.f4721b = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m2599a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2600b(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }
}
