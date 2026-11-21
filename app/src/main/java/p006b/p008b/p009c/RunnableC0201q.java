package p006b.p008b.p009c;

import android.view.View;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0423r;
import p006b.p032h.p044j.C0425t;

/* JADX INFO: renamed from: b.b.c.q */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0201q implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0197m f1340b;

    /* JADX INFO: renamed from: b.b.c.q$a */
    public class a extends C0425t {
        public a() {
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: a */
        public void mo849a(View view) {
            RunnableC0201q.this.f1340b.f1293p.setAlpha(1.0f);
            RunnableC0201q.this.f1340b.f1296s.m1594d(null);
            RunnableC0201q.this.f1340b.f1296s = null;
        }

        @Override // p006b.p032h.p044j.C0425t, p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: b */
        public void mo857b(View view) {
            RunnableC0201q.this.f1340b.f1293p.setVisibility(0);
        }
    }

    public RunnableC0201q(LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m) {
        this.f1340b = layoutInflaterFactory2C0197m;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = this.f1340b;
        layoutInflaterFactory2C0197m.f1294q.showAtLocation(layoutInflaterFactory2C0197m.f1293p, 55, 0, 0);
        this.f1340b.m830I();
        if (!this.f1340b.m842U()) {
            this.f1340b.f1293p.setAlpha(1.0f);
            this.f1340b.f1293p.setVisibility(0);
            return;
        }
        this.f1340b.f1293p.setAlpha(0.0f);
        LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m2 = this.f1340b;
        C0423r c0423rM1558a = C0418m.m1558a(layoutInflaterFactory2C0197m2.f1293p);
        c0423rM1558a.m1591a(1.0f);
        layoutInflaterFactory2C0197m2.f1296s = c0423rM1558a;
        C0423r c0423r = this.f1340b.f1296s;
        a aVar = new a();
        View view = c0423r.f2732a.get();
        if (view != null) {
            c0423r.m1595e(view, aVar);
        }
    }
}
