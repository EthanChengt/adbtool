package p006b.p008b.p016h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p006b.p008b.p016h.p017i.MenuC0237o;
import p006b.p008b.p016h.p017i.MenuItemC0232j;
import p006b.p025e.C0320h;
import p006b.p032h.p038e.p039a.InterfaceMenuC0385a;
import p006b.p032h.p038e.p039a.InterfaceMenuItemC0386b;

/* JADX INFO: renamed from: b.b.h.e */
/* JADX INFO: loaded from: classes.dex */
public class C0219e extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f1494a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0215a f1495b;

    /* JADX INFO: renamed from: b.b.h.e$a */
    public static class a implements AbstractC0215a.a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f1496a;

        /* JADX INFO: renamed from: b */
        public final Context f1497b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<C0219e> f1498c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final C0320h<Menu, Menu> f1499d = new C0320h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1497b = context;
            this.f1496a = callback;
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: a */
        public boolean mo845a(AbstractC0215a abstractC0215a, Menu menu) {
            return this.f1496a.onPrepareActionMode(m906e(abstractC0215a), m907f(menu));
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: b */
        public boolean mo846b(AbstractC0215a abstractC0215a, MenuItem menuItem) {
            return this.f1496a.onActionItemClicked(m906e(abstractC0215a), new MenuItemC0232j(this.f1497b, (InterfaceMenuItemC0386b) menuItem));
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: c */
        public boolean mo847c(AbstractC0215a abstractC0215a, Menu menu) {
            return this.f1496a.onCreateActionMode(m906e(abstractC0215a), m907f(menu));
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: d */
        public void mo848d(AbstractC0215a abstractC0215a) {
            this.f1496a.onDestroyActionMode(m906e(abstractC0215a));
        }

        /* JADX INFO: renamed from: e */
        public ActionMode m906e(AbstractC0215a abstractC0215a) {
            int size = this.f1498c.size();
            for (int i = 0; i < size; i++) {
                C0219e c0219e = this.f1498c.get(i);
                if (c0219e != null && c0219e.f1495b == abstractC0215a) {
                    return c0219e;
                }
            }
            C0219e c0219e2 = new C0219e(this.f1497b, abstractC0215a);
            this.f1498c.add(c0219e2);
            return c0219e2;
        }

        /* JADX INFO: renamed from: f */
        public final Menu m907f(Menu menu) {
            Menu orDefault = this.f1499d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            MenuC0237o menuC0237o = new MenuC0237o(this.f1497b, (InterfaceMenuC0385a) menu);
            this.f1499d.put(menu, menuC0237o);
            return menuC0237o;
        }
    }

    public C0219e(Context context, AbstractC0215a abstractC0215a) {
        this.f1494a = context;
        this.f1495b = abstractC0215a;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1495b.mo869c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1495b.mo870d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0237o(this.f1494a, (InterfaceMenuC0385a) this.f1495b.mo871e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1495b.mo872f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1495b.mo873g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1495b.f1482b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1495b.mo874h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1495b.f1483c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1495b.mo875i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1495b.mo876j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1495b.mo877k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f1495b.mo878l(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1495b.mo879m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1495b.f1482b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f1495b.mo880n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1495b.mo881o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1495b.mo882p(z);
    }
}
