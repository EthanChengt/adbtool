package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p018i.C0258f0;
import p006b.p008b.p018i.C0272m0;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.h.i.q */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0239q extends AbstractC0233k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0235m, View.OnKeyListener {

    /* JADX INFO: renamed from: c */
    public final Context f1713c;

    /* JADX INFO: renamed from: d */
    public final C0229g f1714d;

    /* JADX INFO: renamed from: e */
    public final C0228f f1715e;

    /* JADX INFO: renamed from: f */
    public final boolean f1716f;

    /* JADX INFO: renamed from: g */
    public final int f1717g;

    /* JADX INFO: renamed from: h */
    public final int f1718h;

    /* JADX INFO: renamed from: i */
    public final int f1719i;

    /* JADX INFO: renamed from: j */
    public final C0272m0 f1720j;

    /* JADX INFO: renamed from: m */
    public PopupWindow.OnDismissListener f1723m;

    /* JADX INFO: renamed from: n */
    public View f1724n;

    /* JADX INFO: renamed from: o */
    public View f1725o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0235m.a f1726p;

    /* JADX INFO: renamed from: q */
    public ViewTreeObserver f1727q;

    /* JADX INFO: renamed from: r */
    public boolean f1728r;

    /* JADX INFO: renamed from: s */
    public boolean f1729s;

    /* JADX INFO: renamed from: t */
    public int f1730t;

    /* JADX INFO: renamed from: v */
    public boolean f1732v;

    /* JADX INFO: renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f1721k = new a();

    /* JADX INFO: renamed from: l */
    public final View.OnAttachStateChangeListener f1722l = new b();

    /* JADX INFO: renamed from: u */
    public int f1731u = 0;

    /* JADX INFO: renamed from: b.b.h.i.q$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerC0239q.this.mo921b()) {
                ViewOnKeyListenerC0239q viewOnKeyListenerC0239q = ViewOnKeyListenerC0239q.this;
                if (viewOnKeyListenerC0239q.f1720j.f1923z) {
                    return;
                }
                View view = viewOnKeyListenerC0239q.f1725o;
                if (view == null || !view.isShown()) {
                    ViewOnKeyListenerC0239q.this.dismiss();
                } else {
                    ViewOnKeyListenerC0239q.this.f1720j.mo922f();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.q$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0239q.this.f1727q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0239q.this.f1727q = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0239q viewOnKeyListenerC0239q = ViewOnKeyListenerC0239q.this;
                viewOnKeyListenerC0239q.f1727q.removeGlobalOnLayoutListener(viewOnKeyListenerC0239q.f1721k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0239q(Context context, C0229g c0229g, View view, int i, int i2, boolean z) {
        this.f1713c = context;
        this.f1714d = c0229g;
        this.f1716f = z;
        this.f1715e = new C0228f(c0229g, LayoutInflater.from(context), z, R.layout.t);
        this.f1718h = i;
        this.f1719i = i2;
        Resources resources = context.getResources();
        this.f1717g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.x));
        this.f1724n = view;
        this.f1720j = new C0272m0(context, null, i, i2);
        c0229g.m942b(this, context);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: a */
    public void mo116a(C0229g c0229g, boolean z) {
        if (c0229g != this.f1714d) {
            return;
        }
        dismiss();
        InterfaceC0235m.a aVar = this.f1726p;
        if (aVar != null) {
            aVar.mo60a(c0229g, z);
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: b */
    public boolean mo921b() {
        return !this.f1728r && this.f1720j.mo921b();
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: d */
    public boolean mo118d() {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    public void dismiss() {
        if (mo921b()) {
            this.f1720j.dismiss();
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: e */
    public Parcelable mo119e() {
        return null;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: f */
    public void mo922f() {
        View view;
        boolean z = false;
        if (mo921b()) {
            z = true;
        } else if (!this.f1728r && (view = this.f1724n) != null) {
            this.f1725o = view;
            this.f1720j.f1898A.setOnDismissListener(this);
            C0272m0 c0272m0 = this.f1720j;
            c0272m0.f1915r = this;
            c0272m0.m1098s(true);
            View view2 = this.f1725o;
            boolean z2 = this.f1727q == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f1727q = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1721k);
            }
            view2.addOnAttachStateChangeListener(this.f1722l);
            C0272m0 c0272m1 = this.f1720j;
            c0272m1.f1914q = view2;
            c0272m1.f1910m = this.f1731u;
            if (!this.f1729s) {
                this.f1730t = AbstractC0233k.m987q(this.f1715e, null, this.f1713c, this.f1717g);
                this.f1729s = true;
            }
            this.f1720j.m1097r(this.f1730t);
            this.f1720j.f1898A.setInputMethodMode(2);
            C0272m0 c0272m2 = this.f1720j;
            Rect rect = this.f1698b;
            Objects.requireNonNull(c0272m2);
            c0272m2.f1922y = rect != null ? new Rect(rect) : null;
            this.f1720j.mo922f();
            C0258f0 c0258f0 = this.f1720j.f1901d;
            c0258f0.setOnKeyListener(this);
            if (this.f1732v && this.f1714d.f1642m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1713c).inflate(R.layout.s, (ViewGroup) c0258f0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(this.f1714d.f1642m);
                }
                frameLayout.setEnabled(false);
                c0258f0.addHeaderView(frameLayout, null, false);
            }
            this.f1720j.mo1095o(this.f1715e);
            this.f1720j.mo922f();
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: h */
    public void mo121h(Parcelable parcelable) {
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: k */
    public ListView mo923k() {
        return this.f1720j.f1901d;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: l */
    public void mo918l(InterfaceC0235m.a aVar) {
        this.f1726p = aVar;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: m */
    public boolean mo124m(SubMenuC0240r subMenuC0240r) {
        boolean z;
        if (subMenuC0240r.hasVisibleItems()) {
            C0234l c0234l = new C0234l(this.f1713c, subMenuC0240r, this.f1725o, this.f1716f, this.f1718h, this.f1719i);
            c0234l.m992d(this.f1726p);
            boolean zM988y = AbstractC0233k.m988y(subMenuC0240r);
            c0234l.f1706h = zM988y;
            AbstractC0233k abstractC0233k = c0234l.f1708j;
            if (abstractC0233k != null) {
                abstractC0233k.mo927s(zM988y);
            }
            c0234l.f1709k = this.f1723m;
            this.f1723m = null;
            this.f1714d.m943c(false);
            C0272m0 c0272m0 = this.f1720j;
            int width = c0272m0.f1904g;
            int i = !c0272m0.f1907j ? 0 : c0272m0.f1905h;
            int i2 = this.f1731u;
            View view = this.f1724n;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                width += this.f1724n.getWidth();
            }
            if (c0234l.m990b()) {
                z = true;
            } else if (c0234l.f1704f == null) {
                z = false;
            } else {
                c0234l.m993e(width, i, true, true);
                z = true;
            }
            if (z) {
                InterfaceC0235m.a aVar = this.f1726p;
                if (aVar != null) {
                    aVar.mo61b(subMenuC0240r);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: n */
    public void mo125n(boolean z) {
        this.f1729s = false;
        C0228f c0228f = this.f1715e;
        if (c0228f != null) {
            c0228f.notifyDataSetChanged();
        }
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: o */
    public void mo924o(C0229g c0229g) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1728r = true;
        this.f1714d.m943c(true);
        ViewTreeObserver viewTreeObserver = this.f1727q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1727q = this.f1725o.getViewTreeObserver();
            }
            this.f1727q.removeGlobalOnLayoutListener(this.f1721k);
            this.f1727q = null;
        }
        this.f1725o.removeOnAttachStateChangeListener(this.f1722l);
        PopupWindow.OnDismissListener onDismissListener = this.f1723m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: r */
    public void mo926r(View view) {
        this.f1724n = view;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: s */
    public void mo927s(boolean z) {
        this.f1715e.f1625d = z;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: t */
    public void mo928t(int i) {
        this.f1731u = i;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: u */
    public void mo929u(int i) {
        this.f1720j.f1904g = i;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: v */
    public void mo930v(PopupWindow.OnDismissListener onDismissListener) {
        this.f1723m = onDismissListener;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: w */
    public void mo931w(boolean z) {
        this.f1732v = z;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: x */
    public void mo932x(int i) {
        C0272m0 c0272m0 = this.f1720j;
        c0272m0.f1905h = i;
        c0272m0.f1907j = true;
    }
}
