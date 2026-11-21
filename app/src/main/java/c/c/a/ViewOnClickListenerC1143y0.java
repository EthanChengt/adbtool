package c.c.a;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.didjdk.adbhelper.MainActivity;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.y0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1143y0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DrawerLayout f5495b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DrawerLayout drawerLayout = this.f5495b;
        int i = MainActivity.f6448M;
        View viewM230d = drawerLayout.m230d(8388611);
        if (viewM230d != null) {
            drawerLayout.m238n(viewM230d, true);
        } else {
            StringBuilder sbM2191e = a.m2191e("No drawer view found with gravity ");
            sbM2191e.append(DrawerLayout.m225i(8388611));
            throw new IllegalArgumentException(sbM2191e.toString());
        }
    }
}
