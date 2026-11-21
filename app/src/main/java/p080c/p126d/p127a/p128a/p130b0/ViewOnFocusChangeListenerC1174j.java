package p080c.p126d.p127a.p128a.p130b0;

import android.view.View;

/* JADX INFO: renamed from: c.d.a.a.b0.j */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnFocusChangeListenerC1174j implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1172h f5623a;

    public ViewOnFocusChangeListenerC1174j(C1172h c1172h) {
        this.f5623a = c1172h;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        this.f5623a.f5627a.setEndIconActivated(z);
        if (z) {
            return;
        }
        C1172h.m2745e(this.f5623a, false);
        this.f5623a.f5607g = false;
    }
}
