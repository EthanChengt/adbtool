package p006b.p008b.p018i;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: b.b.i.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C0266j0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0268k0 f1891b;

    public C0266j0(C0268k0 c0268k0) {
        this.f1891b = c0268k0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0258f0 c0258f0;
        if (i == -1 || (c0258f0 = this.f1891b.f1901d) == null) {
            return;
        }
        c0258f0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
