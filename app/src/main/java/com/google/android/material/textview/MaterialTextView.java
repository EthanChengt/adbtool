package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p006b.p008b.p018i.C0297z;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends C0297z {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        if (C1161a.m2736u(context, com.didjdk.adbhelper.R.attr.r4, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = C1164b.f5581s;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iM3191e = m3191e(context, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM3191e != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m3192c(theme, resourceId);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m3191e(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: c */
    public final void m3192c(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, C1164b.f5580r);
        int iM3191e = m3191e(getContext(), typedArrayObtainStyledAttributes, 0, 1);
        typedArrayObtainStyledAttributes.recycle();
        if (iM3191e >= 0) {
            setLineHeight(iM3191e);
        }
    }

    @Override // p006b.p008b.p018i.C0297z, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C1161a.m2736u(context, com.didjdk.adbhelper.R.attr.r4, true)) {
            m3192c(context.getTheme(), i);
        }
    }
}
