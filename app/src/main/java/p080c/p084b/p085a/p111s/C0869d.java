package p080c.p084b.p085a.p111s;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: c.b.a.s.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0869d extends InputStream {

    /* JADX INFO: renamed from: d */
    public static final Queue<C0869d> f4726d;

    /* JADX INFO: renamed from: b */
    public InputStream f4727b;

    /* JADX INFO: renamed from: c */
    public IOException f4728c;

    static {
        char[] cArr = C0875j.f4742a;
        f4726d = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: a */
    public void m2602a() {
        this.f4728c = null;
        this.f4727b = null;
        Queue<C0869d> queue = f4726d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f4727b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4727b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f4727b.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f4727b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f4727b.read();
        } catch (IOException e) {
            this.f4728c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f4727b.read(bArr);
        } catch (IOException e) {
            this.f4728c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f4727b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f4728c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f4727b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f4727b.skip(j);
        } catch (IOException e) {
            this.f4728c = e;
            throw e;
        }
    }
}
