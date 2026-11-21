package c.c.a.v3.i0;

import android.os.Handler;
import android.os.Message;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import c.a.a.a.a;
import c.c.a.q3;

/* JADX INFO: renamed from: c.c.a.v3.i0.q */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: g */
    public String f5036g;

    /* JADX INFO: renamed from: h */
    public String f5037h;

    /* JADX INFO: renamed from: i */
    public r f5038i;

    /* JADX INFO: renamed from: j */
    public final String f5039j;

    /* JADX INFO: renamed from: k */
    public q3 f5040k;

    /* JADX INFO: renamed from: l */
    public q3 f5041l;

    /* JADX INFO: renamed from: m */
    public StringBuilder f5042m;

    /* JADX INFO: renamed from: n */
    public StringBuilder f5043n;

    /* JADX INFO: renamed from: p */
    public int f5045p;

    /* JADX INFO: renamed from: q */
    public int f5046q;

    /* JADX INFO: renamed from: a */
    public final String f5030a = a.q();

    /* JADX INFO: renamed from: b */
    public final String f5031b = a.q();

    /* JADX INFO: renamed from: c */
    public final String f5032c = a.q();

    /* JADX INFO: renamed from: d */
    public final String f5033d = a.q();

    /* JADX INFO: renamed from: e */
    public final String f5034e = a.q();

    /* JADX INFO: renamed from: f */
    public final String f5035f = a.q();

    /* JADX INFO: renamed from: o */
    public boolean f5044o = false;

    /* JADX INFO: renamed from: r */
    public Map<String, String> f5047r = new HashMap();

    /* JADX INFO: renamed from: s */
    public boolean f5048s = false;

    public q(r c1023r) {
        this.f5038i = c1023r;
        this.f5039j = c1023r.f4967W;
        StringBuilder sbM2191e = a.m2191e("shell CLASSPATH=");
        sbM2191e.append(c1023r.m2646G0().f6464t);
        sbM2191e.append("/adbhelper_server.apk app_process ./ com.didjdk.adbhelper.Server ");
        sbM2191e.append(c1023r.m2646G0().f6464t);
        this.f5036g = sbM2191e.toString();
        this.f5037h = c1023r.m303h().getFilesDir().getAbsolutePath() + "/icons/" + c1023r.m2646G0().f6467w;
        File file = new File(this.f5037h);
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdir();
        }
        this.f5042m = new StringBuilder();
        q3 runnableC0964q3 = new q3(this.f5038i.m303h());
        this.f5040k = runnableC0964q3;
        runnableC0964q3.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.v3.i0.e
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                q c1022q = this.f5007a;
                c1022q.f5042m.append((String) message.obj);
                if (c1022q.f5042m.toString().contains(c1022q.f5031b)) {
                    for (String str : c1022q.f5042m.toString().split("\n")) {
                        if (str.contains(c1022q.f5031b)) {
                            Objects.requireNonNull(c1022q.f5038i.f5051Y.get(c1022q.f5045p));
                            c1022q.f5038i.f5054b0.m536d(c1022q.f5045p);
                            int i = c1022q.f5046q;
                            if (i == 0 || c1022q.f5045p != i) {
                                c1022q.f5038i.f5058f0.setProgress(c1022q.f5045p);
                            } else {
                                c1022q.m2653d();
                            }
                            c1022q.f5045p++;
                        }
                    }
                    StringBuilder sb = c1022q.f5042m;
                    sb.delete(0, sb.length());
                }
                return false;
            }
        });
        this.f5043n = new StringBuilder();
        q3 runnableC0964q4 = new q3(this.f5038i.m303h());
        this.f5041l = runnableC0964q4;
        runnableC0964q4.f4886h = true;
        runnableC0964q4.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.v3.i0.c
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                q c1022q = this.f5005a;
                c1022q.f5043n.append((String) message.obj);
                if (c1022q.f5043n.toString().contains("====loading") && c1022q.f5043n.toString().contains("packages====")) {
                    c1022q.f5048s = false;
                    c1022q.f5044o = true;
                    int i = Integer.parseInt(c1022q.f5043n.toString().split("====loading ")[1].split("\\s")[0]);
                    c1022q.f5038i.f5059g0.setVisibility(8);
                    c1022q.f5038i.f5058f0.setVisibility(0);
                    c1022q.f5038i.f5058f0.setMax(i);
                    c1022q.f5038i.f5058f0.setProgress(0);
                    StringBuilder sb = c1022q.f5043n;
                    sb.delete(0, sb.length());
                }
                if (!c1022q.f5044o || message.what != 1) {
                    if (c1022q.f5043n.toString().contains(c1022q.f5030a)) {
                        c1022q.m2652c(c1022q.f5041l);
                    }
                    c1022q.m2651b(c1022q.f5043n);
                    return false;
                }
                for (String str : c1022q.f5043n.toString().split("\n")) {
                    try {
                        c1022q.m2654e(new JSONObject(str));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if (c1022q.f5043n.toString().contains(c1022q.f5030a)) {
                    c1022q.f5044o = false;
                    int size = c1022q.f5038i.f5051Y.size() - 1;
                    c1022q.f5046q = size;
                    if (c1022q.f5045p >= size) {
                        c1022q.m2653d();
                    }
                }
                StringBuilder sb2 = c1022q.f5043n;
                sb2.delete(0, sb2.length());
                c1022q.m2651b(c1022q.f5043n);
                return false;
            }
        });
        new Thread(new Runnable() { // from class: c.c.a.v3.i0.d
            @Override // java.lang.Runnable
            public final void run() {
                q c1022q = this.f5006b;
                while (!c1022q.f5038i.m2646G0().f6462r) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                c1022q.f5041l.m2627c(c1022q.f5039j + c1022q.f5036g + ";echo " + c1022q.f5030a);
            }
        }).start();
    }

    /* JADX INFO: renamed from: a */
    public final void m2650a(String[] strArr, boolean z, boolean z2) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (strArr[i].trim().matches("package:.+=.+")) {
                String str = strArr[i];
                C1027v c1027v = new C1027v();
                c1027v.f5093e = false;
                String strSubstring = str.substring(str.lastIndexOf("=") + 1);
                c1027v.f5091c = strSubstring;
                c1027v.f5092d = strSubstring;
                c1027v.f5089a = str.substring(8, str.lastIndexOf("="));
                c1027v.f5094f = z;
                c1027v.f5095g = z2;
                this.f5038i.f5051Y.add(c1027v);
                if (!this.f5048s) {
                    this.f5038i.f5050X.add(c1027v);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2651b(StringBuilder sb) {
        if (sb.toString().contains(this.f5032c)) {
            m2650a(sb.toString().split("\n"), true, true);
            sb.delete(0, sb.length());
        }
        if (sb.toString().contains(this.f5033d)) {
            m2650a(sb.toString().split("\n"), true, false);
            sb.delete(0, sb.length());
        }
        if (sb.toString().contains(this.f5034e)) {
            m2650a(sb.toString().split("\n"), false, true);
            sb.delete(0, sb.length());
        }
        if (sb.toString().contains(this.f5035f)) {
            m2650a(sb.toString().split("\n"), false, false);
            sb.delete(0, sb.length());
            this.f5038i.f5059g0.setVisibility(8);
            m2653d();
        }
    }

    /* JADX INFO: renamed from: c */
    public native void c(q3 runnableC0964q3);
    public void m2652c(q3 runnableC0964q3) {
        c(runnableC0964q3);
    }

    /* JADX INFO: renamed from: d */
    public final void m2653d() {
        this.f5048s = true;
        this.f5038i.f5058f0.setVisibility(4);
        for (C1027v c1027v : this.f5038i.f5051Y) {
            this.f5047r.put(c1027v.f5091c, c1027v.f5095g + " " + c1027v.f5092d);
        }
        this.f5038i.m2655K0(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m2654e(JSONObject jSONObject) {
        q3 runnableC0964q3;
        StringBuilder sb;
        String str;
        if (jSONObject.has("package")) {
            C1027v c1027v = new C1027v(jSONObject);
            if (c1027v.f5093e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f5037h);
                sb2.append("/");
                c1027v.f5103o = a.m2203q(sb2, c1027v.f5091c, ".png");
                File file = new File(c1027v.f5103o);
                c1027v.f5104p = file;
                if (file.exists()) {
                    runnableC0964q3 = this.f5040k;
                    sb = new StringBuilder();
                } else {
                    runnableC0964q3 = this.f5040k;
                    sb = new StringBuilder();
                    sb.append(this.f5039j);
                    sb.append("pull ");
                    sb.append(this.f5038i.m2646G0().f6464t);
                    sb.append("/icons/");
                    sb.append(c1027v.f5091c);
                    sb.append(".png ");
                    sb.append(this.f5037h);
                    str = ";echo ";
                }
                sb.append(str);
                a.m2193g(sb, this.f5031b, runnableC0964q3);
                this.f5038i.f5051Y.add(c1027v);
                if (this.f5048s) {
                }
                this.f5038i.f5050X.add(c1027v);
            }
            runnableC0964q3 = this.f5040k;
            sb = new StringBuilder();
            str = "echo ";
            sb.append(str);
            a.m2193g(sb, this.f5031b, runnableC0964q3);
            this.f5038i.f5051Y.add(c1027v);
            if (this.f5048s) {
                this.f5038i.f5050X.add(c1027v);
            }
        }
    }
}
