package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.didjdk.adbhelper.R;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.AbstractC0528f;
import p006b.p067s.C0532j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: T */
    public boolean f817T;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0369g.m1474a(context, R.attr.no, android.R.attr.preferenceScreenStyle), 0);
        this.f817T = true;
    }

    @Override // androidx.preference.PreferenceGroup
    /* JADX INFO: renamed from: K */
    public boolean mo396K() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: q */
    public void mo354q() {
        C0532j.b bVar;
        if (this.f794m != null || this.f795n != null || m395J() == 0 || (bVar = this.f784c.f3284j) == null) {
            return;
        }
        AbstractC0528f abstractC0528f = (AbstractC0528f) bVar;
        if (abstractC0528f.m303h() instanceof AbstractC0528f.f) {
            ((AbstractC0528f.f) abstractC0528f.m303h()).m1930a(abstractC0528f, this);
        }
    }
}
