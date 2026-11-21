package c.c.a;

import android.view.KeyEvent;
import android.view.View;
import com.didjdk.adbhelper.FastbootActivity;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.o0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0951o0 implements View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4864b;

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        FastbootActivity fastbootActivity = this.f4864b;
        Objects.requireNonNull(fastbootActivity);
        String str = "key code:" + i + keyEvent;
        if (i != 66 || keyEvent.getAction() != 0) {
            return false;
        }
        fastbootActivity.A();
        return true;
    }
}
