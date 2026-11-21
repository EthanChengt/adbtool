package p006b.p073w;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p006b.p056m.p057b.AbstractC0476m0;

/* JADX INFO: renamed from: b.w.d */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class C0578d extends AbstractC0476m0 {

    /* JADX INFO: renamed from: b.w.d$a */
    public class a extends AbstractC0584i.c {
        public a(C0578d c0578d, Rect rect) {
        }
    }

    /* JADX INFO: renamed from: b.w.d$b */
    public class b implements AbstractC0584i.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f3559a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f3560b;

        public b(C0578d c0578d, View view, ArrayList arrayList) {
            this.f3559a = view;
            this.f3560b = arrayList;
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: a */
        public void mo2085a(AbstractC0584i abstractC0584i) {
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: b */
        public void mo2086b(AbstractC0584i abstractC0584i) {
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: c */
        public void mo2098c(AbstractC0584i abstractC0584i) {
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: d */
        public void mo2093d(AbstractC0584i abstractC0584i) {
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: e */
        public void mo2087e(AbstractC0584i abstractC0584i) {
            abstractC0584i.mo2127v(this);
            this.f3559a.setVisibility(8);
            int size = this.f3560b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3560b.get(i)).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: b.w.d$c */
    public class c extends C0587l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f3561a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f3562b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f3563c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f3564d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f3565e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f3566f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3561a = obj;
            this.f3562b = arrayList;
            this.f3563c = obj2;
            this.f3564d = arrayList2;
            this.f3565e = obj3;
            this.f3566f = arrayList3;
        }

        @Override // p006b.p073w.C0587l, p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: c */
        public void mo2098c(AbstractC0584i abstractC0584i) {
            Object obj = this.f3561a;
            if (obj != null) {
                C0578d.this.mo1766n(obj, this.f3562b, null);
            }
            Object obj2 = this.f3563c;
            if (obj2 != null) {
                C0578d.this.mo1766n(obj2, this.f3564d, null);
            }
            Object obj3 = this.f3565e;
            if (obj3 != null) {
                C0578d.this.mo1766n(obj3, this.f3566f, null);
            }
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: e */
        public void mo2087e(AbstractC0584i abstractC0584i) {
            abstractC0584i.mo2127v(this);
        }
    }

    /* JADX INFO: renamed from: b.w.d$d */
    public class d extends AbstractC0584i.c {
        public d(C0578d c0578d, Rect rect) {
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m2102w(AbstractC0584i abstractC0584i) {
        return (AbstractC0476m0.m1779k(abstractC0584i.f3581f) && AbstractC0476m0.m1779k(null) && AbstractC0476m0.m1779k(null)) ? false : true;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: a */
    public void mo1759a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0584i) obj).mo2115b(view);
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: b */
    public void mo1760b(Object obj, ArrayList<View> arrayList) {
        AbstractC0584i abstractC0584i = (AbstractC0584i) obj;
        if (abstractC0584i == null) {
            return;
        }
        int i = 0;
        if (abstractC0584i instanceof C0590o) {
            C0590o c0590o = (C0590o) abstractC0584i;
            int size = c0590o.f3615y.size();
            while (i < size) {
                mo1760b(c0590o.m2134I(i), arrayList);
                i++;
            }
            return;
        }
        if (m2102w(abstractC0584i) || !AbstractC0476m0.m1779k(abstractC0584i.f3582g)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            abstractC0584i.mo2115b(arrayList.get(i));
            i++;
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: c */
    public void mo1761c(ViewGroup viewGroup, Object obj) {
        AbstractC0584i abstractC0584i = (AbstractC0584i) obj;
        if (C0588m.f3607c.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (viewGroup.isLaidOut()) {
            C0588m.f3607c.add(viewGroup);
            AbstractC0584i abstractC0584iClone = abstractC0584i.clone();
            ArrayList<AbstractC0584i> orDefault = C0588m.m2132a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<AbstractC0584i> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().mo2126u(viewGroup);
                }
            }
            if (abstractC0584iClone != null) {
                abstractC0584iClone.m2118h(viewGroup, true);
            }
            if (((C0583h) viewGroup.getTag(R.id.pk)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.pk, null);
            if (abstractC0584iClone != null) {
                C0588m.a aVar = new C0588m.a(abstractC0584iClone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: e */
    public boolean mo1762e(Object obj) {
        return obj instanceof AbstractC0584i;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: g */
    public Object mo1763g(Object obj) {
        if (obj != null) {
            return ((AbstractC0584i) obj).clone();
        }
        return null;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: l */
    public Object mo1764l(Object obj, Object obj2, Object obj3) {
        C0590o c0590o = new C0590o();
        if (obj != null) {
            c0590o.m2133H((AbstractC0584i) obj);
        }
        if (obj2 != null) {
            c0590o.m2133H((AbstractC0584i) obj2);
        }
        if (obj3 != null) {
            c0590o.m2133H((AbstractC0584i) obj3);
        }
        return c0590o;
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: m */
    public void mo1765m(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0584i) obj).mo2128w(view);
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: n */
    public void mo1766n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0584i abstractC0584i = (AbstractC0584i) obj;
        int i = 0;
        if (abstractC0584i instanceof C0590o) {
            C0590o c0590o = (C0590o) abstractC0584i;
            int size = c0590o.f3615y.size();
            while (i < size) {
                mo1766n(c0590o.m2134I(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m2102w(abstractC0584i)) {
            return;
        }
        ArrayList<View> arrayList3 = abstractC0584i.f3582g;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            abstractC0584i.mo2115b(arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC0584i.mo2128w(arrayList.get(size3));
            }
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: o */
    public void mo1767o(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0584i) obj).mo2114a(new b(this, view, arrayList));
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: p */
    public void mo1768p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC0584i) obj).mo2114a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: q */
    public void mo1769q(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0584i) obj).mo2107A(new d(this, rect));
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: r */
    public void mo1770r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1782j(view, rect);
            ((AbstractC0584i) obj).mo2107A(new a(this, rect));
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: t */
    public void mo1772t(Object obj, View view, ArrayList<View> arrayList) {
        C0590o c0590o = (C0590o) obj;
        ArrayList<View> arrayList2 = c0590o.f3582g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0476m0.m1777d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo1760b(c0590o, arrayList);
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: u */
    public void mo1773u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0590o c0590o = (C0590o) obj;
        if (c0590o != null) {
            c0590o.f3582g.clear();
            c0590o.f3582g.addAll(arrayList2);
            mo1766n(c0590o, arrayList, arrayList2);
        }
    }

    @Override // p006b.p056m.p057b.AbstractC0476m0
    /* JADX INFO: renamed from: v */
    public Object mo1774v(Object obj) {
        if (obj == null) {
            return null;
        }
        C0590o c0590o = new C0590o();
        c0590o.m2133H((AbstractC0584i) obj);
        return c0590o;
    }
}
