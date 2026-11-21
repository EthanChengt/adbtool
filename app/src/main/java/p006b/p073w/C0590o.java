package p006b.p073w;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.w.o */
/* JADX INFO: loaded from: classes.dex */
public class C0590o extends AbstractC0584i {

    /* JADX INFO: renamed from: A */
    public int f3612A;

    /* JADX INFO: renamed from: y */
    public ArrayList<AbstractC0584i> f3615y = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    public boolean f3616z = true;

    /* JADX INFO: renamed from: B */
    public boolean f3613B = false;

    /* JADX INFO: renamed from: C */
    public int f3614C = 0;

    /* JADX INFO: renamed from: b.w.o$a */
    public class a extends C0587l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0584i f3617a;

        public a(C0590o c0590o, AbstractC0584i abstractC0584i) {
            this.f3617a = abstractC0584i;
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: e */
        public void mo2087e(AbstractC0584i abstractC0584i) {
            this.f3617a.mo2130y();
            abstractC0584i.mo2127v(this);
        }
    }

    /* JADX INFO: renamed from: b.w.o$b */
    public static class b extends C0587l {

        /* JADX INFO: renamed from: a */
        public C0590o f3618a;

        public b(C0590o c0590o) {
            this.f3618a = c0590o;
        }

        @Override // p006b.p073w.C0587l, p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: c */
        public void mo2098c(AbstractC0584i abstractC0584i) {
            C0590o c0590o = this.f3618a;
            if (c0590o.f3613B) {
                return;
            }
            c0590o.m2112F();
            this.f3618a.f3613B = true;
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: e */
        public void mo2087e(AbstractC0584i abstractC0584i) {
            C0590o c0590o = this.f3618a;
            int i = c0590o.f3612A - 1;
            c0590o.f3612A = i;
            if (i == 0) {
                c0590o.f3613B = false;
                c0590o.m2122m();
            }
            abstractC0584i.mo2127v(this);
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: A */
    public void mo2107A(AbstractC0584i.c cVar) {
        this.f3595t = cVar;
        this.f3614C |= 8;
        int size = this.f3615y.size();
        for (int i = 0; i < size; i++) {
            this.f3615y.get(i).mo2107A(cVar);
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: B */
    public AbstractC0584i mo2108B(TimeInterpolator timeInterpolator) {
        this.f3614C |= 1;
        ArrayList<AbstractC0584i> arrayList = this.f3615y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3615y.get(i).mo2108B(timeInterpolator);
            }
        }
        this.f3580e = timeInterpolator;
        return this;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: C */
    public void mo2109C(AbstractC0580e abstractC0580e) {
        this.f3596u = abstractC0580e == null ? AbstractC0584i.f3575w : abstractC0580e;
        this.f3614C |= 4;
        if (this.f3615y != null) {
            for (int i = 0; i < this.f3615y.size(); i++) {
                this.f3615y.get(i).mo2109C(abstractC0580e);
            }
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: D */
    public void mo2110D(AbstractC0589n abstractC0589n) {
        this.f3614C |= 2;
        int size = this.f3615y.size();
        for (int i = 0; i < size; i++) {
            this.f3615y.get(i).mo2110D(abstractC0589n);
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: E */
    public AbstractC0584i mo2111E(long j) {
        this.f3578c = j;
        return this;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: G */
    public String mo2113G(String str) {
        String strMo2113G = super.mo2113G(str);
        for (int i = 0; i < this.f3615y.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo2113G);
            sb.append("\n");
            sb.append(this.f3615y.get(i).mo2113G(str + "  "));
            strMo2113G = sb.toString();
        }
        return strMo2113G;
    }

    /* JADX INFO: renamed from: H */
    public C0590o m2133H(AbstractC0584i abstractC0584i) {
        this.f3615y.add(abstractC0584i);
        abstractC0584i.f3585j = this;
        long j = this.f3579d;
        if (j >= 0) {
            abstractC0584i.mo2131z(j);
        }
        if ((this.f3614C & 1) != 0) {
            abstractC0584i.mo2108B(this.f3580e);
        }
        if ((this.f3614C & 2) != 0) {
            abstractC0584i.mo2110D(null);
        }
        if ((this.f3614C & 4) != 0) {
            abstractC0584i.mo2109C(this.f3596u);
        }
        if ((this.f3614C & 8) != 0) {
            abstractC0584i.mo2107A(this.f3595t);
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public AbstractC0584i m2134I(int i) {
        if (i < 0 || i >= this.f3615y.size()) {
            return null;
        }
        return this.f3615y.get(i);
    }

    /* JADX INFO: renamed from: J */
    public C0590o m2135J(int i) {
        if (i == 0) {
            this.f3616z = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(a.m2198l("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f3616z = false;
        }
        return this;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: a */
    public AbstractC0584i mo2114a(AbstractC0584i.d dVar) {
        super.mo2114a(dVar);
        return this;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: b */
    public AbstractC0584i mo2115b(View view) {
        for (int i = 0; i < this.f3615y.size(); i++) {
            this.f3615y.get(i).mo2115b(view);
        }
        this.f3582g.add(view);
        return this;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: d */
    public void mo2089d(C0592q c0592q) {
        if (m2125s(c0592q.f3623b)) {
            for (AbstractC0584i abstractC0584i : this.f3615y) {
                if (abstractC0584i.m2125s(c0592q.f3623b)) {
                    abstractC0584i.mo2089d(c0592q);
                    c0592q.f3624c.add(abstractC0584i);
                }
            }
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: f */
    public void mo2117f(C0592q c0592q) {
        int size = this.f3615y.size();
        for (int i = 0; i < size; i++) {
            this.f3615y.get(i).mo2117f(c0592q);
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: g */
    public void mo2090g(C0592q c0592q) {
        if (m2125s(c0592q.f3623b)) {
            for (AbstractC0584i abstractC0584i : this.f3615y) {
                if (abstractC0584i.m2125s(c0592q.f3623b)) {
                    abstractC0584i.mo2090g(c0592q);
                    c0592q.f3624c.add(abstractC0584i);
                }
            }
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: j */
    public AbstractC0584i clone() {
        C0590o c0590o = (C0590o) super.clone();
        c0590o.f3615y = new ArrayList<>();
        int size = this.f3615y.size();
        for (int i = 0; i < size; i++) {
            AbstractC0584i abstractC0584iClone = this.f3615y.get(i).clone();
            c0590o.f3615y.add(abstractC0584iClone);
            abstractC0584iClone.f3585j = c0590o;
        }
        return c0590o;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: l */
    public void mo2121l(ViewGroup viewGroup, C0593r c0593r, C0593r c0593r2, ArrayList<C0592q> arrayList, ArrayList<C0592q> arrayList2) {
        long j = this.f3578c;
        int size = this.f3615y.size();
        for (int i = 0; i < size; i++) {
            AbstractC0584i abstractC0584i = this.f3615y.get(i);
            if (j > 0 && (this.f3616z || i == 0)) {
                long j2 = abstractC0584i.f3578c;
                if (j2 > 0) {
                    abstractC0584i.mo2111E(j2 + j);
                } else {
                    abstractC0584i.mo2111E(j);
                }
            }
            abstractC0584i.mo2121l(viewGroup, c0593r, c0593r2, arrayList, arrayList2);
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: u */
    public void mo2126u(View view) {
        super.mo2126u(view);
        int size = this.f3615y.size();
        for (int i = 0; i < size; i++) {
            this.f3615y.get(i).mo2126u(view);
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: v */
    public AbstractC0584i mo2127v(AbstractC0584i.d dVar) {
        super.mo2127v(dVar);
        return this;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: w */
    public AbstractC0584i mo2128w(View view) {
        for (int i = 0; i < this.f3615y.size(); i++) {
            this.f3615y.get(i).mo2128w(view);
        }
        this.f3582g.remove(view);
        return this;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: x */
    public void mo2129x(View view) {
        super.mo2129x(view);
        int size = this.f3615y.size();
        for (int i = 0; i < size; i++) {
            this.f3615y.get(i).mo2129x(view);
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: y */
    public void mo2130y() {
        if (this.f3615y.isEmpty()) {
            m2112F();
            m2122m();
            return;
        }
        b bVar = new b(this);
        Iterator<AbstractC0584i> it = this.f3615y.iterator();
        while (it.hasNext()) {
            it.next().mo2114a(bVar);
        }
        this.f3612A = this.f3615y.size();
        if (this.f3616z) {
            Iterator<AbstractC0584i> it2 = this.f3615y.iterator();
            while (it2.hasNext()) {
                it2.next().mo2130y();
            }
            return;
        }
        for (int i = 1; i < this.f3615y.size(); i++) {
            this.f3615y.get(i - 1).mo2114a(new a(this, this.f3615y.get(i)));
        }
        AbstractC0584i abstractC0584i = this.f3615y.get(0);
        if (abstractC0584i != null) {
            abstractC0584i.mo2130y();
        }
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: z */
    public AbstractC0584i mo2131z(long j) {
        ArrayList<AbstractC0584i> arrayList;
        this.f3579d = j;
        if (j >= 0 && (arrayList = this.f3615y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3615y.get(i).mo2131z(j);
            }
        }
        return this;
    }
}
