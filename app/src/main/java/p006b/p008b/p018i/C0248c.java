package p006b.p008b.p018i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import p006b.p008b.C0183a;
import p006b.p008b.p016h.p017i.AbstractC0224b;
import p006b.p008b.p016h.p017i.AbstractC0233k;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.C0234l;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p016h.p017i.InterfaceC0236n;
import p006b.p008b.p016h.p017i.InterfaceC0238p;
import p006b.p008b.p016h.p017i.SubMenuC0240r;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.AbstractC0407b;

/* JADX INFO: renamed from: b.b.i.c */
/* JADX INFO: loaded from: classes.dex */
public class C0248c extends AbstractC0224b {

    /* JADX INFO: renamed from: A */
    public int f1784A;

    /* JADX INFO: renamed from: k */
    public d f1785k;

    /* JADX INFO: renamed from: l */
    public Drawable f1786l;

    /* JADX INFO: renamed from: m */
    public boolean f1787m;

    /* JADX INFO: renamed from: n */
    public boolean f1788n;

    /* JADX INFO: renamed from: o */
    public boolean f1789o;

    /* JADX INFO: renamed from: p */
    public int f1790p;

    /* JADX INFO: renamed from: q */
    public int f1791q;

    /* JADX INFO: renamed from: r */
    public int f1792r;

    /* JADX INFO: renamed from: s */
    public boolean f1793s;

    /* JADX INFO: renamed from: t */
    public int f1794t;

    /* JADX INFO: renamed from: u */
    public final SparseBooleanArray f1795u;

    /* JADX INFO: renamed from: v */
    public e f1796v;

    /* JADX INFO: renamed from: w */
    public a f1797w;

    /* JADX INFO: renamed from: x */
    public c f1798x;

    /* JADX INFO: renamed from: y */
    public b f1799y;

    /* JADX INFO: renamed from: z */
    public final f f1800z;

    /* JADX INFO: renamed from: b.b.i.c$a */
    public class a extends C0234l {
        public a(Context context, SubMenuC0240r subMenuC0240r, View view) {
            super(context, subMenuC0240r, view, false, R.attr.a4, 0);
            if (!subMenuC0240r.f1735A.m971g()) {
                View view2 = C0248c.this.f1785k;
                this.f1704f = view2 == null ? (View) C0248c.this.f1574i : view2;
            }
            m992d(C0248c.this.f1800z);
        }

        @Override // p006b.p008b.p016h.p017i.C0234l
        /* JADX INFO: renamed from: c */
        public void mo991c() {
            C0248c c0248c = C0248c.this;
            c0248c.f1797w = null;
            c0248c.f1784A = 0;
            super.mo991c();
        }
    }

    /* JADX INFO: renamed from: b.b.i.c$b */
    public class b extends ActionMenuItemView.AbstractC0025b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: b.b.i.c$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public e f1803b;

