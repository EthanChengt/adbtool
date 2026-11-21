package p006b.p008b.p018i;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p006b.p032h.p036d.p037k.InterfaceC0381b;

/* JADX INFO: renamed from: b.b.i.q */
/* JADX INFO: loaded from: classes.dex */
public class C0279q {

    /* JADX INFO: renamed from: c */
    public static final int[] f1966c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final ProgressBar f1967a;

    /* JADX INFO: renamed from: b */
    public Bitmap f1968b;

    public C0279q(ProgressBar progressBar) {
        this.f1967a = progressBar;
    }

    /* JADX INFO: renamed from: a */
    public void mo1119a(AttributeSet attributeSet, int i) {
        C0294x0 c0294x0M1152q = C0294x0.m1152q(this.f1967a.getContext(), attributeSet, f1966c, i, 0);
        Drawable drawableM1160h = c0294x0M1152q.m1160h(0);
        if (drawableM1160h != null) {
            ProgressBar progressBar = this.f1967a;
            if (drawableM1160h instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM1160h;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM1120b = m1120b(animationDrawable.getFrame(i2), true);
                    drawableM1120b.setLevel(10000);
                    animationDrawable2.addFrame(drawableM1120b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM1160h = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableM1160h);
        }
        Drawable drawableM1160h2 = c0294x0M1152q.m1160h(1);
        if (drawableM1160h2 != null) {
            this.f1967a.setProgressDrawable(m1120b(drawableM1160h2, false));
        }
        c0294x0M1152q.f2052b.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Drawable m1120b(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0381b) {
            InterfaceC0381b interfaceC0381b = (InterfaceC0381b) drawable;
            Drawable drawableMo1517a = interfaceC0381b.mo1517a();
            if (drawableMo1517a != null) {
                interfaceC0381b.mo1518b(m1120b(drawableMo1517a, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m1120b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1968b == null) {
                    this.f1968b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
