package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: b.b.h.i.r */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuC0240r extends C0229g implements SubMenu {

    /* JADX INFO: renamed from: A */
    public C0231i f1735A;

    /* JADX INFO: renamed from: z */
    public C0229g f1736z;

    public SubMenuC0240r(Context context, C0229g c0229g, C0231i c0231i) {
        super(context);
        this.f1736z = c0229g;
        this.f1735A = c0231i;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: d */
    public boolean mo944d(C0231i c0231i) {
        return this.f1736z.mo944d(c0231i);
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: e */
    public boolean mo945e(C0229g c0229g, MenuItem menuItem) {
        return super.mo945e(c0229g, menuItem) || this.f1736z.mo945e(c0229g, menuItem);
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: f */
    public boolean mo946f(C0231i c0231i) {
        return this.f1736z.mo946f(c0231i);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1735A;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: j */
    public String mo950j() {
        C0231i c0231i = this.f1735A;
        int i = c0231i != null ? c0231i.f1661a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: k */
    public C0229g mo951k() {
        return this.f1736z.mo951k();
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: m */
    public boolean mo953m() {
        return this.f1736z.mo953m();
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: n */
    public boolean mo954n() {
        return this.f1736z.mo954n();
    }

    @Override // p006b.p008b.p016h.p017i.C0229g
    /* JADX INFO: renamed from: o */
    public boolean mo955o() {
        return this.f1736z.mo955o();
    }

    @Override // p006b.p008b.p016h.p017i.C0229g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1736z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m964x(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m964x(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m964x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1735A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1735A.setIcon(drawable);
        return this;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1736z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m964x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m964x(0, charSequence, 0, null, null);
        return this;
    }
}
