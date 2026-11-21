package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public TextView f10328b;

    /* JADX INFO: renamed from: c */
    public Button f10329c;

    /* JADX INFO: renamed from: d */
    public int f10330d;

    /* JADX INFO: renamed from: e */
    public int f10331e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5586x);
        this.f10330d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f10331e = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3133a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f10328b.getPaddingTop() == i2 && this.f10328b.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f10328b;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f10329c;
    }

    public TextView getMessageView() {
        return this.f10328b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f10328b = (TextView) findViewById(R.id.n6);
        this.f10329c = (Button) findViewById(R.id.n5);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f10330d > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.f10330d;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cv);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.cu);
        boolean z = false;
        boolean z2 = this.f10328b.getLayout().getLineCount() > 1;
        if (!z2 || this.f10331e <= 0 || this.f10329c.getMeasuredWidth() <= this.f10331e) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (m3133a(0, dimensionPixelSize, dimensionPixelSize)) {
                z = true;
            }
        } else if (m3133a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }
}
