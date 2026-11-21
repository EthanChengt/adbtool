package p006b.p025e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p006b.p025e.AbstractC0319g.b;
import p006b.p025e.AbstractC0319g.c;
import p006b.p025e.AbstractC0319g.e;

/* JADX INFO: renamed from: b.e.a */
/* JADX INFO: loaded from: classes.dex */
public class C0313a<K, V> extends C0320h<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: i */
    public AbstractC0319g<K, V> f2148i;

    /* JADX INFO: renamed from: b.e.a$a */
    public class a extends AbstractC0319g<K, V> {
        public a() {
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: a */
        public void mo1228a() {
            C0313a.this.clear();
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: b */
        public Object mo1229b(int i, int i2) {
            return C0313a.this.f2196c[(i << 1) + i2];
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: c */
        public Map<K, V> mo1230c() {
            return C0313a.this;
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: d */
        public int mo1231d() {
            return C0313a.this.f2197d;
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: e */
        public int mo1232e(Object obj) {
            return C0313a.this.m1269e(obj);
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: f */
        public int mo1233f(Object obj) {
            return C0313a.this.m1271g(obj);
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: g */
        public void mo1234g(K k, V v) {
            C0313a.this.put(k, v);
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: h */
        public void mo1235h(int i) {
            C0313a.this.mo1274j(i);
        }

        @Override // p006b.p025e.AbstractC0319g
        /* JADX INFO: renamed from: i */
        public V mo1236i(int i, V v) {
            return C0313a.this.mo1275k(i, v);
        }
    }

    public C0313a() {
    }

    public C0313a(int i) {
        super(i);
    }

    public C0313a(C0320h c0320h) {
        if (c0320h != null) {
            mo1273i(c0320h);
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        AbstractC0319g<K, V> abstractC0319gM1227m = m1227m();
        if (abstractC0319gM1227m.f2176a == null) {
            abstractC0319gM1227m.f2176a = abstractC0319gM1227m.new b();
        }
        return abstractC0319gM1227m.f2176a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        AbstractC0319g<K, V> abstractC0319gM1227m = m1227m();
        if (abstractC0319gM1227m.f2177b == null) {
            abstractC0319gM1227m.f2177b = abstractC0319gM1227m.new c();
        }
        return abstractC0319gM1227m.f2177b;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC0319g<K, V> m1227m() {
        if (this.f2148i == null) {
            this.f2148i = new a();
        }
        return this.f2148i;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m1267b(map.size() + this.f2197d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        AbstractC0319g<K, V> abstractC0319gM1227m = m1227m();
        if (abstractC0319gM1227m.f2178c == null) {
            abstractC0319gM1227m.f2178c = abstractC0319gM1227m.new e();
        }
        return abstractC0319gM1227m.f2178c;
    }
}
