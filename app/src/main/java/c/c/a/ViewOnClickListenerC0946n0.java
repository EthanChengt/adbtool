package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.n0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0946n0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4858b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final FastbootActivity fastbootActivity = this.f4858b;
        Objects.requireNonNull(fastbootActivity);
        final h c1153h = new h(fastbootActivity);
        c1153h.f5540b.setVisibility(0);
        c1153h.f5540b.setText("是否要重启设备？");
        c1153h.m2711b(fastbootActivity.getString(R.string.aq));
        c1153h.m2713d(fastbootActivity.getString(R.string.eg), new View.OnClickListener() { // from class: c.c.a.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FastbootActivity fastbootActivity2 = fastbootActivity;
                h c1153h2 = c1153h;
                fastbootActivity2.R.m2627c("fastboot reboot");
                fastbootActivity2.N.append(fastbootActivity2.z("fastboot reboot\n", 0));
                c1153h2.f5539a.dismiss();
            }
        });
        c1153h.f5539a.show();
    }
}
