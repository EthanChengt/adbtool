package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.AbstractC0215a;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.InterfaceC0236n;
import p006b.p008b.p018i.AbstractC0242a;
import p006b.p008b.p018i.C0248c;
import p006b.p008b.p018i.C0253d1;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0242a {

    /* JADX INFO: renamed from: j */
    public CharSequence f178j;

    /* JADX INFO: renamed from: k */
    public CharSequence f179k;

    /* JADX INFO: renamed from: l */
    public View f180l;

    /* JADX INFO: renamed from: m */
    public View f181m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f182n;

    /* JADX INFO: renamed from: o */
    public TextView f183o;

    /* JADX INFO: renamed from: p */
    public TextView f184p;

    /* JADX INFO: renamed from: q */
    public int f185q;

    /* JADX INFO: renamed from: r */
    public int f186r;

    /* JADX INFO: renamed from: s */
    public boolean f187s;

    /* JADX INFO: renamed from: t */
    public int f188t;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0026a implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0215a f189b;

        public ViewOnClickListenerC0026a(ActionBarContextView actionBarContextView, AbstractC0215a abstractC0215a) {
            this.f189b = abstractC0215a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f189b.mo869c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.a1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1203d, R.attr.a1, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C0208a.m884b(context, resourceId);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setBackground(drawable);
        this.f185q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f186r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1742f = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f188t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX INFO: renamed from: f */
    public void m30f(AbstractC0215a abstractC0215a) {
        View viewInflate;
        C0248c c0248c;
        C0248c c0248c2;
        InterfaceC0236n interfaceC0236n;
        InterfaceC0236n interfaceC0236n2;
        View view = this.f180l;
        if (view != null) {
            if (view.getParent() == null) {
                viewInflate = this.f180l;
            }
            this.f180l.findViewById(R.id.b5).setOnClickListener(new ViewOnClickListenerC0026a(this, abstractC0215a));
            C0229g c0229g = (C0229g) abstractC0215a.mo871e();
            c0248c = this.f1741e;
            if (c0248c != null) {
                c0248c.m1016b();
            }
            C0248c c0248c3 = new C0248c(getContext());
            this.f1741e = c0248c3;
            c0248c3.f1788n = true;
            c0248c3.f1789o = true;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            c0229g.m942b(this.f1741e, this.f1739c);
            c0248c2 = this.f1741e;
            interfaceC0236n = c0248c2.f1574i;
            if (interfaceC0236n == null) {
                InterfaceC0236n interfaceC0236n3 = (InterfaceC0236n) c0248c2.f1570e.inflate(c0248c2.f1572g, (ViewGroup) this, false);
                c0248c2.f1574i = interfaceC0236n3;
                interfaceC0236n3.mo24b(c0248c2.f1569d);
                c0248c2.mo125n(true);
            }
            interfaceC0236n2 = c0248c2.f1574i;
            if (interfaceC0236n != interfaceC0236n2) {
                ((ActionMenuView) interfaceC0236n2).setPresenter(c0248c2);
            }
            ActionMenuView actionMenuView = (ActionMenuView) interfaceC0236n2;
            this.f1740d = actionMenuView;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            actionMenuView.setBackground(null);
            addView(this.f1740d, layoutParams);
        }
        viewInflate = LayoutInflater.from(getContext()).inflate(this.f188t, (ViewGroup) this, false);
        this.f180l = viewInflate;
        addView(viewInflate);
        this.f180l.findViewById(R.id.b5).setOnClickListener(new ViewOnClickListenerC0026a(this, abstractC0215a));
        C0229g c0229g2 = (C0229g) abstractC0215a.mo871e();
        c0248c = this.f1741e;
        if (c0248c != null) {
            c0248c.m1016b();
        }
        C0248c c0248c4 = new C0248c(getContext());
        this.f1741e = c0248c4;
        c0248c4.f1788n = true;
        c0248c4.f1789o = true;
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        c0229g2.m942b(this.f1741e, this.f1739c);
        c0248c2 = this.f1741e;
        interfaceC0236n = c0248c2.f1574i;
        if (interfaceC0236n == null) {
            InterfaceC0236n interfaceC0236n4 = (InterfaceC0236n) c0248c2.f1570e.inflate(c0248c2.f1572g, (ViewGroup) this, false);
            c0248c2.f1574i = interfaceC0236n4;
            interfaceC0236n4.mo24b(c0248c2.f1569d);
            c0248c2.mo125n(true);
        }
        interfaceC0236n2 = c0248c2.f1574i;
        if (interfaceC0236n != interfaceC0236n2) {
            ((ActionMenuView) interfaceC0236n2).setPresenter(c0248c2);
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) interfaceC0236n2;
        this.f1740d = actionMenuView2;
        WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
        actionMenuView2.setBackground(null);
        addView(this.f1740d, layoutParams2);
    }

    /* JADX INFO: renamed from: g */
    public final void m31g() {
        if (this.f182n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f182n = linearLayout;
            this.f183o = (TextView) linearLayout.findViewById(R.id.av);
            this.f184p = (TextView) this.f182n.findViewById(R.id.au);
            if (this.f185q != 0) {
                this.f183o.setTextAppearance(getContext(), this.f185q);
            }
            if (this.f186r != 0) {
                this.f184p.setTextAppearance(getContext(), this.f186r);
            }
        }
        this.f183o.setText(this.f178j);
        this.f184p.setText(this.f179k);
        boolean z = !TextUtils.isEmpty(this.f178j);
        boolean z2 = !TextUtils.isEmpty(this.f179k);
        int i = 0;
        this.f184p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f182n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f182n.getParent() == null) {
            addView(this.f182n);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p006b.p008b.p018i.AbstractC0242a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p006b.p008b.p018i.AbstractC0242a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f179k;
    }

    public CharSequence getTitle() {
        return this.f178j;
    }

    /* JADX INFO: renamed from: h */
    public void m32h() {
        removeAllViews();
        this.f181m = null;
        this.f1740d = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0248c c0248c = this.f1741e;
        if (c0248c != null) {
            c0248c.m1018k();
            this.f1741e.m1019o();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f178j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM1050b = C0253d1.m1050b(this);
        int paddingRight = zM1050b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f180l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f180l.getLayoutParams();
            int i5 = zM1050b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM1050b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zM1050b ? paddingRight - i5 : paddingRight + i5;
            int iM998d = i7 + m998d(this.f180l, i7, paddingTop, paddingTop2, zM1050b);
            paddingRight = zM1050b ? iM998d - i6 : iM998d + i6;
        }
        int iM998d2 = paddingRight;
        LinearLayout linearLayout = this.f182n;
        if (linearLayout != null && this.f181m == null && linearLayout.getVisibility() != 8) {
            iM998d2 += m998d(this.f182n, iM998d2, paddingTop, paddingTop2, zM1050b);
        }
        int i8 = iM998d2;
        View view2 = this.f181m;
        if (view2 != null) {
            m998d(view2, i8, paddingTop, paddingTop2, zM1050b);
        }
        int paddingLeft = zM1050b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1740d;
        if (actionMenuView != null) {
            m998d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM1050b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f1742f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, RecyclerView.UNDEFINED_DURATION);
        View view = this.f180l;
        if (view != null) {
            int iM997c = m997c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f180l.getLayoutParams();
            paddingLeft = iM997c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1740d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m997c(this.f1740d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f182n;
        if (linearLayout != null && this.f181m == null) {
            if (this.f187s) {
                this.f182n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f182n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f182n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m997c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f181m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? RecyclerView.UNDEFINED_DURATION : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f181m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f1742f <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // p006b.p008b.p018i.AbstractC0242a
    public void setContentHeight(int i) {
        this.f1742f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f181m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f181m = view;
        if (view != null && (linearLayout = this.f182n) != null) {
            removeView(linearLayout);
            this.f182n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f179k = charSequence;
        m31g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f178j = charSequence;
        m31g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f187s) {
            requestLayout();
        }
        this.f187s = z;
    }

    @Override // p006b.p008b.p018i.AbstractC0242a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
