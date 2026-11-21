package p006b.p008b.p009c;

import android.view.View;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;
import p006b.p032h.p044j.InterfaceC0415j;

/* JADX INFO: renamed from: b.b.c.n */
/* JADX INFO: loaded from: classes.dex */
public class C0198n implements InterfaceC0415j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0197m f1337a;

    public C0198n(LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m) {
        this.f1337a = layoutInflaterFactory2C0197m;
    }

    @Override // p006b.p032h.p044j.InterfaceC0415j
    /* JADX INFO: renamed from: a */
    public C0427v mo162a(View view, C0427v c0427v) {
        int iM1603d = c0427v.m1603d();
        int iM844W = this.f1337a.m844W(iM1603d);
        if (iM1603d != iM844W) {
            c0427v = c0427v.m1605f(c0427v.m1601b(), iM844W, c0427v.m1602c(), c0427v.m1600a());
        }
        return C0418m.m1573p(view, c0427v);
    }
}
