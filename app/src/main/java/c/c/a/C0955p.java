package c.c.a;

import android.os.Handler;
import android.os.Message;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.ConnectActivity.C1316c;
import com.didjdk.adbhelper.R;
import java.util.Iterator;
import b.s.m;
import c.a.a.a.a;
import c.c.a.p115u3.C0984a;

/* JADX INFO: renamed from: c.c.a.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0955p implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConnectActivity f4869a;

    /* JADX WARN: Code duplicated, block: B:100:0x0389  */
    /* JADX WARN: Code duplicated, block: B:102:0x038d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0395  */
    /* JADX WARN: Code duplicated, block: B:105:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:106:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x03db  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:113:0x0401  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        StringBuilder sbM2191e;
        String string;
        q3 runnableC0964q3;
        StringBuilder sb;
        String string2;
        C0984a c0984a;
        q3 runnableC0964q4;
        String strM2203q;
        final ConnectActivity connectActivity = this.f4869a;
        connectActivity.f6345C.append((String) message.obj);
        if (connectActivity.f6371y == 4) {
            if (connectActivity.f6345C.toString().contains(connectActivity.f6366t.m2687a("hXWUm+d5o7qZcEQx2O2EHfSVIQ=="))) {
                m.m1952H(connectActivity, connectActivity.getString(R.string.ey));
                connectActivity.f6351I.m2627c(connectActivity.f6369w + connectActivity.f6365s + ConnectActivity.f6340W);
                connectActivity.z();
                StringBuilder sb2 = connectActivity.f6345C;
                sb2.delete(0, sb2.length());
            }
            if (connectActivity.f6345C.toString().contains(connectActivity.f6366t.m2687a("kGGelOdu")) || connectActivity.f6345C.toString().contains(connectActivity.f6366t.m2687a("n26Bme5jtPycc1o8"))) {
                m.m1952H(connectActivity, connectActivity.getString(R.string.ew));
                connectActivity.z();
                StringBuilder sb3 = connectActivity.f6345C;
                sb3.delete(0, sb3.length());
            }
        }
        String string3 = connectActivity.f6345C.toString();
        String str = ConnectActivity.f6339V;
        if (string3.contains(str)) {
            if (connectActivity.f6345C.toString().contains(connectActivity.f6366t.m2687a("s3KFl/Aw"))) {
                int i = connectActivity.f6368v;
                if (i < 5047) {
                    connectActivity.f6368v = i + 1;
                    StringBuilder sbM2191e2 = a.m2191e("adb -P ");
                    sbM2191e2.append(connectActivity.f6368v);
                    sbM2191e2.append(" ");
                    connectActivity.f6369w = sbM2191e2.toString();
                    connectActivity.f6351I.m2627c(connectActivity.f6369w + "kill-server 2>&1;" + connectActivity.f6369w + "start-server 2>&1;echo " + str);
                }
                StringBuilder sb4 = connectActivity.f6345C;
                sb4.delete(0, sb4.length());
            }
            if (connectActivity.f6345C.toString().contains(connectActivity.f6366t.m2687a("smGSle1k8K+YfVo8nfnFBxmzfTu80w2Tq23Z"))) {
                connectActivity.f6353K = true;
                connectActivity.f6354L.setText(R.string.fs);
                new Handler().postDelayed(new RunnableC1160z2(connectActivity), 1000L);
                StringBuilder sb5 = connectActivity.f6345C;
                sb5.delete(0, sb5.length());
            }
        }
        if (connectActivity.f6345C.toString().contains(ConnectActivity.f6340W)) {
            String[] strArrSplit = connectActivity.f6345C.toString().split("\n");
            connectActivity.f6347E.clear();
            for (String str2 : strArrSplit) {
                if (str2.matches(".*\\s+.*\\stransport_id:.*")) {
                    C0984a c0984a2 = new C0984a(str2);
                    if (c0984a2.f4926a.equals(connectActivity.f6348F)) {
                        connectActivity.f6350H = c0984a2;
                        if (!c0984a2.f4927b.equals("device") || (connectActivity.f6347E.size() >= 2 && !m.J(connectActivity))) {
                            if (c0984a2.f4927b.equals("unauthorized")) {
                                runnableC0964q4 = connectActivity.f6351I;
                                strM2203q = connectActivity.f6369w + connectActivity.f6365s + ConnectActivity.f6340W;
                            } else {
                                runnableC0964q4 = connectActivity.f6351I;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(connectActivity.f6369w);
                                sb6.append("-t ");
                                strM2203q = a.m2203q(sb6, c0984a2.f4929d, " reconnect");
                            }
                            runnableC0964q4.m2627c(strM2203q);
                        } else {
                            if (!c0984a2.f4926a.equals(connectActivity.f6364r)) {
                                String str3 = connectActivity.f6349G;
                                Iterator<String> it = connectActivity.f6357O.iterator();
                                while (it.hasNext()) {
                                    if (it.next().equals(str3)) {
                                        it.remove();
                                    }
                                }
                                connectActivity.f6357O.add(0, str3);
                                connectActivity.f6357O.size();
                                ConnectActivity.C1316c c1316c = connectActivity.new C1316c(connectActivity, R.layout.bq, connectActivity.f6357O);
                                connectActivity.f6356N = c1316c;
                                connectActivity.f6372z.setAdapter(c1316c);
                            }
                            connectActivity.f6347E.add(c0984a2);
                            connectActivity.f6370x.sendEmptyMessage(1);
                        }
                    } else if (c0984a2.f4927b.equals("device") && (m.J(connectActivity) || connectActivity.f6347E.size() < 2)) {
                        connectActivity.f6347E.add(c0984a2);
                    }
                }
            }
            if (connectActivity.f6347E.size() == 0) {
                connectActivity.f6350H = null;
                connectActivity.f6354L.setText(R.string.ea);
            } else {
                connectActivity.f6354L.setText(connectActivity.getString(R.string.b7) + connectActivity.f6347E.size() + connectActivity.getString(R.string.i3));
            }
            connectActivity.f6355M.notifyDataSetChanged();
            StringBuilder sb7 = connectActivity.f6345C;
            sb7.delete(0, sb7.length());
        }
        String string4 = connectActivity.f6345C.toString();
        String str4 = ConnectActivity.f6338U;
        if (string4.contains(str4)) {
            String string5 = connectActivity.f6345C.toString();
            String str5 = "";
            string5.replace("\n", "").replace(str4, "").replace(connectActivity.f6364r, "device");
            if (string5.contains("no host in") || string5.contains("failed to resolve host")) {
                sbM2191e = a.m2191e("无法连接到");
                sbM2191e.append(connectActivity.f6348F);
                sbM2191e.append("主机");
            } else {
                if (string5.contains("failed to connect")) {
                    if (string5.contains("Connection timed out")) {
                        str5 = "：连接超时";
                    } else if (string5.contains("Connection refused")) {
                        str5 = "：连接被拒绝";
                    } else if (string5.contains("No route to host")) {
                        str5 = "：找不到主机";
                    }
                    sbM2191e = new StringBuilder();
                    sbM2191e.append(connectActivity.f6348F);
                    sbM2191e.append("连接失败");
                    sbM2191e.append(str5);
                } else if (string5.contains("Connection refused")) {
                    string = "拒绝连接";
                    m.m1952H(connectActivity, string);
                    connectActivity.f6370x.sendEmptyMessage(2);
                } else if (string5.contains("already connected to")) {
                    C0984a c0984a3 = connectActivity.f6350H;
                    if (c0984a3 == null || !string5.contains(c0984a3.f4926a) || connectActivity.f6350H.f4927b.equals("device")) {
                        StringBuilder sbM2191e3 = a.m2191e("已经连接到");
                        sbM2191e3.append(connectActivity.f6348F);
                        m.m1952H(connectActivity, sbM2191e3.toString());
                        q3 runnableC0964q5 = connectActivity.f6351I;
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(connectActivity.f6369w);
                        sb8.append(connectActivity.f6365s);
                        a.m2193g(sb8, ConnectActivity.f6340W, runnableC0964q5);
                        connectActivity.f6370x.sendEmptyMessage(3);
                        if (!string5.contains("reconnecting")) {
                            c0984a = connectActivity.f6350H;
                            if (c0984a != null) {
                                if (string5.contains(c0984a.f4926a)) {
                                    runnableC0964q3 = connectActivity.f6351I;
                                    sb = new StringBuilder();
                                    sb.append(connectActivity.f6369w);
                                    sb.append("connect ");
                                    sb.append(connectActivity.f6350H.f4926a);
                                    sb.append(connectActivity.f6366t.m2687a("7WWUkO0q"));
                                }
                                sb.append(str4);
                                string2 = sb.toString();
                            } else {
                                q3 runnableC0964q6 = connectActivity.f6351I;
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(connectActivity.f6369w);
                                sb9.append(connectActivity.f6365s);
                                a.m2193g(sb9, ConnectActivity.f6340W, runnableC0964q6);
                            }
                            if (string5.replace("\n", "").matches("connected.+")) {
                                runnableC0964q3 = connectActivity.f6351I;
                                sb = new StringBuilder();
                                sb.append(connectActivity.f6369w);
                                sb.append(connectActivity.f6365s);
                                str4 = ConnectActivity.f6340W;
                                sb.append(str4);
                                string2 = sb.toString();
                            } else if (string5.contains("failed to authenticate")) {
                                new Thread(new RunnableC0884a3(connectActivity)).start();
                                new Thread(new Runnable() { // from class: c.c.a.u
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConnectActivity connectActivity2 = connectActivity;
                                        while (connectActivity2.f6371y == 0) {
                                            q3 runnableC0964q7 = connectActivity2.f6351I;
                                            StringBuilder sb10 = new StringBuilder();
                                            sb10.append(connectActivity2.f6369w);
                                            sb10.append(connectActivity2.f6365s);
                                            a.m2193g(sb10, ConnectActivity.f6340W, runnableC0964q7);
                                            try {
                                                Thread.sleep(2000L);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                }).start();
                            }
                        } else if (string5.replace("\n", "").matches("connected.+")) {
                            runnableC0964q3 = connectActivity.f6351I;
                            sb = new StringBuilder();
                            sb.append(connectActivity.f6369w);
                            sb.append(connectActivity.f6365s);
                            str4 = ConnectActivity.f6340W;
                            sb.append(str4);
                            string2 = sb.toString();
                        } else if (string5.contains("failed to authenticate")) {
                            new Thread(new RunnableC0884a3(connectActivity)).start();
                            new Thread(new Runnable() { // from class: c.c.a.u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ConnectActivity connectActivity2 = connectActivity;
                                    while (connectActivity2.f6371y == 0) {
                                        q3 runnableC0964q7 = connectActivity2.f6351I;
                                        StringBuilder sb10 = new StringBuilder();
                                        sb10.append(connectActivity2.f6369w);
                                        sb10.append(connectActivity2.f6365s);
                                        a.m2193g(sb10, ConnectActivity.f6340W, runnableC0964q7);
                                        try {
                                            Thread.sleep(2000L);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }).start();
                        }
                    } else {
                        runnableC0964q3 = connectActivity.f6351I;
                        string2 = connectActivity.f6369w + "-t " + connectActivity.f6350H.f4929d + connectActivity.f6366t.m2687a("9nKSm+1kvrmPaBMtm/WKVA==") + str4;
                    }
                    runnableC0964q3.m2627c(string2);
                } else if (!string5.contains("reconnecting")) {
                    c0984a = connectActivity.f6350H;
                    if (c0984a != null) {
                        if (string5.contains(c0984a.f4926a)) {
                            runnableC0964q3 = connectActivity.f6351I;
                            sb = new StringBuilder();
                            sb.append(connectActivity.f6369w);
                            sb.append("connect ");
                            sb.append(connectActivity.f6350H.f4926a);
                            sb.append(connectActivity.f6366t.m2687a("7WWUkO0q"));
                        }
                        sb.append(str4);
                        string2 = sb.toString();
                        runnableC0964q3.m2627c(string2);
                    } else {
                        q3 runnableC0964q7 = connectActivity.f6351I;
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(connectActivity.f6369w);
                        sb10.append(connectActivity.f6365s);
                        a.m2193g(sb10, ConnectActivity.f6340W, runnableC0964q7);
                    }
                    if (string5.replace("\n", "").matches("connected.+")) {
                        runnableC0964q3 = connectActivity.f6351I;
                        sb = new StringBuilder();
                        sb.append(connectActivity.f6369w);
                        sb.append(connectActivity.f6365s);
                        str4 = ConnectActivity.f6340W;
                        sb.append(str4);
                        string2 = sb.toString();
                        runnableC0964q3.m2627c(string2);
                    } else if (string5.contains("failed to authenticate")) {
                        new Thread(new RunnableC0884a3(connectActivity)).start();
                        new Thread(new Runnable() { // from class: c.c.a.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConnectActivity connectActivity2 = connectActivity;
                                while (connectActivity2.f6371y == 0) {
                                    q3 runnableC0964q8 = connectActivity2.f6351I;
                                    StringBuilder sb11 = new StringBuilder();
                                    sb11.append(connectActivity2.f6369w);
                                    sb11.append(connectActivity2.f6365s);
                                    a.m2193g(sb11, ConnectActivity.f6340W, runnableC0964q8);
                                    try {
                                        Thread.sleep(2000L);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }).start();
                    }
                } else if (string5.replace("\n", "").matches("connected.+")) {
                    runnableC0964q3 = connectActivity.f6351I;
                    sb = new StringBuilder();
                    sb.append(connectActivity.f6369w);
                    sb.append(connectActivity.f6365s);
                    str4 = ConnectActivity.f6340W;
                    sb.append(str4);
                    string2 = sb.toString();
                    runnableC0964q3.m2627c(string2);
                } else if (string5.contains("failed to authenticate")) {
                    new Thread(new RunnableC0884a3(connectActivity)).start();
                    new Thread(new Runnable() { // from class: c.c.a.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConnectActivity connectActivity2 = connectActivity;
                            while (connectActivity2.f6371y == 0) {
                                q3 runnableC0964q8 = connectActivity2.f6351I;
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append(connectActivity2.f6369w);
                                sb11.append(connectActivity2.f6365s);
                                a.m2193g(sb11, ConnectActivity.f6340W, runnableC0964q8);
                                try {
                                    Thread.sleep(2000L);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }).start();
                }
                StringBuilder sb11 = connectActivity.f6345C;
                sb11.delete(0, sb11.length());
            }
            string = sbM2191e.toString();
            m.m1952H(connectActivity, string);
            connectActivity.f6370x.sendEmptyMessage(2);
            StringBuilder sb12 = connectActivity.f6345C;
            sb12.delete(0, sb12.length());
        }
        return false;
    }
}
