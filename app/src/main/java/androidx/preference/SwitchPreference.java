package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.C0534l;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: S */
    public final C0112a f835S;

    /* JADX INFO: renamed from: T */
    public CharSequence f836T;

    /* JADX INFO: renamed from: U */
    public CharSequence f837U;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreference$a */
    public class C0112a implements CompoundButton.OnCheckedChangeListener {
        public C0112a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreference.this);
            SwitchPreference.this.m402H(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iM1474a = C0369g.m1474a(context, R.attr.py, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iM1474a, 0);
        this.f835S = new C0112a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3303l, iM1474a, 0);
        m404J(C0369g.m1480g(typedArrayObtainStyledAttributes, 7, 0));
        String string = typedArrayObtainStyledAttributes.getString(6);
        m403I(string == null ? typedArrayObtainStyledAttributes.getString(1) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(9);
        this.f836T = string2 == null ? typedArrayObtainStyledAttributes.getString(3) : string2;
        mo356l();
        String string3 = typedArrayObtainStyledAttributes.getString(8);
        this.f837U = string3 == null ? typedArrayObtainStyledAttributes.getString(4) : string3;
        mo356l();
        this.f847R = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: A */
    public void mo351A(View view) {
        super.mo351A(view);
        if (((AccessibilityManager) this.f783b.getSystemService("accessibility")).isEnabled()) {
            m400M(view.findViewById(android.R.id.switch_widget));
            m405K(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final void m400M(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f843N);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f836T);
            r4.setTextOff(this.f837U);
            r4.setOnCheckedChangeListener(this.f835S);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        super.mo353p(c0534l);
        m400M(c0534l.m1944w(android.R.id.switch_widget));
        m406L(c0534l);
    }
}
