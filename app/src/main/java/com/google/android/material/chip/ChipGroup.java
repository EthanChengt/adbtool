package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.didjdk.adbhelper.R;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p148r.C1268e;
import p080c.p126d.p127a.p128a.p148r.C1277n;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends C1268e {

    /* JADX INFO: renamed from: e */
    public int f10262e;

    /* JADX INFO: renamed from: f */
    public int f10263f;

    /* JADX INFO: renamed from: g */
    public boolean f10264g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1355d f10265h;

    /* JADX INFO: renamed from: i */
    public final C1353b f10266i;

    /* JADX INFO: renamed from: j */
    public ViewGroupOnHierarchyChangeListenerC1356e f10267j;

    /* JADX INFO: renamed from: k */
    public int f10268k;

    /* JADX INFO: renamed from: l */
    public boolean f10269l;

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C1353b implements CompoundButton.OnCheckedChangeListener {
        public C1353b(C1352a c1352a) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.f10269l) {
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                ChipGroup chipGroup = ChipGroup.this;
                if (chipGroup.f10268k == id) {
                    chipGroup.setCheckedId(-1);
                    return;
                }
                return;
            }
            ChipGroup chipGroup2 = ChipGroup.this;
            int i = chipGroup2.f10268k;
            if (i != -1 && i != id && chipGroup2.f10264g) {
                chipGroup2.m3106c(i, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C1354c extends ViewGroup.MarginLayoutParams {
        public C1354c(int i, int i2) {
            super(i, i2);
        }

        public C1354c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1354c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface InterfaceC1355d {
        /* JADX INFO: renamed from: a */
        void m3107a(ChipGroup chipGroup, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$e */
    public class ViewGroupOnHierarchyChangeListenerC1356e implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f10271a;

        public ViewGroupOnHierarchyChangeListenerC1356e(C1352a c1352a) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f10266i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10271a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10271a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cw);
        this.f10266i = new C1353b(null);
        this.f10267j = new ViewGroupOnHierarchyChangeListenerC1356e(null);
        this.f10268k = -1;
        this.f10269l = false;
        int[] iArr = C1164b.f5568f;
        C1277n.m2943a(context, attributeSet, R.attr.cw, R.style.qg);
        C1277n.m2944b(context, attributeSet, iArr, R.attr.cw, R.style.qg, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.cw, R.style.qg);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(4, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(5, false));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f10268k = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        super.setOnHierarchyChangeListener(this.f10267j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f10268k = i;
        InterfaceC1355d interfaceC1355d = this.f10265h;
        if (interfaceC1355d == null || !this.f10264g) {
            return;
        }
        interfaceC1355d.m3107a(this, i);
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1268e
    /* JADX INFO: renamed from: a */
    public boolean mo2930a() {
        return this.f6093d;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f10268k;
                if (i2 != -1 && this.f10264g) {
                    m3106c(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m3106c(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.f10269l = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.f10269l = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1354c);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1354c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1354c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1354c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f10264g) {
            return this.f10268k;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f10262e;
    }

    public int getChipSpacingVertical() {
        return this.f10263f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f10268k;
        if (i != -1) {
            m3106c(i, true);
            setCheckedId(this.f10268k);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f10262e != i) {
            this.f10262e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f10263f != i) {
            this.f10263f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC1355d interfaceC1355d) {
        this.f10265h = interfaceC1355d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f10267j.f10271a = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1268e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f10264g != z) {
            this.f10264g = z;
            this.f10269l = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f10269l = false;
            setCheckedId(-1);
        }
    }
}
