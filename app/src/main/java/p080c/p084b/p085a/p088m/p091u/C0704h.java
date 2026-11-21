package p080c.p084b.p085a.p088m.p091u;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p080c.p084b.p085a.C0618d;
import p080c.p084b.p085a.C0621g;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0636d;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.p093d0.InterfaceC0689a;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p088m.p097w.C0753b;
import p080c.p084b.p085a.p088m.p097w.p103h.C0807f;
import p080c.p084b.p085a.p088m.p097w.p103h.C0808g;
import p080c.p084b.p085a.p088m.p097w.p103h.InterfaceC0806e;
import p080c.p084b.p085a.p106p.C0835a;
import p080c.p084b.p085a.p106p.C0837c;
import p080c.p084b.p085a.p106p.C0839e;
import p080c.p084b.p085a.p111s.C0874i;

/* JADX INFO: renamed from: c.b.a.m.u.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0704h<Transcode> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC0736n.a<?>> f4094a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC0645m> f4095b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C0618d f4096c;

    /* JADX INFO: renamed from: d */
    public Object f4097d;

    /* JADX INFO: renamed from: e */
    public int f4098e;

    /* JADX INFO: renamed from: f */
    public int f4099f;

    /* JADX INFO: renamed from: g */
    public Class<?> f4100g;

    /* JADX INFO: renamed from: h */
    public RunnableC0705i.d f4101h;

    /* JADX INFO: renamed from: i */
    public C0647o f4102i;

    /* JADX INFO: renamed from: j */
    public Map<Class<?>, InterfaceC0651s<?>> f4103j;

    /* JADX INFO: renamed from: k */
    public Class<Transcode> f4104k;

    /* JADX INFO: renamed from: l */
    public boolean f4105l;

    /* JADX INFO: renamed from: m */
    public boolean f4106m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0645m f4107n;

    /* JADX INFO: renamed from: o */
    public EnumC0620f f4108o;

    /* JADX INFO: renamed from: p */
    public AbstractC0707k f4109p;

    /* JADX INFO: renamed from: q */
    public boolean f4110q;

    /* JADX INFO: renamed from: r */
    public boolean f4111r;

    /* JADX INFO: renamed from: a */
    public List<InterfaceC0645m> m2367a() {
        if (!this.f4106m) {
            this.f4106m = true;
            this.f4095b.clear();
            List<InterfaceC0736n.a<?>> listM2369c = m2369c();
            int size = listM2369c.size();
            for (int i = 0; i < size; i++) {
                InterfaceC0736n.a<?> aVar = listM2369c.get(i);
                if (!this.f4095b.contains(aVar.f4327a)) {
                    this.f4095b.add(aVar.f4327a);
                }
                for (int i2 = 0; i2 < aVar.f4328b.size(); i2++) {
                    if (!this.f4095b.contains(aVar.f4328b.get(i2))) {
                        this.f4095b.add(aVar.f4328b.get(i2));
                    }
                }
            }
        }
        return this.f4095b;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0689a m2368b() {
        return ((C0708l.c) this.f4101h).m2399a();
    }

    /* JADX INFO: renamed from: c */
    public List<InterfaceC0736n.a<?>> m2369c() {
        if (!this.f4105l) {
            this.f4105l = true;
            this.f4094a.clear();
            List listM2215f = this.f4096c.f3780b.m2215f(this.f4097d);
            int size = listM2215f.size();
            for (int i = 0; i < size; i++) {
                InterfaceC0736n.a<?> aVarMo2426a = ((InterfaceC0736n) listM2215f.get(i)).mo2426a(this.f4097d, this.f4098e, this.f4099f, this.f4102i);
                if (aVarMo2426a != null) {
                    this.f4094a.add(aVarMo2426a);
                }
            }
        }
        return this.f4094a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public <Data> C0717u<Data, ?, Transcode> m2370d(Class<Data> cls) {
        C0717u<Data, ?, Transcode> c0717u;
        ArrayList arrayList;
        C0807f.a<?, ?> next;
        InterfaceC0806e interfaceC0806e;
        InterfaceC0806e interfaceC0806e2;
        C0621g c0621g = this.f4096c.f3780b;
        Class<?> cls2 = this.f4100g;
        Class<Transcode> cls3 = this.f4104k;
        C0837c c0837c = c0621g.f3804i;
        C0874i andSet = c0837c.f4604b.getAndSet(null);
        if (andSet == null) {
            andSet = new C0874i();
        }
        andSet.f4739a = cls;
        andSet.f4740b = cls2;
        andSet.f4741c = cls3;
        synchronized (c0837c.f4603a) {
            c0717u = (C0717u) c0837c.f4603a.getOrDefault(andSet, null);
        }
        c0837c.f4604b.set(andSet);
        Objects.requireNonNull(c0621g.f3804i);
        if (C0837c.f4602c.equals(c0717u)) {
            return null;
        }
        if (c0717u != null) {
            return c0717u;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : (ArrayList) c0621g.f3798c.m2540b(cls, cls2)) {
            for (Class<?> cls5 : (ArrayList) c0621g.f3801f.m2513a(cls4, cls3)) {
                C0839e c0839e = c0621g.f3798c;
                synchronized (c0839e) {
                    arrayList = new ArrayList();
                    Iterator<String> it = c0839e.f4607a.iterator();
                    while (it.hasNext()) {
                        List<C0839e.a<?, ?>> list = c0839e.f4608b.get(it.next());
                        if (list != null) {
                            for (C0839e.a<?, ?> aVar : list) {
                                if (aVar.m2541a(cls, cls4)) {
                                    arrayList.add(aVar.f4611c);
                                }
                            }
                        }
                    }
                }
                C0807f c0807f = c0621g.f3801f;
                synchronized (c0807f) {
                    if (cls5.isAssignableFrom(cls4)) {
                        interfaceC0806e = C0808g.f4563a;
                    } else {
                        Iterator<C0807f.a<?, ?>> it2 = c0807f.f4559a.iterator();
                        do {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                            }
                            next = it2.next();
                        } while (!next.m2514a(cls4, cls5));
                        interfaceC0806e = next.f4562c;
                    }
                    interfaceC0806e2 = interfaceC0806e;
                }
                arrayList2.add(new C0706j(cls, cls4, cls5, arrayList, interfaceC0806e2, c0621g.f3805j));
            }
        }
        C0717u<Data, ?, Transcode> c0717u2 = arrayList2.isEmpty() ? null : new C0717u<>(cls, cls2, cls3, arrayList2, c0621g.f3805j);
        C0837c c0837c2 = c0621g.f3804i;
        synchronized (c0837c2.f4603a) {
            c0837c2.f4603a.put(new C0874i(cls, cls2, cls3), c0717u2 != null ? c0717u2 : C0837c.f4602c);
        }
        return c0717u2;
    }

    /* JADX INFO: renamed from: e */
    public <X> InterfaceC0636d<X> m2371e(X x) {
        InterfaceC0636d<X> interfaceC0636d;
        C0835a c0835a = this.f4096c.f3780b.f3797b;
        Class<?> cls = x.getClass();
        synchronized (c0835a) {
            Iterator<C0835a.a<?>> it = c0835a.f4598a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC0636d = null;
                    break;
                }
                C0835a.a<?> next = it.next();
                if (next.f4599a.isAssignableFrom(cls)) {
                    interfaceC0636d = (InterfaceC0636d<X>) next.f4600b;
                    break;
                }
            }
        }
        if (interfaceC0636d != null) {
            return interfaceC0636d;
        }
        throw new C0621g.e(x.getClass());
    }

    /* JADX INFO: renamed from: f */
    public <Z> InterfaceC0651s<Z> m2372f(Class<Z> cls) {
        InterfaceC0651s<Z> interfaceC0651s = (InterfaceC0651s) this.f4103j.get(cls);
        if (interfaceC0651s == null) {
            for (Map.Entry<Class<?>, InterfaceC0651s<?>> entry : this.f4103j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    interfaceC0651s = (InterfaceC0651s) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC0651s != null) {
            return interfaceC0651s;
        }
        if (!this.f4103j.isEmpty() || !this.f4110q) {
            return (C0753b) C0753b.f4403b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public boolean m2373g(Class<?> cls) {
        return m2370d(cls) != null;
    }
}
