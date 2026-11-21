package p080c.p084b.p085a.p088m.p091u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p043i.InterfaceC0403c;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0656e;

/* JADX INFO: renamed from: c.b.a.m.u.u */
/* JADX INFO: loaded from: classes.dex */
public class C0717u<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0403c<List<Throwable>> f4256a;

    /* JADX INFO: renamed from: b */
    public final List<? extends C0706j<Data, ResourceType, Transcode>> f4257b;

    /* JADX INFO: renamed from: c */
    public final String f4258c;

    public C0717u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C0706j<Data, ResourceType, Transcode>> list, InterfaceC0403c<List<Throwable>> interfaceC0403c) {
        this.f4256a = interfaceC0403c;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f4257b = list;
        StringBuilder sbM2191e = a.m2191e("Failed LoadPath{");
        sbM2191e.append(cls.getSimpleName());
        sbM2191e.append("->");
        sbM2191e.append(cls2.getSimpleName());
        sbM2191e.append("->");
        sbM2191e.append(cls3.getSimpleName());
        sbM2191e.append("}");
        this.f4258c = sbM2191e.toString();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Transcode> m2422a(InterfaceC0656e<Data> interfaceC0656e, C0647o c0647o, int i, int i2, C0706j.a<ResourceType> aVar) {
        List<Throwable> listMo1537b = this.f4256a.mo1537b();
        Objects.requireNonNull(listMo1537b, "Argument must not be null");
        List<Throwable> list = listMo1537b;
        try {
            int size = this.f4257b.size();
            InterfaceC0719w<Transcode> interfaceC0719wM2386a = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC0719wM2386a = this.f4257b.get(i3).m2386a(interfaceC0656e, i, i2, c0647o, aVar);
                } catch (C0714r e) {
                    list.add(e);
                }
                if (interfaceC0719wM2386a != null) {
                    break;
                }
            }
            if (interfaceC0719wM2386a == null) {
                throw new C0714r(this.f4258c, new ArrayList(list));
            }
            this.f4256a.mo1536a(list);
            return interfaceC0719wM2386a;
        } catch (Throwable th) {
            this.f4256a.mo1536a(list);
            throw th;
        }
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("LoadPath{decodePaths=");
        sbM2191e.append(Arrays.toString(this.f4257b.toArray()));
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
