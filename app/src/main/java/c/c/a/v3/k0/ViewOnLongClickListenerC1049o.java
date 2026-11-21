package c.c.a.v3.k0;

import android.view.View;

/* JADX INFO: renamed from: c.c.a.v3.k0.o */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnLongClickListenerC1049o implements View.OnLongClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1051q.b f5177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1051q f5178c;

    public ViewOnLongClickListenerC1049o(C1051q c1051q, C1051q.b bVar) {
        this.f5178c = c1051q;
        this.f5177b = bVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int iM509e = this.f5177b.m509e();
        C1054t c1054t = C1054t.this;
        c1054t.m2669L0(c1054t.f5205X.get(iM509e));
        c1054t.m2673P0(true);
        return true;
    }
}
