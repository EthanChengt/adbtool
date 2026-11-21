package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p131c.C1188g;
import p080c.p126d.p127a.p128a.p147q.InterfaceC1263i;
import p080c.p126d.p127a.p128a.p148r.C1267d;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0067b {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f10274r = 0;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0068c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f10275a;

        /* JADX INFO: renamed from: b */
        public boolean f10276b;

        /* JADX INFO: renamed from: c */
        public boolean f10277c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f10276b = false;
            this.f10277c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5569g);
            this.f10276b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f10277c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: B */
        public boolean m3110B(ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            int i = ExtendedFloatingActionButton.f10274r;
            Objects.requireNonNull(extendedFloatingActionButton);
            extendedFloatingActionButton.getLeft();
            throw null;
        }

        /* JADX INFO: renamed from: C */
        public final boolean m3111C(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f10276b || this.f10277c) && ((CoordinatorLayout.C0071f) extendedFloatingActionButton.getLayoutParams()).f547f == view.getId();
        }

        /* JADX INFO: renamed from: D */
        public final boolean m3112D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m3111C(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f10275a == null) {
                this.f10275a = new Rect();
            }
            Rect rect = this.f10275a;
            C1267d.m2928a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f10277c) {
                    int i = ExtendedFloatingActionButton.f10274r;
                    Objects.requireNonNull(extendedFloatingActionButton);
                } else {
                    int i2 = ExtendedFloatingActionButton.f10274r;
                    Objects.requireNonNull(extendedFloatingActionButton);
                }
                ExtendedFloatingActionButton.m3109e(extendedFloatingActionButton, null);
                return true;
            }
            if (this.f10277c) {
                int i3 = ExtendedFloatingActionButton.f10274r;
                Objects.requireNonNull(extendedFloatingActionButton);
            } else {
                int i4 = ExtendedFloatingActionButton.f10274r;
                Objects.requireNonNull(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.m3109e(extendedFloatingActionButton, null);
            return true;
        }

        /* JADX INFO: renamed from: E */
        public final boolean m3113E(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m3111C(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0071f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (this.f10277c) {
                    int i = ExtendedFloatingActionButton.f10274r;
                } else {
                    int i2 = ExtendedFloatingActionButton.f10274r;
                }
                ExtendedFloatingActionButton.m3109e(extendedFloatingActionButton, null);
                return true;
            }
            if (this.f10277c) {
                int i3 = ExtendedFloatingActionButton.f10274r;
            } else {
                int i4 = ExtendedFloatingActionButton.f10274r;
            }
            ExtendedFloatingActionButton.m3109e(extendedFloatingActionButton, null);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo164a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return m3110B((ExtendedFloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: f */
        public void mo169f(CoordinatorLayout.C0071f c0071f) {
            if (c0071f.f549h == 0) {
                c0071f.f549h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: g */
        public boolean mo170g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m3112D(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0071f ? ((CoordinatorLayout.C0071f) layoutParams).f542a instanceof BottomSheetBehavior : false) {
                    m3113E(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
        /* JADX INFO: renamed from: k */
        public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> listM146e = coordinatorLayout.m146e(extendedFloatingActionButton);
            int size = listM146e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = listM146e.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0071f ? ((CoordinatorLayout.C0071f) layoutParams).f542a instanceof BottomSheetBehavior : false) && m3113E(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m3112D(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m154s(extendedFloatingActionButton, i);
            int i3 = ExtendedFloatingActionButton.f10274r;
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public static class C1357a extends Property<View, Float> {
        public C1357a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public static class C1358b extends Property<View, Float> {
        public C1358b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    static {
        new C1357a(Float.class, "width");
        new C1358b(Float.class, "height");
    }

    /* JADX INFO: renamed from: e */
    public static void m3109e(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC1263i interfaceC1263i) {
        Objects.requireNonNull(extendedFloatingActionButton);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0067b
    public CoordinatorLayout.AbstractC0068c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public C1188g getExtendMotionSpec() {
        throw null;
    }

    public C1188g getHideMotionSpec() {
        throw null;
    }

    public C1188g getShowMotionSpec() {
        throw null;
    }

    public C1188g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(C1188g c1188g) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1188g.m2765b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(C1188g c1188g) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1188g.m2765b(getContext(), i));
    }

    public void setShowMotionSpec(C1188g c1188g) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1188g.m2765b(getContext(), i));
    }

    public void setShrinkMotionSpec(C1188g c1188g) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1188g.m2765b(getContext(), i));
    }
}
