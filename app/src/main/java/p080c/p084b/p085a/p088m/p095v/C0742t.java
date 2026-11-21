package p080c.p084b.p085a.p088m.p095v;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0636d;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;

/* JADX INFO: renamed from: c.b.a.m.v.t */
/* JADX INFO: loaded from: classes.dex */
public class C0742t implements InterfaceC0636d<InputStream> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0676b f4358a;

    public C0742t(InterfaceC0676b interfaceC0676b) {
        this.f4358a = interfaceC0676b;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0636d
    /* JADX INFO: renamed from: a */
    public boolean mo2279a(InputStream inputStream, File file, C0647o c0647o) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.f4358a.mo2324e(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i = inputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.f4358a.mo2323d(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f4358a.mo2323d(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e2) {
                e = e2;
            }
            this.f4358a.mo2323d(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
