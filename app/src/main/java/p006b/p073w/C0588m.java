package p006b.p073w;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p006b.p025e.C0313a;
import p006b.p025e.C0317e;

/* JADX INFO: renamed from: b.w.m */
/* JADX INFO: loaded from: classes.dex */
public class C0588m {

    /* JADX INFO: renamed from: a */
    public static AbstractC0584i f3605a = new C0572a();

    /* JADX INFO: renamed from: b */
    public static ThreadLocal<WeakReference<C0313a<ViewGroup, ArrayList<AbstractC0584i>>>> f3606b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public static ArrayList<ViewGroup> f3607c = new ArrayList<>();

    /* JADX INFO: renamed from: b.w.m$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public AbstractC0584i f3608b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f3609c;

        /* JADX INFO: renamed from: b.w.m$a$a, reason: collision with other inner class name */
        public class C1393a extends C0587l {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0313a f3610a;

            public C1393a(C0313a c0313a) {
                this.f3610a = c0313a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p006b.p073w.AbstractC0584i.d
            /* JADX INFO: renamed from: e */
            public void mo2087e(AbstractC0584i abstractC0584i) {
                ((ArrayList) this.f3610a.get(a.this.f3609c)).remove(abstractC0584i);
                abstractC0584i.mo2127v(this);
            }
        }

