package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.UnlockActivity;
import p006b.p067s.C0532j;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.n2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0948n2 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h f4861c;

    public /* synthetic */ ViewOnClickListenerC0948n2(UnlockActivity unlockActivity, h c1153h) {
        this.f4860b = unlockActivity;
        this.f4861c = c1153h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UnlockActivity unlockActivity = this.f4860b;
        h c1153h = this.f4861c;
        C0532j.m1940a(unlockActivity).edit().remove("signed_id").apply();
        c1153h.f5539a.dismiss();
    }
}
