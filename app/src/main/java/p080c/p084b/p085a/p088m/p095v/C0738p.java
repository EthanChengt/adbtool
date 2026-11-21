package p080c.p084b.p085a.p088m.p095v;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p006b.p032h.p043i.InterfaceC0403c;

/* JADX INFO: renamed from: c.b.a.m.v.p */
/* JADX INFO: loaded from: classes.dex */
public class C0738p {

    /* JADX INFO: renamed from: a */
    public final C0740r f4330a;

    /* JADX INFO: renamed from: b */
    public final a f4331b;

    /* JADX INFO: renamed from: c.b.a.m.v.p$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, C1398a<?>> f4332a = new HashMap();

        /* JADX INFO: renamed from: c.b.a.m.v.p$a$a, reason: collision with other inner class name */
        public static class C1398a<Model> {

            /* JADX INFO: renamed from: a */
            public final List<InterfaceC0736n<Model, ?>> f4333a;

            public C1398a(List<InterfaceC0736n<Model, ?>> list) {
                this.f4333a = list;
            }
        }
    }

    public C0738p(InterfaceC0403c<List<Throwable>> interfaceC0403c) {
        C0740r c0740r = new C0740r(interfaceC0403c);
        this.f4331b = new a();
        this.f4330a = c0740r;
    }
}
