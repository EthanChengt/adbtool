package p006b.p067s;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p068t.p069b.C0558u;

/* JADX INFO: renamed from: b.s.k */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C0533k extends C0558u {

    /* JADX INFO: renamed from: f */
    public final RecyclerView f3285f;

    /* JADX INFO: renamed from: g */
    public final C0406a f3286g;

    /* JADX INFO: renamed from: h */
    public final C0406a f3287h;

    /* JADX INFO: renamed from: b.s.k$a */
    public class a extends C0406a {
        public a() {
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            Preference preferenceM1933k;
            C0533k.this.f3286g.mo223d(view, c0429b);
            int childAdapterPosition = C0533k.this.f3285f.getChildAdapterPosition(view);
            RecyclerView.AbstractC0132g adapter = C0533k.this.f3285f.getAdapter();
            if ((adapter instanceof C0529g) && (preferenceM1933k = ((C0529g) adapter).m1933k(childAdapterPosition)) != null) {
                preferenceM1933k.mo389u(c0429b);
            }
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: g */
        public boolean mo224g(View view, int i, Bundle bundle) {
            return C0533k.this.f3286g.mo224g(view, i, bundle);
        }
    }

    public C0533k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f3286g = this.f3447e;
        this.f3287h = new a();
        this.f3285f = recyclerView;
    }

    @Override // p006b.p068t.p069b.C0558u
    /* JADX INFO: renamed from: j */
    public C0406a mo1943j() {
        return this.f3287h;
    }
}
