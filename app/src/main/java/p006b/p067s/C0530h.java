package p006b.p067s;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.Objects;

/* JADX INFO: renamed from: b.s.h */
/* JADX INFO: loaded from: classes.dex */
public class C0530h implements Preference.InterfaceC0105d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PreferenceGroup f3267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0529g f3268b;

    public C0530h(C0529g c0529g, PreferenceGroup preferenceGroup) {
        this.f3268b = c0529g;
        this.f3267a = preferenceGroup;
    }

    @Override // androidx.preference.Preference.InterfaceC0105d
    /* JADX INFO: renamed from: a */
    public boolean mo392a(Preference preference) {
        this.f3267a.m397L(Integer.MAX_VALUE);
        C0529g c0529g = this.f3268b;
        c0529g.f3261g.removeCallbacks(c0529g.f3262h);
        c0529g.f3261g.post(c0529g.f3262h);
        Objects.requireNonNull(this.f3267a);
        return true;
    }
}
