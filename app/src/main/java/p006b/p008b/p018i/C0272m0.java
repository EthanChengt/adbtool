package p006b.p008b.p018i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p006b.p008b.p016h.p017i.C0228f;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;

/* JADX INFO: renamed from: b.b.i.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C0272m0 extends C0268k0 implements InterfaceC0270l0 {

    /* JADX INFO: renamed from: F */
    public static Method f1934F;

    /* JADX INFO: renamed from: E */
    public InterfaceC0270l0 f1935E;

    /* JADX INFO: renamed from: b.b.i.m0$a */
    public static class a extends C0258f0 {

        /* JADX INFO: renamed from: o */
        public final int f1936o;

        /* JADX INFO: renamed from: p */
        public final int f1937p;

        /* JADX INFO: renamed from: q */
        public InterfaceC0270l0 f1938q;

        /* JADX INFO: renamed from: r */
        public MenuItem f1939r;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1936o = 21;
                this.f1937p = 22;
            } else {
                this.f1936o = 22;
                this.f1937p = 21;
            }
        }

        @Override // p006b.p008b.p018i.C0258f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f1938q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                }
                C0228f c0228f = (C0228f) adapter;
                C0231i item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i = iPointToPosition - headersCount) >= 0 && i < c0228f.getCount()) {
                    item = c0228f.getItem(i);
                }
                MenuItem menuItem = this.f1939r;
                if (menuItem != item) {
                    C0229g c0229g = c0228f.f1623b;
                    if (menuItem != null) {
                        this.f1938q.mo935h(c0229g, menuItem);
                    }
                    this.f1939r = item;
                    if (item != null) {
                        this.f1938q.mo934e(c0229g, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1936o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f1937p) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ((C0228f) getAdapter()).f1623b.m943c(false);
            return true;
        }

        public void setHoverListener(InterfaceC0270l0 interfaceC0270l0) {
            this.f1938q = interfaceC0270l0;
        }

        @Override // p006b.p008b.p018i.C0258f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1934F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0272m0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // p006b.p008b.p018i.InterfaceC0270l0
    /* JADX INFO: renamed from: e */
    public void mo934e(C0229g c0229g, MenuItem menuItem) {
        InterfaceC0270l0 interfaceC0270l0 = this.f1935E;
        if (interfaceC0270l0 != null) {
            interfaceC0270l0.mo934e(c0229g, menuItem);
        }
    }

    @Override // p006b.p008b.p018i.InterfaceC0270l0
    /* JADX INFO: renamed from: h */
    public void mo935h(C0229g c0229g, MenuItem menuItem) {
        InterfaceC0270l0 interfaceC0270l0 = this.f1935E;
        if (interfaceC0270l0 != null) {
            interfaceC0270l0.mo935h(c0229g, menuItem);
        }
    }

    @Override // p006b.p008b.p018i.C0268k0
    /* JADX INFO: renamed from: q */
    public C0258f0 mo1096q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
