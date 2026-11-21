package p006b.p008b.p009c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: b.b.c.c */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0187c implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f1230c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AlertController f1231d;

    public RunnableC0187c(AlertController alertController, View view, View view2) {
        this.f1231d = alertController;
        this.f1229b = view;
        this.f1230c = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m11c(this.f1231d.f65A, this.f1229b, this.f1230c);
    }
}
