package com.didjdk.adbhelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import p006b.p008b.p009c.ActivityC0194j;
import c.a.a.a.a;
import c.c.a.t3;
import c.c.a.q3;
import c.c.a.x3.f;

/* JADX INFO: loaded from: classes.dex */
public class FastbootActivity extends ActivityC0194j {

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ int e0 = 0;

    /* JADX INFO: renamed from: A */
    public TextView A;

    /* JADX INFO: renamed from: B */
    public TextView B;

    /* JADX INFO: renamed from: C */
    public ImageView C;

    /* JADX INFO: renamed from: D */
    public ImageView D;

    /* JADX INFO: renamed from: E */
    public TextView E;

    /* JADX INFO: renamed from: F */
    public TextView F;

    /* JADX INFO: renamed from: G */
    public Spinner G;

    /* JADX INFO: renamed from: H */
    public Button H;

    /* JADX INFO: renamed from: I */
    public Button I;

    /* JADX INFO: renamed from: J */
    public TextView J;

    /* JADX INFO: renamed from: K */
    public ProgressBar K;

    /* JADX INFO: renamed from: L */
    public TextView L;

    /* JADX INFO: renamed from: M */
    public boolean M;

    /* JADX INFO: renamed from: N */
    public TextView N;

    /* JADX INFO: renamed from: O */
    public Button O;

    /* JADX INFO: renamed from: P */
    public EditText P;

    /* JADX INFO: renamed from: Q */
    public ArrayList<String> Q;

    /* JADX INFO: renamed from: R */
    public q3 R;

    /* JADX INFO: renamed from: S */
    public StringBuilder S;

    /* JADX INFO: renamed from: T */
    public String T;

    /* JADX INFO: renamed from: U */
    public String U;

    /* JADX INFO: renamed from: V */
    public UsbDevice V;

    /* JADX INFO: renamed from: W */
    public UsbManager W;

    /* JADX INFO: renamed from: X */
    public UsbDeviceConnection X;

    /* JADX INFO: renamed from: Y */
    public t3 Y;

    /* JADX INFO: renamed from: Z */
    public InputStream Z;

    /* JADX INFO: renamed from: a0 */
    public OutputStream a0;

    /* JADX INFO: renamed from: b0 */
    public final BroadcastReceiver b0;

    /* JADX INFO: renamed from: c0 */
    public final Handler c0;

    /* JADX INFO: renamed from: d0 */
    public boolean d0;

    /* JADX INFO: renamed from: q */
    public final String f6411q = a.q();

    /* JADX INFO: renamed from: r */
    public final String f6412r = a.q();

    /* JADX INFO: renamed from: s */
    public boolean s;

    /* JADX INFO: renamed from: t */
    public boolean t;

    /* JADX INFO: renamed from: u */
    public boolean u;

    /* JADX INFO: renamed from: v */
    public boolean v;

    /* JADX INFO: renamed from: w */
    public boolean w;

    /* JADX INFO: renamed from: x */
    public View x;

    /* JADX INFO: renamed from: y */
    public View y;

    /* JADX INFO: renamed from: z */
    public TextView z;

    /* JADX INFO: renamed from: a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: renamed from: b */
    public class b extends Thread {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UsbDevice f6422b;

        public b(UsbDevice usbDevice) {
            this.f6422b = usbDevice;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: renamed from: c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: renamed from: d */
    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public native void onReceive(Context context, Intent intent);
    }

    /* JADX INFO: renamed from: e */
    public class e extends Handler {
        public e() {
        }

        @Override // android.os.Handler
        public native void handleMessage(Message message);
    }

    public FastbootActivity() {
        new f().toString();
        this.s = true;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = false;
        this.M = false;
        this.Q = new ArrayList<>();
        this.b0 = new d();
        this.c0 = new e();
    }

    /* JADX INFO: renamed from: x */
    public static native boolean x(FastbootActivity fastbootActivity, UsbDevice usbDevice, UsbInterface usbInterface);

    /* JADX INFO: renamed from: A */
    public native void A();

    /* JADX INFO: renamed from: B */
    public final native boolean B(UsbDevice usbDevice);

    /* JADX INFO: renamed from: C */
    public final native void C();

    /* JADX INFO: renamed from: D */
    public native void D();

    /* JADX INFO: renamed from: E */
    public final native void E(byte[] bArr, int i);

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native boolean onCreateOptionsMenu(Menu menu);

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onDestroy();

    @Override // android.app.Activity
    public native boolean onOptionsItemSelected(MenuItem menuItem);

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity, p006b.p032h.p033b.C0355a.b
    public native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    /* JADX INFO: renamed from: y */
    public native void y(UsbDevice usbDevice);

    /* JADX INFO: renamed from: z */
    public final native SpannableString z(String str, int i);
}
