package p080c.p084b.p085a.p111s.p112k;

/* JADX INFO: renamed from: c.b.a.s.k.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0879d {

    /* JADX INFO: renamed from: c.b.a.s.k.d$b */
    public static class b extends AbstractC0879d {

        /* JADX INFO: renamed from: a */
        public volatile boolean f4750a;

        public b() {
            super();
        }

        @Override // p080c.p084b.p085a.p111s.p112k.AbstractC0879d
        /* JADX INFO: renamed from: a */
        public void mo2621a() {
            if (this.f4750a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public AbstractC0879d() {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2621a();
}
