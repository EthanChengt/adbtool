package p006b.p023d.p024c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;
import java.util.Objects;

/* JADX INFO: renamed from: b.d.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C0308c implements InterfaceC0310e {

    /* JADX INFO: renamed from: a */
    public final RectF f2118a = new RectF();

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: a */
    public float mo1204a(InterfaceC0309d interfaceC0309d) {
        return m1218o(interfaceC0309d).f2139h;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: b */
    public float mo1205b(InterfaceC0309d interfaceC0309d) {
        return m1218o(interfaceC0309d).f2137f;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: c */
    public float mo1206c(InterfaceC0309d interfaceC0309d) {
        C0312g c0312gM1218o = m1218o(interfaceC0309d);
        float f = c0312gM1218o.f2139h;
        return (((c0312gM1218o.f2139h * 1.5f) + c0312gM1218o.f2132a) * 2.0f) + (Math.max(f, ((f * 1.5f) / 2.0f) + c0312gM1218o.f2137f + c0312gM1218o.f2132a) * 2.0f);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: d */
    public float mo1207d(InterfaceC0309d interfaceC0309d) {
        C0312g c0312gM1218o = m1218o(interfaceC0309d);
        float f = c0312gM1218o.f2139h;
        return ((c0312gM1218o.f2139h + c0312gM1218o.f2132a) * 2.0f) + (Math.max(f, (f / 2.0f) + c0312gM1218o.f2137f + c0312gM1218o.f2132a) * 2.0f);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: e */
    public void mo1208e(InterfaceC0309d interfaceC0309d) {
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: f */
    public ColorStateList mo1209f(InterfaceC0309d interfaceC0309d) {
        return m1218o(interfaceC0309d).f2142k;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: g */
    public void mo1210g(InterfaceC0309d interfaceC0309d, float f) {
        C0312g c0312gM1218o = m1218o(interfaceC0309d);
        c0312gM1218o.m1226d(f, c0312gM1218o.f2139h);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: h */
    public void mo1211h(InterfaceC0309d interfaceC0309d, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0312g c0312g = new C0312g(context.getResources(), colorStateList, f, f2, f3);
        CardView.C0064a c0064a = (CardView.C0064a) interfaceC0309d;
        c0312g.f2146o = c0064a.m131a();
        c0312g.invalidateSelf();
        c0064a.f434a = c0312g;
        CardView.this.setBackgroundDrawable(c0312g);
        m1219p(c0064a);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: i */
    public void mo1212i(InterfaceC0309d interfaceC0309d, float f) {
        C0312g c0312gM1218o = m1218o(interfaceC0309d);
        Objects.requireNonNull(c0312gM1218o);
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (c0312gM1218o.f2137f != f2) {
            c0312gM1218o.f2137f = f2;
            c0312gM1218o.f2143l = true;
            c0312gM1218o.invalidateSelf();
        }
        m1219p(interfaceC0309d);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: j */
    public void mo1213j(InterfaceC0309d interfaceC0309d) {
        C0312g c0312gM1218o = m1218o(interfaceC0309d);
        CardView.C0064a c0064a = (CardView.C0064a) interfaceC0309d;
        c0312gM1218o.f2146o = c0064a.m131a();
        c0312gM1218o.invalidateSelf();
        m1219p(c0064a);
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: k */
    public void mo1214k(InterfaceC0309d interfaceC0309d, ColorStateList colorStateList) {
        C0312g c0312gM1218o = m1218o(interfaceC0309d);
        c0312gM1218o.m1225c(colorStateList);
        c0312gM1218o.invalidateSelf();
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: l */
    public float mo1215l(InterfaceC0309d interfaceC0309d) {
        return m1218o(interfaceC0309d).f2141j;
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: m */
    public void mo1216m(InterfaceC0309d interfaceC0309d, float f) {
        C0312g c0312gM1218o = m1218o(interfaceC0309d);
        c0312gM1218o.m1226d(c0312gM1218o.f2141j, f);
        m1219p(interfaceC0309d);
    }

    /* JADX INFO: renamed from: o */
    public final C0312g m1218o(InterfaceC0309d interfaceC0309d) {
        return (C0312g) ((CardView.C0064a) interfaceC0309d).f434a;
    }

    /* JADX INFO: renamed from: p */
    public void m1219p(InterfaceC0309d interfaceC0309d) {
        Rect rect = new Rect();
        m1218o(interfaceC0309d).getPadding(rect);
        int iCeil = (int) Math.ceil(mo1207d(interfaceC0309d));
        int iCeil2 = (int) Math.ceil(mo1206c(interfaceC0309d));
        CardView.C0064a c0064a = (CardView.C0064a) interfaceC0309d;
        CardView cardView = CardView.this;
        if (iCeil > cardView.f429d) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(iCeil);
        }
        CardView cardView2 = CardView.this;
        if (iCeil2 > cardView2.f430e) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(iCeil2);
        }
        ((CardView.C0064a) interfaceC0309d).m132b(rect.left, rect.top, rect.right, rect.bottom);
    }
}
