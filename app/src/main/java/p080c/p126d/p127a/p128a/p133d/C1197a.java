package p080c.p126d.p127a.p128a.p133d;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;
import p006b.p032h.p044j.InterfaceC0415j;

/* JADX INFO: renamed from: c.d.a.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1197a implements InterfaceC0415j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppBarLayout f5686a;

    public C1197a(AppBarLayout appBarLayout) {
        this.f5686a = appBarLayout;
    }

    @Override // p006b.p032h.p044j.InterfaceC0415j
    /* JADX INFO: renamed from: a */
    public C0427v mo162a(View view, C0427v c0427v) {
        AppBarLayout appBarLayout = this.f5686a;
        Objects.requireNonNull(appBarLayout);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        C0427v c0427v2 = appBarLayout.getFitsSystemWindows() ? c0427v : null;
        if (!Objects.equals(appBarLayout.f10121h, c0427v2)) {
            appBarLayout.f10121h = c0427v2;
            appBarLayout.m3047f();
            appBarLayout.requestLayout();
        }
        return c0427v;
    }
}
