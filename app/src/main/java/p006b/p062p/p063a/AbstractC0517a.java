package p006b.p062p.p063a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p061o.InterfaceC0502g;
import p006b.p061o.InterfaceC0516u;

/* JADX INFO: renamed from: b.p.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517a {
    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC0502g & InterfaceC0516u> AbstractC0517a m1914b(T t) {
        return new C0518b(t, t.mo7g());
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public abstract void mo1915a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
