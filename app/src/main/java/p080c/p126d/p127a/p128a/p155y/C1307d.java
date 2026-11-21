package p080c.p126d.p127a.p128a.p155y;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p148r.C1277n;

/* JADX INFO: renamed from: c.d.a.a.y.d */
/* JADX INFO: loaded from: classes.dex */
public class C1307d extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final View.OnTouchListener f6313g = new a();

    /* JADX INFO: renamed from: b */
    public InterfaceC1306c f6314b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1305b f6315c;

    /* JADX INFO: renamed from: d */
    public int f6316d;

    /* JADX INFO: renamed from: e */
    public final float f6317e;

    /* JADX INFO: renamed from: f */
    public final float f6318f;

    /* JADX INFO: renamed from: c.d.a.a.y.d$a */
    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C1307d(Context context, AttributeSet attributeSet) {
        super(C1277n.m2946d(context, attributeSet, 0, 0), attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1164b.f5586x);
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            C0418m.m1578u(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0));
        }
        this.f6316d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f6317e = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        this.f6318f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f6313g);
        setFocusable(true);
    }

    public float getActionTextColorAlpha() {
        return this.f6318f;
    }

    public int getAnimationMode() {
        return this.f6316d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f6317e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1305b interfaceC1305b = this.f6315c;
        if (interfaceC1305b != null) {
            interfaceC1305b.onViewAttachedToWindow(this);
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (Build.VERSION.SDK_INT >= 20) {
            requestApplyInsets();
        } else {
            requestFitSystemWindows();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1305b interfaceC1305b = this.f6315c;
        if (interfaceC1305b != null) {
            interfaceC1305b.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC1306c interfaceC1306c = this.f6314b;
        if (interfaceC1306c != null) {
            interfaceC1306c.m3005a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f6316d = i;
    }

    public void setOnAttachStateChangeListener(InterfaceC1305b interfaceC1305b) {
        this.f6315c = interfaceC1305b;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f6313g);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(InterfaceC1306c interfaceC1306c) {
        this.f6314b = interfaceC1306c;
    }
}
