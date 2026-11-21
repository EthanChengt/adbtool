package p080c.p084b.p085a.p104n;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.ComponentCallbacks2C0623i;
import p080c.p084b.p085a.p107q.InterfaceC0843c;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.n.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0813e implements InterfaceC0811c {

    /* JADX INFO: renamed from: b */
    public final Context f4567b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0811c.a f4568c;

    /* JADX INFO: renamed from: d */
    public boolean f4569d;

    /* JADX INFO: renamed from: e */
    public boolean f4570e;

    /* JADX INFO: renamed from: f */
    public final BroadcastReceiver f4571f = new a();

    /* JADX INFO: renamed from: c.b.a.n.e$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C0813e c0813e = C0813e.this;
            boolean z = c0813e.f4569d;
            c0813e.f4569d = c0813e.m2520l(context);
            if (z != C0813e.this.f4569d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sbM2191e = a.m2191e("connectivity changed, isConnected: ");
                    sbM2191e.append(C0813e.this.f4569d);
                    Log.d("ConnectivityMonitor", sbM2191e.toString());
                }
                C0813e c0813e2 = C0813e.this;
                InterfaceC0811c.a aVar = c0813e2.f4568c;
                boolean z2 = c0813e2.f4569d;
                ComponentCallbacks2C0623i.b bVar = (ComponentCallbacks2C0623i.b) aVar;
                Objects.requireNonNull(bVar);
                if (z2) {
                    synchronized (ComponentCallbacks2C0623i.this) {
                        C0826r c0826r = bVar.f3832a;
                        for (InterfaceC0843c interfaceC0843c : (ArrayList) C0875j.m2613e(c0826r.f4587a)) {
                            if (!interfaceC0843c.mo2566i() && !interfaceC0843c.mo2567j()) {
                                interfaceC0843c.clear();
                                if (c0826r.f4589c) {
                                    c0826r.f4588b.add(interfaceC0843c);
                                } else {
                                    interfaceC0843c.mo2563f();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C0813e(Context context, InterfaceC0811c.a aVar) {
        this.f4567b = context.getApplicationContext();
        this.f4568c = aVar;
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: e */
    public void mo2229e() {
        if (this.f4570e) {
            this.f4567b.unregisterReceiver(this.f4571f);
            this.f4570e = false;
        }
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: i */
    public void mo2230i() {
        if (this.f4570e) {
            return;
        }
        this.f4569d = m2520l(this.f4567b);
        try {
            this.f4567b.registerReceiver(this.f4571f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f4570e = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: k */
    public void mo2231k() {
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: l */
    public boolean m2520l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
