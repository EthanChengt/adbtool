package c.c.a;

import android.app.ProgressDialog;
import android.os.Handler;
import android.view.View;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import c.c.a.y3.e;

/* JADX INFO: renamed from: c.c.a.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0975t implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e f4901c;

    public /* synthetic */ ViewOnClickListenerC0975t(ConnectActivity connectActivity, e c1150e) {
        this.f4900b = connectActivity;
        this.f4901c = c1150e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final ConnectActivity connectActivity = this.f4900b;
        e c1150e = this.f4901c;
        Objects.requireNonNull(connectActivity);
        final String string = c1150e.f5523g.getText().toString();
        String strReplace = c1150e.f5524h.getText().toString().replace("：", ":");
        if (strReplace.trim().isEmpty() || string.trim().isEmpty()) {
            return;
        }
        connectActivity.f6351I.m2627c(connectActivity.f6369w + "pair " + strReplace);
        connectActivity.f6371y = 4;
        new Handler().postDelayed(new Runnable() { // from class: c.c.a.d
            @Override // java.lang.Runnable
            public final void run() {
                ConnectActivity connectActivity2 = connectActivity;
                connectActivity2.f6351I.m2627c(string);
            }
        }, 500L);
        c1150e.f5518b.dismiss();
        connectActivity.z();
        ProgressDialog progressDialog = new ProgressDialog(connectActivity);
        connectActivity.f6344B = progressDialog;
        progressDialog.setMessage(connectActivity.getString(R.string.ez));
        connectActivity.f6344B.show();
    }
}
