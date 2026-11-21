package p006b.p078z.p079a;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;
import p006b.p032h.p044j.InterfaceC0415j;

/* JADX INFO: renamed from: b.z.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0613b implements InterfaceC0415j {

    /* JADX INFO: renamed from: a */
    public final Rect f3750a = new Rect();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPager f3751b;

    public C0613b(ViewPager viewPager) {
        this.f3751b = viewPager;
    }

    @Override // p006b.p032h.p044j.InterfaceC0415j
    /* JADX INFO: renamed from: a */
    public C0427v mo162a(View view, C0427v c0427v) {
        C0427v c0427vM1573p = C0418m.m1573p(view, c0427v);
        if (c0427vM1573p.m1604e()) {
            return c0427vM1573p;
        }
        Rect rect = this.f3750a;
        rect.left = c0427vM1573p.m1601b();
        rect.top = c0427vM1573p.m1603d();
        rect.right = c0427vM1573p.m1602c();
        rect.bottom = c0427vM1573p.m1600a();
        int childCount = this.f3751b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0427v c0427vM1561d = C0418m.m1561d(this.f3751b.getChildAt(i), c0427vM1573p);
            rect.left = Math.min(c0427vM1561d.m1601b(), rect.left);
            rect.top = Math.min(c0427vM1561d.m1603d(), rect.top);
            rect.right = Math.min(c0427vM1561d.m1602c(), rect.right);
            rect.bottom = Math.min(c0427vM1561d.m1600a(), rect.bottom);
        }
        return c0427vM1573p.m1605f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
