package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p018i.C0257f;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p137h.C1214a;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p152v.C1286a;
import p080c.p126d.p127a.p128a.p152v.C1287b;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;
import p080c.p126d.p127a.p128a.p154x.InterfaceC1303n;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0257f implements Checkable, InterfaceC1303n {

    /* JADX INFO: renamed from: p */
    public static final int[] f10227p = {R.attr.state_checkable};

    /* JADX INFO: renamed from: q */
    public static final int[] f10228q = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public final C1214a f10229d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet<InterfaceC1348a> f10230e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1349b f10231f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f10232g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f10233h;

    /* JADX INFO: renamed from: i */
    public Drawable f10234i;

    /* JADX INFO: renamed from: j */
    public int f10235j;

    /* JADX INFO: renamed from: k */
    public int f10236k;

    /* JADX INFO: renamed from: l */
    public int f10237l;

    /* JADX INFO: renamed from: m */
    public boolean f10238m;

    /* JADX INFO: renamed from: n */
    public boolean f10239n;

    /* JADX INFO: renamed from: o */
    public int f10240o;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC1348a {
        /* JADX INFO: renamed from: a */
        void m3092a(MaterialButton materialButton, boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC1349b {
        /* JADX INFO: renamed from: a */
        void m3093a(MaterialButton materialButton, boolean z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        Drawable insetDrawable;
        super(C1277n.m2946d(context, attributeSet, com.didjdk.adbhelper.R.attr.m3, com.didjdk.adbhelper.R.style.pz), attributeSet, com.didjdk.adbhelper.R.attr.m3);
        this.f10230e = new LinkedHashSet<>();
        this.f10238m = false;
        this.f10239n = false;
        Context context2 = getContext();
        TypedArray typedArrayM2947e = C1277n.m2947e(context2, attributeSet, C1164b.f5574l, com.didjdk.adbhelper.R.attr.m3, com.didjdk.adbhelper.R.style.pz, new int[0]);
        this.f10237l = typedArrayM2947e.getDimensionPixelSize(11, 0);
        this.f10232g = C1161a.m2733r(typedArrayM2947e.getInt(14, -1), PorterDuff.Mode.SRC_IN);
        this.f10233h = C1161a.m2723h(getContext(), typedArrayM2947e, 13);
        this.f10234i = C1161a.m2726k(getContext(), typedArrayM2947e, 9);
        this.f10240o = typedArrayM2947e.getInteger(10, 1);
        this.f10235j = typedArrayM2947e.getDimensionPixelSize(12, 0);
        C1214a c1214a = new C1214a(this, C1299j.m2986b(context2, attributeSet, com.didjdk.adbhelper.R.attr.m3, com.didjdk.adbhelper.R.style.pz, new C1290a(0)).m2991a());
        this.f10229d = c1214a;
        c1214a.f5757c = typedArrayM2947e.getDimensionPixelOffset(0, 0);
        c1214a.f5758d = typedArrayM2947e.getDimensionPixelOffset(1, 0);
        c1214a.f5759e = typedArrayM2947e.getDimensionPixelOffset(2, 0);
        c1214a.f5760f = typedArrayM2947e.getDimensionPixelOffset(3, 0);
        if (typedArrayM2947e.hasValue(7)) {
            int dimensionPixelSize = typedArrayM2947e.getDimensionPixelSize(7, -1);
            c1214a.f5761g = dimensionPixelSize;
            c1214a.m2795e(c1214a.f5756b.m2989e(dimensionPixelSize));
            c1214a.f5770p = true;
        }
        c1214a.f5762h = typedArrayM2947e.getDimensionPixelSize(19, 0);
        c1214a.f5763i = C1161a.m2733r(typedArrayM2947e.getInt(6, -1), PorterDuff.Mode.SRC_IN);
        c1214a.f5764j = C1161a.m2723h(c1214a.f5755a.getContext(), typedArrayM2947e, 5);
        c1214a.f5765k = C1161a.m2723h(c1214a.f5755a.getContext(), typedArrayM2947e, 18);
        c1214a.f5766l = C1161a.m2723h(c1214a.f5755a.getContext(), typedArrayM2947e, 15);
        c1214a.f5771q = typedArrayM2947e.getBoolean(4, false);
        int dimensionPixelSize2 = typedArrayM2947e.getDimensionPixelSize(8, 0);
        MaterialButton materialButton = c1214a.f5755a;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = c1214a.f5755a.getPaddingTop();
        int paddingEnd = c1214a.f5755a.getPaddingEnd();
        int paddingBottom = c1214a.f5755a.getPaddingBottom();
        MaterialButton materialButton2 = c1214a.f5755a;
        C1296g c1296g = new C1296g(c1214a.f5756b);
        c1296g.m2973n(c1214a.f5755a.getContext());
        C0360f.m1433Y(c1296g, c1214a.f5764j);
        PorterDuff.Mode mode = c1214a.f5763i;
        if (mode != null) {
            C0360f.m1434Z(c1296g, mode);
        }
        c1296g.m2980u(c1214a.f5762h, c1214a.f5765k);
        C1296g c1296g2 = new C1296g(c1214a.f5756b);
        c1296g2.setTint(0);
        c1296g2.m2979t(c1214a.f5762h, c1214a.f5768n ? C1161a.m2722g(c1214a.f5755a, com.didjdk.adbhelper.R.attr.e8) : 0);
        if (C1214a.f5754s) {
            C1296g c1296g3 = new C1296g(c1214a.f5756b);
            c1214a.f5767m = c1296g3;
            C0360f.m1432X(c1296g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C1287b.m2955b(c1214a.f5766l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c1296g2, c1296g}), c1214a.f5757c, c1214a.f5759e, c1214a.f5758d, c1214a.f5760f), c1214a.f5767m);
            c1214a.f5772r = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C1286a c1286a = new C1286a(c1214a.f5756b);
            c1214a.f5767m = c1286a;
            C0360f.m1433Y(c1286a, C1287b.m2955b(c1214a.f5766l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c1296g2, c1296g, c1214a.f5767m});
            c1214a.f5772r = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, c1214a.f5757c, c1214a.f5759e, c1214a.f5758d, c1214a.f5760f);
        }
        materialButton2.setInternalBackground(insetDrawable);
        C1296g c1296gM2792b = c1214a.m2792b();
        if (c1296gM2792b != null) {
            c1296gM2792b.m2974o(dimensionPixelSize2);
        }
        c1214a.f5755a.setPaddingRelative(paddingStart + c1214a.f5757c, paddingTop + c1214a.f5759e, paddingEnd + c1214a.f5758d, paddingBottom + c1214a.f5760f);
        typedArrayM2947e.recycle();
        setCompoundDrawablePadding(this.f10237l);
        m3090c(this.f10234i != null);
    }

    private String getA11yClassName() {
        return (m3088a() ? CompoundButton.class : Button.class).getName();
    }

    /* JADX INFO: renamed from: a */
    public boolean m3088a() {
        C1214a c1214a = this.f10229d;
        return c1214a != null && c1214a.f5771q;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3089b() {
        C1214a c1214a = this.f10229d;
        return (c1214a == null || c1214a.f5769o) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final void m3090c(boolean z) {
        Drawable drawable = this.f10234i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable drawableMutate = C0360f.m1444e0(drawable).mutate();
            this.f10234i = drawableMutate;
            C0360f.m1433Y(drawableMutate, this.f10233h);
            PorterDuff.Mode mode = this.f10232g;
            if (mode != null) {
                C0360f.m1434Z(this.f10234i, mode);
            }
            int intrinsicWidth = this.f10235j;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10234i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10235j;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10234i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10234i;
            int i = this.f10236k;
            drawable2.setBounds(i, 0, intrinsicWidth + i, intrinsicHeight);
        }
        int i2 = this.f10240o;
        boolean z3 = i2 == 1 || i2 == 2;
        if (z) {
            Drawable drawable3 = this.f10234i;
            if (z3) {
                setCompoundDrawablesRelative(drawable3, null, null, null);
                return;
            } else {
                setCompoundDrawablesRelative(null, null, drawable3, null);
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable4 = compoundDrawablesRelative[0];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((z3 && drawable4 != this.f10234i) || (!z3 && drawable5 != this.f10234i)) {
            z2 = true;
        }
        if (z2) {
            Drawable drawable6 = this.f10234i;
            if (z3) {
                setCompoundDrawablesRelative(drawable6, null, null, null);
            } else {
                setCompoundDrawablesRelative(null, null, drawable6, null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3091d() {
        if (this.f10234i == null || getLayout() == null) {
            return;
        }
        int i = this.f10240o;
        if (i == 1 || i == 3) {
            this.f10236k = 0;
            m3090c(false);
            return;
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        int iMin = Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
        int intrinsicWidth = this.f10235j;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f10234i.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - iMin;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - intrinsicWidth) - this.f10237l) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.f10240o == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f10236k != paddingEnd) {
            this.f10236k = paddingEnd;
            m3090c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m3089b()) {
            return this.f10229d.f5761g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f10234i;
    }

    public int getIconGravity() {
        return this.f10240o;
    }

    public int getIconPadding() {
        return this.f10237l;
    }

    public int getIconSize() {
        return this.f10235j;
    }

    public ColorStateList getIconTint() {
        return this.f10233h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10232g;
    }

    public ColorStateList getRippleColor() {
        if (m3089b()) {
            return this.f10229d.f5766l;
        }
        return null;
    }

    public C1299j getShapeAppearanceModel() {
        if (m3089b()) {
            return this.f10229d.f5756b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m3089b()) {
            return this.f10229d.f5765k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m3089b()) {
            return this.f10229d.f5762h;
        }
        return 0;
    }

    @Override // p006b.p008b.p018i.C0257f, p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        return m3089b() ? this.f10229d.f5764j : super.getSupportBackgroundTintList();
    }

    @Override // p006b.p008b.p018i.C0257f, p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m3089b() ? this.f10229d.f5763i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10238m;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1161a.m2739x(this, this.f10229d.m2792b());
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m3088a()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f10227p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f10228q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p006b.p008b.p018i.C0257f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // p006b.p008b.p018i.C0257f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m3088a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p006b.p008b.p018i.C0257f, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1214a c1214a;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (c1214a = this.f10229d) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        Drawable drawable = c1214a.f5767m;
        if (drawable != null) {
            drawable.setBounds(c1214a.f5757c, c1214a.f5759e, i6 - c1214a.f5758d, i5 - c1214a.f5760f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m3091d();
    }

    @Override // p006b.p008b.p018i.C0257f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m3091d();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m3089b()) {
            super.setBackgroundColor(i);
            return;
        }
        C1214a c1214a = this.f10229d;
        if (c1214a.m2792b() != null) {
            c1214a.m2792b().setTint(i);
        }
    }

    @Override // p006b.p008b.p018i.C0257f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m3089b()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            C1214a c1214a = this.f10229d;
            c1214a.f5769o = true;
            c1214a.f5755a.setSupportBackgroundTintList(c1214a.f5764j);
            c1214a.f5755a.setSupportBackgroundTintMode(c1214a.f5763i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // p006b.p008b.p018i.C0257f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0208a.m884b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m3089b()) {
            this.f10229d.f5771q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m3088a() && isEnabled() && this.f10238m != z) {
            this.f10238m = z;
            refreshDrawableState();
            if (this.f10239n) {
                return;
            }
            this.f10239n = true;
            Iterator<InterfaceC1348a> it = this.f10230e.iterator();
            while (it.hasNext()) {
                it.next().m3092a(this, this.f10238m);
            }
            this.f10239n = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m3089b()) {
            C1214a c1214a = this.f10229d;
            if (c1214a.f5770p && c1214a.f5761g == i) {
                return;
            }
            c1214a.f5761g = i;
            c1214a.f5770p = true;
            c1214a.m2795e(c1214a.f5756b.m2989e(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m3089b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m3089b()) {
            C1296g c1296gM2792b = this.f10229d.m2792b();
            C1296g.b bVar = c1296gM2792b.f6211b;
            if (bVar.f6247o != f) {
                bVar.f6247o = f;
                c1296gM2792b.m2984y();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f10234i != drawable) {
            this.f10234i = drawable;
            m3090c(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f10240o != i) {
            this.f10240o = i;
            m3091d();
        }
    }

    public void setIconPadding(int i) {
        if (this.f10237l != i) {
            this.f10237l = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0208a.m884b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f10235j != i) {
            this.f10235j = i;
            m3090c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f10233h != colorStateList) {
            this.f10233h = colorStateList;
            m3090c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10232g != mode) {
            this.f10232g = mode;
            m3090c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0208a.m883a(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1349b interfaceC1349b) {
        this.f10231f = interfaceC1349b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC1349b interfaceC1349b = this.f10231f;
        if (interfaceC1349b != null) {
            interfaceC1349b.m3093a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m3089b()) {
            C1214a c1214a = this.f10229d;
            if (c1214a.f5766l != colorStateList) {
                c1214a.f5766l = colorStateList;
                boolean z = C1214a.f5754s;
                if (z && (c1214a.f5755a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) c1214a.f5755a.getBackground()).setColor(C1287b.m2955b(colorStateList));
                } else {
                    if (z || !(c1214a.f5755a.getBackground() instanceof C1286a)) {
                        return;
                    }
                    ((C1286a) c1214a.f5755a.getBackground()).setTintList(C1287b.m2955b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m3089b()) {
            setRippleColor(C0208a.m883a(getContext(), i));
        }
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1303n
    public void setShapeAppearanceModel(C1299j c1299j) {
        if (!m3089b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f10229d.m2795e(c1299j);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m3089b()) {
            C1214a c1214a = this.f10229d;
            c1214a.f5768n = z;
            c1214a.m2796f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m3089b()) {
            C1214a c1214a = this.f10229d;
            if (c1214a.f5765k != colorStateList) {
                c1214a.f5765k = colorStateList;
                c1214a.m2796f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m3089b()) {
            setStrokeColor(C0208a.m883a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m3089b()) {
            C1214a c1214a = this.f10229d;
            if (c1214a.f5762h != i) {
                c1214a.f5762h = i;
                c1214a.m2796f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m3089b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p006b.p008b.p018i.C0257f, p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m3089b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1214a c1214a = this.f10229d;
        if (c1214a.f5764j != colorStateList) {
            c1214a.f5764j = colorStateList;
            if (c1214a.m2792b() != null) {
                C0360f.m1433Y(c1214a.m2792b(), c1214a.f5764j);
            }
        }
    }

    @Override // p006b.p008b.p018i.C0257f, p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m3089b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1214a c1214a = this.f10229d;
        if (c1214a.f5763i != mode) {
            c1214a.f5763i = mode;
            if (c1214a.m2792b() == null || c1214a.f5763i == null) {
                return;
            }
            C0360f.m1434Z(c1214a.m2792b(), c1214a.f5763i);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10238m);
    }
}
