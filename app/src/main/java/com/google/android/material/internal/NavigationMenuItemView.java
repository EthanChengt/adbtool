package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p006b.p008b.C0183a;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0236n;
import p006b.p008b.p018i.C0264i0;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p080c.p126d.p127a.p128a.p148r.C1269f;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends C1269f implements InterfaceC0236n.a {

    /* JADX INFO: renamed from: G */
    public static final int[] f10305G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public FrameLayout f10306A;

    /* JADX INFO: renamed from: B */
    public C0231i f10307B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f10308C;

    /* JADX INFO: renamed from: D */
    public boolean f10309D;

    /* JADX INFO: renamed from: E */
    public Drawable f10310E;

    /* JADX INFO: renamed from: F */
    public final C0406a f10311F;

    /* JADX INFO: renamed from: w */
    public int f10312w;

    /* JADX INFO: renamed from: x */
    public boolean f10313x;

    /* JADX INFO: renamed from: y */
    public boolean f10314y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f10315z;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C1363a extends C0406a {
        public C1363a() {
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
            c0429b.f2743a.setCheckable(NavigationMenuItemView.this.f10314y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1363a c1363a = new C1363a();
        this.f10311F = c1363a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.didjdk.adbhelper.R.layout.ao, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.didjdk.adbhelper.R.dimen.cg));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.didjdk.adbhelper.R.id.dj);
        this.f10315z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0418m.m1577t(checkedTextView, c1363a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f10306A == null) {
                this.f10306A = (FrameLayout) ((ViewStub) findViewById(com.didjdk.adbhelper.R.id.di)).inflate();
            }
            this.f10306A.removeAllViews();
            this.f10306A.addView(view);
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n.a
    /* JADX INFO: renamed from: d */
    public void mo18d(C0231i c0231i, int i) {
        C0264i0.a aVar;
        int i2;
        StateListDrawable stateListDrawable;
        this.f10307B = c0231i;
        setVisibility(c0231i.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.dt, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f10305G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0231i.isCheckable());
        setChecked(c0231i.isChecked());
        setEnabled(c0231i.isEnabled());
        setTitle(c0231i.f1665e);
        setIcon(c0231i.getIcon());
        setActionView(c0231i.getActionView());
        setContentDescription(c0231i.f1677q);
        C0183a.m756c(this, c0231i.f1678r);
        C0231i c0231i2 = this.f10307B;
        if (c0231i2.f1665e == null && c0231i2.getIcon() == null && this.f10307B.getActionView() != null) {
            this.f10315z.setVisibility(8);
            FrameLayout frameLayout = this.f10306A;
            if (frameLayout == null) {
                return;
            }
            aVar = (C0264i0.a) frameLayout.getLayoutParams();
            i2 = -1;
        } else {
            this.f10315z.setVisibility(0);
            FrameLayout frameLayout2 = this.f10306A;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (C0264i0.a) frameLayout2.getLayoutParams();
            i2 = -2;
        }
        ((ViewGroup.MarginLayoutParams) aVar).width = i2;
        this.f10306A.setLayoutParams(aVar);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n.a
    public C0231i getItemData() {
        return this.f10307B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0231i c0231i = this.f10307B;
        if (c0231i != null && c0231i.isCheckable() && this.f10307B.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, f10305G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f10314y != z) {
            this.f10314y = z;
            this.f10311F.mo1540h(this.f10315z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f10315z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f10309D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0360f.m1444e0(drawable).mutate();
                C0360f.m1433Y(drawable, this.f10308C);
            }
            int i = this.f10312w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f10313x) {
            if (this.f10310E == null) {
                Drawable drawableM1476c = C0369g.m1476c(getResources(), com.didjdk.adbhelper.R.drawable.cf, getContext().getTheme());
                this.f10310E = drawableM1476c;
                if (drawableM1476c != null) {
                    int i2 = this.f10312w;
                    drawableM1476c.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f10310E;
        }
        this.f10315z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f10315z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f10312w = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f10308C = colorStateList;
        this.f10309D = colorStateList != null;
        C0231i c0231i = this.f10307B;
        if (c0231i != null) {
            setIcon(c0231i.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f10315z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f10313x = z;
    }

    public void setTextAppearance(int i) {
        C0360f.m1431W(this.f10315z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10315z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10315z.setText(charSequence);
    }
}
