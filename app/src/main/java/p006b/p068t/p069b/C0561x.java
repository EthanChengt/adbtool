package p006b.p068t.p069b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.t.b.x */
/* JADX INFO: loaded from: classes.dex */
public class C0561x extends C0552o {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ AbstractC0560w f3456q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0561x(AbstractC0560w abstractC0560w, Context context) {
        super(context);
        this.f3456q = abstractC0560w;
    }

    @Override // p006b.p068t.p069b.C0552o, androidx.recyclerview.widget.RecyclerView.AbstractC0151z
    /* JADX INFO: renamed from: c */
    public void mo655c(View view, RecyclerView.C0123a0 c0123a0, RecyclerView.AbstractC0151z.a aVar) {
        AbstractC0560w abstractC0560w = this.f3456q;
        RecyclerView recyclerView = abstractC0560w.f3451a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrMo2037a = abstractC0560w.mo2037a(recyclerView.getLayoutManager(), view);
        int i = iArrMo2037a[0];
        int i2 = iArrMo2037a[1];
        double dM2036g = m2036g(Math.max(Math.abs(i), Math.abs(i2)));
        Double.isNaN(dM2036g);
        Double.isNaN(dM2036g);
        Double.isNaN(dM2036g);
        int iCeil = (int) Math.ceil(dM2036g / 0.3356d);
        if (iCeil > 0) {
            aVar.m658b(i, i2, iCeil, this.f3433j);
        }
    }

    @Override // p006b.p068t.p069b.C0552o
    /* JADX INFO: renamed from: f */
    public float mo2035f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
