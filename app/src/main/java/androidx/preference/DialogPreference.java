package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.didjdk.adbhelper.R;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p056m.p057b.AbstractC0483r;
import p006b.p056m.p057b.C0451a;
import p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c;
import p006b.p067s.AbstractC0528f;
import p006b.p067s.C0523a;
import p006b.p067s.C0525c;
import p006b.p067s.C0526d;
import p006b.p067s.C0532j;
import p006b.p067s.C0536n;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: N */
    public CharSequence f745N;

    /* JADX INFO: renamed from: O */
    public CharSequence f746O;

    /* JADX INFO: renamed from: P */
    public Drawable f747P;

    /* JADX INFO: renamed from: Q */
    public CharSequence f748Q;

    /* JADX INFO: renamed from: R */
    public CharSequence f749R;

    /* JADX INFO: renamed from: S */
    public int f750S;

    /* JADX INFO: renamed from: androidx.preference.DialogPreference$a */
    public interface InterfaceC0095a {
        /* JADX INFO: renamed from: b */
        <T extends Preference> T mo355b(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0369g.m1474a(context, R.attr.fk, android.R.attr.dialogPreferenceStyle), 0);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: q */
    public void mo354q() {
        DialogInterfaceOnCancelListenerC0455c c0526d;
        C0532j.a aVar = this.f784c.f3283i;
        if (aVar != null) {
            AbstractC0528f abstractC0528f = (AbstractC0528f) aVar;
            if (!(abstractC0528f.m303h() instanceof AbstractC0528f.d ? ((AbstractC0528f.d) abstractC0528f.m303h()).m1928a(abstractC0528f, this) : false) && abstractC0528f.m323r().m1808H("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    String str = this.f793l;
                    c0526d = new C0523a();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", str);
                    c0526d.m332v0(bundle);
                } else if (this instanceof ListPreference) {
                    String str2 = this.f793l;
                    c0526d = new C0525c();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", str2);
                    c0526d.m332v0(bundle2);
                } else {
                    if (!(this instanceof MultiSelectListPreference)) {
                        StringBuilder sbM2191e = a.m2191e("Cannot display dialog for an unknown Preference type: ");
                        sbM2191e.append(getClass().getSimpleName());
                        sbM2191e.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                        throw new IllegalArgumentException(sbM2191e.toString());
                    }
                    String str3 = this.f793l;
                    c0526d = new C0526d();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", str3);
                    c0526d.m332v0(bundle3);
                }
                c0526d.m267C0(abstractC0528f, 0);
                AbstractC0483r abstractC0483rM323r = abstractC0528f.m323r();
                c0526d.f2985h0 = false;
                c0526d.f2986i0 = true;
                C0451a c0451a = new C0451a(abstractC0483rM323r);
                c0451a.mo1715e(0, c0526d, "androidx.preference.PreferenceFragment.DIALOG", 1);
                c0451a.mo1713c();
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3294c, i, i2);
        String strM1480g = C0369g.m1480g(typedArrayObtainStyledAttributes, 9, 0);
        this.f745N = strM1480g;
        if (strM1480g == null) {
            this.f745N = this.f789h;
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        this.f746O = string == null ? typedArrayObtainStyledAttributes.getString(1) : string;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f747P = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string2 = typedArrayObtainStyledAttributes.getString(11);
        this.f748Q = string2 == null ? typedArrayObtainStyledAttributes.getString(3) : string2;
        String string3 = typedArrayObtainStyledAttributes.getString(10);
        this.f749R = string3 == null ? typedArrayObtainStyledAttributes.getString(4) : string3;
        this.f750S = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
