package p006b.p026f.p027a.p028h;

import androidx.recyclerview.widget.RecyclerView;
import p006b.p026f.p027a.C0328g;

/* JADX INFO: renamed from: b.f.a.h.c */
/* JADX INFO: loaded from: classes.dex */
public class C0331c {

    /* JADX INFO: renamed from: b */
    public final C0332d f2274b;

    /* JADX INFO: renamed from: c */
    public final b f2275c;

    /* JADX INFO: renamed from: d */
    public C0331c f2276d;

    /* JADX INFO: renamed from: i */
    public C0328g f2281i;

    /* JADX INFO: renamed from: a */
    public C0338j f2273a = new C0338j(this);

    /* JADX INFO: renamed from: e */
    public int f2277e = 0;

    /* JADX INFO: renamed from: f */
    public int f2278f = -1;

    /* JADX INFO: renamed from: g */
    public a f2279g = a.NONE;

    /* JADX INFO: renamed from: h */
    public int f2280h = 0;

    /* JADX INFO: renamed from: b.f.a.h.c$a */
    public enum a {
        NONE,
        STRONG,
        WEAK
    }

    /* JADX INFO: renamed from: b.f.a.h.c$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0331c(C0332d c0332d, b bVar) {
        this.f2274b = c0332d;
        this.f2275c = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX INFO: renamed from: a */
    public boolean m1335a(C0331c c0331c, int i, int i2, a aVar, int i3, boolean z) {
        boolean z2;
        if (c0331c == null) {
            this.f2276d = null;
            this.f2277e = 0;
            this.f2278f = -1;
            this.f2279g = a.NONE;
            this.f2280h = 2;
            return true;
        }
        if (!z) {
            b bVar = b.CENTER_Y;
            b bVar2 = b.CENTER_X;
            b bVar3 = b.BASELINE;
            b bVar4 = c0331c.f2275c;
            b bVar5 = this.f2275c;
            if (bVar4 == bVar5) {
                if (bVar5 == bVar3) {
                    if (c0331c.f2274b.f2312Q > 0) {
                        if (!(this.f2274b.f2312Q > 0)) {
                        }
                    }
                    z2 = false;
                }
                z2 = true;
            } else {
                switch (bVar5.ordinal()) {
                    case 0:
                    case 5:
                    case 7:
                    case 8:
                        z2 = false;
                        break;
                    case 1:
                    case 3:
                        z2 = bVar4 == b.LEFT || bVar4 == b.RIGHT;
                        if (c0331c.f2274b instanceof C0335g) {
                            if (z2 || bVar4 == bVar2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        break;
                    case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                    case 4:
                        boolean z3 = bVar4 == b.TOP || bVar4 == b.BOTTOM;
                        if (!(c0331c.f2274b instanceof C0335g)) {
                            z2 = z3;
                        } else if (z3 || bVar4 == bVar) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        break;
                    case 6:
                        if (bVar4 == bVar3 || bVar4 == bVar2 || bVar4 == bVar) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        break;
                    default:
                        throw new AssertionError(this.f2275c.name());
                }
            }
            if (!z2) {
                return false;
            }
        }
        this.f2276d = c0331c;
        if (i > 0) {
            this.f2277e = i;
        } else {
            this.f2277e = 0;
        }
        this.f2278f = i2;
        this.f2279g = aVar;
        this.f2280h = i3;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m1336b() {
        C0331c c0331c;
        if (this.f2274b.f2320Y == 8) {
            return 0;
        }
        int i = this.f2278f;
        return (i <= -1 || (c0331c = this.f2276d) == null || c0331c.f2274b.f2320Y != 8) ? this.f2277e : i;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1337c() {
        return this.f2276d != null;
    }

    /* JADX INFO: renamed from: d */
    public void m1338d() {
        this.f2276d = null;
        this.f2277e = 0;
        this.f2278f = -1;
        this.f2279g = a.STRONG;
        this.f2280h = 0;
        this.f2273a.m1384i();
    }

    /* JADX INFO: renamed from: e */
    public void m1339e() {
        C0328g c0328g = this.f2281i;
        if (c0328g == null) {
            this.f2281i = new C0328g(C0328g.a.UNRESTRICTED);
        } else {
            c0328g.m1328c();
        }
    }

    public String toString() {
        return this.f2274b.f2321Z + ":" + this.f2275c.toString();
    }
}
