package p006b.p056m.p057b;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: b.m.b.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0460e0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0476m0 f3005c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f3006d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Fragment f3007e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f3008f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ArrayList f3009g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f3010h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3011i;

    public RunnableC0460e0(Object obj, AbstractC0476m0 abstractC0476m0, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f3004b = obj;
        this.f3005c = abstractC0476m0;
        this.f3006d = view;
        this.f3007e = fragment;
        this.f3008f = arrayList;
        this.f3009g = arrayList2;
        this.f3010h = arrayList3;
        this.f3011i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f3004b;
        if (obj != null) {
            this.f3005c.mo1765m(obj, this.f3006d);
            this.f3009g.addAll(C0466h0.m1750h(this.f3005c, this.f3004b, this.f3007e, this.f3008f, this.f3006d));
        }
        if (this.f3010h != null) {
            if (this.f3011i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f3006d);
                this.f3005c.mo1766n(this.f3011i, this.f3010h, arrayList);
            }
            this.f3010h.clear();
            this.f3010h.add(this.f3006d);
        }
    }
}
