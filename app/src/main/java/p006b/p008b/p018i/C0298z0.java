package p006b.p008b.p018i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0059d;
import com.didjdk.adbhelper.R;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0423r;
import p006b.p032h.p044j.C0425t;

/* JADX INFO: renamed from: b.b.i.z0 */
/* JADX INFO: loaded from: classes.dex */
public class C0298z0 implements InterfaceC0252d0 {

    /* JADX INFO: renamed from: a */
    public Toolbar f2078a;

    /* JADX INFO: renamed from: b */
    public int f2079b;

    /* JADX INFO: renamed from: c */
    public View f2080c;

    /* JADX INFO: renamed from: d */
    public View f2081d;

    /* JADX INFO: renamed from: e */
    public Drawable f2082e;

    /* JADX INFO: renamed from: f */
    public Drawable f2083f;

    /* JADX INFO: renamed from: g */
    public Drawable f2084g;

    /* JADX INFO: renamed from: h */
    public boolean f2085h;

    /* JADX INFO: renamed from: i */
    public CharSequence f2086i;

    /* JADX INFO: renamed from: j */
    public CharSequence f2087j;

    /* JADX INFO: renamed from: k */
    public CharSequence f2088k;

    /* JADX INFO: renamed from: l */
    public Window.Callback f2089l;

    /* JADX INFO: renamed from: m */
    public boolean f2090m;

    /* JADX INFO: renamed from: n */
    public C0248c f2091n;

    /* JADX INFO: renamed from: o */
    public int f2092o;

    /* JADX INFO: renamed from: p */
    public Drawable f2093p;

    /* JADX INFO: renamed from: b.b.i.z0$a */
    public class a extends C0425t {

        /* JADX INFO: renamed from: a */
        public boolean f2094a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2095b;

        public a(int i) {
            this.f2095b = i;
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: a */
        public void mo849a(View view) {
            if (this.f2094a) {
                return;
            }
            C0298z0.this.f2078a.setVisibility(this.f2095b);
        }

        @Override // p006b.p032h.p044j.C0425t, p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: b */
        public void mo857b(View view) {
            C0298z0.this.f2078a.setVisibility(0);
        }

        @Override // p006b.p032h.p044j.C0425t, p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: c */
        public void mo1000c(View view) {
            this.f2094a = true;
        }
    }

    public C0298z0(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f2092o = 0;
        this.f2078a = toolbar;
        this.f2086i = toolbar.getTitle();
        this.f2087j = toolbar.getSubtitle();
        this.f2085h = this.f2086i != null;
        this.f2084g = toolbar.getNavigationIcon();
        C0294x0 c0294x0M1152q = C0294x0.m1152q(toolbar.getContext(), null, C0184b.f1200a, R.attr.f, 0);
        int i = 15;
        this.f2093p = c0294x0M1152q.m1159g(15);
        if (z) {
            CharSequence charSequenceM1166n = c0294x0M1152q.m1166n(27);
            if (!TextUtils.isEmpty(charSequenceM1166n)) {
                setTitle(charSequenceM1166n);
            }
            CharSequence charSequenceM1166n2 = c0294x0M1152q.m1166n(25);
            if (!TextUtils.isEmpty(charSequenceM1166n2)) {
                this.f2087j = charSequenceM1166n2;
                if ((this.f2079b & 8) != 0) {
                    this.f2078a.setSubtitle(charSequenceM1166n2);
                }
            }
            Drawable drawableM1159g = c0294x0M1152q.m1159g(20);
            if (drawableM1159g != null) {
                this.f2083f = drawableM1159g;
                m1180A();
            }
            Drawable drawableM1159g2 = c0294x0M1152q.m1159g(17);
            if (drawableM1159g2 != null) {
                this.f2082e = drawableM1159g2;
                m1180A();
            }
            if (this.f2084g == null && (drawable = this.f2093p) != null) {
                this.f2084g = drawable;
                m1182z();
            }
            mo1048x(c0294x0M1152q.m1162j(10, 0));
            int iM1164l = c0294x0M1152q.m1164l(9, 0);
            if (iM1164l != 0) {
                View viewInflate = LayoutInflater.from(this.f2078a.getContext()).inflate(iM1164l, (ViewGroup) this.f2078a, false);
                View view = this.f2081d;
                if (view != null && (this.f2079b & 16) != 0) {
                    this.f2078a.removeView(view);
                }
                this.f2081d = viewInflate;
                if (viewInflate != null && (this.f2079b & 16) != 0) {
                    this.f2078a.addView(viewInflate);
                }
                mo1048x(this.f2079b | 16);
            }
            int iM1163k = c0294x0M1152q.m1163k(13, 0);
            if (iM1163k > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2078a.getLayoutParams();
                layoutParams.height = iM1163k;
                this.f2078a.setLayoutParams(layoutParams);
            }
            int iM1157e = c0294x0M1152q.m1157e(7, -1);
            int iM1157e2 = c0294x0M1152q.m1157e(3, -1);
            if (iM1157e >= 0 || iM1157e2 >= 0) {
                Toolbar toolbar2 = this.f2078a;
                int iMax = Math.max(iM1157e, 0);
                int iMax2 = Math.max(iM1157e2, 0);
                toolbar2.m98d();
                toolbar2.f405u.m1118a(iMax, iMax2);
            }
            int iM1164l2 = c0294x0M1152q.m1164l(28, 0);
            if (iM1164l2 != 0) {
                Toolbar toolbar3 = this.f2078a;
                Context context = toolbar3.getContext();
                toolbar3.f397m = iM1164l2;
                TextView textView = toolbar3.f387c;
                if (textView != null) {
                    textView.setTextAppearance(context, iM1164l2);
                }
            }
            int iM1164l3 = c0294x0M1152q.m1164l(26, 0);
            if (iM1164l3 != 0) {
                Toolbar toolbar4 = this.f2078a;
                Context context2 = toolbar4.getContext();
                toolbar4.f398n = iM1164l3;
                TextView textView2 = toolbar4.f388d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iM1164l3);
                }
            }
            int iM1164l4 = c0294x0M1152q.m1164l(22, 0);
            if (iM1164l4 != 0) {
                this.f2078a.setPopupTheme(iM1164l4);
            }
        } else {
            if (this.f2078a.getNavigationIcon() != null) {
                this.f2093p = this.f2078a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f2079b = i;
        }
        c0294x0M1152q.f2052b.recycle();
        if (R.string.b != this.f2092o) {
            this.f2092o = R.string.b;
            if (TextUtils.isEmpty(this.f2078a.getNavigationContentDescription())) {
                int i2 = this.f2092o;
                this.f2088k = i2 != 0 ? mo1041q().getString(i2) : null;
                m1181y();
            }
        }
        this.f2088k = this.f2078a.getNavigationContentDescription();
        this.f2078a.setNavigationOnClickListener(new ViewOnClickListenerC0296y0(this));
    }

