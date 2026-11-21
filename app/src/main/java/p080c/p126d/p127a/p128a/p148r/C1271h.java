package p080c.p126d.p127a.p128a.p148r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p016h.p017i.SubMenuC0240r;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p068t.p069b.C0558u;

/* JADX INFO: renamed from: c.d.a.a.r.h */
/* JADX INFO: loaded from: classes.dex */
public class C1271h implements InterfaceC0235m {

    /* JADX INFO: renamed from: b */
    public NavigationMenuView f6100b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f6101c;

    /* JADX INFO: renamed from: d */
    public C0229g f6102d;

    /* JADX INFO: renamed from: e */
    public int f6103e;

    /* JADX INFO: renamed from: f */
    public c f6104f;

    /* JADX INFO: renamed from: g */
    public LayoutInflater f6105g;

    /* JADX INFO: renamed from: h */
    public int f6106h;

    /* JADX INFO: renamed from: i */
    public boolean f6107i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f6108j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f6109k;

    /* JADX INFO: renamed from: l */
    public Drawable f6110l;

    /* JADX INFO: renamed from: m */
    public int f6111m;

    /* JADX INFO: renamed from: n */
    public int f6112n;

    /* JADX INFO: renamed from: o */
    public int f6113o;

    /* JADX INFO: renamed from: p */
    public boolean f6114p;

    /* JADX INFO: renamed from: r */
    public int f6116r;

    /* JADX INFO: renamed from: s */
    public int f6117s;

    /* JADX INFO: renamed from: t */
    public int f6118t;

    /* JADX INFO: renamed from: q */
    public boolean f6115q = true;

    /* JADX INFO: renamed from: u */
    public int f6119u = -1;

    /* JADX INFO: renamed from: v */
    public final View.OnClickListener f6120v = new a();

    /* JADX INFO: renamed from: c.d.a.a.r.h$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            C1271h.this.m2933k(true);
            C0231i itemData = ((NavigationMenuItemView) view).getItemData();
            C1271h c1271h = C1271h.this;
            boolean zM959s = c1271h.f6102d.m959s(itemData, c1271h, 0);
            if (itemData != null && itemData.isCheckable() && zM959s) {
                C1271h.this.f6104f.m2936j(itemData);
            } else {
                z = false;
            }
            C1271h.this.m2933k(false);
            if (z) {
                C1271h.this.mo125n(false);
            }
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$b */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$c */
    public class c extends RecyclerView.AbstractC0132g<l> {

        /* JADX INFO: renamed from: c */
        public final ArrayList<e> f6122c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public C0231i f6123d;

        /* JADX INFO: renamed from: e */
        public boolean f6124e;

