package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p006b.p008b.p009c.C0199o;
import p006b.p008b.p018i.InterfaceC0260g0;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0260g0 {

    /* JADX INFO: renamed from: b */
    public InterfaceC0260g0.a f251b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0260g0.a aVar = this.f251b;
        if (aVar != null) {
            rect.top = ((C0199o) aVar).f1338a.m844W(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // p006b.p008b.p018i.InterfaceC0260g0
    public void setOnFitSystemWindowsListener(InterfaceC0260g0.a aVar) {
        this.f251b = aVar;
    }
}
