package androidx.lifecycle;

import p006b.p061o.AbstractC0499d;
import p006b.p061o.InterfaceC0498c;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements InterfaceC0500e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0498c f740a;

    public SingleGeneratedAdapterObserver(InterfaceC0498c interfaceC0498c) {
        this.f740a = interfaceC0498c;
    }

    @Override // p006b.p061o.InterfaceC0500e
    /* JADX INFO: renamed from: d */
    public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
        this.f740a.m1893a(interfaceC0502g, aVar, false, null);
        this.f740a.m1893a(interfaceC0502g, aVar, true, null);
    }
}
