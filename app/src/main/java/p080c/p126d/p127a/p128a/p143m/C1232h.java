package p080c.p126d.p127a.p128a.p143m;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Objects;
import p006b.p032h.p043i.C0402b;
import p080c.p126d.p127a.p128a.C1161a;

/* JADX INFO: renamed from: c.d.a.a.m.h */
/* JADX INFO: loaded from: classes.dex */
public class C1232h extends RecyclerView.AbstractC0139n {

    /* JADX INFO: renamed from: a */
    public final Calendar f5905a = C1161a.m2729n();

    /* JADX INFO: renamed from: b */
    public final Calendar f5906b = C1161a.m2729n();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1231g f5907c;

    public C1232h(C1231g c1231g) {
        this.f5907c = c1231g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0139n
    /* JADX INFO: renamed from: e */
    public void mo558e(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0123a0 c0123a0) {
        if ((recyclerView.getAdapter() instanceof C1225a0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            Iterator<C0402b<Long, Long>> it = this.f5907c.f5888X.m2852d().iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
        }
    }
}
