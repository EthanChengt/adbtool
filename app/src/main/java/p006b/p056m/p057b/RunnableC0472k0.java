package p006b.p056m.p057b;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.m.b.k0 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0472k0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f3076c;

    public RunnableC0472k0(AbstractC0476m0 abstractC0476m0, ArrayList arrayList, Map map) {
        this.f3075b = arrayList;
        this.f3076c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f3075b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f3075b.get(i);
            String strM1568k = C0418m.m1568k(view);
            if (strM1568k != null) {
                Iterator it = this.f3076c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (strM1568k.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                C0418m.m1580w(view, str);
            }
        }
    }
}
