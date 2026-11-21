package p006b.p008b.p018i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p032h.p046k.InterfaceC0433b;
import p006b.p032h.p046k.InterfaceC0437f;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.b.i.y */
/* JADX INFO: loaded from: classes.dex */
public class C0295y {

    /* JADX INFO: renamed from: a */
    public final TextView f2054a;

    /* JADX INFO: renamed from: b */
    public C0290v0 f2055b;

    /* JADX INFO: renamed from: c */
    public C0290v0 f2056c;

    /* JADX INFO: renamed from: d */
    public C0290v0 f2057d;

    /* JADX INFO: renamed from: e */
    public C0290v0 f2058e;

    /* JADX INFO: renamed from: f */
    public C0290v0 f2059f;

    /* JADX INFO: renamed from: g */
    public C0290v0 f2060g;

    /* JADX INFO: renamed from: h */
    public C0290v0 f2061h;

    /* JADX INFO: renamed from: i */
    public final C0243a0 f2062i;

    /* JADX INFO: renamed from: j */
    public int f2063j = 0;

    /* JADX INFO: renamed from: k */
    public int f2064k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f2065l;

    /* JADX INFO: renamed from: m */
    public boolean f2066m;

    /* JADX INFO: renamed from: b.b.i.y$a */
    public static class a extends C0369g.a {

        /* JADX INFO: renamed from: a */
        public final WeakReference<C0295y> f2067a;

        /* JADX INFO: renamed from: b */
        public final int f2068b;

        /* JADX INFO: renamed from: c */
        public final int f2069c;

        /* JADX INFO: renamed from: b.b.i.y$a$a, reason: collision with other inner class name */
        public class RunnableC1391a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final WeakReference<C0295y> f2070b;

            /* JADX INFO: renamed from: c */
            public final Typeface f2071c;

            public RunnableC1391a(a aVar, WeakReference<C0295y> weakReference, Typeface typeface) {
                this.f2070b = weakReference;
                this.f2071c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0295y c0295y = this.f2070b.get();
                if (c0295y == null) {
                    return;
                }
                Typeface typeface = this.f2071c;
                if (c0295y.f2066m) {
                    c0295y.f2054a.setTypeface(typeface);
                    c0295y.f2065l = typeface;
                }
            }
        }

        public a(C0295y c0295y, int i, int i2) {
            this.f2067a = new WeakReference<>(c0295y);
            this.f2068b = i;
            this.f2069c = i2;
        }

        @Override // p006b.p032h.p034c.p035b.C0369g.a
        /* JADX INFO: renamed from: c */
        public void mo1178c(int i) {
        }

