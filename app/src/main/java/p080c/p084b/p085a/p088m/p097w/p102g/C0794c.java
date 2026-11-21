package p080c.p084b.p085a.p088m.p097w.p102g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import b.s.m;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.p087l.InterfaceC0628a;
import p080c.p084b.p085a.p088m.InterfaceC0651s;

/* JADX INFO: renamed from: c.b.a.m.w.g.c */
/* JADX INFO: loaded from: classes.dex */
public class C0794c extends Drawable implements C0798g.b, Animatable {

    /* JADX INFO: renamed from: b */
    public final a f4513b;

    /* JADX INFO: renamed from: c */
    public boolean f4514c;

    /* JADX INFO: renamed from: d */
    public boolean f4515d;

    /* JADX INFO: renamed from: e */
    public boolean f4516e;

    /* JADX INFO: renamed from: f */
    public boolean f4517f;

    /* JADX INFO: renamed from: g */
    public int f4518g;

    /* JADX INFO: renamed from: h */
    public int f4519h;

    /* JADX INFO: renamed from: i */
    public boolean f4520i;

    /* JADX INFO: renamed from: j */
    public Paint f4521j;

    /* JADX INFO: renamed from: k */
    public Rect f4522k;

    /* JADX INFO: renamed from: c.b.a.m.w.g.c$a */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final C0798g f4523a;

        public a(C0798g c0798g) {
            this.f4523a = c0798g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0794c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0794c(this);
        }
    }

    public C0794c(Context context, InterfaceC0628a interfaceC0628a, InterfaceC0651s<Bitmap> interfaceC0651s, int i, int i2, Bitmap bitmap) {
        a aVar = new a(new C0798g(ComponentCallbacks2C0616b.m2205b(context), interfaceC0628a, i, i2, interfaceC0651s, bitmap));
        this.f4517f = true;
        this.f4519h = -1;
        this.f4513b = aVar;
    }

    @Override // p080c.p084b.p085a.p088m.p097w.p102g.C0798g.b
    /* JADX INFO: renamed from: a */
    public void mo2502a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C0798g c0798g = this.f4513b.f4523a;
        C0798g.a aVar = c0798g.f4533i;
        if ((aVar != null ? aVar.f4543f : -1) == c0798g.f4525a.mo2266e() - 1) {
            this.f4518g++;
        }
        int i = this.f4519h;
        if (i == -1 || this.f4518g < i) {
            return;
        }
        stop();
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m2503b() {
        return this.f4513b.f4523a.f4536l;
    }

    /* JADX INFO: renamed from: c */
    public final Paint m2504c() {
        if (this.f4521j == null) {
            this.f4521j = new Paint(2);
        }
        return this.f4521j;
    }

    /* JADX INFO: renamed from: d */
    public final void m2505d() {
        m.m1958b(!this.f4516e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f4513b.f4523a.f4525a.mo2266e() != 1) {
            if (this.f4514c) {
                return;
            }
            this.f4514c = true;
            C0798g c0798g = this.f4513b.f4523a;
            if (c0798g.f4534j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (c0798g.f4527c.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean zIsEmpty = c0798g.f4527c.isEmpty();
            c0798g.f4527c.add(this);
            if (zIsEmpty && !c0798g.f4530f) {
                c0798g.f4530f = true;
                c0798g.f4534j = false;
                c0798g.m2507a();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4516e) {
            return;
        }
        if (this.f4520i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f4522k == null) {
                this.f4522k = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f4522k);
            this.f4520i = false;
        }
        C0798g c0798g = this.f4513b.f4523a;
        C0798g.a aVar = c0798g.f4533i;
        Bitmap bitmap = aVar != null ? aVar.f4545h : c0798g.f4536l;
        if (this.f4522k == null) {
            this.f4522k = new Rect();
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f4522k, m2504c());
    }

    /* JADX INFO: renamed from: e */
    public final void m2506e() {
        this.f4514c = false;
        C0798g c0798g = this.f4513b.f4523a;
        c0798g.f4527c.remove(this);
        if (c0798g.f4527c.isEmpty()) {
            c0798g.f4530f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4513b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4513b.f4523a.f4541q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4513b.f4523a.f4540p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4514c;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4520i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m2504c().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m2504c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        m.m1958b(!this.f4516e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4517f = z;
        if (!z) {
            m2506e();
        } else if (this.f4515d) {
            m2505d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4515d = true;
        this.f4518g = 0;
        if (this.f4517f) {
            m2505d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4515d = false;
        m2506e();
    }

    public C0794c(a aVar) {
        this.f4517f = true;
        this.f4519h = -1;
        this.f4513b = aVar;
    }
}
