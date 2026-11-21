package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.didjdk.adbhelper.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;
import p006b.p049j.p050a.AbstractC0442a;
import p080c.p126d.p127a.p128a.p135f.C1207a;
import p080c.p126d.p127a.p128a.p135f.C1208b;
import p080c.p126d.p127a.p128a.p135f.C1209c;
import p080c.p126d.p127a.p128a.p135f.C1210d;
import p080c.p126d.p127a.p128a.p135f.C1211e;
import p080c.p126d.p127a.p128a.p135f.C1212f;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0067b {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ int f10160b0 = 0;

    /* JADX INFO: renamed from: Q */
    public Animator f10161Q;

    /* JADX INFO: renamed from: R */
    public Animator f10162R;

    /* JADX INFO: renamed from: S */
    public int f10163S;

    /* JADX INFO: renamed from: T */
    public int f10164T;

    /* JADX INFO: renamed from: U */
    public boolean f10165U;

    /* JADX INFO: renamed from: V */
    public int f10166V;

    /* JADX INFO: renamed from: W */
    public boolean f10167W;

    /* JADX INFO: renamed from: a0 */
    public Behavior f10168a0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: e */
        public final Rect f10169e;

        /* JADX INFO: renamed from: f */
        public WeakReference<BottomAppBar> f10170f;

        /* JADX INFO: renamed from: g */
        public int f10171g;

        /* JADX INFO: renamed from: h */
        public final View.OnLayoutChangeListener f10172h;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC1340a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC1340a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f10170f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.f10169e;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.m3124l(rect);
                int iHeight = Behavior.this.f10169e.height();
                bottomAppBar.m3066E(iHeight);
                CoordinatorLayout.C0071f c0071f = (CoordinatorLayout.C0071f) view.getLayoutParams();
                if (Behavior.this.f10171g == 0) {
                    ((ViewGroup.MarginLayoutParams) c0071f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.dy) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                }
            }
        }

        public Behavior() {
            this.f10172h = new ViewOnLayoutChangeListenerC1340a();
            this.f10169e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10172h = new ViewOnLayoutChangeListenerC1340a();
            this.f10169e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: k */
        public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f10170f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f10160b0;
            View viewM3069z = bottomAppBar.m3069z();
            if (viewM3069z != null) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (!viewM3069z.isLaidOut()) {
                    CoordinatorLayout.C0071f c0071f = (CoordinatorLayout.C0071f) viewM3069z.getLayoutParams();
                    c0071f.f545d = 49;
                    this.f10171g = ((ViewGroup.MarginLayoutParams) c0071f).bottomMargin;
                    if (viewM3069z instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewM3069z;
                        floatingActionButton.addOnLayoutChangeListener(this.f10172h);
                        floatingActionButton.m3116d(null);
                        floatingActionButton.m3117e(new C1211e(bottomAppBar));
                        floatingActionButton.m3118f(null);
                    }
                    bottomAppBar.m3065D();
                    throw null;
                }
            }
            coordinatorLayout.m154s(bottomAppBar, i);
            this.f10142a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: x */
        public boolean mo187x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll()) {
                return i2 == 0 ? mo186w(coordinatorLayout, bottomAppBar, view2, view3, i) : false;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public static class C1341a extends AbstractC0442a {
        public static final Parcelable.Creator<C1341a> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public int f10174d;

        /* JADX INFO: renamed from: e */
        public boolean f10175e;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a */
        public static class a implements Parcelable.ClassLoaderCreator<C1341a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C1341a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C1341a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C1341a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1341a(parcel, classLoader);
            }
        }

        public C1341a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10174d = parcel.readInt();
            this.f10175e = parcel.readInt() != 0;
        }

        public C1341a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeInt(this.f10174d);
            parcel.writeInt(this.f10175e ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return m3063B(this.f10163S);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f5751e;
    }

    private C1212f getTopEdgeTreatment() {
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static void m3061w(BottomAppBar bottomAppBar) {
        bottomAppBar.f10166V--;
    }

    /* JADX INFO: renamed from: A */
    public int m3062A(ActionMenuView actionMenuView, int i, boolean z) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        boolean z2 = getLayoutDirection() == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0060e) && (((Toolbar.C0060e) childAt.getLayoutParams()).f1226a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i == 1 && z) {
            return right;
        }
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public final float m3063B(int i) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        boolean z = getLayoutDirection() == 1;
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - 0) * (z ? -1 : 1);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m3064C() {
        FloatingActionButton floatingActionButtonM3068y = m3068y();
        return floatingActionButtonM3068y != null && floatingActionButtonM3068y.m3123k();
    }

    /* JADX INFO: renamed from: D */
    public final void m3065D() {
        getTopEdgeTreatment().f5752f = getFabTranslationX();
        m3069z();
        if (this.f10167W) {
            m3064C();
        }
        throw null;
    }

    /* JADX INFO: renamed from: E */
    public boolean m3066E(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().f5750d) {
            return false;
        }
        getTopEdgeTreatment().f5750d = f;
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0067b
    public Behavior getBehavior() {
        if (this.f10168a0 == null) {
            this.f10168a0 = new Behavior();
        }
        return this.f10168a0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f5751e;
    }

    public int getFabAlignmentMode() {
        return this.f10163S;
    }

    public int getFabAnimationMode() {
        return this.f10164T;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f5749c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f5748b;
    }

    public boolean getHideOnScroll() {
        return this.f10165U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z) {
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                actionMenuView.setAlpha(1.0f);
                actionMenuView.setTranslationX(!m3064C() ? m3062A(actionMenuView, 0, false) : m3062A(actionMenuView, this.f10163S, this.f10167W));
                return;
            }
            return;
        }
        Animator animator = this.f10162R;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f10161Q;
        if (animator2 != null) {
            animator2.cancel();
        }
        m3065D();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1341a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1341a c1341a = (C1341a) parcelable;
        super.onRestoreInstanceState(c1341a.f2812b);
        this.f10163S = c1341a.f10174d;
        this.f10167W = c1341a.f10175e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C1341a c1341a = new C1341a(super.onSaveInstanceState());
        c1341a.f10174d = this.f10163S;
        c1341a.f10175e = this.f10167W;
        return c1341a;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0360f.m1433Y(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f == getCradleVerticalOffset()) {
            return;
        }
        getTopEdgeTreatment().f5751e = f;
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        if (this.f10163S != i) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (isLaidOut()) {
                Animator animator = this.f10161Q;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f10164T == 1) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m3068y(), "translationX", m3063B(i));
                    objectAnimatorOfFloat.setDuration(300L);
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    m3067x(i);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f10161Q = animatorSet;
                animatorSet.addListener(new C1207a(this));
                this.f10161Q.start();
            }
        }
        boolean z = this.f10167W;
        WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
        if (isLaidOut()) {
            Animator animator2 = this.f10162R;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (m3064C()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - m3062A(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat3.addListener(new C1210d(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(objectAnimatorOfFloat3, objectAnimatorOfFloat2);
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(objectAnimatorOfFloat2);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f10162R = animatorSet3;
            animatorSet3.addListener(new C1209c(this));
            this.f10162R.start();
        }
        this.f10163S = i;
    }

    public void setFabAnimationMode(int i) {
        this.f10164T = i;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f5749c = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f5748b = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f10165U = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: x */
    public void m3067x(int i) {
        FloatingActionButton floatingActionButtonM3068y = m3068y();
        if (floatingActionButtonM3068y == null || floatingActionButtonM3068y.m3122j()) {
            return;
        }
        this.f10166V++;
        floatingActionButtonM3068y.m3121i(new C1208b(this, i), true);
    }

    /* JADX INFO: renamed from: y */
    public final FloatingActionButton m3068y() {
        View viewM3069z = m3069z();
        if (viewM3069z instanceof FloatingActionButton) {
            return (FloatingActionButton) viewM3069z;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final View m3069z() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m147f(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }
}
