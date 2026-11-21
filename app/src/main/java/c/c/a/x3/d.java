package c.c.a.x3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.TimerTask;

/* JADX INFO: renamed from: c.c.a.x3.d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends TimerTask {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f5481b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5482c;

    /* JADX INFO: renamed from: c.c.a.x3.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f5482c.setFocusable(true);
            d.this.f5482c.setFocusableInTouchMode(true);
            d.this.f5482c.requestFocus();
            ((InputMethodManager) d.this.f5482c.getContext().getSystemService("input_method")).showSoftInput(d.this.f5482c, 0);
        }
    }

    public d(Context context, View view) {
        this.f5481b = context;
        this.f5482c = view;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        ((Activity) this.f5481b).runOnUiThread(new a());
    }
}
