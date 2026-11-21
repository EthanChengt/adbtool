package p006b.p008b.p009c;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: b.b.c.d */
/* JADX INFO: loaded from: classes.dex */
public class C0188d implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f1232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1233b;

    public C0188d(AlertController alertController, View view, View view2) {
        this.f1232a = view;
        this.f1233b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m11c(absListView, this.f1232a, this.f1233b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
