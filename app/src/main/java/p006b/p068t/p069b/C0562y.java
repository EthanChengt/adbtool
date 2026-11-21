package p006b.p068t.p069b;

import android.view.View;

/* JADX INFO: renamed from: b.t.b.y */
/* JADX INFO: loaded from: classes.dex */
public class C0562y {

    /* JADX INFO: renamed from: a */
    public final b f3457a;

    /* JADX INFO: renamed from: b */
    public a f3458b = new a();

    /* JADX INFO: renamed from: b.t.b.y$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f3459a = 0;

        /* JADX INFO: renamed from: b */
        public int f3460b;

        /* JADX INFO: renamed from: c */
        public int f3461c;

        /* JADX INFO: renamed from: d */
        public int f3462d;

        /* JADX INFO: renamed from: e */
        public int f3463e;

        /* JADX INFO: renamed from: a */
        public boolean m2064a() {
            int i = this.f3459a;
            if ((i & 7) != 0 && (i & (m2065b(this.f3462d, this.f3460b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3459a;
            if ((i2 & 112) != 0 && (i2 & (m2065b(this.f3462d, this.f3461c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3459a;
            if ((i3 & 1792) != 0 && (i3 & (m2065b(this.f3463e, this.f3460b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3459a;
            return (i4 & 28672) == 0 || (i4 & (m2065b(this.f3463e, this.f3461c) << 12)) != 0;
        }

        /* JADX INFO: renamed from: b */
        public int m2065b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    /* JADX INFO: renamed from: b.t.b.y$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        View mo621a(int i);

        /* JADX INFO: renamed from: b */
        int mo622b();

        /* JADX INFO: renamed from: c */
        int mo623c();

        /* JADX INFO: renamed from: d */
        int mo624d(View view);

        /* JADX INFO: renamed from: e */
        int mo625e(View view);
    }

    public C0562y(b bVar) {
        this.f3457a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public View m2062a(int i, int i2, int i3, int i4) {
        int iMo623c = this.f3457a.mo623c();
        int iMo622b = this.f3457a.mo622b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo621a = this.f3457a.mo621a(i);
            int iMo625e = this.f3457a.mo625e(viewMo621a);
            int iMo624d = this.f3457a.mo624d(viewMo621a);
            a aVar = this.f3458b;
            aVar.f3460b = iMo623c;
            aVar.f3461c = iMo622b;
            aVar.f3462d = iMo625e;
            aVar.f3463e = iMo624d;
            if (i3 != 0) {
                aVar.f3459a = 0;
                aVar.f3459a = i3 | 0;
                if (aVar.m2064a()) {
                    return viewMo621a;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.f3458b;
                aVar2.f3459a = 0;
                aVar2.f3459a = i4 | 0;
                if (aVar2.m2064a()) {
                    view = viewMo621a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2063b(View view, int i) {
        a aVar = this.f3458b;
        int iMo623c = this.f3457a.mo623c();
        int iMo622b = this.f3457a.mo622b();
        int iMo625e = this.f3457a.mo625e(view);
        int iMo624d = this.f3457a.mo624d(view);
        aVar.f3460b = iMo623c;
        aVar.f3461c = iMo622b;
        aVar.f3462d = iMo625e;
        aVar.f3463e = iMo624d;
        if (i == 0) {
            return false;
        }
        a aVar2 = this.f3458b;
        aVar2.f3459a = 0;
        aVar2.f3459a = 0 | i;
        return aVar2.m2064a();
    }
}
