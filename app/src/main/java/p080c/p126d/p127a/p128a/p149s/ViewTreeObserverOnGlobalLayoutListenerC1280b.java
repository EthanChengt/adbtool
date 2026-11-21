package p080c.p126d.p127a.p128a.p149s;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.google.android.material.navigation.NavigationView;
import p080c.p126d.p127a.p128a.p148r.C1271h;

/* JADX INFO: renamed from: c.d.a.a.s.b */
/* JADX INFO: loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1280b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NavigationView f6157b;

    public ViewTreeObserverOnGlobalLayoutListenerC1280b(NavigationView navigationView) {
        this.f6157b = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        NavigationView navigationView = this.f6157b;
        navigationView.getLocationOnScreen(navigationView.f10323k);
        NavigationView navigationView2 = this.f6157b;
        boolean z = navigationView2.f10323k[1] == 0;
        C1271h c1271h = navigationView2.f10320h;
        if (c1271h.f6115q != z) {
            c1271h.f6115q = z;
            c1271h.m2934o();
        }
        this.f6157b.setDrawTopInsetForeground(z);
        Context context = this.f6157b.getContext();
        if (!(context instanceof Activity) || Build.VERSION.SDK_INT < 21) {
            return;
        }
        Activity activity = (Activity) context;
        this.f6157b.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == this.f6157b.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0));
    }
}
