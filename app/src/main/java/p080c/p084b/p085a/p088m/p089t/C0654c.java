package p080c.p084b.p085a.p088m.p089t;

import java.io.IOException;
import java.io.OutputStream;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.t.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0654c extends OutputStream {

    /* JADX INFO: renamed from: b */
    public final OutputStream f3950b;

    /* JADX INFO: renamed from: c */
    public byte[] f3951c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0676b f3952d;

    /* JADX INFO: renamed from: e */
    public int f3953e;

    public C0654c(OutputStream outputStream, InterfaceC0676b interfaceC0676b) {
        this.f3950b = outputStream;
        this.f3952d = interfaceC0676b;
        this.f3951c = (byte[]) interfaceC0676b.mo2324e(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f3950b.close();
            byte[] bArr = this.f3951c;
            if (bArr != null) {
                this.f3952d.mo2323d(bArr);
                this.f3951c = null;
            }
        } catch (Throwable th) {
            this.f3950b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i = this.f3953e;
        if (i > 0) {
            this.f3950b.write(this.f3951c, 0, i);
            this.f3953e = 0;
        }
        this.f3950b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f3951c;
        int i2 = this.f3953e;
        int i3 = i2 + 1;
        this.f3953e = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f3950b.write(bArr, 0, i3);
        this.f3953e = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f3953e;
            if (i6 == 0 && i4 >= this.f3951c.length) {
                this.f3950b.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f3951c.length - i6);
            System.arraycopy(bArr, i5, this.f3951c, this.f3953e, iMin);
            int i7 = this.f3953e + iMin;
            this.f3953e = i7;
            i3 += iMin;
            byte[] bArr2 = this.f3951c;
            if (i7 == bArr2.length && i7 > 0) {
                this.f3950b.write(bArr2, 0, i7);
                this.f3953e = 0;
            }
        } while (i3 < i2);
    }
}
