package p006b.p008b.p018i;

import android.annotation.SuppressLint;
import android.view.View;
import p006b.p008b.p016h.p017i.InterfaceC0238p;

/* JADX INFO: renamed from: b.b.i.v */
/* JADX INFO: loaded from: classes.dex */
public class C0289v extends AbstractViewOnTouchListenerC0262h0 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0291w.d f2016k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0291w f2017l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289v(C0291w c0291w, View view, C0291w.d dVar) {
        super(view);
        this.f2017l = c0291w;
        this.f2016k = dVar;
    }

    @Override // p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0
    /* JADX INFO: renamed from: b */
    public InterfaceC0238p mo21b() {
        return this.f2016k;
    }

    @Override // p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: c */
    public boolean mo22c() {
        if (this.f2017l.getInternalPopup().mo1139b()) {
            return true;
        }
        this.f2017l.m1137b();
        return true;
    }
}