        @Override // p006b.p032h.p034c.p035b.C0369g.a
        /* JADX INFO: renamed from: d */
        public void mo1179d(Typeface typeface) {
            int i;
            C0295y c0295y = this.f2067a.get();
            if (c0295y == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f2068b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f2069c & 2) != 0);
            }
            c0295y.f2054a.post(new RunnableC1391a(this, this.f2067a, typeface));
        }
    }

    public C0295y(TextView textView) {
        this.f2054a = textView;
        this.f2062i = new C0243a0(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C0290v0 m1168c(Context context, C0265j c0265j, int i) {
        ColorStateList colorStateListM1084d = c0265j.m1084d(context, i);
        if (colorStateListM1084d == null) {
            return null;
        }
        C0290v0 c0290v0 = new C0290v0();
        c0290v0.f2021d = true;
        c0290v0.f2018a = colorStateListM1084d;
        return c0290v0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1169a(Drawable drawable, C0290v0 c0290v0) {
        if (drawable == null || c0290v0 == null) {
            return;
        }
        C0265j.m1082f(drawable, c0290v0, this.f2054a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public void m1170b() {
        if (this.f2055b != null || this.f2056c != null || this.f2057d != null || this.f2058e != null) {
            Drawable[] compoundDrawables = this.f2054a.getCompoundDrawables();
            m1169a(compoundDrawables[0], this.f2055b);
            m1169a(compoundDrawables[1], this.f2056c);
            m1169a(compoundDrawables[2], this.f2057d);
            m1169a(compoundDrawables[3], this.f2058e);
        }
        if (this.f2059f == null && this.f2060g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f2054a.getCompoundDrawablesRelative();
        m1169a(compoundDrawablesRelative[0], this.f2059f);
        m1169a(compoundDrawablesRelative[2], this.f2060g);
    }

    /* JADX INFO: renamed from: d */
    public boolean m1171d() {
        C0243a0 c0243a0 = this.f2062i;
        return c0243a0.m1009i() && c0243a0.f1752a != 0;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void m1172e(AttributeSet attributeSet, int i) {
        boolean zM1153a;
        boolean z;
        ColorStateList colorStateListM1155c;
        ColorStateList colorStateListM1155c2;
        ColorStateList colorStateListM1155c3;
        String strM1165m;
        String strM1165m2;
        int i2;
        float fApplyDimension;
        int i3;
        float fApplyDimension2;
        C0265j c0265j;
        Drawable drawableM1083b;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = C0184b.f1208i;
        int[] iArr2 = C0184b.f1223x;
        int i9 = Build.VERSION.SDK_INT;
        Context context = this.f2054a.getContext();
        C0265j c0265jM1079a = C0265j.m1079a();
        C0294x0 c0294x0M1152q = C0294x0.m1152q(context, attributeSet, C0184b.f1207h, i, 0);
        int iM1164l = c0294x0M1152q.m1164l(0, -1);
        if (c0294x0M1152q.m1167o(3)) {
            this.f2055b = m1168c(context, c0265jM1079a, c0294x0M1152q.m1164l(3, 0));
        }
        if (c0294x0M1152q.m1167o(1)) {
            this.f2056c = m1168c(context, c0265jM1079a, c0294x0M1152q.m1164l(1, 0));
        }
        if (c0294x0M1152q.m1167o(4)) {
            this.f2057d = m1168c(context, c0265jM1079a, c0294x0M1152q.m1164l(4, 0));
        }
        if (c0294x0M1152q.m1167o(2)) {
            this.f2058e = m1168c(context, c0265jM1079a, c0294x0M1152q.m1164l(2, 0));
        }
        if (c0294x0M1152q.m1167o(5)) {
            this.f2059f = m1168c(context, c0265jM1079a, c0294x0M1152q.m1164l(5, 0));
        }
        if (c0294x0M1152q.m1167o(6)) {
            this.f2060g = m1168c(context, c0265jM1079a, c0294x0M1152q.m1164l(6, 0));
        }
        c0294x0M1152q.f2052b.recycle();
        boolean z2 = this.f2054a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM1164l != -1) {
            C0294x0 c0294x0 = new C0294x0(context, context.obtainStyledAttributes(iM1164l, iArr2));
            if (z2 || !c0294x0.m1167o(14)) {
                zM1153a = false;
                z = false;
            } else {
                zM1153a = c0294x0.m1153a(14, false);
                z = true;
            }
            m1177j(context, c0294x0);
            if (i9 < 23) {
                if (c0294x0.m1167o(3)) {
                    colorStateListM1155c = c0294x0.m1155c(3);
                    i7 = 4;
                } else {
                    i7 = 4;
                    colorStateListM1155c = null;
                }
                if (c0294x0.m1167o(i7)) {
                    colorStateListM1155c2 = c0294x0.m1155c(i7);
                    i8 = 5;
                } else {
                    i8 = 5;
                    colorStateListM1155c2 = null;
                }
                if (c0294x0.m1167o(i8)) {
                    colorStateListM1155c3 = c0294x0.m1155c(i8);
                    i5 = 15;
                }
                if (c0294x0.m1167o(i5)) {
                    strM1165m = c0294x0.m1165m(i5);
                    i6 = 26;
                } else {
                    i6 = 26;
                    strM1165m = null;
                }
                if (i9 >= i6 || !c0294x0.m1167o(13)) {
                    strM1165m2 = null;
                } else {
                    strM1165m2 = c0294x0.m1165m(13);
                }
                c0294x0.f2052b.recycle();
            } else {
                colorStateListM1155c = null;
                colorStateListM1155c2 = null;
            }
            i5 = 15;
            colorStateListM1155c3 = null;
            if (c0294x0.m1167o(i5)) {
                strM1165m = c0294x0.m1165m(i5);
                i6 = 26;
            } else {
                i6 = 26;
                strM1165m = null;
            }
            if (i9 >= i6) {
                strM1165m2 = null;
            } else {
                strM1165m2 = null;
            }
            c0294x0.f2052b.recycle();
        } else {
            zM1153a = false;
            z = false;
            colorStateListM1155c = null;
            colorStateListM1155c2 = null;
            colorStateListM1155c3 = null;
            strM1165m = null;
            strM1165m2 = null;
        }
        C0294x0 c0294x1 = new C0294x0(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z2 && c0294x1.m1167o(14)) {
            zM1153a = c0294x1.m1153a(14, false);
            z = true;
        }
        if (i9 < 23) {
            if (c0294x1.m1167o(3)) {
                colorStateListM1155c = c0294x1.m1155c(3);
            }
            if (c0294x1.m1167o(4)) {
                colorStateListM1155c2 = c0294x1.m1155c(4);
            }
            if (c0294x1.m1167o(5)) {
                colorStateListM1155c3 = c0294x1.m1155c(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListM1155c;
        ColorStateList colorStateList3 = colorStateListM1155c2;
        ColorStateList colorStateList4 = colorStateListM1155c3;
        if (c0294x1.m1167o(15)) {
            strM1165m = c0294x1.m1165m(15);
        }
        String str = strM1165m;
        if (i9 >= 26 && c0294x1.m1167o(13)) {
            strM1165m2 = c0294x1.m1165m(13);
        }
        String str2 = strM1165m2;
        if (i9 >= 28 && c0294x1.m1167o(0) && c0294x1.m1158f(0, -1) == 0) {
            this.f2054a.setTextSize(0, 0.0f);
        }
        m1177j(context, c0294x1);
        c0294x1.f2052b.recycle();
        if (colorStateList2 != null) {
            this.f2054a.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            this.f2054a.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            this.f2054a.setLinkTextColor(colorStateList4);
        }
        if (!z2 && z) {
            this.f2054a.setAllCaps(zM1153a);
        }
        Typeface typeface = this.f2065l;
        if (typeface != null) {
            if (this.f2064k == -1) {
                this.f2054a.setTypeface(typeface, this.f2063j);
            } else {
                this.f2054a.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            this.f2054a.setFontVariationSettings(str2);
        }
        if (str != null) {
            if (i9 >= 24) {
                this.f2054a.setTextLocales(LocaleList.forLanguageTags(str));
            } else if (i9 >= 21) {
                this.f2054a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
            }
        }
        C0243a0 c0243a0 = this.f2062i;
        TypedArray typedArrayObtainStyledAttributes = c0243a0.f1761j.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c0243a0.f1752a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            fApplyDimension = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
            i2 = 1;
        } else {
            i2 = 1;
            fApplyDimension = -1.0f;
        }
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            fApplyDimension2 = typedArrayObtainStyledAttributes.getDimension(i2, -1.0f);
            i3 = 3;
        } else {
            i3 = 3;
            fApplyDimension2 = -1.0f;
        }
        if (typedArrayObtainStyledAttributes.hasValue(i3) && (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(i3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr3[i10] = typedArrayObtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                c0243a0.f1757f = c0243a0.m1004b(iArr3);
                c0243a0.m1008h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!c0243a0.m1009i()) {
            c0243a0.f1752a = 0;
        } else if (c0243a0.f1752a == 1) {
            if (!c0243a0.f1758g) {
                DisplayMetrics displayMetrics = c0243a0.f1761j.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    i4 = 2;
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (fApplyDimension2 == -1.0f) {
                    fApplyDimension2 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0243a0.m1010j(fApplyDimension, fApplyDimension2, dimension);
            }
            c0243a0.m1007g();
        }
        if (InterfaceC0433b.f2789a) {
            C0243a0 c0243a1 = this.f2062i;
            if (c0243a1.f1752a != 0) {
                int[] iArr4 = c0243a1.f1757f;
                if (iArr4.length > 0) {
                    if (this.f2054a.getAutoSizeStepGranularity() != -1.0f) {
                        this.f2054a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f2062i.f1755d), Math.round(this.f2062i.f1756e), Math.round(this.f2062i.f1754c), 0);
                    } else {
                        this.f2054a.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                    }
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(8, -1);
        if (resourceId3 != -1) {
            c0265j = c0265jM1079a;
            drawableM1083b = c0265j.m1083b(context, resourceId3);
        } else {
            c0265j = c0265jM1079a;
            drawableM1083b = null;
        }
        int resourceId4 = typedArrayObtainStyledAttributes2.getResourceId(13, -1);
        Drawable drawableM1083b2 = resourceId4 != -1 ? c0265j.m1083b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes2.getResourceId(9, -1);
        Drawable drawableM1083b3 = resourceId5 != -1 ? c0265j.m1083b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes2.getResourceId(6, -1);
        Drawable drawableM1083b4 = resourceId6 != -1 ? c0265j.m1083b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes2.getResourceId(10, -1);
        Drawable drawableM1083b5 = resourceId7 != -1 ? c0265j.m1083b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes2.getResourceId(7, -1);
        Drawable drawableM1083b6 = resourceId8 != -1 ? c0265j.m1083b(context, resourceId8) : null;
        if (drawableM1083b5 != null || drawableM1083b6 != null) {
            Drawable[] compoundDrawablesRelative = this.f2054a.getCompoundDrawablesRelative();
            TextView textView = this.f2054a;
            if (drawableM1083b5 == null) {
                drawableM1083b5 = compoundDrawablesRelative[0];
            }
            if (drawableM1083b2 == null) {
                drawableM1083b2 = compoundDrawablesRelative[1];
            }
            if (drawableM1083b6 == null) {
                drawableM1083b6 = compoundDrawablesRelative[2];
            }
            if (drawableM1083b4 == null) {
                drawableM1083b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM1083b5, drawableM1083b2, drawableM1083b6, drawableM1083b4);
        } else if (drawableM1083b != null || drawableM1083b2 != null || drawableM1083b3 != null || drawableM1083b4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f2054a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f2054a.getCompoundDrawables();
                TextView textView2 = this.f2054a;
                if (drawableM1083b == null) {
                    drawableM1083b = compoundDrawables[0];
                }
                if (drawableM1083b2 == null) {
                    drawableM1083b2 = compoundDrawables[1];
                }
                if (drawableM1083b3 == null) {
                    drawableM1083b3 = compoundDrawables[2];
                }
                if (drawableM1083b4 == null) {
                    drawableM1083b4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawableM1083b, drawableM1083b2, drawableM1083b3, drawableM1083b4);
            } else {
                TextView textView3 = this.f2054a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (drawableM1083b2 == null) {
                    drawableM1083b2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (drawableM1083b4 == null) {
                    drawableM1083b4 = compoundDrawablesRelative2[3];
                }
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM1083b2, drawable2, drawableM1083b4);
            }
        }
        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes2.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(11, 0)) == 0 || (colorStateList = C0208a.m883a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(11);
            }
            TextView textView4 = this.f2054a;
            Objects.requireNonNull(textView4);
            if (i9 >= 23) {
                textView4.setCompoundDrawableTintList(colorStateList);
            } else if (textView4 instanceof InterfaceC0437f) {
                ((InterfaceC0437f) textView4).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes2.hasValue(12)) {
            PorterDuff.Mode modeM1063d = C0255e0.m1063d(typedArrayObtainStyledAttributes2.getInt(12, -1), null);
            TextView textView5 = this.f2054a;
            Objects.requireNonNull(textView5);
            if (i9 >= 23) {
                textView5.setCompoundDrawableTintMode(modeM1063d);
            } else if (textView5 instanceof InterfaceC0437f) {
                ((InterfaceC0437f) textView5).setSupportCompoundDrawablesTintMode(modeM1063d);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(18, -1);
        typedArrayObtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
            C0360f.m1423O(this.f2054a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            C0360f.m1426R(this.f2054a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            C0360f.m1428T(this.f2054a, dimensionPixelSize3);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1173f(Context context, int i) {
        String strM1165m;
        ColorStateList colorStateListM1155c;
        C0294x0 c0294x0 = new C0294x0(context, context.obtainStyledAttributes(i, C0184b.f1223x));
        if (c0294x0.m1167o(14)) {
            this.f2054a.setAllCaps(c0294x0.m1153a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 && c0294x0.m1167o(3) && (colorStateListM1155c = c0294x0.m1155c(3)) != null) {
            this.f2054a.setTextColor(colorStateListM1155c);
        }
        if (c0294x0.m1167o(0) && c0294x0.m1158f(0, -1) == 0) {
            this.f2054a.setTextSize(0, 0.0f);
        }
        m1177j(context, c0294x0);
        if (i2 >= 26 && c0294x0.m1167o(13) && (strM1165m = c0294x0.m1165m(13)) != null) {
            this.f2054a.setFontVariationSettings(strM1165m);
        }
        c0294x0.f2052b.recycle();
        Typeface typeface = this.f2065l;
        if (typeface != null) {
            this.f2054a.setTypeface(typeface, this.f2063j);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1174g(int i, int i2, int i3, int i4) {
        C0243a0 c0243a0 = this.f2062i;
        if (c0243a0.m1009i()) {
            DisplayMetrics displayMetrics = c0243a0.f1761j.getResources().getDisplayMetrics();
            c0243a0.m1010j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0243a0.m1007g()) {
                c0243a0.m1003a();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1175h(int[] iArr, int i) {
        C0243a0 c0243a0 = this.f2062i;
        if (c0243a0.m1009i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0243a0.f1761j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0243a0.f1757f = c0243a0.m1004b(iArrCopyOf);
                if (!c0243a0.m1008h()) {
                    StringBuilder sbM2191e = a.m2191e("None of the preset sizes is valid: ");
                    sbM2191e.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sbM2191e.toString());
                }
            } else {
                c0243a0.f1758g = false;
            }
            if (c0243a0.m1007g()) {
                c0243a0.m1003a();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1176i(int i) {
        C0243a0 c0243a0 = this.f2062i;
        if (c0243a0.m1009i()) {
            if (i == 0) {
                c0243a0.f1752a = 0;
                c0243a0.f1755d = -1.0f;
                c0243a0.f1756e = -1.0f;
                c0243a0.f1754c = -1.0f;
                c0243a0.f1757f = new int[0];
                c0243a0.f1753b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(a.m2198l("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c0243a0.f1761j.getResources().getDisplayMetrics();
            c0243a0.m1010j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0243a0.m1007g()) {
                c0243a0.m1003a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1177j(Context context, C0294x0 c0294x0) {
        String strM1165m;
        Typeface typefaceCreate;
        Typeface typeface;
        int i = Build.VERSION.SDK_INT;
        this.f2063j = c0294x0.m1162j(2, this.f2063j);
        if (i >= 28) {
            int iM1162j = c0294x0.m1162j(11, -1);
            this.f2064k = iM1162j;
            if (iM1162j != -1) {
                this.f2063j = (this.f2063j & 2) | 0;
            }
        }
        if (!c0294x0.m1167o(10) && !c0294x0.m1167o(12)) {
            if (c0294x0.m1167o(1)) {
                this.f2066m = false;
                int iM1162j2 = c0294x0.m1162j(1, 1);
                if (iM1162j2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iM1162j2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iM1162j2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f2065l = typeface;
                return;
            }
            return;
        }
        this.f2065l = null;
        int i2 = c0294x0.m1167o(12) ? 12 : 10;
        int i3 = this.f2064k;
        int i4 = this.f2063j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1161i = c0294x0.m1161i(i2, this.f2063j, new a(this, i3, i4));
                if (typefaceM1161i != null) {
                    if (i >= 28 && this.f2064k != -1) {
                        typefaceM1161i = Typeface.create(Typeface.create(typefaceM1161i, 0), this.f2064k, (this.f2063j & 2) != 0);
                    }
                    this.f2065l = typefaceM1161i;
                }
                this.f2066m = this.f2065l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2065l != null || (strM1165m = c0294x0.m1165m(i2)) == null) {
            return;
        }
        if (i < 28 || this.f2064k == -1) {
            typefaceCreate = Typeface.create(strM1165m, this.f2063j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strM1165m, 0), this.f2064k, (this.f2063j & 2) != 0);
        }
        this.f2065l = typefaceCreate;
    }
}
