package c.c.a;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.MainActivity;
import c.c.a.p115u3.C0984a;

/* JADX INFO: renamed from: c.c.a.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0950o implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4863b;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ConnectActivity connectActivity = this.f4863b;
        C0984a c0984a = connectActivity.f6347E.get(i);
        if (c0984a.f4927b.equals(connectActivity.f6366t.m2687a("smWBkeFv"))) {
            connectActivity.f6350H = c0984a;
            connectActivity.z();
            Intent intent = new Intent(connectActivity, (Class<?>) MainActivity.class);
            intent.putExtra("ADB", connectActivity.f6369w + "-t " + connectActivity.f6350H.f4929d + " ");
            intent.putExtra("deviceFromUSB", connectActivity.f6350H.f4926a.equals(connectActivity.f6364r));
            intent.putExtra("model", connectActivity.f6350H.f4928c);
            intent.putExtra("address", connectActivity.f6350H.f4926a.equals(connectActivity.f6364r) ? "USB" : connectActivity.f6350H.f4926a);
            connectActivity.startActivityForResult(intent, 1);
        }
    }
}
