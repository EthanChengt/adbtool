package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.m0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0941m0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h f4854c;

    public /* synthetic */ ViewOnClickListenerC0941m0(FastbootActivity fastbootActivity, h c1153h) {
        this.f4853b = fastbootActivity;
        this.f4854c = c1153h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FastbootActivity fastbootActivity = this.f4853b;
        h c1153h = this.f4854c;
        fastbootActivity.u = false;
        c1153h.f5539a.dismiss();
        fastbootActivity.onBackPressed();
    }
}
