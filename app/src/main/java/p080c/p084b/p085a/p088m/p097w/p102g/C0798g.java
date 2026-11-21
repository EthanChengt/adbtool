package p080c.p084b.p085a.p088m.p097w.p102g;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p080c.p084b.p085a.C0622h;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.ComponentCallbacks2C0623i;
import p080c.p084b.p085a.p087l.InterfaceC0628a;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.AbstractC0707k;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p107q.C0846f;
import p080c.p084b.p085a.p107q.p108j.AbstractC0852c;
import p080c.p084b.p085a.p107q.p109k.InterfaceC0860b;
import p080c.p084b.p085a.p110r.C0865d;
import p080c.p084b.p085a.p111s.C0870e;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.w.g.g */
/* JADX INFO: loaded from: classes.dex */
public class C0798g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0628a f4525a;

    /* JADX INFO: renamed from: b */
    public final Handler f4526b;

    /* JADX INFO: renamed from: c */
    public final List<b> f4527c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C0623i f4528d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0678d f4529e;

    /* JADX INFO: renamed from: f */
    public boolean f4530f;

    /* JADX INFO: renamed from: g */
    public boolean f4531g;

    /* JADX INFO: renamed from: h */
    public C0622h<Bitmap> f4532h;

    /* JADX INFO: renamed from: i */
    public a f4533i;

    /* JADX INFO: renamed from: j */
    public boolean f4534j;

    /* JADX INFO: renamed from: k */
    public a f4535k;

    /* JADX INFO: renamed from: l */
    public Bitmap f4536l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0651s<Bitmap> f4537m;

    /* JADX INFO: renamed from: n */
    public a f4538n;

    /* JADX INFO: renamed from: o */
    public int f4539o;

    /* JADX INFO: renamed from: p */
    public int f4540p;

    /* JADX INFO: renamed from: q */
    public int f4541q;

    /* JADX INFO: renamed from: c.b.a.m.w.g.g$a */
    public static class a extends AbstractC0852c<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final Handler f4542e;

        /* JADX INFO: renamed from: f */
        public final int f4543f;

        /* JADX INFO: renamed from: g */
        public final long f4544g;

        /* JADX INFO: renamed from: h */
        public Bitmap f4545h;

        public a(Handler handler, int i, long j) {
            this.f4542e = handler;
            this.f4543f = i;
            this.f4544g = j;
        }

        @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
        /* JADX INFO: renamed from: c */
        public void mo2510c(Object obj, InterfaceC0860b interfaceC0860b) {
            this.f4545h = (Bitmap) obj;
            this.f4542e.sendMessageAtTime(this.f4542e.obtainMessage(1, this), this.f4544g);
        }

        @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
        /* JADX INFO: renamed from: g */
        public void mo2511g(Drawable drawable) {
            this.f4545h = null;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.g.g$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2502a();
    }

    /* JADX INFO: renamed from: c.b.a.m.w.g.g$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C0798g.this.m2508b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            C0798g.this.f4528d.m2233m((a) message.obj);
            return false;
        }
    }

    public C0798g(ComponentCallbacks2C0616b componentCallbacks2C0616b, InterfaceC0628a interfaceC0628a, int i, int i2, InterfaceC0651s<Bitmap> interfaceC0651s, Bitmap bitmap) {
        InterfaceC0678d interfaceC0678d = componentCallbacks2C0616b.f3754b;
        ComponentCallbacks2C0623i componentCallbacks2C0623iM2208e = ComponentCallbacks2C0616b.m2208e(componentCallbacks2C0616b.f3756d.getBaseContext());
        ComponentCallbacks2C0623i componentCallbacks2C0623iM2208e2 = ComponentCallbacks2C0616b.m2208e(componentCallbacks2C0616b.f3756d.getBaseContext());
        Objects.requireNonNull(componentCallbacks2C0623iM2208e2);
        C0622h<Bitmap> c0622hM2221s = new C0622h(componentCallbacks2C0623iM2208e2.f3821b, componentCallbacks2C0623iM2208e2, Bitmap.class, componentCallbacks2C0623iM2208e2.f3822c).mo2218a(ComponentCallbacks2C0623i.f3820l).mo2218a(C0846f.m2573r(AbstractC0707k.f4168a).m2557q(true).m2554n(true).m2548h(i, i2));
        this.f4527c = new ArrayList();
        this.f4528d = componentCallbacks2C0623iM2208e;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f4529e = interfaceC0678d;
        this.f4526b = handler;
        this.f4532h = c0622hM2221s;
        this.f4525a = interfaceC0628a;
        m2509c(interfaceC0651s, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m2507a() {
        if (!this.f4530f || this.f4531g) {
            return;
        }
        a aVar = this.f4538n;
        if (aVar != null) {
            this.f4538n = null;
            m2508b(aVar);
            return;
        }
        this.f4531g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f4525a.mo2267f());
        this.f4525a.mo2265d();
        this.f4535k = new a(this.f4526b, this.f4525a.mo2262a(), jUptimeMillis);
        C0622h<Bitmap> c0622hM2227y = this.f4532h.mo2218a(new C0846f().m2553m(new C0865d(Double.valueOf(Math.random())))).m2227y(this.f4525a);
        c0622hM2227y.m2225w(this.f4535k, null, c0622hM2227y, C0870e.f4729a);
    }

    /* JADX INFO: renamed from: b */
    public void m2508b(a aVar) {
        this.f4531g = false;
        if (this.f4534j) {
            this.f4526b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f4530f) {
            this.f4538n = aVar;
            return;
        }
        if (aVar.f4545h != null) {
            Bitmap bitmap = this.f4536l;
            if (bitmap != null) {
                this.f4529e.mo2332e(bitmap);
                this.f4536l = null;
            }
            a aVar2 = this.f4533i;
            this.f4533i = aVar;
            int size = this.f4527c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.f4527c.get(size).mo2502a();
                }
            }
            if (aVar2 != null) {
                this.f4526b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m2507a();
    }

    /* JADX INFO: renamed from: c */
    public void m2509c(InterfaceC0651s<Bitmap> interfaceC0651s, Bitmap bitmap) {
        Objects.requireNonNull(interfaceC0651s, "Argument must not be null");
        this.f4537m = interfaceC0651s;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f4536l = bitmap;
        this.f4532h = this.f4532h.mo2218a(new C0846f().m2555o(interfaceC0651s, true));
        this.f4539o = C0875j.m2612d(bitmap);
        this.f4540p = bitmap.getWidth();
        this.f4541q = bitmap.getHeight();
    }
}
