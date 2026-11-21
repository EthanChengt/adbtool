package p006b.p008b.p009c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.AbstractC0215a;
import p006b.p008b.p016h.C0220f;
import p006b.p008b.p016h.C0221g;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p018i.C0248c;
import p006b.p008b.p018i.InterfaceC0252d0;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0423r;
import p006b.p032h.p044j.C0425t;
import p006b.p032h.p044j.InterfaceC0424s;
import p006b.p032h.p044j.InterfaceC0426u;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.b.c.w */
/* JADX INFO: loaded from: classes.dex */
public class C0207w extends AbstractC0185a implements ActionBarOverlayLayout.InterfaceC0030d {

    /* JADX INFO: renamed from: a */
    public Context f1372a;

    /* JADX INFO: renamed from: b */
    public Context f1373b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f1374c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f1375d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0252d0 f1376e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f1377f;

    /* JADX INFO: renamed from: g */
    public View f1378g;

    /* JADX INFO: renamed from: h */
    public boolean f1379h;

    /* JADX INFO: renamed from: i */
    public d f1380i;

    /* JADX INFO: renamed from: j */
    public AbstractC0215a f1381j;

    /* JADX INFO: renamed from: k */
    public AbstractC0215a.a f1382k;

    /* JADX INFO: renamed from: l */
    public boolean f1383l;

    /* JADX INFO: renamed from: m */
    public ArrayList<AbstractC0185a.b> f1384m;

    /* JADX INFO: renamed from: n */
    public boolean f1385n;

    /* JADX INFO: renamed from: o */
    public int f1386o;

    /* JADX INFO: renamed from: p */
    public boolean f1387p;

    /* JADX INFO: renamed from: q */
    public boolean f1388q;

    /* JADX INFO: renamed from: r */
    public boolean f1389r;

    /* JADX INFO: renamed from: s */
    public boolean f1390s;

    /* JADX INFO: renamed from: t */
    public C0221g f1391t;

    /* JADX INFO: renamed from: u */
    public boolean f1392u;

    /* JADX INFO: renamed from: v */
    public boolean f1393v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC0424s f1394w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC0424s f1395x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC0426u f1396y;

    /* JADX INFO: renamed from: z */
    public static final Interpolator f1371z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public static final Interpolator f1370A = new DecelerateInterpolator();

