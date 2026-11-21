package c.c.a;

import androidx.core.widget.NestedScrollView;
import com.didjdk.adbhelper.FastbootActivity;

/* JADX INFO: renamed from: c.c.a.i3 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0924i3 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NestedScrollView f4820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FastbootActivity f4821c;

    public RunnableC0924i3(FastbootActivity fastbootActivity, NestedScrollView nestedScrollView) {
        this.f4821c = fastbootActivity;
        this.f4820b = nestedScrollView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4820b.m213q(130);
        this.f4821c.P.requestFocus();
    }
}
