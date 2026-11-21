package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import p006b.p067s.C0534l;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: Y */
    public final Context f751Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayAdapter f752Z;

    /* JADX INFO: renamed from: a0 */
    public Spinner f753a0;

    /* JADX INFO: renamed from: b0 */
    public final AdapterView.OnItemSelectedListener f754b0;

    /* JADX INFO: renamed from: androidx.preference.DropDownPreference$a */
    public class C0096a implements AdapterView.OnItemSelectedListener {
        public C0096a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String string = DropDownPreference.this.f760U[i].toString();
                if (string.equals(DropDownPreference.this.f761V)) {
                    return;
                }
                Objects.requireNonNull(DropDownPreference.this);
                DropDownPreference.this.m367J(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.g6, 0);
        this.f754b0 = new C0096a();
        this.f751Y = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f752Z = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f759T;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f752Z.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: l */
    public void mo356l() {
        super.mo356l();
        ArrayAdapter arrayAdapter = this.f752Z;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        Spinner spinner = (Spinner) c0534l.f927a.findViewById(R.id.n_);
        this.f753a0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f752Z);
        this.f753a0.setOnItemSelectedListener(this.f754b0);
        Spinner spinner2 = this.f753a0;
        String str = this.f761V;
        CharSequence[] charSequenceArr = this.f760U;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (charSequenceArr[length].equals(str)) {
                    i = length;
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo353p(c0534l);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: q */
    public void mo354q() {
        this.f753a0.performClick();
    }
}
