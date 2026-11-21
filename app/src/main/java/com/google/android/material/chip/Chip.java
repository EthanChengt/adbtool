package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p018i.C0259g;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p042h.C0396a;
import p006b.p032h.p042h.C0399d;
import p006b.p032h.p042h.C0400e;
import p006b.p032h.p042h.InterfaceC0398c;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p049j.p051b.AbstractC0443a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p131c.C1188g;
import p080c.p126d.p127a.p128a.p140k.C1217a;
import p080c.p126d.p127a.p128a.p140k.C1218b;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p151u.AbstractC1285d;
import p080c.p126d.p127a.p128a.p151u.C1283b;
import p080c.p126d.p127a.p128a.p152v.C1287b;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;
import p080c.p126d.p127a.p128a.p154x.InterfaceC1303n;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0259g implements C1218b.a, InterfaceC1303n {

    /* JADX INFO: renamed from: u */
    public static final Rect f10241u = new Rect();

    /* JADX INFO: renamed from: v */
    public static final int[] f10242v = {R.attr.state_selected};

    /* JADX INFO: renamed from: w */
    public static final int[] f10243w = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C1218b f10244e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f10245f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f10246g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f10247h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f10248i;

    /* JADX INFO: renamed from: j */
    public boolean f10249j;

    /* JADX INFO: renamed from: k */
    public boolean f10250k;

    /* JADX INFO: renamed from: l */
    public boolean f10251l;

    /* JADX INFO: renamed from: m */
    public boolean f10252m;

    /* JADX INFO: renamed from: n */
    public boolean f10253n;

    /* JADX INFO: renamed from: o */
    public int f10254o;

    /* JADX INFO: renamed from: p */
    public int f10255p;

    /* JADX INFO: renamed from: q */
    public final C1351b f10256q;

    /* JADX INFO: renamed from: r */
    public final Rect f10257r;

    /* JADX INFO: renamed from: s */
    public final RectF f10258s;

    /* JADX INFO: renamed from: t */
    public final AbstractC1285d f10259t;

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$a */
    public class C1350a extends AbstractC1285d {
        public C1350a() {
        }

        @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
        /* JADX INFO: renamed from: a */
        public void mo2941a(int i) {
        }

        @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
        /* JADX INFO: renamed from: b */
        public void mo2942b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            C1218b c1218b = chip.f10244e;
            chip.setText(c1218b.f5789C0 ? c1218b.f5792E : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$b */
    public class C1351b extends AbstractC0443a {
        public C1351b(Chip chip) {
            super(chip);
        }

        @Override // p006b.p049j.p051b.AbstractC0443a
        /* JADX INFO: renamed from: n */
        public int mo1636n(float f, float f2) {
            Chip chip = Chip.this;
            Rect rect = Chip.f10241u;
            return (chip.m3097e() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p006b.p049j.p051b.AbstractC0443a
        /* JADX INFO: renamed from: o */
        public void mo1637o(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f10241u;
            if (chip.m3097e()) {
                C1218b c1218b = Chip.this.f10244e;
                if (c1218b != null && c1218b.f5799K) {
                    z = true;
                }
                if (z) {
                    list.add(1);
                }
            }
        }

        @Override // p006b.p049j.p051b.AbstractC0443a
        /* JADX INFO: renamed from: r */
        public boolean mo1640r(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f10247h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.f10256q.m1645w(1, 1);
                }
            }
            return z;
        }

        @Override // p006b.p049j.p051b.AbstractC0443a
        /* JADX INFO: renamed from: s */
        public void mo1641s(C0429b c0429b) {
            c0429b.f2743a.setCheckable(Chip.this.m3098f());
            c0429b.f2743a.setClickable(Chip.this.isClickable());
            if (Chip.this.m3098f() || Chip.this.isClickable()) {
                c0429b.f2743a.setClassName(Chip.this.m3098f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                c0429b.f2743a.setClassName("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c0429b.f2743a.setText(text);
            } else {
                c0429b.f2743a.setContentDescription(text);
            }
        }

        @Override // p006b.p049j.p051b.AbstractC0443a
        /* JADX INFO: renamed from: t */
        public void mo1642t(int i, C0429b c0429b) {
            if (i != 1) {
                c0429b.f2743a.setContentDescription("");
                c0429b.f2743a.setBoundsInParent(Chip.f10241u);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(com.didjdk.adbhelper.R.string.d9, objArr).trim();
            }
            c0429b.f2743a.setContentDescription(closeIconContentDescription);
            c0429b.f2743a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            C0429b.a aVar = C0429b.a.f2748g;
            if (Build.VERSION.SDK_INT >= 21) {
                c0429b.f2743a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2752a);
            }
            c0429b.f2743a.setEnabled(Chip.this.isEnabled());
        }

        @Override // p006b.p049j.p051b.AbstractC0443a
        /* JADX INFO: renamed from: u */
        public void mo1643u(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f10252m = z;
                chip.refreshDrawableState();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0310  */
    /* JADX WARN: Code duplicated, block: B:88:0x0320  */
    public Chip(Context context, AttributeSet attributeSet) {
        TextUtils.TruncateAt truncateAt;
        TypedArray typedArrayObtainStyledAttributes;
        int i;
        boolean zHasValue;
        C1351b c1351b;
        int resourceId;
        super(context, attributeSet, com.didjdk.adbhelper.R.attr.da);
        this.f10257r = new Rect();
        this.f10258s = new RectF();
        this.f10259t = new C1350a();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1218b c1218b = new C1218b(context, attributeSet, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
        Context context2 = c1218b.f5818d0;
        int[] iArr = C1164b.f5567e;
        TypedArray typedArrayM2947e = C1277n.m2947e(context2, attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc, new int[0]);
        c1218b.f5793E0 = typedArrayM2947e.hasValue(35);
        ColorStateList colorStateListM2723h = C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 22);
        if (c1218b.f5838x != colorStateListM2723h) {
            c1218b.f5838x = colorStateListM2723h;
            c1218b.onStateChange(c1218b.getState());
        }
        c1218b.m2811O(C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 9));
        c1218b.m2818V(typedArrayM2947e.getDimension(17, 0.0f));
        if (typedArrayM2947e.hasValue(10)) {
            c1218b.m2812P(typedArrayM2947e.getDimension(10, 0.0f));
        }
        c1218b.m2820X(C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 20));
        c1218b.m2821Y(typedArrayM2947e.getDimension(21, 0.0f));
        c1218b.m2831i0(C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 34));
        c1218b.m2832j0(typedArrayM2947e.getText(4));
        c1218b.m2833k0((!typedArrayM2947e.hasValue(0) || (resourceId = typedArrayM2947e.getResourceId(0, 0)) == 0) ? null : new C1283b(c1218b.f5818d0, resourceId));
        int i2 = typedArrayM2947e.getInt(2, 0);
        if (i2 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    truncateAt = TextUtils.TruncateAt.END;
                }
                c1218b.m2817U(typedArrayM2947e.getBoolean(16, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                    c1218b.m2817U(typedArrayM2947e.getBoolean(13, false));
                }
                c1218b.m2814R(C1161a.m2726k(c1218b.f5818d0, typedArrayM2947e, 12));
                if (typedArrayM2947e.hasValue(15)) {
                    c1218b.m2816T(C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 15));
                }
                c1218b.m2815S(typedArrayM2947e.getDimension(14, 0.0f));
                c1218b.m2828f0(typedArrayM2947e.getBoolean(29, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                    c1218b.m2828f0(typedArrayM2947e.getBoolean(24, false));
                }
                c1218b.m2822Z(C1161a.m2726k(c1218b.f5818d0, typedArrayM2947e, 23));
                c1218b.m2827e0(C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 28));
                c1218b.m2824b0(typedArrayM2947e.getDimension(26, 0.0f));
                c1218b.m2808L(typedArrayM2947e.getBoolean(5, false));
                c1218b.m2810N(typedArrayM2947e.getBoolean(8, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                    c1218b.m2810N(typedArrayM2947e.getBoolean(7, false));
                }
                c1218b.m2809M(C1161a.m2726k(c1218b.f5818d0, typedArrayM2947e, 6));
                c1218b.f5808T = C1188g.m2764a(c1218b.f5818d0, typedArrayM2947e, 37);
                c1218b.f5809U = C1188g.m2764a(c1218b.f5818d0, typedArrayM2947e, 31);
                c1218b.m2819W(typedArrayM2947e.getDimension(19, 0.0f));
                c1218b.m2830h0(typedArrayM2947e.getDimension(33, 0.0f));
                c1218b.m2829g0(typedArrayM2947e.getDimension(32, 0.0f));
                c1218b.m2835m0(typedArrayM2947e.getDimension(39, 0.0f));
                c1218b.m2834l0(typedArrayM2947e.getDimension(38, 0.0f));
                c1218b.m2825c0(typedArrayM2947e.getDimension(27, 0.0f));
                c1218b.m2823a0(typedArrayM2947e.getDimension(25, 0.0f));
                c1218b.m2813Q(typedArrayM2947e.getDimension(11, 0.0f));
                c1218b.f5791D0 = typedArrayM2947e.getDimensionPixelSize(3, Integer.MAX_VALUE);
                typedArrayM2947e.recycle();
                C1277n.m2943a(context, attributeSet, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
                C1277n.m2944b(context, attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc, new int[0]);
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
                this.f10253n = typedArrayObtainStyledAttributes2.getBoolean(30, false);
                this.f10255p = (int) Math.ceil(typedArrayObtainStyledAttributes2.getDimension(18, (float) Math.ceil(C1161a.m2720e(getContext(), 48))));
                typedArrayObtainStyledAttributes2.recycle();
                setChipDrawable(c1218b);
                c1218b.m2974o(C0418m.m1566i(this));
                C1277n.m2943a(context, attributeSet, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
                C1277n.m2944b(context, attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc, new int[0]);
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
                i = Build.VERSION.SDK_INT;
                if (i < 23) {
                    setTextColor(C1161a.m2723h(context, typedArrayObtainStyledAttributes, 1));
                }
                zHasValue = typedArrayObtainStyledAttributes.hasValue(35);
                typedArrayObtainStyledAttributes.recycle();
                c1351b = new C1351b(this);
                this.f10256q = c1351b;
                if (i >= 24) {
                    C0418m.m1577t(this, c1351b);
                } else {
                    m3100h();
                }
                if (!zHasValue && i >= 21) {
                    setOutlineProvider(new C1217a(this));
                }
                setChecked(this.f10249j);
                setText(c1218b.f5792E);
                setEllipsize(c1218b.f5787B0);
                setIncludeFontPadding(false);
                m3104l();
                if (!this.f10244e.f5789C0) {
                    setSingleLine();
                }
                setGravity(8388627);
                m3103k();
                if (this.f10253n) {
                    setMinHeight(this.f10255p);
                }
                this.f10254o = getLayoutDirection();
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        c1218b.f5787B0 = truncateAt;
        c1218b.m2817U(typedArrayM2947e.getBoolean(16, false));
        if (attributeSet != null) {
            c1218b.m2817U(typedArrayM2947e.getBoolean(13, false));
        }
        c1218b.m2814R(C1161a.m2726k(c1218b.f5818d0, typedArrayM2947e, 12));
        if (typedArrayM2947e.hasValue(15)) {
            c1218b.m2816T(C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 15));
        }
        c1218b.m2815S(typedArrayM2947e.getDimension(14, 0.0f));
        c1218b.m2828f0(typedArrayM2947e.getBoolean(29, false));
        if (attributeSet != null) {
            c1218b.m2828f0(typedArrayM2947e.getBoolean(24, false));
        }
        c1218b.m2822Z(C1161a.m2726k(c1218b.f5818d0, typedArrayM2947e, 23));
        c1218b.m2827e0(C1161a.m2723h(c1218b.f5818d0, typedArrayM2947e, 28));
        c1218b.m2824b0(typedArrayM2947e.getDimension(26, 0.0f));
        c1218b.m2808L(typedArrayM2947e.getBoolean(5, false));
        c1218b.m2810N(typedArrayM2947e.getBoolean(8, false));
        if (attributeSet != null) {
            c1218b.m2810N(typedArrayM2947e.getBoolean(7, false));
        }
        c1218b.m2809M(C1161a.m2726k(c1218b.f5818d0, typedArrayM2947e, 6));
        c1218b.f5808T = C1188g.m2764a(c1218b.f5818d0, typedArrayM2947e, 37);
        c1218b.f5809U = C1188g.m2764a(c1218b.f5818d0, typedArrayM2947e, 31);
        c1218b.m2819W(typedArrayM2947e.getDimension(19, 0.0f));
        c1218b.m2830h0(typedArrayM2947e.getDimension(33, 0.0f));
        c1218b.m2829g0(typedArrayM2947e.getDimension(32, 0.0f));
        c1218b.m2835m0(typedArrayM2947e.getDimension(39, 0.0f));
        c1218b.m2834l0(typedArrayM2947e.getDimension(38, 0.0f));
        c1218b.m2825c0(typedArrayM2947e.getDimension(27, 0.0f));
        c1218b.m2823a0(typedArrayM2947e.getDimension(25, 0.0f));
        c1218b.m2813Q(typedArrayM2947e.getDimension(11, 0.0f));
        c1218b.f5791D0 = typedArrayM2947e.getDimensionPixelSize(3, Integer.MAX_VALUE);
        typedArrayM2947e.recycle();
        C1277n.m2943a(context, attributeSet, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
        C1277n.m2944b(context, attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
        this.f10253n = typedArrayObtainStyledAttributes3.getBoolean(30, false);
        this.f10255p = (int) Math.ceil(typedArrayObtainStyledAttributes3.getDimension(18, (float) Math.ceil(C1161a.m2720e(getContext(), 48))));
        typedArrayObtainStyledAttributes3.recycle();
        setChipDrawable(c1218b);
        c1218b.m2974o(C0418m.m1566i(this));
        C1277n.m2943a(context, attributeSet, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
        C1277n.m2944b(context, attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc, new int[0]);
        typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.didjdk.adbhelper.R.attr.da, com.didjdk.adbhelper.R.style.qc);
        i = Build.VERSION.SDK_INT;
        if (i < 23) {
            setTextColor(C1161a.m2723h(context, typedArrayObtainStyledAttributes, 1));
        }
        zHasValue = typedArrayObtainStyledAttributes.hasValue(35);
        typedArrayObtainStyledAttributes.recycle();
        c1351b = new C1351b(this);
        this.f10256q = c1351b;
        if (i >= 24) {
            C0418m.m1577t(this, c1351b);
        } else {
            m3100h();
        }
        if (!zHasValue) {
            setOutlineProvider(new C1217a(this));
        }
        setChecked(this.f10249j);
        setText(c1218b.f5792E);
        setEllipsize(c1218b.f5787B0);
        setIncludeFontPadding(false);
        m3104l();
        if (!this.f10244e.f5789C0) {
            setSingleLine();
        }
        setGravity(8388627);
        m3103k();
        if (this.f10253n) {
            setMinHeight(this.f10255p);
        }
        this.f10254o = getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f10258s.setEmpty();
        if (m3097e()) {
            C1218b c1218b = this.f10244e;
            c1218b.m2802D(c1218b.getBounds(), this.f10258s);
        }
        return this.f10258s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f10257r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f10257r;
    }

    private C1283b getTextAppearance() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5824j0.f6149f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f10251l != z) {
            this.f10251l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f10250k != z) {
            this.f10250k = z;
            refreshDrawableState();
        }
    }

    @Override // p080c.p126d.p127a.p128a.p140k.C1218b.a
    /* JADX INFO: renamed from: a */
    public void mo2842a() {
        m3096d(this.f10255p);
        m3101i();
        m3103k();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m3096d(int i) {
        this.f10255p = i;
        if (!this.f10253n) {
            m3099g();
            return false;
        }
        int iMax = Math.max(0, i - ((int) this.f10244e.f5842z));
        int iMax2 = Math.max(0, i - this.f10244e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            m3099g();
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f10245f != null) {
            Rect rect = new Rect();
            this.f10245f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f10245f = new InsetDrawable((Drawable) this.f10244e, i2, i3, i2, i3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC0443a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f10256q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC0443a.class.getDeclaredMethod("x", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f10256q, Integer.valueOf(RecyclerView.UNDEFINED_DURATION));
                    z = true;
                } else {
                    z = false;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
        } else {
            z = false;
        }
        return z || this.f10256q.m1635m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        C1351b c1351b = this.f10256q;
        Objects.requireNonNull(c1351b);
        boolean zM1638p = false;
        int i2 = 0;
        zM1638p = false;
        zM1638p = false;
        zM1638p = false;
        zM1638p = false;
        zM1638p = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c1351b.m1638p(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM1638p = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = c1351b.f2824l;
                                if (i != Integer.MIN_VALUE) {
                                    c1351b.mo1640r(i, 16, null);
                                }
                                zM1638p = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = c1351b.f2824l;
                    if (i != Integer.MIN_VALUE) {
                        c1351b.mo1640r(i, 16, null);
                    }
                    zM1638p = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM1638p = c1351b.m1638p(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM1638p = c1351b.m1638p(1, null);
            }
        }
        if (!zM1638p || this.f10256q.f2824l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p006b.p008b.p018i.C0259g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C1218b c1218b = this.f10244e;
        boolean zM2826d0 = false;
        int i2 = 0;
        zM2826d0 = false;
        if (c1218b != null && C1218b.m2798I(c1218b.f5800L)) {
            C1218b c1218b2 = this.f10244e;
            int IsEnabled = isEnabled() ? 1 : 0;
            if (this.f10252m) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f10251l) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f10250k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f10252m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f10251l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f10250k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zM2826d0 = c1218b2.m2826d0(iArr);
        }
        if (zM2826d0) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3097e() {
        C1218b c1218b = this.f10244e;
        return (c1218b == null || c1218b.m2805G() == null) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3098f() {
        C1218b c1218b = this.f10244e;
        return c1218b != null && c1218b.f5805Q;
    }

    /* JADX INFO: renamed from: g */
    public final void m3099g() {
        if (this.f10245f != null) {
            this.f10245f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m3101i();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10245f;
        return insetDrawable == null ? this.f10244e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5807S;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5840y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.m2804F();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10244e;
    }

    public float getChipEndPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5817c0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C1218b c1218b = this.f10244e;
        if (c1218b == null || (drawable = c1218b.f5795G) == null) {
            return null;
        }
        return C0360f.m1442d0(drawable);
    }

    public float getChipIconSize() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5797I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5796H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5842z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5810V;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5786B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5788C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.m2805G();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5804P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5816b0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5803O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5815a0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5802N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5787B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        C1351b c1351b = this.f10256q;
        if (c1351b.f2824l == 1 || c1351b.f2823k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1188g getHideMotionSpec() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5809U;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5812X;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5811W;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5790D;
        }
        return null;
    }

    public C1299j getShapeAppearanceModel() {
        return this.f10244e.f6211b.f6233a;
    }

    public C1188g getShowMotionSpec() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5808T;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5814Z;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            return c1218b.f5813Y;
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    /* JADX INFO: renamed from: h */
    public final void m3100h() {
        C1351b c1351b;
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        if (m3097e()) {
            C1218b c1218b = this.f10244e;
            if (c1218b != null && c1218b.f5799K) {
                c1351b = this.f10256q;
            } else {
                c1351b = null;
            }
        } else {
            c1351b = null;
        }
        C0418m.m1577t(this, c1351b);
    }

    /* JADX INFO: renamed from: i */
    public final void m3101i() {
        if (C1287b.f6184a) {
            m3102j();
            return;
        }
        this.f10244e.m2836n0(true);
        Drawable backgroundDrawable = getBackgroundDrawable();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setBackground(backgroundDrawable);
        if (getBackgroundDrawable() == this.f10245f && this.f10244e.getCallback() == null) {
            this.f10244e.setCallback(this.f10245f);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3102j() {
        this.f10246g = new RippleDrawable(C1287b.m2955b(this.f10244e.f5790D), getBackgroundDrawable(), null);
        this.f10244e.m2836n0(false);
        RippleDrawable rippleDrawable = this.f10246g;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setBackground(rippleDrawable);
    }

    /* JADX INFO: renamed from: k */
    public final void m3103k() {
        C1218b c1218b;
        if (TextUtils.isEmpty(getText()) || (c1218b = this.f10244e) == null) {
            return;
        }
        int iM2803E = (int) (c1218b.m2803E() + c1218b.f5817c0 + c1218b.f5814Z);
        C1218b c1218b2 = this.f10244e;
        int iM2800B = (int) (c1218b2.m2800B() + c1218b2.f5810V + c1218b2.f5813Y);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setPaddingRelative(iM2800B, paddingTop, iM2803E, paddingBottom);
    }

    /* JADX INFO: renamed from: l */
    public final void m3104l() {
        TextPaint paint = getPaint();
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            paint.drawableState = c1218b.getState();
        }
        C1283b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m2952c(getContext(), paint, this.f10259t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1161a.m2739x(this, this.f10244e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f10242v);
        }
        if (m3098f()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f10243w);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C1351b c1351b = this.f10256q;
        int i2 = c1351b.f2824l;
        if (i2 != Integer.MIN_VALUE) {
            c1351b.m1633k(i2);
        }
        if (z) {
            c1351b.m1638p(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (m3098f() || isClickable()) {
            str = m3098f() ? "android.widget.CompoundButton" : "android.widget.Button";
        } else {
            str = "android.view.View";
        }
        accessibilityNodeInfo.setClassName(str);
        accessibilityNodeInfo.setCheckable(m3098f());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f10254o != i) {
            this.f10254o = i;
            m3103k();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f10250k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f10250k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f10247h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.f10256q.m1645w(1, 1);
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10246g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p006b.p008b.p018i.C0259g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10246g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p006b.p008b.p018i.C0259g, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2808L(z);
        }
    }

    public void setCheckableResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2808L(c1218b.f5818d0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C1218b c1218b = this.f10244e;
        if (c1218b == null) {
            this.f10249j = z;
            return;
        }
        if (c1218b.f5805Q) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.f10248i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2809M(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2809M(C0208a.m884b(c1218b.f5818d0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2810N(c1218b.f5818d0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2810N(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1218b c1218b = this.f10244e;
        if (c1218b == null || c1218b.f5840y == colorStateList) {
            return;
        }
        c1218b.f5840y = colorStateList;
        c1218b.onStateChange(c1218b.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2811O(C0208a.m883a(c1218b.f5818d0, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2812P(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2812P(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C1218b c1218b) {
        C1218b c1218b2 = this.f10244e;
        if (c1218b2 != c1218b) {
            if (c1218b2 != null) {
                c1218b2.f5785A0 = new WeakReference<>(null);
            }
            this.f10244e = c1218b;
            c1218b.f5789C0 = false;
            Objects.requireNonNull(c1218b);
            c1218b.f5785A0 = new WeakReference<>(this);
            m3096d(this.f10255p);
            m3101i();
        }
    }

    public void setChipEndPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b == null || c1218b.f5817c0 == f) {
            return;
        }
        c1218b.f5817c0 = f;
        c1218b.invalidateSelf();
        c1218b.m2806J();
    }

    public void setChipEndPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2813Q(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2814R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2814R(C0208a.m884b(c1218b.f5818d0, i));
        }
    }

    public void setChipIconSize(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2815S(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2815S(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2816T(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2816T(C0208a.m883a(c1218b.f5818d0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2817U(c1218b.f5818d0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2817U(z);
        }
    }

    public void setChipMinHeight(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b == null || c1218b.f5842z == f) {
            return;
        }
        c1218b.f5842z = f;
        c1218b.invalidateSelf();
        c1218b.m2806J();
    }

    public void setChipMinHeightResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2818V(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b == null || c1218b.f5810V == f) {
            return;
        }
        c1218b.f5810V = f;
        c1218b.invalidateSelf();
        c1218b.m2806J();
    }

    public void setChipStartPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2819W(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2820X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2820X(C0208a.m883a(c1218b.f5818d0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2821Y(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2821Y(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2822Z(drawable);
        }
        m3100h();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0396a c0396a;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        C1218b c1218b = this.f10244e;
        if (c1218b == null || c1218b.f5804P == charSequence) {
            return;
        }
        InterfaceC0398c interfaceC0398c = C0396a.f2669d;
        Locale locale = Locale.getDefault();
        Locale locale2 = C0400e.f2693a;
        boolean z = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        InterfaceC0398c interfaceC0398c2 = C0396a.f2669d;
        if (interfaceC0398c2 == interfaceC0398c2) {
            c0396a = z ? C0396a.f2673h : C0396a.f2672g;
        } else {
            c0396a = new C0396a(z, 2, interfaceC0398c2);
        }
        InterfaceC0398c interfaceC0398c3 = c0396a.f2676c;
        if (charSequence == null) {
            spannableStringBuilder = null;
        } else {
            boolean zM1534b = ((C0399d.c) interfaceC0398c3).m1534b(charSequence, 0, charSequence.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String str2 = "";
            if ((2 & c0396a.f2675b) != 0) {
                boolean zM1534b2 = ((C0399d.c) (zM1534b ? C0399d.f2687b : C0399d.f2686a)).m1534b(charSequence, 0, charSequence.length());
                if (c0396a.f2674a || !(zM1534b2 || C0396a.m1528a(charSequence) == 1)) {
                    str = (!c0396a.f2674a || (zM1534b2 && C0396a.m1528a(charSequence) != -1)) ? "" : C0396a.f2671f;
                } else {
                    str = C0396a.f2670e;
                }
                spannableStringBuilder2.append((CharSequence) str);
            }
            if (zM1534b != c0396a.f2674a) {
                spannableStringBuilder2.append(zM1534b ? (char) 8235 : (char) 8234);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((char) 8236);
            } else {
                spannableStringBuilder2.append(charSequence);
            }
            boolean zM1534b3 = ((C0399d.c) (zM1534b ? C0399d.f2687b : C0399d.f2686a)).m1534b(charSequence, 0, charSequence.length());
            if (!c0396a.f2674a && (zM1534b3 || C0396a.m1529b(charSequence) == 1)) {
                str2 = C0396a.f2670e;
            } else if (c0396a.f2674a && (!zM1534b3 || C0396a.m1529b(charSequence) == -1)) {
                str2 = C0396a.f2671f;
            }
            spannableStringBuilder2.append((CharSequence) str2);
            spannableStringBuilder = spannableStringBuilder2;
        }
        c1218b.f5804P = spannableStringBuilder;
        c1218b.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2823a0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2823a0(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2822Z(C0208a.m884b(c1218b.f5818d0, i));
        }
        m3100h();
    }

    public void setCloseIconSize(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2824b0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2824b0(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2825c0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2825c0(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2827e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2827e0(C0208a.m883a(c1218b.f5818d0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2828f0(z);
        }
        m3100h();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            C1296g.b bVar = c1218b.f6211b;
            if (bVar.f6247o != f) {
                bVar.f6247o = f;
                c1218b.m2984y();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10244e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5787B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f10253n = z;
        m3096d(this.f10255p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1188g c1188g) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5809U = c1188g;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5809U = C1188g.m2765b(c1218b.f5818d0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2829g0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2829g0(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2830h0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2830h0(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f10244e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5791D0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10248i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10247h = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2831i0(colorStateList);
        }
        if (this.f10244e.f5841y0) {
            return;
        }
        m3102j();
    }

    public void setRippleColorResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2831i0(C0208a.m883a(c1218b.f5818d0, i));
            if (this.f10244e.f5841y0) {
                return;
            }
            m3102j();
        }
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1303n
    public void setShapeAppearanceModel(C1299j c1299j) {
        C1218b c1218b = this.f10244e;
        c1218b.f6211b.f6233a = c1299j;
        c1218b.invalidateSelf();
    }

    public void setShowMotionSpec(C1188g c1188g) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5808T = c1188g;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5808T = C1188g.m2765b(c1218b.f5818d0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1218b c1218b = this.f10244e;
        if (c1218b == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1218b.f5789C0 ? null : charSequence, bufferType);
        C1218b c1218b2 = this.f10244e;
        if (c1218b2 != null) {
            c1218b2.m2832j0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5824j0.m2940b(new C1283b(c1218b.f5818d0, i), c1218b.f5818d0);
        }
        m3104l();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b == null || c1218b.f5814Z == f) {
            return;
        }
        c1218b.f5814Z = f;
        c1218b.invalidateSelf();
        c1218b.m2806J();
    }

    public void setTextEndPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2834l0(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        C1218b c1218b = this.f10244e;
        if (c1218b == null || c1218b.f5813Y == f) {
            return;
        }
        c1218b.f5813Y = f;
        c1218b.invalidateSelf();
        c1218b.m2806J();
    }

    public void setTextStartPaddingResource(int i) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.m2835m0(c1218b.f5818d0.getResources().getDimension(i));
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5824j0.m2940b(new C1283b(c1218b.f5818d0, i), c1218b.f5818d0);
        }
        m3104l();
    }

    public void setTextAppearance(C1283b c1283b) {
        C1218b c1218b = this.f10244e;
        if (c1218b != null) {
            c1218b.f5824j0.m2940b(c1283b, c1218b.f5818d0);
        }
        m3104l();
    }
}
