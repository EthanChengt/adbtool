package p080c.p084b.p085a.p086k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: c.b.a.k.b */
/* JADX INFO: loaded from: classes.dex */
public class C0626b implements Closeable {

    /* JADX INFO: renamed from: b */
    public final InputStream f3862b;

    /* JADX INFO: renamed from: c */
    public final Charset f3863c;

    /* JADX INFO: renamed from: d */
    public byte[] f3864d;

    /* JADX INFO: renamed from: e */
    public int f3865e;

    /* JADX INFO: renamed from: f */
    public int f3866f;

    /* JADX INFO: renamed from: c.b.a.k.b$a */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C0626b.this.f3863c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C0626b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(C0627c.f3868a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f3862b = inputStream;
        this.f3863c = charset;
        this.f3864d = new byte[8192];
    }

    /* JADX INFO: renamed from: a */
    public final void m2259a() throws IOException {
        InputStream inputStream = this.f3862b;
        byte[] bArr = this.f3864d;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f3865e = 0;
        this.f3866f = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX INFO: renamed from: b */
    public String m2260b() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f3862b) {
            if (this.f3864d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f3865e >= this.f3866f) {
                m2259a();
            }
            for (int i3 = this.f3865e; i3 != this.f3866f; i3++) {
                byte[] bArr2 = this.f3864d;
                if (bArr2[i3] == 10) {
                    if (i3 != this.f3865e) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    byte[] bArr3 = this.f3864d;
                    int i4 = this.f3865e;
                    String str = new String(bArr3, i4, i2 - i4, this.f3863c.name());
                    this.f3865e = i3 + 1;
                    return str;
                }
            }
            a aVar = new a((this.f3866f - this.f3865e) + 80);
            loop1: while (true) {
                byte[] bArr4 = this.f3864d;
                int i5 = this.f3865e;
                aVar.write(bArr4, i5, this.f3866f - i5);
                this.f3866f = -1;
                m2259a();
                i = this.f3865e;
                while (i != this.f3866f) {
                    bArr = this.f3864d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f3865e;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.f3865e = i + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f3862b) {
            if (this.f3864d != null) {
                this.f3864d = null;
                this.f3862b.close();
            }
        }
    }
}
