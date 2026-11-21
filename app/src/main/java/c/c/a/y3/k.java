package c.c.a.y3;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.R;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: c.c.a.y3.k */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a */
    public final DialogInterfaceC0193i f5553a;

    /* JADX INFO: renamed from: b */
    public TextView f5554b;

    public k(Context context) {
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = new DialogInterfaceC0193i.a(context).m779a();
        this.f5553a = dialogInterfaceC0193iM779a;
        dialogInterfaceC0193iM779a.getWindow().setBackgroundDrawableResource(R.color.f3);
        View viewInflate = View.inflate(context, R.layout.b0, null);
        this.f5554b = (TextView) viewInflate.findViewById(R.id.ld);
        AlertController alertController = dialogInterfaceC0193iM779a.f1244d;
        alertController.f90h = viewInflate;
        alertController.f91i = 0;
        alertController.f96n = false;
        dialogInterfaceC0193iM779a.setCanceledOnTouchOutside(false);
    }
}
