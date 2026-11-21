package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.InterfaceC0236n;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0236n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n
    /* JADX INFO: renamed from: b */
    public void mo24b(C0229g c0229g) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
