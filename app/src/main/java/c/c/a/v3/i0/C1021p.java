package c.c.a.v3.i0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.FilePickerActivity;
import com.didjdk.adbhelper.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import c.c.a.q3;
import c.c.a.y3.c;
import c.c.a.y3.d;
import c.c.a.y3.g;
import c.c.a.y3.h;
import c.c.a.y3.f;

/* JADX INFO: renamed from: c.c.a.v3.i0.p */
/* JADX INFO: loaded from: classes.dex */
public class C1021p extends RecyclerView.AbstractC0132g<b> {

    /* JADX INFO: renamed from: c */
    public List<C1027v> f5022c;

    /* JADX INFO: renamed from: d */
    public a f5023d;

    /* JADX INFO: renamed from: e */
    public Context f5024e;

    /* JADX INFO: renamed from: c.c.a.v3.i0.p$a */
    public interface a {
    }

    /* JADX INFO: renamed from: c.c.a.v3.i0.p$b */
    public static class b extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public View f5025t;

        /* JADX INFO: renamed from: u */
        public ImageView f5026u;

        /* JADX INFO: renamed from: v */
        public TextView f5027v;

        /* JADX INFO: renamed from: w */
        public TextView f5028w;

        /* JADX INFO: renamed from: x */
        public TextView f5029x;

