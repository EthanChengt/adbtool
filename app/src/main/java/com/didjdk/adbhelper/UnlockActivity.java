package com.didjdk.adbhelper;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.X509TrustManager;
import p006b.p008b.p009c.ActivityC0194j;

/* JADX INFO: loaded from: classes.dex */
public class UnlockActivity extends ActivityC0194j {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f10091y = 0;

    /* JADX INFO: renamed from: q */
    public boolean f10092q = false;

    /* JADX INFO: renamed from: r */
    public String f10093r;

    /* JADX INFO: renamed from: s */
    public String f10094s;

    /* JADX INFO: renamed from: t */
    public String f10095t;

    /* JADX INFO: renamed from: u */
    public TextView f10096u;

    /* JADX INFO: renamed from: v */
    public View f10097v;

    /* JADX INFO: renamed from: w */
    public View f10098w;

    /* JADX INFO: renamed from: x */
    public View f10099x;

    /* JADX INFO: renamed from: com.didjdk.adbhelper.UnlockActivity$a */
    public class a implements X509TrustManager {
        public a(UnlockActivity unlockActivity) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public native void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

        @Override // javax.net.ssl.X509TrustManager
        public native void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

        @Override // javax.net.ssl.X509TrustManager
        public native X509Certificate[] getAcceptedIssuers();
    }

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native boolean onOptionsItemSelected(MenuItem menuItem);

    /* JADX INFO: renamed from: x */
    public final native String x(String str);

    /* JADX INFO: renamed from: y */
    public final native void y(String str);

    /* JADX INFO: renamed from: z */
    public final native void z(HttpsURLConnection httpsURLConnection);
}
