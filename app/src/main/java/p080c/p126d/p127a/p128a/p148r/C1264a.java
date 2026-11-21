package p080c.p126d.p127a.p128a.p148r;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.p045w.C0429b;

/* JADX INFO: renamed from: c.d.a.a.r.a */
/* JADX INFO: loaded from: classes.dex */
public class C1264a extends C0406a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CheckableImageButton f6049d;

    public C1264a(CheckableImageButton checkableImageButton) {
        this.f6049d = checkableImageButton;
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: c */
    public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f6049d.isChecked());
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: d */
    public void mo223d(View view, C0429b c0429b) {
        this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
        c0429b.f2743a.setCheckable(this.f6049d.f10302e);
        c0429b.f2743a.setChecked(this.f6049d.isChecked());
    }
}
