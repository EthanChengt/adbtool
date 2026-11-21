package p006b.p068t.p069b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.t.b.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0555r extends AbstractC0557t {
    public C0555r(RecyclerView.AbstractC0140o abstractC0140o) {
        super(abstractC0140o, null);
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: b */
    public int mo2044b(View view) {
        return this.f3443a.m573F(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0141p) view.getLayoutParams())).rightMargin;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: c */
    public int mo2045c(View view) {
        RecyclerView.C0141p c0141p = (RecyclerView.C0141p) view.getLayoutParams();
        return this.f3443a.m571E(view) + ((ViewGroup.MarginLayoutParams) c0141p).leftMargin + ((ViewGroup.MarginLayoutParams) c0141p).rightMargin;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: d */
    public int mo2046d(View view) {
        RecyclerView.C0141p c0141p = (RecyclerView.C0141p) view.getLayoutParams();
        return this.f3443a.m569D(view) + ((ViewGroup.MarginLayoutParams) c0141p).topMargin + ((ViewGroup.MarginLayoutParams) c0141p).bottomMargin;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: e */
    public int mo2047e(View view) {
        return this.f3443a.m567C(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0141p) view.getLayoutParams())).leftMargin;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: f */
    public int mo2048f() {
        return this.f3443a.f973p;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: g */
    public int mo2049g() {
        RecyclerView.AbstractC0140o abstractC0140o = this.f3443a;
        return abstractC0140o.f973p - abstractC0140o.m586N();
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: h */
    public int mo2050h() {
        return this.f3443a.m586N();
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: i */
    public int mo2051i() {
        return this.f3443a.f971n;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: j */
    public int mo2052j() {
        return this.f3443a.f972o;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: k */
    public int mo2053k() {
        return this.f3443a.m584M();
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: l */
    public int mo2054l() {
        RecyclerView.AbstractC0140o abstractC0140o = this.f3443a;
        return (abstractC0140o.f973p - abstractC0140o.m584M()) - this.f3443a.m586N();
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: n */
    public int mo2055n(View view) {
        this.f3443a.m594T(view, true, this.f3445c);
        return this.f3445c.right;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: o */
    public int mo2056o(View view) {
        this.f3443a.m594T(view, true, this.f3445c);
        return this.f3445c.left;
    }

    @Override // p006b.p068t.p069b.AbstractC0557t
    /* JADX INFO: renamed from: p */
    public void mo2057p(int i) {
        this.f3443a.mo600Z(i);
    }
}
