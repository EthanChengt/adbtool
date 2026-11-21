package com.didjdk.adbhelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import p006b.p056m.p057b.AbstractC0483r;
import p006b.p056m.p057b.AbstractC0488w;
import p006b.p064q.p065a.C0519a;
import c.c.a.ActivityC1119w2;
import c.c.a.C0934k3;
import c.c.a.q3;
import c.c.a.y3.h;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends ActivityC1119w2 {

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ int f6448M = 0;

    /* JADX INFO: renamed from: A */
    public ViewPager f6449A;

    /* JADX INFO: renamed from: B */
    public TabLayout f6450B;

    /* JADX INFO: renamed from: C */
    public TextView f6451C;

    /* JADX INFO: renamed from: D */
    public TextView f6452D;

    /* JADX INFO: renamed from: E */
    public FloatingActionButton f6453E;

    /* JADX INFO: renamed from: F */
    public FloatingActionButton f6454F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f6455G;

    /* JADX INFO: renamed from: H */
    public C0934k3 f6456H;

    /* JADX INFO: renamed from: I */
    public c f6457I;

    /* JADX INFO: renamed from: J */
    public q3 f6458J;

    /* JADX INFO: renamed from: K */
    public BroadcastReceiver f6459K;

    /* JADX INFO: renamed from: L */
    public C0519a f6460L;

    /* JADX INFO: renamed from: q */
    public boolean f6461q = false;

    /* JADX INFO: renamed from: r */
    public boolean f6462r = false;

    /* JADX INFO: renamed from: s */
    public long f6463s = 1000;

    /* JADX INFO: renamed from: t */
    public String f6464t = "/data/local/tmp";

    /* JADX INFO: renamed from: u */
    public String f6465u;

    /* JADX INFO: renamed from: v */
    public boolean f6466v;

    /* JADX INFO: renamed from: w */
    public String f6467w;

    /* JADX INFO: renamed from: x */
    public String f6468x;

    /* JADX INFO: renamed from: y */
    public String f6469y;

    /* JADX INFO: renamed from: z */
    public int f6470z;

    /* JADX INFO: renamed from: com.didjdk.adbhelper.MainActivity$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public native void onReceive(Context context, Intent intent);
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.MainActivity$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ h f6472b;

        public b(h c1153h) {
            this.f6472b = c1153h;
        }

        @Override // android.view.View.OnClickListener
        public native void onClick(View view);
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.MainActivity$c */
    public class c extends AbstractC0488w {
        public c(AbstractC0483r abstractC0483r) {
            super(abstractC0483r);
        }

        @Override // p006b.p078z.p079a.AbstractC0612a
        /* JADX INFO: renamed from: c */
        public native int c();
        public int mo2186c() {
            return c();
        }
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public native void onBackPressed();

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity, android.content.ComponentCallbacks
    public native void onConfigurationChanged(Configuration configuration);

    @Override // c.c.a.ActivityC1119w2, p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native boolean onCreateOptionsMenu(Menu menu);

    @Override // c.c.a.ActivityC1119w2, p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onDestroy();

    @Override // p006b.p008b.p009c.ActivityC0194j, android.app.Activity, android.view.KeyEvent.Callback
    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onSaveInstanceState(Bundle bundle);

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public native void onStop();

    /* JADX INFO: renamed from: x */
    public native void x();

    /* JADX INFO: renamed from: y */
    public final native void y();

    /* JADX INFO: renamed from: z */
    public native void z(int i);
}
