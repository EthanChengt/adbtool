package p080c.p084b.p085a.p088m.p091u;

import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p088m.p095v.InterfaceC0736n;

/* JADX INFO: renamed from: c.b.a.m.u.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0671a0 implements InterfaceC0655d.a<Object> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0736n.a f3994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0673b0 f3995c;

    public C0671a0(C0673b0 c0673b0, InterfaceC0736n.a aVar) {
        this.f3995c = c0673b0;
        this.f3994b = aVar;
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
    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
    /* JADX INFO: renamed from: d */
    public void mo2299d(Exception exc) {
        C0673b0 c0673b0 = this.f3995c;
        InterfaceC0736n.a<?> aVar = this.f3994b;
        InterfaceC0736n.a<?> aVar2 = c0673b0.f4002g;
        if (aVar2 != null && aVar2 == aVar) {
            C0673b0 c0673b1 = this.f3995c;
            InterfaceC0736n.a aVar3 = this.f3994b;
            InterfaceC0703g.a aVar4 = c0673b1.f3998c;
            InterfaceC0645m interfaceC0645m = c0673b1.f4003h;
            InterfaceC0655d<Data> interfaceC0655d = aVar3.f4329c;
            aVar4.mo2316d(interfaceC0645m, exc, interfaceC0655d, interfaceC0655d.mo2295c());
        }
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
    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d.a
    /* JADX INFO: renamed from: f */
    public void mo2300f(Object obj) {
        C0673b0 c0673b0 = this.f3995c;
        InterfaceC0736n.a<?> aVar = this.f3994b;
        InterfaceC0736n.a<?> aVar2 = c0673b0.f4002g;
        if (aVar2 != null && aVar2 == aVar) {
            C0673b0 c0673b1 = this.f3995c;
            InterfaceC0736n.a aVar3 = this.f3994b;
            AbstractC0707k abstractC0707k = c0673b1.f3997b.f4109p;
            if (obj != null && abstractC0707k.mo2390c(aVar3.f4329c.mo2295c())) {
                c0673b1.f4001f = obj;
                c0673b1.f3998c.mo2314b();
            } else {
                InterfaceC0703g.a aVar4 = c0673b1.f3998c;
                InterfaceC0645m interfaceC0645m = aVar3.f4327a;
                InterfaceC0655d<Data> interfaceC0655d = aVar3.f4329c;
                aVar4.mo2315c(interfaceC0645m, obj, interfaceC0655d, interfaceC0655d.mo2295c(), c0673b1.f4003h);
            }
        }
    }
}
