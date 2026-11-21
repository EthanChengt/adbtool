package p080c.p084b.p085a.p088m.p091u;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p043i.InterfaceC0403c;
import c.a.a.a.a;
import p080c.p084b.p085a.C0621g;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.EnumC0635c;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.InterfaceC0650r;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0656e;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p088m.p097w.p103h.InterfaceC0806e;

/* JADX INFO: renamed from: c.b.a.m.u.j */
/* JADX INFO: loaded from: classes.dex */
public class C0706j<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final Class<DataType> f4163a;

    /* JADX INFO: renamed from: b */
    public final List<? extends InterfaceC0649q<DataType, ResourceType>> f4164b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0806e<ResourceType, Transcode> f4165c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0403c<List<Throwable>> f4166d;

    /* JADX INFO: renamed from: e */
    public final String f4167e;

    /* JADX INFO: renamed from: c.b.a.m.u.j$a */
    public interface a<ResourceType> {
    }

    public C0706j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC0649q<DataType, ResourceType>> list, InterfaceC0806e<ResourceType, Transcode> interfaceC0806e, InterfaceC0403c<List<Throwable>> interfaceC0403c) {
        this.f4163a = cls;
        this.f4164b = list;
        this.f4165c = interfaceC0806e;
        this.f4166d = interfaceC0403c;
        StringBuilder sbM2191e = a.m2191e("Failed DecodePath{");
        sbM2191e.append(cls.getSimpleName());
        sbM2191e.append("->");
        sbM2191e.append(cls2.getSimpleName());
        sbM2191e.append("->");
        sbM2191e.append(cls3.getSimpleName());
        sbM2191e.append("}");
        this.f4167e = sbM2191e.toString();
    }

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
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Transcode> m2386a(InterfaceC0656e<DataType> interfaceC0656e, int i, int i2, C0647o c0647o, a<ResourceType> aVar) {
        InterfaceC0719w<ResourceType> interfaceC0719wMo2290b;
        InterfaceC0651s interfaceC0651s;
        EnumC0635c enumC0635cMo2289b;
        InterfaceC0645m c0700e;
        List<Throwable> listMo1537b = this.f4166d.mo1537b();
        Objects.requireNonNull(listMo1537b, "Argument must not be null");
        List<Throwable> list = listMo1537b;
        try {
            InterfaceC0719w<ResourceType> interfaceC0719wM2387b = m2387b(interfaceC0656e, i, i2, c0647o, list);
            this.f4166d.mo1536a(list);
            RunnableC0705i.b bVar = (RunnableC0705i.b) aVar;
            RunnableC0705i runnableC0705i = RunnableC0705i.this;
            EnumC0633a enumC0633a = bVar.f4144a;
            Objects.requireNonNull(runnableC0705i);
            Class<?> cls = interfaceC0719wM2387b.mo2409b().getClass();
            InterfaceC0650r interfaceC0650rM2542a = null;
            if (enumC0633a != EnumC0633a.RESOURCE_DISK_CACHE) {
                InterfaceC0651s interfaceC0651sM2372f = runnableC0705i.f4119b.m2372f(cls);
                interfaceC0651s = interfaceC0651sM2372f;
                interfaceC0719wMo2290b = interfaceC0651sM2372f.mo2290b(runnableC0705i.f4126i, interfaceC0719wM2387b, runnableC0705i.f4130m, runnableC0705i.f4131n);
            } else {
                interfaceC0719wMo2290b = interfaceC0719wM2387b;
                interfaceC0651s = null;
            }
            if (!interfaceC0719wM2387b.equals(interfaceC0719wMo2290b)) {
                interfaceC0719wM2387b.mo2412e();
            }
            boolean z = false;
            if (runnableC0705i.f4119b.f4096c.f3780b.f3799d.m2542a(interfaceC0719wMo2290b.mo2411d()) != null) {
                interfaceC0650rM2542a = runnableC0705i.f4119b.f4096c.f3780b.f3799d.m2542a(interfaceC0719wMo2290b.mo2411d());
                if (interfaceC0650rM2542a == null) {
                    throw new C0621g.d(interfaceC0719wMo2290b.mo2411d());
                }
                enumC0635cMo2289b = interfaceC0650rM2542a.mo2289b(runnableC0705i.f4133p);
            } else {
                enumC0635cMo2289b = EnumC0635c.NONE;
            }
            InterfaceC0650r interfaceC0650r = interfaceC0650rM2542a;
            C0704h<R> c0704h = runnableC0705i.f4119b;
            InterfaceC0645m interfaceC0645m = runnableC0705i.f4142y;
            List<InterfaceC0736n.a<?>> listM2369c = c0704h.m2369c();
            int size = listM2369c.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (listM2369c.get(i3).f4327a.equals(interfaceC0645m)) {
                    z = true;
                    break;
                }
            }
            Object obj = interfaceC0719wMo2290b;
            if (runnableC0705i.f4132o.mo2391d(!z, enumC0633a, enumC0635cMo2289b)) {
                if (interfaceC0650r == null) {
                    throw new C0621g.d(interfaceC0719wMo2290b.mo2409b().getClass());
                }
                int iOrdinal = enumC0635cMo2289b.ordinal();
                if (iOrdinal == 0) {
                    c0700e = new C0700e(runnableC0705i.f4142y, runnableC0705i.f4127j);
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + enumC0635cMo2289b);
                    }
                    c0700e = new C0721y(runnableC0705i.f4119b.f4096c.f3779a, runnableC0705i.f4142y, runnableC0705i.f4127j, runnableC0705i.f4130m, runnableC0705i.f4131n, interfaceC0651s, cls, runnableC0705i.f4133p);
                }
                C0718v<Z> c0718vM2423f = C0718v.m2423f(interfaceC0719wMo2290b);
                RunnableC0705i.c<?> cVar = runnableC0705i.f4124g;
                cVar.f4146a = c0700e;
                cVar.f4147b = interfaceC0650r;
                cVar.f4148c = c0718vM2423f;
                obj = c0718vM2423f;
            }
            return this.f4165c.mo2512a(obj, c0647o);
        } catch (Throwable th) {
            this.f4166d.mo1536a(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0719w<ResourceType> m2387b(InterfaceC0656e<DataType> interfaceC0656e, int i, int i2, C0647o c0647o, List<Throwable> list) throws C0714r {
        int size = this.f4164b.size();
        InterfaceC0719w<ResourceType> interfaceC0719wMo2287a = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0649q<DataType, ResourceType> interfaceC0649q = this.f4164b.get(i3);
            try {
                if (interfaceC0649q.mo2288b(interfaceC0656e.mo2301a(), c0647o)) {
                    interfaceC0719wMo2287a = interfaceC0649q.mo2287a(interfaceC0656e.mo2301a(), i, i2, c0647o);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC0649q, e);
                }
                list.add(e);
            }
            if (interfaceC0719wMo2287a != null) {
                break;
            }
        }
        if (interfaceC0719wMo2287a != null) {
            return interfaceC0719wMo2287a;
        }
        throw new C0714r(this.f4167e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("DecodePath{ dataClass=");
        sbM2191e.append(this.f4163a);
        sbM2191e.append(", decoders=");
        sbM2191e.append(this.f4164b);
        sbM2191e.append(", transcoder=");
        sbM2191e.append(this.f4165c);
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
