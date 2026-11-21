package p080c.p084b.p085a.p088m.p089t;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.b.a.m.t.f */
/* JADX INFO: loaded from: classes.dex */
public class C0657f {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0656e.a<?> f3954b = new a();

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, InterfaceC0656e.a<?>> f3955a = new HashMap();

    /* JADX INFO: renamed from: c.b.a.m.t.f$a */
    public class a implements InterfaceC0656e.a<Object> {
        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: a */
        public Class<Object> mo2303a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e.a
        /* JADX INFO: renamed from: b */
        public InterfaceC0656e<Object> mo2304b(Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.t.f$b */
    public static final class b implements InterfaceC0656e<Object> {

        /* JADX INFO: renamed from: a */
        public final Object f3956a;

        public b(Object obj) {
            this.f3956a = obj;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
        /* JADX INFO: renamed from: a */
        public Object mo2301a() {
            return this.f3956a;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0656e
        /* JADX INFO: renamed from: b */
        public void mo2302b() {
        }
    }
}
