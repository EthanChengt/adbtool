package p080c.p084b.p085a.p088m.p095v;

import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.v */
/* JADX INFO: loaded from: classes.dex */
public class C0744v<Model> implements InterfaceC0736n<Model, Model> {

    /* JADX INFO: renamed from: a */
    public static final C0744v<?> f4360a = new C0744v<>();

    /* JADX INFO: renamed from: c.b.a.m.v.v$a */
    public static class a<Model> implements InterfaceC0737o<Model, Model> {

        /* JADX INFO: renamed from: a */
        public static final a<?> f4361a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Model, Model> mo2429b(C0740r c0740r) {
            return C0744v.f4360a;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.v$b */
    public static class b<Model> implements InterfaceC0655d<Model> {

        /* JADX INFO: renamed from: b */
        public final Model f4362b;

        public b(Model model) {
            this.f4362b = model;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: a */
        public Class<Model> mo2291a() {
            return (Class<Model>) this.f4362b.getClass();
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: b */
        public void mo2294b() {
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: c */
        public EnumC0633a mo2295c() {
            return EnumC0633a.LOCAL;
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        public void cancel() {
        }

        @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
        /* JADX INFO: renamed from: e */
        public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super Model> aVar) {
            aVar.mo2300f(this.f4362b);
        }
    }

    @Deprecated
    public C0744v() {
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a<Model> mo2426a(Model model, int i, int i2, C0647o c0647o) {
        return new InterfaceC0736n.a<>(new C0865d(model), new b(model));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Model model) {
        return true;
    }
}
