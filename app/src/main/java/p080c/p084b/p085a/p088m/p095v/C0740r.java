package p080c.p084b.p085a.p088m.p095v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p006b.p032h.p043i.InterfaceC0403c;
import p080c.p084b.p085a.C0621g;
import p080c.p084b.p085a.p088m.C0647o;

/* JADX INFO: renamed from: c.b.a.m.v.r */
/* JADX INFO: loaded from: classes.dex */
public class C0740r {

    /* JADX INFO: renamed from: e */
    public static final c f4343e = new c();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0736n<Object, Object> f4344f = new a();

    /* JADX INFO: renamed from: a */
    public final List<b<?, ?>> f4345a;

    /* JADX INFO: renamed from: b */
    public final c f4346b;

    /* JADX INFO: renamed from: c */
    public final Set<b<?, ?>> f4347c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0403c<List<Throwable>> f4348d;

    /* JADX INFO: renamed from: c.b.a.m.v.r$a */
    public static class a implements InterfaceC0736n<Object, Object> {
        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
        /* JADX INFO: renamed from: a */
        public InterfaceC0736n.a<Object> mo2426a(Object obj, int i, int i2, C0647o c0647o) {
            return null;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
        /* JADX INFO: renamed from: b */
        public boolean mo2427b(Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.r$b */
    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a */
        public final Class<Model> f4349a;

        /* JADX INFO: renamed from: b */
        public final Class<Data> f4350b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0737o<? extends Model, ? extends Data> f4351c;

        public b(Class<Model> cls, Class<Data> cls2, InterfaceC0737o<? extends Model, ? extends Data> interfaceC0737o) {
            this.f4349a = cls;
            this.f4350b = cls2;
            this.f4351c = interfaceC0737o;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.r$c */
    public static class c {
    }

    public C0740r(InterfaceC0403c<List<Throwable>> interfaceC0403c) {
        c cVar = f4343e;
        this.f4345a = new ArrayList();
        this.f4347c = new HashSet();
        this.f4348d = interfaceC0403c;
        this.f4346b = cVar;
    }

    /* JADX INFO: renamed from: a */
    public final <Model, Data> InterfaceC0736n<Model, Data> m2444a(b<?, ?> bVar) {
        InterfaceC0736n<Model, Data> interfaceC0736n = (InterfaceC0736n<Model, Data>) bVar.f4351c.mo2429b(this);
        Objects.requireNonNull(interfaceC0736n, "Argument must not be null");
        return interfaceC0736n;
    }

    /* JADX INFO: renamed from: b */
    public synchronized <Model, Data> InterfaceC0736n<Model, Data> m2445b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f4345a) {
                if (this.f4347c.contains(bVar)) {
                    z = true;
                } else if (bVar.f4349a.isAssignableFrom(cls) && bVar.f4350b.isAssignableFrom(cls2)) {
                    this.f4347c.add(bVar);
                    arrayList.add(m2444a(bVar));
                    this.f4347c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f4346b;
                InterfaceC0403c<List<Throwable>> interfaceC0403c = this.f4348d;
                Objects.requireNonNull(cVar);
                return new C0739q(arrayList, interfaceC0403c);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC0736n) arrayList.get(0);
            }
            if (z) {
                return (InterfaceC0736n<Model, Data>) f4344f;
            }
            throw new C0621g.c((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.f4347c.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized <Model> List<InterfaceC0736n<Model, ?>> m2446c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f4345a) {
                if (!this.f4347c.contains(bVar) && bVar.f4349a.isAssignableFrom(cls)) {
                    this.f4347c.add(bVar);
                    InterfaceC0736n<? extends Object, ? extends Object> interfaceC0736nMo2429b = bVar.f4351c.mo2429b(this);
                    Objects.requireNonNull(interfaceC0736nMo2429b, "Argument must not be null");
                    arrayList.add(interfaceC0736nMo2429b);
                    this.f4347c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f4347c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized List<Class<?>> m2447d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f4345a) {
            if (!arrayList.contains(bVar.f4350b) && bVar.f4349a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f4350b);
            }
        }
        return arrayList;
    }
}
