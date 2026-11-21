package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.didjdk.adbhelper.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Objects;
import p006b.p032h.p043i.C0402b;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p143m.C1238n;
import p080c.p126d.p127a.p128a.p143m.C1239o;
import p080c.p126d.p127a.p128a.p143m.C1244t;
import p080c.p126d.p127a.p128a.p143m.InterfaceC1228d;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: b */
    public final Calendar f10273b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10273b = C1161a.m2729n();
        if (C1239o.m2862K0(getContext())) {
            setNextFocusLeftId(R.id.c_);
            setNextFocusRightId(R.id.d5);
        }
        C0418m.m1577t(this, new C1238n(this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1244t getAdapter() {
        return (C1244t) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1244t adapter = getAdapter();
        InterfaceC1228d<?> interfaceC1228d = adapter.f5950c;
        adapter.getItem(adapter.m2875a());
        adapter.getItem(adapter.m2877c());
        Iterator<C0402b<Long, Long>> it = interfaceC1228d.m2852d().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int iM2875a;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            iM2875a = getAdapter().m2877c();
        } else {
            if (i != 130) {
                super.onFocusChanged(true, i, rect);
                return;
            }
            iM2875a = getAdapter().m2875a();
        }
        setSelection(iM2875a);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m2875a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().m2875a());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C1244t)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C1244t.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().m2875a()) {
            i = getAdapter().m2875a();
        }
        super.setSelection(i);
    }
}
