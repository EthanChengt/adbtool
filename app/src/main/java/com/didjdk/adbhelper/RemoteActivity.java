package com.didjdk.adbhelper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.didjdk.adbhelper.RemoteActivity;
import com.didjdk.adbhelper.view.ControlView;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.C0622h;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.p088m.p091u.AbstractC0707k;
import p080c.p084b.p085a.p088m.p097w.p102g.C0800i;
import c.c.a.ActivityC1119w2;
import c.c.a.q3;
import c.c.a.p122w3.C1127h;
import c.c.a.p122w3.p123j.C1129a;
import c.c.a.y3.h;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActivity extends ActivityC1119w2 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f10046V = 0;

    /* JADX INFO: renamed from: B */
    public int f10048B;

    /* JADX INFO: renamed from: F */
    public int f10052F;

    /* JADX INFO: renamed from: G */
    public int f10053G;

    /* JADX INFO: renamed from: H */
    public InputStream f10054H;

    /* JADX INFO: renamed from: I */
    public OutputStream f10055I;

    /* JADX INFO: renamed from: J */
    public C1129a f10056J;

    /* JADX INFO: renamed from: K */
    public q3 f10057K;

    /* JADX INFO: renamed from: L */
    public q3 f10058L;

    /* JADX INFO: renamed from: M */
    public StringBuilder f10059M;

    /* JADX INFO: renamed from: P */
    public C1127h f10062P;

    /* JADX INFO: renamed from: Q */
    public SurfaceView f10063Q;

    /* JADX INFO: renamed from: R */
    public ControlView f10064R;

    /* JADX INFO: renamed from: S */
    public TextView f10065S;

    /* JADX INFO: renamed from: T */
    public ProgressBar f10066T;

    /* JADX INFO: renamed from: U */
    public ImageView f10067U;

    /* JADX INFO: renamed from: q */
    public String f10068q;

    /* JADX INFO: renamed from: r */
    public String f10069r;

    /* JADX INFO: renamed from: s */
    public int f10070s;

    /* JADX INFO: renamed from: t */
    public int f10071t;

    /* JADX INFO: renamed from: u */
    public String f10072u;

    /* JADX INFO: renamed from: v */
    public boolean f10073v;

    /* JADX INFO: renamed from: w */
    public boolean f10074w;

    /* JADX INFO: renamed from: x */
    public boolean f10075x;

    /* JADX INFO: renamed from: y */
    public boolean f10076y;

    /* JADX INFO: renamed from: z */
    public boolean f10077z;

    /* JADX INFO: renamed from: A */
    public boolean f10047A = false;

    /* JADX INFO: renamed from: C */
    public final String f10049C = a.q();

    /* JADX INFO: renamed from: D */
    public final String f10050D = a.q();

    /* JADX INFO: renamed from: E */
    public boolean f10051E = false;

    /* JADX INFO: renamed from: N */
    public boolean f10060N = false;

    /* JADX INFO: renamed from: O */
    public boolean f10061O = false;

    /* JADX INFO: renamed from: A */
    public final void m3032A() {
        if (!this.f10047A) {
            C1127h c1127h = this.f10062P;
            c1127h.f5452b = true;
            MediaCodec mediaCodec = c1127h.f5456f;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
        }
        this.f10057K.m2628d();
        this.f10060N = false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m3033x();
    }

    @Override // c.c.a.ActivityC1119w2, p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f10061O) {
            return;
        }
        this.f10061O = true;
        this.f10066T.setVisibility(0);
        toString();
        if (!this.f10047A) {
            this.f10062P = new C1127h(this, this.f10063Q);
            this.f10059M = new StringBuilder();
            q3 runnableC0964q3 = new q3(this);
            this.f10057K = runnableC0964q3;
            runnableC0964q3.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.q1
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    RemoteActivity remoteActivity = this.f4878a;
                    remoteActivity.f10059M.append((String) message.obj);
                    if (remoteActivity.f10059M.toString().contains(remoteActivity.f10049C)) {
                        if (remoteActivity.f10070s < 0) {
                            int width = remoteActivity.f10064R.getWidth();
                            int height = remoteActivity.f10064R.getHeight();
                            float floatExtra = remoteActivity.getIntent().getFloatExtra("aspectRatio", 0.0f);
                            float f = width;
                            if (floatExtra >= height / f) {
                                remoteActivity.f10070s = height;
                            } else {
                                remoteActivity.f10070s = (int) (f * floatExtra);
                            }
                        }
                        String strM2203q = a.m2203q(a.m2191e("shell CLASSPATH="), remoteActivity.f10069r, "/scrcpy_server.apk app_process ./ com.genymobile.scrcpy.Server");
                        remoteActivity.f10057K.m2627c(remoteActivity.f10068q + strM2203q + " 1.18 INFO " + Math.max(remoteActivity.f10070s, 0) + " " + remoteActivity.f10072u + " 0 -1 true - true true 0 false " + remoteActivity.f10077z + " - - false");
                        StringBuilder sb = remoteActivity.f10059M;
                        sb.delete(0, sb.length());
                    }
                    if (remoteActivity.f10059M.toString().contains("[server]") && !remoteActivity.f10060N && remoteActivity.f10061O) {
                        remoteActivity.f10060N = true;
                        new Thread(new RunnableC0954o3(remoteActivity)).start();
                        StringBuilder sb2 = remoteActivity.f10059M;
                        sb2.delete(0, sb2.length());
                    }
                    if (remoteActivity.f10059M.toString().contains("videoSize:")) {
                        int i = Integer.parseInt(remoteActivity.f10059M.toString().split("videoSize:")[1].split("x")[0]);
                        if (remoteActivity.f10059M.toString().contains("consumeRotationChange") && i == remoteActivity.f10053G) {
                            if (remoteActivity.getResources().getConfiguration().orientation == 1) {
                                remoteActivity.setRequestedOrientation(0);
                            }
                            if (remoteActivity.getResources().getConfiguration().orientation == 2) {
                                remoteActivity.setRequestedOrientation(1);
                            }
                        }
                        StringBuilder sb3 = remoteActivity.f10059M;
                        sb3.delete(0, sb3.length());
                    }
                    return false;
                }
            });
            q3 runnableC0964q4 = this.f10057K;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10068q);
            sb.append(" forward tcp:5005 localabstract:scrcpy;echo ");
            a.m2193g(sb, this.f10049C, runnableC0964q4);
            return;
        }
        ControlView controlView = this.f10064R;
        controlView.f10107i = true;
        controlView.f10108j = this;
        this.f10066T.setVisibility(8);
        String strM2203q = a.m2203q(new StringBuilder(), this.f10069r, "/screencap.png");
        final String str = getCacheDir().getAbsolutePath() + "/tmp/screenshot.png";
        StringBuilder sb2 = new StringBuilder();
        a.m2194h(sb2, this.f10068q, "shell screencap -p ", strM2203q, ";");
        a.m2194h(sb2, this.f10068q, "pull ", strM2203q, " ");
        sb2.append(str);
        sb2.append(";echo ");
        sb2.append(this.f10050D);
        final String string = sb2.toString();
        this.f10059M = new StringBuilder();
        this.f10058L = new q3(this);
        q3 runnableC0964q5 = new q3(this);
        this.f10057K = runnableC0964q5;
        runnableC0964q5.f4888j = new Handler(new Handler.Callback() { // from class: c.c.a.l1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Bitmap bitmapDecodeFile;
                RemoteActivity remoteActivity = this.f4848a;
                String str2 = str;
                String str3 = string;
                remoteActivity.f10059M.append((String) message.obj);
                if (remoteActivity.f10059M.toString().contains(remoteActivity.f10050D)) {
                    C0622h c0622hM2545d = ComponentCallbacks2C0616b.m2209f(remoteActivity).m2232l().m2227y(new File(str2)).m2554n(true).m2545d(AbstractC0707k.f4168a);
                    Objects.requireNonNull(c0622hM2545d);
                    c0622hM2545d.m2552l(C0800i.f4549b, Boolean.TRUE).m2549i(remoteActivity.f10067U.getDrawable()).m2226x(remoteActivity.f10067U);
                    remoteActivity.f10057K.m2627c(str3);
                    StringBuilder sb3 = remoteActivity.f10059M;
                    sb3.delete(0, sb3.length());
                    if (!remoteActivity.f10051E && (bitmapDecodeFile = BitmapFactory.decodeFile(str2)) != null) {
                        remoteActivity.f10051E = true;
                        remoteActivity.m3035z(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), remoteActivity.f10067U);
                        bitmapDecodeFile.getWidth();
                        bitmapDecodeFile.getHeight();
                    }
                }
                return false;
            }
        });
        this.f10057K.m2627c(string);
    }

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("fullScreen", this.f10074w);
    }

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onStop() {
        this.f10061O = false;
        toString();
        m3032A();
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f10074w) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m3033x() {
        final h c1153h = new h(this);
        c1153h.m2714e(getString(R.string.ah));
        c1153h.m2711b(getString(R.string.aq));
        c1153h.m2712c(getString(R.string.eg));
        c1153h.f5543e.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1129a c1129a;
                RemoteActivity remoteActivity = this.f4865b;
                h c1153h2 = c1153h;
                Objects.requireNonNull(remoteActivity);
                c1153h2.f5539a.dismiss();
                remoteActivity.f10061O = false;
                if (!remoteActivity.f10047A && (c1129a = remoteActivity.f10056J) != null && remoteActivity.f10075x) {
                    c1129a.m2685a(new byte[]{10, (byte) 2});
                }
                remoteActivity.f47f.m9a();
                remoteActivity.m3032A();
            }
        });
        c1153h.f5539a.show();
    }

    /* JADX INFO: renamed from: y */
    public final void m3034y(int i) {
        C1129a c1129a = this.f10056J;
        if (c1129a != null && !this.f10047A) {
            c1129a.m2686b(0, i, 0, 0);
            this.f10056J.m2686b(1, i, 0, 0);
        } else if (this.f10047A) {
            this.f10058L.m2627c(this.f10068q + "shell input keyevent " + i);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3035z(int i, int i2, final View view) {
        int width = this.f10064R.getWidth();
        int height = this.f10064R.getHeight();
        if (!this.f10073v) {
            this.f10064R.m3041c(i, i2, width, height);
            return;
        }
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        float f = i2;
        float f2 = i;
        float f3 = f / f2;
        float f4 = height;
        float f5 = width;
        if (f3 >= f4 / f5) {
            layoutParams.height = height;
            layoutParams.width = (int) ((f2 / f) * f4);
        } else {
            layoutParams.width = width;
            layoutParams.height = (int) (f5 * f3);
        }
        this.f10064R.m3041c(i, i2, layoutParams.width, layoutParams.height);
        runOnUiThread(new Runnable() { // from class: c.c.a.i1
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                int i3 = RemoteActivity.f10046V;
                view2.setLayoutParams(layoutParams2);
            }
        });
    }
}
