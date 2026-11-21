package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p015g.C0214a;
import p006b.p008b.p018i.C0253d1;
import p006b.p008b.p018i.C0255e0;
import p006b.p008b.p018i.C0294x0;
import p006b.p008b.p018i.C0295y;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: O */
    public static final Property<SwitchCompat, Float> f329O = new C0055a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: P */
    public static final int[] f330P = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public int f331A;

    /* JADX INFO: renamed from: B */
    public int f332B;

    /* JADX INFO: renamed from: C */
    public int f333C;

    /* JADX INFO: renamed from: D */
    public int f334D;

    /* JADX INFO: renamed from: E */
    public int f335E;

    /* JADX INFO: renamed from: F */
    public int f336F;

    /* JADX INFO: renamed from: G */
    public final TextPaint f337G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f338H;

    /* JADX INFO: renamed from: I */
    public Layout f339I;

    /* JADX INFO: renamed from: J */
    public Layout f340J;

    /* JADX INFO: renamed from: K */
    public TransformationMethod f341K;

    /* JADX INFO: renamed from: L */
    public ObjectAnimator f342L;

    /* JADX INFO: renamed from: M */
    public final C0295y f343M;

    /* JADX INFO: renamed from: N */
    public final Rect f344N;

    /* JADX INFO: renamed from: b */
    public Drawable f345b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f346c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f347d;

    /* JADX INFO: renamed from: e */
    public boolean f348e;

    /* JADX INFO: renamed from: f */
    public boolean f349f;

    /* JADX INFO: renamed from: g */
    public Drawable f350g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f351h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f352i;

    /* JADX INFO: renamed from: j */
    public boolean f353j;

    /* JADX INFO: renamed from: k */
    public boolean f354k;

    /* JADX INFO: renamed from: l */
    public int f355l;

    /* JADX INFO: renamed from: m */
    public int f356m;

    /* JADX INFO: renamed from: n */
    public int f357n;

    /* JADX INFO: renamed from: o */
    public boolean f358o;

    /* JADX INFO: renamed from: p */
    public CharSequence f359p;

    /* JADX INFO: renamed from: q */
    public CharSequence f360q;

    /* JADX INFO: renamed from: r */
    public boolean f361r;

    /* JADX INFO: renamed from: s */
    public int f362s;

    /* JADX INFO: renamed from: t */
    public int f363t;

    /* JADX INFO: renamed from: u */
    public float f364u;

    /* JADX INFO: renamed from: v */
    public float f365v;

    /* JADX INFO: renamed from: w */
    public VelocityTracker f366w;

    /* JADX INFO: renamed from: x */
    public int f367x;

    /* JADX INFO: renamed from: y */
    public float f368y;

    /* JADX INFO: renamed from: z */
    public int f369z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public static class C0055a extends Property<SwitchCompat, Float> {
        public C0055a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f368y);
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.didjdk.adbhelper.R.attr.pz);
        this.f346c = null;
        this.f347d = null;
        this.f348e = false;
        this.f349f = false;
        this.f351h = null;
        this.f352i = null;
        this.f353j = false;
        this.f354k = false;
        this.f366w = VelocityTracker.obtain();
        this.f344N = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f337G = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0294x0 c0294x0 = new C0294x0(context, context.obtainStyledAttributes(attributeSet, C0184b.f1222w, com.didjdk.adbhelper.R.attr.pz, 0));
        Drawable drawableM1159g = c0294x0.m1159g(2);
        this.f345b = drawableM1159g;
        if (drawableM1159g != null) {
            drawableM1159g.setCallback(this);
        }
        Drawable drawableM1159g2 = c0294x0.m1159g(11);
        this.f350g = drawableM1159g2;
        if (drawableM1159g2 != null) {
            drawableM1159g2.setCallback(this);
        }
        this.f359p = c0294x0.m1166n(0);
        this.f360q = c0294x0.m1166n(1);
        this.f361r = c0294x0.m1153a(3, true);
        this.f355l = c0294x0.m1158f(8, 0);
        this.f356m = c0294x0.m1158f(5, 0);
        this.f357n = c0294x0.m1158f(6, 0);
        this.f358o = c0294x0.m1153a(4, false);
        ColorStateList colorStateListM1155c = c0294x0.m1155c(9);
        if (colorStateListM1155c != null) {
            this.f346c = colorStateListM1155c;
            this.f348e = true;
        }
        PorterDuff.Mode modeM1063d = C0255e0.m1063d(c0294x0.m1162j(10, -1), null);
        if (this.f347d != modeM1063d) {
            this.f347d = modeM1063d;
            this.f349f = true;
        }
        if (this.f348e || this.f349f) {
            m92a();
        }
        ColorStateList colorStateListM1155c2 = c0294x0.m1155c(12);
        if (colorStateListM1155c2 != null) {
            this.f351h = colorStateListM1155c2;
            this.f353j = true;
        }
        PorterDuff.Mode modeM1063d2 = C0255e0.m1063d(c0294x0.m1162j(13, -1), null);
        if (this.f352i != modeM1063d2) {
            this.f352i = modeM1063d2;
            this.f354k = true;
        }
        if (this.f353j || this.f354k) {
            m93b();
        }
        int iM1164l = c0294x0.m1164l(7, 0);
        if (iM1164l != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iM1164l, C0184b.f1223x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = C0208a.m883a(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            this.f338H = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i != 2) {
                typeface = i != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & i2;
                textPaint.setFakeBoldText((style & 1) != 0);
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            this.f341K = typedArrayObtainStyledAttributes.getBoolean(14, false) ? new C0214a(getContext()) : null;
            typedArrayObtainStyledAttributes.recycle();
        }
        C0295y c0295y = new C0295y(this);
        this.f343M = c0295y;
        c0295y.m1172e(attributeSet, com.didjdk.adbhelper.R.attr.pz);
        c0294x0.f2052b.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f363t = viewConfiguration.getScaledTouchSlop();
        this.f367x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f368y > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0253d1.m1050b(this) ? 1.0f - this.f368y : this.f368y) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f350g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f344N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f345b;
        Rect rectM1062c = drawable2 != null ? C0255e0.m1062c(drawable2) : C0255e0.f1824c;
        return ((((this.f369z - this.f332B) - rect.left) - rect.right) - rectM1062c.left) - rectM1062c.right;
    }

    /* JADX INFO: renamed from: a */
    public final void m92a() {
        Drawable drawable = this.f345b;
        if (drawable != null) {
            if (this.f348e || this.f349f) {
                Drawable drawableMutate = C0360f.m1444e0(drawable).mutate();
                this.f345b = drawableMutate;
                if (this.f348e) {
                    C0360f.m1433Y(drawableMutate, this.f346c);
                }
                if (this.f349f) {
                    C0360f.m1434Z(this.f345b, this.f347d);
                }
                if (this.f345b.isStateful()) {
                    this.f345b.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m93b() {
        Drawable drawable = this.f350g;
        if (drawable != null) {
            if (this.f353j || this.f354k) {
                Drawable drawableMutate = C0360f.m1444e0(drawable).mutate();
                this.f350g = drawableMutate;
                if (this.f353j) {
                    C0360f.m1433Y(drawableMutate, this.f351h);
                }
                if (this.f354k) {
                    C0360f.m1434Z(this.f350g, this.f352i);
                }
                if (this.f350g.isStateful()) {
                    this.f350g.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Layout m94c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f341K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f337G;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f344N;
        int i3 = this.f333C;
        int i4 = this.f334D;
        int i5 = this.f335E;
        int i6 = this.f336F;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f345b;
        Rect rectM1062c = drawable != null ? C0255e0.m1062c(drawable) : C0255e0.f1824c;
        Drawable drawable2 = this.f350g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM1062c != null) {
                int i8 = rectM1062c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM1062c.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM1062c.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM1062c.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f350g.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f350g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f345b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f332B + rect.right;
            this.f345b.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0360f.m1425Q(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f345b;
        if (drawable != null) {
            C0360f.m1424P(drawable, f, f2);
        }
        Drawable drawable2 = this.f350g;
        if (drawable2 != null) {
            C0360f.m1424P(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f345b;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f350g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0253d1.m1050b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f369z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f357n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0253d1.m1050b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f369z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f357n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f361r;
    }

    public boolean getSplitTrack() {
        return this.f358o;
    }

    public int getSwitchMinWidth() {
        return this.f356m;
    }

    public int getSwitchPadding() {
        return this.f357n;
    }

    public CharSequence getTextOff() {
        return this.f360q;
    }

    public CharSequence getTextOn() {
        return this.f359p;
    }

    public Drawable getThumbDrawable() {
        return this.f345b;
    }

    public int getThumbTextPadding() {
        return this.f355l;
    }

    public ColorStateList getThumbTintList() {
        return this.f346c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f347d;
    }

    public Drawable getTrackDrawable() {
        return this.f350g;
    }

    public ColorStateList getTrackTintList() {
        return this.f351h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f352i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f345b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f350g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f342L;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f342L.end();
        this.f342L = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(iArrOnCreateDrawableState, f330P);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f344N;
        Drawable drawable = this.f350g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f334D;
        int i2 = this.f336F;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f345b;
        if (drawable != null) {
            if (!this.f358o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM1062c = C0255e0.m1062c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM1062c.left;
                rect.right -= rectM1062c.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f339I : this.f340J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f338H;
            if (colorStateList != null) {
                this.f337G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f337G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f359p : this.f360q;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f345b != null) {
            Rect rect = this.f344N;
            Drawable drawable = this.f350g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM1062c = C0255e0.m1062c(this.f345b);
            iMax = Math.max(0, rectM1062c.left - rect.left);
            iMax2 = Math.max(0, rectM1062c.right - rect.right);
        } else {
            iMax = 0;
        }
        if (C0253d1.m1050b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f369z + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f369z) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f331A;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f331A + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f331A;
        }
        this.f333C = paddingLeft;
        this.f334D = paddingTop;
        this.f336F = height;
        this.f335E = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.f361r) {
            if (this.f339I == null) {
                this.f339I = m94c(this.f359p);
            }
            if (this.f340J == null) {
                this.f340J = m94c(this.f360q);
            }
        }
        Rect rect = this.f344N;
        Drawable drawable = this.f345b;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f345b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f345b.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f361r) {
            iMax = (this.f355l * 2) + Math.max(this.f339I.getWidth(), this.f340J.getWidth());
        } else {
            iMax = 0;
        }
        this.f332B = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f350g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f350g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f345b;
        if (drawable3 != null) {
            Rect rectM1062c = C0255e0.m1062c(drawable3);
            iMax2 = Math.max(iMax2, rectM1062c.left);
            iMax3 = Math.max(iMax3, rectM1062c.right);
        }
        int iMax4 = Math.max(this.f356m, (this.f332B * 2) + iMax2 + iMax3);
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f369z = iMax4;
        this.f331A = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f359p : this.f360q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        this.f366w.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.f362s == 2) {
                    this.f362s = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.f366w.computeCurrentVelocity(1000);
                        xVelocity = this.f366w.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f367x) {
                            targetCheckedState = C0253d1.m1050b(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f362s = 0;
                this.f366w.clear();
            } else if (actionMasked == 2) {
                int i = this.f362s;
                if (i == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.f364u) > this.f363t || Math.abs(y - this.f365v) > this.f363t) {
                        this.f362s = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f364u = x;
                        this.f365v = y;
                        return true;
                    }
                } else if (i == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f3 = x2 - this.f364u;
                    if (thumbScrollRange != 0) {
                        f = f3 / thumbScrollRange;
                    } else {
                        f = f3 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (C0253d1.m1050b(this)) {
                        f = -f;
                    }
                    float f4 = this.f368y;
                    float f5 = f + f4;
                    if (f5 >= 0.0f) {
                        f2 = f5 > 1.0f ? 1.0f : f5;
                    }
                    if (f2 != f4) {
                        this.f364u = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f362s == 2) {
                    this.f362s = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.f366w.computeCurrentVelocity(1000);
                        xVelocity = this.f366w.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f367x) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (C0253d1.m1050b(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f362s = 0;
                this.f366w.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                if (this.f345b != null) {
                    int thumbOffset = getThumbOffset();
                    this.f345b.getPadding(this.f344N);
                    int i2 = this.f334D;
                    int i3 = this.f363t;
                    int i4 = i2 - i3;
                    int i5 = (this.f333C + thumbOffset) - i3;
                    int i6 = this.f332B + i5;
                    Rect rect = this.f344N;
                    int i7 = i6 + rect.left + rect.right + i3;
                    int i8 = this.f336F + i3;
                    if (x3 > i5 && x3 < i7 && y2 > i4 && y2 < i8) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.f362s = 1;
                    this.f364u = x3;
                    this.f365v = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f329O, zIsChecked ? 1.0f : 0.0f);
                this.f342L = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                this.f342L.setAutoCancel(true);
                this.f342L.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f342L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0360f.m1446f0(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f361r != z) {
            this.f361r = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f358o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f356m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f357n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f337G.getTypeface() == null || this.f337G.getTypeface().equals(typeface)) && (this.f337G.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f337G.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f360q = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f359p = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f345b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f345b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f368y = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0208a.m884b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f355l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f346c = colorStateList;
        this.f348e = true;
        m92a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f347d = mode;
        this.f349f = true;
        m92a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f350g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f350g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0208a.m884b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f351h = colorStateList;
        this.f353j = true;
        m93b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f352i = mode;
        this.f354k = true;
        m93b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f345b || drawable == this.f350g;
    }
}
