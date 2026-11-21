package p080c.p084b.p085a.p111s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.s.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0868c extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public final long f4724b;

    /* JADX INFO: renamed from: c */
    public int f4725c;

    public C0868c(InputStream inputStream, long j) {
        super(inputStream);
        this.f4724b = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m2601a(int i) throws IOException {
        if (i >= 0) {
            this.f4725c += i;
        } else if (this.f4724b - ((long) this.f4725c) > 0) {
            StringBuilder sbM2191e = a.m2191e("Failed to read all expected data, expected: ");
            sbM2191e.append(this.f4724b);
            sbM2191e.append(", but read: ");
            sbM2191e.append(this.f4725c);
            throw new IOException(sbM2191e.toString());
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f4724b - ((long) this.f4725c), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i;
        i = super.read();
        m2601a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        m2601a(i3);
        return i3;
    }
}
