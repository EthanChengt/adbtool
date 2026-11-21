package p080c.p084b.p085a.p111s.p112k;

import android.util.Log;
import p006b.p032h.p043i.C0405e;
import p006b.p032h.p043i.InterfaceC0403c;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.s.k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0876a {

    /* JADX INFO: renamed from: a */
    public static final e<Object> f4746a = new a();

    /* JADX INFO: renamed from: c.b.a.s.k.a$a */
    public class a implements e<Object> {
        @Override // p080c.p084b.p085a.p111s.p112k.C0876a.e
        /* JADX INFO: renamed from: a */
        public void mo2620a(Object obj) {
        }
    }

    /* JADX INFO: renamed from: c.b.a.s.k.a$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        T mo2363a();
    }

    /* JADX INFO: renamed from: c.b.a.s.k.a$c */
    public static final class c<T> implements InterfaceC0403c<T> {

        /* JADX INFO: renamed from: a */
        public final b<T> f4747a;

        /* JADX INFO: renamed from: b */
        public final e<T> f4748b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0403c<T> f4749c;

        public c(InterfaceC0403c<T> interfaceC0403c, b<T> bVar, e<T> eVar) {
            this.f4749c = interfaceC0403c;
            this.f4747a = bVar;
            this.f4748b = eVar;
        }

        @Override // p006b.p032h.p043i.InterfaceC0403c
        /* JADX INFO: renamed from: a */
        public boolean mo1536a(T t) {
            if (t instanceof d) {
                ((AbstractC0879d.b) ((d) t).mo2364a()).f4750a = true;
            }
            this.f4748b.mo2620a(t);
            return this.f4749c.mo1536a(t);
        }

        @Override // p006b.p032h.p043i.InterfaceC0403c
        /* JADX INFO: renamed from: b */
        public T mo1537b() {
            T tMo1537b = this.f4749c.mo1537b();
            if (tMo1537b == null) {
                tMo1537b = this.f4747a.mo2363a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sbM2191e = a.m2191e("Created new ");
                    sbM2191e.append(tMo1537b.getClass());
                    Log.v("FactoryPools", sbM2191e.toString());
                }
            }
            if (tMo1537b instanceof d) {
                ((AbstractC0879d.b) ((d) tMo1537b).mo2364a()).f4750a = false;
            }
            return tMo1537b;
        }
    }

    /* JADX INFO: renamed from: c.b.a.s.k.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        AbstractC0879d mo2364a();
    }

    /* JADX INFO: renamed from: c.b.a.s.k.a$e */
    public interface e<T> {
        /* JADX INFO: renamed from: a */
        void mo2620a(T t);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends d> InterfaceC0403c<T> m2619a(int i, b<T> bVar) {
        return new c(new C0405e(i), bVar, f4746a);
    }
}
