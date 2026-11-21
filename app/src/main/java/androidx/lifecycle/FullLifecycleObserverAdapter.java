package androidx.lifecycle;

import androidx.recyclerview.widget.RecyclerView;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.InterfaceC0497b;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC0500e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0497b f718a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0500e f719b;

    public FullLifecycleObserverAdapter(InterfaceC0497b interfaceC0497b, InterfaceC0500e interfaceC0500e) {
        this.f718a = interfaceC0497b;
        this.f719b = interfaceC0500e;
    }

    @Override // p006b.p061o.InterfaceC0500e
    /* JADX INFO: renamed from: d */
    public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f718a.m1889c(interfaceC0502g);
                break;
            case 1:
                this.f718a.m1892g(interfaceC0502g);
                break;
            case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                this.f718a.m1887a(interfaceC0502g);
                break;
            case 3:
                this.f718a.m1890e(interfaceC0502g);
                break;
            case 4:
                this.f718a.m1891f(interfaceC0502g);
                break;
            case 5:
                this.f718a.m1888b(interfaceC0502g);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0500e interfaceC0500e = this.f719b;
        if (interfaceC0500e != null) {
            interfaceC0500e.mo8d(interfaceC0502g, aVar);
        }
    }
}
