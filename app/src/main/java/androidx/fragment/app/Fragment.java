package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.UUID;
import p006b.p032h.p033b.C0360f;
import p006b.p056m.p057b.AbstractC0479o;
import p006b.p056m.p057b.AbstractC0483r;
import p006b.p056m.p057b.ActivityC0459e;
import p006b.p056m.p057b.C0478n0;
import p006b.p056m.p057b.C0485t;
import p006b.p056m.p057b.C0487v;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.C0507l;
import p006b.p061o.C0515t;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;
import p006b.p061o.InterfaceC0516u;
import p006b.p062p.p063a.AbstractC0517a;
import p006b.p070u.C0564a;
import p006b.p070u.C0565b;
import p006b.p070u.InterfaceC0566c;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0502g, InterfaceC0516u, InterfaceC0566c {

    /* JADX INFO: renamed from: U */
    public static final Object f660U = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f661A;

    /* JADX INFO: renamed from: B */
    public boolean f662B;

    /* JADX INFO: renamed from: C */
    public boolean f663C;

    /* JADX INFO: renamed from: E */
    public boolean f665E;

    /* JADX INFO: renamed from: F */
    public ViewGroup f666F;

    /* JADX INFO: renamed from: G */
    public View f667G;

    /* JADX INFO: renamed from: H */
    public boolean f668H;

    /* JADX INFO: renamed from: J */
    public C0088a f670J;

    /* JADX INFO: renamed from: K */
    public boolean f671K;

    /* JADX INFO: renamed from: L */
    public boolean f672L;

    /* JADX INFO: renamed from: M */
    public float f673M;

    /* JADX INFO: renamed from: N */
    public LayoutInflater f674N;

    /* JADX INFO: renamed from: O */
    public boolean f675O;

    /* JADX INFO: renamed from: Q */
    public C0503h f677Q;

    /* JADX INFO: renamed from: R */
    public C0478n0 f678R;

    /* JADX INFO: renamed from: T */
    public C0565b f680T;

    /* JADX INFO: renamed from: c */
    public Bundle f682c;

    /* JADX INFO: renamed from: d */
    public SparseArray<Parcelable> f683d;

    /* JADX INFO: renamed from: e */
    public Boolean f684e;

    /* JADX INFO: renamed from: g */
    public Bundle f686g;

    /* JADX INFO: renamed from: h */
    public Fragment f687h;

    /* JADX INFO: renamed from: j */
    public int f689j;

    /* JADX INFO: renamed from: l */
    public boolean f691l;

    /* JADX INFO: renamed from: m */
    public boolean f692m;

    /* JADX INFO: renamed from: n */
    public boolean f693n;

    /* JADX INFO: renamed from: o */
    public boolean f694o;

    /* JADX INFO: renamed from: p */
    public boolean f695p;

    /* JADX INFO: renamed from: q */
    public boolean f696q;

    /* JADX INFO: renamed from: r */
    public int f697r;

    /* JADX INFO: renamed from: s */
    public AbstractC0483r f698s;

    /* JADX INFO: renamed from: t */
    public AbstractC0479o<?> f699t;

    /* JADX INFO: renamed from: v */
    public Fragment f701v;

    /* JADX INFO: renamed from: w */
    public int f702w;

    /* JADX INFO: renamed from: x */
    public int f703x;

    /* JADX INFO: renamed from: y */
    public String f704y;

    /* JADX INFO: renamed from: z */
    public boolean f705z;

    /* JADX INFO: renamed from: b */
    public int f681b = -1;

    /* JADX INFO: renamed from: f */
    public String f685f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i */
    public String f688i = null;

    /* JADX INFO: renamed from: k */
    public Boolean f690k = null;

    /* JADX INFO: renamed from: u */
    public AbstractC0483r f700u = new C0485t();

    /* JADX INFO: renamed from: D */
    public boolean f664D = true;

    /* JADX INFO: renamed from: I */
    public boolean f669I = true;

    /* JADX INFO: renamed from: P */
    public AbstractC0499d.b f676P = AbstractC0499d.b.RESUMED;

    /* JADX INFO: renamed from: S */
    public C0507l<InterfaceC0502g> f679S = new C0507l<>();

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$a */
    public static class C0088a {

        /* JADX INFO: renamed from: a */
        public View f707a;

        /* JADX INFO: renamed from: b */
        public Animator f708b;

        /* JADX INFO: renamed from: c */
        public int f709c;

        /* JADX INFO: renamed from: d */
        public int f710d;

        /* JADX INFO: renamed from: e */
        public int f711e;

        /* JADX INFO: renamed from: f */
        public Object f712f;

        /* JADX INFO: renamed from: g */
        public Object f713g;

        /* JADX INFO: renamed from: h */
        public Object f714h;

        /* JADX INFO: renamed from: i */
        public InterfaceC0090c f715i;

        /* JADX INFO: renamed from: j */
        public boolean f716j;

        public C0088a() {
            Object obj = Fragment.f660U;
            this.f712f = obj;
            this.f713g = obj;
            this.f714h = obj;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$b */
    public static class C0089b extends RuntimeException {
        public C0089b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$c */
    public interface InterfaceC0090c {
    }

    public Fragment() {
        m262A();
    }

    /* JADX INFO: renamed from: A */
    public final void m262A() {
        this.f677Q = new C0503h(this);
        this.f680T = new C0565b(this);
        this.f677Q.mo1894a(new InterfaceC0500e() { // from class: androidx.fragment.app.Fragment.2
            @Override // p006b.p061o.InterfaceC0500e
            /* JADX INFO: renamed from: d */
            public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
                View view;
                if (aVar != AbstractC0499d.a.ON_STOP || (view = Fragment.this.f667G) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public void m263A0(InterfaceC0090c interfaceC0090c) {
        m300f();
        InterfaceC0090c interfaceC0090c2 = this.f670J.f715i;
        if (interfaceC0090c == interfaceC0090c2) {
            return;
        }
        if (interfaceC0090c != null && interfaceC0090c2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (interfaceC0090c != null) {
            ((AbstractC0483r.g) interfaceC0090c).f3130c++;
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m264B() {
        return this.f699t != null && this.f691l;
    }

    /* JADX INFO: renamed from: B0 */
    public void m265B0(int i) {
        m300f().f709c = i;
    }

    /* JADX INFO: renamed from: C */
    public boolean m266C() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return false;
        }
        return c0088a.f716j;
    }

    /* JADX INFO: renamed from: C0 */
    public void m267C0(Fragment fragment, int i) {
        AbstractC0483r abstractC0483r = this.f698s;
        AbstractC0483r abstractC0483r2 = fragment.f698s;
        if (abstractC0483r != null && abstractC0483r2 != null && abstractC0483r != abstractC0483r2) {
            throw new IllegalArgumentException(a.m2200n("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragmentM339z = fragment; fragmentM339z != null; fragmentM339z = fragmentM339z.m339z()) {
            if (fragmentM339z == this) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.f698s == null || fragment.f698s == null) {
            this.f688i = null;
            this.f687h = fragment;
        } else {
            this.f688i = fragment.f685f;
            this.f687h = null;
        }
        this.f689j = i;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m268D() {
        return this.f697r > 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: D0 */
    public void m269D0(boolean z) {
        if (!this.f669I && z && this.f681b < 3 && this.f698s != null && m264B() && this.f675O) {
            this.f698s.m1821V(this);
        }
        this.f669I = z;
        this.f668H = this.f681b < 3 && !z;
        if (this.f682c != null) {
            this.f684e = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m270E() {
        Fragment fragment = this.f701v;
        return fragment != null && (fragment.f692m || fragment.m270E());
    }

    /* JADX INFO: renamed from: E0 */
    public void m271E0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        AbstractC0479o<?> abstractC0479o = this.f699t;
        if (abstractC0479o == null) {
            throw new IllegalStateException(a.m2200n("Fragment ", this, " not attached to Activity"));
        }
        abstractC0479o.mo1740k(this, intent, -1, null);
    }

    /* JADX INFO: renamed from: F */
    public void mo272F(Bundle bundle) {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: F0 */
    public void m273F0(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        AbstractC0479o<?> abstractC0479o = this.f699t;
        if (abstractC0479o == null) {
            throw new IllegalStateException(a.m2200n("Fragment ", this, " not attached to Activity"));
        }
        abstractC0479o.mo1740k(this, intent, i, null);
    }

    /* JADX INFO: renamed from: G */
    public void m274G() {
    }

    @Deprecated
    /* JADX INFO: renamed from: H */
    public void m275H() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: I */
    public void mo276I(Context context) {
        this.f665E = true;
        AbstractC0479o<?> abstractC0479o = this.f699t;
        if ((abstractC0479o == null ? null : abstractC0479o.f3085b) != null) {
            this.f665E = false;
            m275H();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m277J() {
    }

    /* JADX INFO: renamed from: K */
    public boolean m278K() {
        return false;
    }

    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        Parcelable parcelable;
        this.f665E = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f700u.m1829b0(parcelable);
            this.f700u.m1848l();
        }
        AbstractC0483r abstractC0483r = this.f700u;
        if (abstractC0483r.f3107m >= 1) {
            return;
        }
        abstractC0483r.m1848l();
    }

    /* JADX INFO: renamed from: M */
    public Animation m280M() {
        return null;
    }

    /* JADX INFO: renamed from: N */
    public Animator m281N() {
        return null;
    }

    /* JADX INFO: renamed from: O */
    public void mo282O(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public void mo284Q() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: R */
    public void mo285R() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: S */
    public void mo286S() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: T */
    public LayoutInflater mo287T(Bundle bundle) {
        return m319p();
    }

    /* JADX INFO: renamed from: U */
    public void m288U() {
    }

    @Deprecated
    /* JADX INFO: renamed from: V */
    public void m289V() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: W */
    public void m290W(AttributeSet attributeSet, Bundle bundle) {
        this.f665E = true;
        AbstractC0479o<?> abstractC0479o = this.f699t;
        if ((abstractC0479o == null ? null : abstractC0479o.f3085b) != null) {
            this.f665E = false;
            m289V();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m291X() {
    }

    /* JADX INFO: renamed from: Y */
    public boolean mo292Y(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public void m293Z() {
    }

    @Override // p006b.p061o.InterfaceC0502g
    /* JADX INFO: renamed from: a */
    public AbstractC0499d mo4a() {
        return this.f677Q;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo294a0() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m295b0() {
    }

    /* JADX INFO: renamed from: c0 */
    public void mo296c0(Menu menu) {
    }

    @Override // p006b.p070u.InterfaceC0566c
    /* JADX INFO: renamed from: d */
    public final C0564a mo6d() {
        return this.f680T.f3476b;
    }

    /* JADX INFO: renamed from: d0 */
    public void m297d0() {
    }

    /* JADX INFO: renamed from: e */
    public void m298e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f702w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f703x));
        printWriter.print(" mTag=");
        printWriter.println(this.f704y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f681b);
        printWriter.print(" mWho=");
        printWriter.print(this.f685f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f697r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f691l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f692m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f693n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f694o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f705z);
        printWriter.print(" mDetached=");
        printWriter.print(this.f661A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f664D);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f663C);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f662B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f669I);
        if (this.f698s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f698s);
        }
        if (this.f699t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f699t);
        }
        if (this.f701v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f701v);
        }
        if (this.f686g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f686g);
        }
        if (this.f682c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f682c);
        }
        if (this.f683d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f683d);
        }
        Fragment fragmentM339z = m339z();
        if (fragmentM339z != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentM339z);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f689j);
        }
        if (m321q() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m321q());
        }
        if (this.f666F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f666F);
        }
        if (this.f667G != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f667G);
        }
        if (m305i() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m305i());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m335x());
        }
        if (m309k() != null) {
            AbstractC0517a.m1914b(this).mo1915a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f700u + ":");
        this.f700u.m1860x(a.m2201o(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: e0 */
    public void m299e0() {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final C0088a m300f() {
        if (this.f670J == null) {
            this.f670J = new C0088a();
        }
        return this.f670J;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo301f0() {
        this.f665E = true;
    }

    @Override // p006b.p061o.InterfaceC0516u
    /* JADX INFO: renamed from: g */
    public C0515t mo7g() {
        AbstractC0483r abstractC0483r = this.f698s;
        if (abstractC0483r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        C0487v c0487v = abstractC0483r.f3093B;
        C0515t c0515t = c0487v.f3142d.get(this.f685f);
        if (c0515t != null) {
            return c0515t;
        }
        C0515t c0515t2 = new C0515t();
        c0487v.f3142d.put(this.f685f, c0515t2);
        return c0515t2;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public final ActivityC0459e m303h() {
        AbstractC0479o<?> abstractC0479o = this.f699t;
        if (abstractC0479o == null) {
            return null;
        }
        return (ActivityC0459e) abstractC0479o.f3085b;
    }

    /* JADX INFO: renamed from: h0 */
    public void mo304h0() {
        this.f665E = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public View m305i() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return null;
        }
        return c0088a.f707a;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo306i0() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0483r m307j() {
        if (this.f699t != null) {
            return this.f700u;
        }
        throw new IllegalStateException(a.m2200n("Fragment ", this, " has not been attached yet."));
    }

    /* JADX INFO: renamed from: j0 */
    public void mo308j0(View view, Bundle bundle) {
    }

    /* JADX INFO: renamed from: k */
    public Context m309k() {
        AbstractC0479o<?> abstractC0479o = this.f699t;
        if (abstractC0479o == null) {
            return null;
        }
        return abstractC0479o.f3086c;
    }

    /* JADX INFO: renamed from: k0 */
    public void m310k0() {
        this.f665E = true;
    }

    /* JADX INFO: renamed from: l */
    public Object m311l() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return null;
        }
        Objects.requireNonNull(c0088a);
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public void m312l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f700u.m1820U();
        this.f696q = true;
        this.f678R = new C0478n0();
        View viewMo283P = mo283P(layoutInflater, viewGroup, bundle);
        this.f667G = viewMo283P;
        if (viewMo283P == null) {
            if (this.f678R.f3084b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f678R = null;
        } else {
            C0478n0 c0478n0 = this.f678R;
            if (c0478n0.f3084b == null) {
                c0478n0.f3084b = new C0503h(c0478n0);
            }
            this.f679S.mo1907g(this.f678R);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m313m() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return;
        }
        Objects.requireNonNull(c0088a);
    }

    /* JADX INFO: renamed from: m0 */
    public LayoutInflater m314m0(Bundle bundle) {
        LayoutInflater layoutInflaterMo287T = mo287T(bundle);
        this.f674N = layoutInflaterMo287T;
        return layoutInflaterMo287T;
    }

    /* JADX INFO: renamed from: n */
    public Object m315n() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return null;
        }
        Objects.requireNonNull(c0088a);
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public void m316n0() {
        onLowMemory();
        this.f700u.m1851o();
    }

    /* JADX INFO: renamed from: o */
    public void m317o() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return;
        }
        Objects.requireNonNull(c0088a);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m318o0(Menu menu) {
        boolean z = false;
        if (this.f705z) {
            return false;
        }
        if (this.f663C && this.f664D) {
            z = true;
            mo296c0(menu);
        }
        return z | this.f700u.m1857u(menu);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f665E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m320p0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f665E = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public LayoutInflater m319p() {
        AbstractC0479o<?> abstractC0479o = this.f699t;
        if (abstractC0479o == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo1738i = abstractC0479o.mo1738i();
        C0360f.m1422N(layoutInflaterMo1738i, this.f700u.f3100f);
        return layoutInflaterMo1738i;
    }

    /* JADX INFO: renamed from: p0 */
    public final ActivityC0459e m320p0() {
        ActivityC0459e activityC0459eM303h = m303h();
        if (activityC0459eM303h != null) {
            return activityC0459eM303h;
        }
        throw new IllegalStateException(a.m2200n("Fragment ", this, " not attached to an activity."));
    }

    /* JADX INFO: renamed from: q */
    public int m321q() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return 0;
        }
        return c0088a.f710d;
    }

    /* JADX INFO: renamed from: q0 */
    public final Context m322q0() {
        Context contextM309k = m309k();
        if (contextM309k != null) {
            return contextM309k;
        }
        throw new IllegalStateException(a.m2200n("Fragment ", this, " not attached to a context."));
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC0483r m323r() {
        AbstractC0483r abstractC0483r = this.f698s;
        if (abstractC0483r != null) {
            return abstractC0483r;
        }
        throw new IllegalStateException(a.m2200n("Fragment ", this, " not associated with a fragment manager."));
    }

    /* JADX INFO: renamed from: r0 */
    public final View m324r0() {
        View view = this.f667G;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.m2200n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* JADX INFO: renamed from: s */
    public Object m325s() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return null;
        }
        Object obj = c0088a.f713g;
        if (obj != f660U) {
            return obj;
        }
        m315n();
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public void m326s0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f700u.m1829b0(parcelable);
        this.f700u.m1848l();
    }

    /* JADX INFO: renamed from: t */
    public final Resources m327t() {
        return m322q0().getResources();
    }

    /* JADX INFO: renamed from: t0 */
    public void m328t0(View view) {
        m300f().f707a = view;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f685f);
        sb.append(")");
        if (this.f702w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f702w));
        }
        if (this.f704y != null) {
            sb.append(" ");
            sb.append(this.f704y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public Object m329u() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return null;
        }
        Object obj = c0088a.f712f;
        if (obj != f660U) {
            return obj;
        }
        m311l();
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public void m330u0(Animator animator) {
        m300f().f708b = animator;
    }

    /* JADX INFO: renamed from: v */
    public Object m331v() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return null;
        }
        Objects.requireNonNull(c0088a);
        return null;
    }

    /* JADX INFO: renamed from: v0 */
    public void m332v0(Bundle bundle) {
        AbstractC0483r abstractC0483r = this.f698s;
        if (abstractC0483r != null) {
            if (abstractC0483r == null ? false : abstractC0483r.m1815P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f686g = bundle;
    }

    /* JADX INFO: renamed from: w */
    public Object m333w() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return null;
        }
        Object obj = c0088a.f714h;
        if (obj != f660U) {
            return obj;
        }
        m331v();
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public void m334w0(boolean z) {
        if (this.f663C != z) {
            this.f663C = z;
            if (!m264B() || this.f705z) {
                return;
            }
            this.f699t.mo1741l();
        }
    }

    /* JADX INFO: renamed from: x */
    public int m335x() {
        C0088a c0088a = this.f670J;
        if (c0088a == null) {
            return 0;
        }
        return c0088a.f709c;
    }

    /* JADX INFO: renamed from: x0 */
    public void m336x0(boolean z) {
        m300f().f716j = z;
    }

    /* JADX INFO: renamed from: y */
    public final String m337y(int i) {
        return m327t().getString(i);
    }

    /* JADX INFO: renamed from: y0 */
    public void m338y0(boolean z) {
        if (this.f664D != z) {
            this.f664D = z;
            if (this.f663C && m264B() && !this.f705z) {
                this.f699t.mo1741l();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final Fragment m339z() {
        String str;
        Fragment fragment = this.f687h;
        if (fragment != null) {
            return fragment;
        }
        AbstractC0483r abstractC0483r = this.f698s;
        if (abstractC0483r == null || (str = this.f688i) == null) {
            return null;
        }
        return abstractC0483r.m1806F(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m340z0(int i) {
        if (this.f670J == null && i == 0) {
            return;
        }
        m300f().f710d = i;
    }
}
