package p006b.p073w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: b.w.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0575b0 extends AbstractC0584i {

    /* JADX INFO: renamed from: z */
    public static final String[] f3541z = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: y */
    public int f3542y = 3;

    /* JADX INFO: renamed from: b.w.b0$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC0584i.d {

        /* JADX INFO: renamed from: a */
        public final View f3543a;

        /* JADX INFO: renamed from: b */
        public final int f3544b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f3545c;

        /* JADX INFO: renamed from: d */
        public final boolean f3546d;

        /* JADX INFO: renamed from: e */
        public boolean f3547e;

        /* JADX INFO: renamed from: f */
        public boolean f3548f = false;

        public a(View view, int i, boolean z) {
            this.f3543a = view;
            this.f3544b = i;
            this.f3545c = (ViewGroup) view.getParent();
            this.f3546d = z;
            m2100g(true);
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: a */
        public void mo2085a(AbstractC0584i abstractC0584i) {
            m2100g(false);
        }

        @Override // p006b.p073w.AbstractC0584i.d
        /* JADX INFO: renamed from: b */
        public void mo2086b(AbstractC0584i abstractC0584i) {
            m2100g(true);
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
            m2099f();
            abstractC0584i.mo2127v(this);
        }

        /* JADX INFO: renamed from: f */
        public final void m2099f() {
            if (!this.f3548f) {
                C0595t.f3630a.mo2146f(this.f3543a, this.f3544b);
                ViewGroup viewGroup = this.f3545c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m2100g(false);
        }

        /* JADX INFO: renamed from: g */
        public final void m2100g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f3546d || this.f3547e == z || (viewGroup = this.f3545c) == null) {
                return;
            }
            this.f3547e = z;
            C0594s.m2136a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3548f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m2099f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f3548f) {
                return;
            }
            C0595t.f3630a.mo2146f(this.f3543a, this.f3544b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f3548f) {
                return;
            }
            C0595t.f3630a.mo2146f(this.f3543a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: b.w.b0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f3549a;

        /* JADX INFO: renamed from: b */
        public boolean f3550b;

        /* JADX INFO: renamed from: c */
        public int f3551c;

        /* JADX INFO: renamed from: d */
        public int f3552d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f3553e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f3554f;
    }

    /* JADX INFO: renamed from: H */
    public final void m2094H(C0592q c0592q) {
        c0592q.f3622a.put("android:visibility:visibility", Integer.valueOf(c0592q.f3623b.getVisibility()));
        c0592q.f3622a.put("android:visibility:parent", c0592q.f3623b.getParent());
        int[] iArr = new int[2];
        c0592q.f3623b.getLocationOnScreen(iArr);
        c0592q.f3622a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r0.f3553e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0.f3551c == 0) goto L40;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p006b.p073w.AbstractC0575b0.b m2095I(p006b.p073w.C0592q r8, p006b.p073w.C0592q r9) {
        /*
            r7 = this;
            b.w.b0$b r0 = new b.w.b0$b
            r0.<init>()
            r1 = 0
            r0.f3549a = r1
            r0.f3550b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3622a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3622a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f3551c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3622a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3553e = r6
            goto L37
        L33:
            r0.f3551c = r4
            r0.f3553e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f3622a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f3622a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f3552d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f3622a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3554f = r2
            goto L5e
        L5a:
            r0.f3552d = r4
            r0.f3554f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f3551c
            int r9 = r0.f3552d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f3553e
            android.view.ViewGroup r4 = r0.f3554f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f3554f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f3553e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f3552d
            if (r8 != 0) goto L8d
        L88:
            r0.f3550b = r2
        L8a:
            r0.f3549a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f3551c
            if (r8 != 0) goto L96
        L93:
            r0.f3550b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p073w.AbstractC0575b0.m2095I(b.w.q, b.w.q):b.w.b0$b");
    }

    /* JADX INFO: renamed from: J */
    public abstract Animator mo2096J(ViewGroup viewGroup, View view, C0592q c0592q, C0592q c0592q2);

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: d */
    public void mo2089d(C0592q c0592q) {
        m2094H(c0592q);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:80:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (m2095I(m2123n(r1, false), m2124q(r1, false)).f3549a != false) goto L29;
     */
    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator mo2091k(android.view.ViewGroup r22, p006b.p073w.C0592q r23, p006b.p073w.C0592q r24) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p073w.AbstractC0575b0.mo2091k(android.view.ViewGroup, b.w.q, b.w.q):android.animation.Animator");
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: p */
    public String[] mo2092p() {
        return f3541z;
    }

    @Override // p006b.p073w.AbstractC0584i
    /* JADX INFO: renamed from: r */
    public boolean mo2097r(C0592q c0592q, C0592q c0592q2) {
        if (c0592q == null && c0592q2 == null) {
            return false;
        }
        if (c0592q != null && c0592q2 != null && c0592q2.f3622a.containsKey("android:visibility:visibility") != c0592q.f3622a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b bVarM2095I = m2095I(c0592q, c0592q2);
        if (bVarM2095I.f3549a) {
            return bVarM2095I.f3551c == 0 || bVarM2095I.f3552d == 0;
        }
        return false;
    }
}
