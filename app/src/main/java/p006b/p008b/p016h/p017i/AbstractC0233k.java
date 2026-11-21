package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: b.b.h.i.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233k implements InterfaceC0238p, InterfaceC0235m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public Rect f1698b;

    /* JADX INFO: renamed from: q */
    public static int m987q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C0228f c0228f = (C0228f) listAdapter;
        int count = c0228f.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c0228f.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0228f.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m988y(C0229g c0229g) {
        int size = c0229g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0229g.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: c */
    public int mo117c() {
        return 0;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: g */
    public void mo120g(Context context, C0229g c0229g) {
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

    /* JADX INFO: renamed from: o */
    public abstract void mo924o(C0229g c0229g);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0228f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0228f) listAdapter).f1623b.m959s((MenuItem) listAdapter.getItem(i), this, mo925p() ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public boolean mo925p() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo926r(View view);

    /* JADX INFO: renamed from: s */
    public abstract void mo927s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo928t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo929u(int i);

    /* JADX INFO: renamed from: v */
    public abstract void mo930v(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: w */
    public abstract void mo931w(boolean z);

    /* JADX INFO: renamed from: x */
    public abstract void mo932x(int i);
}
