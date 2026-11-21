package p080c.p084b.p085a.p088m.p091u;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: c.b.a.m.u.z */
/* JADX INFO: loaded from: classes.dex */
public class C0722z {

    /* JADX INFO: renamed from: a */
    public boolean f4283a;

    /* JADX INFO: renamed from: b */
    public final Handler f4284b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c.b.a.m.u.z$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC0719w) message.obj).mo2412e();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2425a(InterfaceC0719w<?> interfaceC0719w, boolean z) {
        if (this.f4283a || z) {
            this.f4284b.obtainMessage(1, interfaceC0719w).sendToTarget();
        } else {
            this.f4283a = true;
            interfaceC0719w.mo2412e();
            this.f4283a = false;
        }
    }
}
