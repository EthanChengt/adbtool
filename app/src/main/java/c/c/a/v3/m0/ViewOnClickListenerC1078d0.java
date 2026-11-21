package c.c.a.v3.m0;

import android.view.View;
import android.widget.EditText;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: c.c.a.v3.m0.d0 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC1078d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f5335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EditText f5336c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EditText f5337d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DialogInterfaceC0193i f5338e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1102z f5339f;

    public ViewOnClickListenerC1078d0(C1102z c1102z, EditText editText, EditText editText2, EditText editText3, DialogInterfaceC0193i dialogInterfaceC0193i) {
        this.f5339f = c1102z;
        this.f5335b = editText;
        this.f5336c = editText2;
        this.f5337d = editText3;
        this.f5338e = dialogInterfaceC0193i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f5339f.f5389Z.m2627c(this.f5339f.f4967W + "shell settings put global window_animation_scale " + this.f5335b.getText().toString() + ";" + this.f5339f.f4967W + "shell settings put global transition_animation_scale " + this.f5336c.getText().toString() + ";" + this.f5339f.f4967W + "shell settings put global animator_duration_scale " + this.f5337d.getText().toString() + ";echo " + this.f5339f.f5398i0);
        this.f5338e.dismiss();
    }
}
