package c.c.a;

import android.view.View;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import com.didjdk.adbhelper.UnlockActivity;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: c.c.a.k2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0933k2 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4836b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UnlockActivity unlockActivity = this.f4836b;
        if (unlockActivity.f10095t == null) {
            return;
        }
        DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(unlockActivity);
        View viewInflate = View.inflate(unlockActivity, R.layout.av, null);
        aVar.m785g(viewInflate);
        aVar.f1245a.f115d = "解锁说明";
        aVar.m780b(R.string.b2, null);
        aVar.m786h();
        ((TextView) viewInflate.findViewById(R.id.dl)).setText(unlockActivity.f10095t);
    }
}
