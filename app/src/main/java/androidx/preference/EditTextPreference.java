package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.didjdk.adbhelper.R;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: T */
    public String f756T;

    /* JADX INFO: renamed from: androidx.preference.EditTextPreference$a */
    public static class C0097a extends Preference.C0103b {
        public static final Parcelable.Creator<C0097a> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public String f757b;

        /* JADX INFO: renamed from: androidx.preference.EditTextPreference$a$a */
        public static class a implements Parcelable.Creator<C0097a> {
            @Override // android.os.Parcelable.Creator
            public C0097a createFromParcel(Parcel parcel) {
                return new C0097a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0097a[] newArray(int i) {
                return new C0097a[i];
            }
        }

        public C0097a(Parcel parcel) {
            super(parcel);
            this.f757b = parcel.readString();
        }

        public C0097a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f757b);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.EditTextPreference$b */
    public static final class C0098b implements Preference.InterfaceC0107f<EditTextPreference> {

        /* JADX INFO: renamed from: a */
        public static C0098b f758a;

        @Override // androidx.preference.Preference.InterfaceC0107f
        /* JADX INFO: renamed from: a */
        public CharSequence mo363a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.f756T) ? editTextPreference.f783b.getString(R.string.ef) : editTextPreference.f756T;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM1474a = C0369g.m1474a(context, R.attr.g9, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM1474a, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3295d, iM1474a, 0);
        if (C0369g.m1475b(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (C0098b.f758a == null) {
                C0098b.f758a = new C0098b();
            }
            this.f781L = C0098b.f758a;
            mo356l();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: F */
    public boolean mo357F() {
        return TextUtils.isEmpty(this.f756T) || super.mo357F();
    }

    /* JADX INFO: renamed from: H */
    public void m358H(String str) {
        boolean zMo357F = mo357F();
        this.f756T = str;
        m370B(str);
        boolean zMo357F2 = mo357F();
        if (zMo357F2 != zMo357F) {
            mo384m(zMo357F2);
        }
        mo356l();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    public Object mo359t(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: w */
    public void mo360w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0097a.class)) {
            super.mo360w(parcelable);
            return;
        }
        C0097a c0097a = (C0097a) parcelable;
        super.mo360w(c0097a.getSuperState());
        m358H(c0097a.f757b);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: x */
    public Parcelable mo361x() {
        Parcelable parcelableMo361x = super.mo361x();
        if (this.f799r) {
            return parcelableMo361x;
        }
        C0097a c0097a = new C0097a(parcelableMo361x);
        c0097a.f757b = this.f756T;
        return c0097a;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    public void mo362y(Object obj) {
        m358H(m379f((String) obj));
    }
}
