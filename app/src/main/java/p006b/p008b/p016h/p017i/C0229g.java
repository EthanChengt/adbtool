package p006b.p008b.p016h.p017i;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p038e.p039a.InterfaceMenuC0385a;
import p006b.p032h.p044j.AbstractC0407b;
import p006b.p032h.p044j.C0422q;

/* JADX INFO: renamed from: b.b.h.i.g */
/* JADX INFO: loaded from: classes.dex */
public class C0229g implements InterfaceMenuC0385a {

    /* JADX INFO: renamed from: y */
    public static final int[] f1629y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f1630a;

    /* JADX INFO: renamed from: b */
    public final Resources f1631b;

    /* JADX INFO: renamed from: c */
    public boolean f1632c;

    /* JADX INFO: renamed from: d */
    public boolean f1633d;

    /* JADX INFO: renamed from: e */
    public a f1634e;

    /* JADX INFO: renamed from: f */
    public ArrayList<C0231i> f1635f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C0231i> f1636g;

    /* JADX INFO: renamed from: h */
    public boolean f1637h;

    /* JADX INFO: renamed from: i */
    public ArrayList<C0231i> f1638i;

    /* JADX INFO: renamed from: j */
    public ArrayList<C0231i> f1639j;

    /* JADX INFO: renamed from: k */
    public boolean f1640k;

    /* JADX INFO: renamed from: m */
    public CharSequence f1642m;

    /* JADX INFO: renamed from: n */
    public Drawable f1643n;

    /* JADX INFO: renamed from: o */
    public View f1644o;

    /* JADX INFO: renamed from: v */
    public C0231i f1651v;

    /* JADX INFO: renamed from: x */
    public boolean f1653x;

    /* JADX INFO: renamed from: l */
    public int f1641l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f1645p = false;

    /* JADX INFO: renamed from: q */
    public boolean f1646q = false;

    /* JADX INFO: renamed from: r */
    public boolean f1647r = false;

    /* JADX INFO: renamed from: s */
    public boolean f1648s = false;

    /* JADX INFO: renamed from: t */
    public ArrayList<C0231i> f1649t = new ArrayList<>();

    /* JADX INFO: renamed from: u */
    public CopyOnWriteArrayList<WeakReference<InterfaceC0235m>> f1650u = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: w */
    public boolean f1652w = false;

