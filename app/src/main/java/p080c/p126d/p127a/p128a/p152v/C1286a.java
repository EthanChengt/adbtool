package p080c.p126d.p127a.p128a.p152v;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p006b.p032h.p036d.p037k.InterfaceC0380a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;
import p080c.p126d.p127a.p128a.p154x.InterfaceC1303n;

/* JADX INFO: renamed from: c.d.a.a.v.a */
/* JADX INFO: loaded from: classes.dex */
public class C1286a extends Drawable implements InterfaceC1303n, InterfaceC0380a {

    /* JADX INFO: renamed from: b */
    public b f6181b;

    /* JADX INFO: renamed from: c.d.a.a.v.a$b */
    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public C1296g f6182a;

        /* JADX INFO: renamed from: b */
        public boolean f6183b;

        public b(b bVar) {
            this.f6182a = (C1296g) bVar.f6182a.f6211b.newDrawable();
            this.f6183b = bVar.f6183b;
        }

        public b(C1296g c1296g) {
            this.f6182a = c1296g;
            this.f6183b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1286a(new b(this), null);
        }
    }

    public C1286a(b bVar, a aVar) {
        this.f6181b = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f6181b;
        if (bVar.f6183b) {
            bVar.f6182a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f6181b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f6181b.f6182a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6181b = new b(this.f6181b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6181b.f6182a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f6181b.f6182a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zM2956c = C1287b.m2956c(iArr);
        b bVar = this.f6181b;
        if (bVar.f6183b == zM2956c) {
            return zOnStateChange;
        }
        bVar.f6183b = zM2956c;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6181b.f6182a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6181b.f6182a.setColorFilter(colorFilter);
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1303n
    public void setShapeAppearanceModel(C1299j c1299j) {
        C1296g c1296g = this.f6181b.f6182a;
        c1296g.f6211b.f6233a = c1299j;
        c1296g.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTint(int i) {
        this.f6181b.f6182a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintList(ColorStateList colorStateList) {
        this.f6181b.f6182a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, p006b.p032h.p036d.p037k.InterfaceC0380a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f6181b.f6182a.setTintMode(mode);
    }

    public C1286a(C1299j c1299j) {
        this.f6181b = new b(new C1296g(c1299j));
    }
}
