package p080c.p126d.p127a.p128a.p154x;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;
import p080c.p126d.p127a.p128a.p153w.C1288a;

/* JADX INFO: renamed from: c.d.a.a.x.l */
/* JADX INFO: loaded from: classes.dex */
public class C1301l extends C1302m.f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f6288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Matrix f6289c;

    public C1301l(C1302m c1302m, List list, Matrix matrix) {
        this.f6288b = list;
        this.f6289c = matrix;
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1302m.f
    /* JADX INFO: renamed from: a */
    public void mo2997a(Matrix matrix, C1288a c1288a, int i, Canvas canvas) {
        Iterator it = this.f6288b.iterator();
        while (it.hasNext()) {
            ((C1302m.f) it.next()).mo2997a(this.f6289c, c1288a, i, canvas);
        }
    }
}
