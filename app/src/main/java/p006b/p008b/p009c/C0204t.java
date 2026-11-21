package p006b.p008b.p009c;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p006b.p008b.p016h.WindowCallbackC0222h;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p018i.C0298z0;
import p006b.p008b.p018i.InterfaceC0252d0;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.c.t */
/* JADX INFO: loaded from: classes.dex */
public class C0204t extends AbstractC0185a {

    /* JADX INFO: renamed from: a */
    public InterfaceC0252d0 f1346a;

    /* JADX INFO: renamed from: b */
    public boolean f1347b;

    /* JADX INFO: renamed from: c */
    public Window.Callback f1348c;

    /* JADX INFO: renamed from: d */
    public boolean f1349d;

    /* JADX INFO: renamed from: e */
    public boolean f1350e;

    /* JADX INFO: renamed from: f */
    public ArrayList<AbstractC0185a.b> f1351f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public final Runnable f1352g = new a();

    /* JADX INFO: renamed from: h */
    public final Toolbar.InterfaceC0061f f1353h;

    /* JADX INFO: renamed from: b.b.c.t$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0204t c0204t = C0204t.this;
            Menu menuM861t = c0204t.m861t();
            C0229g c0229g = menuM861t instanceof C0229g ? (C0229g) menuM861t : null;
            if (c0229g != null) {
                c0229g.m966z();
            }
            try {
                menuM861t.clear();
                if (!c0204t.f1348c.onCreatePanelMenu(0, menuM861t) || !c0204t.f1348c.onPreparePanel(0, null, menuM861t)) {
                    menuM861t.clear();
                }
            } finally {
                if (c0229g != null) {
                    c0229g.m965y();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.b.c.t$b */
    public class b implements Toolbar.InterfaceC0061f {
        public b() {
        }
    }

    /* JADX INFO: renamed from: b.b.c.t$c */
    public final class c implements InterfaceC0235m.a {

        /* JADX INFO: renamed from: b */
        public boolean f1356b;

        public c() {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: a */
        public void mo60a(C0229g c0229g, boolean z) {
            if (this.f1356b) {
                return;
            }
            this.f1356b = true;
            C0204t.this.f1346a.mo1032h();
            Window.Callback callback = C0204t.this.f1348c;
            if (callback != null) {
                callback.onPanelClosed(108, c0229g);
            }
            this.f1356b = false;
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: b */
        public boolean mo61b(C0229g c0229g) {
            Window.Callback callback = C0204t.this.f1348c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, c0229g);
            return true;
        }
    }

    /* JADX INFO: renamed from: b.b.c.t$d */
    public final class d implements C0229g.a {
        public d() {
        }

        @Override // p006b.p008b.p016h.p017i.C0229g.a
        /* JADX INFO: renamed from: a */
        public boolean mo62a(C0229g c0229g, MenuItem menuItem) {
            return false;
        }

        @Override // p006b.p008b.p016h.p017i.C0229g.a
        /* JADX INFO: renamed from: b */
        public void mo63b(C0229g c0229g) {
            C0204t c0204t = C0204t.this;
            if (c0204t.f1348c != null) {
                if (c0204t.f1346a.mo1027c()) {
                    C0204t.this.f1348c.onPanelClosed(108, c0229g);
                } else if (C0204t.this.f1348c.onPreparePanel(0, null, c0229g)) {
                    C0204t.this.f1348c.onMenuOpened(108, c0229g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.b.c.t$e */
    public class e extends WindowCallbackC0222h {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0204t.this.f1346a.mo1041q()) : this.f1550b.onCreatePanelView(i);
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean zOnPreparePanel = this.f1550b.onPreparePanel(i, view, menu);
            if (zOnPreparePanel) {
                C0204t c0204t = C0204t.this;
                if (!c0204t.f1347b) {
                    c0204t.f1346a.mo1030f();
                    C0204t.this.f1347b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    public C0204t(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f1353h = bVar;
        this.f1346a = new C0298z0(toolbar, false);
        e eVar = new e(callback);
        this.f1348c = eVar;
        this.f1346a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f1346a.setWindowTitle(charSequence);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: a */
    public boolean mo757a() {
        return this.f1346a.mo1028d();
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: b */
    public boolean mo758b() {
        if (!this.f1346a.mo1045u()) {
            return false;
        }
        this.f1346a.collapseActionView();
        return true;
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: c */
    public void mo759c(boolean z) {
        if (z == this.f1350e) {
            return;
        }
        this.f1350e = z;
        int size = this.f1351f.size();
        for (int i = 0; i < size; i++) {
            this.f1351f.get(i).m776a(z);
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: d */
    public int mo760d() {
        return this.f1346a.mo1034j();
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: e */
    public Context mo761e() {
        return this.f1346a.mo1041q();
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: f */
    public boolean mo762f() {
        this.f1346a.mo1039o().removeCallbacks(this.f1352g);
        ViewGroup viewGroupMo1039o = this.f1346a.mo1039o();
        Runnable runnable = this.f1352g;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        viewGroupMo1039o.postOnAnimation(runnable);
        return true;
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: g */
    public void mo763g(Configuration configuration) {
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: h */
    public void mo764h() {
        this.f1346a.mo1039o().removeCallbacks(this.f1352g);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: i */
    public boolean mo765i(int i, KeyEvent keyEvent) {
        Menu menuM861t = m861t();
        if (menuM861t == null) {
            return false;
        }
        menuM861t.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM861t.performShortcut(i, keyEvent, 0);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: j */
    public boolean mo766j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f1346a.mo1029e();
        }
        return true;
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: k */
    public boolean mo767k() {
        return this.f1346a.mo1029e();
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: l */
    public void mo768l(boolean z) {
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: m */
    public void mo769m(boolean z) {
        this.f1346a.mo1048x(((z ? 4 : 0) & 4) | (this.f1346a.mo1034j() & (-5)));
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: n */
    public void mo770n(boolean z) {
        this.f1346a.mo1048x(((z ? 8 : 0) & 8) | (this.f1346a.mo1034j() & (-9)));
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: o */
    public void mo771o(boolean z) {
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: p */
    public void mo772p(int i) {
        InterfaceC0252d0 interfaceC0252d0 = this.f1346a;
        interfaceC0252d0.setTitle(i != 0 ? interfaceC0252d0.mo1041q().getText(i) : null);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: q */
    public void mo773q(CharSequence charSequence) {
        this.f1346a.setTitle(charSequence);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: r */
    public void mo774r(CharSequence charSequence) {
        this.f1346a.setWindowTitle(charSequence);
    }

    /* JADX INFO: renamed from: t */
    public final Menu m861t() {
        if (!this.f1349d) {
            this.f1346a.mo1033i(new c(), new d());
            this.f1349d = true;
        }
        return this.f1346a.mo1036l();
    }
}
