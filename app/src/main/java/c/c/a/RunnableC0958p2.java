package c.c.a;

import android.view.inputmethod.InputMethodManager;
import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.p2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0958p2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DialogInterfaceC0193i f4873c;

    public /* synthetic */ RunnableC0958p2(UnlockActivity unlockActivity, DialogInterfaceC0193i dialogInterfaceC0193i) {
        this.f4872b = unlockActivity;
        this.f4873c = dialogInterfaceC0193i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnlockActivity unlockActivity = this.f4872b;
        DialogInterfaceC0193i dialogInterfaceC0193i = this.f4873c;
        Objects.requireNonNull(unlockActivity);
        dialogInterfaceC0193i.dismiss();
        InputMethodManager inputMethodManager = (InputMethodManager) unlockActivity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(unlockActivity.getWindow().getDecorView().getWindowToken(), 0);
        }
        m.m1952H(unlockActivity, "已解锁");
        unlockActivity.f10097v.setVisibility(0);
        unlockActivity.f10098w.setVisibility(8);
        unlockActivity.f10099x.setVisibility(0);
    }
}
