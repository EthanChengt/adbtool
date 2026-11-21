package p006b.p008b.p009c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: b.b.c.e */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0189e implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1234b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f1235c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AlertController f1236d;

    public RunnableC0189e(AlertController alertController, View view, View view2) {
        this.f1236d = alertController;
        this.f1234b = view;
        this.f1235c = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m11c(this.f1236d.f89g, this.f1234b, this.f1235c);
    }
}
