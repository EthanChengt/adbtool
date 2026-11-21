package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: b.b.h.i.e */
/* JADX INFO: loaded from: classes.dex */
public class C0227e implements InterfaceC0235m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public Context f1615b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f1616c;

    /* JADX INFO: renamed from: d */
    public C0229g f1617d;

    /* JADX INFO: renamed from: e */
    public ExpandedMenuView f1618e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0235m.a f1619f;

    /* JADX INFO: renamed from: g */
    public a f1620g;

    /* JADX INFO: renamed from: b.b.h.i.e$a */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: b */
        public int f1621b = -1;

        public a() {
            m937a();
        }

        /* JADX INFO: renamed from: a */
        public void m937a() {
            C0229g c0229g = C0227e.this.f1617d;
            C0231i c0231i = c0229g.f1651v;
            if (c0231i != null) {
                c0229g.m949i();
                ArrayList<C0231i> arrayList = c0229g.f1639j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == c0231i) {
                        this.f1621b = i;
                        return;
                    }
                }
            }
            this.f1621b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0231i getItem(int i) {
            C0229g c0229g = C0227e.this.f1617d;
            c0229g.m949i();
            ArrayList<C0231i> arrayList = c0229g.f1639j;
            Objects.requireNonNull(C0227e.this);
            int i2 = i + 0;
            int i3 = this.f1621b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            C0229g c0229g = C0227e.this.f1617d;
            c0229g.m949i();
            int size = c0229g.f1639j.size();
            Objects.requireNonNull(C0227e.this);
            int i = size + 0;
            return this.f1621b < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0227e.this.f1616c.inflate(R.layout.q, viewGroup, false);
            }
            ((InterfaceC0236n.a) view).mo18d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m937a();
            super.notifyDataSetChanged();
        }
    }

    public C0227e(Context context, int i) {
        this.f1615b = context;
        this.f1616c = LayoutInflater.from(context);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: a */
    public void mo116a(C0229g c0229g, boolean z) {
        InterfaceC0235m.a aVar = this.f1619f;
        if (aVar != null) {
            aVar.mo60a(c0229g, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public ListAdapter m936b() {
        if (this.f1620g == null) {
            this.f1620g = new a();
        }
        return this.f1620g;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: c */
    public int mo117c() {
        return 0;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: d */
    public boolean mo118d() {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: e */
    public Parcelable mo119e() {
        if (this.f1618e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1618e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: g */
    public void mo120g(Context context, C0229g c0229g) {
        if (this.f1615b != null) {
            this.f1615b = context;
            if (this.f1616c == null) {
                this.f1616c = LayoutInflater.from(context);
            }
        }
        this.f1617d = c0229g;
        a aVar = this.f1620g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: h */
    public void mo121h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1618e.restoreHierarchyState(sparseParcelableArray);
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

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: l */
    public void mo918l(InterfaceC0235m.a aVar) {
        this.f1619f = aVar;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: m */
    public boolean mo124m(SubMenuC0240r subMenuC0240r) {
        if (!subMenuC0240r.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0230h dialogInterfaceOnKeyListenerC0230h = new DialogInterfaceOnKeyListenerC0230h(subMenuC0240r);
        DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(subMenuC0240r.f1630a);
        C0227e c0227e = new C0227e(aVar.f1245a.f112a, R.layout.q);
        dialogInterfaceOnKeyListenerC0230h.f1656d = c0227e;
        c0227e.f1619f = dialogInterfaceOnKeyListenerC0230h;
        C0229g c0229g = dialogInterfaceOnKeyListenerC0230h.f1654b;
        c0229g.m942b(c0227e, c0229g.f1630a);
        ListAdapter listAdapterM936b = dialogInterfaceOnKeyListenerC0230h.f1656d.m936b();
        AlertController.C0020b c0020b = aVar.f1245a;
        c0020b.f124m = listAdapterM936b;
        c0020b.f125n = dialogInterfaceOnKeyListenerC0230h;
        View view = subMenuC0240r.f1644o;
        if (view != null) {
            c0020b.f116e = view;
        } else {
            c0020b.f114c = subMenuC0240r.f1643n;
            c0020b.f115d = subMenuC0240r.f1642m;
        }
        c0020b.f122k = dialogInterfaceOnKeyListenerC0230h;
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = aVar.m779a();
        dialogInterfaceOnKeyListenerC0230h.f1655c = dialogInterfaceC0193iM779a;
        dialogInterfaceC0193iM779a.setOnDismissListener(dialogInterfaceOnKeyListenerC0230h);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0230h.f1655c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0230h.f1655c.show();
        InterfaceC0235m.a aVar2 = this.f1619f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo61b(subMenuC0240r);
        return true;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: n */
    public void mo125n(boolean z) {
        a aVar = this.f1620g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1617d.m959s(this.f1620g.getItem(i), this, 0);
    }
}
