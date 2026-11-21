package p080c.p084b.p085a.p088m.p091u.p092c0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0686l;

/* JADX INFO: renamed from: c.b.a.m.u.c0.g */
/* JADX INFO: loaded from: classes.dex */
public class C0681g<K extends InterfaceC0686l, V> {

    /* JADX INFO: renamed from: a */
    public final a<K, V> f4005a = new a<>(null);

    /* JADX INFO: renamed from: b */
    public final Map<K, a<K, V>> f4006b = new HashMap();

    /* JADX INFO: renamed from: c.b.a.m.u.c0.g$a */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f4007a;

        /* JADX INFO: renamed from: b */
        public List<V> f4008b;

        /* JADX INFO: renamed from: c */
        public a<K, V> f4009c;

        /* JADX INFO: renamed from: d */
        public a<K, V> f4010d;

        public a() {
            this(null);
        }

        public a(K k) {
            this.f4010d = this;
            this.f4009c = this;
            this.f4007a = k;
        }

        /* JADX INFO: renamed from: a */
        public V m2336a() {
            List<V> list = this.f4008b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f4008b.remove(size - 1);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public V m2333a(K k) {
        a<K, V> aVar = this.f4006b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.f4006b.put(k, aVar);
        } else {
            k.mo2342a();
        }
        a<K, V> aVar2 = aVar.f4010d;
        aVar2.f4009c = aVar.f4009c;
        aVar.f4009c.f4010d = aVar2;
        a<K, V> aVar3 = this.f4005a;
        aVar.f4010d = aVar3;
        a<K, V> aVar4 = aVar3.f4009c;
        aVar.f4009c = aVar4;
        aVar4.f4010d = aVar;
        aVar.f4010d.f4009c = aVar;
        return aVar.m2336a();
    }

    /* JADX INFO: renamed from: b */
    public void m2334b(K k, V v) {
        a<K, V> aVar = this.f4006b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            a<K, V> aVar2 = aVar.f4010d;
            aVar2.f4009c = aVar.f4009c;
            aVar.f4009c.f4010d = aVar2;
            a<K, V> aVar3 = this.f4005a;
            aVar.f4010d = aVar3.f4010d;
            aVar.f4009c = aVar3;
            aVar3.f4010d = aVar;
            aVar.f4010d.f4009c = aVar;
            this.f4006b.put(k, aVar);
        } else {
            k.mo2342a();
        }
        if (aVar.f4008b == null) {
            aVar.f4008b = new ArrayList();
        }
        aVar.f4008b.add(v);
    }

    /* JADX INFO: renamed from: c */
    public V m2335c() {
        a aVar = this.f4005a;
        while (true) {
            aVar = aVar.f4010d;
            if (aVar.equals(this.f4005a)) {
                return null;
            }
            V v = (V) aVar.m2336a();
            if (v != null) {
                return v;
            }
            a<K, V> aVar2 = aVar.f4010d;
            aVar2.f4009c = aVar.f4009c;
            aVar.f4009c.f4010d = aVar2;
            this.f4006b.remove(aVar.f4007a);
            ((InterfaceC0686l) aVar.f4007a).mo2342a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.f4005a.f4009c; !aVar.equals(this.f4005a); aVar = aVar.f4009c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f4007a);
            sb.append(':');
            List<V> list = aVar.f4008b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