    /* JADX INFO: renamed from: b.b.c.w$a */
    public class a extends C0425t {
        public a() {
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: a */
        public void mo849a(View view) {
            View view2;
            C0207w c0207w = C0207w.this;
            if (c0207w.f1387p && (view2 = c0207w.f1378g) != null) {
                view2.setTranslationY(0.0f);
                C0207w.this.f1375d.setTranslationY(0.0f);
            }
            C0207w.this.f1375d.setVisibility(8);
            C0207w.this.f1375d.setTransitioning(false);
            C0207w c0207w2 = C0207w.this;
            c0207w2.f1391t = null;
            AbstractC0215a.a aVar = c0207w2.f1382k;
            if (aVar != null) {
                aVar.mo848d(c0207w2.f1381j);
                c0207w2.f1381j = null;
                c0207w2.f1382k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C0207w.this.f1374c;
            if (actionBarOverlayLayout != null) {
                C0418m.m1576s(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: b.b.c.w$b */
    public class b extends C0425t {
        public b() {
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: a */
        public void mo849a(View view) {
            C0207w c0207w = C0207w.this;
            c0207w.f1391t = null;
            c0207w.f1375d.requestLayout();
        }
    }

    /* JADX INFO: renamed from: b.b.c.w$c */
    public class c implements InterfaceC0426u {
        public c() {
        }
    }

    /* JADX INFO: renamed from: b.b.c.w$d */
    public class d extends AbstractC0215a implements C0229g.a {

        /* JADX INFO: renamed from: d */
        public final Context f1400d;

        /* JADX INFO: renamed from: e */
        public final C0229g f1401e;

        /* JADX INFO: renamed from: f */
        public AbstractC0215a.a f1402f;

        /* JADX INFO: renamed from: g */
        public WeakReference<View> f1403g;

        public d(Context context, AbstractC0215a.a aVar) {
            this.f1400d = context;
            this.f1402f = aVar;
            C0229g c0229g = new C0229g(context);
            c0229g.f1641l = 1;
            this.f1401e = c0229g;
            c0229g.f1634e = this;
        }

        @Override // p006b.p008b.p016h.p017i.C0229g.a
        /* JADX INFO: renamed from: a */
        public boolean mo62a(C0229g c0229g, MenuItem menuItem) {
            AbstractC0215a.a aVar = this.f1402f;
            if (aVar != null) {
                return aVar.mo846b(this, menuItem);
            }
            return false;
        }

        @Override // p006b.p008b.p016h.p017i.C0229g.a
        /* JADX INFO: renamed from: b */
        public void mo63b(C0229g c0229g) {
            if (this.f1402f == null) {
                return;
            }
            mo875i();
            C0248c c0248c = C0207w.this.f1377f.f1741e;
            if (c0248c != null) {
                c0248c.m1021q();
            }
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: c */
        public void mo869c() {
            C0207w c0207w = C0207w.this;
            if (c0207w.f1380i != this) {
                return;
            }
            if (!c0207w.f1388q) {
                this.f1402f.mo848d(this);
            } else {
                c0207w.f1381j = this;
                c0207w.f1382k = this.f1402f;
            }
            this.f1402f = null;
            C0207w.this.m864t(false);
            ActionBarContextView actionBarContextView = C0207w.this.f1377f;
            if (actionBarContextView.f180l == null) {
                actionBarContextView.m32h();
            }
            C0207w.this.f1376e.mo1039o().sendAccessibilityEvent(32);
            C0207w c0207w2 = C0207w.this;
            c0207w2.f1374c.setHideOnContentScrollEnabled(c0207w2.f1393v);
            C0207w.this.f1380i = null;
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: d */
        public View mo870d() {
            WeakReference<View> weakReference = this.f1403g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: e */
        public Menu mo871e() {
            return this.f1401e;
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: f */
        public MenuInflater mo872f() {
            return new C0220f(this.f1400d);
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: g */
        public CharSequence mo873g() {
            return C0207w.this.f1377f.getSubtitle();
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: h */
        public CharSequence mo874h() {
            return C0207w.this.f1377f.getTitle();
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: i */
        public void mo875i() {
            if (C0207w.this.f1380i != this) {
                return;
            }
            this.f1401e.m966z();
            try {
                this.f1402f.mo845a(this, this.f1401e);
            } finally {
                this.f1401e.m965y();
            }
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: j */
        public boolean mo876j() {
            return C0207w.this.f1377f.f187s;
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: k */
        public void mo877k(View view) {
            C0207w.this.f1377f.setCustomView(view);
            this.f1403g = new WeakReference<>(view);
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: l */
        public void mo878l(int i) {
            C0207w.this.f1377f.setSubtitle(C0207w.this.f1372a.getResources().getString(i));
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: m */
        public void mo879m(CharSequence charSequence) {
            C0207w.this.f1377f.setSubtitle(charSequence);
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: n */
        public void mo880n(int i) {
            C0207w.this.f1377f.setTitle(C0207w.this.f1372a.getResources().getString(i));
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: o */
        public void mo881o(CharSequence charSequence) {
            C0207w.this.f1377f.setTitle(charSequence);
        }

        @Override // p006b.p008b.p016h.AbstractC0215a
        /* JADX INFO: renamed from: p */
        public void mo882p(boolean z) {
            this.f1483c = z;
            C0207w.this.f1377f.setTitleOptional(z);
        }
    }

    public C0207w(Activity activity, boolean z) {
        new ArrayList();
        this.f1384m = new ArrayList<>();
        this.f1386o = 0;
        this.f1387p = true;
        this.f1390s = true;
        this.f1394w = new a();
        this.f1395x = new b();
        this.f1396y = new c();
        View decorView = activity.getWindow().getDecorView();
        m865u(decorView);
        if (z) {
            return;
        }
        this.f1378g = decorView.findViewById(R.id.content);
    }

    public C0207w(Dialog dialog) {
        new ArrayList();
        this.f1384m = new ArrayList<>();
        this.f1386o = 0;
        this.f1387p = true;
        this.f1390s = true;
        this.f1394w = new a();
        this.f1395x = new b();
        this.f1396y = new c();
        m865u(dialog.getWindow().getDecorView());
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: b */
    public boolean mo758b() {
        InterfaceC0252d0 interfaceC0252d0 = this.f1376e;
        if (interfaceC0252d0 == null || !interfaceC0252d0.mo1045u()) {
            return false;
        }
        this.f1376e.collapseActionView();
        return true;
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: c */
    public void mo759c(boolean z) {
        if (z == this.f1383l) {
            return;
        }
        this.f1383l = z;
        int size = this.f1384m.size();
        for (int i = 0; i < size; i++) {
            this.f1384m.get(i).m776a(z);
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: d */
    public int mo760d() {
        return this.f1376e.mo1034j();
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: e */
    public Context mo761e() {
        if (this.f1373b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1372a.getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.k, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1373b = new ContextThemeWrapper(this.f1372a, i);
            } else {
                this.f1373b = this.f1372a;
            }
        }
        return this.f1373b;
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: g */
    public void mo763g(Configuration configuration) {
        m867w(this.f1372a.getResources().getBoolean(com.didjdk.adbhelper.R.bool.a));
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: i */
    public boolean mo765i(int i, KeyEvent keyEvent) {
        C0229g c0229g;
        d dVar = this.f1380i;
        if (dVar == null || (c0229g = dVar.f1401e) == null) {
            return false;
        }
        c0229g.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c0229g.performShortcut(i, keyEvent, 0);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: l */
    public void mo768l(boolean z) {
        if (this.f1379h) {
            return;
        }
        m866v(z ? 4 : 0, 4);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: m */
    public void mo769m(boolean z) {
        m866v(z ? 4 : 0, 4);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: n */
    public void mo770n(boolean z) {
        m866v(z ? 8 : 0, 8);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: o */
    public void mo771o(boolean z) {
        C0221g c0221g;
        this.f1392u = z;
        if (z || (c0221g = this.f1391t) == null) {
            return;
        }
        c0221g.m913a();
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: p */
    public void mo772p(int i) {
        this.f1376e.setTitle(this.f1372a.getString(i));
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: q */
    public void mo773q(CharSequence charSequence) {
        this.f1376e.setTitle(charSequence);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: r */
    public void mo774r(CharSequence charSequence) {
        this.f1376e.setWindowTitle(charSequence);
    }

    @Override // p006b.p008b.p009c.AbstractC0185a
    /* JADX INFO: renamed from: s */
    public AbstractC0215a mo775s(AbstractC0215a.a aVar) {
        d dVar = this.f1380i;
        if (dVar != null) {
            dVar.mo869c();
        }
        this.f1374c.setHideOnContentScrollEnabled(false);
        this.f1377f.m32h();
        d dVar2 = new d(this.f1377f.getContext(), aVar);
        dVar2.f1401e.m966z();
        try {
            boolean zMo847c = dVar2.f1402f.mo847c(dVar2, dVar2.f1401e);
            dVar2.f1401e.m965y();
            if (!zMo847c) {
                return null;
            }
            this.f1380i = dVar2;
            dVar2.mo875i();
            this.f1377f.m30f(dVar2);
            m864t(true);
            this.f1377f.sendAccessibilityEvent(32);
            return dVar2;
        } catch (Throwable th) {
            dVar2.f1401e.m965y();
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m864t(boolean z) {
        C0423r c0423rMo1043s;
        C0423r c0423rM999e;
        if (z) {
            if (!this.f1389r) {
                this.f1389r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1374c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m868x(false);
            }
        } else if (this.f1389r) {
            this.f1389r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1374c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m868x(false);
        }
        ActionBarContainer actionBarContainer = this.f1375d;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (!actionBarContainer.isLaidOut()) {
            if (z) {
                this.f1376e.mo1035k(4);
                this.f1377f.setVisibility(0);
                return;
            } else {
                this.f1376e.mo1035k(0);
                this.f1377f.setVisibility(8);
                return;
            }
        }
        if (z) {
            c0423rM999e = this.f1376e.mo1043s(4, 100L);
            c0423rMo1043s = this.f1377f.m999e(0, 200L);
        } else {
            c0423rMo1043s = this.f1376e.mo1043s(0, 200L);
            c0423rM999e = this.f1377f.m999e(8, 100L);
        }
        C0221g c0221g = new C0221g();
        c0221g.f1541a.add(c0423rM999e);
        View view = c0423rM999e.f2732a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = c0423rMo1043s.f2732a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        c0221g.f1541a.add(c0423rMo1043s);
        c0221g.m914b();
    }

    /* JADX INFO: renamed from: u */
    public final void m865u(View view) {
        InterfaceC0252d0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.didjdk.adbhelper.R.id.de);
        this.f1374c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.didjdk.adbhelper.R.id.ap);
        if (callbackFindViewById instanceof InterfaceC0252d0) {
            wrapper = (InterfaceC0252d0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sbM2191e = a.m2191e("Can't make a decor toolbar out of ");
                sbM2191e.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sbM2191e.toString());
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1376e = wrapper;
        this.f1377f = (ActionBarContextView) view.findViewById(com.didjdk.adbhelper.R.id.ax);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.didjdk.adbhelper.R.id.ar);
        this.f1375d = actionBarContainer;
        InterfaceC0252d0 interfaceC0252d0 = this.f1376e;
        if (interfaceC0252d0 == null || this.f1377f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0207w.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1372a = interfaceC0252d0.mo1041q();
        boolean z = (this.f1376e.mo1034j() & 4) != 0;
        if (z) {
            this.f1379h = true;
        }
        Context context = this.f1372a;
        this.f1376e.mo1040p((context.getApplicationInfo().targetSdkVersion < 14) || z);
        m867w(context.getResources().getBoolean(com.didjdk.adbhelper.R.bool.a));
        TypedArray typedArrayObtainStyledAttributes = this.f1372a.obtainStyledAttributes(null, C0184b.f1200a, com.didjdk.adbhelper.R.attr.f, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1374c;
            if (!actionBarOverlayLayout2.f200i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1393v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            C0418m.m1578u(this.f1375d, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: v */
    public void m866v(int i, int i2) {
        int iMo1034j = this.f1376e.mo1034j();
        if ((i2 & 4) != 0) {
            this.f1379h = true;
        }
        this.f1376e.mo1048x((i & i2) | ((i2 ^ (-1)) & iMo1034j));
    }

    /* JADX INFO: renamed from: w */
    public final void m867w(boolean z) {
        this.f1385n = z;
        if (z) {
            this.f1375d.setTabContainer(null);
            this.f1376e.mo1038n(null);
        } else {
            this.f1376e.mo1038n(null);
            this.f1375d.setTabContainer(null);
        }
        boolean z2 = this.f1376e.mo1042r() == 2;
        this.f1376e.mo1047w(!this.f1385n && z2);
        this.f1374c.setHasNonEmbeddedTabs(!this.f1385n && z2);
    }

    /* JADX INFO: renamed from: x */
    public final void m868x(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.f1389r || !this.f1388q)) {
            if (this.f1390s) {
                this.f1390s = false;
                C0221g c0221g = this.f1391t;
                if (c0221g != null) {
                    c0221g.m913a();
                }
                if (this.f1386o != 0 || (!this.f1392u && !z)) {
                    this.f1394w.mo849a(null);
                    return;
                }
                this.f1375d.setAlpha(1.0f);
                this.f1375d.setTransitioning(true);
                C0221g c0221g2 = new C0221g();
                float f = -this.f1375d.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f1375d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                C0423r c0423rM1558a = C0418m.m1558a(this.f1375d);
                c0423rM1558a.m1597g(f);
                c0423rM1558a.m1596f(this.f1396y);
                if (!c0221g2.f1545e) {
                    c0221g2.f1541a.add(c0423rM1558a);
                }
                if (this.f1387p && (view = this.f1378g) != null) {
                    C0423r c0423rM1558a2 = C0418m.m1558a(view);
                    c0423rM1558a2.m1597g(f);
                    if (!c0221g2.f1545e) {
                        c0221g2.f1541a.add(c0423rM1558a2);
                    }
                }
                Interpolator interpolator = f1371z;
                boolean z2 = c0221g2.f1545e;
                if (!z2) {
                    c0221g2.f1543c = interpolator;
                }
                if (!z2) {
                    c0221g2.f1542b = 250L;
                }
                InterfaceC0424s interfaceC0424s = this.f1394w;
                if (!z2) {
                    c0221g2.f1544d = interfaceC0424s;
                }
                this.f1391t = c0221g2;
                c0221g2.m914b();
                return;
            }
            return;
        }
        if (this.f1390s) {
            return;
        }
        this.f1390s = true;
        C0221g c0221g3 = this.f1391t;
        if (c0221g3 != null) {
            c0221g3.m913a();
        }
        this.f1375d.setVisibility(0);
        if (this.f1386o == 0 && (this.f1392u || z)) {
            this.f1375d.setTranslationY(0.0f);
            float f2 = -this.f1375d.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f1375d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f1375d.setTranslationY(f2);
            C0221g c0221g4 = new C0221g();
            C0423r c0423rM1558a3 = C0418m.m1558a(this.f1375d);
            c0423rM1558a3.m1597g(0.0f);
            c0423rM1558a3.m1596f(this.f1396y);
            if (!c0221g4.f1545e) {
                c0221g4.f1541a.add(c0423rM1558a3);
            }
            if (this.f1387p && (view3 = this.f1378g) != null) {
                view3.setTranslationY(f2);
                C0423r c0423rM1558a4 = C0418m.m1558a(this.f1378g);
                c0423rM1558a4.m1597g(0.0f);
                if (!c0221g4.f1545e) {
                    c0221g4.f1541a.add(c0423rM1558a4);
                }
            }
            Interpolator interpolator2 = f1370A;
            boolean z3 = c0221g4.f1545e;
            if (!z3) {
                c0221g4.f1543c = interpolator2;
            }
            if (!z3) {
                c0221g4.f1542b = 250L;
            }
            InterfaceC0424s interfaceC0424s2 = this.f1395x;
            if (!z3) {
                c0221g4.f1544d = interfaceC0424s2;
            }
            this.f1391t = c0221g4;
            c0221g4.m914b();
        } else {
            this.f1375d.setAlpha(1.0f);
            this.f1375d.setTranslationY(0.0f);
            if (this.f1387p && (view2 = this.f1378g) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f1395x.mo849a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1374c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (Build.VERSION.SDK_INT >= 20) {
                actionBarOverlayLayout.requestApplyInsets();
            } else {
                actionBarOverlayLayout.requestFitSystemWindows();
            }
        }
    }
}
