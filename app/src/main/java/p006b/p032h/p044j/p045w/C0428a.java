package p006b.p032h.p044j.p045w;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: b.h.j.w.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0428a extends ClickableSpan {

    /* JADX INFO: renamed from: b */
    public final int f2739b;

    /* JADX INFO: renamed from: c */
    public final C0429b f2740c;

    /* JADX INFO: renamed from: d */
    public final int f2741d;

    public C0428a(int i, C0429b c0429b, int i2) {
        this.f2739b = i;
        this.f2740c = c0429b;
        this.f2741d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2739b);
        C0429b c0429b = this.f2740c;
        c0429b.f2743a.performAction(this.f2741d, bundle);
    }
}
