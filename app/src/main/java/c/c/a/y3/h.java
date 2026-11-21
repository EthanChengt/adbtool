package c.c.a.y3;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.R;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: c.c.a.y3.h */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a */
    public final DialogInterfaceC0193i f5539a;

    /* JADX INFO: renamed from: b */
    public final TextView f5540b;

    /* JADX INFO: renamed from: c */
    public TextView f5541c;

    /* JADX INFO: renamed from: d */
    public CheckBox f5542d;

    /* JADX INFO: renamed from: e */
    public Button f5543e;

    /* JADX INFO: renamed from: f */
    public Button f5544f;

    /* JADX INFO: renamed from: g */
    public Button f5545g;

    /* JADX INFO: renamed from: c.c.a.y3.h$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.f5539a.dismiss();
        }
    }

    /* JADX INFO: renamed from: c.c.a.y3.h$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.f5539a.dismiss();
        }
    }

    public h(Context context) {
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = new DialogInterfaceC0193i.a(context).m779a();
        this.f5539a = dialogInterfaceC0193iM779a;
        dialogInterfaceC0193iM779a.getWindow().setBackgroundDrawableResource(R.color.f3);
        View viewInflate = View.inflate(context, R.layout.ay, null);
        this.f5540b = (TextView) viewInflate.findViewById(R.id.jo);
        this.f5541c = (TextView) viewInflate.findViewById(R.id.jl);
        this.f5542d = (CheckBox) viewInflate.findViewById(R.id.jj);
        this.f5543e = (Button) viewInflate.findViewById(R.id.jn);
        this.f5544f = (Button) viewInflate.findViewById(R.id.jm);
        this.f5545g = (Button) viewInflate.findViewById(R.id.jk);
        AlertController alertController = dialogInterfaceC0193iM779a.f1244d;
        alertController.f90h = viewInflate;
        alertController.f91i = 0;
        alertController.f96n = false;
    }

    /* JADX INFO: renamed from: a */
    public void m2710a(CharSequence charSequence) {
        this.f5541c.setVisibility(0);
        this.f5541c.setText(charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m2711b(String str) {
        this.f5544f.setVisibility(0);
        this.f5544f.setText(str);
        this.f5544f.setOnClickListener(new b());
    }

    /* JADX INFO: renamed from: c */
    public void m2712c(String str) {
        this.f5543e.setVisibility(0);
        this.f5543e.setText(str);
        this.f5543e.setOnClickListener(new a());
    }

    /* JADX INFO: renamed from: d */
    public void m2713d(String str, View.OnClickListener onClickListener) {
        this.f5543e.setVisibility(0);
        this.f5543e.setText(str);
        this.f5543e.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: e */
    public void m2714e(String str) {
        this.f5540b.setVisibility(0);
        this.f5540b.setText(str);
    }
}
