package p080c.p084b.p085a.p107q;

/* JADX INFO: renamed from: c.b.a.q.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0842b implements InterfaceC0844d, InterfaceC0843c {

    /* JADX INFO: renamed from: a */
    public final Object f4641a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0844d f4642b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC0843c f4643c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC0843c f4644d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0844d.a f4645e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0844d.a f4646f;

    public C0842b(Object obj, InterfaceC0844d interfaceC0844d) {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.CLEARED;
        this.f4645e = aVar;
        this.f4646f = aVar;
        this.f4641a = obj;
        this.f4642b = interfaceC0844d;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d, p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: a */
    public boolean mo2558a() {
        boolean z;
        synchronized (this.f4641a) {
            z = this.f4643c.mo2558a() || this.f4644d.mo2558a();
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: b */
    public boolean mo2559b(InterfaceC0843c interfaceC0843c) {
        boolean z;
        synchronized (this.f4641a) {
            InterfaceC0844d interfaceC0844d = this.f4642b;
            z = true;
            if (!(interfaceC0844d == null || interfaceC0844d.mo2559b(this)) || !m2570m(interfaceC0843c)) {
                z = false;
            }
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: c */
    public InterfaceC0844d mo2560c() {
        InterfaceC0844d interfaceC0844dMo2560c;
        synchronized (this.f4641a) {
            InterfaceC0844d interfaceC0844d = this.f4642b;
            interfaceC0844dMo2560c = interfaceC0844d != null ? interfaceC0844d.mo2560c() : this;
        }
        return interfaceC0844dMo2560c;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    public void clear() {
        synchronized (this.f4641a) {
            InterfaceC0844d.a aVar = InterfaceC0844d.a.CLEARED;
            this.f4645e = aVar;
            this.f4643c.clear();
            if (this.f4646f != aVar) {
                this.f4646f = aVar;
                this.f4644d.clear();
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: d */
    public void mo2561d(InterfaceC0843c interfaceC0843c) {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.FAILED;
        synchronized (this.f4641a) {
            if (interfaceC0843c.equals(this.f4644d)) {
                this.f4646f = aVar;
                InterfaceC0844d interfaceC0844d = this.f4642b;
                if (interfaceC0844d != null) {
                    interfaceC0844d.mo2561d(this);
                }
                return;
            }
            this.f4645e = aVar;
            InterfaceC0844d.a aVar2 = this.f4646f;
            InterfaceC0844d.a aVar3 = InterfaceC0844d.a.RUNNING;
            if (aVar2 != aVar3) {
                this.f4646f = aVar3;
                this.f4644d.mo2563f();
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: e */
    public void mo2562e() {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.PAUSED;
        synchronized (this.f4641a) {
            InterfaceC0844d.a aVar2 = this.f4645e;
            InterfaceC0844d.a aVar3 = InterfaceC0844d.a.RUNNING;
            if (aVar2 == aVar3) {
                this.f4645e = aVar;
                this.f4643c.mo2562e();
            }
            if (this.f4646f == aVar3) {
                this.f4646f = aVar;
                this.f4644d.mo2562e();
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: f */
    public void mo2563f() {
        synchronized (this.f4641a) {
            InterfaceC0844d.a aVar = this.f4645e;
            InterfaceC0844d.a aVar2 = InterfaceC0844d.a.RUNNING;
            if (aVar != aVar2) {
                this.f4645e = aVar2;
                this.f4643c.mo2563f();
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: g */
    public void mo2564g(InterfaceC0843c interfaceC0843c) {
        InterfaceC0844d.a aVar = InterfaceC0844d.a.SUCCESS;
        synchronized (this.f4641a) {
            if (interfaceC0843c.equals(this.f4643c)) {
                this.f4645e = aVar;
            } else if (interfaceC0843c.equals(this.f4644d)) {
                this.f4646f = aVar;
            }
            InterfaceC0844d interfaceC0844d = this.f4642b;
            if (interfaceC0844d != null) {
                interfaceC0844d.mo2564g(this);
            }
        }
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: h */
    public boolean mo2565h(InterfaceC0843c interfaceC0843c) {
        if (!(interfaceC0843c instanceof C0842b)) {
            return false;
        }
        C0842b c0842b = (C0842b) interfaceC0843c;
        return this.f4643c.mo2565h(c0842b.f4643c) && this.f4644d.mo2565h(c0842b.f4644d);
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: i */
    public boolean mo2566i() {
        boolean z;
        synchronized (this.f4641a) {
            InterfaceC0844d.a aVar = this.f4645e;
            InterfaceC0844d.a aVar2 = InterfaceC0844d.a.SUCCESS;
            z = aVar == aVar2 || this.f4646f == aVar2;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4641a) {
            InterfaceC0844d.a aVar = this.f4645e;
            InterfaceC0844d.a aVar2 = InterfaceC0844d.a.RUNNING;
            z = aVar == aVar2 || this.f4646f == aVar2;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0843c
    /* JADX INFO: renamed from: j */
    public boolean mo2567j() {
        boolean z;
        synchronized (this.f4641a) {
            InterfaceC0844d.a aVar = this.f4645e;
            InterfaceC0844d.a aVar2 = InterfaceC0844d.a.CLEARED;
            z = aVar == aVar2 && this.f4646f == aVar2;
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: k */
    public boolean mo2568k(InterfaceC0843c interfaceC0843c) {
        boolean z;
        synchronized (this.f4641a) {
            InterfaceC0844d interfaceC0844d = this.f4642b;
            z = true;
            if (!(interfaceC0844d == null || interfaceC0844d.mo2568k(this)) || !m2570m(interfaceC0843c)) {
                z = false;
            }
        }
        return z;
    }

    @Override // p080c.p084b.p085a.p107q.InterfaceC0844d
    /* JADX INFO: renamed from: l */
    public boolean mo2569l(InterfaceC0843c interfaceC0843c) {
        boolean z;
        synchronized (this.f4641a) {
            InterfaceC0844d interfaceC0844d = this.f4642b;
            z = true;
            if (!(interfaceC0844d == null || interfaceC0844d.mo2569l(this)) || !m2570m(interfaceC0843c)) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2570m(InterfaceC0843c interfaceC0843c) {
        return interfaceC0843c.equals(this.f4643c) || (this.f4645e == InterfaceC0844d.a.FAILED && interfaceC0843c.equals(this.f4644d));
    }
}
