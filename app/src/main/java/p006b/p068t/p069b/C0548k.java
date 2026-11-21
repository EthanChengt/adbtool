package p006b.p068t.p069b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.t.b.k */
/* JADX INFO: loaded from: classes.dex */
public class C0548k extends AbstractC0559v {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f3349s;

    /* JADX INFO: renamed from: h */
    public ArrayList<RecyclerView.AbstractC0129d0> f3350h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public ArrayList<RecyclerView.AbstractC0129d0> f3351i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public ArrayList<b> f3352j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public ArrayList<a> f3353k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public ArrayList<ArrayList<RecyclerView.AbstractC0129d0>> f3354l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public ArrayList<ArrayList<b>> f3355m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public ArrayList<ArrayList<a>> f3356n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public ArrayList<RecyclerView.AbstractC0129d0> f3357o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public ArrayList<RecyclerView.AbstractC0129d0> f3358p = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public ArrayList<RecyclerView.AbstractC0129d0> f3359q = new ArrayList<>();

    /* JADX INFO: renamed from: r */
    public ArrayList<RecyclerView.AbstractC0129d0> f3360r = new ArrayList<>();

    /* JADX INFO: renamed from: b.t.b.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0129d0 f3361a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0129d0 f3362b;

        /* JADX INFO: renamed from: c */
        public int f3363c;

        /* JADX INFO: renamed from: d */
        public int f3364d;

        /* JADX INFO: renamed from: e */
        public int f3365e;

        /* JADX INFO: renamed from: f */
        public int f3366f;

