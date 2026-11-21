package p006b.p068t.p069b;

import androidx.recyclerview.widget.RecyclerView;
import p006b.p025e.C0317e;
import p006b.p025e.C0320h;
import p006b.p032h.p043i.C0404d;
import p006b.p032h.p043i.InterfaceC0403c;

/* JADX INFO: renamed from: b.t.b.z */
/* JADX INFO: loaded from: classes.dex */
public class C0563z {

    /* JADX INFO: renamed from: a */
    public final C0320h<RecyclerView.AbstractC0129d0, a> f3464a = new C0320h<>();

    /* JADX INFO: renamed from: b */
    public final C0317e<RecyclerView.AbstractC0129d0> f3465b = new C0317e<>();

    /* JADX INFO: renamed from: b.t.b.z$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static InterfaceC0403c<a> f3466d = new C0404d(20);

        /* JADX INFO: renamed from: a */
        public int f3467a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0137l.c f3468b;

        /* JADX INFO: renamed from: c */
        public RecyclerView.AbstractC0137l.c f3469c;

        /* JADX INFO: renamed from: a */
        public static a m2073a() {
            a aVarMo1537b = f3466d.mo1537b();
            return aVarMo1537b == null ? new a() : aVarMo1537b;
        }

        /* JADX INFO: renamed from: b */
        public static void m2074b(a aVar) {
            aVar.f3467a = 0;
            aVar.f3468b = null;
            aVar.f3469c = null;
            f3466d.mo1536a(aVar);
        }
    }

    /* JADX INFO: renamed from: b.t.b.z$b */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    public void m2066a(RecyclerView.AbstractC0129d0 abstractC0129d0) {
        a orDefault = this.f3464a.getOrDefault(abstractC0129d0, null);
        if (orDefault == null) {
            orDefault = a.m2073a();
            this.f3464a.put(abstractC0129d0, orDefault);
        }
        orDefault.f3467a |= 1;
    }

    /* JADX INFO: renamed from: b */
    public void m2067b(RecyclerView.AbstractC0129d0 abstractC0129d0, RecyclerView.AbstractC0137l.c cVar) {
        a orDefault = this.f3464a.getOrDefault(abstractC0129d0, null);
        if (orDefault == null) {
            orDefault = a.m2073a();
            this.f3464a.put(abstractC0129d0, orDefault);
        }
        orDefault.f3469c = cVar;
        orDefault.f3467a |= 8;
    }

    /* JADX INFO: renamed from: c */
    public void m2068c(RecyclerView.AbstractC0129d0 abstractC0129d0, RecyclerView.AbstractC0137l.c cVar) {
        a orDefault = this.f3464a.getOrDefault(abstractC0129d0, null);
        if (orDefault == null) {
            orDefault = a.m2073a();
            this.f3464a.put(abstractC0129d0, orDefault);
        }
        orDefault.f3468b = cVar;
        orDefault.f3467a |= 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2069d(RecyclerView.AbstractC0129d0 abstractC0129d0) {
        a orDefault = this.f3464a.getOrDefault(abstractC0129d0, null);
        return (orDefault == null || (orDefault.f3467a & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final RecyclerView.AbstractC0137l.c m2070e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        a aVarM1276l;
        RecyclerView.AbstractC0137l.c cVar;
        int iM1269e = this.f3464a.m1269e(abstractC0129d0);
        if (iM1269e >= 0 && (aVarM1276l = this.f3464a.m1276l(iM1269e)) != null) {
            int i2 = aVarM1276l.f3467a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                aVarM1276l.f3467a = i3;
                if (i == 4) {
                    cVar = aVarM1276l.f3468b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM1276l.f3469c;
                }
                if ((i3 & 12) == 0) {
                    this.f3464a.mo1274j(iM1269e);
                    a.m2074b(aVarM1276l);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m2071f(RecyclerView.AbstractC0129d0 abstractC0129d0) {
        a orDefault = this.f3464a.getOrDefault(abstractC0129d0, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f3467a &= -2;
    }

    /* JADX INFO: renamed from: g */
    public void m2072g(RecyclerView.AbstractC0129d0 abstractC0129d0) {
        for (int iM1256h = this.f3465b.m1256h() - 1; iM1256h >= 0; iM1256h--) {
            if (abstractC0129d0 == this.f3465b.m1257i(iM1256h)) {
                C0317e<RecyclerView.AbstractC0129d0> c0317e = this.f3465b;
                Object[] objArr = c0317e.f2167d;
                Object obj = objArr[iM1256h];
                Object obj2 = C0317e.f2164f;
                if (obj == obj2) {
                    break;
                }
                objArr[iM1256h] = obj2;
                c0317e.f2165b = true;
                break;
            }
        }
        a aVarRemove = this.f3464a.remove(abstractC0129d0);
        if (aVarRemove != null) {
            a.m2074b(aVarRemove);
        }
    }
}
