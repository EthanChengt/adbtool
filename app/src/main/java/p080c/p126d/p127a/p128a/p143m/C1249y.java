package p080c.p126d.p127a.p128a.p143m;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p068t.p069b.C0552o;

/* JADX INFO: renamed from: c.d.a.a.m.y */
/* JADX INFO: loaded from: classes.dex */
public class C1249y extends LinearLayoutManager {

    /* JADX INFO: renamed from: c.d.a.a.m.y$a */
    public class a extends C0552o {
        public a(C1249y c1249y, Context context) {
            super(context);
        }

        @Override // p006b.p068t.p069b.C0552o
        /* JADX INFO: renamed from: f */
        public float mo2035f(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public C1249y(Context context, int i, boolean z) {
        super(i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: U0 */
    public void mo453U0(RecyclerView recyclerView, RecyclerView.C0123a0 c0123a0, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.f1001a = i;
        m597V0(aVar);
    }
}
