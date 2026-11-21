package c.c.a.v3.l0;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.didjdk.adbhelper.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.v3.g0;
import c.c.a.v3.i0.r;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.v3.l0.l */
/* JADX INFO: loaded from: classes.dex */
public class C1069l extends g0 {

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ int f5307n0 = 0;

    /* JADX INFO: renamed from: X */
    public String f5308X = a.q();

    /* JADX INFO: renamed from: Y */
    public String f5309Y = a.q();

    /* JADX INFO: renamed from: Z */
    public ArrayList<C1068k> f5310Z = new ArrayList<>();

    /* JADX INFO: renamed from: a0 */
    public ArrayList<C1068k> f5311a0 = new ArrayList<>();

    /* JADX INFO: renamed from: b0 */
    public q3 f5312b0;

    /* JADX INFO: renamed from: c0 */
    public StringBuilder f5313c0;

    /* JADX INFO: renamed from: d0 */
    public C1067j f5314d0;

    /* JADX INFO: renamed from: e0 */
    public SwipeRefreshLayout f5315e0;

    /* JADX INFO: renamed from: f0 */
    public r f5316f0;

    /* JADX INFO: renamed from: g0 */
    public String f5317g0;

    /* JADX INFO: renamed from: h0 */
    public String f5318h0;

    /* JADX INFO: renamed from: i0 */
    public String f5319i0;

    /* JADX INFO: renamed from: j0 */
    public int f5320j0;

    /* JADX INFO: renamed from: k0 */
    public int f5321k0;

    /* JADX INFO: renamed from: l0 */
    public int f5322l0;

