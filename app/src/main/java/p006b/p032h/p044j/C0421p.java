package p006b.p032h.p044j;

import android.view.View;

/* JADX INFO: renamed from: b.h.j.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0421p extends C0418m.b<Boolean> {
    public C0421p(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // p006b.p032h.p044j.C0418m.b
    /* JADX INFO: renamed from: b */
    public Boolean mo1583b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    /* JADX INFO: renamed from: d */
    public void m1588d(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: renamed from: e */
    public boolean m1589e(Object obj, Object obj2) {
        return !m1582a((Boolean) obj, (Boolean) obj2);
    }
}
