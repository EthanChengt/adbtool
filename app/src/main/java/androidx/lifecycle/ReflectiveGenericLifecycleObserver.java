package androidx.lifecycle;

import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0496a;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0500e {

    /* JADX INFO: renamed from: a */
    public final Object f735a;

    /* JADX INFO: renamed from: b */
    public final C0496a.a f736b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f735a = obj;
        this.f736b = C0496a.f3173c.m1884b(obj.getClass());
    }

    @Override // p006b.p061o.InterfaceC0500e
    /* JADX INFO: renamed from: d */
    public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
        C0496a.a aVar2 = this.f736b;
        Object obj = this.f735a;
        C0496a.a.m1886a(aVar2.f3176a.get(aVar), interfaceC0502g, aVar, obj);
        C0496a.a.m1886a(aVar2.f3176a.get(AbstractC0499d.a.ON_ANY), interfaceC0502g, aVar, obj);
    }
}
