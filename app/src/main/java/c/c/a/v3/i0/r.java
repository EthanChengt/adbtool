package c.c.a.v3.i0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Objects;
import b.s.m;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.v3.g0;
import c.c.a.y3.c;
import c.c.a.y3.g;
import c.c.a.y3.h;
import c.c.a.y3.j;

/* JADX INFO: renamed from: c.c.a.v3.i0.r */
/* JADX INFO: loaded from: classes.dex */
public class r extends g0 {

    /* JADX INFO: renamed from: z0 */
    public static final /* synthetic */ int f5049z0 = 0;

    /* JADX INFO: renamed from: Z */
    public View f5052Z;

    /* JADX INFO: renamed from: a0 */
    public RecyclerView f5053a0;

    /* JADX INFO: renamed from: b0 */
    public C1021p f5054b0;

    /* JADX INFO: renamed from: c0 */
    public FloatingActionButton f5055c0;

    /* JADX INFO: renamed from: d0 */
    public j f5056d0;

    /* JADX INFO: renamed from: e0 */
    public h f5057e0;

    /* JADX INFO: renamed from: f0 */
    public ProgressBar f5058f0;

    /* JADX INFO: renamed from: g0 */
    public ProgressBar f5059g0;

    /* JADX INFO: renamed from: h0 */
    public int f5060h0;

    /* JADX INFO: renamed from: j0 */
    public q3 f5062j0;

    /* JADX INFO: renamed from: k0 */
    public StringBuilder f5063k0;

    /* JADX INFO: renamed from: l0 */
    public C1027v f5064l0;

    /* JADX INFO: renamed from: w0 */
    public int f5075w0;

    /* JADX INFO: renamed from: x0 */
    public Menu f5076x0;

    /* JADX INFO: renamed from: y0 */
    public q f5077y0;

    /* JADX INFO: renamed from: X */
    public ArrayList<C1027v> f5050X = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    public ArrayList<C1027v> f5051Y = new ArrayList<>();

    /* JADX INFO: renamed from: i0 */
    public final boolean[] f5061i0 = {true, true, true, true};

    /* JADX INFO: renamed from: m0 */
    public final String f5065m0 = a.q();

    /* JADX INFO: renamed from: n0 */
    public final String f5066n0 = a.q();

    /* JADX INFO: renamed from: o0 */
    public final String f5067o0 = a.q();

    /* JADX INFO: renamed from: p0 */
    public final String f5068p0 = a.q();

    /* JADX INFO: renamed from: q0 */
    public final String f5069q0 = a.q();

    /* JADX INFO: renamed from: r0 */
    public final String f5070r0 = a.q();

    /* JADX INFO: renamed from: s0 */
    public final String f5071s0 = a.q();

    /* JADX INFO: renamed from: t0 */
    public final String f5072t0 = a.q();

    /* JADX INFO: renamed from: u0 */
    public final String f5073u0 = a.q();

    /* JADX INFO: renamed from: v0 */
    public final String[] f5074v0 = new String[2];

