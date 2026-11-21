package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p006b.p023d.C0305b;
import p006b.p023d.p024c.C0306a;
import p006b.p023d.p024c.C0307b;
import p006b.p023d.p024c.InterfaceC0309d;
import p006b.p023d.p024c.InterfaceC0310e;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final int[] f425i = {R.attr.colorBackground};

    /* JADX INFO: renamed from: j */
    public static final InterfaceC0310e f426j;

    /* JADX INFO: renamed from: b */
    public boolean f427b;

    /* JADX INFO: renamed from: c */
    public boolean f428c;

    /* JADX INFO: renamed from: d */
    public int f429d;

    /* JADX INFO: renamed from: e */
    public int f430e;

    /* JADX INFO: renamed from: f */
    public final Rect f431f;

    /* JADX INFO: renamed from: g */
    public final Rect f432g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0309d f433h;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$a */
    public class C0064a implements InterfaceC0309d {

        /* JADX INFO: renamed from: a */
        public Drawable f434a;

        public C0064a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m131a() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* JADX INFO: renamed from: b */
        public void m132b(int i, int i2, int i3, int i4) {
            CardView.this.f432g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f431f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        InterfaceC0310e c0307b = Build.VERSION.SDK_INT >= 21 ? new C0307b() : new C0306a();
        f426j = c0307b;
        c0307b.mo1202n();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        Resources resources;
        int i;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.didjdk.adbhelper.R.attr.ci);
        Rect rect = new Rect();
        this.f431f = rect;
        this.f432g = new Rect();
        C0064a c0064a = new C0064a();
        this.f433h = c0064a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0305b.f2117a, com.didjdk.adbhelper.R.attr.ci, com.didjdk.adbhelper.R.style.eu);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f425i);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = com.didjdk.adbhelper.R.color.ai;
            } else {
                resources = getResources();
                i = com.didjdk.adbhelper.R.color.ah;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f427b = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f428c = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f429d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f430e = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        f426j.mo1211h(c0064a, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return f426j.mo1209f(this.f433h);
    }

    public float getCardElevation() {
        return f426j.mo1215l(this.f433h);
    }

    public int getContentPaddingBottom() {
        return this.f431f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f431f.left;
    }

    public int getContentPaddingRight() {
        return this.f431f.right;
    }

    public int getContentPaddingTop() {
        return this.f431f.top;
    }

    public float getMaxCardElevation() {
        return f426j.mo1204a(this.f433h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f428c;
    }

    public float getRadius() {
        return f426j.mo1205b(this.f433h);
    }

    public boolean getUseCompatPadding() {
        return this.f427b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC0310e interfaceC0310e = f426j;
        if (!(interfaceC0310e instanceof C0307b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC0310e.mo1207d(this.f433h)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC0310e.mo1206c(this.f433h)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f426j.mo1214k(this.f433h, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f426j.mo1214k(this.f433h, colorStateList);
    }

    public void setCardElevation(float f) {
        f426j.mo1210g(this.f433h, f);
    }

    public void setMaxCardElevation(float f) {
        f426j.mo1216m(this.f433h, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f430e = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f429d = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f428c) {
            this.f428c = z;
            f426j.mo1213j(this.f433h);
        }
    }

    public void setRadius(float f) {
        f426j.mo1212i(this.f433h, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f427b != z) {
            this.f427b = z;
            f426j.mo1208e(this.f433h);
        }
    }
}
