package p006b.p032h.p044j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.h.j.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0407b {

    /* JADX INFO: renamed from: a */
    public a f2703a;

    /* JADX INFO: renamed from: b.h.j.b$a */
    public interface a {
    }

    public AbstractC0407b(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo979a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo983b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract View mo980c();

    /* JADX INFO: renamed from: d */
    public View mo984d(MenuItem menuItem) {
        return mo980c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo981e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void mo982f(SubMenu subMenu) {
    }

    /* JADX INFO: renamed from: g */
    public boolean mo985g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo986h(a aVar) {
        if (this.f2703a != null) {
            StringBuilder sbM2191e = a.m2191e("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sbM2191e.append(getClass().getSimpleName());
            sbM2191e.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sbM2191e.toString());
        }
        this.f2703a = aVar;
    }
}
