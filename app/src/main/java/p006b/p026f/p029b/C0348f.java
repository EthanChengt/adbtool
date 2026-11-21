package p006b.p026f.p029b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p006b.p026f.p027a.p028h.C0332d;

/* JADX INFO: renamed from: b.f.b.f */
/* JADX INFO: loaded from: classes.dex */
public class C0348f extends View {

    /* JADX INFO: renamed from: b */
    public int f2518b;

    /* JADX INFO: renamed from: c */
    public View f2519c;

    /* JADX INFO: renamed from: d */
    public int f2520d;

    /* JADX INFO: renamed from: a */
    public void m1402a() {
        if (this.f2519c == null) {
            return;
        }
        ConstraintLayout.C0065a c0065a = (ConstraintLayout.C0065a) getLayoutParams();
        ConstraintLayout.C0065a c0065a2 = (ConstraintLayout.C0065a) this.f2519c.getLayoutParams();
        C0332d c0332d = c0065a2.f498k0;
        c0332d.f2320Y = 0;
        c0065a.f498k0.m1342C(c0332d.m1355n());
        c0065a.f498k0.m1362w(c0065a2.f498k0.m1349h());
        c0065a2.f498k0.f2320Y = 8;
    }

    public View getContent() {
        return this.f2519c;
    }

    public int getEmptyVisibility() {
        return this.f2520d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f2518b == i) {
            return;
        }
        View view = this.f2519c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0065a) this.f2519c.getLayoutParams()).f476Z = false;
            this.f2519c = null;
        }
        this.f2518b = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f2520d = i;
    }
}
