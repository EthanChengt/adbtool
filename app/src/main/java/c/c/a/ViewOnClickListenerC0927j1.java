package c.c.a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.didjdk.adbhelper.RemoteActivity;

/* JADX INFO: renamed from: c.c.a.j1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0927j1 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConstraintLayout f4825b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConstraintLayout constraintLayout = this.f4825b;
        int i = RemoteActivity.f10046V;
        constraintLayout.setVisibility(constraintLayout.getVisibility() == 8 ? 0 : 8);
    }
}
