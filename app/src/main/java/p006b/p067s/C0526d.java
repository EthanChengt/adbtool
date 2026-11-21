package p006b.p067s;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: b.s.d */
/* JADX INFO: loaded from: classes.dex */
public class C0526d extends AbstractDialogInterfaceOnClickListenerC0527e {

    /* JADX INFO: renamed from: r0 */
    public Set<String> f3230r0 = new HashSet();

    /* JADX INFO: renamed from: s0 */
    public boolean f3231s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence[] f3232t0;

    /* JADX INFO: renamed from: u0 */
    public CharSequence[] f3233u0;

    /* JADX INFO: renamed from: b.s.d$a */
    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean zRemove;
            C0526d c0526d = C0526d.this;
            if (z) {
                z2 = c0526d.f3231s0;
                zRemove = c0526d.f3230r0.add(c0526d.f3233u0[i].toString());
            } else {
                z2 = c0526d.f3231s0;
                zRemove = c0526d.f3230r0.remove(c0526d.f3233u0[i].toString());
            }
            c0526d.f3231s0 = zRemove | z2;
        }
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e, p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        if (bundle != null) {
            this.f3230r0.clear();
            this.f3230r0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f3231s0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f3232t0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f3233u0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m1923J0();
        if (multiSelectListPreference.f766T == null || multiSelectListPreference.f767U == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f3230r0.clear();
        this.f3230r0.addAll(multiSelectListPreference.f768V);
        this.f3231s0 = false;
        this.f3232t0 = multiSelectListPreference.f766T;
        this.f3233u0 = multiSelectListPreference.f767U;
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e
    /* JADX INFO: renamed from: N0 */
    public void mo1920N0(boolean z) {
        if (z && this.f3231s0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m1923J0();
            Objects.requireNonNull(multiSelectListPreference);
            multiSelectListPreference.m369H(this.f3230r0);
        }
        this.f3231s0 = false;
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e
    /* JADX INFO: renamed from: O0 */
    public void mo1922O0(DialogInterfaceC0193i.a aVar) {
        int length = this.f3233u0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f3230r0.contains(this.f3233u0[i].toString());
        }
        CharSequence[] charSequenceArr = this.f3232t0;
        a aVar2 = new a();
        AlertController.C0020b c0020b = aVar.f1245a;
        c0020b.f123l = charSequenceArr;
        c0020b.f131t = aVar2;
        c0020b.f127p = zArr;
        c0020b.f128q = true;
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e, p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        super.mo302g0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f3230r0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f3231s0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f3232t0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f3233u0);
    }
}
