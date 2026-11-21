package c.c.a.v3.j0;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.didjdk.adbhelper.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import b.s.m;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.v3.g0;
import c.c.a.x3.g;

/* JADX INFO: renamed from: c.c.a.v3.j0.d */
/* JADX INFO: loaded from: classes.dex */
public class C1032d extends g0 {

    /* JADX INFO: renamed from: n0 */
    public StringBuilder f5125n0;

    /* JADX INFO: renamed from: w0 */
    public SwipeRefreshLayout f5134w0;

    /* JADX INFO: renamed from: x0 */
    public C1033e f5135x0;

    /* JADX INFO: renamed from: y0 */
    public q3 f5136y0;

    /* JADX INFO: renamed from: X */
    public final String f5109X = a.q();

    /* JADX INFO: renamed from: Y */
    public final String f5110Y = a.q();

    /* JADX INFO: renamed from: Z */
    public final String f5111Z = a.q();

    /* JADX INFO: renamed from: a0 */
    public final String f5112a0 = a.q();

    /* JADX INFO: renamed from: b0 */
    public final String f5113b0 = a.q();

    /* JADX INFO: renamed from: c0 */
    public final String f5114c0 = a.q();

    /* JADX INFO: renamed from: d0 */
    public final String f5115d0 = a.q();

    /* JADX INFO: renamed from: e0 */
    public final String f5116e0 = a.q();

    /* JADX INFO: renamed from: f0 */
    public final String f5117f0 = a.q();

    /* JADX INFO: renamed from: g0 */
    public final String f5118g0 = a.q();

    /* JADX INFO: renamed from: h0 */
    public final String f5119h0 = a.q();

    /* JADX INFO: renamed from: i0 */
    public final String f5120i0 = a.q();

    /* JADX INFO: renamed from: j0 */
    public final String f5121j0 = a.q();

    /* JADX INFO: renamed from: k0 */
    public final String f5122k0 = a.q();

    /* JADX INFO: renamed from: l0 */
    public final String f5123l0 = a.q();

    /* JADX INFO: renamed from: m0 */
    public final String f5124m0 = a.q();

    /* JADX INFO: renamed from: o0 */
    public Map<String, String> f5126o0 = new HashMap();

    /* JADX INFO: renamed from: p0 */
    public Map<String, String> f5127p0 = new HashMap();

    /* JADX INFO: renamed from: q0 */
    public Map<String, String> f5128q0 = new HashMap();

    /* JADX INFO: renamed from: r0 */
    public Map<String, String> f5129r0 = new HashMap();

    /* JADX INFO: renamed from: s0 */
    public Map<String, String> f5130s0 = new HashMap();

    /* JADX INFO: renamed from: t0 */
    public Map<String, String> f5131t0 = new HashMap();

    /* JADX INFO: renamed from: u0 */
    public Map<String, String> f5132u0 = new HashMap();

