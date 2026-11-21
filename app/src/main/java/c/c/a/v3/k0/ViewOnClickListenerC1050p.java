package c.c.a.v3.k0;

import android.view.View;

/* JADX INFO: renamed from: c.c.a.v3.k0.p */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1050p implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1051q.b f5179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1051q f5180c;

    public ViewOnClickListenerC1050p(C1051q c1051q, C1051q.b bVar) {
        this.f5180c = c1051q;
        this.f5179b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM509e = this.f5179b.m509e();
        C1054t c1054t = C1054t.this;
        c1054t.m2669L0(c1054t.f5205X.get(iM509e));
    }
}
