package p006b.p056m.p057b;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.m.b.l0 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0474l0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f3081c;

    public RunnableC0474l0(AbstractC0476m0 abstractC0476m0, ArrayList arrayList, Map map) {
        this.f3080b = arrayList;
        this.f3081c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f3080b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f3080b.get(i);
            C0418m.m1580w(view, (String) this.f3081c.get(C0418m.m1568k(view)));
        }
    }
}