    /* JADX INFO: renamed from: v0 */
    public Map<String, String> f5133v0 = new HashMap();

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: I0 */
    public void mo2641I0() {
        super.mo2641I0();
        SwipeRefreshLayout swipeRefreshLayout = this.f5134w0;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        this.f5125n0 = new StringBuilder();
        q3 runnableC0964q3 = new q3(m303h());
        this.f5136y0 = runnableC0964q3;
        runnableC0964q3.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.v3.j0.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i;
                String str;
                String str2;
                final C1032d c1032d = this.f5106a;
                c1032d.f5125n0.append((String) message.obj);
                if (c1032d.f5125n0.toString().contains(c1032d.f5112a0)) {
                    String[] strArrSplit = c1032d.f5125n0.toString().split(c1032d.f5109X);
                    int length = strArrSplit.length;
                    int i2 = 0;
                    while (true) {
                        String strM2203q = "";
                        if (i2 >= length) {
                            break;
                        }
                        String str3 = strArrSplit[i2];
                        String[] strArrSplit2 = str3.split("\n");
                        for (int i3 = 0; i3 < strArrSplit2.length; i3++) {
                            strArrSplit2[i3] = strArrSplit2[i3].trim();
                        }
                        if (strArrSplit2[0].equals(c1032d.f5113b0)) {
                            try {
                                c1032d.m2664O0(strArrSplit2);
                            } catch (Exception unused) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5122k0)) {
                            try {
                                c1032d.m2663N0(strArrSplit2);
                            } catch (Exception unused2) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5123l0)) {
                            try {
                                c1032d.m2660K0(strArrSplit2);
                            } catch (Exception unused3) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5116e0)) {
                            try {
                                for (String str4 : strArrSplit2) {
                                    if (str4.matches(".+:.+")) {
                                        c1032d.f5130s0.put(str4.split("\\s*:\\s*")[0].trim(), str4.split("\\s*:\\s*")[1]);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5117f0)) {
                            try {
                                c1032d.m2665P0(strArrSplit2);
                            } catch (Exception unused5) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5124m0)) {
                            try {
                                for (String str5 : strArrSplit2) {
                                    if (str5.matches(".+\\s*:\\s*.+")) {
                                        c1032d.f5133v0.put(str5.trim().split("\\s*:\\s*")[0], str5.trim().split("\\s*:\\s*")[1]);
                                    }
                                }
                            } catch (Exception unused6) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5115d0)) {
                            try {
                                c1032d.m2661L0(strArrSplit2);
                            } catch (Exception unused7) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5114c0)) {
                            try {
                                for (String str6 : strArrSplit2) {
                                    if (str6.trim().matches(".+:\\s+.+")) {
                                        c1032d.f5128q0.put(str6.split(":\\s+")[0], str6.split(":\\s+")[1]);
                                    }
                                }
                            } catch (Exception unused8) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5118g0)) {
                            try {
                                c1032d.m2662M0(strArrSplit2);
                            } catch (Exception unused9) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5119h0)) {
                            try {
                                c1032d.m2662M0(strArrSplit2);
                            } catch (Exception unused10) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5120i0)) {
                            try {
                                c1032d.m2662M0(strArrSplit2);
                            } catch (Exception unused11) {
                            }
                        }
                        if (strArrSplit2[0].equals(c1032d.f5121j0)) {
                            try {
                                c1032d.m2662M0(strArrSplit2);
                            } catch (Exception unused12) {
                            }
                        }
                        if (str3.contains(c1032d.f5112a0)) {
                            if (str3.contains("Permission denied")) {
                                c1032d.m2646G0().f6464t = "/sdcard/adbhelper";
                                strM2203q = a.m2203q(new StringBuilder(), c1032d.f4967W, "shell mkdir /sdcard/adbhelper;");
                            }
                            c1032d.f5136y0.m2627c(strM2203q + (c1032d.f4967W + "push " + c1032d.m303h().getFilesDir().getAbsolutePath() + "/scrcpy_server " + c1032d.m2646G0().f6464t + "/scrcpy_server.apk;" + c1032d.f4967W + "push " + c1032d.m303h().getFilesDir().getAbsolutePath() + "/server " + c1032d.m2646G0().f6464t + "/adbhelper_server.apk;echo " + c1032d.f5111Z));
                        }
                        i2++;
                    }
                    C1033e c1033e = c1032d.f5135x0;
                    if (c1033e != null) {
                        C1033e.d dVar = new C1033e.d(c1033e);
                        dVar.f5149a = 0;
                        c1033e.f5138d.add(dVar);
                    }
                    new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.j0.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1032d c1032d2 = c1032d;
                            Objects.requireNonNull(c1032d2);
                            try {
                                c1032d2.f5136y0.f4880b.write(g.m2696a(c1032d2.m303h().getPackageManager().getApplicationInfo(c1032d2.m303h().getPackageName(), 0).sourceDir));
                                c1032d2.f5136y0.f4880b.flush();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }, 7051L);
                    c1032d.f5135x0.m2666i(c1032d.m337y(R.string.hc));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.fm), m.m1971o(c1032d.f5126o0.get("ro.product.name")));
                    c1032d.m2646G0().f6467w = m.m1972p(c1032d.f5126o0.get("ro.boot.serialno"), "");
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.gj), m.m1971o(c1032d.f5126o0.get("ro.boot.serialno")));
                    c1032d.f5135x0.m2667j("API", m.m1971o(c1032d.f5126o0.get("ro.build.version.sdk")));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.gh), m.m1971o(c1032d.f5126o0.get("ro.build.version.security_patch")));
                    c1032d.f5135x0.m2667j("Fingerprint", m.m1971o(c1032d.f5126o0.get("ro.build.fingerprint")));
                    c1032d.f5135x0.m2666i("CPU");
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.fl), m.m1971o(c1032d.f5129r0.get("Processor")));
                    C1033e c1033e2 = c1032d.f5135x0;
                    String strM337y = c1032d.m337y(R.string.bb);
                    StringBuilder sbM2191e = a.m2191e("");
                    String str7 = c1032d.f5129r0.get("processor");
                    if (str7 == null) {
                        i = 0;
                    } else {
                        try {
                            i = Integer.parseInt(str7);
                        } catch (NumberFormatException unused13) {
                            i = 0;
                        }
                    }
                    sbM2191e.append(i + 1);
                    c1033e2.m2667j(strM337y, sbM2191e.toString());
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.a1), m.m1971o(c1032d.f5126o0.get("ro.product.cpu.abilist")));
                    c1032d.f5135x0.m2666i(c1032d.m337y(R.string.ga));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.gd), m.m1971o(c1032d.f5127p0.get("Override density")));
                    c1032d.f5135x0.m2667j("PPI", m.m1971o(c1032d.f5127p0.get("ppi")));
                    C1033e c1033e3 = c1032d.f5135x0;
                    String strM337y2 = c1032d.m337y(R.string.ge);
                    String str8 = c1032d.f5127p0.get("Physical size");
                    String str9 = c1032d.f5127p0.get("ppi");
                    String str10 = null;
                    try {
                        str = String.format("%.2f", Double.valueOf(Math.sqrt(Math.pow(Integer.parseInt(str8.split("\\s")[0]) / Float.parseFloat(str9.split("\\s")[0]), 2.0d) + Math.pow(Integer.parseInt(str8.split("\\s")[2]) / Float.parseFloat(str9.split("\\s")[2]), 2.0d)))) + " 英寸";
                    } catch (Exception unused14) {
                        str = null;
                    }
                    c1033e3.m2667j(strM337y2, m.m1971o(str));
                    c1032d.f5135x0.m2666i(c1032d.m337y(R.string.h1));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.he), m.m1971o(m.m1968l(c1032d.f5131t0.get("/system"), 1)));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.c8), m.m1971o(m.m1968l(c1032d.f5131t0.get("external"), 1)));
                    c1032d.f5135x0.m2666i(c1032d.m337y(R.string.cr));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.e8), c1032d.f5126o0.get("gsm.network.type"));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.eq), c1032d.f5126o0.get("gsm.operator.alpha"));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.d5), c1032d.f5132u0.get("mobile ip"));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.i2), m.m1971o(c1032d.f5132u0.get("wifi ssid")));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.i0), c1032d.f5132u0.get("wifi ip"));
                    c1032d.f5135x0.m2666i(c1032d.m337y(R.string.aj));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.ak), m.m1972p(c1032d.f5133v0.get("level"), "-") + " %");
                    C1033e c1033e4 = c1032d.f5135x0;
                    String strM337y3 = c1032d.m337y(R.string.al);
                    Map<String, String> map = c1032d.f5133v0;
                    try {
                        if (map.get("AC powered").equals("true")) {
                            str2 = "交流充电";
                        } else if (map.get("USB powered").equals("true")) {
                            str2 = "USB充电";
                        } else {
                            str2 = map.get("Wireless powered").equals("true") ? "无线充电" : "未充电";
                        }
                    } catch (Exception unused15) {
                        str2 = "未知";
                    }
                    c1033e4.m2667j(strM337y3, m.m1971o(str2));
                    c1032d.f5135x0.m2667j(c1032d.m337y(R.string.hy), m.m1972p(c1032d.f5133v0.get("voltage"), "-") + " mV");
                    C1033e c1033e5 = c1032d.f5135x0;
                    String strM337y4 = c1032d.m337y(R.string.hg);
                    try {
                        str10 = (Integer.parseInt(c1032d.f5133v0.get("temperature")) / 10) + " ℃";
                    } catch (Exception unused16) {
                    }
                    c1033e5.m2667j(strM337y4, str10);
                    c1032d.m2646G0().f6468x = m.m1971o(c1032d.f5127p0.get("Physical size"));
                    Objects.requireNonNull(c1032d.m2646G0());
                    c1032d.m2646G0().f6469y = m.m1971o(c1032d.f5126o0.get("ro.build.version.sdk"));
                    c1032d.f5135x0.f947a.m542b();
                    c1032d.f5134w0.setRefreshing(false);
                    StringBuilder sb = c1032d.f5125n0;
                    sb.delete(0, sb.toString().length());
                    StringBuilder sb2 = c1032d.f5125n0;
                    sb2.delete(0, sb2.toString().length());
                }
                if (c1032d.f5125n0.toString().contains(c1032d.f5111Z)) {
                    c1032d.m2646G0().f6462r = true;
                    StringBuilder sb3 = c1032d.f5125n0;
                    sb3.delete(0, sb3.toString().length());
                }
                return false;
            }
        });
        StringBuilder sbM2191e = a.m2191e("echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5113b0);
        sbM2191e.append(";getprop;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5122k0);
        sbM2191e.append(";dumpsys display | grep DisplayInfo;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5115d0);
        sbM2191e.append(";cat /proc/cpuinfo;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5114c0);
        sbM2191e.append(";cat /proc/meminfo;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5118g0);
        sbM2191e.append(";df;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5119h0);
        sbM2191e.append(";df /system;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5120i0);
        sbM2191e.append(";df /data;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5121j0);
        sbM2191e.append(";df $EXTERNAL_STORAGE;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5117f0);
        sbM2191e.append(";dumpsys mount;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5116e0);
        sbM2191e.append(";dumpsys diskstats;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5123l0);
        sbM2191e.append(";dumpsys connectivity | grep NetworkAgentInfo;echo ");
        sbM2191e.append(this.f5109X);
        sbM2191e.append(this.f5124m0);
        sbM2191e.append(";dumpsys battery;echo ");
        sbM2191e.append(this.f5110Y);
        String string = sbM2191e.toString();
        StringBuilder sbM2191e2 = a.m2191e("echo ");
        sbM2191e2.append(this.f5109X);
        sbM2191e2.append(";");
        sbM2191e2.append(this.f4967W);
        sbM2191e2.append("shell ls /data/local/tmp 2>&1;echo ");
        sbM2191e2.append(this.f5112a0);
        String string2 = sbM2191e2.toString();
        q3 runnableC0964q4 = this.f5136y0;
        StringBuilder sb = new StringBuilder();
        a.m2194h(sb, this.f4967W, "shell '", string, "';");
        a.m2193g(sb, string2, runnableC0964q4);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m2660K0(String[] strArr) {
        for (String str : strArr) {
            if (str.contains("ni{[type:")) {
                String str2 = str.split("ni\\{\\[type:", 2)[1].split(",", 2)[0];
                String strTrim = str.split("Link\\s*Addresses:")[1].split("]")[0].replace("[", "").replaceAll("/.+?,", "\n").replaceAll("/.+", "").trim();
                if (str2.contains("MOBILE")) {
                    this.f5132u0.put("mobile ip", strTrim);
                }
                if (str2.contains("WIFI")) {
                    String strReplace = str.split("extra:")[1].split(",")[0].replace("\"", "");
                    this.f5132u0.put("wifi ip", strTrim);
                    this.f5132u0.put("wifi ssid", strReplace);
                }
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m2661L0(String[] strArr) {
        for (String str : strArr) {
            if (str.matches("Processor\\s*:.+")) {
                this.f5129r0.put(str.split("\\s*:\\s*")[0], str.split("\\s*:\\s*")[1]);
            }
            if (str.matches("processor\\s*:.+")) {
                this.f5129r0.put(str.split("\\s*:\\s*")[0], str.split("\\s*:\\s*")[1]);
            }
            if (str.contains("Hardware")) {
                this.f5129r0.put(str.split("\\s+: ")[0], str.split("\\s+: ")[1]);
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2662M0(String[] strArr) {
        if (strArr[0].equals(this.f5118g0)) {
            for (String str : strArr) {
                if (str.matches(".+\\s+?.+")) {
                    String[] strArrSplit = str.split("\\s+");
                    this.f5131t0.put(strArrSplit[strArrSplit.length - 1], str);
                }
            }
        }
        if (strArr[0].equals(this.f5119h0) && strArr.length > 2) {
            this.f5131t0.put("/system", strArr[2]);
        }
        if (strArr[0].equals(this.f5120i0) && strArr.length > 2) {
            this.f5131t0.put("/data", strArr[2]);
        }
        if (!strArr[0].equals(this.f5121j0) || strArr.length <= 2) {
            return;
        }
        this.f5131t0.put("external", strArr[2]);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m2663N0(String[] strArr) {
        for (String str : strArr) {
            if (str.contains("{") && str.contains(",")) {
                String[] strArrSplit = str.substring(str.indexOf("{") + 1, str.length() - 1).split(",\\s*");
                int i = 2;
                if (str.contains("mBaseDisplayInfo")) {
                    int length = strArrSplit.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = strArrSplit[i2];
                        if (str2.contains("real ")) {
                            this.f5127p0.put("Physical size", str2.split(" ", i)[1]);
                        }
                        if (str2.contains("density ")) {
                            this.f5127p0.put("Base density", str2.split(" ")[1]);
                            this.f5127p0.put("ppi", str2.split("\\(")[1].split("\\)")[0]);
                        }
                        i2++;
                        i = 2;
                    }
                }
                if (str.contains("mOverrideDisplayInfo")) {
                    for (String str3 : strArrSplit) {
                        if (str3.contains("real ")) {
                            this.f5127p0.put("Override size", str3.split(" ", 2)[1]);
                        }
                        if (str3.contains("density ")) {
                            this.f5127p0.put("Override density", str3.split(" ")[1]);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public void mo282O(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: renamed from: O0 */
    public final void m2664O0(String[] strArr) {
        for (String str : strArr) {
            if (str.matches("\\[.+]: \\[.+]")) {
                this.f5126o0.put(str.split("]: \\[")[0].substring(1).trim(), str.split("]: \\[")[1].replace("]", "").trim());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m334w0(true);
        View viewInflate = layoutInflater.inflate(R.layout.b9, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.lu);
        this.f5134w0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0166h() { // from class: c.c.a.v3.j0.b
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0166h
            /* JADX INFO: renamed from: a */
            public final void mo726a() {
                this.f5107a.f5134w0.setRefreshing(false);
            }
        });
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.lq);
        recyclerView.setLayoutManager(new LinearLayoutManager(m303h()));
        C1033e c1033e = new C1033e(this);
        this.f5135x0 = c1033e;
        recyclerView.setAdapter(c1033e);
        m2646G0().f6456H.f4837a.set(0, this);
        mo2641I0();
        return viewInflate;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2665P0(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("VolumeInfo") && strArr[i + 1].contains("type=EMULATED")) {
                this.f5131t0.put("emulated", strArr[i + 3].trim().split("\\s+")[0].replace("path=", ""));
            }
            if (strArr[i].contains("VolumeInfo") && strArr[i + 1].contains("type=PUBLIC")) {
                this.f5131t0.put("removable", strArr[i + 3].trim().split("\\s+")[0].replace("path=", ""));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo296c0(Menu menu) {
    }
}
