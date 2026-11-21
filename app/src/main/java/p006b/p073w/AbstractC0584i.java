package p006b.p073w;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p006b.p025e.C0313a;
import p006b.p025e.C0316d;
import p006b.p025e.C0317e;
import p006b.p032h.p044j.C0418m;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.w.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0584i implements Cloneable {

    /* JADX INFO: renamed from: v */
    public static final int[] f3574v = {2, 1, 3, 4};

    /* JADX INFO: renamed from: w */
    public static final AbstractC0580e f3575w = new a();

    /* JADX INFO: renamed from: x */
    public static ThreadLocal<C0313a<Animator, b>> f3576x = new ThreadLocal<>();

    /* JADX INFO: renamed from: l */
    public ArrayList<C0592q> f3587l;

    /* JADX INFO: renamed from: m */
    public ArrayList<C0592q> f3588m;

    /* JADX INFO: renamed from: t */
    public c f3595t;

    /* JADX INFO: renamed from: b */
    public String f3577b = getClass().getName();

    /* JADX INFO: renamed from: c */
    public long f3578c = -1;

    /* JADX INFO: renamed from: d */
    public long f3579d = -1;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f3580e = null;

    /* JADX INFO: renamed from: f */
    public ArrayList<Integer> f3581f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public ArrayList<View> f3582g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public C0593r f3583h = new C0593r();

    /* JADX INFO: renamed from: i */
    public C0593r f3584i = new C0593r();

    /* JADX INFO: renamed from: j */
    public C0590o f3585j = null;

    /* JADX INFO: renamed from: k */
    public int[] f3586k = f3574v;

    /* JADX INFO: renamed from: n */
    public ArrayList<Animator> f3589n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public int f3590o = 0;

    /* JADX INFO: renamed from: p */
    public boolean f3591p = false;

    /* JADX INFO: renamed from: q */
    public boolean f3592q = false;

    /* JADX INFO: renamed from: r */
    public ArrayList<d> f3593r = null;

    /* JADX INFO: renamed from: s */
    public ArrayList<Animator> f3594s = new ArrayList<>();

    /* JADX INFO: renamed from: u */
    public AbstractC0580e f3596u = f3575w;

    /* JADX INFO: renamed from: b.w.i$a */
    public static class a extends AbstractC0580e {
        @Override // p006b.p073w.AbstractC0580e
        /* JADX INFO: renamed from: a */
        public Path mo2103a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: b.w.i$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public View f3597a;

        /* JADX INFO: renamed from: b */
        public String f3598b;

        /* JADX INFO: renamed from: c */
        public C0592q f3599c;

        /* JADX INFO: renamed from: d */
        public InterfaceC0579d0 f3600d;

        /* JADX INFO: renamed from: e */
        public AbstractC0584i f3601e;

        public b(View view, String str, AbstractC0584i abstractC0584i, InterfaceC0579d0 interfaceC0579d0, C0592q c0592q) {
            this.f3597a = view;
            this.f3598b = str;
            this.f3599c = c0592q;
            this.f3600d = interfaceC0579d0;
            this.f3601e = abstractC0584i;
        }
    }

    /* JADX INFO: renamed from: b.w.i$c */
    public static abstract class c {
    }

    /* JADX INFO: renamed from: b.w.i$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo2085a(AbstractC0584i abstractC0584i);

        /* JADX INFO: renamed from: b */
        void mo2086b(AbstractC0584i abstractC0584i);

        /* JADX INFO: renamed from: c */
        void mo2098c(AbstractC0584i abstractC0584i);

        /* JADX INFO: renamed from: d */
        void mo2093d(AbstractC0584i abstractC0584i);

        /* JADX INFO: renamed from: e */
        void mo2087e(AbstractC0584i abstractC0584i);
    }

    /* JADX INFO: renamed from: c */
    public static void m2104c(C0593r c0593r, View view, C0592q c0592q) {
        c0593r.f3625a.put(view, c0592q);
        int id = view.getId();
        if (id >= 0) {
            if (c0593r.f3626b.indexOfKey(id) >= 0) {
                c0593r.f3626b.put(id, null);
            } else {
                c0593r.f3626b.put(id, view);
            }
        }
        String strM1568k = C0418m.m1568k(view);
        if (strM1568k != null) {
            if (c0593r.f3628d.m1269e(strM1568k) >= 0) {
                c0593r.f3628d.put(strM1568k, null);
            } else {
                c0593r.f3628d.put(strM1568k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0317e<View> c0317e = c0593r.f3627c;
                if (c0317e.f2165b) {
                    c0317e.m1252d();
                }
                if (C0316d.m1244b(c0317e.f2166c, c0317e.f2168e, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0593r.f3627c.m1255g(itemIdAtPosition, view);
                    return;
                }
                View viewM1253e = c0593r.f3627c.m1253e(itemIdAtPosition);
                if (viewM1253e != null) {
                    viewM1253e.setHasTransientState(false);
                    c0593r.f3627c.m1255g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static C0313a<Animator, b> m2105o() {
        C0313a<Animator, b> c0313a = f3576x.get();
        if (c0313a != null) {
            return c0313a;
        }
        C0313a<Animator, b> c0313a2 = new C0313a<>();
        f3576x.set(c0313a2);
        return c0313a2;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m2106t(C0592q c0592q, C0592q c0592q2, String str) {
        Object obj = c0592q.f3622a.get(str);
        Object obj2 = c0592q2.f3622a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo2107A(c cVar) {
        this.f3595t = cVar;
    }

    /* JADX INFO: renamed from: B */
    public AbstractC0584i mo2108B(TimeInterpolator timeInterpolator) {
        this.f3580e = timeInterpolator;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void mo2109C(AbstractC0580e abstractC0580e) {
        if (abstractC0580e == null) {
            abstractC0580e = f3575w;
        }
        this.f3596u = abstractC0580e;
    }

    /* JADX INFO: renamed from: D */
    public void mo2110D(AbstractC0589n abstractC0589n) {
    }

    /* JADX INFO: renamed from: E */
    public AbstractC0584i mo2111E(long j) {
        this.f3578c = j;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public void m2112F() {
        if (this.f3590o == 0) {
            ArrayList<d> arrayList = this.f3593r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3593r.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).mo2098c(this);
                }
            }
            this.f3592q = false;
        }
        this.f3590o++;
    }

    /* JADX INFO: renamed from: G */
    public String mo2113G(String str) {
        StringBuilder sbM2191e = a.m2191e(str);
        sbM2191e.append(getClass().getSimpleName());
        sbM2191e.append("@");
        sbM2191e.append(Integer.toHexString(hashCode()));
        sbM2191e.append(": ");
        String string = sbM2191e.toString();
        if (this.f3579d != -1) {
            string = string + "dur(" + this.f3579d + ") ";
        }
        if (this.f3578c != -1) {
            string = string + "dly(" + this.f3578c + ") ";
        }
        if (this.f3580e != null) {
            string = string + "interp(" + this.f3580e + ") ";
        }
        if (this.f3581f.size() <= 0 && this.f3582g.size() <= 0) {
            return string;
        }
        String strM2201o = a.m2201o(string, "tgts(");
        if (this.f3581f.size() > 0) {
            for (int i = 0; i < this.f3581f.size(); i++) {
                if (i > 0) {
                    strM2201o = a.m2201o(strM2201o, ", ");
                }
                StringBuilder sbM2191e2 = a.m2191e(strM2201o);
                sbM2191e2.append(this.f3581f.get(i));
                strM2201o = sbM2191e2.toString();
            }
        }
        if (this.f3582g.size() > 0) {
            for (int i2 = 0; i2 < this.f3582g.size(); i2++) {
                if (i2 > 0) {
                    strM2201o = a.m2201o(strM2201o, ", ");
                }
                StringBuilder sbM2191e3 = a.m2191e(strM2201o);
                sbM2191e3.append(this.f3582g.get(i2));
                strM2201o = sbM2191e3.toString();
            }
        }
        return a.m2201o(strM2201o, ")");
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0584i mo2114a(d dVar) {
        if (this.f3593r == null) {
            this.f3593r = new ArrayList<>();
        }
        this.f3593r.add(dVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0584i mo2115b(View view) {
        this.f3582g.add(view);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2089d(C0592q c0592q);

    /* JADX INFO: renamed from: e */
    public final void m2116e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0592q c0592q = new C0592q(view);
            if (z) {
                mo2090g(c0592q);
            } else {
                mo2089d(c0592q);
            }
            c0592q.f3624c.add(this);
            mo2117f(c0592q);
            m2104c(z ? this.f3583h : this.f3584i, view, c0592q);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m2116e(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo2117f(C0592q c0592q) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2090g(C0592q c0592q);

    /* JADX INFO: renamed from: h */
    public void m2118h(ViewGroup viewGroup, boolean z) {
        m2119i(z);
        if (this.f3581f.size() <= 0 && this.f3582g.size() <= 0) {
            m2116e(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.f3581f.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(this.f3581f.get(i).intValue());
            if (viewFindViewById != null) {
                C0592q c0592q = new C0592q(viewFindViewById);
                if (z) {
                    mo2090g(c0592q);
                } else {
                    mo2089d(c0592q);
                }
                c0592q.f3624c.add(this);
                mo2117f(c0592q);
                m2104c(z ? this.f3583h : this.f3584i, viewFindViewById, c0592q);
            }
        }
        for (int i2 = 0; i2 < this.f3582g.size(); i2++) {
            View view = this.f3582g.get(i2);
            C0592q c0592q2 = new C0592q(view);
            if (z) {
                mo2090g(c0592q2);
            } else {
                mo2089d(c0592q2);
            }
            c0592q2.f3624c.add(this);
            mo2117f(c0592q2);
            m2104c(z ? this.f3583h : this.f3584i, view, c0592q2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2119i(boolean z) {
        C0593r c0593r;
        if (z) {
            this.f3583h.f3625a.clear();
            this.f3583h.f3626b.clear();
            c0593r = this.f3583h;
        } else {
            this.f3584i.f3625a.clear();
            this.f3584i.f3626b.clear();
            c0593r = this.f3584i;
        }
        c0593r.f3627c.m1250b();
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC0584i clone() {
        try {
            AbstractC0584i abstractC0584i = (AbstractC0584i) super.clone();
            abstractC0584i.f3594s = new ArrayList<>();
            abstractC0584i.f3583h = new C0593r();
            abstractC0584i.f3584i = new C0593r();
            abstractC0584i.f3587l = null;
            abstractC0584i.f3588m = null;
            return abstractC0584i;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public Animator mo2091k(ViewGroup viewGroup, C0592q c0592q, C0592q c0592q2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX INFO: renamed from: l */
    public void mo2121l(ViewGroup viewGroup, C0593r c0593r, C0593r c0593r2, ArrayList<C0592q> arrayList, ArrayList<C0592q> arrayList2) {
        Animator animatorMo2091k;
        int i;
        View view;
        Animator animator;
        C0592q c0592q;
        Animator animator2;
        C0592q c0592q2;
        C0313a<Animator, b> c0313aM2105o = m2105o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C0592q c0592q3 = arrayList.get(i2);
            C0592q c0592q4 = arrayList2.get(i2);
            if (c0592q3 != null && !c0592q3.f3624c.contains(this)) {
                c0592q3 = null;
            }
            if (c0592q4 != null && !c0592q4.f3624c.contains(this)) {
                c0592q4 = null;
            }
            if (c0592q3 == null && c0592q4 == null) {
                i = size;
            } else if (!(c0592q3 == null || c0592q4 == null || mo2097r(c0592q3, c0592q4)) || (animatorMo2091k = mo2091k(viewGroup, c0592q3, c0592q4)) == null) {
                i = size;
            } else {
                if (c0592q4 != null) {
                    View view2 = c0592q4.f3623b;
                    String[] strArrMo2092p = mo2092p();
                    if (strArrMo2092p != null && strArrMo2092p.length > 0) {
                        c0592q2 = new C0592q(view2);
                        C0592q c0592q5 = c0593r2.f3625a.get(view2);
                        if (c0592q5 != null) {
                            int i3 = 0;
                            while (i3 < strArrMo2092p.length) {
                                c0592q2.f3622a.put(strArrMo2092p[i3], c0592q5.f3622a.get(strArrMo2092p[i3]));
                                i3++;
                                animatorMo2091k = animatorMo2091k;
                                size = size;
                                c0592q5 = c0592q5;
                            }
                        }
                        Animator animator3 = animatorMo2091k;
                        i = size;
                        int i4 = c0313aM2105o.f2197d;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i4) {
                                animator2 = animator3;
                                break;
                            }
                            b bVar = c0313aM2105o.get(c0313aM2105o.m1272h(i5));
                            if (bVar.f3599c != null && bVar.f3597a == view2 && bVar.f3598b.equals(this.f3577b) && bVar.f3599c.equals(c0592q2)) {
                                animator2 = null;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        i = size;
                        animator2 = animatorMo2091k;
                        c0592q2 = null;
                    }
                    view = view2;
                    animator = animator2;
                    c0592q = c0592q2;
                } else {
                    i = size;
                    view = c0592q3.f3623b;
                    animator = animatorMo2091k;
                    c0592q = null;
                }
                if (animator != null) {
                    String str = this.f3577b;
                    C0601z c0601z = C0595t.f3630a;
                    c0313aM2105o.put(animator, new b(view, str, this, new C0577c0(viewGroup), c0592q));
                    this.f3594s.add(animator);
                }
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f3594s.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - RecyclerView.FOREVER_NS));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2122m() {
        int i = this.f3590o - 1;
        this.f3590o = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.f3593r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3593r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).mo2087e(this);
                }
            }
            for (int i3 = 0; i3 < this.f3583h.f3627c.m1256h(); i3++) {
                View viewM1257i = this.f3583h.f3627c.m1257i(i3);
                if (viewM1257i != null) {
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    viewM1257i.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.f3584i.f3627c.m1256h(); i4++) {
                View viewM1257i2 = this.f3584i.f3627c.m1257i(i4);
                if (viewM1257i2 != null) {
                    WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                    viewM1257i2.setHasTransientState(false);
                }
            }
            this.f3592q = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public C0592q m2123n(View view, boolean z) {
        C0590o c0590o = this.f3585j;
        if (c0590o != null) {
            return c0590o.m2123n(view, z);
        }
        ArrayList<C0592q> arrayList = z ? this.f3587l : this.f3588m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            C0592q c0592q = arrayList.get(i2);
            if (c0592q == null) {
                return null;
            }
            if (c0592q.f3623b == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            return (z ? this.f3588m : this.f3587l).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public String[] mo2092p() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public C0592q m2124q(View view, boolean z) {
        C0590o c0590o = this.f3585j;
        if (c0590o != null) {
            return c0590o.m2124q(view, z);
        }
        return (z ? this.f3583h : this.f3584i).f3625a.getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo2097r(C0592q c0592q, C0592q c0592q2) {
        if (c0592q == null || c0592q2 == null) {
            return false;
        }
        String[] strArrMo2092p = mo2092p();
        if (strArrMo2092p == null) {
            Iterator<String> it = c0592q.f3622a.keySet().iterator();
            while (it.hasNext()) {
                if (m2106t(c0592q, c0592q2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo2092p) {
            if (!m2106t(c0592q, c0592q2, str)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m2125s(View view) {
        return (this.f3581f.size() == 0 && this.f3582g.size() == 0) || this.f3581f.contains(Integer.valueOf(view.getId())) || this.f3582g.contains(view);
    }

    public String toString() {
        return mo2113G("");
    }

    /* JADX INFO: renamed from: u */
    public void mo2126u(View view) {
        if (this.f3592q) {
            return;
        }
        C0313a<Animator, b> c0313aM2105o = m2105o();
        int i = c0313aM2105o.f2197d;
        C0601z c0601z = C0595t.f3630a;
        C0577c0 c0577c0 = new C0577c0(view);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            b bVarM1276l = c0313aM2105o.m1276l(i2);
            if (bVarM1276l.f3597a != null && c0577c0.equals(bVarM1276l.f3600d)) {
                c0313aM2105o.m1272h(i2).pause();
            }
        }
        ArrayList<d> arrayList = this.f3593r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f3593r.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((d) arrayList2.get(i3)).mo2085a(this);
            }
        }
        this.f3591p = true;
    }

    /* JADX INFO: renamed from: v */
    public AbstractC0584i mo2127v(d dVar) {
        ArrayList<d> arrayList = this.f3593r;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f3593r.size() == 0) {
            this.f3593r = null;
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public AbstractC0584i mo2128w(View view) {
        this.f3582g.remove(view);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void mo2129x(View view) {
        if (this.f3591p) {
            if (!this.f3592q) {
                C0313a<Animator, b> c0313aM2105o = m2105o();
                int i = c0313aM2105o.f2197d;
                C0601z c0601z = C0595t.f3630a;
                C0577c0 c0577c0 = new C0577c0(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    b bVarM1276l = c0313aM2105o.m1276l(i2);
                    if (bVarM1276l.f3597a != null && c0577c0.equals(bVarM1276l.f3600d)) {
                        c0313aM2105o.m1272h(i2).resume();
                    }
                }
                ArrayList<d> arrayList = this.f3593r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3593r.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList2.get(i3)).mo2086b(this);
                    }
                }
            }
            this.f3591p = false;
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo2130y() {
        m2112F();
        C0313a<Animator, b> c0313aM2105o = m2105o();
        for (Animator animator : this.f3594s) {
            if (c0313aM2105o.containsKey(animator)) {
                m2112F();
                if (animator != null) {
                    animator.addListener(new C0585j(this, c0313aM2105o));
                    long j = this.f3579d;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f3578c;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f3580e;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0586k(this));
                    animator.start();
                }
            }
        }
        this.f3594s.clear();
        m2122m();
    }

    /* JADX INFO: renamed from: z */
    public AbstractC0584i mo2131z(long j) {
        this.f3579d = j;
        return this;
    }
}
