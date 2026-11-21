package p080c.p126d.p127a.p128a.p140k;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: c.d.a.a.k.a */
/* JADX INFO: loaded from: classes.dex */
public class C1217a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f5781a;

    public C1217a(Chip chip) {
        this.f5781a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        C1218b c1218b = this.f5781a.f10244e;
        if (c1218b != null) {
            c1218b.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
