package p080c.p084b.p085a.p088m.p095v;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import p080c.p084b.p085a.p111s.C0872g;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.v.m */
/* JADX INFO: loaded from: classes.dex */
public class C0735m<A, B> {

    /* JADX INFO: renamed from: a */
    public final C0872g<b<A>, B> f4322a;

    /* JADX INFO: renamed from: c.b.a.m.v.m$a */
    public class a extends C0872g<b<A>, B> {
        public a(C0735m c0735m, long j) {
            super(j);
        }

        @Override // p080c.p084b.p085a.p111s.C0872g
        /* JADX INFO: renamed from: c */
        public void mo2360c(Object obj, Object obj2) {
            b<?> bVar = (b) obj;
            Objects.requireNonNull(bVar);
            Queue<b<?>> queue = b.f4323d;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.m$b */
    public static final class b<A> {

        /* JADX INFO: renamed from: d */
        public static final Queue<b<?>> f4323d;

        /* JADX INFO: renamed from: a */
        public int f4324a;

        /* JADX INFO: renamed from: b */
        public int f4325b;

        /* JADX INFO: renamed from: c */
        public A f4326c;

        static {
            char[] cArr = C0875j.f4742a;
            f4323d = new ArrayDeque(0);
        }

        /* JADX INFO: renamed from: a */
        public static <A> b<A> m2442a(A a2, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = f4323d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.f4326c = a2;
            bVar.f4325b = i;
            bVar.f4324a = i2;
            return bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4325b == bVar.f4325b && this.f4324a == bVar.f4324a && this.f4326c.equals(bVar.f4326c);
        }

        public int hashCode() {
            return this.f4326c.hashCode() + (((this.f4324a * 31) + this.f4325b) * 31);
        }
    }

    public C0735m(long j) {
        this.f4322a = new a(this, j);
    }
}
