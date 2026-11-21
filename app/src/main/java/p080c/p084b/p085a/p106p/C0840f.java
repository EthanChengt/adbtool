package p080c.p084b.p085a.p106p;

import java.util.ArrayList;
import java.util.List;
import p080c.p084b.p085a.p088m.InterfaceC0650r;

/* JADX INFO: renamed from: c.b.a.p.f */
/* JADX INFO: loaded from: classes.dex */
public class C0840f {

    /* JADX INFO: renamed from: a */
    public final List<a<?>> f4612a = new ArrayList();

    /* JADX INFO: renamed from: c.b.a.p.f$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f4613a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0650r<T> f4614b;

        public a(Class<T> cls, InterfaceC0650r<T> interfaceC0650r) {
            this.f4613a = cls;
            this.f4614b = interfaceC0650r;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Z> InterfaceC0650r<Z> m2542a(Class<Z> cls) {
        int size = this.f4612a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.f4612a.get(i);
            if (aVar.f4613a.isAssignableFrom(cls)) {
                return (InterfaceC0650r<Z>) aVar.f4614b;
            }
        }
        return null;
    }
}
