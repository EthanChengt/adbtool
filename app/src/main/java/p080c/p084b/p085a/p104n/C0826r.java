package p080c.p084b.p085a.p104n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p080c.p084b.p085a.p107q.InterfaceC0843c;

/* JADX INFO: renamed from: c.b.a.n.r */
/* JADX INFO: loaded from: classes.dex */
public class C0826r {

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC0843c> f4587a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC0843c> f4588b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f4589c;

    /* JADX INFO: renamed from: a */
    public boolean m2531a(InterfaceC0843c interfaceC0843c) {
        boolean z = true;
        if (interfaceC0843c == null) {
            return true;
        }
        boolean zRemove = this.f4587a.remove(interfaceC0843c);
        if (!this.f4588b.remove(interfaceC0843c) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC0843c.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f4587a.size() + ", isPaused=" + this.f4589c + "}";
    }
}