        public a(AbstractC0584i abstractC0584i, ViewGroup viewGroup) {
            this.f3608b = abstractC0584i;
            this.f3609c = viewGroup;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x021a  */
        /* JADX WARN: Code duplicated, block: B:105:0x0228  */
        /* JADX WARN: Code duplicated, block: B:109:0x0247  */
        /* JADX WARN: Code duplicated, block: B:139:0x01f4 A[EDGE_INSN: B:139:0x01f4->B:93:0x01f4 BREAK  A[LOOP:1: B:19:0x009a->B:92:0x01ea], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x005c  */
        /* JADX WARN: Code duplicated, block: B:177:0x0212 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x0066 A[LOOP:0: B:15:0x0060->B:17:0x0066, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:180:0x0233 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:21:0x009f  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:30:0x00af  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:47:0x0104  */
        /* JADX WARN: Code duplicated, block: B:50:0x0112  */
        /* JADX WARN: Code duplicated, block: B:52:0x011e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0166  */
        /* JADX WARN: Code duplicated, block: B:67:0x0170  */
        /* JADX WARN: Code duplicated, block: B:80:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:83:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:96:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:98:0x0207  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ArrayList arrayList;
            AbstractC0584i abstractC0584i;
            C0593r c0593r;
            C0593r c0593r2;
            C0313a c0313a;
            C0313a c0313a2;
            int i;
            int[] iArr;
            int i2;
            int i3;
            C0313a<Animator, AbstractC0584i.b> c0313aM2105o;
            int i4;
            Animator animatorM1272h;
            AbstractC0584i.b orDefault;
            C0592q c0592q;
            C0592q c0592q2;
            int i5;
            C0593r c0593r3;
            int i6;
            View view;
            C0592q c0592q3;
            C0313a<String, View> c0313a3;
            int i7;
            int i8;
            View viewM1276l;
            View view2;
            SparseArray<View> sparseArray;
            int size;
            int i9;
            View viewValueAt;
            View view3;
            C0317e<View> c0317e;
            int iM1256h;
            int i10;
            View viewM1257i;
            C0593r c0593r4;
            Iterator it;
            this.f3609c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3609c.removeOnAttachStateChangeListener(this);
            int i11 = 1;
            if (!C0588m.f3607c.remove(this.f3609c)) {
                return true;
            }
            C0313a<ViewGroup, ArrayList<AbstractC0584i>> c0313aM2132a = C0588m.m2132a();
            ArrayList<AbstractC0584i> arrayList2 = c0313aM2132a.get(this.f3609c);
            boolean z = false;
            if (arrayList2 != null) {
                arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
                arrayList2.add(this.f3608b);
                this.f3608b.mo2114a(new C1393a(c0313aM2132a));
                this.f3608b.m2118h(this.f3609c, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0584i) it.next()).mo2129x(this.f3609c);
                    }
                }
                abstractC0584i = this.f3608b;
                ViewGroup viewGroup = this.f3609c;
                Objects.requireNonNull(abstractC0584i);
                abstractC0584i.f3587l = new ArrayList<>();
                abstractC0584i.f3588m = new ArrayList<>();
                c0593r = abstractC0584i.f3583h;
                c0593r2 = abstractC0584i.f3584i;
                c0313a = new C0313a(c0593r.f3625a);
                c0313a2 = new C0313a(c0593r2.f3625a);
                i = 0;
                while (true) {
                    iArr = abstractC0584i.f3586k;
                    if (i < iArr.length) {
                        break;
                    }
                    i5 = iArr[i];
                    if (i5 != i11) {
                        c0593r3 = c0593r;
                        i6 = c0313a.f2197d;
                        while (true) {
                            i6--;
                            if (i6 >= 0) {
                                view = (View) c0313a.m1272h(i6);
                                if (view == null && abstractC0584i.m2125s(view) && (c0592q3 = (C0592q) c0313a2.remove(view)) != null && abstractC0584i.m2125s(c0592q3.f3623b)) {
                                    abstractC0584i.f3587l.add((C0592q) c0313a.mo1274j(i6));
                                    abstractC0584i.f3588m.add(c0592q3);
                                }
                            }
                        }
                    } else if (i5 != 2) {
                        c0593r3 = c0593r;
                        c0313a3 = c0593r3.f3628d;
                        C0313a<String, View> c0313a4 = c0593r2.f3628d;
                        i7 = c0313a3.f2197d;
                        for (i8 = 0; i8 < i7; i8++) {
                            viewM1276l = c0313a3.m1276l(i8);
                            if (viewM1276l == null && abstractC0584i.m2125s(viewM1276l) && (view2 = c0313a4.get(c0313a3.m1272h(i8))) != null && abstractC0584i.m2125s(view2)) {
                                C0592q c0592q4 = (C0592q) c0313a.getOrDefault(viewM1276l, null);
                                C0592q c0592q5 = (C0592q) c0313a2.getOrDefault(view2, null);
                                if (c0592q4 != null && c0592q5 != null) {
                                    abstractC0584i.f3587l.add(c0592q4);
                                    abstractC0584i.f3588m.add(c0592q5);
                                    c0313a.remove(viewM1276l);
                                    c0313a2.remove(view2);
                                }
                            }
                        }
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            c0317e = c0593r.f3627c;
                            C0317e<View> c0317e2 = c0593r2.f3627c;
                            iM1256h = c0317e.m1256h();
                            i10 = 0;
                            while (i10 < iM1256h) {
                                viewM1257i = c0317e.m1257i(i10);
                                if (viewM1257i == null && abstractC0584i.m2125s(viewM1257i)) {
                                    if (c0317e.f2165b) {
                                        c0317e.m1252d();
                                    }
                                    c0593r4 = c0593r;
                                    View viewM1253e = c0317e2.m1253e(c0317e.f2166c[i10]);
                                    if (viewM1253e != null && abstractC0584i.m2125s(viewM1253e)) {
                                        C0592q c0592q6 = (C0592q) c0313a.getOrDefault(viewM1257i, z);
                                        C0592q c0592q7 = (C0592q) c0313a2.getOrDefault(viewM1253e, z);
                                        if (c0592q6 != null && c0592q7 != null) {
                                            abstractC0584i.f3587l.add(c0592q6);
                                            abstractC0584i.f3588m.add(c0592q7);
                                            c0313a.remove(viewM1257i);
                                            c0313a2.remove(viewM1253e);
                                        }
                                    }
                                } else {
                                    c0593r4 = c0593r;
                                }
                                i10++;
                                c0593r = c0593r4;
                                z = false;
                            }
                        }
                        c0593r3 = c0593r;
                    } else {
                        c0593r3 = c0593r;
                        sparseArray = c0593r3.f3626b;
                        SparseArray<View> sparseArray2 = c0593r2.f3626b;
                        size = sparseArray.size();
                        for (i9 = 0; i9 < size; i9++) {
                            viewValueAt = sparseArray.valueAt(i9);
                            if (viewValueAt == null && abstractC0584i.m2125s(viewValueAt) && (view3 = sparseArray2.get(sparseArray.keyAt(i9))) != null && abstractC0584i.m2125s(view3)) {
                                C0592q c0592q8 = (C0592q) c0313a.getOrDefault(viewValueAt, null);
                                C0592q c0592q9 = (C0592q) c0313a2.getOrDefault(view3, null);
                                if (c0592q8 != null && c0592q9 != null) {
                                    abstractC0584i.f3587l.add(c0592q8);
                                    abstractC0584i.f3588m.add(c0592q9);
                                    c0313a.remove(viewValueAt);
                                    c0313a2.remove(view3);
                                }
                            }
                        }
                    }
                    i++;
                    c0593r = c0593r3;
                    i11 = 1;
                    z = false;
                }
                for (i2 = 0; i2 < c0313a.f2197d; i2++) {
                    c0592q2 = (C0592q) c0313a.m1276l(i2);
                    if (abstractC0584i.m2125s(c0592q2.f3623b)) {
                        abstractC0584i.f3587l.add(c0592q2);
                        abstractC0584i.f3588m.add(null);
                    }
                }
                for (i3 = 0; i3 < c0313a2.f2197d; i3++) {
                    c0592q = (C0592q) c0313a2.m1276l(i3);
                    if (abstractC0584i.m2125s(c0592q.f3623b)) {
                        abstractC0584i.f3588m.add(c0592q);
                        abstractC0584i.f3587l.add(null);
                    }
                }
                c0313aM2105o = AbstractC0584i.m2105o();
                int i12 = c0313aM2105o.f2197d;
                C0601z c0601z = C0595t.f3630a;
                C0577c0 c0577c0 = new C0577c0(viewGroup);
                for (i4 = i12 - 1; i4 >= 0; i4--) {
                    animatorM1272h = c0313aM2105o.m1272h(i4);
                    if (animatorM1272h == null && (orDefault = c0313aM2105o.getOrDefault(animatorM1272h, null)) != null && orDefault.f3597a != null && c0577c0.equals(orDefault.f3600d)) {
                        C0592q c0592q10 = orDefault.f3599c;
                        View view4 = orDefault.f3597a;
                        C0592q c0592qM2124q = abstractC0584i.m2124q(view4, true);
                        C0592q c0592qM2123n = abstractC0584i.m2123n(view4, true);
                        if (c0592qM2124q == null && c0592qM2123n == null) {
                            c0592qM2123n = abstractC0584i.f3584i.f3625a.get(view4);
                        }
                        if (!(c0592qM2124q == null && c0592qM2123n == null) && orDefault.f3601e.mo2097r(c0592q10, c0592qM2123n)) {
                            if (animatorM1272h.isRunning() || animatorM1272h.isStarted()) {
                                animatorM1272h.cancel();
                            } else {
                                c0313aM2105o.remove(animatorM1272h);
                            }
                        }
                    }
                }
                abstractC0584i.mo2121l(viewGroup, abstractC0584i.f3583h, abstractC0584i.f3584i, abstractC0584i.f3587l, abstractC0584i.f3588m);
                abstractC0584i.mo2130y();
                return true;
            }
            arrayList2 = new ArrayList<>();
            c0313aM2132a.put(this.f3609c, arrayList2);
            arrayList2.add(this.f3608b);
            this.f3608b.mo2114a(new C1393a(c0313aM2132a));
            this.f3608b.m2118h(this.f3609c, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0584i) it.next()).mo2129x(this.f3609c);
                }
            }
            abstractC0584i = this.f3608b;
            ViewGroup viewGroup2 = this.f3609c;
            Objects.requireNonNull(abstractC0584i);
            abstractC0584i.f3587l = new ArrayList<>();
            abstractC0584i.f3588m = new ArrayList<>();
            c0593r = abstractC0584i.f3583h;
            c0593r2 = abstractC0584i.f3584i;
            c0313a = new C0313a(c0593r.f3625a);
            c0313a2 = new C0313a(c0593r2.f3625a);
            i = 0;
            while (true) {
                iArr = abstractC0584i.f3586k;
                if (i < iArr.length) {
                    break;
                    break;
                }
                i5 = iArr[i];
                if (i5 != i11) {
                    c0593r3 = c0593r;
                    i6 = c0313a.f2197d;
                    while (true) {
                        i6--;
                        if (i6 >= 0) {
                            view = (View) c0313a.m1272h(i6);
                            if (view == null) {
                            }
                        }
                    }
                } else if (i5 != 2) {
                    c0593r3 = c0593r;
                    c0313a3 = c0593r3.f3628d;
                    C0313a<String, View> c0313a5 = c0593r2.f3628d;
                    i7 = c0313a3.f2197d;
                    while (i8 < i7) {
                        viewM1276l = c0313a3.m1276l(i8);
                        if (viewM1276l == null) {
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        c0317e = c0593r.f3627c;
                        C0317e<View> c0317e3 = c0593r2.f3627c;
                        iM1256h = c0317e.m1256h();
                        i10 = 0;
                        while (i10 < iM1256h) {
                            viewM1257i = c0317e.m1257i(i10);
                            if (viewM1257i == null) {
                                c0593r4 = c0593r;
                            } else {
                                c0593r4 = c0593r;
                            }
                            i10++;
                            c0593r = c0593r4;
                            z = false;
                        }
                    }
                    c0593r3 = c0593r;
                } else {
                    c0593r3 = c0593r;
                    sparseArray = c0593r3.f3626b;
                    SparseArray<View> sparseArray3 = c0593r2.f3626b;
                    size = sparseArray.size();
                    while (i9 < size) {
                        viewValueAt = sparseArray.valueAt(i9);
                        if (viewValueAt == null) {
                        }
                    }
                }
                i++;
                c0593r = c0593r3;
                i11 = 1;
                z = false;
            }
            while (i2 < c0313a.f2197d) {
                c0592q2 = (C0592q) c0313a.m1276l(i2);
                if (abstractC0584i.m2125s(c0592q2.f3623b)) {
                    abstractC0584i.f3587l.add(c0592q2);
                    abstractC0584i.f3588m.add(null);
                }
            }
            while (i3 < c0313a2.f2197d) {
                c0592q = (C0592q) c0313a2.m1276l(i3);
                if (abstractC0584i.m2125s(c0592q.f3623b)) {
                    abstractC0584i.f3588m.add(c0592q);
                    abstractC0584i.f3587l.add(null);
                }
            }
            c0313aM2105o = AbstractC0584i.m2105o();
            int i13 = c0313aM2105o.f2197d;
            C0601z c0601z2 = C0595t.f3630a;
            C0577c0 c0577c1 = new C0577c0(viewGroup2);
            while (i4 >= 0) {
                animatorM1272h = c0313aM2105o.m1272h(i4);
                if (animatorM1272h == null) {
                }
            }
            abstractC0584i.mo2121l(viewGroup2, abstractC0584i.f3583h, abstractC0584i.f3584i, abstractC0584i.f3587l, abstractC0584i.f3588m);
            abstractC0584i.mo2130y();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f3609c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3609c.removeOnAttachStateChangeListener(this);
            C0588m.f3607c.remove(this.f3609c);
            ArrayList<AbstractC0584i> arrayList = C0588m.m2132a().get(this.f3609c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC0584i> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo2129x(this.f3609c);
                }
            }
            this.f3608b.m2119i(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0313a<ViewGroup, ArrayList<AbstractC0584i>> m2132a() {
        C0313a<ViewGroup, ArrayList<AbstractC0584i>> c0313a;
        WeakReference<C0313a<ViewGroup, ArrayList<AbstractC0584i>>> weakReference = f3606b.get();
        if (weakReference != null && (c0313a = weakReference.get()) != null) {
            return c0313a;
        }
        C0313a<ViewGroup, ArrayList<AbstractC0584i>> c0313a2 = new C0313a<>();
        f3606b.set(new WeakReference<>(c0313a2));
        return c0313a2;
    }
}
