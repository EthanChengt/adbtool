package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p018i.C0258f0;
import p006b.p008b.p018i.C0272m0;
import p006b.p008b.p018i.InterfaceC0270l0;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.h.i.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0226d extends AbstractC0233k implements InterfaceC0235m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public PopupWindow.OnDismissListener f1579A;

    /* JADX INFO: renamed from: B */
    public boolean f1580B;

    /* JADX INFO: renamed from: c */
    public final Context f1581c;

    /* JADX INFO: renamed from: d */
    public final int f1582d;

    /* JADX INFO: renamed from: e */
    public final int f1583e;

    /* JADX INFO: renamed from: f */
    public final int f1584f;

    /* JADX INFO: renamed from: g */
    public final boolean f1585g;

    /* JADX INFO: renamed from: h */
    public final Handler f1586h;

    /* JADX INFO: renamed from: p */
    public View f1594p;

    /* JADX INFO: renamed from: q */
    public View f1595q;

    /* JADX INFO: renamed from: r */
    public int f1596r;

    /* JADX INFO: renamed from: s */
    public boolean f1597s;

    /* JADX INFO: renamed from: t */
    public boolean f1598t;

    /* JADX INFO: renamed from: u */
    public int f1599u;

    /* JADX INFO: renamed from: v */
    public int f1600v;

    /* JADX INFO: renamed from: x */
    public boolean f1602x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0235m.a f1603y;

    /* JADX INFO: renamed from: z */
    public ViewTreeObserver f1604z;

    /* JADX INFO: renamed from: i */
    public final List<C0229g> f1587i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final List<d> f1588j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f1589k = new a();

    /* JADX INFO: renamed from: l */
    public final View.OnAttachStateChangeListener f1590l = new b();

    /* JADX INFO: renamed from: m */
    public final InterfaceC0270l0 f1591m = new c();

    /* JADX INFO: renamed from: n */
    public int f1592n = 0;

    /* JADX INFO: renamed from: o */
    public int f1593o = 0;

    /* JADX INFO: renamed from: w */
    public boolean f1601w = false;

    /* JADX INFO: renamed from: b.b.h.i.d$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0226d.this.mo921b() || ViewOnKeyListenerC0226d.this.f1588j.size() <= 0 || ViewOnKeyListenerC0226d.this.f1588j.get(0).f1612a.f1923z) {
                return;
            }
            View view = ViewOnKeyListenerC0226d.this.f1595q;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0226d.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0226d.this.f1588j.iterator();
            while (it.hasNext()) {
                it.next().f1612a.mo922f();
            }
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.d$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0226d.this.f1604z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0226d.this.f1604z = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0226d viewOnKeyListenerC0226d = ViewOnKeyListenerC0226d.this;
                viewOnKeyListenerC0226d.f1604z.removeGlobalOnLayoutListener(viewOnKeyListenerC0226d.f1589k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.d$c */
    public class c implements InterfaceC0270l0 {

        /* JADX INFO: renamed from: b.b.h.i.d$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ d f1608b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ MenuItem f1609c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C0229g f1610d;

            public a(d dVar, MenuItem menuItem, C0229g c0229g) {
                this.f1608b = dVar;
                this.f1609c = menuItem;
                this.f1610d = c0229g;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1608b;
                if (dVar != null) {
                    ViewOnKeyListenerC0226d.this.f1580B = true;
                    dVar.f1613b.m943c(false);
                    ViewOnKeyListenerC0226d.this.f1580B = false;
                }
                if (this.f1609c.isEnabled() && this.f1609c.hasSubMenu()) {
                    this.f1610d.m958r(this.f1609c, 4);
                }
            }
        }

        public c() {
        }

        @Override // p006b.p008b.p018i.InterfaceC0270l0
        /* JADX INFO: renamed from: e */
        public void mo934e(C0229g c0229g, MenuItem menuItem) {
            ViewOnKeyListenerC0226d.this.f1586h.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0226d.this.f1588j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0229g == ViewOnKeyListenerC0226d.this.f1588j.get(i).f1613b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC0226d.this.f1586h.postAtTime(new a(i2 < ViewOnKeyListenerC0226d.this.f1588j.size() ? ViewOnKeyListenerC0226d.this.f1588j.get(i2) : null, menuItem, c0229g), c0229g, SystemClock.uptimeMillis() + 200);
        }

        @Override // p006b.p008b.p018i.InterfaceC0270l0
        /* JADX INFO: renamed from: h */
        public void mo935h(C0229g c0229g, MenuItem menuItem) {
            ViewOnKeyListenerC0226d.this.f1586h.removeCallbacksAndMessages(c0229g);
        }
    }

    /* JADX INFO: renamed from: b.b.h.i.d$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final C0272m0 f1612a;

        /* JADX INFO: renamed from: b */
        public final C0229g f1613b;

        /* JADX INFO: renamed from: c */
        public final int f1614c;

        public d(C0272m0 c0272m0, C0229g c0229g, int i) {
            this.f1612a = c0272m0;
            this.f1613b = c0229g;
            this.f1614c = i;
        }
    }

    public ViewOnKeyListenerC0226d(Context context, View view, int i, int i2, boolean z) {
        this.f1581c = context;
        this.f1594p = view;
        this.f1583e = i;
        this.f1584f = i2;
        this.f1585g = z;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        this.f1596r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1582d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.x));
        this.f1586h = new Handler();
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: a */
    public void mo116a(C0229g c0229g, boolean z) {
        int i;
        int size = this.f1588j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (c0229g == this.f1588j.get(i2).f1613b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.f1588j.size()) {
            this.f1588j.get(i3).f1613b.m943c(false);
        }
        d dVarRemove = this.f1588j.remove(i2);
        dVarRemove.f1613b.m961u(this);
        if (this.f1580B) {
            C0272m0 c0272m0 = dVarRemove.f1612a;
            Objects.requireNonNull(c0272m0);
            if (Build.VERSION.SDK_INT >= 23) {
                c0272m0.f1898A.setExitTransition(null);
            }
            dVarRemove.f1612a.f1898A.setAnimationStyle(0);
        }
        dVarRemove.f1612a.dismiss();
        int size2 = this.f1588j.size();
        if (size2 > 0) {
            i = this.f1588j.get(size2 - 1).f1614c;
        } else {
            View view = this.f1594p;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            i = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        this.f1596r = i;
        if (size2 != 0) {
            if (z) {
                this.f1588j.get(0).f1613b.m943c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0235m.a aVar = this.f1603y;
        if (aVar != null) {
            aVar.mo60a(c0229g, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1604z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1604z.removeGlobalOnLayoutListener(this.f1589k);
            }
            this.f1604z = null;
        }
        this.f1595q.removeOnAttachStateChangeListener(this.f1590l);
        this.f1579A.onDismiss();
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: b */
    public boolean mo921b() {
        return this.f1588j.size() > 0 && this.f1588j.get(0).f1612a.mo921b();
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: d */
    public boolean mo118d() {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    public void dismiss() {
        int size = this.f1588j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1588j.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f1612a.mo921b()) {
                    dVar.f1612a.dismiss();
                }
            }
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
        if (mo921b()) {
            return;
        }
        Iterator<C0229g> it = this.f1587i.iterator();
        while (it.hasNext()) {
            m933z(it.next());
        }
        this.f1587i.clear();
        View view = this.f1594p;
        this.f1595q = view;
        if (view != null) {
            boolean z = this.f1604z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1604z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1589k);
            }
            this.f1595q.addOnAttachStateChangeListener(this.f1590l);
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: h */
    public void mo121h(Parcelable parcelable) {
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: k */
    public ListView mo923k() {
        if (this.f1588j.isEmpty()) {
            return null;
        }
        List<d> list = this.f1588j;
        return list.get(list.size() - 1).f1612a.f1901d;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: l */
    public void mo918l(InterfaceC0235m.a aVar) {
        this.f1603y = aVar;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: m */
    public boolean mo124m(SubMenuC0240r subMenuC0240r) {
        for (d dVar : this.f1588j) {
            if (subMenuC0240r == dVar.f1613b) {
                dVar.f1612a.f1901d.requestFocus();
                return true;
            }
        }
        if (!subMenuC0240r.hasVisibleItems()) {
            return false;
        }
        subMenuC0240r.m942b(this, this.f1581c);
        if (mo921b()) {
            m933z(subMenuC0240r);
        } else {
            this.f1587i.add(subMenuC0240r);
        }
        InterfaceC0235m.a aVar = this.f1603y;
        if (aVar != null) {
            aVar.mo61b(subMenuC0240r);
        }
        return true;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: n */
    public void mo125n(boolean z) {
        Iterator<d> it = this.f1588j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f1612a.f1901d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0228f) adapter).notifyDataSetChanged();
        }
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: o */
    public void mo924o(C0229g c0229g) {
        c0229g.m942b(this, this.f1581c);
        if (mo921b()) {
            m933z(c0229g);
        } else {
            this.f1587i.add(c0229g);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1588j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1588j.get(i);
            if (!dVar.f1612a.mo921b()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f1613b.m943c(false);
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
    /* JADX INFO: renamed from: p */
    public boolean mo925p() {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: r */
    public void mo926r(View view) {
        if (this.f1594p != view) {
            this.f1594p = view;
            int i = this.f1592n;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            this.f1593o = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: s */
    public void mo927s(boolean z) {
        this.f1601w = z;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: t */
    public void mo928t(int i) {
        if (this.f1592n != i) {
            this.f1592n = i;
            View view = this.f1594p;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            this.f1593o = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: u */
    public void mo929u(int i) {
        this.f1597s = true;
        this.f1599u = i;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: v */
    public void mo930v(PopupWindow.OnDismissListener onDismissListener) {
        this.f1579A = onDismissListener;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: w */
    public void mo931w(boolean z) {
        this.f1602x = z;
    }

    @Override // p006b.p008b.p016h.p017i.AbstractC0233k
    /* JADX INFO: renamed from: x */
    public void mo932x(int i) {
        this.f1598t = true;
        this.f1600v = i;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x018d  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac A[PHI: r5
      0x01ac: PHI (r5v10 int) = (r5v9 int), (r5v5 int) binds: [B:83:0x01a8, B:79:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae A[PHI: r5
      0x01ae: PHI (r5v11 int) = (r5v5 int), (r5v12 int) binds: [B:82:0x01a6, B:81:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX INFO: renamed from: z */
    public final void m933z(C0229g c0229g) {
        d dVar;
        Rect rect;
        Rect rect2;
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        char c2;
        int i2;
        int i3;
        int i4;
        Method method;
        MenuItem item;
        C0228f c0228f;
        int headersCount;
        int firstVisiblePosition;
        int i5 = Build.VERSION.SDK_INT;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1581c);
        C0228f c0228f2 = new C0228f(c0229g, layoutInflaterFrom, this.f1585g, R.layout.l);
        if (!mo921b() && this.f1601w) {
            c0228f2.f1625d = true;
        } else if (mo921b()) {
            c0228f2.f1625d = AbstractC0233k.m988y(c0229g);
        }
        View childAt = null;
        int iM987q = AbstractC0233k.m987q(c0228f2, null, this.f1581c, this.f1582d);
        C0272m0 c0272m0 = new C0272m0(this.f1581c, null, this.f1583e, this.f1584f);
        c0272m0.f1935E = this.f1591m;
        c0272m0.f1915r = this;
        c0272m0.f1898A.setOnDismissListener(this);
        c0272m0.f1914q = this.f1594p;
        c0272m0.f1910m = this.f1593o;
        c0272m0.m1098s(true);
        c0272m0.f1898A.setInputMethodMode(2);
        c0272m0.mo1095o(c0228f2);
        c0272m0.m1097r(iM987q);
        c0272m0.f1910m = this.f1593o;
        if (this.f1588j.size() > 0) {
            List<d> list = this.f1588j;
            dVar = list.get(list.size() - 1);
            C0229g c0229g2 = dVar.f1613b;
            int size = c0229g2.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = c0229g2.getItem(i6);
                if (item.hasSubMenu() && c0229g == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item != null) {
                C0258f0 c0258f0 = dVar.f1612a.f1901d;
                ListAdapter adapter = c0258f0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0228f = (C0228f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0228f = (C0228f) adapter;
                    headersCount = 0;
                }
                int count = c0228f.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c0228f.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - c0258f0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0258f0.getChildCount()) {
                    childAt = c0258f0.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                if (i5 <= 28) {
                    method = C0272m0.f1934F;
                    if (method != null) {
                        try {
                            method.invoke(c0272m0.f1898A, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    c0272m0.f1898A.setTouchModal(false);
                }
                if (i5 >= 23) {
                    c0272m0.f1898A.setEnterTransition(null);
                }
                List<d> list2 = this.f1588j;
                C0258f0 c0258f1 = list2.get(list2.size() - 1).f1612a.f1901d;
                int[] iArr3 = new int[2];
                c0258f1.getLocationOnScreen(iArr3);
                Rect rect3 = new Rect();
                this.f1595q.getWindowVisibleDisplayFrame(rect3);
                i = (this.f1596r == 1 ? iArr3[0] - iM987q >= 0 : (c0258f1.getWidth() + iArr3[0]) + iM987q > rect3.right) ? 0 : 1;
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f1596r = i;
                if (i5 >= 26) {
                    c0272m0.f1914q = childAt;
                    i3 = 0;
                    i2 = 0;
                } else {
                    iArr = new int[2];
                    this.f1594p.getLocationOnScreen(iArr);
                    iArr2 = new int[2];
                    childAt.getLocationOnScreen(iArr2);
                    if ((this.f1593o & 7) == 5) {
                        c2 = 0;
                        iArr[0] = this.f1594p.getWidth() + iArr[0];
                        iArr2[0] = childAt.getWidth() + iArr2[0];
                    } else {
                        c2 = 0;
                    }
                    i2 = iArr2[c2] - iArr[c2];
                    i3 = iArr2[1] - iArr[1];
                }
                if ((this.f1593o & 5) == 5) {
                    if (z) {
                        i4 = i2 + iM987q;
                    } else {
                        iM987q = childAt.getWidth();
                        i4 = i2 - iM987q;
                    }
                } else if (z) {
                    iM987q = childAt.getWidth();
                    i4 = i2 + iM987q;
                } else {
                    i4 = i2 - iM987q;
                }
                c0272m0.f1904g = i4;
                c0272m0.f1909l = true;
                c0272m0.f1908k = true;
                c0272m0.m1094n(i3);
            } else {
                if (this.f1597s) {
                    c0272m0.f1904g = this.f1599u;
                }
                if (this.f1598t) {
                    c0272m0.m1094n(this.f1600v);
                }
                rect = this.f1698b;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                c0272m0.f1922y = rect2;
            }
            this.f1588j.add(new d(c0272m0, c0229g, this.f1596r));
            c0272m0.mo922f();
            C0258f0 c0258f2 = c0272m0.f1901d;
            c0258f2.setOnKeyListener(this);
            if (dVar == null || !this.f1602x || c0229g.f1642m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.s, (ViewGroup) c0258f2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0229g.f1642m);
            c0258f2.addHeaderView(frameLayout, null, false);
            c0272m0.mo922f();
            return;
        }
        dVar = null;
        childAt = null;
        if (childAt != null) {
            if (i5 <= 28) {
                method = C0272m0.f1934F;
                if (method != null) {
                    method.invoke(c0272m0.f1898A, Boolean.FALSE);
                }
            } else {
                c0272m0.f1898A.setTouchModal(false);
            }
            if (i5 >= 23) {
                c0272m0.f1898A.setEnterTransition(null);
            }
            List<d> list3 = this.f1588j;
            C0258f0 c0258f3 = list3.get(list3.size() - 1).f1612a.f1901d;
            int[] iArr4 = new int[2];
            c0258f3.getLocationOnScreen(iArr4);
            Rect rect4 = new Rect();
            this.f1595q.getWindowVisibleDisplayFrame(rect4);
            if (this.f1596r == 1) {
            }
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f1596r = i;
            if (i5 >= 26) {
                c0272m0.f1914q = childAt;
                i3 = 0;
                i2 = 0;
            } else {
                iArr = new int[2];
                this.f1594p.getLocationOnScreen(iArr);
                iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                if ((this.f1593o & 7) == 5) {
                    c2 = 0;
                    iArr[0] = this.f1594p.getWidth() + iArr[0];
                    iArr2[0] = childAt.getWidth() + iArr2[0];
                } else {
                    c2 = 0;
                }
                i2 = iArr2[c2] - iArr[c2];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f1593o & 5) == 5) {
                if (z) {
                    i4 = i2 + iM987q;
                } else {
                    iM987q = childAt.getWidth();
                    i4 = i2 - iM987q;
                }
            } else if (z) {
                iM987q = childAt.getWidth();
                i4 = i2 + iM987q;
            } else {
                i4 = i2 - iM987q;
            }
            c0272m0.f1904g = i4;
            c0272m0.f1909l = true;
            c0272m0.f1908k = true;
            c0272m0.m1094n(i3);
        } else {
            if (this.f1597s) {
                c0272m0.f1904g = this.f1599u;
            }
            if (this.f1598t) {
                c0272m0.m1094n(this.f1600v);
            }
            rect = this.f1698b;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c0272m0.f1922y = rect2;
        }
        this.f1588j.add(new d(c0272m0, c0229g, this.f1596r));
        c0272m0.mo922f();
        C0258f0 c0258f4 = c0272m0.f1901d;
        c0258f4.setOnKeyListener(this);
        if (dVar == null) {
        }
    }
}
