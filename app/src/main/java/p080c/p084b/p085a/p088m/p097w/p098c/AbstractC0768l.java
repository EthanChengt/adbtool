package p080c.p084b.p085a.p088m.p097w.p098c;

import p080c.p084b.p085a.p088m.C0646n;

/* JADX INFO: renamed from: c.b.a.m.w.c.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0768l {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0768l f4433a = new c();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0768l f4434b = new a();

    /* JADX INFO: renamed from: c */
    public static final AbstractC0768l f4435c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC0768l f4436d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC0768l f4437e;

    /* JADX INFO: renamed from: f */
    public static final C0646n<AbstractC0768l> f4438f;

    /* JADX INFO: renamed from: g */
    public static final boolean f4439g;

    /* JADX INFO: renamed from: c.b.a.m.w.c.l$a */
    public static class a extends AbstractC0768l {
        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: a */
        public e mo2467a(int i, int i2, int i3, int i4) {
            e eVar = e.QUALITY;
            return (mo2468b(i, i2, i3, i4) == 1.0f || AbstractC0768l.f4439g) ? eVar : e.MEMORY;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: b */
        public float mo2468b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC0768l.f4433a.mo2468b(i, i2, i3, i4));
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.l$b */
    public static class b extends AbstractC0768l {
        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: a */
        public e mo2467a(int i, int i2, int i3, int i4) {
            return e.QUALITY;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: b */
        public float mo2468b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.l$c */
    public static class c extends AbstractC0768l {
        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: a */
        public e mo2467a(int i, int i2, int i3, int i4) {
            return AbstractC0768l.f4439g ? e.QUALITY : e.MEMORY;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: b */
        public float mo2468b(int i, int i2, int i3, int i4) {
            if (AbstractC0768l.f4439g) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.l$d */
    public static class d extends AbstractC0768l {
        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: a */
        public e mo2467a(int i, int i2, int i3, int i4) {
            return e.QUALITY;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l
        /* JADX INFO: renamed from: b */
        public float mo2468b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.l$e */
    public enum e {
        MEMORY,
        QUALITY
    }

    static {
        b bVar = new b();
        f4435c = bVar;
        f4436d = new d();
        f4437e = bVar;
        f4438f = C0646n.m2283a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
        f4439g = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract e mo2467a(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: b */
    public abstract float mo2468b(int i, int i2, int i3, int i4);
}
