package p006b.p019c.p020a.p022b;

import java.util.HashMap;

/* JADX INFO: renamed from: b.c.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0302a<K, V> extends C0303b<K, V> {

    /* JADX INFO: renamed from: f */
    public HashMap<K, C0303b.c<K, V>> f2103f = new HashMap<>();

    @Override // p006b.p019c.p020a.p022b.C0303b
    /* JADX INFO: renamed from: a */
    public C0303b.c<K, V> mo1185a(K k) {
        return this.f2103f.get(k);
    }

    public boolean contains(K k) {
        return this.f2103f.containsKey(k);
    }

    @Override // p006b.p019c.p020a.p022b.C0303b
    /* JADX INFO: renamed from: d */
    public V mo1186d(K k, V v) {
        C0303b.c<K, V> cVar = this.f2103f.get(k);
        if (cVar != null) {
            return cVar.f2109c;
        }
        this.f2103f.put(k, m1189c(k, v));
        return null;
    }

    @Override // p006b.p019c.p020a.p022b.C0303b
    /* JADX INFO: renamed from: e */
    public V mo1187e(K k) {
        V v = (V) super.mo1187e(k);
        this.f2103f.remove(k);
        return v;
    }
}
