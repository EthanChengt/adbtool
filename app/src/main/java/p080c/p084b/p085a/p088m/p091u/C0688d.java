package p080c.p084b.p085a.p088m.p091u;

import java.io.File;
import java.util.List;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;

/* JADX INFO: renamed from: c.b.a.m.u.d */
/* JADX INFO: loaded from: classes.dex */
public class C0688d implements InterfaceC0703g, InterfaceC0655d.a<Object> {

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC0645m> f4042b;

    /* JADX INFO: renamed from: c */
    public final C0704h<?> f4043c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0703g.a f4044d;

    /* JADX INFO: renamed from: e */
    public int f4045e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0645m f4046f;

    /* JADX INFO: renamed from: g */
    public List<InterfaceC0736n<File, ?>> f4047g;

    /* JADX INFO: renamed from: h */
    public int f4048h;

    /* JADX INFO: renamed from: i */
    public volatile InterfaceC0736n.a<?> f4049i;

    /* JADX INFO: renamed from: j */
    public File f4050j;

    public C0688d(C0704h<?> c0704h, InterfaceC0703g.a aVar) {
        List<InterfaceC0645m> listM2367a = c0704h.m2367a();
        this.f4045e = -1;
        this.f4042b = listM2367a;
        this.f4043c = c0704h;
        this.f4044d = aVar;
    }

    public C0688d(List<InterfaceC0645m> list, C0704h<?> c0704h, InterfaceC0703g.a aVar) {
        this.f4045e = -1;
        this.f4042b = list;
        this.f4043c = c0704h;
        this.f4044d = aVar;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g
    /* JADX INFO: renamed from: a */
    public boolean mo2313a() {
        while (true) {
            List<InterfaceC0736n<File, ?>> list = this.f4047g;
            if (list != null) {
                if (this.f4048h < list.size()) {
                    this.f4049i = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f4048h < this.f4047g.size())) {
                            break;
                        }
                        List<InterfaceC0736n<File, ?>> list2 = this.f4047g;
                        int i = this.f4048h;
                        this.f4048h = i + 1;
                        InterfaceC0736n<File, ?> interfaceC0736n = list2.get(i);
                        File file = this.f4050j;
                        C0704h<?> c0704h = this.f4043c;
                        this.f4049i = interfaceC0736n.mo2426a(file, c0704h.f4098e, c0704h.f4099f, c0704h.f4102i);
                        if (this.f4049i != null && this.f4043c.m2373g(this.f4049i.f4329c.mo2291a())) {
                            this.f4049i.f4329c.mo2297e(this.f4043c.f4108o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f4045e + 1;
            this.f4045e = i2;
            if (i2 >= this.f4042b.size()) {
                return false;
            }
            InterfaceC0645m interfaceC0645m = this.f4042b.get(this.f4045e);
            C0704h<?> c0704h2 = this.f4043c;
            File fileMo2356b = c0704h2.m2368b().mo2356b(new C0700e(interfaceC0645m, c0704h2.f4107n));
            this.f4050j = fileMo2356b;
            if (fileMo2356b != null) {
                this.f4046f = interfaceC0645m;
                this.f4047g = this.f4043c.f4096c.f3780b.m2215f(fileMo2356b);
                this.f4048h = 0;
            }
        }
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0703g
    public void cancel() {
        InterfaceC0736n.a<?> aVar = this.f4049i;
        if (aVar != null) {
            aVar.f4329c.cancel();
        }
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
    /* JADX INFO: renamed from: d */
    public void mo2299d(Exception exc) {
        this.f4044d.mo2316d(this.f4046f, exc, this.f4049i.f4329c, EnumC0633a.DATA_DISK_CACHE);
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
    /* JADX INFO: renamed from: f */
    public void mo2300f(Object obj) {
        this.f4044d.mo2315c(this.f4046f, obj, this.f4049i.f4329c, EnumC0633a.DATA_DISK_CACHE, this.f4046f);
    }
}
