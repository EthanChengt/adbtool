package p080c.p084b.p085a.p106p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p080c.p084b.p085a.p088m.InterfaceC0649q;

/* JADX INFO: renamed from: c.b.a.p.e */
/* JADX INFO: loaded from: classes.dex */
public class C0839e {

    /* JADX INFO: renamed from: a */
    public final List<String> f4607a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Map<String, List<a<?, ?>>> f4608b = new HashMap();

    /* JADX INFO: renamed from: c.b.a.p.e$a */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f4609a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f4610b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0649q<T, R> f4611c;

        public a(Class<T> cls, Class<R> cls2, InterfaceC0649q<T, R> interfaceC0649q) {
            this.f4609a = cls;
            this.f4610b = cls2;
            this.f4611c = interfaceC0649q;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2541a(Class<?> cls, Class<?> cls2) {
            return this.f4609a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4610b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<a<?, ?>> m2539a(String str) {
        List<a<?, ?>> arrayList;
        if (!this.f4607a.contains(str)) {
            this.f4607a.add(str);
        }
        arrayList = this.f4608b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f4608b.put(str, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public synchronized <T, R> List<Class<R>> m2540b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f4607a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f4608b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m2541a(cls, cls2) && !arrayList.contains(aVar.f4610b)) {
                        arrayList.add(aVar.f4610b);
                    }
                }
            }
        }
        return arrayList;
    }
}
