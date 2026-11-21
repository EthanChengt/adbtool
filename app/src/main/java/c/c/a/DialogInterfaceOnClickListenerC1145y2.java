package c.c.a;

import android.content.DialogInterface;
import com.didjdk.adbhelper.ConnectActivity;

/* JADX INFO: renamed from: c.c.a.y2 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC1145y2 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String[] f5497b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ConnectActivity f5498c;

    public DialogInterfaceOnClickListenerC1145y2(ConnectActivity connectActivity, String[] strArr) {
        this.f5498c = connectActivity;
        this.f5497b = strArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f5497b[i].split("\\(")[0];
        this.f5498c.f6372z.setText(str);
        this.f5498c.f6372z.setSelection(str.length());
    }
}