    /* JADX INFO: renamed from: b.b.h.i.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo62a(C0229g c0229g, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        void mo63b(C0229g c0229g);
    }

    /* JADX INFO: renamed from: b.b.h.i.g$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo23a(C0231i c0231i);
    }

    public C0229g(Context context) {
        boolean zShouldShowMenuShortcutsWhenKeyboardPresent;
        boolean z = false;
        this.f1630a = context;
        Resources resources = context.getResources();
        this.f1631b = resources;
        this.f1635f = new ArrayList<>();
        this.f1636g = new ArrayList<>();
        this.f1637h = true;
        this.f1638i = new ArrayList<>();
        this.f1639j = new ArrayList<>();
        this.f1640k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C0422q.f2731a;
            if (Build.VERSION.SDK_INT >= 28) {
                zShouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zShouldShowMenuShortcutsWhenKeyboardPresent = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zShouldShowMenuShortcutsWhenKeyboardPresent) {
                z = true;
            }
        }
        this.f1633d = z;
    }

    /* JADX INFO: renamed from: a */
    public MenuItem m941a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f1629y;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C0231i c0231i = new C0231i(this, i, i2, i3, i6, charSequence, this.f1641l);
                ArrayList<C0231i> arrayList = this.f1635f;
                int size = arrayList.size();
                do {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                    }
                    arrayList.add(i4, c0231i);
                    mo957q(true);
                    return c0231i;
                } while (arrayList.get(size).f1664d > i6);
                i4 = size + 1;
                arrayList.add(i4, c0231i);
                mo957q(true);
                return c0231i;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m941a(0, 0, 0, this.f1631b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m941a(i, i2, i3, this.f1631b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m941a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m941a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1630a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0231i c0231i = (C0231i) m941a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c0231i.setIcon(resolveInfo.loadIcon(packageManager));
            c0231i.setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c0231i;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1631b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1631b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0231i c0231i = (C0231i) m941a(i, i2, i3, charSequence);
        SubMenuC0240r subMenuC0240r = new SubMenuC0240r(this.f1630a, this, c0231i);
        c0231i.f1675o = subMenuC0240r;
        subMenuC0240r.setHeaderTitle(c0231i.f1665e);
        return subMenuC0240r;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m942b(InterfaceC0235m interfaceC0235m, Context context) {
        this.f1650u.add(new WeakReference<>(interfaceC0235m));
        interfaceC0235m.mo120g(context, this);
        this.f1640k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m943c(boolean z) {
        if (this.f1648s) {
            return;
        }
        this.f1648s = true;
        for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {
            InterfaceC0235m interfaceC0235m = weakReference.get();
            if (interfaceC0235m == null) {
                this.f1650u.remove(weakReference);
            } else {
                interfaceC0235m.mo116a(this, z);
            }
        }
        this.f1648s = false;
    }

    @Override // android.view.Menu
    public void clear() {
        C0231i c0231i = this.f1651v;
        if (c0231i != null) {
            mo944d(c0231i);
        }
        this.f1635f.clear();
        mo957q(true);
    }

    public void clearHeader() {
        this.f1643n = null;
        this.f1642m = null;
        this.f1644o = null;
        mo957q(false);
    }

    @Override // android.view.Menu
    public void close() {
        m943c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo944d(C0231i c0231i) {
        boolean zMo122i = false;
        if (!this.f1650u.isEmpty() && this.f1651v == c0231i) {
            m966z();
            for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {
                InterfaceC0235m interfaceC0235m = weakReference.get();
                if (interfaceC0235m != null) {
                    zMo122i = interfaceC0235m.mo122i(this, c0231i);
                    if (zMo122i) {
                        break;
                    }
                } else {
                    this.f1650u.remove(weakReference);
                }
            }
            m965y();
            if (zMo122i) {
                this.f1651v = null;
            }
        }
        return zMo122i;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo945e(C0229g c0229g, MenuItem menuItem) {
        a aVar = this.f1634e;
        return aVar != null && aVar.mo62a(c0229g, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo946f(C0231i c0231i) {
        boolean zMo123j = false;
        if (this.f1650u.isEmpty()) {
            return false;
        }
        m966z();
        for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {
            InterfaceC0235m interfaceC0235m = weakReference.get();
            if (interfaceC0235m != null) {
                zMo123j = interfaceC0235m.mo123j(this, c0231i);
                if (zMo123j) {
                    break;
                }
            } else {
                this.f1650u.remove(weakReference);
            }
        }
        m965y();
        if (zMo123j) {
            this.f1651v = c0231i;
        }
        return zMo123j;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0231i c0231i = this.f1635f.get(i2);
            if (c0231i.f1661a == i) {
                return c0231i;
            }
            if (c0231i.hasSubMenu() && (menuItemFindItem = c0231i.f1675o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public C0231i m947g(int i, KeyEvent keyEvent) {
        ArrayList<C0231i> arrayList = this.f1649t;
        arrayList.clear();
        m948h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMo954n = mo954n();
        for (int i2 = 0; i2 < size; i2++) {
            C0231i c0231i = arrayList.get(i2);
            char c2 = zMo954n ? c0231i.f1670j : c0231i.f1668h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zMo954n && c2 == '\b' && i == 67))) {
                return c0231i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1635f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public void m948h(List<C0231i> list, int i, KeyEvent keyEvent) {
        boolean zMo954n = mo954n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1635f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0231i c0231i = this.f1635f.get(i2);
                if (c0231i.hasSubMenu()) {
                    c0231i.f1675o.m948h(list, i, keyEvent);
                }
                char c2 = zMo954n ? c0231i.f1670j : c0231i.f1668h;
                if (((modifiers & 69647) == ((zMo954n ? c0231i.f1671k : c0231i.f1669i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zMo954n && c2 == '\b' && i == 67)) && c0231i.isEnabled()) {
                        list.add(c0231i);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1653x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1635f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m949i() {
        ArrayList<C0231i> arrayListM952l = m952l();
        if (this.f1640k) {
            boolean zMo118d = false;
            for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {
                InterfaceC0235m interfaceC0235m = weakReference.get();
                if (interfaceC0235m == null) {
                    this.f1650u.remove(weakReference);
                } else {
                    zMo118d |= interfaceC0235m.mo118d();
                }
            }
            if (zMo118d) {
                this.f1638i.clear();
                this.f1639j.clear();
                int size = arrayListM952l.size();
                for (int i = 0; i < size; i++) {
                    C0231i c0231i = arrayListM952l.get(i);
                    (c0231i.m971g() ? this.f1638i : this.f1639j).add(c0231i);
                }
            } else {
                this.f1638i.clear();
                this.f1639j.clear();
                this.f1639j.addAll(m952l());
            }
            this.f1640k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m947g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo950j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: k */
    public C0229g mo951k() {
        return this;
    }

    /* JADX INFO: renamed from: l */
    public ArrayList<C0231i> m952l() {
        if (!this.f1637h) {
            return this.f1636g;
        }
        this.f1636g.clear();
        int size = this.f1635f.size();
        for (int i = 0; i < size; i++) {
            C0231i c0231i = this.f1635f.get(i);
            if (c0231i.isVisible()) {
                this.f1636g.add(c0231i);
            }
        }
        this.f1637h = false;
        this.f1640k = true;
        return this.f1636g;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo953m() {
        return this.f1652w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo954n() {
        return this.f1632c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo955o() {
        return this.f1633d;
    }

    /* JADX INFO: renamed from: p */
    public void m956p() {
        this.f1640k = true;
        mo957q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m958r(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0231i c0231iM947g = m947g(i, keyEvent);
        boolean zM959s = c0231iM947g != null ? m959s(c0231iM947g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m943c(true);
        }
        return zM959s;
    }

    /* JADX INFO: renamed from: q */
    public void mo957q(boolean z) {
        if (this.f1645p) {
            this.f1646q = true;
            if (z) {
                this.f1647r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f1637h = true;
            this.f1640k = true;
        }
        if (this.f1650u.isEmpty()) {
            return;
        }
        m966z();
        for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {
            InterfaceC0235m interfaceC0235m = weakReference.get();
            if (interfaceC0235m == null) {
                this.f1650u.remove(weakReference);
            } else {
                interfaceC0235m.mo125n(z);
            }
        }
        m965y();
    }

    /* JADX INFO: renamed from: r */
    public boolean m958r(MenuItem menuItem, int i) {
        return m959s(menuItem, null, i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f1635f.get(i2).f1662b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f1635f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f1635f.get(i2).f1662b != i) {
                    break;
                }
                m960t(i2, false);
                i3 = i4;
            }
            mo957q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (this.f1635f.get(i2).f1661a == i) {
                m960t(i2, true);
            }
            i2++;
        }
        i2 = -1;
        m960t(i2, true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d A[PHI: r1
      0x005d: PHI (r1v12 boolean) = (r1v10 boolean), (r1v9 boolean), (r1v13 boolean) binds: [B:68:0x00c9, B:43:0x006d, B:36:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:45:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public boolean m959s(MenuItem menuItem, InterfaceC0235m interfaceC0235m, int i) {
        AbstractC0407b abstractC0407b;
        boolean zExpandActionView;
        AbstractC0407b abstractC0407b2;
        boolean z;
        SubMenuC0240r subMenuC0240r;
        InterfaceC0235m interfaceC0235m2;
        C0231i c0231i = (C0231i) menuItem;
        boolean zMo124m = false;
        if (c0231i == null || !c0231i.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0231i.f1676p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0231i)) {
            C0229g c0229g = c0231i.f1674n;
            if (c0229g.mo945e(c0229g, c0231i)) {
                zExpandActionView = true;
            } else {
                Intent intent = c0231i.f1667g;
                if (intent != null) {
                    try {
                        c0231i.f1674n.f1630a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        abstractC0407b = c0231i.f1657A;
                        if (abstractC0407b == null) {
                        }
                        zExpandActionView = false;
                        abstractC0407b2 = c0231i.f1657A;
                        if (abstractC0407b2 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (c0231i.m970f()) {
                            zExpandActionView |= c0231i.expandActionView();
                            if (zExpandActionView) {
                                m943c(true);
                            }
                        } else if (c0231i.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                m943c(false);
                            }
                            if (!c0231i.hasSubMenu()) {
                                SubMenuC0240r subMenuC0240r2 = new SubMenuC0240r(this.f1630a, this, c0231i);
                                c0231i.f1675o = subMenuC0240r2;
                                subMenuC0240r2.setHeaderTitle(c0231i.f1665e);
                            }
                            subMenuC0240r = c0231i.f1675o;
                            if (z) {
                                abstractC0407b2.mo982f(subMenuC0240r);
                            }
                            if (!this.f1650u.isEmpty()) {
                                if (interfaceC0235m != null) {
                                }
                                for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {
                                    interfaceC0235m2 = weakReference.get();
                                    if (interfaceC0235m2 == null) {
                                        this.f1650u.remove(weakReference);
                                    } else if (!zMo124m) {
                                        zMo124m = interfaceC0235m2.mo124m(subMenuC0240r);
                                    }
                                }
                            }
                            zExpandActionView |= zMo124m;
                            if (!zExpandActionView) {
                                m943c(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                m943c(false);
                            }
                            if (!c0231i.hasSubMenu()) {
                                SubMenuC0240r subMenuC0240r3 = new SubMenuC0240r(this.f1630a, this, c0231i);
                                c0231i.f1675o = subMenuC0240r3;
                                subMenuC0240r3.setHeaderTitle(c0231i.f1665e);
                            }
                            subMenuC0240r = c0231i.f1675o;
                            if (z) {
                                abstractC0407b2.mo982f(subMenuC0240r);
                            }
                            if (!this.f1650u.isEmpty()) {
                                zMo124m = interfaceC0235m != null ? interfaceC0235m.mo124m(subMenuC0240r) : false;
                                while (r8.hasNext()) {
                                    interfaceC0235m2 = weakReference.get();
                                    if (interfaceC0235m2 == null) {
                                        this.f1650u.remove(weakReference);
                                    } else if (!zMo124m) {
                                        zMo124m = interfaceC0235m2.mo124m(subMenuC0240r);
                                    }
                                }
                            }
                            zExpandActionView |= zMo124m;
                            if (!zExpandActionView) {
                                m943c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    abstractC0407b = c0231i.f1657A;
                    if (abstractC0407b == null && abstractC0407b.mo981e()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        abstractC0407b2 = c0231i.f1657A;
        if (abstractC0407b2 == null && abstractC0407b2.mo979a()) {
            z = true;
        } else {
            z = false;
        }
        if (c0231i.m970f()) {
            zExpandActionView |= c0231i.expandActionView();
            if (zExpandActionView) {
                m943c(true);
            }
        } else if (c0231i.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m943c(false);
            }
            if (!c0231i.hasSubMenu()) {
                SubMenuC0240r subMenuC0240r4 = new SubMenuC0240r(this.f1630a, this, c0231i);
                c0231i.f1675o = subMenuC0240r4;
                subMenuC0240r4.setHeaderTitle(c0231i.f1665e);
            }
            subMenuC0240r = c0231i.f1675o;
            if (z) {
                abstractC0407b2.mo982f(subMenuC0240r);
            }
            if (!this.f1650u.isEmpty()) {
                if (interfaceC0235m != null) {
                }
                while (r8.hasNext()) {
                    interfaceC0235m2 = weakReference.get();
                    if (interfaceC0235m2 == null) {
                        this.f1650u.remove(weakReference);
                    } else if (!zMo124m) {
                        zMo124m = interfaceC0235m2.mo124m(subMenuC0240r);
                    }
                }
            }
            zExpandActionView |= zMo124m;
            if (!zExpandActionView) {
                m943c(true);
            }
        } else if ((i & 1) == 0) {
            m943c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1635f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0231i c0231i = this.f1635f.get(i2);
            if (c0231i.f1662b == i) {
                c0231i.m975k(z2);
                c0231i.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1652w = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1635f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0231i c0231i = this.f1635f.get(i2);
            if (c0231i.f1662b == i) {
                c0231i.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1635f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0231i c0231i = this.f1635f.get(i2);
            if (c0231i.f1662b == i && c0231i.m977m(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo957q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1632c = z;
        mo957q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1635f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m960t(int i, boolean z) {
        if (i < 0 || i >= this.f1635f.size()) {
            return;
        }
        this.f1635f.remove(i);
        if (z) {
            mo957q(true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m961u(InterfaceC0235m interfaceC0235m) {
        for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {
            InterfaceC0235m interfaceC0235m2 = weakReference.get();
            if (interfaceC0235m2 == null || interfaceC0235m2 == interfaceC0235m) {
                this.f1650u.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m962v(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo950j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0240r) item.getSubMenu()).m962v(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: w */
    public void m963w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0240r) item.getSubMenu()).m963w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo950j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m964x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f1631b;
        if (view != null) {
            this.f1644o = view;
            this.f1642m = null;
            this.f1643n = null;
        } else {
            if (i > 0) {
                this.f1642m = resources.getText(i);
            } else if (charSequence != null) {
                this.f1642m = charSequence;
            }
            if (i2 > 0) {
                this.f1643n = C0362a.m1469c(this.f1630a, i2);
            } else if (drawable != null) {
                this.f1643n = drawable;
            }
            this.f1644o = null;
        }
        mo957q(false);
    }

    /* JADX INFO: renamed from: y */
    public void m965y() {
        this.f1645p = false;
        if (this.f1646q) {
            this.f1646q = false;
            mo957q(this.f1647r);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m966z() {
        if (this.f1645p) {
            return;
        }
        this.f1645p = true;
        this.f1646q = false;
        this.f1647r = false;
    }
}
