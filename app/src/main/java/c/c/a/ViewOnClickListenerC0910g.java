package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.ConnectActivity;
import java.util.Iterator;

/* JADX INFO: renamed from: c.c.a.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0910g implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity.C1316c f4796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f4797c;

    public /* synthetic */ ViewOnClickListenerC0910g(ConnectActivity.C1316c c1316c, String str) {
        this.f4796b = c1316c;
        this.f4797c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConnectActivity.C1316c c1316c = this.f4796b;
        String str = this.f4797c;
        Iterator<String> it = ConnectActivity.this.f6357O.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                it.remove();
            }
        }
        ConnectActivity.this.f6357O.size();
        ConnectActivity.this.f6356N.notifyDataSetChanged();
    }
}
