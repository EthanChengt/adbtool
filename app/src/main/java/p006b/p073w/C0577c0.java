package p006b.p073w;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: renamed from: b.w.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C0577c0 implements InterfaceC0579d0 {

    /* JADX INFO: renamed from: a */
    public final WindowId f3558a;

    public C0577c0(View view) {
        this.f3558a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0577c0) && ((C0577c0) obj).f3558a.equals(this.f3558a);
    }

    public int hashCode() {
        return this.f3558a.hashCode();
    }
}
