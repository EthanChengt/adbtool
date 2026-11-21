package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p044j.C0418m;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.b.i.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C0264i0 extends ViewGroup {

    /* JADX INFO: renamed from: b */
    public boolean f1865b;

    /* JADX INFO: renamed from: c */
    public int f1866c;

    /* JADX INFO: renamed from: d */
    public int f1867d;

    /* JADX INFO: renamed from: e */
    public int f1868e;

    /* JADX INFO: renamed from: f */
    public int f1869f;

    /* JADX INFO: renamed from: g */
    public int f1870g;

    /* JADX INFO: renamed from: h */
    public float f1871h;

    /* JADX INFO: renamed from: i */
    public boolean f1872i;

    /* JADX INFO: renamed from: j */
    public int[] f1873j;

    /* JADX INFO: renamed from: k */
    public int[] f1874k;

    /* JADX INFO: renamed from: l */
    public Drawable f1875l;

    /* JADX INFO: renamed from: m */
    public int f1876m;

    /* JADX INFO: renamed from: n */
    public int f1877n;

    /* JADX INFO: renamed from: o */
    public int f1878o;

    /* JADX INFO: renamed from: p */
    public int f1879p;

    /* JADX INFO: renamed from: b.b.i.i0$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public float f1880a;

        /* JADX INFO: renamed from: b */
        public int f1881b;

        public a(int i, int i2) {
            super(i, i2);
            this.f1881b = -1;
            this.f1880a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1881b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1213n);
            this.f1880a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
            this.f1881b = typedArrayObtainStyledAttributes.getInt(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1881b = -1;
        }
    }

    public C0264i0(Context context) {
        this(context, null);
    }

    public C0264i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0264i0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f1865b = true;
        this.f1866c = -1;
        this.f1867d = 0;
        this.f1869f = 8388659;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1212m, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1871h = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f1866c = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.f1872i = typedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!typedArrayObtainStyledAttributes.hasValue(5) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(5) : C0208a.m884b(context, resourceId));
        this.f1878o = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.f1879p = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: f */
    public void m1071f(Canvas canvas, int i) {
        this.f1875l.setBounds(getPaddingLeft() + this.f1879p, i, (getWidth() - getPaddingRight()) - this.f1879p, this.f1877n + i);
        this.f1875l.draw(canvas);
    }

    /* JADX INFO: renamed from: g */
    public void m1072g(Canvas canvas, int i) {
        this.f1875l.setBounds(i, getPaddingTop() + this.f1879p, this.f1876m + i, (getHeight() - getPaddingBottom()) - this.f1879p);
        this.f1875l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1866c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1866c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1866c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1867d;
        if (this.f1868e == 1 && (i = this.f1869f & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1870g) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1870g;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1866c;
    }

    public Drawable getDividerDrawable() {
        return this.f1875l;
    }

    public int getDividerPadding() {
        return this.f1879p;
    }

    public int getDividerWidth() {
        return this.f1876m;
    }

    public int getGravity() {
        return this.f1869f;
    }

    public int getOrientation() {
        return this.f1868e;
    }

    public int getShowDividers() {
        return this.f1878o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1871h;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.f1868e;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* JADX INFO: renamed from: k */
    public int m1073k() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m1074l() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public int m1075m() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1076n(int i) {
        if (i == 0) {
            return (this.f1878o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1878o & 4) != 0;
        }
        if ((this.f1878o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public void m1077o(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int bottom;
        if (this.f1875l == null) {
            return;
        }
        int i = 0;
        if (this.f1868e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i < virtualChildCount) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getVisibility() != 8 && m1076n(i)) {
                    m1071f(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f1877n);
                }
                i++;
            }
            if (m1076n(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f1877n;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                m1071f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM1050b = C0253d1.m1050b(this);
        while (i < virtualChildCount2) {
            View childAt3 = getChildAt(i);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m1076n(i)) {
                a aVar = (a) childAt3.getLayoutParams();
                m1072g(canvas, zM1050b ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1876m);
            }
            i++;
        }
        if (m1076n(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (zM1050b) {
                    left = childAt4.getLeft();
                    paddingRight = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f1876m;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zM1050b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f1876m;
            }
            m1072g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int iM1073k;
        int i5;
        int i6;
        int i7;
        int baseline;
        int i8;
        int i9;
        int measuredHeight;
        int paddingTop;
        int i10;
        int i11;
        int iM1075m;
        int i12 = 8;
        int i13 = 5;
        if (this.f1868e == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i14 = i3 - i;
            int paddingRight = i14 - getPaddingRight();
            int paddingRight2 = (i14 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i15 = this.f1869f;
            int i16 = i15 & 112;
            int i17 = 8388615 & i15;
            if (i16 != 16) {
                paddingTop = i16 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f1870g;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f1870g) / 2);
            }
            int iM1073k2 = 0;
            while (iM1073k2 < virtualChildCount) {
                View childAt = getChildAt(iM1073k2);
                if (childAt == null) {
                    iM1075m = m1078p() + paddingTop;
                } else {
                    if (childAt.getVisibility() != i12) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        a aVar = (a) childAt.getLayoutParams();
                        int i18 = aVar.f1881b;
                        if (i18 < 0) {
                            i18 = i17;
                        }
                        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                        int absoluteGravity = Gravity.getAbsoluteGravity(i18, getLayoutDirection()) & 7;
                        if (absoluteGravity != 1) {
                            if (absoluteGravity != i13) {
                                i11 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft2;
                            } else {
                                i10 = paddingRight - measuredWidth;
                            }
                            if (m1076n(iM1073k2)) {
                                paddingTop += this.f1877n;
                            }
                            int i19 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                            int iM1074l = m1074l() + i19;
                            childAt.layout(i11, iM1074l, measuredWidth + i11, measuredHeight2 + iM1074l);
                            iM1075m = m1075m() + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i19;
                            iM1073k2 = m1073k() + iM1073k2;
                        } else {
                            i10 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                        }
                        i11 = i10 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        if (m1076n(iM1073k2)) {
                            paddingTop += this.f1877n;
                        }
                        int i110 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        int iM1074l2 = m1074l() + i110;
                        childAt.layout(i11, iM1074l2, measuredWidth + i11, measuredHeight2 + iM1074l2);
                        iM1075m = m1075m() + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i110;
                        iM1073k2 = m1073k() + iM1073k2;
                    }
                    iM1073k2++;
                    i12 = 8;
                    i13 = 5;
                }
                paddingTop = iM1075m;
                iM1073k2++;
                i12 = 8;
                i13 = 5;
            }
            return;
        }
        boolean zM1050b = C0253d1.m1050b(this);
        int paddingTop2 = getPaddingTop();
        int i20 = i4 - i2;
        int paddingBottom = i20 - getPaddingBottom();
        int paddingBottom2 = (i20 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i21 = this.f1869f;
        int i22 = 8388615 & i21;
        int i23 = i21 & 112;
        boolean z2 = this.f1865b;
        int[] iArr = this.f1873j;
        int[] iArr2 = this.f1874k;
        WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i22, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f1870g;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f1870g) / 2);
        }
        if (zM1050b) {
            i6 = virtualChildCount2 - 1;
            iM1073k = 0;
            i5 = -1;
        } else {
            iM1073k = 0;
            i5 = 1;
            i6 = 0;
        }
        while (iM1073k < virtualChildCount2) {
            int i24 = (i5 * iM1073k) + i6;
            View childAt2 = getChildAt(i24);
            if (childAt2 == null) {
                paddingLeft = m1078p() + paddingLeft;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    a aVar2 = (a) childAt2.getLayoutParams();
                    if (z2) {
                        i7 = i23;
                        baseline = ((ViewGroup.MarginLayoutParams) aVar2).height != -1 ? childAt2.getBaseline() : -1;
                        i8 = aVar2.f1881b;
                        if (i8 < 0) {
                            i8 = i7;
                        }
                        i9 = i8 & 112;
                        if (i9 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                        } else if (i9 != 48) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) aVar2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i9 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m1076n(i24)) {
                            paddingLeft += this.f1876m;
                        }
                        int i25 = paddingLeft + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                        int iM1074l3 = m1074l() + i25;
                        childAt2.layout(iM1074l3, measuredHeight, measuredWidth2 + iM1074l3, measuredHeight3 + measuredHeight);
                        paddingLeft = i25 + m1075m() + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                        iM1073k = m1073k() + iM1073k;
                    } else {
                        i7 = i23;
                    }
                    i8 = aVar2.f1881b;
                    if (i8 < 0) {
                        i8 = i7;
                    }
                    i9 = i8 & 112;
                    if (i9 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                    } else if (i9 != 48) {
                        measuredHeight = ((ViewGroup.MarginLayoutParams) aVar2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i9 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (m1076n(i24)) {
                        paddingLeft += this.f1876m;
                    }
                    int i26 = paddingLeft + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    int iM1074l4 = m1074l() + i26;
                    childAt2.layout(iM1074l4, measuredHeight, measuredWidth2 + iM1074l4, measuredHeight3 + measuredHeight);
                    paddingLeft = i26 + m1075m() + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                    iM1073k = m1073k() + iM1073k;
                }
                iM1073k++;
                virtualChildCount2 = virtualChildCount2;
                i23 = i7;
                z2 = z2;
            }
            i7 = i23;
            iM1073k++;
            virtualChildCount2 = virtualChildCount2;
            i23 = i7;
            z2 = z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:147:0x0304  */
    /* JADX WARN: Code duplicated, block: B:153:0x0311  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:218:0x04da  */
    /* JADX WARN: Code duplicated, block: B:219:0x04df  */
    /* JADX WARN: Code duplicated, block: B:222:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:223:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:225:0x050d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0520  */
    /* JADX WARN: Code duplicated, block: B:240:0x0563  */
    /* JADX WARN: Code duplicated, block: B:246:0x0572  */
    /* JADX WARN: Code duplicated, block: B:249:0x057a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x057c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0585  */
    /* JADX WARN: Code duplicated, block: B:254:0x0589  */
    /* JADX WARN: Code duplicated, block: B:281:0x0620  */
    /* JADX WARN: Code duplicated, block: B:283:0x0626  */
    /* JADX WARN: Code duplicated, block: B:284:0x0630  */
    /* JADX WARN: Code duplicated, block: B:286:0x0638  */
    /* JADX WARN: Code duplicated, block: B:287:0x063e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0648  */
    /* JADX WARN: Code duplicated, block: B:290:0x0655  */
    /* JADX WARN: Code duplicated, block: B:316:0x06df  */
    /* JADX WARN: Code duplicated, block: B:318:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:321:0x0703  */
    /* JADX WARN: Code duplicated, block: B:323:0x0709  */
    /* JADX WARN: Code duplicated, block: B:337:0x075c  */
    /* JADX WARN: Code duplicated, block: B:367:0x080c  */
    /* JADX WARN: Code duplicated, block: B:369:0x0817  */
    /* JADX WARN: Code duplicated, block: B:373:0x0842  */
    /* JADX WARN: Code duplicated, block: B:381:0x0854  */
    /* JADX WARN: Code duplicated, block: B:384:0x0886  */
    /* JADX WARN: Code duplicated, block: B:387:0x088b  */
    /* JADX WARN: Code duplicated, block: B:390:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:392:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:394:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:396:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:397:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:434:0x08ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        int i3;
        float f;
        int i4;
        int iCombineMeasuredStates;
        int i5;
        int i6;
        int i7;
        char c3;
        View childAt;
        int i8;
        int i9;
        int iMax;
        int i10;
        int baseline;
        int measuredWidth;
        int iMakeMeasureSpec;
        int i11;
        int i12;
        View childAt2;
        a aVar;
        int iM1073k;
        View childAt3;
        a aVar2;
        int i13;
        int iMax2;
        int i14;
        int i15;
        float f2;
        int i16;
        int i17;
        int i18;
        int iMax3;
        int i19;
        int i20;
        boolean z;
        boolean z2;
        a aVar3;
        int measuredWidth2;
        int i21;
        boolean z3;
        int i22;
        boolean z4;
        int i23;
        int measuredHeight;
        boolean z5;
        int baseline2;
        int i24;
        int i25;
        boolean z6;
        boolean z7;
        int measuredHeight2;
        int i26;
        a aVar4;
        boolean z8;
        int i27;
        boolean z9;
        int iMax4;
        int i28 = this.f1868e;
        int i29 = -2;
        int i30 = RecyclerView.UNDEFINED_DURATION;
        int i31 = 8;
        float f3 = 0.0f;
        int i32 = 1073741824;
        if (i28 == 1) {
            this.f1870g = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i33 = this.f1866c;
            boolean z10 = this.f1872i;
            int iM1073k2 = 0;
            int iMax5 = 0;
            int iMax6 = 0;
            int iMax7 = 0;
            int i34 = 0;
            float f4 = 0.0f;
            boolean z11 = false;
            int i35 = 0;
            boolean z12 = true;
            boolean z13 = false;
            while (iM1073k2 < virtualChildCount) {
                View childAt4 = getChildAt(iM1073k2);
                if (childAt4 == null) {
                    this.f1870g = m1078p() + this.f1870g;
                } else {
                    if (childAt4.getVisibility() == i31) {
                        iM1073k2 += m1073k();
                    } else {
                        if (m1076n(iM1073k2)) {
                            this.f1870g += this.f1877n;
                        }
                        a aVar5 = (a) childAt4.getLayoutParams();
                        float f5 = aVar5.f1880a;
                        f4 += f5;
                        if (mode2 == i32 && ((ViewGroup.MarginLayoutParams) aVar5).height == 0 && f5 > f3) {
                            int i36 = this.f1870g;
                            this.f1870g = Math.max(i36, ((ViewGroup.MarginLayoutParams) aVar5).topMargin + i36 + ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin);
                            i33 = i33;
                            aVar4 = aVar5;
                            z8 = true;
                        } else {
                            if (((ViewGroup.MarginLayoutParams) aVar5).height != 0 || f5 <= f3) {
                                i26 = RecyclerView.UNDEFINED_DURATION;
                            } else {
                                ((ViewGroup.MarginLayoutParams) aVar5).height = i29;
                                i26 = 0;
                            }
                            int i37 = f4 == f3 ? this.f1870g : 0;
                            aVar4 = aVar5;
                            m1077o(childAt4, i, 0, i2, i37);
                            if (i26 != i30) {
                                ((ViewGroup.MarginLayoutParams) aVar4).height = i26;
                            }
                            int measuredHeight3 = childAt4.getMeasuredHeight();
                            int i38 = this.f1870g;
                            this.f1870g = Math.max(i38, m1075m() + i38 + measuredHeight3 + ((ViewGroup.MarginLayoutParams) aVar4).topMargin + ((ViewGroup.MarginLayoutParams) aVar4).bottomMargin);
                            int i39 = iMax6;
                            if (z10) {
                                iMax6 = Math.max(measuredHeight3, i39);
                            }
                            z8 = z11;
                        }
                        if (i33 >= 0 && i33 == iM1073k2 + 1) {
                            this.f1867d = this.f1870g;
                        }
                        if (iM1073k2 < i33 && aVar4.f1880a > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i27 = mode;
                        if (i27 == 1073741824 || ((ViewGroup.MarginLayoutParams) aVar4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z13 = true;
                        }
                        int i40 = ((ViewGroup.MarginLayoutParams) aVar4).leftMargin + ((ViewGroup.MarginLayoutParams) aVar4).rightMargin;
                        int measuredWidth3 = childAt4.getMeasuredWidth() + i40;
                        iMax4 = Math.max(i34, measuredWidth3);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(i35, childAt4.getMeasuredState());
                        boolean z14 = z12 && ((ViewGroup.MarginLayoutParams) aVar4).width == -1;
                        if (aVar4.f1880a > 0.0f) {
                            if (!z9) {
                                i40 = measuredWidth3;
                            }
                            iMax5 = Math.max(iMax5, i40);
                        } else {
                            int i41 = iMax5;
                            if (!z9) {
                                i40 = measuredWidth3;
                            }
                            iMax7 = Math.max(iMax7, i40);
                            iMax5 = i41;
                        }
                        iM1073k2 += m1073k();
                        z11 = z8;
                        z12 = z14;
                        i35 = iCombineMeasuredStates2;
                    }
                    iM1073k2++;
                    mode = i27;
                    i34 = iMax4;
                    i33 = i33;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i29 = -2;
                    i30 = RecyclerView.UNDEFINED_DURATION;
                    i31 = 8;
                    f3 = 0.0f;
                    i32 = 1073741824;
                }
                i33 = i33;
                mode2 = mode2;
                i27 = mode;
                virtualChildCount = virtualChildCount;
                iMax4 = i34;
                iM1073k2++;
                mode = i27;
                i34 = iMax4;
                i33 = i33;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i29 = -2;
                i30 = RecyclerView.UNDEFINED_DURATION;
                i31 = 8;
                f3 = 0.0f;
                i32 = 1073741824;
            }
            int i42 = mode2;
            int i43 = mode;
            int i44 = virtualChildCount;
            int i45 = iMax5;
            int i46 = iMax6;
            int iMax8 = iMax7;
            int iMax9 = i34;
            int iCombineMeasuredStates3 = i35;
            if (this.f1870g > 0 && m1076n(i44)) {
                this.f1870g += this.f1877n;
            }
            int i47 = i42;
            if (z10 && (i47 == Integer.MIN_VALUE || i47 == 0)) {
                this.f1870g = 0;
                int iM1073k3 = 0;
                while (iM1073k3 < i44) {
                    View childAt5 = getChildAt(iM1073k3);
                    if (childAt5 == null) {
                        this.f1870g = m1078p() + this.f1870g;
                    } else if (childAt5.getVisibility() == 8) {
                        iM1073k3 += m1073k();
                    } else {
                        a aVar6 = (a) childAt5.getLayoutParams();
                        int i48 = this.f1870g;
                        this.f1870g = Math.max(i48, m1075m() + i48 + i46 + ((ViewGroup.MarginLayoutParams) aVar6).topMargin + ((ViewGroup.MarginLayoutParams) aVar6).bottomMargin);
                    }
                    iM1073k3++;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f1870g;
            this.f1870g = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i49 = (16777215 & iResolveSizeAndState) - this.f1870g;
            if (z11 || (i49 != 0 && f4 > 0.0f)) {
                float f6 = this.f1871h;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                this.f1870g = 0;
                int i50 = 0;
                while (i50 < i44) {
                    View childAt6 = getChildAt(i50);
                    if (childAt6.getVisibility() != 8) {
                        a aVar7 = (a) childAt6.getLayoutParams();
                        float f7 = aVar7.f1880a;
                        if (f7 > 0.0f) {
                            int i51 = (int) ((i49 * f7) / f4);
                            f4 -= f7;
                            int i52 = i49 - i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar7).leftMargin + ((ViewGroup.MarginLayoutParams) aVar7).rightMargin, ((ViewGroup.MarginLayoutParams) aVar7).width);
                            if (((ViewGroup.MarginLayoutParams) aVar7).height != 0 || i47 != 1073741824) {
                                measuredHeight2 = childAt6.getMeasuredHeight() + i51;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                            } else if (i51 > 0) {
                                measuredHeight2 = i51;
                            } else {
                                measuredHeight2 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                            i49 = i52;
                        }
                        int i53 = ((ViewGroup.MarginLayoutParams) aVar7).leftMargin + ((ViewGroup.MarginLayoutParams) aVar7).rightMargin;
                        int measuredWidth4 = childAt6.getMeasuredWidth() + i53;
                        iMax9 = Math.max(iMax9, measuredWidth4);
                        if (i43 != 1073741824) {
                            i24 = i49;
                            i25 = -1;
                            z6 = ((ViewGroup.MarginLayoutParams) aVar7).width == -1;
                            if (!z6) {
                                i53 = measuredWidth4;
                            }
                            iMax8 = Math.max(iMax8, i53);
                            if (z12 || ((ViewGroup.MarginLayoutParams) aVar7).width != i25) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            int i54 = this.f1870g;
                            this.f1870g = Math.max(i54, m1075m() + childAt6.getMeasuredHeight() + i54 + ((ViewGroup.MarginLayoutParams) aVar7).topMargin + ((ViewGroup.MarginLayoutParams) aVar7).bottomMargin);
                            z12 = z7;
                            i49 = i24;
                        } else {
                            i24 = i49;
                            i25 = -1;
                        }
                        if (!z6) {
                            i53 = measuredWidth4;
                        }
                        iMax8 = Math.max(iMax8, i53);
                        if (z12) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i55 = this.f1870g;
                        this.f1870g = Math.max(i55, m1075m() + childAt6.getMeasuredHeight() + i55 + ((ViewGroup.MarginLayoutParams) aVar7).topMargin + ((ViewGroup.MarginLayoutParams) aVar7).bottomMargin);
                        z12 = z7;
                        i49 = i24;
                    }
                    i50++;
                    i47 = i47;
                }
                this.f1870g = getPaddingBottom() + getPaddingTop() + this.f1870g;
            } else {
                iMax8 = Math.max(iMax8, i45);
                if (z10 && i47 != 1073741824) {
                    for (int i56 = 0; i56 < i44; i56++) {
                        View childAt7 = getChildAt(i56);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((a) childAt7.getLayoutParams()).f1880a > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                        }
                    }
                }
            }
            int i57 = iMax9;
            if (z12 || i43 == 1073741824) {
                iMax8 = i57;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax8, getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i58 = 0; i58 < i44; i58++) {
                    View childAt8 = getChildAt(i58);
                    if (childAt8.getVisibility() != 8) {
                        a aVar8 = (a) childAt8.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) aVar8).width == -1) {
                            int i59 = ((ViewGroup.MarginLayoutParams) aVar8).height;
                            ((ViewGroup.MarginLayoutParams) aVar8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((ViewGroup.MarginLayoutParams) aVar8).height = i59;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f1870g = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.f1873j == null || this.f1874k == null) {
            this.f1873j = new int[4];
            this.f1874k = new int[4];
        }
        int[] iArr = this.f1873j;
        int[] iArr2 = this.f1874k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.f1865b;
        boolean z16 = this.f1872i;
        boolean z17 = mode3 == 1073741824;
        int iMax10 = 0;
        float f8 = 0.0f;
        int i60 = 0;
        int iM1073k4 = 0;
        int iMax11 = 0;
        int i61 = 0;
        int iMax12 = 0;
        boolean z18 = false;
        boolean z19 = true;
        boolean z20 = false;
        while (iM1073k4 < virtualChildCount2) {
            View childAt9 = getChildAt(iM1073k4);
            if (childAt9 == null) {
                this.f1870g = m1078p() + this.f1870g;
                i14 = iMax10;
                i15 = i60;
            } else {
                i14 = iMax10;
                i15 = i60;
                if (childAt9.getVisibility() == 8) {
                    iM1073k4 += m1073k();
                } else {
                    if (m1076n(iM1073k4)) {
                        this.f1870g += this.f1876m;
                    }
                    a aVar9 = (a) childAt9.getLayoutParams();
                    float f9 = aVar9.f1880a;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar9).width == 0 && f9 > 0.0f) {
                        if (z17) {
                            this.f1870g = ((ViewGroup.MarginLayoutParams) aVar9).leftMargin + ((ViewGroup.MarginLayoutParams) aVar9).rightMargin + this.f1870g;
                        } else {
                            int i62 = this.f1870g;
                            this.f1870g = Math.max(i62, ((ViewGroup.MarginLayoutParams) aVar9).leftMargin + i62 + ((ViewGroup.MarginLayoutParams) aVar9).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            aVar3 = aVar9;
                            i18 = i14;
                            iMax3 = i15;
                            i20 = iM1073k4;
                            z = z16;
                            z2 = z15;
                        } else {
                            aVar3 = aVar9;
                            i18 = i14;
                            iMax3 = i15;
                            i20 = iM1073k4;
                            i22 = 1073741824;
                            z = z16;
                            z2 = z15;
                            z3 = true;
                        }
                        if (mode4 == i22 && ((ViewGroup.MarginLayoutParams) aVar3).height == -1) {
                            z4 = true;
                            z20 = true;
                        } else {
                            z4 = false;
                        }
                        i23 = ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i23;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i61, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i63 = aVar3.f1881b;
                            if (i63 < 0) {
                                i63 = this.f1869f;
                            }
                            int i64 = (((i63 & 112) >> 4) & (-2)) >> 1;
                            iArr[i64] = Math.max(iArr[i64], baseline2);
                            iArr2[i64] = Math.max(iArr2[i64], measuredHeight - baseline2);
                        }
                        int iMax13 = Math.max(iMax12, measuredHeight);
                        if (z19 || ((ViewGroup.MarginLayoutParams) aVar3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (aVar3.f1880a > 0.0f) {
                            if (z4) {
                                measuredHeight = i23;
                            }
                            iMax10 = Math.max(i18, measuredHeight);
                        } else {
                            int i65 = i18;
                            if (z4) {
                                measuredHeight = i23;
                            }
                            iMax3 = Math.max(iMax3, measuredHeight);
                            iMax10 = i65;
                        }
                        iM1073k4 = m1073k() + i20;
                        iMax12 = iMax13;
                        i61 = iCombineMeasuredStates4;
                        z18 = z3;
                        z19 = z5;
                        f8 = f10;
                        i60 = iMax3;
                    } else {
                        int i66 = iM1073k4;
                        if (((ViewGroup.MarginLayoutParams) aVar9).width == 0) {
                            f2 = 0.0f;
                            if (f9 > 0.0f) {
                                ((ViewGroup.MarginLayoutParams) aVar9).width = -2;
                                i16 = 0;
                            }
                            if (f10 == f2) {
                                i17 = this.f1870g;
                            } else {
                                i17 = 0;
                            }
                            i18 = i14;
                            iMax3 = i15;
                            i19 = i16;
                            i20 = i66;
                            z = z16;
                            z2 = z15;
                            m1077o(childAt9, i, i17, i2, 0);
                            if (i19 != Integer.MIN_VALUE) {
                                aVar3 = aVar9;
                                ((ViewGroup.MarginLayoutParams) aVar3).width = i19;
                            } else {
                                aVar3 = aVar9;
                            }
                            measuredWidth2 = childAt9.getMeasuredWidth();
                            i21 = this.f1870g;
                            if (z17) {
                                this.f1870g = m1075m() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + i21;
                            } else {
                                this.f1870g = Math.max(i21, m1075m() + i21 + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin);
                            }
                            if (z) {
                                iMax11 = Math.max(measuredWidth2, iMax11);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        i16 = RecyclerView.UNDEFINED_DURATION;
                        if (f10 == f2) {
                            i17 = this.f1870g;
                        } else {
                            i17 = 0;
                        }
                        i18 = i14;
                        iMax3 = i15;
                        i19 = i16;
                        i20 = i66;
                        z = z16;
                        z2 = z15;
                        m1077o(childAt9, i, i17, i2, 0);
                        if (i19 != Integer.MIN_VALUE) {
                            aVar3 = aVar9;
                            ((ViewGroup.MarginLayoutParams) aVar3).width = i19;
                        } else {
                            aVar3 = aVar9;
                        }
                        measuredWidth2 = childAt9.getMeasuredWidth();
                        i21 = this.f1870g;
                        if (z17) {
                            this.f1870g = m1075m() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + i21;
                        } else {
                            this.f1870g = Math.max(i21, m1075m() + i21 + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin);
                        }
                        if (z) {
                            iMax11 = Math.max(measuredWidth2, iMax11);
                        }
                    }
                    z3 = z18;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i23 = ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i23;
                    int iCombineMeasuredStates5 = View.combineMeasuredStates(i61, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    int iMax14 = Math.max(iMax12, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (aVar3.f1880a > 0.0f) {
                        if (z4) {
                            measuredHeight = i23;
                        }
                        iMax10 = Math.max(i18, measuredHeight);
                    } else {
                        int i67 = i18;
                        if (z4) {
                            measuredHeight = i23;
                        }
                        iMax3 = Math.max(iMax3, measuredHeight);
                        iMax10 = i67;
                    }
                    iM1073k4 = m1073k() + i20;
                    iMax12 = iMax14;
                    i61 = iCombineMeasuredStates5;
                    z18 = z3;
                    z19 = z5;
                    f8 = f10;
                    i60 = iMax3;
                }
                iM1073k4++;
                z16 = z;
                z15 = z2;
            }
            z2 = z15;
            iMax10 = i14;
            i60 = i15;
            z = z16;
            iM1073k4++;
            z16 = z;
            z15 = z2;
        }
        boolean z21 = z16;
        boolean z22 = z15;
        int i68 = i60;
        int i69 = iMax10;
        int iMax15 = i68;
        if (this.f1870g > 0 && m1076n(virtualChildCount2)) {
            this.f1870g += this.f1876m;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] != -1) {
            }
            if (z21 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f1870g = 0;
                iM1073k = 0;
                while (iM1073k < virtualChildCount2) {
                    childAt3 = getChildAt(iM1073k);
                    if (childAt3 == null) {
                        this.f1870g = m1078p() + this.f1870g;
                    } else if (childAt3.getVisibility() == 8) {
                        iM1073k += m1073k();
                    } else {
                        aVar2 = (a) childAt3.getLayoutParams();
                        i13 = this.f1870g;
                        if (z17) {
                            iMax2 = m1075m() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + iMax11 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + i13;
                        } else {
                            iMax2 = Math.max(i13, m1075m() + i13 + iMax11 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin);
                        }
                        this.f1870g = iMax2;
                    }
                    iM1073k++;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f1870g;
            this.f1870g = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            i3 = (16777215 & iResolveSizeAndState2) - this.f1870g;
            if (!z18 || (i3 != 0 && f8 > 0.0f)) {
                f = this.f1871h;
                if (f > 0.0f) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f1870g = 0;
                i4 = i3;
                iCombineMeasuredStates = i61;
                int iMax16 = -1;
                i5 = 0;
                while (i5 < virtualChildCount2) {
                    childAt = getChildAt(i5);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i8 = i4;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        a aVar10 = (a) childAt.getLayoutParams();
                        float f11 = aVar10.f1880a;
                        if (f11 > 0.0f) {
                            int i70 = (int) ((i4 * f11) / f8);
                            float f12 = f8 - f11;
                            int i71 = i4 - i70;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar10).topMargin + ((ViewGroup.MarginLayoutParams) aVar10).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar10).height);
                            if (((ViewGroup.MarginLayoutParams) aVar10).width != 0 || mode3 != 1073741824) {
                                measuredWidth = childAt.getMeasuredWidth() + i70;
                                if (measuredWidth < 0) {
                                    measuredWidth = 0;
                                }
                            } else if (i70 > 0) {
                                measuredWidth = i70;
                            } else {
                                measuredWidth = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec2);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f8 = f12;
                            i9 = i71;
                        } else {
                            i9 = i4;
                        }
                        if (z17) {
                            iMax = m1075m() + childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar10).leftMargin + ((ViewGroup.MarginLayoutParams) aVar10).rightMargin + this.f1870g;
                        } else {
                            int i72 = this.f1870g;
                            iMax = Math.max(i72, m1075m() + childAt.getMeasuredWidth() + i72 + ((ViewGroup.MarginLayoutParams) aVar10).leftMargin + ((ViewGroup.MarginLayoutParams) aVar10).rightMargin);
                        }
                        this.f1870g = iMax;
                        boolean z23 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar10).height == -1;
                        int i73 = ((ViewGroup.MarginLayoutParams) aVar10).topMargin + ((ViewGroup.MarginLayoutParams) aVar10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i73;
                        iMax16 = Math.max(iMax16, measuredHeight4);
                        if (!z23) {
                            i73 = measuredHeight4;
                        }
                        iMax15 = Math.max(iMax15, i73);
                        if (z19) {
                            i10 = -1;
                            boolean z24 = ((ViewGroup.MarginLayoutParams) aVar10).height == -1;
                            if (!z22 && (baseline = childAt.getBaseline()) != i10) {
                                int i74 = aVar10.f1881b;
                                if (i74 < 0) {
                                    i74 = this.f1869f;
                                }
                                int i75 = (((i74 & 112) >> 4) & (-2)) >> 1;
                                iArr[i75] = Math.max(iArr[i75], baseline);
                                iArr2[i75] = Math.max(iArr2[i75], measuredHeight4 - baseline);
                            }
                            z19 = z24;
                            i8 = i9;
                            f8 = f8;
                        } else {
                            i10 = -1;
                        }
                        if (!z22) {
                        }
                        z19 = z24;
                        i8 = i9;
                        f8 = f8;
                    }
                    i5++;
                    i4 = i8;
                    virtualChildCount2 = virtualChildCount2;
                }
                i6 = i2;
                i7 = virtualChildCount2;
                this.f1870g = getPaddingRight() + getPaddingLeft() + this.f1870g;
                if (iArr[1] != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c3 = 3;
                    if (iArr[3] == -1) {
                        iMax12 = iMax16;
                    }
                    if (z19 || mode4 == 1073741824) {
                        iMax15 = iMax12;
                    }
                    setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax15, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                    if (z20) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        i11 = i7;
                        for (i12 = 0; i12 < i11; i12++) {
                            childAt2 = getChildAt(i12);
                            if (childAt2.getVisibility() != 8) {
                                aVar = (a) childAt2.getLayoutParams();
                                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                                    int i76 = ((ViewGroup.MarginLayoutParams) aVar).width;
                                    ((ViewGroup.MarginLayoutParams) aVar).width = childAt2.getMeasuredWidth();
                                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                    ((ViewGroup.MarginLayoutParams) aVar).width = i76;
                                }
                            }
                        }
                    }
                }
                c3 = 3;
                iMax12 = Math.max(iMax16, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
                if (z19) {
                    iMax15 = iMax12;
                } else {
                    iMax15 = iMax12;
                }
                setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax15, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                if (z20) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    i11 = i7;
                    while (i12 < i11) {
                        childAt2 = getChildAt(i12);
                        if (childAt2.getVisibility() != 8) {
                            aVar = (a) childAt2.getLayoutParams();
                            if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                                int i77 = ((ViewGroup.MarginLayoutParams) aVar).width;
                                ((ViewGroup.MarginLayoutParams) aVar).width = childAt2.getMeasuredWidth();
                                measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                ((ViewGroup.MarginLayoutParams) aVar).width = i77;
                            }
                        }
                    }
                }
            }
            iMax15 = Math.max(iMax15, i69);
            if (z21 && mode3 != 1073741824) {
                for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                    View childAt10 = getChildAt(i78);
                    if (childAt10 != null && childAt10.getVisibility() != 8 && ((a) childAt10.getLayoutParams()).f1880a > 0.0f) {
                        childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax11, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = i2;
            i7 = virtualChildCount2;
            iCombineMeasuredStates = i61;
            if (z19) {
                iMax15 = iMax12;
            } else {
                iMax15 = iMax12;
            }
            setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax15, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
            if (z20) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i11 = i7;
                while (i12 < i11) {
                    childAt2 = getChildAt(i12);
                    if (childAt2.getVisibility() != 8) {
                        aVar = (a) childAt2.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            int i79 = ((ViewGroup.MarginLayoutParams) aVar).width;
                            ((ViewGroup.MarginLayoutParams) aVar).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((ViewGroup.MarginLayoutParams) aVar).width = i79;
                        }
                    }
                }
            }
        }
        c2 = 3;
        iMax12 = Math.max(iMax12, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z21) {
            this.f1870g = 0;
            iM1073k = 0;
            while (iM1073k < virtualChildCount2) {
                childAt3 = getChildAt(iM1073k);
                if (childAt3 == null) {
                    this.f1870g = m1078p() + this.f1870g;
                } else if (childAt3.getVisibility() == 8) {
                    iM1073k += m1073k();
                } else {
                    aVar2 = (a) childAt3.getLayoutParams();
                    i13 = this.f1870g;
                    if (z17) {
                        iMax2 = m1075m() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + iMax11 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + i13;
                    } else {
                        iMax2 = Math.max(i13, m1075m() + i13 + iMax11 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin);
                    }
                    this.f1870g = iMax2;
                }
                iM1073k++;
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f1870g;
        this.f1870g = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i3 = (16777215 & iResolveSizeAndState3) - this.f1870g;
        if (z18) {
            f = this.f1871h;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1870g = 0;
            i4 = i3;
            iCombineMeasuredStates = i61;
            int iMax17 = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                }
                i5++;
                i4 = i8;
                virtualChildCount2 = virtualChildCount2;
            }
            i6 = i2;
            i7 = virtualChildCount2;
            this.f1870g = getPaddingRight() + getPaddingLeft() + this.f1870g;
            if (iArr[1] != -1) {
                c3 = 3;
            } else {
                c3 = 3;
            }
            iMax12 = Math.max(iMax17, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        } else {
            f = this.f1871h;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1870g = 0;
            i4 = i3;
            iCombineMeasuredStates = i61;
            int iMax18 = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                }
                i5++;
                i4 = i8;
                virtualChildCount2 = virtualChildCount2;
            }
            i6 = i2;
            i7 = virtualChildCount2;
            this.f1870g = getPaddingRight() + getPaddingLeft() + this.f1870g;
            if (iArr[1] != -1) {
                c3 = 3;
            } else {
                c3 = 3;
            }
            iMax12 = Math.max(iMax18, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z19) {
            iMax15 = iMax12;
        } else {
            iMax15 = iMax12;
        }
        setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax15, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
        if (z20) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i11 = i7;
            while (i12 < i11) {
                childAt2 = getChildAt(i12);
                if (childAt2.getVisibility() != 8) {
                    aVar = (a) childAt2.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                        int i710 = ((ViewGroup.MarginLayoutParams) aVar).width;
                        ((ViewGroup.MarginLayoutParams) aVar).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((ViewGroup.MarginLayoutParams) aVar).width = i710;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public int m1078p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.f1865b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1866c = i;
            return;
        }
        StringBuilder sbM2191e = a.m2191e("base aligned child index out of range (0, ");
        sbM2191e.append(getChildCount());
        sbM2191e.append(")");
        throw new IllegalArgumentException(sbM2191e.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1875l) {
            return;
        }
        this.f1875l = drawable;
        if (drawable != null) {
            this.f1876m = drawable.getIntrinsicWidth();
            this.f1877n = drawable.getIntrinsicHeight();
        } else {
            this.f1876m = 0;
            this.f1877n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1879p = i;
    }

    public void setGravity(int i) {
        if (this.f1869f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1869f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1869f;
        if ((8388615 & i3) != i2) {
            this.f1869f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1872i = z;
    }

    public void setOrientation(int i) {
        if (this.f1868e != i) {
            this.f1868e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1878o) {
            requestLayout();
        }
        this.f1878o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1869f;
        if ((i3 & 112) != i2) {
            this.f1869f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1871h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
