package p080c.p084b.p085a.p088m.p097w.p098c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.w.c.w */
/* JADX INFO: loaded from: classes.dex */
public class C0779w extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public volatile byte[] f4481b;

    /* JADX INFO: renamed from: c */
    public int f4482c;

    /* JADX INFO: renamed from: d */
    public int f4483d;

    /* JADX INFO: renamed from: e */
    public int f4484e;

    /* JADX INFO: renamed from: f */
    public int f4485f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0676b f4486g;

    /* JADX INFO: renamed from: c.b.a.m.w.c.w$a */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public C0779w(InputStream inputStream, InterfaceC0676b interfaceC0676b) {
        super(inputStream);
        this.f4484e = -1;
        this.f4486g = interfaceC0676b;
        this.f4481b = (byte[]) interfaceC0676b.mo2324e(65536, byte[].class);
    }

    /* JADX INFO: renamed from: c */
    public static IOException m2490c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX INFO: renamed from: a */
    public final int m2491a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f4484e;
        if (i != -1) {
            int i2 = this.f4485f - i;
            int i3 = this.f4483d;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f4482c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f4486g.mo2324e(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f4481b = bArr2;
                    this.f4486g.mo2323d(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f4485f - this.f4484e;
                this.f4485f = i4;
                this.f4484e = 0;
                this.f4482c = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f4485f;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f4482c = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f4484e = -1;
            this.f4485f = 0;
            this.f4482c = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f4481b == null || inputStream == null) {
            m2490c();
            throw null;
        }
        return (this.f4482c - this.f4485f) + inputStream.available();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m2492b() {
        if (this.f4481b != null) {
            this.f4486g.mo2323d(this.f4481b);
            this.f4481b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f4481b != null) {
            this.f4486g.mo2323d(this.f4481b);
            this.f4481b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f4483d = Math.max(this.f4483d, i);
        this.f4484e = this.f4485f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f4481b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m2490c();
            throw null;
        }
        if (this.f4485f >= this.f4482c && m2491a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f4481b && (bArr = this.f4481b) == null) {
            m2490c();
            throw null;
        }
        int i = this.f4482c;
        int i2 = this.f4485f;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f4485f = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f4481b;
        if (bArr2 == null) {
            m2490c();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2490c();
            throw null;
        }
        int i5 = this.f4485f;
        int i6 = this.f4482c;
        if (i5 < i6) {
            int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f4485f += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f4484e == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m2491a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f4481b && (bArr2 = this.f4481b) == null) {
                    m2490c();
                    throw null;
                }
                int i8 = this.f4482c;
                int i9 = this.f4485f;
                i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f4485f += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f4481b == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f4484e;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.f4485f + " markLimit: " + this.f4483d);
        }
        this.f4485f = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f4481b;
        if (bArr == null) {
            m2490c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2490c();
            throw null;
        }
        int i = this.f4482c;
        int i2 = this.f4485f;
        if (i - i2 >= j) {
            this.f4485f = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f4485f = i;
        if (this.f4484e == -1 || j > this.f4483d) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f4484e = -1;
            }
            return j2 + jSkip;
        }
        if (m2491a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f4482c;
        int i4 = this.f4485f;
        if (i3 - i4 >= j - j2) {
            this.f4485f = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f4485f = i3;
        return j3;
    }
}
