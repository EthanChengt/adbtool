package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p006b.p008b.p016h.InterfaceC0216b;
import p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b;
import p006b.p032h.p044j.AbstractC0407b;

/* JADX INFO: renamed from: b.b.h.i.j */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC0232j extends AbstractC0225c implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuItemC0386b f1688d;

    /* JADX INFO: renamed from: e */
    public Method f1689e;

    /* JADX INFO: renamed from: b.b.h.i.j$a */
    public class a extends AbstractC0407b {

        /* JADX INFO: renamed from: b */
        public final ActionProvider f1690b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1690b = actionProvider;
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: a */
        public boolean mo979a() {
            return this.f1690b.hasSubMenu();
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: c */
        public View mo980c() {
            return this.f1690b.onCreateActionView();
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: e */
        public boolean mo981e() {
            return this.f1690b.onPerformDefaultAction();
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: f */
        public void mo982f(SubMenu subMenu) {
            this.f1690b.onPrepareSubMenu(MenuItemC0232j.this.m920d(subMenu));
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.j$b */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d */
        public AbstractC0407b.a f1692d;

        public b(MenuItemC0232j menuItemC0232j, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: b */
        public boolean mo983b() {
            return this.f1690b.isVisible();
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: d */
        public View mo984d(MenuItem menuItem) {
            return this.f1690b.onCreateActionView(menuItem);
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: g */
        public boolean mo985g() {
            return this.f1690b.overridesItemVisibility();
        }

        @Override // p006b.p032h.p044j.AbstractC0407b
        /* JADX INFO: renamed from: h */
        public void mo986h(AbstractC0407b.a aVar) {
            this.f1692d = aVar;
            this.f1690b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0407b.a aVar = this.f1692d;
            if (aVar != null) {
                C0229g c0229g = C0231i.this.f1674n;
                c0229g.f1637h = true;
                c0229g.mo957q(true);
            }
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.j$c */
    public static class c extends FrameLayout implements InterfaceC0216b {

        /* JADX INFO: renamed from: b */
        public final CollapsibleActionView f1693b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f1693b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p006b.p008b.p016h.InterfaceC0216b
        /* JADX INFO: renamed from: c */
        public void mo76c() {
            this.f1693b.onActionViewExpanded();
        }

        @Override // p006b.p008b.p016h.InterfaceC0216b
        /* JADX INFO: renamed from: e */
        public void mo77e() {
            this.f1693b.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.j$d */
    public class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f1694a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1694a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1694a.onMenuItemActionCollapse(MenuItemC0232j.this.m919c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1694a.onMenuItemActionExpand(MenuItemC0232j.this.m919c(menuItem));
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.j$e */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: b */
        public final MenuItem.OnMenuItemClickListener f1696b;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1696b = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1696b.onMenuItemClick(MenuItemC0232j.this.m919c(menuItem));
        }
    }

    public MenuItemC0232j(Context context, InterfaceMenuItemC0386b interfaceMenuItemC0386b) {
        super(context);
        if (interfaceMenuItemC0386b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1688d = interfaceMenuItemC0386b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f1688d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f1688d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0407b abstractC0407bMo916b = this.f1688d.mo916b();
        if (abstractC0407bMo916b instanceof a) {
            return ((a) abstractC0407bMo916b).f1690b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f1688d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f1693b : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1688d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1688d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1688d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1688d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1688d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1688d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1688d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1688d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1688d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1688d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1688d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1688d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1688d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m920d(this.f1688d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1688d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1688d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1688d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1688d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1688d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f1688d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f1688d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f1688d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f1688d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f1576a, actionProvider);
        InterfaceMenuItemC0386b interfaceMenuItemC0386b = this.f1688d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC0386b.mo915a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f1688d.setActionView(i);
        View actionView = this.f1688d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1688d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1688d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1688d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f1688d.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1688d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1688d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1688d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1688d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1688d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1688d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1688d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1688d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1688d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f1688d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f1688d.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1688d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1688d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1688d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1688d.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f1688d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f1688d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1688d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1688d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1688d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1688d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f1688d.setVisible(z);
    }
}
