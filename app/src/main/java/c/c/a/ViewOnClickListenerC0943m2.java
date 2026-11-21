package c.c.a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.didjdk.adbhelper.UnlockActivity;

/* JADX INFO: renamed from: c.c.a.m2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0943m2 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4856b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UnlockActivity unlockActivity = this.f4856b;
        if (unlockActivity.f10092q) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://didjdk.github.io/adbhelper/pro/10/pay"));
            unlockActivity.startActivity(intent);
        }
    }
}
