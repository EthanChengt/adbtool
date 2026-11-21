package p006b.p008b.p018i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.i.u */
/* JADX INFO: loaded from: classes.dex */
public class C0287u extends C0279q {

    /* JADX INFO: renamed from: d */
    public final SeekBar f2006d;

    /* JADX INFO: renamed from: e */
    public Drawable f2007e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f2008f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f2009g;

    /* JADX INFO: renamed from: h */
    public boolean f2010h;

    /* JADX INFO: renamed from: i */
    public boolean f2011i;

    public C0287u(SeekBar seekBar) {
        super(seekBar);
        this.f2008f = null;
        this.f2009g = null;
        this.f2010h = false;
        this.f2011i = false;
        this.f2006d = seekBar;
    }

    @Override // p006b.p008b.p018i.C0279q
    /* JADX INFO: renamed from: a */
    public void mo1119a(AttributeSet attributeSet, int i) {
        super.mo1119a(attributeSet, i);
        C0294x0 c0294x0M1152q = C0294x0.m1152q(this.f2006d.getContext(), attributeSet, C0184b.f1206g, i, 0);
        Drawable drawableM1160h = c0294x0M1152q.m1160h(0);
        if (drawableM1160h != null) {
            this.f2006d.setThumb(drawableM1160h);
        }
        Drawable drawableM1159g = c0294x0M1152q.m1159g(1);
        Drawable drawable = this.f2007e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2007e = drawableM1159g;
        if (drawableM1159g != null) {
            drawableM1159g.setCallback(this.f2006d);
            SeekBar seekBar = this.f2006d;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            C0360f.m1427S(drawableM1159g, seekBar.getLayoutDirection());
            if (drawableM1159g.isStateful()) {
                drawableM1159g.setState(this.f2006d.getDrawableState());
            }
            m1133c();
        }
        this.f2006d.invalidate();
        if (c0294x0M1152q.m1167o(3)) {
            this.f2009g = C0255e0.m1063d(c0294x0M1152q.m1162j(3, -1), this.f2009g);
            this.f2011i = true;
        }
        if (c0294x0M1152q.m1167o(2)) {
            this.f2008f = c0294x0M1152q.m1155c(2);
            this.f2010h = true;
        }
        c0294x0M1152q.f2052b.recycle();
        m1133c();
    }

    /* JADX INFO: renamed from: c */
    public final void m1133c() {
        Drawable drawable = this.f2007e;
        if (drawable != null) {
            if (this.f2010h || this.f2011i) {
                Drawable drawableM1444e0 = C0360f.m1444e0(drawable.mutate());
                this.f2007e = drawableM1444e0;
                if (this.f2010h) {
                    C0360f.m1433Y(drawableM1444e0, this.f2008f);
                }
                if (this.f2011i) {
                    C0360f.m1434Z(this.f2007e, this.f2009g);
                }
                if (this.f2007e.isStateful()) {
                    this.f2007e.setState(this.f2006d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1134d(Canvas canvas) {
        if (this.f2007e != null) {
            int max = this.f2006d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2007e.getIntrinsicWidth();
                int intrinsicHeight = this.f2007e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2007e.setBounds(-i, -i2, i, i2);
                float width = ((this.f2006d.getWidth() - this.f2006d.getPaddingLeft()) - this.f2006d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f2006d.getPaddingLeft(), this.f2006d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2007e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
