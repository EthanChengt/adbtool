package p080c.p084b.p085a.p104n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p080c.p084b.p085a.p107q.p108j.InterfaceC0857h;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.n.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0828t implements InterfaceC0821m {

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC0857h<?>> f4597b = Collections.newSetFromMap(new WeakHashMap());

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: e */
    public void mo2229e() {
        Iterator it = ((ArrayList) C0875j.m2613e(this.f4597b)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0857h) it.next()).mo2229e();
        }
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: i */
    public void mo2230i() {
        Iterator it = ((ArrayList) C0875j.m2613e(this.f4597b)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0857h) it.next()).mo2230i();
        }
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: k */
    public void mo2231k() {
        Iterator it = ((ArrayList) C0875j.m2613e(this.f4597b)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0857h) it.next()).mo2231k();
        }
    }
}
