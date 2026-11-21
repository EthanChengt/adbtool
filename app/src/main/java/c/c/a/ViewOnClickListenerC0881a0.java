package c.c.a;

import android.content.Intent;
import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0881a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h f4753c;

    public /* synthetic */ ViewOnClickListenerC0881a0(FastbootActivity fastbootActivity, h c1153h) {
        this.f4752b = fastbootActivity;
        this.f4753c = c1153h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FastbootActivity fastbootActivity = this.f4752b;
        h c1153h = this.f4753c;
        Objects.requireNonNull(fastbootActivity);
        c1153h.f5539a.dismiss();
        fastbootActivity.startActivity(new Intent(fastbootActivity, (Class<?>) UnlockActivity.class));
        fastbootActivity.finish();
    }
}
