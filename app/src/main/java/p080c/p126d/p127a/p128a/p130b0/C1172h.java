package p080c.p126d.p127a.p128a.p130b0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p131c.C1182a;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: renamed from: c.d.a.a.b0.h */
/* JADX INFO: loaded from: classes.dex */
public class C1172h extends AbstractC1178n {

    /* JADX INFO: renamed from: o */
    public static final boolean f5603o;

    /* JADX INFO: renamed from: d */
    public final TextWatcher f5604d;

    /* JADX INFO: renamed from: e */
    public final TextInputLayout.C1380e f5605e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout.InterfaceC1381f f5606f;

    /* JADX INFO: renamed from: g */
    public boolean f5607g;

    /* JADX INFO: renamed from: h */
    public boolean f5608h;

    /* JADX INFO: renamed from: i */
    public long f5609i;

    /* JADX INFO: renamed from: j */
    public StateListDrawable f5610j;

    /* JADX INFO: renamed from: k */
    public C1296g f5611k;

    /* JADX INFO: renamed from: l */
    public AccessibilityManager f5612l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f5613m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f5614n;

    /* JADX INFO: renamed from: c.d.a.a.b0.h$a */
    public class a implements TextWatcher {

        /* JADX INFO: renamed from: c.d.a.a.b0.h$a$a, reason: collision with other inner class name */
        public class RunnableC1401a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f5616b;

