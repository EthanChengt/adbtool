package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.didjdk.adbhelper.R;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: T */
    public CharSequence[] f759T;

    /* JADX INFO: renamed from: U */
    public CharSequence[] f760U;

    /* JADX INFO: renamed from: V */
    public String f761V;

    /* JADX INFO: renamed from: W */
    public String f762W;

    /* JADX INFO: renamed from: X */
    public boolean f763X;

    /* JADX INFO: renamed from: androidx.preference.ListPreference$a */
    public static class C0099a extends Preference.C0103b {
        public static final Parcelable.Creator<C0099a> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public String f764b;

        /* JADX INFO: renamed from: androidx.preference.ListPreference$a$a */
        public static class a implements Parcelable.Creator<C0099a> {
            @Override // android.os.Parcelable.Creator
            public C0099a createFromParcel(Parcel parcel) {
                return new C0099a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0099a[] newArray(int i) {
                return new C0099a[i];
            }
        }

        public C0099a(Parcel parcel) {
            super(parcel);
            this.f764b = parcel.readString();
        }

        public C0099a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f764b);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.ListPreference$b */
    public static final class C0100b implements Preference.InterfaceC0107f<ListPreference> {

        /* JADX INFO: renamed from: a */
        public static C0100b f765a;

        @Override // androidx.preference.Preference.InterfaceC0107f
        /* JADX INFO: renamed from: a */
        public CharSequence mo363a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            return TextUtils.isEmpty(listPreference.m366I()) ? listPreference.f783b.getString(R.string.ef) : listPreference.m366I();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0369g.m1474a(context, R.attr.fk, android.R.attr.dialogPreferenceStyle), 0);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: E */
    public void mo364E(CharSequence charSequence) {
        String string;
        super.mo364E(charSequence);
        if (charSequence == null && this.f762W != null) {
            string = null;
        } else if (charSequence == null || charSequence.equals(this.f762W)) {
            return;
        } else {
            string = charSequence.toString();
        }
        this.f762W = string;
    }

    /* JADX INFO: renamed from: H */
    public int m365H(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f760U) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f760U[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public CharSequence m366I() {
        CharSequence[] charSequenceArr;
        int iM365H = m365H(this.f761V);
        if (iM365H < 0 || (charSequenceArr = this.f759T) == null) {
            return null;
        }
        return charSequenceArr[iM365H];
    }

    /* JADX INFO: renamed from: J */
    public void m367J(String str) {
        boolean z = !TextUtils.equals(this.f761V, str);
        if (z || !this.f763X) {
            this.f761V = str;
            this.f763X = true;
            m370B(str);
            if (z) {
                mo356l();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: i */
    public CharSequence mo368i() {
        Preference.InterfaceC0107f interfaceC0107f = this.f781L;
        if (interfaceC0107f != null) {
            return interfaceC0107f.mo363a(this);
        }
        CharSequence charSequenceM366I = m366I();
        CharSequence charSequenceMo368i = super.mo368i();
        String str = this.f762W;
        if (str == null) {
            return charSequenceMo368i;
        }
        Object[] objArr = new Object[1];
        if (charSequenceM366I == null) {
            charSequenceM366I = "";
        }
        objArr[0] = charSequenceM366I;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceMo368i)) {
            return charSequenceMo368i;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    public Object mo359t(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: w */
    public void mo360w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0099a.class)) {
            super.mo360w(parcelable);
            return;
        }
        C0099a c0099a = (C0099a) parcelable;
        super.mo360w(c0099a.getSuperState());
        m367J(c0099a.f764b);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: x */
    public Parcelable mo361x() {
        Parcelable parcelableMo361x = super.mo361x();
        if (this.f799r) {
            return parcelableMo361x;
        }
        C0099a c0099a = new C0099a(parcelableMo361x);
        c0099a.f764b = this.f761V;
        return c0099a;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    public void mo362y(Object obj) {
        m367J(m379f((String) obj));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3296e, i, i2);
        this.f759T = C0369g.m1481h(typedArrayObtainStyledAttributes, 2, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f760U = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (C0100b.f765a == null) {
                C0100b.f765a = new C0100b();
            }
            this.f781L = C0100b.f765a;
            mo356l();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0536n.f3298g, i, i2);
        this.f762W = C0369g.m1480g(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
