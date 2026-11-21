package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p006b.p025e.C0320h;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: N */
    public final C0320h<String, Long> f810N;

    /* JADX INFO: renamed from: O */
    public List<Preference> f811O;

    /* JADX INFO: renamed from: P */
    public boolean f812P;

    /* JADX INFO: renamed from: Q */
    public int f813Q;

    /* JADX INFO: renamed from: R */
    public boolean f814R;

    /* JADX INFO: renamed from: S */
    public int f815S;

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroup$a */
    public static class C0108a extends Preference.C0103b {
        public static final Parcelable.Creator<C0108a> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public int f816b;

        /* JADX INFO: renamed from: androidx.preference.PreferenceGroup$a$a */
        public static class a implements Parcelable.Creator<C0108a> {
            @Override // android.os.Parcelable.Creator
            public C0108a createFromParcel(Parcel parcel) {
                return new C0108a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0108a[] newArray(int i) {
                return new C0108a[i];
            }
        }

        public C0108a(Parcel parcel) {
            super(parcel);
            this.f816b = parcel.readInt();
        }

        public C0108a(Parcelable parcelable, int i) {
            super(parcelable);
            this.f816b = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f816b);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    /* JADX INFO: renamed from: H */
    public <T extends Preference> T m393H(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f793l, charSequence)) {
            return this;
        }
        int iM395J = m395J();
        for (int i = 0; i < iM395J; i++) {
            PreferenceGroup preferenceGroup = (T) m394I(i);
            if (TextUtils.equals(preferenceGroup.f793l, charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.m393H(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public Preference m394I(int i) {
        return this.f811O.get(i);
    }

    /* JADX INFO: renamed from: J */
    public int m395J() {
        return this.f811O.size();
    }

    /* JADX INFO: renamed from: K */
    public boolean mo396K() {
        return true;
    }

    /* JADX INFO: renamed from: L */
    public void m397L(int i) {
        if (i != Integer.MAX_VALUE && !m382j()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f815S = i;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public void mo374a(Bundle bundle) {
        super.mo374a(bundle);
        int iM395J = m395J();
        for (int i = 0; i < iM395J; i++) {
            m394I(i).mo374a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: b */
    public void mo375b(Bundle bundle) {
        super.mo375b(bundle);
        int iM395J = m395J();
        for (int i = 0; i < iM395J; i++) {
            m394I(i).mo375b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    public void mo384m(boolean z) {
        super.mo384m(z);
        int iM395J = m395J();
        for (int i = 0; i < iM395J; i++) {
            m394I(i).m390v(z);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: n */
    public void mo385n() {
        super.mo385n();
        this.f814R = true;
        int iM395J = m395J();
        for (int i = 0; i < iM395J; i++) {
            m394I(i).mo385n();
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: s */
    public void mo388s() {
        super.mo388s();
        this.f814R = false;
        int iM395J = m395J();
        for (int i = 0; i < iM395J; i++) {
            m394I(i).mo388s();
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: w */
    public void mo360w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0108a.class)) {
            super.mo360w(parcelable);
            return;
        }
        C0108a c0108a = (C0108a) parcelable;
        this.f815S = c0108a.f816b;
        super.mo360w(c0108a.getSuperState());
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: x */
    public Parcelable mo361x() {
        return new C0108a(super.mo361x(), this.f815S);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f810N = new C0320h<>();
        new Handler();
        this.f812P = true;
        this.f813Q = 0;
        this.f814R = false;
        this.f815S = Integer.MAX_VALUE;
        this.f811O = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3300i, i, i2);
        this.f812P = C0369g.m1475b(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            m397L(typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
