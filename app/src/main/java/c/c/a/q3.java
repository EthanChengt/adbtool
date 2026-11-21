package c.c.a;

import android.content.Context;
import android.os.Handler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: c.c.a.q3 */
/* JADX INFO: loaded from: classes.dex */
public class q3 extends Thread implements Runnable {

    /* JADX INFO: renamed from: b */
    public DataOutputStream f4880b;

    /* JADX INFO: renamed from: c */
    public DataInputStream f4881c;

    /* JADX INFO: renamed from: d */
    public DataInputStream f4882d;

    /* JADX INFO: renamed from: e */
    public Process f4883e;

    /* JADX INFO: renamed from: i */
    public Context f4887i;

    /* JADX INFO: renamed from: f */
    public ArrayList<Byte> f4884f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public boolean f4885g = false;

    /* JADX INFO: renamed from: h */
    public boolean f4886h = false;

    /* JADX INFO: renamed from: j */
    public Handler f4888j = new Handler();

    public q3(Context context) {
        this.f4887i = context;
        try {
            this.f4883e = Runtime.getRuntime().exec("/system/bin/sh");
            this.f4880b = new DataOutputStream(this.f4883e.getOutputStream());
            this.f4881c = new DataInputStream(this.f4883e.getInputStream());
            this.f4882d = new DataInputStream(this.f4883e.getErrorStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        start();
        m2629e();
    }

    public q3(Context context, boolean z) {
        this.f4887i = context;
        try {
            this.f4883e = Runtime.getRuntime().exec("/system/bin/sh");
            this.f4880b = new DataOutputStream(this.f4883e.getOutputStream());
            this.f4881c = new DataInputStream(this.f4883e.getInputStream());
            this.f4882d = new DataInputStream(this.f4883e.getErrorStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        start();
        if (z) {
            m2629e();
        }
    }

    /* JADX INFO: renamed from: a */
    public native void a();
    public void m2625a() {
        a();
    }

    /* JADX INFO: renamed from: b */
    public final native void b();
    public final void m2626b() {
        b();
    }

    /* JADX INFO: renamed from: c */
    public native void c(String str);
    public void m2627c(String str) {
        c(str);
    }

    /* JADX INFO: renamed from: d */
    public native void d();
    public void m2628d() {
        d();
    }

    /* JADX INFO: renamed from: e */
    public native void e();
    public void m2629e() {
        e();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();
}
