package c.c.a;

import android.content.Intent;
import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import com.didjdk.adbhelper.FilePickerActivity;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.e0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0901e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4782b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FastbootActivity fastbootActivity = this.f4782b;
        Objects.requireNonNull(fastbootActivity);
        Intent intent = new Intent(fastbootActivity, (Class<?>) FilePickerActivity.class);
        intent.putExtra("picker_mode", 4);
        fastbootActivity.startActivityForResult(intent, 4);
    }
}
