package c.c.a.p122w3.p123j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.c.a.w3.j.a */
/* JADX INFO: loaded from: classes.dex */
public class C1129a {

    /* JADX INFO: renamed from: a */
    public final byte[] f5464a;

    /* JADX INFO: renamed from: b */
    public Handler f5465b;

    /* JADX INFO: renamed from: c.c.a.w3.j.a$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OutputStream f5466a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1129a c1129a, Looper looper, OutputStream outputStream) {
            super(looper);
            this.f5466a = outputStream;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                this.f5466a.write((byte[]) message.obj);
                this.f5466a.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public C1129a(OutputStream outputStream) {
        byte[] bArr = new byte[262144];
        this.f5464a = bArr;
        ByteBuffer.wrap(bArr);
        HandlerThread handlerThread = new HandlerThread("MessageSender");
        handlerThread.start();
        this.f5465b = new a(this, handlerThread.getLooper(), outputStream);
    }

    /* JADX INFO: renamed from: a */
    public final void m2685a(byte[] bArr) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = bArr;
        this.f5465b.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: b */
    public void m2686b(int i, int i2, int i3, int i4) {
        byte[] bArr = new byte[14];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.put((byte) 0);
        byteBufferWrap.put((byte) i);
        byteBufferWrap.putInt(i2);
        byteBufferWrap.putInt(i3);
        byteBufferWrap.putInt(i4);
        m2685a(bArr);
    }
}
