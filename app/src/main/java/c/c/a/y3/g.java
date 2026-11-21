package c.c.a.y3;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;

/* JADX INFO: renamed from: c.c.a.y3.g */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a */
    public Context f5531a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0193i f5532b;

    /* JADX INFO: renamed from: c */
    public TextView f5533c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.AbstractC0132g f5534d;

    /* JADX INFO: renamed from: e */
    public ImageView f5535e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f5536f;

    /* JADX INFO: renamed from: g */
    public Button f5537g;

    /* JADX INFO: renamed from: h */
    public List<d> f5538h;

    public g(Context context) {
        this.f5531a = context;
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = new DialogInterfaceC0193i.a(context).m779a();
        this.f5532b = dialogInterfaceC0193iM779a;
        dialogInterfaceC0193iM779a.getWindow().setBackgroundDrawableResource(R.color.f3);
        View viewInflate = View.inflate(this.f5531a, R.layout.aw, null);
        this.f5533c = (TextView) viewInflate.findViewById(R.id.hr);
        this.f5535e = (ImageView) viewInflate.findViewById(R.id.hg);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.hq);
        this.f5536f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f5531a));
        this.f5537g = (Button) viewInflate.findViewById(R.id.hp);
        AlertController alertController = this.f5532b.f1244d;
        alertController.f90h = viewInflate;
        alertController.f91i = 0;
        alertController.f96n = false;
        this.f5538h = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public void m2703a(String str, String str2) {
        if (str2 == null || str2.isEmpty() || str2.equals("0")) {
            return;
        }
        this.f5538h.add(new d(str, str2));
    }

    /* JADX INFO: renamed from: b */
    public void m2704b(String str) {
        this.f5538h.add(new d(str));
    }

    /* JADX INFO: renamed from: c */
    public void m2705c(String str, int i) {
        this.f5538h.add(new d(str, i));
    }

    /* JADX INFO: renamed from: d */
    public void m2706d(File file, int i) {
        this.f5535e.setVisibility(0);
        ((file == null || !file.exists()) ? ComponentCallbacks2C0616b.m2208e(this.f5531a).m2235o(Integer.valueOf(i)) : ComponentCallbacks2C0616b.m2208e(this.f5531a).m2232l().m2227y(file)).m2226x(this.f5535e);
    }

    /* JADX INFO: renamed from: e */
    public void m2707e(c.a aVar) {
        c c1148c = new c(this.f5531a, this.f5538h, aVar);
        this.f5534d = c1148c;
        this.f5536f.setAdapter(c1148c);
    }

    /* JADX INFO: renamed from: f */
    public void m2708f(String str) {
        this.f5533c.setVisibility(0);
        this.f5533c.setText(str);
    }

    /* JADX INFO: renamed from: g */
    public void m2709g() {
        this.f5532b.show();
        this.f5534d.f947a.m542b();
    }

    public g(Context context, boolean z) {
        this.f5531a = context;
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = new DialogInterfaceC0193i.a(context).m779a();
        this.f5532b = dialogInterfaceC0193iM779a;
        dialogInterfaceC0193iM779a.getWindow().setBackgroundDrawableResource(R.color.f3);
        View viewInflate = View.inflate(this.f5531a, R.layout.ax, null);
        this.f5533c = (TextView) viewInflate.findViewById(R.id.hm);
        this.f5535e = (ImageView) viewInflate.findViewById(R.id.hh);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.hl);
        this.f5536f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f5531a));
        this.f5537g = (Button) viewInflate.findViewById(R.id.hk);
        AlertController alertController = this.f5532b.f1244d;
        alertController.f90h = viewInflate;
        alertController.f91i = 0;
        alertController.f96n = false;
        ArrayList arrayList = new ArrayList();
        this.f5538h = arrayList;
        if (z) {
            c c1148c = new c(this.f5531a, arrayList);
            this.f5534d = c1148c;
            this.f5536f.setAdapter(c1148c);
        }
    }
}
