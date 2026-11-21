package c.c.a.p122w3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.didjdk.adbhelper.RemoteActivity;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.w3.h */
/* JADX INFO: loaded from: classes.dex */
public class C1127h {

    /* JADX INFO: renamed from: a */
    public boolean f5451a = false;

    /* JADX INFO: renamed from: b */
    public boolean f5452b = false;

    /* JADX INFO: renamed from: c */
    public boolean f5453c = false;

    /* JADX INFO: renamed from: d */
    public long f5454d;

    /* JADX INFO: renamed from: e */
    public BufferedOutputStream f5455e;

    /* JADX INFO: renamed from: f */
    public MediaCodec f5456f;

    /* JADX INFO: renamed from: g */
    public MediaFormat f5457g;

    /* JADX INFO: renamed from: h */
    public SurfaceView f5458h;

    /* JADX INFO: renamed from: i */
    public RemoteActivity f5459i;

    /* JADX INFO: renamed from: j */
    public Thread f5460j;

    /* JADX INFO: renamed from: c.c.a.w3.h$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InputStream f5461b;

        public a(InputStream inputStream) {
            this.f5461b = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1127h c1127h;
            while (true) {
                try {
                    c1127h = C1127h.this;
                    if (c1127h.f5452b) {
                        break;
                    }
                    byte[] bArr = new byte[12];
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    Thread.sleep(10L);
                    if (this.f5461b.available() > 0) {
                        this.f5461b.read(bArr);
                        long j = byteBufferWrap.getLong();
                        int i = byteBufferWrap.getInt();
                        byte[] bArr2 = new byte[i];
                        int i2 = 0;
                        while (i2 < i) {
                            i2 += this.f5461b.read(bArr2, i2, i - i2);
                        }
                        C1127h.m2681a(C1127h.this, bArr2, j);
                    }
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                    C1127h.this.f5459i.runOnUiThread(new Runnable() { // from class: c.c.a.w3.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1127h.a aVar = this.f5437b;
                            Exception exc = e;
                            C1127h.this.f5459i.f10065S.setVisibility(0);
                            C1127h.this.f5459i.f10065S.setText(exc.getMessage());
                        }
                    });
                    return;
                }
            }
            BufferedOutputStream bufferedOutputStream = c1127h.f5455e;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            InputStream inputStream = this.f5461b;
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public C1127h(RemoteActivity remoteActivity, SurfaceView surfaceView) {
        this.f5459i = remoteActivity;
        this.f5458h = surfaceView;
    }

    /* JADX INFO: renamed from: a */
    public static void m2681a(final C1127h c1127h, byte[] bArr, long j) {
        if (!c1127h.f5453c) {
            c1127h.f5454d = j;
            c1127h.f5453c = true;
        }
        if (c1127h.f5451a) {
            try {
                c1127h.f5455e.write(bArr);
                c1127h.f5455e.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            int iDequeueInputBuffer = c1127h.f5456f.dequeueInputBuffer(-1L);
            ByteBuffer inputBuffer = Build.VERSION.SDK_INT >= 21 ? c1127h.f5456f.getInputBuffer(iDequeueInputBuffer) : c1127h.f5456f.getInputBuffers()[iDequeueInputBuffer];
            inputBuffer.clear();
            inputBuffer.put(bArr);
            if (j == -1) {
                c1127h.f5456f.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, j, 2);
            } else {
                c1127h.f5456f.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, j, 0);
            }
            byte b2 = bArr[4];
        } catch (Exception e2) {
            e2.printStackTrace();
            c1127h.f5459i.runOnUiThread(new Runnable() { // from class: c.c.a.w3.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1127h c1127h2 = this.f5443b;
                    Exception exc = e2;
                    c1127h2.f5459i.f10065S.setVisibility(0);
                    c1127h2.f5459i.f10065S.setText(exc.getMessage());
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2682b(int i, int i2) {
        try {
            this.f5456f = MediaCodec.createDecoderByType("video/avc");
        } catch (IOException e) {
            e.printStackTrace();
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        this.f5457g = mediaFormatCreateVideoFormat;
        mediaFormatCreateVideoFormat.setInteger("max-input-size", i * i2);
        this.f5457g.setInteger("frame-rate", 60);
        this.f5457g.setInteger("color-format", 2130708361);
        this.f5457g.setInteger("i-frame-interval", 10);
        this.f5457g.setLong("repeat-previous-frame-after", 100000L);
        this.f5456f.configure(this.f5457g, this.f5458h.getHolder().getSurface(), (MediaCrypto) null, 0);
        this.f5456f.start();
    }

    /* JADX INFO: renamed from: c */
    public void m2683c(final InputStream inputStream) {
        this.f5459i.runOnUiThread(new Runnable() { // from class: c.c.a.w3.e
            @Override // java.lang.Runnable
            public final void run() {
                C1127h c1127h = this.f5445b;
                c1127h.f5458h.setVisibility(0);
                c1127h.f5459i.f10067U.setVisibility(8);
            }
        });
        Thread thread = new Thread(new RunnableC1126g(this));
        this.f5460j = thread;
        thread.start();
        new Thread(new Runnable() { // from class: c.c.a.w3.c
            @Override // java.lang.Runnable
            public final void run() {
                final C1127h c1127h = this.f5441b;
                InputStream inputStream2 = inputStream;
                Objects.requireNonNull(c1127h);
                try {
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setStyle(Paint.Style.STROKE);
                    while (!c1127h.f5452b) {
                        byte[] bArr = new byte[12];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        Thread.sleep(10L);
                        if (inputStream2.available() > 0) {
                            inputStream2.read(bArr);
                            byteBufferWrap.getLong();
                            int i = byteBufferWrap.getInt();
                            byte[] bArr2 = new byte[i];
                            for (int i2 = 0; i2 < i; i2 += inputStream2.read(bArr2, i2, i - i2)) {
                            }
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i);
                            if (bitmapDecodeByteArray != null) {
                                SurfaceHolder holder = c1127h.f5458h.getHolder();
                                if (holder.getSurface().isValid()) {
                                    Canvas canvasLockCanvas = holder.lockCanvas();
                                    Matrix matrix = new Matrix();
                                    matrix.postScale(c1127h.f5458h.getWidth() / bitmapDecodeByteArray.getWidth(), c1127h.f5458h.getHeight() / bitmapDecodeByteArray.getHeight());
                                    canvasLockCanvas.drawBitmap(bitmapDecodeByteArray, matrix, paint);
                                    holder.unlockCanvasAndPost(canvasLockCanvas);
                                }
                                if (!bitmapDecodeByteArray.isRecycled()) {
                                    bitmapDecodeByteArray.recycle();
                                }
                            }
                        }
                    }
                    BufferedOutputStream bufferedOutputStream = c1127h.f5455e;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                    c1127h.f5459i.runOnUiThread(new Runnable() { // from class: c.c.a.w3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1127h c1127h2 = c1127h;
                            Exception exc = e;
                            c1127h2.f5459i.f10065S.setVisibility(0);
                            c1127h2.f5459i.f10065S.setText(exc.getMessage());
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: d */
    public void m2684d(InputStream inputStream) {
        new Thread(new RunnableC1128i(this)).start();
        new Thread(new a(inputStream)).start();
    }
}
