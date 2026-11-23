package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Objects;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b;
import p006b.p032h.p044j.AbstractC0407b;

/* JADX INFO: renamed from: b.b.h.i.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0231i implements InterfaceMenuItemC0386b {

    /* JADX INFO: renamed from: A */
    public AbstractC0407b f1657A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f1658B;

    /* JADX INFO: renamed from: D */
    public ContextMenu.ContextMenuInfo f1660D;

    /* JADX INFO: renamed from: a */
    public final int f1661a;

    /* JADX INFO: renamed from: b */
    public final int f1662b;

    /* JADX INFO: renamed from: c */
    public final int f1663c;

    /* JADX INFO: renamed from: d */
    public final int f1664d;

    /* JADX INFO: renamed from: e */
    public CharSequence f1665e;

    /* JADX INFO: renamed from: f */
    public CharSequence f1666f;

    /* JADX INFO: renamed from: g */
    public Intent f1667g;

    /* JADX INFO: renamed from: h */
    public char f1668h;

    /* JADX INFO: renamed from: j */
    public char f1670j;

    /* JADX INFO: renamed from: l */
    public Drawable f1672l;

    /* JADX INFO: renamed from: n */
    public C0229g f1674n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0240r f1675o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f1676p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1677q;

    /* JADX INFO: renamed from: r */
    public CharSequence f1678r;

    /* JADX INFO: renamed from: y */
    public int f1685y;

    /* JADX INFO: renamed from: z */
    public View f1686z;

    /* JADX INFO: renamed from: i */
    public int f1669i = 4096;

    /* JADX INFO: renamed from: k */
    public int f1671k = 4096;

    /* JADX INFO: renamed from: m */
    public int f1673m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f1679s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f1680t = null;

    /* JADX INFO: renamed from: u */
    public boolean f1681u = false;

    /* JADX INFO: renamed from: v */
    public boolean f1682v = false;

    /* JADX INFO: renamed from: w */
    public boolean f1683w = false;

    /* JADX INFO: renamed from: x */
    public int f1684x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f1659C = false;

    /* JADX INFO: renamed from: b.b.h.i.i$a */
    public class a implements AbstractC0407b.a {
        public a() {
        }
    }

    public C0231i(C0229g c0229g, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1685y = 0;
        this.f1674n = c0229g;
        this.f1661a = i2;
        this.f1662b = i;
        this.f1663c = i3;
        this.f1664d = i4;
        this.f1665e = charSequence;
        this.f1685y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m967c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b
    /* JADX INFO: renamed from: a */
    public InterfaceMenuItemC0386b mo915a(AbstractC0407b abstractC0407b) {
        AbstractC0407b abstractC0407b2 = this.f1657A;
        if (abstractC0407b2 != null) {
            abstractC0407b2.f2703a = null;
        }
        this.f1686z = null;
        this.f1657A = abstractC0407b;
        this.f1674n.mo957q(true);
        AbstractC0407b abstractC0407b3 = this.f1657A;
        if (abstractC0407b3 != null) {
            abstractC0407b3.mo986h(new a());
        }
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b
    /* JADX INFO: renamed from: b */
    public AbstractC0407b mo916b() {
        return this.f1657A;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1685y & 8) == 0) {
            return false;
        }
        if (this.f1686z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1658B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1674n.mo944d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m968d(Drawable drawable) {
        if (drawable != null && this.f1683w && (this.f1681u || this.f1682v)) {
            drawable = C0360f.m1444e0(drawable).mutate();
            if (this.f1681u) {
                C0360f.m1433Y(drawable, this.f1679s);
            }
            if (this.f1682v) {
                C0360f.m1434Z(drawable, this.f1680t);
            }
            this.f1683w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public char m969e() {
        return this.f1674n.mo954n() ? this.f1670j : this.f1668h;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m970f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1658B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1674n.mo946f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m970f() {
        AbstractC0407b abstractC0407b;
        if ((this.f1685y & 8) == 0) {
            return false;
        }
        if (this.f1686z == null && (abstractC0407b = this.f1657A) != null) {
            this.f1686z = abstractC0407b.mo984d(this);
        }
        return this.f1686z != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m971g() {
        return (this.f1684x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1686z;
        if (view != null) {
            return view;
        }
        AbstractC0407b abstractC0407b = this.f1657A;
        if (abstractC0407b == null) {
            return null;
        }
        View viewMo984d = abstractC0407b.mo984d(this);
        this.f1686z = viewMo984d;
        return viewMo984d;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1671k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1670j;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1677q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1662b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1672l;
        if (drawable != null) {
            return m968d(drawable);
        }
        int i = this.f1673m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM884b = C0208a.m884b(this.f1674n.f1630a, i);
        this.f1673m = 0;
        this.f1672l = drawableM884b;
        return m968d(drawableM884b);
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1679s;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1680t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1667g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1661a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1660D;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1669i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1668h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1663c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1675o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1665e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1666f;
        return charSequence != null ? charSequence : this.f1665e;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1678r;
    }

    /* JADX INFO: renamed from: h */
    public boolean m972h() {
        return (this.f1684x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1675o != null;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceMenuItemC0386b m973i(View view) {
        int i;
        this.f1686z = view;
        this.f1657A = null;
        if (view != null && view.getId() == -1 && (i = this.f1661a) > 0) {
            view.setId(i);
        }
        this.f1674n.m956p();
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1659C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1684x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1684x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1684x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0407b abstractC0407b = this.f1657A;
        if (abstractC0407b == null || !abstractC0407b.mo985g()) {
            return (this.f1684x & 8) == 0;
        }
        return (this.f1684x & 8) == 0 && this.f1657A.mo983b();
    }

    /* JADX INFO: renamed from: j */
    public void m974j(boolean z) {
        int i = this.f1684x;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f1684x = i2;
        if (i != i2) {
            this.f1674n.mo957q(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m975k(boolean z) {
        this.f1684x = (z ? 4 : 0) | (this.f1684x & (-5));
    }

    /* JADX INFO: renamed from: l */
    public void m976l(boolean z) {
        this.f1684x = z ? this.f1684x | 32 : this.f1684x & (-33);
    }

    /* JADX INFO: renamed from: m */
    public boolean m977m(boolean z) {
        int i = this.f1684x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f1684x = i2;
        return i != i2;
    }

    /* JADX INFO: renamed from: n */
    public boolean m978n() {
        return this.f1674n.mo955o() && m969e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.f1674n.f1630a;
        m973i(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m973i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1670j == c2) {
            return this;
        }
        this.f1670j = Character.toLowerCase(c2);
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f1670j == c2 && this.f1671k == i) {
            return this;
        }
        this.f1670j = Character.toLowerCase(c2);
        this.f1671k = KeyEvent.normalizeMetaState(i);
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1684x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f1684x = i2;
        if (i != i2) {
            this.f1674n.mo957q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1684x & 4) != 0) {
            C0229g c0229g = this.f1674n;
            Objects.requireNonNull(c0229g);
            int groupId = getGroupId();
            int size = c0229g.f1635f.size();
            c0229g.m966z();
            for (int i = 0; i < size; i++) {
                C0231i c0231i = c0229g.f1635f.get(i);
                if (c0231i.f1662b == groupId && c0231i.m972h() && c0231i.isCheckable()) {
                    c0231i.m974j(c0231i == this);
                }
            }
            c0229g.m965y();
        } else {
            m974j(z);
        }
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public InterfaceMenuItemC0386b setContentDescription(CharSequence charSequence) {
        this.f1677q = charSequence;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1684x = z ? this.f1684x | 16 : this.f1684x & (-17);
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1672l = null;
        this.f1673m = i;
        this.f1683w = true;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1673m = 0;
        this.f1672l = drawable;
        this.f1683w = true;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1679s = colorStateList;
        this.f1681u = true;
        this.f1683w = true;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1680t = mode;
        this.f1682v = true;
        this.f1683w = true;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1667g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f1668h == c2) {
            return this;
        }
        this.f1668h = c2;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.f1668h == c2 && this.f1669i == i) {
            return this;
        }
        this.f1668h = c2;
        this.f1669i = KeyEvent.normalizeMetaState(i);
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1658B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1676p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1668h = c2;
        this.f1670j = Character.toLowerCase(c3);
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1668h = c2;
        this.f1669i = KeyEvent.normalizeMetaState(i);
        this.f1670j = Character.toLowerCase(c3);
        this.f1671k = KeyEvent.normalizeMetaState(i2);
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1685y = i;
        this.f1674n.m956p();
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f1674n.f1630a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1665e = charSequence;
        this.f1674n.mo957q(false);
        SubMenuC0240r subMenuC0240r = this.f1675o;
        if (subMenuC0240r != null) {
            subMenuC0240r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1666f = charSequence;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public InterfaceMenuItemC0386b setTooltipText(CharSequence charSequence) {
        this.f1678r = charSequence;
        this.f1674n.mo957q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m977m(z)) {
            C0229g c0229g = this.f1674n;
            c0229g.f1637h = true;
            c0229g.mo957q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1665e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
