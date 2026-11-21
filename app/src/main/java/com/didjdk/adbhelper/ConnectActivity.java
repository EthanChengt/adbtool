package com.didjdk.adbhelper;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import c.c.a.ActivityC1119w2;
import c.c.a.t3;
import c.c.a.q3;
import c.c.a.p115u3.C0984a;

/* JADX INFO: loaded from: classes.dex */
public class ConnectActivity extends ActivityC1119w2 {

    /* JADX INFO: renamed from: U */
    public static final String f6338U = c.a.a.a.c.a.a.a.a.q();

    /* JADX INFO: renamed from: V */
    public static final String f6339V = c.a.a.a.c.a.a.a.a.q();

    /* JADX INFO: renamed from: W */
    public static final String f6340W = c.a.a.a.c.a.a.a.a.q();

    /* JADX INFO: renamed from: X */
    public static final String f6341X = c.a.a.a.c.a.a.a.a.q();

    /* JADX INFO: renamed from: Y */
    public static final String f6342Y = c.a.a.a.c.a.a.a.a.q();

    /* JADX INFO: renamed from: B */
    public ProgressDialog f6344B;

    /* JADX INFO: renamed from: G */
    public String f6349G;

    /* JADX INFO: renamed from: H */
    public C0984a f6350H;

    /* JADX INFO: renamed from: I */
    public q3 f6351I;

    /* JADX INFO: renamed from: J */
    public q3 f6352J;

    /* JADX INFO: renamed from: L */
    public TextView f6354L;

    /* JADX INFO: renamed from: M */
    public b f6355M;

    /* JADX INFO: renamed from: N */
    public c f6356N;

    /* JADX INFO: renamed from: O */
    public List<String> f6357O;

    /* JADX INFO: renamed from: P */
    public t3 f6358P;

    /* JADX INFO: renamed from: Q */
    public UsbDevice f6359Q;

    /* JADX INFO: renamed from: R */
    public UsbManager f6360R;

    /* JADX INFO: renamed from: S */
    public IntentFilter f6361S;

    /* JADX INFO: renamed from: q */
    public SharedPreferences f6363q;

    /* JADX INFO: renamed from: r */
    public String f6364r;

    /* JADX INFO: renamed from: s */
    public String f6365s;

    /* JADX INFO: renamed from: t */
    public c.c.a.x3.a f6366t;

    /* JADX INFO: renamed from: w */
    public String f6369w;

    /* JADX INFO: renamed from: x */
    public Handler f6370x;

    /* JADX INFO: renamed from: z */
    public AutoCompleteTextView f6372z;

    /* JADX INFO: renamed from: u */
    public boolean f6367u = false;

    /* JADX INFO: renamed from: v */
    public int f6368v = 5037;

    /* JADX INFO: renamed from: y */
    public int f6371y = 0;

    /* JADX INFO: renamed from: A */
    public boolean f6343A = false;

    /* JADX INFO: renamed from: C */
    public final StringBuilder f6345C = new StringBuilder();

    /* JADX INFO: renamed from: D */
    public final StringBuilder f6346D = new StringBuilder();

    /* JADX INFO: renamed from: E */
    public final ArrayList<C0984a> f6347E = new ArrayList<>();

    /* JADX INFO: renamed from: F */
    public String f6348F = "null";

    /* JADX INFO: renamed from: K */
    public boolean f6353K = false;

    /* JADX INFO: renamed from: T */
    public final BroadcastReceiver f6362T = new d();

    /* JADX INFO: renamed from: com.didjdk.adbhelper.ConnectActivity$a */
    public class a extends Thread {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UsbDevice f6373b;

        public a(UsbDevice usbDevice) {
            this.f6373b = usbDevice;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.ConnectActivity$b */
    public class b extends ArrayAdapter<C0984a> {

        /* JADX INFO: renamed from: b */
        public final int f6375b;

        public b(Context context, int i, List<C0984a> list) {
            super(context, i, list);
            this.f6375b = i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public native View getView(int i, View view, ViewGroup viewGroup);
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.ConnectActivity$c */
    public class c extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: b */
        public final int f6377b;

        public c(Context context, int i, List<String> list) {
            super(context, i, list);
            this.f6377b = i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public native View getView(int i, View view, ViewGroup viewGroup);
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.ConnectActivity$d */
    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public native void onReceive(Context context, Intent intent);
    }

    /* JADX INFO: renamed from: x */
    public static native boolean x(ConnectActivity connectActivity, UsbDevice usbDevice, UsbInterface usbInterface);

    /* JADX INFO: renamed from: A */
    public final native boolean A(UsbDevice usbDevice);

    /* JADX INFO: renamed from: B */
    public final native void B();

    /* JADX INFO: renamed from: C */
    public final native void C(String str);

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public native void onBackPressed();

    @Override // c.c.a.ActivityC1119w2, p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native boolean onCreateOptionsMenu(Menu menu);

    @Override // c.c.a.ActivityC1119w2, p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onDestroy();

    @Override // android.app.Activity
    public native boolean onOptionsItemSelected(MenuItem menuItem);

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onResume();

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onStop();

    /* JADX INFO: renamed from: y */
    public final native void y(UsbDevice usbDevice);

    /* JADX INFO: renamed from: z */
    public final native void z();
}
