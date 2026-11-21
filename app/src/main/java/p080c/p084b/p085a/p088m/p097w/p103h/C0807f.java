package p080c.p084b.p085a.p088m.p097w.p103h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: c.b.a.m.w.h.f */
/* JADX INFO: loaded from: classes.dex */
public class C0807f {

    /* JADX INFO: renamed from: a */
    public final List<a<?, ?>> f4559a = new ArrayList();

    /* JADX INFO: renamed from: c.b.a.m.w.h.f$a */
    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a */
        public final Class<Z> f4560a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f4561b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0806e<Z, R> f4562c;

        public a(Class<Z> cls, Class<R> cls2, InterfaceC0806e<Z, R> interfaceC0806e) {
            this.f4560a = cls;
            this.f4561b = cls2;
            this.f4562c = interfaceC0806e;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2514a(Class<?> cls, Class<?> cls2) {
            return this.f4560a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4561b);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Z, R> List<Class<R>> m2513a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f4559a.iterator();
        while (it.hasNext()) {
            if (it.next().m2514a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
