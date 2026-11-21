package c.c.a;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.R;
import java.net.InetAddress;
import java.net.UnknownHostException;
import b.s.m;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0940m implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4852b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final ConnectActivity connectActivity = this.f4852b;
        String strReplace = connectActivity.f6372z.getText().toString().replace("：", ":");
        connectActivity.f6349G = strReplace;
        if (strReplace.isEmpty()) {
            m.m1952H(connectActivity, connectActivity.getString(R.string.fc));
        } else if (m.J(connectActivity) || connectActivity.f6347E.size() < 2) {
            if (connectActivity.f6349G.split(":").length > 2 || !connectActivity.f6349G.matches(".*[a-z]+.*")) {
                connectActivity.f6348F = connectActivity.f6349G.contains(":") ? connectActivity.f6349G : a.m2203q(new StringBuilder(), connectActivity.f6349G, ":5555");
                q3 runnableC0964q3 = connectActivity.f6351I;
                StringBuilder sb = new StringBuilder();
                sb.append(connectActivity.f6369w);
                sb.append("connect ");
                sb.append(connectActivity.f6349G);
                sb.append(" 2>&1;echo ");
                a.m2193g(sb, ConnectActivity.f6338U, runnableC0964q3);
                connectActivity.f6370x.sendEmptyMessage(0);
            } else {
                new Thread(new Runnable() { // from class: c.c.a.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConnectActivity connectActivity2 = connectActivity;
                        String[] strArrSplit = connectActivity2.f6349G.split(":");
                        StringBuilder sb2 = new StringBuilder();
                        String str = strArrSplit[0];
                        try {
                            String hostAddress = InetAddress.getAllByName(str)[0].getHostAddress();
                            if (hostAddress.contains(":")) {
                                str = "[" + hostAddress + "]";
                            } else {
                                str = hostAddress;
                            }
                        } catch (UnknownHostException e) {
                            e.printStackTrace();
                        }
                        sb2.append(str);
                        sb2.append(":");
                        sb2.append(strArrSplit.length > 1 ? strArrSplit[1] : "5555");
                        connectActivity2.f6348F = sb2.toString();
                        q3 runnableC0964q4 = connectActivity2.f6351I;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(connectActivity2.f6369w);
                        sb3.append("connect ");
                        sb3.append(connectActivity2.f6348F);
                        sb3.append(" 2>&1;echo ");
                        a.m2193g(sb3, ConnectActivity.f6338U, runnableC0964q4);
                        connectActivity2.f6370x.sendEmptyMessage(0);
                    }
                }).start();
            }
        }
        InputMethodManager inputMethodManager = (InputMethodManager) connectActivity.getSystemService("input_method");
        if (inputMethodManager == null || !inputMethodManager.isActive() || connectActivity.getCurrentFocus() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(connectActivity.getCurrentFocus().getWindowToken(), 2);
    }
}
