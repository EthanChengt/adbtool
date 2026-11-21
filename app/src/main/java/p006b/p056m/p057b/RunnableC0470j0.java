package p006b.p056m.p057b;

import android.view.View;
import java.util.ArrayList;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.m.b.j0 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0470j0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3070b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f3071c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f3072d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f3073e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f3074f;

    public RunnableC0470j0(AbstractC0476m0 abstractC0476m0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f3070b = i;
        this.f3071c = arrayList;
        this.f3072d = arrayList2;
        this.f3073e = arrayList3;
        this.f3074f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f3070b; i++) {
            C0418m.m1580w((View) this.f3071c.get(i), (String) this.f3072d.get(i));
            C0418m.m1580w((View) this.f3073e.get(i), (String) this.f3074f.get(i));
        }
    }
}
