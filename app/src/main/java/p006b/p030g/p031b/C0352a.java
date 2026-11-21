package p006b.p030g.p031b;

import java.util.ArrayList;
import java.util.HashSet;
import p006b.p025e.C0320h;
import p006b.p032h.p043i.C0404d;
import p006b.p032h.p043i.InterfaceC0403c;

/* JADX INFO: renamed from: b.g.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0352a<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0403c<ArrayList<T>> f2525a = new C0404d(10);

    /* JADX INFO: renamed from: b */
    public final C0320h<T, ArrayList<T>> f2526b = new C0320h<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<T> f2527c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<T> f2528d = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public void m1403a(T t) {
        if (this.f2526b.m1269e(t) >= 0) {
            return;
        }
        this.f2526b.put(t, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m1404b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f2526b.getOrDefault(t, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i = 0; i < size; i++) {
                m1404b(orDefault.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
