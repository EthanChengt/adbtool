package c.c.a;

import androidx.viewpager.widget.ViewPager;
import com.didjdk.adbhelper.MainActivity;
import c.a.a.a.a;
import c.c.a.v3.g0;
import c.c.a.v3.k0.C1054t;

/* JADX INFO: renamed from: c.c.a.n3 */
/* JADX INFO: loaded from: classes.dex */
public class C0949n3 implements ViewPager.InterfaceC0176i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f4862a;

    public C0949n3(MainActivity mainActivity) {
        this.f4862a = mainActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0176i
    /* JADX INFO: renamed from: a */
    public void mo750a(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0176i
    /* JADX INFO: renamed from: b */
    public void mo751b(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0176i
    /* JADX INFO: renamed from: c */
    public void mo752c(int i) {
        MainActivity mainActivity = this.f4862a;
        mainActivity.f6470z = i;
        mainActivity.m792r().mo772p(this.f4862a.f6456H.f4839c.get(i).intValue());
        g0 abstractC1002g0 = MainActivity.this.f6456H.f4837a.get(i);
        StringBuilder sbM2191e = a.m2191e("onPageSelected ");
        sbM2191e.append(this.f4862a.f6456H.m2622a(1));
        sbM2191e.toString();
        if (abstractC1002g0.f4966V && abstractC1002g0.m264B()) {
            abstractC1002g0.mo2641I0();
        }
        C1054t c1054t = (C1054t) this.f4862a.f6456H.m2622a(3);
        if (i == 3) {
            this.f4862a.f6453E.setVisibility(8);
            this.f4862a.f6454F.setVisibility(0);
            MainActivity mainActivity2 = this.f4862a;
            c1054t.m2674Q0(true, mainActivity2.f6455G, mainActivity2.f6454F);
            return;
        }
        if (i != 4) {
            this.f4862a.f6453E.setVisibility(8);
            this.f4862a.f6454F.setVisibility(8);
        } else {
            this.f4862a.f6454F.setVisibility(8);
            this.f4862a.f6453E.setVisibility(0);
        }
        this.f4862a.f6455G.setVisibility(8);
    }
}
