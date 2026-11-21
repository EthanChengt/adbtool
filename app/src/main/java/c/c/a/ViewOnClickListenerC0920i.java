package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.ConnectActivity;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0920i implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4813b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConnectActivity connectActivity = this.f4813b;
        if (connectActivity.f6357O.size() == 0) {
            m.m1952H(connectActivity, "历史记录为空");
        } else {
            connectActivity.f6372z.showDropDown();
        }
    }
}