    /* JADX INFO: renamed from: c.c.a.v3.i0.r$a */
    public class a implements C1021p.a {
        public a() {
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.i0.r$b */
    public class b implements MenuItem.OnActionExpandListener {
        public b() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            Menu menu = r.this.f5076x0;
            if (menu != null) {
                menu.findItem(R.id.il).setVisible(true);
                r.this.f5076x0.findItem(R.id.ik).setVisible(true);
            }
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return true;
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.i0.r$c */
    public class c implements SearchView.InterfaceC0051m {
        public c() {
        }
    }

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: I0 */
    public void mo2641I0() {
        super.mo2641I0();
        if (this.f5077y0 == null) {
            this.f5077y0 = new q(this);
        }
        this.f5063k0 = new StringBuilder();
        q3 runnableC0964q3 = new q3(m303h());
        this.f5062j0 = runnableC0964q3;
        runnableC0964q3.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.v3.i0.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                final r c1023r = this.f5016a;
                c1023r.f5063k0.append((String) message.obj);
                if (c1023r.f5063k0.toString().contains(c1023r.f5065m0)) {
                    j c1155j = c1023r.f5056d0;
                    if (c1155j != null) {
                        c1155j.f5549a.dismiss();
                    }
                    if (a.m2195i(a.m2191e("0"), c1023r.f5065m0, c1023r.f5063k0.toString())) {
                        m.m1952H(c1023r.m303h(), c1023r.m337y(R.string.ep));
                    } else {
                        c1023r.m2657M0(c1023r.m337y(R.string.c1), a.m2189c(a.m2191e("\\d*"), c1023r.f5065m0, c1023r.f5063k0.toString(), ""), null);
                    }
                    StringBuilder sb = c1023r.f5063k0;
                    sb.delete(0, sb.length());
                }
                if (c1023r.f5063k0.toString().contains(c1023r.f5068p0)) {
                    j c1155j2 = c1023r.f5056d0;
                    if (c1155j2 != null) {
                        c1155j2.f5549a.dismiss();
                    }
                    if (c1023r.m2646G0().f6466v && c1023r.m2647H0().f6475b != null) {
                        c1023r.f5075w0 = 0;
                        c1023r.m2647H0().f6475b.l = false;
                    }
                    if (c1023r.f5063k0.toString().contains("Success")) {
                        m.m1952H(c1023r.m303h(), c1023r.m337y(R.string.cp));
                    } else {
                        c1023r.m2657M0(c1023r.m337y(R.string.c1), a.m2189c(a.m2191e("\\d*"), c1023r.f5068p0, c1023r.f5063k0.toString(), ""), null);
                    }
                    StringBuilder sb2 = c1023r.f5063k0;
                    sb2.delete(0, sb2.length());
                }
                if (c1023r.f5063k0.toString().contains(c1023r.f5069q0)) {
                    j c1155j3 = c1023r.f5056d0;
                    if (c1155j3 != null) {
                        c1155j3.f5549a.dismiss();
                    }
                    if (c1023r.f5063k0.toString().contains("Success")) {
                        c1023r.f5050X.remove(c1023r.f5064l0);
                        c1023r.f5051Y.remove(c1023r.f5064l0);
                        c1023r.f5054b0.f947a.m542b();
                        m.m1952H(c1023r.m303h(), c1023r.m337y(R.string.ho));
                    } else {
                        c1023r.m2657M0(c1023r.m337y(R.string.c1), a.m2189c(a.m2191e("\\d*"), c1023r.f5069q0, c1023r.f5063k0.toString(), ""), null);
                    }
                    StringBuilder sb3 = c1023r.f5063k0;
                    sb3.delete(0, sb3.length());
                }
                if (c1023r.f5063k0.toString().contains(c1023r.f5066n0)) {
                    j c1155j4 = c1023r.f5056d0;
                    if (c1155j4 != null) {
                        c1155j4.f5549a.dismiss();
                    }
                    if (a.m2195i(a.m2191e("0"), c1023r.f5066n0, c1023r.f5063k0.toString())) {
                        c1023r.f5064l0.f5094f = false;
                        c1023r.m2655K0(false);
                        m.m1952H(c1023r.m303h(), c1023r.m337y(R.string.a9));
                    } else {
                        c1023r.m2657M0(c1023r.m337y(R.string.c1), a.m2189c(a.m2191e("\\d*"), c1023r.f5066n0, c1023r.f5063k0.toString(), ""), null);
                    }
                    StringBuilder sb4 = c1023r.f5063k0;
                    sb4.delete(0, sb4.length());
                }
                if (c1023r.f5063k0.toString().contains(c1023r.f5067o0)) {
                    j c1155j5 = c1023r.f5056d0;
                    if (c1155j5 != null) {
                        c1155j5.f5549a.dismiss();
                    }
                    if (a.m2195i(a.m2191e("0"), c1023r.f5067o0, c1023r.f5063k0.toString())) {
                        c1023r.f5064l0.f5094f = true;
                        c1023r.m2655K0(false);
                        m.m1952H(c1023r.m303h(), c1023r.m337y(R.string.a_));
                    } else {
                        c1023r.m2657M0(c1023r.m337y(R.string.c1), a.m2189c(a.m2191e("\\d*"), c1023r.f5067o0, c1023r.f5063k0.toString(), ""), null);
                    }
                    StringBuilder sb5 = c1023r.f5063k0;
                    sb5.delete(0, sb5.length());
                }
                if (c1023r.f5063k0.toString().contains(c1023r.f5073u0)) {
                    j c1155j6 = c1023r.f5056d0;
                    if (c1155j6 != null) {
                        c1155j6.f5549a.dismiss();
                    }
                    if (a.m2195i(a.m2191e("0"), c1023r.f5073u0, c1023r.f5063k0.toString())) {
                        m.m1952H(c1023r.m303h(), "安装完成");
                    } else {
                        c1023r.m2657M0(c1023r.m337y(R.string.c1), a.m2189c(a.m2191e("\\d*"), c1023r.f5073u0, c1023r.f5063k0.toString(), ""), null);
                    }
                    StringBuilder sb6 = c1023r.f5063k0;
                    sb6.delete(0, sb6.length());
                }
                if (c1023r.f5063k0.toString().contains(c1023r.f5070r0)) {
                    j c1155j7 = c1023r.f5056d0;
                    if (c1155j7 != null) {
                        c1155j7.f5549a.dismiss();
                    }
                    if (a.m2195i(a.m2191e("0"), c1023r.f5070r0, c1023r.f5063k0.toString())) {
                        m.m1952H(c1023r.m303h(), c1023r.m337y(R.string.bv));
                    } else {
                        c1023r.m2657M0(c1023r.m337y(R.string.c1), a.m2189c(a.m2191e("\\d*"), c1023r.f5070r0, c1023r.f5063k0.toString(), ""), null);
                    }
                    StringBuilder sb7 = c1023r.f5063k0;
                    sb7.delete(0, sb7.length());
                }
                if (c1023r.f5063k0.toString().contains(c1023r.f5071s0)) {
                    j c1155j8 = c1023r.f5056d0;
                    if (c1155j8 != null) {
                        c1155j8.f5549a.dismiss();
                    }
                    final g c1152g = new g(c1023r.m303h());
                    c1152g.f5533c.setVisibility(0);
                    c1152g.f5533c.setText("恢复应用");
                    String[] strArrSplit = c1023r.f5063k0.toString().split(c1023r.f5072t0);
                    String[] strArrSplit2 = strArrSplit[0].split("\n");
                    for (int i = 0; i < strArrSplit2.length - 1; i++) {
                        if (strArrSplit2[i].matches("package:.+")) {
                            if (!strArrSplit[1].contains(strArrSplit2[i] + "\n")) {
                                c1152g.m2704b(strArrSplit2[i].replace("package:", ""));
                            }
                        }
                    }
                    if (c1152g.f5538h.size() > 0) {
                        c1152g.m2707e(new c.a() { // from class: c.c.a.v3.i0.m
                            @Override // c.c.a.y3.c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo2640a(int i2) {
                                r c1023r2 = c1023r;
                                g c1152g2 = c1152g;
                                q3 runnableC0964q4 = c1023r2.f5062j0;
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(c1023r2.f4967W);
                                sb8.append("shell cmd package install-existing ");
                                sb8.append(c1152g2.f5538h.get(i2).f5513b);
                                sb8.append(" 2>&1;echo $?");
                                a.m2193g(sb8, c1023r2.f5073u0, runnableC0964q4);
                            }
                        });
                        c1152g.m2709g();
                    } else {
                        m.m1952H(c1023r.m309k(), "没有可恢复的应用");
                    }
                    StringBuilder sb8 = c1023r.f5063k0;
                    sb8.delete(0, sb8.length());
                }
                q c1022q = c1023r.f5077y0;
                if (c1022q != null) {
                    c1022q.m2651b(c1023r.f5063k0);
                }
                return false;
            }
        });
        if (!m2646G0().f6466v || m2647H0().f6475b == null) {
            return;
        }
        m2647H0().f6475b.k = new Handler(new Handler.Callback() { // from class: c.c.a.v3.i0.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                r c1023r = this.f5013a;
                Objects.requireNonNull(c1023r);
                int i = message.arg1;
                j c1155j = c1023r.f5056d0;
                if (c1155j == null) {
                    return false;
                }
                int i2 = c1023r.f5075w0 + i;
                c1023r.f5075w0 = i2;
                c1155j.f5552d.setProgress(i2);
                return false;
            }
        });
    }

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: J0 */
    public void mo2648J0() {
        m2646G0().x();
    }

    /* JADX INFO: renamed from: K0 */
    public void m2655K0(boolean z) {
        this.f5050X.clear();
        boolean[] zArr = this.f5061i0;
        if (zArr[0] && zArr[2]) {
            for (C1027v c1027v : this.f5051Y) {
                if (c1027v.f5095g && c1027v.f5094f) {
                    this.f5050X.add(c1027v);
                }
            }
        }
        boolean[] zArr2 = this.f5061i0;
        if (zArr2[0] && zArr2[3]) {
            for (C1027v c1027v2 : this.f5051Y) {
                if (c1027v2.f5095g && !c1027v2.f5094f) {
                    this.f5050X.add(c1027v2);
                }
            }
        }
        boolean[] zArr3 = this.f5061i0;
        if (zArr3[1] && zArr3[2]) {
            for (C1027v c1027v3 : this.f5051Y) {
                if (!c1027v3.f5095g && c1027v3.f5094f) {
                    this.f5050X.add(c1027v3);
                }
            }
        }
        boolean[] zArr4 = this.f5061i0;
        if (zArr4[1] && zArr4[3]) {
            for (C1027v c1027v4 : this.f5051Y) {
                if (!c1027v4.f5095g && !c1027v4.f5094f) {
                    this.f5050X.add(c1027v4);
                }
            }
        }
        m2659O0(z);
    }

    /* JADX INFO: renamed from: L0 */
    public void m2656L0(String str) {
        this.f5050X.clear();
        for (C1027v c1027v : this.f5051Y) {
            if (c1027v.f5091c.contains(str) || c1027v.f5092d.contains(str)) {
                this.f5050X.add(c1027v);
            }
        }
        m2659O0(true);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2657M0(String str, String str2, View.OnClickListener onClickListener) {
        h c1153h = new h(m303h());
        this.f5057e0 = c1153h;
        if (str != null) {
            c1153h.f5540b.setVisibility(0);
            c1153h.f5540b.setText(str);
        }
        if (str2 != null) {
            h c1153h2 = this.f5057e0;
            c1153h2.f5541c.setVisibility(0);
            c1153h2.f5541c.setText(str2);
        }
        this.f5057e0.m2712c(m337y(R.string.eg));
        if (onClickListener != null) {
            this.f5057e0.m2711b(m337y(R.string.aq));
            this.f5057e0.f5543e.setOnClickListener(onClickListener);
        }
        this.f5057e0.f5539a.show();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m2658N0(String str) {
        h c1153h = this.f5057e0;
        if (c1153h != null) {
            c1153h.f5539a.dismiss();
        }
        j c1155j = new j(m303h());
        this.f5056d0 = c1155j;
        c1155j.f5551c.setVisibility(0);
        c1155j.f5551c.setText(str);
        this.f5056d0.f5549a.show();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public native void O(Menu menu, MenuInflater menuInflater);
    public void mo282O(Menu menu, MenuInflater menuInflater) {
        O(menu, menuInflater);
    }

    /* JADX INFO: renamed from: O0 */
    public native void O0(boolean z);
    public void m2659O0(boolean z) {
        O0(z);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5052Z = layoutInflater.inflate(R.layout.b7, viewGroup, false);
        FloatingActionButton floatingActionButton = (FloatingActionButton) m303h().findViewById(R.id.ek);
        this.f5055c0 = floatingActionButton;
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.i0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final r c1023r = this.f5014b;
                final g c1152g = new g(c1023r.m303h());
                c1152g.m2708f(c1023r.m337y(R.string.co));
                c1152g.m2704b(c1023r.m337y(R.string.aw));
                c1152g.m2704b(c1023r.m337y(R.string.ax));
                c1152g.m2707e(new o(c1023r, c1152g));
                c1152g.m2709g();
            }
        });
        this.f5058f0 = (ProgressBar) this.f5052Z.findViewById(R.id.lg);
        this.f5059g0 = (ProgressBar) this.f5052Z.findViewById(R.id.lh);
        this.f5053a0 = (RecyclerView) this.f5052Z.findViewById(R.id.ls);
        this.f5053a0.setLayoutManager(new LinearLayoutManager(m303h()));
        C1021p c1021p = new C1021p(m303h(), this.f5050X, new a());
        this.f5054b0 = c1021p;
        this.f5053a0.setAdapter(c1021p);
        m334w0(true);
        this.f5059g0.setVisibility(0);
        m2646G0().f6456H.f4837a.set(4, this);
        if (m2646G0().f6470z == 4) {
            mo2641I0();
        }
        return this.f5052Z;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public void mo284Q() {
        this.f665E = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public void mo285R() {
        this.f665E = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NonConstantResourceId"})
    /* JADX INFO: renamed from: Y */
    public boolean mo292Y(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.me) {
            switch (itemId) {
                case R.id.im /* 2131296601 */:
                    menuItem.setChecked(true);
                    this.f5060h0 = 1;
                    m2659O0(true);
                    break;
                case R.id.in /* 2131296602 */:
                    if (!menuItem.isChecked()) {
                        q c1022q = this.f5077y0;
                        if (c1022q != null && c1022q.f5048s) {
                            this.f5059g0.setVisibility(0);
                            menuItem.setChecked(true);
                            this.f5051Y.clear();
                            this.f5050X.clear();
                            this.f5054b0.f947a.m542b();
                            this.f5077y0.m2652c(this.f5062j0);
                        }
                    } else {
                        menuItem.setChecked(false);
                    }
                    break;
                case R.id.io /* 2131296603 */:
                    menuItem.setChecked(true);
                    this.f5060h0 = 0;
                    m2659O0(true);
                    break;
                case R.id.ip /* 2131296604 */:
                    if (!this.f5076x0.findItem(R.id.in).isChecked()) {
                        q c1022q2 = this.f5077y0;
                        if (c1022q2.f5048s) {
                            c1022q2.f5045p = 0;
                            c1022q2.f5044o = false;
                            c1022q2.f5046q = 0;
                            c1022q2.f5038i.f5051Y.clear();
                            c1022q2.f5041l.m2627c(c1022q2.f5039j + c1022q2.f5036g + ";echo " + c1022q2.f5030a);
                        }
                    } else {
                        q c1022q3 = this.f5077y0;
                        if (c1022q3 != null && c1022q3.f5048s) {
                            this.f5059g0.setVisibility(0);
                            this.f5051Y.clear();
                            this.f5050X.clear();
                            this.f5077y0.m2652c(this.f5062j0);
                        }
                    }
                    break;
                case R.id.iq /* 2131296605 */:
                    this.f5062j0.m2627c(this.f4967W + "shell cmd package list packages -u 2>&1;echo " + this.f5072t0 + ";" + this.f4967W + "shell cmd package list packages 2>&1;echo " + this.f5071s0);
                    m2658N0("请稍候...");
                    break;
                case R.id.ir /* 2131296606 */:
                    menuItem.setChecked(!menuItem.isChecked());
                    this.f5061i0[3] = menuItem.isChecked();
                    m2655K0(false);
                    break;
                case R.id.is /* 2131296607 */:
                    menuItem.setChecked(!menuItem.isChecked());
                    this.f5061i0[2] = menuItem.isChecked();
                    m2655K0(false);
                    break;
                case R.id.it /* 2131296608 */:
                    menuItem.setChecked(!menuItem.isChecked());
                    this.f5061i0[0] = menuItem.isChecked();
                    m2655K0(true);
                    break;
                case R.id.iu /* 2131296609 */:
                    menuItem.setChecked(!menuItem.isChecked());
                    this.f5061i0[1] = menuItem.isChecked();
                    m2655K0(false);
                    break;
                case R.id.iv /* 2131296610 */:
                    menuItem.setChecked(true);
                    this.f5060h0 = 2;
                    m2659O0(true);
                    break;
            }
        } else {
            Menu menu = this.f5076x0;
            if (menu != null) {
                menu.findItem(R.id.il).setVisible(false);
                this.f5076x0.findItem(R.id.ik).setVisible(false);
            }
            SearchView searchView = (SearchView) menuItem.getActionView();
            searchView.setIconified(false);
            menuItem.setOnActionExpandListener(new b());
            searchView.setOnQueryTextListener(new c());
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo306i0() {
        this.f665E = true;
    }
}
