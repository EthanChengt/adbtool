package p006b.p056m.p057b;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable;
import androidx.fragment.app.Fragment;
import com.didjdk.adbhelper.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p006b.p007a.AbstractC0181b;
import p006b.p007a.InterfaceC0180a;
import p006b.p007a.InterfaceC0182c;
import p006b.p025e.C0315c;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p040f.C0388a;
import p006b.p032h.p043i.C0401a;
import p006b.p032h.p044j.C0418m;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.AbstractC0511p;
import p006b.p061o.AbstractC0513r;
import p006b.p061o.C0503h;
import p006b.p061o.C0514s;
import p006b.p061o.C0515t;
import p006b.p061o.InterfaceC0502g;
import p006b.p061o.InterfaceC0516u;
import p006b.p062p.p063a.AbstractC0517a;
import p006b.p062p.p063a.C0518b;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.m.b.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0483r {

    /* JADX INFO: renamed from: A */
    public ArrayList<g> f3092A;

    /* JADX INFO: renamed from: B */
    public C0487v f3093B;

    /* JADX INFO: renamed from: b */
    public boolean f3096b;

    /* JADX INFO: renamed from: d */
    public ArrayList<C0451a> f3098d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Fragment> f3099e;

    /* JADX INFO: renamed from: g */
    public OnBackPressedDispatcher f3101g;

    /* JADX INFO: renamed from: n */
    public AbstractC0479o<?> f3108n;

    /* JADX INFO: renamed from: o */
    public AbstractC0471k f3109o;

    /* JADX INFO: renamed from: p */
    public Fragment f3110p;

    /* JADX INFO: renamed from: q */
    public Fragment f3111q;

    /* JADX INFO: renamed from: s */
    public boolean f3113s;

    /* JADX INFO: renamed from: t */
    public boolean f3114t;

    /* JADX INFO: renamed from: u */
    public boolean f3115u;

    /* JADX INFO: renamed from: v */
    public boolean f3116v;

    /* JADX INFO: renamed from: w */
    public boolean f3117w;

    /* JADX INFO: renamed from: x */
    public ArrayList<C0451a> f3118x;

    /* JADX INFO: renamed from: y */
    public ArrayList<Boolean> f3119y;

    /* JADX INFO: renamed from: z */
    public ArrayList<Fragment> f3120z;

    /* JADX INFO: renamed from: a */
    public final ArrayList<e> f3095a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C0491z f3097c = new C0491z();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0481p f3100f = new LayoutInflaterFactory2C0481p(this);

    /* JADX INFO: renamed from: h */
    public final AbstractC0181b f3102h = new a(false);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f3103i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap<Fragment, HashSet<C0388a>> f3104j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    public final C0466h0.a f3105k = new b();

    /* JADX INFO: renamed from: l */
    public final C0482q f3106l = new C0482q(this);

    /* JADX INFO: renamed from: m */
    public int f3107m = -1;

    /* JADX INFO: renamed from: r */
    public C0477n f3112r = new c();

    /* JADX INFO: renamed from: C */
    public Runnable f3094C = new d();

    /* JADX INFO: renamed from: b.m.b.r$a */
    public class a extends AbstractC0181b {
        public a(boolean z) {
            super(z);
        }

        @Override // p006b.p007a.AbstractC0181b
        /* JADX INFO: renamed from: a */
        public void mo753a() {
            AbstractC0483r abstractC0483r = AbstractC0483r.this;
            abstractC0483r.m1802B(true);
            if (abstractC0483r.f3102h.f1188a) {
                abstractC0483r.m1822W();
            } else {
                abstractC0483r.f3101g.m9a();
            }
        }
    }

    /* JADX INFO: renamed from: b.m.b.r$b */
    public class b implements C0466h0.a {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public void m1863a(Fragment fragment, C0388a c0388a) {
            boolean z;
            synchronized (c0388a) {
                z = c0388a.f2624a;
            }
            if (z) {
                return;
            }
            AbstractC0483r abstractC0483r = AbstractC0483r.this;
            HashSet<C0388a> hashSet = abstractC0483r.f3104j.get(fragment);
            if (hashSet != null && hashSet.remove(c0388a) && hashSet.isEmpty()) {
                abstractC0483r.f3104j.remove(fragment);
                if (fragment.f681b < 3) {
                    abstractC0483r.m1840h(fragment);
                    abstractC0483r.m1819T(fragment, fragment.m335x());
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m1864b(Fragment fragment, C0388a c0388a) {
            AbstractC0483r abstractC0483r = AbstractC0483r.this;
            if (abstractC0483r.f3104j.get(fragment) == null) {
                abstractC0483r.f3104j.put(fragment, new HashSet<>());
            }
            abstractC0483r.f3104j.get(fragment).add(c0388a);
        }
    }

    /* JADX INFO: renamed from: b.m.b.r$c */
    public class c extends C0477n {
        public c() {
        }

        @Override // p006b.p056m.p057b.C0477n
        /* JADX INFO: renamed from: a */
        public Fragment mo1785a(ClassLoader classLoader, String str) {
            AbstractC0479o<?> abstractC0479o = AbstractC0483r.this.f3108n;
            Context context = abstractC0479o.f3086c;
            Objects.requireNonNull(abstractC0479o);
            Object obj = Fragment.f660U;
            try {
                return C0477n.m1784c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new Fragment.C0089b(a.m2202p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (InstantiationException e2) {
                throw new Fragment.C0089b(a.m2202p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.C0089b(a.m2202p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.C0089b(a.m2202p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* JADX INFO: renamed from: b.m.b.r$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0483r.this.m1802B(true);
        }
    }

    /* JADX INFO: renamed from: b.m.b.r$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo1712a(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: b.m.b.r$f */
    public class f implements e {

        /* JADX INFO: renamed from: a */
        public final int f3125a;

        /* JADX INFO: renamed from: b */
        public final int f3126b;

        public f(String str, int i, int i2) {
            this.f3125a = i;
            this.f3126b = i2;
        }

        @Override // p006b.p056m.p057b.AbstractC0483r.e
        /* JADX INFO: renamed from: a */
        public boolean mo1712a(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = AbstractC0483r.this.f3111q;
            if (fragment == null || this.f3125a >= 0 || !fragment.m307j().m1822W()) {
                return AbstractC0483r.this.m1823X(arrayList, arrayList2, null, this.f3125a, this.f3126b);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b.m.b.r$g */
    public static class g implements Fragment.InterfaceC0090c {

        /* JADX INFO: renamed from: a */
        public final boolean f3128a;

        /* JADX INFO: renamed from: b */
        public final C0451a f3129b;

        /* JADX INFO: renamed from: c */
        public int f3130c;

        public g(C0451a c0451a, boolean z) {
            this.f3128a = z;
            this.f3129b = c0451a;
        }

        /* JADX INFO: renamed from: a */
        public void m1865a() {
            boolean z = this.f3130c > 0;
            Iterator<Fragment> it = this.f3129b.f2929q.f3097c.m1881g().iterator();
            while (it.hasNext()) {
                it.next().m263A0(null);
            }
            C0451a c0451a = this.f3129b;
            c0451a.f2929q.m1838g(c0451a, this.f3128a, !z, true);
        }
    }

    /* JADX INFO: renamed from: M */
    public static boolean m1800M(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: A */
    public final void m1801A(boolean z) {
        if (this.f3096b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3108n == null) {
            if (!this.f3116v) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3108n.f3087d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m1815P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3118x == null) {
            this.f3118x = new ArrayList<>();
            this.f3119y = new ArrayList<>();
        }
        this.f3096b = true;
        try {
            m1805E(null, null);
        } finally {
            this.f3096b = false;
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m1802B(boolean z) {
        boolean zMo1712a;
        m1801A(z);
        boolean z2 = false;
        while (true) {
            ArrayList<C0451a> arrayList = this.f3118x;
            ArrayList<Boolean> arrayList2 = this.f3119y;
            synchronized (this.f3095a) {
                if (this.f3095a.isEmpty()) {
                    zMo1712a = false;
                } else {
                    int size = this.f3095a.size();
                    zMo1712a = false;
                    for (int i = 0; i < size; i++) {
                        zMo1712a |= this.f3095a.get(i).mo1712a(arrayList, arrayList2);
                    }
                    this.f3095a.clear();
                    this.f3108n.f3087d.removeCallbacks(this.f3094C);
                }
            }
            if (!zMo1712a) {
                m1847k0();
                m1859w();
                this.f3097c.m1876b();
                return z2;
            }
            this.f3096b = true;
            try {
                m1825Z(this.f3118x, this.f3119y);
                m1836f();
                z2 = true;
            } catch (Throwable th) {
                m1836f();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m1803C(e eVar, boolean z) {
        if (z && (this.f3108n == null || this.f3116v)) {
            return;
        }
        m1801A(z);
        ((C0451a) eVar).mo1712a(this.f3118x, this.f3119y);
        this.f3096b = true;
        try {
            m1825Z(this.f3118x, this.f3119y);
            m1836f();
            m1847k0();
            m1859w();
            this.f3097c.m1876b();
        } catch (Throwable th) {
            m1836f();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX INFO: renamed from: D */
    public final void m1804D(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2 = arrayList.get(i).f2947p;
        ArrayList<Fragment> arrayList3 = this.f3120z;
        if (arrayList3 == null) {
            this.f3120z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f3120z.addAll(this.f3097c.m1881g());
        Fragment fragment = this.f3111q;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                this.f3120z.clear();
                if (!z2) {
                    C0466h0.m1757o(this, arrayList, arrayList2, i, i2, false, this.f3105k);
                }
                int i8 = i;
                while (i8 < i2) {
                    C0451a c0451a = arrayList.get(i8);
                    if (arrayList2.get(i8).booleanValue()) {
                        c0451a.m1717h(-1);
                        c0451a.m1721l(i8 == i2 + (-1));
                    } else {
                        c0451a.m1717h(1);
                        c0451a.m1720k();
                    }
                    i8++;
                }
                if (z2) {
                    C0315c<Fragment> c0315c = new C0315c<>();
                    m1826a(c0315c);
                    i3 = i;
                    int i9 = i2;
                    for (int i10 = i2 - 1; i10 >= i3; i10--) {
                        C0451a c0451a2 = arrayList.get(i10);
                        boolean zBooleanValue = arrayList2.get(i10).booleanValue();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= c0451a2.f2932a.size()) {
                                z = false;
                            } else if (C0451a.m1711o(c0451a2.f2932a.get(i11))) {
                                z = true;
                            } else {
                                i11++;
                            }
                        }
                        if (z && !c0451a2.m1723n(arrayList, i10 + 1, i2)) {
                            if (this.f3092A == null) {
                                this.f3092A = new ArrayList<>();
                            }
                            g gVar = new g(c0451a2, zBooleanValue);
                            this.f3092A.add(gVar);
                            for (int i12 = 0; i12 < c0451a2.f2932a.size(); i12++) {
                                AbstractC0452a0.a aVar = c0451a2.f2932a.get(i12);
                                if (C0451a.m1711o(aVar)) {
                                    aVar.f2949b.m263A0(gVar);
                                }
                            }
                            if (zBooleanValue) {
                                c0451a2.m1720k();
                            } else {
                                c0451a2.m1721l(false);
                            }
                            i9--;
                            if (i10 != i9) {
                                arrayList.remove(i10);
                                arrayList.add(i9, c0451a2);
                            }
                            m1826a(c0315c);
                        }
                    }
                    int i13 = c0315c.f2159d;
                    for (int i14 = 0; i14 < i13; i14++) {
                        Fragment fragment2 = (Fragment) c0315c.f2158c[i14];
                        if (!fragment2.f691l) {
                            View viewM324r0 = fragment2.m324r0();
                            fragment2.f673M = viewM324r0.getAlpha();
                            viewM324r0.setAlpha(0.0f);
                        }
                    }
                    i4 = i9;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                if (i4 != i3 && z2) {
                    C0466h0.m1757o(this, arrayList, arrayList2, i, i4, true, this.f3105k);
                    m1818S(this.f3107m, true);
                }
                while (i3 < i2) {
                    C0451a c0451a3 = arrayList.get(i3);
                    if (arrayList2.get(i3).booleanValue() && c0451a3.f2931s >= 0) {
                        c0451a3.f2931s = -1;
                    }
                    Objects.requireNonNull(c0451a3);
                    i3++;
                }
                return;
            }
            C0451a c0451a4 = arrayList.get(i6);
            int i15 = 3;
            if (arrayList2.get(i6).booleanValue()) {
                int i16 = 1;
                ArrayList<Fragment> arrayList4 = this.f3120z;
                int size = c0451a4.f2932a.size() - 1;
                while (size >= 0) {
                    AbstractC0452a0.a aVar2 = c0451a4.f2932a.get(size);
                    int i17 = aVar2.f2948a;
                    if (i17 != i16) {
                        if (i17 != 3) {
                            switch (i17) {
                                case 6:
                                    arrayList4.add(aVar2.f2949b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar2.f2949b;
                                    break;
                                case 10:
                                    aVar2.f2955h = aVar2.f2954g;
                                    break;
                            }
                        } else {
                            arrayList4.add(aVar2.f2949b);
                        }
                        size--;
                        i16 = 1;
                    }
                    arrayList4.remove(aVar2.f2949b);
                    size--;
                    i16 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList5 = this.f3120z;
                int i18 = 0;
                while (i18 < c0451a4.f2932a.size()) {
                    AbstractC0452a0.a aVar3 = c0451a4.f2932a.get(i18);
                    int i19 = aVar3.f2948a;
                    if (i19 == i7) {
                        i5 = 1;
                        arrayList5.add(aVar3.f2949b);
                    } else {
                        if (i19 == 2) {
                            Fragment fragment3 = aVar3.f2949b;
                            int i20 = fragment3.f703x;
                            int size2 = arrayList5.size() - 1;
                            boolean z4 = false;
                            while (size2 >= 0) {
                                Fragment fragment4 = arrayList5.get(size2);
                                if (fragment4.f703x != i20) {
                                    i20 = i20;
                                } else if (fragment4 == fragment3) {
                                    i20 = i20;
                                    z4 = true;
                                } else {
                                    if (fragment4 == fragment) {
                                        c0451a4.f2932a.add(i18, new AbstractC0452a0.a(9, fragment4));
                                        i18++;
                                        fragment = null;
                                    }
                                    AbstractC0452a0.a aVar4 = new AbstractC0452a0.a(3, fragment4);
                                    aVar4.f2950c = aVar3.f2950c;
                                    aVar4.f2952e = aVar3.f2952e;
                                    aVar4.f2951d = aVar3.f2951d;
                                    aVar4.f2953f = aVar3.f2953f;
                                    c0451a4.f2932a.add(i18, aVar4);
                                    arrayList5.remove(fragment4);
                                    i18++;
                                }
                                size2--;
                                i20 = i20;
                            }
                            if (z4) {
                                c0451a4.f2932a.remove(i18);
                                i18--;
                            } else {
                                i5 = 1;
                                aVar3.f2948a = 1;
                                arrayList5.add(fragment3);
                            }
                        } else if (i19 == i15 || i19 == 6) {
                            arrayList5.remove(aVar3.f2949b);
                            Fragment fragment5 = aVar3.f2949b;
                            if (fragment5 == fragment) {
                                c0451a4.f2932a.add(i18, new AbstractC0452a0.a(9, fragment5));
                                i18++;
                                fragment = null;
                            }
                        } else if (i19 == 7) {
                            i5 = 1;
                            arrayList5.add(aVar3.f2949b);
                        } else if (i19 == 8) {
                            c0451a4.f2932a.add(i18, new AbstractC0452a0.a(9, fragment));
                            i18++;
                            fragment = aVar3.f2949b;
                        }
                        i5 = 1;
                    }
                    i18 += i5;
                    i15 = 3;
                    i7 = 1;
                }
            }
            z3 = z3 || c0451a4.f2938g;
            i6++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1805E(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<g> arrayList3 = this.f3092A;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            g gVar = this.f3092A.get(i);
            if (arrayList == null || gVar.f3128a || (iIndexOf2 = arrayList.indexOf(gVar.f3129b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf2).booleanValue()) {
                if ((gVar.f3130c == 0) || (arrayList != null && gVar.f3129b.m1723n(arrayList, 0, arrayList.size()))) {
                    this.f3092A.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || gVar.f3128a || (iIndexOf = arrayList.indexOf(gVar.f3129b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                        gVar.m1865a();
                    }
                }
                i++;
            } else {
                this.f3092A.remove(i);
                i--;
                size--;
            }
            C0451a c0451a = gVar.f3129b;
            c0451a.f2929q.m1838g(c0451a, gVar.f3128a, false, false);
            i++;
        }
    }

    /* JADX INFO: renamed from: F */
    public Fragment m1806F(String str) {
        return this.f3097c.m1879e(str);
    }

    /* JADX INFO: renamed from: G */
    public Fragment m1807G(int i) {
        C0491z c0491z = this.f3097c;
        int size = c0491z.f3166a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (C0490y c0490y : c0491z.f3167b.values()) {
                    if (c0490y != null) {
                        Fragment fragment = c0490y.f3164b;
                        if (fragment.f702w == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = c0491z.f3166a.get(size);
            if (fragment2 != null && fragment2.f702w == i) {
                return fragment2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public Fragment m1808H(String str) {
        C0491z c0491z = this.f3097c;
        Objects.requireNonNull(c0491z);
        if (str != null) {
            int size = c0491z.f3166a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = c0491z.f3166a.get(size);
                if (fragment != null && str.equals(fragment.f704y)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0490y c0490y : c0491z.f3167b.values()) {
                if (c0490y != null) {
                    Fragment fragment2 = c0490y.f3164b;
                    if (str.equals(fragment2.f704y)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public Fragment m1809I(String str) {
        for (C0490y c0490y : this.f3097c.f3167b.values()) {
            if (c0490y != null) {
                Fragment fragmentM1809I = c0490y.f3164b;
                if (!str.equals(fragmentM1809I.f685f)) {
                    fragmentM1809I = fragmentM1809I.f700u.m1809I(str);
                }
                if (fragmentM1809I != null) {
                    return fragmentM1809I;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final ViewGroup m1810J(Fragment fragment) {
        if (fragment.f703x > 0 && this.f3109o.mo1730e()) {
            View viewMo1729b = this.f3109o.mo1729b(fragment.f703x);
            if (viewMo1729b instanceof ViewGroup) {
                return (ViewGroup) viewMo1729b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public C0477n m1811K() {
        Fragment fragment = this.f3110p;
        return fragment != null ? fragment.f698s.m1811K() : this.f3112r;
    }

    /* JADX INFO: renamed from: L */
    public void m1812L(Fragment fragment) {
        if (m1800M(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f705z) {
            return;
        }
        fragment.f705z = true;
        fragment.f672L = true ^ fragment.f672L;
        m1841h0(fragment);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    public final boolean m1813N(Fragment fragment) {
        boolean z;
        if (fragment.f663C && fragment.f664D) {
            return true;
        }
        AbstractC0483r abstractC0483r = fragment.f700u;
        boolean zM1813N = false;
        for (Fragment fragment2 : (ArrayList) abstractC0483r.f3097c.m1880f()) {
            if (fragment2 != null) {
                zM1813N = abstractC0483r.m1813N(fragment2);
            }
            if (zM1813N) {
                z = true;
                if (z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public boolean m1814O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        AbstractC0483r abstractC0483r = fragment.f698s;
        return fragment.equals(abstractC0483r.f3111q) && m1814O(abstractC0483r.f3110p);
    }

    /* JADX INFO: renamed from: P */
    public boolean m1815P() {
        return this.f3114t || this.f3115u;
    }

    /* JADX INFO: renamed from: Q */
    public void m1816Q(Fragment fragment) {
        if (this.f3097c.m1877c(fragment.f685f)) {
            return;
        }
        C0490y c0490y = new C0490y(this.f3106l, fragment);
        c0490y.m1873a(this.f3108n.f3086c.getClassLoader());
        this.f3097c.f3167b.put(c0490y.f3164b.f685f, c0490y);
        c0490y.f3165c = this.f3107m;
        if (m1800M(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m1817R(Fragment fragment) {
        Animator animator;
        if (!this.f3097c.m1877c(fragment.f685f)) {
            if (m1800M(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3107m + "since it is not added to " + this);
                return;
            }
            return;
        }
        m1819T(fragment, this.f3107m);
        if (fragment.f667G != null) {
            C0491z c0491z = this.f3097c;
            Objects.requireNonNull(c0491z);
            ViewGroup viewGroup = fragment.f666F;
            View view = fragment.f667G;
            Fragment fragment2 = null;
            if (viewGroup != null && view != null) {
                int iIndexOf = c0491z.f3166a.indexOf(fragment);
                while (true) {
                    iIndexOf--;
                    if (iIndexOf < 0) {
                        break;
                    }
                    Fragment fragment3 = c0491z.f3166a.get(iIndexOf);
                    if (fragment3.f666F == viewGroup && fragment3.f667G != null) {
                        fragment2 = fragment3;
                        break;
                    }
                }
            }
            if (fragment2 != null) {
                View view2 = fragment2.f667G;
                ViewGroup viewGroup2 = fragment.f666F;
                int iIndexOfChild = viewGroup2.indexOfChild(view2);
                int iIndexOfChild2 = viewGroup2.indexOfChild(fragment.f667G);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup2.removeViewAt(iIndexOfChild2);
                    viewGroup2.addView(fragment.f667G, iIndexOfChild);
                }
            }
            if (fragment.f671K && fragment.f666F != null) {
                float f2 = fragment.f673M;
                if (f2 > 0.0f) {
                    fragment.f667G.setAlpha(f2);
                }
                fragment.f673M = 0.0f;
                fragment.f671K = false;
                C0467i c0467iM1410B = C0360f.m1410B(this.f3108n.f3086c, this.f3109o, fragment, true);
                if (c0467iM1410B != null) {
                    Animation animation = c0467iM1410B.f3051a;
                    if (animation != null) {
                        fragment.f667G.startAnimation(animation);
                    } else {
                        c0467iM1410B.f3052b.setTarget(fragment.f667G);
                        c0467iM1410B.f3052b.start();
                    }
                }
            }
        }
        if (fragment.f672L) {
            if (fragment.f667G != null) {
                C0467i c0467iM1410B2 = C0360f.m1410B(this.f3108n.f3086c, this.f3109o, fragment, !fragment.f705z);
                if (c0467iM1410B2 == null || (animator = c0467iM1410B2.f3052b) == null) {
                    if (c0467iM1410B2 != null) {
                        fragment.f667G.startAnimation(c0467iM1410B2.f3051a);
                        c0467iM1410B2.f3051a.start();
                    }
                    fragment.f667G.setVisibility((!fragment.f705z || fragment.m266C()) ? 0 : 8);
                    if (fragment.m266C()) {
                        fragment.m336x0(false);
                    }
                } else {
                    animator.setTarget(fragment.f667G);
                    if (!fragment.f705z) {
                        fragment.f667G.setVisibility(0);
                    } else if (fragment.m266C()) {
                        fragment.m336x0(false);
                    } else {
                        ViewGroup viewGroup3 = fragment.f666F;
                        View view3 = fragment.f667G;
                        viewGroup3.startViewTransition(view3);
                        c0467iM1410B2.f3052b.addListener(new C0484s(this, viewGroup3, view3, fragment));
                    }
                    c0467iM1410B2.f3052b.start();
                }
            }
            if (fragment.f691l && m1813N(fragment)) {
                this.f3113s = true;
            }
            fragment.f672L = false;
            fragment.m288U();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m1818S(int i, boolean z) {
        AbstractC0479o<?> abstractC0479o;
        if (this.f3108n == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f3107m) {
            this.f3107m = i;
            Iterator<Fragment> it = this.f3097c.m1881g().iterator();
            while (it.hasNext()) {
                m1817R(it.next());
            }
            for (Fragment fragment : (ArrayList) this.f3097c.m1880f()) {
                if (fragment != null && !fragment.f671K) {
                    m1817R(fragment);
                }
            }
            m1845j0();
            if (this.f3113s && (abstractC0479o = this.f3108n) != null && this.f3107m == 4) {
                abstractC0479o.mo1741l();
                this.f3113s = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0217  */
    /* JADX WARN: Code duplicated, block: B:104:0x0239  */
    /* JADX WARN: Code duplicated, block: B:106:0x0249  */
    /* JADX WARN: Code duplicated, block: B:109:0x0264  */
    /* JADX WARN: Code duplicated, block: B:112:0x026e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0274  */
    /* JADX WARN: Code duplicated, block: B:118:0x0288  */
    /* JADX WARN: Code duplicated, block: B:120:0x028c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x028e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0297  */
    /* JADX WARN: Code duplicated, block: B:131:0x02da  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x030c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0318  */
    /* JADX WARN: Code duplicated, block: B:141:0x0325  */
    /* JADX WARN: Code duplicated, block: B:147:0x0357  */
    /* JADX WARN: Code duplicated, block: B:151:0x0360  */
    /* JADX WARN: Code duplicated, block: B:154:0x0381  */
    /* JADX WARN: Code duplicated, block: B:156:0x0399  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:164:0x03be  */
    /* JADX WARN: Code duplicated, block: B:166:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:167:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:170:0x03df  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:175:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:178:0x0419  */
    /* JADX WARN: Code duplicated, block: B:180:0x0424  */
    /* JADX WARN: Code duplicated, block: B:182:0x043c  */
    /* JADX WARN: Code duplicated, block: B:185:0x044c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0452  */
    /* JADX WARN: Code duplicated, block: B:190:0x0477  */
    /* JADX WARN: Code duplicated, block: B:192:0x0482  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:364:0x07da  */
    /* JADX WARN: Code duplicated, block: B:366:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:369:0x0802  */
    /* JADX WARN: Code duplicated, block: B:371:0x0808  */
    /* JADX WARN: Code duplicated, block: B:377:0x0831  */
    /* JADX WARN: Code duplicated, block: B:381:0x083c  */
    /* JADX WARN: Code duplicated, block: B:383:0x0843  */
    /* JADX WARN: Code duplicated, block: B:385:0x0881  */
    /* JADX WARN: Code duplicated, block: B:395:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0203  */
    /* JADX INFO: renamed from: T */
    public void m1819T(Fragment fragment, int i) {
        Fragment fragment2;
        AbstractC0483r abstractC0483r;
        Fragment fragment3;
        boolean z;
        Fragment fragmentM1879e;
        ViewGroup viewGroup;
        AbstractC0471k abstractC0471k;
        Fragment fragment4;
        Fragment fragment5;
        View view;
        SparseArray<Parcelable> sparseArray;
        Fragment fragment6;
        ViewGroup viewGroup2;
        View view2;
        Fragment fragment7;
        Fragment fragment8;
        boolean z2;
        int i2;
        Fragment fragment9;
        String resourceName;
        Fragment fragment10;
        View view3;
        Fragment fragment11;
        Fragment fragment12;
        AbstractC0499d.a aVar;
        Fragment fragment13;
        AbstractC0499d.a aVar2;
        C0490y c0490y = this.f3097c.f3167b.get(fragment.f685f);
        if (c0490y == null) {
            c0490y = new C0490y(this.f3106l, fragment);
            c0490y.f3165c = 1;
        }
        int iMin = c0490y.f3165c;
        Fragment fragment14 = c0490y.f3164b;
        if (fragment14.f693n) {
            iMin = fragment14.f694o ? Math.max(iMin, 1) : iMin < 2 ? Math.min(iMin, fragment14.f681b) : Math.min(iMin, 1);
        }
        if (!c0490y.f3164b.f691l) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment15 = c0490y.f3164b;
        if (fragment15.f692m) {
            iMin = fragment15.m268D() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        Fragment fragment16 = c0490y.f3164b;
        if (fragment16.f668H && fragment16.f681b < 3) {
            iMin = Math.min(iMin, 2);
        }
        int iOrdinal = c0490y.f3164b.f676P.ordinal();
        if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 3);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        int iMin2 = Math.min(i, iMin);
        int i3 = fragment.f681b;
        C0467i c0467iM1410B = null;
        if (i3 <= iMin2) {
            if (i3 < iMin2 && !this.f3104j.isEmpty()) {
                m1834e(fragment);
            }
            int i4 = fragment.f681b;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                            }
                        }
                        if (iMin2 > 3) {
                            if (m1800M(3)) {
                                a.m2192f(a.m2191e("moveto RESUMED: "), c0490y.f3164b, "FragmentManager");
                            }
                            fragment13 = c0490y.f3164b;
                            fragment13.f700u.m1820U();
                            fragment13.f700u.m1802B(true);
                            fragment13.f681b = 4;
                            fragment13.f665E = false;
                            fragment13.mo301f0();
                            if (fragment13.f665E) {
                                throw new C0480o0(a.m2200n("Fragment ", fragment13, " did not call through to super.onResume()"));
                            }
                            C0503h c0503h = fragment13.f677Q;
                            aVar2 = AbstractC0499d.a.ON_RESUME;
                            c0503h.m1899d(aVar2);
                            if (fragment13.f667G != null) {
                                fragment13.f678R.f3084b.m1899d(aVar2);
                            }
                            AbstractC0483r abstractC0483r2 = fragment13.f700u;
                            abstractC0483r2.f3114t = false;
                            abstractC0483r2.f3115u = false;
                            abstractC0483r2.m1858v(4);
                            c0490y.f3163a.m1794i(c0490y.f3164b, false);
                            Fragment fragment17 = c0490y.f3164b;
                            fragment17.f682c = null;
                            fragment17.f683d = null;
                        }
                    }
                    if (iMin2 > 2) {
                        if (m1800M(3)) {
                            a.m2192f(a.m2191e("moveto STARTED: "), c0490y.f3164b, "FragmentManager");
                        }
                        fragment12 = c0490y.f3164b;
                        fragment12.f700u.m1820U();
                        fragment12.f700u.m1802B(true);
                        fragment12.f681b = 3;
                        fragment12.f665E = false;
                        fragment12.mo304h0();
                        if (!fragment12.f665E) {
                            throw new C0480o0(a.m2200n("Fragment ", fragment12, " did not call through to super.onStart()"));
                        }
                        C0503h c0503h2 = fragment12.f677Q;
                        aVar = AbstractC0499d.a.ON_START;
                        c0503h2.m1899d(aVar);
                        if (fragment12.f667G != null) {
                            fragment12.f678R.f3084b.m1899d(aVar);
                        }
                        AbstractC0483r abstractC0483r3 = fragment12.f700u;
                        abstractC0483r3.f3114t = false;
                        abstractC0483r3.f3115u = false;
                        abstractC0483r3.m1858v(3);
                        c0490y.f3163a.m1796k(c0490y.f3164b, false);
                    }
                    if (iMin2 > 3) {
                        if (m1800M(3)) {
                            a.m2192f(a.m2191e("moveto RESUMED: "), c0490y.f3164b, "FragmentManager");
                        }
                        fragment13 = c0490y.f3164b;
                        fragment13.f700u.m1820U();
                        fragment13.f700u.m1802B(true);
                        fragment13.f681b = 4;
                        fragment13.f665E = false;
                        fragment13.mo301f0();
                        if (fragment13.f665E) {
                            throw new C0480o0(a.m2200n("Fragment ", fragment13, " did not call through to super.onResume()"));
                        }
                        C0503h c0503h3 = fragment13.f677Q;
                        aVar2 = AbstractC0499d.a.ON_RESUME;
                        c0503h3.m1899d(aVar2);
                        if (fragment13.f667G != null) {
                            fragment13.f678R.f3084b.m1899d(aVar2);
                        }
                        AbstractC0483r abstractC0483r4 = fragment13.f700u;
                        abstractC0483r4.f3114t = false;
                        abstractC0483r4.f3115u = false;
                        abstractC0483r4.m1858v(4);
                        c0490y.f3163a.m1794i(c0490y.f3164b, false);
                        Fragment fragment18 = c0490y.f3164b;
                        fragment18.f682c = null;
                        fragment18.f683d = null;
                    }
                }
                if (iMin2 > -1) {
                    fragment10 = c0490y.f3164b;
                    if (fragment10.f693n && fragment10.f694o && !fragment10.f696q) {
                        if (m1800M(3)) {
                            a.m2192f(a.m2191e("moveto CREATE_VIEW: "), c0490y.f3164b, "FragmentManager");
                        }
                        Fragment fragment19 = c0490y.f3164b;
                        fragment19.m312l0(fragment19.m314m0(fragment19.f682c), null, c0490y.f3164b.f682c);
                        view3 = c0490y.f3164b.f667G;
                        if (view3 != null) {
                            view3.setSaveFromParentEnabled(false);
                            Fragment fragment20 = c0490y.f3164b;
                            fragment20.f667G.setTag(R.id.fh, fragment20);
                            fragment11 = c0490y.f3164b;
                            if (fragment11.f705z) {
                                fragment11.f667G.setVisibility(8);
                            }
                            Fragment fragment21 = c0490y.f3164b;
                            fragment21.mo308j0(fragment21.f667G, fragment21.f682c);
                            C0482q c0482q = c0490y.f3163a;
                            Fragment fragment22 = c0490y.f3164b;
                            c0482q.m1798m(fragment22, fragment22.f667G, fragment22.f682c, false);
                        }
                    }
                }
                if (iMin2 > 1) {
                    abstractC0471k = this.f3109o;
                    if (!c0490y.f3164b.f693n) {
                        if (m1800M(3)) {
                            a.m2192f(a.m2191e("moveto CREATE_VIEW: "), c0490y.f3164b, "FragmentManager");
                        }
                        fragment6 = c0490y.f3164b;
                        viewGroup2 = fragment6.f666F;
                        if (viewGroup2 == null) {
                            i2 = fragment6.f703x;
                            if (i2 != 0) {
                                viewGroup2 = null;
                            } else {
                                if (i2 != -1) {
                                    StringBuilder sbM2191e = a.m2191e("Cannot create fragment ");
                                    sbM2191e.append(c0490y.f3164b);
                                    sbM2191e.append(" for a container view with no id");
                                    throw new IllegalArgumentException(sbM2191e.toString());
                                }
                                viewGroup2 = (ViewGroup) abstractC0471k.mo1729b(i2);
                                if (viewGroup2 == null) {
                                    fragment9 = c0490y.f3164b;
                                    if (!fragment9.f695p) {
                                        try {
                                            resourceName = fragment9.m327t().getResourceName(c0490y.f3164b.f703x);
                                        } catch (Resources.NotFoundException unused) {
                                            resourceName = "unknown";
                                        }
                                        StringBuilder sbM2191e2 = a.m2191e("No view found for id 0x");
                                        sbM2191e2.append(Integer.toHexString(c0490y.f3164b.f703x));
                                        sbM2191e2.append(" (");
                                        sbM2191e2.append(resourceName);
                                        sbM2191e2.append(") for fragment ");
                                        sbM2191e2.append(c0490y.f3164b);
                                        throw new IllegalArgumentException(sbM2191e2.toString());
                                    }
                                }
                            }
                        }
                        Fragment fragment23 = c0490y.f3164b;
                        fragment23.f666F = viewGroup2;
                        fragment23.m312l0(fragment23.m314m0(fragment23.f682c), viewGroup2, c0490y.f3164b.f682c);
                        view2 = c0490y.f3164b.f667G;
                        if (view2 != null) {
                            view2.setSaveFromParentEnabled(false);
                            Fragment fragment24 = c0490y.f3164b;
                            fragment24.f667G.setTag(R.id.fh, fragment24);
                            if (viewGroup2 != null) {
                                viewGroup2.addView(c0490y.f3164b.f667G);
                            }
                            fragment7 = c0490y.f3164b;
                            if (fragment7.f705z) {
                                fragment7.f667G.setVisibility(8);
                            }
                            C0418m.m1576s(c0490y.f3164b.f667G);
                            Fragment fragment25 = c0490y.f3164b;
                            fragment25.mo308j0(fragment25.f667G, fragment25.f682c);
                            C0482q c0482q2 = c0490y.f3163a;
                            Fragment fragment26 = c0490y.f3164b;
                            c0482q2.m1798m(fragment26, fragment26.f667G, fragment26.f682c, false);
                            fragment8 = c0490y.f3164b;
                            if (fragment8.f667G.getVisibility() == 0 || c0490y.f3164b.f666F == null) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            fragment8.f671K = z2;
                        }
                    }
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("moveto ACTIVITY_CREATED: "), c0490y.f3164b, "FragmentManager");
                    }
                    fragment4 = c0490y.f3164b;
                    Bundle bundle = fragment4.f682c;
                    fragment4.f700u.m1820U();
                    fragment4.f681b = 2;
                    fragment4.f665E = false;
                    fragment4.mo272F(bundle);
                    if (fragment4.f665E) {
                        throw new C0480o0(a.m2200n("Fragment ", fragment4, " did not call through to super.onActivityCreated()"));
                    }
                    AbstractC0483r abstractC0483r5 = fragment4.f700u;
                    abstractC0483r5.f3114t = false;
                    abstractC0483r5.f3115u = false;
                    abstractC0483r5.m1858v(2);
                    C0482q c0482q3 = c0490y.f3163a;
                    Fragment fragment27 = c0490y.f3164b;
                    c0482q3.m1786a(fragment27, fragment27.f682c, false);
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("moveto RESTORE_VIEW_STATE: "), c0490y.f3164b, "FragmentManager");
                    }
                    fragment5 = c0490y.f3164b;
                    view = fragment5.f667G;
                    if (view != null) {
                        sparseArray = fragment5.f683d;
                        if (sparseArray != null) {
                            view.restoreHierarchyState(sparseArray);
                            fragment5.f683d = null;
                        }
                        fragment5.f665E = false;
                        fragment5.m310k0();
                        if (fragment5.f665E) {
                            throw new C0480o0(a.m2200n("Fragment ", fragment5, " did not call through to super.onViewStateRestored()"));
                        }
                        if (fragment5.f667G != null) {
                            fragment5.f678R.f3084b.m1899d(AbstractC0499d.a.ON_CREATE);
                        }
                    }
                    c0490y.f3164b.f682c = null;
                }
                if (iMin2 > 2) {
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("moveto STARTED: "), c0490y.f3164b, "FragmentManager");
                    }
                    fragment12 = c0490y.f3164b;
                    fragment12.f700u.m1820U();
                    fragment12.f700u.m1802B(true);
                    fragment12.f681b = 3;
                    fragment12.f665E = false;
                    fragment12.mo304h0();
                    if (!fragment12.f665E) {
                        throw new C0480o0(a.m2200n("Fragment ", fragment12, " did not call through to super.onStart()"));
                    }
                    C0503h c0503h4 = fragment12.f677Q;
                    aVar = AbstractC0499d.a.ON_START;
                    c0503h4.m1899d(aVar);
                    if (fragment12.f667G != null) {
                        fragment12.f678R.f3084b.m1899d(aVar);
                    }
                    AbstractC0483r abstractC0483r6 = fragment12.f700u;
                    abstractC0483r6.f3114t = false;
                    abstractC0483r6.f3115u = false;
                    abstractC0483r6.m1858v(3);
                    c0490y.f3163a.m1796k(c0490y.f3164b, false);
                }
                if (iMin2 > 3) {
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("moveto RESUMED: "), c0490y.f3164b, "FragmentManager");
                    }
                    fragment13 = c0490y.f3164b;
                    fragment13.f700u.m1820U();
                    fragment13.f700u.m1802B(true);
                    fragment13.f681b = 4;
                    fragment13.f665E = false;
                    fragment13.mo301f0();
                    if (fragment13.f665E) {
                        throw new C0480o0(a.m2200n("Fragment ", fragment13, " did not call through to super.onResume()"));
                    }
                    C0503h c0503h5 = fragment13.f677Q;
                    aVar2 = AbstractC0499d.a.ON_RESUME;
                    c0503h5.m1899d(aVar2);
                    if (fragment13.f667G != null) {
                        fragment13.f678R.f3084b.m1899d(aVar2);
                    }
                    AbstractC0483r abstractC0483r7 = fragment13.f700u;
                    abstractC0483r7.f3114t = false;
                    abstractC0483r7.f3115u = false;
                    abstractC0483r7.m1858v(4);
                    c0490y.f3163a.m1794i(c0490y.f3164b, false);
                    Fragment fragment110 = c0490y.f3164b;
                    fragment110.f682c = null;
                    fragment110.f683d = null;
                }
            } else if (iMin2 > -1) {
                if (m1800M(3)) {
                    Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
                }
                Fragment fragment28 = fragment.f687h;
                if (fragment28 != null) {
                    if (!fragment28.equals(m1806F(fragment28.f685f))) {
                        throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.f687h + " that does not belong to this FragmentManager!");
                    }
                    Fragment fragment29 = fragment.f687h;
                    if (fragment29.f681b < 1) {
                        m1819T(fragment29, 1);
                    }
                    fragment.f688i = fragment.f687h.f685f;
                    fragment.f687h = null;
                }
                String str = fragment.f688i;
                if (str != null) {
                    Fragment fragmentM1879e2 = this.f3097c.m1879e(str);
                    if (fragmentM1879e2 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Fragment ");
                        sb.append(fragment);
                        sb.append(" declared target fragment ");
                        throw new IllegalStateException(a.m2203q(sb, fragment.f688i, " that does not belong to this FragmentManager!"));
                    }
                    if (fragmentM1879e2.f681b < 1) {
                        m1819T(fragmentM1879e2, 1);
                    }
                }
                AbstractC0479o<?> abstractC0479o = this.f3108n;
                Fragment fragment30 = this.f3110p;
                Fragment fragment31 = c0490y.f3164b;
                fragment31.f699t = abstractC0479o;
                fragment31.f701v = fragment30;
                fragment31.f698s = this;
                c0490y.f3163a.m1792g(fragment31, abstractC0479o.f3086c, false);
                Fragment fragment32 = c0490y.f3164b;
                fragment32.f700u.m1830c(fragment32.f699t, new C0457d(fragment32), fragment32);
                fragment32.f681b = 0;
                fragment32.f665E = false;
                fragment32.mo276I(fragment32.f699t.f3086c);
                if (!fragment32.f665E) {
                    throw new C0480o0(a.m2200n("Fragment ", fragment32, " did not call through to super.onAttach()"));
                }
                Fragment fragment33 = c0490y.f3164b;
                Fragment fragment34 = fragment33.f701v;
                if (fragment34 == null) {
                    abstractC0479o.mo1736f(fragment33);
                } else {
                    fragment34.m277J();
                }
                c0490y.f3163a.m1787b(c0490y.f3164b, abstractC0479o.f3086c, false);
            }
            if (iMin2 > 0) {
                if (m1800M(3)) {
                    a.m2192f(a.m2191e("moveto CREATED: "), c0490y.f3164b, "FragmentManager");
                }
                Fragment fragment35 = c0490y.f3164b;
                if (fragment35.f675O) {
                    fragment35.m326s0(fragment35.f682c);
                    c0490y.f3164b.f681b = 1;
                } else {
                    c0490y.f3163a.m1793h(fragment35, fragment35.f682c, false);
                    Fragment fragment36 = c0490y.f3164b;
                    Bundle bundle2 = fragment36.f682c;
                    fragment36.f700u.m1820U();
                    fragment36.f681b = 1;
                    fragment36.f665E = false;
                    fragment36.f680T.m2076a(bundle2);
                    fragment36.mo279L(bundle2);
                    fragment36.f675O = true;
                    if (!fragment36.f665E) {
                        throw new C0480o0(a.m2200n("Fragment ", fragment36, " did not call through to super.onCreate()"));
                    }
                    fragment36.f677Q.m1899d(AbstractC0499d.a.ON_CREATE);
                    C0482q c0482q4 = c0490y.f3163a;
                    Fragment fragment37 = c0490y.f3164b;
                    c0482q4.m1788c(fragment37, fragment37.f682c, false);
                }
            }
            if (iMin2 > -1) {
                fragment10 = c0490y.f3164b;
                if (fragment10.f693n) {
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("moveto CREATE_VIEW: "), c0490y.f3164b, "FragmentManager");
                    }
                    Fragment fragment111 = c0490y.f3164b;
                    fragment111.m312l0(fragment111.m314m0(fragment111.f682c), null, c0490y.f3164b.f682c);
                    view3 = c0490y.f3164b.f667G;
                    if (view3 != null) {
                        view3.setSaveFromParentEnabled(false);
                        Fragment fragment210 = c0490y.f3164b;
                        fragment210.f667G.setTag(R.id.fh, fragment210);
                        fragment11 = c0490y.f3164b;
                        if (fragment11.f705z) {
                            fragment11.f667G.setVisibility(8);
                        }
                        Fragment fragment211 = c0490y.f3164b;
                        fragment211.mo308j0(fragment211.f667G, fragment211.f682c);
                        C0482q c0482q5 = c0490y.f3163a;
                        Fragment fragment212 = c0490y.f3164b;
                        c0482q5.m1798m(fragment212, fragment212.f667G, fragment212.f682c, false);
                    }
                }
            }
            if (iMin2 > 1) {
                abstractC0471k = this.f3109o;
                if (!c0490y.f3164b.f693n) {
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("moveto CREATE_VIEW: "), c0490y.f3164b, "FragmentManager");
                    }
                    fragment6 = c0490y.f3164b;
                    viewGroup2 = fragment6.f666F;
                    if (viewGroup2 == null) {
                        i2 = fragment6.f703x;
                        if (i2 != 0) {
                            viewGroup2 = null;
                        } else {
                            if (i2 != -1) {
                                StringBuilder sbM2191e3 = a.m2191e("Cannot create fragment ");
                                sbM2191e3.append(c0490y.f3164b);
                                sbM2191e3.append(" for a container view with no id");
                                throw new IllegalArgumentException(sbM2191e3.toString());
                            }
                            viewGroup2 = (ViewGroup) abstractC0471k.mo1729b(i2);
                            if (viewGroup2 == null) {
                                fragment9 = c0490y.f3164b;
                                if (!fragment9.f695p) {
                                    resourceName = fragment9.m327t().getResourceName(c0490y.f3164b.f703x);
                                    StringBuilder sbM2191e4 = a.m2191e("No view found for id 0x");
                                    sbM2191e4.append(Integer.toHexString(c0490y.f3164b.f703x));
                                    sbM2191e4.append(" (");
                                    sbM2191e4.append(resourceName);
                                    sbM2191e4.append(") for fragment ");
                                    sbM2191e4.append(c0490y.f3164b);
                                    throw new IllegalArgumentException(sbM2191e4.toString());
                                }
                            }
                        }
                    }
                    Fragment fragment213 = c0490y.f3164b;
                    fragment213.f666F = viewGroup2;
                    fragment213.m312l0(fragment213.m314m0(fragment213.f682c), viewGroup2, c0490y.f3164b.f682c);
                    view2 = c0490y.f3164b.f667G;
                    if (view2 != null) {
                        view2.setSaveFromParentEnabled(false);
                        Fragment fragment214 = c0490y.f3164b;
                        fragment214.f667G.setTag(R.id.fh, fragment214);
                        if (viewGroup2 != null) {
                            viewGroup2.addView(c0490y.f3164b.f667G);
                        }
                        fragment7 = c0490y.f3164b;
                        if (fragment7.f705z) {
                            fragment7.f667G.setVisibility(8);
                        }
                        C0418m.m1576s(c0490y.f3164b.f667G);
                        Fragment fragment215 = c0490y.f3164b;
                        fragment215.mo308j0(fragment215.f667G, fragment215.f682c);
                        C0482q c0482q6 = c0490y.f3163a;
                        Fragment fragment216 = c0490y.f3164b;
                        c0482q6.m1798m(fragment216, fragment216.f667G, fragment216.f682c, false);
                        fragment8 = c0490y.f3164b;
                        if (fragment8.f667G.getVisibility() == 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        fragment8.f671K = z2;
                    }
                }
                if (m1800M(3)) {
                    a.m2192f(a.m2191e("moveto ACTIVITY_CREATED: "), c0490y.f3164b, "FragmentManager");
                }
                fragment4 = c0490y.f3164b;
                Bundle bundle3 = fragment4.f682c;
                fragment4.f700u.m1820U();
                fragment4.f681b = 2;
                fragment4.f665E = false;
                fragment4.mo272F(bundle3);
                if (fragment4.f665E) {
                    throw new C0480o0(a.m2200n("Fragment ", fragment4, " did not call through to super.onActivityCreated()"));
                }
                AbstractC0483r abstractC0483r8 = fragment4.f700u;
                abstractC0483r8.f3114t = false;
                abstractC0483r8.f3115u = false;
                abstractC0483r8.m1858v(2);
                C0482q c0482q7 = c0490y.f3163a;
                Fragment fragment217 = c0490y.f3164b;
                c0482q7.m1786a(fragment217, fragment217.f682c, false);
                if (m1800M(3)) {
                    a.m2192f(a.m2191e("moveto RESTORE_VIEW_STATE: "), c0490y.f3164b, "FragmentManager");
                }
                fragment5 = c0490y.f3164b;
                view = fragment5.f667G;
                if (view != null) {
                    sparseArray = fragment5.f683d;
                    if (sparseArray != null) {
                        view.restoreHierarchyState(sparseArray);
                        fragment5.f683d = null;
                    }
                    fragment5.f665E = false;
                    fragment5.m310k0();
                    if (fragment5.f665E) {
                        throw new C0480o0(a.m2200n("Fragment ", fragment5, " did not call through to super.onViewStateRestored()"));
                    }
                    if (fragment5.f667G != null) {
                        fragment5.f678R.f3084b.m1899d(AbstractC0499d.a.ON_CREATE);
                    }
                }
                c0490y.f3164b.f682c = null;
            }
            if (iMin2 > 2) {
                if (m1800M(3)) {
                    a.m2192f(a.m2191e("moveto STARTED: "), c0490y.f3164b, "FragmentManager");
                }
                fragment12 = c0490y.f3164b;
                fragment12.f700u.m1820U();
                fragment12.f700u.m1802B(true);
                fragment12.f681b = 3;
                fragment12.f665E = false;
                fragment12.mo304h0();
                if (!fragment12.f665E) {
                    throw new C0480o0(a.m2200n("Fragment ", fragment12, " did not call through to super.onStart()"));
                }
                C0503h c0503h6 = fragment12.f677Q;
                aVar = AbstractC0499d.a.ON_START;
                c0503h6.m1899d(aVar);
                if (fragment12.f667G != null) {
                    fragment12.f678R.f3084b.m1899d(aVar);
                }
                AbstractC0483r abstractC0483r9 = fragment12.f700u;
                abstractC0483r9.f3114t = false;
                abstractC0483r9.f3115u = false;
                abstractC0483r9.m1858v(3);
                c0490y.f3163a.m1796k(c0490y.f3164b, false);
            }
            if (iMin2 > 3) {
                if (m1800M(3)) {
                    a.m2192f(a.m2191e("moveto RESUMED: "), c0490y.f3164b, "FragmentManager");
                }
                fragment13 = c0490y.f3164b;
                fragment13.f700u.m1820U();
                fragment13.f700u.m1802B(true);
                fragment13.f681b = 4;
                fragment13.f665E = false;
                fragment13.mo301f0();
                if (fragment13.f665E) {
                    throw new C0480o0(a.m2200n("Fragment ", fragment13, " did not call through to super.onResume()"));
                }
                C0503h c0503h7 = fragment13.f677Q;
                aVar2 = AbstractC0499d.a.ON_RESUME;
                c0503h7.m1899d(aVar2);
                if (fragment13.f667G != null) {
                    fragment13.f678R.f3084b.m1899d(aVar2);
                }
                AbstractC0483r abstractC0483r10 = fragment13.f700u;
                abstractC0483r10.f3114t = false;
                abstractC0483r10.f3115u = false;
                abstractC0483r10.m1858v(4);
                c0490y.f3163a.m1794i(c0490y.f3164b, false);
                Fragment fragment112 = c0490y.f3164b;
                fragment112.f682c = null;
                fragment112.f683d = null;
            }
        } else if (i3 > iMin2) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                if (iMin2 < 4) {
                                    if (m1800M(3)) {
                                        a.m2192f(a.m2191e("movefrom RESUMED: "), c0490y.f3164b, "FragmentManager");
                                    }
                                    Fragment fragment38 = c0490y.f3164b;
                                    fragment38.f700u.m1858v(3);
                                    if (fragment38.f667G != null) {
                                        fragment38.f678R.f3084b.m1899d(AbstractC0499d.a.ON_PAUSE);
                                    }
                                    fragment38.f677Q.m1899d(AbstractC0499d.a.ON_PAUSE);
                                    fragment38.f681b = 3;
                                    fragment38.f665E = false;
                                    fragment38.mo294a0();
                                    if (!fragment38.f665E) {
                                        throw new C0480o0(a.m2200n("Fragment ", fragment38, " did not call through to super.onPause()"));
                                    }
                                    c0490y.f3163a.m1791f(c0490y.f3164b, false);
                                }
                            }
                        }
                        if (iMin2 < 3) {
                            if (m1800M(3)) {
                                a.m2192f(a.m2191e("movefrom STARTED: "), c0490y.f3164b, "FragmentManager");
                            }
                            Fragment fragment39 = c0490y.f3164b;
                            AbstractC0483r abstractC0483r11 = fragment39.f700u;
                            abstractC0483r11.f3115u = true;
                            abstractC0483r11.m1858v(2);
                            if (fragment39.f667G != null) {
                                fragment39.f678R.f3084b.m1899d(AbstractC0499d.a.ON_STOP);
                            }
                            fragment39.f677Q.m1899d(AbstractC0499d.a.ON_STOP);
                            fragment39.f681b = 2;
                            fragment39.f665E = false;
                            fragment39.mo306i0();
                            if (!fragment39.f665E) {
                                throw new C0480o0(a.m2200n("Fragment ", fragment39, " did not call through to super.onStop()"));
                            }
                            c0490y.f3163a.m1797l(c0490y.f3164b, false);
                        }
                    }
                    if (iMin2 < 2) {
                        if (m1800M(3)) {
                            Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                        }
                        if (fragment.f667G != null && this.f3108n.mo1739j(fragment) && fragment.f683d == null) {
                            c0490y.m1874b();
                        }
                        View view4 = fragment.f667G;
                        if (view4 != null && (viewGroup = fragment.f666F) != null) {
                            viewGroup.endViewTransition(view4);
                            fragment.f667G.clearAnimation();
                            if (!fragment.m270E()) {
                                if (this.f3107m > -1 && !this.f3116v && fragment.f667G.getVisibility() == 0 && fragment.f673M >= 0.0f) {
                                    c0467iM1410B = C0360f.m1410B(this.f3108n.f3086c, this.f3109o, fragment, false);
                                }
                                fragment.f673M = 0.0f;
                                ViewGroup viewGroup3 = fragment.f666F;
                                View view5 = fragment.f667G;
                                if (c0467iM1410B != null) {
                                    fragment.m265B0(iMin2);
                                    C0466h0.a aVar3 = this.f3105k;
                                    View view6 = fragment.f667G;
                                    ViewGroup viewGroup4 = fragment.f666F;
                                    viewGroup4.startViewTransition(view6);
                                    C0388a c0388a = new C0388a();
                                    C0461f c0461f = new C0461f(fragment);
                                    synchronized (c0388a) {
                                        while (c0388a.f2626c) {
                                            try {
                                                c0388a.wait();
                                            } catch (InterruptedException unused2) {
                                            }
                                        }
                                        if (c0388a.f2625b != c0461f) {
                                            c0388a.f2625b = c0461f;
                                            if (c0388a.f2624a) {
                                                c0461f.m1742a();
                                            }
                                        }
                                    }
                                    b bVar = (b) aVar3;
                                    bVar.m1864b(fragment, c0388a);
                                    if (c0467iM1410B.f3051a != null) {
                                        RunnableC0469j runnableC0469j = new RunnableC0469j(c0467iM1410B.f3051a, viewGroup4, view6);
                                        fragment.m328t0(fragment.f667G);
                                        runnableC0469j.setAnimationListener(new AnimationAnimationListenerC0463g(viewGroup4, fragment, bVar, c0388a));
                                        fragment.f667G.startAnimation(runnableC0469j);
                                    } else {
                                        Animator animator = c0467iM1410B.f3052b;
                                        fragment.m330u0(animator);
                                        animator.addListener(new C0465h(viewGroup4, view6, fragment, bVar, c0388a));
                                        animator.setTarget(fragment.f667G);
                                        animator.start();
                                    }
                                }
                                viewGroup3.removeView(view5);
                                if (viewGroup3 != fragment.f666F) {
                                    return;
                                }
                            }
                        }
                        if (this.f3104j.get(fragment) == null) {
                            m1840h(fragment);
                        } else {
                            fragment.m265B0(iMin2);
                        }
                    }
                }
                if (iMin2 < 1) {
                    if ((fragment.f692m && !fragment.m268D()) || this.f3093B.m1867b(fragment)) {
                        Fragment fragment40 = c0490y.f3164b;
                        if (this.f3097c.m1877c(fragment40.f685f)) {
                            if (m1800M(2)) {
                                Log.v("FragmentManager", "Removed fragment from active set " + fragment40);
                            }
                            C0491z c0491z = this.f3097c;
                            Objects.requireNonNull(c0491z);
                            Fragment fragment41 = c0490y.f3164b;
                            for (C0490y c0490y2 : c0491z.f3167b.values()) {
                                if (c0490y2 != null) {
                                    Fragment fragment42 = c0490y2.f3164b;
                                    if (fragment41.f685f.equals(fragment42.f688i)) {
                                        fragment42.f687h = fragment41;
                                        fragment42.f688i = null;
                                    }
                                }
                            }
                            c0491z.f3167b.put(fragment41.f685f, null);
                            String str2 = fragment41.f688i;
                            if (str2 != null) {
                                fragment41.f687h = c0491z.m1879e(str2);
                            }
                            m1827a0(fragment40);
                        }
                    } else {
                        String str3 = fragment.f688i;
                        if (str3 != null && (fragmentM1879e = this.f3097c.m1879e(str3)) != null && fragmentM1879e.f662B) {
                            fragment.f687h = fragmentM1879e;
                        }
                    }
                    if (this.f3104j.get(fragment) != null) {
                        fragment.m265B0(iMin2);
                        iMin2 = 1;
                    } else {
                        AbstractC0479o<?> abstractC0479o2 = this.f3108n;
                        C0487v c0487v = this.f3093B;
                        if (m1800M(3)) {
                            a.m2192f(a.m2191e("movefrom CREATED: "), c0490y.f3164b, "FragmentManager");
                        }
                        Fragment fragment43 = c0490y.f3164b;
                        boolean z3 = fragment43.f692m && !fragment43.m268D();
                        if (z3 || c0487v.m1867b(c0490y.f3164b)) {
                            if (abstractC0479o2 instanceof InterfaceC0516u) {
                                z = c0487v.f3144f;
                            } else {
                                Context context = abstractC0479o2.f3086c;
                                z = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
                            }
                            if (z3 || z) {
                                Fragment fragment44 = c0490y.f3164b;
                                Objects.requireNonNull(c0487v);
                                if (m1800M(3)) {
                                    Log.d("FragmentManager", "Clearing non-config state for " + fragment44);
                                }
                                C0487v c0487v2 = c0487v.f3141c.get(fragment44.f685f);
                                if (c0487v2 != null) {
                                    c0487v2.mo1866a();
                                    c0487v.f3141c.remove(fragment44.f685f);
                                }
                                C0515t c0515t = c0487v.f3142d.get(fragment44.f685f);
                                if (c0515t != null) {
                                    c0515t.m1913a();
                                    c0487v.f3142d.remove(fragment44.f685f);
                                }
                            }
                            Fragment fragment45 = c0490y.f3164b;
                            fragment45.f700u.m1850n();
                            fragment45.f677Q.m1899d(AbstractC0499d.a.ON_DESTROY);
                            fragment45.f681b = 0;
                            fragment45.f665E = false;
                            fragment45.f675O = false;
                            fragment45.mo284Q();
                            if (!fragment45.f665E) {
                                throw new C0480o0(a.m2200n("Fragment ", fragment45, " did not call through to super.onDestroy()"));
                            }
                            c0490y.f3163a.m1789d(c0490y.f3164b, false);
                        } else {
                            c0490y.f3164b.f681b = 0;
                        }
                    }
                }
                if (iMin2 < 0) {
                    C0487v c0487v3 = this.f3093B;
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("movefrom ATTACHED: "), c0490y.f3164b, "FragmentManager");
                    }
                    fragment2 = c0490y.f3164b;
                    fragment2.f681b = -1;
                    fragment2.f665E = false;
                    fragment2.mo286S();
                    fragment2.f674N = null;
                    if (fragment2.f665E) {
                        throw new C0480o0(a.m2200n("Fragment ", fragment2, " did not call through to super.onDetach()"));
                    }
                    abstractC0483r = fragment2.f700u;
                    if (!abstractC0483r.f3116v) {
                        abstractC0483r.m1850n();
                        fragment2.f700u = new C0485t();
                    }
                    c0490y.f3163a.m1790e(c0490y.f3164b, false);
                    fragment3 = c0490y.f3164b;
                    fragment3.f681b = -1;
                    fragment3.f699t = null;
                    fragment3.f701v = null;
                    fragment3.f698s = null;
                    if ((fragment3.f692m || fragment3.m268D()) ? false : true) {
                        if (m1800M(3)) {
                            a.m2192f(a.m2191e("initState called for fragment: "), c0490y.f3164b, "FragmentManager");
                        }
                        Fragment fragment46 = c0490y.f3164b;
                        fragment46.m262A();
                        fragment46.f685f = UUID.randomUUID().toString();
                        fragment46.f691l = false;
                        fragment46.f692m = false;
                        fragment46.f693n = false;
                        fragment46.f694o = false;
                        fragment46.f695p = false;
                        fragment46.f697r = 0;
                        fragment46.f698s = null;
                        fragment46.f700u = new C0485t();
                        fragment46.f699t = null;
                        fragment46.f702w = 0;
                        fragment46.f703x = 0;
                        fragment46.f704y = null;
                        fragment46.f705z = false;
                        fragment46.f661A = false;
                    } else {
                        if (m1800M(3)) {
                            a.m2192f(a.m2191e("initState called for fragment: "), c0490y.f3164b, "FragmentManager");
                        }
                        Fragment fragment47 = c0490y.f3164b;
                        fragment47.m262A();
                        fragment47.f685f = UUID.randomUUID().toString();
                        fragment47.f691l = false;
                        fragment47.f692m = false;
                        fragment47.f693n = false;
                        fragment47.f694o = false;
                        fragment47.f695p = false;
                        fragment47.f697r = 0;
                        fragment47.f698s = null;
                        fragment47.f700u = new C0485t();
                        fragment47.f699t = null;
                        fragment47.f702w = 0;
                        fragment47.f703x = 0;
                        fragment47.f704y = null;
                        fragment47.f705z = false;
                        fragment47.f661A = false;
                    }
                }
            } else if (iMin2 < 0) {
                C0487v c0487v4 = this.f3093B;
                if (m1800M(3)) {
                    a.m2192f(a.m2191e("movefrom ATTACHED: "), c0490y.f3164b, "FragmentManager");
                }
                fragment2 = c0490y.f3164b;
                fragment2.f681b = -1;
                fragment2.f665E = false;
                fragment2.mo286S();
                fragment2.f674N = null;
                if (fragment2.f665E) {
                    throw new C0480o0(a.m2200n("Fragment ", fragment2, " did not call through to super.onDetach()"));
                }
                abstractC0483r = fragment2.f700u;
                if (!abstractC0483r.f3116v) {
                    abstractC0483r.m1850n();
                    fragment2.f700u = new C0485t();
                }
                c0490y.f3163a.m1790e(c0490y.f3164b, false);
                fragment3 = c0490y.f3164b;
                fragment3.f681b = -1;
                fragment3.f699t = null;
                fragment3.f701v = null;
                fragment3.f698s = null;
                if (((fragment3.f692m || fragment3.m268D()) ? false : true) || c0487v4.m1867b(c0490y.f3164b)) {
                    if (m1800M(3)) {
                        a.m2192f(a.m2191e("initState called for fragment: "), c0490y.f3164b, "FragmentManager");
                    }
                    Fragment fragment48 = c0490y.f3164b;
                    fragment48.m262A();
                    fragment48.f685f = UUID.randomUUID().toString();
                    fragment48.f691l = false;
                    fragment48.f692m = false;
                    fragment48.f693n = false;
                    fragment48.f694o = false;
                    fragment48.f695p = false;
                    fragment48.f697r = 0;
                    fragment48.f698s = null;
                    fragment48.f700u = new C0485t();
                    fragment48.f699t = null;
                    fragment48.f702w = 0;
                    fragment48.f703x = 0;
                    fragment48.f704y = null;
                    fragment48.f705z = false;
                    fragment48.f661A = false;
                }
            }
        }
        if (fragment.f681b != iMin2) {
            if (m1800M(3)) {
                Log.d("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + iMin2 + " found " + fragment.f681b);
            }
            fragment.f681b = iMin2;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m1820U() {
        if (this.f3108n == null) {
            return;
        }
        this.f3114t = false;
        this.f3115u = false;
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                fragment.f700u.m1820U();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m1821V(Fragment fragment) {
        if (fragment.f668H) {
            if (this.f3096b) {
                this.f3117w = true;
            } else {
                fragment.f668H = false;
                m1819T(fragment, this.f3107m);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public boolean m1822W() {
        m1802B(false);
        m1801A(true);
        Fragment fragment = this.f3111q;
        if (fragment != null && fragment.m307j().m1822W()) {
            return true;
        }
        boolean zM1823X = m1823X(this.f3118x, this.f3119y, null, -1, 0);
        if (zM1823X) {
            this.f3096b = true;
            try {
                m1825Z(this.f3118x, this.f3119y);
                m1836f();
            } catch (Throwable th) {
                m1836f();
                throw th;
            }
        }
        m1847k0();
        m1859w();
        this.f3097c.m1876b();
        return zM1823X;
    }

    /* JADX INFO: renamed from: X */
    public boolean m1823X(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        Boolean bool = Boolean.TRUE;
        ArrayList<C0451a> arrayList3 = this.f3098d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3098d.remove(size));
            arrayList2.add(bool);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0451a c0451a = this.f3098d.get(size2);
                    if ((str != null && str.equals(c0451a.f2940i)) || (i >= 0 && i == c0451a.f2931s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0451a c0451a2 = this.f3098d.get(size2);
                        if (str == null || !str.equals(c0451a2.f2940i)) {
                            if (i < 0 || i != c0451a2.f2931s) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f3098d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3098d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f3098d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public void m1824Y(Fragment fragment) {
        if (m1800M(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f697r);
        }
        boolean z = !fragment.m268D();
        if (!fragment.f661A || z) {
            this.f3097c.m1882h(fragment);
            if (m1813N(fragment)) {
                this.f3113s = true;
            }
            fragment.f692m = true;
            m1841h0(fragment);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m1825Z(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m1805E(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f2947p) {
                if (i2 != i) {
                    m1804D(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2947p) {
                        i2++;
                    }
                }
                m1804D(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m1804D(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1826a(C0315c<Fragment> c0315c) {
        int i = this.f3107m;
        if (i < 1) {
            return;
        }
        int iMin = Math.min(i, 3);
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment.f681b < iMin) {
                m1819T(fragment, iMin);
                if (fragment.f667G != null && !fragment.f705z && fragment.f671K) {
                    c0315c.add(fragment);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m1827a0(Fragment fragment) {
        if (m1815P()) {
            if (m1800M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f3093B.f3140b.remove(fragment.f685f) != null) && m1800M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1828b(Fragment fragment) {
        if (m1800M(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m1816Q(fragment);
        if (fragment.f661A) {
            return;
        }
        this.f3097c.m1875a(fragment);
        fragment.f692m = false;
        if (fragment.f667G == null) {
            fragment.f672L = false;
        }
        if (m1813N(fragment)) {
            this.f3113s = true;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m1829b0(Parcelable parcelable) {
        C0490y c0490y;
        if (parcelable == null) {
            return;
        }
        C0486u c0486u = (C0486u) parcelable;
        if (c0486u.f3134b == null) {
            return;
        }
        this.f3097c.f3167b.clear();
        for (C0489x c0489x : c0486u.f3134b) {
            if (c0489x != null) {
                Fragment fragment = this.f3093B.f3140b.get(c0489x.f3151c);
                if (fragment != null) {
                    if (m1800M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    c0490y = new C0490y(this.f3106l, fragment, c0489x);
                } else {
                    c0490y = new C0490y(this.f3106l, this.f3108n.f3086c.getClassLoader(), m1811K(), c0489x);
                }
                Fragment fragment2 = c0490y.f3164b;
                fragment2.f698s = this;
                if (m1800M(2)) {
                    StringBuilder sbM2191e = a.m2191e("restoreSaveState: active (");
                    sbM2191e.append(fragment2.f685f);
                    sbM2191e.append("): ");
                    sbM2191e.append(fragment2);
                    Log.v("FragmentManager", sbM2191e.toString());
                }
                c0490y.m1873a(this.f3108n.f3086c.getClassLoader());
                this.f3097c.f3167b.put(c0490y.f3164b.f685f, c0490y);
                c0490y.f3165c = this.f3107m;
            }
        }
        for (Fragment fragment3 : this.f3093B.f3140b.values()) {
            if (!this.f3097c.m1877c(fragment3.f685f)) {
                if (m1800M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + c0486u.f3134b);
                }
                m1819T(fragment3, 1);
                fragment3.f692m = true;
                m1819T(fragment3, -1);
            }
        }
        C0491z c0491z = this.f3097c;
        ArrayList<String> arrayList = c0486u.f3135c;
        c0491z.f3166a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment fragmentM1879e = c0491z.m1879e(str);
                if (fragmentM1879e == null) {
                    throw new IllegalStateException(a.m2202p("No instantiated fragment for (", str, ")"));
                }
                if (m1800M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentM1879e);
                }
                c0491z.m1875a(fragmentM1879e);
            }
        }
        if (c0486u.f3136d != null) {
            this.f3098d = new ArrayList<>(c0486u.f3136d.length);
            int i = 0;
            while (true) {
                C0453b[] c0453bArr = c0486u.f3136d;
                if (i >= c0453bArr.length) {
                    break;
                }
                C0453b c0453b = c0453bArr[i];
                Objects.requireNonNull(c0453b);
                C0451a c0451a = new C0451a(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = c0453b.f2956b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    AbstractC0452a0.a aVar = new AbstractC0452a0.a();
                    int i4 = i2 + 1;
                    aVar.f2948a = iArr[i2];
                    if (m1800M(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0451a + " op #" + i3 + " base fragment #" + c0453b.f2956b[i4]);
                    }
                    String str2 = c0453b.f2957c.get(i3);
                    aVar.f2949b = str2 != null ? this.f3097c.m1879e(str2) : null;
                    aVar.f2954g = AbstractC0499d.b.values()[c0453b.f2958d[i3]];
                    aVar.f2955h = AbstractC0499d.b.values()[c0453b.f2959e[i3]];
                    int[] iArr2 = c0453b.f2956b;
                    int i5 = i4 + 1;
                    int i6 = iArr2[i4];
                    aVar.f2950c = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr2[i5];
                    aVar.f2951d = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr2[i7];
                    aVar.f2952e = i10;
                    int i11 = iArr2[i9];
                    aVar.f2953f = i11;
                    c0451a.f2933b = i6;
                    c0451a.f2934c = i8;
                    c0451a.f2935d = i10;
                    c0451a.f2936e = i11;
                    c0451a.m1724b(aVar);
                    i3++;
                    i2 = i9 + 1;
                }
                c0451a.f2937f = c0453b.f2960f;
                c0451a.f2940i = c0453b.f2961g;
                c0451a.f2931s = c0453b.f2962h;
                c0451a.f2938g = true;
                c0451a.f2941j = c0453b.f2963i;
                c0451a.f2942k = c0453b.f2964j;
                c0451a.f2943l = c0453b.f2965k;
                c0451a.f2944m = c0453b.f2966l;
                c0451a.f2945n = c0453b.f2967m;
                c0451a.f2946o = c0453b.f2968n;
                c0451a.f2947p = c0453b.f2969o;
                c0451a.m1717h(1);
                if (m1800M(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + c0451a.f2931s + "): " + c0451a);
                    PrintWriter printWriter = new PrintWriter(new C0401a("FragmentManager"));
                    c0451a.m1719j("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3098d.add(c0451a);
                i++;
            }
        } else {
            this.f3098d = null;
        }
        this.f3103i.set(c0486u.f3137e);
        String str3 = c0486u.f3138f;
        if (str3 != null) {
            Fragment fragmentM1879e2 = this.f3097c.m1879e(str3);
            this.f3111q = fragmentM1879e2;
            m1855s(fragmentM1879e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m1830c(AbstractC0479o<?> abstractC0479o, AbstractC0471k abstractC0471k, Fragment fragment) {
        InterfaceC0502g interfaceC0502g;
        if (this.f3108n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3108n = abstractC0479o;
        this.f3109o = abstractC0471k;
        this.f3110p = fragment;
        if (fragment != null) {
            m1847k0();
        }
        if (abstractC0479o instanceof InterfaceC0182c) {
            InterfaceC0182c interfaceC0182c = (InterfaceC0182c) abstractC0479o;
            OnBackPressedDispatcher onBackPressedDispatcherMo5c = interfaceC0182c.mo5c();
            this.f3101g = onBackPressedDispatcherMo5c;
            if (fragment != null) {
                interfaceC0502g = interfaceC0182c;
                interfaceC0502g = fragment;
            }
            interfaceC0502g = interfaceC0182c;
            AbstractC0181b abstractC0181b = this.f3102h;
            Objects.requireNonNull(onBackPressedDispatcherMo5c);
            AbstractC0499d abstractC0499dMo4a = interfaceC0502g.mo4a();
            if (((C0503h) abstractC0499dMo4a).f3187b != AbstractC0499d.b.DESTROYED) {
                abstractC0181b.f1189b.add(onBackPressedDispatcherMo5c.new LifecycleOnBackPressedCancellable(abstractC0499dMo4a, abstractC0181b));
            }
        }
        if (fragment != null) {
            C0487v c0487v = fragment.f698s.f3093B;
            C0487v c0487v2 = c0487v.f3141c.get(fragment.f685f);
            if (c0487v2 == null) {
                c0487v2 = new C0487v(c0487v.f3143e);
                c0487v.f3141c.put(fragment.f685f, c0487v2);
            }
            this.f3093B = c0487v2;
            return;
        }
        if (!(abstractC0479o instanceof InterfaceC0516u)) {
            this.f3093B = new C0487v(false);
            return;
        }
        C0515t c0515tMo7g = ((InterfaceC0516u) abstractC0479o).mo7g();
        Object obj = C0487v.f3139g;
        String canonicalName = C0487v.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strM2201o = a.m2201o("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        AbstractC0511p abstractC0511pM1912a = c0515tMo7g.f3198a.get(strM2201o);
        if (!C0487v.class.isInstance(abstractC0511pM1912a)) {
            abstractC0511pM1912a = obj instanceof AbstractC0513r ? ((AbstractC0513r) obj).m1912a(strM2201o, C0487v.class) : ((C0487v.a) obj).m1868a(C0487v.class);
            AbstractC0511p abstractC0511pPut = c0515tMo7g.f3198a.put(strM2201o, abstractC0511pM1912a);
            if (abstractC0511pPut != null) {
                abstractC0511pPut.mo1866a();
            }
        } else if (obj instanceof C0514s) {
        }
        this.f3093B = (C0487v) abstractC0511pM1912a;
    }

    /* JADX INFO: renamed from: c0 */
    public Parcelable m1831c0() {
        C0453b[] c0453bArr;
        ArrayList<String> arrayList;
        int size;
        if (this.f3092A != null) {
            while (!this.f3092A.isEmpty()) {
                this.f3092A.remove(0).m1865a();
            }
        }
        m1861y();
        m1802B(true);
        this.f3114t = true;
        C0491z c0491z = this.f3097c;
        Objects.requireNonNull(c0491z);
        ArrayList<C0489x> arrayList2 = new ArrayList<>(c0491z.f3167b.size());
        Iterator<C0490y> it = c0491z.f3167b.values().iterator();
        while (true) {
            c0453bArr = null;
            c0453bArr = null;
            if (!it.hasNext()) {
                break;
            }
            C0490y next = it.next();
            if (next != null) {
                Fragment fragment = next.f3164b;
                C0489x c0489x = new C0489x(fragment);
                Fragment fragment2 = next.f3164b;
                if (fragment2.f681b <= -1 || c0489x.f3162n != null) {
                    c0489x.f3162n = fragment2.f682c;
                } else {
                    Bundle bundle = new Bundle();
                    Fragment fragment3 = next.f3164b;
                    fragment3.mo302g0(bundle);
                    fragment3.f680T.m2077b(bundle);
                    Parcelable parcelableM1831c0 = fragment3.f700u.m1831c0();
                    if (parcelableM1831c0 != null) {
                        bundle.putParcelable("android:support:fragments", parcelableM1831c0);
                    }
                    next.f3163a.m1795j(next.f3164b, bundle, false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (next.f3164b.f667G != null) {
                        next.m1874b();
                    }
                    if (next.f3164b.f683d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", next.f3164b.f683d);
                    }
                    if (!next.f3164b.f669I) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", next.f3164b.f669I);
                    }
                    c0489x.f3162n = bundle2;
                    if (next.f3164b.f688i != null) {
                        if (bundle2 == null) {
                            c0489x.f3162n = new Bundle();
                        }
                        c0489x.f3162n.putString("android:target_state", next.f3164b.f688i);
                        int i = next.f3164b.f689j;
                        if (i != 0) {
                            c0489x.f3162n.putInt("android:target_req_state", i);
                        }
                    }
                }
                arrayList2.add(c0489x);
                if (m1800M(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + c0489x.f3162n);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (m1800M(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0491z c0491z2 = this.f3097c;
        synchronized (c0491z2.f3166a) {
            if (c0491z2.f3166a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(c0491z2.f3166a.size());
                for (Fragment fragment4 : c0491z2.f3166a) {
                    arrayList.add(fragment4.f685f);
                    if (m1800M(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment4.f685f + "): " + fragment4);
                    }
                }
            }
        }
        ArrayList<C0451a> arrayList3 = this.f3098d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            c0453bArr = new C0453b[size];
            for (int i2 = 0; i2 < size; i2++) {
                c0453bArr[i2] = new C0453b(this.f3098d.get(i2));
                if (m1800M(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f3098d.get(i2));
                }
            }
        }
        C0486u c0486u = new C0486u();
        c0486u.f3134b = arrayList2;
        c0486u.f3135c = arrayList;
        c0486u.f3136d = c0453bArr;
        c0486u.f3137e = this.f3103i.get();
        Fragment fragment5 = this.f3111q;
        if (fragment5 != null) {
            c0486u.f3138f = fragment5.f685f;
        }
        return c0486u;
    }

    /* JADX INFO: renamed from: d */
    public void m1832d(Fragment fragment) {
        if (m1800M(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f661A) {
            fragment.f661A = false;
            if (fragment.f691l) {
                return;
            }
            this.f3097c.m1875a(fragment);
            if (m1800M(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m1813N(fragment)) {
                this.f3113s = true;
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m1833d0() {
        synchronized (this.f3095a) {
            ArrayList<g> arrayList = this.f3092A;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f3095a.size() == 1;
            if (z || z2) {
                this.f3108n.f3087d.removeCallbacks(this.f3094C);
                this.f3108n.f3087d.post(this.f3094C);
                m1847k0();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1834e(Fragment fragment) {
        HashSet<C0388a> hashSet = this.f3104j.get(fragment);
        if (hashSet != null) {
            for (C0388a c0388a : hashSet) {
                synchronized (c0388a) {
                    if (!c0388a.f2624a) {
                        c0388a.f2624a = true;
                        c0388a.f2626c = true;
                        C0388a.a aVar = c0388a.f2625b;
                        if (aVar != null) {
                            try {
                                ((C0461f) aVar).m1742a();
                            } catch (Throwable th) {
                                synchronized (c0388a) {
                                    c0388a.f2626c = false;
                                    c0388a.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0388a) {
                            c0388a.f2626c = false;
                            c0388a.notifyAll();
                        }
                    }
                }
            }
            hashSet.clear();
            m1840h(fragment);
            this.f3104j.remove(fragment);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m1835e0(Fragment fragment, boolean z) {
        ViewGroup viewGroupM1810J = m1810J(fragment);
        if (viewGroupM1810J == null || !(viewGroupM1810J instanceof C0473l)) {
            return;
        }
        ((C0473l) viewGroupM1810J).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: f */
    public final void m1836f() {
        this.f3096b = false;
        this.f3119y.clear();
        this.f3118x.clear();
    }

    /* JADX INFO: renamed from: f0 */
    public void m1837f0(Fragment fragment, AbstractC0499d.b bVar) {
        if (fragment.equals(m1806F(fragment.f685f)) && (fragment.f699t == null || fragment.f698s == this)) {
            fragment.f676P = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: g */
    public void m1838g(C0451a c0451a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0451a.m1721l(z3);
        } else {
            c0451a.m1720k();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0451a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0466h0.m1757o(this, arrayList, arrayList2, 0, 1, true, this.f3105k);
        }
        if (z3) {
            m1818S(this.f3107m, true);
        }
        for (Fragment fragment : (ArrayList) this.f3097c.m1880f()) {
            if (fragment != null && fragment.f667G != null && fragment.f671K && c0451a.m1722m(fragment.f703x)) {
                float f2 = fragment.f673M;
                if (f2 > 0.0f) {
                    fragment.f667G.setAlpha(f2);
                }
                if (z3) {
                    fragment.f673M = 0.0f;
                } else {
                    fragment.f673M = -1.0f;
                    fragment.f671K = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m1839g0(Fragment fragment) {
        if (fragment == null || (fragment.equals(m1806F(fragment.f685f)) && (fragment.f699t == null || fragment.f698s == this))) {
            Fragment fragment2 = this.f3111q;
            this.f3111q = fragment;
            m1855s(fragment2);
            m1855s(this.f3111q);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: h */
    public final void m1840h(Fragment fragment) {
        fragment.f700u.m1858v(1);
        if (fragment.f667G != null) {
            C0478n0 c0478n0 = fragment.f678R;
            c0478n0.f3084b.m1899d(AbstractC0499d.a.ON_DESTROY);
        }
        fragment.f681b = 1;
        fragment.f665E = false;
        fragment.mo285R();
        if (!fragment.f665E) {
            throw new C0480o0(a.m2200n("Fragment ", fragment, " did not call through to super.onDestroyView()"));
        }
        C0518b.b bVar = ((C0518b) AbstractC0517a.m1914b(fragment)).f3200b;
        int iM1285i = bVar.f3202b.m1285i();
        for (int i = 0; i < iM1285i; i++) {
            Objects.requireNonNull(bVar.f3202b.m1286j(i));
        }
        fragment.f696q = false;
        this.f3106l.m1799n(fragment, false);
        fragment.f666F = null;
        fragment.f667G = null;
        fragment.f678R = null;
        fragment.f679S.mo1907g(null);
        fragment.f694o = false;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1841h0(Fragment fragment) {
        ViewGroup viewGroupM1810J = m1810J(fragment);
        if (viewGroupM1810J != null) {
            if (viewGroupM1810J.getTag(R.id.rd) == null) {
                viewGroupM1810J.setTag(R.id.rd, fragment);
            }
            ((Fragment) viewGroupM1810J.getTag(R.id.rd)).m340z0(fragment.m321q());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1842i(Fragment fragment) {
        if (m1800M(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f661A) {
            return;
        }
        fragment.f661A = true;
        if (fragment.f691l) {
            if (m1800M(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3097c.m1882h(fragment);
            if (m1813N(fragment)) {
                this.f3113s = true;
            }
            m1841h0(fragment);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m1843i0(Fragment fragment) {
        if (m1800M(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f705z) {
            fragment.f705z = false;
            fragment.f672L = !fragment.f672L;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1844j(Configuration configuration) {
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                fragment.f700u.m1844j(configuration);
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1845j0() {
        for (Fragment fragment : (ArrayList) this.f3097c.m1880f()) {
            if (fragment != null) {
                m1821V(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m1846k(MenuItem menuItem) {
        if (this.f3107m < 1) {
            return false;
        }
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                if (!fragment.f705z && (fragment.m278K() || fragment.f700u.m1846k(menuItem))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m1847k0() {
        synchronized (this.f3095a) {
            if (!this.f3095a.isEmpty()) {
                this.f3102h.f1188a = true;
                return;
            }
            AbstractC0181b abstractC0181b = this.f3102h;
            ArrayList<C0451a> arrayList = this.f3098d;
            abstractC0181b.f1188a = (arrayList != null ? arrayList.size() : 0) > 0 && m1814O(this.f3110p);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1848l() {
        this.f3114t = false;
        this.f3115u = false;
        m1858v(1);
    }

    /* JADX INFO: renamed from: m */
    public boolean m1849m(Menu menu, MenuInflater menuInflater) {
        boolean zM1849m;
        boolean z;
        if (this.f3107m < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                if (fragment.f705z) {
                    zM1849m = false;
                } else {
                    if (fragment.f663C && fragment.f664D) {
                        fragment.mo282O(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zM1849m = z | fragment.f700u.m1849m(menu, menuInflater);
                }
                if (zM1849m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z2 = true;
                }
            }
        }
        if (this.f3099e != null) {
            for (int i = 0; i < this.f3099e.size(); i++) {
                Fragment fragment2 = this.f3099e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Objects.requireNonNull(fragment2);
                }
            }
        }
        this.f3099e = arrayList;
        return z2;
    }

    /* JADX INFO: renamed from: n */
    public void m1850n() {
        this.f3116v = true;
        m1802B(true);
        m1861y();
        m1858v(-1);
        this.f3108n = null;
        this.f3109o = null;
        this.f3110p = null;
        if (this.f3101g != null) {
            Iterator<InterfaceC0180a> it = this.f3102h.f1189b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f3101g = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1851o() {
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                fragment.m316n0();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1852p(boolean z) {
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                fragment.m291X();
                fragment.f700u.m1852p(z);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m1853q(MenuItem menuItem) {
        if (this.f3107m < 1) {
            return false;
        }
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                if (!fragment.f705z && ((fragment.f663C && fragment.f664D && fragment.mo292Y(menuItem)) || fragment.f700u.m1853q(menuItem))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m1854r(Menu menu) {
        if (this.f3107m < 1) {
            return;
        }
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null && !fragment.f705z) {
                if (fragment.f663C && fragment.f664D) {
                    fragment.m293Z();
                }
                fragment.f700u.m1854r(menu);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1855s(Fragment fragment) {
        if (fragment == null || !fragment.equals(m1806F(fragment.f685f))) {
            return;
        }
        boolean zM1814O = fragment.f698s.m1814O(fragment);
        Boolean bool = fragment.f690k;
        if (bool == null || bool.booleanValue() != zM1814O) {
            fragment.f690k = Boolean.valueOf(zM1814O);
            fragment.m297d0();
            AbstractC0483r abstractC0483r = fragment.f700u;
            abstractC0483r.m1847k0();
            abstractC0483r.m1855s(abstractC0483r.f3111q);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1856t(boolean z) {
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null) {
                fragment.m295b0();
                fragment.f700u.m1856t(z);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3110p;
        if (fragment == null) {
            AbstractC0479o<?> abstractC0479o = this.f3108n;
            if (abstractC0479o != null) {
                sb.append(abstractC0479o.getClass().getSimpleName());
                sb.append("{");
                obj = this.f3108n;
            } else {
                sb.append("null");
            }
            sb.append("}}");
            return sb.toString();
        }
        sb.append(fragment.getClass().getSimpleName());
        sb.append("{");
        obj = this.f3110p;
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean m1857u(Menu menu) {
        boolean z = false;
        if (this.f3107m < 1) {
            return false;
        }
        for (Fragment fragment : this.f3097c.m1881g()) {
            if (fragment != null && fragment.m318o0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: v */
    public final void m1858v(int i) {
        try {
            this.f3096b = true;
            this.f3097c.m1878d(i);
            m1818S(i, false);
            this.f3096b = false;
            m1802B(true);
        } catch (Throwable th) {
            this.f3096b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1859w() {
        if (this.f3117w) {
            this.f3117w = false;
            m1845j0();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m1860x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM2201o = a.m2201o(str, "    ");
        C0491z c0491z = this.f3097c;
        Objects.requireNonNull(c0491z);
        String str2 = str + "    ";
        if (!c0491z.f3167b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0490y c0490y : c0491z.f3167b.values()) {
                printWriter.print(str);
                if (c0490y != null) {
                    Fragment fragment = c0490y.f3164b;
                    printWriter.println(fragment);
                    fragment.m298e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = c0491z.f3166a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = c0491z.f3166a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f3099e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = this.f3099e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<C0451a> arrayList2 = this.f3098d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0451a c0451a = this.f3098d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0451a.toString());
                c0451a.m1719j(strM2201o, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3103i.get());
        synchronized (this.f3095a) {
            int size4 = this.f3095a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (e) this.f3095a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3108n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3109o);
        if (this.f3110p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3110p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3107m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3114t);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3115u);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3116v);
        if (this.f3113s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3113s);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1861y() {
        if (this.f3104j.isEmpty()) {
            return;
        }
        for (Fragment fragment : this.f3104j.keySet()) {
            m1834e(fragment);
            m1819T(fragment, fragment.m335x());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m1862z(e eVar, boolean z) {
        if (!z) {
            if (this.f3108n == null) {
                if (!this.f3116v) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m1815P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3095a) {
            if (this.f3108n == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f3095a.add(eVar);
                m1833d0();
            }
        }
    }
}
