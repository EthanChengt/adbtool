package c.c.a.v3.k0;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.didjdk.adbhelper.FilePickerActivity;
import com.didjdk.adbhelper.MainActivity;
import com.didjdk.adbhelper.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p006b.p056m.p057b.ActivityC0459e;
import p006b.p067s.C0532j;
import b.s.m;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.v3.g0;
import c.c.a.y3.d;
import c.c.a.y3.g;
import c.c.a.y3.j;
import c.c.a.y3.k;

/* JADX INFO: renamed from: c.c.a.v3.k0.t */
/* JADX INFO: loaded from: classes.dex */
public class C1054t extends g0 {

    /* JADX INFO: renamed from: J0 */
    public static final /* synthetic */ int f5195J0 = 0;

    /* JADX INFO: renamed from: F0 */
    public c.c.a.y3.j f5201F0;

    /* JADX INFO: renamed from: G0 */
    public String f5202G0;

    /* JADX INFO: renamed from: H0 */
    public C1056v f5203H0;

    /* JADX INFO: renamed from: I0 */
    public k f5204I0;

    /* JADX INFO: renamed from: Y */
    public SwipeRefreshLayout f5206Y;

    /* JADX INFO: renamed from: Z */
    public RecyclerView f5207Z;

    /* JADX INFO: renamed from: a0 */
    public C1051q f5208a0;

    /* JADX INFO: renamed from: b0 */
    public String f5209b0;

    /* JADX INFO: renamed from: e0 */
    public StringBuilder f5212e0;

    /* JADX INFO: renamed from: f0 */
    public StringBuilder f5213f0;

    /* JADX INFO: renamed from: k0 */
    public q3 f5218k0;

    /* JADX INFO: renamed from: l0 */
    public q3 f5219l0;

    /* JADX INFO: renamed from: m0 */
    public q3 f5220m0;

    /* JADX INFO: renamed from: n0 */
    public Button f5221n0;

    /* JADX INFO: renamed from: o0 */
    public Button f5222o0;

    /* JADX INFO: renamed from: p0 */
    public Button f5223p0;

    /* JADX INFO: renamed from: q0 */
    public Button f5224q0;

    /* JADX INFO: renamed from: r0 */
    public LinearLayout f5225r0;

    /* JADX INFO: renamed from: s0 */
    public LinearLayout f5226s0;

    /* JADX INFO: renamed from: t0 */
    public TextView f5227t0;

    /* JADX INFO: renamed from: u0 */
    public TextView f5228u0;

    /* JADX INFO: renamed from: v0 */
    public FloatingActionButton f5229v0;

    /* JADX INFO: renamed from: z0 */
    public View f5233z0;

    /* JADX INFO: renamed from: X */
    public final List<C1056v> f5205X = new ArrayList();

    /* JADX INFO: renamed from: c0 */
    public boolean f5210c0 = false;

    /* JADX INFO: renamed from: d0 */
    public String f5211d0 = "/sdcard";

    /* JADX INFO: renamed from: g0 */
    public final String f5214g0 = a.q();

    /* JADX INFO: renamed from: h0 */
    public final String f5215h0 = a.q();

    /* JADX INFO: renamed from: i0 */
    public final String f5216i0 = a.q();

    /* JADX INFO: renamed from: j0 */
    public final String f5217j0 = a.q();

    /* JADX INFO: renamed from: w0 */
    public boolean f5230w0 = false;

    /* JADX INFO: renamed from: x0 */
    public boolean f5231x0 = true;

    /* JADX INFO: renamed from: y0 */
    public int[] f5232y0 = {0, 1, -1, -1, -1};

    /* JADX INFO: renamed from: A0 */
    public int f5196A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f5197B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public int f5198C0 = 0;

    /* JADX INFO: renamed from: D0 */
    public List<String> f5199D0 = new ArrayList();

    /* JADX INFO: renamed from: E0 */
    public int f5200E0 = 0;

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C1054t c1054t = C1054t.this;
            int i = C1054t.f5195J0;
            c1054t.m2670M0(message);
            return false;
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$b */
    public class b implements Comparator<C1056v> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collator f5235b;

        public b(C1054t c1054t, Collator collator) {
            this.f5235b = collator;
        }

