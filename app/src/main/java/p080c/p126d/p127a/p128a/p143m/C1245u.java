package p080c.p126d.p127a.p128a.p143m;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* JADX INFO: renamed from: c.d.a.a.m.u */
/* JADX INFO: loaded from: classes.dex */
public class C1245u implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCalendarGridView f5953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1246v f5954c;

    public C1245u(C1246v c1246v, MaterialCalendarGridView materialCalendarGridView) {
        this.f5954c = c1246v;
        this.f5953b = materialCalendarGridView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1244t adapter = this.f5953b.getAdapter();
        if (i >= adapter.m2875a() && i <= adapter.m2877c()) {
            C1231g.f fVar = this.f5954c.f5957e;
            long jLongValue = this.f5953b.getAdapter().getItem(i).longValue();
            C1231g.d dVar = (C1231g.d) fVar;
            if (C1231g.this.f5889Y.f5856e.mo2845e(jLongValue)) {
                C1231g.this.f5888X.m2854g(jLongValue);
                Iterator it = C1231g.this.f5961V.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1247w) it.next()).mo2866a(C1231g.this.f5888X.m2849a());
                }
                C1231g.this.f5894d0.getAdapter().f947a.m542b();
                RecyclerView recyclerView = C1231g.this.f5893c0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f947a.m542b();
                }
            }
        }
    }
}
