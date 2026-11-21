package p080c.p126d.p127a.p128a.p130b0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.didjdk.adbhelper.R;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p008b.p010d.p011a.C0208a;
import p080c.p126d.p127a.p128a.p131c.C1182a;

/* JADX INFO: renamed from: c.d.a.a.b0.a */
/* JADX INFO: loaded from: classes.dex */
public class C1165a extends AbstractC1178n {

    /* JADX INFO: renamed from: d */
    public final TextWatcher f5589d;

    /* JADX INFO: renamed from: e */
    public final TextInputLayout.InterfaceC1381f f5590e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f5591f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f5592g;

    /* JADX INFO: renamed from: c.d.a.a.b0.a$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!(editable.length() > 0)) {
                C1165a.this.f5591f.cancel();
                C1165a.this.f5592g.start();
            } else {
                if (C1165a.this.f5627a.m3179j()) {
                    return;
                }
                C1165a.this.f5592g.cancel();
                C1165a.this.f5591f.start();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.a$b */
    public class b implements TextInputLayout.InterfaceC1381f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1381f
        /* JADX INFO: renamed from: a */
        public void mo2742a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.getText().length() > 0);
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C1165a.this.f5589d);
            editText.addTextChangedListener(C1165a.this.f5589d);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.a$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1165a.this.f5627a.getEditText().setText((CharSequence) null);
        }
    }

    public C1165a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5589d = new a();
        this.f5590e = new b();
    }

    @Override // p080c.p126d.p127a.p128a.p130b0.AbstractC1178n
    /* JADX INFO: renamed from: a */
    public void mo2741a() {
        this.f5627a.setEndIconDrawable(C0208a.m884b(this.f5628b, R.drawable.ca));
        TextInputLayout textInputLayout = this.f5627a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.b1));
        this.f5627a.setEndIconOnClickListener(new c());
        this.f5627a.m3170a(this.f5590e);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C1182a.f5665d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new C1169e(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C1182a.f5662a;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new C1168d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5591f = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f5591f.addListener(new C1166b(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new C1168d(this));
        this.f5592g = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C1167c(this));
    }
}
