package c.c.a.p122w3;

import android.media.MediaCodec;

/* JADX INFO: renamed from: c.c.a.w3.i */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1128i implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1127h f5463b;

    public RunnableC1128i(C1127h c1127h) {
        this.f5463b = c1127h;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f5463b.f5452b) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            try {
                int iDequeueOutputBuffer = this.f5463b.f5456f.dequeueOutputBuffer(bufferInfo, -1L);
                if (iDequeueOutputBuffer >= 0) {
                    C1127h c1127h = this.f5463b;
                    if (c1127h.f5459i.f10076y || bufferInfo.presentationTimeUs >= c1127h.f5454d) {
                        c1127h.f5453c = false;
                        c1127h.f5456f.releaseOutputBuffer(iDequeueOutputBuffer, true);
                    } else {
                        c1127h.f5456f.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    }
                }
            } catch (Exception e) {
                this.f5463b.f5459i.runOnUiThread(new Runnable() { // from class: c.c.a.w3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC1128i runnableC1128i = this.f5439b;
                        Exception exc = e;
                        runnableC1128i.f5463b.f5459i.f10065S.setVisibility(0);
                        runnableC1128i.f5463b.f5459i.f10065S.setText(exc.getMessage());
                    }
                });
                e.printStackTrace();
            }
        }
    }
}
