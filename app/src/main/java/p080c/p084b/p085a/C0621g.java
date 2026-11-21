package p080c.p084b.p085a;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p043i.C0405e;
import p006b.p032h.p043i.InterfaceC0403c;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.InterfaceC0636d;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.InterfaceC0650r;
import p080c.p084b.p085a.p088m.p089t.C0657f;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0656e;
import p080c.p084b.p085a.p088m.p095v.C0738p;
import p080c.p084b.p085a.p088m.p095v.C0740r;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0737o;
import p080c.p084b.p085a.p088m.p097w.p103h.C0807f;
import p080c.p084b.p085a.p088m.p097w.p103h.InterfaceC0806e;
import p080c.p084b.p085a.p106p.C0835a;
import p080c.p084b.p085a.p106p.C0836b;
import p080c.p084b.p085a.p106p.C0837c;
import p080c.p084b.p085a.p106p.C0838d;
import p080c.p084b.p085a.p106p.C0839e;
import p080c.p084b.p085a.p106p.C0840f;
import p080c.p084b.p085a.p111s.p112k.C0876a;
import p080c.p084b.p085a.p111s.p112k.C0877b;
import p080c.p084b.p085a.p111s.p112k.C0878c;

/* JADX INFO: renamed from: c.b.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0621g {

    /* JADX INFO: renamed from: a */
    public final C0738p f3796a;

    /* JADX INFO: renamed from: b */
    public final C0835a f3797b;

    /* JADX INFO: renamed from: c */
    public final C0839e f3798c;

    /* JADX INFO: renamed from: d */
    public final C0840f f3799d;

    /* JADX INFO: renamed from: e */
    public final C0657f f3800e;

    /* JADX INFO: renamed from: f */
    public final C0807f f3801f;

    /* JADX INFO: renamed from: g */
    public final C0836b f3802g;

    /* JADX INFO: renamed from: h */
    public final C0838d f3803h = new C0838d();

    /* JADX INFO: renamed from: i */
    public final C0837c f3804i = new C0837c();

    /* JADX INFO: renamed from: j */
    public final InterfaceC0403c<List<Throwable>> f3805j;

    /* JADX INFO: renamed from: c.b.a.g$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: c.b.a.g$b */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: renamed from: c.b.a.g$c */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Object obj) {
            StringBuilder sbM2191e = a.m2191e("Failed to find any ModelLoaders registered for model class: ");
            sbM2191e.append(obj.getClass());
            super(sbM2191e.toString());
        }

        public <M> c(M m, List<InterfaceC0736n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }
    }

    /* JADX INFO: renamed from: c.b.a.g$d */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: renamed from: c.b.a.g$e */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C0621g() {
        C0876a.c cVar = new C0876a.c(new C0405e(20), new C0877b(), new C0878c());
        this.f3805j = cVar;
        this.f3796a = new C0738p(cVar);
        this.f3797b = new C0835a();
        this.f3798c = new C0839e();
        this.f3799d = new C0840f();
        this.f3800e = new C0657f();
        this.f3801f = new C0807f();
        this.f3802g = new C0836b();
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C0839e c0839e = this.f3798c;
        synchronized (c0839e) {
            ArrayList<String> arrayList2 = new ArrayList(c0839e.f4607a);
            c0839e.f4607a.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c0839e.f4607a.add((String) it2.next());
            }
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    c0839e.f4607a.add(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public <Data> C0621g m2210a(Class<Data> cls, InterfaceC0636d<Data> interfaceC0636d) {
        C0835a c0835a = this.f3797b;
        synchronized (c0835a) {
            c0835a.f4598a.add(new C0835a.a<>(cls, interfaceC0636d));
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public <TResource> C0621g m2211b(Class<TResource> cls, InterfaceC0650r<TResource> interfaceC0650r) {
        C0840f c0840f = this.f3799d;
        synchronized (c0840f) {
            c0840f.f4612a.add(new C0840f.a<>(cls, interfaceC0650r));
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public <Model, Data> C0621g m2212c(Class<Model> cls, Class<Data> cls2, InterfaceC0737o<Model, Data> interfaceC0737o) {
        C0738p c0738p = this.f3796a;
        synchronized (c0738p) {
            C0740r c0740r = c0738p.f4330a;
            synchronized (c0740r) {
                C0740r.b<?, ?> bVar = new C0740r.b<>(cls, cls2, interfaceC0737o);
                List<C0740r.b<?, ?>> list = c0740r.f4345a;
                list.add(list.size(), bVar);
            }
            c0738p.f4331b.f4332a.clear();
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public <Data, TResource> C0621g m2213d(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC0649q<Data, TResource> interfaceC0649q) {
        C0839e c0839e = this.f3798c;
        synchronized (c0839e) {
            c0839e.m2539a(str).add(new C0839e.a<>(cls, cls2, interfaceC0649q));
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public List<ImageHeaderParser> m2214e() {
        List<ImageHeaderParser> list;
        C0836b c0836b = this.f3802g;
        synchronized (c0836b) {
            list = c0836b.f4601a;
        }
        if (list.isEmpty()) {
            throw new b();
        }
        return list;
    }

    /* JADX INFO: renamed from: f */
    public <Model> List<InterfaceC0736n<Model, ?>> m2215f(Model model) {
        List<InterfaceC0736n<?, ?>> listUnmodifiableList;
        C0738p c0738p = this.f3796a;
        Objects.requireNonNull(c0738p);
        Class<?> cls = model.getClass();
        synchronized (c0738p) {
            C0738p.a.C1398a<?> c1398a = c0738p.f4331b.f4332a.get(cls);
            listUnmodifiableList = c1398a == null ? null : c1398a.f4333a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c0738p.f4330a.m2446c(cls));
                if (c0738p.f4331b.f4332a.put(cls, new C0738p.a.C1398a<>(listUnmodifiableList)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new c(model);
        }
        int size = listUnmodifiableList.size();
        List<InterfaceC0736n<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC0736n<?, ?> interfaceC0736n = listUnmodifiableList.get(i);
            if (interfaceC0736n.mo2427b(model)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(interfaceC0736n);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new c(model, (List<InterfaceC0736n<Model, ?>>) listUnmodifiableList);
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: g */
    public C0621g m2216g(InterfaceC0656e.a<?> aVar) {
        C0657f c0657f = this.f3800e;
        synchronized (c0657f) {
            c0657f.f3955a.put(aVar.mo2303a(), aVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public <TResource, Transcode> C0621g m2217h(Class<TResource> cls, Class<Transcode> cls2, InterfaceC0806e<TResource, Transcode> interfaceC0806e) {
        C0807f c0807f = this.f3801f;
        synchronized (c0807f) {
            c0807f.f4559a.add(new C0807f.a<>(cls, cls2, interfaceC0806e));
        }
        return this;
    }
}
