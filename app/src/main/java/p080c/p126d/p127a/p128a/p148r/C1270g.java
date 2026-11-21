package p080c.p126d.p127a.p128a.p148r;

import android.content.Context;
import android.view.SubMenu;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;

/* JADX INFO: renamed from: c.d.a.a.r.g */
/* JADX INFO: loaded from: classes.dex */
public class C1270g extends C0229g {
    public C1270g(Context context) {
        super(context);
    }

    @Override // p006b.p008b.p016h.p017i.C0229g, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0231i c0231i = (C0231i) m941a(i, i2, i3, charSequence);
        C1272i c1272i = new C1272i(this.f1630a, this, c0231i);
        c0231i.f1675o = c1272i;
        c1272i.setHeaderTitle(c0231i.f1665e);
        return c1272i;
    }
}
