package c.c.a.v3;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.R;
import com.didjdk.adbhelper.RemoteActivity;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p006b.p067s.C0532j;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.v3.h0 */
/* JADX INFO: loaded from: classes.dex */
public class C1004h0 extends g0 {

    /* JADX INFO: renamed from: B0 */
    public int f4970B0;

    /* JADX INFO: renamed from: b0 */
    public float f4975b0;

    /* JADX INFO: renamed from: d0 */
    public int f4977d0;

    /* JADX INFO: renamed from: e0 */
    public Menu f4978e0;

    /* JADX INFO: renamed from: f0 */
    public View f4979f0;

    /* JADX INFO: renamed from: g0 */
    public View f4980g0;

    /* JADX INFO: renamed from: h0 */
    public View f4981h0;

    /* JADX INFO: renamed from: i0 */
    public View f4982i0;

    /* JADX INFO: renamed from: j0 */
    public View f4983j0;

    /* JADX INFO: renamed from: k0 */
    public View f4984k0;

    /* JADX INFO: renamed from: l0 */
    public View f4985l0;

    /* JADX INFO: renamed from: m0 */
    public View f4986m0;

    /* JADX INFO: renamed from: n0 */
    public TextView f4987n0;

    /* JADX INFO: renamed from: o0 */
    public TextView f4988o0;

    /* JADX INFO: renamed from: p0 */
    public TextView f4989p0;

    /* JADX INFO: renamed from: q0 */
    public TextView f4990q0;

    /* JADX INFO: renamed from: r0 */
    public CheckBox f4991r0;

    /* JADX INFO: renamed from: s0 */
    public CheckBox f4992s0;

    /* JADX INFO: renamed from: t0 */
    public CheckBox f4993t0;

    /* JADX INFO: renamed from: w0 */
    public String[] f4996w0;

    /* JADX INFO: renamed from: x0 */
    public String[] f4997x0;

    /* JADX INFO: renamed from: y0 */
    public String[] f4998y0;

    /* JADX INFO: renamed from: z0 */
    public String[] f4999z0;

    /* JADX INFO: renamed from: X */
    public int f4971X = 0;

    /* JADX INFO: renamed from: Y */
    public int f4972Y = 1;

    /* JADX INFO: renamed from: Z */
    public int f4973Z = 0;

    /* JADX INFO: renamed from: a0 */
    public int f4974a0 = 0;

    /* JADX INFO: renamed from: c0 */
    public boolean f4976c0 = false;

    /* JADX INFO: renamed from: u0 */
    public boolean f4994u0 = false;

    /* JADX INFO: renamed from: v0 */
    public boolean f4995v0 = false;

    /* JADX INFO: renamed from: A0 */
    public String f4969A0 = "8000000";

