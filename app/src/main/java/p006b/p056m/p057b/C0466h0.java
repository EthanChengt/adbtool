package p006b.p056m.p057b;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p006b.p025e.AbstractC0319g;
import p006b.p025e.C0313a;
import p006b.p032h.p040f.C0388a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.ViewTreeObserverOnPreDrawListenerC0416k;

/* JADX INFO: renamed from: b.m.b.h0 */
/* JADX INFO: loaded from: classes.dex */
public class C0466h0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f3042a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b */
    public static final AbstractC0476m0 f3043b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC0476m0 f3044c;

    /* JADX INFO: renamed from: b.m.b.h0$a */
    public interface a {
    }

    /* JADX INFO: renamed from: b.m.b.h0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public Fragment f3045a;

        /* JADX INFO: renamed from: b */
        public boolean f3046b;

        /* JADX INFO: renamed from: c */
        public C0451a f3047c;

        /* JADX INFO: renamed from: d */
        public Fragment f3048d;

        /* JADX INFO: renamed from: e */
        public boolean f3049e;

        /* JADX INFO: renamed from: f */
        public C0451a f3050f;
    }

    static {
        AbstractC0476m0 abstractC0476m0 = null;
        f3043b = Build.VERSION.SDK_INT >= 21 ? new C0468i0() : null;
        try {
            abstractC0476m0 = (AbstractC0476m0) Class.forName("b.w.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f3044c = abstractC0476m0;
    }

    /* JADX INFO: renamed from: a */
    public static void m1743a(ArrayList<View> arrayList, C0313a<String, View> c0313a, Collection<String> collection) {
        for (int i = c0313a.f2197d - 1; i >= 0; i--) {
            View viewM1276l = c0313a.m1276l(i);
            if (collection.contains(C0418m.m1568k(viewM1276l))) {
                arrayList.add(viewM1276l);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0074  */
    /* JADX WARN: Code duplicated, block: B:60:0x0076  */
    /* JADX WARN: Code duplicated, block: B:62:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0080  */
    /* JADX WARN: Code duplicated, block: B:68:0x0088  */
    /* JADX WARN: Code duplicated, block: B:69:0x008a  */
    /* JADX INFO: renamed from: b */
    public static void m1744b(C0451a c0451a, AbstractC0452a0.a aVar, SparseArray<b> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        View view;
        boolean z7;
        Fragment fragment = aVar.f2949b;
        if (fragment == null || (i = fragment.f703x) == 0) {
            return;
        }
        int i2 = z ? f3042a[aVar.f2948a] : aVar.f2948a;
        boolean z8 = false;
        if (i2 == 1) {
            if (z2) {
                z3 = fragment.f671K;
            } else if (!fragment.f691l || fragment.f705z) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = true;
            z8 = z3;
            z5 = false;
            z6 = false;
        } else if (i2 == 3) {
            boolean z9 = fragment.f691l;
            if (z2 ? !z9 || fragment.f705z : z9 || (view = fragment.f667G) == null || view.getVisibility() != 0 || fragment.f673M < 0.0f) {
                z7 = false;
            } else {
                z7 = true;
            }
            z6 = z7;
            z5 = true;
            z4 = false;
        } else if (i2 != 4) {
            if (i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        z3 = false;
                        z4 = false;
                    } else {
                        if (z2) {
                            z3 = fragment.f671K;
                        } else {
                            if (fragment.f691l) {
                            }
                            z3 = false;
                        }
                        z4 = true;
                    }
                }
                boolean z10 = fragment.f691l;
                if (z2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                z6 = z7;
                z5 = true;
                z4 = false;
            } else {
                if (!z2) {
                    z3 = fragment.f705z;
                } else if (fragment.f672L && !fragment.f705z && fragment.f691l) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = true;
            }
            z8 = z3;
            z5 = false;
            z6 = false;
        } else {
            if (!z2 ? !(!fragment.f691l || fragment.f705z) : fragment.f672L && fragment.f691l && fragment.f705z) {
                z7 = false;
            } else {
                z7 = true;
            }
            z6 = z7;
            z5 = true;
            z4 = false;
        }
        b bVar = sparseArray.get(i);
        if (z8) {
            if (bVar == null) {
                b bVar2 = new b();
                sparseArray.put(i, bVar2);
                bVar = bVar2;
            }
            bVar.f3045a = fragment;
            bVar.f3046b = z;
            bVar.f3047c = c0451a;
        }
        if (!z2 && z4) {
            if (bVar != null && bVar.f3048d == fragment) {
                bVar.f3048d = null;
            }
            AbstractC0483r abstractC0483r = c0451a.f2929q;
            if (fragment.f681b < 1 && abstractC0483r.f3107m >= 1 && !c0451a.f2947p) {
                abstractC0483r.m1816Q(fragment);
                abstractC0483r.m1819T(fragment, 1);
            }
        }
        if (z6 && (bVar == null || bVar.f3048d == null)) {
            if (bVar == null) {
                b bVar3 = new b();
                sparseArray.put(i, bVar3);
                bVar = bVar3;
            }
            bVar.f3048d = fragment;
            bVar.f3049e = z;
            bVar.f3050f = c0451a;
        }
        if (z2 || !z5 || bVar == null || bVar.f3045a != fragment) {
            return;
        }
        bVar.f3045a = null;
    }

    /* JADX INFO: renamed from: c */
    public static void m1745c(Fragment fragment, Fragment fragment2, boolean z, C0313a<String, View> c0313a, boolean z2) {
        if (z) {
            fragment2.m313m();
        } else {
            fragment.m313m();
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1746d(AbstractC0476m0 abstractC0476m0, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0476m0.mo1762e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static C0313a<String, View> m1747e(AbstractC0476m0 abstractC0476m0, C0313a<String, String> c0313a, Object obj, b bVar) {
        ArrayList<String> arrayList;
        Fragment fragment = bVar.f3045a;
        View view = fragment.f667G;
        if (c0313a.isEmpty() || obj == null || view == null) {
            c0313a.clear();
            return null;
        }
        C0313a<String, View> c0313a2 = new C0313a<>();
        abstractC0476m0.m1781i(c0313a2, view);
        C0451a c0451a = bVar.f3047c;
        if (bVar.f3046b) {
            fragment.m317o();
            arrayList = c0451a.f2945n;
        } else {
            fragment.m313m();
            arrayList = c0451a.f2946o;
        }
        if (arrayList != null) {
            AbstractC0319g.m1262k(c0313a2, arrayList);
            AbstractC0319g.m1262k(c0313a2, c0313a.values());
        }
        int i = c0313a.f2197d;
        while (true) {
            i--;
            if (i < 0) {
                return c0313a2;
            }
            if (!c0313a2.containsKey(c0313a.m1276l(i))) {
                c0313a.mo1274j(i);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0313a<String, View> m1748f(AbstractC0476m0 abstractC0476m0, C0313a<String, String> c0313a, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (c0313a.isEmpty() || obj == null) {
            c0313a.clear();
            return null;
        }
        Fragment fragment = bVar.f3048d;
        C0313a<String, View> c0313a2 = new C0313a<>();
        abstractC0476m0.m1781i(c0313a2, fragment.m324r0());
        C0451a c0451a = bVar.f3050f;
        if (bVar.f3049e) {
            fragment.m313m();
            arrayList = c0451a.f2946o;
        } else {
            fragment.m317o();
            arrayList = c0451a.f2945n;
        }
        if (arrayList != null) {
            AbstractC0319g.m1262k(c0313a2, arrayList);
        }
        AbstractC0319g.m1262k(c0313a, c0313a2.keySet());
        return c0313a2;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0476m0 m1749g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.m315n();
            Object objM329u = fragment.m329u();
            if (objM329u != null) {
                arrayList.add(objM329u);
            }
            Object objM333w = fragment.m333w();
            if (objM333w != null) {
                arrayList.add(objM333w);
            }
        }
        if (fragment2 != null) {
            fragment2.m311l();
            Object objM325s = fragment2.m325s();
            if (objM325s != null) {
                arrayList.add(objM325s);
            }
            fragment2.m331v();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0476m0 abstractC0476m0 = f3043b;
        if (abstractC0476m0 != null && m1746d(abstractC0476m0, arrayList)) {
            return abstractC0476m0;
        }
        AbstractC0476m0 abstractC0476m1 = f3044c;
        if (abstractC0476m1 != null && m1746d(abstractC0476m1, arrayList)) {
            return abstractC0476m1;
        }
        if (abstractC0476m0 == null && abstractC0476m1 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList<View> m1750h(AbstractC0476m0 abstractC0476m0, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.f667G;
        if (view2 != null) {
            abstractC0476m0.m1780f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0476m0.mo1760b(obj, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public static Object m1751i(AbstractC0476m0 abstractC0476m0, Fragment fragment, boolean z) {
        Object objM325s = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            objM325s = fragment.m325s();
        } else {
            fragment.m311l();
        }
        return abstractC0476m0.mo1763g(objM325s);
    }

    /* JADX INFO: renamed from: j */
    public static Object m1752j(AbstractC0476m0 abstractC0476m0, Fragment fragment, boolean z) {
        Object objM329u = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            objM329u = fragment.m329u();
        } else {
            fragment.m315n();
        }
        return abstractC0476m0.mo1763g(objM329u);
    }

    /* JADX INFO: renamed from: k */
    public static View m1753k(C0313a<String, View> c0313a, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0451a c0451a = bVar.f3047c;
        if (obj == null || c0313a == null || (arrayList = c0451a.f2945n) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0313a.get((z ? c0451a.f2945n : c0451a.f2946o).get(0));
    }

    /* JADX INFO: renamed from: l */
    public static Object m1754l(AbstractC0476m0 abstractC0476m0, Fragment fragment, Fragment fragment2, boolean z) {
        Object objM333w;
        if (z) {
            objM333w = fragment2.m333w();
        } else {
            fragment.m331v();
            objM333w = null;
        }
        return abstractC0476m0.mo1774v(abstractC0476m0.mo1763g(objM333w));
    }

    /* JADX INFO: renamed from: m */
    public static void m1755m(AbstractC0476m0 abstractC0476m0, Object obj, Object obj2, C0313a<String, View> c0313a, boolean z, C0451a c0451a) {
        ArrayList<String> arrayList = c0451a.f2945n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0313a.get((z ? c0451a.f2946o : c0451a.f2945n).get(0));
        abstractC0476m0.mo1770r(obj, view);
        if (obj2 != null) {
            abstractC0476m0.mo1770r(obj2, view);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m1756n(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:102:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0263 A[LOOP:6: B:111:0x0261->B:112:0x0263, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0299  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ce A[LOOP:8: B:119:0x02b8->B:123:0x02ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x03de  */
    /* JADX WARN: Code duplicated, block: B:201:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m1757o(AbstractC0483r abstractC0483r, ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, a aVar) {
        SparseArray sparseArray;
        int i3;
        Fragment fragment;
        Fragment fragment2;
        AbstractC0476m0 abstractC0476m0M1749g;
        ArrayList<View> arrayList3;
        ArrayList<View> arrayList4;
        Object obj;
        Object obj2;
        Object obj3;
        Fragment fragment3;
        ArrayList<View> arrayList5;
        boolean z2;
        Fragment fragment4;
        Rect rect;
        Fragment fragment5;
        Fragment fragment6;
        AbstractC0476m0 abstractC0476m0M1749g2;
        Fragment fragment7;
        Object obj4;
        ArrayList<View> arrayListM1750h;
        ArrayList<View> arrayListM1750h2;
        Object objMo1764l;
        ArrayList arrayList6;
        int size;
        int i4;
        int size2;
        ArrayList arrayList7;
        int i5;
        View view;
        String strM1568k;
        C0313a c0313a;
        String str;
        int i6;
        View view2;
        Rect rect2;
        AbstractC0483r abstractC0483r2 = abstractC0483r;
        ArrayList<C0451a> arrayList8 = arrayList;
        ArrayList<Boolean> arrayList9 = arrayList2;
        int i7 = i2;
        boolean z3 = z;
        if (abstractC0483r2.f3107m < 1) {
            return;
        }
        SparseArray sparseArray2 = new SparseArray();
        for (int i8 = i; i8 < i7; i8++) {
            C0451a c0451a = arrayList8.get(i8);
            if (!arrayList9.get(i8).booleanValue()) {
                int size3 = c0451a.f2932a.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    m1744b(c0451a, c0451a.f2932a.get(i9), sparseArray2, false, z3);
                }
            } else if (c0451a.f2929q.f3109o.mo1730e()) {
                for (int size4 = c0451a.f2932a.size() - 1; size4 >= 0; size4--) {
                    m1744b(c0451a, c0451a.f2932a.get(size4), sparseArray2, true, z3);
                }
            }
        }
        if (sparseArray2.size() != 0) {
            View view3 = new View(abstractC0483r2.f3108n.f3086c);
            int size5 = sparseArray2.size();
            int i10 = 0;
            while (i10 < size5) {
                int iKeyAt = sparseArray2.keyAt(i10);
                C0313a c0313a2 = new C0313a();
                int i11 = i7 - 1;
                while (i11 >= i) {
                    C0451a c0451a2 = arrayList8.get(i11);
                    if (c0451a2.m1722m(iKeyAt)) {
                        boolean zBooleanValue = arrayList9.get(i11).booleanValue();
                        ArrayList<String> arrayList10 = c0451a2.f2945n;
                        if (arrayList10 != null) {
                            int size6 = arrayList10.size();
                            ArrayList<String> arrayList11 = c0451a2.f2945n;
                            ArrayList<String> arrayList12 = c0451a2.f2946o;
                            if (!zBooleanValue) {
                                arrayList12 = arrayList11;
                                arrayList11 = arrayList12;
                            }
                            int i12 = 0;
                            while (i12 < size6) {
                                String str2 = arrayList12.get(i12);
                                String str3 = arrayList11.get(i12);
                                int i13 = size6;
                                String str4 = (String) c0313a2.remove(str3);
                                if (str4 != null) {
                                    c0313a2.put(str2, str4);
                                } else {
                                    c0313a2.put(str2, str3);
                                }
                                i12++;
                                size6 = i13;
                            }
                        }
                    }
                    i11--;
                    arrayList8 = arrayList;
                    arrayList9 = arrayList2;
                }
                b bVar = (b) sparseArray2.valueAt(i10);
                if (z3) {
                    ViewGroup viewGroup = abstractC0483r2.f3109o.mo1730e() ? (ViewGroup) abstractC0483r2.f3109o.mo1729b(iKeyAt) : null;
                    if (viewGroup == null || (abstractC0476m0M1749g2 = m1749g((fragment6 = bVar.f3048d), (fragment5 = bVar.f3045a))) == null) {
                        sparseArray = sparseArray2;
                        i3 = i10;
                        size5 = size5;
                    } else {
                        boolean z4 = bVar.f3046b;
                        boolean z5 = bVar.f3049e;
                        ArrayList<View> arrayList13 = new ArrayList<>();
                        ArrayList<View> arrayList14 = new ArrayList<>();
                        Object objM1751i = m1751i(abstractC0476m0M1749g2, fragment5, z4);
                        Object objM1752j = m1752j(abstractC0476m0M1749g2, fragment6, z5);
                        sparseArray = sparseArray2;
                        Fragment fragment8 = bVar.f3045a;
                        Fragment fragment9 = bVar.f3048d;
                        i3 = i10;
                        if (fragment8 != null) {
                            fragment8.m324r0().setVisibility(0);
                        }
                        if (fragment8 == null || fragment9 == null) {
                            fragment7 = fragment5;
                        } else {
                            boolean z6 = bVar.f3046b;
                            Object objM1754l = c0313a2.isEmpty() ? null : m1754l(abstractC0476m0M1749g2, fragment8, fragment9, z6);
                            C0313a<String, View> c0313aM1748f = m1748f(abstractC0476m0M1749g2, c0313a2, objM1754l, bVar);
                            fragment7 = fragment5;
                            C0313a<String, View> c0313aM1747e = m1747e(abstractC0476m0M1749g2, c0313a2, objM1754l, bVar);
                            if (c0313a2.isEmpty()) {
                                if (c0313aM1748f != null) {
                                    c0313aM1748f.clear();
                                }
                                if (c0313aM1747e != null) {
                                    c0313aM1747e.clear();
                                }
                                obj4 = null;
                            } else {
                                m1743a(arrayList14, c0313aM1748f, c0313a2.keySet());
                                m1743a(arrayList13, c0313aM1747e, c0313a2.values());
                                obj4 = objM1754l;
                            }
                            if (objM1751i != null || objM1752j != null || obj4 != null) {
                                m1745c(fragment8, fragment9, z6, c0313aM1748f, true);
                                if (obj4 != null) {
                                    arrayList13.add(view3);
                                    abstractC0476m0M1749g2.mo1772t(obj4, view3, arrayList14);
                                    m1755m(abstractC0476m0M1749g2, obj4, objM1752j, c0313aM1748f, bVar.f3049e, bVar.f3050f);
                                    Rect rect3 = new Rect();
                                    View viewM1753k = m1753k(c0313aM1747e, bVar, objM1751i, z6);
                                    if (viewM1753k != null) {
                                        abstractC0476m0M1749g2.mo1769q(objM1751i, rect3);
                                    }
                                    rect2 = rect3;
                                    view2 = viewM1753k;
                                } else {
                                    view2 = null;
                                    rect2 = null;
                                }
                                ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup, new RunnableC0462f0(fragment8, fragment9, z6, c0313aM1747e, view2, abstractC0476m0M1749g2, rect2));
                            }
                            if (objM1751i == null || obj4 != null || objM1752j != null) {
                                arrayListM1750h = m1750h(abstractC0476m0M1749g2, objM1752j, fragment6, arrayList14, view3);
                                arrayListM1750h2 = m1750h(abstractC0476m0M1749g2, objM1751i, fragment7, arrayList13, view3);
                                m1756n(arrayListM1750h2, 4);
                                objMo1764l = abstractC0476m0M1749g2.mo1764l(objM1752j, objM1751i, obj4);
                                if (fragment6 != null && arrayListM1750h != null && (arrayListM1750h.size() > 0 || arrayList14.size() > 0)) {
                                    C0388a c0388a = new C0388a();
                                    AbstractC0483r.b bVar2 = (AbstractC0483r.b) aVar;
                                    bVar2.m1864b(fragment6, c0388a);
                                    abstractC0476m0M1749g2.mo1771s(fragment6, objMo1764l, c0388a, new RunnableC0454b0(bVar2, fragment6, c0388a));
                                }
                                if (objMo1764l != null) {
                                    if (fragment6 != null && objM1752j != null && fragment6.f691l && fragment6.f705z && fragment6.f672L) {
                                        fragment6.m336x0(true);
                                        abstractC0476m0M1749g2.mo1767o(objM1752j, fragment6.f667G, arrayListM1750h);
                                        ViewTreeObserverOnPreDrawListenerC0416k.m1556a(fragment6.f666F, new RunnableC0456c0(arrayListM1750h));
                                    }
                                    arrayList6 = new ArrayList();
                                    size = arrayList13.size();
                                    for (i4 = 0; i4 < size; i4++) {
                                        View view4 = arrayList13.get(i4);
                                        arrayList6.add(C0418m.m1568k(view4));
                                        C0418m.m1580w(view4, null);
                                    }
                                    abstractC0476m0M1749g2.mo1768p(objMo1764l, objM1751i, arrayListM1750h2, objM1752j, arrayListM1750h, obj4, arrayList13);
                                    abstractC0476m0M1749g2.mo1761c(viewGroup, objMo1764l);
                                    size2 = arrayList13.size();
                                    arrayList7 = new ArrayList();
                                    i5 = 0;
                                    while (i5 < size2) {
                                        view = arrayList14.get(i5);
                                        strM1568k = C0418m.m1568k(view);
                                        arrayList7.add(strM1568k);
                                        if (strM1568k == null) {
                                            c0313a = c0313a2;
                                        } else {
                                            C0418m.m1580w(view, null);
                                            c0313a = c0313a2;
                                            str = (String) c0313a.getOrDefault(strM1568k, null);
                                            for (i6 = 0; i6 < size2; i6++) {
                                                if (str.equals(arrayList6.get(i6))) {
                                                    C0418m.m1580w(arrayList13.get(i6), strM1568k);
                                                    break;
                                                }
                                            }
                                        }
                                        i5++;
                                        c0313a2 = c0313a;
                                    }
                                    ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup, new RunnableC0470j0(abstractC0476m0M1749g2, size2, arrayList13, arrayList6, arrayList14, arrayList7));
                                    m1756n(arrayListM1750h2, 0);
                                    abstractC0476m0M1749g2.mo1773u(obj4, arrayList14, arrayList13);
                                }
                            }
                        }
                        obj4 = null;
                        if (objM1751i == null) {
                            arrayListM1750h = m1750h(abstractC0476m0M1749g2, objM1752j, fragment6, arrayList14, view3);
                            arrayListM1750h2 = m1750h(abstractC0476m0M1749g2, objM1751i, fragment7, arrayList13, view3);
                            m1756n(arrayListM1750h2, 4);
                            objMo1764l = abstractC0476m0M1749g2.mo1764l(objM1752j, objM1751i, obj4);
                            if (fragment6 != null) {
                                C0388a c0388a2 = new C0388a();
                                AbstractC0483r.b bVar3 = (AbstractC0483r.b) aVar;
                                bVar3.m1864b(fragment6, c0388a2);
                                abstractC0476m0M1749g2.mo1771s(fragment6, objMo1764l, c0388a2, new RunnableC0454b0(bVar3, fragment6, c0388a2));
                            }
                            if (objMo1764l != null) {
                                if (fragment6 != null) {
                                    fragment6.m336x0(true);
                                    abstractC0476m0M1749g2.mo1767o(objM1752j, fragment6.f667G, arrayListM1750h);
                                    ViewTreeObserverOnPreDrawListenerC0416k.m1556a(fragment6.f666F, new RunnableC0456c0(arrayListM1750h));
                                }
                                arrayList6 = new ArrayList();
                                size = arrayList13.size();
                                while (i4 < size) {
                                    View view5 = arrayList13.get(i4);
                                    arrayList6.add(C0418m.m1568k(view5));
                                    C0418m.m1580w(view5, null);
                                }
                                abstractC0476m0M1749g2.mo1768p(objMo1764l, objM1751i, arrayListM1750h2, objM1752j, arrayListM1750h, obj4, arrayList13);
                                abstractC0476m0M1749g2.mo1761c(viewGroup, objMo1764l);
                                size2 = arrayList13.size();
                                arrayList7 = new ArrayList();
                                i5 = 0;
                                while (i5 < size2) {
                                    view = arrayList14.get(i5);
                                    strM1568k = C0418m.m1568k(view);
                                    arrayList7.add(strM1568k);
                                    if (strM1568k == null) {
                                        c0313a = c0313a2;
                                    } else {
                                        C0418m.m1580w(view, null);
                                        c0313a = c0313a2;
                                        str = (String) c0313a.getOrDefault(strM1568k, null);
                                        while (i6 < size2) {
                                            if (str.equals(arrayList6.get(i6))) {
                                                C0418m.m1580w(arrayList13.get(i6), strM1568k);
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                    i5++;
                                    c0313a2 = c0313a;
                                }
                                ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup, new RunnableC0470j0(abstractC0476m0M1749g2, size2, arrayList13, arrayList6, arrayList14, arrayList7));
                                m1756n(arrayListM1750h2, 0);
                                abstractC0476m0M1749g2.mo1773u(obj4, arrayList14, arrayList13);
                            }
                        } else {
                            arrayListM1750h = m1750h(abstractC0476m0M1749g2, objM1752j, fragment6, arrayList14, view3);
                            arrayListM1750h2 = m1750h(abstractC0476m0M1749g2, objM1751i, fragment7, arrayList13, view3);
                            m1756n(arrayListM1750h2, 4);
                            objMo1764l = abstractC0476m0M1749g2.mo1764l(objM1752j, objM1751i, obj4);
                            if (fragment6 != null) {
                                C0388a c0388a3 = new C0388a();
                                AbstractC0483r.b bVar4 = (AbstractC0483r.b) aVar;
                                bVar4.m1864b(fragment6, c0388a3);
                                abstractC0476m0M1749g2.mo1771s(fragment6, objMo1764l, c0388a3, new RunnableC0454b0(bVar4, fragment6, c0388a3));
                            }
                            if (objMo1764l != null) {
                                if (fragment6 != null) {
                                    fragment6.m336x0(true);
                                    abstractC0476m0M1749g2.mo1767o(objM1752j, fragment6.f667G, arrayListM1750h);
                                    ViewTreeObserverOnPreDrawListenerC0416k.m1556a(fragment6.f666F, new RunnableC0456c0(arrayListM1750h));
                                }
                                arrayList6 = new ArrayList();
                                size = arrayList13.size();
                                while (i4 < size) {
                                    View view6 = arrayList13.get(i4);
                                    arrayList6.add(C0418m.m1568k(view6));
                                    C0418m.m1580w(view6, null);
                                }
                                abstractC0476m0M1749g2.mo1768p(objMo1764l, objM1751i, arrayListM1750h2, objM1752j, arrayListM1750h, obj4, arrayList13);
                                abstractC0476m0M1749g2.mo1761c(viewGroup, objMo1764l);
                                size2 = arrayList13.size();
                                arrayList7 = new ArrayList();
                                i5 = 0;
                                while (i5 < size2) {
                                    view = arrayList14.get(i5);
                                    strM1568k = C0418m.m1568k(view);
                                    arrayList7.add(strM1568k);
                                    if (strM1568k == null) {
                                        c0313a = c0313a2;
                                    } else {
                                        C0418m.m1580w(view, null);
                                        c0313a = c0313a2;
                                        str = (String) c0313a.getOrDefault(strM1568k, null);
                                        while (i6 < size2) {
                                            if (str.equals(arrayList6.get(i6))) {
                                                C0418m.m1580w(arrayList13.get(i6), strM1568k);
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                    i5++;
                                    c0313a2 = c0313a;
                                }
                                ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup, new RunnableC0470j0(abstractC0476m0M1749g2, size2, arrayList13, arrayList6, arrayList14, arrayList7));
                                m1756n(arrayListM1750h2, 0);
                                abstractC0476m0M1749g2.mo1773u(obj4, arrayList14, arrayList13);
                            }
                        }
                    }
                } else {
                    AbstractC0483r abstractC0483r3 = abstractC0483r2;
                    sparseArray = sparseArray2;
                    i3 = i10;
                    size5 = size5;
                    ViewGroup viewGroup2 = abstractC0483r3.f3109o.mo1730e() ? (ViewGroup) abstractC0483r3.f3109o.mo1729b(iKeyAt) : null;
                    if (viewGroup2 != null && (abstractC0476m0M1749g = m1749g((fragment2 = bVar.f3048d), (fragment = bVar.f3045a))) != null) {
                        boolean z7 = bVar.f3046b;
                        boolean z8 = bVar.f3049e;
                        Object objM1751i2 = m1751i(abstractC0476m0M1749g, fragment, z7);
                        Object objM1752j2 = m1752j(abstractC0476m0M1749g, fragment2, z8);
                        ArrayList<View> arrayList15 = new ArrayList<>();
                        ArrayList<View> arrayList16 = new ArrayList<>();
                        Fragment fragment10 = bVar.f3045a;
                        Fragment fragment11 = bVar.f3048d;
                        if (fragment10 == null || fragment11 == null) {
                            arrayList3 = arrayList16;
                            arrayList4 = arrayList15;
                            obj = null;
                            obj2 = null;
                        } else {
                            boolean z9 = bVar.f3046b;
                            Object objM1754l2 = c0313a2.isEmpty() ? null : m1754l(abstractC0476m0M1749g, fragment10, fragment11, z9);
                            C0313a<String, View> c0313aM1748f2 = m1748f(abstractC0476m0M1749g, c0313a2, objM1754l2, bVar);
                            if (c0313a2.isEmpty()) {
                                obj3 = null;
                            } else {
                                arrayList15.addAll(c0313aM1748f2.values());
                                obj3 = objM1754l2;
                            }
                            if (objM1751i2 == null && objM1752j2 == null && obj3 == null) {
                                arrayList3 = arrayList16;
                                arrayList4 = arrayList15;
                                obj = null;
                                obj2 = null;
                            } else {
                                m1745c(fragment10, fragment11, z9, c0313aM1748f2, true);
                                if (obj3 != null) {
                                    rect = new Rect();
                                    abstractC0476m0M1749g.mo1772t(obj3, view3, arrayList15);
                                    fragment3 = fragment10;
                                    arrayList5 = arrayList16;
                                    z2 = z9;
                                    fragment4 = fragment11;
                                    m1755m(abstractC0476m0M1749g, obj3, objM1752j2, c0313aM1748f2, bVar.f3049e, bVar.f3050f);
                                    if (objM1751i2 != null) {
                                        abstractC0476m0M1749g.mo1769q(objM1751i2, rect);
                                    }
                                } else {
                                    fragment3 = fragment10;
                                    arrayList5 = arrayList16;
                                    z2 = z9;
                                    fragment4 = fragment11;
                                    rect = null;
                                }
                                ArrayList<View> arrayList17 = arrayList5;
                                arrayList4 = arrayList15;
                                obj = null;
                                arrayList3 = arrayList17;
                                ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup2, new RunnableC0464g0(abstractC0476m0M1749g, c0313a2, obj3, bVar, arrayList17, view3, fragment3, fragment4, z2, arrayList4, objM1751i2, rect));
                                obj2 = obj3;
                            }
                        }
                        if (objM1751i2 != null || obj2 != null || objM1752j2 != null) {
                            ArrayList<View> arrayList18 = arrayList4;
                            ArrayList<View> arrayListM1750h3 = m1750h(abstractC0476m0M1749g, objM1752j2, fragment2, arrayList18, view3);
                            if (arrayListM1750h3 == null || arrayListM1750h3.isEmpty()) {
                                objM1752j2 = obj;
                            }
                            abstractC0476m0M1749g.mo1759a(objM1751i2, view3);
                            Object objMo1764l2 = abstractC0476m0M1749g.mo1764l(objM1752j2, objM1751i2, obj2);
                            if (fragment2 != null && arrayListM1750h3 != null && (arrayListM1750h3.size() > 0 || arrayList18.size() > 0)) {
                                C0388a c0388a4 = new C0388a();
                                AbstractC0483r.b bVar5 = (AbstractC0483r.b) aVar;
                                bVar5.m1864b(fragment2, c0388a4);
                                abstractC0476m0M1749g.mo1771s(fragment2, objMo1764l2, c0388a4, new RunnableC0458d0(bVar5, fragment2, c0388a4));
                            }
                            if (objMo1764l2 != null) {
                                ArrayList<View> arrayList19 = new ArrayList<>();
                                abstractC0476m0M1749g.mo1768p(objMo1764l2, objM1751i2, arrayList19, objM1752j2, arrayListM1750h3, obj2, arrayList3);
                                ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup2, new RunnableC0460e0(objM1751i2, abstractC0476m0M1749g, view3, fragment, arrayList3, arrayList19, arrayListM1750h3, objM1752j2));
                                ArrayList<View> arrayList20 = arrayList3;
                                ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup2, new RunnableC0472k0(abstractC0476m0M1749g, arrayList20, c0313a2));
                                abstractC0476m0M1749g.mo1761c(viewGroup2, objMo1764l2);
                                ViewTreeObserverOnPreDrawListenerC0416k.m1556a(viewGroup2, new RunnableC0474l0(abstractC0476m0M1749g, arrayList20, c0313a2));
                            }
                        }
                    }
                    i10 = i3 + 1;
                    abstractC0483r2 = abstractC0483r;
                    arrayList8 = arrayList;
                    arrayList9 = arrayList2;
                    i7 = i2;
                    z3 = z;
                    size5 = size5;
                    sparseArray2 = sparseArray;
                }
                i3 = i3;
                size5 = size5;
                i10 = i3 + 1;
                abstractC0483r2 = abstractC0483r;
                arrayList8 = arrayList;
                arrayList9 = arrayList2;
                i7 = i2;
                z3 = z;
                size5 = size5;
                sparseArray2 = sparseArray;
            }
        }
    }
}