        public c() {
            m2935i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: a */
        public int mo533a() {
            return this.f6122c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: b */
        public long mo534b(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: c */
        public int mo535c(int i) {
            e eVar = this.f6122c.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).f6128a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: e */
        public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
            l lVar = (l) abstractC0129d0;
            int iMo535c = mo535c(i);
            if (iMo535c != 0) {
                if (iMo535c == 1) {
                    ((TextView) lVar.f927a).setText(((g) this.f6122c.get(i)).f6128a.f1665e);
                    return;
                } else {
                    if (iMo535c != 2) {
                        return;
                    }
                    f fVar = (f) this.f6122c.get(i);
                    lVar.f927a.setPadding(0, fVar.f6126a, 0, fVar.f6127b);
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f927a;
            navigationMenuItemView.setIconTintList(C1271h.this.f6109k);
            C1271h c1271h = C1271h.this;
            if (c1271h.f6107i) {
                navigationMenuItemView.setTextAppearance(c1271h.f6106h);
            }
            ColorStateList colorStateList = C1271h.this.f6108j;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = C1271h.this.f6110l;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            navigationMenuItemView.setBackground(drawableNewDrawable);
            g gVar = (g) this.f6122c.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f6129b);
            navigationMenuItemView.setHorizontalPadding(C1271h.this.f6111m);
            navigationMenuItemView.setIconPadding(C1271h.this.f6112n);
            C1271h c1271h2 = C1271h.this;
            if (c1271h2.f6114p) {
                navigationMenuItemView.setIconSize(c1271h2.f6113o);
            }
            navigationMenuItemView.setMaxLines(C1271h.this.f6116r);
            navigationMenuItemView.mo18d(gVar.f6128a, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: f */
        public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
            RecyclerView.AbstractC0129d0 iVar;
            if (i == 0) {
                C1271h c1271h = C1271h.this;
                iVar = new i(c1271h.f6105g, viewGroup, c1271h.f6120v);
            } else if (i == 1) {
                iVar = new k(C1271h.this.f6105g, viewGroup);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new b(C1271h.this.f6101c);
                }
                iVar = new j(C1271h.this.f6105g, viewGroup);
            }
            return iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: g */
        public void mo539g(RecyclerView.AbstractC0129d0 abstractC0129d0) {
            l lVar = (l) abstractC0129d0;
            if (lVar instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f927a;
                FrameLayout frameLayout = navigationMenuItemView.f10306A;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f10315z.setCompoundDrawables(null, null, null, null);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m2935i() {
            if (this.f6124e) {
                return;
            }
            this.f6124e = true;
            this.f6122c.clear();
            this.f6122c.add(new d());
            int i = -1;
            int size = C1271h.this.f6102d.m952l().size();
            boolean z = false;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                C0231i c0231i = C1271h.this.f6102d.m952l().get(i2);
                if (c0231i.isChecked()) {
                    m2936j(c0231i);
                }
                if (c0231i.isCheckable()) {
                    c0231i.m975k(z);
                }
                if (c0231i.hasSubMenu()) {
                    SubMenuC0240r subMenuC0240r = c0231i.f1675o;
                    if (subMenuC0240r.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f6122c.add(new f(C1271h.this.f6118t, z ? 1 : 0));
                        }
                        this.f6122c.add(new g(c0231i));
                        int size3 = subMenuC0240r.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size3) {
                            C0231i c0231i2 = (C0231i) subMenuC0240r.getItem(i3);
                            if (c0231i2.isVisible()) {
                                if (!z3 && c0231i2.getIcon() != null) {
                                    z3 = true;
                                }
                                if (c0231i2.isCheckable()) {
                                    c0231i2.m975k(z);
                                }
                                if (c0231i.isChecked()) {
                                    m2936j(c0231i);
                                }
                                this.f6122c.add(new g(c0231i2));
                            }
                            i3++;
                            z = false;
                        }
                        if (z3) {
                            int size4 = this.f6122c.size();
                            for (int size5 = this.f6122c.size(); size5 < size4; size5++) {
                                ((g) this.f6122c.get(size5)).f6129b = true;
                            }
                        }
                    }
                } else {
                    int i4 = c0231i.f1662b;
                    if (i4 != i) {
                        size2 = this.f6122c.size();
                        z2 = c0231i.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList<e> arrayList = this.f6122c;
                            int i5 = C1271h.this.f6118t;
                            arrayList.add(new f(i5, i5));
                        }
                    } else if (!z2 && c0231i.getIcon() != null) {
                        int size6 = this.f6122c.size();
                        for (int i6 = size2; i6 < size6; i6++) {
                            ((g) this.f6122c.get(i6)).f6129b = true;
                        }
                        z2 = true;
                    }
                    g gVar = new g(c0231i);
                    gVar.f6129b = z2;
                    this.f6122c.add(gVar);
                    i = i4;
                }
                i2++;
                z = false;
            }
            this.f6124e = false;
        }

        /* JADX INFO: renamed from: j */
        public void m2936j(C0231i c0231i) {
            if (this.f6123d == c0231i || !c0231i.isCheckable()) {
                return;
            }
            C0231i c0231i2 = this.f6123d;
            if (c0231i2 != null) {
                c0231i2.setChecked(false);
            }
            this.f6123d = c0231i;
            c0231i.setChecked(true);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$d */
    public static class d implements e {
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$e */
    public interface e {
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$f */
    public static class f implements e {

        /* JADX INFO: renamed from: a */
        public final int f6126a;

        /* JADX INFO: renamed from: b */
        public final int f6127b;

        public f(int i, int i2) {
            this.f6126a = i;
            this.f6127b = i2;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$g */
    public static class g implements e {

        /* JADX INFO: renamed from: a */
        public final C0231i f6128a;

        /* JADX INFO: renamed from: b */
        public boolean f6129b;

        public g(C0231i c0231i) {
            this.f6128a = c0231i;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$h */
    public class h extends C0558u {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p006b.p068t.p069b.C0558u, p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            super.mo223d(view, c0429b);
            c cVar = C1271h.this.f6104f;
            int i = C1271h.this.f6101c.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C1271h.this.f6104f.mo533a(); i2++) {
                if (C1271h.this.f6104f.mo535c(i2) == 0) {
                    i++;
                }
            }
            c0429b.m1617l(new C0429b.b(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false)));
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$i */
    public static class i extends l {
        /* JADX WARN: Illegal instructions before constructor call */
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            View viewInflate = layoutInflater.inflate(R.layout.aj, viewGroup, false);
            super(viewInflate);
            viewInflate.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$j */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.al, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$k */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.am, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.h$l */
    public static abstract class l extends RecyclerView.AbstractC0129d0 {
        public l(View view) {
            super(view);
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: a */
    public void mo116a(C0229g c0229g, boolean z) {
    }

    /* JADX INFO: renamed from: b */
    public void m2931b(int i2) {
        this.f6111m = i2;
        mo125n(false);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: c */
    public int mo117c() {
        return this.f6103e;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: d */
    public boolean mo118d() {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: e */
    public Parcelable mo119e() {
        Bundle bundle = new Bundle();
        if (this.f6100b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f6100b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f6104f;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            Bundle bundle2 = new Bundle();
            C0231i c0231i = cVar.f6123d;
            if (c0231i != null) {
                bundle2.putInt("android:menu:checked", c0231i.f1661a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = cVar.f6122c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = cVar.f6122c.get(i2);
                if (eVar instanceof g) {
                    C0231i c0231i2 = ((g) eVar).f6128a;
                    View actionView = c0231i2 != null ? c0231i2.getActionView() : null;
                    if (actionView != null) {
                        C1273j c1273j = new C1273j();
                        actionView.saveHierarchyState(c1273j);
                        sparseArray2.put(c0231i2.f1661a, c1273j);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f6101c != null) {
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();
            this.f6101c.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public void m2932f(int i2) {
        this.f6112n = i2;
        mo125n(false);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: g */
    public void mo120g(Context context, C0229g c0229g) {
        this.f6105g = LayoutInflater.from(context);
        this.f6102d = c0229g;
        this.f6118t = context.getResources().getDimensionPixelOffset(R.dimen.cl);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: h */
    public void mo121h(Parcelable parcelable) {
        C0231i c0231i;
        View actionView;
        C1273j c1273j;
        C0231i c0231i2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f6100b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f6104f;
                Objects.requireNonNull(cVar);
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    cVar.f6124e = true;
                    int size = cVar.f6122c.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        e eVar = cVar.f6122c.get(i3);
                        if ((eVar instanceof g) && (c0231i2 = ((g) eVar).f6128a) != null && c0231i2.f1661a == i2) {
                            cVar.m2936j(c0231i2);
                            break;
                        }
                    }
                    cVar.f6124e = false;
                    cVar.m2935i();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.f6122c.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        e eVar2 = cVar.f6122c.get(i4);
                        if ((eVar2 instanceof g) && (c0231i = ((g) eVar2).f6128a) != null && (actionView = c0231i.getActionView()) != null && (c1273j = (C1273j) sparseParcelableArray2.get(c0231i.f1661a)) != null) {
                            actionView.restoreHierarchyState(c1273j);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f6101c.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: i */
    public boolean mo122i(C0229g c0229g, C0231i c0231i) {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: j */
    public boolean mo123j(C0229g c0229g, C0231i c0231i) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m2933k(boolean z) {
        c cVar = this.f6104f;
        if (cVar != null) {
            cVar.f6124e = z;
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: m */
    public boolean mo124m(SubMenuC0240r subMenuC0240r) {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: n */
    public void mo125n(boolean z) {
        c cVar = this.f6104f;
        if (cVar != null) {
            cVar.m2935i();
            cVar.f947a.m542b();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2934o() {
        int i2 = (this.f6101c.getChildCount() == 0 && this.f6115q) ? this.f6117s : 0;
        NavigationMenuView navigationMenuView = this.f6100b;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }
}
