package c.c.a.y3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Timer;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import c.c.a.x3.d;

/* JADX INFO: renamed from: c.c.a.y3.e */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a */
    public Context f5517a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0193i f5518b;

    /* JADX INFO: renamed from: c */
    public final TextView f5519c;

    /* JADX INFO: renamed from: d */
    public TextView f5520d;

    /* JADX INFO: renamed from: e */
    public TextInputLayout f5521e;

    /* JADX INFO: renamed from: f */
    public TextInputLayout f5522f;

    /* JADX INFO: renamed from: g */
    public EditText f5523g;

    /* JADX INFO: renamed from: h */
    public EditText f5524h;

    /* JADX INFO: renamed from: i */
    public Button f5525i;

    /* JADX INFO: renamed from: j */
    public Button f5526j;

    /* JADX INFO: renamed from: c.c.a.y3.e$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f5527b;

        public a(e c1150e, Context context) {
            this.f5527b = context;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Activity activity = (Activity) this.f5527b;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (!inputMethodManager.isActive() || activity.getCurrentFocus().getWindowToken() == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 2);
        }
    }

    /* JADX INFO: renamed from: c.c.a.y3.e$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.f5518b.dismiss();
        }
    }

    /* JADX INFO: renamed from: c.c.a.y3.e$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.f5518b.dismiss();
        }
    }

    public e(Context context) {
        this.f5517a = context;
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = new DialogInterfaceC0193i.a(context).m779a();
        this.f5518b = dialogInterfaceC0193iM779a;
        dialogInterfaceC0193iM779a.getWindow().setBackgroundDrawableResource(R.color.f3);
        View viewInflate = View.inflate(context, R.layout.au, null);
        this.f5519c = (TextView) viewInflate.findViewById(R.id.e_);
        this.f5520d = (TextView) viewInflate.findViewById(R.id.e5);
        this.f5521e = (TextInputLayout) viewInflate.findViewById(R.id.e8);
        this.f5522f = (TextInputLayout) viewInflate.findViewById(R.id.e9);
        this.f5523g = (EditText) viewInflate.findViewById(R.id.e3);
        this.f5524h = (EditText) viewInflate.findViewById(R.id.e4);
        this.f5525i = (Button) viewInflate.findViewById(R.id.e7);
        this.f5526j = (Button) viewInflate.findViewById(R.id.e6);
        AlertController alertController = dialogInterfaceC0193iM779a.f1244d;
        alertController.f90h = viewInflate;
        alertController.f91i = 0;
        alertController.f96n = false;
        dialogInterfaceC0193iM779a.setOnDismissListener(new a(this, context));
    }

    /* JADX INFO: renamed from: a */
    public String m2698a() {
        return this.f5523g.getText().toString();
    }

    /* JADX INFO: renamed from: b */
    public void m2699b(String str) {
        this.f5526j.setVisibility(0);
        this.f5526j.setText(str);
        this.f5526j.setOnClickListener(new c());
    }

    /* JADX INFO: renamed from: c */
    public void m2700c(String str) {
        this.f5525i.setVisibility(0);
        this.f5525i.setText(str);
        this.f5525i.setOnClickListener(new b());
    }

    /* JADX INFO: renamed from: d */
    public void m2701d(String str) {
        this.f5519c.setVisibility(0);
        this.f5519c.setText(str);
    }

    /* JADX INFO: renamed from: e */
    public void m2702e() {
        new Timer().schedule(new d(this.f5517a, this.f5523g), 200L);
        this.f5518b.show();
    }
}
