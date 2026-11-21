package c.c.a.v3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.core.widget.NestedScrollView;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p006b.p067s.C0532j;
import b.s.m;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.y3.c;
import c.c.a.y3.d;
import c.c.a.y3.e;
import c.c.a.y3.g;

/* JADX INFO: renamed from: c.c.a.v3.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C1000f0 extends g0 {

    /* JADX INFO: renamed from: X */
    public NestedScrollView f4953X;

    /* JADX INFO: renamed from: Y */
    public EditText f4954Y;

    /* JADX INFO: renamed from: Z */
    public EditText f4955Z;

    /* JADX INFO: renamed from: c0 */
    public q3 f4958c0;

    /* JADX INFO: renamed from: d0 */
    public View f4959d0;

    /* JADX INFO: renamed from: f0 */
    public boolean f4961f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f4962g0;

    /* JADX INFO: renamed from: i0 */
    public StringBuilder f4964i0;

    /* JADX INFO: renamed from: a0 */
    public final ArrayList<String> f4956a0 = new ArrayList<>();

    /* JADX INFO: renamed from: b0 */
    public int f4957b0 = 0;

    /* JADX INFO: renamed from: e0 */
    public final String f4960e0 = a.q();

    /* JADX INFO: renamed from: h0 */
    public boolean f4963h0 = false;

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public void mo272F(Bundle bundle) {
        this.f665E = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public void mo276I(Context context) {
        super.mo276I(context);
    }

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: I0 */
    public void mo2641I0() {
        super.mo2641I0();
        m2644M0();
    }

    /* JADX INFO: renamed from: K0 */
    public final SpannableString m2642K0(String str, int i) {
        String str2;
        SpannableString spannableString = new SpannableString(str);
        if (i != 0) {
            str2 = i != 2 ? "#FFFFFF" : "#FFFF0000";
        } else {
            str2 = "#FF3AA23A";
        }
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), 0, spannableString.length(), 33);
        return spannableString;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m2643L0() {
        if (this.f4955Z.getText().toString().isEmpty()) {
            m.m1952H(m303h(), m337y(R.string.fb));
            return;
        }
        String strTrim = this.f4955Z.getText().toString().trim();
        if (strTrim.startsWith("adb shell ")) {
            strTrim = strTrim.substring(10);
        }
        if (strTrim.equalsIgnoreCase("clear")) {
            String[] strArrSplit = this.f4954Y.getText().toString().split("\n");
            this.f4954Y.setText(strArrSplit[strArrSplit.length - 1]);
        } else if (this.f4961f0) {
            this.f4958c0.m2627c(strTrim);
        } else {
            if (strTrim.equals("exit")) {
                this.f4958c0.m2627c(strTrim);
                new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1000f0 c1000f0 = this.f4950b;
                        Objects.requireNonNull(c1000f0);
                        StringBuilder sb = new StringBuilder();
                        sb.append("echo '");
                        c1000f0.f4958c0.m2627c(a.m2203q(sb, c1000f0.f4960e0, "'$?'|'$(whoami)@$(getprop ro.build.product):$(pwd)"));
                    }
                }, 1000L);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(strTrim);
                sb.append(";echo '");
                this.f4958c0.m2627c(a.m2203q(sb, this.f4960e0, "'$?'|'$(whoami)@$(getprop ro.build.product):$(pwd)"));
            }
            this.f4954Y.append(strTrim + "\n");
        }
        this.f4955Z.setText("");
        this.f4956a0.add(strTrim);
        this.f4957b0 = this.f4956a0.size();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2644M0() {
        this.f4961f0 = false;
        this.f4962g0 = false;
        this.f4964i0 = new StringBuilder();
        q3 runnableC0964q3 = new q3(m303h());
        this.f4958c0 = runnableC0964q3;
        runnableC0964q3.f4886h = true;
        runnableC0964q3.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.v3.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                EditText editText;
                CharSequence string;
                final C1000f0 c1000f0 = this.f5105a;
                c1000f0.f4964i0.append((String) message.obj);
                if (c1000f0.f4963h0) {
                    c1000f0.f4963h0 = false;
                    c1000f0.f4961f0 = true;
                    c1000f0.f4958c0.m2627c("");
                    new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1000f0 c1000f1 = c1000f0;
                            a.m2193g(a.m2191e("echo "), c1000f1.f4960e0, c1000f1.f4958c0);
                        }
                    }, 1000L);
                } else {
                    if (c1000f0.f4961f0) {
                        if (c1000f0.f4962g0) {
                            c1000f0.f4954Y.append(c1000f0.f4964i0.toString());
                            StringBuilder sb = c1000f0.f4964i0;
                            sb.delete(0, sb.length());
                        }
                        if (!c1000f0.f4962g0 && c1000f0.f4964i0.toString().contains(c1000f0.f4960e0)) {
                            String[] strArrSplit = c1000f0.f4964i0.toString().split(c1000f0.f4960e0);
                            c1000f0.f4954Y.append(strArrSplit[strArrSplit.length - 1].trim() + " ");
                            c1000f0.f4962g0 = true;
                        }
                    } else {
                        if (message.what == 2) {
                            editText = c1000f0.f4954Y;
                            string = c1000f0.m2642K0(c1000f0.f4964i0.toString(), 2);
                        } else if (c1000f0.f4964i0.toString().contains(c1000f0.f4960e0)) {
                            String[] strArrSplit2 = c1000f0.f4964i0.toString().split(c1000f0.f4960e0);
                            c1000f0.f4954Y.append(strArrSplit2[0]);
                            String strReplace = strArrSplit2[1].substring(0, strArrSplit2[1].length() - 1).replace("0|", "");
                            String str = strReplace.split("@")[0].contains("root") ? " # " : " $ ";
                            if (strReplace.split("@")[0].contains(String.valueOf(c1000f0.m303h().getApplicationInfo().uid - 10000))) {
                                q3 runnableC0964q4 = c1000f0.f4958c0;
                                if (runnableC0964q4 != null) {
                                    runnableC0964q4.m2628d();
                                }
                                c1000f0.f4954Y.setText("");
                                c1000f0.m2644M0();
                            } else {
                                c1000f0.f4954Y.append(c1000f0.m2642K0(strReplace + str, 0));
                            }
                        } else {
                            editText = c1000f0.f4954Y;
                            string = c1000f0.f4964i0.toString();
                        }
                        editText.append(string);
                    }
                    StringBuilder sb2 = c1000f0.f4964i0;
                    sb2.delete(0, sb2.length());
                }
                c1000f0.f4953X.post(new RunnableC0998e0(c1000f0));
                return false;
            }
        });
        this.f4963h0 = true;
        this.f4958c0.m2627c(this.f4967W + "shell");
        new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.i
            @Override // java.lang.Runnable
            public final void run() {
                C1000f0 c1000f0 = this.f5000b;
                c1000f0.f4963h0 = false;
                if (c1000f0.f4961f0) {
                    return;
                }
                c1000f0.f4958c0.m2627c(a.m2203q(a.m2191e("echo "), c1000f0.f4960e0, "$(whoami)@$(getprop ro.build.product):$(pwd)"));
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m2645N0(boolean z) {
        int i;
        if (z) {
            int i2 = this.f4957b0;
            if (i2 > 0) {
                i = i2 - 1;
                this.f4957b0 = i;
            }
        } else if (this.f4957b0 < this.f4956a0.size()) {
            i = this.f4957b0 + 1;
            this.f4957b0 = i;
        }
        if (this.f4956a0.size() > 0) {
            if (this.f4957b0 >= this.f4956a0.size()) {
                this.f4955Z.setText("");
                return;
            }
            String str = this.f4956a0.get(this.f4957b0);
            this.f4955Z.setText(str);
            this.f4955Z.setSelection(str.length());
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public void mo282O(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f, menu);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4959d0 = layoutInflater.inflate(R.layout.b8, viewGroup, false);
        m334w0(true);
        this.f4953X = (NestedScrollView) this.f4959d0.findViewById(R.id.d3);
        this.f4954Y = (EditText) this.f4959d0.findViewById(R.id.o1);
        EditText editText = (EditText) this.f4959d0.findViewById(R.id.h1);
        this.f4955Z = editText;
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: c.c.a.v3.c
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                C1000f0 c1000f0 = this.f4946b;
                Objects.requireNonNull(c1000f0);
                if (i != 66 || keyEvent.getAction() != 0) {
                    return false;
                }
                c1000f0.m2643L0();
                return true;
            }
        });
        ((Button) this.f4959d0.findViewById(R.id.bv)).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4968b.m2645N0(true);
            }
        });
        ((Button) this.f4959d0.findViewById(R.id.bu)).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4965b.m2645N0(false);
            }
        });
        ((Button) this.f4959d0.findViewById(R.id.ed)).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4948b.m2643L0();
            }
        });
        m2646G0().f6456H.f4837a.set(6, this);
        if (m2646G0().f6470z == 6) {
            super.mo2641I0();
            m2644M0();
        }
        return this.f4959d0;
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public void mo286S() {
        this.f665E = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NonConstantResourceId"})
    /* JADX INFO: renamed from: Y */
    public boolean mo292Y(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.iw /* 2131296611 */:
                if (this.f4961f0) {
                    String[] strArrSplit = this.f4954Y.getText().toString().split("\n");
                    this.f4954Y.setText(strArrSplit[strArrSplit.length - 1]);
                } else {
                    this.f4954Y.setText("");
                    StringBuilder sb = new StringBuilder();
                    sb.append("echo ");
                    this.f4958c0.m2627c(a.m2203q(sb, this.f4960e0, "$(whoami)@$(getprop ro.build.product):$(pwd)"));
                }
                return true;
            case R.id.ix /* 2131296612 */:
                final g c1152g = new g(m303h());
                c1152g.f5533c.setVisibility(0);
                c1152g.f5533c.setText("快捷命令");
                final ArrayList arrayList = new ArrayList();
                for (String str : C0532j.m1940a(m303h()).getString("quick_commands", "").split(";qcmd;")) {
                    if (!str.isEmpty()) {
                        arrayList.add(new d(str));
                    }
                }
                arrayList.add(new d("添加命令"));
                final c c1148c = new c(m303h(), arrayList);
                c1148c.f5506f = false;
                c1148c.f5504d = new c.a() { // from class: c.c.a.v3.b
                    @Override // c.c.a.y3.c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2640a(int i) {
                        final C1000f0 c1000f0 = this.f4941a;
                        final List list = arrayList;
                        g c1152g2 = c1152g;
                        final c c1148c2 = c1148c;
                        Objects.requireNonNull(c1000f0);
                        if (i < list.size() - 1) {
                            c1000f0.f4955Z.setText(((d) list.get(i)).f5513b);
                            c1152g2.f5532b.dismiss();
                            return;
                        }
                        if (list.size() > 3 && !m.J(c1000f0.m309k())) {
                            m.m1952H(c1000f0.m309k(), "解锁高级版才能保存3个以上命令");
                            return;
                        }
                        final e c1150e = new e(c1000f0.m303h());
                        c1150e.f5519c.setVisibility(0);
                        c1150e.f5519c.setText("请输入命令");
                        c1150e.m2699b(c1000f0.m337y(R.string.aq));
                        c1150e.m2700c(c1000f0.m337y(R.string.g5));
                        c1150e.f5525i.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C1000f0 c1000f1 = c1000f0;
                                List list2 = list;
                                e c1150e2 = c1150e;
                                c c1148c3 = c1148c2;
                                Objects.requireNonNull(c1000f1);
                                StringBuilder sb2 = new StringBuilder();
                                for (int i2 = 0; i2 < list2.size() - 1; i2++) {
                                    sb2.append(((d) list2.get(i2)).f5513b);
                                    sb2.append(";qcmd;");
                                }
                                String string = c1150e2.f5523g.getText().toString();
                                sb2.append(string);
                                sb2.append(";qcmd;");
                                list2.add(list2.size() - 1, new d(string));
                                C0532j.m1940a(c1000f1.m303h()).edit().putString("quick_commands", sb2.toString()).apply();
                                c1150e2.f5518b.dismiss();
                                c1148c3.f947a.m542b();
                            }
                        });
                        c1150e.m2702e();
                    }
                };
                C1034k c1034k = new C1034k(this, arrayList, c1148c);
                c1148c.f5507g = true;
                c1148c.f5505e = c1034k;
                c1152g.f5534d = c1148c;
                c1152g.f5536f.setAdapter(c1148c);
                c1152g.m2709g();
                return true;
            case R.id.iy /* 2131296613 */:
                q3 runnableC0964q3 = this.f4958c0;
                if (runnableC0964q3 != null) {
                    runnableC0964q3.m2628d();
                }
                this.f4954Y.setText("");
                m2644M0();
                return true;
            default:
                return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: a0 */
    public void mo294a0() {
        this.f665E = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: f0 */
    public void mo301f0() {
        this.f665E = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo304h0() {
        this.f665E = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo306i0() {
        this.f665E = true;
    }
}