        public c(e eVar) {
            this.f1803b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0229g.a aVar;
            C0229g c0229g = C0248c.this.f1569d;
            if (c0229g != null && (aVar = c0229g.f1634e) != null) {
                aVar.mo63b(c0229g);
            }
            View view = (View) C0248c.this.f1574i;
            if (view != null && view.getWindowToken() != null && this.f1803b.m994f()) {
                C0248c.this.f1796v = this.f1803b;
            }
            C0248c.this.f1798x = null;
        }
    }

    /* JADX INFO: renamed from: b.b.i.c$d */
    public class d extends C0273n implements ActionMenuView.InterfaceC0032a {

        /* JADX INFO: renamed from: b.b.i.c$d$a */
        public class a extends AbstractViewOnTouchListenerC0262h0 {
            public a(View view, C0248c c0248c) {
                super(view);
            }

            @Override // p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0
            /* JADX INFO: renamed from: b */
            public InterfaceC0238p mo21b() {
                e eVar = C0248c.this.f1796v;
                if (eVar == null) {
                    return null;
                }
                return eVar.m989a();
            }

            @Override // p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0
            /* JADX INFO: renamed from: c */
            public boolean mo22c() {
                C0248c.this.m1021q();
                return true;
            }

            @Override // p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0
            /* JADX INFO: renamed from: d */
            public boolean mo1022d() {
                C0248c c0248c = C0248c.this;
                if (c0248c.f1798x != null) {
                    return false;
                }
                c0248c.m1018k();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.a3);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0183a.m756c(this, getContentDescription());
            setOnTouchListener(new a(this, C0248c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0032a
        /* JADX INFO: renamed from: a */
        public boolean mo15a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0032a
        /* JADX INFO: renamed from: b */
        public boolean mo16b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0248c.this.m1021q();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0360f.m1425Q(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: b.b.i.c$e */
    public class e extends C0234l {
        public e(Context context, C0229g c0229g, View view, boolean z) {
            super(context, c0229g, view, z, R.attr.a4, 0);
            this.f1705g = 8388613;
            m992d(C0248c.this.f1800z);
        }

        @Override // p006b.p008b.p016h.p017i.C0234l
        /* JADX INFO: renamed from: c */
        public void mo991c() {
            C0229g c0229g = C0248c.this.f1569d;
            if (c0229g != null) {
                c0229g.m943c(true);
            }
            C0248c.this.f1796v = null;
            super.mo991c();
        }
    }

    /* JADX INFO: renamed from: b.b.i.c$f */
    public class f implements InterfaceC0235m.a {
        public f() {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: a */
        public void mo60a(C0229g c0229g, boolean z) {
            if (c0229g instanceof SubMenuC0240r) {
                c0229g.mo951k().m943c(false);
            }
            InterfaceC0235m.a aVar = C0248c.this.f1571f;
            if (aVar != null) {
                aVar.mo60a(c0229g, z);
            }
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: b */
        public boolean mo61b(C0229g c0229g) {
            if (c0229g == null) {
                return false;
            }
            C0248c c0248c = C0248c.this;
            c0248c.f1784A = ((SubMenuC0240r) c0229g).f1735A.f1661a;
            InterfaceC0235m.a aVar = c0248c.f1571f;
            if (aVar != null) {
                return aVar.mo61b(c0229g);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b.b.i.c$g */
    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public int f1809b;

        /* JADX INFO: renamed from: b.b.i.c$g$a */
        public static class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g() {
        }

        public g(Parcel parcel) {
            this.f1809b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1809b);
        }
    }

    public C0248c(Context context) {
        super(context, R.layout.d, R.layout.c);
        this.f1795u = new SparseBooleanArray();
        this.f1800z = new f();
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: a */
    public void mo116a(C0229g c0229g, boolean z) {
        m1016b();
        InterfaceC0235m.a aVar = this.f1571f;
        if (aVar != null) {
            aVar.mo60a(c0229g, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m1016b() {
        return m1018k() | m1019o();
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: d */
    public boolean mo118d() {
        ArrayList<C0231i> arrayListM952l;
        int size;
        int i;
        boolean z;
        C0229g c0229g = this.f1569d;
        if (c0229g != null) {
            arrayListM952l = c0229g.m952l();
            size = arrayListM952l.size();
        } else {
            arrayListM952l = null;
            size = 0;
        }
        int i2 = this.f1792r;
        int i3 = this.f1791q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1574i;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C0231i c0231i = arrayListM952l.get(i4);
            int i7 = c0231i.f1685y;
            if ((i7 & 2) == 2) {
                i6++;
            } else if ((i7 & 1) == 1) {
                i5++;
            } else {
                z2 = true;
            }
            if (this.f1793s && c0231i.f1659C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f1788n && (z2 || i5 + i6 > i2)) {
            i2--;
        }
        int i8 = i2 - i6;
        SparseBooleanArray sparseBooleanArray = this.f1795u;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C0231i c0231i2 = arrayListM952l.get(i9);
            int i11 = c0231i2.f1685y;
            if ((i11 & 2) == i) {
                View viewM1017f = m1017f(c0231i2, null, viewGroup);
                viewM1017f.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM1017f.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i12 = c0231i2.f1662b;
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c0231i2.m976l(z);
            } else {
                if ((i11 & 1) == z) {
                    int i13 = c0231i2.f1662b;
                    boolean z3 = sparseBooleanArray.get(i13);
                    boolean z4 = (i8 > 0 || z3) && i3 > 0;
                    if (z4) {
                        View viewM1017f2 = m1017f(c0231i2, null, viewGroup);
                        viewM1017f2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM1017f2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z4 &= i3 + i10 > 0;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i9; i14++) {
                            C0231i c0231i3 = arrayListM952l.get(i14);
                            if (c0231i3.f1662b == i13) {
                                if (c0231i3.m971g()) {
                                    i8++;
                                }
                                c0231i3.m976l(false);
                            }
                        }
                    }
                    if (z4) {
                        i8--;
                    }
                    c0231i2.m976l(z4);
                } else {
                    c0231i2.m976l(false);
                }
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return true;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: e */
    public Parcelable mo119e() {
        g gVar = new g();
        gVar.f1809b = this.f1784A;
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public View m1017f(C0231i c0231i, View view, ViewGroup viewGroup) {
        View actionView = c0231i.getActionView();
        if (actionView == null || c0231i.m970f()) {
            InterfaceC0236n.a aVar = view instanceof InterfaceC0236n.a ? (InterfaceC0236n.a) view : (InterfaceC0236n.a) this.f1570e.inflate(this.f1573h, viewGroup, false);
            aVar.mo18d(c0231i, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f1574i);
            if (this.f1799y == null) {
                this.f1799y = new b();
            }
            actionMenuItemView.setPopupCallback(this.f1799y);
            actionView = (View) aVar;
        }
        actionView.setVisibility(c0231i.f1659C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: g */
    public void mo120g(Context context, C0229g c0229g) {
        this.f1568c = context;
        LayoutInflater.from(context);
        this.f1569d = c0229g;
        Resources resources = context.getResources();
        if (!this.f1789o) {
            this.f1788n = true;
        }
        int i = 2;
        this.f1790p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f1792r = i;
        int measuredWidth = this.f1790p;
        if (this.f1788n) {
            if (this.f1785k == null) {
                d dVar = new d(this.f1567b);
                this.f1785k = dVar;
                if (this.f1787m) {
                    dVar.setImageDrawable(this.f1786l);
                    this.f1786l = null;
                    this.f1787m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1785k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1785k.getMeasuredWidth();
        } else {
            this.f1785k = null;
        }
        this.f1791q = measuredWidth;
        this.f1794t = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: h */
    public void mo121h(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).f1809b) > 0 && (menuItemFindItem = this.f1569d.findItem(i)) != null) {
            mo124m((SubMenuC0240r) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m1018k() {
        Object obj;
        c cVar = this.f1798x;
        if (cVar != null && (obj = this.f1574i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1798x = null;
            return true;
        }
        e eVar = this.f1796v;
        if (eVar == null) {
            return false;
        }
        if (eVar.m990b()) {
            eVar.f1708j.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: m */
    public boolean mo124m(SubMenuC0240r subMenuC0240r) {
        boolean z = false;
        if (!subMenuC0240r.hasVisibleItems()) {
            return false;
        }
        SubMenuC0240r subMenuC0240r2 = subMenuC0240r;
        while (true) {
            C0229g c0229g = subMenuC0240r2.f1736z;
            if (c0229g == this.f1569d) {
                break;
            }
            subMenuC0240r2 = (SubMenuC0240r) c0229g;
        }
        C0231i c0231i = subMenuC0240r2.f1735A;
        ViewGroup viewGroup = (ViewGroup) this.f1574i;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0236n.a) && ((InterfaceC0236n.a) childAt).getItemData() == c0231i) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.f1784A = subMenuC0240r.f1735A.f1661a;
        int size = subMenuC0240r.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = subMenuC0240r.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        a aVar = new a(this.f1568c, subMenuC0240r, view);
        this.f1797w = aVar;
        aVar.f1706h = z;
        AbstractC0233k abstractC0233k = aVar.f1708j;
        if (abstractC0233k != null) {
            abstractC0233k.mo927s(z);
        }
        if (!this.f1797w.m994f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        InterfaceC0235m.a aVar2 = this.f1571f;
        if (aVar2 != null) {
            aVar2.mo61b(subMenuC0240r);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: n */
    public void mo125n(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f1574i;
        ArrayList<C0231i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C0229g c0229g = this.f1569d;
            if (c0229g != null) {
                c0229g.m949i();
                ArrayList<C0231i> arrayListM952l = this.f1569d.m952l();
                int size = arrayListM952l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0231i c0231i = arrayListM952l.get(i2);
                    if (c0231i.m971g()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0231i itemData = childAt instanceof InterfaceC0236n.a ? ((InterfaceC0236n.a) childAt).getItemData() : null;
                        View viewM1017f = m1017f(c0231i, childAt, viewGroup);
                        if (c0231i != itemData) {
                            viewM1017f.setPressed(false);
                            viewM1017f.jumpDrawablesToCurrentState();
                        }
                        if (viewM1017f != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM1017f.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM1017f);
                            }
                            ((ViewGroup) this.f1574i).addView(viewM1017f, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1785k) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f1574i).requestLayout();
        C0229g c0229g2 = this.f1569d;
        if (c0229g2 != null) {
            c0229g2.m949i();
            ArrayList<C0231i> arrayList2 = c0229g2.f1638i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC0407b abstractC0407b = arrayList2.get(i3).f1657A;
            }
        }
        C0229g c0229g3 = this.f1569d;
        if (c0229g3 != null) {
            c0229g3.m949i();
            arrayList = c0229g3.f1639j;
        }
        if (this.f1788n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f1659C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f1785k;
        if (z3) {
            if (dVar == null) {
                this.f1785k = new d(this.f1567b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1785k.getParent();
            if (viewGroup3 != this.f1574i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1785k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1574i;
                d dVar2 = this.f1785k;
                ActionMenuView.C0034c c0034cGenerateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                c0034cGenerateDefaultLayoutParams.f233c = true;
                actionMenuView.addView(dVar2, c0034cGenerateDefaultLayoutParams);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f1574i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1785k);
            }
        }
        ((ActionMenuView) this.f1574i).setOverflowReserved(this.f1788n);
    }

    /* JADX INFO: renamed from: o */
    public boolean m1019o() {
        a aVar = this.f1797w;
        if (aVar == null) {
            return false;
        }
        if (!aVar.m990b()) {
            return true;
        }
        aVar.f1708j.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m1020p() {
        e eVar = this.f1796v;
        return eVar != null && eVar.m990b();
    }

    /* JADX INFO: renamed from: q */
    public boolean m1021q() {
        C0229g c0229g;
        if (!this.f1788n || m1020p() || (c0229g = this.f1569d) == null || this.f1574i == null || this.f1798x != null) {
            return false;
        }
        c0229g.m949i();
        if (c0229g.f1639j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f1568c, this.f1569d, this.f1785k, true));
        this.f1798x = cVar;
        ((View) this.f1574i).post(cVar);
        InterfaceC0235m.a aVar = this.f1571f;
        if (aVar == null) {
            return true;
        }
        aVar.mo61b(null);
        return true;
    }
}
