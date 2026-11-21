package p080c.p126d.p127a.p128a.p148r;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.didjdk.adbhelper.R;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;
import p006b.p032h.p044j.InterfaceC0415j;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: renamed from: c.d.a.a.r.k */
/* JADX INFO: loaded from: classes.dex */
public class C1274k extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public Drawable f6131b;

    /* JADX INFO: renamed from: c */
    public Rect f6132c;

    /* JADX INFO: renamed from: d */
    public Rect f6133d;

    /* JADX INFO: renamed from: e */
    public boolean f6134e;

    /* JADX INFO: renamed from: f */
    public boolean f6135f;

    /* JADX INFO: renamed from: c.d.a.a.r.k$a */
    public class a implements InterfaceC0415j {
        public a() {
        }

        @Override // p006b.p032h.p044j.InterfaceC0415j
        /* JADX INFO: renamed from: a */
        public C0427v mo162a(View view, C0427v c0427v) {
            C1274k c1274k = C1274k.this;
            if (c1274k.f6132c == null) {
                c1274k.f6132c = new Rect();
            }
            C1274k.this.f6132c.set(c0427v.m1601b(), c0427v.m1603d(), c0427v.m1602c(), c0427v.m1600a());
            C1274k.this.mo2937a(c0427v);
            C1274k c1274k2 = C1274k.this;
            int i = Build.VERSION.SDK_INT;
            c1274k2.setWillNotDraw(!(i >= 20 ? ((WindowInsets) c0427v.f2738a).hasSystemWindowInsets() : false) || C1274k.this.f6131b == null);
            C1274k c1274k3 = C1274k.this;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            c1274k3.postInvalidateOnAnimation();
            if (i >= 20) {
                return new C0427v(((WindowInsets) c0427v.f2738a).consumeSystemWindowInsets());
            }
            return null;
        }
    }

    public C1274k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1274k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6133d = new Rect();
        this.f6134e = true;
        this.f6135f = true;
        int[] iArr = C1164b.f5583u;
        C1277n.m2943a(context, attributeSet, i, R.style.pb);
        C1277n.m2944b(context, attributeSet, iArr, i, R.style.pb, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.pb);
        this.f6131b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0418m.m1579v(this, new a());
    }

    /* JADX INFO: renamed from: a */
    public void mo2937a(C0427v c0427v) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f6132c == null || this.f6131b == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f6134e) {
            this.f6133d.set(0, 0, width, this.f6132c.top);
            this.f6131b.setBounds(this.f6133d);
            this.f6131b.draw(canvas);
        }
        if (this.f6135f) {
            this.f6133d.set(0, height - this.f6132c.bottom, width, height);
            this.f6131b.setBounds(this.f6133d);
            this.f6131b.draw(canvas);
        }
        Rect rect = this.f6133d;
        Rect rect2 = this.f6132c;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f6131b.setBounds(this.f6133d);
        this.f6131b.draw(canvas);
        Rect rect3 = this.f6133d;
        Rect rect4 = this.f6132c;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f6131b.setBounds(this.f6133d);
        this.f6131b.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f6131b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f6131b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f6135f = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f6134e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f6131b = drawable;
    }
}
