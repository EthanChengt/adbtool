package p006b.p067s;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import java.util.Objects;

/* JADX INFO: renamed from: b.s.a */
/* JADX INFO: loaded from: classes.dex */
public class C0523a extends AbstractDialogInterfaceOnClickListenerC0527e {

    /* JADX INFO: renamed from: r0 */
    public EditText f3223r0;

    /* JADX INFO: renamed from: s0 */
    public CharSequence f3224s0;

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e
    /* JADX INFO: renamed from: K0 */
    public boolean mo1918K0() {
        return true;
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e, p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        this.f3224s0 = bundle == null ? m1921P0().f756T : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e
    /* JADX INFO: renamed from: L0 */
    public void mo1919L0(View view) {
        super.mo1919L0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f3223r0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f3223r0.setText(this.f3224s0);
        EditText editText2 = this.f3223r0;
        editText2.setSelection(editText2.getText().length());
        Objects.requireNonNull(m1921P0());
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e
    /* JADX INFO: renamed from: N0 */
    public void mo1920N0(boolean z) {
        if (z) {
            String string = this.f3223r0.getText().toString();
            EditTextPreference editTextPreferenceM1921P0 = m1921P0();
            Objects.requireNonNull(editTextPreferenceM1921P0);
            editTextPreferenceM1921P0.m358H(string);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final EditTextPreference m1921P0() {
        return (EditTextPreference) m1923J0();
    }

    @Override // p006b.p067s.AbstractDialogInterfaceOnClickListenerC0527e, p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        super.mo302g0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f3224s0);
    }
}