        @Override // java.util.Comparator
        public int compare(C1056v c1056v, C1056v c1056v2) {
            return this.f5235b.getCollationKey(c1056v.f5254i).compareTo(this.f5235b.getCollationKey(c1056v2.f5254i));
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$c */
    public class c implements Comparator<C1056v> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5236b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f5237c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Collator f5238d;

        public c(C1054t c1054t, int i, int i2, Collator collator) {
            this.f5236b = i;
            this.f5237c = i2;
            this.f5238d = collator;
        }

        @Override // java.util.Comparator
        public int compare(C1056v c1056v, C1056v c1056v2) {
            int i;
            CollationKey collationKey;
            Collator collator;
            String str;
            int iCompareTo;
            C1056v c1056v3 = c1056v;
            C1056v c1056v4 = c1056v2;
            int i2 = this.f5236b;
            if (i2 == 1) {
                i = this.f5237c;
                collationKey = this.f5238d.getCollationKey(c1056v3.f5254i);
                collator = this.f5238d;
                str = c1056v4.f5254i;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i = this.f5237c;
                        collationKey = this.f5238d.getCollationKey(c1056v3.f5252g + c1056v3.f5253h);
                        collator = this.f5238d;
                        str = c1056v4.f5252g + c1056v4.f5253h;
                    } else {
                        if (i2 != 4) {
                            return 0;
                        }
                        Float fValueOf = Float.valueOf(c1056v3.f5255j);
                        Float fValueOf2 = Float.valueOf(c1056v4.f5255j);
                        i = this.f5237c;
                        iCompareTo = fValueOf.compareTo(fValueOf2);
                    }
                    return iCompareTo * i;
                }
                i = this.f5237c;
                collationKey = this.f5238d.getCollationKey(c1056v3.f5259n);
                collator = this.f5238d;
                str = c1056v4.f5259n;
            }
            iCompareTo = collationKey.compareTo(collator.getCollationKey(str));
            return iCompareTo * i;
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$d */
    public class d implements Comparator<C1056v> {
        public d(C1054t c1054t) {
        }

