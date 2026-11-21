package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.C0534l;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: S */
    public final C0113a f839S;

    /* JADX INFO: renamed from: T */
    public CharSequence f840T;

    /* JADX INFO: renamed from: U */
    public CharSequence f841U;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreferenceCompat$a */
    public class C0113a implements CompoundButton.OnCheckedChangeListener {
        public C0113a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreferenceCompat.this);
            SwitchPreferenceCompat.this.m402H(z);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.px, 0);
        this.f839S = new C0113a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3304m, R.attr.px, 0);
        m404J(C0369g.m1480g(typedArrayObtainStyledAttributes, 7, 0));
        String string = typedArrayObtainStyledAttributes.getString(6);
        m403I(string == null ? typedArrayObtainStyledAttributes.getString(1) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(9);
        this.f840T = string2 == null ? typedArrayObtainStyledAttributes.getString(3) : string2;
        mo356l();
        String string3 = typedArrayObtainStyledAttributes.getString(8);
        this.f841U = string3 == null ? typedArrayObtainStyledAttributes.getString(4) : string3;
        mo356l();
        this.f847R = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: A */
    public void mo351A(View view) {
        super.mo351A(view);
        if (((AccessibilityManager) this.f783b.getSystemService("accessibility")).isEnabled()) {
            m401M(view.findViewById(R.id.np));
            m405K(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final void m401M(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f843N);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f840T);
            switchCompat.setTextOff(this.f841U);
            switchCompat.setOnCheckedChangeListener(this.f839S);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        super.mo353p(c0534l);
        m401M(c0534l.m1944w(R.id.np));
        m406L(c0534l);
    }
}
