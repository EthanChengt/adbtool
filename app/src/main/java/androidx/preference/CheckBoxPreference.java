package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p067s.C0534l;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: S */
    public final C0094a f743S;

    /* JADX INFO: renamed from: androidx.preference.CheckBoxPreference$a */
    public class C0094a implements CompoundButton.OnCheckedChangeListener {
        public C0094a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(CheckBoxPreference.this);
            CheckBoxPreference.this.m402H(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iM1474a = C0369g.m1474a(context, R.attr.ck, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iM1474a, 0);
        this.f743S = new C0094a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3293b, iM1474a, 0);
        m404J(C0369g.m1480g(typedArrayObtainStyledAttributes, 5, 0));
        String string = typedArrayObtainStyledAttributes.getString(4);
        m403I(string == null ? typedArrayObtainStyledAttributes.getString(1) : string);
        this.f847R = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: A */
    public void mo351A(View view) {
        super.mo351A(view);
        if (((AccessibilityManager) this.f783b.getSystemService("accessibility")).isEnabled()) {
            m352M(view.findViewById(android.R.id.checkbox));
            m405K(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final void m352M(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f843N);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f743S);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        super.mo353p(c0534l);
        m352M(c0534l.m1944w(android.R.id.checkbox));
        m406L(c0534l);
    }
}
