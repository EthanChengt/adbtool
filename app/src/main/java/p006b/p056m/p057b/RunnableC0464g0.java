package p006b.p056m.p057b;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p006b.p025e.C0313a;

/* JADX INFO: renamed from: b.m.b.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0464g0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0476m0 f3025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0313a f3026c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3027d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0466h0.b f3028e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f3029f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f3030g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Fragment f3031h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Fragment f3032i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f3033j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ArrayList f3034k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f3035l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Rect f3036m;

    public RunnableC0464g0(AbstractC0476m0 abstractC0476m0, C0313a c0313a, Object obj, C0466h0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f3025b = abstractC0476m0;
        this.f3026c = c0313a;
        this.f3027d = obj;
        this.f3028e = bVar;
        this.f3029f = arrayList;
        this.f3030g = view;
        this.f3031h = fragment;
        this.f3032i = fragment2;
        this.f3033j = z;
        this.f3034k = arrayList2;
        this.f3035l = obj2;
        this.f3036m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0313a<String, View> c0313aM1747e = C0466h0.m1747e(this.f3025b, this.f3026c, this.f3027d, this.f3028e);
        if (c0313aM1747e != null) {
            this.f3029f.addAll(c0313aM1747e.values());
            this.f3029f.add(this.f3030g);
        }
        C0466h0.m1745c(this.f3031h, this.f3032i, this.f3033j, c0313aM1747e, false);
        Object obj = this.f3027d;
        if (obj != null) {
            this.f3025b.mo1773u(obj, this.f3034k, this.f3029f);
            View viewM1753k = C0466h0.m1753k(c0313aM1747e, this.f3028e, this.f3035l, this.f3033j);
            if (viewM1753k != null) {
                this.f3025b.m1782j(viewM1753k, this.f3036m);
            }
        }
    }
}
