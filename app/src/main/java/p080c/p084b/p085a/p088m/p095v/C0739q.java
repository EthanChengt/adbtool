package p080c.p084b.p085a.p088m.p095v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p043i.InterfaceC0403c;
import c.a.a.a.a;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p088m.p091u.C0714r;

/* JADX INFO: renamed from: c.b.a.m.v.q */
/* JADX INFO: loaded from: classes.dex */
public class C0739q<Model, Data> implements InterfaceC0736n<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC0736n<Model, Data>> f4334a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0403c<List<Throwable>> f4335b;

    /* JADX INFO: renamed from: c.b.a.m.v.q$a */
    public static class a<Data> implements InterfaceC0655d<Data>, InterfaceC0655d.a<Data> {

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC0655d<Data>> f4336b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0403c<List<Throwable>> f4337c;

        /* JADX INFO: renamed from: d */
        public int f4338d;

        /* JADX INFO: renamed from: e */
        public EnumC0620f f4339e;

        /* JADX INFO: renamed from: f */
        public InterfaceC0655d.a<? super Data> f4340f;

        /* JADX INFO: renamed from: g */
        public List<Throwable> f4341g;

        /* JADX INFO: renamed from: h */
        public boolean f4342h;

        public a(List<InterfaceC0655d<Data>> list, InterfaceC0403c<List<Throwable>> interfaceC0403c) {
            this.f4337c = interfaceC0403c;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f4336b = list;
            this.f4338d = 0;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<Data> mo2291a() {
            return this.f4336b.get(0).mo2291a();
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: b */
        public void mo2294b() {
            List<Throwable> list = this.f4341g;
            if (list != null) {
                this.f4337c.mo1536a(list);
            }
            this.f4341g = null;
            Iterator<InterfaceC0655d<Data>> it = this.f4336b.iterator();
            while (it.hasNext()) {
                it.next().mo2294b();
            }
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: c */
        public EnumC0633a mo2295c() {
            return this.f4336b.get(0).mo2295c();
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        public void cancel() {
            this.f4342h = true;
            Iterator<InterfaceC0655d<Data>> it = this.f4336b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
        /* JADX INFO: renamed from: d */
        public void mo2299d(Exception exc) {
            List<Throwable> list = this.f4341g;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            m2443g();
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: e */
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super Data> aVar) {
            this.f4339e = enumC0620f;
            this.f4340f = aVar;
            this.f4341g = this.f4337c.mo1537b();
            this.f4336b.get(this.f4338d).mo2297e(enumC0620f, this);
            if (this.f4342h) {
                cancel();
            }
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
        /* JADX INFO: renamed from: f */
        public void mo2300f(Data data) {
            if (data != null) {
                this.f4340f.mo2300f(data);
            } else {
                m2443g();
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m2443g() {
            if (this.f4342h) {
                return;
            }
            if (this.f4338d < this.f4336b.size() - 1) {
                this.f4338d++;
                mo2297e(this.f4339e, this.f4340f);
            } else {
                Objects.requireNonNull(this.f4341g, "Argument must not be null");
                this.f4340f.mo2299d(new C0714r("Fetch failed", new ArrayList(this.f4341g)));
            }
        }
    }

    public C0739q(List<InterfaceC0736n<Model, Data>> list, InterfaceC0403c<List<Throwable>> interfaceC0403c) {
        this.f4334a = list;
        this.f4335b = interfaceC0403c;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<Data> mo2426a(Model model, int i, int i2, C0647o c0647o) {
        InterfaceC0736n.a<Data> aVarMo2426a;
        int size = this.f4334a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC0645m interfaceC0645m = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0736n<Model, Data> interfaceC0736n = this.f4334a.get(i3);
            if (interfaceC0736n.mo2427b(model) && (aVarMo2426a = interfaceC0736n.mo2426a(model, i, i2, c0647o)) != null) {
                interfaceC0645m = aVarMo2426a.f4327a;
                arrayList.add(aVarMo2426a.f4329c);
            }
        }
        if (arrayList.isEmpty() || interfaceC0645m == null) {
            return null;
        }
        return new InterfaceC0736n.a<>(interfaceC0645m, new a(arrayList, this.f4335b));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Model model) {
        Iterator<InterfaceC0736n<Model, Data>> it = this.f4334a.iterator();
        while (it.hasNext()) {
            if (it.next().mo2427b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("MultiModelLoader{modelLoaders=");
        sbM2191e.append(Arrays.toString(this.f4334a.toArray()));
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
