package p006b.p008b.p016h.p017i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: b.b.h.i.f */
/* JADX INFO: loaded from: classes.dex */
public class C0228f extends BaseAdapter {

    /* JADX INFO: renamed from: b */
    public C0229g f1623b;

    /* JADX INFO: renamed from: c */
    public int f1624c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f1625d;

    /* JADX INFO: renamed from: e */
    public final boolean f1626e;

    /* JADX INFO: renamed from: f */
    public final LayoutInflater f1627f;

    /* JADX INFO: renamed from: g */
    public final int f1628g;

    public C0228f(C0229g c0229g, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1626e = z;
        this.f1627f = layoutInflater;
        this.f1623b = c0229g;
        this.f1628g = i;
        m939a();
    }

    /* JADX INFO: renamed from: a */
    public void m939a() {
        C0229g c0229g = this.f1623b;
        C0231i c0231i = c0229g.f1651v;
        if (c0231i != null) {
            c0229g.m949i();
            ArrayList<C0231i> arrayList = c0229g.f1639j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == c0231i) {
                    this.f1624c = i;
                    return;
                }
            }
        }
        this.f1624c = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0231i getItem(int i) {
        ArrayList<C0231i> arrayListM952l;
        if (this.f1626e) {
            C0229g c0229g = this.f1623b;
            c0229g.m949i();
            arrayListM952l = c0229g.f1639j;
        } else {
            arrayListM952l = this.f1623b.m952l();
        }
        int i2 = this.f1624c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListM952l.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0231i> arrayListM952l;
        if (this.f1626e) {
            C0229g c0229g = this.f1623b;
            c0229g.m949i();
            arrayListM952l = c0229g.f1639j;
        } else {
            arrayListM952l = this.f1623b.m952l();
        }
        int i = this.f1624c;
        int size = arrayListM952l.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1627f.inflate(this.f1628g, viewGroup, false);
        }
        int i2 = getItem(i).f1662b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1623b.mo953m() && i2 != (i3 >= 0 ? getItem(i3).f1662b : i2));
        InterfaceC0236n.a aVar = (InterfaceC0236n.a) view;
        if (this.f1625d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo18d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m939a();
        super.notifyDataSetChanged();
    }
}
