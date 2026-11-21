package p080c.p084b.p085a.p111s;

import p006b.p025e.C0313a;
import p006b.p025e.C0320h;

/* JADX INFO: renamed from: c.b.a.s.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0867b<K, V> extends C0313a<K, V> {

    /* JADX INFO: renamed from: j */
    public int f4723j;

    @Override // p006b.p025e.C0320h, java.util.Map
    public void clear() {
        this.f4723j = 0;
        super.clear();
    }

    @Override // p006b.p025e.C0320h, java.util.Map
    public int hashCode() {
        if (this.f4723j == 0) {
            this.f4723j = super.hashCode();
        }
        return this.f4723j;
    }

    @Override // p006b.p025e.C0320h
    /* JADX INFO: renamed from: i */
    public void mo1273i(C0320h<? extends K, ? extends V> c0320h) {
        this.f4723j = 0;
        super.mo1273i(c0320h);
    }

    @Override // p006b.p025e.C0320h
    /* JADX INFO: renamed from: j */
    public V mo1274j(int i) {
        this.f4723j = 0;
        return (V) super.mo1274j(i);
    }

    @Override // p006b.p025e.C0320h
    /* JADX INFO: renamed from: k */
    public V mo1275k(int i, V v) {
        this.f4723j = 0;
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f2196c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    @Override // p006b.p025e.C0320h, java.util.Map
    public V put(K k, V v) {
        this.f4723j = 0;
        return (V) super.put(k, v);
    }
}
