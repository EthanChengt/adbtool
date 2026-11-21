package c.c.a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.FastbootActivity;
import com.didjdk.adbhelper.R;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.k0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0931k0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4834b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FastbootActivity fastbootActivity = this.f4834b;
        fastbootActivity.w = true;
        DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(fastbootActivity);
        View viewInflate = View.inflate(fastbootActivity, R.layout.b1, null);
        fastbootActivity.J = (TextView) viewInflate.findViewById(R.id.q9);
        AlertController.C0020b c0020b = aVar.f1245a;
        c0020b.f126o = viewInflate;
        c0020b.f115d = "设备信息";
        aVar.m780b(R.string.b2, null);
        aVar.m786h();
        fastbootActivity.J.setText(fastbootActivity.z("fastboot getvar all;fastboot oem device-info\n\n", 0));
        fastbootActivity.N.append(fastbootActivity.z("fastboot getvar all;fastboot oem device-info\n", 0));
        a.m2193g(a.m2191e("fastboot getvar all;fastboot oem device-info"), fastbootActivity.U, fastbootActivity.R);
    }
}
