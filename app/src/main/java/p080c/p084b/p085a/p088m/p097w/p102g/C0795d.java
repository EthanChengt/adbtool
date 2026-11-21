package p080c.p084b.p085a.p088m.p097w.p102g;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0635c;
import p080c.p084b.p085a.p088m.InterfaceC0650r;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p111s.C0866a;

/* JADX INFO: renamed from: c.b.a.m.w.g.d */
/* JADX INFO: loaded from: classes.dex */
public class C0795d implements InterfaceC0650r<C0794c> {
    @Override // p080c.p084b.p085a.p088m.InterfaceC0636d
    /* JADX INFO: renamed from: a */
    public boolean mo2279a(Object obj, File file, C0647o c0647o) throws Throwable {
        try {
            C0866a.m2600b(((C0794c) ((InterfaceC0719w) obj).mo2409b()).f4513b.f4523a.f4525a.mo2268g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0650r
    /* JADX INFO: renamed from: b */
    public EnumC0635c mo2289b(C0647o c0647o) {
        return EnumC0635c.SOURCE;
    }
}
