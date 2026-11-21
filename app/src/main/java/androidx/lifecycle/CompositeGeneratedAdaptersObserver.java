package androidx.lifecycle;

import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0506k;
import p006b.p061o.InterfaceC0498c;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC0500e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0498c[] f717a;

    public CompositeGeneratedAdaptersObserver(InterfaceC0498c[] interfaceC0498cArr) {
        this.f717a = interfaceC0498cArr;
    }

    @Override // p006b.p061o.InterfaceC0500e
    /* JADX INFO: renamed from: d */
    public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
        C0506k c0506k = new C0506k();
        for (InterfaceC0498c interfaceC0498c : this.f717a) {
            interfaceC0498c.m1893a(interfaceC0502g, aVar, false, c0506k);
        }
        for (InterfaceC0498c interfaceC0498c2 : this.f717a) {
            interfaceC0498c2.m1893a(interfaceC0502g, aVar, true, c0506k);
        }
    }
}
