package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.d0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0896d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4777b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h f4778c;

    public /* synthetic */ ViewOnClickListenerC0896d0(FastbootActivity fastbootActivity, h c1153h) {
        this.f4777b = fastbootActivity;
        this.f4778c = c1153h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FastbootActivity fastbootActivity = this.f4777b;
        h c1153h = this.f4778c;
        fastbootActivity.N.setText("");
        fastbootActivity.C();
        c1153h.f5539a.dismiss();
    }
}
