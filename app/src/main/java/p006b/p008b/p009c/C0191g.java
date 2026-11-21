package p006b.p008b.p009c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: b.b.c.g */
/* JADX INFO: loaded from: classes.dex */
public class C0191g implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AlertController f1239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AlertController.C0020b f1240c;

    public C0191g(AlertController.C0020b c0020b, AlertController alertController) {
        this.f1240c = c0020b;
        this.f1239b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1240c.f125n.onClick(this.f1239b.f84b, i);
        if (this.f1240c.f129r) {
            return;
        }
        this.f1239b.f84b.dismiss();
    }
}
