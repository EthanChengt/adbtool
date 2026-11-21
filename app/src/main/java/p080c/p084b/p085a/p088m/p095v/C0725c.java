package p080c.p084b.p085a.p088m.p095v;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0636d;
import p080c.p084b.p085a.p111s.C0866a;

/* JADX INFO: renamed from: c.b.a.m.v.c */
/* JADX INFO: loaded from: classes.dex */
public class C0725c implements InterfaceC0636d<ByteBuffer> {
    @Override // p080c.p084b.p085a.p088m.InterfaceC0636d
    /* JADX INFO: renamed from: a */
    public boolean mo2279a(ByteBuffer byteBuffer, File file, C0647o c0647o) throws Throwable {
        try {
            C0866a.m2600b(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
