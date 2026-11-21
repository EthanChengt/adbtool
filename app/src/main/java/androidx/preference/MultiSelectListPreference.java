package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.didjdk.adbhelper.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: T */
    public CharSequence[] f766T;

    /* JADX INFO: renamed from: U */
    public CharSequence[] f767U;

    /* JADX INFO: renamed from: V */
    public Set<String> f768V;

    /* JADX INFO: renamed from: androidx.preference.MultiSelectListPreference$a */
    public static class C0101a extends Preference.C0103b {
        public static final Parcelable.Creator<C0101a> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public Set<String> f769b;

        /* JADX INFO: renamed from: androidx.preference.MultiSelectListPreference$a$a */
        public static class a implements Parcelable.Creator<C0101a> {
            @Override // android.os.Parcelable.Creator
            public C0101a createFromParcel(Parcel parcel) {
                return new C0101a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0101a[] newArray(int i) {
                return new C0101a[i];
            }
        }

        public C0101a(Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.f769b = new HashSet();
            String[] strArr = new String[i];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f769b, strArr);
        }

        public C0101a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f769b.size());
            Set<String> set = this.f769b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iM1474a = C0369g.m1474a(context, R.attr.fk, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iM1474a, 0);
        this.f768V = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3297f, iM1474a, 0);
        this.f766T = C0369g.m1481h(typedArrayObtainStyledAttributes, 2, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f767U = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: H */
    public void m369H(Set<String> set) {
        this.f768V.clear();
        this.f768V.addAll(set);
        if (m373G() && !set.equals(m380g(null))) {
            m381h();
            SharedPreferences.Editor editorM1941b = this.f784c.m1941b();
            editorM1941b.putStringSet(this.f793l, set);
            if (!this.f784c.f3279e) {
                editorM1941b.apply();
            }
        }
        mo356l();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    public Object mo359t(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: w */
    public void mo360w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0101a.class)) {
            super.mo360w(parcelable);
            return;
        }
        C0101a c0101a = (C0101a) parcelable;
        super.mo360w(c0101a.getSuperState());
        m369H(c0101a.f769b);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: x */
    public Parcelable mo361x() {
        Parcelable parcelableMo361x = super.mo361x();
        if (this.f799r) {
            return parcelableMo361x;
        }
        C0101a c0101a = new C0101a(parcelableMo361x);
        c0101a.f769b = this.f768V;
        return c0101a;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    public void mo362y(Object obj) {
        m369H(m380g((Set) obj));
    }
}
