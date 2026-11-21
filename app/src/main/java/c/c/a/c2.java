package c.c.a;

import android.view.View;
import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4773b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final UnlockActivity unlockActivity = this.f4773b;
        Objects.requireNonNull(unlockActivity);
        new Thread(new z1(unlockActivity)).start();
    }
}
