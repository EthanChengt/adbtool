package c.c.a;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.R;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1116w implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConnectActivity f5434a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        final ConnectActivity connectActivity = this.f5434a;
        Objects.requireNonNull(connectActivity);
        int i = message.what;
        connectActivity.f6371y = i;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                return false;
            }
            connectActivity.z();
            return false;
        }
        connectActivity.z();
        ProgressDialog progressDialog = new ProgressDialog(connectActivity);
        connectActivity.f6344B = progressDialog;
        progressDialog.setTitle(connectActivity.getString(R.string.b8));
        connectActivity.f6344B.setMessage(connectActivity.getString(R.string.b6));
        connectActivity.f6344B.setCancelable(true);
        connectActivity.f6344B.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: c.c.a.f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                connectActivity.f6370x.sendEmptyMessage(3);
            }
        });
        connectActivity.f6344B.show();
        return false;
    }
}
