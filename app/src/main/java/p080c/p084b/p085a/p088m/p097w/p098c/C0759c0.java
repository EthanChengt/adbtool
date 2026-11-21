package p080c.p084b.p085a.p088m.p097w.p098c;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.b.a.m.w.c.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C0759c0 extends MediaDataSource {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteBuffer f4420b;

    public C0759c0(C0757b0.d dVar, ByteBuffer byteBuffer) {
        this.f4420b = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.f4420b.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.f4420b.limit()) {
            return -1;
        }
        this.f4420b.position((int) j);
        int iMin = Math.min(i2, this.f4420b.remaining());
        this.f4420b.get(bArr, i, iMin);
        return iMin;
    }
}
