package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p006b.p067s.C0534l;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: N */
    public boolean f843N;

    /* JADX INFO: renamed from: O */
    public CharSequence f844O;

    /* JADX INFO: renamed from: P */
    public CharSequence f845P;

    /* JADX INFO: renamed from: Q */
    public boolean f846Q;

    /* JADX INFO: renamed from: R */
    public boolean f847R;

    /* JADX INFO: renamed from: androidx.preference.TwoStatePreference$a */
    public static class C0114a extends Preference.C0103b {
        public static final Parcelable.Creator<C0114a> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public boolean f848b;

        /* JADX INFO: renamed from: androidx.preference.TwoStatePreference$a$a */
        public static class a implements Parcelable.Creator<C0114a> {
            @Override // android.os.Parcelable.Creator
            public C0114a createFromParcel(Parcel parcel) {
                return new C0114a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0114a[] newArray(int i) {
                return new C0114a[i];
            }
        }

        public C0114a(Parcel parcel) {
            super(parcel);
            this.f848b = parcel.readInt() == 1;
        }

        public C0114a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f848b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: F */
    public boolean mo357F() {
        boolean z;
        if (this.f847R) {
            z = this.f843N;
        } else {
            z = !this.f843N;
        }
        return z || super.mo357F();
    }

    /* JADX INFO: renamed from: H */
    public void m402H(boolean z) {
        boolean z2 = this.f843N != z;
        if (z2 || !this.f846Q) {
            this.f843N = z;
            this.f846Q = true;
            if (m373G() && z != m377d(!z)) {
                m381h();
                SharedPreferences.Editor editorM1941b = this.f784c.m1941b();
                editorM1941b.putBoolean(this.f793l, z);
                if (!this.f784c.f3279e) {
                    editorM1941b.apply();
                }
            }
            if (z2) {
                mo384m(mo357F());
                mo356l();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m403I(CharSequence charSequence) {
        this.f845P = charSequence;
        if (this.f843N) {
            return;
        }
        mo356l();
    }

    /* JADX INFO: renamed from: J */
    public void m404J(CharSequence charSequence) {
        this.f844O = charSequence;
        if (this.f843N) {
            mo356l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    public void m405K(View view) {
        CharSequence charSequence;
        int i;
        CharSequence charSequenceMo368i;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            boolean z = true;
            if (!this.f843N || TextUtils.isEmpty(this.f844O)) {
                if (!this.f843N && !TextUtils.isEmpty(this.f845P)) {
                    charSequence = this.f845P;
                }
                if (z) {
                    charSequenceMo368i = mo368i();
                    if (!TextUtils.isEmpty(charSequenceMo368i)) {
                        textView.setText(charSequenceMo368i);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            charSequence = this.f844O;
            textView.setText(charSequence);
            z = false;
            if (z) {
                charSequenceMo368i = mo368i();
                if (!TextUtils.isEmpty(charSequenceMo368i)) {
                    textView.setText(charSequenceMo368i);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m406L(C0534l c0534l) {
        m405K(c0534l.m1944w(R.id.summary));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: q */
    public void mo354q() {
        m402H(!this.f843N);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    public Object mo359t(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: w */
    public void mo360w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0114a.class)) {
            super.mo360w(parcelable);
            return;
        }
        C0114a c0114a = (C0114a) parcelable;
        super.mo360w(c0114a.getSuperState());
        m402H(c0114a.f848b);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: x */
    public Parcelable mo361x() {
        Parcelable parcelableMo361x = super.mo361x();
        if (this.f799r) {
            return parcelableMo361x;
        }
        C0114a c0114a = new C0114a(parcelableMo361x);
        c0114a.f848b = this.f843N;
        return c0114a;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    public void mo362y(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m402H(m377d(((Boolean) obj).booleanValue()));
    }
}