        public a(RecyclerView.AbstractC0129d0 abstractC0129d0, RecyclerView.AbstractC0129d0 abstractC0129d1, int i, int i2, int i3, int i4) {
            this.f3361a = abstractC0129d0;
            this.f3362b = abstractC0129d1;
            this.f3363c = i;
            this.f3364d = i2;
            this.f3365e = i3;
            this.f3366f = i4;
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("ChangeInfo{oldHolder=");
            sbM2191e.append(this.f3361a);
            sbM2191e.append(", newHolder=");
            sbM2191e.append(this.f3362b);
            sbM2191e.append(", fromX=");
            sbM2191e.append(this.f3363c);
            sbM2191e.append(", fromY=");
            sbM2191e.append(this.f3364d);
            sbM2191e.append(", toX=");
            sbM2191e.append(this.f3365e);
            sbM2191e.append(", toY=");
            sbM2191e.append(this.f3366f);
            sbM2191e.append('}');
            return sbM2191e.toString();
        }
    }

    /* JADX INFO: renamed from: b.t.b.k$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0129d0 f3367a;

        /* JADX INFO: renamed from: b */
        public int f3368b;

        /* JADX INFO: renamed from: c */
        public int f3369c;

        /* JADX INFO: renamed from: d */
        public int f3370d;

        /* JADX INFO: renamed from: e */
        public int f3371e;

        public b(RecyclerView.AbstractC0129d0 abstractC0129d0, int i, int i2, int i3, int i4) {
            this.f3367a = abstractC0129d0;
            this.f3368b = i;
            this.f3369c = i2;
            this.f3370d = i3;
            this.f3371e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0137l
    /* JADX INFO: renamed from: e */
    public void mo552e(RecyclerView.AbstractC0129d0 abstractC0129d0) {
        View view = abstractC0129d0.f927a;
        view.animate().cancel();
        int size = this.f3352j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f3352j.get(size).f3367a == abstractC0129d0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m550c(abstractC0129d0);
                this.f3352j.remove(size);
            }
        }
        m2019l(this.f3353k, abstractC0129d0);
        if (this.f3350h.remove(abstractC0129d0)) {
            view.setAlpha(1.0f);
            m550c(abstractC0129d0);
        }
        if (this.f3351i.remove(abstractC0129d0)) {
            view.setAlpha(1.0f);
            m550c(abstractC0129d0);
        }
        int size2 = this.f3356n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.f3356n.get(size2);
            m2019l(arrayList, abstractC0129d0);
            if (arrayList.isEmpty()) {
                this.f3356n.remove(size2);
            }
        }
        int size3 = this.f3355m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.f3355m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f3367a == abstractC0129d0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m550c(abstractC0129d0);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f3355m.remove(size3);
                    break;
                }
            }
        }
        int size5 = this.f3354l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f3359q.remove(abstractC0129d0);
                this.f3357o.remove(abstractC0129d0);
                this.f3360r.remove(abstractC0129d0);
                this.f3358p.remove(abstractC0129d0);
                m2018k();
                return;
            }
            ArrayList<RecyclerView.AbstractC0129d0> arrayList3 = this.f3354l.get(size5);
            if (arrayList3.remove(abstractC0129d0)) {
                view.setAlpha(1.0f);
                m550c(abstractC0129d0);
                if (arrayList3.isEmpty()) {
                    this.f3354l.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0137l
    /* JADX INFO: renamed from: f */
    public void mo553f() {
        int size = this.f3352j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f3352j.get(size);
            View view = bVar.f3367a.f927a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m550c(bVar.f3367a);
            this.f3352j.remove(size);
        }
        int size2 = this.f3350h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m550c(this.f3350h.get(size2));
            this.f3350h.remove(size2);
        }
        int size3 = this.f3351i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0129d0 abstractC0129d0 = this.f3351i.get(size3);
            abstractC0129d0.f927a.setAlpha(1.0f);
            m550c(abstractC0129d0);
            this.f3351i.remove(size3);
        }
        int size4 = this.f3353k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f3353k.get(size4);
            RecyclerView.AbstractC0129d0 abstractC0129d1 = aVar.f3361a;
            if (abstractC0129d1 != null) {
                m2020m(aVar, abstractC0129d1);
            }
            RecyclerView.AbstractC0129d0 abstractC0129d2 = aVar.f3362b;
            if (abstractC0129d2 != null) {
                m2020m(aVar, abstractC0129d2);
            }
        }
        this.f3353k.clear();
        if (!mo554g()) {
            return;
        }
        int size5 = this.f3355m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.f3355m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f3367a.f927a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m550c(bVar2.f3367a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3355m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f3354l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.AbstractC0129d0> arrayList2 = this.f3354l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.AbstractC0129d0 abstractC0129d3 = arrayList2.get(size8);
                    abstractC0129d3.f927a.setAlpha(1.0f);
                    m550c(abstractC0129d3);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3354l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f3356n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                m2017j(this.f3359q);
                m2017j(this.f3358p);
                m2017j(this.f3357o);
                m2017j(this.f3360r);
                m551d();
                return;
            }
            ArrayList<a> arrayList3 = this.f3356n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    a aVar2 = arrayList3.get(size10);
                    RecyclerView.AbstractC0129d0 abstractC0129d4 = aVar2.f3361a;
                    if (abstractC0129d4 != null) {
                        m2020m(aVar2, abstractC0129d4);
                    }
                    RecyclerView.AbstractC0129d0 abstractC0129d5 = aVar2.f3362b;
                    if (abstractC0129d5 != null) {
                        m2020m(aVar2, abstractC0129d5);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f3356n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0137l
    /* JADX INFO: renamed from: g */
    public boolean mo554g() {
        return (this.f3351i.isEmpty() && this.f3353k.isEmpty() && this.f3352j.isEmpty() && this.f3350h.isEmpty() && this.f3358p.isEmpty() && this.f3359q.isEmpty() && this.f3357o.isEmpty() && this.f3360r.isEmpty() && this.f3355m.isEmpty() && this.f3354l.isEmpty() && this.f3356n.isEmpty()) ? false : true;
    }

    @Override // p006b.p068t.p069b.AbstractC0559v
    /* JADX INFO: renamed from: i */
    public boolean mo2016i(RecyclerView.AbstractC0129d0 abstractC0129d0, int i, int i2, int i3, int i4) {
        View view = abstractC0129d0.f927a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0129d0.f927a.getTranslationY());
        m2021n(abstractC0129d0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m550c(abstractC0129d0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f3352j.add(new b(abstractC0129d0, translationX, translationY, i3, i4));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m2017j(List<RecyclerView.AbstractC0129d0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).f927a.animate().cancel();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2018k() {
        if (mo554g()) {
            return;
        }
        m551d();
    }

    /* JADX INFO: renamed from: l */
    public final void m2019l(List<a> list, RecyclerView.AbstractC0129d0 abstractC0129d0) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            a aVar = list.get(size);
            if (m2020m(aVar, abstractC0129d0) && aVar.f3361a == null && aVar.f3362b == null) {
                list.remove(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2020m(a aVar, RecyclerView.AbstractC0129d0 abstractC0129d0) {
        if (aVar.f3362b == abstractC0129d0) {
            aVar.f3362b = null;
        } else {
            if (aVar.f3361a != abstractC0129d0) {
                return false;
            }
            aVar.f3361a = null;
        }
        abstractC0129d0.f927a.setAlpha(1.0f);
        abstractC0129d0.f927a.setTranslationX(0.0f);
        abstractC0129d0.f927a.setTranslationY(0.0f);
        m550c(abstractC0129d0);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m2021n(RecyclerView.AbstractC0129d0 abstractC0129d0) {
        if (f3349s == null) {
            f3349s = new ValueAnimator().getInterpolator();
        }
        abstractC0129d0.f927a.animate().setInterpolator(f3349s);
        mo552e(abstractC0129d0);
    }
}
