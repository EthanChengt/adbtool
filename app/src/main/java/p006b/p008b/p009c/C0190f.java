package p006b.p008b.p009c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: b.b.c.f */
/* JADX INFO: loaded from: classes.dex */
public class C0190f extends ArrayAdapter<CharSequence> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f1237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AlertController.C0020b f1238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190f(AlertController.C0020b c0020b, Context context, int i, int i2, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, i2, charSequenceArr);
        this.f1238c = c0020b;
        this.f1237b = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f1238c.f127p;
        if (zArr != null && zArr[i]) {
            this.f1237b.setItemChecked(i, true);
        }
        return view2;
    }
}
