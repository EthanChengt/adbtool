package p006b.p008b.p009c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: b.b.c.h */
/* JADX INFO: loaded from: classes.dex */
public class C0192h implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f1241b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AlertController f1242c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AlertController.C0020b f1243d;

    public C0192h(AlertController.C0020b c0020b, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f1243d = c0020b;
        this.f1241b = recycleListView;
        this.f1242c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f1243d.f127p;
        if (zArr != null) {
            zArr[i] = this.f1241b.isItemChecked(i);
        }
        this.f1243d.f131t.onClick(this.f1242c.f84b, i, this.f1241b.isItemChecked(i));
    }
}
