package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p080c.p084b.p085a.p088m.C0646n;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0635c;
import p080c.p084b.p085a.p088m.InterfaceC0650r;
import p080c.p084b.p085a.p088m.p089t.C0654c;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p111s.C0871f;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.w.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C0758c implements InterfaceC0650r<Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final C0646n<Integer> f4417b = C0646n.m2283a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c */
    public static final C0646n<Bitmap.CompressFormat> f4418c = new C0646n<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C0646n.f3938e);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0676b f4419a;

    public C0758c(InterfaceC0676b interfaceC0676b) {
        this.f4419a = interfaceC0676b;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {, blocks: (B:10:0x0026, B:32:0x006b, B:34:0x006f, B:36:0x0075, B:40:0x00bf, B:41:0x00c2), top: B:46:0x0026 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0075, please report this as an issue */
    @Override // p080c.p084b.p085a.p088m.InterfaceC0636d
    /* JADX INFO: renamed from: a */
    public boolean mo2279a(Object obj, File file, C0647o c0647o) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) ((InterfaceC0719w) obj).mo2409b();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c0647o.m2285c(f4418c);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = C0871f.f4732b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c0647o.m2285c(f4417b)).intValue();
        boolean z = false;
        OutputStream c0654c = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        c0654c = this.f4419a != null ? new C0654c(fileOutputStream, this.f4419a) : fileOutputStream;
                        bitmap.compress(compressFormat, iIntValue, c0654c);
                        c0654c.close();
                        z = true;
                    } catch (IOException e) {
                        e = e;
                        c0654c = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c0654c != null) {
                        }
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + C0875j.m2612d(bitmap) + " in " + C0871f.m2603a(jElapsedRealtimeNanos) + ", options format: " + c0647o.m2285c(f4418c) + ", hasAlpha: " + bitmap.hasAlpha());
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException e2) {
                e = e2;
            }
            c0654c.close();
        } catch (IOException unused2) {
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + C0875j.m2612d(bitmap) + " in " + C0871f.m2603a(jElapsedRealtimeNanos) + ", options format: " + c0647o.m2285c(f4418c) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0650r
    /* JADX INFO: renamed from: b */
    public EnumC0635c mo2289b(C0647o c0647o) {
        return EnumC0635c.TRANSFORMED;
    }
}
