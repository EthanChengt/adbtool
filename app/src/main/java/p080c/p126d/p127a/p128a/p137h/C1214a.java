package p080c.p126d.p127a.p128a.p137h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.didjdk.adbhelper.R;
import com.google.android.material.button.MaterialButton;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;
import p080c.p126d.p127a.p128a.p154x.InterfaceC1303n;

/* JADX INFO: renamed from: c.d.a.a.h.a */
/* JADX INFO: loaded from: classes.dex */
public class C1214a {

    /* JADX INFO: renamed from: s */
    public static final boolean f5754s;

    /* JADX INFO: renamed from: a */
    public final MaterialButton f5755a;

    /* JADX INFO: renamed from: b */
    public C1299j f5756b;

    /* JADX INFO: renamed from: c */
    public int f5757c;

    /* JADX INFO: renamed from: d */
    public int f5758d;

    /* JADX INFO: renamed from: e */
    public int f5759e;

    /* JADX INFO: renamed from: f */
    public int f5760f;

    /* JADX INFO: renamed from: g */
    public int f5761g;

    /* JADX INFO: renamed from: h */
    public int f5762h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f5763i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f5764j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f5765k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f5766l;

    /* JADX INFO: renamed from: m */
    public Drawable f5767m;

    /* JADX INFO: renamed from: n */
    public boolean f5768n = false;

    /* JADX INFO: renamed from: o */
    public boolean f5769o = false;

    /* JADX INFO: renamed from: p */
    public boolean f5770p = false;

    /* JADX INFO: renamed from: q */
    public boolean f5771q;

    /* JADX INFO: renamed from: r */
    public LayerDrawable f5772r;

    static {
        f5754s = Build.VERSION.SDK_INT >= 21;
    }

    public C1214a(MaterialButton materialButton, C1299j c1299j) {
        this.f5755a = materialButton;
        this.f5756b = c1299j;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC1303n m2791a() {
        LayerDrawable layerDrawable = this.f5772r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC1303n) (this.f5772r.getNumberOfLayers() > 2 ? this.f5772r.getDrawable(2) : this.f5772r.getDrawable(1));
    }

    /* JADX INFO: renamed from: b */
    public C1296g m2792b() {
        return m2793c(false);
    }

    /* JADX INFO: renamed from: c */
    public final C1296g m2793c(boolean z) {
        LayerDrawable layerDrawable = this.f5772r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1296g) (f5754s ? (LayerDrawable) ((InsetDrawable) this.f5772r.getDrawable(0)).getDrawable() : this.f5772r).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: d */
    public final C1296g m2794d() {
        return m2793c(true);
    }

    /* JADX INFO: renamed from: e */
    public void m2795e(C1299j c1299j) {
        this.f5756b = c1299j;
        if (m2792b() != null) {
            C1296g c1296gM2792b = m2792b();
            c1296gM2792b.f6211b.f6233a = c1299j;
            c1296gM2792b.invalidateSelf();
        }
        if (m2794d() != null) {
            C1296g c1296gM2794d = m2794d();
            c1296gM2794d.f6211b.f6233a = c1299j;
            c1296gM2794d.invalidateSelf();
        }
        if (m2791a() != null) {
            m2791a().setShapeAppearanceModel(c1299j);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2796f() {
        C1296g c1296gM2792b = m2792b();
        C1296g c1296gM2794d = m2794d();
        if (c1296gM2792b != null) {
            c1296gM2792b.m2980u(this.f5762h, this.f5765k);
            if (c1296gM2794d != null) {
                c1296gM2794d.m2979t(this.f5762h, this.f5768n ? C1161a.m2722g(this.f5755a, R.attr.e8) : 0);
            }
        }
    }
}
