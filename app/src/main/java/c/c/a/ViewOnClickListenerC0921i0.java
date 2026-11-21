package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import c.c.a.y3.e;

/* JADX INFO: renamed from: c.c.a.i0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0921i0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4814b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final FastbootActivity fastbootActivity = this.f4814b;
        Objects.requireNonNull(fastbootActivity);
        final e c1150e = new e(fastbootActivity);
        c1150e.f5519c.setVisibility(0);
        c1150e.f5519c.setText("请输入分区名");
        c1150e.f5523g.setText(fastbootActivity.F.getText());
        c1150e.m2699b(fastbootActivity.getString(R.string.aq));
        c1150e.m2700c(fastbootActivity.getString(R.string.eg));
        c1150e.f5525i.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FastbootActivity fastbootActivity2 = fastbootActivity;
                e c1150e2 = c1150e;
                Objects.requireNonNull(fastbootActivity2);
                fastbootActivity2.T = c1150e2.f5523g.getText().toString();
                fastbootActivity2.F.setVisibility(0);
                fastbootActivity2.F.setText(fastbootActivity2.T);
                c1150e2.f5518b.dismiss();
            }
        });
        c1150e.m2702e();
    }
}
