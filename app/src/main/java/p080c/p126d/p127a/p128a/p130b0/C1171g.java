package p080c.p126d.p127a.p128a.p130b0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: renamed from: c.d.a.a.b0.g */
/* JADX INFO: loaded from: classes.dex */
public class C1171g extends C1296g {

    /* JADX INFO: renamed from: x */
    public final Paint f5600x;

    /* JADX INFO: renamed from: y */
    public final RectF f5601y;

    /* JADX INFO: renamed from: z */
    public int f5602z;

    public C1171g() {
        this(null);
    }

    public C1171g(C1299j c1299j) {
        super(c1299j == null ? new C1299j() : c1299j);
        Paint paint = new Paint(1);
        this.f5600x = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f5601y = new RectF();
    }

    @Override // p080c.p126d.p127a.p128a.p154x.C1296g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f5602z = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f5601y, this.f5600x);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f5602z);
    }

    /* JADX INFO: renamed from: z */
    public void m2743z(float f, float f2, float f3, float f4) {
        RectF rectF = this.f5601y;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
