package p080c.p084b.p085a.p111s;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.b.a.s.h */
/* JADX INFO: loaded from: classes.dex */
public class C0873h extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public int f4738b;

    public C0873h(InputStream inputStream) {
        super(inputStream);
        this.f4738b = RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX INFO: renamed from: a */
    public final long m2607a(long j) {
        int i = this.f4738b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.f4738b;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* JADX INFO: renamed from: b */
    public final void m2608b(long j) {
        int i = this.f4738b;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f4738b = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f4738b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m2607a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m2608b(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iM2607a = (int) m2607a(i2);
        if (iM2607a == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM2607a);
        m2608b(i3);
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f4738b = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jM2607a = m2607a(j);
        if (jM2607a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM2607a);
        m2608b(jSkip);
        return jSkip;
    }
}
