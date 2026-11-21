package p080c.p084b.p085a.p088m.p091u;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import c.a.a.a.a;
import p080c.p084b.p085a.C0621g;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p088m.p095v.C0738p;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p106p.C0838d;
import p080c.p084b.p085a.p111s.C0874i;

/* JADX INFO: renamed from: c.b.a.m.u.x */
/* JADX INFO: loaded from: classes.dex */
public class C0720x implements InterfaceC0703g, InterfaceC0655d.a<Object> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0703g.a f4264b;

    /* JADX INFO: renamed from: c */
    public final C0704h<?> f4265c;

    /* JADX INFO: renamed from: d */
    public int f4266d;

    /* JADX INFO: renamed from: e */
    public int f4267e = -1;

    /* JADX INFO: renamed from: f */
    public InterfaceC0645m f4268f;

    /* JADX INFO: renamed from: g */
    public List<InterfaceC0736n<File, ?>> f4269g;

    /* JADX INFO: renamed from: h */
    public int f4270h;

    /* JADX INFO: renamed from: i */
    public volatile InterfaceC0736n.a<?> f4271i;

    /* JADX INFO: renamed from: j */
    public File f4272j;

    /* JADX INFO: renamed from: k */
    public C0721y f4273k;

    public C0720x(C0704h<?> c0704h, InterfaceC0703g.a aVar) {
        this.f4265c = c0704h;
        this.f4264b = aVar;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g
    /* JADX INFO: renamed from: a */
    public boolean mo2313a() {
        List<Class<?>> orDefault;
        List<Class<?>> listM2447d;
        List<InterfaceC0645m> listM2367a = this.f4265c.m2367a();
        if (listM2367a.isEmpty()) {
            return false;
        }
        C0704h<?> c0704h = this.f4265c;
        C0621g c0621g = c0704h.f4096c.f3780b;
        Class<?> cls = c0704h.f4097d.getClass();
        Class<?> cls2 = c0704h.f4100g;
        Class<?> cls3 = c0704h.f4104k;
        C0838d c0838d = c0621g.f3803h;
        C0874i andSet = c0838d.f4605a.getAndSet(null);
        if (andSet == null) {
            andSet = new C0874i(cls, cls2, cls3);
        } else {
            andSet.f4739a = cls;
            andSet.f4740b = cls2;
            andSet.f4741c = cls3;
        }
        synchronized (c0838d.f4606b) {
            orDefault = c0838d.f4606b.getOrDefault(andSet, null);
        }
        c0838d.f4605a.set(andSet);
        List list = orDefault;
        if (orDefault == null) {
            ArrayList arrayList = new ArrayList();
            C0738p c0738p = c0621g.f3796a;
            synchronized (c0738p) {
                listM2447d = c0738p.f4330a.m2447d(cls);
            }
            Iterator it = ((ArrayList) listM2447d).iterator();
            while (it.hasNext()) {
                for (Class cls4 : (ArrayList) c0621g.f3798c.m2540b((Class) it.next(), cls2)) {
                    if (!((ArrayList) c0621g.f3801f.m2513a(cls4, cls3)).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            C0838d c0838d2 = c0621g.f3803h;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (c0838d2.f4606b) {
                c0838d2.f4606b.put(new C0874i(cls, cls2, cls3), listUnmodifiableList);
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.f4265c.f4104k)) {
                return false;
            }
            StringBuilder sbM2191e = a.m2191e("Failed to find any load path from ");
            sbM2191e.append(this.f4265c.f4097d.getClass());
            sbM2191e.append(" to ");
            sbM2191e.append(this.f4265c.f4104k);
            throw new IllegalStateException(sbM2191e.toString());
        }
        while (true) {
            List<InterfaceC0736n<File, ?>> list2 = this.f4269g;
            if (list2 != null) {
                if (this.f4270h < list2.size()) {
                    this.f4271i = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f4270h < this.f4269g.size())) {
                            break;
                        }
                        List<InterfaceC0736n<File, ?>> list3 = this.f4269g;
                        int i = this.f4270h;
                        this.f4270h = i + 1;
                        InterfaceC0736n<File, ?> interfaceC0736n = list3.get(i);
                        File file = this.f4272j;
                        C0704h<?> c0704h2 = this.f4265c;
                        this.f4271i = interfaceC0736n.mo2426a(file, c0704h2.f4098e, c0704h2.f4099f, c0704h2.f4102i);
                        if (this.f4271i != null && this.f4265c.m2373g(this.f4271i.f4329c.mo2291a())) {
                            this.f4271i.f4329c.mo2297e(this.f4265c.f4108o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f4267e + 1;
            this.f4267e = i2;
            if (i2 >= list.size()) {
                int i3 = this.f4266d + 1;
                this.f4266d = i3;
                if (i3 >= listM2367a.size()) {
                    return false;
                }
                this.f4267e = 0;
            }
            InterfaceC0645m interfaceC0645m = listM2367a.get(this.f4266d);
            Class cls5 = (Class) list.get(this.f4267e);
            InterfaceC0651s<Z> interfaceC0651sM2372f = this.f4265c.m2372f(cls5);
            C0704h<?> c0704h3 = this.f4265c;
            this.f4273k = new C0721y(c0704h3.f4096c.f3779a, interfaceC0645m, c0704h3.f4107n, c0704h3.f4098e, c0704h3.f4099f, interfaceC0651sM2372f, cls5, c0704h3.f4102i);
            File fileMo2356b = c0704h3.m2368b().mo2356b(this.f4273k);
            this.f4272j = fileMo2356b;
            if (fileMo2356b != null) {
                this.f4268f = interfaceC0645m;
                this.f4269g = this.f4265c.f4096c.f3780b.m2215f(fileMo2356b);
                this.f4270h = 0;
            }
        }
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g
    public void cancel() {
        InterfaceC0736n.a<?> aVar = this.f4271i;
        if (aVar != null) {
            aVar.f4329c.cancel();
        }
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
    /* JADX INFO: renamed from: d */
    public void mo2299d(Exception exc) {
        this.f4264b.mo2316d(this.f4273k, exc, this.f4271i.f4329c, EnumC0633a.RESOURCE_DISK_CACHE);
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
    /* JADX INFO: renamed from: f */
    public void mo2300f(Object obj) {
        this.f4264b.mo2315c(this.f4268f, obj, this.f4271i.f4329c, EnumC0633a.RESOURCE_DISK_CACHE, this.f4273k);
    }
}
