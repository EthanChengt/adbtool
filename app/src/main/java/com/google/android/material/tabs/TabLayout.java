package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.didjdk.adbhelper.MainActivity;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.C0183a;
import p006b.p008b.C0184b;
import p006b.p008b.p009c.AbstractC0185a;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p043i.C0404d;
import p006b.p032h.p043i.C0405e;
import p006b.p032h.p043i.InterfaceC0403c;
import p006b.p032h.p044j.C0418m;
import p006b.p078z.p079a.AbstractC0612a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p129a0.C1162a;
import p080c.p126d.p127a.p128a.p129a0.ViewOnLayoutChangeListenerC1163b;
import p080c.p126d.p127a.p128a.p131c.C1182a;
import p080c.p126d.p127a.p128a.p134e.C1205a;
import p080c.p126d.p127a.p128a.p134e.C1206b;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p152v.C1287b;
import p080c.p126d.p127a.p128a.p154x.C1296g;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.InterfaceC0171d
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: P */
    public static final InterfaceC0403c<C1372g> f10332P = new C0405e(16);

    /* JADX INFO: renamed from: A */
    public int f10333A;

    /* JADX INFO: renamed from: B */
    public boolean f10334B;

    /* JADX INFO: renamed from: C */
    public boolean f10335C;

    /* JADX INFO: renamed from: D */
    public boolean f10336D;

    /* JADX INFO: renamed from: E */
    public InterfaceC1368c f10337E;

    /* JADX INFO: renamed from: F */
    public final ArrayList<InterfaceC1368c> f10338F;

    /* JADX INFO: renamed from: G */
    public InterfaceC1368c f10339G;

    /* JADX INFO: renamed from: H */
    public ValueAnimator f10340H;

    /* JADX INFO: renamed from: I */
    public ViewPager f10341I;

    /* JADX INFO: renamed from: J */
    public AbstractC0612a f10342J;

    /* JADX INFO: renamed from: K */
    public DataSetObserver f10343K;

    /* JADX INFO: renamed from: L */
    public C1373h f10344L;

    /* JADX INFO: renamed from: M */
    public C1367b f10345M;

    /* JADX INFO: renamed from: N */
    public boolean f10346N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC0403c<C1374i> f10347O;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C1372g> f10348b;

    /* JADX INFO: renamed from: c */
    public C1372g f10349c;

    /* JADX INFO: renamed from: d */
    public final RectF f10350d;

    /* JADX INFO: renamed from: e */
    public final C1371f f10351e;

    /* JADX INFO: renamed from: f */
    public int f10352f;

    /* JADX INFO: renamed from: g */
    public int f10353g;

    /* JADX INFO: renamed from: h */
    public int f10354h;

    /* JADX INFO: renamed from: i */
    public int f10355i;

    /* JADX INFO: renamed from: j */
    public int f10356j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f10357k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f10358l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f10359m;

    /* JADX INFO: renamed from: n */
    public Drawable f10360n;

    /* JADX INFO: renamed from: o */
    public PorterDuff.Mode f10361o;

    /* JADX INFO: renamed from: p */
    public float f10362p;

    /* JADX INFO: renamed from: q */
    public float f10363q;

    /* JADX INFO: renamed from: r */
    public final int f10364r;

    /* JADX INFO: renamed from: s */
    public int f10365s;

    /* JADX INFO: renamed from: t */
    public final int f10366t;

    /* JADX INFO: renamed from: u */
    public final int f10367u;

    /* JADX INFO: renamed from: v */
    public final int f10368v;

    /* JADX INFO: renamed from: w */
    public int f10369w;

    /* JADX INFO: renamed from: x */
    public int f10370x;

    /* JADX INFO: renamed from: y */
    public int f10371y;

    /* JADX INFO: renamed from: z */
    public int f10372z;

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C1366a implements ValueAnimator.AnimatorUpdateListener {
        public C1366a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C1367b implements ViewPager.InterfaceC0175h {

        /* JADX INFO: renamed from: a */
        public boolean f10374a;

        public C1367b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0175h
        /* JADX INFO: renamed from: a */
        public void mo749a(ViewPager viewPager, AbstractC0612a abstractC0612a, AbstractC0612a abstractC0612a2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f10341I == viewPager) {
                tabLayout.m3144k(abstractC0612a2, this.f10374a);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$c */
    @Deprecated
    public interface InterfaceC1368c<T extends C1372g> {
        /* JADX INFO: renamed from: a */
        void mo3150a(T t);

        /* JADX INFO: renamed from: b */
        void mo3151b(T t);

        /* JADX INFO: renamed from: c */
        void mo3152c(T t);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface InterfaceC1369d extends InterfaceC1368c<C1372g> {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C1370e extends DataSetObserver {
        public C1370e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m3142i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m3142i();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f */
    public class C1371f extends LinearLayout {

        /* JADX INFO: renamed from: b */
        public int f10377b;

        /* JADX INFO: renamed from: c */
        public final Paint f10378c;

        /* JADX INFO: renamed from: d */
        public final GradientDrawable f10379d;

        /* JADX INFO: renamed from: e */
        public int f10380e;

        /* JADX INFO: renamed from: f */
        public float f10381f;

        /* JADX INFO: renamed from: g */
        public int f10382g;

        /* JADX INFO: renamed from: h */
        public int f10383h;

        /* JADX INFO: renamed from: i */
        public int f10384i;

        /* JADX INFO: renamed from: j */
        public ValueAnimator f10385j;

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10387a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f10388b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f10389c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f10390d;

            public a(int i, int i2, int i3, int i4) {
                this.f10387a = i;
                this.f10388b = i2;
                this.f10389c = i3;
                this.f10390d = i4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C1371f c1371f = C1371f.this;
                int i = this.f10387a;
                int i2 = this.f10388b;
                TimeInterpolator timeInterpolator = C1182a.f5662a;
                int iRound = Math.round((i2 - i) * animatedFraction) + i;
                int i3 = this.f10389c;
                int iRound2 = Math.round(animatedFraction * (this.f10390d - i3)) + i3;
                if (iRound == c1371f.f10383h && iRound2 == c1371f.f10384i) {
                    return;
                }
                c1371f.f10383h = iRound;
                c1371f.f10384i = iRound2;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                c1371f.postInvalidateOnAnimation();
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f$b */
        public class b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10392a;

            public b(int i) {
                this.f10392a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C1371f c1371f = C1371f.this;
                c1371f.f10380e = this.f10392a;
                c1371f.f10381f = 0.0f;
            }
        }

        public C1371f(Context context) {
            super(context);
            this.f10380e = -1;
            this.f10382g = -1;
            this.f10383h = -1;
            this.f10384i = -1;
            setWillNotDraw(false);
            this.f10378c = new Paint();
            this.f10379d = new GradientDrawable();
        }

        /* JADX INFO: renamed from: a */
        public void m3153a(int i, int i2) {
            ValueAnimator valueAnimator = this.f10385j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f10385j.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m3155c();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f10335C && (childAt instanceof C1374i)) {
                m3154b((C1374i) childAt, tabLayout.f10350d);
                RectF rectF = TabLayout.this.f10350d;
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            int i3 = left;
            int i4 = right;
            int i5 = this.f10383h;
            int i6 = this.f10384i;
            if (i5 == i3 && i6 == i4) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f10385j = valueAnimator2;
            valueAnimator2.setInterpolator(C1182a.f5663b);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new a(i5, i3, i6, i4));
            valueAnimator2.addListener(new b(i));
            valueAnimator2.start();
        }

        /* JADX INFO: renamed from: b */
        public final void m3154b(C1374i c1374i, RectF rectF) {
            int contentWidth = c1374i.getContentWidth();
            int iM2720e = (int) C1161a.m2720e(getContext(), 24);
            if (contentWidth < iM2720e) {
                contentWidth = iM2720e;
            }
            int right = (c1374i.getRight() + c1374i.getLeft()) / 2;
            int i = contentWidth / 2;
            rectF.set(right - i, 0.0f, right + i, 0.0f);
        }

        /* JADX INFO: renamed from: c */
        public final void m3155c() {
            int i;
            View childAt = getChildAt(this.f10380e);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                int left = childAt.getLeft();
                int right = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f10335C && (childAt instanceof C1374i)) {
                    m3154b((C1374i) childAt, tabLayout.f10350d);
                    RectF rectF = TabLayout.this.f10350d;
                    left = (int) rectF.left;
                    right = (int) rectF.right;
                }
                if (this.f10381f <= 0.0f || this.f10380e >= getChildCount() - 1) {
                    i2 = left;
                    i = right;
                } else {
                    View childAt2 = getChildAt(this.f10380e + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f10335C && (childAt2 instanceof C1374i)) {
                        m3154b((C1374i) childAt2, tabLayout2.f10350d);
                        RectF rectF2 = TabLayout.this.f10350d;
                        left2 = (int) rectF2.left;
                        right2 = (int) rectF2.right;
                    }
                    float f = this.f10381f;
                    float f2 = 1.0f - f;
                    i2 = (int) ((left * f2) + (left2 * f));
                    i = (int) ((f2 * right) + (right2 * f));
                }
            }
            if (i2 == this.f10383h && i == this.f10384i) {
                return;
            }
            this.f10383h = i2;
            this.f10384i = i;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            postInvalidateOnAnimation();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0049  */
        /* JADX WARN: Code duplicated, block: B:30:0x005a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0064  */
        /* JADX WARN: Code duplicated, block: B:33:0x006a  */
        @Override // android.view.View
        public void draw(Canvas canvas) {
            int i;
            Drawable drawable;
            Drawable drawableM1444e0;
            Paint paint;
            int i2;
            int color;
            Drawable drawable2 = TabLayout.this.f10360n;
            int height = 0;
            int intrinsicHeight = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
            int i3 = this.f10377b;
            if (i3 >= 0) {
                intrinsicHeight = i3;
            }
            int i4 = TabLayout.this.f10372z;
            if (i4 != 0) {
                if (i4 == 1) {
                    height = (getHeight() - intrinsicHeight) / 2;
                    intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        intrinsicHeight = 0;
                    }
                }
                i = this.f10383h;
                if (i >= 0 && this.f10384i > i) {
                    drawable = TabLayout.this.f10360n;
                    if (drawable == null) {
                        drawable = this.f10379d;
                    }
                    drawableM1444e0 = C0360f.m1444e0(drawable);
                    drawableM1444e0.setBounds(this.f10383h, height, this.f10384i, intrinsicHeight);
                    paint = this.f10378c;
                    if (paint != null) {
                        i2 = Build.VERSION.SDK_INT;
                        color = paint.getColor();
                        if (i2 == 21) {
                            drawableM1444e0.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                        } else {
                            C0360f.m1432X(drawableM1444e0, color);
                        }
                    }
                    drawableM1444e0.draw(canvas);
                }
                super.draw(canvas);
            }
            height = getHeight() - intrinsicHeight;
            intrinsicHeight = getHeight();
            i = this.f10383h;
            if (i >= 0) {
                drawable = TabLayout.this.f10360n;
                if (drawable == null) {
                    drawable = this.f10379d;
                }
                drawableM1444e0 = C0360f.m1444e0(drawable);
                drawableM1444e0.setBounds(this.f10383h, height, this.f10384i, intrinsicHeight);
                paint = this.f10378c;
                if (paint != null) {
                    i2 = Build.VERSION.SDK_INT;
                    color = paint.getColor();
                    if (i2 == 21) {
                        drawableM1444e0.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    } else {
                        C0360f.m1432X(drawableM1444e0, color);
                    }
                }
                drawableM1444e0.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f10385j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m3155c();
                return;
            }
            this.f10385j.cancel();
            m3153a(this.f10380e, Math.round((1.0f - this.f10385j.getAnimatedFraction()) * this.f10385j.getDuration()));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f10370x == 1 || tabLayout.f10333A == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) C1161a.m2720e(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f10370x = 0;
                    tabLayout2.m3149p(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f10382g == i) {
                return;
            }
            requestLayout();
            this.f10382g = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C1372g {

        /* JADX INFO: renamed from: a */
        public Drawable f10394a;

        /* JADX INFO: renamed from: b */
        public CharSequence f10395b;

        /* JADX INFO: renamed from: c */
        public CharSequence f10396c;

        /* JADX INFO: renamed from: d */
        public int f10397d = -1;

        /* JADX INFO: renamed from: e */
        public View f10398e;

        /* JADX INFO: renamed from: f */
        public TabLayout f10399f;

        /* JADX INFO: renamed from: g */
        public C1374i f10400g;

        /* JADX INFO: renamed from: a */
        public C1372g m3156a(Drawable drawable) {
            this.f10394a = drawable;
            TabLayout tabLayout = this.f10399f;
            if (tabLayout.f10370x == 1 || tabLayout.f10333A == 2) {
                tabLayout.m3149p(true);
            }
            m3158c();
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C1372g m3157b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f10396c) && !TextUtils.isEmpty(charSequence)) {
                this.f10400g.setContentDescription(charSequence);
            }
            this.f10395b = charSequence;
            m3158c();
            return this;
        }

        /* JADX INFO: renamed from: c */
        public void m3158c() {
            C1374i c1374i = this.f10400g;
            if (c1374i != null) {
                c1374i.m3165g();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C1373h implements ViewPager.InterfaceC0176i {

        /* JADX INFO: renamed from: a */
        public final WeakReference<TabLayout> f10401a;

        /* JADX INFO: renamed from: b */
        public int f10402b;

        /* JADX INFO: renamed from: c */
        public int f10403c;

        public C1373h(TabLayout tabLayout) {
            this.f10401a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0176i
        /* JADX INFO: renamed from: a */
        public void mo750a(int i, float f, int i2) {
            TabLayout tabLayout = this.f10401a.get();
            if (tabLayout != null) {
                int i3 = this.f10403c;
                tabLayout.m3145l(i, f, i3 != 2 || this.f10402b == 1, (i3 == 2 && this.f10402b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0176i
        /* JADX INFO: renamed from: b */
        public void mo751b(int i) {
            this.f10402b = this.f10403c;
            this.f10403c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0176i
        /* JADX INFO: renamed from: c */
        public void mo752c(int i) {
            TabLayout tabLayout = this.f10401a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f10403c;
            tabLayout.m3143j(tabLayout.m3140g(i), i2 == 0 || (i2 == 2 && this.f10402b == 0));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C1374i extends LinearLayout {

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ int f10404m = 0;

        /* JADX INFO: renamed from: b */
        public C1372g f10405b;

        /* JADX INFO: renamed from: c */
        public TextView f10406c;

        /* JADX INFO: renamed from: d */
        public ImageView f10407d;

        /* JADX INFO: renamed from: e */
        public View f10408e;

        /* JADX INFO: renamed from: f */
        public C1205a f10409f;

        /* JADX INFO: renamed from: g */
        public View f10410g;

        /* JADX INFO: renamed from: h */
        public TextView f10411h;

        /* JADX INFO: renamed from: i */
        public ImageView f10412i;

        /* JADX INFO: renamed from: j */
        public Drawable f10413j;

        /* JADX INFO: renamed from: k */
        public int f10414k;

        public C1374i(Context context) {
            super(context);
            this.f10414k = 2;
            m3166h(context);
            int i = TabLayout.this.f10352f;
            int i2 = TabLayout.this.f10353g;
            int i3 = TabLayout.this.f10354h;
            int i4 = TabLayout.this.f10355i;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            setPaddingRelative(i, i2, i3, i4);
            setGravity(17);
            setOrientation(!TabLayout.this.f10334B ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            int i5 = Build.VERSION.SDK_INT;
            PointerIcon systemIcon = i5 >= 24 ? PointerIcon.getSystemIcon(context2, 1002) : null;
            if (i5 >= 24) {
                setPointerIcon(systemIcon);
            }
            C0418m.m1577t(this, null);
        }

        private C1205a getBadge() {
            return this.f10409f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f10406c, this.f10407d, this.f10410g};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        private C1205a getOrCreateBadge() {
            if (this.f10409f == null) {
                Context context = getContext();
                C1205a c1205a = new C1205a(context);
                int[] iArr = C1164b.f5565c;
                C1277n.m2943a(context, null, R.attr.b5, R.style.pq);
                C1277n.m2944b(context, null, iArr, R.attr.b5, R.style.pq, new int[0]);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.b5, R.style.pq);
                int i = typedArrayObtainStyledAttributes.getInt(3, 4);
                C1205a.a aVar = c1205a.f5720i;
                if (aVar.f5733f != i) {
                    aVar.f5733f = i;
                    double d = i;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    c1205a.f5723l = ((int) Math.pow(10.0d, d - 1.0d)) - 1;
                    c1205a.f5715d.f6147d = true;
                    c1205a.m2787e();
                    c1205a.invalidateSelf();
                }
                if (typedArrayObtainStyledAttributes.hasValue(4)) {
                    int iMax = Math.max(0, typedArrayObtainStyledAttributes.getInt(4, 0));
                    C1205a.a aVar2 = c1205a.f5720i;
                    if (aVar2.f5732e != iMax) {
                        aVar2.f5732e = iMax;
                        c1205a.f5715d.f6147d = true;
                        c1205a.m2787e();
                        c1205a.invalidateSelf();
                    }
                }
                int defaultColor = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 0).getDefaultColor();
                c1205a.f5720i.f5729b = defaultColor;
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(defaultColor);
                C1296g c1296g = c1205a.f5714c;
                if (c1296g.f6211b.f6236d != colorStateListValueOf) {
                    c1296g.m2975p(colorStateListValueOf);
                    c1205a.invalidateSelf();
                }
                if (typedArrayObtainStyledAttributes.hasValue(2)) {
                    int defaultColor2 = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 2).getDefaultColor();
                    c1205a.f5720i.f5730c = defaultColor2;
                    if (c1205a.f5715d.f6144a.getColor() != defaultColor2) {
                        c1205a.f5715d.f6144a.setColor(defaultColor2);
                        c1205a.invalidateSelf();
                    }
                }
                int i2 = typedArrayObtainStyledAttributes.getInt(1, 8388661);
                C1205a.a aVar3 = c1205a.f5720i;
                if (aVar3.f5736i != i2) {
                    aVar3.f5736i = i2;
                    WeakReference<View> weakReference = c1205a.f5727p;
                    if (weakReference != null && weakReference.get() != null) {
                        View view = c1205a.f5727p.get();
                        WeakReference<ViewGroup> weakReference2 = c1205a.f5728q;
                        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
                        c1205a.f5727p = new WeakReference<>(view);
                        c1205a.f5728q = new WeakReference<>(viewGroup);
                        c1205a.m2787e();
                        c1205a.invalidateSelf();
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
                this.f10409f = c1205a;
            }
            m3163e();
            C1205a c1205a2 = this.f10409f;
            if (c1205a2 != null) {
                return c1205a2;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: renamed from: b */
        public final boolean m3160b() {
            return this.f10409f != null;
        }

        /* JADX INFO: renamed from: c */
        public final void m3161c(View view) {
            if (m3160b() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                C1205a c1205a = this.f10409f;
                C1206b.m2788a(c1205a, view, null);
                view.getOverlay().add(c1205a);
                this.f10408e = view;
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m3162d() {
            if (m3160b() && this.f10408e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C1205a c1205a = this.f10409f;
                View view = this.f10408e;
                if (c1205a != null) {
                    view.getOverlay().remove(c1205a);
                }
                this.f10408e = null;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f10413j;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f10413j.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m3163e() {
            C1372g c1372g;
            View view;
            C1372g c1372g2;
            if (m3160b()) {
                if (this.f10410g == null) {
                    ImageView imageView = this.f10407d;
                    if (imageView == null || (c1372g2 = this.f10405b) == null || c1372g2.f10394a == null) {
                        if (this.f10406c != null && (c1372g = this.f10405b) != null) {
                            Objects.requireNonNull(c1372g);
                            View view2 = this.f10408e;
                            TextView textView = this.f10406c;
                            if (view2 == textView) {
                                m3164f(textView);
                                return;
                            } else {
                                m3162d();
                                view = this.f10406c;
                            }
                        }
                    } else if (this.f10408e == imageView) {
                        m3164f(imageView);
                        return;
                    } else {
                        m3162d();
                        view = this.f10407d;
                    }
                    m3161c(view);
                    return;
                }
                m3162d();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m3164f(View view) {
            if (m3160b() && view == this.f10408e) {
                C1206b.m2788a(this.f10409f, view, null);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m3165g() {
            Drawable drawable;
            C1372g c1372g = this.f10405b;
            Drawable drawableMutate = null;
            View view = c1372g != null ? c1372g.f10398e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f10410g = view;
                TextView textView = this.f10406c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f10407d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f10407d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.f10411h = textView2;
                if (textView2 != null) {
                    this.f10414k = textView2.getMaxLines();
                }
                this.f10412i = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view2 = this.f10410g;
                if (view2 != null) {
                    removeView(view2);
                    this.f10410g = null;
                }
                this.f10411h = null;
                this.f10412i = null;
            }
            boolean z = false;
            if (this.f10410g == null) {
                if (this.f10407d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.ag, (ViewGroup) this, false);
                    this.f10407d = imageView2;
                    addView(imageView2, 0);
                }
                if (c1372g != null && (drawable = c1372g.f10394a) != null) {
                    drawableMutate = C0360f.m1444e0(drawable).mutate();
                }
                if (drawableMutate != null) {
                    C0360f.m1433Y(drawableMutate, TabLayout.this.f10358l);
                    PorterDuff.Mode mode = TabLayout.this.f10361o;
                    if (mode != null) {
                        C0360f.m1434Z(drawableMutate, mode);
                    }
                }
                if (this.f10406c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.ah, (ViewGroup) this, false);
                    this.f10406c = textView3;
                    addView(textView3);
                    this.f10414k = this.f10406c.getMaxLines();
                }
                C0360f.m1431W(this.f10406c, TabLayout.this.f10356j);
                ColorStateList colorStateList = TabLayout.this.f10357k;
                if (colorStateList != null) {
                    this.f10406c.setTextColor(colorStateList);
                }
                m3167i(this.f10406c, this.f10407d);
                m3163e();
                ImageView imageView3 = this.f10407d;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1163b(this, imageView3));
                }
                TextView textView4 = this.f10406c;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1163b(this, textView4));
                }
            } else {
                TextView textView5 = this.f10411h;
                if (textView5 != null || this.f10412i != null) {
                    m3167i(textView5, this.f10412i);
                }
            }
            if (c1372g != null && !TextUtils.isEmpty(c1372g.f10396c)) {
                setContentDescription(c1372g.f10396c);
            }
            if (c1372g != null) {
                TabLayout tabLayout = c1372g.f10399f;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                if (tabLayout.getSelectedTabPosition() == c1372g.f10397d) {
                    z = true;
                }
            }
            setSelected(z);
        }

        public C1372g getTab() {
            return this.f10405b;
        }

        /* JADX INFO: renamed from: h */
        public final void m3166h(Context context) {
            ColorStateList colorStateList;
            GradientDrawable gradientDrawable;
            int i = TabLayout.this.f10364r;
            if (i != 0) {
                Drawable drawableM884b = C0208a.m884b(context, i);
                this.f10413j = drawableM884b;
                if (drawableM884b != null && drawableM884b.isStateful()) {
                    this.f10413j.setState(getDrawableState());
                }
            } else {
                this.f10413j = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable layerDrawable = gradientDrawable2;
            if (TabLayout.this.f10359m != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateList2 = TabLayout.this.f10359m;
                if (C1287b.f6184a) {
                    colorStateList = new ColorStateList(new int[][]{C1287b.f6193j, StateSet.NOTHING}, new int[]{C1287b.m2954a(colorStateList2, C1287b.f6189f), C1287b.m2954a(colorStateList2, C1287b.f6185b)});
                } else {
                    int[] iArr = C1287b.f6189f;
                    int[] iArr2 = C1287b.f6190g;
                    int[] iArr3 = C1287b.f6191h;
                    int[] iArr4 = C1287b.f6192i;
                    int[] iArr5 = C1287b.f6185b;
                    int[] iArr6 = C1287b.f6186c;
                    int[] iArr7 = C1287b.f6187d;
                    int[] iArr8 = C1287b.f6188e;
                    colorStateList = new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, C1287b.f6193j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{C1287b.m2954a(colorStateList2, iArr), C1287b.m2954a(colorStateList2, iArr2), C1287b.m2954a(colorStateList2, iArr3), C1287b.m2954a(colorStateList2, iArr4), 0, C1287b.m2954a(colorStateList2, iArr5), C1287b.m2954a(colorStateList2, iArr6), C1287b.m2954a(colorStateList2, iArr7), C1287b.m2954a(colorStateList2, iArr8), 0});
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.f10336D;
                    if (z) {
                        gradientDrawable = gradientDrawable2;
                        gradientDrawable = null;
                    }
                    layerDrawable = new RippleDrawable(colorStateList, gradientDrawable, z ? null : gradientDrawable3);
                } else {
                    Drawable drawableM1444e0 = C0360f.m1444e0(gradientDrawable3);
                    C0360f.m1433Y(drawableM1444e0, colorStateList);
                    layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable2, drawableM1444e0});
                }
            }
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            setBackground(layerDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX INFO: renamed from: i */
        public final void m3167i(TextView textView, ImageView imageView) {
            Drawable drawable;
            C1372g c1372g = this.f10405b;
            Drawable drawableMutate = (c1372g == null || (drawable = c1372g.f10394a) == null) ? null : C0360f.m1444e0(drawable).mutate();
            C1372g c1372g2 = this.f10405b;
            CharSequence charSequence = c1372g2 != null ? c1372g2.f10395b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    Objects.requireNonNull(this.f10405b);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iM2720e = (z && imageView.getVisibility() == 0) ? (int) C1161a.m2720e(getContext(), 8) : 0;
                if (TabLayout.this.f10334B) {
                    if (iM2720e != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iM2720e);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iM2720e != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iM2720e;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C1372g c1372g3 = this.f10405b;
            C0183a.m756c(this, z ? null : c1372g3 != null ? c1372g3.f10396c : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0185a.c.class.getName());
        }

        @Override // android.view.View
        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Context context;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0185a.c.class.getName());
            C1205a c1205a = this.f10409f;
            if (c1205a == null || !c1205a.isVisible()) {
                return;
            }
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) contentDescription);
            sb.append(", ");
            C1205a c1205a2 = this.f10409f;
            Object quantityString = null;
            if (c1205a2.isVisible()) {
                if (!c1205a2.m2786d()) {
                    quantityString = c1205a2.f5720i.f5734g;
                } else if (c1205a2.f5720i.f5735h > 0 && (context = c1205a2.f5713b.get()) != null) {
                    quantityString = context.getResources().getQuantityString(c1205a2.f5720i.f5735h, c1205a2.m2785c(), Integer.valueOf(c1205a2.m2785c()));
                }
            }
            sb.append(quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0098  */
        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f10365s, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i, i2);
            if (this.f10406c != null) {
                float f = TabLayout.this.f10362p;
                int i3 = this.f10414k;
                ImageView imageView = this.f10407d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f10406c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f10363q;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f10406c.getTextSize();
                int lineCount = this.f10406c.getLineCount();
                int maxLines = this.f10406c.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.f10333A == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f10406c.getLayout();
                        if (layout != null) {
                            if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f10406c.setTextSize(0, f);
                        this.f10406c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f10405b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            C1372g c1372g = this.f10405b;
            TabLayout tabLayout = c1372g.f10399f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m3143j(c1372g, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f10406c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f10407d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f10410g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C1372g c1372g) {
            if (c1372g != this.f10405b) {
                this.f10405b = c1372g;
                m3165g();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C1375j implements InterfaceC1369d {

        /* JADX INFO: renamed from: a */
        public final ViewPager f10416a;

        public C1375j(ViewPager viewPager) {
            this.f10416a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1368c
        /* JADX INFO: renamed from: a */
        public void mo3150a(C1372g c1372g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1368c
        /* JADX INFO: renamed from: b */
        public void mo3151b(C1372g c1372g) {
            this.f10416a.setCurrentItem(c1372g.f10397d);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1368c
        /* JADX INFO: renamed from: c */
        public void mo3152c(C1372g c1372g) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.qo);
        this.f10348b = new ArrayList<>();
        this.f10350d = new RectF();
        this.f10365s = Integer.MAX_VALUE;
        this.f10338F = new ArrayList<>();
        this.f10347O = new C0404d(12);
        setHorizontalScrollBarEnabled(false);
        C1371f c1371f = new C1371f(context);
        this.f10351e = c1371f;
        super.addView(c1371f, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = C1164b.f5587y;
        C1277n.m2943a(context, attributeSet, R.attr.qo, R.style.pd);
        C1277n.m2944b(context, attributeSet, iArr, R.attr.qo, R.style.pd, 22);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.qo, R.style.pd);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C1296g c1296g = new C1296g();
            c1296g.m2975p(ColorStateList.valueOf(colorDrawable.getColor()));
            c1296g.f6211b.f6234b = new C1252a(context);
            c1296g.m2984y();
            c1296g.m2974o(C0418m.m1566i(this));
            setBackground(c1296g);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1);
        if (c1371f.f10377b != dimensionPixelSize) {
            c1371f.f10377b = dimensionPixelSize;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            c1371f.postInvalidateOnAnimation();
        }
        int color = typedArrayObtainStyledAttributes.getColor(7, 0);
        if (c1371f.f10378c.getColor() != color) {
            c1371f.f10378c.setColor(color);
            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
            c1371f.postInvalidateOnAnimation();
        }
        setSelectedTabIndicator(C1161a.m2726k(context, typedArrayObtainStyledAttributes, 5));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(9, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f10355i = dimensionPixelSize2;
        this.f10354h = dimensionPixelSize2;
        this.f10353g = dimensionPixelSize2;
        this.f10352f = dimensionPixelSize2;
        this.f10352f = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f10353g = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, this.f10353g);
        this.f10354h = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, this.f10354h);
        this.f10355i = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, this.f10355i);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.style.je);
        this.f10356j = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C0184b.f1223x);
        try {
            this.f10362p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f10357k = C1161a.m2723h(context, typedArrayObtainStyledAttributes2, 3);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                this.f10357k = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 23);
            }
            if (typedArrayObtainStyledAttributes.hasValue(21)) {
                this.f10357k = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayObtainStyledAttributes.getColor(21, 0), this.f10357k.getDefaultColor()});
            }
            this.f10358l = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 3);
            this.f10361o = C1161a.m2733r(typedArrayObtainStyledAttributes.getInt(4, -1), null);
            this.f10359m = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 20);
            this.f10371y = typedArrayObtainStyledAttributes.getInt(6, 300);
            this.f10366t = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f10367u = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f10364r = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            this.f10369w = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f10333A = typedArrayObtainStyledAttributes.getInt(14, 1);
            this.f10370x = typedArrayObtainStyledAttributes.getInt(2, 0);
            this.f10334B = typedArrayObtainStyledAttributes.getBoolean(11, false);
            this.f10336D = typedArrayObtainStyledAttributes.getBoolean(24, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f10363q = resources.getDimensionPixelSize(R.dimen.d0);
            this.f10368v = resources.getDimensionPixelSize(R.dimen.cy);
            m3137d();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f10348b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C1372g c1372g = this.f10348b.get(i);
            if (c1372g != null && c1372g.f10394a != null && !TextUtils.isEmpty(c1372g.f10395b)) {
                z = true;
                break;
            }
        }
        return (!z || this.f10334B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f10366t;
        if (i != -1) {
            return i;
        }
        int i2 = this.f10333A;
        if (i2 == 0 || i2 == 2) {
            return this.f10368v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f10351e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f10351e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f10351e.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3134a(C1372g c1372g, boolean z) {
        int size = this.f10348b.size();
        if (c1372g.f10399f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c1372g.f10397d = size;
        this.f10348b.add(size, c1372g);
        int size2 = this.f10348b.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.f10348b.get(size).f10397d = size;
            }
        }
        C1374i c1374i = c1372g.f10400g;
        c1374i.setSelected(false);
        c1374i.setActivated(false);
        C1371f c1371f = this.f10351e;
        int i = c1372g.f10397d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m3148o(layoutParams);
        c1371f.addView(c1374i, i, layoutParams);
        if (z) {
            TabLayout tabLayout = c1372g.f10399f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m3143j(c1372g, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m3135b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m3135b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3135b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3135b(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m3135b(View view) {
        if (!(view instanceof C1162a)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        C1162a c1162a = (C1162a) view;
        C1372g c1372gM3141h = m3141h();
        Objects.requireNonNull(c1162a);
        if (!TextUtils.isEmpty(c1162a.getContentDescription())) {
            c1372gM3141h.f10396c = c1162a.getContentDescription();
            c1372gM3141h.m3158c();
        }
        m3134a(c1372gM3141h, this.f10348b.isEmpty());
    }

    /* JADX INFO: renamed from: c */
    public final void m3136c(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (isLaidOut()) {
                C1371f c1371f = this.f10351e;
                int childCount = c1371f.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else {
                        if (c1371f.getChildAt(i2).getWidth() <= 0) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int iM3138e = m3138e(i, 0.0f);
                    if (scrollX != iM3138e) {
                        m3139f();
                        this.f10340H.setIntValues(scrollX, iM3138e);
                        this.f10340H.start();
                    }
                    this.f10351e.m3153a(i, this.f10371y);
                    return;
                }
            }
        }
        m3145l(i, 0.0f, true, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m3137d() {
        int i = this.f10333A;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f10369w - this.f10352f) : 0;
        C1371f c1371f = this.f10351e;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        c1371f.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f10333A;
        if (i2 == 0) {
            this.f10351e.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            this.f10351e.setGravity(1);
        }
        m3149p(true);
    }

    /* JADX INFO: renamed from: e */
    public final int m3138e(int i, float f) {
        int i2 = this.f10333A;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f10351e.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f10351e.getChildCount() ? this.f10351e.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: f */
    public final void m3139f() {
        if (this.f10340H == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10340H = valueAnimator;
            valueAnimator.setInterpolator(C1182a.f5663b);
            this.f10340H.setDuration(this.f10371y);
            this.f10340H.addUpdateListener(new C1366a());
        }
    }

    /* JADX INFO: renamed from: g */
    public C1372g m3140g(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f10348b.get(i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C1372g c1372g = this.f10349c;
        if (c1372g != null) {
            return c1372g.f10397d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f10348b.size();
    }

    public int getTabGravity() {
        return this.f10370x;
    }

    public ColorStateList getTabIconTint() {
        return this.f10358l;
    }

    public int getTabIndicatorGravity() {
        return this.f10372z;
    }

    public int getTabMaxWidth() {
        return this.f10365s;
    }

    public int getTabMode() {
        return this.f10333A;
    }

    public ColorStateList getTabRippleColor() {
        return this.f10359m;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f10360n;
    }

    public ColorStateList getTabTextColors() {
        return this.f10357k;
    }

    /* JADX INFO: renamed from: h */
    public C1372g m3141h() {
        C1372g c1372gMo1537b = f10332P.mo1537b();
        if (c1372gMo1537b == null) {
            c1372gMo1537b = new C1372g();
        }
        c1372gMo1537b.f10399f = this;
        InterfaceC0403c<C1374i> interfaceC0403c = this.f10347O;
        C1374i c1374iMo1537b = interfaceC0403c != null ? interfaceC0403c.mo1537b() : null;
        if (c1374iMo1537b == null) {
            c1374iMo1537b = new C1374i(getContext());
        }
        c1374iMo1537b.setTab(c1372gMo1537b);
        c1374iMo1537b.setFocusable(true);
        c1374iMo1537b.setMinimumWidth(getTabMinWidth());
        c1374iMo1537b.setContentDescription(TextUtils.isEmpty(c1372gMo1537b.f10396c) ? c1372gMo1537b.f10395b : c1372gMo1537b.f10396c);
        c1372gMo1537b.f10400g = c1374iMo1537b;
        return c1372gMo1537b;
    }

    /* JADX INFO: renamed from: i */
    public void m3142i() {
        int currentItem;
        for (int childCount = this.f10351e.getChildCount() - 1; childCount >= 0; childCount--) {
            C1374i c1374i = (C1374i) this.f10351e.getChildAt(childCount);
            this.f10351e.removeViewAt(childCount);
            if (c1374i != null) {
                c1374i.setTab(null);
                c1374i.setSelected(false);
                this.f10347O.mo1536a(c1374i);
            }
            requestLayout();
        }
        Iterator<C1372g> it = this.f10348b.iterator();
        while (it.hasNext()) {
            C1372g next = it.next();
            it.remove();
            next.f10399f = null;
            next.f10400g = null;
            next.f10394a = null;
            next.f10395b = null;
            next.f10396c = null;
            next.f10397d = -1;
            next.f10398e = null;
            f10332P.mo1536a(next);
        }
        this.f10349c = null;
        AbstractC0612a abstractC0612a = this.f10342J;
        if (abstractC0612a != null) {
            int iMo2186c = abstractC0612a.mo2186c();
            for (int i = 0; i < iMo2186c; i++) {
                C1372g c1372gM3141h = m3141h();
                MainActivity.C1332c c1332c = (MainActivity.C1332c) this.f10342J;
                c1372gM3141h.m3157b(MainActivity.this.getResources().getString(MainActivity.this.f6456H.f4839c.get(i).intValue()));
                m3134a(c1372gM3141h, false);
            }
            ViewPager viewPager = this.f10341I;
            if (viewPager == null || iMo2186c <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m3143j(m3140g(currentItem), true);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3143j(C1372g c1372g, boolean z) {
        C1372g c1372g2 = this.f10349c;
        if (c1372g2 == c1372g) {
            if (c1372g2 != null) {
                for (int size = this.f10338F.size() - 1; size >= 0; size--) {
                    this.f10338F.get(size).mo3152c(c1372g);
                }
                m3136c(c1372g.f10397d);
                return;
            }
            return;
        }
        int i = c1372g != null ? c1372g.f10397d : -1;
        if (z) {
            if ((c1372g2 == null || c1372g2.f10397d == -1) && i != -1) {
                m3145l(i, 0.0f, true, true);
            } else {
                m3136c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f10349c = c1372g;
        if (c1372g2 != null) {
            for (int size2 = this.f10338F.size() - 1; size2 >= 0; size2--) {
                this.f10338F.get(size2).mo3150a(c1372g2);
            }
        }
        if (c1372g != null) {
            for (int size3 = this.f10338F.size() - 1; size3 >= 0; size3--) {
                this.f10338F.get(size3).mo3151b(c1372g);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m3144k(AbstractC0612a abstractC0612a, boolean z) {
        DataSetObserver dataSetObserver;
        AbstractC0612a abstractC0612a2 = this.f10342J;
        if (abstractC0612a2 != null && (dataSetObserver = this.f10343K) != null) {
            abstractC0612a2.f3748a.unregisterObserver(dataSetObserver);
        }
        this.f10342J = abstractC0612a;
        if (z && abstractC0612a != null) {
            if (this.f10343K == null) {
                this.f10343K = new C1370e();
            }
            abstractC0612a.f3748a.registerObserver(this.f10343K);
        }
        m3142i();
    }

    /* JADX INFO: renamed from: l */
    public void m3145l(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.f10351e.getChildCount()) {
            return;
        }
        if (z2) {
            C1371f c1371f = this.f10351e;
            ValueAnimator valueAnimator = c1371f.f10385j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c1371f.f10385j.cancel();
            }
            c1371f.f10380e = i;
            c1371f.f10381f = f;
            c1371f.m3155c();
        }
        ValueAnimator valueAnimator2 = this.f10340H;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f10340H.cancel();
        }
        scrollTo(m3138e(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3146m(ViewPager viewPager, boolean z, boolean z2) {
        List<ViewPager.InterfaceC0175h> list;
        List<ViewPager.InterfaceC0176i> list2;
        ViewPager viewPager2 = this.f10341I;
        if (viewPager2 != null) {
            C1373h c1373h = this.f10344L;
            if (c1373h != null && (list2 = viewPager2.f1141S) != null) {
                list2.remove(c1373h);
            }
            C1367b c1367b = this.f10345M;
            if (c1367b != null && (list = this.f10341I.f1143U) != null) {
                list.remove(c1367b);
            }
        }
        InterfaceC1368c interfaceC1368c = this.f10339G;
        if (interfaceC1368c != null) {
            this.f10338F.remove(interfaceC1368c);
            this.f10339G = null;
        }
        if (viewPager != null) {
            this.f10341I = viewPager;
            if (this.f10344L == null) {
                this.f10344L = new C1373h(this);
            }
            C1373h c1373h2 = this.f10344L;
            c1373h2.f10403c = 0;
            c1373h2.f10402b = 0;
            if (viewPager.f1141S == null) {
                viewPager.f1141S = new ArrayList();
            }
            viewPager.f1141S.add(c1373h2);
            C1375j c1375j = new C1375j(viewPager);
            this.f10339G = c1375j;
            if (!this.f10338F.contains(c1375j)) {
                this.f10338F.add(c1375j);
            }
            AbstractC0612a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m3144k(adapter, z);
            }
            if (this.f10345M == null) {
                this.f10345M = new C1367b();
            }
            C1367b c1367b2 = this.f10345M;
            c1367b2.f10374a = z;
            if (viewPager.f1143U == null) {
                viewPager.f1143U = new ArrayList();
            }
            viewPager.f1143U.add(c1367b2);
            m3145l(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f10341I = null;
            m3144k(null, false);
        }
        this.f10346N = z2;
    }

    /* JADX INFO: renamed from: n */
    public final void m3147n() {
        int size = this.f10348b.size();
        for (int i = 0; i < size; i++) {
            this.f10348b.get(i).m3158c();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3148o(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f10333A == 1 && this.f10370x == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1296g) {
            C1161a.m2739x(this, (C1296g) background);
        }
        if (this.f10341I == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m3146m((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10346N) {
            setupWithViewPager(null);
            this.f10346N = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C1374i c1374i;
        Drawable drawable;
        for (int i = 0; i < this.f10351e.getChildCount(); i++) {
            View childAt = this.f10351e.getChildAt(i);
            if ((childAt instanceof C1374i) && (drawable = (c1374i = (C1374i) childAt).f10413j) != null) {
                drawable.setBounds(c1374i.getLeft(), c1374i.getTop(), c1374i.getRight(), c1374i.getBottom());
                c1374i.f10413j.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM2720e = (int) C1161a.m2720e(getContext(), getDefaultHeight());
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iM2720e, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iM2720e) {
            getChildAt(0).setMinimumHeight(iM2720e);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM2720e2 = this.f10367u;
            if (iM2720e2 <= 0) {
                iM2720e2 = (int) (size - C1161a.m2720e(getContext(), 56));
            }
            this.f10365s = iM2720e2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f10333A;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z = true;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z = true;
                    }
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z = true;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m3149p(boolean z) {
        for (int i = 0; i < this.f10351e.getChildCount(); i++) {
            View childAt = this.f10351e.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m3148o((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1161a.m2738w(this, f);
    }

    public void setInlineLabel(boolean z) {
        ImageView imageView;
        if (this.f10334B != z) {
            this.f10334B = z;
            for (int i = 0; i < this.f10351e.getChildCount(); i++) {
                View childAt = this.f10351e.getChildAt(i);
                if (childAt instanceof C1374i) {
                    C1374i c1374i = (C1374i) childAt;
                    c1374i.setOrientation(!TabLayout.this.f10334B ? 1 : 0);
                    TextView textView = c1374i.f10411h;
                    if (textView == null && c1374i.f10412i == null) {
                        textView = c1374i.f10406c;
                        imageView = c1374i.f10407d;
                    } else {
                        imageView = c1374i.f10412i;
                    }
                    c1374i.m3167i(textView, imageView);
                }
            }
            m3137d();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC1368c interfaceC1368c) {
        InterfaceC1368c interfaceC1368c2 = this.f10337E;
        if (interfaceC1368c2 != null) {
            this.f10338F.remove(interfaceC1368c2);
        }
        this.f10337E = interfaceC1368c;
        if (interfaceC1368c == null || this.f10338F.contains(interfaceC1368c)) {
            return;
        }
        this.f10338F.add(interfaceC1368c);
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC1369d interfaceC1369d) {
        setOnTabSelectedListener((InterfaceC1368c) interfaceC1369d);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m3139f();
        this.f10340H.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        setSelectedTabIndicator(i != 0 ? C0208a.m884b(getContext(), i) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f10360n != drawable) {
            this.f10360n = drawable;
            C1371f c1371f = this.f10351e;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            c1371f.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C1371f c1371f = this.f10351e;
        if (c1371f.f10378c.getColor() != i) {
            c1371f.f10378c.setColor(i);
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            c1371f.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f10372z != i) {
            this.f10372z = i;
            C1371f c1371f = this.f10351e;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            c1371f.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        C1371f c1371f = this.f10351e;
        if (c1371f.f10377b != i) {
            c1371f.f10377b = i;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            c1371f.postInvalidateOnAnimation();
        }
    }

    public void setTabGravity(int i) {
        if (this.f10370x != i) {
            this.f10370x = i;
            m3137d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f10358l != colorStateList) {
            this.f10358l = colorStateList;
            m3147n();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C0208a.m883a(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f10335C = z;
        C1371f c1371f = this.f10351e;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        c1371f.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f10333A) {
            this.f10333A = i;
            m3137d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f10359m != colorStateList) {
            this.f10359m = colorStateList;
            for (int i = 0; i < this.f10351e.getChildCount(); i++) {
                View childAt = this.f10351e.getChildAt(i);
                if (childAt instanceof C1374i) {
                    Context context = getContext();
                    int i2 = C1374i.f10404m;
                    ((C1374i) childAt).m3166h(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C0208a.m883a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f10357k != colorStateList) {
            this.f10357k = colorStateList;
            m3147n();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC0612a abstractC0612a) {
        m3144k(abstractC0612a, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f10336D != z) {
            this.f10336D = z;
            for (int i = 0; i < this.f10351e.getChildCount(); i++) {
                View childAt = this.f10351e.getChildAt(i);
                if (childAt instanceof C1374i) {
                    Context context = getContext();
                    int i2 = C1374i.f10404m;
                    ((C1374i) childAt).m3166h(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m3146m(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