        public b(View view) {
            super(view);
            this.f5025t = view;
            this.f5026u = (ImageView) view.findViewById(R.id.h8);
            this.f5027v = (TextView) view.findViewById(R.id.h_);
            this.f5028w = (TextView) view.findViewById(R.id.h9);
            this.f5029x = (TextView) view.findViewById(R.id.h7);
        }
    }

    public C1021p(Context context, List<C1027v> list, a aVar) {
        this.f5022c = list;
        this.f5023d = aVar;
        this.f5024e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5022c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        b bVar = (b) abstractC0129d0;
        C1027v c1027v = this.f5022c.get(i);
        ComponentCallbacks2C0616b.m2208e(this.f5024e).m2234n(c1027v.f5104p).m2546e(R.drawable.aa).m2226x(bVar.f5026u);
        bVar.f5027v.setText(c1027v.f5091c);
        bVar.f5028w.setText(c1027v.f5092d);
        bVar.f5029x.setVisibility(c1027v.f5094f ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        final b bVar = new b(a.m2188b(viewGroup, R.layout.bj, viewGroup, false));
        bVar.f5025t.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.i0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1021p c1021p = this.f5001b;
                C1021p.b bVar2 = bVar;
                Objects.requireNonNull(c1021p);
                int iM509e = bVar2.m509e();
                r.a aVar = (r.a) c1021p.f5023d;
                final C1027v c1027v = r.this.f5050X.get(iM509e);
                final r c1023r = r.this;
                final g c1152g = new g(c1023r.m303h());
                c1152g.m2706d(c1027v.f5104p, R.drawable.aa);
                c1152g.m2708f(c1027v.f5092d);
                c1152g.m2705c(c1023r.m337y(R.string.a8), R.drawable.d2);
                c1152g.f5538h.add(new d(c1023r.m337y(R.string.d0), R.drawable.e2, !c1027v.f5096h.isEmpty() && c1027v.f5094f));
                c1152g.m2705c(c1023r.m337y(c1027v.f5094f ? R.string.bq : R.string.c0), c1027v.f5094f ? R.drawable.cw : R.drawable.dj);
                c1152g.m2705c(c1023r.m337y(R.string.hn), R.drawable.dm);
                c1152g.m2705c(c1023r.m337y(R.string.ay), R.drawable.cr);
                c1152g.m2705c(c1023r.m337y(R.string.bt), R.drawable.cx);
                c1152g.m2707e(new c.a() { // from class: c.c.a.v3.i0.f
                    @Override // c.c.a.y3.c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2640a(int i2) {
                        StringBuilder sb;
                        String str;
                        r c1023r2 = c1023r;
                        C1027v c1027v2 = c1027v;
                        g c1152g2 = c1152g;
                        c1023r2.f5064l0 = c1027v2;
                        String string = null;
                        if (i2 == 0) {
                            g c1152g3 = new g(c1023r2.m303h(), true);
                            c1152g3.m2706d(c1027v2.f5104p, R.drawable.aa);
                            c1152g3.m2708f(c1027v2.f5092d);
                            c1152g3.m2703a(c1023r2.m337y(R.string.es), c1027v2.f5091c);
                            String strM337y = c1023r2.m337y(R.string.f9);
                            long j = c1027v2.f5090b;
                            try {
                                if (j >= 1073741824) {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.2f", Float.valueOf(j / 1.0737418E9f)));
                                    str = " GB";
                                } else if (j >= 1048576) {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.2f", Float.valueOf(j / 1048576.0f)));
                                    str = " MB";
                                } else if (j >= 1024) {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.2f", Float.valueOf(j / 1024.0f)));
                                    str = " KB";
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.0f", Float.valueOf(j)));
                                    str = " B";
                                }
                                sb.append(str);
                                string = sb.toString();
                            } catch (Exception unused) {
                            }
                            c1152g3.m2703a(strM337y, string);
                            c1152g3.m2703a(c1023r2.m337y(R.string.f_), c1027v2.f5097i);
                            c1152g3.m2703a(c1023r2.m337y(R.string.hd), c1023r2.m337y(c1027v2.f5095g ? R.string.i4 : R.string.e9));
                            c1152g3.m2703a(c1023r2.m337y(R.string.d4), String.valueOf(c1027v2.f5098j));
                            c1152g3.m2703a(c1023r2.m337y(R.string.hf), String.valueOf(c1027v2.f5099k));
                            c1152g3.m2703a(c1023r2.m337y(R.string.ce), new SimpleDateFormat().format(new Date(c1027v2.f5100l)));
                            c1152g3.m2703a(c1023r2.m337y(R.string.cy), new SimpleDateFormat().format(new Date(c1027v2.f5101m)));
                            c1152g3.m2703a(c1023r2.m337y(R.string.d3), c1027v2.f5096h);
                            String strM337y2 = c1023r2.m337y(R.string.eg);
                            c1152g3.f5537g.setVisibility(0);
                            c1152g3.f5537g.setText(strM337y2);
                            c1152g3.f5537g.setOnClickListener(new f(c1152g3));
                            c1152g3.m2709g();
                        } else if (i2 == 1) {
                            q3 runnableC0964q3 = c1023r2.f5062j0;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c1023r2.f4967W);
                            sb2.append("shell am start -n ");
                            sb2.append(c1027v2.f5091c);
                            sb2.append("/");
                            sb2.append(c1027v2.f5096h);
                            sb2.append(" 2>&1;echo $?");
                            a.m2193g(sb2, c1023r2.f5065m0, runnableC0964q3);
                        } else if (i2 == 2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(c1023r2.m337y(R.string.h8));
                            sb3.append(c1023r2.m337y(c1027v2.f5094f ? R.string.bp : R.string.bz));
                            sb3.append(c1023r2.m337y(R.string.hh));
                            String string2 = sb3.toString();
                            if (c1027v2.f5094f && c1027v2.f5095g) {
                                string = c1023r2.m337y(R.string.af);
                            }
                            c1023r2.m2657M0(string2, string, new ViewOnClickListenerC1024s(c1023r2, c1027v2));
                        } else if (i2 == 3) {
                            h c1153h = new h(c1023r2.m303h());
                            c1153h.m2714e(c1027v2.f5095g ? "该应用为系统应用，请谨慎卸载" : c1023r2.m337y(R.string.hb));
                            String strM337y3 = c1023r2.m337y(R.string.cx);
                            c1153h.f5542d.setVisibility(0);
                            c1153h.f5542d.setText(strM337y3);
                            c1153h.f5542d.setChecked(false);
                            c1153h.f5542d.setOnClickListener(null);
                            c1153h.m2711b(c1023r2.m337y(R.string.aq));
                            c1153h.m2712c(c1023r2.m337y(R.string.hn));
                            c1153h.f5543e.setOnClickListener(new ViewOnClickListenerC1025t(c1023r2, c1153h, c1027v2));
                            c1153h.f5539a.show();
                        } else if (i2 == 4) {
                            h c1153h2 = new h(c1023r2.m303h());
                            c1153h2.m2714e(c1023r2.m337y(R.string.h9));
                            c1153h2.m2710a(c1023r2.m337y(R.string.bf));
                            c1153h2.m2711b(c1023r2.m337y(R.string.aq));
                            c1153h2.m2712c(c1023r2.m337y(R.string.eg));
                            c1153h2.f5543e.setOnClickListener(new ViewOnClickListenerC1026u(c1023r2, c1027v2, c1153h2));
                            c1153h2.f5539a.show();
                        } else if (i2 == 5) {
                            String[] strArr = c1023r2.f5074v0;
                            strArr[0] = c1027v2.f5089a;
                            strArr[1] = c1027v2.f5091c;
                            Intent intent = new Intent(c1023r2.m303h(), (Class<?>) FilePickerActivity.class);
                            intent.putExtra("picker_mode", 2);
                            c1023r2.m273F0(intent, 2);
                        }
                        c1152g2.f5532b.dismiss();
                    }
                });
                c1152g.m2709g();
            }
        });
        bVar.f5025t.setOnLongClickListener(new View.OnLongClickListener() { // from class: c.c.a.v3.i0.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C1021p c1021p = this.f5003b;
                C1021p.b bVar2 = bVar;
                Objects.requireNonNull(c1021p);
                bVar2.m509e();
                Objects.requireNonNull(c1021p.f5023d);
                return true;
            }
        });
        return bVar;
    }
}