    /* JADX INFO: renamed from: K0 */
    public final void m2649K0(boolean z) {
        this.f4976c0 = z;
        this.f4980g0.setVisibility(z ? 8 : 0);
        this.f4981h0.setVisibility(this.f4976c0 ? 8 : 0);
        this.f4982i0.setVisibility(this.f4976c0 ? 8 : 0);
        this.f4984k0.setVisibility(this.f4976c0 ? 8 : 0);
        if (this.f4977d0 < 21) {
            this.f4980g0.setVisibility(8);
            this.f4981h0.setVisibility(8);
            this.f4984k0.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public void mo282O(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.k, menu);
        menu.findItem(R.id.j8).setChecked(this.f4976c0);
        menu.findItem(R.id.j8).setVisible(false);
        this.f4978e0 = menu;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m334w0(true);
        m2646G0().f6456H.f4837a.set(2, this);
        View viewInflate = layoutInflater.inflate(R.layout.bc, viewGroup, false);
        this.f4979f0 = viewInflate;
        viewInflate.findViewById(R.id.ly);
        String[] strArrSplit = C0532j.m1940a(m303h()).getString("remote_settings", "false,0,1,0,0,false,false").split(",");
        if (strArrSplit.length < 7) {
            strArrSplit = new String[]{"false", "0", "1", "0", "0", "false", "false"};
        }
        this.f4971X = Integer.parseInt(strArrSplit[1]);
        this.f4972Y = Integer.parseInt(strArrSplit[2]);
        this.f4973Z = Integer.parseInt(strArrSplit[3]);
        this.f4974a0 = Integer.parseInt(strArrSplit[4]);
        this.f4997x0 = m303h().getResources().getStringArray(R.array.a);
        this.f4996w0 = m303h().getResources().getStringArray(R.array.g);
        this.f4998y0 = m303h().getResources().getStringArray(R.array.i);
        this.f4999z0 = m303h().getResources().getStringArray(R.array.f);
        CheckBox checkBox = (CheckBox) this.f4979f0.findViewById(R.id.cn);
        this.f4993t0 = checkBox;
        checkBox.setChecked(Boolean.parseBoolean(strArrSplit[0]));
        this.f4976c0 = this.f4993t0.isChecked();
        this.f4987n0 = (TextView) this.f4979f0.findViewById(R.id.q5);
        this.f4988o0 = (TextView) this.f4979f0.findViewById(R.id.q3);
        this.f4989p0 = (TextView) this.f4979f0.findViewById(R.id.q6);
        this.f4990q0 = (TextView) this.f4979f0.findViewById(R.id.q4);
        CheckBox checkBox2 = (CheckBox) this.f4979f0.findViewById(R.id.cm);
        this.f4991r0 = checkBox2;
        checkBox2.setChecked(Boolean.parseBoolean(strArrSplit[5]));
        CheckBox checkBox3 = (CheckBox) this.f4979f0.findViewById(R.id.co);
        this.f4992s0 = checkBox3;
        checkBox3.setChecked(Boolean.parseBoolean(strArrSplit[6]));
        this.f4987n0.setText(this.f4996w0[this.f4971X]);
        this.f4988o0.setText(this.f4997x0[this.f4972Y]);
        this.f4989p0.setText(this.f4998y0[this.f4973Z]);
        this.f4990q0.setText(this.f4999z0[this.f4974a0]);
        this.f4979f0.findViewById(R.id.i7);
        ((Button) this.f4979f0.findViewById(R.id.bz)).setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1004h0 c1004h0 = this.f5428b;
                Objects.requireNonNull(c1004h0);
                new Thread(new Runnable() { // from class: c.c.a.v3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        final C1004h0 c1004h1 = c1004h0;
                        while (!c1004h1.m2646G0().f6462r) {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            int i = Integer.parseInt(c1004h1.m2646G0().f6468x.split("\\s")[0]);
                            int i2 = Integer.parseInt(c1004h1.m2646G0().f6468x.split("\\s")[2]);
                            c1004h1.f4970B0 = (Integer.parseInt(c1004h1.m303h().getResources().getStringArray(R.array.h)[c1004h1.f4971X]) * Math.max(i, i2)) / Math.min(i, i2);
                            c1004h1.f4975b0 = Math.max(i, i2) / Math.min(i, i2);
                        } catch (Exception unused) {
                            c1004h1.f4970B0 = 0;
                        }
                        c1004h1.f4969A0 = c1004h1.m303h().getResources().getStringArray(R.array.b)[c1004h1.f4972Y];
                        c1004h1.m303h().runOnUiThread(new Runnable() { // from class: c.c.a.v3.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1004h0 c1004h2 = c1004h1;
                                C0532j.m1940a(c1004h2.m303h()).edit().putString("remote_settings", c1004h2.f4976c0 + "," + c1004h2.f4971X + "," + c1004h2.f4972Y + "," + c1004h2.f4973Z + "," + c1004h2.f4974a0 + "," + c1004h2.f4991r0.isChecked() + "," + c1004h2.f4992s0.isChecked()).apply();
                                Intent intent = new Intent(c1004h2.m303h(), (Class<?>) RemoteActivity.class);
                                intent.putExtra("ADB", c1004h2.m2646G0().f6465u);
                                intent.putExtra("COMPATIBLE_MODE", c1004h2.f4976c0);
                                intent.putExtra("API", c1004h2.f4977d0);
                                intent.putExtra("SERVER_DIR", c1004h2.m2646G0().f6464t);
                                intent.putExtra("maxSize", c1004h2.f4970B0);
                                intent.putExtra("bitRate", c1004h2.f4969A0);
                                intent.putExtra("keepAspectRatio", c1004h2.f4976c0 || c1004h2.f4973Z == 0);
                                intent.putExtra("aspectRatio", c1004h2.f4975b0);
                                intent.putExtra("navigation", c1004h2.f4974a0);
                                intent.putExtra("fullScreen", !c1004h2.f4976c0 && c1004h2.f4991r0.isChecked());
                                intent.putExtra("turnScreenOff", c1004h2.f4992s0.isChecked());
                                intent.putExtra("renderAll", c1004h2.f4994u0);
                                intent.putExtra("stayAwake", c1004h2.f4995v0);
                                c1004h2.m271E0(intent);
                            }
                        });
                    }
                }).start();
            }
        });
        View viewFindViewById = this.f4979f0.findViewById(R.id.hy);
        this.f4980g0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1004h0 c1004h0 = this.f5430b;
                DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(c1004h0.m303h());
                aVar.m783e(c1004h0.f4996w0, c1004h0.f4971X, new DialogInterface.OnClickListener() { // from class: c.c.a.v3.a0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C1004h0 c1004h1 = c1004h0;
                        c1004h1.f4971X = i;
                        c1004h1.f4987n0.setText(c1004h1.f4996w0[i]);
                        dialogInterface.dismiss();
                    }
                });
                aVar.m779a().show();
            }
        });
        View viewFindViewById2 = this.f4979f0.findViewById(R.id.hu);
        this.f4981h0 = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1004h0 c1004h0 = this.f5425b;
                DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(c1004h0.m303h());
                int i = c1004h0.f4972Y;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c.c.a.v3.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C1004h0 c1004h1 = c1004h0;
                        c1004h1.f4972Y = i2;
                        c1004h1.f4988o0.setText(c1004h1.f4997x0[i2]);
                        dialogInterface.dismiss();
                    }
                };
                AlertController.C0020b c0020b = aVar.f1245a;
                c0020b.f123l = c0020b.f112a.getResources().getTextArray(R.array.a);
                AlertController.C0020b c0020b2 = aVar.f1245a;
                c0020b2.f125n = onClickListener;
                c0020b2.f130s = i;
                c0020b2.f129r = true;
                aVar.m779a().show();
            }
        });
        View viewFindViewById3 = this.f4979f0.findViewById(R.id.i0);
        this.f4982i0 = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1004h0 c1004h0 = this.f4945b;
                DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(c1004h0.m303h());
                aVar.m783e(c1004h0.f4998y0, c1004h0.f4973Z, new DialogInterface.OnClickListener() { // from class: c.c.a.v3.y
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C1004h0 c1004h1 = c1004h0;
                        c1004h1.f4973Z = i;
                        c1004h1.f4989p0.setText(c1004h1.f4998y0[i]);
                        dialogInterface.dismiss();
                    }
                });
                aVar.m779a().show();
            }
        });
        View viewFindViewById4 = this.f4979f0.findViewById(R.id.hx);
        this.f4985l0 = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1004h0 c1004h0 = this.f4947b;
                DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(c1004h0.m303h());
                aVar.m783e(c1004h0.f4999z0, c1004h0.f4974a0, new DialogInterface.OnClickListener() { // from class: c.c.a.v3.v
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C1004h0 c1004h1 = c1004h0;
                        c1004h1.f4974a0 = i;
                        c1004h1.f4990q0.setText(c1004h1.f4999z0[i]);
                        dialogInterface.dismiss();
                    }
                });
                aVar.m779a().show();
            }
        });
        View viewFindViewById5 = this.f4979f0.findViewById(R.id.hv);
        this.f4983j0 = viewFindViewById5;
        viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckBox checkBox4 = this.f5421b.f4991r0;
                checkBox4.setChecked(!checkBox4.isChecked());
            }
        });
        View viewFindViewById6 = this.f4979f0.findViewById(R.id.hz);
        this.f4984k0 = viewFindViewById6;
        viewFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckBox checkBox4 = this.f5431b.f4992s0;
                checkBox4.setChecked(!checkBox4.isChecked());
            }
        });
        View viewFindViewById7 = this.f4979f0.findViewById(R.id.hw);
        this.f4986m0 = viewFindViewById7;
        viewFindViewById7.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1004h0 c1004h0 = this.f5424b;
                CheckBox checkBox4 = c1004h0.f4993t0;
                checkBox4.setChecked(!checkBox4.isChecked());
                c1004h0.m2649K0(c1004h0.f4993t0.isChecked());
            }
        });
        m2649K0(this.f4993t0.isChecked());
        mo2641I0();
        new Thread(new Runnable() { // from class: c.c.a.v3.o
            @Override // java.lang.Runnable
            public final void run() {
                final C1004h0 c1004h0 = this.f5422b;
                while (!c1004h0.m2646G0().f6462r) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    c1004h0.f4977d0 = Integer.parseInt(c1004h0.m2646G0().f6469y);
                } catch (Exception unused) {
                    c1004h0.f4977d0 = 21;
                }
                if (c1004h0.f4977d0 < 21) {
                    c1004h0.m303h().runOnUiThread(new Runnable() { // from class: c.c.a.v3.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1004h0 c1004h1 = c1004h0;
                            c1004h1.f4980g0.setVisibility(8);
                            c1004h1.f4981h0.setVisibility(8);
                        }
                    });
                }
                c1004h0.m303h().runOnUiThread(new Runnable() { // from class: c.c.a.v3.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1004h0 c1004h1 = c1004h0;
                        c1004h1.m2649K0(c1004h1.f4976c0);
                    }
                });
            }
        }).start();
        return this.f4979f0;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NonConstantResourceId"})
    /* JADX INFO: renamed from: Y */
    public boolean mo292Y(MenuItem menuItem) {
        int i;
        if (menuItem.getItemId() == R.id.j9) {
            h c1153h = new h(m303h());
            c1153h.m2714e(m337y(R.string.hj));
            c1153h.m2710a(m337y(R.string.fv));
            c1153h.m2712c(m337y(R.string.b2));
            c1153h.f5539a.show();
        }
        if (menuItem.getItemId() == R.id.j_) {
            DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(m303h());
            aVar.m784f(R.string.a7);
            View viewInflate = View.inflate(m303h(), R.layout.bx, null);
            CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cp);
            checkBox.setChecked(this.f4994u0);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c.c.a.v3.t
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f5427a.f4994u0 = z;
                }
            });
            CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.cq);
            checkBox2.setChecked(this.f4995v0);
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c.c.a.v3.d0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f4949a.f4995v0 = z;
                }
            });
            AlertController.C0020b c0020b = aVar.f1245a;
            c0020b.f126o = viewInflate;
            c0020b.f118g = c0020b.f112a.getText(R.string.eg);
            aVar.f1245a.f119h = null;
            aVar.m779a().show();
        }
        if (menuItem.getItemId() == R.id.j8 && (i = this.f4977d0) != 0 && i >= 21) {
            m2649K0(!menuItem.isChecked());
            menuItem.setChecked(!menuItem.isChecked());
        }
        return true;
    }
}
