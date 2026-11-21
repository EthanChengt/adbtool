package p006b.p025e;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: b.e.b */
/* JADX INFO: loaded from: classes.dex */
public class C0314b<E> extends AbstractC0319g<E, E> {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0315c f2150d;

    public C0314b(C0315c c0315c) {
        this.f2150d = c0315c;
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: a */
    public void mo1228a() {
        this.f2150d.clear();
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: b */
    public Object mo1229b(int i, int i2) {
        return this.f2150d.f2158c[i];
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: c */
    public Map<E, E> mo1230c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: d */
    public int mo1231d() {
        return this.f2150d.f2159d;
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: e */
    public int mo1232e(Object obj) {
        return this.f2150d.m1239c(obj);
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: f */
    public int mo1233f(Object obj) {
        return this.f2150d.m1239c(obj);
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: g */
    public void mo1234g(E e, E e2) {
        this.f2150d.add(e);
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: h */
    public void mo1235h(int i) {
        this.f2150d.m1242f(i);
    }

    @Override // p006b.p025e.AbstractC0319g
    /* JADX INFO: renamed from: i */
    public E mo1236i(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }
}
