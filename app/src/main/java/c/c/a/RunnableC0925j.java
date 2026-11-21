package c.c.a;

import android.content.DialogInterface;
import android.text.Html;
import android.text.Spanned;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.ConnectActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p006b.p067s.C0532j;

/* JADX INFO: renamed from: c.c.a.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0925j implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f4822b;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        final ConnectActivity connectActivity = this.f4822b;
        Objects.requireNonNull(connectActivity);
        BufferedReader bufferedReader = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL("https://didjdk.github.io/adbhelper/privacy_policy.html").openConnection();
            try {
                try {
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setConnectTimeout(5000);
                    httpsURLConnection.setReadTimeout(5000);
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        }
                        final String string = sb.toString();
                        connectActivity.runOnUiThread(new Runnable() { // from class: c.c.a.v
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ConnectActivity connectActivity2 = connectActivity;
                                String str = string;
                                Objects.requireNonNull(connectActivity2);
                                DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(connectActivity2);
                                aVar.f1245a.f115d = "用户协议和隐私政策";
                                Spanned spannedFromHtml = Html.fromHtml(str);
                                AlertController.C0020b c0020b = aVar.f1245a;
                                c0020b.f117f = spannedFromHtml;
                                c0020b.f120i = "不同意";
                                c0020b.f121j = null;
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c.c.a.c
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        C0532j.m1940a(connectActivity2).edit().putBoolean("accept_policy", true).apply();
                                    }
                                };
                                c0020b.f118g = "同意并继续";
                                c0020b.f119h = onClickListener;
                                aVar.m786h();
                            }
                        });
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (httpsURLConnection == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (httpsURLConnection == null) {
                            throw th;
                        }
                        httpsURLConnection.disconnect();
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
            httpsURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
        httpsURLConnection.disconnect();
    }
}
