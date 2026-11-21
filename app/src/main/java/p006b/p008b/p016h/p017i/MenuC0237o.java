package p006b.p008b.p016h.p017i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p006b.p032h.p038e.p039a.InterfaceMenuC0385a;
import p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b;
import p006b.p032h.p038e.p039a.InterfaceSubMenuC0387c;

/* JADX INFO: renamed from: b.b.h.i.o */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0237o extends AbstractC0225c implements Menu {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuC0385a f1712d;

    public MenuC0237o(Context context, InterfaceMenuC0385a interfaceMenuC0385a) {
        super(context);
        if (interfaceMenuC0385a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1712d = interfaceMenuC0385a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m919c(this.f1712d.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m919c(this.f1712d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m919c(this.f1712d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m919c(this.f1712d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f1712d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m919c(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m920d(this.f1712d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m920d(this.f1712d.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m920d(this.f1712d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m920d(this.f1712d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        Map<InterfaceMenuItemC0386b, MenuItem> map = this.f1577b;
        if (map != null) {
            map.clear();
        }
        Map<InterfaceSubMenuC0387c, SubMenu> map2 = this.f1578c;
        if (map2 != null) {
            map2.clear();
        }
        this.f1712d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1712d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m919c(this.f1712d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m919c(this.f1712d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1712d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1712d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f1712d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1712d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        Map<InterfaceMenuItemC0386b, MenuItem> map = this.f1577b;
        if (map != null) {
            Iterator<InterfaceMenuItemC0386b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
        this.f1712d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        Map<InterfaceMenuItemC0386b, MenuItem> map = this.f1577b;
        if (map != null) {
            Iterator<InterfaceMenuItemC0386b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        this.f1712d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1712d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f1712d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f1712d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1712d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1712d.size();
    }
}
