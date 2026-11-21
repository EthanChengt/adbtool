package p080c.p084b.p085a.p104n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.n.a */
/* JADX INFO: loaded from: classes.dex */
public class C0809a implements InterfaceC0820l {

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC0821m> f4564a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public boolean f4565b;

    /* JADX INFO: renamed from: c */
    public boolean f4566c;

    @Override // p080c.p084b.p085a.p104n.InterfaceC0820l
    /* JADX INFO: renamed from: a */
    public void mo2515a(InterfaceC0821m interfaceC0821m) {
        this.f4564a.add(interfaceC0821m);
        if (this.f4566c) {
            interfaceC0821m.mo2231k();
        } else if (this.f4565b) {
            interfaceC0821m.mo2230i();
        } else {
            interfaceC0821m.mo2229e();
        }
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0820l
    /* JADX INFO: renamed from: b */
    public void mo2516b(InterfaceC0821m interfaceC0821m) {
        this.f4564a.remove(interfaceC0821m);
    }

    /* JADX INFO: renamed from: c */
    public void m2517c() {
        this.f4566c = true;
        Iterator it = ((ArrayList) C0875j.m2613e(this.f4564a)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0821m) it.next()).mo2231k();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2518d() {
        this.f4565b = true;
        Iterator it = ((ArrayList) C0875j.m2613e(this.f4564a)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0821m) it.next()).mo2230i();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2519e() {
        this.f4565b = false;
        Iterator it = ((ArrayList) C0875j.m2613e(this.f4564a)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0821m) it.next()).mo2229e();
        }
    }
}