            public RunnableC1401a(AutoCompleteTextView autoCompleteTextView) {
                this.f5616b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f5616b.isPopupShowing();
                C1172h.m2745e(C1172h.this, zIsPopupShowing);
                C1172h.this.f5607g = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C1172h c1172h = C1172h.this;
            AutoCompleteTextView autoCompleteTextViewM2744d = C1172h.m2744d(c1172h, c1172h.f5627a.getEditText());
            autoCompleteTextViewM2744d.post(new RunnableC1401a(autoCompleteTextViewM2744d));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.h$b */
    public class b extends TextInputLayout.C1380e {
        public b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C1380e, p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            boolean zIsShowingHintText;
            super.mo223d(view, c0429b);
            c0429b.f2743a.setClassName(Spinner.class.getName());
            if (Build.VERSION.SDK_INT >= 26) {
                zIsShowingHintText = c0429b.f2743a.isShowingHintText();
            } else {
                Bundle bundleM1611f = c0429b.m1611f();
                zIsShowingHintText = bundleM1611f != null && (bundleM1611f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (zIsShowingHintText) {
                c0429b.m1619n(null);
            }
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: e */
        public void mo1539e(View view, AccessibilityEvent accessibilityEvent) {
            this.f2700a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            C1172h c1172h = C1172h.this;
            AutoCompleteTextView autoCompleteTextViewM2744d = C1172h.m2744d(c1172h, c1172h.f5627a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C1172h.this.f5612l.isTouchExplorationEnabled()) {
                C1172h.m2746f(C1172h.this, autoCompleteTextViewM2744d);
            }
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.h$c */
    public class c implements TextInputLayout.InterfaceC1381f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1381f
        /* JADX INFO: renamed from: a */
        public void mo2742a(TextInputLayout textInputLayout) {
            LayerDrawable layerDrawable;
            Drawable drawable;
            AutoCompleteTextView autoCompleteTextViewM2744d = C1172h.m2744d(C1172h.this, textInputLayout.getEditText());
            C1172h c1172h = C1172h.this;
            Objects.requireNonNull(c1172h);
            boolean z = C1172h.f5603o;
            if (z) {
                int boxBackgroundMode = c1172h.f5627a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    drawable = c1172h.f5611k;
                } else if (boxBackgroundMode == 1) {
                    drawable = c1172h.f5610j;
                }
                autoCompleteTextViewM2744d.setDropDownBackgroundDrawable(drawable);
            }
            C1172h c1172h2 = C1172h.this;
            Objects.requireNonNull(c1172h2);
            if (autoCompleteTextViewM2744d.getKeyListener() == null) {
                int boxBackgroundMode2 = c1172h2.f5627a.getBoxBackgroundMode();
                C1296g boxBackground = c1172h2.f5627a.getBoxBackground();
                int iM2722g = C1161a.m2722g(autoCompleteTextViewM2744d, R.attr.dt);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int iM2722g2 = C1161a.m2722g(autoCompleteTextViewM2744d, R.attr.e8);
                    C1296g c1296g = new C1296g(boxBackground.f6211b.f6233a);
                    int iM2731p = C1161a.m2731p(iM2722g, iM2722g2, 0.1f);
                    c1296g.m2975p(new ColorStateList(iArr, new int[]{iM2731p, 0}));
                    if (z) {
                        c1296g.setTint(iM2722g2);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM2731p, iM2722g2});
                        C1296g c1296g2 = new C1296g(boxBackground.f6211b.f6233a);
                        c1296g2.setTint(-1);
                        layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c1296g, c1296g2), boxBackground});
                    } else {
                        layerDrawable = new LayerDrawable(new Drawable[]{c1296g, boxBackground});
                    }
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    autoCompleteTextViewM2744d.setBackground(layerDrawable);
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = c1172h2.f5627a.getBoxBackgroundColor();
                    int[] iArr2 = {C1161a.m2731p(iM2722g, boxBackgroundColor, 0.1f), boxBackgroundColor};
                    if (z) {
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                        WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
                        autoCompleteTextViewM2744d.setBackground(rippleDrawable);
                    } else {
                        C1296g c1296g3 = new C1296g(boxBackground.f6211b.f6233a);
                        c1296g3.m2975p(new ColorStateList(iArr, iArr2));
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, c1296g3});
                        WeakHashMap<View, String> weakHashMap3 = C0418m.f2718a;
                        int paddingStart = autoCompleteTextViewM2744d.getPaddingStart();
                        int paddingTop = autoCompleteTextViewM2744d.getPaddingTop();
                        int paddingEnd = autoCompleteTextViewM2744d.getPaddingEnd();
                        int paddingBottom = autoCompleteTextViewM2744d.getPaddingBottom();
                        autoCompleteTextViewM2744d.setBackground(layerDrawable2);
                        autoCompleteTextViewM2744d.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
                    }
                }
            }
            C1172h c1172h3 = C1172h.this;
            Objects.requireNonNull(c1172h3);
            autoCompleteTextViewM2744d.setOnTouchListener(new ViewOnTouchListenerC1173i(c1172h3, autoCompleteTextViewM2744d));
            autoCompleteTextViewM2744d.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1174j(c1172h3));
            if (z) {
                autoCompleteTextViewM2744d.setOnDismissListener(new C1175k(c1172h3));
            }
            autoCompleteTextViewM2744d.setThreshold(0);
            autoCompleteTextViewM2744d.removeTextChangedListener(C1172h.this.f5604d);
            autoCompleteTextViewM2744d.addTextChangedListener(C1172h.this.f5604d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C1172h.this.f5605e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.b0.h$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1172h.m2746f(C1172h.this, (AutoCompleteTextView) C1172h.this.f5627a.getEditText());
        }
    }

    static {
        f5603o = Build.VERSION.SDK_INT >= 21;
    }

    public C1172h(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5604d = new a();
        this.f5605e = new b(this.f5627a);
        this.f5606f = new c();
        this.f5607g = false;
        this.f5608h = false;
        this.f5609i = RecyclerView.FOREVER_NS;
    }

    /* JADX INFO: renamed from: d */
    public static AutoCompleteTextView m2744d(C1172h c1172h, EditText editText) {
        Objects.requireNonNull(c1172h);
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: renamed from: e */
    public static void m2745e(C1172h c1172h, boolean z) {
        if (c1172h.f5608h != z) {
            c1172h.f5608h = z;
            c1172h.f5614n.cancel();
            c1172h.f5613m.start();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2746f(C1172h c1172h, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(c1172h);
        if (autoCompleteTextView == null) {
            return;
        }
        if (c1172h.m2750h()) {
            c1172h.f5607g = false;
        }
        if (c1172h.f5607g) {
            c1172h.f5607g = false;
            return;
        }
        if (f5603o) {
            boolean z = c1172h.f5608h;
            boolean z2 = !z;
            if (z != z2) {
                c1172h.f5608h = z2;
                c1172h.f5614n.cancel();
                c1172h.f5613m.start();
            }
        } else {
            c1172h.f5608h = !c1172h.f5608h;
            c1172h.f5629c.toggle();
        }
        if (!c1172h.f5608h) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // p080c.p126d.p127a.p128a.p130b0.AbstractC1178n
    /* JADX INFO: renamed from: a */
    public void mo2741a() {
        float dimensionPixelOffset = this.f5628b.getResources().getDimensionPixelOffset(R.dimen.h5);
        float dimensionPixelOffset2 = this.f5628b.getResources().getDimensionPixelOffset(R.dimen.g0);
        int dimensionPixelOffset3 = this.f5628b.getResources().getDimensionPixelOffset(R.dimen.g2);
        C1296g c1296gM2749g = m2749g(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1296g c1296gM2749g2 = m2749g(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f5611k = c1296gM2749g;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f5610j = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, c1296gM2749g);
        this.f5610j.addState(new int[0], c1296gM2749g2);
        this.f5627a.setEndIconDrawable(C0208a.m884b(this.f5628b, f5603o ? R.drawable.c8 : R.drawable.c9));
        TextInputLayout textInputLayout = this.f5627a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.c7));
        this.f5627a.setEndIconOnClickListener(new d());
        this.f5627a.m3170a(this.f5606f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C1182a.f5662a;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        valueAnimatorOfFloat.addUpdateListener(new C1177m(this));
        this.f5614n = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new C1177m(this));
        this.f5613m = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C1176l(this));
        CheckableImageButton checkableImageButton = this.f5629c;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        checkableImageButton.setImportantForAccessibility(2);
        this.f5612l = (AccessibilityManager) this.f5628b.getSystemService("accessibility");
    }

    @Override // p080c.p126d.p127a.p128a.p130b0.AbstractC1178n
    /* JADX INFO: renamed from: b */
    public boolean mo2747b(int i) {
        return i != 0;
    }

    @Override // p080c.p126d.p127a.p128a.p130b0.AbstractC1178n
    /* JADX INFO: renamed from: c */
    public boolean mo2748c() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final C1296g m2749g(float f, float f2, float f3, int i) {
        C1299j.b bVar = new C1299j.b();
        bVar.f6273e = new C1290a(f);
        bVar.f6274f = new C1290a(f);
        bVar.f6276h = new C1290a(f2);
        bVar.f6275g = new C1290a(f2);
        C1299j c1299jM2991a = bVar.m2991a();
        Context context = this.f5628b;
        Paint paint = C1296g.f6210w;
        int iM2737v = C1161a.m2737v(context, R.attr.e8, C1296g.class.getSimpleName());
        C1296g c1296g = new C1296g();
        c1296g.f6211b.f6234b = new C1252a(context);
        c1296g.m2984y();
        c1296g.m2975p(ColorStateList.valueOf(iM2737v));
        C1296g.b bVar2 = c1296g.f6211b;
        if (bVar2.f6247o != f3) {
            bVar2.f6247o = f3;
            c1296g.m2984y();
        }
        c1296g.f6211b.f6233a = c1299jM2991a;
        c1296g.invalidateSelf();
        C1296g.b bVar3 = c1296g.f6211b;
        if (bVar3.f6241i == null) {
            bVar3.f6241i = new Rect();
        }
        c1296g.f6211b.f6241i.set(0, i, 0, i);
        c1296g.f6230u = c1296g.f6211b.f6241i;
        c1296g.invalidateSelf();
        return c1296g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2750h() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f5609i;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }
}
