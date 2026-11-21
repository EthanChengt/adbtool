package p080c.p084b.p085a.p088m.p089t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.m.t.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0658g extends FilterInputStream {

    /* JADX INFO: renamed from: d */
    public static final byte[] f3957d;

    /* JADX INFO: renamed from: e */
    public static final int f3958e;

    /* JADX INFO: renamed from: f */
    public static final int f3959f;

    /* JADX INFO: renamed from: b */
    public final byte f3960b;

    /* JADX INFO: renamed from: c */
    public int f3961c;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f3957d = bArr;
        int length = bArr.length;
        f3958e = length;
        f3959f = length + 2;
    }

    public C0658g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(a.m2198l("Cannot add invalid orientation: ", i));
        }
        this.f3960b = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f3961c;
        if (i3 < 2 || i3 > (i2 = f3959f)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f3960b : f3957d[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f3961c++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f3961c;
        int i5 = f3959f;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f3960b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f3957d, this.f3961c - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f3961c += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f3961c = (int) (((long) this.f3961c) + jSkip);
        }
        return jSkip;
    }
}
