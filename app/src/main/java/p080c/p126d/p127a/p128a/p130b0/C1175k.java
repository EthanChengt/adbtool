package p080c.p126d.p127a.p128a.p130b0;

import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: c.d.a.a.b0.k */
/* JADX INFO: loaded from: classes.dex */
public class C1175k implements AutoCompleteTextView.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1172h f5624a;

    public C1175k(C1172h c1172h) {
        this.f5624a = c1172h;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        C1172h c1172h = this.f5624a;
        c1172h.f5607g = true;
        c1172h.f5609i = System.currentTimeMillis();
        C1172h.m2745e(this.f5624a, false);
    }
}
