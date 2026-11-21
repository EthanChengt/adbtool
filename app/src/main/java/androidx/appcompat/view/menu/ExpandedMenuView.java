package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0236n;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0229g.b, InterfaceC0236n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final int[] f149c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b */
    public C0229g f150b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f149c, R.attr.listViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C0208a.m884b(context, resourceId2));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider((!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(1) : C0208a.m884b(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p006b.p008b.p016h.p017i.C0229g.b
    /* JADX INFO: renamed from: a */
    public boolean mo23a(C0231i c0231i) {
        return this.f150b.m959s(c0231i, null, 0);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n
    /* JADX INFO: renamed from: b */
    public void mo24b(C0229g c0229g) {
        this.f150b = c0229g;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo23a((C0231i) getAdapter().getItem(i));
    }
}