    /* JADX INFO: renamed from: A */
    public final void m1180A() {
        Drawable drawable;
        int i = this.f2079b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2083f) == null) {
            drawable = this.f2082e;
        }
        this.f2078a.setLogo(drawable);
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: a */
    public void mo1025a(Menu menu, InterfaceC0235m.a aVar) {
        C0231i c0231i;
        if (this.f2091n == null) {
            C0248c c0248c = new C0248c(this.f2078a.getContext());
            this.f2091n = c0248c;
            c0248c.f1575j = R.id.b2;
        }
        C0248c c0248c2 = this.f2091n;
        c0248c2.f1571f = aVar;
        Toolbar toolbar = this.f2078a;
        C0229g c0229g = (C0229g) menu;
        if (c0229g == null && toolbar.f386b == null) {
            return;
        }
        toolbar.m100f();
        C0229g c0229g2 = toolbar.f386b.f223q;
        if (c0229g2 == c0229g) {
            return;
        }
        if (c0229g2 != null) {
            c0229g2.m961u(toolbar.f380K);
            c0229g2.m961u(toolbar.f381L);
        }
        if (toolbar.f381L == null) {
            toolbar.f381L = toolbar.new C0059d();
        }
        c0248c2.f1793s = true;
        if (c0229g != null) {
            c0229g.m942b(c0248c2, toolbar.f395k);
            c0229g.m942b(toolbar.f381L, toolbar.f395k);
        } else {
            c0248c2.mo120g(toolbar.f395k, null);
            Toolbar.C0059d c0059d = toolbar.f381L;
            C0229g c0229g3 = c0059d.f414b;
            if (c0229g3 != null && (c0231i = c0059d.f415c) != null) {
                c0229g3.mo944d(c0231i);
            }
            c0059d.f414b = null;
            c0248c2.mo125n(true);
            toolbar.f381L.mo125n(true);
        }
        toolbar.f386b.setPopupTheme(toolbar.f396l);
        toolbar.f386b.setPresenter(c0248c2);
        toolbar.f380K = c0248c2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: b */
    public boolean mo1026b() {
        boolean z;
        ActionMenuView actionMenuView = this.f2078a.f386b;
        if (actionMenuView == null) {
            return false;
        }
        C0248c c0248c = actionMenuView.f227u;
        if (c0248c == null) {
            z = false;
        } else {
            if (c0248c.f1798x != null || c0248c.m1020p()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: c */
    public boolean mo1027c() {
        return this.f2078a.m109o();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    public void collapseActionView() {
        Toolbar.C0059d c0059d = this.f2078a.f381L;
        C0231i c0231i = c0059d == null ? null : c0059d.f415c;
        if (c0231i != null) {
            c0231i.collapseActionView();
        }
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: d */
    public boolean mo1028d() {
        ActionMenuView actionMenuView = this.f2078a.f386b;
        if (actionMenuView == null) {
            return false;
        }
        C0248c c0248c = actionMenuView.f227u;
        return c0248c != null && c0248c.m1018k();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: e */
    public boolean mo1029e() {
        return this.f2078a.m115u();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: f */
    public void mo1030f() {
        this.f2090m = true;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: g */
    public boolean mo1031g() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f2078a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f386b) != null && actionMenuView.f226t;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    public CharSequence getTitle() {
        return this.f2078a.getTitle();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: h */
    public void mo1032h() {
        C0248c c0248c;
        ActionMenuView actionMenuView = this.f2078a.f386b;
        if (actionMenuView == null || (c0248c = actionMenuView.f227u) == null) {
            return;
        }
        c0248c.m1016b();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: i */
    public void mo1033i(InterfaceC0235m.a aVar, C0229g.a aVar2) {
        Toolbar toolbar = this.f2078a;
        toolbar.f382M = aVar;
        toolbar.f383N = aVar2;
        ActionMenuView actionMenuView = toolbar.f386b;
        if (actionMenuView != null) {
            actionMenuView.f228v = aVar;
            actionMenuView.f229w = aVar2;
        }
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: j */
    public int mo1034j() {
        return this.f2079b;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: k */
    public void mo1035k(int i) {
        this.f2078a.setVisibility(i);
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: l */
    public Menu mo1036l() {
        return this.f2078a.getMenu();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: m */
    public void mo1037m(int i) {
        this.f2083f = i != 0 ? C0208a.m884b(mo1041q(), i) : null;
        m1180A();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: n */
    public void mo1038n(C0280q0 c0280q0) {
        View view = this.f2080c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2078a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2080c);
            }
        }
        this.f2080c = null;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: o */
    public ViewGroup mo1039o() {
        return this.f2078a;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: p */
    public void mo1040p(boolean z) {
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: q */
    public Context mo1041q() {
        return this.f2078a.getContext();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: r */
    public int mo1042r() {
        return 0;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: s */
    public C0423r mo1043s(int i, long j) {
        C0423r c0423rM1558a = C0418m.m1558a(this.f2078a);
        c0423rM1558a.m1591a(i == 0 ? 1.0f : 0.0f);
        c0423rM1558a.m1593c(j);
        a aVar = new a(i);
        View view = c0423rM1558a.f2732a.get();
        if (view != null) {
            c0423rM1558a.m1595e(view, aVar);
        }
        return c0423rM1558a;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    public void setIcon(int i) {
        this.f2082e = i != 0 ? C0208a.m884b(mo1041q(), i) : null;
        m1180A();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    public void setIcon(Drawable drawable) {
        this.f2082e = drawable;
        m1180A();
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    public void setTitle(CharSequence charSequence) {
        this.f2085h = true;
        this.f2086i = charSequence;
        if ((this.f2079b & 8) != 0) {
            this.f2078a.setTitle(charSequence);
        }
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    public void setWindowCallback(Window.Callback callback) {
        this.f2089l = callback;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f2085h) {
            return;
        }
        this.f2086i = charSequence;
        if ((this.f2079b & 8) != 0) {
            this.f2078a.setTitle(charSequence);
        }
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: t */
    public void mo1044t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: u */
    public boolean mo1045u() {
        Toolbar.C0059d c0059d = this.f2078a.f381L;
        return (c0059d == null || c0059d.f415c == null) ? false : true;
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: v */
    public void mo1046v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: w */
    public void mo1047w(boolean z) {
        this.f2078a.setCollapsible(z);
    }

    @Override // p006b.p008b.p018i.InterfaceC0252d0
    /* JADX INFO: renamed from: x */
    public void mo1048x(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f2079b ^ i;
        this.f2079b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1181y();
                }
                m1182z();
            }
            if ((i2 & 3) != 0) {
                m1180A();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2078a.setTitle(this.f2086i);
                    toolbar = this.f2078a;
                    charSequence = this.f2087j;
                } else {
                    charSequence = null;
                    this.f2078a.setTitle((CharSequence) null);
                    toolbar = this.f2078a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f2081d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f2078a.addView(view);
            } else {
                this.f2078a.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1181y() {
        if ((this.f2079b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2088k)) {
                this.f2078a.setNavigationContentDescription(this.f2092o);
            } else {
                this.f2078a.setNavigationContentDescription(this.f2088k);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m1182z() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f2079b & 4) != 0) {
            toolbar = this.f2078a;
            drawable = this.f2084g;
            if (drawable == null) {
                drawable = this.f2093p;
            }
        } else {
            toolbar = this.f2078a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }
}
