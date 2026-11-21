package p006b.p023d.p024c;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: b.d.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C0307b implements InterfaceC0310e {
    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: a */
    public float mo1204a(InterfaceC0309d interfaceC0309d) {
        return m1217o(interfaceC0309d).f2123e;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: b */
    public float mo1205b(InterfaceC0309d interfaceC0309d) {
        return m1217o(interfaceC0309d).f2119a;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: c */
    public float mo1206c(InterfaceC0309d interfaceC0309d) {
        return m1217o(interfaceC0309d).f2119a * 2.0f;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: d */
    public float mo1207d(InterfaceC0309d interfaceC0309d) {
        return m1217o(interfaceC0309d).f2119a * 2.0f;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: e */
    public void mo1208e(InterfaceC0309d interfaceC0309d) {
        mo1216m(interfaceC0309d, m1217o(interfaceC0309d).f2123e);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: f */
    public ColorStateList mo1209f(InterfaceC0309d interfaceC0309d) {
        return m1217o(interfaceC0309d).f2126h;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: g */
    public void mo1210g(InterfaceC0309d interfaceC0309d, float f) {
        CardView.this.setElevation(f);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: h */
    public void mo1211h(InterfaceC0309d interfaceC0309d, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0311f c0311f = new C0311f(colorStateList, f);
        CardView.C0064a c0064a = (CardView.C0064a) interfaceC0309d;
        c0064a.f434a = c0311f;
        CardView.this.setBackgroundDrawable(c0311f);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo1216m(interfaceC0309d, f3);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: i */
    public void mo1212i(InterfaceC0309d interfaceC0309d, float f) {
        C0311f c0311fM1217o = m1217o(interfaceC0309d);
        if (f == c0311fM1217o.f2119a) {
            return;
        }
        c0311fM1217o.f2119a = f;
        c0311fM1217o.m1222c(null);
        c0311fM1217o.invalidateSelf();
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: j */
    public void mo1213j(InterfaceC0309d interfaceC0309d) {
        mo1216m(interfaceC0309d, m1217o(interfaceC0309d).f2123e);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: k */
    public void mo1214k(InterfaceC0309d interfaceC0309d, ColorStateList colorStateList) {
        C0311f c0311fM1217o = m1217o(interfaceC0309d);
        c0311fM1217o.m1221b(colorStateList);
        c0311fM1217o.invalidateSelf();
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: l */
    public float mo1215l(InterfaceC0309d interfaceC0309d) {
        return CardView.this.getElevation();
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: m */
    public void mo1216m(InterfaceC0309d interfaceC0309d, float f) {
        C0311f c0311fM1217o = m1217o(interfaceC0309d);
        CardView.C0064a c0064a = (CardView.C0064a) interfaceC0309d;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean zM131a = c0064a.m131a();
        if (f != c0311fM1217o.f2123e || c0311fM1217o.f2124f != useCompatPadding || c0311fM1217o.f2125g != zM131a) {
            c0311fM1217o.f2123e = f;
            c0311fM1217o.f2124f = useCompatPadding;
            c0311fM1217o.f2125g = zM131a;
            c0311fM1217o.m1222c(null);
            c0311fM1217o.invalidateSelf();
        }
        if (!CardView.this.getUseCompatPadding()) {
            c0064a.m132b(0, 0, 0, 0);
            return;
        }
        float f2 = m1217o(interfaceC0309d).f2123e;
        float f3 = m1217o(interfaceC0309d).f2119a;
        int iCeil = (int) Math.ceil(C0312g.m1223a(f2, f3, c0064a.m131a()));
        int iCeil2 = (int) Math.ceil(C0312g.m1224b(f2, f3, c0064a.m131a()));
        c0064a.m132b(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: n */
    public void mo1202n() {
    }

    /* JADX INFO: renamed from: o */
    public final C0311f m1217o(InterfaceC0309d interfaceC0309d) {
        return (C0311f) ((CardView.C0064a) interfaceC0309d).f434a;
    }
}
