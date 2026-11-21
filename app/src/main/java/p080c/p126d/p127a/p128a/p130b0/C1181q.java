package p080c.p126d.p127a.p128a.p130b0;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.didjdk.adbhelper.R;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p008b.p010d.p011a.C0208a;

/* JADX INFO: renamed from: c.d.a.a.b0.q */
/* JADX INFO: loaded from: classes.dex */
public class C1181q extends AbstractC1178n {

    /* JADX INFO: renamed from: d */
    public final TextWatcher f5656d;

    /* JADX INFO: renamed from: e */
    public final TextInputLayout.InterfaceC1381f f5657e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout.InterfaceC1382g f5658f;

    /* JADX INFO: renamed from: c.d.a.a.b0.q$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C1181q c1181q = C1181q.this;
            c1181q.f5629c.setChecked(!C1181q.m2762d(c1181q));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.q$b */
    public class b implements TextInputLayout.InterfaceC1381f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1381f
        /* JADX INFO: renamed from: a */
        public void mo2742a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C1181q c1181q = C1181q.this;
            c1181q.f5629c.setChecked(!C1181q.m2762d(c1181q));
            editText.removeTextChangedListener(C1181q.this.f5656d);
            editText.addTextChangedListener(C1181q.this.f5656d);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.q$c */
    public class c implements TextInputLayout.InterfaceC1382g {
        public c(C1181q c1181q) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1382g
        /* JADX INFO: renamed from: a */
        public void mo2763a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.q$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C1181q.this.f5627a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(C1181q.m2762d(C1181q.this) ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    public C1181q(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5656d = new a();
        this.f5657e = new b();
        this.f5658f = new c(this);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2762d(C1181q c1181q) {
        EditText editText = c1181q.f5627a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // p080c.p126d.p127a.p128a.p130b0.AbstractC1178n
    /* JADX INFO: renamed from: a */
    public void mo2741a() {
        this.f5627a.setEndIconDrawable(C0208a.m884b(this.f5628b, R.drawable.b9));
        TextInputLayout textInputLayout = this.f5627a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.f0));
        this.f5627a.setEndIconOnClickListener(new d());
        this.f5627a.m3170a(this.f5657e);
        TextInputLayout textInputLayout2 = this.f5627a;
        textInputLayout2.f10434R.add(this.f5658f);
    }
}
