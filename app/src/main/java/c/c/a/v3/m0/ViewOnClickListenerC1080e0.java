package c.c.a.v3.m0;

import android.view.View;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: c.c.a.v3.m0.e0 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1080e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogInterfaceC0193i f5341b;

    public ViewOnClickListenerC1080e0(C1102z c1102z, DialogInterfaceC0193i dialogInterfaceC0193i) {
        this.f5341b = dialogInterfaceC0193i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f5341b.dismiss();
    }
}
