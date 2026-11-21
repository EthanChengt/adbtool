package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p018i.C0255e0;
import p006b.p008b.p018i.C0265j;
import p006b.p008b.p018i.C0294x0;
import p006b.p008b.p018i.C0297z;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p036d.C0370a;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p049j.p050a.AbstractC0442a;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p130b0.AbstractC1178n;
import p080c.p126d.p127a.p128a.p130b0.C1165a;
import p080c.p126d.p127a.p128a.p130b0.C1170f;
import p080c.p126d.p127a.p128a.p130b0.C1171g;
import p080c.p126d.p127a.p128a.p130b0.C1172h;
import p080c.p126d.p127a.p128a.p130b0.C1179o;
import p080c.p126d.p127a.p128a.p130b0.C1180p;
import p080c.p126d.p127a.p128a.p130b0.C1181q;
import p080c.p126d.p127a.p128a.p131c.C1182a;
import p080c.p126d.p127a.p128a.p148r.C1265b;
import p080c.p126d.p127a.p128a.p148r.C1266c;
import p080c.p126d.p127a.p128a.p148r.C1267d;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p151u.C1282a;
import p080c.p126d.p127a.p128a.p151u.C1283b;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public int f10417A;

    /* JADX INFO: renamed from: B */
    public int f10418B;

    /* JADX INFO: renamed from: C */
    public final Rect f10419C;

    /* JADX INFO: renamed from: D */
    public final Rect f10420D;

    /* JADX INFO: renamed from: E */
    public final RectF f10421E;

    /* JADX INFO: renamed from: F */
    public Typeface f10422F;

    /* JADX INFO: renamed from: G */
    public final CheckableImageButton f10423G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f10424H;

    /* JADX INFO: renamed from: I */
    public boolean f10425I;

    /* JADX INFO: renamed from: J */
    public PorterDuff.Mode f10426J;

    /* JADX INFO: renamed from: K */
    public boolean f10427K;

    /* JADX INFO: renamed from: L */
    public Drawable f10428L;

    /* JADX INFO: renamed from: M */
    public View.OnLongClickListener f10429M;

    /* JADX INFO: renamed from: N */
    public final LinkedHashSet<InterfaceC1381f> f10430N;

    /* JADX INFO: renamed from: O */
    public int f10431O;

    /* JADX INFO: renamed from: P */
    public final SparseArray<AbstractC1178n> f10432P;

    /* JADX INFO: renamed from: Q */
    public final CheckableImageButton f10433Q;

    /* JADX INFO: renamed from: R */
    public final LinkedHashSet<InterfaceC1382g> f10434R;

    /* JADX INFO: renamed from: S */
    public ColorStateList f10435S;

    /* JADX INFO: renamed from: T */
    public boolean f10436T;

    /* JADX INFO: renamed from: U */
    public PorterDuff.Mode f10437U;

    /* JADX INFO: renamed from: V */
    public boolean f10438V;

    /* JADX INFO: renamed from: W */
    public Drawable f10439W;

    /* JADX INFO: renamed from: a0 */
    public Drawable f10440a0;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f10441b;

    /* JADX INFO: renamed from: b0 */
    public final CheckableImageButton f10442b0;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f10443c;

    /* JADX INFO: renamed from: c0 */
    public View.OnLongClickListener f10444c0;

    /* JADX INFO: renamed from: d */
    public EditText f10445d;

    /* JADX INFO: renamed from: d0 */
    public ColorStateList f10446d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f10447e;

    /* JADX INFO: renamed from: e0 */
    public ColorStateList f10448e0;

    /* JADX INFO: renamed from: f */
    public final C1179o f10449f;

    /* JADX INFO: renamed from: f0 */
    public final int f10450f0;

    /* JADX INFO: renamed from: g */
    public boolean f10451g;

    /* JADX INFO: renamed from: g0 */
    public final int f10452g0;

    /* JADX INFO: renamed from: h */
    public int f10453h;

    /* JADX INFO: renamed from: h0 */
    public int f10454h0;

    /* JADX INFO: renamed from: i */
    public boolean f10455i;

    /* JADX INFO: renamed from: i0 */
    public int f10456i0;

    /* JADX INFO: renamed from: j */
    public TextView f10457j;

    /* JADX INFO: renamed from: j0 */
    public final int f10458j0;

    /* JADX INFO: renamed from: k */
    public int f10459k;

    /* JADX INFO: renamed from: k0 */
    public final int f10460k0;

    /* JADX INFO: renamed from: l */
    public int f10461l;

    /* JADX INFO: renamed from: l0 */
    public final int f10462l0;

    /* JADX INFO: renamed from: m */
    public ColorStateList f10463m;

    /* JADX INFO: renamed from: m0 */
    public boolean f10464m0;

    /* JADX INFO: renamed from: n */
    public ColorStateList f10465n;

    /* JADX INFO: renamed from: n0 */
    public final C1266c f10466n0;

    /* JADX INFO: renamed from: o */
    public boolean f10467o;

    /* JADX INFO: renamed from: o0 */
    public boolean f10468o0;

    /* JADX INFO: renamed from: p */
    public CharSequence f10469p;

    /* JADX INFO: renamed from: p0 */
    public ValueAnimator f10470p0;

    /* JADX INFO: renamed from: q */
    public boolean f10471q;

    /* JADX INFO: renamed from: q0 */
    public boolean f10472q0;

    /* JADX INFO: renamed from: r */
    public C1296g f10473r;

    /* JADX INFO: renamed from: r0 */
    public boolean f10474r0;

    /* JADX INFO: renamed from: s */
    public C1296g f10475s;

    /* JADX INFO: renamed from: t */
    public C1299j f10476t;

    /* JADX INFO: renamed from: u */
    public final int f10477u;

    /* JADX INFO: renamed from: v */
    public int f10478v;

    /* JADX INFO: renamed from: w */
    public final int f10479w;

    /* JADX INFO: renamed from: x */
    public int f10480x;

    /* JADX INFO: renamed from: y */
    public final int f10481y;

    /* JADX INFO: renamed from: z */
    public final int f10482z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C1376a implements TextWatcher {
        public C1376a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m3189v(!textInputLayout.f10474r0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f10451g) {
                textInputLayout2.m3184q(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC1377b implements Runnable {
        public RunnableC1377b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f10433Q.performClick();
            TextInputLayout.this.f10433Q.jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class RunnableC1378c implements Runnable {
        public RunnableC1378c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f10445d.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C1379d implements ValueAnimator.AnimatorUpdateListener {
        public C1379d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f10466n0.m2925n(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C1380e extends C0406a {

        /* JADX INFO: renamed from: d */
        public final TextInputLayout f10487d;

        public C1380e(TextInputLayout textInputLayout) {
            this.f10487d = textInputLayout;
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            int i = Build.VERSION.SDK_INT;
            this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
            EditText editText = this.f10487d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f10487d.getHint();
            CharSequence error = this.f10487d.getError();
            CharSequence counterOverflowDescription = this.f10487d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                c0429b.f2743a.setText(text);
            } else if (z2) {
                c0429b.f2743a.setText(hint);
            }
            if (z2) {
                c0429b.m1619n(hint);
                if (!z && z2) {
                    z4 = true;
                }
                if (i >= 26) {
                    c0429b.f2743a.setShowingHintText(z4);
                } else {
                    c0429b.m1616k(4, z4);
                }
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                if (i >= 21) {
                    c0429b.f2743a.setError(error);
                }
                c0429b.f2743a.setContentInvalid(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC1381f {
        /* JADX INFO: renamed from: a */
        void mo2742a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC1382g {
        /* JADX INFO: renamed from: a */
        void mo2763a(TextInputLayout textInputLayout, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C1383h extends AbstractC0442a {
        public static final Parcelable.Creator<C1383h> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public CharSequence f10488d;

        /* JADX INFO: renamed from: e */
        public boolean f10489e;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C1383h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C1383h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C1383h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C1383h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1383h(parcel, classLoader);
            }
        }

        public C1383h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10488d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10489e = parcel.readInt() == 1;
        }

        public C1383h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("TextInputLayout.SavedState{");
            sbM2191e.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2191e.append(" error=");
            sbM2191e.append((Object) this.f10488d);
            sbM2191e.append("}");
            return sbM2191e.toString();
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            TextUtils.writeToParcel(this.f10488d, parcel, i);
            parcel.writeInt(this.f10489e ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        int i;
        int colorForState;
        super(C1277n.m2946d(context, attributeSet, R.attr.rh, R.style.pe), attributeSet, R.attr.rh);
        this.f10449f = new C1179o(this);
        this.f10419C = new Rect();
        this.f10420D = new Rect();
        this.f10421E = new RectF();
        this.f10430N = new LinkedHashSet<>();
        this.f10431O = 0;
        SparseArray<AbstractC1178n> sparseArray = new SparseArray<>();
        this.f10432P = sparseArray;
        this.f10434R = new LinkedHashSet<>();
        C1266c c1266c = new C1266c(this);
        this.f10466n0 = c1266c;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f10441b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f10443c = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        frameLayout.addView(frameLayout2);
        TimeInterpolator timeInterpolator = C1182a.f5662a;
        c1266c.f6058H = timeInterpolator;
        c1266c.m2923k();
        c1266c.f6057G = timeInterpolator;
        c1266c.m2923k();
        if (c1266c.f6070h != 8388659) {
            c1266c.f6070h = 8388659;
            c1266c.m2923k();
        }
        int[] iArr = C1164b.f5561A;
        C1277n.m2943a(context2, attributeSet, R.attr.rh, R.style.pe);
        C1277n.m2944b(context2, attributeSet, iArr, R.attr.rh, R.style.pe, 16, 14, 28, 32, 36);
        C0294x0 c0294x0 = new C0294x0(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.rh, R.style.pe));
        this.f10467o = c0294x0.m1153a(35, true);
        setHint(c0294x0.m1166n(1));
        this.f10468o0 = c0294x0.m1153a(34, true);
        this.f10476t = C1299j.m2986b(context2, attributeSet, R.attr.rh, R.style.pe, new C1290a(0)).m2991a();
        this.f10477u = context2.getResources().getDimensionPixelOffset(R.dimen.hc);
        this.f10479w = c0294x0.m1157e(4, 0);
        int iM1158f = c0294x0.m1158f(10, context2.getResources().getDimensionPixelSize(R.dimen.hd));
        this.f10481y = iM1158f;
        this.f10482z = c0294x0.m1158f(11, context2.getResources().getDimensionPixelSize(R.dimen.he));
        this.f10480x = iM1158f;
        float fM1156d = c0294x0.m1156d(8, -1.0f);
        float fM1156d2 = c0294x0.m1156d(7, -1.0f);
        float fM1156d3 = c0294x0.m1156d(5, -1.0f);
        float fM1156d4 = c0294x0.m1156d(6, -1.0f);
        C1299j c1299j = this.f10476t;
        Objects.requireNonNull(c1299j);
        C1299j.b bVar = new C1299j.b(c1299j);
        if (fM1156d >= 0.0f) {
            bVar.m2994e(fM1156d);
        }
        if (fM1156d2 >= 0.0f) {
            bVar.m2995f(fM1156d2);
        }
        if (fM1156d3 >= 0.0f) {
            bVar.m2993d(fM1156d3);
        }
        if (fM1156d4 >= 0.0f) {
            bVar.m2992c(fM1156d4);
        }
        this.f10476t = bVar.m2991a();
        ColorStateList colorStateListM2724i = C1161a.m2724i(context2, c0294x0, 2);
        if (colorStateListM2724i != null) {
            int defaultColor = colorStateListM2724i.getDefaultColor();
            this.f10456i0 = defaultColor;
            this.f10418B = defaultColor;
            if (colorStateListM2724i.isStateful()) {
                i = 0;
                this.f10458j0 = colorStateListM2724i.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListM2724i.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            } else {
                i = 0;
                ColorStateList colorStateListM883a = C0208a.m883a(context2, R.color.db);
                this.f10458j0 = colorStateListM883a.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListM883a.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            this.f10460k0 = colorForState;
        } else {
            i = 0;
            this.f10418B = 0;
            this.f10456i0 = 0;
            this.f10458j0 = 0;
            this.f10460k0 = 0;
        }
        if (c0294x0.m1167o(i)) {
            ColorStateList colorStateListM1155c = c0294x0.m1155c(i);
            this.f10448e0 = colorStateListM1155c;
            this.f10446d0 = colorStateListM1155c;
        }
        ColorStateList colorStateListM2724i2 = C1161a.m2724i(context2, c0294x0, 9);
        if (colorStateListM2724i2 == null || !colorStateListM2724i2.isStateful()) {
            this.f10454h0 = c0294x0.m1154b(9, 0);
            this.f10450f0 = C0362a.m1468b(context2, R.color.dt);
            this.f10462l0 = C0362a.m1468b(context2, R.color.du);
            this.f10452g0 = C0362a.m1468b(context2, R.color.dx);
        } else {
            this.f10450f0 = colorStateListM2724i2.getDefaultColor();
            this.f10462l0 = colorStateListM2724i2.getColorForState(new int[]{-16842910}, -1);
            this.f10452g0 = colorStateListM2724i2.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            this.f10454h0 = colorStateListM2724i2.getColorForState(new int[]{android.R.attr.state_focused}, -1);
        }
        if (c0294x0.m1164l(36, -1) != -1) {
            setHintTextAppearance(c0294x0.m1164l(36, 0));
        } else {
        }
        int iM1164l = c0294x0.m1164l(28, 0);
        boolean zM1153a = c0294x0.m1153a(24, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.ap, frameLayout, false);
        this.f10442b0 = checkableImageButton;
        frameLayout.addView(checkableImageButton);
        checkableImageButton.setVisibility(8);
        if (c0294x0.m1167o(25)) {
            setErrorIconDrawable(c0294x0.m1159g(25));
        }
        if (c0294x0.m1167o(26)) {
            setErrorIconTintList(C1161a.m2724i(context2, c0294x0, 26));
        }
        if (c0294x0.m1167o(27)) {
            setErrorIconTintMode(C1161a.m2733r(c0294x0.m1162j(27, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.c2));
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iM1164l2 = c0294x0.m1164l(32, 0);
        boolean zM1153a2 = c0294x0.m1153a(31, false);
        CharSequence charSequenceM1166n = c0294x0.m1166n(30);
        boolean zM1153a3 = c0294x0.m1153a(12, false);
        setCounterMaxLength(c0294x0.m1162j(13, -1));
        this.f10461l = c0294x0.m1164l(16, 0);
        this.f10459k = c0294x0.m1164l(14, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.aq, (ViewGroup) frameLayout, false);
        this.f10423G = checkableImageButton2;
        frameLayout.addView(checkableImageButton2);
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (c0294x0.m1167o(47)) {
            setStartIconDrawable(c0294x0.m1159g(47));
            if (c0294x0.m1167o(46)) {
                setStartIconContentDescription(c0294x0.m1166n(46));
            }
            setStartIconCheckable(c0294x0.m1153a(45, true));
        }
        if (c0294x0.m1167o(48)) {
            setStartIconTintList(C1161a.m2724i(context2, c0294x0, 48));
        }
        if (c0294x0.m1167o(49)) {
            setStartIconTintMode(C1161a.m2733r(c0294x0.m1162j(49, -1), null));
        }
        setHelperTextEnabled(zM1153a2);
        setHelperText(charSequenceM1166n);
        setHelperTextTextAppearance(iM1164l2);
        setErrorEnabled(zM1153a);
        setErrorTextAppearance(iM1164l);
        setCounterTextAppearance(this.f10461l);
        setCounterOverflowTextAppearance(this.f10459k);
        if (c0294x0.m1167o(29)) {
            setErrorTextColor(c0294x0.m1155c(29));
        }
        if (c0294x0.m1167o(33)) {
            setHelperTextColor(c0294x0.m1155c(33));
        }
        if (c0294x0.m1167o(37)) {
            setHintTextColor(c0294x0.m1155c(37));
        }
        if (c0294x0.m1167o(17)) {
            setCounterTextColor(c0294x0.m1155c(17));
        }
        if (c0294x0.m1167o(15)) {
            setCounterOverflowTextColor(c0294x0.m1155c(15));
        }
        setCounterEnabled(zM1153a3);
        setBoxBackgroundMode(c0294x0.m1162j(3, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.ap, (ViewGroup) frameLayout2, false);
        this.f10433Q = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        sparseArray.append(-1, new C1170f(this));
        sparseArray.append(0, new C1180p(this));
        sparseArray.append(1, new C1181q(this));
        sparseArray.append(2, new C1165a(this));
        sparseArray.append(3, new C1172h(this));
        if (c0294x0.m1167o(21)) {
            setEndIconMode(c0294x0.m1162j(21, 0));
            if (c0294x0.m1167o(20)) {
                setEndIconDrawable(c0294x0.m1159g(20));
            }
            if (c0294x0.m1167o(19)) {
                setEndIconContentDescription(c0294x0.m1166n(19));
            }
            setEndIconCheckable(c0294x0.m1153a(18, true));
        } else if (c0294x0.m1167o(40)) {
            setEndIconMode(c0294x0.m1153a(40, false) ? 1 : 0);
            setEndIconDrawable(c0294x0.m1159g(39));
            setEndIconContentDescription(c0294x0.m1166n(38));
            if (c0294x0.m1167o(41)) {
                setEndIconTintList(C1161a.m2724i(context2, c0294x0, 41));
            }
            if (c0294x0.m1167o(42)) {
                setEndIconTintMode(C1161a.m2733r(c0294x0.m1162j(42, -1), null));
            }
        }
        if (!c0294x0.m1167o(40)) {
            if (c0294x0.m1167o(22)) {
                setEndIconTintList(C1161a.m2724i(context2, c0294x0, 22));
            }
            if (c0294x0.m1167o(23)) {
                setEndIconTintMode(C1161a.m2733r(c0294x0.m1162j(23, -1), null));
            }
        }
        c0294x0.f2052b.recycle();
        setImportantForAccessibility(2);
    }

    private AbstractC1178n getEndIconDelegate() {
        AbstractC1178n abstractC1178n = this.f10432P.get(this.f10431O);
        return abstractC1178n != null ? abstractC1178n : this.f10432P.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f10442b0.getVisibility() == 0) {
            return this.f10442b0;
        }
        if (m3178i() && m3179j()) {
            return this.f10433Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m3168m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m3168m((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3169n(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f10445d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f10431O != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f10445d = editText;
        m3180k();
        setTextInputAccessibilityDelegate(new C1380e(this));
        this.f10466n0.m2927p(this.f10445d.getTypeface());
        C1266c c1266c = this.f10466n0;
        float textSize = this.f10445d.getTextSize();
        if (c1266c.f6071i != textSize) {
            c1266c.f6071i = textSize;
            c1266c.m2923k();
        }
        int gravity = this.f10445d.getGravity();
        C1266c c1266c2 = this.f10466n0;
        int i = (gravity & (-113)) | 48;
        if (c1266c2.f6070h != i) {
            c1266c2.f6070h = i;
            c1266c2.m2923k();
        }
        C1266c c1266c3 = this.f10466n0;
        if (c1266c3.f6069g != gravity) {
            c1266c3.f6069g = gravity;
            c1266c3.m2923k();
        }
        this.f10445d.addTextChangedListener(new C1376a());
        if (this.f10446d0 == null) {
            this.f10446d0 = this.f10445d.getHintTextColors();
        }
        if (this.f10467o) {
            if (TextUtils.isEmpty(this.f10469p)) {
                CharSequence hint = this.f10445d.getHint();
                this.f10447e = hint;
                setHint(hint);
                this.f10445d.setHint((CharSequence) null);
            }
            this.f10471q = true;
        }
        if (this.f10457j != null) {
            m3184q(this.f10445d.getText().length());
        }
        m3186s();
        this.f10449f.m2752b();
        this.f10423G.bringToFront();
        this.f10443c.bringToFront();
        this.f10442b0.bringToFront();
        Iterator<InterfaceC1381f> it = this.f10430N.iterator();
        while (it.hasNext()) {
            it.next().mo2742a(this);
        }
        m3189v(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f10442b0.setVisibility(z ? 0 : 8);
        this.f10443c.setVisibility(z ? 8 : 0);
        if (m3178i()) {
            return;
        }
        m3187t();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10469p)) {
            return;
        }
        this.f10469p = charSequence;
        C1266c c1266c = this.f10466n0;
        if (charSequence == null || !TextUtils.equals(c1266c.f6085w, charSequence)) {
            c1266c.f6085w = charSequence;
            c1266c.f6086x = null;
            Bitmap bitmap = c1266c.f6088z;
            if (bitmap != null) {
                bitmap.recycle();
                c1266c.f6088z = null;
            }
            c1266c.m2923k();
        }
        if (this.f10464m0) {
            return;
        }
        m3181l();
    }

    /* JADX INFO: renamed from: a */
    public void m3170a(InterfaceC1381f interfaceC1381f) {
        this.f10430N.add(interfaceC1381f);
        if (this.f10445d != null) {
            interfaceC1381f.mo2742a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f10441b.addView(view, layoutParams2);
        this.f10441b.setLayoutParams(layoutParams);
        m3188u();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public void m3171b(float f) {
        if (this.f10466n0.f6065c == f) {
            return;
        }
        if (this.f10470p0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10470p0 = valueAnimator;
            valueAnimator.setInterpolator(C1182a.f5663b);
            this.f10470p0.setDuration(167L);
            this.f10470p0.addUpdateListener(new C1379d());
        }
        this.f10470p0.setFloatValues(this.f10466n0.f6065c, f);
        this.f10470p0.start();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX INFO: renamed from: c */
    public final void m3172c() {
        boolean z;
        C1296g c1296g = this.f10473r;
        if (c1296g == null) {
            return;
        }
        c1296g.setShapeAppearanceModel(this.f10476t);
        boolean z2 = false;
        if (this.f10478v != 2) {
            z = false;
        } else {
            if (this.f10480x > -1 && this.f10417A != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f10473r.m2979t(this.f10480x, this.f10417A);
        }
        int iM1487a = this.f10418B;
        if (this.f10478v == 1) {
            iM1487a = C0370a.m1487a(this.f10418B, C1161a.m2721f(getContext(), R.attr.e8, 0));
        }
        this.f10418B = iM1487a;
        this.f10473r.m2975p(ColorStateList.valueOf(iM1487a));
        if (this.f10431O == 3) {
            this.f10445d.getBackground().invalidateSelf();
        }
        C1296g c1296g2 = this.f10475s;
        if (c1296g2 != null) {
            if (this.f10480x > -1 && this.f10417A != 0) {
                z2 = true;
            }
            if (z2) {
                c1296g2.m2975p(ColorStateList.valueOf(this.f10417A));
            }
            invalidate();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m3173d() {
        m3174e(this.f10433Q, this.f10436T, this.f10435S, this.f10438V, this.f10437U);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f10447e == null || (editText = this.f10445d) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f10471q;
        this.f10471q = false;
        CharSequence hint = editText.getHint();
        this.f10445d.setHint(this.f10447e);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f10445d.setHint(hint);
            this.f10471q = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f10474r0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10474r0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10467o) {
            C1266c c1266c = this.f10466n0;
            Objects.requireNonNull(c1266c);
            int iSave = canvas.save();
            if (c1266c.f6086x != null && c1266c.f6064b) {
                float f = c1266c.f6079q;
                float f2 = c1266c.f6080r;
                c1266c.f6055E.ascent();
                c1266c.f6055E.descent();
                float f3 = c1266c.f6051A;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                CharSequence charSequence = c1266c.f6086x;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f2, c1266c.f6055E);
            }
            canvas.restoreToCount(iSave);
        }
        C1296g c1296g = this.f10475s;
        if (c1296g != null) {
            Rect bounds = c1296g.getBounds();
            bounds.top = bounds.bottom - this.f10480x;
            this.f10475s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.f10472q0) {
            return;
        }
        this.f10472q0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1266c c1266c = this.f10466n0;
        if (c1266c != null) {
            c1266c.f6053C = drawableState;
            ColorStateList colorStateList2 = c1266c.f6074l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1266c.f6073k) != null && colorStateList.isStateful())) {
                c1266c.m2923k();
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        m3189v(isLaidOut() && isEnabled(), false);
        m3186s();
        m3190w();
        if (z) {
            invalidate();
        }
        this.f10472q0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m3174e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0360f.m1444e0(drawable).mutate();
            if (z) {
                C0360f.m1433Y(drawable, colorStateList);
            }
            if (z2) {
                C0360f.m1434Z(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3175f() {
        m3174e(this.f10423G, this.f10425I, this.f10424H, this.f10427K, this.f10426J);
    }

    /* JADX INFO: renamed from: g */
    public final int m3176g() {
        float fM2919f;
        if (!this.f10467o) {
            return 0;
        }
        int i = this.f10478v;
        if (i == 0 || i == 1) {
            fM2919f = this.f10466n0.m2919f();
        } else {
            if (i != 2) {
                return 0;
            }
            fM2919f = this.f10466n0.m2919f() / 2.0f;
        }
        return (int) fM2919f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10445d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m3176g() + getPaddingTop() + editText.getBaseline();
    }

    public C1296g getBoxBackground() {
        int i = this.f10478v;
        if (i == 1 || i == 2) {
            return this.f10473r;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f10418B;
    }

    public int getBoxBackgroundMode() {
        return this.f10478v;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C1296g c1296g = this.f10473r;
        return c1296g.f6211b.f6233a.f6264h.mo2958a(c1296g.m2966g());
    }

    public float getBoxCornerRadiusBottomStart() {
        C1296g c1296g = this.f10473r;
        return c1296g.f6211b.f6233a.f6263g.mo2958a(c1296g.m2966g());
    }

    public float getBoxCornerRadiusTopEnd() {
        C1296g c1296g = this.f10473r;
        return c1296g.f6211b.f6233a.f6262f.mo2958a(c1296g.m2966g());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f10473r.m2971l();
    }

    public int getBoxStrokeColor() {
        return this.f10454h0;
    }

    public int getCounterMaxLength() {
        return this.f10453h;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f10451g && this.f10455i && (textView = this.f10457j) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10463m;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10463m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10446d0;
    }

    public EditText getEditText() {
        return this.f10445d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10433Q.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f10433Q.getDrawable();
    }

    public int getEndIconMode() {
        return this.f10431O;
    }

    public CheckableImageButton getEndIconView() {
        return this.f10433Q;
    }

    public CharSequence getError() {
        C1179o c1179o = this.f10449f;
        if (c1179o.f5641l) {
            return c1179o.f5640k;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f10449f.m2757g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f10442b0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f10449f.m2757g();
    }

    public CharSequence getHelperText() {
        C1179o c1179o = this.f10449f;
        if (c1179o.f5646q) {
            return c1179o.f5645p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f10449f.f5647r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f10467o) {
            return this.f10469p;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f10466n0.m2919f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f10466n0.m2920g();
    }

    public ColorStateList getHintTextColor() {
        return this.f10448e0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10433Q.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10433Q.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10423G.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f10423G.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f10422F;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3177h() {
        return this.f10467o && !TextUtils.isEmpty(this.f10469p) && (this.f10473r instanceof C1171g);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3178i() {
        return this.f10431O != 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3179j() {
        return this.f10443c.getVisibility() == 0 && this.f10433Q.getVisibility() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m3180k() {
        EditText editText;
        int i = this.f10478v;
        if (i != 0) {
            if (i == 1) {
                this.f10473r = new C1296g(this.f10476t);
                this.f10475s = new C1296g();
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(this.f10478v + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
                this.f10473r = (!this.f10467o || (this.f10473r instanceof C1171g)) ? new C1296g(this.f10476t) : new C1171g(this.f10476t);
            }
            editText = this.f10445d;
            if (editText == null && this.f10473r != null && editText.getBackground() == null && this.f10478v != 0) {
                EditText editText2 = this.f10445d;
                C1296g c1296g = this.f10473r;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                editText2.setBackground(c1296g);
            }
            m3190w();
            if (this.f10478v != 0) {
                m3188u();
            }
        }
        this.f10473r = null;
        this.f10475s = null;
        editText = this.f10445d;
        if (editText == null && this.f10473r != null && editText.getBackground() == null && this.f10478v != 0) {
            EditText editText3 = this.f10445d;
            C1296g c1296g2 = this.f10473r;
            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
            editText3.setBackground(c1296g2);
        }
        m3190w();
        if (this.f10478v != 0) {
            m3188u();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3181l() {
        if (m3177h()) {
            RectF rectF = this.f10421E;
            C1266c c1266c = this.f10466n0;
            boolean zM2916c = c1266c.m2916c(c1266c.f6085w);
            Rect rect = c1266c.f6067e;
            float fM2915b = !zM2916c ? rect.left : rect.right - c1266c.m2915b();
            rectF.left = fM2915b;
            Rect rect2 = c1266c.f6067e;
            rectF.top = rect2.top;
            rectF.right = !zM2916c ? c1266c.m2915b() + fM2915b : rect2.right;
            float fM2919f = c1266c.m2919f() + c1266c.f6067e.top;
            rectF.bottom = fM2919f;
            float f = rectF.left;
            float f2 = this.f10477u;
            rectF.left = f - f2;
            rectF.top -= f2;
            rectF.right += f2;
            rectF.bottom = fM2919f + f2;
            rectF.offset(-getPaddingLeft(), 0.0f);
            C1171g c1171g = (C1171g) this.f10473r;
            Objects.requireNonNull(c1171g);
            c1171g.m2743z(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m3182o(TextView textView, int i) {
        boolean z = true;
        try {
            C0360f.m1431W(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0360f.m1431W(textView, R.style.hr);
            textView.setTextColor(C0362a.m1468b(getContext(), R.color.bd));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int compoundPaddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C1266c c1266c;
        Rect rect;
        float f;
        boolean z2;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        int i10;
        int i11;
        int i12;
        int i13;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f10445d;
        if (editText != null) {
            Rect rect2 = this.f10419C;
            C1267d.m2928a(this, editText, rect2);
            C1296g c1296g = this.f10475s;
            if (c1296g != null) {
                int i14 = rect2.bottom;
                c1296g.setBounds(rect2.left, i14 - this.f10482z, rect2.right, i14);
            }
            if (this.f10467o) {
                C1266c c1266c2 = this.f10466n0;
                EditText editText2 = this.f10445d;
                if (editText2 == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.f10420D;
                rect3.bottom = rect2.bottom;
                int i15 = this.f10478v;
                if (i15 != 1) {
                    if (i15 != 2) {
                        rect3.left = editText2.getCompoundPaddingLeft() + rect2.left;
                        paddingTop = getPaddingTop();
                    } else {
                        rect3.left = editText2.getPaddingLeft() + rect2.left;
                        rect3.top = rect2.top - m3176g();
                        i5 = rect2.right;
                        compoundPaddingRight = this.f10445d.getPaddingRight();
                    }
                    rect3.right = i5 - compoundPaddingRight;
                    Objects.requireNonNull(c1266c2);
                    i6 = rect3.left;
                    i7 = rect3.top;
                    i8 = rect3.right;
                    i9 = rect3.bottom;
                    if (!C1266c.m2914l(c1266c2.f6067e, i6, i7, i8, i9)) {
                        c1266c2.f6067e.set(i6, i7, i8, i9);
                        c1266c2.f6054D = true;
                        c1266c2.m2922j();
                    }
                    c1266c = this.f10466n0;
                    if (this.f10445d != null) {
                        throw new IllegalStateException();
                    }
                    rect = this.f10420D;
                    TextPaint textPaint = c1266c.f6056F;
                    textPaint.setTextSize(c1266c.f6071i);
                    textPaint.setTypeface(c1266c.f6082t);
                    f = -c1266c.f6056F.ascent();
                    rect.left = this.f10445d.getCompoundPaddingLeft() + rect2.left;
                    if (this.f10478v == 1 || this.f10445d.getMinLines() > 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        compoundPaddingTop = (int) (rect2.centerY() - (f / 2.0f));
                    } else {
                        compoundPaddingTop = rect2.top + this.f10445d.getCompoundPaddingTop();
                    }
                    rect.top = compoundPaddingTop;
                    rect.right = rect2.right - this.f10445d.getCompoundPaddingRight();
                    if (this.f10478v == 1) {
                        compoundPaddingBottom = (int) (rect.top + f);
                    } else {
                        compoundPaddingBottom = rect2.bottom - this.f10445d.getCompoundPaddingBottom();
                    }
                    rect.bottom = compoundPaddingBottom;
                    Objects.requireNonNull(c1266c);
                    i10 = rect.left;
                    i11 = rect.top;
                    i12 = rect.right;
                    i13 = rect.bottom;
                    if (!C1266c.m2914l(c1266c.f6066d, i10, i11, i12, i13)) {
                        c1266c.f6066d.set(i10, i11, i12, i13);
                        c1266c.f6054D = true;
                        c1266c.m2922j();
                    }
                    this.f10466n0.m2923k();
                    if (m3177h() || this.f10464m0) {
                    }
                    m3181l();
                    return;
                }
                rect3.left = editText2.getCompoundPaddingLeft() + rect2.left;
                paddingTop = rect2.top + this.f10479w;
                rect3.top = paddingTop;
                i5 = rect2.right;
                compoundPaddingRight = this.f10445d.getCompoundPaddingRight();
                rect3.right = i5 - compoundPaddingRight;
                Objects.requireNonNull(c1266c2);
                i6 = rect3.left;
                i7 = rect3.top;
                i8 = rect3.right;
                i9 = rect3.bottom;
                if (!C1266c.m2914l(c1266c2.f6067e, i6, i7, i8, i9)) {
                    c1266c2.f6067e.set(i6, i7, i8, i9);
                    c1266c2.f6054D = true;
                    c1266c2.m2922j();
                }
                c1266c = this.f10466n0;
                if (this.f10445d != null) {
                    throw new IllegalStateException();
                }
                rect = this.f10420D;
                TextPaint textPaint2 = c1266c.f6056F;
                textPaint2.setTextSize(c1266c.f6071i);
                textPaint2.setTypeface(c1266c.f6082t);
                f = -c1266c.f6056F.ascent();
                rect.left = this.f10445d.getCompoundPaddingLeft() + rect2.left;
                if (this.f10478v == 1) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    compoundPaddingTop = (int) (rect2.centerY() - (f / 2.0f));
                } else {
                    compoundPaddingTop = rect2.top + this.f10445d.getCompoundPaddingTop();
                }
                rect.top = compoundPaddingTop;
                rect.right = rect2.right - this.f10445d.getCompoundPaddingRight();
                if (this.f10478v == 1) {
                    compoundPaddingBottom = (int) (rect.top + f);
                } else {
                    compoundPaddingBottom = rect2.bottom - this.f10445d.getCompoundPaddingBottom();
                }
                rect.bottom = compoundPaddingBottom;
                Objects.requireNonNull(c1266c);
                i10 = rect.left;
                i11 = rect.top;
                i12 = rect.right;
                i13 = rect.bottom;
                if (!C1266c.m2914l(c1266c.f6066d, i10, i11, i12, i13)) {
                    c1266c.f6066d.set(i10, i11, i12, i13);
                    c1266c.f6054D = true;
                    c1266c.m2922j();
                }
                this.f10466n0.m2923k();
                if (m3177h()) {
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f10445d != null && this.f10445d.getMeasuredHeight() < (iMax = Math.max(this.f10433Q.getMeasuredHeight(), this.f10423G.getMeasuredHeight()))) {
            this.f10445d.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM3187t = m3187t();
        if (z || zM3187t) {
            this.f10445d.post(new RunnableC1378c());
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1383h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1383h c1383h = (C1383h) parcelable;
        super.onRestoreInstanceState(c1383h.f2812b);
        setError(c1383h.f10488d);
        if (c1383h.f10489e) {
            this.f10433Q.post(new RunnableC1377b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1383h c1383h = new C1383h(super.onSaveInstanceState());
        if (this.f10449f.m2755e()) {
            c1383h.f10488d = getError();
        }
        c1383h.f10489e = m3178i() && this.f10433Q.isChecked();
        return c1383h;
    }

    /* JADX INFO: renamed from: p */
    public final void m3183p() {
        if (this.f10457j != null) {
            EditText editText = this.f10445d;
            m3184q(editText == null ? 0 : editText.getText().length());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m3184q(int i) {
        boolean z = this.f10455i;
        if (this.f10453h == -1) {
            this.f10457j.setText(String.valueOf(i));
            this.f10457j.setContentDescription(null);
            this.f10455i = false;
        } else {
            TextView textView = this.f10457j;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (textView.getAccessibilityLiveRegion() == 1) {
                this.f10457j.setAccessibilityLiveRegion(0);
            }
            this.f10455i = i > this.f10453h;
            Context context = getContext();
            this.f10457j.setContentDescription(context.getString(this.f10455i ? R.string.at : R.string.as, Integer.valueOf(i), Integer.valueOf(this.f10453h)));
            if (z != this.f10455i) {
                m3185r();
                if (this.f10455i) {
                    this.f10457j.setAccessibilityLiveRegion(1);
                }
            }
            this.f10457j.setText(getContext().getString(R.string.au, Integer.valueOf(i), Integer.valueOf(this.f10453h)));
        }
        if (this.f10445d == null || z == this.f10455i) {
            return;
        }
        m3189v(false, false);
        m3190w();
        m3186s();
    }

    /* JADX INFO: renamed from: r */
    public final void m3185r() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f10457j;
        if (textView != null) {
            m3182o(textView, this.f10455i ? this.f10459k : this.f10461l);
            if (!this.f10455i && (colorStateList2 = this.f10463m) != null) {
                this.f10457j.setTextColor(colorStateList2);
            }
            if (!this.f10455i || (colorStateList = this.f10465n) == null) {
                return;
            }
            this.f10457j.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m3186s() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f10445d;
        if (editText == null || this.f10478v != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C0255e0.m1060a(background)) {
            background = background.mutate();
        }
        if (this.f10449f.m2755e()) {
            currentTextColor = this.f10449f.m2757g();
        } else {
            if (!this.f10455i || (textView = this.f10457j) == null) {
                C0360f.m1449i(background);
                this.f10445d.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C0265j.m1080c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f10418B != i) {
            this.f10418B = i;
            this.f10456i0 = i;
            m3172c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0362a.m1468b(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f10478v) {
            return;
        }
        this.f10478v = i;
        if (this.f10445d != null) {
            m3180k();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f10454h0 != i) {
            this.f10454h0 = i;
            m3190w();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f10451g != z) {
            if (z) {
                C0297z c0297z = new C0297z(getContext(), null);
                this.f10457j = c0297z;
                c0297z.setId(R.id.p5);
                Typeface typeface = this.f10422F;
                if (typeface != null) {
                    this.f10457j.setTypeface(typeface);
                }
                this.f10457j.setMaxLines(1);
                this.f10449f.m2751a(this.f10457j, 2);
                m3185r();
                m3183p();
            } else {
                this.f10449f.m2759i(this.f10457j, 2);
                this.f10457j = null;
            }
            this.f10451g = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f10453h != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f10453h = i;
            if (this.f10451g) {
                m3183p();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f10459k != i) {
            this.f10459k = i;
            m3185r();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10465n != colorStateList) {
            this.f10465n = colorStateList;
            m3185r();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f10461l != i) {
            this.f10461l = i;
            m3185r();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10463m != colorStateList) {
            this.f10463m = colorStateList;
            m3185r();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10446d0 = colorStateList;
        this.f10448e0 = colorStateList;
        if (this.f10445d != null) {
            m3189v(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m3168m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f10433Q.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f10433Q.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f10433Q.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C0208a.m884b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f10433Q.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f10431O;
        this.f10431O = i;
        setEndIconVisible(i != 0);
        if (!getEndIconDelegate().mo2747b(this.f10478v)) {
            StringBuilder sbM2191e = a.m2191e("The current box background mode ");
            sbM2191e.append(this.f10478v);
            sbM2191e.append(" is not supported by the end icon mode ");
            sbM2191e.append(i);
            throw new IllegalStateException(sbM2191e.toString());
        }
        getEndIconDelegate().mo2741a();
        m3173d();
        Iterator<InterfaceC1382g> it = this.f10434R.iterator();
        while (it.hasNext()) {
            it.next().mo2763a(this, i2);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f10433Q;
        View.OnLongClickListener onLongClickListener = this.f10444c0;
        checkableImageButton.setOnClickListener(onClickListener);
        m3169n(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10444c0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10433Q;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m3169n(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f10435S != colorStateList) {
            this.f10435S = colorStateList;
            this.f10436T = true;
            m3173d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f10437U != mode) {
            this.f10437U = mode;
            this.f10438V = true;
            m3173d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m3179j() != z) {
            this.f10433Q.setVisibility(z ? 0 : 4);
            m3187t();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f10449f.f5641l) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f10449f.m2758h();
            return;
        }
        C1179o c1179o = this.f10449f;
        c1179o.m2753c();
        c1179o.f5640k = charSequence;
        c1179o.f5642m.setText(charSequence);
        int i = c1179o.f5638i;
        if (i != 1) {
            c1179o.f5639j = 1;
        }
        c1179o.m2761k(i, c1179o.f5639j, c1179o.m2760j(c1179o.f5642m, charSequence));
    }

    public void setErrorEnabled(boolean z) {
        C1179o c1179o = this.f10449f;
        if (c1179o.f5641l == z) {
            return;
        }
        c1179o.m2753c();
        if (z) {
            C0297z c0297z = new C0297z(c1179o.f5630a, null);
            c1179o.f5642m = c0297z;
            c0297z.setId(R.id.p6);
            Typeface typeface = c1179o.f5650u;
            if (typeface != null) {
                c1179o.f5642m.setTypeface(typeface);
            }
            int i = c1179o.f5643n;
            c1179o.f5643n = i;
            TextView textView = c1179o.f5642m;
            if (textView != null) {
                c1179o.f5631b.m3182o(textView, i);
            }
            ColorStateList colorStateList = c1179o.f5644o;
            c1179o.f5644o = colorStateList;
            TextView textView2 = c1179o.f5642m;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            c1179o.f5642m.setVisibility(4);
            TextView textView3 = c1179o.f5642m;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            textView3.setAccessibilityLiveRegion(1);
            c1179o.m2751a(c1179o.f5642m, 0);
        } else {
            c1179o.m2758h();
            c1179o.m2759i(c1179o.f5642m, 0);
            c1179o.f5642m = null;
            c1179o.f5631b.m3186s();
            c1179o.f5631b.m3190w();
        }
        c1179o.f5641l = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C0208a.m884b(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10442b0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f10449f.f5641l);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10442b0.getDrawable();
        if (drawable != null) {
            drawable = C0360f.m1444e0(drawable).mutate();
            C0360f.m1433Y(drawable, colorStateList);
        }
        if (this.f10442b0.getDrawable() != drawable) {
            this.f10442b0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10442b0.getDrawable();
        if (drawable != null) {
            drawable = C0360f.m1444e0(drawable).mutate();
            C0360f.m1434Z(drawable, mode);
        }
        if (this.f10442b0.getDrawable() != drawable) {
            this.f10442b0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C1179o c1179o = this.f10449f;
        c1179o.f5643n = i;
        TextView textView = c1179o.f5642m;
        if (textView != null) {
            c1179o.f5631b.m3182o(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C1179o c1179o = this.f10449f;
        c1179o.f5644o = colorStateList;
        TextView textView = c1179o.f5642m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f10449f.f5646q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f10449f.f5646q) {
            setHelperTextEnabled(true);
        }
        C1179o c1179o = this.f10449f;
        c1179o.m2753c();
        c1179o.f5645p = charSequence;
        c1179o.f5647r.setText(charSequence);
        int i = c1179o.f5638i;
        if (i != 2) {
            c1179o.f5639j = 2;
        }
        c1179o.m2761k(i, c1179o.f5639j, c1179o.m2760j(c1179o.f5647r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C1179o c1179o = this.f10449f;
        c1179o.f5649t = colorStateList;
        TextView textView = c1179o.f5647r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C1179o c1179o = this.f10449f;
        if (c1179o.f5646q == z) {
            return;
        }
        c1179o.m2753c();
        if (z) {
            C0297z c0297z = new C0297z(c1179o.f5630a, null);
            c1179o.f5647r = c0297z;
            c0297z.setId(R.id.p7);
            Typeface typeface = c1179o.f5650u;
            if (typeface != null) {
                c1179o.f5647r.setTypeface(typeface);
            }
            c1179o.f5647r.setVisibility(4);
            TextView textView = c1179o.f5647r;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            textView.setAccessibilityLiveRegion(1);
            int i = c1179o.f5648s;
            c1179o.f5648s = i;
            TextView textView2 = c1179o.f5647r;
            if (textView2 != null) {
                C0360f.m1431W(textView2, i);
            }
            ColorStateList colorStateList = c1179o.f5649t;
            c1179o.f5649t = colorStateList;
            TextView textView3 = c1179o.f5647r;
            if (textView3 != null && colorStateList != null) {
                textView3.setTextColor(colorStateList);
            }
            c1179o.m2751a(c1179o.f5647r, 1);
        } else {
            c1179o.m2753c();
            int i2 = c1179o.f5638i;
            if (i2 == 2) {
                c1179o.f5639j = 0;
            }
            c1179o.m2761k(i2, c1179o.f5639j, c1179o.m2760j(c1179o.f5647r, null));
            c1179o.m2759i(c1179o.f5647r, 1);
            c1179o.f5647r = null;
            c1179o.f5631b.m3186s();
            c1179o.f5631b.m3190w();
        }
        c1179o.f5646q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C1179o c1179o = this.f10449f;
        c1179o.f5648s = i;
        TextView textView = c1179o.f5647r;
        if (textView != null) {
            C0360f.m1431W(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10467o) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f10468o0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f10467o) {
            this.f10467o = z;
            if (z) {
                CharSequence hint = this.f10445d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10469p)) {
                        setHint(hint);
                    }
                    this.f10445d.setHint((CharSequence) null);
                }
                this.f10471q = true;
            } else {
                this.f10471q = false;
                if (!TextUtils.isEmpty(this.f10469p) && TextUtils.isEmpty(this.f10445d.getHint())) {
                    this.f10445d.setHint(this.f10469p);
                }
                setHintInternal(null);
            }
            if (this.f10445d != null) {
                m3188u();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C1266c c1266c = this.f10466n0;
        C1283b c1283b = new C1283b(c1266c.f6063a.getContext(), i);
        ColorStateList colorStateList = c1283b.f6165b;
        if (colorStateList != null) {
            c1266c.f6074l = colorStateList;
        }
        float f = c1283b.f6164a;
        if (f != 0.0f) {
            c1266c.f6072j = f;
        }
        ColorStateList colorStateList2 = c1283b.f6169f;
        if (colorStateList2 != null) {
            c1266c.f6062L = colorStateList2;
        }
        c1266c.f6060J = c1283b.f6170g;
        c1266c.f6061K = c1283b.f6171h;
        c1266c.f6059I = c1283b.f6172i;
        C1282a c1282a = c1266c.f6084v;
        if (c1282a != null) {
            c1282a.f6163c = true;
        }
        C1265b c1265b = new C1265b(c1266c);
        c1283b.m2950a();
        c1266c.f6084v = new C1282a(c1265b, c1283b.f6175l);
        c1283b.m2951b(c1266c.f6063a.getContext(), c1266c.f6084v);
        c1266c.m2923k();
        this.f10448e0 = this.f10466n0.f6074l;
        if (this.f10445d != null) {
            m3189v(false, false);
            m3188u();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10448e0 != colorStateList) {
            if (this.f10446d0 == null) {
                C1266c c1266c = this.f10466n0;
                if (c1266c.f6074l != colorStateList) {
                    c1266c.f6074l = colorStateList;
                    c1266c.m2923k();
                }
            }
            this.f10448e0 = colorStateList;
            if (this.f10445d != null) {
                m3189v(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10433Q.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0208a.m884b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10433Q.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f10431O != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f10435S = colorStateList;
        this.f10436T = true;
        m3173d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f10437U = mode;
        this.f10438V = true;
        m3173d();
    }

    public void setStartIconCheckable(boolean z) {
        this.f10423G.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f10423G.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0208a.m884b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10423G.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m3175f();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f10423G;
        View.OnLongClickListener onLongClickListener = this.f10429M;
        checkableImageButton.setOnClickListener(onClickListener);
        m3169n(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10429M = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10423G;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m3169n(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f10424H != colorStateList) {
            this.f10424H = colorStateList;
            this.f10425I = true;
            m3175f();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f10426J != mode) {
            this.f10426J = mode;
            this.f10427K = true;
            m3175f();
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.f10423G.getVisibility() == 0) != z) {
            this.f10423G.setVisibility(z ? 0 : 8);
            m3187t();
        }
    }

    public void setTextInputAccessibilityDelegate(C1380e c1380e) {
        EditText editText = this.f10445d;
        if (editText != null) {
            C0418m.m1577t(editText, c1380e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10422F) {
            this.f10422F = typeface;
            this.f10466n0.m2927p(typeface);
            C1179o c1179o = this.f10449f;
            if (typeface != c1179o.f5650u) {
                c1179o.f5650u = typeface;
                TextView textView = c1179o.f5642m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = c1179o.f5647r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f10457j;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX INFO: renamed from: t */
    public final boolean m3187t() {
        boolean z;
        if (this.f10445d == null) {
            return false;
        }
        boolean z2 = true;
        if (getStartIconDrawable() != null) {
            if ((this.f10423G.getVisibility() == 0) && this.f10423G.getMeasuredWidth() > 0) {
                if (this.f10428L == null) {
                    this.f10428L = new ColorDrawable();
                    this.f10428L.setBounds(0, 0, (this.f10423G.getMeasuredWidth() - this.f10445d.getPaddingLeft()) + ((ViewGroup.MarginLayoutParams) this.f10423G.getLayoutParams()).getMarginEnd(), 1);
                }
                Drawable[] compoundDrawablesRelative = this.f10445d.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                Drawable drawable2 = this.f10428L;
                if (drawable != drawable2) {
                    this.f10445d.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f10428L != null) {
                Drawable[] compoundDrawablesRelative2 = this.f10445d.getCompoundDrawablesRelative();
                this.f10445d.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f10428L = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f10428L != null) {
            Drawable[] compoundDrawablesRelative3 = this.f10445d.getCompoundDrawablesRelative();
            this.f10445d.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f10428L = null;
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.f10439W == null) {
                this.f10439W = new ColorDrawable();
                this.f10439W.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.f10445d.getPaddingRight()) + ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart(), 1);
            }
            Drawable[] compoundDrawablesRelative4 = this.f10445d.getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative4[2];
            Drawable drawable4 = this.f10439W;
            if (drawable3 != drawable4) {
                this.f10440a0 = compoundDrawablesRelative4[2];
                this.f10445d.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], drawable4, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
        } else {
            if (this.f10439W == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative5 = this.f10445d.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f10439W) {
                this.f10445d.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f10440a0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f10439W = null;
        }
        return z2;
    }

    /* JADX INFO: renamed from: u */
    public final void m3188u() {
        if (this.f10478v != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10441b.getLayoutParams();
            int iM3176g = m3176g();
            if (iM3176g != layoutParams.topMargin) {
                layoutParams.topMargin = iM3176g;
                this.f10441b.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3189v(boolean z, boolean z2) {
        ColorStateList textColors;
        C1266c c1266c;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f10445d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f10445d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zM2755e = this.f10449f.m2755e();
        ColorStateList colorStateList = this.f10446d0;
        if (colorStateList != null) {
            C1266c c1266c2 = this.f10466n0;
            if (c1266c2.f6074l != colorStateList) {
                c1266c2.f6074l = colorStateList;
                c1266c2.m2923k();
            }
            C1266c c1266c3 = this.f10466n0;
            ColorStateList colorStateList2 = this.f10446d0;
            if (c1266c3.f6073k != colorStateList2) {
                c1266c3.f6073k = colorStateList2;
                c1266c3.m2923k();
            }
        }
        if (!zIsEnabled) {
            this.f10466n0.m2924m(ColorStateList.valueOf(this.f10462l0));
            C1266c c1266c4 = this.f10466n0;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f10462l0);
            if (c1266c4.f6073k != colorStateListValueOf) {
                c1266c4.f6073k = colorStateListValueOf;
                c1266c4.m2923k();
            }
        } else if (zM2755e) {
            C1266c c1266c5 = this.f10466n0;
            TextView textView2 = this.f10449f.f5642m;
            c1266c5.m2924m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f10455i && (textView = this.f10457j) != null) {
                c1266c = this.f10466n0;
                textColors = textView.getTextColors();
            } else if (z4 && (textColors = this.f10448e0) != null) {
                c1266c = this.f10466n0;
            }
            c1266c.m2924m(textColors);
        }
        if (z3 || (isEnabled() && (z4 || zM2755e))) {
            if (z2 || this.f10464m0) {
                ValueAnimator valueAnimator = this.f10470p0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f10470p0.cancel();
                }
                if (z && this.f10468o0) {
                    m3171b(1.0f);
                } else {
                    this.f10466n0.m2925n(1.0f);
                }
                this.f10464m0 = false;
                if (m3177h()) {
                    m3181l();
                    return;
                }
                return;
            }
            return;
        }
        if (z2 || !this.f10464m0) {
            ValueAnimator valueAnimator2 = this.f10470p0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f10470p0.cancel();
            }
            if (z && this.f10468o0) {
                m3171b(0.0f);
            } else {
                this.f10466n0.m2925n(0.0f);
            }
            if (m3177h() && (!((C1171g) this.f10473r).f5601y.isEmpty()) && m3177h()) {
                ((C1171g) this.f10473r).m2743z(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f10464m0 = true;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3190w() {
        int currentTextColor;
        TextView textView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.f10473r == null || this.f10478v == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f10445d) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f10445d) != null && editText.isHovered());
        if (!isEnabled()) {
            currentTextColor = this.f10462l0;
        } else if (this.f10449f.m2755e()) {
            currentTextColor = this.f10449f.m2757g();
        } else if (this.f10455i && (textView = this.f10457j) != null) {
            currentTextColor = textView.getCurrentTextColor();
        } else if (z2) {
            currentTextColor = this.f10454h0;
        } else {
            currentTextColor = z3 ? this.f10452g0 : this.f10450f0;
        }
        this.f10417A = currentTextColor;
        if (!(this.f10449f.m2755e() && getEndIconDelegate().mo2748c()) || getEndIconDrawable() == null) {
            m3173d();
        } else {
            Drawable drawableMutate = C0360f.m1444e0(getEndIconDrawable()).mutate();
            C0360f.m1432X(drawableMutate, this.f10449f.m2757g());
            this.f10433Q.setImageDrawable(drawableMutate);
        }
        if (getErrorIconDrawable() != null) {
            C1179o c1179o = this.f10449f;
            if (c1179o.f5641l && c1179o.m2755e()) {
                z = true;
            }
        }
        setErrorIconVisible(z);
        this.f10480x = ((z3 || z2) && isEnabled()) ? this.f10482z : this.f10481y;
        if (this.f10478v == 1) {
            if (isEnabled()) {
                i = z3 ? this.f10460k0 : this.f10456i0;
            } else {
                i = this.f10458j0;
            }
            this.f10418B = i;
        }
        m3172c();
    }
}
