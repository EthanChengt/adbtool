package p006b.p052k.p053a;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: renamed from: b.k.a.a */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnApplyWindowInsetsListenerC0448a implements View.OnApplyWindowInsetsListener {
    public ViewOnApplyWindowInsetsListenerC0448a(DrawerLayout drawerLayout) {
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f642y = windowInsets;
        drawerLayout.f643z = z;
        drawerLayout.setWillNotDraw(!z && drawerLayout.getBackground() == null);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
