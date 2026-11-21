package p080c.p126d.p127a.p128a.p155y;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: renamed from: c.d.a.a.y.e */
/* JADX INFO: loaded from: classes.dex */
public class C1308e {

    /* JADX INFO: renamed from: c */
    public static C1308e f6319c;

    /* JADX INFO: renamed from: a */
    public final Object f6320a = new Object();

    /* JADX INFO: renamed from: b */
    public final Handler f6321b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c.d.a.a.y.e$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C1308e c1308e = C1308e.this;
            b bVar = (b) message.obj;
            synchronized (c1308e.f6320a) {
                try {
                    if (bVar == null) {
                        Objects.requireNonNull(bVar);
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.y.e$b */
    public static class b {
    }
}