    /* JADX INFO: renamed from: m0 */
    public C1068k f5323m0;

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: I0 */
    public void mo2641I0() {
        super.mo2641I0();
        this.f5315e0.setRefreshing(true);
        r c1023r = (r) m2646G0().f6456H.m2622a(4);
        this.f5316f0 = c1023r;
        if (c1023r.f5077y0 == null) {
            c1023r.mo2641I0();
        }
        this.f5313c0 = new StringBuilder();
        q3 runnableC0964q3 = new q3(m303h());
        this.f5312b0 = runnableC0964q3;
        runnableC0964q3.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.v3.l0.d
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                final C1069l c1069l = this.f5274a;
                c1069l.f5313c0.append((String) message.obj);
                if (c1069l.f5313c0.toString().contains(c1069l.f5308X)) {
                    c1069l.f5310Z.clear();
                    c1069l.f5311a0.clear();
                    for (String str : c1069l.f5313c0.toString().split("\nTotal\\s")) {
                        String[] strArrSplit = str.split("\n");
                        if (str.contains("PSS by process")) {
                            for (String str2 : strArrSplit) {
                                if (str2.trim().matches(".+:.+\\(.+\\)")) {
                                    c1069l.f5310Z.add(new C1068k(str2.trim()));
                                }
                            }
                        }
                        if (str.contains("Free RAM")) {
                            if (strArrSplit[0].trim().matches("RAM:.+")) {
                                int i = Integer.parseInt(strArrSplit[0].split("\\s+")[1].replaceAll("\\D", ""));
                                c1069l.f5320j0 = i;
                                c1069l.f5317g0 = C1068k.m2679a(i);
                            }
                            for (String str3 : strArrSplit) {
                                if (str3.trim().contains("Free RAM")) {
                                    int i2 = Integer.parseInt(str3.trim().split("\\s+")[2].replaceAll("\\D", ""));
                                    c1069l.f5321k0 = i2;
                                    c1069l.f5318h0 = C1068k.m2679a(i2);
                                }
                            }
                            int i3 = c1069l.f5320j0 - c1069l.f5321k0;
                            c1069l.f5322l0 = i3;
                            c1069l.f5319i0 = C1068k.m2679a(i3);
                        }
                    }
                    StringBuilder sb = c1069l.f5313c0;
                    sb.delete(0, sb.length());
                    new Thread(new Runnable() { // from class: c.c.a.v3.l0.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            final C1069l c1069l2 = c1069l;
                            while (!c1069l2.f5316f0.f5077y0.f5048s) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            c1069l2.m303h().runOnUiThread(new Runnable() { // from class: c.c.a.v3.l0.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4;
                                    C1069l c1069l3 = c1069l2;
                                    for (C1068k c1068k : c1069l3.f5310Z) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(c1069l3.f5316f0.f5077y0.f5037h);
                                        sb2.append("/");
                                        c1068k.f5293a = a.m2203q(sb2, c1068k.f5295c, ".png");
                                        c1068k.f5299g = new File(c1068k.f5293a).exists();
                                        String str4 = c1069l3.f5316f0.f5077y0.f5047r.get(c1068k.f5295c);
                                        if (str4 != null) {
                                            try {
                                                c1068k.f5306n = Boolean.parseBoolean(str4.split(" ", 2)[0]);
                                                c1068k.f5296d = str4.split(" ", 2)[1];
                                                c1068k.f5305m = true;
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            c1068k.f5296d = c1068k.f5295c;
                                        }
                                    }
                                    Collections.sort(c1069l3.f5310Z, new Comparator() { // from class: c.c.a.v3.l0.e
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            int i5 = C1069l.f5307n0;
                                            return ((C1068k) obj).f5295c.compareToIgnoreCase(((C1068k) obj2).f5295c);
                                        }
                                    });
                                    int i5 = 0;
                                    while (i5 < c1069l3.f5310Z.size() - 1) {
                                        C1068k c1068k2 = c1069l3.f5310Z.get(i5);
                                        if (c1069l3.f5310Z.get(i5 + 1).f5295c.equals(c1068k2.f5295c)) {
                                            c1069l3.f5310Z.get(i5).f5304l = true;
                                            C1068k c1068k3 = new C1068k(c1068k2);
                                            c1068k3.f5294b = c1068k2.f5295c;
                                            c1068k3.f5302j = i5;
                                            int i6 = 1;
                                            while (true) {
                                                i4 = i5 + i6;
                                                if (!c1069l3.f5310Z.get(i4).f5295c.equals(c1068k2.f5295c)) {
                                                    break;
                                                }
                                                c1069l3.f5310Z.get(i4).f5304l = true;
                                                c1068k3.f5301i++;
                                                c1068k3.f5300h += c1069l3.f5310Z.get(i4).f5300h;
                                                if (i4 >= c1069l3.f5310Z.size() - 1) {
                                                    break;
                                                } else {
                                                    i6++;
                                                }
                                            }
                                            c1068k3.f5297e = C1068k.m2679a(c1068k3.f5300h);
                                            c1069l3.f5310Z.add(i5, c1068k3);
                                        } else {
                                            i4 = i5;
                                        }
                                        C1068k c1068k4 = c1069l3.f5310Z.get(i5);
                                        if (c1068k4.f5305m) {
                                            c1069l3.f5311a0.add(c1068k4);
                                        }
                                        i5 = i4 + 1;
                                    }
                                    Collections.sort(c1069l3.f5311a0, new Comparator() { // from class: c.c.a.v3.l0.g
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            int i7 = C1069l.f5307n0;
                                            return ((C1068k) obj2).f5300h - ((C1068k) obj).f5300h;
                                        }
                                    });
                                    c1069l3.f5311a0.add(0, new C1068k());
                                    c1069l3.f5314d0.f947a.m542b();
                                    c1069l3.f5315e0.setRefreshing(false);
                                }
                            });
                        }
                    }).start();
                }
                if (c1069l.f5313c0.toString().contains(c1069l.f5309Y)) {
                    if (a.m2195i(a.m2191e("0"), c1069l.f5309Y, c1069l.f5313c0.toString())) {
                        c1069l.f5311a0.remove(c1069l.f5323m0);
                    } else {
                        String strM2189c = a.m2189c(a.m2191e("\\d*"), c1069l.f5309Y, c1069l.f5313c0.toString(), "");
                        h c1153h = new h(c1069l.m303h());
                        c1153h.m2714e(c1069l.m337y(R.string.c1));
                        c1153h.m2710a(strM2189c);
                        c1153h.m2712c(c1069l.m337y(R.string.eg));
                        c1153h.f5539a.show();
                    }
                    c1069l.f5315e0.setEnabled(true);
                    c1069l.f5314d0.f947a.m542b();
                }
                return false;
            }
        });
        q3 runnableC0964q4 = this.f5312b0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4967W);
        sb.append("shell dumpsys meminfo;echo ");
        a.m2193g(sb, this.f5308X, runnableC0964q4);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.bb, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.no);
        this.f5315e0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0166h() { // from class: c.c.a.v3.l0.i
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0166h
            /* JADX INFO: renamed from: a */
            public final void mo726a() {
                C1069l c1069l = this.f5279a;
                q3 runnableC0964q3 = c1069l.f5312b0;
                StringBuilder sb = new StringBuilder();
                sb.append(c1069l.f4967W);
                sb.append("shell dumpsys meminfo;echo ");
                a.m2193g(sb, c1069l.f5308X, runnableC0964q3);
            }
        });
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.lm);
        recyclerView.setLayoutManager(new LinearLayoutManager(m303h()));
        C1067j c1067j = new C1067j(this, this.f5311a0);
        this.f5314d0 = c1067j;
        recyclerView.setAdapter(c1067j);
        m2646G0().f6456H.f4837a.set(5, this);
        if (m2646G0().f6470z == 5) {
            mo2641I0();
        }
        return viewInflate;
    }
}
