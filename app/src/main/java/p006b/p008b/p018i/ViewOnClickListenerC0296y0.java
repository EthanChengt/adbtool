package p006b.p008b.p018i;

import android.R;
import android.view.View;
import android.view.Window;
import p006b.p008b.p016h.p017i.C0223a;

/* JADX INFO: renamed from: b.b.i.y0 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0296y0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final C0223a f2072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0298z0 f2073c;

    public ViewOnClickListenerC0296y0(C0298z0 c0298z0) {
        this.f2073c = c0298z0;
        this.f2072b = new C0223a(c0298z0.f2078a.getContext(), 0, R.id.home, 0, 0, c0298z0.f2086i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0298z0 c0298z0 = this.f2073c;
        Window.Callback callback = c0298z0.f2089l;
        if (callback == null || !c0298z0.f2090m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2072b);
    }
}
