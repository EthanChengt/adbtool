package p080c.p126d.p127a.p128a.p143m;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: c.d.a.a.m.j */
/* JADX INFO: loaded from: classes.dex */
public class C1234j extends RecyclerView.AbstractC0145t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1246v f5909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f5910b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1231g f5911c;

    public C1234j(C1231g c1231g, C1246v c1246v, MaterialButton materialButton) {
        this.f5911c = c1231g;
        this.f5909a = c1246v;
        this.f5910b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0145t
    /* JADX INFO: renamed from: a */
    public void mo634a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f5910b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0145t
    /* JADX INFO: renamed from: b */
    public void mo635b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManagerM2857G0 = this.f5911c.m2857G0();
        int iM471i1 = i < 0 ? linearLayoutManagerM2857G0.m471i1() : linearLayoutManagerM2857G0.m475k1();
        this.f5911c.f5890Z = this.f5909a.m2878i(iM471i1);
        this.f5910b.setText(this.f5909a.f5955c.f5853b.m2873n(iM471i1).f5942c);
    }
}
