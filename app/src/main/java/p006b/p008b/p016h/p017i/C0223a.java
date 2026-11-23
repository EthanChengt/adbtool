package p006b.p008b.p016h.p017i;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b;
import p006b.p032h.p044j.AbstractC0407b;

/* JADX INFO: renamed from: b.b.h.i.a */
/* JADX INFO: loaded from: classes.dex */
public class C0223a implements InterfaceMenuItemC0386b {

    /* JADX INFO: renamed from: a */
    public CharSequence f1551a;

    /* JADX INFO: renamed from: b */
    public CharSequence f1552b;

    /* JADX INFO: renamed from: c */
    public Intent f1553c;

    /* JADX INFO: renamed from: d */
    public char f1554d;

    /* JADX INFO: renamed from: f */
    public char f1556f;

    /* JADX INFO: renamed from: h */
    public Drawable f1558h;

    /* JADX INFO: renamed from: i */
    public Context f1559i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1560j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1561k;

    /* JADX INFO: renamed from: e */
    public int f1555e = 4096;

    /* JADX INFO: renamed from: g */
    public int f1557g = 4096;

    /* JADX INFO: renamed from: l */
    public ColorStateList f1562l = null;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f1563m = null;

    /* JADX INFO: renamed from: n */
    public boolean f1564n = false;

    /* JADX INFO: renamed from: o */
    public boolean f1565o = false;

    /* JADX INFO: renamed from: p */
    public int f1566p = 16;

    public C0223a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1559i = context;
        this.f1551a = charSequence;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b
    /* JADX INFO: renamed from: a */
    public InterfaceMenuItemC0386b mo915a(AbstractC0407b abstractC0407b) {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b
    /* JADX INFO: renamed from: b */
    public AbstractC0407b mo916b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m917c() {
        Drawable drawable = this.f1558h;
        if (drawable != null) {
            if (this.f1564n || this.f1565o) {
                Drawable drawableM1444e0 = C0360f.m1444e0(drawable);
                this.f1558h = drawableM1444e0;
                Drawable drawableMutate = drawableM1444e0.mutate();
                this.f1558h = drawableMutate;
                if (this.f1564n) {
                    C0360f.m1433Y(drawableMutate, this.f1562l);
                }
                if (this.f1565o) {
                    C0360f.m1434Z(this.f1558h, this.f1563m);
                }
            }
        }
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1557g;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1556f;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1560j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1558h;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1562l;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1563m;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1553c;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1555e;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1554d;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1551a;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1552b;
        return charSequence != null ? charSequence : this.f1551a;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1561k;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1566p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1566p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1566p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1566p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1556f = Character.toLowerCase(c2);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f1556f = Character.toLowerCase(c2);
        this.f1557g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1566p = (z ? 1 : 0) | (this.f1566p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1566p = (z ? 2 : 0) | (this.f1566p & (-3));
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public InterfaceMenuItemC0386b setContentDescription(CharSequence charSequence) {
        this.f1560j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1566p = (z ? 16 : 0) | (this.f1566p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1558h = C0362a.m1469c(this.f1559i, i);
        m917c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1558h = drawable;
        m917c();
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1562l = colorStateList;
        this.f1564n = true;
        m917c();
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1563m = mode;
        this.f1565o = true;
        m917c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1553c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f1554d = c2;
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f1554d = c2;
        this.f1555e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1554d = c2;
        this.f1556f = Character.toLowerCase(c3);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1554d = c2;
        this.f1555e = KeyEvent.normalizeMetaState(i);
        this.f1556f = Character.toLowerCase(c3);
        this.f1557g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1551a = this.f1559i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1551a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1552b = charSequence;
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public InterfaceMenuItemC0386b setTooltipText(CharSequence charSequence) {
        this.f1561k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1566p = (this.f1566p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
