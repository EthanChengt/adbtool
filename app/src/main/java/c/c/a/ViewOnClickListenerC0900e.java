package c.c.a;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.view.View;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.R;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0900e implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4781b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String hostAddress;
        ConnectActivity connectActivity = this.f4781b;
        if (((ConnectivityManager) connectActivity.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) {
            int ipAddress = ((WifiManager) connectActivity.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
            hostAddress = (ipAddress & 255) + "." + ((ipAddress >> 8) & 255) + "." + ((ipAddress >> 16) & 255) + "." + ((ipAddress >> 24) & 255);
        } else {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                loop0: while (true) {
                    if (!networkInterfaces.hasMoreElements()) {
                        hostAddress = "";
                        break;
                    }
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        inetAddressNextElement.getHostAddress();
                        if (inetAddressNextElement.getHostAddress().matches("192\\..+")) {
                            hostAddress = inetAddressNextElement.getHostAddress();
                            break loop0;
                        }
                        hostAddress = "";
                    }
                }
            } catch (SocketException e) {
                e.printStackTrace();
            }
            if (hostAddress.isEmpty()) {
                m.m1952H(connectActivity, connectActivity.getString(R.string.i1));
                return;
            }
        }
        connectActivity.C(hostAddress);
    }
}
