package p006b.p067s;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreference;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: b.s.c */
/* JADX INFO: loaded from: classes.dex */
public class C0525c extends AbstractDialogInterfaceOnClickListenerC0527e {

    /* JADX INFO: renamed from: r0 */
    public int f3226r0;

    /* JADX INFO: renamed from: s0 */
    public CharSequence[] f3227s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence[] f3228t0;

    /* JADX INFO: renamed from: b.s.c$a */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0525c c0525c = C0525c.this;
            c0525c.f3226r0 = i;
            c0525c.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e, p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        if (bundle != null) {
            this.f3226r0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f3227s0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f3228t0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) m1923J0();
        if (listPreference.f759T == null || listPreference.f760U == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f3226r0 = listPreference.m365H(listPreference.f761V);
        this.f3227s0 = listPreference.f759T;
        this.f3228t0 = listPreference.f760U;
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e
    /* JADX INFO: renamed from: N0 */
    public void mo1920N0(boolean z) {
        int i;
        if (!z || (i = this.f3226r0) < 0) {
            return;
        }
        String string = this.f3228t0[i].toString();
        ListPreference listPreference = (ListPreference) m1923J0();
        Objects.requireNonNull(listPreference);
        listPreference.m367J(string);
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e
    /* JADX INFO: renamed from: O0 */
    public void mo1922O0(DialogInterfaceC0193i.a aVar) {
        aVar.m783e(this.f3227s0, this.f3226r0, new a());
        aVar.m782d(null, null);
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e, p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        super.mo302g0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f3226r0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f3227s0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f3228t0);
    }
}
