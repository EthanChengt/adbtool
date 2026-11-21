package p006b.p032h.p043i;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: b.h.i.a */
/* JADX INFO: loaded from: classes.dex */
public class C0401a extends Writer {

    /* JADX INFO: renamed from: b */
    public final String f2694b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f2695c = new StringBuilder(128);

    public C0401a(String str) {
        this.f2694b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m1535a() {
        if (this.f2695c.length() > 0) {
            Log.d(this.f2694b, this.f2695c.toString());
            StringBuilder sb = this.f2695c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1535a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m1535a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m1535a();
            } else {
                this.f2695c.append(c2);
            }
        }
    }
}
