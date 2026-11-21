package c.c.a;

import android.app.ProgressDialog;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.R;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import b.s.m;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0915h implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f4804c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f4805d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ProgressDialog f4806e;

    public /* synthetic */ RunnableC0915h(ConnectActivity connectActivity, String str, String str2, ProgressDialog progressDialog) {
        this.f4803b = connectActivity;
        this.f4804c = str;
        this.f4805d = str2;
        this.f4806e = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ConnectActivity connectActivity = this.f4803b;
        final String str = this.f4804c;
        final String str2 = this.f4805d;
        final ProgressDialog progressDialog = this.f4806e;
        Objects.requireNonNull(connectActivity);
        final ArrayList arrayList = new ArrayList();
        final int[] iArr = {0};
        for (int i = 1; i <= 255; i++) {
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            final int i2 = i;
            new Thread(new Runnable() { // from class: c.c.a.l
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb;
                    ConnectActivity connectActivity2 = connectActivity;
                    String str3 = str;
                    int i3 = i2;
                    String str4 = str2;
                    List list = arrayList;
                    int[] iArr2 = iArr;
                    Objects.requireNonNull(connectActivity2);
                    Socket socket = new Socket();
                    try {
                        socket.connect(new InetSocketAddress(a.m2198l(str3, i3), 5555), 1000);
                        if (str4.equals(str3 + i3)) {
                            sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(i3);
                            sb.append(connectActivity2.getString(R.string.hi));
                        } else {
                            sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(i3);
                        }
                        list.add(sb.toString());
                        socket.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    iArr2[0] = iArr2[0] + 1;
                }
            }).start();
        }
        while (iArr[0] < 255) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        connectActivity.runOnUiThread(new Runnable() { // from class: c.c.a.q
            @Override // java.lang.Runnable
            public final void run() {
                ConnectActivity connectActivity2 = connectActivity;
                List list = arrayList;
                ProgressDialog progressDialog2 = progressDialog;
                Objects.requireNonNull(connectActivity2);
                if (list.size() <= 0) {
                    progressDialog2.dismiss();
                    m.m1952H(connectActivity2, connectActivity2.getString(R.string.e_));
                    return;
                }
                String[] strArr = (String[]) list.toArray(new String[0]);
                progressDialog2.dismiss();
                DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(connectActivity2);
                aVar.f1245a.f115d = connectActivity2.getString(R.string.cg);
                ArrayAdapter arrayAdapter = new ArrayAdapter(connectActivity2, android.R.layout.simple_list_item_1, strArr);
                DialogInterfaceOnClickListenerC1145y2 dialogInterfaceOnClickListenerC1145y2 = new DialogInterfaceOnClickListenerC1145y2(connectActivity2, strArr);
                AlertController.C0020b c0020b = aVar.f1245a;
                c0020b.f124m = arrayAdapter;
                c0020b.f125n = dialogInterfaceOnClickListenerC1145y2;
                aVar.m779a().show();
            }
        });
    }
}
