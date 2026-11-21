package p006b.p073w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import b.s.m;

/* JADX INFO: renamed from: b.w.b */
/* JADX INFO: loaded from: classes.dex */
public class C0574b extends AbstractC0584i {

    /* JADX INFO: renamed from: y */
    public int[] f3529y = new int[2];

    /* JADX INFO: renamed from: z */
    public static final String[] f3528z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: A */
    public static final Property<Drawable, PointF> f3521A = new a(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: B */
    public static final Property<i, PointF> f3522B = new b(PointF.class, "topLeft");

    /* JADX INFO: renamed from: C */
    public static final Property<i, PointF> f3523C = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: D */
    public static final Property<View, PointF> f3524D = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: E */
    public static final Property<View, PointF> f3525E = new e(PointF.class, "topLeft");

    /* JADX INFO: renamed from: F */
    public static final Property<View, PointF> f3526F = new f(PointF.class, "position");

    /* JADX INFO: renamed from: G */
    public static C0582g f3527G = new C0582g();

    /* JADX INFO: renamed from: b.w.b$a */
    public static class a extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a */
        public Rect f3530a;

        public a(Class cls, String str) {
            super(cls, str);
            this.f3530a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3530a);
            Rect rect = this.f3530a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f3530a);
            this.f3530a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f3530a);
        }
    }

    /* JADX INFO: renamed from: b.w.b$b */
    public static class b extends Property<i, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f3534a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f3535b = iRound;
            int i = iVar2.f3539f + 1;
            iVar2.f3539f = i;
            if (i == iVar2.f3540g) {
                C0595t.m2138b(iVar2.f3538e, iVar2.f3534a, iRound, iVar2.f3536c, iVar2.f3537d);
                iVar2.f3539f = 0;
                iVar2.f3540g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: b.w.b$c */
    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f3536c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f3537d = iRound;
            int i = iVar2.f3540g + 1;
            iVar2.f3540g = i;
            if (iVar2.f3539f == i) {
                C0595t.m2138b(iVar2.f3538e, iVar2.f3534a, iVar2.f3535b, iVar2.f3536c, iRound);
                iVar2.f3539f = 0;
                iVar2.f3540g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: b.w.b$d */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C0595t.m2138b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: b.w.b$e */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C0595t.m2138b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: b.w.b$f */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            C0595t.m2138b(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: b.w.b$g */
    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i f3531a;
        private i mViewBounds;

        public g(C0574b c0574b, i iVar) {
            this.f3531a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: b.w.b$h */
    public class h extends C0587l {

        /* JADX INFO: renamed from: a */
        public boolean f3532a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f3533b;

        public h(C0574b c0574b, ViewGroup viewGroup) {
            this.f3533b = viewGroup;
        }

        @Override // p006b.p073w.C0587l, p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: a */
        public void mo2085a(AbstractC0584i abstractC0584i) {
            C0594s.m2136a(this.f3533b, false);
        }

        @Override // p006b.p073w.C0587l, p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: b */
        public void mo2086b(AbstractC0584i abstractC0584i) {
            C0594s.m2136a(this.f3533b, true);
        }

        @Override // p006b.p073w.C0587l, p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: d */
        public void mo2093d(AbstractC0584i abstractC0584i) {
            C0594s.m2136a(this.f3533b, false);
            this.f3532a = true;
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: e */
        public void mo2087e(AbstractC0584i abstractC0584i) {
            if (!this.f3532a) {
                C0594s.m2136a(this.f3533b, false);
            }
            abstractC0584i.mo2127v(this);
        }
    }

    /* JADX INFO: renamed from: b.w.b$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public int f3534a;

        /* JADX INFO: renamed from: b */
        public int f3535b;

        /* JADX INFO: renamed from: c */
        public int f3536c;

        /* JADX INFO: renamed from: d */
        public int f3537d;

        /* JADX INFO: renamed from: e */
        public View f3538e;

        /* JADX INFO: renamed from: f */
        public int f3539f;

        /* JADX INFO: renamed from: g */
        public int f3540g;

        public i(View view) {
            this.f3538e = view;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2088H(C0592q c0592q) {
        View view = c0592q.f3623b;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0592q.f3622a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0592q.f3622a.put("android:changeBounds:parent", c0592q.f3623b.getParent());
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: d */
    public void mo2089d(C0592q c0592q) {
        m2088H(c0592q);
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: g */
    public void mo2090g(C0592q c0592q) {
        m2088H(c0592q);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: k */
    public Animator mo2091k(ViewGroup viewGroup, C0592q c0592q, C0592q c0592q2) {
        int i2;
        C0574b c0574b;
        Path pathMo2103a;
        Property<View, PointF> property;
        Animator animatorM1948D;
        if (c0592q == null || c0592q2 == null) {
            return null;
        }
        Map<String, Object> map = c0592q.f3622a;
        Map<String, Object> map2 = c0592q2.f3622a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c0592q2.f3623b;
        Rect rect = (Rect) c0592q.f3622a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) c0592q2.f3622a.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) c0592q.f3622a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) c0592q2.f3622a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        int i15 = i2;
        if (i15 <= 0) {
            return null;
        }
        C0595t.m2138b(view, i3, i5, i7, i9);
        if (i15 == 2) {
            if (i11 == i13 && i12 == i14) {
                c0574b = this;
                pathMo2103a = c0574b.f3596u.mo2103a(i3, i5, i4, i6);
                property = f3526F;
            } else {
                c0574b = this;
                i iVar = new i(view);
                ObjectAnimator objectAnimatorM1948D = m.m1948D(iVar, f3522B, c0574b.f3596u.mo2103a(i3, i5, i4, i6));
                ObjectAnimator objectAnimatorM1948D2 = m.m1948D(iVar, f3523C, c0574b.f3596u.mo2103a(i7, i9, i8, i10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM1948D, objectAnimatorM1948D2);
                animatorSet.addListener(new g(c0574b, iVar));
                animatorM1948D = animatorSet;
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0594s.m2136a(viewGroup4, true);
                c0574b.mo2114a(new h(c0574b, viewGroup4));
            }
            return animatorM1948D;
        }
        c0574b = this;
        if (i3 == i4 && i5 == i6) {
            pathMo2103a = c0574b.f3596u.mo2103a(i7, i9, i8, i10);
            property = f3524D;
        } else {
            pathMo2103a = c0574b.f3596u.mo2103a(i3, i5, i4, i6);
            property = f3525E;
        }
        animatorM1948D = m.m1948D(view, property, pathMo2103a);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup5 = (ViewGroup) view.getParent();
            C0594s.m2136a(viewGroup5, true);
            c0574b.mo2114a(new h(c0574b, viewGroup5));
        }
        return animatorM1948D;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: p */
    public String[] mo2092p() {
        return f3528z;
    }
}
