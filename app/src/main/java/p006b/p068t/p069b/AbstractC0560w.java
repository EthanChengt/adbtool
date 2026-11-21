package p006b.p068t.p069b;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.t.b.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0560w extends RecyclerView.AbstractC0143r {

    /* JADX INFO: renamed from: a */
    public RecyclerView f3451a;

    /* JADX INFO: renamed from: b */
    public Scroller f3452b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView.AbstractC0145t f3453c = new a();

    /* JADX INFO: renamed from: b.t.b.w$a */
    public class a extends RecyclerView.AbstractC0145t {

        /* JADX INFO: renamed from: a */
        public boolean f3454a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0145t
        /* JADX INFO: renamed from: a */
        public void mo634a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f3454a) {
                this.f3454a = false;
                AbstractC0560w.this.m2061c();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0145t
        /* JADX INFO: renamed from: b */
        public void mo635b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f3454a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int[] mo2037a(RecyclerView.AbstractC0140o abstractC0140o, View view);

    /* JADX INFO: renamed from: b */
    public abstract View mo2038b(RecyclerView.AbstractC0140o abstractC0140o);

    /* JADX INFO: renamed from: c */
    public void m2061c() {
        RecyclerView.AbstractC0140o layoutManager;
        View viewMo2038b;
        RecyclerView recyclerView = this.f3451a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo2038b = mo2038b(layoutManager)) == null) {
            return;
        }
        int[] iArrMo2037a = mo2037a(layoutManager, viewMo2038b);
        if (iArrMo2037a[0] == 0 && iArrMo2037a[1] == 0) {
            return;
        }
        this.f3451a.smoothScrollBy(iArrMo2037a[0], iArrMo2037a[1]);
    }
}
