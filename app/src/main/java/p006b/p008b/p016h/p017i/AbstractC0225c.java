package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;
import p006b.p025e.C0313a;
import p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b;
import p006b.p032h.p038e.p039a.InterfaceSubMenuC0387c;

/* JADX INFO: renamed from: b.b.h.i.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0225c {

    /* JADX INFO: renamed from: a */
    public final Context f1576a;

    /* JADX INFO: renamed from: b */
    public Map<InterfaceMenuItemC0386b, MenuItem> f1577b;

    /* JADX INFO: renamed from: c */
    public Map<InterfaceSubMenuC0387c, SubMenu> f1578c;

    public AbstractC0225c(Context context) {
        this.f1576a = context;
    }

    /* JADX INFO: renamed from: c */
    public final MenuItem m919c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0386b)) {
            return menuItem;
        }
        InterfaceMenuItemC0386b interfaceMenuItemC0386b = (InterfaceMenuItemC0386b) menuItem;
        if (this.f1577b == null) {
            this.f1577b = new C0313a();
        }
        MenuItem menuItem2 = this.f1577b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0232j menuItemC0232j = new MenuItemC0232j(this.f1576a, interfaceMenuItemC0386b);
        this.f1577b.put(interfaceMenuItemC0386b, menuItemC0232j);
        return menuItemC0232j;
    }

    /* JADX INFO: renamed from: d */
    public final SubMenu m920d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0387c)) {
            return subMenu;
        }
        InterfaceSubMenuC0387c interfaceSubMenuC0387c = (InterfaceSubMenuC0387c) subMenu;
        if (this.f1578c == null) {
            this.f1578c = new C0313a();
        }
        SubMenu subMenu2 = this.f1578c.get(interfaceSubMenuC0387c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0241s subMenuC0241s = new SubMenuC0241s(this.f1576a, interfaceSubMenuC0387c);
        this.f1578c.put(interfaceSubMenuC0387c, subMenuC0241s);
        return subMenuC0241s;
    }
}
