package p080c.p084b.p085a.p107q;

/* JADX INFO: renamed from: c.b.a.q.i */
/* JADX INFO: loaded from: classes.dex */
public class C0849i implements InterfaceC0844d, InterfaceC0843c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0844d f4691a;

    /* JADX INFO: renamed from: b */
    public final Object f4692b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC0843c f4693c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC0843c f4694d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0844d.a f4695e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0844d.a f4696f;

    /* JADX INFO: renamed from: g */
    public boolean f4697g;

    public C0849i(Object obj, InterfaceC0844d interfaceC0844d) {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.CLEARED;
        this.f4695e = aVar;
        this.f4696f = aVar;
        this.f4692b = obj;
        this.f4691a = interfaceC0844d;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d, p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: a */
    public boolean mo2558a() {
        boolean z;
        synchronized (this.f4692b) {
            z = this.f4694d.mo2558a() || this.f4693c.mo2558a();
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: b */
    public boolean mo2559b(InterfaceC0843c interfaceC0843c) {
        boolean z;
        synchronized (this.f4692b) {
            InterfaceC0844d interfaceC0844d = this.f4691a;
            z = true;
            if (!(interfaceC0844d == null || interfaceC0844d.mo2559b(this)) || (!interfaceC0843c.equals(this.f4693c) && this.f4695e == InterfaceC0844d.a.SUCCESS)) {
                z = false;
            }
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: c */
    public InterfaceC0844d mo2560c() {
        InterfaceC0844d interfaceC0844dMo2560c;
        synchronized (this.f4692b) {
            InterfaceC0844d interfaceC0844d = this.f4691a;
            interfaceC0844dMo2560c = interfaceC0844d != null ? interfaceC0844d.mo2560c() : this;
        }
        return interfaceC0844dMo2560c;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    public void clear() {
        synchronized (this.f4692b) {
            this.f4697g = false;
            InterfaceC0844d.a aVar = InterfaceC0844d.a.CLEARED;
            this.f4695e = aVar;
            this.f4696f = aVar;
            this.f4694d.clear();
            this.f4693c.clear();
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: d */
    public void mo2561d(InterfaceC0843c interfaceC0843c) {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.FAILED;
        synchronized (this.f4692b) {
            if (!interfaceC0843c.equals(this.f4693c)) {
                this.f4696f = aVar;
                return;
            }
            this.f4695e = aVar;
            InterfaceC0844d interfaceC0844d = this.f4691a;
            if (interfaceC0844d != null) {
                interfaceC0844d.mo2561d(this);
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: e */
    public void mo2562e() {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.PAUSED;
        synchronized (this.f4692b) {
            if (!this.f4696f.f4653b) {
                this.f4696f = aVar;
                this.f4694d.mo2562e();
            }
            if (!this.f4695e.f4653b) {
                this.f4695e = aVar;
                this.f4693c.mo2562e();
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: f */
    public void mo2563f() {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.RUNNING;
        synchronized (this.f4692b) {
            this.f4697g = true;
            try {
                if (this.f4695e != InterfaceC0844d.a.SUCCESS && this.f4696f != aVar) {
                    this.f4696f = aVar;
                    this.f4694d.mo2563f();
                }
                if (this.f4697g && this.f4695e != aVar) {
                    this.f4695e = aVar;
                    this.f4693c.mo2563f();
                }
                this.f4697g = false;
            } catch (Throwable th) {
                this.f4697g = false;
                throw th;
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: g */
    public void mo2564g(InterfaceC0843c interfaceC0843c) {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.SUCCESS;
        synchronized (this.f4692b) {
            if (interfaceC0843c.equals(this.f4694d)) {
                this.f4696f = aVar;
                return;
            }
            this.f4695e = aVar;
            InterfaceC0844d interfaceC0844d = this.f4691a;
            if (interfaceC0844d != null) {
                interfaceC0844d.mo2564g(this);
            }
            if (!this.f4696f.f4653b) {
                this.f4694d.clear();
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: h */
    public boolean mo2565h(InterfaceC0843c interfaceC0843c) {
        if (!(interfaceC0843c instanceof C0849i)) {
            return false;
        }
        C0849i c0849i = (C0849i) interfaceC0843c;
        if (this.f4693c == null) {
            if (c0849i.f4693c != null) {
                return false;
            }
        } else if (!this.f4693c.mo2565h(c0849i.f4693c)) {
            return false;
        }
        if (this.f4694d == null) {
            if (c0849i.f4694d != null) {
                return false;
            }
        } else if (!this.f4694d.mo2565h(c0849i.f4694d)) {
            return false;
        }
        return true;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: i */
    public boolean mo2566i() {
        boolean z;
        synchronized (this.f4692b) {
            z = this.f4695e == InterfaceC0844d.a.SUCCESS;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4692b) {
            z = this.f4695e == InterfaceC0844d.a.RUNNING;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: j */
    public boolean mo2567j() {
        boolean z;
        synchronized (this.f4692b) {
            z = this.f4695e == InterfaceC0844d.a.CLEARED;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: k */
    public boolean mo2568k(InterfaceC0843c interfaceC0843c) {
        boolean z;
        synchronized (this.f4692b) {
            InterfaceC0844d interfaceC0844d = this.f4691a;
            z = true;
            if (!(interfaceC0844d == null || interfaceC0844d.mo2568k(this)) || !interfaceC0843c.equals(this.f4693c) || mo2558a()) {
                z = false;
            }
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: l */
    public boolean mo2569l(InterfaceC0843c interfaceC0843c) {
        boolean z;
        synchronized (this.f4692b) {
            InterfaceC0844d interfaceC0844d = this.f4691a;
            z = true;
            if (!(interfaceC0844d == null || interfaceC0844d.mo2569l(this)) || !interfaceC0843c.equals(this.f4693c) || this.f4695e == InterfaceC0844d.a.PAUSED) {
                z = false;
            }
        }
        return z;
    }
}
