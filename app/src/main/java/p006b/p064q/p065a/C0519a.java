package p006b.p064q.p065a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: b.q.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0519a {

    /* JADX INFO: renamed from: f */
    public static final Object f3203f = new Object();

    /* JADX INFO: renamed from: g */
    public static C0519a f3204g;

    /* JADX INFO: renamed from: a */
    public final Context f3205a;

    /* JADX INFO: renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f3206b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, ArrayList<c>> f3207c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<b> f3208d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final Handler f3209e;

    /* JADX INFO: renamed from: b.q.a.a$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            C0519a c0519a = C0519a.this;
            while (true) {
                synchronized (c0519a.f3206b) {
                    size = c0519a.f3208d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    c0519a.f3208d.toArray(bVarArr);
                    c0519a.f3208d.clear();
                }
                for (int i = 0; i < size; i++) {
                    b bVar = bVarArr[i];
                    int size2 = bVar.f3212b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c cVar = bVar.f3212b.get(i2);
                        if (!cVar.f3216d) {
                            cVar.f3214b.onReceive(c0519a.f3205a, bVar.f3211a);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.q.a.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Intent f3211a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<c> f3212b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f3211a = intent;
            this.f3212b = arrayList;
        }
    }

    /* JADX INFO: renamed from: b.q.a.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final IntentFilter f3213a;

        /* JADX INFO: renamed from: b */
        public final BroadcastReceiver f3214b;

        /* JADX INFO: renamed from: c */
        public boolean f3215c;

        /* JADX INFO: renamed from: d */
        public boolean f3216d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3213a = intentFilter;
            this.f3214b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3214b);
            sb.append(" filter=");
            sb.append(this.f3213a);
            if (this.f3216d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C0519a(Context context) {
        this.f3205a = context;
        this.f3209e = new a(context.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static C0519a m1917a(Context context) {
        C0519a c0519a;
        synchronized (f3203f) {
            if (f3204g == null) {
                f3204g = new C0519a(context.getApplicationContext());
            }
            c0519a = f3204g;
        }
        return c0519a;
    }
}
