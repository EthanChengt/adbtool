package c.c.a.p122w3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.w3.g */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1126g implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1127h f5448b;

    /* JADX INFO: renamed from: c.c.a.w3.g$a */
    public class a implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Paint f5449a;

        public a(Paint paint) {
            this.f5449a = paint;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            Bitmap bitmap = (Bitmap) message.obj;
            if (bitmap == null) {
                return false;
            }
            SurfaceHolder holder = RunnableC1126g.this.f5448b.f5458h.getHolder();
            Canvas canvasLockCanvas = holder.lockCanvas();
            Matrix matrix = new Matrix();
            matrix.postScale(RunnableC1126g.this.f5448b.f5458h.getWidth() / bitmap.getWidth(), RunnableC1126g.this.f5448b.f5458h.getHeight() / bitmap.getHeight());
            canvasLockCanvas.drawBitmap(bitmap, matrix, this.f5449a);
            holder.unlockCanvasAndPost(canvasLockCanvas);
            if (bitmap.isRecycled()) {
                return false;
            }
            bitmap.recycle();
            return false;
        }
    }

    public RunnableC1126g(C1127h c1127h) {
        this.f5448b = c1127h;
    }

    @Override // java.lang.Runnable
    public void run() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Looper.prepare();
        C1127h c1127h = this.f5448b;
        new Handler(new a(paint));
        Objects.requireNonNull(c1127h);
        Looper.loop();
    }
}
