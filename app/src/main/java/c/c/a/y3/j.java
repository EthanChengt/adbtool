package c.c.a.y3;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.R;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: c.c.a.y3.j */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a */
    public final DialogInterfaceC0193i f5549a;

    /* JADX INFO: renamed from: b */
    public final TextView f5550b;

    /* JADX INFO: renamed from: c */
    public TextView f5551c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f5552d;

    public j(Context context) {
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = new DialogInterfaceC0193i.a(context).m779a();
        this.f5549a = dialogInterfaceC0193iM779a;
        dialogInterfaceC0193iM779a.getWindow().setBackgroundDrawableResource(R.color.f3);
        View viewInflate = View.inflate(context, R.layout.az, null);
        this.f5550b = (TextView) viewInflate.findViewById(R.id.l_);
        this.f5551c = (TextView) viewInflate.findViewById(R.id.l8);
        this.f5552d = (ProgressBar) viewInflate.findViewById(R.id.l9);
        AlertController alertController = dialogInterfaceC0193iM779a.f1244d;
        alertController.f90h = viewInflate;
        alertController.f91i = 0;
        alertController.f96n = false;
        dialogInterfaceC0193iM779a.setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: renamed from: a */
    public void m2715a(String str) {
        this.f5551c.setVisibility(0);
        this.f5551c.setText(str);
    }
}