        @Override // java.util.Comparator
        public int compare(C1056v c1056v, C1056v c1056v2) {
            return Integer.valueOf(c1056v.f5247b).compareTo(Integer.valueOf(c1056v2.f5247b));
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1054t c1054t = C1054t.this;
            g c1152g = new g(c1054t.m303h());
            c1152g.m2705c(c1054t.m303h().getString(R.string.bd), R.drawable.cv);
            c1152g.m2705c(c1054t.m303h().getString(R.string.bc), R.drawable.d7);
            c1152g.m2705c(c1054t.m303h().getString(R.string.hq), R.drawable.da);
            c1152g.f5538h.add(new d(c1054t.m303h().getString(R.string.f1), R.drawable.cu, c1054t.f5199D0.size() != 0));
            c1152g.m2707e(new C1052r(c1054t, c1152g));
            c1152g.m2709g();
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$f */
    public class f implements SwipeRefreshLayout.InterfaceC0166h {
        public f() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0166h
        /* JADX INFO: renamed from: a */
        public void mo726a() {
            C1054t c1054t = C1054t.this;
            int i = C1054t.f5195J0;
            c1054t.m2672O0();
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$g */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1054t c1054t = C1054t.this;
            Iterator<C1056v> it = c1054t.f5205X.iterator();
            while (it.hasNext()) {
                it.next().f5263r = true;
            }
            c1054t.f5196A0 = c1054t.f5205X.size();
            c1054t.f5228u0.setText(c1054t.m337y(R.string.gi) + c1054t.f5196A0 + c1054t.m337y(R.string.cu));
            c1054t.f5208a0.f947a.m542b();
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$h */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1054t c1054t = C1054t.this;
            for (C1056v c1056v : c1054t.f5205X) {
                c1056v.f5263r = !c1056v.f5263r;
            }
            c1054t.f5196A0 = c1054t.f5205X.size() - c1054t.f5196A0;
            c1054t.f5228u0.setText(c1054t.m337y(R.string.gi) + c1054t.f5196A0 + c1054t.m337y(R.string.cu));
            c1054t.f5208a0.f947a.m542b();
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$i */
    public class i implements C1051q.a {
        public i() {
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$j */
    public class j implements Handler.Callback {
        public j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C1054t c1054t = C1054t.this;
            c1054t.f5212e0.append((String) message.obj);
            String string = c1054t.f5212e0.toString();
            StringBuilder sbM2191e = a.m2191e("echo ");
            sbM2191e.append(c1054t.f5217j0);
            if (string.replace(sbM2191e.toString(), "").contains(c1054t.f5217j0)) {
                if (c1054t.f5212e0.toString().contains("Unknown option '-L'")) {
                    c1054t.f5210c0 = true;
                    StringBuilder sb = c1054t.f5212e0;
                    sb.delete(0, sb.length());
                    c1054t.m2672O0();
                } else {
                    String[] strArrSplit = c1054t.f5212e0.toString().split("\n");
                    StringBuilder sb2 = c1054t.f5212e0;
                    sb2.delete(0, sb2.length());
                    for (int i = 0; i < strArrSplit.length; i++) {
                        strArrSplit[i] = strArrSplit[i].trim();
                    }
                    c1054t.f5205X.clear();
                    for (String str : strArrSplit) {
                        try {
                            C1056v c1056v = new C1056v(str, c1054t.f5211d0, c1054t.f5210c0);
                            if (c1056v.f5262q) {
                                c1054t.f5205X.add(c1056v);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    c1054t.m2675R0(false);
                }
            }
            return false;
        }
    }

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: I0 */
    public void mo2641I0() {
        super.mo2641I0();
        this.f5202G0 = m303h().getCacheDir() + "/tmp/";
        this.f5206Y.setRefreshing(true);
        this.f5231x0 = C0532j.m1940a(m303h()).getBoolean("show_hide_files", false);
        this.f5212e0 = new StringBuilder();
        this.f5213f0 = new StringBuilder();
        q3 runnableC0964q3 = new q3(m303h());
        this.f5218k0 = runnableC0964q3;
        runnableC0964q3.f4886h = true;
        runnableC0964q3.f4888j = new Handler(new j());
        this.f5218k0.m2627c(this.f4967W + "shell");
        new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.k0.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f5169b.f5218k0.m2627c("");
            }
        }, m2646G0().f6463s);
        new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.k0.e
            @Override // java.lang.Runnable
            public final void run() {
                C1054t c1054t = this.f5166b;
                int i2 = C1054t.f5195J0;
                c1054t.m2672O0();
            }
        }, m2646G0().f6463s * 2);
        q3 runnableC0964q4 = new q3(m303h());
        this.f5219l0 = runnableC0964q4;
        runnableC0964q4.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.v3.k0.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                this.f5173a.m2670M0(message);
                return false;
            }
        });
        q3 runnableC0964q5 = new q3(m303h());
        this.f5220m0 = runnableC0964q5;
        runnableC0964q5.f4886h = true;
        runnableC0964q5.m2627c(this.f4967W + "shell");
        new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.k0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f5165b.f5220m0.m2627c("");
            }
        }, m2646G0().f6463s);
        this.f5220m0.f4888j = new Handler(new a());
    }

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: J0 */
    public void mo2648J0() {
        if (this.f5230w0) {
            m2673P0(false);
        } else if (this.f5211d0.isEmpty()) {
            ((MainActivity) m303h()).x();
        } else {
            m2671N0();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m2668K0() {
        this.f5199D0.clear();
        for (C1056v c1056v : this.f5205X) {
            if (c1056v.f5263r) {
                this.f5199D0.add(c1056v.f5257l);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m2669L0(C1056v c1056v) {
        int i2;
        if (c1056v.f5263r) {
            c1056v.f5263r = false;
            i2 = this.f5196A0 - 1;
        } else {
            c1056v.f5263r = true;
            i2 = this.f5196A0 + 1;
        }
        this.f5196A0 = i2;
        this.f5228u0.setText(m337y(R.string.gi) + this.f5196A0 + m337y(R.string.cu));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2670M0(Message message) {
        ActivityC0459e activityC0459eM303h;
        String strM337y;
        this.f5213f0.append((String) message.obj);
        String string = this.f5213f0.toString();
        StringBuilder sbM2191e = a.m2191e("echo $?");
        sbM2191e.append(this.f5214g0);
        if (string.replace(sbM2191e.toString(), "").contains(this.f5214g0)) {
            String string2 = this.f5213f0.toString();
            StringBuilder sbM2191e2 = a.m2191e("echo $?");
            sbM2191e2.append(this.f5214g0);
            for (String str : string2.replace(sbM2191e2.toString(), "").split("\n")) {
                if (str.contains(this.f5214g0)) {
                    if (!a.m2195i(a.m2191e("0"), this.f5214g0, str)) {
                        this.f5198C0++;
                    }
                    this.f5197B0--;
                    this.f5201F0.m2715a(m337y(R.string.ft) + this.f5197B0 + m337y(R.string.cu));
                }
            }
            if (this.f5197B0 <= 0) {
                this.f5201F0.f5549a.dismiss();
                m2672O0();
                if (this.f5198C0 > 0) {
                    m.m1952H(m303h(), this.f5198C0 + m337y(R.string.c3));
                    this.f5198C0 = 0;
                }
            }
        }
        String string3 = this.f5213f0.toString();
        StringBuilder sbM2191e3 = a.m2191e("echo $?");
        sbM2191e3.append(this.f5215h0);
        if (string3.replace(sbM2191e3.toString(), "").contains(this.f5215h0)) {
            if (a.m2195i(a.m2191e("0"), this.f5215h0, this.f5213f0.toString())) {
                activityC0459eM303h = m303h();
                strM337y = m337y(R.string.ep);
            } else {
                activityC0459eM303h = m303h();
                strM337y = m337y(R.string.en);
            }
            m.m1952H(activityC0459eM303h, strM337y);
            m2672O0();
            StringBuilder sb = this.f5213f0;
            sb.delete(0, sb.length());
        }
        String string4 = this.f5213f0.toString();
        StringBuilder sbM2191e4 = a.m2191e("echo $?");
        sbM2191e4.append(this.f5216i0);
        if (string4.replace(sbM2191e4.toString(), "").contains(this.f5216i0)) {
            String string5 = this.f5213f0.toString();
            StringBuilder sbM2191e5 = a.m2191e("echo $?");
            sbM2191e5.append(this.f5216i0);
            if (a.m2195i(a.m2191e("0"), this.f5216i0, string5.replace(sbM2191e5.toString(), ""))) {
                this.f5204I0.f5553a.dismiss();
                if (new File(this.f5202G0 + this.f5203H0.f5254i).exists()) {
                    File cacheDir = m303h().getCacheDir();
                    StringBuilder sbM2191e6 = a.m2191e("tmp/");
                    sbM2191e6.append(this.f5203H0.f5254i);
                    Uri uriMo197b = FileProvider.m194a(m303h(), "com.didjdk.adbhelper.fileprovider").mo197b(new File(cacheDir, sbM2191e6.toString()));
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriMo197b, this.f5203H0.f5261p);
                    intent.addFlags(1);
                    m303h().startActivity(intent);
                }
            } else {
                m.m1952H(m303h(), m337y(R.string.en));
            }
            StringBuilder sb2 = this.f5213f0;
            sb2.delete(0, sb2.length());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m2671N0() {
        if (this.f5211d0.isEmpty()) {
            return;
        }
        String str = this.f5211d0;
        this.f5211d0 = str.substring(0, str.lastIndexOf("/"));
        m2672O0();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public void mo282O(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.i, menu);
        menuInflater.inflate(R.menu.j, menu);
        menu.findItem(R.id.j2).setChecked(this.f5231x0);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m2672O0() {
        this.f5206Y.setRefreshing(true);
        String strM2201o = !this.f5210c0 ? "-lL" : "-l";
        if (this.f5231x0) {
            strM2201o = a.m2201o(strM2201o, "a");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ls ");
        sb.append(strM2201o);
        sb.append(" ");
        this.f5209b0 = a.m2203q(sb, this.f5211d0, "/");
        q3 runnableC0964q3 = this.f5218k0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5209b0);
        sb2.append(";echo ");
        a.m2193g(sb2, this.f5217j0, runnableC0964q3);
        this.f5227t0.setText(this.f5211d0.replace("\\", "") + "/");
        if (this.f5211d0.isEmpty()) {
            this.f5221n0.setVisibility(8);
            this.f5224q0.setVisibility(0);
        } else {
            this.f5221n0.setVisibility(0);
            this.f5224q0.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5233z0 = layoutInflater.inflate(R.layout.b_, viewGroup, false);
        FloatingActionButton floatingActionButton = ((MainActivity) m303h()).f6454F;
        this.f5229v0 = floatingActionButton;
        floatingActionButton.setOnClickListener(new e());
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f5233z0.findViewById(R.id.lt);
        this.f5206Y = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new f());
        this.f5225r0 = (LinearLayout) this.f5233z0.findViewById(R.id.ig);
        this.f5226s0 = (LinearLayout) this.f5233z0.findViewById(R.id.ih);
        this.f5228u0 = (TextView) this.f5233z0.findViewById(R.id.qu);
        TextView textView = (TextView) this.f5233z0.findViewById(R.id.qr);
        this.f5227t0 = textView;
        textView.setText(this.f5211d0);
        this.f5233z0.findViewById(R.id.f7).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5174b.mo2648J0();
            }
        });
        Button button = (Button) this.f5233z0.findViewById(R.id.c2);
        this.f5221n0 = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5167b.m2671N0();
            }
        });
        Button button2 = (Button) this.f5233z0.findViewById(R.id.bx);
        this.f5224q0 = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1054t c1054t = this.f5170b;
                c1054t.f5211d0 = "/sdcard";
                c1054t.m2672O0();
            }
        });
        this.f5224q0.setVisibility(8);
        Button button3 = (Button) this.f5233z0.findViewById(R.id.c0);
        this.f5222o0 = button3;
        button3.setOnClickListener(new g());
        Button button4 = (Button) this.f5233z0.findViewById(R.id.c1);
        this.f5223p0 = button4;
        button4.setOnClickListener(new h());
        m303h().findViewById(R.id.br).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC0459e activityC0459eM303h;
                String strM337y;
                C1054t c1054t = this.f5171b;
                int i2 = c1054t.f5196A0;
                if (i2 < 1) {
                    activityC0459eM303h = c1054t.m303h();
                    strM337y = c1054t.m337y(R.string.ec);
                } else {
                    if (i2 <= 5 || m.J(c1054t.m303h())) {
                        Intent intent = new Intent(c1054t.m303h(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra("picker_mode", 1);
                        c1054t.m273F0(intent, 2);
                        return;
                    }
                    activityC0459eM303h = c1054t.m303h();
                    strM337y = "未解锁高级功能最多选择5项";
                }
                m.m1952H(activityC0459eM303h, strM337y);
            }
        });
        m303h().findViewById(R.id.bp).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC0459e activityC0459eM303h;
                String strM337y;
                C1054t c1054t = this.f5172b;
                int i2 = c1054t.f5196A0;
                if (i2 < 1) {
                    activityC0459eM303h = c1054t.m303h();
                    strM337y = c1054t.m337y(R.string.ec);
                } else {
                    if (i2 <= 5 || m.J(c1054t.m303h())) {
                        c1054t.m2668K0();
                        c1054t.f5200E0 = 0;
                        m.m1952H(c1054t.m303h(), c1054t.m337y(R.string.g9));
                        c1054t.m2673P0(false);
                        return;
                    }
                    activityC0459eM303h = c1054t.m303h();
                    strM337y = "未解锁高级功能最多选择5项";
                }
                m.m1952H(activityC0459eM303h, strM337y);
            }
        });
        m303h().findViewById(R.id.bq).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC0459e activityC0459eM303h;
                String strM337y;
                C1054t c1054t = this.f5168b;
                int i2 = c1054t.f5196A0;
                if (i2 < 1) {
                    activityC0459eM303h = c1054t.m303h();
                    strM337y = c1054t.m337y(R.string.ec);
                } else {
                    if (i2 <= 5 || m.J(c1054t.m303h())) {
                        c1054t.m2668K0();
                        c1054t.f5200E0 = 1;
                        m.m1952H(c1054t.m303h(), c1054t.m337y(R.string.g9));
                        c1054t.m2673P0(false);
                        return;
                    }
                    activityC0459eM303h = c1054t.m303h();
                    strM337y = "未解锁高级功能最多选择5项";
                }
                m.m1952H(activityC0459eM303h, strM337y);
            }
        });
        m303h().findViewById(R.id.bs).setOnClickListener(new ViewOnClickListenerC1055u(this));
        this.f5207Z = (RecyclerView) this.f5233z0.findViewById(R.id.lr);
        this.f5207Z.setLayoutManager(new LinearLayoutManager(m303h()));
        C1051q c1051q = new C1051q(this.f5205X, new i());
        this.f5208a0 = c1051q;
        this.f5207Z.setAdapter(c1051q);
        m334w0(true);
        this.f5231x0 = C0532j.m1940a(m303h()).getBoolean("show_hide_files", false);
        m2646G0().f6456H.f4837a.set(3, this);
        if (m2646G0().f6470z == 3) {
            mo2641I0();
        }
        return this.f5233z0;
    }

    /* JADX INFO: renamed from: P0 */
    public void m2673P0(boolean z) {
        this.f5230w0 = z;
        C1051q c1051q = this.f5208a0;
        c1051q.f5183e = z;
        c1051q.f947a.m542b();
        m2674Q0(z, m2646G0().f6455G, m2646G0().f6454F);
        if (this.f5230w0) {
            this.f5226s0.setVisibility(0);
            this.f5225r0.setVisibility(8);
            this.f5206Y.setEnabled(false);
            return;
        }
        Iterator<C1056v> it = this.f5205X.iterator();
        while (it.hasNext()) {
            it.next().f5263r = false;
        }
        Iterator<C1056v> it2 = this.f5205X.iterator();
        while (it2.hasNext()) {
            it2.next().f5263r = false;
        }
        this.f5196A0 = 0;
        this.f5226s0.setVisibility(8);
        this.f5225r0.setVisibility(0);
        this.f5206Y.setEnabled(true);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m2674Q0(boolean z, View view, View view2) {
        if (this.f5230w0 && z) {
            view.setVisibility(0);
            view2.setVisibility(8);
        } else {
            view.setVisibility(8);
            view2.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m2675R0(boolean z) {
        Collator collator = Collator.getInstance(Locale.CHINA);
        Collections.sort(this.f5205X, new b(this, collator));
        int[] iArr = this.f5232y0;
        int i2 = iArr[0];
        int i3 = iArr[i2];
        if (z) {
            int[] iArr2 = new int[5];
            iArr2[0] = i2;
            iArr2[1] = -1;
            iArr2[2] = -1;
            iArr2[3] = -1;
            iArr2[4] = -1;
            this.f5232y0 = iArr2;
            iArr2[i2] = -i3;
        }
        Collections.sort(this.f5205X, new c(this, i2, this.f5232y0[i2], collator));
        Collections.sort(this.f5205X, new d(this));
        this.f5208a0.f947a.m542b();
        this.f5207Z.scrollToPosition(0);
        this.f5206Y.setRefreshing(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Y */
    public boolean mo292Y(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.b_) {
            switch (menuItem.getItemId()) {
                case R.id.j2 /* 2131296617 */:
                    if (menuItem.isChecked()) {
                        this.f5231x0 = false;
                        menuItem.setChecked(false);
                    } else {
                        this.f5231x0 = true;
                        menuItem.setChecked(true);
                    }
                    m2672O0();
                    break;
                case R.id.j3 /* 2131296618 */:
                    this.f5232y0[0] = 1;
                    this.f5206Y.setRefreshing(true);
                    m2675R0(true);
                    break;
                case R.id.j4 /* 2131296619 */:
                    this.f5232y0[0] = 4;
                    this.f5206Y.setRefreshing(true);
                    m2675R0(true);
                    break;
                case R.id.j5 /* 2131296620 */:
                    this.f5232y0[0] = 3;
                    this.f5206Y.setRefreshing(true);
                    m2675R0(true);
                    break;
                case R.id.j6 /* 2131296621 */:
                    this.f5232y0[0] = 2;
                    this.f5206Y.setRefreshing(true);
                    m2675R0(true);
                    break;
            }
        }
        return true;
    }
}
