package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.C0679e;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;

/* JADX INFO: renamed from: c.b.a.m.w.c.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0770n {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0678d f4456a = new a();

    /* JADX INFO: renamed from: c.b.a.m.w.c.n$a */
    public class a extends C0679e {
        @Override // p080c.p084b.p085a.p088m.p091u.p092c0.C0679e, p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d
        /* JADX INFO: renamed from: e */
        public void mo2332e(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0719w<Bitmap> m2482a(InterfaceC0678d interfaceC0678d, Drawable drawable, int i, int i2) {
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = C0782z.f4496d;
                    lock.lock();
                    Bitmap bitmapMo2331d = interfaceC0678d.mo2331d(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo2331d);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo2331d;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                    sb.append(str);
                    Log.w("DrawableToBitmap", sb.toString());
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(current);
                str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                sb.append(str);
                Log.w("DrawableToBitmap", sb.toString());
            }
            z = true;
        }
        if (!z) {
            interfaceC0678d = f4456a;
        }
        return C0761e.m2453f(bitmap, interfaceC0678d);
    }
}
