package c.c.a;

import android.content.SharedPreferences;
import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import java.util.Objects;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1130x implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f5467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SharedPreferences f5468c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h f5469d;

    public /* synthetic */ ViewOnClickListenerC1130x(FastbootActivity fastbootActivity, SharedPreferences sharedPreferences, h c1153h) {
        this.f5467b = fastbootActivity;
        this.f5468c = sharedPreferences;
        this.f5469d = c1153h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FastbootActivity fastbootActivity = this.f5467b;
        SharedPreferences sharedPreferences = this.f5468c;
        h c1153h = this.f5469d;
        Objects.requireNonNull(fastbootActivity);
        sharedPreferences.edit().putBoolean("show_fastboot_dialog", !c1153h.f5542d.isChecked()).apply();
        fastbootActivity.u = true;
        fastbootActivity.D();
        c1153h.f5539a.dismiss();
    }
}
