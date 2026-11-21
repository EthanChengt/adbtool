package p006b.p008b.p009c;

import android.view.View;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0425t;

/* JADX INFO: renamed from: b.b.c.r */
/* JADX INFO: loaded from: classes.dex */
public class C0202r extends C0425t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0197m f1342a;

    public C0202r(LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m) {
        this.f1342a = layoutInflaterFactory2C0197m;
    }

    @Override // p006b.p032h.p044j.InterfaceC0424s
    /* JADX INFO: renamed from: a */
    public void mo849a(View view) {
        this.f1342a.f1293p.setAlpha(1.0f);
        this.f1342a.f1296s.m1594d(null);
        this.f1342a.f1296s = null;
    }

    @Override // p006b.p032h.p044j.C0425t, p006b.p032h.p044j.InterfaceC0424s
    /* JADX INFO: renamed from: b */
    public void mo857b(View view) {
        this.f1342a.f1293p.setVisibility(0);
        this.f1342a.f1293p.sendAccessibilityEvent(32);
        if (this.f1342a.f1293p.getParent() instanceof View) {
            C0418m.m1576s((View) this.f1342a.f1293p.getParent());
        }
    }
}
