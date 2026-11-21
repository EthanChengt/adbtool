package p006b.p008b.p018i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.didjdk.adbhelper.R;

/* JADX INFO: renamed from: b.b.i.t */
/* JADX INFO: loaded from: classes.dex */
public class C0285t extends SeekBar {

    /* JADX INFO: renamed from: b */
    public final C0287u f2005b;

    public C0285t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.oc);
        C0287u c0287u = new C0287u(this);
        this.f2005b = c0287u;
        c0287u.mo1119a(attributeSet, R.attr.oc);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0287u c0287u = this.f2005b;
        Drawable drawable = c0287u.f2007e;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0287u.f2006d.getDrawableState())) {
            c0287u.f2006d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2005b.f2007e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2005b.m1134d(canvas);
    }
}
