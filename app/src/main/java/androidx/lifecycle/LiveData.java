package androidx.lifecycle;

import java.util.Map;
import p006b.p019c.p020a.p021a.C0299a;
import p006b.p019c.p020a.p022b.C0303b;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;
import p006b.p061o.InterfaceC0508m;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: i */
    public static final Object f720i = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f721a = new Object();

    /* JADX INFO: renamed from: b */
    public C0303b<InterfaceC0508m<? super T>, LiveData<T>.AbstractC0091a> f722b = new C0303b<>();

    /* JADX INFO: renamed from: c */
    public int f723c = 0;

    /* JADX INFO: renamed from: d */
    public volatile Object f724d;

    /* JADX INFO: renamed from: e */
    public volatile Object f725e;

    /* JADX INFO: renamed from: f */
    public int f726f;

    /* JADX INFO: renamed from: g */
    public boolean f727g;

    /* JADX INFO: renamed from: h */
    public boolean f728h;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0091a implements InterfaceC0500e {

        /* JADX INFO: renamed from: e */
        public final InterfaceC0502g f729e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LiveData f730f;

        @Override // p006b.p061o.InterfaceC0500e
        /* JADX INFO: renamed from: d */
        public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
            if (((C0503h) this.f729e.mo4a()).f3187b == AbstractC0499d.b.DESTROYED) {
                this.f730f.mo346f(this.f731a);
            } else {
                m349h(mo348j());
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0091a
        /* JADX INFO: renamed from: i */
        public void mo347i() {
            ((C0503h) this.f729e.mo4a()).f3186a.mo1187e(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0091a
        /* JADX INFO: renamed from: j */
        public boolean mo348j() {
            return ((C0503h) this.f729e.mo4a()).f3187b.compareTo(AbstractC0499d.b.STARTED) >= 0;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$a */
    public abstract class AbstractC0091a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0508m<? super T> f731a;

        /* JADX INFO: renamed from: b */
        public boolean f732b;

        /* JADX INFO: renamed from: c */
        public int f733c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ LiveData f734d;

        /* JADX INFO: renamed from: h */
        public void m349h(boolean z) {
            if (z == this.f732b) {
                return;
            }
            this.f732b = z;
            LiveData liveData = this.f734d;
            int i = liveData.f723c;
            boolean z2 = i == 0;
            liveData.f723c = i + (z ? 1 : -1);
            if (z2 && z) {
                liveData.mo344d();
            }
            LiveData liveData2 = this.f734d;
            if (liveData2.f723c == 0 && !this.f732b) {
                liveData2.mo345e();
            }
            if (this.f732b) {
                this.f734d.m343c(this);
            }
        }

        /* JADX INFO: renamed from: i */
        public void mo347i() {
        }

        /* JADX INFO: renamed from: j */
        public abstract boolean mo348j();
    }

    public LiveData() {
        Object obj = f720i;
        this.f725e = obj;
        this.f724d = obj;
        this.f726f = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m341a(String str) {
        if (!C0299a.m1183b().f2098a.mo1184a()) {
            throw new IllegalStateException(a.m2202p("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m342b(LiveData<T>.AbstractC0091a abstractC0091a) {
        if (abstractC0091a.f732b) {
            if (!abstractC0091a.mo348j()) {
                abstractC0091a.m349h(false);
                return;
            }
            int i = abstractC0091a.f733c;
            int i2 = this.f726f;
            if (i >= i2) {
                return;
            }
            abstractC0091a.f733c = i2;
            abstractC0091a.f731a.m1908a((Object) this.f724d);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m343c(LiveData<T>.AbstractC0091a abstractC0091a) {
        if (this.f727g) {
            this.f728h = true;
            return;
        }
        this.f727g = true;
        do {
            this.f728h = false;
            if (abstractC0091a != null) {
                m342b(abstractC0091a);
                abstractC0091a = null;
            } else {
                C0303b<InterfaceC0508m<? super T>, LiveData<T>.AbstractC0091a>.d dVarM1188b = this.f722b.m1188b();
                while (dVarM1188b.hasNext()) {
                    m342b((AbstractC0091a) ((Map.Entry) dVarM1188b.next()).getValue());
                    if (this.f728h) {
                        break;
                    }
                }
            }
        } while (this.f728h);
        this.f727g = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo344d() {
    }

    /* JADX INFO: renamed from: e */
    public void mo345e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo346f(InterfaceC0508m<? super T> interfaceC0508m) {
        m341a("removeObserver");
        LiveData<T>.AbstractC0091a abstractC0091aMo1187e = this.f722b.mo1187e(interfaceC0508m);
        if (abstractC0091aMo1187e == null) {
            return;
        }
        abstractC0091aMo1187e.mo347i();
        abstractC0091aMo1187e.m349h(false);
    }
}
