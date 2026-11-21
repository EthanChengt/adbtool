package c.c.a;

import android.os.Handler;
import android.os.Message;
import com.didjdk.adbhelper.MainActivity;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.a1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0882a1 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f4754a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        MainActivity mainActivity = this.f4754a;
        Objects.requireNonNull(mainActivity);
        if (((String) message.obj).contains("offline")) {
            mainActivity.f47f.m9a();
        }
        mainActivity.f6461q = true;
        return false;
    }
}
