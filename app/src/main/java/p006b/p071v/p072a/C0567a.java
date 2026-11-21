package p006b.p071v.p072a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.v.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0567a extends ImageView {

    /* JADX INFO: renamed from: b */
    public Animation.AnimationListener f3477b;

    /* JADX INFO: renamed from: c */
    public int f3478c;

    /* JADX INFO: renamed from: b.v.a.a$a */
    public class a extends OvalShape {

        /* JADX INFO: renamed from: b */
        public RadialGradient f3479b;

        /* JADX INFO: renamed from: c */
        public Paint f3480c = new Paint();

        public a(int i) {
            C0567a.this.f3478c = i;
            m2078a((int) rect().width());
        }

        /* JADX INFO: renamed from: a */
        public final void m2078a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C0567a.this.f3478c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f3479b = radialGradient;
            this.f3480c.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = C0567a.this.getWidth() / 2;
            float f = width;
            float height = C0567a.this.getHeight() / 2;
            canvas.drawCircle(f, height, f, this.f3480c);
            canvas.drawCircle(f, height, width - C0567a.this.f3478c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2078a((int) f);
        }
    }

    public C0567a(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f3478c = (int) (3.5f * f);
        if (Build.VERSION.SDK_INT >= 21) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0418m.m1578u(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f3478c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f3478c, i3, i2, 503316480);
            int i4 = this.f3478c;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setBackground(shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f3477b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f3477b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        setMeasuredDimension((this.f3478c * 2) + getMeasuredWidth(), (this.f3478c * 2) + getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
