package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p006b.p032h.p038e.p039a.InterfaceSubMenuC0387c;

/* JADX INFO: renamed from: b.b.h.i.s */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuC0241s extends MenuC0237o implements SubMenu {

    /* JADX INFO: renamed from: e */
    public final InterfaceSubMenuC0387c f1737e;

    public SubMenuC0241s(Context context, InterfaceSubMenuC0387c interfaceSubMenuC0387c) {
        super(context, interfaceSubMenuC0387c);
        this.f1737e = interfaceSubMenuC0387c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f1737e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m919c(this.f1737e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f1737e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1737e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f1737e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1737e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f1737e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1737e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1737e.setIcon(drawable);
        return this;
    }
}
